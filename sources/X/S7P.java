package X;

public class S7P {
    public int A00() {
        if (this instanceof QM3) {
            return ((QM3) this).A00.A00;
        }
        if (this instanceof QM2) {
            return ((QM2) this).A00.A00();
        }
        return 0;
    }

    public String A01() {
        if (this instanceof QM3) {
            return ((QM3) this).A00.A0C;
        }
        return "";
    }

    public boolean A02() {
        if (this instanceof QM3) {
            return ((QM3) this).A00.A0F;
        }
        if (this instanceof QM2) {
            return ((QM2) this).A00.A02();
        }
        return true;
    }

    public boolean A03() {
        if (this instanceof QM3) {
            return ((QM3) this).A00.A0I;
        }
        return false;
    }

    public boolean A04() {
        if (this instanceof QM3) {
            return ((QM3) this).A00.A0H;
        }
        if (this instanceof QM2) {
            return ((QM2) this).A00.A04();
        }
        return true;
    }

    public boolean A05() {
        if (this instanceof QM3) {
            return ((QM3) this).A00.A0J;
        }
        return true;
    }
}
