package org.shop.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.shop.data.User;
import org.shop.repository.UserRepository;
import org.shop.repository.map.AbstractMapRepository;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl extends AbstractMapRepository<User> implements UserRepository {
    
    @Override
    public User getUserById(Long id) {
        return get(id);
    }

    @Override
    public Long createUser(User user) {
        return create(user);
    }

    @Override
    public void updateUser(User user) {
        update(user);
    }

    @Override
    public List<User> getUsers() {
            return new ArrayList<User>(register.values());
        }

}
