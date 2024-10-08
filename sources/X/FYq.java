package X;

import java.lang.ref.WeakReference;

public final class FYq implements AnonymousClass0lh {
    public WeakReference A00;
    public WeakReference A01;
    public final 1wn A02;
    public final 0lg A03;

    public static FAI A00(0lg r3) {
        FAI fai;
        FYq fYq = (FYq) r3.A01(FYq.class, new C51586Fwa(r3, 18));
        WeakReference weakReference = fYq.A01;
        if (weakReference != null && (fai = (FAI) weakReference.get()) != null) {
            return fai;
        }
        FAI fai2 = new FAI();
        fYq.A01 = new WeakReference(fai2);
        return fai2;
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            weakReference.clear();
        }
        AnonymousClass1Nd.A00(this.A03).A02(this.A02, 27U.class);
    }

    public FYq(0lg r4, FAH fah) {
        FXZ A002 = FXZ.A00(this, 70);
        this.A02 = A002;
        this.A03 = r4;
        this.A00 = new WeakReference(fah);
        AnonymousClass1Nd.A00(r4).A01(A002, 27U.class);
    }
}
