package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mnc  reason: case insensitive filesystem */
public final class C67421Mnc {
    public static final C67421Mnc A00 = new Object();

    public static final void A02(AnonymousClass2t9 r8, C70826OMy oMy, C68048MzF mzF, float f, float f2, float f3) {
        int i;
        RecyclerView recyclerView = mzF.A05;
        DbV.A1A(mzF.A01.getContext(), recyclerView);
        recyclerView.setAdapter(r8);
        AnonymousClass2t9 r82 = recyclerView.A0A;
        0qQ.A0C(r82, "null cannot be cast to non-null type com.instagram.common.recyclerview.IgRecyclerViewAdapter");
        AnonymousClass2t9 r83 = r82;
        ViewModelListUpdate A0R = DbS.A0R();
        List list = oMy.A08;
        if (list == null) {
            int i2 = 0;
            do {
                A0R.A00(new C71980OuC(f3));
                i2++;
            } while (i2 < 5);
        } else {
            C68144N2k n2k = oMy.A00().A00;
            if (n2k != null) {
                i = n2k.A03;
            } else {
                i = 6;
            }
            Iterator A10 = C66581MXm.A10(list, i);
            int i3 = 0;
            while (A10.hasNext()) {
                Object next = A10.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                1Xj r6 = (1Xj) next;
                if (r6.getId() != null) {
                    C296995qz r2 = new C296995qz(0, i3);
                    float f4 = f;
                    if (r6.CeS()) {
                        f4 = f2;
                    }
                    A0R.A00(new C69011Ncn(r2, r6, f4));
                    i3 = i4;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        r83.A05(A0R);
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = mzF.A0H;
        Context context = roundedCornerConstraintLayout.getContext();
        int A02 = AnonymousClass7TG.A02(context);
        int A05 = JTR.A05(context);
        if (recyclerView.A12.size() == 0) {
            recyclerView.A11(new AnonymousClass3V7(A05, A05));
        }
        recyclerView.setVisibility(0);
        roundedCornerConstraintLayout.setPadding(0, A02, 0, A02);
    }

    public final void A03(TextView textView, String str) {
        0qQ.A0B(textView, 0);
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (r6.size() < 3) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass0iw r27, com.instagram.common.session.UserSession r28, X.C68048MzF r29, java.util.List r30) {
        /*
            r26 = this;
            r5 = 0
            r10 = 2
            r9 = 3
            r11 = 4
            r12 = r29
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r12.A0B
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r12.A0D
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r12.A0E
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r12.A0C
            com.instagram.common.ui.widget.imageview.IgImageView[] r0 = new com.instagram.common.ui.widget.imageview.IgImageView[]{r8, r3, r2, r7}
            java.util.List r4 = X.0sr.A1P(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r14 = r12.A0H
            android.content.Context r0 = X.JTP.A0C(r14, r5)
            int r13 = X.AnonymousClass7TG.A02(r0)
            r6 = r30
            if (r30 == 0) goto L_0x0031
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0031
            int r0 = r6.size()
            r1 = 0
            if (r0 >= r9) goto L_0x0032
        L_0x0031:
            r1 = r13
        L_0x0032:
            r14.setPadding(r5, r13, r5, r1)
            if (r30 == 0) goto L_0x00fc
            int r0 = r6.size()
            if (r0 < r9) goto L_0x00fc
            int r0 = r6.size()
            r13 = r27
            r14 = r28
            if (r0 == r9) goto L_0x00a1
            if (r0 != r11) goto L_0x0113
            int r0 = A00(r12)
            float r1 = (float) r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            int r1 = (int) r1
            float r0 = (float) r1
            r19 = 1071877689(0x3fe38e39, float:1.7777778)
            float r0 = r0 * r19
            int r0 = (int) r0
            X.0nA.A0g(r8, r1, r0)
            X.0nA.A0g(r3, r1, r0)
            X.0nA.A0g(r2, r1, r0)
            X.0nA.A0g(r7, r1, r0)
            X.2HY r0 = new X.2HY
            r0.<init>(r5, r9)
            java.util.Iterator r2 = r0.iterator()
        L_0x006e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0113
            r0 = r2
            X.0sh r0 = (X.0sh) r0
            int r1 = r0.A00()
            java.lang.Object r15 = r4.get(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r15 = (com.instagram.common.ui.widget.imageview.IgImageView) r15
            java.lang.Object r0 = r6.get(r1)
            X.1Xj r0 = (X.1Xj) r0
            boolean r25 = X.AnonymousClass7TF.A1U(r5, r15, r0)
            r11 = 0
            r12 = r11
            r17 = r11
            r18 = r11
            r20 = r5
            r21 = r1
            r22 = r5
            r23 = r5
            r24 = r5
            r16 = r0
            X.C321466uD.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x006e
        L_0x00a1:
            int r0 = A00(r12)
            float r1 = (float) r0
            r0 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            X.0nA.A0g(r8, r0, r0)
            X.0nA.A0g(r3, r0, r0)
            X.0nA.A0g(r2, r0, r0)
            X.2HY r0 = new X.2HY
            r0.<init>(r5, r10)
            java.util.Iterator r3 = r0.iterator()
        L_0x00bc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f3
            r0 = r3
            X.0sh r0 = (X.0sh) r0
            int r2 = r0.A00()
            java.lang.Object r1 = r4.get(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            java.lang.Object r0 = r6.get(r2)
            X.1Xj r0 = (X.1Xj) r0
            r19 = 1065353216(0x3f800000, float:1.0)
            X.AnonymousClass7TF.A1H(r1, r0)
            r11 = 0
            r12 = r11
            r15 = r1
            r16 = r0
            r17 = r11
            r18 = r11
            r20 = r5
            r21 = r2
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r5
            X.C321466uD.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00bc
        L_0x00f3:
            X.0qQ.A0B(r7, r5)
            r0 = 8
            r7.setVisibility(r0)
            return
        L_0x00fc:
            java.util.Iterator r2 = r4.iterator()
        L_0x0100:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0113
            android.view.View r1 = X.JTO.A0H(r2)
            X.0qQ.A0B(r1, r5)
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0100
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67421Mnc.A04(X.0iw, com.instagram.common.session.UserSession, X.MzF, java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public static final void A01(Drawable drawable, C68048MzF mzF) {
        Integer num = AnonymousClass05K.A00;
        if (mzF.A00 != num) {
            mzF.A09.setVisibility(0);
            mzF.A0F.setVisibility(8);
            mzF.A00 = num;
        }
        IgImageView A002 = mzF.A00();
        A002.setImageDrawable(drawable);
        Context context = mzF.A00().getContext();
        Context context2 = A002.getContext();
        DbX.A12(context, A002, 2Yu.A0B(context2));
        int A02 = AnonymousClass7TG.A02(context2);
        A002.setPadding(A02, A02, A02, A02);
    }

    public static final int A00(C68048MzF mzF) {
        Context A07 = DbS.A07(mzF);
        0qQ.A0A(A07);
        return (0nA.A09(A07) - (AnonymousClass7TG.A02(A07) * 2)) - (A07.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing) * 2);
    }
}
