/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.epustak.setup;

import static de.hybris.epustak.constants.EPustakstoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.epustak.constants.EPustakstoreConstants;
import de.hybris.epustak.service.EPustakstoreService;


@SystemSetup(extension = EPustakstoreConstants.EXTENSIONNAME)
public class EPustakstoreSystemSetup
{
	private final EPustakstoreService ePustakstoreService;

	public EPustakstoreSystemSetup(final EPustakstoreService ePustakstoreService)
	{
		this.ePustakstoreService = ePustakstoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		ePustakstoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return EPustakstoreSystemSetup.class.getResourceAsStream("/ePustakstore/sap-hybris-platform.png");
	}
}
