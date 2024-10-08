package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.SCy  reason: case insensitive filesystem */
public abstract class C11164SCy {
    public static final C9934Rjn A00 = new Object();
    public static final List A01 = Arrays.asList(new Integer[]{20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101});
    public static final List A02;
    public static final Map A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2 < 20140701) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.content.Intent r6, android.os.Bundle r7, X.C10179Rnu r8) {
        /*
            r5 = 0
            if (r6 == 0) goto L_0x003e
            java.lang.String r1 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            r0 = 0
            int r2 = r6.getIntExtra(r1, r0)
            java.util.List r0 = A01
            boolean r0 = X.C66581MXm.A1W(r2, r0)
            if (r0 == 0) goto L_0x0018
            r1 = 20140701(0x133529d, float:3.293638E-38)
            r0 = 1
            if (r2 >= r1) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            android.os.Bundle r1 = r6.getBundleExtra(r0)
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = "action_id"
            java.lang.String r0 = r1.getString(r0)
        L_0x0029:
            if (r0 == 0) goto L_0x003e
            goto L_0x0035
        L_0x002c:
            r0 = r5
            goto L_0x0029
        L_0x002e:
            java.lang.String r0 = "com.facebook.platform.protocol.CALL_ID"
            java.lang.String r0 = r6.getStringExtra(r0)
            goto L_0x0029
        L_0x0035:
            java.util.UUID r5 = java.util.UUID.fromString(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            r0.toString()
        L_0x003e:
            if (r5 != 0) goto L_0x0042
            r3 = 0
        L_0x0041:
            return r3
        L_0x0042:
            android.content.Intent r3 = X.DbS.A09()
            java.lang.String r1 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            r0 = 0
            int r0 = r6.getIntExtra(r1, r0)
            r3.putExtra(r1, r0)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "action_id"
            r4.putString(r0, r1)
            if (r8 == 0) goto L_0x007e
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "error_description"
            r2.putString(r0, r1)
            java.lang.Integer r1 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0079
            java.lang.String r1 = "error_type"
            java.lang.String r0 = "UserCanceled"
            r2.putString(r1, r0)
        L_0x0079:
            java.lang.String r0 = "error"
            r4.putBundle(r0, r2)
        L_0x007e:
            java.lang.String r0 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            r3.putExtra(r0, r4)
            if (r7 == 0) goto L_0x0041
            java.lang.String r0 = "com.facebook.platform.protocol.RESULT_ARGS"
            r3.putExtra(r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11164SCy.A00(android.content.Intent, android.os.Bundle, X.Rnu):android.content.Intent");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Rjn] */
    static {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(A00);
        A1C.add(new Object());
        A02 = A1C;
        HashMap A1E = AnonymousClass7TE.A1E();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A1C2.add(new Object());
        A1E.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", A1C);
        A1E.put("com.facebook.platform.action.request.FEED_DIALOG", A1C);
        A1E.put("com.facebook.platform.action.request.LIKE_DIALOG", A1C);
        A1E.put("com.facebook.platform.action.request.APPINVITES_DIALOG", A1C);
        A1E.put("com.facebook.platform.action.request.MESSAGE_DIALOG", A1C2);
        A1E.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", A1C2);
        A03 = A1E;
    }
}
