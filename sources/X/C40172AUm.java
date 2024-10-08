package X;

import android.media.MediaRecorder;
import android.util.Pair;

/* renamed from: X.AUm  reason: case insensitive filesystem */
public final class C40172AUm implements C340737lk {
    public final /* synthetic */ AnonymousClass9RJ A00;

    public final void DmV(MediaRecorder mediaRecorder) {
    }

    public C40172AUm(AnonymousClass9RJ r1) {
        this.A00 = r1;
    }

    public final void DQi(MediaRecorder mediaRecorder, int i, int i2, boolean z) {
        int i3;
        int i4 = C340577lU.A00;
        Pair A0K = Pxf.A0K(Integer.valueOf(i), i2);
        if (z) {
            i3 = 28;
        } else {
            i3 = 29;
        }
        C340577lU.A00(i3, 0, A0K);
    }

    public final void Djc(MediaRecorder mediaRecorder) {
        String str;
        try {
            this.A00.A0B(mediaRecorder);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "";
            }
            C340577lU.A02("Camera1Device.setVideoRecordingSource", str);
        }
    }
}
