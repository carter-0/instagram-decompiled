package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.io.IOException;

public final /* synthetic */ class M4Q implements Runnable {
    public final /* synthetic */ C61440K7p A00;

    public M4Q(C61440K7p k7p) {
        this.A00 = k7p;
    }

    public final void run() {
        C61440K7p k7p = this.A00;
        Context requireContext = k7p.requireContext();
        int dimensionPixelSize = DbV.A05(k7p).getDimensionPixelSize(R.dimen.abc_star_medium);
        int A02 = AnonymousClass7TG.A02(k7p.requireContext());
        int dimensionPixelSize2 = DbV.A05(k7p).getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        try {
            FilmstripTimelineView filmstripTimelineView = k7p.A00;
            if (filmstripTimelineView != null) {
                filmstripTimelineView.setFilmstripTimelineWidth(filmstripTimelineView.getMaxSelectedFilmstripWidth());
                int i = ((DbV.A05(k7p).getDisplayMetrics().widthPixels - (A02 * 2)) / dimensionPixelSize) + 1;
                UserSession A0l = AnonymousClass7TE.A0l(k7p.A03);
                AnonymousClass0eM r1 = k7p.A04;
                LA8 A01 = LKM.A01(JTR.A0o(r1).A00.A0X, (String) null, (int) JTR.A0o(r1).A00());
                FilmstripTimelineView filmstripTimelineView2 = k7p.A00;
                if (filmstripTimelineView2 != null) {
                    C64137LPm.A00(requireContext, k7p, A0l, filmstripTimelineView2, A01, "trim", i, dimensionPixelSize, dimensionPixelSize2);
                    return;
                }
            }
            0qQ.A0F("filmstripView");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            0wb.A03("igtv_upload_canvas_trim_fragment", 002.A0R(e.getMessage(), ": Unable to load thumbnails"));
        }
    }
}
