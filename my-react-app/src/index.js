import React, { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import "./index.css";

import App from "./App";
import Title from "./infos";

const root = createRoot(document.getElementById("root"));
root.render(
  <StrictMode>
    <Title />
    <App />
  </StrictMode>
);
