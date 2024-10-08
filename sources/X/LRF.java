package X;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;

public final class LRF {
    public int A00;
    public int A01;
    public Surface A02;
    public AnonymousClass4MM A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final TextureView A07;
    public final View A08;
    public final TextView A09;
    public final Fragment A0A;
    public final UserSession A0B;
    public final IgImageView A0C;
    public final M2K A0D = new M2K(this);
    public final ClipsTrimFilmstrip A0E;
    public final AnonymousClass0eM A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final C62747Kll A0I;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (X.0qQ.A0K(r1, "270") != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.LRF r7, java.lang.String r8, int r9, int r10) {
        /*
            r6 = r9
            android.view.TextureView r3 = r7.A07
            int r0 = r3.getWidth()
            if (r0 == 0) goto L_0x004b
            int r0 = r3.getHeight()
            if (r0 == 0) goto L_0x004b
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            r2.setDataSource(r8)     // Catch:{ IllegalArgumentException -> 0x003e }
            r0 = 24
            java.lang.String r1 = r2.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x003e }
            java.lang.String r0 = "90"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IllegalArgumentException -> 0x003e }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "270"
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ IllegalArgumentException -> 0x003e }
            r7 = r10
            if (r0 == 0) goto L_0x0030
        L_0x002e:
            r7 = r9
            r6 = r10
        L_0x0030:
            int r4 = r3.getWidth()     // Catch:{ IllegalArgumentException -> 0x003e }
            int r5 = r3.getHeight()     // Catch:{ IllegalArgumentException -> 0x003e }
            r8 = 0
            r9 = r8
            X.C394669yU.A00(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ IllegalArgumentException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.toString()     // Catch:{ all -> 0x0046 }
        L_0x0042:
            r2.release()
            return
        L_0x0046:
            r0 = move-exception
            r2.release()
            throw r0
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LRF.A01(X.LRF, java.lang.String, int, int):void");
    }

    public static final void A00(LRF lrf) {
        TextView textView = lrf.A09;
        JTR.A18(lrf.A08.getContext(), textView, 1, Integer.valueOf(lrf.A05), 2131957333);
        textView.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setStartOffset(3000);
        alphaAnimation.setDuration(500);
        alphaAnimation.setFillAfter(true);
        textView.startAnimation(alphaAnimation);
    }

    public final void A02(Medium medium, C279284yO r11, boolean z) {
        boolean z2;
        TextureView textureView = this.A07;
        textureView.setSurfaceTextureListener(new LWe(this, medium.A0X, medium.A0B, medium.A04));
        Context context = this.A08.getContext();
        int A082 = C51972G9s.A08(context);
        textureView.setOutlineProvider(new C52862Gdv((int) (((double) A082) * 1.5d), A082));
        textureView.setClipToOutline(true);
        A01(this, medium.A0X, medium.A0B, medium.A04);
        UserSession userSession = this.A0B;
        AnonymousClass4MM r2 = new AnonymousClass4MM(context, userSession, "video_trim");
        float f = 1.0f;
        if (z) {
            f = 0.0f;
        }
        r2.Eqq(f);
        r2.A0M = new C62424KfZ(this);
        r2.ETv(medium.A02(), (Integer) null, medium.A0Y, "VideoTrimUIController", true, false);
        Surface surface = this.A02;
        if (surface != null) {
            r2.setSurface(surface);
        }
        r2.E3n((ViewGroup) null, (Integer) null);
        r2.seekTo(0);
        r2.start();
        this.A03 = r2;
        if (this.A0G || this.A0H) {
            boolean z3 = false;
            try {
                z2 = new C7259Q1i(this.A0C.getContext(), false).AU7(medium.A02()).A0K;
                if (z2) {
                    ((AnonymousClass861) this.A0F.getValue()).A01();
                }
            } catch (RuntimeException e) {
                0kD.A0E("VideoTrimUIController", AnonymousClass7TF.A0m("Could not extract media metadata, media metadata is probably corrupt ", e), e);
                z2 = false;
            }
            IgImageView igImageView = this.A0C;
            igImageView.setVisibility(0);
            if (!0qQ.A0K(r11, AnonymousClass9QA.A00)) {
                z3 = z2;
            }
            igImageView.setActivated(z3);
            igImageView.setSelected(!z);
            LY8.A00(igImageView, 47, r11, this);
            igImageView.post(new M6E(this, 1Au.A00(userSession)));
        }
        0nA.A0p(this.A0E, new M6F(medium, this));
        A00(this);
    }

    public LRF(View view, Fragment fragment, UserSession userSession, C62747Kll kll, int i) {
        this.A0A = fragment;
        this.A0B = userSession;
        this.A08 = view;
        this.A05 = i;
        this.A0I = kll;
        this.A07 = (TextureView) AnonymousClass7TF.A0F(view, R.id.cutout_sticker_video_texture_view);
        this.A0C = DbX.A0b(view, R.id.audio_button);
        this.A0E = (ClipsTrimFilmstrip) AnonymousClass7TF.A0F(view, R.id.cutout_sticker_video_trim_filmstrip);
        this.A09 = AnonymousClass7TG.A0R(view, R.id.video_trim_instruction_text);
        this.A0G = kll.equals(KK6.A00);
        this.A0F = AnonymousClass0eN.A01(new MMT(this, 12));
        this.A0H = kll.equals(KK7.A00);
        this.A00 = Integer.MAX_VALUE;
        this.A06 = IgNetworkConsentStorage.MAX_ENTRIES;
    }
}
