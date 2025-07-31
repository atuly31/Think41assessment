import axios from "axios";

const URL = "http://localhost:8080/api/department";

export const fetchDepartments = () => {
    return axios.get(`${URL}`);
}
export const fetchDepartmentById = (id) => {
    return axios.get(`${URL}/${id}`);
}

export const fetchProductsByDepartmentId = (id) => {
    return axios.get(`${URL}/${id}/products`);
}


