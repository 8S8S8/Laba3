import List.LinkedList;

public class Test {
    public static void lab1tests(){
        IndividualsTariff tariff = new IndividualsTariff();
        Service firstService = new Service("VIP",500,ServiceTypes.INTERNET);
        Service secondService = new Service("Комфорт",1200,ServiceTypes.MAIL);
        Service thirdService = new Service("Эконом",300,ServiceTypes.PHONE);

        System.out.println(tariff);

        tariff.add(firstService,3);
        tariff.add(secondService);
        System.out.println(tariff);


        tariff.delete(secondService.getTitle());
        //tariff.delete(3);
        System.out.println(tariff);

        tariff.add(thirdService,7);
        tariff.trim();
        System.out.println(tariff);
    }

    public static void listTest(){
        LinkedList<String> list = new LinkedList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.toString());
        list.delete(2);
        System.out.println("После удаления ");
        System.out.println(list.toString());
        System.out.println(list.getSize());
        System.out.println("После добавления ");
        list.add("4",2);
        System.out.println(list.toString());
        System.out.println(list.getSize());

    }
    public static void lab3tests(){

        Service service = new Service();
        System.out.println(service);
        Service mail = new Service("Почта",200,ServiceTypes.MAIL);
        System.out.println(mail);

        IndividualsTariff tariff = new IndividualsTariff();
        Service firstService = new Service("VIP",500,ServiceTypes.INTERNET);
        Service secondService = new Service("Комфорт",1200,ServiceTypes.MAIL);
        Service thirdService = new Service("Эконом",300,ServiceTypes.PHONE);

        tariff.add(firstService);
        tariff.add(secondService);
        tariff.add(thirdService);

        System.out.println( tariff.toString());

        System.out.println("Услуги заданого типа: ");
        Service[] services = tariff.getTypedServices(ServiceTypes.INTERNET);
        for (int i = 0; i<services.length;i++){
            System.out.println(services[i].toString());
        }
    }

}
