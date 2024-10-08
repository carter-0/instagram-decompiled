package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Mj3  reason: case insensitive filesystem */
public final class C67145Mj3 {
    public final Map A00;

    public C67145Mj3(C67134Mis... misArr) {
        ArrayList A0v = DbS.A0v(23);
        int i = 0;
        do {
            C67134Mis mis = misArr[i];
            A0v.add(new 0eP(mis.A00, mis));
            i++;
        } while (i < 23);
        this.A00 = 0Yt.A08(A0v);
    }
}
