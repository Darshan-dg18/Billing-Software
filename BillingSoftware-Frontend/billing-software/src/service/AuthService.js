import axios from "axios";

// const API_URL = "http://localhost:8080/api/v1.0";

export const login = async (data) => {
  return await axios.post("http://localhost:8080/api/v1.0/login", data);
};
