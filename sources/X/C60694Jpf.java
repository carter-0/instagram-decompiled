package X;

import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.creation.photo.crop.LayoutImageView;

/* renamed from: X.Jpf  reason: case insensitive filesystem */
public final class C60694Jpf extends C249703kE implements AnonymousClass07Y {
    public Surface A00;
    public TextureView A01;
    public C349307zv A02;
    public AnonymousClass4MN A03;
    public String A04;
    public boolean A05 = false;
    public final int A06 = C228922mY.A00.getAndIncrement();
    public final View A07;
    public final ImageView A08;
    public final ConstraintLayout A09;
    public final FragmentActivity A0A;
    public final AnonymousClass2gO A0B;
    public final UserSession A0C;
    public final ColorFilterAlphaImageView A0D;
    public final C59941Jc5 A0E;
    public final C353278Gz A0F;
    public final LayoutImageView A0G;
    public final AnonymousClass0eK A0H;

    public static void A00(C60694Jpf jpf) {
        AnonymousClass4MN r2 = jpf.A03;
        if (r2 == null) {
            r2 = (AnonymousClass4MN) jpf.A0H.get();
            jpf.A03 = r2;
        }
        C59941Jc5 jc5 = jpf.A0E;
        0qQ.A0B(r2, 0);
        C59941Jc5.A00(jc5);
        jc5.A01.put(r2, true);
        02V.A03(jpf.A03, "should not be null if playing video");
        if (jpf.A04 == null) {
            0kD.A01("LayoutCaptureGridAdapter", "video file path is null during attempt to play video");
            return;
        }
        jpf.A03.reset();
        Uri A012 = 0cp.A01(C59792JYl.A0B, jpf.A04);
        if (A012 != null) {
            jpf.A03.ETv(A012, (Integer) null, (String) null, "LayoutCaptureGridAdapter", true, false);
        }
        AnonymousClass4MN r3 = jpf.A03;
        ((AnonymousClass4MM) r3).A0M = new C62425Kfa(jpf);
        r3.E3n((ViewGroup) null, (Integer) null);
        Surface surface = jpf.A00;
        if (surface != null) {
            jpf.A03.setSurface(surface);
        }
    }

    public static void A01(C60694Jpf jpf) {
        AnonymousClass4MN r1 = jpf.A03;
        if (r1 != null) {
            0u4.A03(jpf.A0E.A01).remove(r1);
            jpf.A03.ECQ(false);
            jpf.A03 = null;
        }
        Surface surface = jpf.A00;
        if (surface != null) {
            surface.release();
            jpf.A00 = null;
        }
    }

    public static void A02(C60694Jpf jpf, C63873LAc lAc) {
        C349307zv r0 = lAc.A05;
        if (r0 == null) {
            jpf.A08.setVisibility(8);
            return;
        }
        boolean z = r0.A1H;
        int i = R.drawable.instagram_volume_off_outline_16;
        if (z) {
            i = R.drawable.instagram_volume_outline_16;
        }
        jpf.A08.setImageResource(i);
    }

    public final void A03() {
        this.A0D.setVisibility(8);
        this.A08.setVisibility(8);
        this.A07.setVisibility(8);
    }

    public final void A04(boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A0D;
        if (colorFilterAlphaImageView.getVisibility() == 0) {
            A03();
            return;
        }
        colorFilterAlphaImageView.setVisibility(0);
        this.A08.setVisibility(DbW.A01(z ? 1 : 0));
        View view = this.A07;
        view.animate().cancel();
        FragmentActivity fragmentActivity = this.A0A;
        DbT.A16(fragmentActivity, view, 2Yu.A0H(fragmentActivity, R.attr.igds_color_dimmer));
        view.setAlpha(0.7f);
        view.setVisibility(0);
    }

    @OnLifecycleEvent(07T.ON_PAUSE)
    public void onPaused() {
        AnonymousClass4MN r0 = this.A03;
        if (r0 != null) {
            r0.pause();
        }
    }

    @OnLifecycleEvent(07T.ON_RESUME)
    public void onResumed() {
        AnonymousClass4MN r0;
        if (!this.A0F.A01 && (r0 = this.A03) != null) {
            r0.start();
        }
    }

    public C60694Jpf(View view, FragmentActivity fragmentActivity, UserSession userSession, C59941Jc5 jc5, C353278Gz r7, AnonymousClass0eK r8) {
        super(view);
        this.A0A = fragmentActivity;
        this.A09 = (ConstraintLayout) view;
        this.A0G = (LayoutImageView) view.requireViewById(R.id.layout_captured_preview);
        this.A07 = view.requireViewById(R.id.layout_captured_preview_overlay);
        this.A0D = (ColorFilterAlphaImageView) view.requireViewById(R.id.layout_captured_preview_delete_button);
        this.A08 = DbU.A0F(view, R.id.layout_captured_preview_audio_toggle_button);
        this.A0F = r7;
        this.A0E = jc5;
        this.A0H = r8;
        this.A0C = userSession;
        this.A0B = new C64317LZr(this, 4);
    }
}
