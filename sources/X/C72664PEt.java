package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.PEt  reason: case insensitive filesystem */
public final class C72664PEt implements C74344PtK {
    public final /* synthetic */ BBV A00;
    public final /* synthetic */ SettableFuture A01;

    public C72664PEt(BBV bbv, SettableFuture settableFuture) {
        this.A00 = bbv;
        this.A01 = settableFuture;
    }

    public final void DRn(String str, boolean z, String str2) {
        BBV bbv = this.A00;
        SettableFuture settableFuture = this.A01;
        String str3 = bbv.A00;
        if (str3 != null && str.equals(str3)) {
            settableFuture.set(AnonymousClass7TE.A1L(Boolean.valueOf(z), str2));
        }
    }
}
