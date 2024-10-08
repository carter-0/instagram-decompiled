package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

public final class OKC {
    public C69377NkH A00;
    public final NCR A01;

    public final void A00(C69377NkH nkH) {
        AudioOutputRoute audioOutputRoute;
        if (nkH != this.A00) {
            this.A00 = nkH;
            NCR ncr = this.A01;
            if (nkH == null) {
                audioOutputRoute = AudioOutputRoute.UNKNOWN;
            } else {
                int ordinal = nkH.ordinal();
                if (ordinal == 0) {
                    audioOutputRoute = AudioOutputRoute.EARPIECE;
                } else if (ordinal == 3) {
                    audioOutputRoute = AudioOutputRoute.HEADSET;
                } else if (ordinal == 2) {
                    audioOutputRoute = AudioOutputRoute.BLUETOOTH;
                } else if (ordinal == 1) {
                    audioOutputRoute = AudioOutputRoute.SPEAKER;
                } else {
                    throw AnonymousClass7TF.A0W("Unhandled audioOutput: ", nkH.name());
                }
            }
            0qQ.A0A(audioOutputRoute);
            ncr.A00(audioOutputRoute);
        }
    }

    public OKC(NCR ncr) {
        this.A01 = ncr;
    }
}
