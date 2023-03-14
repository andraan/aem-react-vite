import { Page, withModel } from "@adobe/aem-react-editable-components";
import Button from "./components/button/Button";
import Image from "./components/image/Image";

class App extends Page {
  render() {
    return (
      <div className="App">
        <h1 className="title">Demo Vite AEM</h1>
        <div className="container">Container yellow to test styles.css</div>
        <Image />
        <Button />
        {this.childComponents}
        {this.childPages}
      </div>
    );
  }
}

export default withModel(App);
