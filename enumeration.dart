enum Medals {gold, silver, bronze, noMedal}
void main(){
    const medal =Medals.noMedal;
    switch(medal){
    case Medals.gold:
    print('Gold');
    break;
    case Medals.silver:
    print('Silver');
    break;
    case Medals.bronze:
    print('Bronze');
    break;
    case Medals.noMedal:
    print('No Medal');
    break;
    }
}