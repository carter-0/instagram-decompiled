package X;

import java.util.Arrays;

public final class FYP implements C232262tL {
    public final EWS A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FYP)) {
            return false;
        }
        FYP fyp = (FYP) obj;
        return this.A00 == fyp.A00 && 2PP.A00(this.A01, fyp.A01);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AnonymousClass7TF.A1W(this.A00, ((FYP) obj).A00);
    }

    public FYP(EWS ews, String str) {
        this.A00 = ews;
        this.A01 = str;
    }
}
