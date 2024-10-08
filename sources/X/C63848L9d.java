package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.L9d  reason: case insensitive filesystem */
public final class C63848L9d {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C63848L9d(Context context) {
        int dimensionPixelSize;
        this.A02 = JTR.A07(context);
        this.A03 = DbY.A01(context);
        Integer A0J = 2Yu.A0J(context, R.attr.stackedTimelineVideoTrackHeight);
        if (A0J != null) {
            dimensionPixelSize = A0J.intValue();
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_picker_subtitle_margin_bottom);
        }
        this.A05 = dimensionPixelSize;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.clips_editor_stacked_timeline_reorder_mode_thumbnail_height_enlarged);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.avatar_likes_container_width);
    }
}
