package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Hc5  reason: case insensitive filesystem */
public abstract class C55096Hc5 {
    public static final void A00(AnonymousClass0iw r6, ImageUrl imageUrl, C53150GjM gjM, Long l, String str, String str2, C62320sa r12, C62320sa r13, C62320sa r14, C62320sa r15, int i, boolean z, boolean z2, boolean z3) {
        String valueOf;
        0qQ.A0B(r6, 9);
        Context A07 = DbS.A07(gjM);
        if (imageUrl != null) {
            gjM.A08.setUrl(imageUrl, r6);
        }
        gjM.A07.setText(str);
        IgTextView igTextView = gjM.A06;
        String str3 = null;
        if (l != null) {
            str3 = DbW.A0h(A07, 1G0.A09(AnonymousClass7TF.A0A(A07), (double) l.longValue()), 2131974400);
        }
        igTextView.setText(str3);
        gjM.A03.setText(str2);
        IgTextView igTextView2 = gjM.A05;
        C56802ICz.A01(igTextView2, 26, r12);
        1QE.A0H(igTextView2, igTextView2);
        View view = gjM.A02;
        C56802ICz.A01(view, 27, r14);
        C56802ICz.A01(gjM.A00, 28, r15);
        if (z) {
            View view2 = gjM.A01;
            Resources resources = view2.getResources();
            0nA.A0U(view2, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
            0nA.A0U(view, 0);
            view2.setVisibility(0);
            C56802ICz.A01(view2, 29, r13);
            view2.setSelected(z2);
            if (z3) {
                0nA.A0T(view2, 0);
                int i2 = i;
                if (i2 > 99) {
                    valueOf = A07.getString(2131974392);
                } else {
                    valueOf = String.valueOf(i2);
                }
                0qQ.A0A(valueOf);
                IgTextView igTextView3 = gjM.A04;
                igTextView3.setVisibility(0);
                igTextView3.setText(valueOf);
                C56802ICz.A01(igTextView3, 30, r13);
                return;
            }
            0nA.A0T(view2, resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            gjM.A04.setVisibility(8);
        }
    }
}
