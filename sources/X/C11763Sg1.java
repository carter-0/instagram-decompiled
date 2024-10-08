package X;

import java.util.Set;

/* renamed from: X.Sg1  reason: case insensitive filesystem */
public abstract class C11763Sg1 implements TZj {
    public static final Set A02 = AnonymousClass7TE.A1F();
    public final String A00;
    public final String A01;

    public boolean A00() {
        if (this instanceof C7474QFd) {
            return false;
        }
        if (this instanceof C7477QFg) {
            return true;
        }
        boolean z = this instanceof C7476QFf;
        return true;
    }

    public boolean A01() {
        return SL3.A01(this.A01, Rj4.A00);
    }

    public C11763Sg1(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        A02.add(this);
    }
}
