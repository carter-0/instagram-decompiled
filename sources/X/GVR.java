package X;

import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.OriginalSoundData;
import java.util.List;

public final class GVR extends C298815u5 {
    public C53368Gms A00;
    public C59721JVf A01;
    public N49 A02;
    public C61037Jvb A03;
    public 1rs A04;
    public C55709Hm6 A05;
    public GVR A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;

    public final C2606046i A01() {
        C55709Hm6 hm6 = this.A05;
        C2606046i r1 = null;
        if (hm6 != null) {
            MusicInfoImpl musicInfoImpl = hm6.A00;
            if (musicInfoImpl != null) {
                r1 = new C2605946h(musicInfoImpl);
            } else {
                OriginalSoundData originalSoundData = hm6.A01;
                if (originalSoundData != null) {
                    r1 = new C282025Bc(originalSoundData);
                }
            }
        }
        return r1;
    }

    public final void EQG(long j) {
        this.A00 = j;
        GVR gvr = this.A06;
        if (gvr != null) {
            gvr.EQG(j);
        }
    }

    public GVR() {
        0sn r0 = 0sn.A00;
        this.A0B = r0;
        this.A0C = r0;
        this.A0A = r0;
    }

    public final void A02() {
        super.A00();
    }
}
