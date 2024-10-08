package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;
import java.lang.ref.WeakReference;

/* renamed from: X.GMs  reason: case insensitive filesystem */
public final class C52302GMs extends C251343mx {
    public final long A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final SocialContextBubbleUiState A03;
    public final C246853fL A04;
    public final C59553JNz A05;
    public final 0sP A06;
    public final C376459Ib A07;
    public final 2WX A08;
    public final GMO A09;
    public final AnonymousClass3W1 A0A;
    public final WeakReference A0B;
    public final C62320sa A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.Ixj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: X.MMv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v3, resolved type: X.Ixj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: X.Ixj} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0158, code lost:
        if (r16.intValue() == r5) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01f7, code lost:
        if (X.C51969G9p.A1V(r57) != false) goto L_0x01f9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r61) {
        /*
            r60 = this;
            r8 = 0
            r1 = r61
            X.0qQ.A0B(r1, r8)
            X.GMt r0 = X.C52303GMt.A00
            X.2Wa r10 = X.C243643Zq.A00(r1, r0)
            X.GMu r0 = X.C52304GMu.A00
            X.2Wa r19 = X.C243643Zq.A00(r1, r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            X.2V5 r38 = X.C51968G9o.A0Z(r1, r5)
            r4 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            X.2V5 r37 = X.C247343gB.A00(r1, r3)
            r6 = r60
            X.3W1 r15 = r6.A0A
            X.GMv r2 = X.C52305GMv.A00
            r0 = 77
            X.2Wa r12 = X.C243753a2.A01(r1, r15, r2, r0, r8)
            r35 = 1
            java.lang.Object[] r11 = new java.lang.Object[]{r12}
            r9 = 9
            X.AwZ r7 = new X.AwZ
            r2 = r38
            r0 = r37
            r7.<init>(r9, r2, r12, r0)
            X.C243773a4.A00(r1, r7, r11)
            X.3Zd r36 = X.C243533Zd.GLOBAL
            java.lang.String r34 = "social_context_bubble"
            r2 = r36
            r0 = r34
            X.4Ey r2 = X.C51970G9q.A0b(r2, r0)
            r2.A01(r4)
            r0 = 300(0x12c, float:4.2E-43)
            X.C51966G9m.A1M(r2, r0)
            X.AnonymousClass4F7.A00(r1, r2)
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r0 = r6.A03
            java.lang.String r7 = r0.A09
            r33 = 2
            com.instagram.common.session.UserSession r4 = r6.A02
            java.lang.Object[] r11 = new java.lang.Object[]{r7, r4}
            X.IoE r2 = new X.IoE
            r16 = r2
            r17 = r10
            r18 = r6
            r20 = r7
            r21 = r9
            r16.<init>(r17, r18, r19, r20, r21)
            X.C243773a4.A00(r1, r2, r11)
            java.lang.Object r9 = r10.A03
            com.instagram.user.model.FollowStatus r2 = com.instagram.user.model.FollowStatus.A06
            if (r9 == r2) goto L_0x0082
            boolean r2 = X.C51969G9p.A1V(r19)
            if (r2 == 0) goto L_0x008e
        L_0x0082:
            com.instagram.api.schemas.SocialContextType r9 = r0.A02
            com.instagram.api.schemas.SocialContextType r2 = com.instagram.api.schemas.SocialContextType.COMMENTED_BY
            if (r9 == r2) goto L_0x008c
            com.instagram.api.schemas.SocialContextType r2 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            if (r9 != r2) goto L_0x008e
        L_0x008c:
            r12 = 0
            return r12
        L_0x008e:
            X.GMQ r32 = X.GMP.A00(r1)
            X.GMy r2 = X.C52308GMy.A00
            X.2Wa r57 = X.C243643Zq.A00(r1, r2)
            X.GMz r2 = X.C52309GMz.A00
            X.2Wa r13 = X.C243643Zq.A00(r1, r2)
            boolean r2 = r6.A0D
            r31 = r2
            if (r2 == 0) goto L_0x00a5
            r5 = 0
        L_0x00a5:
            X.2V5 r14 = X.C51968G9o.A0Z(r1, r5)
            java.lang.String r2 = r0.A06
            r40 = r2
            X.2V5 r30 = X.C247343gB.A00(r1, r3)
            X.2V5 r29 = X.C247343gB.A00(r1, r3)
            X.2V5 r45 = X.C247343gB.A00(r1, r3)
            X.2V5 r46 = X.C247343gB.A00(r1, r3)
            long r2 = r6.A00
            r22 = r2
            r28 = 15
            X.I84 r11 = new X.I84
            r2 = r28
            r11.<init>((X.2V5) r14, (int) r2)
            r10 = 16
            X.I84 r9 = new X.I84
            r2 = r30
            r9.<init>((X.2V5) r2, (int) r10)
            r27 = 17
            X.I84 r5 = new X.I84
            r3 = r29
            r2 = r27
            r5.<init>((X.2V5) r3, (int) r2)
            boolean r2 = r6.A0F
            r16 = r11
            r17 = r9
            r18 = r5
            r19 = r4
            r20 = r22
            r22 = r2
            X.JwM r3 = X.GMR.A03(r16, r17, r18, r19, r20, r22)
            java.lang.Object r2 = r3.A00
            r26 = r2
            r2 = r26
            android.animation.Animator r2 = (android.animation.Animator) r2
            r26 = r2
            java.lang.Object r2 = r3.A01
            r25 = r2
            r2 = r25
            android.animation.Animator r2 = (android.animation.Animator) r2
            r25 = r2
            java.lang.Object r2 = r3.A02
            r24 = r2
            r2 = r24
            android.animation.Animator r2 = (android.animation.Animator) r2
            r24 = r2
            int r2 = r0.A00
            X.GMT r3 = new X.GMT
            r3.<init>(r7, r2)
            X.GMO r2 = r6.A09
            r12 = 0
            r5 = r35
            X.0qQ.A0B(r2, r5)
            X.JLq r5 = r2.A01
            X.JLq r2 = r2.A00
            r59 = r2
            X.GMm r11 = X.C52296GMm.A00
            boolean r2 = X.0qQ.A0K(r5, r11)
            if (r2 == 0) goto L_0x0131
            r2 = r59
            boolean r12 = X.GMU.A05(r0, r2, r7)
        L_0x0131:
            r9 = 0
            boolean r2 = X.0qQ.A0K(r5, r11)
            if (r2 != 0) goto L_0x015a
            boolean r2 = r5 instanceof X.GMT
            r16 = 0
            if (r2 == 0) goto L_0x03cf
            X.GMT r5 = (X.GMT) r5
            java.lang.String r2 = r5.A01
            int r5 = r5.A00
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
        L_0x0148:
            boolean r2 = X.0qQ.A0K(r2, r7)
            if (r2 == 0) goto L_0x03c7
            int r5 = r0.getIndex()
            if (r16 == 0) goto L_0x03c7
            int r2 = r16.intValue()
            if (r2 != r5) goto L_0x03c7
        L_0x015a:
            r2 = r35
            X.0qQ.A0B(r14, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            java.lang.Object[] r5 = X.C51968G9o.A1a(r2, r9)
            X.GFt r2 = new X.GFt
            r2.<init>(r14, r8, r12, r9)
            X.C243773a4.A00(r1, r2, r5)
            r23 = 3
            r22 = 1
            r2 = r40
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r0, r4}
            r52 = 14
            X.IoM r2 = new X.IoM
            r51 = r2
            r53 = r13
            r54 = r32
            r55 = r6
            r56 = r1
            r51.<init>(r52, r53, r54, r55, r56, r57)
            java.lang.Object r21 = X.AnonymousClass3Zw.A00(r1, r2, r5)
            r2 = r21
            X.2Vt r2 = (X.C70802Vt) r2
            r21 = r2
            X.MMv r9 = new X.MMv
            r9.<init>(r10, r13, r6)
            X.GMx r2 = new X.GMx
            r2.<init>(r13, r6)
            X.0iw r5 = r6.A01
            r58 = r5
            java.lang.String r12 = r58.getModuleName()
            r5 = r35
            X.0qQ.A0B(r4, r5)
            r5 = r33
            X.0qQ.A0B(r12, r5)
            com.instagram.api.schemas.SocialContextType r5 = r0.A02
            com.instagram.api.schemas.SocialContextType r20 = com.instagram.api.schemas.SocialContextType.COMMENTED_BY
            r10 = r20
            if (r5 != r10) goto L_0x03b6
            java.lang.Integer r11 = X.C52306GMw.A00(r4, r0, r12)
            java.lang.Integer r10 = X.AnonymousClass05K.A0j
            if (r11 == r10) goto L_0x01c8
            java.lang.Integer r11 = X.C52306GMw.A00(r4, r0, r12)
            java.lang.Integer r10 = X.AnonymousClass05K.A0u
            if (r11 != r10) goto L_0x03b6
        L_0x01c8:
            r19 = 1099956224(0x41900000, float:18.0)
        L_0x01ca:
            X.1sy r11 = r15.A0o
            X.1sy r10 = X.1sy.A07
            if (r11 == r10) goto L_0x03af
            r10 = 1111490560(0x42400000, float:48.0)
            int r10 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x03af
            X.0Tu r12 = X.0Tu.A05
            r10 = 36327675203172969(0x810fd400003a69, double:3.037106306068839E-306)
            boolean r10 = X.182.A06(r12, r4, r10)
            if (r10 == 0) goto L_0x03af
            r11 = 1
            r16 = 9221401712017801236(0x7ff9000000000014, double:NaN)
        L_0x01e9:
            r10 = r59
            boolean r10 = X.0qQ.A0K(r10, r3)
            if (r10 != 0) goto L_0x01f9
            boolean r10 = X.C51969G9p.A1V(r57)
            r55 = 0
            if (r10 == 0) goto L_0x01fb
        L_0x01f9:
            r55 = 1
        L_0x01fb:
            if (r11 == 0) goto L_0x039f
            r18 = 0
        L_0x01ff:
            r10 = 11
            X.AwZ r11 = new X.AwZ
            r11.<init>(r10, r1, r6, r3)
            X.GMY r39 = X.GMY.A00
            boolean r13 = r6.A0E
            X.9Ib r12 = r6.A07
            r10 = r40
            java.lang.String r51 = X.002.A0R(r10, r7)
            r40 = r26
            r41 = r25
            r42 = r24
            r43 = r12
            r44 = r14
            r47 = r30
            r48 = r29
            r49 = r4
            r50 = r3
            r52 = r11
            r53 = r31
            r54 = r13
            r56 = r8
            X.2WX r7 = r39.A00(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            X.2WX r3 = r6.A08
            X.2WX r10 = r7.A00(r3)
            android.content.Context r11 = X.C243803a8.A00(r1)
            com.instagram.api.schemas.SocialContextType r15 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            com.instagram.user.model.User r3 = r0.A04
            if (r5 != r15) goto L_0x038c
            java.lang.String r3 = r3.getUsername()
            java.lang.Object[] r7 = new java.lang.Object[]{r3}
            r3 = 2131955500(0x7f130f2c, float:1.954753E38)
        L_0x024b:
            X.GKO r3 = X.DbS.A0Q(r7, r3)
            java.lang.CharSequence r7 = X.C66909Mes.A00(r11, r3)
            if (r7 == 0) goto L_0x0264
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            X.9JS r7 = X.C51965G9l.A0d(r3, r7, r8)
            X.3XV r3 = X.2WX.A02
            if (r10 != r3) goto L_0x0260
            r10 = 0
        L_0x0260:
            X.2WX r10 = X.C51965G9l.A0X(r10, r7)
        L_0x0264:
            android.content.Context r3 = X.C243803a8.A00(r1)
            boolean r3 = X.2eO.A00(r3)
            if (r3 == 0) goto L_0x0332
            r40 = 26
            X.IxG r7 = new X.IxG
            r39 = r7
            r41 = r57
            r42 = r6
            r43 = r1
            r44 = r32
            r39.<init>(r40, r41, r42, r43, r44)
            java.lang.Integer r3 = X.AnonymousClass05K.A03
            r2 = 4
            X.2WX r7 = X.G9t.A12(r3, r7, r2)
            X.MMv r3 = new X.MMv
            r2 = r28
            r3.<init>(r2, r1, r6)
            X.2WX r2 = X.C51972G9s.A0V(r7, r3)
        L_0x0291:
            X.2WX r12 = r10.A00(r2)
            X.3XV r14 = X.2WX.A02
            long r9 = X.C51970G9q.A0D()
            long r2 = X.C51965G9l.A07(r18)
            java.lang.Integer r7 = X.AnonymousClass05K.A09
            r11 = 0
            X.2WX r2 = X.AnonymousClass9JR.A00(r11, r7, r8, r2)
            java.lang.Integer r3 = X.AnonymousClass05K.A0A
            X.2WX r2 = X.AnonymousClass9JR.A00(r2, r3, r8, r9)
            X.2WX r12 = r12.A00(r2)
            X.3fL r2 = r6.A04
            r22 = r2
            r7 = r2
            r2 = r33
            X.0qQ.A0B(r7, r2)
            X.MMv r13 = new X.MMv
            r7 = r27
            r2 = r22
            r13.<init>(r7, r2, r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            X.3at r2 = new X.3at
            r2.<init>(r7, r13, r11)
            X.2WX r2 = X.C51965G9l.A0X(r11, r2)
            X.2WX r18 = r12.A00(r2)
            X.0Tu r2 = X.0Tu.A05
            r12 = 36328053160491940(0x81102c00033ba4, double:3.037345327799268E-306)
            boolean r2 = X.182.A06(r2, r4, r12)
            if (r2 == 0) goto L_0x0330
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r2 = r38
            X.2WX r12 = X.C51971G9r.A0W(r2, r11, r7)
            java.lang.Integer r7 = X.AnonymousClass05K.A03
            r2 = r37
            X.2WX r13 = X.C51971G9r.A0W(r2, r12, r7)
            X.2V1 r12 = r1.A05
            r7 = r36
            r2 = r34
            X.2WX r7 = X.C51971G9r.A0V(r12, r13, r7, r2)
        L_0x02f9:
            r2 = r18
            X.2WX r7 = r2.A00(r7)
            r2 = r59
            boolean r2 = X.GMU.A04(r0, r2)
            if (r2 == 0) goto L_0x03d3
            long r2 = X.C51969G9p.A0C()
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            X.2WX r2 = X.AnonymousClass9JR.A00(r11, r4, r8, r2)
            X.2WX r5 = r7.A00(r2)
            X.2Wb r4 = X.C51972G9s.A0Q(r1)
            java.util.List r2 = r0.BZf()
            r0 = 27
            X.JwI r3 = new X.JwI
            r3.<init>((java.util.List) r2, (int) r0)
            X.Gry r2 = new X.Gry
            r0 = r58
            r2.<init>(r3, r0)
            X.2Tl r12 = X.C51967G9n.A0N(r2, r4, r1, r5)
            return r12
        L_0x0330:
            r7 = 0
            goto L_0x02f9
        L_0x0332:
            java.lang.Integer r7 = r0.A05
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            if (r7 == r3) goto L_0x0342
            r3 = r20
            if (r5 != r3) goto L_0x037f
            boolean r3 = X.C52114GFi.A03(r4)
            if (r3 == 0) goto L_0x037f
        L_0x0342:
            r7 = r21
            r3 = r35
            X.0qQ.A0B(r7, r3)
            r7 = r59
            r3 = r23
            X.0qQ.A0B(r7, r3)
            r11 = 4
            X.DbW.A1N(r9, r11, r2)
            if (r22 == 0) goto L_0x0369
            r9 = 12
            X.MMv r7 = new X.MMv
            r3 = r32
            r2 = r21
            r7.<init>(r9, r3, r2)
        L_0x0361:
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            X.2WX r2 = X.G9t.A12(r2, r7, r11)
            goto L_0x0291
        L_0x0369:
            X.Ixj r7 = new X.Ixj
            r39 = r7
            r40 = r3
            r41 = r21
            r42 = r9
            r43 = r59
            r44 = r2
            r45 = r32
            r46 = r8
            r39.<init>(r40, r41, r42, r43, r44, r45, r46)
            goto L_0x0361
        L_0x037f:
            boolean r3 = r0.A0B
            if (r3 != 0) goto L_0x0342
            boolean r3 = X.C51969G9p.A1V(r57)
            if (r3 != 0) goto L_0x0342
            r22 = 0
            goto L_0x0342
        L_0x038c:
            java.lang.String r7 = r3.getUsername()
            java.lang.String r3 = r0.A07
            if (r3 != 0) goto L_0x0396
            java.lang.String r3 = ""
        L_0x0396:
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r3}
            r3 = 2131955316(0x7f130e74, float:1.9547156E38)
            goto L_0x024b
        L_0x039f:
            java.lang.String r10 = r58.getModuleName()
            boolean r10 = X.C52306GMw.A01(r4, r0, r10)
            r18 = 14
            if (r10 == 0) goto L_0x01ff
            r18 = 8
            goto L_0x01ff
        L_0x03af:
            r11 = 0
            long r16 = X.C51969G9p.A0D()
            goto L_0x01e9
        L_0x03b6:
            java.lang.String r10 = "clips_viewer"
            boolean r10 = X.00p.A0k(r12, r10, r8)
            if (r10 != 0) goto L_0x03c3
            X.3DI r10 = X.AnonymousClass3DI.A00
            r10.A04(r4)
        L_0x03c3:
            r19 = 1107296256(0x42000000, float:32.0)
            goto L_0x01ca
        L_0x03c7:
            r2 = r59
            boolean r9 = X.0qQ.A0K(r2, r11)
            goto L_0x015a
        L_0x03cf:
            r2 = r16
            goto L_0x0148
        L_0x03d3:
            com.instagram.common.typedurl.ImageUrl r13 = r0.Adz()
            X.GNY r18 = new X.GNY
            r12 = r19
            r2 = r18
            r2.<init>((com.instagram.common.typedurl.ImageUrl) r13, (float) r12)
            java.lang.String r12 = r58.getModuleName()
            r2 = r33
            X.0qQ.A0B(r12, r2)
            boolean r2 = X.C52306GMw.A01(r4, r0, r12)
            r13 = 2130970311(0x7f0406c7, float:1.7549329E38)
            if (r2 == 0) goto L_0x03f5
            r13 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x03f5:
            java.lang.String r12 = r58.getModuleName()
            r2 = r33
            X.0qQ.A0B(r12, r2)
            boolean r2 = X.C52306GMw.A01(r4, r0, r12)
            r12 = 2131165216(0x7f070020, float:1.7944643E38)
            if (r2 == 0) goto L_0x040a
            r12 = 2131165249(0x7f070041, float:1.794471E38)
        L_0x040a:
            r2 = r20
            if (r5 != r2) goto L_0x052a
            java.lang.String r2 = r58.getModuleName()
            java.lang.Integer r2 = X.C52306GMw.A00(r4, r0, r2)
            int r2 = r2.intValue()
            switch(r2) {
                case 0: goto L_0x04b4;
                case 1: goto L_0x04f4;
                case 2: goto L_0x041d;
                case 3: goto L_0x04a1;
                case 4: goto L_0x0432;
                case 5: goto L_0x047a;
                case 6: goto L_0x0453;
                default: goto L_0x041d;
            }
        L_0x041d:
            X.2Wb r0 = X.C51973G9u.A0K(r1)
            java.util.List r0 = r0.A01
            X.2Tp r12 = new X.2Tp
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r0
            r18 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        L_0x0432:
            long r1 = X.C51970G9q.A0E()
            X.9JR r1 = X.C51967G9n.A0U(r8, r1)
            if (r7 != r14) goto L_0x043d
            r7 = r11
        L_0x043d:
            X.2WX r14 = X.C51965G9l.A0X(r7, r1)
            X.Gw6 r12 = new X.Gw6
            r13 = r21
            r15 = r58
            r16 = r4
            r17 = r0
            r18 = r22
            r19 = r35
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r12
        L_0x0453:
            X.GvH r12 = new X.GvH
            long r1 = X.C51969G9p.A0D()
            X.9JR r5 = X.C51967G9n.A0U(r8, r1)
            X.2WX r5 = X.C51974G9v.A0H(r11, r5, r8, r1)
            X.2WX r16 = X.AnonymousClass9JR.A00(r5, r3, r8, r1)
            r13 = r18
            r14 = r21
            r15 = r7
            r17 = r58
            r18 = r4
            r19 = r0
            r20 = r22
            r21 = r8
            r22 = r35
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r12
        L_0x047a:
            X.GvH r12 = new X.GvH
            long r1 = X.C51969G9p.A0D()
            X.9JR r5 = X.C51967G9n.A0U(r8, r9)
            X.2WX r5 = X.C51974G9v.A0H(r11, r5, r8, r1)
            X.2WX r16 = X.AnonymousClass9JR.A00(r5, r3, r8, r1)
            r13 = r18
            r14 = r21
            r15 = r7
            r17 = r58
            r18 = r4
            r19 = r0
            r20 = r22
            r21 = r35
            r22 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r12
        L_0x04a1:
            X.Gw6 r12 = new X.Gw6
            r13 = r21
            r14 = r7
            r15 = r58
            r16 = r4
            r17 = r0
            r18 = r22
            r19 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r12
        L_0x04b4:
            X.3Zh r9 = X.C243573Zh.FLEX_START
            X.3Zi r10 = X.C243583Zi.FLEX_END
            X.2Wb r5 = X.C51973G9u.A0K(r1)
            r25 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.GMe r2 = new X.GMe
            r15 = r2
            r16 = r11
            r17 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r58
            r23 = r4
            r24 = r11
            r26 = r8
            r27 = r8
            r28 = r8
            r29 = r8
            r30 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.A00(r2)
            X.Grz r3 = new X.Grz
            r2 = r18
            r3.<init>(r2, r0)
            r5.A00(r3)
            r6 = r1
            r8 = r11
            r11 = r35
            X.2Tl r12 = X.C243563Zg.A06(r5, r6, r7, r8, r9, r10, r11)
            return r12
        L_0x04f4:
            X.3Zh r6 = X.C243573Zh.FLEX_END
            X.3Zi r5 = X.C243583Zi.FLEX_START
            X.2Wb r3 = X.C51973G9u.A0K(r1)
            r19 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.GMe r2 = new X.GMe
            r9 = r2
            r10 = r11
            r12 = r18
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r58
            r17 = r4
            r18 = r11
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.A00(r2)
            X.Gvj r2 = new X.Gvj
            r2.<init>(r0)
            r3.A00(r2)
            X.2Tp r12 = X.C243563Zg.A0I(r3, r1, r7, r6, r5)
            return r12
        L_0x052a:
            if (r5 != r15) goto L_0x05bd
            boolean r2 = r6.A0H
            if (r2 == 0) goto L_0x05bd
            java.lang.String r2 = r58.getModuleName()
            boolean r2 = X.C52306GMw.A01(r4, r0, r2)
            r5 = 6
            if (r2 == 0) goto L_0x053c
            r5 = 7
        L_0x053c:
            java.lang.Integer r6 = X.AnonymousClass05K.A06
            r2 = r16
            X.9JR r2 = X.C51965G9l.A0c(r6, r8, r2)
            if (r7 != r14) goto L_0x0547
            r7 = 0
        L_0x0547:
            X.2WX r7 = X.C51965G9l.A0X(r7, r2)
            X.3Zh r6 = X.C243573Zh.FLEX_END
            X.3Zi r3 = X.C243583Zi.FLEX_START
            X.2Wb r2 = X.C51972G9s.A0Q(r1)
            X.2V1 r9 = r2.A00
            android.content.Context r9 = r9.A0C
            r10 = 2130970259(0x7f040693, float:1.7549223E38)
            int r30 = X.C51968G9o.A08(r9, r2, r10)
            java.lang.String r10 = r58.getModuleName()
            boolean r10 = X.C52306GMw.A01(r4, r0, r10)
            r31 = 0
            if (r10 == 0) goto L_0x056c
            r31 = 3
        L_0x056c:
            X.GMe r10 = new X.GMe
            r20 = r10
            r21 = r11
            r22 = r11
            r23 = r18
            r24 = r11
            r25 = r11
            r26 = r11
            r27 = r58
            r28 = r4
            r29 = r11
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r2.A00(r10)
            r8 = 2130970239(0x7f04067f, float:1.7549183E38)
            int r21 = X.2Yu.A0H(r9, r8)
            java.lang.String r8 = r58.getModuleName()
            boolean r24 = X.C52306GMw.A01(r4, r0, r8)
            r20 = 2131238356(0x7f081dd4, float:1.8092988E38)
            long r22 = X.C51969G9p.A0D()
            X.GN0 r4 = new X.GN0
            r18 = r4
            r18.<init>(r19, r20, r21, r22, r24)
            r2.A00(r4)
            X.GtK r4 = new X.GtK
            r4.<init>(r0, r13, r12, r5)
            r2.A00(r4)
            X.2Tp r12 = X.C243563Zg.A0I(r2, r1, r7, r6, r3)
            return r12
        L_0x05bd:
            java.lang.Integer r6 = X.AnonymousClass05K.A06
            r2 = r16
            X.9JR r2 = X.C51965G9l.A0c(r6, r8, r2)
            if (r7 != r14) goto L_0x05c8
            r7 = 0
        L_0x05c8:
            X.2WX r7 = X.C51965G9l.A0X(r7, r2)
            X.3Zh r6 = X.C243573Zh.FLEX_END
            X.3Zi r3 = X.C243583Zi.FLEX_START
            X.2Wb r2 = X.C51972G9s.A0Q(r1)
            X.2V1 r9 = r2.A00
            android.content.Context r10 = r9.A0C
            r9 = 2130970259(0x7f040693, float:1.7549223E38)
            int r30 = X.C51968G9o.A08(r10, r2, r9)
            java.lang.String r9 = r58.getModuleName()
            boolean r9 = X.C52306GMw.A01(r4, r0, r9)
            r31 = 0
            if (r9 == 0) goto L_0x05ed
            r31 = 3
        L_0x05ed:
            X.GMe r9 = new X.GMe
            r20 = r9
            r21 = r11
            r22 = r11
            r23 = r18
            r24 = r11
            r25 = r11
            r26 = r11
            r27 = r58
            r28 = r4
            r29 = r11
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r2.A00(r9)
            if (r5 != r15) goto L_0x0637
            r5 = 2130970239(0x7f04067f, float:1.7549183E38)
            int r11 = X.2Yu.A0H(r10, r5)
            java.lang.String r5 = r58.getModuleName()
            boolean r14 = X.C52306GMw.A01(r4, r0, r5)
            r10 = 2131238356(0x7f081dd4, float:1.8092988E38)
            X.GN0 r0 = new X.GN0
            r8 = r0
            r9 = r19
            r12 = r16
            r8.<init>(r9, r10, r11, r12, r14)
        L_0x062f:
            r2.A00(r0)
        L_0x0632:
            X.2Tl r12 = X.C243563Zg.A07(r2, r1, r7, r6, r3)
            return r12
        L_0x0637:
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.FOLLOWED_BY
            if (r5 != r0) goto L_0x0632
            r0 = 2130970241(0x7f040681, float:1.7549187E38)
            int r12 = X.2Yu.A0H(r10, r0)
            r11 = 2131238946(0x7f082022, float:1.8094185E38)
            long r13 = X.C51969G9p.A0D()
            X.GN0 r0 = new X.GN0
            r9 = r0
            r10 = r19
            r15 = r8
            r9.<init>(r10, r11, r12, r13, r15)
            goto L_0x062f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52302GMs.A0X(X.3Y5):X.3mp");
    }

    public static final void A00(FragmentActivity fragmentActivity, C52302GMs gMs) {
        SocialContextBubbleUiState socialContextBubbleUiState = gMs.A03;
        String B8Q = socialContextBubbleUiState.A04.B8Q();
        String str = socialContextBubbleUiState.A09;
        String str2 = socialContextBubbleUiState.A06;
        C69970NvA.A00(fragmentActivity, gMs.A02, new ClipsInteractionReplySheetContent(socialContextBubbleUiState.A02, socialContextBubbleUiState.A03, B8Q, str, str2, (String) DbT.A0r(socialContextBubbleUiState.A01.A00), gMs.A01.getModuleName()), new MJ0(gMs, 16), new MJ0(gMs, 17));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Hpd, java.lang.Object] */
    public static final void A04(C243673Zt r12, C70832Wc r13, 2Wa r14, C52302GMs gMs) {
        long j;
        WeakReference weakReference;
        if (!gMs.A0G) {
            Object A002 = 0mE.A00(C243803a8.A00(r13), FragmentActivity.class);
            if (A002 != null || ((weakReference = gMs.A0B) != null && (A002 = weakReference.get()) != null)) {
                SocialContextBubbleUiState socialContextBubbleUiState = gMs.A03;
                UserSession userSession = gMs.A02;
                AnonymousClass0iw r6 = gMs.A01;
                String moduleName = r6.getModuleName();
                C51973G9u.A1E(socialContextBubbleUiState, userSession, moduleName);
                if (00p.A0k(moduleName, "clips_viewer", false) || socialContextBubbleUiState.A02 == SocialContextType.LIKED_BY) {
                    gMs.A0C.invoke();
                    AnonymousClass2VL.A00();
                    View view = (View) r12.A00;
                    if (view != null) {
                        ? obj = new Object();
                        Context A003 = C243803a8.A00(r13);
                        String moduleName2 = r6.getModuleName();
                        AnonymousClass7TF.A1H(userSession, moduleName2);
                        01N A1H = 0jo.A1H();
                        boolean A0k = 00p.A0k(moduleName2, "clips_viewer", false);
                        0Tu r7 = 0Tu.A05;
                        if (A0k) {
                            j = 36322834777188863L;
                        } else {
                            j = 36325197007434428L;
                        }
                        if (182.A06(r7, userSession, j)) {
                            A1H.add(C54693HOy.DOGFOOD_ASSISTANT);
                            A1H.add(C54693HOy.LAUNCHER_FLAGS);
                        }
                        A1H.add(C54693HOy.VIEW_PROFILE);
                        A1H.add(C54693HOy.BLOCK);
                        A1H.add(C54693HOy.UNFOLLOW);
                        if (C54899HXh.A00(A003, view, userSession, 0jo.A1I(A1H), new GNG(46, obj, r14), new C66312MMv(14, A002, gMs))) {
                            C246853fL r62 = gMs.A04;
                            SocialContextType socialContextType = socialContextBubbleUiState.A02;
                            String str = socialContextBubbleUiState.A09;
                            0qQ.A0B(str, 0);
                            r62.CzB(socialContextType, socialContextBubbleUiState.A00, DbZ.A07(str));
                            obj.A00(view);
                            r14.A00();
                            return;
                        }
                        DbT.A1Q(0wj.A01, "Friendly Viewer - Failed to show drop-down menu for longpress", 817892647);
                    }
                }
            }
        }
    }

    public static final void A05(C70832Wc r7, SocialContextBubbleUiState socialContextBubbleUiState, C52302GMs gMs) {
        WeakReference weakReference;
        if (!gMs.A0G) {
            FragmentActivity fragmentActivity = (FragmentActivity) 0mE.A00(C243803a8.A00(r7), FragmentActivity.class);
            if (fragmentActivity != null || ((weakReference = gMs.A0B) != null && (fragmentActivity = (FragmentActivity) weakReference.get()) != null)) {
                gMs.A0C.invoke();
                0qQ.A0B(socialContextBubbleUiState, 0);
                if (socialContextBubbleUiState.A02 == SocialContextType.COMMENTED_BY) {
                    String str = socialContextBubbleUiState.A08;
                    if (str != null) {
                        gMs.A04.D4v(C51967G9n.A08(C51971G9r.A0n(0, socialContextBubbleUiState.A09), 0), socialContextBubbleUiState.A00, str);
                        return;
                    }
                    return;
                }
                gMs.A04.DNa(C51967G9n.A08(C51971G9r.A0n(0, socialContextBubbleUiState.A09), 0), socialContextBubbleUiState.A00, true);
                UserSession userSession = gMs.A02;
                0qQ.A0B(userSession, 0);
                if (AnonymousClass7TE.A0q(userSession).getInt("friendly_feed_nux_seen_count", 0) >= 1 || !182.A06(0Tu.A05, userSession, 36327675203238506L)) {
                    A00(fragmentActivity, gMs);
                    return;
                }
                C55612HkX hkX = new C55612HkX(fragmentActivity, gMs);
                AnonymousClass37D A0i = DbT.A0i(fragmentActivity);
                C54104GzZ gzZ = new C54104GzZ();
                gzZ.A00 = hkX;
                C331157Pu A002 = C48943Emh.A00(A0i);
                if (A002 == null || A002.A03.getViewLifecycleOwner().getLifecycle().A07().compareTo(07U.A01) < 0) {
                    C331127Pr A0W = DbS.A0W(userSession);
                    A0W.A0V = new C57388IZt(A0i, 1);
                    C57385IZq.A00(A0W, hkX, 1);
                    DbU.A0y(fragmentActivity, gzZ, A0W);
                    return;
                }
                A002.A0G(gzZ, DbS.A0W(userSession), false, false);
                if (A0i != null) {
                    AnonymousClass37F r1 = (AnonymousClass37F) A0i;
                    r1.A0H = new C57394IZz(hkX, 1);
                    r1.A0F = new C57388IZt(A0i, 0);
                    return;
                }
                return;
            }
            return;
        }
        gMs.A04.DNa(C51967G9n.A08(C51971G9r.A0n(0, socialContextBubbleUiState.A09), 0), socialContextBubbleUiState.A00, false);
    }

    public C52302GMs(C376459Ib r2, 2WX r3, AnonymousClass0iw r4, UserSession userSession, SocialContextBubbleUiState socialContextBubbleUiState, GMO gmo, C246853fL r8, C59553JNz jNz, AnonymousClass3W1 r10, WeakReference weakReference, C62320sa r12, 0sP r13, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass7TG.A1U(socialContextBubbleUiState, userSession, r4);
        C51974G9v.A1N(r13, jNz, gmo);
        0qQ.A0B(r2, 12);
        C51969G9p.A1P(r8, 13, r12);
        0qQ.A0B(r10, 18);
        this.A03 = socialContextBubbleUiState;
        this.A02 = userSession;
        this.A01 = r4;
        this.A08 = r3;
        this.A06 = r13;
        this.A05 = jNz;
        this.A09 = gmo;
        this.A00 = j;
        this.A0F = z;
        this.A0D = z2;
        this.A0E = z3;
        this.A07 = r2;
        this.A04 = r8;
        this.A0C = r12;
        this.A0H = z4;
        this.A0B = weakReference;
        this.A0G = z5;
        this.A0A = r10;
    }
}
