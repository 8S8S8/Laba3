final class Service {
    private final String title;
    private final double cost;
    private final ServiceTypes serviceTypes;

    public Service() {
        this("интернет 100мб\\сек", 300, ServiceTypes.INTERNET);
    }

    public ServiceTypes getServiceTypes() {
        return serviceTypes;
    }

    public Service(String title, double cost, ServiceTypes serviceType) {
        this.title = title;
        this.cost = cost;
        this.serviceTypes = serviceType;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Наименование услуги: " + getTitle() + " (" + getCost() + "р/м) " + "тип услуги " + getServiceTypes();
    }
}
