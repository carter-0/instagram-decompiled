package X;

public final class UO0 extends AnonymousClass0T0 implements C232262tL {
    public final C3034368u A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof UO0) && 0qQ.A0K(this.A00, ((UO0) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C3034368u r0;
        C276544tV r02;
        C276544tV r03;
        UO0 uo0 = (UO0) obj;
        C3034368u r04 = this.A00;
        String str2 = null;
        if (r04 == null || (r03 = r04.A02) == null) {
            str = null;
        } else {
            str = r03.A0C();
        }
        if (!(uo0 == null || (r0 = uo0.A00) == null || (r02 = r0.A02) == null)) {
            str2 = r02.A0C();
        }
        return 0qQ.A0K(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShoppingDataSignifierBannerViewModel(key=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public UO0(C3034368u r1) {
        this.A00 = r1;
    }
}
