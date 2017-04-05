public class Driver{
  public static void main(String[] args){
    Example example = new Example();
    Example injectedExample = new Example(() -> System.out.println("Optional Injected"));

    InterfaceInjectable interfaceInjectable = () -> System.out.println("Mystery Method Injected");

    example.doOptional();
    example.doMysterious(() -> System.out.println("Interface Injectable"));

    injectedExample.doOptional();
    injectedExample.doMysterious(() -> System.out.println("Interface Injectable"));
  }
}
