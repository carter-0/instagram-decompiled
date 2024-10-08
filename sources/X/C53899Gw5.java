package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.instagram.android.R;
import java.util.Arrays;

/* renamed from: X.Gw5  reason: case insensitive filesystem */
public final class C53899Gw5 extends C251343mx {
    public final C62320sa A00;
    public final 0sP A01;
    public final 0sP A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f7, code lost:
        if (r2 != false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r20) {
        /*
            r19 = this;
            r3 = 0
            r4 = r20
            X.0qQ.A0B(r4, r3)
            r11 = r19
            boolean r2 = r11.A06
            r14 = 0
            if (r2 != 0) goto L_0x0012
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x0012
            return r14
        L_0x0012:
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            android.content.Context r1 = X.C243803a8.A00(r4)
            X.2V1 r5 = r4.A05
            android.content.Context r7 = X.C51965G9l.A0B(r5)
            android.content.Context r0 = X.2Yn.A01(r7)
            int r0 = X.2Yu.A02(r0)
            int r8 = r1.getColor(r0)
            r9.setColor(r8)
            long r0 = X.C244013aV.A06(r4)
            float r0 = X.C51969G9p.A02(r4, r0)
            r9.setCornerRadius(r0)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            android.content.Context r4 = X.C243803a8.A00(r4)
            android.content.Context r1 = X.2Yn.A01(r7)
            r0 = 2130970213(0x7f040665, float:1.754913E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r4.getColor(r0)
            r6.setColor(r0)
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r5)
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r7 = 4
            X.2WX r10 = X.C51971G9r.A0Y(r14, r5, r9, r7)
            X.2Wb r9 = X.G9t.A0w(r4)
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x00f7
            r0 = 18
            X.Wvq r13 = new X.Wvq
            r13.<init>(r11, r0)
            r12 = 2131238136(0x7f081cf8, float:1.8092542E38)
            r1 = 2131954773(0x7f130c55, float:1.9546055E38)
            r0 = 1
            X.2Tp r0 = A00(r9, r13, r12, r1, r0)
            r9.A00(r0)
            if (r2 == 0) goto L_0x00b2
            r0 = 2131165237(0x7f070035, float:1.7944685E38)
            long r0 = X.C244013aV.A0C(r9, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.9JR r0 = X.C51965G9l.A0c(r2, r3, r0)
            X.2WX r0 = X.C51973G9u.A0T(r14, r0, r5, r6, r7)
            X.2Tp r0 = X.C243563Zg.A0L(r9, r0)
            r9.A00(r0)
        L_0x009a:
            r12 = 2131238921(0x7f082009, float:1.8094134E38)
            boolean r6 = r11.A03
            if (r6 != 0) goto L_0x00ec
            r2 = 2131954779(0x7f130c5b, float:1.9546067E38)
        L_0x00a4:
            r1 = 19
            X.Wvq r0 = new X.Wvq
            r0.<init>(r11, r1)
            X.2Tp r0 = A00(r9, r0, r12, r2, r6)
            r9.A00(r0)
        L_0x00b2:
            X.C51967G9n.A1F(r9, r4, r10)
            r0 = 2131240186(0x7f0824fa, float:1.80967E38)
            android.graphics.drawable.Drawable r0 = X.C51968G9o.A0K(r4, r0)
            X.AnonymousClass7TE.A1R(r0, r8)
            X.2WX r2 = X.C51971G9r.A0Y(r14, r5, r0, r7)
            long r0 = X.C244013aV.A09(r4)
            X.2WX r1 = X.C51972G9s.A0T(r2, r3, r0)
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            X.9JR r0 = X.C51970G9q.A0c(r4, r5, r0, r3)
            X.2WX r0 = X.C51974G9v.A0J(r1, r0, r5)
            X.2Tp r0 = X.C243563Zg.A0L(r4, r0)
            r4.A00(r0)
            java.util.List r0 = r4.A01
            X.2Tl r13 = new X.2Tl
            r15 = r14
            r16 = r14
            r18 = r3
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            return r13
        L_0x00ec:
            boolean r0 = r11.A04
            r2 = 2131954775(0x7f130c57, float:1.9546059E38)
            if (r0 == 0) goto L_0x00a4
            r2 = 2131954774(0x7f130c56, float:1.9546057E38)
            goto L_0x00a4
        L_0x00f7:
            if (r2 == 0) goto L_0x00b2
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53899Gw5.A0X(X.3Y5):X.3mp");
    }

    public static final 2Tp A00(C70832Wc r18, C62320sa r19, int i, int i2, boolean z) {
        StateListDrawable stateListDrawable;
        int A022;
        int A023;
        float[] fArr = new float[8];
        Arrays.fill(fArr, (float) C51969G9p.A09(r18, C244013aV.A06(r18)));
        AnonymousClass3XV r0 = 2WX.A02;
        Integer num = AnonymousClass05K.A01;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, true, 4));
        boolean z2 = z;
        if (z) {
            stateListDrawable = new StateListDrawable();
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setColor(C244013aV.A02(r18, R.color.primary_text_disabled_material_dark));
            stateListDrawable.addState(new int[]{16842919}, shapeDrawable);
        } else {
            stateListDrawable = null;
        }
        Integer num2 = AnonymousClass05K.A00;
        2WX A0Y = C51973G9u.A0Y(C51972G9s.A0V(C51971G9r.A0Y(A0X, num2, stateListDrawable, 4), new J6O(r19, 3)), AnonymousClass05K.A0F, z2);
        2Wb A0M = C51973G9u.A0M(r18);
        Drawable A0K = C51968G9o.A0K(A0M, i);
        if (z) {
            Context context = A0M.A00.A0C;
            A022 = context.getColor(2Yu.A0A(context));
        } else {
            A022 = C244013aV.A02(A0M, R.color.gradient_light);
        }
        AnonymousClass7TE.A1R(A0K, A022);
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num2, 0, C244013aV.A0B(A0M)), num, 0, C244013aV.A0B(A0M));
        long A0C = C244013aV.A0C(A0M, R.dimen.abc_edit_text_inset_top_material);
        long A0A = C244013aV.A0A(A0M);
        long A09 = C244013aV.A09(A0M);
        long A0A2 = C244013aV.A0A(A0M);
        2WX A0S = C51972G9s.A0S(A002, 0, A0C);
        Integer num3 = AnonymousClass05K.A08;
        2WX A003 = AnonymousClass9JR.A00(A0S, num3, 0, A0A);
        Integer num4 = AnonymousClass05K.A09;
        2WX A004 = AnonymousClass9JR.A00(A003, num4, 0, A09);
        Integer num5 = AnonymousClass05K.A0A;
        2WX A0K2 = C51974G9v.A0K(A004, C51965G9l.A0c(num5, 0, A0A2), num2);
        2V1 r9 = A0M.A00;
        C51974G9v.A0h(A0K, r9, A0M, A0K2);
        long A0A3 = C244013aV.A0A(A0M);
        2WX A005 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num3, 0, A0A3), num4, 0, C244013aV.A0C(A0M, R.dimen.abc_edit_text_inset_top_material)), num5, 0, C244013aV.A0A(A0M));
        String A0E = C244013aV.A0E(A0M, i2);
        Integer num6 = AnonymousClass05K.A0j;
        if (z) {
            A023 = 2Yn.A01(C243803a8.A00(A0M)).getColor(2Yu.A0A(r9.A0C));
        } else {
            A023 = A0M.Bnf().A02(R.color.gradient_light);
        }
        long A0G = C51972G9s.A0G(14.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r9, (2V5) null, A0E, R.style.igds_emphasized_body_2);
        C51973G9u.A17(A0M, A0b, A023, A0G);
        A0b.A0R(0);
        G9w.A12(typeface, A0M, A0b, A0D);
        C51974G9v.A16(A0b, num6, num2);
        A0b.A0E();
        C51969G9p.A1I(A0b);
        G9t.A1M(A0M, A005, A0b);
        return C243563Zg.A0B(A0M, r18, A0Y);
    }

    public C53899Gw5(C62320sa r1, 0sP r2, 0sP r3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A04 = z2;
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
        this.A06 = z3;
        this.A05 = z4;
    }
}
