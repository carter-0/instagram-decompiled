package com.msys;

import X.AnonymousClass00P;
import X.AnonymousClass66Q;
import X.AnonymousClass66S;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;
import com.mcftypeholder.McfTypeHolder;

public class MsysInfraMCFBridgeCallbacks {

    public abstract class MCIDatabaseSchemaDeployer {
        private NativeHolder callbackJNI(SqliteHolder sqliteHolder) {
            int upgrade = ((AnonymousClass66Q) this).A00.upgrade(sqliteHolder);
            NativeHolder MCIDatabaseSchemaDeployerResultCreateDefaultNative = msysInfraMCFBridgejniDispatcher.MCIDatabaseSchemaDeployerResultCreateDefaultNative();
            McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
            msysInfraMCFBridgejniDispatcher.MCIDatabaseSchemaDeployerResultSetSqliteErrorCodeNative(MCIDatabaseSchemaDeployerResultCreateDefaultNative, upgrade);
            return MCIDatabaseSchemaDeployerResultCreateDefaultNative;
        }
    }

    public abstract class MCIDatabaseVirtualTableModuleRegistrator {
        private int callbackJNI(SqliteHolder sqliteHolder) {
            return ((AnonymousClass66S) this).A00.register(sqliteHolder);
        }
    }

    public abstract class MCIDatabaseConfigureCallback {
        public MCIDatabaseConfigureCallback() {
            throw AnonymousClass00P.createAndThrow();
        }

        private boolean callbackJNI(SqliteHolder sqliteHolder, int i, boolean z, NativeHolder nativeHolder) {
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public abstract class MCIDatabaseFatalErrorHandler {
        public MCIDatabaseFatalErrorHandler() {
            throw AnonymousClass00P.createAndThrow();
        }

        private void callbackJNI(MsysError msysError) {
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public abstract class MCIDatabaseInitializedCallback {
        public MCIDatabaseInitializedCallback() {
            throw AnonymousClass00P.createAndThrow();
        }

        private void callbackJNI(SqliteHolder sqliteHolder) {
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public abstract class MCIMailboxDatabaseOpenCallback {
        public MCIMailboxDatabaseOpenCallback() {
            throw AnonymousClass00P.createAndThrow();
        }

        private void callbackJNI(boolean z, AccountSession accountSession, MsysError msysError) {
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
