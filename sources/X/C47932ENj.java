package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.ENj  reason: case insensitive filesystem */
public final class C47932ENj extends EB4 {
    public final /* synthetic */ E3X A00;

    public C47932ENj(FragmentActivity fragmentActivity, AnonymousClass0aP r4, E3X e3x) {
        String A002 = Dbj.A00();
        this.A00 = e3x;
        this.A01 = r4;
        this.A00 = fragmentActivity;
        this.A03 = false;
        this.A02 = A002;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1937266298);
        C47932ENj.super.onFinish();
        EEK eek = this.A00.A07;
        if (eek != null) {
            eek.A00();
        }
        AnonymousClass0fD.A0A(2136767930, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-632144093);
        C47932ENj.super.onStart();
        EEK eek = this.A00.A07;
        if (eek != null) {
            eek.A01();
        }
        AnonymousClass0fD.A0A(1199193664, A03);
    }
}
