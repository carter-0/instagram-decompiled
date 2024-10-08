package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.Arrays;

/* renamed from: X.4ng  reason: invalid class name and case insensitive filesystem */
public final class C274084ng {
    public C17428VVh A00;
    public final C252063oV A01;
    public final Context A02;

    public final void A00(View view) {
        0qQ.A0B(view, 0);
        C17428VVh vVh = new C17428VVh(view);
        this.A00 = vVh;
        vVh.A02.setVisibility(8);
        Context context = this.A02;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        View view2 = vVh.A00;
        float[] fArr = new float[8];
        Arrays.fill(fArr, ((float) dimensionPixelSize) / 1.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A05(context))));
        view2.setBackground(shapeDrawable);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        view2.setPadding(context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), dimensionPixelSize2, context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness), dimensionPixelSize2);
        ImageView imageView = vVh.A01;
        0nA.A0f(imageView, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
        0nA.A0V(imageView, dimensionPixelSize);
        imageView.setImageDrawable(context.getDrawable(R.drawable.buy_with_prime_bwp_badge));
    }

    public C274084ng(View view) {
        Context context = view.getContext();
        0qQ.A07(context);
        this.A02 = context;
        C252063oV A012 = 2b1.A01(view.findViewById(R.id.row_feed_media_bwp_indicator_stub), false, false);
        this.A01 = A012;
        if (A012.CVM()) {
            A00(A012.getView());
        } else {
            A012.EeU(new C274094nh(this));
        }
    }
}
