package X;

import com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JjL  reason: case insensitive filesystem */
public final class C60317JjL extends 2YL {
    public String A00;
    public String A01;
    public final 1E8 A02;
    public final String A03;
    public final String A04;
    public final List A05 = AnonymousClass7TE.A1C();
    public final 0V2 A06;
    public final 05G A07;
    public final C61770pa A08;
    public final C317746nl A09;
    public final StoryCommentsDashboardRepository A0A;
    public final List A0B = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C60317JjL r18, X.AnonymousClass4D7 r19) {
        /*
            r0 = r18
            r4 = 45
            r6 = r19
            boolean r1 = X.C66139MDr.A01(r4, r6)
            if (r1 == 0) goto L_0x00ff
            r5 = r6
            X.MDr r5 = (X.C66139MDr) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x00ff
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x001a:
            java.lang.Object r2 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r14 = 1
            if (r1 == 0) goto L_0x00ae
            if (r1 != r14) goto L_0x0106
            java.lang.Object r0 = r5.A01
            X.JjL r0 = (X.C60317JjL) r0
            X.0eS.A00(r2)
        L_0x002c:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x007d
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r1 = r2.A00
            X.CEp r1 = (X.C43823CEp) r1
            X.Jte r3 = r1.FH3()
            java.lang.String r1 = r3.A00
            r0.A00 = r1
            java.util.List r2 = r3.A01
            if (r2 == 0) goto L_0x0049
            java.util.List r1 = r0.A05
            r1.addAll(r2)
        L_0x0049:
            boolean r3 = r3.A02
            A04(r0, r3)
            X.05G r2 = r0.A07
            java.lang.Object r1 = A00(r0)
            X.JvW r1 = (X.C61032JvW) r1
            if (r3 == 0) goto L_0x00ac
            java.lang.String r4 = "has_more_items"
        L_0x005a:
            boolean r8 = r1.A06
            java.lang.Object r5 = r1.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r1.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.A02
            java.util.List r7 = (java.util.List) r7
            boolean r9 = r1.A05
            boolean r10 = r1.A08
            boolean r11 = r1.A07
            boolean r12 = r1.A0A
            boolean r13 = r1.A09
            X.DbZ.A0t(r14, r5, r6, r7)
            X.JvW r3 = new X.JvW
            r3.<init>((java.lang.String) r4, (java.util.List) r5, (java.util.List) r6, (java.util.List) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13)
            r2.Epw(r3)
        L_0x007d:
            X.05G r1 = r0.A07
            java.lang.Object r0 = A00(r0)
            X.JvW r0 = (X.C61032JvW) r0
            r7 = 0
            java.lang.Object r4 = r0.A03
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.A01
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.A02
            java.util.List r6 = (java.util.List) r6
            boolean r8 = r0.A05
            java.lang.String r3 = r0.A04
            boolean r9 = r0.A08
            boolean r10 = r0.A07
            boolean r11 = r0.A0A
            boolean r12 = r0.A09
            X.DbZ.A0t(r14, r4, r5, r6)
            X.JvW r2 = new X.JvW
            r2.<init>((java.lang.String) r3, (java.util.List) r4, (java.util.List) r5, (java.util.List) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12)
            r1.Epw(r2)
        L_0x00a9:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x00ac:
            r4 = 0
            goto L_0x005a
        L_0x00ae:
            X.0eS.A00(r2)
            java.lang.Object r1 = A00(r0)
            X.JvW r1 = (X.C61032JvW) r1
            boolean r1 = r1.A06
            if (r1 != 0) goto L_0x00a9
            X.05G r7 = r0.A07
            java.lang.Object r1 = A00(r0)
            X.JvW r1 = (X.C61032JvW) r1
            java.lang.Object r11 = r1.A03
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r1.A01
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r1.A02
            java.util.List r13 = (java.util.List) r13
            boolean r15 = r1.A05
            java.lang.String r10 = r1.A04
            boolean r6 = r1.A08
            boolean r3 = r1.A07
            boolean r2 = r1.A0A
            boolean r1 = r1.A09
            X.DbZ.A0t(r14, r11, r12, r13)
            X.JvW r9 = new X.JvW
            r17 = r3
            r18 = r2
            r19 = r1
            r16 = r6
            r9.<init>((java.lang.String) r10, (java.util.List) r11, (java.util.List) r12, (java.util.List) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19)
            r7.Epw(r9)
            com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository r3 = r0.A0A
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A00
            r5.A01 = r0
            r5.A00 = r14
            java.lang.Object r2 = r3.A01(r2, r1, r5)
            if (r2 != r4) goto L_0x002c
            return r4
        L_0x00ff:
            X.MDr r5 = new X.MDr
            r5.<init>(r0, r6, r4)
            goto L_0x001a
        L_0x0106:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60317JjL.A01(X.JjL, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C60317JjL r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 46
            boolean r0 = X.C66139MDr.A01(r3, r13)
            if (r0 == 0) goto L_0x008e
            r5 = r13
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x007a
            if (r0 != r3) goto L_0x0094
            java.lang.Object r12 = r5.A01
            X.JjL r12 = (X.C60317JjL) r12
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0075
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r4 = r1.A00
            X.CG1 r4 = (X.CG1) r4
            java.lang.String r0 = r4.A00
            r12.A01 = r0
            java.util.List r1 = r4.A01
            java.util.List r0 = r12.A0B
            r0.addAll(r1)
            boolean r0 = r4.A02
            A04(r12, r0)
            X.05G r2 = r12.A07
            java.lang.Object r1 = A00(r12)
            X.JvW r1 = (X.C61032JvW) r1
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0078
            java.lang.String r4 = "has_more_items"
        L_0x0052:
            boolean r8 = r1.A06
            java.lang.Object r5 = r1.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r1.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.A02
            java.util.List r7 = (java.util.List) r7
            boolean r9 = r1.A05
            boolean r10 = r1.A08
            boolean r11 = r1.A07
            boolean r12 = r1.A0A
            boolean r13 = r1.A09
            X.DbZ.A0t(r3, r5, r6, r7)
            X.JvW r3 = new X.JvW
            r3.<init>((java.lang.String) r4, (java.util.List) r5, (java.util.List) r6, (java.util.List) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13)
            r2.Epw(r3)
        L_0x0075:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0078:
            r4 = 0
            goto L_0x0052
        L_0x007a:
            X.0eS.A00(r1)
            com.instagram.reels.fragment.userlist.comments.data.StoryCommentsDashboardRepository r2 = r12.A0A
            java.lang.String r1 = r12.A03
            java.lang.String r0 = r12.A01
            r5.A01 = r12
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r1, r0, r5)
            if (r1 != r4) goto L_0x0028
            return r4
        L_0x008e:
            X.MDr r5 = new X.MDr
            r5.<init>(r12, r13, r3)
            goto L_0x0016
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60317JjL.A02(X.JjL, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        if (r0.intValue() <= 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        if (r7 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c6, code lost:
        if (r7 != null) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A03(java.util.List r20) {
        /*
            r19 = this;
            r2 = r19
            X.1E8 r1 = r2.A02
            java.lang.String r0 = r2.A03
            X.1Xj r7 = r1.A02(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r20)
            java.util.Iterator r6 = r20.iterator()
            r4 = 0
        L_0x0013:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r3 = r6.next()
            int r5 = r4 + 1
            if (r4 >= 0) goto L_0x0029
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0029:
            X.1bM r3 = (X.C65211bM) r3
            java.lang.String r12 = r3.getPk()
            if (r12 != 0) goto L_0x0037
            java.lang.String r0 = "comment"
            java.lang.String r12 = X.002.A0O(r0, r4)
        L_0x0037:
            com.instagram.user.model.User r0 = r3.CCd()
            r10 = 0
            if (r0 == 0) goto L_0x00cb
            com.instagram.common.typedurl.ImageUrl r9 = r0.Bh3()
        L_0x0042:
            com.instagram.user.model.User r0 = r3.CCd()
            if (r0 == 0) goto L_0x00c9
            java.lang.String r13 = r0.getUsername()
        L_0x004c:
            java.lang.Long r11 = r3.AsE()
            java.lang.String r14 = r3.getText()
            X.6nl r0 = r2.A09
            boolean r16 = r0.A00()
            if (r7 == 0) goto L_0x00c0
            java.util.List r0 = X.JTO.A14(r7)
            if (r0 == 0) goto L_0x00c0
            java.util.Map r4 = X.JZW.A02(r0)
            java.lang.String r0 = r3.getPk()
            java.lang.Object r0 = r4.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x00c0
            boolean r17 = r0.booleanValue()
        L_0x0076:
            java.util.List r0 = X.JTO.A14(r7)
            if (r0 == 0) goto L_0x00c5
            java.util.Map r4 = X.JZW.A01(r0)
            java.lang.String r0 = r3.getPk()
            java.lang.Number r0 = X.C51966G9m.A14(r0, r4)
            if (r0 == 0) goto L_0x00c5
            int r15 = r0.intValue()
        L_0x008e:
            java.util.List r0 = X.JTO.A14(r7)
            if (r0 == 0) goto L_0x00aa
            java.util.Map r4 = X.JZW.A01(r0)
            java.lang.String r0 = r3.getPk()
            java.lang.Number r0 = X.C51966G9m.A14(r0, r4)
            if (r0 == 0) goto L_0x00aa
            int r0 = r0.intValue()
            r18 = 1
            if (r0 > 0) goto L_0x00ac
        L_0x00aa:
            r18 = 0
        L_0x00ac:
            boolean r0 = r3 instanceof X.1bK
            if (r0 == 0) goto L_0x00b5
            X.3gp r10 = new X.3gp
            r10.<init>(r3)
        L_0x00b5:
            X.JuS r8 = new X.JuS
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.add(r8)
            r4 = r5
            goto L_0x0013
        L_0x00c0:
            r17 = 0
            if (r7 == 0) goto L_0x00c5
            goto L_0x0076
        L_0x00c5:
            r15 = 0
            if (r7 == 0) goto L_0x00aa
            goto L_0x008e
        L_0x00c9:
            r13 = r10
            goto L_0x004c
        L_0x00cb:
            r9 = r10
            goto L_0x0042
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60317JjL.A03(java.util.List):java.util.List");
    }

    public final 05F A05() {
        05G r4 = this.A07;
        AnonymousClass0Ub r3 = new AnonymousClass0Ub(new C58099ImL(this, (AnonymousClass4D7) null, 45), r4);
        return 10b.A02(r4.getValue(), C318116oQ.A00(this), r3, AnonymousClass10A.A01);
    }

    public C60317JjL(1E8 r5, C317746nl r6, StoryCommentsDashboardRepository storyCommentsDashboardRepository, String str, String str2) {
        C51974G9v.A1M(r5, str, str2);
        this.A0A = storyCommentsDashboardRepository;
        this.A02 = r5;
        this.A04 = str;
        this.A03 = str2;
        this.A09 = r6;
        0sn r3 = 0sn.A00;
        this.A07 = DbS.A10(new C61032JvW(r3, r3, r3));
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A06 = A012;
        this.A08 = new 0V1((C262204Co) null, A012);
    }

    public static Object A00(C60317JjL jjL) {
        return jjL.A05().getValue();
    }

    public static final void A04(C60317JjL jjL, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (C65211bM r1 : jjL.A05) {
            C51970G9q.A1Q(r1, A1C2, A1C, AnonymousClass7TF.A1Y(r1.CQf(), true) ? 1 : 0);
        }
        List A032 = jjL.A03(A1C);
        List A033 = jjL.A03(A1C2);
        List list = jjL.A0B;
        List A034 = jjL.A03(list);
        boolean z2 = true;
        if (!(!A1C2.isEmpty()) || z) {
            z2 = false;
        }
        boolean z3 = true;
        if (!(!list.isEmpty()) || z) {
            z3 = false;
        }
        05G r12 = jjL.A07;
        C61032JvW jvW = (C61032JvW) A00(jjL);
        boolean A1b = AnonymousClass7TE.A1b(A032);
        boolean z4 = jvW.A06;
        String str = jvW.A04;
        boolean z5 = jvW.A07;
        boolean z6 = jvW.A09;
        AnonymousClass7TG.A1Q(A033, A034);
        r12.Epw(new C61032JvW(str, A032, A033, A034, z4, A1b, z2, z5, z3, z6));
    }
}
