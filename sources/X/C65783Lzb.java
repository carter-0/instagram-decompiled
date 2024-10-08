package X;

import android.view.View;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.Lzb  reason: case insensitive filesystem */
public final class C65783Lzb implements C355298Pl {
    public final /* synthetic */ LF9 A00;

    public final int AEW(FilmstripTimelineView filmstripTimelineView, C355308Pm r3, int i) {
        0qQ.A0B(r3, 2);
        C355298Pl r0 = C60691Jpc.A0B;
        if (r0 != null) {
            return r0.AEW(filmstripTimelineView, r3, i);
        }
        return r3.A06;
    }

    public C65783Lzb(LF9 lf9) {
        this.A00 = lf9;
    }

    public final int AEj(FilmstripTimelineView filmstripTimelineView, C355308Pm r4, int i) {
        return View.MeasureSpec.makeMeasureSpec((int) this.A00.A00(), SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final int Br6() {
        C355298Pl r0 = C60691Jpc.A0B;
        if (r0 != null) {
            return r0.Br6();
        }
        return 0;
    }

    public final int Br8() {
        C355298Pl r0 = C60691Jpc.A0B;
        if (r0 != null) {
            return r0.Br8();
        }
        return 0;
    }
}
