package X;

import java.util.Set;

/* renamed from: X.8EK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8EK implements C61910qF, C3495480u {
    public final /* synthetic */ AnonymousClass8E8 A00;

    public AnonymousClass8EK(AnonymousClass8E8 r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3495480u) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, AnonymousClass8E8.class, "setupCameraToolPairings", "setupCameraToolPairings(Ljava/util/Set;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Set set = (Set) obj;
        0qQ.A0B(set, 0);
        AnonymousClass8E8.A01(this.A00, set);
    }
}
