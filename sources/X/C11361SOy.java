package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SOy  reason: case insensitive filesystem */
public final class C11361SOy {
    public static final C11361SOy A03 = new C11361SOy(true);
    public boolean A00;
    public boolean A01;
    public final TS5 A02;

    public C11361SOy(boolean z) {
        R72 r72 = new R72(0);
        this.A02 = r72;
        if (!this.A01) {
            r72.A05();
            this.A01 = true;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Iterable entrySet;
        Map.Entry A1J;
        C11361SOy sOy = new C11361SOy();
        TS5 ts5 = this.A02;
        if (0 < ts5.A00.size()) {
            A1J = (Map.Entry) ts5.A00.get(0);
        } else {
            if (ts5.A01.isEmpty()) {
                entrySet = C10104Rmg.A00;
            } else {
                entrySet = ts5.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                A1J = AnonymousClass7TE.A1J(it);
            } else {
                sOy.A00 = this.A00;
                return sOy;
            }
        }
        A1J.getKey();
        A1J.getValue();
        throw AnonymousClass7TE.A11("isRepeated");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11361SOy)) {
            return false;
        }
        return this.A02.equals(((C11361SOy) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public C11361SOy() {
        this.A02 = new R72(16);
    }
}
