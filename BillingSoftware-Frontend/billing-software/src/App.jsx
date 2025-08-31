import Menubar from "./Components/Menubar/Menubar";
import { Routes, Route, useLocation } from "react-router-dom";
import Dashboard from "./Pages/Dashboard/Dashboard";
import Explore from "./Pages/Explore/Explore";
import ManageCategory from "./Pages/ManageCategory/ManageCategory";
import ManageItems from "./Pages/ManageItems/ManageItems";
import ManageUsers from "./Pages/ManageUsers/ManageUsers";
import { Toaster } from "react-hot-toast";
import Login from "./Pages/Login/Login";

const App = () => {
  const location = useLocation();
  return (
    <div>
      {location.pathname !== "/login" && <Menubar />}
      <Toaster />
      <Routes>
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/explore" element={<Explore />} />
        <Route path="/category" element={<ManageCategory />} />
        <Route path="/items" element={<ManageItems />} />
        <Route path="/users" element={<ManageUsers />} />
        <Route path="/login" element={<Login />} />
        <Route path="/" element={<Dashboard />} />
      </Routes>
    </div>
  );
};

export default App;
