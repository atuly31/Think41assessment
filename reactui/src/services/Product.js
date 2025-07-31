import axios from "axios";

const URL = "http://localhost:8080/api/products";

// Fetch all products with pagination
export const fetchAllproduct = (page = 0, size = 10) => {
    return axios.get(`${URL}?page=${page}&size=${size}`);
}

// Fetch single product by ID
export const fetchProductById = (id) => {
    return axios.get(`${URL}/${id}`);
}
