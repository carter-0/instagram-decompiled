package X;

public final class FY9 implements C232262tL {
    public final Integer A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        switch (this.A00.intValue()) {
            case 0:
                return "MOST_RECENT";
            case 1:
                return "MOST_INTERACTED_WITH";
            default:
                return "LEAST_INTERACTED_WITH";
        }
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Integer num;
        FY9 fy9 = (FY9) obj;
        Integer num2 = this.A00;
        if (fy9 != null) {
            num = fy9.A00;
        } else {
            num = null;
        }
        if (num2 == num && fy9 != null && this.A01 == fy9.A01) {
            return true;
        }
        return false;
    }

    public FY9(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
