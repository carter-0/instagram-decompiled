package X;

import java.util.concurrent.Callable;

public final class TNR implements Callable {
    public final /* synthetic */ AnonymousClass6R2 A00;
    public final /* synthetic */ R9M A01;
    public final /* synthetic */ String A02;

    public TNR(AnonymousClass6R2 r1, R9M r9m, String str) {
        this.A02 = str;
        this.A01 = r9m;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str = this.A02;
        String A0R = 002.A0R("syncFetchResponseForKey:", str);
        R9M r9m = this.A01;
        AnonymousClass6R2 r3 = this.A00;
        try {
            1KZ.A01(002.A0T("BloksComponentQueryDiskCache", A0R, ':'));
            C307556Qo r4 = r3.A03;
            r9m.A00("io_read_start", r4.currentMonotonicTimestamp());
            byte[] readResourceToMemory = r3.A01.A00.readResourceToMemory(str);
            r9m.A00("io_read_end", r4.currentMonotonicTimestamp());
            return readResourceToMemory;
        } finally {
            1KZ.A00();
        }
    }
}
