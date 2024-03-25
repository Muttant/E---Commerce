package com.sheryians.major.configuration;

import com.sheryians.major.repository.RoleRepository;
import com.sheryians.major.repository.UserRepository;

@Component
public class GoogleAuth2SuccsessHandler implements AuthnenticationSuccsessHandler {
    @AutoWired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

}
