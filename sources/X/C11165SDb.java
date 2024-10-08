package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;

/* renamed from: X.SDb  reason: case insensitive filesystem */
public final class C11165SDb {
    public final /* synthetic */ FbnsServiceDelegate A00;

    public C11165SDb(FbnsServiceDelegate fbnsServiceDelegate) {
        this.A00 = fbnsServiceDelegate;
    }

    public static void A00(C11165SDb sDb) {
        FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0D;
        FbnsServiceDelegate fbnsServiceDelegate2 = sDb.A00;
        fbnsServiceDelegate2.A0B.Aek();
        AnonymousClass452 r0 = fbnsServiceDelegate2.A0C.A02;
        if (r0 != null) {
            r0.A02();
        } else {
            0KC.A0D(SFM.A04, "connectionConfigManager is null. Cannot notify about keepalive config change");
        }
    }
}
