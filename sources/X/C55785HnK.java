package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.instagram.android.R;

/* renamed from: X.HnK  reason: case insensitive filesystem */
public final class C55785HnK {
    public final int A00;
    public final int A01;
    public final LinearLayout A02;
    public final String A03;

    public C55785HnK(View view) {
        int i = C316216lI.A0B(AnonymousClass7TE.A0S(view)) ? R.id.reel_type_selector_stub_above_toolbar : R.id.reel_type_selector_stub;
        ViewParent parent = view.getParent();
        0qQ.A0C(parent, AnonymousClass000.A00(0));
        View A0F = DbY.A0F((View) parent, i);
        0qQ.A0C(A0F, C273654mx.A00(1));
        LinearLayout linearLayout = (LinearLayout) A0F;
        this.A02 = linearLayout;
        Resources resources = linearLayout.getResources();
        Context context = linearLayout.getContext();
        this.A01 = context.getColor(R.color.bright_foreground_disabled_material_dark);
        this.A00 = context.getColor(R.color.design_dark_default_color_on_background);
        this.A03 = resources.getString(2131974348);
    }
}
