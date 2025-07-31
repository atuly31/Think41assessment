import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import {fetchDepartments} from "../services/Department";

const DepartmentList = () => {
    const [departments, setDepartments] = useState([]);

    useEffect(() => {
        fetchDepartments()

            .then((res) => setDepartments(res.data))
            .catch(console.error);
    }, []);

    return (
        <div className="container mt-4">
            <h4>Departments</h4>
            <ul className="list-group">
                {departments.map((dept) => (
                    <li className="list-group-item" key={dept.id}>
                        <Link to={`/departments/${dept.id}`}>{dept.name}</Link>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default DepartmentList;