package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.9Yv  reason: invalid class name and case insensitive filesystem */
public final class C380609Yv extends C249703kE {
    public 1Xj A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final View A0B;
    public final UserSession A0C;
    public final IgImageView A0D;
    public final IgImageView A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;

    public static void A00(Medium medium, C380609Yv r16) {
        C380609Yv r3 = r16;
        IgImageView igImageView = r3.A0D;
        Context context = r3.A0A;
        1Xj r0 = r3.A00;
        r0.getClass();
        ExtendedImageUrl A1n = r0.A1n(context);
        int i = r3.A06;
        int i2 = r3.A0F;
        C354668Mx r9 = C354668Mx.RECTANGLE;
        AnonymousClass7TF.A1B(context, 1, medium);
        igImageView.setImageDrawable(new C369908vW(context, (Bitmap) null, medium, A1n, r9, (Integer) null, i, i2, false, true, false, false));
        igImageView.getLayoutParams().width = r3.A0H;
        igImageView.getLayoutParams().height = r3.A0G;
    }

    public C380609Yv(Context context, GradientDrawable gradientDrawable, View view, UserSession userSession) {
        super(view);
        this.A0A = context;
        this.A0C = userSession;
        View requireViewById = view.requireViewById(R.id.canvas_memories_item_container);
        this.A0B = requireViewById;
        this.A0E = view.requireViewById(R.id.canvas_memories_title_image);
        this.A0D = view.requireViewById(R.id.canvas_memories_image);
        this.A06 = 0nA.A09(context);
        this.A0F = 0nA.A08(context);
        0qQ.A0B(requireViewById, 0);
        requireViewById.setBackground(gradientDrawable);
        Resources resources = context.getResources();
        this.A08 = resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        this.A07 = resources.getDimensionPixelSize(R.dimen.memory_subtitle_text_size);
        this.A09 = AnonymousClass7TE.A0F(resources);
        this.A03 = resources.getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
        this.A02 = resources.getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
        this.A04 = resources.getDimensionPixelSize(R.dimen.ad_tag_max_width);
        this.A01 = resources.getDimensionPixelOffset(R.dimen.achievements_list_container_height);
        this.A05 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_width);
        this.A0H = resources.getDimensionPixelSize(R.dimen.alignment_guide_default_vertical_margin);
        this.A0G = resources.getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
    }
}
