public class EntityAccount extends AbstractAccount implements Account{

    protected EntityAccount(long number, Tariff tariff) {
        super(number,tariff);
    }

    public EntityAccount(long number, Person person, Tariff tariff) {
        super(number, person, tariff);
    }
}
