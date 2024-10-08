package X;

import com.facebook.mobileconfig.MobileConfigFetcherHandler;

/* renamed from: X.4c6  reason: invalid class name and case insensitive filesystem */
public final class C267724c6 extends 1P0 {
    public final /* synthetic */ MobileConfigFetcherHandler A00;
    public final /* synthetic */ String A01;

    public C267724c6(MobileConfigFetcherHandler mobileConfigFetcherHandler, String str) {
        this.A01 = str;
        this.A00 = mobileConfigFetcherHandler;
    }

    public final void onFail(C268654dm r7) {
        int i;
        int A03 = AnonymousClass0fD.A03(1782874819);
        0qQ.A0B(r7, 0);
        C2810655r r5 = (C2810655r) r7.A00();
        if (r5 == null) {
            0KC.A0P("IgMobileConfigFetcher", "%s request failed, err: null raw response", new Object[]{this.A01});
            this.A00.onComplete(false, "");
            i = 1230203236;
        } else {
            0KC.A0P("IgMobileConfigFetcher", "%s request failed, err: %d", new Object[]{this.A01, Integer.valueOf(r5.A00.A02)});
            this.A00.onComplete(false, r5.A00());
            i = -1450407683;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1474635599);
        C2810655r r6 = (C2810655r) obj;
        int A032 = AnonymousClass0fD.A03(1491729227);
        0qQ.A0B(r6, 0);
        this.A00.onComplete(true, r6.A00());
        AnonymousClass0fD.A0A(-479829471, A032);
        AnonymousClass0fD.A0A(-1203517537, A03);
    }
}
