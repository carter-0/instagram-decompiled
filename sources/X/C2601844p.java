package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.44p  reason: invalid class name and case insensitive filesystem */
public final class C2601844p extends GraphQLSubscriptionHandler {
    public final UserSession A00;

    public C2601844p(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        0qQ.A0B(str, 0);
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || str2 == null || !str2.equals(GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        if (r2.A00(X.AnonymousClass000.A00(376)) != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        X.C3018960m.A00();
        X.0qQ.A0B(r6, 0);
        r0 = new X.C50512Fcy(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        r0.Csg(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0044, code lost:
        X.2MD.A01().A09(new X.OU0(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRealtimeEventPayload(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            r0 = 2
            X.0qQ.A0B(r14, r0)
            X.0c5 r5 = X.0c9.A04     // Catch:{ IOException -> 0x0134 }
            com.instagram.common.session.UserSession r6 = r11.A00     // Catch:{ IOException -> 0x0134 }
            X.0c9 r0 = r5.A01(r6, r14)     // Catch:{ IOException -> 0x0134 }
            X.FBI r2 = X.C48997EnZ.parseFromJson(r0)     // Catch:{ IOException -> 0x0134 }
            X.0qQ.A0A(r2)     // Catch:{ IOException -> 0x0134 }
            X.F0b r0 = r2.A00     // Catch:{ IOException -> 0x0134 }
            com.instagram.user.model.User r0 = r0.A01     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r0.getId()     // Catch:{ IOException -> 0x0134 }
        L_0x001d:
            X.OIS r1 = X.OU0.A00(r0)     // Catch:{ IOException -> 0x0134 }
            X.F0b r3 = r2.A00     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = r3.A02     // Catch:{ IOException -> 0x0134 }
            r1.A0G = r0     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = r3.A05     // Catch:{ IOException -> 0x0134 }
            r1.A0E = r0     // Catch:{ IOException -> 0x0134 }
            com.instagram.user.model.User r0 = r3.A01     // Catch:{ IOException -> 0x0134 }
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()     // Catch:{ IOException -> 0x0134 }
            r1.A04 = r0     // Catch:{ IOException -> 0x0134 }
            X.F0b r4 = r2.A00     // Catch:{ IOException -> 0x0134 }
            java.lang.String r3 = r4.A02     // Catch:{ IOException -> 0x0134 }
            r1.A0D = r3     // Catch:{ IOException -> 0x0134 }
            com.instagram.common.notifications.push.intf.PushChannelType r0 = com.instagram.common.notifications.push.intf.PushChannelType.LOCAL     // Catch:{ IOException -> 0x0134 }
            r1.A03 = r0     // Catch:{ IOException -> 0x0134 }
            int r0 = r3.hashCode()     // Catch:{ IOException -> 0x0134 }
            switch(r0) {
                case -1895570309: goto L_0x0077;
                case -1649029848: goto L_0x00b1;
                case -962600302: goto L_0x0098;
                case 467344709: goto L_0x0052;
                case 2104451239: goto L_0x006a;
                default: goto L_0x0044;
            }     // Catch:{ IOException -> 0x0134 }
        L_0x0044:
            X.OU0 r2 = new X.OU0     // Catch:{ IOException -> 0x0134 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0134 }
            X.2MD r0 = X.2MD.A01()     // Catch:{ IOException -> 0x0134 }
            r0.A09(r2)     // Catch:{ IOException -> 0x0134 }
            goto L_0x011a
        L_0x0052:
            r0 = 5292(0x14ac, float:7.416E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0134 }
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0044
            X.1OP r0 = X.1OP.$redex_init_class     // Catch:{ IOException -> 0x0134 }
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ IOException -> 0x0134 }
            X.Fd0 r0 = new X.Fd0     // Catch:{ IOException -> 0x0134 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0134 }
            goto L_0x00ad
        L_0x006a:
            r0 = 1210(0x4ba, float:1.696E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0134 }
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x0134 }
            if (r0 != 0) goto L_0x008b
            goto L_0x0044
        L_0x0077:
            java.lang.String r0 = "clips_home"
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0044
            r0 = 376(0x178, float:5.27E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = r2.A00(r0)     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0044
        L_0x008b:
            X.C3018960m.A00()     // Catch:{ IOException -> 0x0134 }
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ IOException -> 0x0134 }
            X.Fcy r0 = new X.Fcy     // Catch:{ IOException -> 0x0134 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0134 }
            goto L_0x00ad
        L_0x0098:
            r0 = 1283(0x503, float:1.798E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0134 }
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0044
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ IOException -> 0x0134 }
            X.Fcz r0 = new X.Fcz     // Catch:{ IOException -> 0x0134 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0134 }
        L_0x00ad:
            r0.Csg(r1, r2)     // Catch:{ IOException -> 0x0134 }
            goto L_0x0044
        L_0x00b1:
            r0 = 1135(0x46f, float:1.59E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x0134 }
            boolean r0 = r3.equals(r0)     // Catch:{ IOException -> 0x0134 }
            if (r0 == 0) goto L_0x0044
            java.lang.String r3 = r4.A04     // Catch:{ IOException -> 0x0134 }
            X.0qQ.A07(r3)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = "com.instagram.social_impact.fundraiser"
            r4 = 0
            boolean r3 = X.00l.A0d(r3, r0, r4)     // Catch:{ IOException -> 0x0134 }
            r0 = 1
            if (r3 != r0) goto L_0x0044
            X.0qQ.A0B(r6, r4)     // Catch:{ IOException -> 0x0134 }
            java.lang.String r0 = "params"
            java.lang.String r0 = r2.A00(r0)     // Catch:{ IOException -> 0x012d }
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0121
            X.0c9 r0 = r5.A01(r6, r0)     // Catch:{ IOException -> 0x012d }
            java.util.HashMap r2 = X.F5I.A00(r0)     // Catch:{ IOException -> 0x012d }
            if (r2 == 0) goto L_0x011b
            java.lang.String r0 = "fundraiser_id"
            java.lang.Object r7 = r2.get(r0)     // Catch:{ IOException -> 0x012d }
            if (r7 == 0) goto L_0x0127
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x012d }
            java.lang.String r0 = "source_name"
            java.lang.Object r8 = r2.get(r0)     // Catch:{ IOException -> 0x012d }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x012d }
            r0 = 1834(0x72a, float:2.57E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x012d }
            java.lang.Object r9 = r2.get(r0)     // Catch:{ IOException -> 0x012d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x012d }
            r0 = 1832(0x728, float:2.567E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x012d }
            java.lang.Object r10 = r2.get(r0)     // Catch:{ IOException -> 0x012d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x012d }
            X.Fcs r5 = new X.Fcs     // Catch:{ IOException -> 0x012d }
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x012d }
            r1.A08 = r5     // Catch:{ IOException -> 0x012d }
            goto L_0x0044
        L_0x0116:
            java.lang.String r0 = ""
            goto L_0x001d
        L_0x011a:
            return
        L_0x011b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x012d }
            r0.<init>(r3)     // Catch:{ IOException -> 0x012d }
            goto L_0x012c
        L_0x0121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x012d }
            r0.<init>(r3)     // Catch:{ IOException -> 0x012d }
            goto L_0x012c
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x012d }
            r0.<init>(r3)     // Catch:{ IOException -> 0x012d }
        L_0x012c:
            throw r0     // Catch:{ IOException -> 0x012d }
        L_0x012d:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x0134 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0134 }
            throw r0     // Catch:{ IOException -> 0x0134 }
        L_0x0134:
            r2 = move-exception
            java.lang.String r1 = "error parsing feedback like event from skywalker"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2601844p.onRealtimeEventPayload(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
