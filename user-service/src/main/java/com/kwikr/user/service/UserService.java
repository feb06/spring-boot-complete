package com.kwikr.user.service;

import com.kwikr.user.VO.Department;
import com.kwikr.user.VO.ResponseTemplateVO;
import com.kwikr.user.entity.User;
import com.kwikr.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public User saveUser(User user) {
        log.info("Service Save User "+user);
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(long id) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found with id "+id));
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
        return new ResponseTemplateVO(user,department);
    }
}
