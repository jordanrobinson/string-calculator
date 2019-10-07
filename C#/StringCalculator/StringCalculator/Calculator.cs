namespace StringCalculator
{
	public class Calculator
	{
		// uncomment to start!

		//private readonly IOutputWriter _outputWriter;

		//public Calculator(IOutputWriter outputWriter)
		//{
		//	_outputWriter = outputWriter;
		//}

		public int Add(string numbers)
		{
			var sum = 0;

			if (numbers == string.Empty)
			{
				//_outputWriter.Write(sum);
				return sum;
			}

			var splitNumbers = numbers.Split(",");

			foreach (var number in splitNumbers)
			{
				if (int.TryParse(number, out var integerNumber))
				{
					sum += integerNumber;
				}
			}

			//_outputWriter.Write(sum);
			return sum;
		}
	}
}