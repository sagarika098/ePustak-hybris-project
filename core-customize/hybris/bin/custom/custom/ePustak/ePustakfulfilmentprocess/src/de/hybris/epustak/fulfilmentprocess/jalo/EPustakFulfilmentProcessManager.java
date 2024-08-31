/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.epustak.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.epustak.fulfilmentprocess.constants.EPustakFulfilmentProcessConstants;

public class EPustakFulfilmentProcessManager extends GeneratedEPustakFulfilmentProcessManager
{
	public static final EPustakFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (EPustakFulfilmentProcessManager) em.getExtension(EPustakFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
