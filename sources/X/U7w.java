package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.smartcapture.docauth.DocAuthManager;

public final class U7w extends Fragment implements C13833Ti8, B17 {
    public static final /* synthetic */ AnonymousClass0YZ[] A06;
    public long A00;
    public C343367q6 A01;
    public C380369Xs A02;
    public boolean A03 = true;
    public final 0s0 A04 = new C20422Wr7(0);
    public final 0s0 A05 = new C20422Wr7(0);

    public final void DZ8(C363848kR r4) {
        byte[] bArr;
        0qQ.A0B(r4, 0);
        DocAuthManager docAuthManager = (DocAuthManager) Pxe.A0s(this, this.A04, A06, 0);
        if (docAuthManager != null && (bArr = r4.A09) != null) {
            docAuthManager.onPreviewFrame(bArr);
        }
    }

    public final boolean EzX(C364018kj r6) {
        C380369Xs r0 = this.A02;
        if (r0 != null) {
            if (r0.A0U.isConnected()) {
                C342727p4 r2 = C342717p3.A0B;
                0qQ.A08(r2);
                Number number = (Number) A00(r2, this);
                if (number == null || number.intValue() != 0) {
                    C342757p7 r1 = new C342757p7();
                    r1.A01(r2, 0);
                    C380369Xs r02 = this.A02;
                    if (r02 != null) {
                        r02.A0U.CoY(new C15099UOz(1, this, r6), r1.A00());
                        return true;
                    }
                } else {
                    C380369Xs r03 = this.A02;
                    if (r03 != null) {
                        r03.A04(r6);
                        return true;
                    }
                }
            } else if (SystemClock.elapsedRealtime() - this.A00 <= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                return true;
            } else {
                r6.DCn(new IllegalStateException("Camera is disconnected."));
                return true;
            }
        }
        0qQ.A0F("cameraPreview");
        throw AnonymousClass00P.createAndThrow();
    }

    static {
        Class<U7w> cls = U7w.class;
        A06 = new AnonymousClass0YZ[]{new 015(cls, "camDelegate", "getCamDelegate()Lcom/facebook/smartcapture/camera/CameraDelegate;", 0), new 015(cls, "initListener", "getInitListener()Lcom/facebook/optic/previewview/CameraPreviewView$OnInitialisedListener;", 0)};
    }

    public static final Object A00(C342727p4 r1, U7w u7w) {
        Object A022;
        C343367q6 r0 = u7w.A01;
        if (r0 != null && (A022 = r0.A03.A02(r1)) != null) {
            return A022;
        }
        C380369Xs r02 = u7w.A02;
        if (r02 != null) {
            return r02.A0U.Bt2().A02(r1);
        }
        0qQ.A0F("cameraPreview");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C343047pa BcL() {
        C342727p4 r0 = C342717p3.A0k;
        0qQ.A08(r0);
        return (C343047pa) A00(r0, this);
    }

    public final C343047pa Bf7() {
        C342727p4 r0 = C342717p3.A0q;
        0qQ.A08(r0);
        return (C343047pa) A00(r0, this);
    }

    public final int Boi(int i) {
        C380369Xs r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("cameraPreview");
            throw AnonymousClass00P.createAndThrow();
        }
        C340607lX r12 = r1.A0U;
        return r12.AF4(r12.Ajk(), i);
    }

    public final void EQM(DocAuthManager docAuthManager) {
        DbS.A1a(this, docAuthManager, this.A04, A06, 0);
    }

    public final void EQS(int i) {
        C380369Xs r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("cameraPreview");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.post(new C20145Wm5(this, i));
        }
    }

    public final void EeV(C3497181l r4) {
        DbS.A1a(this, r4, this.A05, A06, 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.SoG} */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.7km] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            android.os.Bundle r5 = r6.mArguments
            r3 = 0
            java.lang.String r4 = "cameraPreview"
            if (r5 == 0) goto L_0x0018
            r0 = 776(0x308, float:1.087E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            int r1 = r5.getInt(r0, r3)
            X.9Xs r0 = r6.A02
            if (r0 == 0) goto L_0x006f
            r0.setInitialCameraFacing(r1)
        L_0x0018:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r1 = "fixed_photo_size"
            if (r2 < r0) goto L_0x0061
            if (r5 == 0) goto L_0x0068
            java.lang.Class<com.facebook.smartcapture.camera.sizesetter.FixedSizes> r0 = com.facebook.smartcapture.camera.sizesetter.FixedSizes.class
            java.lang.Object r0 = r5.getParcelable(r1, r0)
        L_0x0028:
            com.facebook.smartcapture.camera.sizesetter.FixedSizes r0 = (com.facebook.smartcapture.camera.sizesetter.FixedSizes) r0
            if (r0 == 0) goto L_0x0068
            X.SoG r2 = new X.SoG
            r2.<init>(r0)
            boolean r0 = r0.A02
        L_0x0033:
            r6.A03 = r0
            X.9Xs r1 = r6.A02
            if (r1 == 0) goto L_0x006f
            r1.A0C = r3
            X.7kp r0 = X.C340177kp.HIGH
            r1.A03 = r0
            X.7kp r0 = X.C340177kp.DEACTIVATED
            r1.A04 = r0
            r1.A05 = r2
            X.WIe r0 = new X.WIe
            r0.<init>(r6, r3)
            r1.setOnInitialisedListener(r0)
            X.9Xs r0 = r6.A02
            if (r0 == 0) goto L_0x006f
            r0.setDoubleTapToZoomEnabled(r3)
            X.9Xs r0 = r6.A02
            if (r0 == 0) goto L_0x006f
            r0.A0E = r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A00 = r0
            return
        L_0x0061:
            if (r5 == 0) goto L_0x0068
            android.os.Parcelable r0 = r5.getParcelable(r1)
            goto L_0x0028
        L_0x0068:
            X.SoE r2 = new X.SoE
            r2.<init>()
            r0 = 1
            goto L_0x0033
        L_0x006f:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7w.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-143001755);
        C380369Xs r1 = new C380369Xs(requireActivity());
        this.A02 = r1;
        AnonymousClass0fD.A09(46410130, A022);
        return r1;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(441977787);
        U7w.super.onPause();
        C380369Xs r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("cameraPreview");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A03();
        AnonymousClass0fD.A09(912779833, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1943562222);
        U7w.super.onResume();
        C380369Xs r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("cameraPreview");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A0D = false;
        if (r1.isAvailable()) {
            C380369Xs.A02(r1);
        }
        AnonymousClass0fD.A09(-688920572, A022);
    }
}
