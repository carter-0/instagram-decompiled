package X;

/* renamed from: X.Dtd  reason: case insensitive filesystem */
public final class C47252Dtd extends AnonymousClass0T0 implements C232262tL {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C47252Dtd) && this.A00 == ((C47252Dtd) obj).A00);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "DEFAULT_INTEREST_ADD_KEY";
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C47252Dtd dtd = (C47252Dtd) obj;
        if (dtd == null || dtd.A00 != this.A00) {
            return false;
        }
        return true;
    }

    public C47252Dtd(boolean z) {
        this.A00 = z;
    }

    public C47252Dtd() {
        this(true);
    }
}
