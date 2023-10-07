package com.nissan.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.common.APIResponse;
import com.nissan.model.User;
import com.nissan.repo.IUserRepository;
import com.nissan.util.JwtUtil;

@Service
public class UserServiceImplementation implements IUserService {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private IUserRepository userRepository;

	@Autowired
	private APIResponse apiResponse;

	@Override
	public APIResponse findUserByNameAndPassword(String userName, String password) {
		// verify user exist or not
		User user = userRepository.findUserByNameAndPassword(userName, password);
		if (user == null) {
			apiResponse.setStatus(401);
			apiResponse.setData("Invalid Credentials!!");
			return apiResponse;
		}

		// credentials are correct, thenL

		String token = jwtUtil.generateJwt(user);

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("ACCESSTOKEN", token);
		data.put("role", user.getRoleId());
		data.put("UserName", user.getUserName());

		apiResponse.setStatus(200);
		apiResponse.setData(data);

		return apiResponse;
	}

}
