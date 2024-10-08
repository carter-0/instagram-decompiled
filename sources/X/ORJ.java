package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public abstract class ORJ {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        r1 = (X.NgI) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C71065Oak r7, X.C67880MwO r8) {
        /*
            android.view.View r3 = r8.itemView
            int r1 = r7.A06
            if (r1 == 0) goto L_0x0012
            android.widget.TextView r0 = r8.A04
            r0.setText(r1)
            android.content.Context r0 = r3.getContext()
            X.DbU.A12(r0, r3, r1)
        L_0x0012:
            java.lang.CharSequence r1 = r7.A09
            if (r1 == 0) goto L_0x001e
            android.widget.TextView r0 = r8.A04
            r0.setText(r1)
            r3.setContentDescription(r1)
        L_0x001e:
            int r0 = r7.A04
            r5 = 8
            if (r0 == 0) goto L_0x00b2
            android.widget.TextView r6 = r8.A02
            r6.setText(r0)
        L_0x0029:
            android.widget.ImageView r2 = r8.A01
            boolean r0 = r7.A0B
            r1 = 0
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
            java.lang.String r0 = r7.A0E
            android.widget.TextView r4 = r8.A03
            if (r0 == 0) goto L_0x00ae
            r4.setVisibility(r1)
            r4.setText(r0)
        L_0x0041:
            r2 = 1
            android.view.View$OnClickListener r0 = r7.A0D
            X.AnonymousClass0fU.A00(r0, r3)
            android.view.View r1 = r8.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            X.2eS.A01(r3)
            android.widget.TextView r5 = r8.A04
            r5.setEnabled(r2)
            r4.setEnabled(r2)
            int r0 = r7.A01
            if (r0 == 0) goto L_0x0060
            r3.setBackgroundColor(r0)
        L_0x0060:
            int r0 = r7.A07
            if (r0 != 0) goto L_0x0068
            int r0 = r7.A02
            if (r0 == 0) goto L_0x0077
        L_0x0068:
            int r4 = r3.getPaddingLeft()
            int r2 = r7.A07
            int r1 = r3.getPaddingRight()
            int r0 = r7.A02
            r3.setPadding(r4, r2, r1, r0)
        L_0x0077:
            int r0 = r7.A03
            if (r0 <= 0) goto L_0x0083
            r6.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r6.setEllipsize(r0)
        L_0x0083:
            boolean r0 = r7 instanceof X.NgI
            if (r0 == 0) goto L_0x009c
            r1 = r7
            X.NgI r1 = (X.NgI) r1
            X.5Gt r0 = r1.A02
            if (r0 == 0) goto L_0x009c
            r0.A03(r5)
            X.PXh r2 = new X.PXh
            r2.<init>(r1)
            int r0 = r1.A00
            long r0 = (long) r0
            r5.postDelayed(r2, r0)
        L_0x009c:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x00ad
            r0 = 2131440283(0x7f0b329b, float:1.8502545E38)
            android.widget.ImageView r1 = X.DbU.A0F(r3, r0)
            r0 = 2131238568(0x7f081ea8, float:1.8093418E38)
            r1.setImageResource(r0)
        L_0x00ad:
            return
        L_0x00ae:
            r4.setVisibility(r5)
            goto L_0x0041
        L_0x00b2:
            java.lang.CharSequence r0 = r7.A08
            android.widget.TextView r6 = r8.A02
            if (r0 == 0) goto L_0x00bd
            r6.setText(r0)
            goto L_0x0029
        L_0x00bd:
            r6.setVisibility(r5)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ORJ.A01(X.Oak, X.MwO):void");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.MwO, X.3kE, java.lang.Object] */
    public static C67880MwO A00(Context context, ViewGroup viewGroup) {
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.row_arrow_item);
        ? r1 = new C249703kE(A0C);
        r1.A00 = A0C;
        r1.A04 = DbU.A0G(A0C, R.id.row_simple_text_title);
        r1.A02 = DbU.A0G(A0C, R.id.row_simple_text_description);
        r1.A01 = DbU.A0F(A0C, R.id.row_address_dot);
        r1.A03 = DbU.A0G(A0C, R.id.row_simple_text_extra_info);
        A0C.setTag(r1);
        return r1;
    }
}
