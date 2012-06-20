package fr.opensagres.xdocreport.admin.eclipse.ui.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "fr.opensagres.xdocreport.admin.eclipse.ui.internal.Messages";//$NON-NLS-1$

	// Overview Page
	public static String ResourceEditor_OverviewPage_title;

	// Overview/General Info section
	public static String ResourceEditor_OverviewPage_GeneralInfo_title;
	public static String ResourceEditor_OverviewPage_GeneralInfo_resourceId_label;
	public static String ResourceEditor_OverviewPage_GeneralInfo_resourceName_label;

	public static String FileResourceEditor_OverviewPage_GeneralInfo_desc;
	public static String FolderResourceEditor_OverviewPage_GeneralInfo_desc;

	// Overview Page
	public static String RepositoryEditor_OverviewPage_title;

	// Overview/General Info section
	public static String RepositoryEditor_OverviewPage_GeneralInfo_title;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_desc;
	public static String RepositoryEditor_OverviewPage_GeneralInfo_baseAddress_label;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
