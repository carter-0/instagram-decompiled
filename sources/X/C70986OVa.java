package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OVa  reason: case insensitive filesystem */
public final class C70986OVa {
    public final int A00;
    public final Context A01;
    public final C69447Nlr A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C70438O6p A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final View A0C;
    public final boolean A0D;
    public final boolean A0E;

    public static final void A00(C70986OVa oVa, Integer num) {
        Integer num2 = oVa.A06;
        Integer num3 = AnonymousClass05K.A00;
        if (num2 == num3) {
            UserSession userSession = oVa.A04;
            AnonymousClass0iw r2 = oVa.A03;
            Integer num4 = AnonymousClass05K.A01;
            String str = oVa.A0A;
            C71048OaQ.A00(oVa.A02, r2, userSession, (C69332NjX) null, Boolean.valueOf(oVa.A0B), num4, num3, num, str, oVa.A07);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (X.182.A06(X.0Tu.A05, r0.A04, 36324788985409908L) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r28 = this;
            r0 = r28
            java.lang.Integer r9 = r0.A06
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            if (r9 != r8) goto L_0x0025
            com.instagram.common.session.UserSession r12 = r0.A04
            X.0iw r11 = r0.A03
            r13 = 0
            java.lang.String r3 = r0.A0A
            X.Nlr r10 = r0.A02
            java.lang.String r2 = r0.A07
            boolean r1 = r0.A0B
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            r15 = r8
            r16 = r8
            r17 = r13
            r18 = r3
            r19 = r2
            X.C71048OaQ.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0025:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r10 = 0
            java.lang.String r2 = "good_result"
            r24 = 1
            java.lang.String r1 = "bad_result"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            java.util.ArrayList r6 = X.0sr.A1M(r1)
            if (r9 != r8) goto L_0x00a5
            boolean r1 = r0.A0D
            if (r1 == 0) goto L_0x00a5
            boolean r1 = r0.A0E
            if (r1 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r4 = r0.A04
            X.0Tu r3 = X.0Tu.A05
            r1 = 36324788985409908(0x810d3400043174, double:3.035281050333613E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x00a5
        L_0x0051:
            com.instagram.common.session.UserSession r4 = r0.A04
            X.0Tu r3 = X.0Tu.A05
            r1 = 36324788985147763(0x810d3400003173, double:3.0352810501678316E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x00a5
            boolean r1 = r0.A0B
            if (r1 != 0) goto L_0x01ad
            java.lang.String r1 = "animate"
            r6.add(r1)
            android.content.Context r2 = r0.A01
            r1 = 2131958606(0x7f131b4e, float:1.9553829E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r2, r1)
            r1 = 2131237944(0x7f081c38, float:1.8092153E38)
            android.graphics.drawable.Drawable r13 = r2.getDrawable(r1)
            r1 = 34
        L_0x007b:
            X.Ply r2 = new X.Ply
            r2.<init>(r0, r1)
            r1 = 8
            X.PHN r15 = new X.PHN
            r15.<init>(r2, r1)
            r12 = 0
            X.8rI r11 = new X.8rI
            r14 = r12
            r16 = r12
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r25 = r10
            r26 = r10
            r27 = r10
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5.add(r11)
        L_0x00a5:
            android.content.Context r1 = r0.A01
            r2 = 2131958609(0x7f131b51, float:1.9553835E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r1, r2)
            r2 = 2131238916(0x7f082004, float:1.8094124E38)
            android.graphics.drawable.Drawable r13 = r1.getDrawable(r2)
            r2 = 36
            X.Ply r3 = new X.Ply
            r3.<init>(r0, r2)
            r2 = 8
            X.PHN r15 = new X.PHN
            r15.<init>(r3, r2)
            r12 = 0
            X.8rI r11 = new X.8rI
            r14 = r12
            r16 = r12
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r25 = r10
            r26 = r10
            r27 = r10
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5.add(r11)
            r3 = 2131958608(0x7f131b50, float:1.9553833E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r1, r3)
            r3 = 2131238912(0x7f082000, float:1.8094116E38)
            android.graphics.drawable.Drawable r13 = r1.getDrawable(r3)
            r4 = 35
            X.Ply r3 = new X.Ply
            r3.<init>(r0, r4)
            X.PHN r15 = new X.PHN
            r15.<init>(r3, r2)
            X.8rI r11 = new X.8rI
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5.add(r11)
            com.instagram.common.session.UserSession r7 = r0.A04
            X.0Tu r11 = X.0Tu.A05
            r3 = 36321885587384137(0x810a9000022749, double:3.03344492973107E-306)
            boolean r3 = X.182.A06(r11, r7, r3)
            if (r3 == 0) goto L_0x0141
            java.lang.String r3 = "favorite"
            r6.add(r3)
            java.lang.String r3 = r0.A0A
            boolean r3 = X.C71044OaM.A03(r7, r3)
            if (r3 == 0) goto L_0x019c
            r3 = 2131960642(0x7f132342, float:1.9557958E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r1, r3)
            r3 = 2131238837(0x7f081fb5, float:1.8093964E38)
            android.graphics.drawable.Drawable r13 = r1.getDrawable(r3)
            r4 = 39
        L_0x012f:
            X.Ply r3 = new X.Ply
            r3.<init>(r0, r4)
            X.PHN r15 = new X.PHN
            r15.<init>(r3, r2)
            X.8rI r11 = new X.8rI
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5.add(r11)
        L_0x0141:
            if (r9 != r8) goto L_0x0191
            java.lang.String r14 = r0.A0A
            int r3 = r0.A00
            long r3 = (long) r3
            java.lang.String r12 = "DIRECT_STICKER_TRAY"
            boolean r11 = r0.A0B
            X.0iw r9 = r0.A03
            java.lang.String r13 = r0.A07
            X.Nlr r8 = r0.A02
            X.0wc r9 = X.C51967G9n.A0Z(r9, r7, r8, r2)
            java.lang.String r2 = "direct_ai_sticker_menu_impression"
            X.0Aj r9 = X.AnonymousClass7TE.A0e(r9, r2)
            boolean r2 = r9.isSampled()
            if (r2 == 0) goto L_0x0191
            java.util.List r14 = X.AnonymousClass7TE.A1I(r14)
            java.lang.String r2 = "sticker_ids"
            r9.AAe(r2, r14)
            java.lang.String r2 = "menu_options"
            r9.AAe(r2, r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r2 = "sticker_position_index"
            r9.A9F(r2, r3)
            java.lang.String r2 = "bottom_sheet_session_id"
            r9.AAJ(r2, r13)
            java.lang.String r2 = "entry_point"
            java.lang.Boolean r3 = X.JTP.A0g(r9, r2, r12, r11)
            java.lang.String r2 = "is_animated"
            r9.A7p(r2, r3)
            java.lang.String r2 = "tray_type"
            r9.A8M(r8, r2)
            r9.Cgf()
        L_0x0191:
            r2 = 0
            X.8Ov r1 = X.C66581MXm.A0c(r1, r7, r2, r5, r10)
            android.view.View r0 = r0.A0C
            r1.showAsDropDown(r0)
            return
        L_0x019c:
            r3 = 2131960260(0x7f1321c4, float:1.9557184E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r1, r3)
            r3 = 2131238844(0x7f081fbc, float:1.8093978E38)
            android.graphics.drawable.Drawable r13 = r1.getDrawable(r3)
            r4 = 38
            goto L_0x012f
        L_0x01ad:
            java.lang.String r1 = "remove_animation"
            r6.add(r1)
            android.content.Context r2 = r0.A01
            r1 = 2131958607(0x7f131b4f, float:1.955383E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r2, r1)
            r1 = 2131237942(0x7f081c36, float:1.8092149E38)
            android.graphics.drawable.Drawable r13 = r2.getDrawable(r1)
            r1 = 37
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70986OVa.A01():void");
    }

    public C70986OVa(View view, AnonymousClass0iw r3, UserSession userSession, C70438O6p o6p, Integer num, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        C69447Nlr nlr;
        AnonymousClass7TG.A1O(userSession, r3);
        this.A04 = userSession;
        this.A03 = r3;
        this.A0C = view;
        this.A0A = str;
        this.A06 = num;
        this.A07 = str2;
        this.A08 = str3;
        this.A0D = z;
        this.A0B = z2;
        this.A0E = z3;
        this.A00 = i;
        this.A09 = str4;
        this.A05 = o6p;
        this.A01 = view.getContext();
        if (z) {
            nlr = C69447Nlr.AI_STICKER;
        } else {
            nlr = C69447Nlr.STICKER;
        }
        this.A02 = nlr;
    }
}
