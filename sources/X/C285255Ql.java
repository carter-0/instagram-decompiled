package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5Ql  reason: invalid class name and case insensitive filesystem */
public final class C285255Ql implements Modifier {
    public final Modifier A00;
    public final Modifier A01;

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public final boolean AB4(0sP r3) {
        if (!this.A01.AB4(r3) || !this.A00.AB4(r3)) {
            return false;
        }
        return true;
    }

    public final Object AW8(Object obj, 0sL r4) {
        return this.A00.AW8(this.A01.AW8(obj, r4), r4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C285255Ql) {
            C285255Ql r3 = (C285255Ql) obj;
            if (!0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A00, r3.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    public final String toString() {
        return 002.A0E((String) AW8("", C20787Wyz.A00), '[', ']');
    }

    public C285255Ql(Modifier modifier, Modifier modifier2) {
        this.A01 = modifier;
        this.A00 = modifier2;
    }
}
