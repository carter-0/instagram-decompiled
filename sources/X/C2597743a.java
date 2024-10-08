package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.PresenceSubscriptionIDStore;

/* renamed from: X.43a  reason: invalid class name and case insensitive filesystem */
public final class C2597743a extends GraphQLSubscriptionHandler implements AnonymousClass0lh {
    public long A00 = 0;
    public final Context A01;
    public final 1a8 A02;
    public final UserSession A03;
    public final 27c A04;
    public final 27P A05;
    public final PresenceSubscriptionIDStore A06;

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r5.isEmpty() != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRealtimeEventPayload(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 598(0x256, float:8.38E-43)
            java.lang.String r3 = X.C66579MXk.A00(r0)
            X.16F r0 = X.16P.A00(r11)     // Catch:{ IOException -> 0x005f }
            X.A4N r6 = X.C39566A0i.parseFromJson(r0)     // Catch:{ IOException -> 0x005f }
            X.5lk r0 = r6.A00     // Catch:{ IOException -> 0x005f }
            if (r0 == 0) goto L_0x0076
            com.instagram.common.session.UserSession r7 = r8.A03     // Catch:{ IOException -> 0x005f }
            boolean r0 = X.C265504Uf.A01(r7)     // Catch:{ IOException -> 0x005f }
            if (r0 != 0) goto L_0x0027
            X.5lk r0 = r6.A00     // Catch:{ IOException -> 0x005f }
            if (r0 == 0) goto L_0x0055
            X.3mU r1 = X.C39567A0j.A00(r0)     // Catch:{ IOException -> 0x005f }
            X.27P r0 = r8.A05     // Catch:{ IOException -> 0x005f }
            r0.A02(r1)     // Catch:{ IOException -> 0x005f }
        L_0x0027:
            X.5lk r0 = r6.A00     // Catch:{ IOException -> 0x005f }
            java.util.List r5 = r0.A06     // Catch:{ IOException -> 0x005f }
            java.util.List r4 = r0.A05     // Catch:{ IOException -> 0x005f }
            r2 = 1
            if (r5 == 0) goto L_0x0037
            boolean r0 = r5.isEmpty()     // Catch:{ IOException -> 0x005f }
            r1 = 1
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r4 == 0) goto L_0x0041
            boolean r0 = r4.isEmpty()     // Catch:{ IOException -> 0x005f }
            if (r0 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r1 != 0) goto L_0x0046
            if (r2 == 0) goto L_0x0076
        L_0x0046:
            android.content.Context r0 = r8.A01     // Catch:{ IOException -> 0x005f }
            X.VFN.A00(r0, r7, r5, r4)     // Catch:{ IOException -> 0x005f }
            X.27c r1 = r8.A04     // Catch:{ IOException -> 0x005f }
            X.5lk r0 = r6.A00     // Catch:{ IOException -> 0x005f }
            boolean r0 = r0.A07     // Catch:{ IOException -> 0x005f }
            r1.A00(r5, r4, r0)     // Catch:{ IOException -> 0x005f }
            return
        L_0x0055:
            java.lang.String r0 = "presenceState"
            X.0qQ.A0F(r0)     // Catch:{ IOException -> 0x005f }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x005f }
            throw r0     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r11}
            java.lang.String r0 = "onRealtimeEventPayload exception"
            X.0KC.A0L(r3, r0, r2, r1)
            boolean r0 = r2 instanceof X.1bD
            if (r0 == 0) goto L_0x0076
            r0 = 2188(0x88c, float:3.066E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A06(r3, r0, r2)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2597743a.onRealtimeEventPayload(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void onSessionWillEnd() {
        if (C265504Uf.A01(this.A03)) {
            this.A02.A01();
        }
    }

    public C2597743a(Context context, 1a8 r4, UserSession userSession, 27c r6, 27P r7, PresenceSubscriptionIDStore presenceSubscriptionIDStore) {
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = presenceSubscriptionIDStore;
        this.A02 = r4;
        this.A03 = userSession;
        this.A01 = context;
    }
}
