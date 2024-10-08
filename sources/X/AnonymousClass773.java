package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.773  reason: invalid class name */
public final class AnonymousClass773 implements C3264476u {
    public static final AnonymousClass773 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (java.lang.Boolean.TRUE.equals(r3.A0c) == false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C328667Fr A02(android.content.Context r48, com.instagram.common.session.UserSession r49, X.AnonymousClass7FE r50, X.AnonymousClass9HC r51, X.AnonymousClass7LQ r52, X.C254873tC r53, boolean r54) {
        /*
            r12 = 0
            r7 = 1
            r0 = 2
            r3 = r53
            X.0qQ.A0B(r3, r0)
            r5 = r52
            X.3su r2 = r5.A0e
            X.0qQ.A0A(r2)
            X.0qQ.A0B(r2, r12)
            boolean r0 = r2.A1S()
            if (r0 != 0) goto L_0x001a
            X.2FW r0 = X.2FW.A0F
        L_0x001a:
            X.773 r14 = A00
            r6 = r49
            boolean r0 = X.C3255573c.A00(r6, r2)
            if (r0 == 0) goto L_0x0106
            java.util.List r8 = r2.A2B
            if (r8 == 0) goto L_0x0106
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0106
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318831866616300(0x8107c9001119ec, double:3.0315137444211435E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Object r4 = r8.get(r12)
            X.3tC r4 = (X.C254873tC) r4
            java.lang.String r1 = "[RF]"
            java.lang.String r0 = r4.A1N
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = ""
        L_0x0049:
            java.lang.String r0 = X.002.A0R(r1, r0)
            r4.A1N = r0
        L_0x004f:
            java.lang.Object r4 = r8.get(r12)
            X.3tC r4 = (X.C254873tC) r4
        L_0x0055:
            X.2FW r0 = r2.A10
            X.2FW r8 = X.2FW.A1v
            if (r0 != r8) goto L_0x0066
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r3.A0c
            boolean r0 = r1.equals(r0)
            r10 = 1
            if (r0 != 0) goto L_0x0067
        L_0x0066:
            r10 = 0
        L_0x0067:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r26 = r2.A0V()
            boolean r35 = X.C3266377o.A03(r6, r2)
            java.lang.String r0 = r2.A1u
            r28 = r0
            X.0qQ.A07(r28)
            com.instagram.user.model.User r0 = r5.A0K
            r15 = 0
            if (r0 == 0) goto L_0x0102
            java.lang.String r29 = r0.getUsername()
        L_0x007f:
            X.2FW r9 = r2.A10
            r49 = r48
            r48 = r51
            r1 = r49
            r0 = r48
            X.7FT r19 = X.AnonymousClass7FG.A00(r1, r6, r0, r5, r9)
            X.7SD r1 = r5.A0G
            X.3t3 r0 = r1.A0P
            r27 = r0
            int r0 = r1.A08
            r34 = r0
            int r1 = r3.A02
            r0 = 19
            if (r1 != r0) goto L_0x00e2
            java.util.List r47 = r3.A02()
            X.0qQ.A07(r47)
            java.lang.String r1 = r3.A11
            if (r1 != 0) goto L_0x00aa
            java.lang.String r1 = ""
        L_0x00aa:
            java.lang.String r9 = r3.A10
            java.lang.String r0 = r3.A1O
            X.774 r22 = new X.774
            r36 = r22
            r37 = r15
            r38 = r15
            r39 = r1
            r40 = r9
            r41 = r15
            r42 = r15
            r43 = r15
            r44 = r15
            r45 = r15
            r46 = r0
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
        L_0x00c9:
            java.lang.String r0 = r2.A1V
            r21 = r0
            java.lang.String r1 = r3.A1C
            if (r1 != 0) goto L_0x0189
            X.2FW r0 = r2.A10
            X.2FW r10 = X.2FW.A0y
            if (r0 != r10) goto L_0x01ef
            boolean r0 = r2.A1S()
            if (r0 == 0) goto L_0x0174
            java.lang.String r0 = r2.A1o
            if (r0 == 0) goto L_0x0174
            goto L_0x0109
        L_0x00e2:
            X.2FW r0 = r2.A0z
            if (r0 == 0) goto L_0x00f5
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r3.A0c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f5
            if (r10 != 0) goto L_0x00f5
            r22 = r15
            goto L_0x00c9
        L_0x00f5:
            r1 = r4
            if (r4 != 0) goto L_0x00f9
            r1 = r3
        L_0x00f9:
            r0 = r48
            X.0eM r0 = r0.A1C
            X.774 r22 = A01(r1, r0)
            goto L_0x00c9
        L_0x0102:
            r29 = r15
            goto L_0x007f
        L_0x0106:
            r4 = 0
            goto L_0x0055
        L_0x0109:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e3 }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x01e3 }
            java.lang.String r1 = "__typename"
            java.lang.String r0 = r9.optString(r1)     // Catch:{ JSONException -> 0x01e3 }
            int r11 = r0.hashCode()     // Catch:{ JSONException -> 0x01e3 }
            r0 = 221584371(0xd351bf3, float:5.5808574E-31)
            if (r11 == r0) goto L_0x0166
            java.lang.String r0 = r9.optString(r1)     // Catch:{ JSONException -> 0x01e3 }
            int r11 = r0.hashCode()     // Catch:{ JSONException -> 0x01e3 }
            r0 = 1959039784(0x74c49328, float:1.245941E32)
            if (r11 == r0) goto L_0x0161
            java.lang.String r0 = r9.optString(r1)     // Catch:{ JSONException -> 0x01e3 }
            int r11 = r0.hashCode()     // Catch:{ JSONException -> 0x01e3 }
            r0 = 1055290394(0x3ee6741a, float:0.45010453)
            if (r11 == r0) goto L_0x015e
            java.lang.String r0 = r9.optString(r1)     // Catch:{ JSONException -> 0x01e3 }
            int r8 = r0.hashCode()     // Catch:{ JSONException -> 0x01e3 }
            r0 = -1051647809(0xffffffffc15120bf, float:-13.070495)
            if (r8 == r0) goto L_0x0159
            java.lang.String r0 = r9.optString(r1)     // Catch:{ JSONException -> 0x01e3 }
            int r1 = r0.hashCode()     // Catch:{ JSONException -> 0x01e3 }
            r0 = -1075368948(0xffffffffbfe72c0c, float:-1.8060317)
            if (r1 == r0) goto L_0x0154
            java.lang.String r1 = r10.A00     // Catch:{ JSONException -> 0x01e3 }
            goto L_0x0189
        L_0x0154:
            X.2FW r0 = X.2FW.A1t     // Catch:{ JSONException -> 0x01e3 }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x01e3 }
            goto L_0x0189
        L_0x0159:
            X.2FW r0 = X.2FW.A1w     // Catch:{ JSONException -> 0x01e3 }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x01e3 }
            goto L_0x0189
        L_0x015e:
            java.lang.String r1 = r8.A00     // Catch:{ JSONException -> 0x01e3 }
            goto L_0x0189
        L_0x0161:
            X.2FW r0 = X.2FW.A1p     // Catch:{ JSONException -> 0x01e3 }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x01e3 }
            goto L_0x0189
        L_0x0166:
            java.lang.String r0 = r2.A1q     // Catch:{ JSONException -> 0x01e3 }
            if (r0 == 0) goto L_0x016f
            X.2FW r0 = X.2FW.A1y     // Catch:{ JSONException -> 0x01e3 }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x01e3 }
            goto L_0x0189
        L_0x016f:
            X.2FW r0 = X.2FW.A20     // Catch:{ JSONException -> 0x01e3 }
            java.lang.String r1 = r0.A00     // Catch:{ JSONException -> 0x01e3 }
            goto L_0x0189
        L_0x0174:
            java.lang.String r1 = r2.A0e()
            if (r1 == 0) goto L_0x01ef
            java.lang.String r0 = "cutout_"
            X.0qQ.A0B(r0, r7)
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x01ef
            X.2FW r0 = X.2FW.A0e
        L_0x0187:
            java.lang.String r1 = r0.A00
        L_0x0189:
            X.7AG r0 = r2.A0Q
            if (r0 == 0) goto L_0x018f
            java.lang.String r15 = r0.A05
        L_0x018f:
            boolean r8 = r2.A1S()
            X.7SD r0 = r5.A0G
            if (r8 == 0) goto L_0x021a
            X.3t3 r13 = r0.A0P
            int r11 = r0.A08
            java.lang.String r18 = r2.A0l()
            java.lang.String r8 = r6.A06
            java.lang.String r0 = r2.BsI()
            boolean r17 = X.0qQ.A0K(r8, r0)
            com.google.common.collect.ImmutableList r0 = r3.A01()
            if (r0 == 0) goto L_0x0218
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r16 = r0.iterator()
        L_0x01b8:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r10 = r16.next()
            r0 = r10
            X.9JN r0 = (X.AnonymousClass9JN) r0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x01df
            X.Nl2 r8 = X.C69420Nl2.A00(r0)
            X.0qQ.A07(r8)
            X.Nl2 r0 = X.C69420Nl2.A00(r18)
            X.0qQ.A07(r0)
            if (r8 != r0) goto L_0x01b8
            X.Nl2 r0 = X.C69420Nl2.MENTION
            if (r8 != r0) goto L_0x01b8
            if (r17 != 0) goto L_0x01b8
        L_0x01df:
            r9.add(r10)
            goto L_0x01b8
        L_0x01e3:
            r8 = move-exception
            java.lang.String r1 = "GenericXmaModelMapping"
            r0 = 230(0xe6, float:3.22E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0KC.A0G(r1, r0, r8)
        L_0x01ef:
            X.2FW r0 = r2.A10
            goto L_0x0187
        L_0x01f2:
            r0 = 10
            int r8 = X.0Yv.A1E(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Iterator r9 = r9.iterator()
        L_0x0201:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L_0x0222
            java.lang.Object r8 = r9.next()
            X.9JN r8 = (X.AnonymousClass9JN) r8
            X.0qQ.A0A(r8)
            X.9JN r8 = r14.A00(r8, r13, r11, r7)
            r0.add(r8)
            goto L_0x0201
        L_0x0218:
            r0 = 0
            goto L_0x0222
        L_0x021a:
            X.3t3 r8 = r0.A0P
            int r0 = r0.A08
            java.util.List r0 = A05(r3, r8, r0, r7)
        L_0x0222:
            boolean r37 = r2.A1R()
            X.7SD r5 = r5.A0G
            X.3Tu r5 = r5.A0H
            boolean r40 = X.C3263776n.A01(r6, r5, r2, r3)
            java.lang.String r5 = r2.A0e()
            r38 = 0
            if (r5 == 0) goto L_0x023f
            java.lang.String r6 = "cutout_"
            X.0qQ.A0B(r6, r7)
            boolean r38 = r5.startsWith(r6)
        L_0x023f:
            r18 = 0
            r20 = r50
            r42 = r54
            r23 = r2
            r24 = r3
            r25 = r4
            r30 = r21
            r31 = r1
            r32 = r15
            r33 = r0
            r36 = r7
            r39 = r12
            r41 = r12
            r17 = r49
            r21 = r48
            X.7Fr r0 = A04(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass773.A02(android.content.Context, com.instagram.common.session.UserSession, X.7FE, X.9HC, X.7LQ, X.3tC, boolean):X.7Fr");
    }

    public final C328667Fr A06(Context context, UserSession userSession, AnonymousClass7FE r94, AnonymousClass9HC r95, AnonymousClass774 r96, AnonymousClass7LQ r97, C254933tI r98, C254873tC r99, List list) {
        String str;
        String str2;
        AnonymousClass7LQ r1 = r97;
        C254703su r0 = r1.A0e;
        C254933tI r3 = r98;
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(r3.A0F, r0.A0g(), r0.A0f());
        UserSession userSession2 = userSession;
        boolean A04 = C3266377o.A04(userSession2, r3);
        String str3 = r3.A0U;
        0qQ.A07(str3);
        User user = r1.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        String A0h = r0.A0h();
        0qQ.A0C(A0h, "null cannot be cast to non-null type kotlin.String");
        String A0f = r0.A0f();
        String str4 = r3.A0T;
        if (str4 == null && (str4 = r3.A0R) == null) {
            throw new IllegalStateException("message_id and client_context are both null");
        }
        String str5 = r3.A0R;
        MessageIdentifier messageIdentifier = new MessageIdentifier(A0h, A0f);
        AnonymousClass7FR r14 = new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        ArrayList A0r = r0.A0r(AnonymousClass0t1.A01.A01(userSession2));
        2FW r12 = r0.A10;
        0qQ.A07(r12);
        boolean A0K = 0qQ.A0K(r3.A0U, userSession2.A06);
        MessageIdentifier messageIdentifier2 = new MessageIdentifier(str4, str5);
        C327627Bo A03 = r1.A03();
        0qQ.A07(A03);
        AnonymousClass7FT r16 = new AnonymousClass7FT((C61063Jw1) null, r14, A03, r12, messageIdentifier, messageIdentifier2, A0r, 0, true, false, false, A0K, false);
        AnonymousClass7SD r4 = r1.A0G;
        C254793t3 r10 = r4.A0P;
        int i = r4.A08;
        String str6 = r0.A1V;
        ImmutableList A01 = r3.A01();
        boolean z = false;
        if (A01 != null && !A01.isEmpty() && (str2 = ((C254873tC) A01.get(0)).A0u) != null && str2.startsWith("instagram://generated_sticker_action")) {
            z = true;
        }
        String str7 = C3266377o.A02(r3).A0s;
        boolean z2 = false;
        if (str7 != null) {
            0qQ.A0B("cutout_", 1);
            z2 = str7.startsWith("cutout_");
        }
        C242373Tu r32 = r1.A0G.A0H;
        C254873tC r13 = r99;
        return A04(context, (C3259574v) null, r16, r94, r95, r96, r0, r13, (C254873tC) null, directMessageIdentifier, r10, str3, str, str6, (String) null, (String) null, list, i, A04, true, z, z2, false, C3263776n.A01(userSession2, r32, r0, r13), false, false);
    }

    public final C328667Fr AM8(Context context, UserSession userSession, AnonymousClass7FE r11, AnonymousClass9HC r12, AnonymousClass7LQ r13) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r11, 2);
        0qQ.A0B(r12, 3);
        0qQ.A0B(r13, 4);
        C254703su r0 = r13.A0e;
        0qQ.A07(r0);
        return A02(context, userSession, r11, r12, r13, C3266377o.A00(r0), false);
    }

    private final AnonymousClass9JN A00(AnonymousClass9JN r12, C254793t3 r13, int i, boolean z) {
        String A02;
        String str;
        BBV bbv;
        String str2 = r12.A04;
        String str3 = r12.A05;
        if (z) {
            A02 = r12.A02;
        } else {
            A02 = AnonymousClass775.A02(r13, i);
        }
        C61078JwG jwG = (C61078JwG) r12.A01;
        if (jwG == null || (bbv = (BBV) jwG.A00) == null) {
            str = null;
        } else {
            str = bbv.A00;
        }
        String str4 = r12.A03;
        String str5 = r12.A02;
        return new AnonymousClass9JN(new AnonymousClass9JG(AnonymousClass775.A03(str5, DialogModule.KEY_TITLE), AnonymousClass775.A03(str5, "collection_id"), AnonymousClass775.A03(str5, "collection_type"), 2), (Integer) r12.A00, str2, str3, A02, str, str4);
    }

    public static final AnonymousClass774 A01(C254873tC r10, AnonymousClass0eM r11) {
        String str = r10.A11;
        if ((str == null || str.length() == 0) && (!((Boolean) r11.getValue()).booleanValue() || r10.A02().isEmpty())) {
            return null;
        }
        List A02 = r10.A02();
        0qQ.A07(A02);
        if (str == null) {
            str = "";
        }
        return new AnonymousClass774((Drawable) null, (Drawable) null, str, r10.A10, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, r10.A1O, A02);
    }

    public static final C328667Fr A03(Context context, UserSession userSession, AnonymousClass7FE r31, AnonymousClass9HC r32, AnonymousClass7LQ r33, C254873tC r34, boolean z) {
        C3259574v r9;
        String str;
        C254873tC r15 = r34;
        0qQ.A0B(r15, 2);
        AnonymousClass7LQ r1 = r33;
        C254703su r14 = r1.A0e;
        C2606546n r7 = r15.A0O;
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7FE r11 = r31;
        if (r7 != null) {
            r9 = C70863OPc.A01(context2, userSession2, r1, r11.A03, r7, r14.A2P, r1.A0G.A0x, 0qQ.A0K(userSession2.A06, r14.BsI()), false);
        } else {
            r9 = null;
        }
        DirectMessageIdentifier A0V = r14.A0V();
        boolean A03 = C3266377o.A03(userSession2, r14);
        String str2 = r14.A1u;
        0qQ.A07(str2);
        User user = r1.A0K;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        AnonymousClass9HC r12 = r32;
        AnonymousClass7FT A002 = AnonymousClass7FG.A00(context2, userSession2, r12, r1, r14.A10);
        AnonymousClass7SD r0 = r1.A0G;
        C254793t3 r13 = r0.A0P;
        int i = r0.A08;
        boolean z2 = z;
        return A04(context2, r9, A002, r11, r12, A01(r15, r12.A1C), r14, r15, (C254873tC) null, A0V, r13, str2, str, r14.A1V, (String) null, (String) null, A05(r15, r13, i, z2), i, A03, z2, false, false, false, false, false, false);
    }

    public static final List A05(C254873tC r3, C254793t3 r4, int i, boolean z) {
        ImmutableList A01 = r3.A01();
        if (A01 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(A01, 10));
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            AnonymousClass9JN r1 = (AnonymousClass9JN) it.next();
            AnonymousClass773 r0 = A00;
            0qQ.A0A(r1);
            arrayList.add(r0.A00(r1, r4, i, z));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r72v0 */
    /* JADX WARNING: type inference failed for: r72v1, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r72v4, types: [X.777] */
    /* JADX WARNING: type inference failed for: r7v8, types: [X.776] */
    /* JADX WARNING: type inference failed for: r72v6 */
    /* JADX WARNING: type inference failed for: r72v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r2.intValue() != 5) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0467, code lost:
        r0 = r5.equals(r0);
        r5 = 2131958899;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0478, code lost:
        if (r0 != false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r9 == null) goto L_0x006d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x041e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C328667Fr A04(android.content.Context r100, X.C3259574v r101, X.AnonymousClass7FT r102, X.AnonymousClass7FE r103, X.AnonymousClass9HC r104, X.AnonymousClass774 r105, X.C254703su r106, X.C254873tC r107, X.C254873tC r108, com.instagram.model.direct.messageid.DirectMessageIdentifier r109, X.C254793t3 r110, java.lang.String r111, java.lang.String r112, java.lang.String r113, java.lang.String r114, java.lang.String r115, java.util.List r116, int r117, boolean r118, boolean r119, boolean r120, boolean r121, boolean r122, boolean r123, boolean r124, boolean r125) {
        /*
            r26 = r109
            r1 = r106
            r17 = r103
            r16 = r102
            r0 = r107
            r2 = r108
            r58 = r125
            if (r123 != 0) goto L_0x02ee
            if (r108 == 0) goto L_0x0019
            X.3tD r3 = r2.A0Q
            X.3tD r0 = X.C254883tD.PLAIN
            if (r3 == r0) goto L_0x02f1
            r0 = r2
        L_0x0019:
            com.instagram.model.mediasize.ExtendedImageUrl r8 = r0.A0X
            r72 = 0
            if (r8 != 0) goto L_0x0215
            int r3 = r0.A09
            r2 = 1
            if (r3 != r2) goto L_0x0026
            X.NZi r72 = X.C68850NZi.A00
        L_0x0026:
            com.instagram.model.mediasize.GifUrlImpl r2 = r0.A0Z
            r43 = r2
            java.lang.String r6 = r0.A1D
            java.lang.Integer r7 = r0.A0g
            java.lang.Integer r2 = r0.A0h
            r4 = 1
            if (r2 == 0) goto L_0x003b
            int r3 = r2.intValue()
            r2 = 5
            r5 = 1
            if (r3 == r2) goto L_0x003c
        L_0x003b:
            r5 = 0
        L_0x003c:
            r15 = 0
            if (r7 == 0) goto L_0x0057
            int r3 = r7.intValue()
            if (r3 != 0) goto L_0x01fa
            if (r5 == 0) goto L_0x01f6
            X.Nj6 r3 = X.C69305Nj6.INFO_FILLED
        L_0x0049:
            java.lang.String r2 = r0.A1E
            X.OMk r4 = new X.OMk
            r4.<init>(r3, r2, r6, r5)
            r3 = 5
            X.9Iu r2 = new X.9Iu
            r2.<init>((java.lang.String) r15, (java.lang.Object) r4, (int) r3)
            r15 = r2
        L_0x0057:
            java.lang.String r3 = r0.A1N
            java.lang.String r2 = r0.A11
            android.text.SpannableString r9 = X.AnonymousClass775.A00(r3, r2)
            r70 = 0
            if (r9 != 0) goto L_0x0077
            int r3 = r0.A02
            r2 = 19
            if (r3 != r2) goto L_0x01f2
            java.lang.String r9 = r0.A0t
            if (r9 != 0) goto L_0x0077
        L_0x006d:
            java.lang.String r2 = r0.A1L
            if (r2 != 0) goto L_0x0075
            java.lang.String r2 = r0.A0t
            if (r2 == 0) goto L_0x0077
        L_0x0075:
            java.lang.String r9 = ""
        L_0x0077:
            java.lang.Integer r2 = r0.A0j
            r4 = 1
            r3 = r104
            if (r2 == 0) goto L_0x01e1
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x01e1
            int r2 = r3.A00
            java.lang.Integer r37 = java.lang.Integer.valueOf(r2)
        L_0x008a:
            if (r9 == 0) goto L_0x00e1
            java.lang.String r14 = r0.A1H
            com.instagram.model.mediasize.ExtendedImageUrl r13 = r0.A0T
            X.3tE r12 = r0.A0P
            java.lang.String r8 = r0.A0t
            if (r8 == 0) goto L_0x01de
            X.0eM r2 = r3.A0w
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00a8
            android.text.SpannableStringBuilder r8 = X.C66889MeU.A01(r8)
        L_0x00a8:
            java.lang.String r10 = r0.A1L
            int r7 = r0.A07
            int r2 = r0.A06
            java.lang.Integer r38 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = r0.A1P
            java.lang.Integer r5 = r0.A0j
            java.lang.String r4 = r0.A1J
            java.lang.String r3 = r0.A1I
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r0.A0Y
            int r11 = r0.A0A
            java.lang.Integer r40 = java.lang.Integer.valueOf(r11)
            X.74T r70 = new X.74T
            r27 = r70
            r28 = r13
            r29 = r2
            r30 = r12
            r31 = r9
            r32 = r14
            r33 = r8
            r34 = r10
            r35 = r4
            r36 = r3
            r39 = r5
            r41 = r6
            r42 = r7
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
        L_0x00e1:
            r35 = r110
            if (r119 == 0) goto L_0x01d4
            java.lang.String r3 = r0.A0u
            if (r3 != 0) goto L_0x00eb
            java.lang.String r3 = ""
        L_0x00eb:
            r2 = 5
            X.9J6 r12 = new X.9J6
            r4 = r111
            r12.<init>(r3, r4, r2)
            java.lang.String r4 = r0.A0r
            java.lang.String r3 = r0.A0q
            r2 = 3
            X.9J6 r11 = new X.9J6
            r11.<init>(r4, r3, r2)
            java.util.List r2 = r0.A1d
            if (r2 != 0) goto L_0x01ce
            r97 = 0
        L_0x0103:
            X.3tD r2 = r0.A0Q
            r34 = r2
            X.0qQ.A07(r34)
            int r2 = r0.A00
            r33 = r2
            java.lang.String r6 = r0.A1F
            java.lang.Long r4 = r0.A0l
            java.lang.Long r3 = r0.A0k
            r7 = 0
            r2 = 8
            r5 = 0
            X.9J0 r8 = new X.9J0
            r8.<init>((java.lang.Long) r4, (java.lang.Long) r3, (java.lang.String) r6, (int) r2)
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r0.A0R
            r4 = 0
            if (r2 == 0) goto L_0x0124
            java.lang.String r5 = r2.A0A
        L_0x0124:
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r0.A0S
            if (r2 == 0) goto L_0x012a
            java.lang.String r4 = r2.A0A
        L_0x012a:
            r2 = 4
            X.9J6 r3 = new X.9J6
            r3.<init>(r5, r4, r2)
            java.util.List r98 = r0.A02()
            int r2 = r0.A01
            r32 = r2
            java.lang.Long r2 = r0.A0m
            r31 = r2
            java.lang.String r2 = r0.A1N
            r30 = r2
            java.lang.String r2 = r0.A1L
            r29 = r2
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = r0.A0b
            boolean r102 = r10.equals(r2)
            int r2 = r0.A0B
            r28 = r2
            java.lang.Long r2 = r0.A0n
            r27 = r2
            java.lang.String r2 = r0.A1G
            r25 = r2
            java.lang.Long r14 = r0.A0o
            java.lang.String r9 = r0.A1T
            java.lang.String r6 = r0.A1R
            java.lang.String r5 = r0.A1S
            java.lang.String r4 = r0.A1Q
            X.778 r2 = new X.778
            r2.<init>(r9, r6, r5, r4)
            com.instagram.model.mediasize.ImageInfoImpl r13 = r0.A0a
            boolean r4 = r0.A1h
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r104 = r10.equals(r4)
            boolean r106 = r1.A1Q()
            X.9Iu r10 = r0.A0L
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r0.A0W
            r74 = 0
            if (r4 == 0) goto L_0x01cb
            java.lang.String r9 = r4.A0A
        L_0x0181:
            com.google.common.collect.ImmutableList r6 = r0.A01()
            if (r6 == 0) goto L_0x01c8
            int r4 = r6.size()
            if (r4 <= 0) goto L_0x01c8
            java.lang.Object r4 = r6.get(r7)
            X.9JN r4 = (X.AnonymousClass9JN) r4
            java.lang.String r5 = r4.A05
            java.lang.String r4 = "xma_iconic_entry_point"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x01c8
            java.lang.Object r19 = r6.get(r7)
            java.lang.String r7 = r0.A1N
            java.lang.String r6 = r0.A1L
            java.lang.String r5 = r0.A0t
            java.lang.Integer r4 = r0.A0j
            r24 = 7
            X.Jw0 r66 = new X.Jw0
            r18 = r66
            r20 = r4
            r21 = r7
            r22 = r6
            r23 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24)
        L_0x01ba:
            java.lang.Boolean r0 = r0.A0d
            if (r0 == 0) goto L_0x01c5
            boolean r109 = r0.booleanValue()
        L_0x01c2:
            monitor-enter(r1)
            goto L_0x0281
        L_0x01c5:
            r109 = 0
            goto L_0x01c2
        L_0x01c8:
            r66 = 0
            goto L_0x01ba
        L_0x01cb:
            r9 = r74
            goto L_0x0181
        L_0x01ce:
            com.google.common.collect.ImmutableList r97 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r2)
            goto L_0x0103
        L_0x01d4:
            r3 = r117
            r2 = r35
            java.lang.String r3 = X.AnonymousClass775.A02(r2, r3)
            goto L_0x00eb
        L_0x01de:
            r8 = 0
            goto L_0x00a8
        L_0x01e1:
            int r4 = r1.A00
            r2 = 13
            if (r4 != r2) goto L_0x01ee
            r2 = 2
            java.lang.Integer r37 = java.lang.Integer.valueOf(r2)
            goto L_0x008a
        L_0x01ee:
            r37 = r70
            goto L_0x008a
        L_0x01f2:
            r9 = r70
            goto L_0x006d
        L_0x01f6:
            X.Nj6 r3 = X.C69305Nj6.INFO
            goto L_0x0049
        L_0x01fa:
            if (r3 == r4) goto L_0x0211
            r2 = 2
            if (r3 != r2) goto L_0x0203
            X.Nj6 r3 = X.C69305Nj6.NEWS_OFF
            goto L_0x0049
        L_0x0203:
            r2 = 3
            if (r3 != r2) goto L_0x020a
            X.Nj6 r3 = X.C69305Nj6.WARNING
            goto L_0x0049
        L_0x020a:
            r2 = 4
            if (r3 != r2) goto L_0x0211
            X.Nj6 r3 = X.C69305Nj6.PRIVATE
            goto L_0x0049
        L_0x0211:
            X.Nj6 r3 = X.C69305Nj6.EYE_OFF
            goto L_0x0049
        L_0x0215:
            boolean r2 = r0.A05()
            if (r2 == 0) goto L_0x021f
            if (r118 != 0) goto L_0x021f
            goto L_0x0026
        L_0x021f:
            int r2 = r8.getWidth()
            if (r2 <= 0) goto L_0x027b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
        L_0x0229:
            int r2 = r8.getHeight()
            if (r2 <= 0) goto L_0x0277
            java.lang.Integer r72 = java.lang.Integer.valueOf(r2)
        L_0x0233:
            r12 = r72
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = r0.A0e
            boolean r2 = r3.equals(r2)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            int r2 = r0.A08
            java.lang.Integer r13 = X.AnonymousClass775.A01(r2)
            java.lang.String r6 = r0.A0x
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x0261
            if (r72 == 0) goto L_0x0261
            int r4 = r72.intValue()
            if (r4 != 0) goto L_0x026f
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0257:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            if (r2 == 0) goto L_0x0261
            float r5 = r2.floatValue()
        L_0x0261:
            java.lang.Float r10 = java.lang.Float.valueOf(r5)
            X.776 r72 = new X.776
            r7 = r72
            r14 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0026
        L_0x026f:
            int r2 = r11.intValue()
            float r3 = (float) r2
            float r2 = (float) r4
            float r3 = r3 / r2
            goto L_0x0257
        L_0x0277:
            r0.A03()
            goto L_0x0233
        L_0x027b:
            r0.A03()
            r11 = r72
            goto L_0x0229
        L_0x0281:
            X.5FY r4 = r1.A0V     // Catch:{ all -> 0x02eb }
            monitor-exit(r1)
            X.7AG r0 = r1.A0Q
            if (r0 == 0) goto L_0x02e8
            java.lang.String r0 = r0.A0A
        L_0x028a:
            boolean r111 = r1.A1S()
            X.7Fr r7 = new X.7Fr
            r86 = r112
            r71 = r105
            r67 = r101
            r103 = r120
            r108 = r121
            r107 = r124
            r105 = r122
            r96 = r116
            r93 = r115
            r92 = r114
            r91 = r113
            r59 = r7
            r60 = r15
            r61 = r10
            r62 = r8
            r63 = r12
            r64 = r11
            r65 = r3
            r68 = r16
            r69 = r17
            r73 = r2
            r75 = r4
            r76 = r34
            r77 = r74
            r78 = r26
            r79 = r35
            r80 = r43
            r81 = r13
            r82 = r74
            r83 = r31
            r84 = r27
            r85 = r14
            r87 = r30
            r88 = r29
            r89 = r25
            r90 = r74
            r94 = r9
            r95 = r0
            r99 = r33
            r100 = r32
            r101 = r28
            r110 = r58
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111)
            return r7
        L_0x02e8:
            r0 = r74
            goto L_0x028a
        L_0x02eb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x02ee:
            if (r108 != 0) goto L_0x02f1
            r2 = r0
        L_0x02f1:
            X.0sn r38 = X.0sn.A00
            boolean r0 = r1.A1S()
            r5 = 4
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0489
            X.3tI r0 = r1.A0P()
            if (r0 != 0) goto L_0x0489
            java.lang.String r3 = r1.A0m()
        L_0x0306:
            if (r3 != 0) goto L_0x0309
            r3 = r12
        L_0x0309:
            boolean r0 = r1.A1S()
            r4 = r100
            if (r0 == 0) goto L_0x047c
            X.3tI r0 = r1.A0P()
            if (r0 != 0) goto L_0x047c
            java.lang.String r5 = r1.A0n()
            if (r5 == 0) goto L_0x0324
            int r0 = r5.hashCode()
            switch(r0) {
                case 2071376: goto L_0x0422;
                case 2153886: goto L_0x042c;
                case 2337004: goto L_0x0436;
                case 2402290: goto L_0x0440;
                case 79233237: goto L_0x044a;
                case 408556937: goto L_0x044d;
                case 584399216: goto L_0x0457;
                case 947933610: goto L_0x0461;
                case 1668381247: goto L_0x046f;
                default: goto L_0x0324;
            }
        L_0x0324:
            r5 = 2131958894(0x7f131c6e, float:1.9554413E38)
        L_0x0327:
            java.lang.String r6 = r4.getString(r5)
            X.0qQ.A07(r6)
        L_0x032e:
            r0 = 2131237883(0x7f081bfb, float:1.809203E38)
            android.graphics.drawable.Drawable r28 = r4.getDrawable(r0)
            if (r28 == 0) goto L_0x041e
            android.graphics.drawable.Drawable r5 = r28.mutate()
            r0 = 2130970240(0x7f040680, float:1.7549185E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r5.setTint(r0)
        L_0x0349:
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            r5 = 5
            r0 = 2130970230(0x7f040676, float:1.7549164E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r11 = r4.getColor(r0)
            r0 = 2130970227(0x7f040673, float:1.7549158E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r10 = r4.getColor(r0)
            r0 = 2130970229(0x7f040675, float:1.7549162E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r8 = r4.getColor(r0)
            r0 = 2131099673(0x7f060019, float:1.7811706E38)
            int r7 = r4.getColor(r0)
            r0 = 2130970232(0x7f040678, float:1.7549168E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            int[] r0 = new int[]{r11, r10, r8, r7, r0}
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>(r9, r0)
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            java.lang.Integer r32 = java.lang.Integer.valueOf(r0)
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            java.lang.Integer r36 = java.lang.Integer.valueOf(r0)
            r8 = 0
            X.774 r19 = new X.774
            r27 = r19
            r29 = r4
            r30 = r3
            r31 = r6
            r33 = r32
            r34 = r32
            r35 = r32
            r37 = r8
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.String r3 = r2.A0u
            if (r3 != 0) goto L_0x03b1
            r3 = r12
        L_0x03b1:
            java.lang.String r0 = r1.A1u
            X.0qQ.A07(r0)
            X.9J6 r11 = new X.9J6
            r11.<init>(r3, r0, r5)
            X.3tD r24 = X.C254883tD.SINGLE
            java.lang.Boolean r0 = r2.A0d
            if (r0 == 0) goto L_0x041b
            boolean r57 = r0.booleanValue()
        L_0x03c5:
            boolean r59 = r1.A1S()
            r47 = 0
            X.7Fr r7 = new X.7Fr
            r9 = r8
            r10 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r25 = r8
            r27 = r8
            r28 = r8
            r29 = r8
            r30 = r8
            r31 = r8
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r8
            r36 = r8
            r38 = r8
            r39 = r8
            r40 = r8
            r41 = r8
            r42 = r8
            r43 = r8
            r44 = r8
            r45 = r8
            r46 = r8
            r48 = r47
            r49 = r47
            r50 = r47
            r51 = r47
            r52 = r47
            r53 = r47
            r54 = r47
            r55 = r47
            r56 = r47
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            return r7
        L_0x041b:
            r57 = 0
            goto L_0x03c5
        L_0x041e:
            r28 = 0
            goto L_0x0349
        L_0x0422:
            java.lang.String r0 = "CLIP"
            boolean r0 = r5.equals(r0)
            r5 = 2131958891(0x7f131c6b, float:1.9554407E38)
            goto L_0x0478
        L_0x042c:
            java.lang.String r0 = "FEED"
            boolean r0 = r5.equals(r0)
            r5 = 2131958893(0x7f131c6d, float:1.9554411E38)
            goto L_0x0478
        L_0x0436:
            java.lang.String r0 = "LIVE"
            boolean r0 = r5.equals(r0)
            r5 = 2131958895(0x7f131c6f, float:1.9554415E38)
            goto L_0x0478
        L_0x0440:
            java.lang.String r0 = "NOTE"
            boolean r0 = r5.equals(r0)
            r5 = 2131958896(0x7f131c70, float:1.9554417E38)
            goto L_0x0478
        L_0x044a:
            java.lang.String r0 = "STORY"
            goto L_0x0467
        L_0x044d:
            java.lang.String r0 = "PROFILE"
            boolean r0 = r5.equals(r0)
            r5 = 2131958897(0x7f131c71, float:1.955442E38)
            goto L_0x0478
        L_0x0457:
            java.lang.String r0 = "REELS_AUDIO"
            boolean r0 = r5.equals(r0)
            r5 = 2131958898(0x7f131c72, float:1.9554421E38)
            goto L_0x0478
        L_0x0461:
            r0 = 2489(0x9b9, float:3.488E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x0467:
            boolean r0 = r5.equals(r0)
            r5 = 2131958899(0x7f131c73, float:1.9554423E38)
            goto L_0x0478
        L_0x046f:
            java.lang.String r0 = "COMMENT"
            boolean r0 = r5.equals(r0)
            r5 = 2131958892(0x7f131c6c, float:1.955441E38)
        L_0x0478:
            if (r0 != 0) goto L_0x0327
            goto L_0x0324
        L_0x047c:
            int r0 = r2.A02
            if (r0 == 0) goto L_0x0324
            if (r0 == r5) goto L_0x0324
            java.lang.String r6 = r2.A1L
            if (r6 != 0) goto L_0x032e
            r6 = r12
            goto L_0x032e
        L_0x0489:
            int r0 = r2.A02
            if (r0 == 0) goto L_0x0493
            if (r0 == r5) goto L_0x0493
            java.lang.String r3 = r2.A1N
            goto L_0x0306
        L_0x0493:
            java.lang.String r3 = r2.A11
            goto L_0x0306
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass773.A04(android.content.Context, X.74v, X.7FT, X.7FE, X.9HC, X.774, X.3su, X.3tC, X.3tC, com.instagram.model.direct.messageid.DirectMessageIdentifier, X.3t3, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.7Fr");
    }
}
