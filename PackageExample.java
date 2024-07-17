import example.Calculator;
  
 class PackageExample {  
     void main() {  
        Calculator calculator = new Calculator();  
        int result = calculator.add(5, 3);  
        System.out.println("Addition: " + result);  
        result = calculator.subtract(5, 3);  
        System.out.println("Subtraction: " + result);  
        result = calculator.multiply(5, 3);  
        System.out.println("Multiplication: " + result);   
    }  
}  