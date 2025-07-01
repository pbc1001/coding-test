function solution(num1, num2) {
    var answer = 0;
    answer = parseInt(num1 / num2);
    return answer;
}

const first = solution(10,5);
const second = solution(7,2);

console.log(first);
console.log(second);