package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* renamed from: X.Pa1  reason: case insensitive filesystem */
public final class C73283Pa1 implements Runnable {
    public final /* synthetic */ AudioOutputRoute A00;
    public final /* synthetic */ NCR A01;
    public final /* synthetic */ boolean A02;

    public C73283Pa1(AudioOutputRoute audioOutputRoute, NCR ncr, boolean z) {
        this.A00 = audioOutputRoute;
        this.A01 = ncr;
        this.A02 = z;
    }

    public final void run() {
        C69377NkH nkH;
        AudioOutputRoute audioOutputRoute = this.A00;
        NCR ncr = this.A01;
        boolean A0K = 0qQ.A0K(audioOutputRoute, AudioOutputRoute.SPEAKER);
        ncr.A03 = A0K;
        boolean z = this.A02;
        if ((z || (ncr.A0C && !A0K)) && 0qQ.A0K(audioOutputRoute.identifier, AudioOutputRoute.EARPIECE.identifier)) {
            audioOutputRoute = AudioOutputRoute.SPEAKER;
        }
        if (!0qQ.A0K(ncr.A02, audioOutputRoute.identifier)) {
            if (!audioOutputRoute.identifier.equals(AudioOutputRoute.UNKNOWN.identifier)) {
                OUV ouv = ncr.A0A;
                if (ouv != null) {
                    ouv.A00(002.A0R("change audio ", audioOutputRoute.name), new Object[0]);
                }
                if (audioOutputRoute.equals(AudioOutputRoute.BLUETOOTH) || audioOutputRoute.equals(AudioOutputRoute.BLUETOOTH_A2DP) || audioOutputRoute.equals(AudioOutputRoute.BLUETOOTH_LE) || audioOutputRoute.equals(AudioOutputRoute.BLUETOOTH_HFP)) {
                    nkH = C69377NkH.BLUETOOTH;
                } else if (audioOutputRoute.equals(AudioOutputRoute.SPEAKER)) {
                    nkH = C69377NkH.SPEAKERPHONE;
                } else if (audioOutputRoute.equals(AudioOutputRoute.EARPIECE)) {
                    nkH = C69377NkH.EARPIECE;
                } else if (audioOutputRoute.equals(AudioOutputRoute.HEADSET)) {
                    nkH = C69377NkH.HEADSET;
                } else {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("audioOutput = ");
                    A1A.append(audioOutputRoute);
                    throw AnonymousClass7TE.A0w(AnonymousClass7TF.A0l(" is not convertible", A1A));
                }
                ncr.A09.A00.A08(nkH);
            }
            ncr.A02 = audioOutputRoute.identifier;
        }
        if (ncr.A05 && z != ncr.A06) {
            OOE ooe = ncr.A09.A00;
            if (ooe.A0B() || ooe.A0A()) {
                ooe.A09(AnonymousClass7TF.A1P(z ? 1 : 0));
            }
            ooe.aomShouldSpeakerOnHeadsetUnplug = z;
            ncr.A06 = z;
        }
        boolean z2 = !z;
        OOE ooe2 = ncr.A09.A00;
        boolean z3 = !z2;
        if (ooe2 instanceof NDz) {
            ((NDz) ooe2).A06 = z3;
        }
    }
}
