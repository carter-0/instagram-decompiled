package X;

import java.util.List;

/* renamed from: X.DtP  reason: case insensitive filesystem */
public final class C47238DtP extends AnonymousClass0T0 implements C232262tL {
    public final C266444Yx A00;
    public final C266444Yx A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47238DtP) {
                C47238DtP dtP = (C47238DtP) obj;
                if (!0qQ.A0K(this.A00, dtP.A00) || !0qQ.A0K(this.A01, dtP.A01) || !0qQ.A0K(this.A02, dtP.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        List list;
        C47238DtP dtP = (C47238DtP) obj;
        List list2 = this.A02;
        if (dtP != null) {
            list = dtP.A02;
        } else {
            list = null;
        }
        return 0qQ.A0K(list2, list);
    }

    public C47238DtP(C266444Yx r1, C266444Yx r2, List list) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
    }
}
