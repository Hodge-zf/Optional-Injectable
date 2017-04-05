public class Driver{
  public static void main(String[] args){
    Example example = new Example();
    Example injectedExample = new Example(() -> System.out.println("Injected Optional"));

    InterfaceInjectable interfaceInjectable = () -> System.out.println("mystery method injected");

    example.doOptional();
    example.doMysterious(() -> System.out.println("interfaceInjectable"));

    injectedExample.doOptional();
    injectedExample.doMysterious(() -> System.out.println("interfaceInjectable"));
  }
}
