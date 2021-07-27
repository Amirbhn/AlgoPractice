function stringToInteger(s) {

        var index = 0;
        var isPositiveOrNegative = 1;
        var res = 0;
        var INT_MAX = 2147483647;
        var INT_MIN = - INT_MAX - 1;

        while (s[index] === ' ') index++;

        if (s[index] === '+' || s[index] === '-') {
            isPositiveOrNegative = s[index] === '+' ? 1 : -1;
            index++;
        }

        while (s[index] >= '0' && s[index] <= '9') {
            res = Number(res * 10) + Number(s[index]);
            if (isPositiveOrNegative === 1 && res > INT_MAX) return INT_MAX;
            if (isPositiveOrNegative === -1 && res > INT_MAX + 1) return INT_MIN;
            index++;
        }

        return res * isPositiveOrNegative;

}
 var test = '     -215.5w11ae'

console.log(stringToInteger(test))

{"mode":"full","isActive":false}