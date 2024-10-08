package X;

import androidx.fragment.app.Fragment;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

public final class M9D implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ FilmstripTimelineView A01;
    public final /* synthetic */ C3516889w A02;

    public M9D(Fragment fragment, FilmstripTimelineView filmstripTimelineView, C3516889w r3) {
        this.A02 = r3;
        this.A00 = fragment;
        this.A01 = filmstripTimelineView;
    }

    public final void run() {
        DbV.A1F(this.A00, this.A02.A06, new MP8(this.A01, 19), 53);
    }
}
