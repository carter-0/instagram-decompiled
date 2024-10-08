package androidx.paging;

import X.002;
import X.00k;
import X.0qQ;
import X.0rw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C62942Kou;
import X.JTT;
import X.LP3;
import java.util.List;

public final class PageEvent$StaticList extends C62942Kou {
    public final LP3 A00;
    public final LP3 A01;
    public final List A02;

    public PageEvent$StaticList(LP3 lp3, LP3 lp32, List list) {
        0qQ.A0B(list, 1);
        this.A02 = list;
        this.A01 = lp3;
        this.A00 = lp32;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageEvent$StaticList) {
                PageEvent$StaticList pageEvent$StaticList = (PageEvent$StaticList) obj;
                if (!0qQ.A0K(this.A02, pageEvent$StaticList.A02) || !0qQ.A0K(this.A01, pageEvent$StaticList.A01) || !0qQ.A0K(this.A00, pageEvent$StaticList.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final String toString() {
        LP3 lp3 = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PageEvent.StaticList with ");
        List list = this.A02;
        A1A.append(list.size());
        A1A.append(" items (\n                    |   first item: ");
        A1A.append(00k.A0J(list));
        A1A.append("\n                    |   last item: ");
        A1A.append(00k.A0L(list));
        A1A.append("\n                    |   sourceLoadStates: ");
        A1A.append(this.A01);
        return 0rw.A0u(002.A0R(JTT.A0o(lp3, "\n                    ", A1A), "|)"), "|");
    }
}
