package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.AZw  reason: case insensitive filesystem */
public final class C40307AZw implements C41830B2l {
    public final /* synthetic */ C357328Xl A00;
    public final /* synthetic */ C359318cb A01;
    public final /* synthetic */ AudioOverlayTrack A02;
    public final /* synthetic */ boolean A03;

    public final void DnG() {
    }

    public final void DnH() {
    }

    public C40307AZw(C357328Xl r1, C359318cb r2, AudioOverlayTrack audioOverlayTrack, boolean z) {
        this.A01 = r2;
        this.A03 = z;
        this.A02 = audioOverlayTrack;
        this.A00 = r1;
    }

    public final void DnI() {
        C359318cb r2 = this.A01;
        r2.A0M = true;
        if (this.A00 == C357328Xl.CLIPS_POSTCAP_RECENTLY_WATCHED_AUDIO_UPSELL) {
            r2.A0o.A00();
        }
    }

    public final void DnJ() {
        C359318cb r2 = this.A01;
        if (r2.A0B != null) {
            if (this.A03) {
                AudioOverlayTrack audioOverlayTrack = this.A02;
                if (audioOverlayTrack != null) {
                    new C63924LDf(r2.A0S, new AXS(r2, audioOverlayTrack), r2.A0b, audioOverlayTrack).A00();
                }
            } else {
                boolean A1W = AnonymousClass7TF.A1W(this.A00, C357328Xl.CLIPS_POSTCAP_RECENTLY_WATCHED_AUDIO_UPSELL);
                27p.A01(r2.A0b).A03.A07("clips_post_cap_audio_pill");
                r2.A0m.A03(C3515589i.POST_CAPTURE_AUDIO_PILL, this.A02, (String) null, (0eP) null, false, false, false, A1W);
            }
            C357318Xk r0 = r2.A0B;
            if (r0 != null) {
                r0.A04(false);
            }
        }
    }
}
