import React, { useEffect, useState } from 'react';
import {fetchProductById} from "../services/Product";
import { useParams, Link } from 'react-router-dom';

const ProductDetail = () => {
    const { id } = useParams();
    const [product, setProduct] = useState(null);

    useEffect(() => {
        fetchProductById(id)
            .then((res) => setProduct(res.data))
            .catch((err) => console.error(err));
    }, [id]);

    if (!product) return <div>Loading...</div>;

    return (
        <div className="container mt-4">
            <h2>{product.name}</h2>
            <p><strong>Brand:</strong> {product.brand}</p>
            <p><strong>Category:</strong> {product.category}</p>
            <p><strong>Price:</strong> ₹{product.retailPrice}</p>
            <p><strong>Department:</strong> {product.department}</p>
            <p><strong>SKU:</strong> {product.sku}</p>
            <Link to="/" className="btn btn-secondary mt-3">Back to List</Link>
        </div>
    );
};

export default ProductDetail;