package X;

import android.media.MediaCodecInfo;
import java.util.ArrayList;

/* renamed from: X.TVi  reason: case insensitive filesystem */
public final class C13335TVi extends 0Yg implements C62320sa {
    public static final C13335TVi A00 = new C13335TVi();

    public C13335TVi() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        MediaCodecInfo[] A1Z = Pxg.A1Z(1);
        ArrayList A15 = DbV.A15(A1Z);
        for (MediaCodecInfo mediaCodecInfo : A1Z) {
            SS7 ss7 = SS7.A00;
            0qQ.A0A(mediaCodecInfo);
            if (SS7.A00(mediaCodecInfo) && mediaCodecInfo.isEncoder()) {
                A15.add(mediaCodecInfo);
            }
        }
        return A15;
    }
}
