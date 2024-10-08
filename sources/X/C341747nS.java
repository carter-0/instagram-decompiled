package X;

import java.util.Locale;

/* renamed from: X.7nS  reason: invalid class name and case insensitive filesystem */
public final class C341747nS {
    public C341507n0 A00;
    public final /* synthetic */ C341707nO A01;

    public C341747nS(C341707nO r1) {
        this.A01 = r1;
    }

    public final void A00(C382299dT r14) {
        C341707nO r3 = this.A01;
        C382299dT r5 = r14;
        if (r3.A06 == null || r14.A01 != 22004) {
            r3.A0C.A01("idAPe");
            r3.A0F.Cjw(r5, "inprogress_recording_audio_failure", "AudioRecordingTrack", "", "low", "AudioPipelineRecorder.Output", (long) r3.hashCode());
            return;
        }
        r3.A0C.A01("idAPEn");
        C39777A8w a8w = r3.A06;
        C382309dU r0 = new C382309dU(r14);
        C341627nG r1 = a8w.A02;
        r1.A04(r0);
        r1.A06(a8w.A01);
        r3.A06 = null;
    }

    public final void A01(Y1G y1g, int i, long j) {
        C341707nO r5 = this.A01;
        if (r5.A06 != null) {
            r5.A0C.A01("idAP");
            C341567nA r4 = r5.A0F;
            r4.Cjl(19, "recording_start_audio_finished");
            C39897ADz aDz = r5.A01;
            if (aDz != null) {
                r4.ABW(19, "isEffectOnDuringRecording", String.valueOf(aDz.A09));
            }
            r5.A06.A00();
            r5.A06 = null;
        }
        if (r5.A0J) {
            r5.A03.CNN(y1g, i, j);
        } else {
            String.format((Locale) null, "[DROP] Audio sample dropped at %d us", new Object[]{Long.valueOf(j)});
        }
    }

    public final void A02(byte[] bArr, int i, long j) {
        C341707nO r5 = this.A01;
        if (r5.A06 != null) {
            r5.A0C.A01("idAP");
            C341567nA r4 = r5.A0F;
            r4.Cjl(19, "recording_start_audio_finished");
            C39897ADz aDz = r5.A01;
            if (aDz != null) {
                r4.ABW(19, "isEffectOnDuringRecording", String.valueOf(aDz.A09));
            }
            r5.A06.A00();
            r5.A06 = null;
        }
        if (r5.A0J) {
            r5.A03.CNO(bArr, i, j);
        } else {
            String.format((Locale) null, "[DROP] Audio sample dropped at %d us", new Object[]{Long.valueOf(j)});
        }
    }
}
