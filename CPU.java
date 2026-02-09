class CPU
{
	int price;
	CPU(int price)
	{
		this.price=price;
	}
	class Processor
	{
		int cores;
		String manufacturer;
		Processor(int cores,String manufacturer)
		{
			this.cores=cores;
			this.manufacturer=manufacturer;
		}
		void displayProcessorInfo()
		{
			System.out.println("processor cores:"+cores);
			System.out.println("processor manufacturer:"+manufacturer);
		}
	}
	static class RAM
	{
		int memory;
		String manufacturer;
		RAM(int memory,String manufacturer)
		{
			this.memory=memory;
			this.manufacturer=manufacturer;
		}
		void displayRAMInfo()
		{
			System.out.println("ram memory:"+memory+"GB");
			System.out.println("ram manufacturer:"+manufacturer);
		}
	}
	public static void main(String args[])
	{
		CPU cpu=new CPU(45000);
		System.out.println("cpu price:"+cpu.price);
		CPU.Processor processor=cpu.new Processor(8,"intel");
		CPU.RAM ram=new CPU.RAM(16,"corsair");
		ram.displayRAMInfo();
		processor.displayProcessorInfo();
	}
}
