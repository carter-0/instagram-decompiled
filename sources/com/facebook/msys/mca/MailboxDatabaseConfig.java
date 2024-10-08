package com.facebook.msys.mca;

import X.C66595MYh;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public class MailboxDatabaseConfig {
    public static final MailboxDatabaseConfig $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    public MailboxDatabaseConfig(String str, String str2, Map map, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback, MailboxDatabaseCallback mailboxDatabaseCallback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, boolean z8, boolean z9, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, Database.SchemaDeployer schemaDeployer3, Database.SchemaDeployer schemaDeployer4, Database.VirtualTableModuleRegistrator virtualTableModuleRegistrator) {
        this.mNativeHolder = initNativeHolder(str, str2, map, databaseHealthMonitorFatalErrorCallback, mailboxDatabaseCallback, true, false, false, z4, false, false, false, 0, -1, false, true, schemaDeployer, schemaDeployer2, schemaDeployer3, schemaDeployer4, virtualTableModuleRegistrator);
    }

    private native NativeHolder initNativeHolder(String str, String str2, Map map, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback, MailboxDatabaseCallback mailboxDatabaseCallback, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, boolean z8, boolean z9, Database.SchemaDeployer schemaDeployer, Database.SchemaDeployer schemaDeployer2, Database.SchemaDeployer schemaDeployer3, Database.SchemaDeployer schemaDeployer4, Database.VirtualTableModuleRegistrator virtualTableModuleRegistrator);

    static {
        C66595MYh.A00();
    }
}
