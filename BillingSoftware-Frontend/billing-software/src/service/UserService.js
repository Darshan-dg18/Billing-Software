import axios from "axios";

export const addUser = async (user) => {
  return await axios.post(
    `http://localhost:8080/api/v1.0/admin/register`,
    user,
    {
      headers: { Authorization: `Bearer ${localStorage.getItem("token")}` },
    }
  );
};

export const deleteUser = async (id) => {
  return await axios.delete(
    `http://localhost:8080/api/v1.0/admin/users/${id}`,
    {
      headers: { Authorization: `Bearer ${localStorage.getItem("token")}` },
    }
  );
};

export const fetchUsers = async () => {
  return await axios.get(`http://localhost:8080/api/v1.0/admin/users`, {
    headers: { Authorization: `Bearer ${localStorage.getItem("token")}` },
  });
};

export const updateUser = async (userId, user) => {
  return await axios.put(
    `http://localhost:8080/api/v1.0/users/${userId}`,
    user,
    {
      headers: { Authorization: `Bearer ${localStorage.getItem("token")}` },
    }
  );
};
