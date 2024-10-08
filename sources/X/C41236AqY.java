package X;

import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.AqY  reason: case insensitive filesystem */
public final class C41236AqY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ ClipsTrimFilmstrip A04;

    public C41236AqY(ClipsTrimFilmstrip clipsTrimFilmstrip, int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A04 = clipsTrimFilmstrip;
        this.A03 = i3;
        this.A02 = i4;
    }

    public final void run() {
        float f = ((float) this.A00) / ((float) this.A01);
        ClipsTrimFilmstrip clipsTrimFilmstrip = this.A04;
        FilmstripTimelineView filmstripTimelineView = clipsTrimFilmstrip.A07;
        int maxSelectedFilmstripWidth = (int) (((float) filmstripTimelineView.getMaxSelectedFilmstripWidth()) * f);
        clipsTrimFilmstrip.A01 = maxSelectedFilmstripWidth;
        filmstripTimelineView.setFilmstripTimelineWidth(maxSelectedFilmstripWidth);
        float f2 = (float) this.A03;
        float f3 = (float) clipsTrimFilmstrip.A00;
        C355308Pm r0 = filmstripTimelineView.A0B;
        float scrollXPercent = r0.getScrollXPercent();
        float widthScrollXPercent = r0.getWidthScrollXPercent();
        filmstripTimelineView.A01(((f2 / f3) - scrollXPercent) / widthScrollXPercent, ((((float) this.A02) / f3) - scrollXPercent) / widthScrollXPercent);
    }
}
