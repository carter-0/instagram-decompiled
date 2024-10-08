package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.OTf  reason: case insensitive filesystem */
public final class C70958OTf {
    public static final int[] A05 = {R.id.bottom_context, R.id.megaphone_social_context_facepile, R.id.megaphone_social_context_text, R.id.megaphone_icon};
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgFrameLayout A04;

    public C70958OTf(View view, C66764Mc9 mc9) {
        this.A00 = view;
        this.A03 = C66582MXn.A0F(view);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.message);
        this.A01 = DbX.A0J(view, R.id.dismiss_button);
        this.A04 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.button_placeholder);
        DbX.A1B(view, R.id.button_placeholder);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        TextView textView = this.A03;
        textView.setText(2131974952);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(8388611);
        TextView textView2 = this.A02;
        textView2.setText(2131974951);
        textView2.setLayoutParams(layoutParams);
        textView2.setGravity(8388611);
        ImageView imageView = this.A01;
        DbU.A12(imageView.getContext(), imageView, 2131960863);
        C71402Ok1.A00(imageView, 36, mc9);
        C71402Ok1 ok1 = new C71402Ok1((Object) mc9, 35);
        IgFrameLayout igFrameLayout = this.A04;
        View A0A = C66583MXo.A0A(DbV.A0D(igFrameLayout), igFrameLayout, R.layout.generic_v3_megaphone_one_button_primary);
        TextView A0R = AnonymousClass7TG.A0R(A0A, R.id.primary_button);
        A0R.setText(2131974950);
        A0R.setVisibility(0);
        AnonymousClass0fU.A00(ok1, A0R);
        IgFrameLayout igFrameLayout2 = this.A04;
        igFrameLayout2.setVisibility(0);
        igFrameLayout2.setPadding(igFrameLayout2.getPaddingLeft(), igFrameLayout2.getPaddingTop(), igFrameLayout2.getPaddingRight(), igFrameLayout2.getPaddingBottom());
        igFrameLayout2.addView(A0A);
        ImageView imageView2 = this.A01;
        C66581MXm.A1C(imageView2, C66581MXm.A02(imageView2.getContext()));
    }
}
