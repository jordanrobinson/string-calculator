function stringCalculator (writer) {
    return {
        add(numbers) {
            let sum = 0;

            if (!numbers)
            {
                writer.write(sum);
                return sum;
            }

            const splitNumbers = numbers.split(",");
            sum = splitNumbers.reduce(((accumulator, currentValue) => accumulator + parseInt(currentValue)), 0);

            writer.write(sum);
            return sum;
        }
    }
}

module.exports = { stringCalculator };