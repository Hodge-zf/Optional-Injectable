public class Example implements InterfaceOptional, InterfaceMysterious{

  private InterfaceOptional interfaceOptional;

  public Example(){}

  public Example(InterfaceOptional interfaceOptional)
  {
    this.interfaceOptional = interfaceOptional;
  }

  public void doOptional()
  {
    if (this.interfaceOptional != null){
       interfaceOptional.doOptional();
     }
    else{ System.out.println("Default");}
  }

  public void doMysterious(InterfaceInjectable interfaceInjectable)
  {
  interfaceInjectable.doInjectableMethod();
  }
}
