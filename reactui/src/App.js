import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Route,Routes} from "react-router-dom";
import ProducList from "./Components/ProducList";
import ProductDetail from "./Components/ProductDetails";
import DepartmentList from "./Components/DepartmentList";
import DepartmentProducts from "./Components/DepartmentProducts";
function App() {
  return (
    <Router>
      <Routes>
        <Route path ="/" element={<ProducList/>}></Route>
        <Route path ="/product/:id" element={<ProductDetail/>}></Route>
          <Route path ="/departments" element={<DepartmentList/>}></Route>
          <Route path="/departments/:id" element={<DepartmentProducts />} />


      </Routes>

    </Router>
  );
}

export default App;
