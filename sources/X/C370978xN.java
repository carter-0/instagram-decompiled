package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bubblespinner.BubbleSpinner;

/* renamed from: X.8xN  reason: invalid class name and case insensitive filesystem */
public final class C370978xN {
    public int A00 = -1;
    public AnonymousClass87G A01;
    public final GradientDrawable A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgImageView A09;
    public final C231672s5 A0A;
    public final BubbleSpinner A0B;
    public final Handler A0C = new Handler();
    public final C342277oK A0D;

    public C370978xN(View view, C342277oK r6, AnonymousClass875 r7) {
        float dimension;
        0qQ.A0B(view, 1);
        this.A05 = view;
        this.A0D = r6;
        IgImageView requireViewById = view.requireViewById(R.id.ar_effect_in_tray_icon);
        0qQ.A07(requireViewById);
        IgImageView igImageView = requireViewById;
        this.A07 = igImageView;
        this.A03 = view.findViewById(R.id.empty_ar_effect_in_tray_icon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A02 = gradientDrawable;
        Resources resources = view.getContext().getResources();
        if (r6 != null) {
            dimension = resources.getDimension(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height) / 2.0f;
        } else {
            dimension = resources.getDimension(R.dimen.action_bar_item_spacing_right);
        }
        gradientDrawable.setCornerRadius(dimension);
        this.A0B = (BubbleSpinner) view.findViewById(R.id.face_effect_loading_indicator);
        this.A06 = (ImageView) view.findViewById(R.id.camera_mq_button_badge);
        this.A08 = view.findViewById(R.id.camera_mq_deactivated);
        this.A09 = view.findViewById(R.id.face_effect_selected);
        this.A04 = view.findViewById(R.id.effect_icon_background);
        igImageView.setRequestStartListener(new C370988xO(this));
        igImageView.A0E = new C371008xQ(this);
        C371018xR r0 = new C371018xR(r7, this);
        this.A0A = r0;
        igImageView.A0I = r0;
    }

    public final void A00() {
        C342277oK r2 = this.A0D;
        if (r2 != null) {
            IgImageView igImageView = this.A07;
            Drawable background = igImageView.getBackground();
            0qQ.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            float f = r2.A02 / 2.0f;
            ((GradientDrawable) background).setCornerRadius(f);
            Drawable drawable = igImageView.getDrawable();
            if (drawable != null && (drawable instanceof AnonymousClass8DV)) {
                ((AnonymousClass8DV) drawable).A02(f);
            }
        }
    }
}
