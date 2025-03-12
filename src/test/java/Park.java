public class Park {
    class Attraction {
        String name;
        String workingHours;
        double cost;
        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}