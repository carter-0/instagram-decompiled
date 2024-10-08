package X;

import java.io.Serializable;

/* renamed from: X.4en  reason: invalid class name and case insensitive filesystem */
public final class C269234en implements C269244eo, Serializable {
    public static final C269234en A05;
    public static final C269234en A06;
    public final C269254ep A00;
    public final C269254ep A01;
    public final C269254ep A02;
    public final C269254ep A03;
    public final C269254ep A04;

    static {
        C269254ep r1 = C269254ep.PUBLIC_ONLY;
        C269254ep r3 = C269254ep.ANY;
        C269254ep r2 = r1;
        C269254ep r5 = r1;
        A06 = new C269234en(r1, r2, r3, r3, r5);
        A05 = new C269234en(r1, r2, r1, r1, r5);
    }

    public final String toString() {
        return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", new Object[]{this.A02, this.A03, this.A04, this.A00, this.A01});
    }

    public C269234en(C269254ep r1) {
        this.A02 = r1;
        this.A03 = r1;
        this.A04 = r1;
        this.A00 = r1;
        this.A01 = r1;
    }

    public C269234en(C269254ep r1, C269254ep r2, C269254ep r3, C269254ep r4, C269254ep r5) {
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A00 = r4;
        this.A01 = r5;
    }
}
