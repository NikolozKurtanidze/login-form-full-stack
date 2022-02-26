import axios from "axios";
import React from "react";

const URL = "http://localhost:8080/users";

class UserService {
  checkUser(userName, password) {
    return axios.post(URL, {
      username: userName,
      pwd: password
    }).catch(error => {
      return 'error';
    });
  }
}

export default new UserService;