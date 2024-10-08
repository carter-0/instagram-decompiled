package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9mW  reason: invalid class name and case insensitive filesystem */
public final class C387629mW extends C353358Hh {
    public final List A00 = C358878bc.A08();
    public final boolean A01;

    public C387629mW(Context context, UserSession userSession, AnonymousClass8DG r14, AnonymousClass8AM r15) {
        super(context, r14, r15, false, true, true, true);
        1Av A002 = 1Au.A00(userSession);
        0s0 r1 = A002.A6Z;
        AnonymousClass0YZ[] r5 = 1Av.A8a;
        boolean A1T = AnonymousClass7TF.A1T(AnonymousClass7TE.A0M(r1.CDM(A002, r5[59])), 3);
        this.A01 = A1T;
        if (A1T) {
            1Av A003 = 1Au.A00(userSession);
            0s0 r2 = A003.A6Z;
            r2.Epx(A003, Integer.valueOf(AnonymousClass7TE.A0M(r2.CDM(A003, r5[59])) + 1), r5[59]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0080, code lost:
        r9 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0081, code lost:
        r7.setTextSize(1, (float) r0);
        r1 = X.AnonymousClass7TF.A0E(r7.getContext()).density;
        r0 = (int) r1;
        r7.setPadding(r0, 0, r0, 0);
        r7.setTranslationX(r5 * r1);
        r7.setTranslationY(r1 * r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009e, code lost:
        if (r13 == r11.A00) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a0, code lost:
        r6.setColorFilter(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a6, code lost:
        if (r11.A08 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00aa, code lost:
        if (r11.A01 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ac, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
        if (r11.A00.contains(r4) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b5, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        r0 = r12.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r1 != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        r0.setVisibility(r3);
        r1 = r12.itemView.getLayoutParams();
        X.0qQ.A0C(r1, X.C273654mx.A00(9));
        r1 = (android.view.ViewGroup.MarginLayoutParams) r1;
        r1.setMarginStart(java.lang.Math.round(X.0nA.A04(r2, 6)));
        r12.itemView.setLayoutParams(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f5, code lost:
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r12, int r13) {
        /*
            r11 = this;
            X.9Yw r12 = (X.C380619Yw) r12
            r8 = 0
            X.0qQ.A0B(r12, r8)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r12.A0A
            r6.A09()
            X.518 r0 = r11.A01(r13)
            if (r0 == 0) goto L_0x0131
            X.AXJ r0 = (X.AXJ) r0
            X.8bb r4 = r0.A00
            r11.A07(r12, r13)
            android.content.Context r2 = r11.A01
            r0 = 2131975193(0x7f135c19, float:1.9587471E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r2, r0)
            java.lang.Integer r1 = r4.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x002b
            java.lang.String r3 = X.AnonymousClass7TF.A0k(r3)
        L_0x002b:
            X.2eb r5 = r12.A0B
            android.view.View r0 = r5.A01()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r3)
            android.view.View r1 = r5.A01()
            X.0qQ.A07(r1)
            X.8bh r7 = r4.A05
            int r10 = r7.ordinal()
            switch(r10) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0046;
                case 2: goto L_0x0046;
                case 3: goto L_0x010e;
                case 4: goto L_0x0113;
                case 5: goto L_0x0118;
                case 6: goto L_0x0122;
                case 7: goto L_0x011d;
                case 8: goto L_0x012c;
                case 9: goto L_0x0127;
                case 10: goto L_0x0046;
                case 11: goto L_0x0104;
                default: goto L_0x0046;
            }
        L_0x0046:
            r0 = 2131975155(0x7f135bf3, float:1.9587394E38)
        L_0x0049:
            java.lang.String r0 = r2.getString(r0)
            r1.setContentDescription(r0)
            X.JfK r0 = new X.JfK
            r0.<init>(r11, r8)
            X.03v.A0B(r1, r0)
            r3 = 0
            r5.A03(r8)
            android.view.View r1 = r5.A01()
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.0qq r0 = X.AnonymousClass0qo.A00(r2)
            android.graphics.Typeface r0 = X.AnonymousClass91U.A01(r0, r7)
            r1.setTypeface(r0)
            android.view.View r7 = r5.A01()
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r5 = 0
            r0 = 18
            r9 = -1090519040(0xffffffffbf000000, float:-0.5)
            switch(r10) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00f8;
                case 5: goto L_0x00f3;
                case 6: goto L_0x00eb;
                case 7: goto L_0x00f0;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00e5;
                case 10: goto L_0x007e;
                case 11: goto L_0x0100;
                default: goto L_0x007e;
            }
        L_0x007e:
            r0 = 16
        L_0x0080:
            r9 = 0
        L_0x0081:
            r1 = 1
            float r0 = (float) r0
            r7.setTextSize(r1, r0)
            android.content.Context r0 = r7.getContext()
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            float r1 = r0.density
            int r0 = (int) r1
            r7.setPadding(r0, r8, r0, r8)
            float r5 = r5 * r1
            r7.setTranslationX(r5)
            float r1 = r1 * r9
            r7.setTranslationY(r1)
            int r0 = r11.A00
            if (r13 == r0) goto L_0x00a4
            r0 = -1
            r6.setColorFilter(r0)
        L_0x00a4:
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00b5
            java.util.List r0 = r11.A00
            boolean r0 = r0.contains(r4)
            r1 = 1
            if (r0 != 0) goto L_0x00b6
        L_0x00b5:
            r1 = 0
        L_0x00b6:
            com.instagram.common.ui.base.IgTextView r0 = r12.A09
            if (r1 != 0) goto L_0x00bc
            r3 = 8
        L_0x00bc:
            r0.setVisibility(r3)
            android.view.View r0 = r12.itemView
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r0 = 9
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0 = 6
            float r0 = X.0nA.A04(r2, r0)
            int r0 = java.lang.Math.round(r0)
            r1.setMarginStart(r0)
            android.view.View r0 = r12.itemView
            r0.setLayoutParams(r1)
        L_0x00e1:
            return
        L_0x00e2:
            r9 = -1077936128(0xffffffffbfc00000, float:-1.5)
            goto L_0x0081
        L_0x00e5:
            r5 = -1119040307(0xffffffffbd4ccccd, float:-0.05)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0081
        L_0x00eb:
            r0 = 19
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0081
        L_0x00f0:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0080
        L_0x00f3:
            r5 = 1056964608(0x3f000000, float:0.5)
        L_0x00f5:
            r0 = 16
            goto L_0x0081
        L_0x00f8:
            r5 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0080
        L_0x00fb:
            r0 = 22
            r5 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x0080
        L_0x0100:
            r0 = 20
            goto L_0x0081
        L_0x0104:
            r0 = 2131975190(0x7f135c16, float:1.9587465E38)
            goto L_0x0049
        L_0x0109:
            r0 = 2131975191(0x7f135c17, float:1.9587467E38)
            goto L_0x0049
        L_0x010e:
            r0 = 2131975150(0x7f135bee, float:1.9587384E38)
            goto L_0x0049
        L_0x0113:
            r0 = 2131975195(0x7f135c1b, float:1.9587475E38)
            goto L_0x0049
        L_0x0118:
            r0 = 2131975194(0x7f135c1a, float:1.9587473E38)
            goto L_0x0049
        L_0x011d:
            r0 = 2131975152(0x7f135bf0, float:1.9587388E38)
            goto L_0x0049
        L_0x0122:
            r0 = 2131975189(0x7f135c15, float:1.9587463E38)
            goto L_0x0049
        L_0x0127:
            r0 = 2131975188(0x7f135c14, float:1.9587461E38)
            goto L_0x0049
        L_0x012c:
            r0 = 2131975151(0x7f135bef, float:1.9587386E38)
            goto L_0x0049
        L_0x0131:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387629mW.onBindViewHolder(X.3kE, int):void");
    }
}
