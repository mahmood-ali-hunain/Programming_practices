// Simple calculator using enumeration and switch 
enum Operation{
    add,
    subtract,
    divide,
    multiply,
}
void main(){
    const op = Operation.add;
    const a=4;
    const b=8;
    switch(op){
        case Operation.add:
        print('$a + $b = ${a+b}');
        break;
        case Operation.subtract:
        print('$a - $b = ${a-b}');
        break;
        case Operation.divide:
        print('$a / $b = ${a/b}');
        break;
        case Operation.multiply:
        print('$a * $b = ${a*b}');
        break;
        default:
        print('Error');
        
    }
}