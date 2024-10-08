package X;

import java.util.LinkedList;
import java.util.Map;

public final class ATP implements C341687nM {
    public final int A00;
    public final Object A01;

    public ATP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DCg(C391719tX r14) {
        String str;
        C40695AhF ahF;
        String str2;
        C391719tX r5 = r14;
        switch (this.A00) {
            case 0:
                C40077AQh aQh = (C40077AQh) this.A01;
                C341707nO r2 = aQh.A01;
                r2.A0C.A01("aoAPe");
                r2.release();
                r2.A0F.Cjv(r5, "start_recording_audio_failed", "AudioRecordingTrack", "", "start", (Map) null, AnonymousClass7TE.A0Q(r2));
                aQh.A00.DCg(r14);
                return;
            case 1:
                A9T a9t = (A9T) this.A01;
                synchronized (a9t) {
                    a9t.A02 = true;
                    C18097VlR.A00(a9t.A03, r14, a9t.A04);
                    while (true) {
                        LinkedList linkedList = a9t.A05;
                        if (!linkedList.isEmpty()) {
                            ((Runnable) linkedList.pop()).run();
                        }
                    }
                }
                return;
            case 2:
                return;
            case 3:
                if (r14 != null) {
                    str = r14.getMessage();
                } else {
                    str = null;
                }
                0KC.A0C("IGDOneCameraVoiceRecorder", 002.A0R("Error starting audio recorder: ", str));
                ahF = (C40695AhF) this.A01;
                ahF.A02 = null;
                ahF.A04 = false;
                break;
            default:
                if (r14 != null) {
                    str2 = r14.getMessage();
                } else {
                    str2 = null;
                }
                0KC.A0C("IGDOneCameraVoiceRecorder", 002.A0R("Error stopping audio recorder: ", str2));
                ahF = (C40695AhF) this.A01;
                ahF.A03 = false;
                break;
        }
        ahF.A06.A01();
    }

    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                C40077AQh aQh = (C40077AQh) this.A01;
                C341707nO r2 = aQh.A01;
                r2.A0C.A01("aoAPs");
                C341567nA r4 = r2.A0F;
                r4.Cjl(19, "recording_start_audio_ready");
                r4.Cjv((C391719tX) null, "start_recording_audio_finished", "AudioRecordingTrack", "", (String) null, (Map) null, AnonymousClass7TE.A0Q(r2));
                aQh.A00.onSuccess();
                return;
            case 1:
                A9T a9t = (A9T) this.A01;
                synchronized (a9t) {
                    int addAndGet = a9t.A06.addAndGet(1);
                    if (!a9t.A02 && a9t.A01 && addAndGet == a9t.A00) {
                        C18097VlR.A01(a9t.A04, a9t.A03);
                    }
                }
                return;
            case 2:
                C40695AhF ahF = (C40695AhF) this.A01;
                ahF.A04 = false;
                ahF.EyI(false);
                ahF.A05.post(new C40912AlK(ahF));
                return;
            default:
                return;
        }
    }
}
