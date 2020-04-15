public class IndividualAccount extends AbstractAccount implements Account{

    public IndividualAccount(long number, Tariff tariff) {
        super(number,tariff);
    }

    public IndividualAccount(long number, Person person, Tariff tariff) {
        super(number, person, tariff);
    }
}
