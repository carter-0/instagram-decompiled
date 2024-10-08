package X;

import android.content.Context;
import android.view.View;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.Agg  reason: case insensitive filesystem */
public final class C40666Agg implements C355298Pl {
    public final int A00;
    public final int A01;

    public C40666Agg(Context context, int i) {
        this.A00 = i;
        this.A01 = AnonymousClass7TE.A0D(context.getResources());
    }

    public final int AEW(FilmstripTimelineView filmstripTimelineView, C355308Pm r5, int i) {
        int i2 = this.A00;
        0qQ.A0B(r5, 2);
        int additionalHeightFromSeekbar = r5.A06 + filmstripTimelineView.getAdditionalHeightFromSeekbar();
        if (i2 == 0) {
            filmstripTimelineView.setPivotY(((float) additionalHeightFromSeekbar) / 2.0f);
        }
        return View.MeasureSpec.makeMeasureSpec(additionalHeightFromSeekbar, SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final int AEj(FilmstripTimelineView filmstripTimelineView, C355308Pm r5, int i) {
        int i2;
        if (this.A00 != 0) {
            0qQ.A0B(r5, 2);
            Context A0S = AnonymousClass7TE.A0S(filmstripTimelineView);
            i2 = AnonymousClass7TF.A0E(A0S).widthPixels - r5.A07;
        } else {
            0qQ.A0B(r5, 2);
            i2 = r5.A07;
        }
        return View.MeasureSpec.makeMeasureSpec(i2, SN3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final int Br6() {
        return this.A01;
    }

    public final int Br8() {
        return this.A01;
    }
}
