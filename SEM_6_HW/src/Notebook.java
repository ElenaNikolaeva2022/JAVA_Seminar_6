
/**
* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
* Реализовать в java.
* Создать множество ноутбуков.
* Написать метод, который будет запрашивать у пользователя критерий 
* (или критерии) фильтрации и выведет ноутбуки, 
* отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
* “Введите цифру, соответствующую необходимому критерию:
* 1 - ОЗУ
* 2 - Объем HHD или SSD
* 3 - Операционная система
* 4 - Цвет …
* Далее нужно запросить минимальные значения для указанных 
* критериев - сохранить параметры фильтрации можно также в Map.
* Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

public class Notebook {
    
    String brend;
    String color;
    double screen;
    String brendCpu;
    int numCores;
    int ram;
    int memory;
    String brendVideo;


    public Notebook(String brend, String color, double screen, String brendCpu, int numCores, int ram, int memory,
            String brendVideo) {
        this.brend = brend;
        this.color = color;
        this.screen = screen;
        this.brendCpu = brendCpu;
        this.numCores = numCores;
        this.ram = ram;
        this.memory = memory;
        this.brendVideo = brendVideo;
    }


    public String getBrend() {
        return brend;
    }


    public String getColor() {
        return color;
    }


    public double getScreen() {
        return screen;
    }


    public String getBrendCpu() {
        return brendCpu;
    }


    public int getNumCores() {
        return numCores;
    }


    public int getRam() {
        return ram;
    }


    public int getMemory() {
        return memory;
    }


    public String getBrendVideo() {
        return brendVideo;
    }

    @Override
    public String toString() {
        return String.format("Noutbook: %s, color: %s size: %.1f inch Processor: %s Количество ядер: %d Ram: %d Gb HDD: %d Gb videocard: %s\n", getBrend(), getColor(), getScreen(), getBrendCpu(), getNumCores(), getRam(), getMemory(), getBrendVideo());
    }
    
}