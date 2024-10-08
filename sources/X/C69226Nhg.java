package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Nhg  reason: case insensitive filesystem */
public final class C69226Nhg extends C57460Ib4 {
    public C66819MdB A00;
    public C14044Tol A01;
    public Long A02;
    public Runnable A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Context A07;
    public final Drawable A08;
    public final View A09;
    public final View A0A;
    public final SeekBar.OnSeekBarChangeListener A0B;
    public final SeekBar A0C;
    public final IgSimpleImageView A0D;
    public final IgTextView A0E;
    public final C252063oV A0F;
    public final SpinnerImageView A0G;
    public final AnonymousClass0eK A0H;
    public final ObjectAnimator A0I;
    public final Drawable A0J;

    public static final C14044Tol A00(AnonymousClass0iw r5, UserSession userSession, C69226Nhg nhg, AnonymousClass7GR r8) {
        C69226Nhg nhg2 = nhg;
        C14044Tol tol = nhg.A01;
        if (tol != null) {
            return tol;
        }
        0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.feed.sponsored.common.InsightsHost");
        C69222Nhc nhc = new C69222Nhc(userSession, r8, (AnonymousClass4DU) r5, (String) null);
        C14044Tol tol2 = new C14044Tol(nhg.A07, userSession, nhc, nhg2, r5.getModuleName());
        nhg.A01 = tol2;
        return tol2;
    }

    public final void Dxx(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        A02(r2);
    }

    public final void onVideoViewPrepared(C263754Nf r2) {
        0qQ.A0B(r2, 0);
        C66819MdB mdB = this.A00;
        if (mdB != null) {
            mdB.Ddt();
        }
        A02(r2);
    }

    public static final void A01(C69226Nhg nhg) {
        IgSimpleImageView igSimpleImageView = nhg.A0D;
        igSimpleImageView.setImageDrawable(nhg.A0J);
        DbU.A12(nhg.A07, igSimpleImageView, 2131952529);
    }

    private final void A02(C263754Nf r5) {
        Long l;
        1Xj BPf;
        this.A0G.setVisibility(8);
        C74505Pw0 pw0 = (C74505Pw0) r5.A03;
        if ((pw0 != null && (BPf = pw0.BPf()) != null && (l = Long.valueOf(BPf.A1B())) != null) || (l = this.A02) != null) {
            View view = this.A09;
            AnonymousClass0eK r0 = this.A0H;
            int i = 0;
            if ((r0 != null && DbX.A1a(r0.get())) || this.A05) {
                i = 8;
            }
            view.setVisibility(i);
            SeekBar seekBar = this.A0C;
            long longValue = l.longValue();
            seekBar.setMax((int) longValue);
            this.A0E.setText(1G0.A02(longValue));
        }
    }

    public final void onProgressStateChanged(boolean z) {
        this.A0G.setVisibility(DbW.A01(z ? 1 : 0));
        if (z) {
            A01(this);
        }
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
        IgSimpleImageView igSimpleImageView = this.A0D;
        igSimpleImageView.setImageDrawable(this.A08);
        DbU.A12(this.A07, igSimpleImageView, 2131952528);
        if (!this.A04) {
            SeekBar seekBar = this.A0C;
            seekBar.setMax(i2);
            if (seekBar.getProgress() < i) {
                ObjectAnimator objectAnimator = this.A0I;
                objectAnimator.cancel();
                objectAnimator.setIntValues(new int[]{i});
                objectAnimator.setDuration(100);
                objectAnimator.start();
            } else {
                seekBar.setProgress(i);
            }
        }
        this.A0E.setText(1G0.A02((long) (i2 - i)));
    }

    public final void onVideoPlayerError(C263754Nf r2, String str) {
        C66819MdB mdB = this.A00;
        if (mdB != null) {
            mdB.Ddu();
        }
    }

    public C69226Nhg(Context context, View view, C252063oV r8, SpinnerImageView spinnerImageView, AnonymousClass0eK r10) {
        boolean A1Z = DbW.A1Z(spinnerImageView);
        this.A07 = context;
        this.A0A = view;
        this.A0G = spinnerImageView;
        this.A0F = r8;
        this.A0H = r10;
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.intermediate_viewer_video_controls);
        this.A09 = A0G2;
        this.A0D = DbX.A0Y(A0G2, R.id.video_play_pause_button);
        SeekBar seekBar = (SeekBar) AnonymousClass7TF.A0F(A0G2, R.id.video_scrubber);
        this.A0C = seekBar;
        this.A0I = ObjectAnimator.ofInt(seekBar, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{0});
        this.A0E = DbX.A0Z(A0G2, R.id.video_timer);
        Drawable drawable = context.getDrawable(R.drawable.instagram_pause_filled_16);
        if (drawable != null) {
            this.A08 = drawable;
            Drawable drawable2 = context.getDrawable(R.drawable.instagram_play_filled_16);
            if (drawable2 != null) {
                this.A0J = drawable2;
                this.A06 = AnonymousClass7TG.A02(context);
                this.A0B = new C71477OlL(this, A1Z ? 1 : 0);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void onStopVideo(String str, boolean z) {
        A01(this);
    }
}
