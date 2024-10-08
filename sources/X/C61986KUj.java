package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.KUj  reason: case insensitive filesystem */
public final class C61986KUj extends C65502LuQ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C61986KUj(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = obj;
    }

    public final void onCurrentTrackCompleted() {
        if (this.A00 != 0) {
            LR8.A00((AudioOverlayTrack) this.A02, (LR8) this.A03);
            return;
        }
        C234502xy r1 = ((NKL) this.A03).A0M;
        if (r1 != null) {
            r1.EHu(false);
        }
    }

    public final void onCurrentTrackPlayTimeUpdated(int i) {
        int i2;
        C234502xy r1;
        int i3 = this.A00;
        int i4 = i - this.A01;
        if (i3 != 0) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) this.A02;
            if (i4 >= audioOverlayTrack.A02) {
                LR8.A00(audioOverlayTrack, (LR8) this.A03);
                return;
            }
            return;
        }
        Integer BZg = ((MusicInfo) this.A02).BUp().BZg();
        if (BZg != null) {
            i2 = BZg.intValue();
        } else {
            i2 = 30000;
        }
        if (i4 >= i2 && (r1 = ((NKL) this.A03).A0M) != null) {
            r1.EHu(false);
        }
    }

    public final void onCurrentTrackPlaybackStarted() {
        if (1 - this.A00 == 0) {
            C51967G9n.A16(((LR8) this.A03).A00, true);
        }
    }

    public final void onCurrentTrackStopped() {
        if (1 - this.A00 == 0) {
            C51967G9n.A16(((LR8) this.A03).A00, false);
        }
    }
}
