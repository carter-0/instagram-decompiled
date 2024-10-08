package X;

import android.os.MemoryFile;
import java.io.File;

/* renamed from: X.9ki  reason: invalid class name and case insensitive filesystem */
public final class C386509ki extends 0ng {
    public final /* synthetic */ C387389m8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386509ki(C387389m8 r4) {
        super(83, 2, false, false);
        this.A00 = r4;
    }

    public final void run() {
        C387389m8 r0 = this.A00;
        SOH soh = r0.A07;
        soh.getClass();
        int i = r0.A00;
        MemoryFile[] memoryFileArr = r0.A0I;
        memoryFileArr.getClass();
        File file = r0.A08;
        file.getClass();
        boolean A01 = soh.A01(file, memoryFileArr, i, r0.A0F);
        r0.A0M.set(3);
        11Z.A03(new C41014Amy(this, A01));
    }
}
