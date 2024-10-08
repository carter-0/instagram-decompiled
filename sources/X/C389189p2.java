package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.instagram.android.R;

/* renamed from: X.9p2  reason: invalid class name and case insensitive filesystem */
public final class C389189p2 extends AnonymousClass3O7 {
    public float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final Paint A0B;
    public final RectF A0C = AnonymousClass7TE.A0Y();

    public C389189p2(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.A0B = paint;
        Resources resources = getResources();
        this.A07 = (resources.getDimension(R.dimen.direct_standard_xma_grid_view_height) / 2.0f) + resources.getDimension(R.dimen.account_recs_header_image_margin);
        this.A06 = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A01 = resources.getDimension(R.dimen.account_discovery_bottom_gap);
        this.A02 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
        this.A03 = resources.getDimension(R.dimen.hashtag_feed_header_follow_button_placeholder_width);
        this.A0A = 2Yu.A0G(context, R.attr.igdsButtonHeight);
        this.A05 = resources.getDimension(R.dimen.avatar_reel_ring_size_xxxxlarge);
        this.A04 = resources.getDimension(R.dimen.hashtag_feed_header_followers_placeholder_height);
        this.A09 = resources.getDimension(R.dimen.hashtag_feed_header_top_posts_placeholder_width);
        this.A08 = resources.getDimension(R.dimen.account_discovery_bottom_gap);
        this.A00 = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A04(context));
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        float f = this.A06;
        float f2 = this.A07;
        float f3 = f + f2;
        float A022 = (AnonymousClass7TE.A02(this) - (2.0f * f3)) - f;
        canvas.drawCircle(f3, f3, f2, this.A0B);
        A00(canvas2, this.A05, this.A04, f3, A022);
        A00(canvas2, this.A03, (float) this.A0A, f3, A022);
        A00(canvas2, this.A09, this.A08, f3, A022);
        this.A00 = getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    private final void A00(Canvas canvas, float f, float f2, float f3, float f4) {
        float f5 = ((f3 * 2.0f) + (f4 / 2.0f)) - (f / 2.0f);
        RectF rectF = this.A0C;
        float f6 = this.A00;
        rectF.set(f5, f6, f + f5, f6 + f2);
        float f7 = this.A02;
        canvas.drawRoundRect(rectF, f7, f7, this.A0B);
        this.A00 += f2 + this.A01;
    }
}
