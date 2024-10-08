package X;

/* renamed from: X.N9r  reason: case insensitive filesystem */
public final class C68304N9r extends C69557No1 {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68304N9r) && this.A00 == ((C68304N9r) obj).A00);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "NoGoogleDriveScope";
        } else {
            str = "AutoRetryOnFirstInternalError";
        }
        return C51966G9m.A04(str, intValue);
    }

    public C68304N9r(Integer num) {
        this.A00 = num;
    }
}
