package X;

import android.content.Context;

public abstract class AAI {
    public static C344207rU A00(Context context, C343647qZ r3) {
        C344207rU A01 = A01(context, new C343657qa(r3));
        0qQ.A0B(A01, 0);
        return A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C344207rU A01(android.content.Context r4, X.C343657qa r5) {
        /*
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode> r2 = com.facebook.onecamera.configurations.PostCaptureStoriesVideoTranscode.class
            r3 = 0
            java.lang.Class<com.facebook.onecamera.configurations.AppSpecific> r0 = com.facebook.onecamera.configurations.AppSpecific.class
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0030
            java.lang.Class<com.facebook.onecamera.configurations.ArDelivery> r0 = com.facebook.onecamera.configurations.ArDelivery.class
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0033
            java.lang.Class<com.facebook.onecamera.configurations.PostCaptureMediaPipeline> r0 = com.facebook.onecamera.configurations.PostCaptureMediaPipeline.class
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0030
            boolean r0 = r2.equals(r2)
            if (r0 != 0) goto L_0x0033
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "No qualified list for key %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0030:
            int[] r1 = new int[r3]
            goto L_0x0037
        L_0x0033:
            int[] r1 = new int[]{r3}
        L_0x0037:
            int r0 = r1.length
            if (r0 <= 0) goto L_0x005d
            r0 = r1[r3]
            if (r0 != 0) goto L_0x004e
            X.7qo r1 = X.C343797qo.A00
            X.7qq r0 = new X.7qq
            r0.<init>(r2)
            X.7qn[] r0 = new X.C343787qn[]{r0}
            X.7rU r0 = r1.A00(r4, r5, r0)
            return r0
        L_0x004e:
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x005d:
            java.lang.String r1 = "CameraService not found! Missing configuration for "
            java.lang.String r0 = r2.getSimpleName()
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAI.A01(android.content.Context, X.7qa):X.7rU");
    }
}
