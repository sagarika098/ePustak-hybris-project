/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.epustak.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.epustak.core.constants.EPustakCoreConstants;
import de.hybris.epustak.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class EPustakCoreManager extends GeneratedEPustakCoreManager
{
	public static final EPustakCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (EPustakCoreManager) em.getExtension(EPustakCoreConstants.EXTENSIONNAME);
	}
}
