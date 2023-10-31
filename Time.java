
public class Time implements Runnable{
	Tamagotchi currTamagotchi;
	
	Time(Tamagotchi currTamagotchi){
		this.currTamagotchi = currTamagotchi;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			  try {
				Thread.sleep(1000);
				currTamagotchi.hungerIncrement();
				currTamagotchi.hygieneIncrement();
				currTamagotchi.sadnessIncrement();
				currTamagotchi.thirstIncrement();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	}

}
