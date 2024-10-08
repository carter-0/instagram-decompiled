package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.view.Window;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PRo  reason: case insensitive filesystem */
public final class C72981PRo implements C331117Pq {
    public C74467PvN A00;
    public C14044Tol A01;
    public boolean A02;
    public final Activity A03;
    public final C309556Ys A04;
    public final Context A05;
    public final UserSession A06;
    public final C70859OOq A07;

    public final void Dxx(C263754Nf r3) {
        C74467PvN pvN;
        0qQ.A0B(r3, 0);
        C74438Put put = (C74438Put) r3.A03;
        if (put != null && (pvN = this.A00) != null) {
            pvN.Dxu(put);
        }
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
        0qQ.A0B(list, 0);
        C74467PvN pvN = this.A00;
        if (pvN != null) {
            pvN.onCues(list);
        }
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r3) {
        0qQ.A0B(r3, 0);
        C74467PvN pvN = this.A00;
        if (pvN != null) {
            pvN.Dyg(r3.A00);
        }
    }

    public static final void A00(C72981PRo pRo) {
        Window window;
        if (pRo.A02) {
            Object obj = pRo.A03;
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    break;
                } else if (obj instanceof Activity) {
                    Activity activity = (Activity) obj;
                    if (activity != null && (window = activity.getWindow()) != null) {
                        window.clearFlags(8192);
                    }
                } else {
                    obj = ((ContextWrapper) obj).getBaseContext();
                }
            }
            pRo.A02 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        if (r0 != null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0123, code lost:
        if (r0.A0E() != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0125, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0128, code lost:
        if (r0 != null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012b, code lost:
        r0 = X.C69320NjL.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C74438Put r26, X.C242423Ua r27, X.C252323ov r28, java.lang.Boolean r29, java.lang.Integer r30, java.lang.String r31, int r32, boolean r33, boolean r34, boolean r35) {
        /*
            r25 = this;
            r6 = r26
            r21 = -1
            r3 = 1
            r2 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r13 = r31
            X.AnonymousClass7TF.A1E(r6, r2, r13)
            X.4Nf r1 = new X.4Nf
            r4 = r32
            r1.<init>((java.lang.Object) r6, (int) r4)
            r5 = r25
            if (r29 == 0) goto L_0x010e
            boolean r7 = r29.booleanValue()
        L_0x001c:
            r1.A00 = r7
        L_0x001e:
            X.Tol r14 = r5.A01
            if (r14 != 0) goto L_0x0031
            android.content.Context r7 = r5.A05
            com.instagram.common.session.UserSession r0 = r5.A06
            X.Tol r14 = new X.Tol
            r8 = r14
            r9 = r7
            r10 = r0
            r12 = r5
            r11 = r28
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x0031:
            boolean r10 = r6 instanceof X.N54
            if (r10 == 0) goto L_0x00ca
            r0 = r6
            X.N54 r0 = (X.N54) r0
            X.N2c r9 = r0.A02
            if (r9 == 0) goto L_0x0170
            java.lang.String r8 = r0.A05
            java.lang.Integer r0 = r0.A03
            int r7 = r0.intValue()
            if (r7 == r2) goto L_0x00c7
            if (r7 == r3) goto L_0x00c7
            r0 = 2
            if (r7 == r0) goto L_0x00c4
            r0 = 3
            if (r7 == r0) goto L_0x00c1
            r0 = 4
            if (r7 != r0) goto L_0x016b
            r7 = 0
        L_0x0052:
            r0 = 0
            X.3WR r16 = X.C70859OOq.A00(r9, r7, r8, r0, r2)
        L_0x0057:
            if (r10 == 0) goto L_0x00b4
            X.N54 r6 = (X.N54) r6
            X.N2c r0 = r6.A02
        L_0x005d:
            X.0qQ.A0A(r0)
        L_0x0060:
            r18 = 0
            r15 = r27
            r23 = r3
            r24 = r2
            r19 = r13
            r22 = r4
            r17 = r1
            r14.A09(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.A01 = r14
            X.6Ys r0 = r5.A04
            X.C66582MXn.A1K(r0)
            java.lang.String r1 = r16.A03()
            if (r1 == 0) goto L_0x0160
            java.lang.String r0 = "ContentProtection"
            boolean r0 = X.00l.A0d(r1, r0, r2)
            if (r0 != r3) goto L_0x0160
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x00ac
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            android.app.Activity r2 = r5.A03
        L_0x0090:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x012b
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00ad
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x012b
            android.view.Window r1 = r2.getWindow()
            if (r1 == 0) goto L_0x012e
            X.PUj r0 = new X.PUj
            r0.<init>(r1)
            r2.runOnUiThread(r0)
            r5.A02 = r3
        L_0x00ac:
            return
        L_0x00ad:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x0090
        L_0x00b4:
            boolean r0 = r6 instanceof X.N53
            if (r0 != 0) goto L_0x0060
            boolean r0 = r6 instanceof X.N52
            if (r0 == 0) goto L_0x0164
            X.N52 r6 = (X.N52) r6
            X.N2c r0 = r6.A00
            goto L_0x005d
        L_0x00c1:
            com.instagram.model.mediatype.ProductType r7 = com.instagram.model.mediatype.ProductType.SIDECAR
            goto L_0x0052
        L_0x00c4:
            com.instagram.model.mediatype.ProductType r7 = com.instagram.model.mediatype.ProductType.IGTV
            goto L_0x0052
        L_0x00c7:
            com.instagram.model.mediatype.ProductType r7 = com.instagram.model.mediatype.ProductType.FEED
            goto L_0x0052
        L_0x00ca:
            boolean r0 = r6 instanceof X.N53
            if (r0 == 0) goto L_0x00f9
            r0 = r6
            X.N53 r0 = (X.N53) r0
            java.lang.String r11 = r0.A02
            X.N2c r9 = r0.A01
            com.instagram.model.mediatype.ProductType r8 = com.instagram.model.mediatype.ProductType.FACEBOOK_VIDEO
            boolean r7 = r0.A06
            java.util.List r0 = r0.A05
            if (r30 != 0) goto L_0x00ec
            java.lang.Object r0 = X.00k.A0J(r0)
            X.QOp r0 = (X.C7607QOp) r0
            if (r0 != 0) goto L_0x00f6
            r0 = 0
        L_0x00e6:
            X.3WR r16 = X.C70859OOq.A00(r9, r8, r11, r0, r7)
            goto L_0x0057
        L_0x00ec:
            int r12 = r30.intValue()
            java.lang.Object r0 = r0.get(r12)
            X.QOp r0 = (X.C7607QOp) r0
        L_0x00f6:
            java.lang.String r0 = r0.A02
            goto L_0x00e6
        L_0x00f9:
            boolean r0 = r6 instanceof X.N52
            if (r0 == 0) goto L_0x0177
            r0 = r6
            X.N52 r0 = (X.N52) r0
            java.lang.String r8 = r0.A04
            X.N2c r7 = r0.A00
            X.0qQ.A0A(r7)
            r0 = 0
            X.3WR r16 = X.C70859OOq.A00(r7, r0, r8, r0, r2)
            goto L_0x0057
        L_0x010e:
            X.Tol r0 = r5.A01
            r7 = 0
            if (r0 != 0) goto L_0x011b
            if (r33 != 0) goto L_0x011b
            if (r34 == 0) goto L_0x011b
            r1.A00 = r2
            goto L_0x001e
        L_0x011b:
            if (r35 != 0) goto L_0x0128
            if (r0 == 0) goto L_0x0125
        L_0x011f:
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x001c
        L_0x0125:
            r7 = 1
            goto L_0x001c
        L_0x0128:
            if (r0 == 0) goto L_0x001c
            goto L_0x011f
        L_0x012b:
            X.NjL r0 = X.C69320NjL.ACTIVITY_NULL
            goto L_0x0130
        L_0x012e:
            X.NjL r0 = X.C69320NjL.WINDOW_NULL
        L_0x0130:
            r4.add(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r2 = r4.iterator()
        L_0x013b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0158
            java.lang.Object r1 = r2.next()
            X.NjL r1 = (X.C69320NjL) r1
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0152
            java.lang.String r0 = ","
            r3.append(r0)
        L_0x0152:
            java.lang.String r0 = r1.A00
            r3.append(r0)
            goto L_0x013b
        L_0x0158:
            java.lang.String r0 = r3.toString()
            X.0qQ.A07(r0)
            return
        L_0x0160:
            A00(r5)
            return
        L_0x0164:
            java.lang.String r0 = "Unsupported content type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x016b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0170:
            java.lang.String r0 = "Video source cannot be created for non-video content"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0177:
            java.lang.String r0 = "Unsupported content type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72981PRo.A01(X.Put, X.3Ua, X.3ov, java.lang.Boolean, java.lang.Integer, java.lang.String, int, boolean, boolean, boolean):void");
    }

    public final void DxV(C263754Nf r12) {
        boolean z;
        C309556Ys r8 = this.A04;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = r8.A01;
        if (j == -1 || SystemClock.elapsedRealtime() - j < r8.A00) {
            z = false;
        } else {
            r8.A02 += elapsedRealtime - j;
            z = true;
        }
        r8.A01 = elapsedRealtime;
        if (z && r8.A03 >= 2000) {
            C66582MXn.A1K(r8);
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        C74467PvN pvN = this.A00;
        if (pvN != null) {
            pvN.DaQ(i, i2);
        }
    }

    public C72981PRo(Activity activity, Context context, UserSession userSession, C70859OOq oOq) {
        this.A03 = activity;
        this.A05 = context;
        this.A06 = userSession;
        this.A07 = oOq;
        C309556Ys r2 = new C309556Ys();
        this.A04 = r2;
        r2.A00 = 120;
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }
}
