package X;

import kotlin.Deprecated;

@Deprecated(message = "This is slated to be merged with GenericXmaMessageViewModel.")
public final class N6K extends AnonymousClass0T0 implements C232262tL, C328627Fn {
    public final C328607Fl A00;
    public final C328667Fr A01;
    public final AnonymousClass741 A02;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof N6K) && 0qQ.A0K(this.A02, ((N6K) obj).A02));
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final C328607Fl ApX() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7FW Aqp() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A02;
    }

    public N6K(AnonymousClass741 r2) {
        this.A02 = r2;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
