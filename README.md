
# ShapeTool SOAP Web Service

##  Project Overview

ShapeTool is a SOAP-based web service developed using Spring Boot. The purpose of this service is to calculate the area of different geometric shapes including:

- Circle  
- Square  
- Rectangle  
- Triangle  
- Parallelogram  

The project follows a "contract-first approach", where the XML Schema (XSD) is designed before implementing the service logic.

---

-## Technologies Used
- Java (Spring Boot)
- Spring Web Services (Spring-WS)
- JAXB (XML Binding)
- WSDL (Web Service Definition Language)
- XSD (XML Schema Definition)
- SOAP
- Maven


##  Project Structure

##  XSD Design (Schema Structure)

The `shapearea.xsd` defines the structure of request and response messages.

### Key Features:
- Each shape has its own request and response element
- Data types use `xs:double`
- Namespace used:


##  WSDL Description

The WSDL file is generated automatically from the XSD and defines:
- Service operations
- Input/output messages
- Endpoint location

### Operations:
- circleArea
- squareArea
- rectangleArea
- triangleArea
- parallelogramArea

## Service Implementation Example

java
@PayloadRoot(namespace = NAMESPACE, localPart = "circleAreaRequest")
@ResponsePayload
public CircleAreaResponse circle(@RequestPayload CircleAreaRequest request) {
    CircleAreaResponse response = new CircleAreaResponse();
    response.setArea(service.circle(request.getRadius()));
    return response;
}


##  Area Formulas Used

* Circle → π × r²
* Square → side × side
* Rectangle → length × width
* Triangle → 0.5 × base × height
* Parallelogram → base × height

---

##  Validation Strategy

* Negative values are rejected
* Missing parameters are handled
* Input validation is done in service layer

Example:

java
if (radius < 0) {
    throw new RuntimeException("Radius cannot be negative");
}


##  SOAP Fault Handling

Invalid inputs return SOAP Fault responses.

Example:
Radius cannot be negative

##  Testing

Tested using:

* SoapUI

### Sample Request:
<circleAreaRequest xmlns="http://ShapeTool.com/ShapeArea">
    <radius>5</radius>
</circleAreaRequest>

### Sample Response:

<circleAreaResponse>
    <area>78.54</area>
</circleAreaResponse>


## How to Run the Project

### 1. Install Git

Download Git from:
[https://git-scm.com/download/win](https://git-scm.com/download/win)

Run the installer:

* Click Next through setup (default settings are fine)
* Click Install and finish

### 2. Verify Installation

Press:

* Windows + R
* Type `cmd`
* Press Enter

Run:
bash
git --version


If installed correctly, it shows Git version.

### 3. Clone the Repository

Go to the folder where you want the project:

bash
git clone https://github.com/tenaabebaw/ShapeTool-SOAP.git

Git will download the project files

### 4. Run the Project

Navigate into project:
bash
cd ShapeArea

Run application:
bash
mvn spring-boot:run

### 5. Access WSDL

To access the generated WSDL, access the webservice by wrting as follow

http://localhost:8080/ws/shapearea.wsdl

##  Conclusion

This project demonstrates:

* Contract-first SOAP development
* XML Schema (XSD) design
* WSDL generation
* SOAP request/response handling
* Validation and fault handling


##  Author

Student Name: Tiena Abebaw

Course: Web Services

University: Woldia University

Year: 5th Year Software Engineering (2026)

