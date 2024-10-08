package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DgI  reason: case insensitive filesystem */
public final class C46515DgI {
    public final 0xG A00 = DbS.A0O("newsfeed_you");
    public final 0lg A01;
    public final AtomicReference A02 = new AtomicReference((Object) null);
    public final AtomicReference A03 = new AtomicReference((Object) null);

    public final void A00() {
        AtomicReference atomicReference = this.A02;
        String str = (String) atomicReference.get();
        if (str != null) {
            AtomicReference atomicReference2 = this.A03;
            String str2 = (String) atomicReference2.get();
            if (str2 != null) {
                atomicReference.set((Object) null);
                atomicReference2.set((Object) null);
                DbZ.A1T(AnonymousClass0kN.A01(this.A00, this.A01), "notification_feed_exit", str, str2);
            }
        }
    }

    public C46515DgI(0lg r3) {
        this.A01 = r3;
    }
}
