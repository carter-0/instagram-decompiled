package X;

public final class HAD extends HPZ {
    public final int A00;
    public final int A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HAD) {
                HAD had = (HAD) obj;
                if (!(this.A01 == had.A01 && this.A02 == had.A02 && this.A00 == had.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = this.A01 * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "PHOTO_BUTTON";
                break;
            case 2:
                str = "IMAGINE_BUTTON";
                break;
            default:
                str = "ADD_BUTTON";
                break;
        }
        return C51971G9r.A0F(str, intValue, i) + this.A00;
    }

    public HAD(Integer num, int i, int i2) {
        this.A01 = i;
        this.A02 = num;
        this.A00 = i2;
    }
}
