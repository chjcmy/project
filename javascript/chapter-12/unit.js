function convert(degree) {
  let value = parseFloat(degree);
  return (value-32)/ 1.8;
}

function testConvert() {
  if (convert(32) !== 0) {
    throw new Error("변환 실패");
  }
}

testConvert();
