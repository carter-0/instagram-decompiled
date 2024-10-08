package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

public final class M6F implements Runnable {
    public final /* synthetic */ Medium A00;
    public final /* synthetic */ LRF A01;

    public M6F(Medium medium, LRF lrf) {
        this.A01 = lrf;
        this.A00 = medium;
    }

    public final void run() {
        LRF lrf = this.A01;
        ClipsTrimFilmstrip clipsTrimFilmstrip = lrf.A0E;
        Medium medium = this.A00;
        int i = lrf.A05 * IgNetworkConsentStorage.MAX_ENTRIES;
        int min = Math.min(medium.A03, i * 2);
        int min2 = Math.min(i, min);
        int min3 = Math.min(lrf.A06, min);
        lrf.A01 = 0;
        lrf.A00 = min2;
        FilmstripTimelineView filmstripTimelineView = clipsTrimFilmstrip.A07;
        float f = (float) min2;
        float f2 = (float) min;
        filmstripTimelineView.setTrimmerMaximumRange(f / f2);
        filmstripTimelineView.setTrimmerMinimumRange(((float) min3) / f2);
        filmstripTimelineView.setScrollXPercent(0.0f);
        clipsTrimFilmstrip.A02 = new C65118Lng(lrf);
        clipsTrimFilmstrip.A0D(medium.A03, min, lrf.A01, lrf.A00);
        Context context = lrf.A08.getContext();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
        UserSession userSession = lrf.A0B;
        C64137LPm.A00(context, lrf.A0A, userSession, filmstripTimelineView, LKM.A01(medium.A0X, (String) null, medium.A03), "trim", (clipsTrimFilmstrip.A01 / dimensionPixelSize2) + 1, dimensionPixelSize2, dimensionPixelSize);
    }
}
