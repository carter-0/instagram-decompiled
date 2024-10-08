package X;

/* renamed from: X.IjH  reason: case insensitive filesystem */
public final class C57962IjH implements Runnable {
    public boolean A00;
    public boolean A01;
    public final C333787a8 A02;
    public final 1OC A03;
    public final String A04;

    public C57962IjH(C333787a8 r2, 1OC r3, String str) {
        0qQ.A0B(r2, 2);
        this.A02 = r2;
        this.A04 = str;
        this.A03 = r3;
    }

    public final void run() {
        if (!this.A01) {
            this.A01 = true;
            this.A02.A04(this.A04, false);
            1ES.A03(this.A03);
        }
    }
}
