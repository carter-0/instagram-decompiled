package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.42z  reason: invalid class name and case insensitive filesystem */
public final class C2597642z implements C2597342w {
    public final UserSession A00;

    public final void D8q(C254703su r15, DirectThreadKey directThreadKey, boolean z) {
        if (A00()) {
            UserSession userSession = this.A00;
            AnonymousClass0eM r0 = MZr.A00;
            DirectThreadKey directThreadKey2 = directThreadKey;
            if (182.A06(0Tu.A05, userSession, 36320360874123618L)) {
                MeP.A02(userSession, new C66886MeO(r15, directThreadKey2, AnonymousClass05K.A00, userSession.A06), (MeP) MZr.A00.getValue(), AnonymousClass05K.A0C);
                return;
            }
            AnonymousClass5HN r7 = AnonymousClass5HN.UNSEND_MESSAGE;
            String A0g = r15.A0g();
            if (A0g == null) {
                A0g = "";
            }
            O1Q.A00(userSession).A01(new C70723OHs(directThreadKey2, r7, A0g, (String) null, (String) null, r15.A1h, z, false));
        }
    }

    public final void D8r(DirectThreadKey directThreadKey, Long l, String str, boolean z) {
        if (A00()) {
            UserSession userSession = this.A00;
            AnonymousClass0eM r0 = MZr.A00;
            String str2 = null;
            DirectThreadKey directThreadKey2 = directThreadKey;
            String str3 = str;
            if (182.A06(0Tu.A05, userSession, 36320360874123618L)) {
                MeP meP = (MeP) MZr.A00.getValue();
                String str4 = userSession.A06;
                Integer num = AnonymousClass05K.A00;
                if (l != null) {
                    str2 = l.toString();
                }
                MeP.A02(userSession, new C66886MeO(directThreadKey2, (Boolean) null, (Boolean) null, num, str3, str4, (String) null, str2), meP, AnonymousClass05K.A0C);
                return;
            }
            AnonymousClass5HN r7 = AnonymousClass5HN.UNSEND_MESSAGE;
            if (l != null) {
                str2 = l.toString();
            }
            O1Q.A00(userSession).A01(new C70723OHs(directThreadKey, r7, str3, (String) null, (String) null, str2, z, false));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D8s(X.C254703su r33, com.instagram.model.direct.DirectThreadKey r34, boolean r35) {
        /*
            r32 = this;
            r4 = 0
            r7 = 1
            r2 = r32
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x00a2
            r3 = r33
            X.7AG r0 = r3.A0Q
            if (r0 == 0) goto L_0x00a8
            java.lang.Integer r1 = r0.A02
        L_0x0012:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x00a2
            boolean r0 = r3.A2O
            if (r0 != 0) goto L_0x00a2
            com.instagram.common.session.UserSession r2 = r2.A00
            X.0eM r0 = X.MZr.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36320360874123618(0x81092d00042162, double:3.0324806949255904E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            r5 = r34
            if (r0 == 0) goto L_0x00c0
            X.46n r0 = r3.A0N
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.A09
            if (r0 != r7) goto L_0x00ab
            r0 = 36320360874647913(0x81092d000c2169, double:3.032480695257157E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x00ab
            X.46n r0 = r3.A0N
            r12 = 0
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = r0.A03
        L_0x0047:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            boolean r0 = X.0mp.A0A(r1)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = " "
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.00l.A0R(r1, r0, r4)
            java.util.Iterator r4 = r0.iterator()
        L_0x005f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r1 = r4.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.0mp.A0A(r0)
            if (r0 == 0) goto L_0x005f
            r12 = r1
        L_0x0073:
            java.lang.String r12 = (java.lang.String) r12
        L_0x0075:
            X.0eM r0 = X.MZr.A00
            java.lang.Object r7 = r0.getValue()
            X.MeP r7 = (X.MeP) r7
            java.lang.String r0 = r2.A06
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r9 = 0
            X.MeO r4 = new X.MeO
            r4.<init>(r3, r5, r6, r0)
            java.lang.String r11 = r3.A1u
            X.0qQ.A07(r11)
            long r0 = r3.C7c()
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            X.46u r8 = new X.46u
            r13 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            X.OBu r0 = new X.OBu
            r0.<init>(r8, r4)
            X.MeP.A03(r2, r0, r7, r6)
        L_0x00a2:
            return
        L_0x00a3:
            java.lang.String r12 = "❤️"
            goto L_0x0075
        L_0x00a6:
            r0 = r12
            goto L_0x0047
        L_0x00a8:
            r1 = 0
            goto L_0x0012
        L_0x00ab:
            X.0eM r0 = X.MZr.A00
            java.lang.Object r6 = r0.getValue()
            X.MeP r6 = (X.MeP) r6
            java.lang.String r4 = r2.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.MeO r0 = new X.MeO
            r0.<init>(r3, r5, r1, r4)
            X.MeP.A02(r2, r0, r6, r1)
            return
        L_0x00c0:
            X.2FW r1 = r3.A10
            X.O1T r0 = X.O1T.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0183
            r0 = 22
            if (r1 != r0) goto L_0x017f
            X.7Q3 r0 = r3.A0O()
            if (r0 == 0) goto L_0x017f
            int r1 = r0.ordinal()
            r0 = 5
            if (r1 != r0) goto L_0x017f
            X.5HN r25 = X.AnonymousClass5HN.IG_STORY_REPLY
        L_0x00de:
            java.lang.String r26 = r3.A0h()
            java.lang.String r8 = r3.A1u
            r9 = 3
            r1 = 57
            android.content.Context r11 = X.C60960kU.A00
            X.0qQ.A07(r11)
            X.O1S r0 = X.O1S.$redex_init_class
            int r10 = r25.ordinal()
            r12 = 0
            if (r10 == r7) goto L_0x0126
            r0 = 4
            if (r10 != r0) goto L_0x0107
            java.lang.Object r1 = r3.A1T
            r0 = 170(0xaa, float:2.38E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.7FN r1 = (X.AnonymousClass7FN) r1
            java.lang.String r12 = r1.A0A
        L_0x0107:
            boolean r4 = r3.A2P
            java.lang.String r0 = r3.A1h
            X.OHs r1 = new X.OHs
            r30 = r35
            r24 = r5
            r27 = r8
            r28 = r12
            r29 = r0
            r31 = r4
            r23 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            X.OMX r0 = X.O1Q.A00(r2)
            r0.A01(r1)
            return
        L_0x0126:
            boolean r0 = r3.A2P
            if (r0 == 0) goto L_0x0132
            r0 = 2131959863(0x7f132037, float:1.9556378E38)
        L_0x012d:
            java.lang.String r12 = r11.getString(r0)
            goto L_0x0107
        L_0x0132:
            X.2FW r0 = r3.A10
            int r0 = r0.ordinal()
            if (r0 == r9) goto L_0x0173
            if (r0 == r1) goto L_0x0107
            r0 = 36324724560965923(0x810d2500053123, double:3.0352403080558207E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0177
            r13 = -1
            X.Mhg r10 = new X.Mhg
            r14 = r13
            r15 = r13
            r16 = r13
            r18 = r13
            r19 = r7
            r21 = r4
            r22 = r7
            r23 = r4
            r24 = r4
            r20 = r4
            r17 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r0 = r3.A1T
            X.0qQ.A0C(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            android.text.Editable r0 = r10.A00(r0)
            java.lang.String r12 = r0.toString()
            goto L_0x0107
        L_0x0173:
            r0 = 2131959882(0x7f13204a, float:1.9556417E38)
            goto L_0x012d
        L_0x0177:
            java.lang.Object r12 = r3.A1T
            X.0qQ.A0C(r12, r1)
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x0107
        L_0x017f:
            X.5HN r25 = X.AnonymousClass5HN.UNKNOWN
            goto L_0x00de
        L_0x0183:
            X.5HN r25 = X.AnonymousClass5HN.TEXT_MESSAGE
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2597642z.D8s(X.3su, com.instagram.model.direct.DirectThreadKey, boolean):void");
    }

    public final void Dq6(AnonymousClass651 r1) {
    }

    private final boolean A00() {
        if (AnonymousClass5HM.A01(this.A00)) {
            if (System.currentTimeMillis() - 0xn.A01("direct_sync_notification_preferences").getLong("account_switch_timestamp", 0) <= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C2597642z(UserSession userSession) {
        this.A00 = userSession;
    }
}
