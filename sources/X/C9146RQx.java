package X;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.RQx  reason: case insensitive filesystem */
public abstract class C9146RQx {
    public final void A02(C13633Tdz tdz) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A07) {
            if (AnonymousClass7TF.A1Q((basePendingResult.A0A.getCount() > 0 ? 1 : (basePendingResult.A0A.getCount() == 0 ? 0 : -1)))) {
                tdz.D52(basePendingResult.A01);
            } else {
                basePendingResult.A09.add(tdz);
            }
        }
    }
}
