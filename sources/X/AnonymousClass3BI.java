package X;

import java.lang.ref.Reference;

/* renamed from: X.3BI  reason: invalid class name */
public final class AnonymousClass3BI extends 0Yg implements 0sP {
    public static final AnonymousClass3BI A00 = new AnonymousClass3BI();

    public AnonymousClass3BI() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Reference reference = (Reference) obj;
        boolean z = false;
        0qQ.A0B(reference, 0);
        if (reference.get() == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
