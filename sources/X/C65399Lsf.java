package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.Lsf  reason: case insensitive filesystem */
public final class C65399Lsf implements MSS, C66399MQf {
    public static final C65399Lsf A00 = new Object();

    public final Fragment B7q(Object obj) {
        0qQ.A0B(obj, 0);
        KTF ktf = (KTF) obj;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("prior_surface", C62569Khz.VIDEOX_SHARESHEET);
        A0a.putParcelable("initial_upcoming_event", ktf.A01);
        K6D k6d = new K6D();
        k6d.setArguments(A0a);
        k6d.A06 = ktf.A00;
        return k6d;
    }
}
