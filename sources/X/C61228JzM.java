package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.JzM  reason: case insensitive filesystem */
public final class C61228JzM extends AnonymousClass0T0 implements C66415MQv {
    public final int A00;
    public final Object A01;

    public C61228JzM(Reel reel, int i) {
        this.A00 = i;
        0qQ.A0B(reel, 1);
        this.A01 = reel;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61228JzM) || ((C61228JzM) obj).A00 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!A00(i, obj) || !0qQ.A0K(this.A01, ((C61228JzM) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
