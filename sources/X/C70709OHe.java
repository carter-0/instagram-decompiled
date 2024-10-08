package X;

import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.OHe  reason: case insensitive filesystem */
public final class C70709OHe {
    public ImageUrl A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.OHe, java.lang.Object] */
    public static C70709OHe A00(ImageUrl imageUrl) {
        Integer valueOf = Integer.valueOf(R.dimen.appreciation_reels_grid_item_width);
        Integer valueOf2 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        Integer valueOf3 = Integer.valueOf(R.dimen.action_bar_item_spacing_left);
        ? obj = new Object();
        obj.A03 = null;
        obj.A00 = imageUrl;
        obj.A06 = null;
        obj.A02 = valueOf;
        obj.A05 = valueOf2;
        obj.A01 = valueOf3;
        obj.A04 = null;
        return obj;
    }
}
