import java.security.spec.RSAOtherPrimeInfo;

public class Main {
	public static void main(String[] args) {
		/*Cpu cpu1 = new Cpu(1, "Processor", "Core i7","Intel", "Socket H" , "GeForce" , "3200");
		Cpu cpu2 = new Cpu(2, "Processor", "Ryzon 5","AMD", "Socket B" , "sfsdds" , "sdfsdfd"  );
		MotherBoard motherBoard1 = new MotherBoard(3, "Mother Board", "LPX","уг", "Socket H" , "1650" , "Sata 3");
		MotherBoard motherBoard2 = new MotherBoard(4, "Mother Board", "RPX","уг", "sdfsdfds" , "sdfdsfdsf" , "sdfdsdsf");
		Ram ram1 = new Ram(5, "RAM", "DDR4","уг", "3200" , "1650");
		Ram ram2 = new Ram(6, "RAM", "DDR3","уг", "sdfdsf" , "sdfsdfsdf");
		GraphicCard graphicCard1 = new GraphicCard(7, "Graphic Card", "GeForce","Nvidia", "GeForce");
		GraphicCard graphicCard2 = new GraphicCard(8, "Graphic Card", "Radeon","AMD", "sdfsdfdsf");
		Rom rom1 = new Rom(9, "ROM", "WD","уг", "Sata 3");
		Rom rom2 = new Rom(10, "ROM", "Samsung","уг", "sdfdsfsdf");

		int count = 0;
		


		if(cpu1.equals(motherBoard1)) {count++;}
		if(cpu1.equals(graphicCard1)) {count++;}
		if(cpu1.equals(ram1)) {count++;}
		if(motherBoard1.equals(cpu1)) {count++;}
		if(motherBoard1.equals(ram1)) {count++;}
		if(motherBoard1.equals(rom1)) {count++;}

		
		if (count == 6) {
			System.out.println(cpu1.toString());
			System.out.println(motherBoard1.toString());
			System.out.println(ram1.toString());
			System.out.println(rom1.toString());
			System.out.println(graphicCard1.toString());
		}*/

		Cpu cpu[] = new Cpu[3];
		MotherBoard motherBoard[] = new MotherBoard[3];
		Ram ram[] = new Ram[3];
		GraphicCard graphicCard[] = new GraphicCard[3];
		Rom rom[] = new Rom[3];
		cpu[0] = new Cpu(1, "Processor", "Core i7","Intel", "Socket H" , "GeForce" , "3200");
		cpu[1] = new Cpu(2, "Processor", "Ryzen 5","AMD", "Socket B" , "sfsdds" , "sdfsdfd");
		cpu[2] = new Cpu(3, "Processor", "Core i7","Intel", "Socket H" , "GeForce" , "3200");
		motherBoard[0] = new MotherBoard(4, "Mother Board", "LPX","уг", "Socket H" , "1650" , "Sata 3");
		motherBoard[1] = new MotherBoard(4, "Mother Board", "LPX","уг", "Socket H" , "1650" , "Sata 3");
		motherBoard[2] = new MotherBoard(4, "Mother Board", "LPX","уг", "Socket H" , "1650" , "Sata 3");
		ram[0] = new Ram(5, "RAM", "DDR4","уг", "3200" , "1650");
		ram[1] = new Ram(5, "RAM", "DDR4","уг", "3200" , "1650");
		ram[2] = new Ram(5, "RAM", "DDR4","уг", "3200" , "1650");
		graphicCard[0] = new GraphicCard(7, "Graphic Card", "GeForce","Nvidia", "GeForce");
		graphicCard[1] = new GraphicCard(7, "Graphic Card", "GeForce","Nvidia", "GeForce");
		graphicCard[2] = new GraphicCard(7, "Graphic Card", "GeForce","Nvidia", "GeForce");
		rom[0] = new Rom(9, "ROM", "WD","уг", "Sata 3");
		rom[1] = new Rom(9, "ROM", "WD","уг", "Sata 3");
		rom[2] = new Rom(9, "ROM", "WD","уг", "Sata 3");
		

	}

}
