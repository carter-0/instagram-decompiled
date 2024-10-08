package X;

import android.media.AudioRecordingConfiguration;
import java.util.List;

/* renamed from: X.Pa2  reason: case insensitive filesystem */
public final class C73284Pa2 implements Runnable {
    public final /* synthetic */ C71064Oaj A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public C73284Pa2(C71064Oaj oaj, String str, List list) {
        this.A00 = oaj;
        this.A01 = str;
        this.A02 = list;
    }

    public final void run() {
        C71064Oaj oaj = this.A00;
        String str = this.A01;
        List<AudioRecordingConfiguration> list = this.A02;
        if (list == null) {
            list = oaj.A02.getActiveRecordingConfigurations();
            0qQ.A07(list);
        }
        C71064Oaj.A01(oaj, str, list);
    }
}
