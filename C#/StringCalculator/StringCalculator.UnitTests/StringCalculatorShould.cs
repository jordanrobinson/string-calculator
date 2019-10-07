using Xunit;

namespace StringCalculator.UnitTests
{
	public class StringCalculatorShould
	{
		[Fact]
		public void Add_TakesEmptyString_ReturnsZero()
		{
			var calculator = new Calculator();

			var result = calculator.Add(string.Empty);

			Assert.Equal(0, result);
		}

		[Fact]
		public void Add_TakesSingleDigit_ReturnsSingleDigit()
		{
			var calculator = new Calculator();

			var result = calculator.Add("4");

			Assert.Equal(4, result);
		}

		[Fact]
		public void Add_TakesTwoDigits_AddsAndReturnsSingleDigit()
		{
			var calculator = new Calculator();

			var result = calculator.Add("1,2");

			Assert.Equal(3, result);
		}

		[Fact]
		public void Add_TakesArbitraryNumberOfDigits_AddsAndReturnsSingleDigit()
		{
			var calculator = new Calculator();

			var result = calculator.Add("1,2,3");

			Assert.Equal(6, result);
		}
	}
}