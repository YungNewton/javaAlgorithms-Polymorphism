public class Printer {
    private int pagesPrinted=0;
    private boolean duplex;
    private int tonerLevel = -1;

    public Printer( int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        if (tonerLevel>-1&&tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0&&tonerAmount<=100){
            if (this.tonerLevel+tonerAmount>100){
                return -1;
            }else {
                this.tonerLevel =this.tonerLevel+tonerAmount;
                return this.tonerLevel;
            }
        }else {
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if (duplex){
            pagesToPrint = pages/2;
            System.out.println("Printing in duplex mode");
        }
        if (pages%2>0){
            pagesToPrint = pagesToPrint+1;
        }
        this.pagesPrinted = this.pagesPrinted+pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}