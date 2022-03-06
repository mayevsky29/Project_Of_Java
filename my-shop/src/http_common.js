import axios from "axios";

// Підключення до серверної частини проекту за допомогою axios
export default axios.create({
  baseURL: "http://localhost:8082/",
  headers: {
    "Content-type": "application/json"
  }
});