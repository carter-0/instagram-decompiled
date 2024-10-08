package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.facebook.common.hiddenapis2.ApiExemption;
import com.facebook.fixie.fixes.common.MediaSessionANRFixer$1;

/* renamed from: X.4ba  reason: invalid class name and case insensitive filesystem */
public final class C267454ba extends 0D3 {
    public static final boolean A06;
    public static final boolean A07;
    public final Application.ActivityLifecycleCallbacks A00 = new MediaSessionANRFixer$1(this);
    public final Context A01;
    public final Handler A02;
    public final 0HX A03;
    public final 0Lp A04 = new C289655dz(this);
    public final boolean A05;

    public final String getName() {
        return "MediaSessionANRFixer";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ("motorola".equals(r1) != false) goto L_0x0014;
     */
    static {
        /*
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r0 = "lenovo"
            boolean r0 = r0.equals(r1)
            r2 = 0
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "motorola"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            A07 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x001e
            r2 = 1
        L_0x001e:
            A06 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267454ba.<clinit>():void");
    }

    public final void CMP() {
        0HX r3;
        Application application;
        if (this.A05 && (r3 = this.A03) != null) {
            if (!ApiExemption.removeRestriction_DO_NOT_USE()) {
                A09("Hidden apis are not accessible");
                return;
            }
            0HT.A03(this.A04);
            if (((Boolean) SSI.A04.get()).booleanValue()) {
                SSI.A01();
                Activity A002 = SSI.A00();
                if (A002 != null) {
                    r3.A01(A002, 0HC.A00(), false);
                }
            }
            Context context = this.A01;
            if (((context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) && (application = (Application) context) != null) {
                application.registerActivityLifecycleCallbacks(this.A00);
            }
            A08();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36314115994028466L) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C267454ba(X.AnonymousClass0Rt r5) {
        /*
            r4 = this;
            r4.<init>(r5)
            com.facebook.fixie.fixes.common.MediaSessionANRFixer$1 r0 = new com.facebook.fixie.fixes.common.MediaSessionANRFixer$1
            r0.<init>(r4)
            r4.A00 = r0
            X.5dz r0 = new X.5dz
            r0.<init>(r4)
            r4.A04 = r0
            r0 = r5
            X.0I0 r0 = (X.AnonymousClass0I0) r0
            android.content.Context r0 = r0.A01
            r4.A01 = r0
            java.lang.Class<X.0hI> r0 = X.AnonymousClass0hI.class
            X.0Rt r1 = r4.A05(r0)
            X.0hI r1 = (X.AnonymousClass0hI) r1
            boolean r0 = A07
            if (r0 == 0) goto L_0x003d
            boolean r0 = A06
            if (r0 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x003d
            com.instagram.common.session.UserSession r3 = r1.A00
            r3.getClass()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314115994028466(0x81037f002809b2, double:3.0285314076073025E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            r4.A05 = r1
            android.os.Handler r0 = r5.Ael()
            r4.A02 = r0
            if (r1 == 0) goto L_0x0056
            java.lang.String r3 = "media_session"
            java.lang.String r2 = "mService"
            java.lang.String r1 = "android.media.session.ISessionManager"
            X.0HX r0 = new X.0HX
            r0.<init>(r3, r2, r1)
        L_0x0053:
            r4.A03 = r0
            return
        L_0x0056:
            r0 = 0
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267454ba.<init>(X.0Rt):void");
    }
}
