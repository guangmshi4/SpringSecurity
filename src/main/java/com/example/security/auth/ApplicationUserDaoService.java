//package com.example.security.auth;
//
//import com.example.security.secconfig.ApplicationUserRole;
//import com.google.common.collect.Lists;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository("fake")
//public class ApplicationUserDaoService implements ApplicationUserDao{
//
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public ApplicationUserDaoService(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
//        return getApplicationUser()
//                .stream()
//                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
//                .findFirst();
//    }
//
//    private List<ApplicationUser> getApplicationUser(){
//        List<ApplicationUser> applicationUsers = Lists.newArrayList(
//                new ApplicationUser(
//                        ApplicationUserRole.STUDENT.getGrantedAuthority(),
//                        passwordEncoder.encode("password"),
//                        "annasmith",
//                        true,
//                        true,
//                        true,
//                        true
//
//                ),
//                new ApplicationUser(
//                        ApplicationUserRole.ADMIN.getGrantedAuthority(),
//                        passwordEncoder.encode("password"),
//                        "jax",
//                        true,
//                        true,
//                        true,
//                        true
//
//                ),
//                new ApplicationUser(
//                        ApplicationUserRole.ADMINTRAINEE.getGrantedAuthority(),
//                        passwordEncoder.encode("password"),
//                        "tom",
//                        true,
//                        true,
//                        true,
//                        true
//
//                )
//        );
//        return applicationUsers;
//    }
//}
