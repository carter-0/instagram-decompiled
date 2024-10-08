package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FAr  reason: case insensitive filesystem */
public final class C49870FAr {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r15 != X.AnonymousClass05K.A01) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r13.getBooleanQueryParameter("sharing_with_user", false) != true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.friendmap.configs.FriendMapLaunchConfig A01(android.net.Uri r13, com.instagram.common.session.UserSession r14, java.lang.Integer r15, boolean r16) {
        /*
            r12 = this;
            r2 = 0
            X.0qQ.A0B(r14, r2)
            r3 = 0
            if (r13 == 0) goto L_0x007b
            java.lang.String r0 = "location_sharing_user_id"
            java.lang.String r7 = r13.getQueryParameter(r0)
            java.lang.String r0 = "location_sharing_user_ids"
            java.lang.String r0 = r13.getQueryParameter(r0)
        L_0x0013:
            java.util.List r8 = A00(r0)
            r1 = 1
            if (r13 == 0) goto L_0x0023
            java.lang.String r0 = "sharing_with_user"
            boolean r0 = r13.getBooleanQueryParameter(r0, r2)
            r9 = 1
            if (r0 == r1) goto L_0x0024
        L_0x0023:
            r9 = 0
        L_0x0024:
            if (r7 == 0) goto L_0x0079
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321769627592455(0x810a7500442707, double:3.033371596291878E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x0079
            java.util.List r8 = X.AnonymousClass7TE.A1I(r7)
            r1 = r9 ^ 1
            r7 = r3
        L_0x003a:
            if (r13 == 0) goto L_0x0076
            java.lang.String r0 = "note_id"
            java.lang.String r5 = r13.getQueryParameter(r0)
            java.lang.String r0 = "note_ids"
            java.lang.String r6 = r13.getQueryParameter(r0)
        L_0x0048:
            if (r8 == 0) goto L_0x0063
            if (r13 == 0) goto L_0x0074
            java.lang.String r0 = "others_count"
            java.lang.String r0 = r13.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0074
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0074
            int r0 = r0.intValue()
        L_0x005e:
            com.instagram.friendmap.configs.AggregatedBannerConfig r3 = new com.instagram.friendmap.configs.AggregatedBannerConfig
            r3.<init>(r0, r1, r8)
        L_0x0063:
            r4 = r15
            if (r7 == 0) goto L_0x006b
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r10 = 1
            if (r15 == r0) goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            com.instagram.friendmap.configs.FriendMapLaunchConfig r2 = new com.instagram.friendmap.configs.FriendMapLaunchConfig
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L_0x0074:
            r0 = 0
            goto L_0x005e
        L_0x0076:
            r5 = r3
            r6 = r3
            goto L_0x0048
        L_0x0079:
            r1 = 1
            goto L_0x003a
        L_0x007b:
            r7 = r3
            r0 = r3
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49870FAr.A01(android.net.Uri, com.instagram.common.session.UserSession, java.lang.Integer, boolean):com.instagram.friendmap.configs.FriendMapLaunchConfig");
    }

    public static final List A00(String str) {
        List A0x;
        if (str == null || (A0x = DbX.A0x(str)) == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A0x);
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            A0r.add(new 11S("[\\[\\](){} ]").A00(AnonymousClass7TE.A18(it), ""));
        }
        return A0r;
    }
}
