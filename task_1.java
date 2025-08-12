@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(11);
	assertEquals("Маленький еще",true, isAdult);
}
