package X;

/* renamed from: X.HQf  reason: case insensitive filesystem */
public abstract class C54726HQf {
    public String A00() {
        if (this instanceof C54544HIf) {
            return ((C54544HIf) this).A00;
        }
        return null;
    }

    public String A01() {
        if (this instanceof C54544HIf) {
            return "UNKNOWN";
        }
        if (this instanceof C54543HIe) {
            return "IGNORE_FOR_MEMU";
        }
        return "CANCELLED";
    }
}
