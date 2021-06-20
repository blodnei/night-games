package org.nightgames.ports.main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName( "This app should" )
class MainSuite
{
	@Test
	@DisplayName( "reject nulls." )
	void reject_nulls()
	{
		assertThrows( IllegalArgumentException.class, () -> Main.main( null ) );
	}
}
