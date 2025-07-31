import React, { useEffect, useState } from 'react';
import { fetchDepartmentById, fetchProductsByDepartmentId } from '../services/departmentService';
import { Link, useParams } from 'react-router-dom';

const DepartmentProducts = () => {
    const { id } = useParams();
    const [department, setDepartment] = useState(null);
    const [products, setProducts] = useState([]);

    useEffect(() => {
        fetchDepartmentById(id)
            .then((res) => setDepartment(res.data))
            .catch(console.error);

        fetchProductsByDepartmentId(id)
            .then((res) => setProducts(res.data))
            .catch(console.error);
    }, [id]);

    if (!department) return <p>Loading...</p>;

    return (
        <div className="container mt-4">
            <h2>{department.name}</h2>
            <p>{products.length} products found</p>

            <div className="mb-3">
                <Link to="/" className="btn btn-secondary">Back to All Products</Link>
            </div>

            <div className="row">
                {products.map((product) => (
                    <div className="col-md-4 mb-4" key={product.id}>
                        <div className="card h-100">
                            <div className="card-body">
                                <h5 className="card-title">{product.name}</h5>
                                <p>₹{product.retailPrice}</p>
                                <Link to={`/products/${product.id}`} className="btn btn-primary">Details</Link>
                            </div>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default DepartmentProducts;