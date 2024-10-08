package X;

/* renamed from: X.LOv  reason: case insensitive filesystem */
public abstract class C64124LOv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final int A01(C62448Kfy kfy) {
        int A022 = DbU.A02(kfy, 0);
        if (A022 == 0) {
            throw AnonymousClass7TE.A0w("Cannot get presentedItems for loadType: REFRESH");
        } else if (A022 == 1) {
            return this.A03;
        } else {
            if (A022 == 2) {
                return this.A02;
            }
            throw AnonymousClass7TE.A1K();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64124LOv)) {
            return false;
        }
        C64124LOv lOv = (C64124LOv) obj;
        return this.A03 == lOv.A03 && this.A02 == lOv.A02 && this.A00 == lOv.A00 && this.A01 == lOv.A01;
    }

    public int hashCode() {
        return this.A03 + this.A02 + this.A00 + this.A01;
    }

    public C64124LOv(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public static void A00(C64124LOv lOv, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(lOv.A03);
        sb.append(",\n            |    presentedItemsAfter=");
        sb.append(lOv.A02);
        sb.append(",\n            |    originalPageOffsetFirst=");
        sb.append(lOv.A00);
        sb.append(",\n            |    originalPageOffsetLast=");
        sb.append(lOv.A01);
    }
}
