package X;

/* renamed from: X.7v7  reason: invalid class name and case insensitive filesystem */
public final class C346407v7 implements C344907sc {
    public Integer A00;

    public final boolean AOe() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C346407v7) obj).A00;
        }
        return true;
    }

    public final C344877sZ CAG() {
        return C344877sZ.INPUT_FACING;
    }

    public final int hashCode() {
        String str;
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "FRONT";
        } else {
            str = "BACK";
        }
        return str.hashCode() + intValue;
    }
}
