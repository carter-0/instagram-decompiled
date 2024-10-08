package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.VwU  reason: case insensitive filesystem */
public final class C18671VwU {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r3.equals(com.facebook.react.views.progressbar.ReactProgressBarViewManager.DEFAULT_STYLE) == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = X.002.A0R("Unknown ProgressBar style: ", r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.lang.String r3) {
        /*
            java.lang.String r1 = "ReactNative"
            r2 = 16842871(0x1010077, float:2.3693892E-38)
            if (r3 == 0) goto L_0x0069
            int r0 = r3.hashCode()
            switch(r0) {
                case -1955878649: goto L_0x0060;
                case -1414214583: goto L_0x0054;
                case -913872828: goto L_0x0048;
                case -670403824: goto L_0x003c;
                case -142408811: goto L_0x0030;
                case 73190171: goto L_0x0024;
                case 79996135: goto L_0x0018;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.String r0 = "Unknown ProgressBar style: "
            java.lang.String r0 = X.002.A0R(r0, r3)
        L_0x0014:
            X.0I1.A04(r1, r0)
        L_0x0017:
            return r2
        L_0x0018:
            java.lang.String r0 = "Small"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 16842873(0x1010079, float:2.3693897E-38)
            return r2
        L_0x0024:
            java.lang.String r0 = "Large"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 16842874(0x101007a, float:2.36939E-38)
            return r2
        L_0x0030:
            java.lang.String r0 = "LargeInverse"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 16843401(0x1010289, float:2.3695377E-38)
            return r2
        L_0x003c:
            java.lang.String r0 = "Inverse"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 16843399(0x1010287, float:2.369537E-38)
            return r2
        L_0x0048:
            java.lang.String r0 = "Horizontal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 16842872(0x1010078, float:2.3693894E-38)
            return r2
        L_0x0054:
            java.lang.String r0 = "SmallInverse"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x000e
            r2 = 16843400(0x1010288, float:2.3695374E-38)
            return r2
        L_0x0060:
            java.lang.String r0 = "Normal"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0017
            goto L_0x000e
        L_0x0069:
            java.lang.String r0 = "ProgressBar needs to have a style, null received"
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18671VwU.A00(java.lang.String):int");
    }

    public static final ProgressBar A01(Context context, int i) {
        ProgressBar progressBar;
        synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
            progressBar = new ProgressBar(context, (AttributeSet) null, i);
        }
        return progressBar;
    }
}
