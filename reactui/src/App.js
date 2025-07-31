import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router,Route,Routes} from "react-router-dom";
import ProducList from "./Components/ProducList";
import ProductDetail from "./Components/ProductDetails";
function App() {
  return (
    <Router>
      <Routes>
        <Route path ="/" element={<ProducList/>}></Route>
        <Route path ="/product/:id" element={<ProductDetail/>}></Route>

      </Routes>

    </Router>
  );
}

export default App;
