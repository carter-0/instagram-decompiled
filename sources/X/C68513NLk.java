package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NLk  reason: case insensitive filesystem */
public final class C68513NLk extends C336937fQ {
    public static final int A03 = C69328NjT.A01.size();
    public final Context A00;
    public final UserSession A01;
    public final C74435Pup A02;

    public C68513NLk(Context context, UserSession userSession, C74435Pup pup) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = pup;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C61083JwL jwL = (C61083JwL) obj;
        0qQ.A0B(jwL, 1);
        if (r2 != null) {
            r2.A7U(((C69328NjT) jwL.A01).A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ba, code lost:
        if (r9.CPV() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0170, code lost:
        if (r4 != false) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r20, android.view.View r21, android.view.ViewGroup r22, java.lang.Object r23, java.lang.Object r24) {
        /*
            r19 = this;
            r7 = r23
            r3 = r21
            r0 = 1339680296(0x4fd9e628, float:7.3114788E9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r4 = r24
            X.C51972G9s.A1D(r7, r4)
            r6 = r19
            if (r21 != 0) goto L_0x0056
            android.content.Context r8 = r6.A00
            kotlin.enums.EnumEntries r0 = X.C69328NjT.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x001c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0186
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.NjT r0 = (X.C69328NjT) r0
            int r0 = r0.A00
            r3 = r20
            if (r0 != r3) goto L_0x001c
        L_0x002f:
            X.NjT r2 = (X.C69328NjT) r2
            if (r2 != 0) goto L_0x0035
            X.NjT r2 = X.C69328NjT.VIEW_TYPE_ROW
        L_0x0035:
            r3 = 1
            r1 = 0
            int r0 = r2.ordinal()
            r2 = 0
            if (r0 == r1) goto L_0x017d
            if (r0 != r3) goto L_0x0189
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131629338(0x7f0e151a, float:1.8885994E38)
        L_0x0047:
            android.view.View r3 = r1.inflate(r0, r2)
            X.0qQ.A07(r3)
            X.OD6 r0 = new X.OD6
            r0.<init>(r3)
            r3.setTag(r0)
        L_0x0056:
            r0 = 16
            boolean r0 = X.C61083JwL.A04(r0, r7)
            r2 = 0
            if (r0 == 0) goto L_0x0178
            X.JwL r7 = (X.C61083JwL) r7
            if (r7 == 0) goto L_0x0178
            java.lang.Object r9 = r7.A00
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            if (r9 != 0) goto L_0x0070
            r0 = -438906550(0xffffffffe5d6d14a, float:-1.2680589E23)
        L_0x006c:
            X.AnonymousClass0fD.A0A(r0, r5)
            return r3
        L_0x0070:
            java.lang.Object r1 = r3.getTag()
            boolean r0 = r1 instanceof X.OD6
            if (r0 == 0) goto L_0x0173
            X.OD6 r1 = (X.OD6) r1
            if (r1 == 0) goto L_0x0173
            android.content.Context r10 = r6.A00
            com.instagram.common.session.UserSession r8 = r6.A01
            boolean r0 = r4 instanceof X.C69313NjE
            if (r0 == 0) goto L_0x0087
            r2 = r4
            X.NjE r2 = (X.C69313NjE) r2
        L_0x0087:
            X.Pup r0 = r6.A02
            r15 = 0
            X.0qQ.A0B(r10, r15)
            r14 = 2
            r13 = 5
            r12 = 1
            X.0qQ.A0B(r0, r13)
            android.view.View r4 = r1.A00
            r6 = 8
            if (r4 == 0) goto L_0x009c
            r4.setVisibility(r6)
        L_0x009c:
            com.instagram.igds.components.textcell.IgdsListCell r4 = r1.A01
            if (r4 == 0) goto L_0x00a3
            r4.setVisibility(r6)
        L_0x00a3:
            if (r2 == 0) goto L_0x0101
            if (r8 == 0) goto L_0x0101
            int r7 = r2.ordinal()
            if (r7 == r14) goto L_0x0163
            if (r7 == r15) goto L_0x0163
            if (r7 == r13) goto L_0x015e
            r4 = 6
            if (r7 == r4) goto L_0x016c
            if (r7 != r12) goto L_0x0101
            boolean r4 = r9.CPV()
            if (r4 != 0) goto L_0x0101
        L_0x00bc:
            android.content.res.Resources r8 = r10.getResources()
            int r11 = X.2Yu.A03(r10)
            int r16 = r10.getColor(r11)
            r6 = 50
            X.Ok8 r4 = new X.Ok8
            r4.<init>((int) r6, (java.lang.Object) r0, (java.lang.Object) r2)
            if (r7 == r14) goto L_0x0146
            if (r7 == r15) goto L_0x0128
            if (r7 == r13) goto L_0x0106
            r6 = 6
            if (r7 == r6) goto L_0x010a
            if (r7 != r12) goto L_0x00fe
            r6 = 2131238104(0x7f081cd8, float:1.8092477E38)
            android.graphics.drawable.Drawable r12 = r10.getDrawable(r6)
            r7 = 2131973066(0x7f1353ca, float:1.9583157E38)
            java.lang.String r6 = r9.getUsername()
            java.lang.String r18 = X.AnonymousClass7TF.A0e(r8, r6, r7)
            X.0qQ.A07(r18)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r14 = r1
            r17 = r16
            r13 = r4
            X.OYK.A00(r12, r13, r14, r15, r16, r17, r18)
        L_0x00fe:
            r0.Diw(r2)
        L_0x0101:
            r0 = 1075946975(0x4021a5df, float:2.525749)
            goto L_0x006c
        L_0x0106:
            r7 = 2131972303(0x7f1350cf, float:1.958161E38)
            goto L_0x010d
        L_0x010a:
            r7 = 2131975972(0x7f135f24, float:1.9589051E38)
        L_0x010d:
            java.lang.String r6 = r9.getUsername()
            java.lang.String r12 = X.AnonymousClass7TF.A0e(r8, r6, r7)
            X.0qQ.A07(r12)
            r9 = 0
            r6 = 2131238721(0x7f081f41, float:1.8093729E38)
            android.graphics.drawable.Drawable r6 = r10.getDrawable(r6)
            r8 = r1
            r10 = r9
            r11 = r9
            r7 = r4
            X.OYK.A00(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00fe
        L_0x0128:
            r6 = 2131238960(0x7f082030, float:1.8094213E38)
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r6)
            r7 = 2131973071(0x7f1353cf, float:1.9583167E38)
            java.lang.String r6 = r9.getUsername()
            java.lang.String r16 = X.AnonymousClass7TF.A0e(r8, r6, r7)
            X.0qQ.A07(r16)
            r13 = 0
            r12 = r1
            r14 = r13
            r15 = r13
            r11 = r4
            X.OYK.A00(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00fe
        L_0x0146:
            r7 = 2131973067(0x7f1353cb, float:1.958316E38)
            java.lang.String r6 = r9.getUsername()
            java.lang.String r12 = X.AnonymousClass7TF.A0e(r8, r6, r7)
            X.0qQ.A07(r12)
            r6 = 0
            r8 = r1
            r9 = r6
            r10 = r6
            r11 = r6
            r7 = r4
            X.OYK.A00(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00fe
        L_0x015e:
            boolean r4 = X.AGf.A00(r8, r9)
            goto L_0x0170
        L_0x0163:
            X.2f1 r4 = X.AnonymousClass2f1.A00(r8)
            boolean r4 = r4.A0Q(r9)
            goto L_0x0170
        L_0x016c:
            boolean r4 = X.AGf.A01(r8, r9)
        L_0x0170:
            if (r4 != 0) goto L_0x00bc
            goto L_0x0101
        L_0x0173:
            r0 = -1187275884(0xffffffffb93b9b94, float:-1.7891667E-4)
            goto L_0x006c
        L_0x0178:
            r0 = 293489639(0x117e4be7, float:2.0060456E-28)
            goto L_0x006c
        L_0x017d:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131629339(0x7f0e151b, float:1.8885996E38)
            goto L_0x0047
        L_0x0186:
            r2 = 0
            goto L_0x002f
        L_0x0189:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68513NLk.getView(int, android.view.View, android.view.ViewGroup, java.lang.Object, java.lang.Object):android.view.View");
    }

    public final int getViewTypeCount() {
        return A03;
    }
}
