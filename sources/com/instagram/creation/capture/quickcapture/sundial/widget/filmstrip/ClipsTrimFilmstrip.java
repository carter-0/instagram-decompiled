package com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip;

import X.0nA;
import X.0qQ;
import X.AnonymousClass8HH;
import X.C352308Cv;
import X.C355308Pm;
import X.C355368Ps;
import X.C355438Pz;
import X.C41236AqY;
import X.C66579MXk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class ClipsTrimFilmstrip extends ConstraintLayout implements AnonymousClass8HH {
    public int A00;
    public int A01;
    public C352308Cv A02;
    public boolean A03;
    public final Animation A04;
    public final Animation A05;
    public final IgTextView A06;
    public final FilmstripTimelineView A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsTrimFilmstrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A0D(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A03 = true;
        0nA.A0p(this.A07, new C41236AqY(this, i, i2, i3, i4));
    }

    private final int A00(float f) {
        C355308Pm r0 = this.A07.A0B;
        return (int) (((r0.getWidthScrollXPercent() * f) + r0.getScrollXPercent()) * ((float) this.A00));
    }

    public static final void A01(ClipsTrimFilmstrip clipsTrimFilmstrip) {
        if (clipsTrimFilmstrip.A03) {
            FilmstripTimelineView filmstripTimelineView = clipsTrimFilmstrip.A07;
            C355368Ps r8 = filmstripTimelineView.A0A;
            long A002 = (long) (clipsTrimFilmstrip.A00(r8.getRightTrimmerValue()) - clipsTrimFilmstrip.A00(r8.getLeftTrimmerValue()));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            IgTextView igTextView = clipsTrimFilmstrip.A06;
            String format = String.format(C66579MXk.A00(44), Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(A002) % 60), Long.valueOf(timeUnit.toSeconds(A002) % 60), Long.valueOf((A002 / 10) % 100)}, 3));
            0qQ.A07(format);
            igTextView.setText(format);
            float width = (float) igTextView.getWidth();
            FrameLayout frameLayout = filmstripTimelineView.A08;
            int left = frameLayout.getLeft();
            float f = (float) left;
            igTextView.setTranslationX(Math.min(((float) frameLayout.getRight()) - width, Math.max(f, (((float) ((filmstripTimelineView.A06 + filmstripTimelineView.A05) + left)) + (((float) filmstripTimelineView.getMaxSelectedFilmstripWidth()) * ((r8.getRightTrimmerValue() + r8.getLeftTrimmerValue()) / 2.0f))) - (width / 2.0f))));
        }
    }

    public final void DNK(float f, float f2) {
        C352308Cv r1 = this.A02;
        if (r1 != null) {
            r1.DNN(A00(this.A07.A0A.getLeftTrimmerValue()));
        }
        C352308Cv r12 = this.A02;
        if (r12 != null) {
            r12.Dfv(A00(this.A07.A0A.getRightTrimmerValue()));
        }
        A01(this);
    }

    public final void DNM(float f) {
        C352308Cv r1 = this.A02;
        if (r1 != null) {
            r1.DNN(A00(this.A07.A0A.getLeftTrimmerValue()));
        }
        A01(this);
    }

    public final void Dfu(float f) {
        C352308Cv r1 = this.A02;
        if (r1 != null) {
            r1.Dfv(A00(this.A07.A0A.getRightTrimmerValue()));
        }
        A01(this);
    }

    public final void DiR(float f) {
        C352308Cv r1 = this.A02;
        if (r1 != null) {
            r1.DiS(A00(f));
        }
    }

    public final void Dsh(boolean z) {
        if (z && this.A03) {
            IgTextView igTextView = this.A06;
            if (igTextView.getVisibility() == 0) {
                igTextView.setVisibility(8);
                igTextView.clearAnimation();
                igTextView.startAnimation(this.A05);
            }
        }
        C352308Cv r0 = this.A02;
        if (r0 != null) {
            r0.Dsh(z);
        }
    }

    public final void Dsj(boolean z) {
        C352308Cv r0 = this.A02;
        if (r0 != null) {
            r0.Dsj(z);
        }
        if (z && this.A03) {
            IgTextView igTextView = this.A06;
            if (igTextView.getVisibility() == 8) {
                igTextView.setVisibility(0);
                igTextView.clearAnimation();
                igTextView.startAnimation(this.A04);
                A01(this);
            }
        }
    }

    public final void E0X(float f) {
        C352308Cv r1 = this.A02;
        if (r1 != null) {
            r1.DNN(A00(this.A07.A0A.getLeftTrimmerValue()));
        }
        C352308Cv r12 = this.A02;
        if (r12 != null) {
            r12.Dfv(A00(this.A07.A0A.getRightTrimmerValue()));
        }
    }

    public final FilmstripTimelineView getFilmstripTimelineView() {
        return this.A07;
    }

    public final C352308Cv getListener() {
        return this.A02;
    }

    public final int getTotalWidth() {
        return this.A01;
    }

    public final void setSeekPosition(int i) {
        FilmstripTimelineView filmstripTimelineView = this.A07;
        C355308Pm r1 = filmstripTimelineView.A0B;
        filmstripTimelineView.setSeekPosition(((((float) i) / ((float) this.A00)) - r1.getScrollXPercent()) / r1.getWidthScrollXPercent());
    }

    public final void setListener(C352308Cv r1) {
        this.A02 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsTrimFilmstrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_clips_trim_filmstrip, this, true);
        0qQ.A07(inflate);
        IgTextView requireViewById = inflate.requireViewById(R.id.clips_trim_filmstrip_time_indicator);
        this.A06 = requireViewById;
        0nA.A0p(requireViewById, new C355438Pz(this));
        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) inflate.requireViewById(R.id.clips_trim_filmstrip_view);
        this.A07 = filmstripTimelineView;
        filmstripTimelineView.A00 = this;
        filmstripTimelineView.A03(true, false, false);
        int integer = context.getResources().getInteger(17694721);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A04 = alphaAnimation;
        long j = (long) integer;
        alphaAnimation.setDuration(j);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A05 = alphaAnimation2;
        alphaAnimation2.setDuration(j);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        C355308Pm r0 = filmstripTimelineView.A0B;
        r0.A0C = true;
        r0.A00 = 0.0f;
        r0.invalidate();
        filmstripTimelineView.setTrimmerMaximumRange(1.0f);
        filmstripTimelineView.A01(0.0f, 1.0f);
        filmstripTimelineView.setScrollXMargin(dimensionPixelSize);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClipsTrimFilmstrip(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
