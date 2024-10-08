package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;

/* renamed from: X.2ik  reason: invalid class name and case insensitive filesystem */
public final class C227162ik implements C70992Zi {
    public int A00 = 0;
    public int A01 = 3;
    public Boolean A02;
    public boolean A03;
    public float A04;
    public final int A05;
    public final Activity A06;
    public final ViewGroup A07;
    public final Window A08;
    public final ViewGroup A09;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C227162ik r5, boolean r6) {
        /*
            int r1 = r5.A01
            r0 = 2
            if (r1 != r0) goto L_0x006d
            X.2MD r0 = X.2MD.A01()
            r0.A07()
        L_0x000c:
            int r0 = r5.A01
            r3 = 1024(0x400, float:1.435E-42)
            r2 = 1
            if (r0 != r2) goto L_0x0058
            android.view.Window r0 = r5.A08
            r0.addFlags(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x001c:
            r5.A02 = r0
        L_0x001e:
            android.view.Window r4 = r5.A08
            android.view.View r0 = r4.getDecorView()
            int r3 = r0.getSystemUiVisibility()
            int r1 = r5.A01
            if (r1 == r2) goto L_0x0045
            r0 = 2
            if (r1 == r0) goto L_0x0045
            r1 = r3 & -5
        L_0x0031:
            android.view.View r0 = r4.getDecorView()
            r0.setSystemUiVisibility(r1)
            r5.A01(r6)
            android.app.Activity r0 = r5.A06
            X.AnonymousClass2uJ.A06(r0, r6)
            int r0 = r5.A01
            r5.A00 = r0
            return
        L_0x0045:
            android.view.View r2 = r4.getDecorView()
            android.app.Activity r1 = r5.A06
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r1.getColor(r0)
            r2.setBackgroundColor(r0)
            r1 = r3 | 4
            goto L_0x0031
        L_0x0058:
            java.lang.Boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0062
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x001e
        L_0x0062:
            r1 = 0
            android.view.Window r0 = r5.A08
            r0.clearFlags(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x001c
        L_0x006d:
            r0 = 1
            if (r1 == r0) goto L_0x0073
            r0 = 3
            if (r1 != r0) goto L_0x000c
        L_0x0073:
            X.2MD r2 = X.2MD.A01()
            monitor-enter(r2)
            android.os.Handler r1 = r2.A04     // Catch:{ all -> 0x0084 }
            X.3M1 r0 = new X.3M1     // Catch:{ all -> 0x0084 }
            r0.<init>(r2)     // Catch:{ all -> 0x0084 }
            r1.post(r0)     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)
            goto L_0x000c
        L_0x0084:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227162ik.A00(X.2ik, boolean):void");
    }

    private void A01(boolean z) {
        if (this.A03) {
            if (this.A01 == 3) {
                2db.A06(this.A06, z);
            }
            if (this.A04 > 0.0f) {
                Activity activity = this.A06;
                C357628Yy.A01(activity, activity.getColor(R.color.fds_transparent));
            }
        }
        if (this.A01 == 3) {
            2db.A06(this.A06, z);
        }
    }

    public C227162ik(Activity activity, View view) {
        this.A06 = activity;
        Window window = activity.getWindow();
        window.getClass();
        this.A08 = window;
        this.A07 = (ViewGroup) activity.requireViewById(R.id.bottom_sheet_camera_container);
        this.A09 = (ViewGroup) activity.requireViewById(R.id.activity_and_camera_shared_views_main_container);
        this.A05 = activity.getColor(2Yu.A0H(activity, R.attr.igds_color_primary_background));
        C226112fe.A00(this.A06, new C227172il(view, this), false);
        0nA.A0p(view, new C227202io(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r10.A00 != r1) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:8:0x002e->B:10:0x0034, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DV0(X.C71162bE r11) {
        /*
            r10 = this;
            r0 = 1593736988(0x5efe7f1c, float:9.1692035E18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.2a4 r0 = r11.A04
            float r2 = r11.A01
            float r8 = r10.A04
            float r0 = r0.A01(r2)
            r10.A04 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 0
            r7 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            r4 = r1 ^ 1
            int r0 = (int) r2
            float r0 = (float) r0
            float r2 = r2 - r0
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            r9 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x0040
            android.view.ViewGroup r5 = r10.A09
            android.view.ViewGroup r2 = r10.A07
        L_0x002e:
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L_0x0047
            r1 = 0
            android.view.View r0 = r5.getChildAt(r1)
            r5.removeViewAt(r1)
            r2.addView(r0)
            goto L_0x002e
        L_0x0040:
            if (r9 == 0) goto L_0x0047
            android.view.ViewGroup r5 = r10.A07
            android.view.ViewGroup r2 = r10.A09
            goto L_0x002e
        L_0x0047:
            boolean r0 = r10.A03
            r2 = 3
            if (r0 == 0) goto L_0x0064
            r10.A01 = r2
            if (r9 != 0) goto L_0x0073
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
            float r0 = r10.A04
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
            r10.A01(r4)
        L_0x005d:
            r0 = 1561135136(0x5d0d0820, float:6.3515048E17)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0064:
            float r1 = r10.A04
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x007d
            r10.A01 = r7
            r1 = 1
        L_0x006f:
            int r0 = r10.A00
            if (r0 == r1) goto L_0x005d
        L_0x0073:
            boolean r0 = X.C226122ff.A03()
            if (r0 == 0) goto L_0x008a
            A00(r10, r4)
            goto L_0x005d
        L_0x007d:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0085
            r10.A01 = r2
            r1 = 3
            goto L_0x006f
        L_0x0085:
            r0 = 2
            r10.A01 = r0
            r1 = 2
            goto L_0x006f
        L_0x008a:
            X.37R r2 = new X.37R
            r2.<init>(r10, r4)
            android.app.Activity r1 = r10.A06
            X.2ff r0 = X.C226112fe.A0B
            r0.A05(r1, r2)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227162ik.DV0(X.2bE):void");
    }
}
