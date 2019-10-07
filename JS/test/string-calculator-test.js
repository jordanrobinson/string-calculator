let chai = require('chai');
let expect = chai.expect;
let OutputWriter = require('./../src/output-writer');
const { stringCalculator } = require("../src/string-calculator");

describe('StringCalculator', function() {
    it('add() should return 0 if empty string passed in', function() {
        expect(stringCalculator(OutputWriter).add('')).to.equal(0);
    });

    it('add() should return a number if a number is passed in', function() {
        expect(stringCalculator(OutputWriter).add('4')).to.equal(4);
    });

    it('add() should return the sum of two numbers passed in', function() {
        expect(stringCalculator(OutputWriter).add('1,2')).to.equal(3);
    });

    it('add() should return the sum of all numbers passed in when there are multiple numbers', function() {
        expect(stringCalculator(OutputWriter).add('1,2,3')).to.equal(6);
    });
});