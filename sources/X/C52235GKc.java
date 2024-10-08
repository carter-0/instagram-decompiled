package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.GKc  reason: case insensitive filesystem */
public final class C52235GKc extends C251343mx {
    public final C267324bN A00;
    public final UserSession A01;
    public final Integer A02;
    public final int A03;
    public final Drawable A04;
    public final 2WX A05;
    public final C52058GDe A06;
    public final CharSequence A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final 0sP A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C52235GKc(Drawable drawable, 2WX r3, C267324bN r4, C52058GDe gDe, UserSession userSession, CharSequence charSequence, Integer num, String str, String str2, String str3, String str4, 0sP r13, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TF.A1E(r4, 1, r13);
        this.A00 = r4;
        this.A06 = gDe;
        this.A01 = userSession;
        this.A0D = z;
        this.A07 = charSequence;
        this.A03 = i;
        this.A0C = r13;
        this.A0A = str;
        this.A08 = str2;
        this.A0B = str3;
        this.A05 = r3;
        this.A04 = drawable;
        this.A09 = str4;
        this.A0F = z2;
        this.A0E = z3;
        this.A02 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 == X.AnonymousClass05K.A00) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r26) {
        /*
            r25 = this;
            r10 = 0
            r24 = r26
            r0 = r24
            X.0qQ.A0B(r0, r10)
            r3 = r25
            X.4bN r4 = r3.A00
            boolean r0 = r4.CcK()
            r7 = 0
            if (r0 == 0) goto L_0x0023
            X.GDe r0 = r3.A06
            if (r0 == 0) goto L_0x0208
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x0208
            java.lang.Integer r1 = r0.A10
        L_0x001d:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r17 = 1
            if (r1 != r0) goto L_0x0025
        L_0x0023:
            r17 = 0
        L_0x0025:
            boolean r13 = r3.A0E
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            r5 = 0
            r2 = 1
            X.2WX r9 = X.C51971G9r.A0X(r7, r6, r5, r2)
            if (r17 != 0) goto L_0x01ff
            X.1Xj r0 = r4.A02
            com.instagram.common.session.UserSession r11 = r3.A01
            boolean r0 = X.GED.A03(r11, r0)
            if (r0 != 0) goto L_0x01ff
            boolean r0 = r4.CcK()
            if (r0 != 0) goto L_0x01f9
            X.0Tu r8 = X.DbS.A0J(r11, r10)
            r0 = 36610335591503862(0x8210e8000a17f6, double:3.2158618738313225E-306)
            int r4 = X.DbS.A04(r8, r11, r0)
            if (r4 <= 0) goto L_0x01f9
            int r0 = X.DbS.A04(r8, r11, r0)
            long r11 = X.C51965G9l.A07(r0)
        L_0x005a:
            if (r13 == 0) goto L_0x01f3
            long r0 = X.C244013aV.A0A(r24)
        L_0x0060:
            X.9JR r4 = X.C51967G9n.A0V(r11)
            X.2WX r1 = X.C51974G9v.A0E(r9, r4, r10, r0)
            X.3Zh r16 = X.C243573Zh.CENTER
            X.2WX r0 = r3.A05
            X.2WX r22 = r1.A00(r0)
            r21 = 0
            X.2Wb r9 = X.C51972G9s.A0Q(r24)
            android.graphics.drawable.Drawable r8 = r3.A04
            java.lang.String r13 = r3.A09
            boolean r1 = r3.A0F
            X.0sP r4 = r3.A0C
            java.lang.String r11 = r3.A08
            r0 = 0
            if (r8 == 0) goto L_0x00cc
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            if (r1 == 0) goto L_0x008b
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
        L_0x008b:
            long r0 = X.C244013aV.A0C(r9, r0)
            java.lang.Integer r12 = X.AnonymousClass05K.A1F
            r14 = 4
            X.2WX r12 = X.C51971G9r.A0Y(r7, r12, r4, r14)
            java.lang.Integer r15 = X.AnonymousClass05K.A08
            X.9JS r11 = X.C51965G9l.A0d(r15, r11, r14)
            X.2WX r12 = X.C51973G9u.A0S(r12, r11, r6, r5, r2)
            java.lang.Integer r11 = X.AnonymousClass05K.A0D
            X.2WX r11 = X.C51971G9r.A0Y(r12, r11, r13, r14)
            X.2WX r12 = X.C51972G9s.A0T(r11, r10, r0)
            int r11 = r8.getIntrinsicWidth()
            float r13 = (float) r11
            int r11 = r8.getIntrinsicHeight()
            float r11 = (float) r11
            float r13 = r13 / r11
            int r0 = X.C51968G9o.A09(r9, r0)
            float r0 = (float) r0
            float r13 = r13 * r0
            int r0 = (int) r13
            long r0 = X.C51969G9p.A0G(r0)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.2WX r1 = X.AnonymousClass9JR.A00(r12, r11, r10, r0)
            X.2V1 r0 = r9.A00
            X.3gE r0 = X.C51974G9v.A0P(r8, r0, r1)
        L_0x00cc:
            r9.A00(r0)
            java.lang.Integer r8 = r3.A02
            if (r8 == 0) goto L_0x010c
            X.2WX r2 = X.C51971G9r.A0X(r7, r6, r5, r2)
            long r0 = X.C244013aV.A08(r9)
            X.2WX r5 = X.C51972G9s.A0T(r2, r10, r0)
            long r0 = X.C244013aV.A08(r9)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.2WX r5 = X.AnonymousClass9JR.A00(r5, r2, r10, r0)
            int r0 = r8.intValue()
            android.graphics.drawable.Drawable r2 = X.C51968G9o.A0K(r9, r0)
            r1 = 2131100202(0x7f06022a, float:1.7812779E38)
            if (r17 == 0) goto L_0x00f9
            r1 = 2131099843(0x7f0600c3, float:1.781205E38)
        L_0x00f9:
            X.2V4 r0 = r9.Bnf()
            int r1 = r0.A02(r1)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r2, r1)
            X.2V1 r0 = r9.A00
            X.3gE r7 = X.C51974G9v.A0P(r2, r0, r5)
        L_0x010c:
            r9.A00(r7)
            boolean r1 = r3.A0D
            java.lang.CharSequence r11 = r3.A07
            int r0 = r3.A03
            r23 = r0
            java.lang.String r6 = r3.A0A
            java.lang.String r5 = r3.A0B
            if (r11 == 0) goto L_0x01f1
            int r0 = r11.length()
            if (r0 == 0) goto L_0x01f1
            if (r1 == 0) goto L_0x01eb
            long r1 = X.C244013aV.A09(r9)
        L_0x0129:
            r0 = r21
            X.2WX r1 = X.C51972G9s.A0R(r0, r10, r1)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r0 = r16
            X.2WX r2 = X.G9t.A0z(r1, r12, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r13 = 1065353216(0x3f800000, float:1.0)
            r0 = 1
            X.2WX r1 = X.C51971G9r.A0X(r2, r1, r13, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            r2 = 4
            X.2WX r1 = X.C51971G9r.A0Y(r1, r0, r6, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            X.2WX r0 = X.C51971G9r.A0Y(r1, r0, r5, r2)
            X.2WX r20 = X.C51972G9s.A0V(r0, r4)
            X.2V1 r15 = r9.A00
            android.content.Context r1 = r15.A0C
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r19 = X.0oh.A03(r1, r0, r12)
            r1 = 2131100202(0x7f06022a, float:1.7812779E38)
            if (r17 == 0) goto L_0x0163
            r1 = 2131099843(0x7f0600c3, float:1.781205E38)
        L_0x0163:
            X.2V4 r0 = r9.Bnf()
            int r18 = r0.A02(r1)
            long r7 = X.C244013aV.A08(r9)
            java.lang.Integer r17 = X.AnonymousClass05K.A0N
            com.instagram.common.session.UserSession r1 = r3.A01
            long r5 = X.GHW.A03(r1)
            r2 = 2131099778(0x7f060082, float:1.7811919E38)
            X.2V4 r0 = r9.Bnf()
            int r0 = r0.A02(r2)
            int r16 = X.GHW.A02(r1, r0)
            long r3 = X.GHW.A04(r1)
            X.2V4 r0 = r9.Bnf()
            int r0 = r0.A02(r2)
            java.lang.Integer r14 = X.GHW.A05(r1, r0)
            long r1 = X.C51969G9p.A0D()
            r0 = r21
            X.3ae r11 = X.C51971G9r.A0b(r15, r0, r11, r10)
            r0 = r18
            X.C51973G9u.A17(r9, r11, r0, r7)
            r7 = r19
            r0 = r16
            X.2V4 r0 = X.G9t.A15(r7, r9, r11, r10, r0)
            int r0 = X.2Wd.A00(r0, r5)
            float r0 = (float) r0
            r11.A0K(r0)
            int r0 = X.C51968G9o.A09(r9, r1)
            float r0 = (float) r0
            r11.A0I(r0)
            int r0 = X.C51968G9o.A09(r9, r1)
            float r0 = (float) r0
            r11.A0J(r0)
            X.2V4 r0 = r9.Bnf()
            X.C51974G9v.A11(r11, r0, r14, r3)
            r0 = r17
            r11.A0W(r0)
            X.C51973G9u.A1A(r11, r12, r13, r10)
            r0 = r23
            r11.A0M(r0)
            r0 = r20
            X.C51974G9v.A0z(r0, r11, r10)
            X.2WW r2 = r11.A0A()
        L_0x01e2:
            r1 = r22
            r0 = r24
            X.2Tp r0 = X.C51967G9n.A0P(r2, r9, r0, r1)
            return r0
        L_0x01eb:
            long r1 = X.C51969G9p.A0D()
            goto L_0x0129
        L_0x01f1:
            r2 = 0
            goto L_0x01e2
        L_0x01f3:
            long r0 = X.C244013aV.A07(r24)
            goto L_0x0060
        L_0x01f9:
            long r11 = X.C244013aV.A0A(r24)
            goto L_0x005a
        L_0x01ff:
            long r11 = X.C51969G9p.A0D()
            if (r17 == 0) goto L_0x005a
            r0 = r11
            goto L_0x0060
        L_0x0208:
            r1 = r7
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52235GKc.A0X(X.3Y5):X.3mp");
    }
}
