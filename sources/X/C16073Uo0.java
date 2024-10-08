package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Uo0  reason: case insensitive filesystem */
public final class C16073Uo0 extends AnonymousClass52D {
    public final IgTextView A00;
    public final IgTextView A01;

    public final void A00(1sU r1) {
    }

    public final void A01(AnonymousClass523 r6) {
        int i;
        this.A00 = r6;
        boolean A06 = 182.A06(0Tu.A05, r6.A06, 36320820435362689L);
        IgTextView igTextView = this.A00;
        if (A06) {
            0qQ.A0B(igTextView, 0);
            i = R.style.PrivacyTextStyle;
        } else {
            0qQ.A0B(igTextView, 0);
            i = R.style.igds_body_1;
        }
        igTextView.setTextAppearance(i);
    }

    public final void A02(String str, View.OnClickListener onClickListener) {
    }

    public final void A03(String str, View.OnClickListener onClickListener) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r5.length() == 0) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.instagram.common.ui.base.IgTextView r3 = r4.A01
            r3.setText(r5)
            r2 = 0
            if (r5 == 0) goto L_0x000f
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x0011
        L_0x000f:
            r0 = 8
        L_0x0011:
            r3.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A00
            r1.setText(r6)
            if (r6 == 0) goto L_0x0021
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0023
        L_0x0021:
            r2 = 8
        L_0x0023:
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16073Uo0.A04(java.lang.String, java.lang.String):void");
    }

    public C16073Uo0(IgTextView igTextView, IgTextView igTextView2) {
        AnonymousClass7TG.A1O(igTextView, igTextView2);
        this.A01 = igTextView;
        this.A00 = igTextView2;
    }
}
