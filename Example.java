import java.lang.Object;
import java.util.Optional;

abstract public class Example implements InterfaceOptional, InterfaceMysterious{

  private Optional optional;

  public Example(){}

  public Example(Optional optional){}

  public void doOptional(){
    if (optional != null){
       optional.doOptional();
     }
    else{ System.out.println("Default");}
  }

  //public void doMysterious(Injectable injectable);
  //  doInjectableMethod(injectable);
}
