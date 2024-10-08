package X;

import android.content.Context;
import com.facebook.onecamera.configurations.AppSpecific;
import com.facebook.onecamera.configurations.ArDelivery;
import com.facebook.onecamera.configurations.PostCaptureMediaPipeline;
import com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode;

/* renamed from: X.7qq  reason: invalid class name and case insensitive filesystem */
public final class C343807qq implements C343787qn {
    public final Class A00;

    public static C344207rU A00(Context context, C343657qa r5, C343787qn r6) {
        C343797qo r3 = C343797qo.A00;
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        return r3.A00(applicationContext, r5, new C343807qq(AppSpecific.class), r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cg3(X.C343837qt r7, X.C344297rd r8) {
        /*
            r6 = this;
            java.lang.Class r1 = r6.A00
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r0 = com.facebook.onecamera.configurations.AppSpecific.class
            boolean r0 = r0.equals(r1)
            r2 = 0
            if (r0 != 0) goto L_0x0068
            java.lang.Class<com.facebook.onecamera.configurations.ArDelivery> r0 = com.facebook.onecamera.configurations.ArDelivery.class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0051
            int[] r5 = new int[]{r2}
        L_0x0017:
            int r4 = r5.length
            r3 = 0
        L_0x0019:
            if (r3 >= r4) goto L_0x007f
            r1 = r5[r3]
            if (r1 == 0) goto L_0x0048
            r0 = 1
            if (r1 == r0) goto L_0x003f
            r0 = 2
            if (r1 == r0) goto L_0x0036
            r0 = 3
            if (r1 != r0) goto L_0x006b
            X.0qQ.A0B(r7, r2)
            X.7rt r0 = new X.7rt
            r0.<init>(r7)
        L_0x0030:
            r8.A00(r0)
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0036:
            X.0qQ.A0B(r7, r2)
            X.8os r0 = new X.8os
            r0.<init>(r7)
            goto L_0x0030
        L_0x003f:
            X.0qQ.A0B(r7, r2)
            X.7t1 r0 = new X.7t1
            r0.<init>(r7)
            goto L_0x0030
        L_0x0048:
            X.0qQ.A0B(r7, r2)
            X.AUF r0 = new X.AUF
            r0.<init>(r7)
            goto L_0x0030
        L_0x0051:
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureMediaPipeline> r0 = com.facebook.onecamera.configurations.PostCaptureMediaPipeline.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0068
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode> r0 = com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode.class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0080
            r0 = 3
            int[] r5 = new int[r0]
            r5 = {3, 2, 1} // fill-array
            goto L_0x0017
        L_0x0068:
            int[] r5 = new int[r2]
            goto L_0x0017
        L_0x006b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x007f:
            return
        L_0x0080:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "No qualified list for key %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343807qq.Cg3(X.7qt, X.7rd):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cg4(X.C343837qt r5, X.C345347tL r6) {
        /*
            r4 = this;
            java.lang.Class r3 = r4.A00
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r0 = com.facebook.onecamera.configurations.AppSpecific.class
            boolean r0 = r0.equals(r3)
            r2 = 0
            if (r0 != 0) goto L_0x004c
            java.lang.Class<com.facebook.onecamera.configurations.ArDelivery> r0 = com.facebook.onecamera.configurations.ArDelivery.class
            boolean r0 = r0.equals(r3)
            r1 = 1
            if (r0 == 0) goto L_0x0037
            int[] r1 = new int[]{r2}
        L_0x0018:
            int r0 = r1.length
            if (r2 >= r0) goto L_0x002d
            r1 = r1[r2]
            if (r1 == 0) goto L_0x002e
            r0 = 1
            if (r1 != r0) goto L_0x004f
            X.0qQ.A0B(r5, r2)
            X.9Sm r0 = new X.9Sm
            r0.<init>(r5)
        L_0x002a:
            r6.A00(r0)
        L_0x002d:
            return
        L_0x002e:
            X.0qQ.A0B(r5, r2)
            X.9dK r0 = new X.9dK
            r0.<init>(r5)
            goto L_0x002a
        L_0x0037:
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureMediaPipeline> r0 = com.facebook.onecamera.configurations.PostCaptureMediaPipeline.class
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x004c
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode> r0 = com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode.class
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0063
            int[] r1 = new int[]{r1}
            goto L_0x0018
        L_0x004c:
            int[] r1 = new int[r2]
            goto L_0x0018
        L_0x004f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0063:
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "No qualified list for key %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343807qq.Cg4(X.7qt, X.7tL):void");
    }

    public final void Cg5(C343837qt r3, C345427tT r4) {
        Class cls = this.A00;
        if (!AppSpecific.class.equals(cls) && !ArDelivery.class.equals(cls) && !PostCaptureMediaPipeline.class.equals(cls) && !PostCaptureStoriesVideoTranscode.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("No qualified list for key %s", new Object[]{cls}));
        }
    }

    public final void Cg6(C343837qt r6, C345457tW r7) {
        int[] iArr;
        C344277rb r0;
        Class cls = this.A00;
        if (AppSpecific.class.equals(cls) || ArDelivery.class.equals(cls) || PostCaptureMediaPipeline.class.equals(cls)) {
            iArr = new int[0];
        } else if (PostCaptureStoriesVideoTranscode.class.equals(cls)) {
            iArr = new int[]{1, 2, 0};
        } else {
            throw new IllegalArgumentException(String.format("No qualified list for key %s", new Object[]{cls}));
        }
        for (int i : iArr) {
            if (i == 0) {
                0qQ.A0B(r6, 0);
                r0 = new C366428ou(r6);
            } else if (i == 1) {
                0qQ.A0B(r6, 0);
                r0 = new C345477tY(r6);
            } else if (i == 2) {
                0qQ.A0B(r6, 0);
                r0 = new C379089Sl(r6);
            } else {
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i)}));
            }
            r7.A00(r0);
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.7r0, java.lang.Object] */
    public final void Cg7(C343837qt r8, C343887qy r9) {
        int[] iArr;
        C343917r1 r3;
        Class cls = this.A00;
        if (AppSpecific.class.equals(cls)) {
            iArr = new int[]{2, 1, 0};
        } else if (ArDelivery.class.equals(cls)) {
            iArr = new int[]{2, 4, 3};
        } else if (PostCaptureMediaPipeline.class.equals(cls)) {
            iArr = new int[0];
        } else if (PostCaptureStoriesVideoTranscode.class.equals(cls)) {
            iArr = new int[]{2, 1, 0};
        } else {
            throw new IllegalArgumentException(String.format("No qualified list for key %s", new Object[]{cls}));
        }
        for (int i : iArr) {
            if (i == 0) {
                r3 = C343977r7.A00.A01(r8);
            } else if (i == 1) {
                0qQ.A0B(r8, 0);
                r3 = new C343947r4(r8);
            } else if (i == 2) {
                0qQ.A0B(r8, 0);
                r3 = new C343897qz(r8);
            } else if (i == 3) {
                0qQ.A0B(r8, 0);
                r3 = new C368708tC(r8);
            } else if (i == 4) {
                0qQ.A0B(r8, 0);
                ? obj = new Object();
                obj.A00 = r8;
                r3 = obj;
            } else {
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i)}));
            }
            r9.A02.put(r3.BJv(), r3);
            r9.A01.add(r3);
        }
    }

    public C343807qq(Class cls) {
        this.A00 = cls;
    }
}
