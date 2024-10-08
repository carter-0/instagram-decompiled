package X;

import java.util.List;

/* renamed from: X.Rqc  reason: case insensitive filesystem */
public final class C10339Rqc {
    public final List A00;
    public final boolean A01;

    public C10339Rqc(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
        if (!AnonymousClass7TE.A1b(list)) {
            throw AnonymousClass7TE.A0w("credentialOptions should not be empty");
        }
    }
}
