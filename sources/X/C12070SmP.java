package X;

/* renamed from: X.SmP  reason: case insensitive filesystem */
public final class C12070SmP implements AnonymousClass0Mm {
    public final /* synthetic */ C12027Sko A00;

    public final byte AjC(int i) {
        if (i == 4) {
            return this.A00.A05;
        }
        if (i == 6) {
            return 0;
        }
        throw DbW.A0a("Not a byte field:", i);
    }

    public final long BOT(int i) {
        if (i == 3) {
            return this.A00.A0A;
        }
        if (i == 5) {
            return -1;
        }
        throw DbW.A0a("Not a long field: ", i);
    }

    public final int BXS() {
        return 7;
    }

    public C12070SmP(C12027Sko sko) {
        this.A00 = sko;
    }

    public final int BI5(int i) {
        if (i == 0) {
            return this.A00.A06;
        }
        if (i == 1) {
            return this.A00.A09;
        }
        if (i == 2) {
            return this.A00.A07;
        }
        throw DbW.A0a("Not an int field: ", i);
    }

    public final short Btw(int i) {
        throw AnonymousClass7TE.A0w("No short field");
    }

    public final int Bwl(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return 4;
            case 3:
            case 5:
                return 8;
            case 4:
            case 6:
                return 1;
            default:
                throw DbW.A0a("Invalid field id ", i);
        }
    }
}
