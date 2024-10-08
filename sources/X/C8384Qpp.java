package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.Qpp  reason: case insensitive filesystem */
public abstract class C8384Qpp extends C11033S6l {
    public final boolean A04(AnonymousClass63w r3) {
        if (this instanceof C8382Qpn) {
            return ((C8382Qpn) this).A00.A01;
        }
        if (!(this instanceof C8383Qpo)) {
            return ((C8380Qpl) this).A00.A00.A01;
        }
        C10600Ruu ruu = (C10600Ruu) r3.A08.get(((C8383Qpo) this).A00);
        if (ruu == null || !ruu.A00.A01) {
            return false;
        }
        return true;
    }

    public final Feature[] A05(AnonymousClass63w r3) {
        if (this instanceof C8382Qpn) {
            return ((C8382Qpn) this).A00.A02;
        }
        if (!(this instanceof C8383Qpo)) {
            return null;
        }
        r3.A08.get(((C8383Qpo) this).A00);
        return null;
    }
}
