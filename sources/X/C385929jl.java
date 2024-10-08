package X;

import android.widget.FrameLayout;
import com.instagram.common.gallery.Medium;
import java.io.File;

/* renamed from: X.9jl  reason: invalid class name and case insensitive filesystem */
public final class C385929jl extends 2Cn {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ C353498Hw A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ boolean A03;

    public final void onFail(Exception exc) {
        AnonymousClass8XA A002;
        Exception exc2 = exc;
        0qQ.A0B(exc, 0);
        File file = this.A02;
        String absolutePath = file.getAbsolutePath();
        C353498Hw r3 = this.A01;
        if (0qQ.A0K(absolutePath, r3.A0T)) {
            r3.A1h.A0H("photo import failed");
            AnonymousClass85M r1 = r3.A1d;
            FrameLayout frameLayout = r1.A00;
            if (frameLayout != null) {
                AnonymousClass7TG.A19(frameLayout, r1);
                r1.A00 = null;
                C353498Hw.A0m(r3);
            }
            AnonymousClass8WX r0 = r3.A0B;
            if (!(r0 == null || (A002 = r0.A00()) == null)) {
                A002.A0M(false);
            }
            String absolutePath2 = file.getAbsolutePath();
            0qQ.A07(absolutePath2);
            C353498Hw.A16(r3, exc2, absolutePath2, "photo import failed", false, false);
        }
    }

    public C385929jl(Medium medium, C353498Hw r2, File file, boolean z) {
        this.A01 = r2;
        this.A02 = file;
        this.A03 = z;
        this.A00 = medium;
    }

    public final void onFinish() {
        this.A01.A0f = false;
    }

    public final void onStart() {
        C353498Hw r1 = this.A01;
        r1.A0f = true;
        r1.A1h.A06(r1.A16, "photo", 0, false, r1.CVJ());
        AnonymousClass7TE.A0n(r1.A1D).A05(r1.A1t, "photo_transcoding_start");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0032, code lost:
        r1 = r5.A1d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r10) {
        /*
            r9 = this;
            X.7zv r10 = (X.C349307zv) r10
            r6 = 0
            X.0qQ.A0B(r10, r6)
            X.8Hw r5 = r9.A01
            X.8A2 r1 = r5.A1h
            java.lang.String r0 = "photo_import_success"
            r1.A0I(r0)
            com.instagram.common.session.UserSession r4 = r5.A1D
            X.29L r2 = X.AnonymousClass7TE.A0n(r4)
            X.50r r1 = r5.A1t
            java.lang.String r0 = "photo_transcoding_end"
            r2.A05(r1, r0)
            java.io.File r0 = r9.A02
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = r5.A0T
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x007f
            X.8IQ r0 = r5.A1k
            X.87s r2 = r0.A03
            X.4gw r0 = r2.A04
            if (r0 != 0) goto L_0x0041
            X.85M r1 = r5.A1d
            android.widget.FrameLayout r0 = r1.A00
            if (r0 == 0) goto L_0x0041
            X.AnonymousClass7TG.A19(r0, r1)
            r0 = 0
            r1.A00 = r0
            X.C353498Hw.A0m(r5)
        L_0x0041:
            boolean r0 = X.C353498Hw.A1V(r5)
            if (r0 != 0) goto L_0x0053
            android.view.View r7 = r5.A12
            X.AkF r3 = new X.AkF
            r3.<init>(r5)
            r0 = 500(0x1f4, double:2.47E-321)
            r7.postDelayed(r3, r0)
        L_0x0053:
            X.8Yz r3 = r5.A1F
            boolean r0 = r3.A0P()
            if (r0 == 0) goto L_0x0080
            X.8Gz r8 = r5.A0C
            if (r8 == 0) goto L_0x0080
            X.0Tu r7 = X.0Tu.A05
            r0 = 36327387440626064(0x810f9100043990, double:3.0369243238754496E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x0080
            X.C353498Hw.A0r(r5)
            r8.A00(r10)
            X.8WX r0 = r5.A0B
            if (r0 == 0) goto L_0x007f
            X.8XA r0 = r0.A00()
            if (r0 == 0) goto L_0x007f
            r0.A0M(r6)
        L_0x007f:
            return
        L_0x0080:
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x009e
            boolean r0 = r5.A1g()
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r5.CVJ()
            if (r0 != 0) goto L_0x00ad
            boolean r0 = X.C353498Hw.A1Z(r5)
            if (r0 != 0) goto L_0x00ad
            X.88B r0 = r5.A1x
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x00ad
        L_0x009e:
            X.80y r0 = X.C3495980z.A00(r4)
            r5.A0I = r0
            X.C353498Hw.A0R(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C353498Hw.A15(r5, r10, r0)
            return
        L_0x00ad:
            boolean r0 = X.C353498Hw.A1V(r5)
            if (r0 != 0) goto L_0x009e
            X.0eM r1 = r5.A25
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L_0x00ee
            X.8aL r0 = X.C358088aL.A0z
            boolean r0 = X.C357638Yz.A03(r0, r3)
            if (r0 == 0) goto L_0x00ce
            X.8Gz r0 = r5.A0C
            if (r0 == 0) goto L_0x00ce
            X.C353498Hw.A0r(r5)
            r0.A00(r10)
            return
        L_0x00ce:
            boolean r0 = r2.A0N()
            if (r0 == 0) goto L_0x00db
            X.C353498Hw.A0r(r5)
            X.C353498Hw.A13(r5, r10)
            return
        L_0x00db:
            java.lang.String r0 = r5.A0T
            if (r0 == 0) goto L_0x007f
            X.C353498Hw.A0r(r5)
            boolean r0 = X.C353498Hw.A1V(r5)
            if (r0 != 0) goto L_0x007f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C353498Hw.A14(r5, r10, r0)
            return
        L_0x00ee:
            java.lang.Object r4 = r1.getValue()
            if (r4 == 0) goto L_0x007f
            com.instagram.common.gallery.Medium r0 = r9.A00
            java.lang.String r3 = r0.A0X
            X.0qQ.A0B(r3, r6)
            r2 = 0
            r0 = 23
            X.MGl r1 = new X.MGl
            r1.<init>((java.lang.Object) r4, (java.lang.String) r3, (X.AnonymousClass4D7) r2, (int) r0)
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r3 = X.AnonymousClass2g9.A00(r0, r1)
            X.4DH r2 = r5.A1B
            r0 = 40
            X.MMv r1 = new X.MMv
            r1.<init>(r0, r10, r5)
            X.8Io r0 = new X.8Io
            r0.<init>(r1)
            r3.A06(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385929jl.onSuccess(java.lang.Object):void");
    }
}
