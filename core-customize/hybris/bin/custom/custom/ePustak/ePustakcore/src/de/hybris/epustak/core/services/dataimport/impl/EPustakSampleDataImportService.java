package de.hybris.epustak.core.services.dataimport.impl;

import de.hybris.platform.commerceservices.dataimport.impl.CoreDataImportService;
import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService;
import de.hybris.platform.core.initialization.SystemSetupContext;

public class EPustakSampleDataImportService extends SampleDataImportService {
    public static final String EPUSTAK = "powertools";
    public static final String EPUSTAK_STANDALONE = "powertools-standalone";

    private static final String IMPORT_CORE_DATA = "importCoreData";
    private static final String IMPORT_SAMPLE_DATA = "importSampleData";
    private static final String ACTIVATE_SOLR_CRON_JOBS = "activateSolrCronJobs";

    private CoreDataImportService coreDataImportService;
    public void importCommerceOrgData(final SystemSetupContext context)
    {
        final String extensionName = context.getExtensionName();

        getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/commerceorg/user-groups.impex", extensionName),
                false);
        getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/backoffice/registration/users.impex", extensionName),
                false);
        getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/accountsummary/documents.impex", extensionName),
                false);
    }
}
