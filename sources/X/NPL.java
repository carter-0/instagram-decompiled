package X;

import java.util.List;

public final class NPL extends AnonymousClass4AA {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NPL) && 0qQ.A0K(this.A00, ((NPL) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public NPL(List list) {
        this.A00 = list;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewModel(filterList=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
