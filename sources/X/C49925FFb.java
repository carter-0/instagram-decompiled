package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.FFb  reason: case insensitive filesystem */
public final class C49925FFb {
    public static final E66 A00(UserSession userSession, User user, C48088EVg eVg, C51889G6e g6e, JSONObject jSONObject, boolean z) {
        1YZ r0 = 1YZ.A02;
        if (r0 == null) {
            return null;
        }
        UserSession userSession2 = userSession;
        E66 A01 = ((F30) r0.A00.getValue()).A01(userSession2, user.Bh3(), eVg, user.getId(), user.getUsername(), jSONObject, false, z);
        A01.A03 = g6e;
        return A01;
    }

    public static final void A01(Context context, C3263576k r19, C69445Nlp nlp, 0wc r21, UserSession userSession, C331157Pu r23, C331127Pr r24, User user, G87 g87, C48088EVg eVg, C51889G6e g6e, String str, String str2, JSONObject jSONObject, boolean z) {
        UserSession userSession2 = userSession;
        182.A06(0Tu.A05, userSession2, 36321486155294136L);
        Context context2 = context;
        AnonymousClass37D A02 = AnonymousClass37D.A00.A02(context2);
        boolean z2 = z;
        JSONObject jSONObject2 = jSONObject;
        C331157Pu r9 = r23;
        C331127Pr r10 = r24;
        User user2 = user;
        C48088EVg eVg2 = eVg;
        if (DbT.A00(AnonymousClass7TE.A0q(userSession2), "restrict_info_bottomsheet_shown_count") >= 1) {
            String str3 = str2;
            String str4 = str;
            C3263576k r5 = r19;
            C69445Nlp nlp2 = nlp;
            0wc r7 = r21;
            G87 g872 = g87;
            if (r23 == null || z) {
                A02(context2, r5, nlp2, r7, userSession2, r9, r10, user2, g872, eVg2, str4, str3, jSONObject2);
            } else if (A02 != null) {
                DbU.A1U(new C50982FmV(context, r19, nlp, r21, userSession2, user2, g872, eVg2, str4, str3, jSONObject2), A02, A02);
            }
        } else {
            E66 A00 = A00(userSession2, user2, eVg2, g6e, jSONObject2, z2);
            if (A00 == null) {
                return;
            }
            if (r23 == null || r24 == null || A02 == null || !((AnonymousClass37F) A02).A0g) {
                C331127Pr A0W = DbS.A0W(userSession2);
                A0W.A0U = null;
                A0W.A00().A03(context2, A00);
                return;
            }
            r10.A0T = A00;
            r9.A0F(A00, r10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a7, code lost:
        r24 = X.1YZ.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        if (r24 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ab, code lost:
        r32 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00af, code lost:
        if ((r3 instanceof androidx.fragment.app.FragmentActivity) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b1, code lost:
        r15 = (androidx.fragment.app.FragmentActivity) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
        if (r15 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        r26 = X.AnonymousClass07i.A00(r15);
        r29 = r10.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00be, code lost:
        if (r13 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c0, code lost:
        r32 = r13.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c4, code lost:
        r24.A03(r3, r26, r7, new X.C51094FoO(r3, r15, r4, r5, r6, r7, r1, r10, r11, r12), r29, r30, r31, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x007b, code lost:
        r1.A0H(X.C50021FJg.A00(r11, r0), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r20, X.C3263576k r21, X.C69445Nlp r22, X.0wc r23, com.instagram.common.session.UserSession r24, X.C331157Pu r25, X.C331127Pr r26, com.instagram.user.model.User r27, X.G87 r28, X.C48088EVg r29, java.lang.String r30, java.lang.String r31, org.json.JSONObject r32) {
        /*
            r3 = r20
            X.8ab r1 = X.DbS.A0Y(r3)
            r0 = 2131972336(0x7f1350f0, float:1.9581677E38)
            r10 = r27
            java.lang.String r0 = X.DbY.A0b(r3, r10, r0)
            r1.A05 = r0
            r2 = 2131960862(0x7f13241e, float:1.9558405E38)
            r14 = 9
            X.FIh r0 = new X.FIh
            r4 = r21
            r5 = r22
            r6 = r23
            r12 = r29
            r13 = r0
            r15 = r10
            r16 = r5
            r17 = r4
            r18 = r12
            r19 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r1.A0I(r0, r2)
            r0 = 2131972333(0x7f1350ed, float:1.958167E38)
            X.FJ0 r2 = new X.FJ0
            r7 = r24
            r8 = r25
            r9 = r26
            r11 = r28
            r13 = r32
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A0G(r2, r0)
            r0 = 7
            X.C50036FJv.A00(r1, r11, r0)
            int r0 = r12.ordinal()
            switch(r0) {
                case 1: goto L_0x0083;
                case 2: goto L_0x006c;
                case 3: goto L_0x005c;
                case 4: goto L_0x0050;
                case 5: goto L_0x0094;
                case 6: goto L_0x0050;
                case 7: goto L_0x0050;
                case 8: goto L_0x0050;
                case 9: goto L_0x0094;
                case 10: goto L_0x0058;
                case 11: goto L_0x0058;
                case 12: goto L_0x0050;
                case 13: goto L_0x0094;
                case 14: goto L_0x0094;
                case 15: goto L_0x0094;
                default: goto L_0x0050;
            }
        L_0x0050:
            java.lang.String r1 = "restrict_error"
            java.lang.String r0 = "Entry point not supported for optimistic restrict flow."
            X.0wb.A03(r1, r0)
        L_0x0057:
            return
        L_0x0058:
            r2 = 2131972314(0x7f1350da, float:1.9581632E38)
            goto L_0x00a0
        L_0x005c:
            r2 = 2131972335(0x7f1350ef, float:1.9581675E38)
            java.lang.String r0 = r10.getUsername()
            X.DbY.A0w(r3, r1, r0, r2)
            r2 = 2131972331(0x7f1350eb, float:1.9581667E38)
            r0 = 56
            goto L_0x007b
        L_0x006c:
            r2 = 2131972329(0x7f1350e9, float:1.9581662E38)
            java.lang.String r0 = r10.getUsername()
            X.DbY.A0w(r3, r1, r0, r2)
            r2 = 2131972330(0x7f1350ea, float:1.9581665E38)
            r0 = 55
        L_0x007b:
            X.FJg r0 = X.C50021FJg.A00(r11, r0)
            r1.A0H(r0, r2)
            goto L_0x00a7
        L_0x0083:
            boolean r0 = X.C272094k5.A09(r7)
            if (r0 == 0) goto L_0x008d
            r2 = 2131972308(0x7f1350d4, float:1.958162E38)
            goto L_0x00a0
        L_0x008d:
            r0 = 2131972332(0x7f1350ec, float:1.9581669E38)
            r1.A08(r0)
            goto L_0x00a7
        L_0x0094:
            boolean r0 = X.C272094k5.A09(r7)
            r2 = 2131972334(0x7f1350ee, float:1.9581673E38)
            if (r0 == 0) goto L_0x00a0
            r2 = 2131972309(0x7f1350d5, float:1.9581622E38)
        L_0x00a0:
            java.lang.String r0 = r10.getUsername()
            X.DbY.A0w(r3, r1, r0, r2)
        L_0x00a7:
            X.1YZ r24 = X.1YZ.A02
            if (r24 == 0) goto L_0x0057
            boolean r0 = r3 instanceof androidx.fragment.app.FragmentActivity
            r32 = 0
            if (r0 == 0) goto L_0x0057
            r15 = r3
            androidx.fragment.app.FragmentActivity r15 = (androidx.fragment.app.FragmentActivity) r15
            if (r15 == 0) goto L_0x0057
            X.0gy r26 = X.AnonymousClass07i.A00(r15)
            java.lang.String r29 = r10.getId()
            if (r13 == 0) goto L_0x00c4
            java.lang.String r32 = r13.toString()
        L_0x00c4:
            X.FoO r13 = new X.FoO
            r14 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r1
            r21 = r10
            r22 = r11
            r23 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r25 = r3
            r27 = r7
            r28 = r13
            r24.A03(r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49925FFb.A02(android.content.Context, X.76k, X.Nlp, X.0wc, com.instagram.common.session.UserSession, X.7Pu, X.7Pr, com.instagram.user.model.User, X.G87, X.EVg, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
