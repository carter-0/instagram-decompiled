package X;

import android.content.Context;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.instagram.msys.InstagramDasmConfigCreator;
import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.dasm.DasmSupportHelper;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AccountSessionBootstrapper;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.simplejni.NativeHolder;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import com.mcftypeholder.McfTypeHolder;
import com.messagingclient.service.mciaccountsessionbootstrapper.MCIAccountSessionBootstrapperMCFBridgejniDispatcher;
import com.msys.MsysInfraMCFBridgeCallbacks;
import com.msys.mcf.mcfMCFBridgejniDispatcher;
import com.msys.msysInfraMCFBridgejniDispatcher;
import com.msys.msysInfraMnsMCFBridgejniDispatcher;
import com.msys.msysInfraNoSqliteMCFBridgejniDispatcher;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.webrtc.CameraCapturer;

/* renamed from: X.5wy  reason: invalid class name and case insensitive filesystem */
public abstract class C300345wy {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005b, code lost:
        if (((java.lang.Boolean) r9.A0t.get()).booleanValue() != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C300355wz A00(X.AnonymousClass2HN r9) {
        /*
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.2HR r0 = r9.A0w
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            X.2HR r0 = r9.A0x
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            X.2HR r0 = r9.A1I
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            X.2HR r0 = r9.A0q
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            X.2HR r0 = r9.A0r
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            X.2HR r0 = r9.A0s
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x005d
            X.2HR r0 = r9.A0t
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x005e
        L_0x005d:
            r0 = 1
        L_0x005e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r4 = r0.booleanValue()
            X.2HR r0 = r9.A0u
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            X.5wz r1 = new X.5wz
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300345wy.A00(X.2HN):X.5wz");
    }

    public static final AccountSession A02(UserSession userSession, boolean z) {
        Object A01;
        C62320sa r1;
        0qQ.A0B(userSession, 0);
        boolean A04 = 2Aj.A04(userSession);
        MsysActiveUserSession A00 = 1y0.A00(userSession);
        if (A04) {
            r1 = new C73920Pm0(userSession, 32);
        } else if (z) {
            r1 = new AnonymousClass9LX(userSession, 6);
        } else {
            Class<AccountSession> cls = AccountSession.class;
            17k.A0I(!A00.A05(cls), "Foreground AccountSession already exists for the same user id", new Object[0]);
            A01 = userSession.A01(cls, new AnonymousClass9LX(userSession, 7));
            return (AccountSession) A01;
        }
        A01 = A00.A01(AccountSession.class, r1);
        return (AccountSession) A01;
    }

    public static final AccountSession A01(UserSession userSession, int i) {
        String str;
        McfTypeHolder mcfTypeHolder;
        McfTypeHolder mcfTypeHolder2;
        AnonymousClass66Q r4;
        AnonymousClass66Q r3;
        AnonymousClass66Q r2;
        AnonymousClass66S r1;
        UserSession userSession2 = userSession;
        C300355wz A00 = A00(2HM.A00(userSession2));
        DasmSupportHelper.initialize(C60960kU.A00);
        C300375x2.A00(userSession2.A03);
        PlatformStorageProvider.initialize(C60960kU.A00);
        NotificationCenter A002 = C300465xE.A00();
        C300185wg r0 = (C300185wg) userSession2.A01(C300185wg.class, new C73920Pm0(userSession2, 36));
        NetworkSession A003 = MsysInfraNoSqliteObjectHolder.A00();
        if (A003 == null) {
            A003 = C300395x4.A00(r0, A002);
        }
        C3027765f r02 = (C3027765f) userSession2.A01(C3027765f.class, new C73920Pm0(userSession2, 31));
        AuthData A004 = C300325ww.A00(userSession2);
        Context context = C60960kU.A00;
        0qQ.A07(context);
        String facebookUserID = C300325ww.A00(userSession2).getFacebookUserID();
        if (facebookUserID == null) {
            facebookUserID = "";
        }
        File databasePath = context.getDatabasePath(002.A0R("ig_msys_database_", facebookUserID));
        File parentFile = databasePath.getParentFile();
        parentFile.getClass();
        parentFile.mkdirs();
        try {
            str = databasePath.getCanonicalPath();
        } catch (IOException unused) {
            str = databasePath.getAbsolutePath();
        }
        0qQ.A07(str);
        Database.SchemaDeployer schemaDeployer = (Database.SchemaDeployer) C3028365p.A04.getValue();
        Database.SchemaDeployer schemaDeployer2 = (Database.SchemaDeployer) C3028365p.A02.getValue();
        Database.SchemaDeployer schemaDeployer3 = (Database.SchemaDeployer) C3028365p.A03.getValue();
        Database.SchemaDeployer schemaDeployer4 = (Database.SchemaDeployer) C3028365p.A01.getValue();
        Database.VirtualTableModuleRegistrator virtualTableModuleRegistrator = (Database.VirtualTableModuleRegistrator) C3028365p.A05.getValue();
        InstagramDasmConfigCreator instance = InstagramDasmConfigCreator.getInstance();
        boolean z = A00.A05;
        boolean z2 = A00.A06;
        boolean z3 = A00.A07;
        boolean z4 = A00.A01;
        boolean z5 = A00.A02;
        boolean z6 = A00.A03;
        boolean z7 = A00.A04;
        AnonymousClass666 r8 = new AnonymousClass666(r02);
        AccountSessionBootstrapper accountSessionBootstrapper = AccountSessionBootstrapper.$redex_init_class;
        NativeHolder MCIAccountIdentifierCreateWithAuthDataNative = msysInfraMnsMCFBridgejniDispatcher.MCIAccountIdentifierCreateWithAuthDataNative(A004);
        if (MCIAccountIdentifierCreateWithAuthDataNative == null) {
            mcfTypeHolder = null;
        } else {
            mcfTypeHolder = new McfTypeHolder(-12399581, MCIAccountIdentifierCreateWithAuthDataNative);
        }
        mcfTypeHolder.getClass();
        NativeHolder MCFURLCreateWithFileSystemPathNative = mcfMCFBridgejniDispatcher.MCFURLCreateWithFileSystemPathNative(str, false);
        if (MCFURLCreateWithFileSystemPathNative == null) {
            mcfTypeHolder2 = null;
        } else {
            mcfTypeHolder2 = new McfTypeHolder(956958879, MCFURLCreateWithFileSystemPathNative);
        }
        mcfTypeHolder2.getClass();
        AnonymousClass66Q r6 = new AnonymousClass66Q(schemaDeployer);
        if (schemaDeployer2 != null) {
            r4 = new AnonymousClass66Q(schemaDeployer2);
        } else {
            r4 = null;
        }
        if (schemaDeployer3 != null) {
            r3 = new AnonymousClass66Q(schemaDeployer3);
        } else {
            r3 = null;
        }
        if (schemaDeployer4 != null) {
            r2 = new AnonymousClass66Q(schemaDeployer4);
        } else {
            r2 = null;
        }
        HashMap hashMap = new HashMap();
        if (virtualTableModuleRegistrator != null) {
            r1 = new AnonymousClass66S(virtualTableModuleRegistrator);
        } else {
            r1 = null;
        }
        McfTypeHolder mcfTypeHolder3 = new McfTypeHolder(-748730796, msysInfraMCFBridgejniDispatcher.MCIDatabaseConfigCreateNative(mcfTypeHolder2.mNativeHolder, r6, r4, r3, r2, (MsysInfraMCFBridgeCallbacks.MCIDatabaseConfigureCallback) null, (MsysInfraMCFBridgeCallbacks.MCIDatabaseInitializedCallback) null, (MsysInfraMCFBridgeCallbacks.MCIMailboxDatabaseOpenCallback) null, (NativeHolder) null, hashMap, (MsysInfraMCFBridgeCallbacks.MCIDatabaseFatalErrorHandler) null, r1));
        msysInfraMCFBridgejniDispatcher.MCIDatabaseConfigSetEnableEarlyAuxDBOpenNative(mcfTypeHolder3.mNativeHolder, true);
        McfTypeHolder mcfTypeHolder4 = new McfTypeHolder(-1487933518, msysInfraNoSqliteMCFBridgejniDispatcher.MCIAuxiliaryDatabasesConfigCreateWithValuesNative(r8, true, false, z, z2, z3, CameraCapturer.OPEN_CAMERA_DELAY_MS, true, CameraCapturer.OPEN_CAMERA_DELAY_MS, z4, z5, CameraCapturer.OPEN_CAMERA_DELAY_MS, z6, z7, 0));
        AnonymousClass66Y createDasmConfig = instance.createDasmConfig();
        AccountSession MCIAccountSessionCreateAndBootstrapNative = MCIAccountSessionBootstrapperMCFBridgejniDispatcher.MCIAccountSessionCreateAndBootstrapNative(mcfTypeHolder.mNativeHolder, i, A004, mcfTypeHolder3.mNativeHolder, mcfTypeHolder4.mNativeHolder, A002, createDasmConfig.mNativeHolder, "7572135699556019", A003, (NativeHolder) null);
        0qQ.A07(MCIAccountSessionCreateAndBootstrapNative);
        AnonymousClass66a r03 = (AnonymousClass66a) userSession2.A01(AnonymousClass66a.class, AnonymousClass66b.A00);
        SessionedNotificationCenter sessionedNotificationCenter = MCIAccountSessionCreateAndBootstrapNative.getSessionedNotificationCenter();
        0qQ.A07(sessionedNotificationCenter);
        r03.A00 = sessionedNotificationCenter;
        sessionedNotificationCenter.addObserver(r03.A01, "MEMContextReadyNotification", 1, (AnonymousClass2Lq) null);
        MsysActiveUserSession A005 = 1y0.A00(userSession2);
        0qQ.A0B(A005, 1);
        MCPPluginsRegistryIntegration.nativeRegisterAppAccountScope(MCIAccountSessionCreateAndBootstrapNative, A005);
        return MCIAccountSessionCreateAndBootstrapNative;
    }
}
