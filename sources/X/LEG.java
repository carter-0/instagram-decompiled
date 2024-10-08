package X;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView;

public final class LEG {
    public float A00;
    public int A01;
    public final int A02;
    public final View A03;
    public final FrameLayout A04;
    public final C60473Jm5 A05 = new C60473Jm5(this, 8);
    public final L0P A06;
    public final KMU A07;
    public final StackedAdjustHorizontalScrollView A08;
    public final C60040Jdt A09;
    public final C59991Jd0 A0A;
    public final FrameLayout A0B;

    public final synchronized int A00() {
        return (int) ((((float) this.A08.getScrollX()) * this.A00) / JTS.A01(AnonymousClass7TE.A0S(this.A04), LQO.A00));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View, X.Jdt] */
    public LEG(Context context, L0P l0p, KMU kmu, int i) {
        this.A07 = kmu;
        this.A06 = l0p;
        this.A02 = i;
        View A082 = DbU.A08(LayoutInflater.from(context), R.layout.layout_stacked_adjust_audio_segment);
        0qQ.A0C(A082, C273654mx.A00(2));
        FrameLayout frameLayout = (FrameLayout) A082;
        this.A04 = frameLayout;
        StackedAdjustHorizontalScrollView stackedAdjustHorizontalScrollView = (StackedAdjustHorizontalScrollView) AnonymousClass7TE.A0b(frameLayout, R.id.clips_editor_audio_adjust_scroll);
        this.A08 = stackedAdjustHorizontalScrollView;
        View A0b = AnonymousClass7TE.A0b(frameLayout, R.id.clips_editor_audio_dimmer);
        this.A03 = A0b;
        FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.clips_editor_audio_waveform);
        this.A0B = frameLayout2;
        ? view = new View(AnonymousClass7TE.A0S(frameLayout));
        view.A00 = 1.0f;
        this.A09 = view;
        this.A00 = 1.0f;
        frameLayout2.addView(view);
        C59991Jd0 jd0 = new C59991Jd0(Color.argb(155, 0, 0, 0));
        this.A0A = jd0;
        A0b.setForeground(jd0);
        stackedAdjustHorizontalScrollView.setOnScrollStoppedListener(new C65098LnL(this));
    }
}
