class Sandwich {
    private String filling, bread, sauce;


    public Sandwich() {
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "filling='" + filling + '\'' +
                ", bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}