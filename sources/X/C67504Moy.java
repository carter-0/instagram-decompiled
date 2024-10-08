package X;

import java.util.Calendar;

/* renamed from: X.Moy  reason: case insensitive filesystem */
public final class C67504Moy extends 0ng {
    public final /* synthetic */ C67502Mow A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67504Moy(C67502Mow mow) {
        super(1927605572, 3, false, true);
        this.A00 = mow;
    }

    public final void run() {
        boolean z;
        C67502Mow mow = this.A00;
        long j = mow.A06.A01.getLong("copresence_model_expiration", 0);
        long j2 = 604800000 + j;
        if (j > 0 && Calendar.getInstance().getTimeInMillis() < j2) {
            z = false;
        } else if (j > 0) {
            z = true;
        } else {
            C67502Mow.A01(mow);
            return;
        }
        mow.A04.ATE(new C67510Mp5(mow, z));
    }
}
