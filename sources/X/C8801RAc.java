package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.mobileboost.framework.os.jni.lite.MobileBoostNativeLite;

/* renamed from: X.RAc  reason: case insensitive filesystem */
public final class C8801RAc extends 0vM {
    public final /* synthetic */ T78 A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8801RAc(T78 t78, boolean z) {
        super("BundledLayoutLoaderMlock", 952254433, 1, false, false);
        this.A00 = t78;
        this.A01 = z;
    }

    public final void loggedRun() {
        T78 t78 = this.A00;
        boolean z = t78.A00;
        boolean z2 = this.A01;
        if (z != z2) {
            t78.A00 = z2;
            if (t78.A04) {
                AnonymousClass0eM r3 = t78.A03;
                MobileBoostNativeLite.mlockPages(((126) r3.getValue()).A01, ((126) r3.getValue()).A00 & 255, 0, (((126) r3.getValue()).A00 >> 30) & 3, z2);
                return;
            }
            String str = t78.A02;
            int i = t78.A01;
            if (z2) {
                DalvikInternals.mLockMappedFile(str, i, false);
            } else {
                DalvikInternals.mUnlockMappedFile(str, i, false);
            }
        }
    }
}
