package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.LnU  reason: case insensitive filesystem */
public final class C65106LnU implements C3515289f, C3499982t {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C65106LnU(C68449NIn nIn, 0r1 r3, 0r1 r4, 0rm r5) {
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = nIn.A0q;
    }

    public final String BUn() {
        return this.A04;
    }

    public final void Dt2(AudioOverlayTrack audioOverlayTrack) {
        boolean z;
        int i = this.A00;
        0qQ.A0B(audioOverlayTrack, 0);
        Object obj = this.A03;
        if (i != 0) {
            K52 k52 = (K52) obj;
            AudioOverlayTrack audioOverlayTrack2 = k52.A02;
            String str = null;
            if (audioOverlayTrack2 != null) {
                str = audioOverlayTrack2.A0A;
            }
            boolean A0j = 00p.A0j(str, audioOverlayTrack.A0A, false);
            z = true;
            if (A0j) {
                ((0r1) this.A01).A00 = true;
            }
            k52.A02 = audioOverlayTrack;
        } else {
            0rm r2 = (0rm) obj;
            AudioOverlayTrack audioOverlayTrack3 = (AudioOverlayTrack) r2.A00;
            String str2 = null;
            if (audioOverlayTrack3 != null) {
                str2 = audioOverlayTrack3.A0A;
            }
            boolean A0j2 = 00p.A0j(str2, audioOverlayTrack.A0A, false);
            z = true;
            if (A0j2) {
                ((0r1) this.A01).A00 = true;
            } else {
                r2.A00 = audioOverlayTrack;
            }
        }
        ((0r1) this.A02).A00 = z;
    }

    public final /* synthetic */ void DT3(boolean z) {
    }

    public final /* synthetic */ void Dsx(AudioOverlayTrack audioOverlayTrack) {
    }

    public final /* synthetic */ void Dsz(AudioOverlayTrack audioOverlayTrack, boolean z) {
    }

    public final /* synthetic */ void Dt0(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    public final /* synthetic */ void Dt6(AudioOverlayTrack audioOverlayTrack, Integer num) {
        C63171Kse.A00(this, audioOverlayTrack);
    }

    public C65106LnU(K52 k52, 0r1 r3, 0r1 r4) {
        this.A03 = k52;
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = k52.A08;
    }
}
