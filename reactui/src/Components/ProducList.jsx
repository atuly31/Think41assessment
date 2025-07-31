import React, {useEffect, useState} from "react";
import {Link} from "react-router-dom";
import {fetchAllproduct} from "../services/Product";
const ProducList = ()=>{
    const [product, setproduct] = useState([]);
    useEffect(() => {
        fetchAllproduct()
            .then((res)=> setproduct(res.data))
            .catch((err)=>console.log(err))
    }, []);

    return (
        <div className="container mt-4">
            <h2 className="mb-3">All Products</h2>
            <div className="row">
                {product.map((product) => (
                    <div className="col-md-4 mb-4" key={product.id}>
                        <div className="card h-100">
                            <div className="card-body">
                                <h5 className="card-title">{product.name}</h5>
                                <p>{product.category} - ₹{product.retailPrice}</p>
                                <Link to={`/product/${product.id}`} className="btn btn-primary">
                                    View Details
                                </Link>
                            </div>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );

}

export default ProducList;