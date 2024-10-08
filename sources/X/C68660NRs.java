package X;

import java.util.concurrent.CompletableFuture;

/* renamed from: X.NRs  reason: case insensitive filesystem */
public final class C68660NRs extends 0ng {
    public final /* synthetic */ SJ9 A00;
    public final /* synthetic */ CompletableFuture A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68660NRs(SJ9 sj9, CompletableFuture completableFuture) {
        super(1891369907, 2, false, true);
        this.A00 = sj9;
        this.A01 = completableFuture;
    }

    public final void run() {
        String str;
        String str2;
        0KC.A0D("EncryptedBackupsDeviceIdUtil", "getDeviceIdAsync runFDIDSync in runnable");
        19i A012 = this.A00.A01();
        if (A012 != null) {
            str = A012.A01;
        } else {
            str = null;
        }
        C66580MXl.A1U("getDeviceIdAsync runFDIDSync in runnable sync done ", str, "EncryptedBackupsDeviceIdUtil");
        CompletableFuture completableFuture = this.A01;
        if (A012 == null || (str2 = A012.A01) == null) {
            str2 = "uniqueDeviceId";
        }
        completableFuture.complete(str2);
    }
}
