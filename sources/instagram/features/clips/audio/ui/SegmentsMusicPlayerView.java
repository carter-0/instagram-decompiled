package instagram.features.clips.audio.ui;

import X.0qQ;
import X.0sn;
import X.0sr;
import X.AnonymousClass00P;
import X.AnonymousClass3NG;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass8ZG;
import X.AnonymousClass8ZH;
import X.AnonymousClass8ZI;
import X.C234502xy;
import X.C315536k3;
import X.C347917xa;
import X.C51968G9o;
import X.C51969G9p;
import X.C51972G9s;
import X.C61685KHt;
import X.C64079LLx;
import X.C66560MWo;
import X.DbS;
import X.DbV;
import X.JTT;
import X.MAN;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SegmentsMusicPlayerView extends ConstraintLayout implements C315536k3, SeekBar.OnSeekBarChangeListener {
    public float A00;
    public int A01;
    public C234502xy A02;
    public C66560MWo A03;
    public List A04;
    public boolean A05;
    public int A06;
    public MusicDataSource A07;
    public boolean A08;
    public final SeekBar A09;
    public final TextView A0A;
    public final LoadingSpinnerView A0B;
    public final int A0C;
    public final int A0D;
    public final View A0E;
    public final View A0F;
    public final ImageView A0G;
    public final AnonymousClass8ZI A0H;
    public final String A0I;
    public final String A0J;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SegmentsMusicPlayerView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A0D() {
        if (this.A07 != null) {
            C234502xy r0 = this.A02;
            if (r0 != null) {
                if (!r0.isPlaying()) {
                    setPreviewButtonState(AnonymousClass8ZH.LOADING);
                    C234502xy r4 = this.A02;
                    if (r4 != null) {
                        MusicDataSource musicDataSource = this.A07;
                        if (musicDataSource != null) {
                            r4.ETw(musicDataSource, this, (String) null, 0, -1, -1, false, false);
                            C234502xy r2 = this.A02;
                            if (r2 != null) {
                                r2.seekTo(this.A06 + this.A09.getProgress());
                                C234502xy r02 = this.A02;
                                if (r02 != null) {
                                    r02.E2p();
                                    return;
                                }
                            }
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("musicPlayer");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        int i2 = (int) (((float) i) * this.A00);
        int i3 = this.A06;
        SeekBar seekBar = this.A09;
        if (i2 >= i3 + seekBar.getMax()) {
            onCurrentTrackCompleted();
            return;
        }
        int i4 = this.A06;
        if (i2 < i4) {
            C234502xy r0 = this.A02;
            if (r0 != null) {
                if (i4 < r0.AzN()) {
                    C234502xy r1 = this.A02;
                    if (r1 != null) {
                        r1.seekTo(this.A06);
                        return;
                    }
                }
            }
            0qQ.A0F("musicPlayer");
            throw AnonymousClass00P.createAndThrow();
        }
        setPreviewButtonState(AnonymousClass8ZH.STOP);
        seekBar.setProgress(i2 - this.A06);
    }

    public final void onCurrentTrackSeekComplete() {
    }

    public final void onCurrentTrackStartedPlaying() {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        0qQ.A0B(seekBar, 0);
        C234502xy r2 = this.A02;
        if (r2 == null) {
            0qQ.A0F("musicPlayer");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.seekTo(this.A06 + seekBar.getProgress());
        if (this.A08) {
            A0D();
        }
        this.A08 = false;
    }

    public final void setMusicDataSource(MusicDataSource musicDataSource) {
        MusicDataSource musicDataSource2 = musicDataSource;
        0qQ.A0B(musicDataSource, 0);
        this.A07 = musicDataSource;
        if (!this.A05) {
            C234502xy r0 = this.A02;
            if (r0 == null) {
                0qQ.A0F("musicPlayer");
                throw AnonymousClass00P.createAndThrow();
            }
            r0.ETw(musicDataSource2, this, (String) null, 0, -1, -1, false, false);
        }
        setEnabled(true);
    }

    /* access modifiers changed from: private */
    public final void setPreviewButtonState(AnonymousClass8ZH r3) {
        String str;
        this.A0H.A01(r3);
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            str = this.A0J;
        } else if (ordinal == 1 || ordinal == 3 || ordinal == 2) {
            str = this.A0I;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        setContentDescription(str);
        this.A0G.setContentDescription(getContentDescription());
    }

    public static /* synthetic */ void setProgressSpeedFactor$default(SegmentsMusicPlayerView segmentsMusicPlayerView, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        segmentsMusicPlayerView.A00 = f;
    }

    private final void setTrackScrubberVisibility(boolean z) {
        ColorStateList valueOf;
        SeekBar seekBar = this.A09;
        seekBar.setEnabled(z);
        Drawable mutate = seekBar.getThumb().mutate();
        int i = 0;
        if (z) {
            i = 255;
        }
        mutate.setAlpha(i);
        if (z) {
            valueOf = null;
        } else {
            valueOf = ColorStateList.valueOf(0);
        }
        seekBar.setProgressTintList(valueOf);
    }

    public final View getSegmentsChevron() {
        return this.A0F;
    }

    public final void onCurrentTrackCompleted() {
        C234502xy r1 = this.A02;
        if (r1 != null) {
            r1.seekTo(this.A06);
            this.A09.setProgress(0);
            C234502xy r0 = this.A02;
            if (r0 != null) {
                r0.E2p();
                return;
            }
        }
        0qQ.A0F("musicPlayer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCurrentTrackPlaybackStarted() {
        setPreviewButtonState(AnonymousClass8ZH.STOP);
        setTrackScrubberVisibility(true);
    }

    public final void onCurrentTrackPrepared(int i) {
        int min = Math.min(i, this.A01);
        SeekBar seekBar = this.A09;
        if (seekBar.getMax() != min) {
            seekBar.setMax(min);
            seekBar.setProgress(0);
        }
        List list = this.A04;
        if (AnonymousClass7TE.A1b(list) && i != 0) {
            List A1P = 0sr.A1P(new Integer[]{Integer.valueOf(R.id.segment_button_0), Integer.valueOf(R.id.segment_button_1), Integer.valueOf(R.id.segment_button_2)});
            ArrayList A0r = AnonymousClass7TG.A0r(A1P);
            Iterator it = A1P.iterator();
            while (it.hasNext()) {
                A0r.add(findViewById(AnonymousClass7TG.A0F(it)));
            }
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next();
                0qQ.A0C(((View) A0r.get(0)).getLayoutParams(), "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                throw AnonymousClass7TE.A11("getStartTimeMs");
            }
            post(new MAN(this, A0r));
        }
    }

    public final void onCurrentTrackStopped() {
        if (!this.A08) {
            setPreviewButtonState(AnonymousClass8ZH.PLAY);
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.A0A.setText(C347917xa.A01(this.A06 + i));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        C234502xy r0 = this.A02;
        if (r0 != null) {
            if (r0.isPlaying()) {
                this.A08 = true;
                C234502xy r02 = this.A02;
                if (r02 != null) {
                    r02.pause();
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("musicPlayer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setPreviewStartTimeMs(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            if (!this.A05) {
                C234502xy r0 = this.A02;
                if (r0 == null) {
                    0qQ.A0F("musicPlayer");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    r0.seekTo(i);
                }
            }
        }
    }

    public void setEnabled(boolean z) {
        int i;
        int i2;
        super.setEnabled(z);
        this.A0G.setEnabled(isEnabled());
        this.A0H.A02(isEnabled());
        SeekBar seekBar = this.A09;
        Drawable mutate = seekBar.getThumb().mutate();
        if (isEnabled()) {
            i = this.A0D;
        } else {
            i = this.A0C;
        }
        C51969G9p.A12(PorterDuff.Mode.SRC_IN, mutate, i);
        seekBar.setEnabled(isEnabled());
        TextView textView = this.A0A;
        if (isEnabled()) {
            i2 = this.A0D;
        } else {
            i2 = this.A0C;
        }
        textView.setTextColor(i2);
    }

    public final void setPreviewDurationMs(int i) {
        this.A01 = i;
    }

    public final void setProgressSpeedFactor(float f) {
        this.A00 = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentsMusicPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        int A042 = C51968G9o.A04(context);
        this.A0D = A042;
        int A012 = DbV.A01(context);
        this.A0C = A012;
        this.A0J = AnonymousClass7TE.A16(context, 2131973019);
        this.A0I = AnonymousClass7TE.A16(context, 2131973018);
        this.A01 = 60000;
        this.A03 = C64079LLx.A00;
        this.A00 = 1.0f;
        this.A04 = 0sn.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.segments_music_player_view, this, true);
        ImageView A0G2 = DbS.A0G(inflate, R.id.preview_button);
        this.A0G = A0G2;
        AnonymousClass8ZG r1 = new AnonymousClass8ZG(context);
        r1.A06 = 0;
        r1.A0C = 0;
        r1.A01 = context.getDrawable(R.drawable.pause);
        r1.A02(C51972G9s.A08(context));
        r1.A01(A042);
        r1.A05 = Integer.valueOf(A012);
        AnonymousClass8ZI A002 = r1.A00();
        this.A0H = A002;
        A0G2.setImageDrawable(A002);
        C61685KHt kHt = new C61685KHt(this, 41);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0G2);
        A0m.A07 = true;
        A0m.A04 = kHt;
        A0m.A00();
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.track_time);
        A0d.setText(C347917xa.A01(0));
        this.A0A = A0d;
        this.A0F = inflate.findViewById(R.id.segments_chevron);
        this.A0E = inflate.findViewById(R.id.close_button);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.track_scrubber);
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setMax(this.A01);
        this.A09 = seekBar;
        this.A0B = (LoadingSpinnerView) inflate.findViewById(R.id.loading_spinner_view);
        setEnabled(false);
    }

    public /* synthetic */ SegmentsMusicPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SegmentsMusicPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
