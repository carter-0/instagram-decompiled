package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.A8z  reason: case insensitive filesystem */
public final class C39780A8z {
    public int A00 = 0;
    public final Context A01;
    public final UserSession A02;
    public final ADF A03;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r1.equals(r0) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r3.A05;
        r0 = X.AnonymousClass9QA.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        return X.AnonymousClass9TC.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r1.equals(r0) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r4 = this;
            X.ADF r3 = r4.A03
            java.lang.String r1 = r3.A06
            int r0 = r1.hashCode()
            r2 = 0
            switch(r0) {
                case -1941167627: goto L_0x000d;
                case -1705349612: goto L_0x001a;
                case -1173729015: goto L_0x001d;
                case 299265722: goto L_0x0020;
                case 693541831: goto L_0x0023;
                case 757331891: goto L_0x003d;
                case 822756427: goto L_0x0026;
                case 906220026: goto L_0x0029;
                case 1029649978: goto L_0x002c;
                case 1323106837: goto L_0x0040;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r2
        L_0x000d:
            java.lang.String r0 = "post_cap_direct"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            com.instagram.common.session.UserSession r1 = r3.A05
            X.80M r0 = X.AnonymousClass80M.A00
            goto L_0x0038
        L_0x001a:
            java.lang.String r0 = "igtv_share_stories"
            goto L_0x002e
        L_0x001d:
            java.lang.String r0 = "shoutout_share_stories"
            goto L_0x002e
        L_0x0020:
            java.lang.String r0 = "photo_credit_stories"
            goto L_0x002e
        L_0x0023:
            java.lang.String r0 = "post_cap_stories"
            goto L_0x002e
        L_0x0026:
            java.lang.String r0 = "mention_reshare_stories"
            goto L_0x002e
        L_0x0029:
            java.lang.String r0 = "reels_reshare_stories"
            goto L_0x002e
        L_0x002c:
            java.lang.String r0 = "reel_memory_share_stories"
        L_0x002e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            com.instagram.common.session.UserSession r1 = r3.A05
            X.9QA r0 = X.AnonymousClass9QA.A00
        L_0x0038:
            boolean r2 = X.AnonymousClass9TC.A00(r1, r0)
            return r2
        L_0x003d:
            java.lang.String r0 = "post_cap"
            goto L_0x0042
        L_0x0040:
            java.lang.String r0 = "post_cap_draft"
        L_0x0042:
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x004a
            return r2
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39780A8z.A00():boolean");
    }

    public C39780A8z(Context context, UserSession userSession, C388789oO r4, AnonymousClass9R7 r5, String str) {
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = new ADF(userSession, r4, r5, str);
    }
}
