package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.3iZ  reason: invalid class name and case insensitive filesystem */
public final class C248773iZ extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248773iZ(2Lk r7) {
        super("FxStoreFamilyDeviceIdInSharedPrefs", 668963102, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        String str;
        2Lk r2 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        1Uk A002 = AnonymousClass1UZ.A00(r2.A01).A00("FX_CACHE_FDID_STORE");
        19i A01 = 0jh.A04.A01(r2.A04).A01(19f.A2K);
        if (A01 != null) {
            str = A01.A01;
        } else {
            str = "";
        }
        1W3 AR0 = A002.AR0();
        AR0.A09("fdid", str);
        AR0.A0B();
    }
}
