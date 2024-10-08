package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.8Pk  reason: invalid class name and case insensitive filesystem */
public final class C355288Pk implements C355298Pl {
    public final int A00;
    public final int A01;

    public final int AEW(FilmstripTimelineView filmstripTimelineView, C355308Pm r4, int i) {
        0qQ.A0B(r4, 2);
        return View.MeasureSpec.makeMeasureSpec(r4.A06 + filmstripTimelineView.getAdditionalHeightFromSeekbar(), SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final int AEj(FilmstripTimelineView filmstripTimelineView, C355308Pm r2, int i) {
        return i;
    }

    public final int Br6() {
        return this.A00;
    }

    public final int Br8() {
        return this.A01;
    }

    public C355288Pk(FilmstripTimelineView filmstripTimelineView) {
        Resources resources = filmstripTimelineView.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right) + resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A00 = dimensionPixelSize;
        this.A01 = dimensionPixelSize;
    }
}
