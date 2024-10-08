package X;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.smartcapture.camera.DialogTexts;
import com.facebook.smartcapture.docauth.DocAuthManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class U7x extends Fragment implements C13833Ti8, B17 {
    public static final AtomicBoolean A0A = new AtomicBoolean(true);
    public static final /* synthetic */ AnonymousClass0YZ[] A0B;
    public long A00;
    public C343367q6 A01;
    public C380369Xs A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = true;
    public DialogTexts A06 = new DialogTexts("", "", "", "", "", "", "", "");
    public final 00Y A07 = registerForActivityResult(new Object(), new C11536Sbx(this, 4));
    public final 0s0 A08 = new C20422Wr7(1);
    public final 0s0 A09 = new C20422Wr7(1);

    public final void DZ8(C363848kR r4) {
        byte[] bArr;
        0qQ.A0B(r4, 0);
        DocAuthManager docAuthManager = (DocAuthManager) Pxe.A0s(this, this.A08, A0B, 0);
        if (docAuthManager != null && (bArr = r4.A09) != null) {
            docAuthManager.onPreviewFrame(bArr);
        }
    }

    public final boolean EzX(C364018kj r6) {
        if (A02(this)) {
            return false;
        }
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
                        r02.A0U.CoY(new C15099UOz(2, this, r6), r1.A00());
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
                return false;
            } else {
                r6.DCn(new IllegalStateException("Camera is disconnected."));
                return false;
            }
        }
        0qQ.A0F("cameraPreview");
        throw AnonymousClass00P.createAndThrow();
    }

    static {
        Class<U7x> cls = U7x.class;
        A0B = new AnonymousClass0YZ[]{new 015(cls, "camDelegate", "getCamDelegate()Lcom/facebook/smartcapture/camera/CameraDelegate;", 0), new 015(cls, "initListener", "getInitListener()Lcom/facebook/optic/previewview/CameraPreviewView$OnInitialisedListener;", 0)};
    }

    public static final Object A00(C342727p4 r1, U7x u7x) {
        Object A022;
        C343367q6 r0 = u7x.A01;
        if (r0 != null && (A022 = r0.A03.A02(r1)) != null) {
            return A022;
        }
        C380369Xs r02 = u7x.A02;
        if (r02 != null) {
            return r02.A0U.Bt2().A02(r1);
        }
        0qQ.A0F("cameraPreview");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.SoG} */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.7km] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.U7x r9) {
        /*
            android.os.Bundle r4 = r9.mArguments
            r7 = 1
            java.lang.String r8 = "cameraPreview"
            if (r4 == 0) goto L_0x0038
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r3 = "texts"
            java.lang.String r1 = "fixed_photo_size"
            if (r2 < r0) goto L_0x0046
            java.lang.Class<com.facebook.smartcapture.camera.sizesetter.FixedSizes> r0 = com.facebook.smartcapture.camera.sizesetter.FixedSizes.class
            java.lang.Object r2 = r4.getParcelable(r1, r0)
            com.facebook.smartcapture.camera.sizesetter.FixedSizes r2 = (com.facebook.smartcapture.camera.sizesetter.FixedSizes) r2
            java.lang.Class<com.facebook.smartcapture.camera.DialogTexts> r0 = com.facebook.smartcapture.camera.DialogTexts.class
            java.lang.Object r0 = r4.getParcelable(r3, r0)
        L_0x001f:
            com.facebook.smartcapture.camera.DialogTexts r0 = (com.facebook.smartcapture.camera.DialogTexts) r0
            if (r0 != 0) goto L_0x0025
            com.facebook.smartcapture.camera.DialogTexts r0 = r9.A06
        L_0x0025:
            r9.A06 = r0
            if (r2 == 0) goto L_0x003f
            X.SoG r1 = new X.SoG
            r1.<init>(r2)
            boolean r0 = r2.A02
        L_0x0030:
            r9.A05 = r0
            X.9Xs r0 = r9.A02
            if (r0 == 0) goto L_0x008b
            r0.A05 = r1
        L_0x0038:
            boolean r0 = A01(r9)
            if (r0 != 0) goto L_0x0051
            return r7
        L_0x003f:
            X.SoE r1 = new X.SoE
            r1.<init>()
            r0 = 1
            goto L_0x0030
        L_0x0046:
            android.os.Parcelable r2 = r4.getParcelable(r1)
            com.facebook.smartcapture.camera.sizesetter.FixedSizes r2 = (com.facebook.smartcapture.camera.sizesetter.FixedSizes) r2
            android.os.Parcelable r0 = r4.getParcelable(r3)
            goto L_0x001f
        L_0x0051:
            long r5 = r9.A00
            r3 = 0
            r2 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x008a
            X.9Xs r0 = r9.A02
            if (r0 == 0) goto L_0x008b
            r0.setInitialCameraFacing(r2)
            X.9Xs r1 = r9.A02
            if (r1 == 0) goto L_0x008b
            r1.A0C = r2
            X.7kp r0 = X.C340177kp.HIGH
            r1.A03 = r0
            X.7kp r0 = X.C340177kp.DEACTIVATED
            r1.A04 = r0
            X.WIe r0 = new X.WIe
            r0.<init>(r9, r7)
            r1.setOnInitialisedListener(r0)
            X.9Xs r0 = r9.A02
            if (r0 == 0) goto L_0x008b
            r0.setDoubleTapToZoomEnabled(r2)
            X.9Xs r0 = r9.A02
            if (r0 == 0) goto L_0x008b
            r0.A0E = r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r9.A00 = r0
        L_0x008a:
            return r2
        L_0x008b:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7x.A02(X.U7x):boolean");
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
        DbS.A1a(this, docAuthManager, this.A08, A0B, 0);
    }

    public final void EQS(int i) {
        if (this.A00 != 0) {
            C380369Xs r1 = this.A02;
            if (r1 == null) {
                0qQ.A0F("cameraPreview");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r1.post(new C20146Wm6(this, i));
            }
        }
    }

    public final void EeV(C3497181l r4) {
        DbS.A1a(this, r4, this.A09, A0B, 1);
    }

    public static final boolean A01(U7x u7x) {
        AlertDialog.Builder negativeButton;
        W5b w5b;
        if (02K.A00(u7x.requireContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        if (!u7x.A03) {
            if (!A0A.compareAndSet(true, false)) {
                if (u7x.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    negativeButton = new AlertDialog.Builder(u7x.requireContext()).setTitle(u7x.A06.A03).setMessage(u7x.A06.A02).setPositiveButton(u7x.A06.A01, new W5U(u7x, 1)).setNegativeButton(u7x.A06.A00, (DialogInterface.OnClickListener) null);
                    w5b = new W5b(u7x, 0);
                } else if (u7x.A04) {
                    negativeButton = new AlertDialog.Builder(u7x.requireContext()).setTitle(u7x.A06.A07).setMessage(u7x.A06.A06).setPositiveButton(u7x.A06.A05, new SVE(u7x, 3)).setNegativeButton(u7x.A06.A04, (DialogInterface.OnClickListener) null);
                    w5b = new W5b(u7x, 1);
                }
                AnonymousClass0fN.A00(negativeButton.setOnDismissListener(w5b).create());
                u7x.A03 = true;
            }
            u7x.A07.A02("android.permission.CAMERA");
            return false;
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1629385730);
        C380369Xs r1 = new C380369Xs(requireActivity());
        this.A02 = r1;
        AnonymousClass0fD.A09(439777174, A022);
        return r1;
    }

    public final void onPause() {
        int i;
        int A022 = AnonymousClass0fD.A02(-1779128419);
        U7x.super.onPause();
        if (this.A00 == 0) {
            i = -1611750824;
        } else {
            C380369Xs r0 = this.A02;
            if (r0 == null) {
                0qQ.A0F("cameraPreview");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A03();
                i = 198263183;
            }
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1984178723);
        U7x.super.onResume();
        A02(this);
        C380369Xs r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("cameraPreview");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A0D = false;
        if (r1.isAvailable()) {
            C380369Xs.A02(r1);
        }
        AnonymousClass0fD.A09(629408800, A022);
    }
}
