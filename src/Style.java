public enum Style {

    A, F;

    public String toString(){
        switch(this){
            case A: return "Acoustic";
            case F: return "Folk";
            default: return "Acoustic";
        }
    }
}
