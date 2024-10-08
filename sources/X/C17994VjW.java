package X;

import java.io.File;

/* renamed from: X.VjW  reason: case insensitive filesystem */
public final class C17994VjW {
    public C17874VhR A00;
    public boolean A01;
    public final String A02;
    public final long[] A03;
    public final /* synthetic */ C19866Wgt A04;

    public C17994VjW(C19866Wgt wgt, String str) {
        this.A04 = wgt;
        this.A02 = str;
        this.A03 = new long[wgt.A06];
    }

    public final File A00() {
        return new File(this.A04.A07, 002.A0b(this.A02, ".", 0));
    }

    public final File A01() {
        return new File(this.A04.A07, 002.A06(0, this.A02, ".", ".tmp"));
    }
}
