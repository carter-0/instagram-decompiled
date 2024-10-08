package X;

import android.content.res.AssetManager;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.common.FBMobileConfigGlobalContextHolder;
import java.io.File;
import java.util.HashSet;
import org.webrtc.CameraCapturer;

public final class NRB extends 0ng {
    public final /* synthetic */ 2C8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRB(2C8 r4) {
        super(384189403, 3, false, false);
        this.A00 = r4;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.1A5, java.lang.Object] */
    public final void run() {
        C2813356z r0 = this.A00.A00;
        if (r0 != null) {
            OJN ojn = r0.A00;
            1AA r7 = ojn.A00.A01;
            MobileConfigManagerHolderImpl A002 = 19z.A00(r7.A0A());
            if (A002 == null) {
                0KC.A0D("MobileConfigFBTFactoryHolder", "MobileConfigFBTFactoryHolder:syncConfigsAndMayUpdateManager FBTMCSetupStatusNoManager");
                return;
            }
            MobileConfigManagerHolderImpl updateConfigsWithParamsListAndMayCreateManager = A002.updateConfigsWithParamsListAndMayCreateManager(CameraCapturer.OPEN_CAMERA_TIMEOUT);
            if (updateConfigsWithParamsListAndMayCreateManager != null) {
                String directoryPathForSession = updateConfigsWithParamsListAndMayCreateManager.getDirectoryPathForSession();
                File A0t = AnonymousClass7TE.A0t(directoryPathForSession);
                int i = r7.A06;
                C73458Pd0 pd0 = new C73458Pd0(ojn, C262244Cs.A03(A0t, i));
                AnonymousClass0eK r18 = null;
                File file = null;
                AnonymousClass1A2 r9 = null;
                HashSet A1F = AnonymousClass7TE.A1F();
                boolean z = false;
                AssetManager assetManager = r7.A07;
                ? obj = new Object();
                String bufferPathPostFix = updateConfigsWithParamsListAndMayCreateManager.getBufferPathPostFix();
                File file2 = r7.A0C;
                if (file2 != null) {
                    file = file2;
                }
                AnonymousClass0eK r6 = r7.A0Y;
                if (r6 != null) {
                    z = r7.A0F;
                    r18 = r6;
                }
                AnonymousClass1A2 r62 = r7.A08;
                if (r62 != null) {
                    r9 = r62;
                }
                1AA r72 = new 1AA(assetManager, r9, (FBMobileConfigGlobalContextHolder) null, (19p) null, obj, new 19z(), (AnonymousClass19q) null, file, bufferPathPostFix, A1F, r18, pd0, (AnonymousClass0eK) null, (int[][]) null, i, -1, 1, false, z, false, false);
                r72.A0F(updateConfigsWithParamsListAndMayCreateManager);
                String str = "/";
                if (directoryPathForSession.endsWith(str)) {
                    str = "";
                }
                ojn.A00 = new OB0(r72, C262244Cs.A01(AnonymousClass7TE.A0t(002.A0g(directoryPathForSession, str, "extra_data.json"))));
            }
        }
    }
}
