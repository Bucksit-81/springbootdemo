package kataacademy.springbootdemo.service;

import kataacademy.springbootdemo.model.User;
import kataacademy.springbootdemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private final UserRepository UserRepository;

    public UserService(UserRepository UserRepository) {
        this.UserRepository = UserRepository;
    }

    public User findById (Long id){
        return UserRepository.getOne(id);
    }
    public List<User> findAll(){
        return UserRepository.findAll();
    }
    public User saveUser(User user){
        return UserRepository.save(user);
    }
    public void deleteById(Long id){
        UserRepository.deleteById(id);
    }

}
