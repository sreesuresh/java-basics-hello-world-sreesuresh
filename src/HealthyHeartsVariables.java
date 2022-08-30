public  class HealthyHeartsVariables {

    static int heartRateMax = 220;
    static double initialTargetHeartRateZone = 0.5;
    static  double finalTargetHeartRateZone = 0.85;
    private int age;

    public HealthyHeartsVariables(int age) {
        setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxHeartRate() {
        return (heartRateMax - age);
    }

    public String getTargetHeartRate() {
        return String.format("%.0f - %.0f", getMaxHeartRate() * initialTargetHeartRateZone, getMaxHeartRate() * finalTargetHeartRateZone);
    }
}