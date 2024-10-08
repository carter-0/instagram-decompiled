package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;

/* renamed from: X.44m  reason: invalid class name and case insensitive filesystem */
public final class C2601544m extends GraphQLSubscriptionHandler {
    public final UserSession A00;

    public C2601544m(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(2:6|7)|(3:10|11|(2:13|14))|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRealtimeEventPayload(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 2
            X.0qQ.A0B(r9, r0)
            X.16F r0 = X.16P.A00(r9)     // Catch:{ IOException -> 0x0039 }
            X.CvF r2 = X.C44605Chd.parseFromJson(r0)     // Catch:{ IOException -> 0x0039 }
            if (r2 == 0) goto L_0x0056
            java.lang.String r1 = "success"
            java.lang.String r0 = r2.A03     // Catch:{ IOException -> 0x0039 }
            boolean r4 = r1.equals(r0)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r0 = r2.A02     // Catch:{ IOException -> 0x0039 }
            r3 = 0
            if (r0 == 0) goto L_0x001f
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x001f }
        L_0x001f:
            if (r4 != 0) goto L_0x0028
            java.lang.String r0 = r2.A01     // Catch:{ IOException -> 0x0039 }
            if (r0 == 0) goto L_0x0028
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0028 }
        L_0x0028:
            com.instagram.common.session.UserSession r0 = r6.A00     // Catch:{ IOException -> 0x0039 }
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r1 = r0.A06     // Catch:{ IOException -> 0x0039 }
            X.6un r0 = new X.6un     // Catch:{ IOException -> 0x0039 }
            r0.<init>(r1, r3, r4)     // Catch:{ IOException -> 0x0039 }
            r2.A00(r0)     // Catch:{ IOException -> 0x0039 }
            return
        L_0x0039:
            r5 = move-exception
            java.lang.Class<X.44m> r4 = X.C2601544m.class
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r9}
            java.lang.String r2 = "onRealtimeEventPayload exception"
            X.0I2 r1 = X.0KC.A01
            r0 = 5
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = r4.getSimpleName()
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r3)
            X.0KC.A0H(r1, r0, r5)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2601544m.onRealtimeEventPayload(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
