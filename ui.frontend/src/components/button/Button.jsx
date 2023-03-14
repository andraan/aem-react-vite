import React, { useState } from "react";
import "./styles.css";

const Button = () => {
  const [value, setValue] = useState(0);
  return (
    <div className="button-container">
      <p>Handling state</p>
      <button
        className="button-container__btn"
        onClick={() => setValue((prev) => prev + 1)}
      >
        Increase Counter
      </button>
      <p>
        <strong>Value: {value}</strong>
      </p>
    </div>
  );
};

export default Button;
