import java.util.Date;

public class TestStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        //create elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round((float) Math.random() * 100000.0f);
        }
        //create Stopwatch object
        StopWatch time=new StopWatch();
        //record start time execute
        time.start();
        //print start time
        System.out.println(time.getStartTime());
        //selection sort
        for (int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //record end time execute
        time.stop();
        //print end time
        System.out.println(time.getEndTime());
        //print time execute
        double t=time.getElapsedTime();
        System.out.println("Time execute of selection sort algorithm is "+t);
    }
}

class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        Date now = new Date();
        startTime = now;
    }
    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void stop() {
        Date now = new Date();
        endTime = now;
    }

    public void start() {
        Date now = new Date();
        startTime = now;
    }

    public double getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
