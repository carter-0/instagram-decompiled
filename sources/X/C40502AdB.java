package X;

import java.util.Set;

/* renamed from: X.AdB  reason: case insensitive filesystem */
public final class C40502AdB implements C74484Pve {
    public final /* synthetic */ C358628bD A00;
    public final /* synthetic */ C358368an A01;
    public final /* synthetic */ Set A02;

    public final void onFailure() {
    }

    public final void onFailureInBackground(AnonymousClass1XT r1) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final void onSuccess(AnonymousClass2Ep r6) {
        boolean A1V = AnonymousClass7TF.A1V(r6);
        this.A01.A1p.put(this.A02, Boolean.valueOf(A1V));
        this.A00.A00(A1V, false);
    }

    public final void onSuccessInBackground(AnonymousClass2Ep r1) {
    }

    public C40502AdB(C358628bD r1, C358368an r2, Set set) {
        this.A01 = r2;
        this.A02 = set;
        this.A00 = r1;
    }
}
