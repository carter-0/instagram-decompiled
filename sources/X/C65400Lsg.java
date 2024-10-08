package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.Lsg  reason: case insensitive filesystem */
public final class C65400Lsg implements MSS, C66399MQf {
    public static final C65400Lsg A00 = new Object();

    public final Fragment B7q(Object obj) {
        0qQ.A0B(obj, 0);
        KTG ktg = (KTG) obj;
        K4S k4s = new K4S();
        MUQ muq = ktg.A00;
        0qQ.A0B(muq, 0);
        k4s.A01 = muq;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("prior_surface", C62569Khz.VIDEOX_SHARESHEET);
        A0a.putStringArrayList("upcoming_event_ids", AnonymousClass7TE.A1D(ktg.A01));
        k4s.setArguments(A0a);
        return k4s;
    }
}
