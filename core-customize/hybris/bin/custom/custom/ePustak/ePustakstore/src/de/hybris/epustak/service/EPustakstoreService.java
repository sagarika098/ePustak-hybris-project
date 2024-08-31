/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.epustak.service;

public interface EPustakstoreService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
