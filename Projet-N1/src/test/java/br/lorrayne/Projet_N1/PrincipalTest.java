package br.lorrayne.Projet_N1;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PrincipalTest {


	@Test
	public void testGetHorario() {
		
		SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
		String time = d.format(new Date());
		
		assertEquals(d, time);
	}

}
