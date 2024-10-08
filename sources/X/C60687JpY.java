package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.JpY  reason: case insensitive filesystem */
public class C60687JpY extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final CircularImageView A0A;
    public final GradientSpinner A0B;
    public final L9P A0C;
    public final int A0D;
    public final int A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60687JpY(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = view;
        this.A00 = view.findViewById(R.id.comment_container);
        this.A0A = (CircularImageView) view.findViewById(R.id.user_imageview);
        this.A05 = view.findViewById(R.id.user_image_container);
        this.A0B = (GradientSpinner) view.findViewById(R.id.user_profile_gradient_spinner);
        this.A06 = (LinearLayout) view.findViewById(R.id.comment_text_container);
        this.A08 = AnonymousClass7TE.A0d(view, R.id.comment_text_title);
        this.A03 = view.findViewById(R.id.comment_text_title_container);
        this.A07 = AnonymousClass7TE.A0d(view, R.id.comment_text_subtitle);
        this.A02 = view.findViewById(R.id.comment_text_subtitle_container);
        this.A09 = AnonymousClass7TE.A0d(view, R.id.comment_text_posting);
        this.A0C = new L9P(view);
        this.A01 = view.findViewById(R.id.comment_pin_icon);
        Context context = view.getContext();
        this.A0E = context.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
        this.A0D = AnonymousClass7TE.A0A(context);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public void A00() {
        View view = this.A04;
        DbX.A0G(view).setMarginEnd(DbU.A05(view).getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding));
        view.setAlpha(1.0f);
        this.A05.setVisibility(0);
        ? r1 = this.A0A;
        r1.setBackground((Drawable) null);
        r1.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r1.setPadding(0, 0, 0, 0);
        this.A0B.setVisibility(4);
        this.A00.setBackground((Drawable) null);
        this.A08.setVisibility(8);
        TextView textView = this.A07;
        textView.setTextSize(0, (float) this.A0E);
        textView.setTextColor(this.A0D);
        L9P l9p = this.A0C;
        l9p.A04.setVisibility(8);
        l9p.A02.setVisibility(8);
        l9p.A00.setVisibility(8);
        l9p.A03.setVisibility(8);
        l9p.A01.setVisibility(8);
    }
}
