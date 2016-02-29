function roman(nbr) {
  var convertor = {
    M:1000,
    CM:900,
    D:500,
    CD:400,
    C:100,
    XC:90,
    L:50,
    XL:40,
    X:10,
    IX: 9,
    V:5,
    IV:4,
    I:1};

  var result = "";
  for (var romanNumeral in convertor) {
    var decimal = convertor[romanNumeral];
    while (nbr >= decimal) {
      result += romanNumeral;
      nbr -= decimal;
    }
  }
  return result;
}