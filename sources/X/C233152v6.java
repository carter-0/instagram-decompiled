package X;

/* renamed from: X.2v6  reason: invalid class name and case insensitive filesystem */
public final class C233152v6 implements AnonymousClass2v7 {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public int A06 = 0;
    public int A07 = 0;

    public final AnonymousClass3VY Bx7() {
        return new AnonymousClass3VY(this.A00, this.A05, this.A03, this.A04);
    }

    public final void CM3(int i, Integer num) {
        if (num == AnonymousClass05K.A0C) {
            this.A00 += i;
        } else if (num == AnonymousClass05K.A0N) {
            this.A05 += i;
        }
    }

    public final void CM4(Integer num) {
        if (num == AnonymousClass05K.A0C) {
            this.A01++;
        } else if (num == AnonymousClass05K.A0N) {
            this.A02++;
        }
        CM3(1, num);
    }

    public final void CM5(Integer num) {
        if (num == AnonymousClass05K.A0C) {
            this.A03++;
        } else if (num == AnonymousClass05K.A0N) {
            this.A04++;
        }
    }

    public final void DfI() {
        this.A00 = this.A06;
        this.A05 = this.A07;
        this.A01 = 0;
        this.A02 = 0;
    }

    public final void DpV(boolean z) {
        this.A06 = this.A00;
        this.A07 = this.A05;
        this.A00 = 0;
        this.A05 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }
}
