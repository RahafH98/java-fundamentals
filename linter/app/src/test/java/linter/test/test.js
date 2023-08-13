
function testLinter() {
  console.log("Testing linter...");

  // Test 1: No errors
  console.log("No errors test:");
  console.log(and(1, 1));
  console.log(or(0, 1));

  // Test 2: One error
  console.log("One error test:");
  console.log(and(1, 1))
  console.log(xor(0, 1))

  // Test 3: Few errors
  console.log("Few errors test:");
  console.log(and(1, 1));
  console.log(or(0, 1));
  console.log(add1(0, 1));

  // Test 4: Many errors
  console.log("Many errors test:");
  console.log(and(1, 1))
  console.log(or(0, 1))
  console.log(xor(1, 0))
  console.log(nor(0, 0))
  console.log(add1(1, 0))

  // Test 5: Empty file
}

testLinter();
