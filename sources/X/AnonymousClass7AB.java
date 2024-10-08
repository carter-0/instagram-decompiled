package X;

/* renamed from: X.7AB  reason: invalid class name */
public final class AnonymousClass7AB extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7AB) && this.A00 == ((AnonymousClass7AB) obj).A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        String str;
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "ARMADILLO_EXPRESS_PROTOBUF";
        } else {
            str = "PROTON";
        }
        return str.hashCode() + intValue;
    }

    public AnonymousClass7AB(Integer num) {
        this.A00 = num;
    }
}
