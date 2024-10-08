package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.3yy  reason: invalid class name and case insensitive filesystem */
public final class C258413yy implements AnonymousClass3YT {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v4, types: [com.instagram.api.schemas.OnFeedMessagesIntf] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f3, code lost:
        if (X.182.A06(r2, r10, 36328486951992694L) == false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
        r1 = r4.size();
        r0 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a8, code lost:
        if (r1.A0C.Aj8() != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        if (X.1sx.A0N(r11, r13) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence Bqi(android.content.Context r9, com.instagram.common.session.UserSession r10, X.1Xj r11, X.AnonymousClass4DU r12, X.AnonymousClass3W1 r13) {
        /*
            r8 = this;
            r3 = 0
            X.0qQ.A0B(r9, r3)
            r0 = 1
            X.0qQ.A0B(r10, r0)
            r6 = 2
            X.0qQ.A0B(r12, r6)
            r0 = 3
            X.0qQ.A0B(r11, r0)
            r0 = 4
            X.0qQ.A0B(r13, r0)
            X.5Ex r1 = X.C282835Ex.A00
            boolean r0 = r1.A05(r10, r11, r12)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r12.getModuleName()
            boolean r0 = r1.A06(r10, r11, r0)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r13.A1j
            if (r0 == 0) goto L_0x0030
            boolean r0 = r1.A03(r10, r11, r12)
            if (r0 != 0) goto L_0x0036
        L_0x0030:
            boolean r0 = r1.A04(r10, r11, r12)
            if (r0 == 0) goto L_0x003b
        L_0x0036:
            java.lang.String r4 = r11.A2l()
        L_0x003a:
            return r4
        L_0x003b:
            X.1Xy r0 = r11.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x005a
            java.lang.Boolean r1 = r0.Bua()
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005a
            r0 = 2131961829(0x7f1327e5, float:1.9560366E38)
        L_0x0055:
            java.lang.String r4 = r9.getString(r0)
            return r4
        L_0x005a:
            r5 = 0
            X.AnonymousClass47K.A02(r9, r10, r11, r3, r3)
            boolean r0 = r11.A5n()
            if (r0 != 0) goto L_0x0067
            r11.A5e()
        L_0x0067:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325768237692109(0x810e18000034cd, double:3.0359003334200095E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0111
            r1 = r11
            java.util.EnumSet r0 = X.1sx.A01
            boolean r0 = r11.A5D()
            r7 = 0
            if (r0 == 0) goto L_0x009e
            X.1Xy r0 = r11.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x009e
            X.1Xy r0 = r11.A0C
            java.util.List r4 = r0.Alu()
            if (r4 == 0) goto L_0x010f
            int r0 = r13.A02
            if (r0 < 0) goto L_0x010f
            int r1 = r4.size()
            int r0 = r13.A02
            if (r1 <= r0) goto L_0x010f
            java.lang.Object r1 = r4.get(r0)
        L_0x009e:
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0118
            X.1Xy r0 = r1.A0C
            X.TjP r0 = r0.Aj8()
            if (r0 == 0) goto L_0x0118
        L_0x00aa:
            boolean r0 = r11.A5D()
            r4 = 0
            if (r0 == 0) goto L_0x00c9
            X.1Xy r0 = r11.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x00c9
            X.1Xy r0 = r11.A0C
            java.util.List r1 = r0.Alu()
            if (r1 == 0) goto L_0x010d
            int r0 = r13.A02
            java.lang.Object r11 = r1.get(r0)
            X.1Xj r11 = (X.1Xj) r11
        L_0x00c9:
            boolean r0 = X.1sx.A0N(r11, r13)
            if (r0 == 0) goto L_0x0148
            if (r11 == 0) goto L_0x003a
            X.1Xy r0 = r11.A0C
            X.TjP r0 = r0.Aj8()
            if (r0 == 0) goto L_0x014a
            java.lang.String r0 = r0.B7k()
            if (r0 == 0) goto L_0x014a
            r0 = 36322929264306866(0x810b8300002ab2, double:3.0341049552195536E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x014a
            X.1Xy r0 = r11.A0C
            X.TjP r0 = r0.Aj8()
            if (r0 == 0) goto L_0x00f6
            java.lang.String r5 = r0.B7k()
        L_0x00f6:
            r2 = 32
            java.lang.String r1 = "•"
            X.1Xy r0 = r11.A0C
            java.util.List r0 = r0.BMp()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r4 = X.00k.A0O(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
        L_0x0108:
            java.lang.String r4 = X.002.A0j(r5, r1, r4, r2, r2)
            return r4
        L_0x010d:
            r11 = r5
            goto L_0x00c9
        L_0x010f:
            r1 = r7
            goto L_0x009e
        L_0x0111:
            boolean r0 = X.1sx.A0N(r11, r13)
            if (r0 == 0) goto L_0x0118
            goto L_0x00aa
        L_0x0118:
            boolean r0 = X.C247643gg.A06(r10, r11)
            r4 = 0
            if (r0 == 0) goto L_0x0152
            r0 = 36604361291469867(0x820b790002142b, double:3.212083702433249E-306)
            long r0 = X.182.A01(r2, r10, r0)
            int r7 = (int) r0
            if (r7 != r6) goto L_0x0152
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = r11.A1H()
            if (r0 == 0) goto L_0x0135
            com.instagram.api.schemas.OnFeedMessagesIntf r5 = r0.BTY()
        L_0x0135:
            int r1 = X.AnonymousClass3ZO.A00(r5)
            r0 = 1
            if (r1 != r0) goto L_0x0141
            r0 = 2131966283(0x7f13394b, float:1.95694E38)
            goto L_0x0055
        L_0x0141:
            if (r1 != r6) goto L_0x0152
            r0 = 2131976852(0x7f136294, float:1.9590836E38)
            goto L_0x0055
        L_0x0148:
            if (r11 == 0) goto L_0x003a
        L_0x014a:
            X.1Xy r0 = r11.A0C
            java.util.List r0 = r0.BMp()
            goto L_0x0209
        L_0x0152:
            boolean r0 = X.C247643gg.A09(r10, r11)
            if (r0 != 0) goto L_0x0186
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r10, r11)
            if (r0 == 0) goto L_0x0195
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BTY()
        L_0x0162:
            int r0 = X.AnonymousClass3ZO.A00(r0)
            if (r0 != r6) goto L_0x0197
            boolean r0 = r11.A5n()
            if (r0 != 0) goto L_0x0197
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r10, r11)
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = r0.BqY()
            if (r0 == 0) goto L_0x0197
            r0 = 36605645486626075(0x820ca40001151b, double:3.2128958326210735E-306)
            long r0 = X.182.A01(r2, r10, r0)
            int r5 = (int) r0
            if (r5 != r6) goto L_0x0197
        L_0x0186:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.C231122qu.A00(r10, r11)
            if (r0 == 0) goto L_0x0192
            java.lang.String r4 = r0.BqY()
            if (r4 != 0) goto L_0x003a
        L_0x0192:
            java.lang.String r4 = ""
            return r4
        L_0x0195:
            r0 = 0
            goto L_0x0162
        L_0x0197:
            X.5F3 r0 = new X.5F3
            r0.<init>(r10)
            boolean r0 = r0.A01(r11)
            if (r0 == 0) goto L_0x01d7
            X.5F3 r0 = new X.5F3
            r0.<init>(r10)
            boolean r0 = r0.A01(r11)
            if (r0 == 0) goto L_0x003a
            com.instagram.user.model.UpcomingEvent r5 = r11.A27(r10)
            if (r5 == 0) goto L_0x003a
            X.5F3 r0 = new X.5F3
            r0.<init>(r10)
            boolean r0 = r0.A00(r10, r11)
            if (r0 == 0) goto L_0x0212
            X.0nE r0 = X.C61410nE.A00
            X.Hq9 r4 = new X.Hq9
            r4.<init>(r9, r0)
            long r2 = X.C18810W3l.A01(r5)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            java.lang.Integer r0 = X.C18810W3l.A03(r5)
            java.lang.String r4 = r4.A00(r0, r1)
            return r4
        L_0x01d7:
            boolean r0 = X.C243213Xw.A06(r11)
            if (r0 == 0) goto L_0x0205
            r0 = 36328486951992694(0x81109100003d76, double:3.037619659291083E-306)
            boolean r5 = X.182.A06(r2, r10, r0)
            if (r5 == 0) goto L_0x0205
            boolean r3 = X.C243213Xw.A06(r11)
            if (r3 == 0) goto L_0x01f5
            boolean r1 = X.182.A06(r2, r10, r0)
            r0 = 1
            if (r1 != 0) goto L_0x01f6
        L_0x01f5:
            r0 = 0
        L_0x01f6:
            if (r0 == 0) goto L_0x003a
            X.1Xy r0 = r11.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x003a
            java.lang.String r4 = r0.BF3()
            return r4
        L_0x0205:
            java.util.List r0 = r8.Bqk(r11, r13)
        L_0x0209:
            if (r0 == 0) goto L_0x003a
            java.lang.Object r4 = X.00k.A0O(r0, r3)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0212:
            X.0nE r0 = X.C61410nE.A00
            X.Vkq r1 = X.C17116VIm.A00(r10, r0, r5)
            X.Uy1 r0 = X.Uy1.A07
            java.lang.String r4 = r1.A00(r9, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258413yy.Bqi(android.content.Context, com.instagram.common.session.UserSession, X.1Xj, X.4DU, X.3W1):java.lang.CharSequence");
    }

    public final List Bqk(1Xj r3, AnonymousClass3W1 r4) {
        List Alu;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        if (!r3.A5D() || r3.A0C.Alu() == null || ((Alu = r3.A0C.Alu()) != null && (r3 = (1Xj) Alu.get(r4.A02)) != null)) {
            return r3.A0C.BMp();
        }
        return null;
    }

    public final CharSequence C4o(Context context, UserSession userSession, 1Xj r4, AnonymousClass3W1 r5) {
        0qQ.A0B(context, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(userSession, 3);
        return 1sx.A06(context, userSession, r4, r5.A02);
    }

    public final boolean Et1(UserSession userSession, 1Xj r5, AnonymousClass3W1 r6) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        if (!1sx.A0N(r5, r6) || 182.A06(0Tu.A05, userSession, 36326257863964316L)) {
            return false;
        }
        return true;
    }

    public final boolean Et2(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass5F2 r0 = (AnonymousClass5F2) userSession.A01(AnonymousClass5F2.class, new C58178Ini(userSession, 33));
        return r0.A01.A00(r0.A00, r4);
    }

    public final boolean Et3(1Xj r2, AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r2, 0);
        return 1sx.A0Q(r2, i);
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean EtS() {
        return false;
    }

    public final /* synthetic */ String BSq(Context context, 1Xj r3, AnonymousClass3W1 r4) {
        return null;
    }
}
