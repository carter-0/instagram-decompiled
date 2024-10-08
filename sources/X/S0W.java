package X;

import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;

public final class S0W {
    public Q17 A00;

    public final void A00(SFQ sfq) {
        int i = sfq.A04;
        int i2 = sfq.A01;
        int i3 = 2;
        int i4 = sfq.A00;
        S0V s0v = sfq.A02;
        if (s0v != null) {
            i3 = s0v.A00;
        }
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setInteger("aac-profile", i3);
        createAudioFormat.setInteger("max-input-size", 64000);
        if (i4 > 0) {
            createAudioFormat.setInteger(TraceFieldType.Bitrate, i4);
        }
        if (i > 0) {
            createAudioFormat.setInteger("sample-rate", i);
        }
        if (i2 > 0) {
            createAudioFormat.setInteger("channel-count", i2);
        }
        Q17 A02 = C7257Q1f.A02(createAudioFormat, RDj.BUFFERS, (C7334Q4k) null, "audio/mp4a-latm", (String) null);
        this.A00 = A02;
        A02.A02();
    }
}
