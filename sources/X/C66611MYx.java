package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AccountSessionBootstrapper;
import com.facebook.simplejni.NativeHolder;
import com.instagram.common.session.UserSession;
import com.mcftypeholder.McfTypeHolder;
import com.messagingclient.service.mciaccountsessionbootstrapper.MCIAccountSessionBootstrapperMCFBridgejniDispatcher;
import com.msys.MsysInfraNoSqliteMCFBridgeCallbacks;
import com.msys.msysInfraNoSqliteMCFBridgejniDispatcher;
import org.webrtc.CameraCapturer;

/* renamed from: X.MYx  reason: case insensitive filesystem */
public final class C66611MYx {
    public final String A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("isMainDBNeeded: ");
        A1A.append(A00(userSession));
        A1A.append("\nshouldInitializeMEMBeforeMailbox: ");
        A1A.append(A02(userSession, false));
        A1A.append("\nshouldUseMEMLoginForBackground: ");
        A1A.append(A03(userSession, false));
        return C51967G9n.A0r(A1A, 10);
    }

    public final boolean A02(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        if (A00(userSession)) {
            return false;
        }
        return C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965806581148L), z);
    }

    public static final boolean A00(UserSession userSession) {
        UserSession userSession2 = userSession;
        AccountSession A02 = C300345wy.A02(userSession2, AnonymousClass45R.A00(userSession2));
        C300355wz A00 = C300345wy.A00(2HM.A00(userSession2));
        boolean z = A00.A05;
        boolean z2 = A00.A06;
        boolean z3 = A00.A07;
        boolean z4 = A00.A01;
        boolean z5 = A00.A02;
        boolean z6 = A00.A03;
        boolean z7 = A00.A04;
        AccountSessionBootstrapper accountSessionBootstrapper = AccountSessionBootstrapper.$redex_init_class;
        NativeHolder MCIAuxiliaryDatabasesConfigCreateWithValuesNative = msysInfraNoSqliteMCFBridgejniDispatcher.MCIAuxiliaryDatabasesConfigCreateWithValuesNative((MsysInfraNoSqliteMCFBridgeCallbacks.MCIAuxiliaryDatabasesOpenCallback) null, true, false, z, z2, z3, CameraCapturer.OPEN_CAMERA_DELAY_MS, true, CameraCapturer.OPEN_CAMERA_DELAY_MS, z4, z5, CameraCapturer.OPEN_CAMERA_DELAY_MS, z6, z7, 0);
        McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
        return MCIAccountSessionBootstrapperMCFBridgejniDispatcher.MCIAccountSessionBootstrapIsMainDBNeededNative(A02, MCIAuxiliaryDatabasesConfigCreateWithValuesNative);
    }

    public final boolean A03(UserSession userSession, boolean z) {
        if (A00(userSession)) {
            return false;
        }
        return C3027865g.A00(userSession, AnonymousClass0yP.A00(36325965807433126L), z);
    }
}
