package X;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FZf  reason: case insensitive filesystem */
public final class C50348FZf implements AnonymousClass36P {
    public final int A00;
    public final Object A01;

    public static Object A00(C50348FZf fZf, Object obj) {
        0qQ.A0B(obj, 0);
        return fZf.A01;
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public C50348FZf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void CJ6(Intent intent) {
        switch (this.A00) {
            case 3:
                if (intent.getAction() != null) {
                    Uri A03 = 0cp.A03(intent.getAction());
                    if (A03.getScheme() == null) {
                        A03 = 0cp.A03(002.A0R("file://", intent.getAction()));
                    }
                    ((C71030OZh) this.A01).A01(A03);
                    return;
                }
                return;
            case 6:
                0qQ.A0B(intent, 0);
                String action = intent.getAction();
                if (action != null) {
                    ((C49636Ezt) this.A01).A03.EhB(action);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
        FragmentActivity fragmentActivity;
        AnonymousClass0eM r0;
        switch (this.A00) {
            case 1:
                C61414K6l k6l = (C61414K6l) this.A01;
                if (k6l.getActivity() != null) {
                    fragmentActivity = k6l.requireActivity();
                    r0 = k6l.A09;
                    break;
                } else {
                    return;
                }
            case 2:
                C61415K6m k6m = (C61415K6m) this.A01;
                if (k6m.getActivity() != null) {
                    fragmentActivity = k6m.requireActivity();
                    r0 = k6m.A0C;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        DbX.A0N(fragmentActivity, r0).A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r0 = r0.getActivity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        X.FFa.A02(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ewk(java.io.File r2, int r3) {
        /*
            r1 = this;
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0038;
                case 2: goto L_0x0031;
                case 3: goto L_0x0005;
                case 4: goto L_0x0019;
                case 5: goto L_0x000d;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0020;
                case 10: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = A00(r1, r2)
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x0044
        L_0x000d:
            java.lang.Object r0 = A00(r1, r2)
            androidx.fragment.app.FragmentActivity r0 = X.DbZ.A0E(r0)
            X.DbS.A1X(r0)
            goto L_0x0044
        L_0x0019:
            java.lang.Object r0 = A00(r1, r2)
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x0044
        L_0x0020:
            java.lang.Object r0 = A00(r1, r2)
            X.35M r0 = (X.AnonymousClass35M) r0
            java.lang.ref.WeakReference r0 = r0.A04
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x0042
        L_0x0031:
            java.lang.Object r0 = A00(r1, r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            goto L_0x003e
        L_0x0038:
            java.lang.Object r0 = A00(r1, r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
        L_0x003e:
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
        L_0x0042:
            if (r0 == 0) goto L_0x0005
        L_0x0044:
            X.FFa.A02(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50348FZf.Ewk(java.io.File, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        X.0kR.A05(r0, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        X.AnonymousClass0b5.A00(r0, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        X.0kR.A07(r0, r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ExB(android.content.Intent r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 1: goto L_0x0028;
                case 2: goto L_0x0021;
                case 3: goto L_0x006b;
                case 4: goto L_0x0005;
                case 5: goto L_0x00ac;
                case 6: goto L_0x0057;
                case 7: goto L_0x004e;
                case 8: goto L_0x0038;
                case 9: goto L_0x0081;
                case 10: goto L_0x00a5;
                case 11: goto L_0x0097;
                case 12: goto L_0x0018;
                case 13: goto L_0x000f;
                case 14: goto L_0x002f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = A00(r2, r3)
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x000b:
            X.0kR.A07(r0, r3, r4)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = A00(r2, r3)
            X.LDK r0 = (X.LDK) r0
            X.4DH r0 = r0.A00
            goto L_0x0093
        L_0x0018:
            java.lang.Object r0 = A00(r2, r3)
            X.L8b r0 = (X.C63820L8b) r0
            X.4DH r0 = r0.A00
            goto L_0x0093
        L_0x0021:
            java.lang.Object r0 = A00(r2, r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            goto L_0x0093
        L_0x0028:
            java.lang.Object r0 = A00(r2, r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            goto L_0x0093
        L_0x002f:
            java.lang.Object r0 = A00(r2, r3)
            X.L7Q r0 = (X.L7Q) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A00
            goto L_0x000b
        L_0x0038:
            java.lang.Object r0 = r2.A01
            com.facebook.react.bridge.BaseJavaModule r0 = (com.facebook.react.bridge.BaseJavaModule) r0
            X.QZK r0 = r0.getReactApplicationContext()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            android.app.Activity r0 = r0.A00()
            if (r0 == 0) goto L_0x000e
            r0.startActivityForResult(r3, r4, r1)
            return
        L_0x004e:
            java.lang.Object r0 = A00(r2, r3)
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            goto L_0x000b
        L_0x0057:
            java.lang.Object r1 = A00(r2, r3)
            X.Ezt r1 = (X.C49636Ezt) r1
            android.content.Context r0 = r1.A01
            boolean r0 = X.C250563lf.A0o(r0, r3)
            if (r0 == 0) goto L_0x000e
            X.G80 r0 = r1.A03
            r0.Cfb(r3, r4)
            return
        L_0x006b:
            java.lang.Object r1 = r2.A01
            X.OZh r1 = (X.C71030OZh) r1
            android.content.Context r0 = r1.A09
            boolean r0 = X.C250563lf.A0o(r0, r3)
            if (r0 == 0) goto L_0x000e
            androidx.fragment.app.Fragment r0 = r1.A0A
            if (r0 != 0) goto L_0x0093
            android.app.Activity r0 = r1.A08
            r0.getClass()
            goto L_0x000b
        L_0x0081:
            java.lang.Object r0 = A00(r2, r3)
            X.35M r0 = (X.AnonymousClass35M) r0
            java.lang.ref.WeakReference r0 = r0.A03
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x000e
        L_0x0093:
            X.0kR.A05(r0, r3, r4)
            return
        L_0x0097:
            java.lang.Object r1 = A00(r2, r3)
            androidx.activity.ComponentActivity r1 = (androidx.activity.ComponentActivity) r1
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            r1.startActivityForResult(r3, r4, r0)
            return
        L_0x00a5:
            java.lang.Object r0 = A00(r2, r3)
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x00b4
        L_0x00ac:
            java.lang.Object r0 = A00(r2, r3)
            androidx.fragment.app.FragmentActivity r0 = X.DbZ.A0E(r0)
        L_0x00b4:
            X.AnonymousClass0b5.A00(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50348FZf.ExB(android.content.Intent, int):void");
    }
}
