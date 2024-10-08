package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import com.instagram.igds.components.button.IgdsButton;

public abstract class W2c {
    public static boolean A00;

    public static void A02(Context context, C230202p9 r22, UE4 ue4, C57251IUm iUm, C17997VjZ vjZ, Object obj, boolean z) {
        A00 = false;
        C17997VjZ vjZ2 = vjZ;
        C15059UNc uNc = vjZ2.A03;
        boolean A1W = AnonymousClass7TF.A1W(uNc.A00, INLINE_SURVEY_QUESTION_TYPES.MULTIPLE);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UE4 ue42 = ue4;
        LinearLayout linearLayout = ue42.A02;
        boolean z2 = z;
        A04(linearLayout, vjZ2, ue42.A01, z2, false, true);
        String str = uNc.A03;
        str.getClass();
        C57251IUm iUm2 = iUm;
        C230202p9 r7 = r22;
        r7.Db8(str, iUm2.A00);
        C71662eb r5 = ue42.A03;
        Context context2 = context;
        Object obj2 = obj;
        if (!A1W) {
            r5.A03(8);
            IgdsButton igdsButton = ue42.A06;
            if (igdsButton != null) {
                igdsButton.setVisibility(8);
            }
        } else {
            View A01 = r5.A01();
            String str2 = ue42.A01;
            if (str2.equals("v2") || str2.equals("v3")) {
                A01 = ue42.A06;
                A01.setVisibility(0);
                A01.setEnabled(vjZ2.A01());
            } else {
                r5.A03(0);
                DbU.A1A(context2.getResources(), (TextView) r5.A01(), 2131974836);
                r5.A01().setActivated(vjZ2.A01());
            }
            AnonymousClass0fU.A00(new WA8(2, r7, ue42, obj2, vjZ2, iUm2), A01);
        }
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            AnonymousClass0fU.A00(new WAI(context2, r7, ue42, iUm2, vjZ2, obj2, i2, A1W, z2), linearLayout.getChildAt(i2));
        }
    }

    public static int A00(C17983VjL vjL, VSD vsd, int i) {
        String BW8 = vsd.A01.BW8();
        if (BW8 != null) {
            for (int i2 = 0; i2 < vjL.A00(); i2++) {
                String str = vjL.A01(i2).A03.A03;
                str.getClass();
                if (str.equals(BW8)) {
                    return i2;
                }
            }
        }
        return i;
    }

    public static View A01(ViewGroup viewGroup) {
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.question_view);
        UE4 ue4 = new UE4(A0C);
        ue4.A01 = "v1";
        A0C.setTag(ue4);
        return A0C;
    }

    public static void A03(Context context, C230202p9 r21, UE4 ue4, C17983VjL vjL, C17997VjZ vjZ, C17927ViI viI) {
        float f;
        Integer num;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UE4 ue42 = ue4;
        ue42.A04.A02();
        LinearLayout linearLayout = ue42.A02;
        linearLayout.setVisibility(0);
        C17983VjL vjL2 = vjL;
        C42107BHk bHk = vjL2.A00;
        C17997VjZ vjZ2 = vjZ;
        A04(linearLayout, vjZ2, ue42.A01, false, AnonymousClass7TG.A1X(bHk.A03), false);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            Object A0h = C13989Tnp.A0h(vjZ2.A04, i2);
            View childAt = linearLayout.getChildAt(i2);
            C17927ViI viI2 = viI;
            AnonymousClass0fU.A00(new WAE(1, A0h, context, vjZ2, viI2, ue42, r21, vjL2), childAt);
            if (!(viI2.A03 != AnonymousClass05K.A0C || (num = bHk.A05) == null || num.intValue() == 0)) {
                f = 0.5f;
                if (!viI2.A06) {
                    childAt.setAlpha(f);
                }
            }
            f = 1.0f;
            childAt.setAlpha(f);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d0, code lost:
        r1.setBackgroundResource(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        if (r10.A00 == com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES.MULTIPLE) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f5, code lost:
        r15.addView(r5);
        r12 = r16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x00f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.widget.LinearLayout r18, X.C17997VjZ r19, java.lang.String r20, boolean r21, boolean r22, boolean r23) {
        /*
            r15 = r18
            r15.removeAllViews()
            r14 = r19
            X.0eM r0 = r14.A04
            r19 = r0
            java.util.List r0 = X.JTO.A15(r19)
            java.util.Iterator r18 = r0.iterator()
            r12 = 0
        L_0x0014:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0236
            java.lang.Object r11 = r18.next()
            X.VSD r11 = (X.VSD) r11
            java.util.List r0 = X.JTO.A15(r19)
            int r13 = r0.size()
            X.UNc r10 = r14.A03
            java.lang.String r1 = r10.A03
            r9 = 0
            r8 = 3
            if (r1 == 0) goto L_0x0049
            java.lang.String r0 = X.C18407Vr9.A01
            if (r0 == 0) goto L_0x003f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003f
            java.util.HashSet r0 = X.C18407Vr9.A02
            r0.clear()
        L_0x003f:
            java.util.HashSet r0 = X.C18407Vr9.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0049
            X.C18407Vr9.A01 = r1
        L_0x0049:
            r2 = r20
            X.C18407Vr9.A00 = r20
            java.lang.String r7 = "v2"
            boolean r16 = r2.equals(r7)
            java.lang.String r6 = "v3"
            if (r16 == 0) goto L_0x021c
            r4 = 2131628587(0x7f0e122b, float:1.888447E38)
        L_0x005a:
            android.content.Context r3 = r15.getContext()
            r1 = 2132017184(0x7f140020, float:1.967264E38)
            if (r23 == 0) goto L_0x0066
            r1 = 2132017183(0x7f14001f, float:1.9672637E38)
        L_0x0066:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r3, r1)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r5 = X.DbU.A0A(r0, r15, r4, r9)
            X.VbK r4 = new X.VbK
            r4.<init>(r5)
            r5.setTag(r4)
            boolean r0 = r2.equals(r6)
            r3 = 8
            r2 = 50
            r1 = 34
            if (r0 == 0) goto L_0x01fe
            android.widget.TextView r0 = r4.A04
            if (r13 > r8) goto L_0x01ed
            A05(r0, r2)
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x0095
            r1.setVisibility(r9)
        L_0x0095:
            if (r0 == 0) goto L_0x00a0
            r1 = 2132018629(0x7f1405c5, float:1.967557E38)
        L_0x009a:
            r0.setTextAppearance(r1)
            X.C48948Emm.A00(r0)
        L_0x00a0:
            java.lang.Object r4 = X.DbT.A0o(r5)
            X.VbK r4 = (X.C17628VbK) r4
            if (r22 != 0) goto L_0x00b0
            com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES r1 = r10.A00
            com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES r0 = com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES.MULTIPLE
            r17 = 0
            if (r1 != r0) goto L_0x00b2
        L_0x00b0:
            r17 = 1
        L_0x00b2:
            int r16 = r12 + 1
            X.AnonymousClass7TF.A1H(r4, r11)
            android.widget.TextView r8 = r4.A04
            java.lang.String r0 = "Required value was null."
            if (r8 == 0) goto L_0x0230
            com.instagram.igds.components.button.IgdsRadioButton r2 = r4.A06
            if (r2 == 0) goto L_0x022a
            X.XAm r13 = r11.A01
            java.lang.String r0 = r13.getText()
            r8.setText(r0)
            r0 = 16
            if (r21 == 0) goto L_0x00d0
            r0 = 17
        L_0x00d0:
            r8.setGravity(r0)
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L_0x00e9
            if (r12 < 0) goto L_0x01e9
            r0 = 25
            if (r12 > r0) goto L_0x01e9
            int r0 = r12 % 26
            int r0 = r0 + 65
            char r0 = (char) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x00e6:
            r1.setText(r0)
        L_0x00e9:
            java.lang.String r10 = X.C18407Vr9.A00
            int r12 = r10.hashCode()
            r1 = 150(0x96, float:2.1E-43)
            r0 = 0
            switch(r12) {
                case 3707: goto L_0x01d5;
                case 3708: goto L_0x014e;
                case 3709: goto L_0x00fc;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            r15.addView(r5)
            r12 = r16
            goto L_0x0014
        L_0x00fc:
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00f5
            r2.setVisibility(r3)
            boolean r2 = r11.A00
            if (r2 == 0) goto L_0x01ae
            android.widget.ImageView r2 = r4.A03
            if (r2 == 0) goto L_0x0110
            r2.setVisibility(r3)
        L_0x0110:
            android.view.View r2 = r4.A01
            if (r2 == 0) goto L_0x0117
            r2.setVisibility(r3)
        L_0x0117:
            java.util.HashSet r3 = X.C18407Vr9.A02
            java.lang.String r2 = r13.getId()
            boolean r2 = X.00k.A0u(r3, r2)
            if (r2 != 0) goto L_0x0142
            android.view.View r2 = r4.A00
            if (r2 == 0) goto L_0x0131
            r0 = 2131230943(0x7f0800df, float:1.8077953E38)
            r2.setBackgroundResource(r0)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
        L_0x0131:
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            java.lang.String r2 = r13.getId()
            if (r2 == 0) goto L_0x013c
            r3.add(r2)
        L_0x013c:
            if (r0 == 0) goto L_0x00f5
            r0.startTransition(r1)
            goto L_0x00f5
        L_0x0142:
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x00f5
            r1.setBackground(r0)
            r0 = 2131230941(0x7f0800dd, float:1.8077949E38)
            goto L_0x01d0
        L_0x014e:
            boolean r6 = r10.equals(r7)
            if (r6 == 0) goto L_0x00f5
            r2.setVisibility(r3)
            boolean r2 = r11.A00
            if (r2 == 0) goto L_0x01ae
            android.widget.ImageView r2 = r4.A03
            if (r2 == 0) goto L_0x0162
            r2.setVisibility(r9)
        L_0x0162:
            android.view.View r2 = r4.A01
            if (r2 == 0) goto L_0x0169
            r2.setVisibility(r3)
        L_0x0169:
            java.util.HashSet r3 = X.C18407Vr9.A02
            java.lang.String r2 = r13.getId()
            boolean r2 = X.00k.A0u(r3, r2)
            if (r2 != 0) goto L_0x01a0
            android.view.View r2 = r4.A00
            if (r2 == 0) goto L_0x0183
            r0 = 2131230942(0x7f0800de, float:1.807795E38)
            r2.setBackgroundResource(r0)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
        L_0x0183:
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            java.lang.String r2 = r13.getId()
            if (r2 == 0) goto L_0x018e
            r3.add(r2)
        L_0x018e:
            if (r0 == 0) goto L_0x0193
            r0.startTransition(r1)
        L_0x0193:
            android.content.Context r1 = r8.getContext()
            int r0 = X.2Yu.A0E(r1)
            X.DbT.A17(r1, r8, r0)
            goto L_0x00f5
        L_0x01a0:
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x0193
            r1.setBackground(r0)
            r0 = 2131230940(0x7f0800dc, float:1.8077947E38)
            r1.setBackgroundResource(r0)
            goto L_0x0193
        L_0x01ae:
            java.util.HashSet r0 = X.C18407Vr9.A02
            java.lang.String r1 = r13.getId()
            java.util.Collection r0 = X.0u4.A00(r0)
            r0.remove(r1)
            android.widget.ImageView r0 = r4.A03
            if (r0 == 0) goto L_0x01c2
            r0.setVisibility(r3)
        L_0x01c2:
            android.view.View r0 = r4.A01
            if (r0 == 0) goto L_0x01c9
            r0.setVisibility(r9)
        L_0x01c9:
            android.view.View r1 = r4.A00
            if (r1 == 0) goto L_0x00f5
            r0 = 2131230939(0x7f0800db, float:1.8077945E38)
        L_0x01d0:
            r1.setBackgroundResource(r0)
            goto L_0x00f5
        L_0x01d5:
            java.lang.String r0 = "v1"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00f5
            if (r17 == 0) goto L_0x00f5
            r2.setVisibility(r9)
            boolean r0 = r11.A00
            r2.setChecked(r0)
            goto L_0x00f5
        L_0x01e9:
            java.lang.String r0 = ""
            goto L_0x00e6
        L_0x01ed:
            A05(r0, r1)
            android.view.View r1 = r4.A02
            if (r1 == 0) goto L_0x01f7
            r1.setVisibility(r3)
        L_0x01f7:
            if (r0 == 0) goto L_0x00a0
            r1 = 2132018632(0x7f1405c8, float:1.9675576E38)
            goto L_0x009a
        L_0x01fe:
            if (r16 == 0) goto L_0x00a0
            android.widget.TextView r0 = r4.A04
            if (r13 > r8) goto L_0x0210
            A05(r0, r2)
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x00a0
            r0.setVisibility(r9)
            goto L_0x00a0
        L_0x0210:
            A05(r0, r1)
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x00a0
            r0.setVisibility(r3)
            goto L_0x00a0
        L_0x021c:
            boolean r0 = r2.equals(r6)
            r4 = 2131628586(0x7f0e122a, float:1.8884469E38)
            if (r0 == 0) goto L_0x005a
            r4 = 2131628588(0x7f0e122c, float:1.8884473E38)
            goto L_0x005a
        L_0x022a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0230:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2c.A04(android.widget.LinearLayout, X.VjZ, java.lang.String, boolean, boolean, boolean):void");
    }

    public static void A05(TextView textView, int i) {
        if (textView != null) {
            textView.setMinHeight(C18407Vr9.A00(textView.getContext(), i));
        }
    }
}
