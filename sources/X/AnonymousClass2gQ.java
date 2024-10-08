package X;

/* renamed from: X.2gQ  reason: invalid class name */
public abstract class AnonymousClass2gQ {
    public int A00 = -1;
    public boolean A01;
    public final AnonymousClass2gO A02;
    public final /* synthetic */ 2Fk A03;

    public void A00() {
    }

    public abstract boolean A02();

    public AnonymousClass2gQ(2Fk r2, AnonymousClass2gO r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    public final void A01(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            2Fk r3 = this.A03;
            int i = -1;
            if (z) {
                i = 1;
            }
            int i2 = r3.A00;
            r3.A00 = i + i2;
            if (!r3.A03) {
                r3.A03 = true;
                while (true) {
                    try {
                        int i3 = r3.A00;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            if (i3 > 0) {
                                r3.A03();
                            }
                        } else if (i2 > 0 && i3 == 0) {
                            r3.A04();
                        }
                        i2 = i3;
                    } finally {
                        r3.A03 = false;
                    }
                }
            }
            if (this.A01) {
                r3.A07(this);
            }
        }
    }

    public final boolean A03(AnonymousClass07Z r3) {
        if (!(this instanceof AnonymousClass2gP) || ((AnonymousClass2gP) this).A00 != r3) {
            return false;
        }
        return true;
    }
}
