package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vom  reason: case insensitive filesystem */
public abstract class C18272Vom {
    public static final void A01(AnonymousClass0iw r4, ImageUrl imageUrl, C17543VZw vZw, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(vZw, 0);
        int i = 0;
        View view = vZw.A01;
        if (z2) {
            view.setVisibility(8);
            vZw.A02.setVisibility(0);
            if (imageUrl != null) {
                ((IgImageView) AnonymousClass7TE.A14(vZw.A03)).setUrl(imageUrl, r4);
            }
            A00(AnonymousClass7TH.A06(vZw.A03), z4);
            JTS.A1W(vZw.A04, 8);
        } else if (z) {
            view.setVisibility(0);
            vZw.A02.setVisibility(0);
            AnonymousClass0eM r1 = vZw.A04;
            JTS.A1W(r1, 0);
            if (imageUrl != null) {
                ((IgImageView) AnonymousClass7TE.A14(vZw.A03)).setUrl(imageUrl, r4);
            }
            A00(AnonymousClass7TH.A06(vZw.A03), z4);
            JTQ.A0A(r1).setText(str);
            View A06 = AnonymousClass7TH.A06(r1);
            if (z3) {
                i = vZw.A00.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
            }
            0nA.A0b(A06, i);
        } else {
            view.setVisibility(8);
            vZw.A02.setVisibility(8);
        }
    }

    public static final void A00(View view, boolean z) {
        int dimensionPixelSize;
        Resources resources = view.getResources();
        if (z) {
            dimensionPixelSize = JTP.A03(resources);
            0nA.A0d(view, dimensionPixelSize);
            0nA.A0U(view, dimensionPixelSize);
        } else {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material);
            0nA.A0d(view, dimensionPixelSize2);
            0nA.A0U(view, dimensionPixelSize2);
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        }
        0nA.A0e(view, dimensionPixelSize);
        0nA.A0T(view, dimensionPixelSize);
    }
}
