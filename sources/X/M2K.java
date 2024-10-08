package X;

import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;

public final class M2K implements Runnable {
    public final /* synthetic */ LRF A00;

    public M2K(LRF lrf) {
        this.A00 = lrf;
    }

    public final void run() {
        AnonymousClass4MM r2;
        ClipsTrimFilmstrip clipsTrimFilmstrip;
        LRF lrf = this.A00;
        if (!lrf.A04 && (r2 = lrf.A03) != null && r2.A09.A0I.A0J()) {
            int currentPosition = r2.getCurrentPosition();
            if (currentPosition >= lrf.A00) {
                r2.seekTo(lrf.A01);
                clipsTrimFilmstrip = lrf.A0E;
                currentPosition = lrf.A01;
            } else {
                if (currentPosition > 0) {
                    clipsTrimFilmstrip = lrf.A0E;
                }
                lrf.A08.postOnAnimation(lrf.A0D);
            }
            clipsTrimFilmstrip.setSeekPosition(currentPosition);
            lrf.A08.postOnAnimation(lrf.A0D);
        }
    }
}
