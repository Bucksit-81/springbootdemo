package kataacademy.springbootdemo.service;

import kataacademy.springbootdemo.model.User;
import kataacademy.springbootdemo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository UserRepository;

    public UserServiceImpl(UserRepository UserRepository) {
        this.UserRepository = UserRepository;
    }

    @Override
    public User findById (Long id){
        return UserRepository.getOne(id);
    }

    @Override
    public List<User> findAll(){
        return UserRepository.findAll();
    }

    @Override
    public void saveUser(User user){
        UserRepository.save(user);
    }

    @Override
    public void deleteById(Long id){
        UserRepository.deleteById(id);
    }

}
