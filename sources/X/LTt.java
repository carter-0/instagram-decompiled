package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

public final class LTt implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ LF9 A00;
    public final /* synthetic */ LF9 A01;
    public final /* synthetic */ LF9 A02;
    public final /* synthetic */ LF9 A03;
    public final /* synthetic */ C65783Lzb A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0rm A07;

    public LTt(LF9 lf9, LF9 lf92, LF9 lf93, LF9 lf94, C65783Lzb lzb, C62320sa r6, C62320sa r7, 0rm r8) {
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = lf9;
        this.A00 = lf92;
        this.A01 = lf93;
        this.A02 = lf94;
        this.A04 = lzb;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Number number;
        0qQ.A0B(valueAnimator, 0);
        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) this.A05.invoke();
        if (filmstripTimelineView != null) {
            0rm r1 = this.A07;
            LF9 lf9 = this.A03;
            LF9 lf92 = this.A00;
            LF9 lf93 = this.A01;
            LF9 lf94 = this.A02;
            C65783Lzb lzb = this.A04;
            C62320sa r0 = (C62320sa) r1.A00;
            if (r0 != null) {
                r0.invoke();
            }
            r1.A00 = null;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                float floatValue = number.floatValue();
                lf9.A01(floatValue, AnonymousClass7TE.A02(filmstripTimelineView));
                lf92.A01(floatValue, AnonymousClass7TE.A02(filmstripTimelineView.A0B));
                lf93.A01(floatValue, filmstripTimelineView.getScaleX());
                lf94.A01(floatValue, filmstripTimelineView.getScaleY());
                filmstripTimelineView.setMeasureSpecBuilder(lzb);
                filmstripTimelineView.setFilmstripTimelineWidth((int) lf92.A00());
                filmstripTimelineView.setScaleX(lf93.A00());
                filmstripTimelineView.setScaleY(lf94.A00());
            }
        }
        this.A06.invoke();
    }
}
