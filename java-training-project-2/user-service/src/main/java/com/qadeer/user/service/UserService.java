package com.qadeer.user.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Service
public class UserService {

    BufferedReader br = new BufferedReader(new FileReader("/Users/aqadeer/Desktop/java-training-project-2/create-file/bank.txt"));

    public UserService() throws FileNotFoundException {
    }

    public String getUser() throws IOException {
        return br.readLine();
    }
}
