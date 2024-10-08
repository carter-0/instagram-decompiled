package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class OLD {
    public Integer A00;
    public final C69353Njs A01;
    public final OTM A02 = new OTM((AnonymousClass1FE) null, (DefaultConstructorMarker) null, 1);
    public final String A03;

    public OLD(C69353Njs njs, Integer num, String str, String str2) {
        AnonymousClass7TF.A1B(str, 1, njs);
        this.A01 = njs;
        this.A03 = str2;
        this.A00 = num;
    }

    public final long A00() {
        OTM otm = this.A02;
        long j = otm.A00;
        long j2 = otm.A01;
        boolean z = false;
        if (1 <= j2 && j2 < j) {
            z = true;
        }
        if (!z) {
            return 0;
        }
        long j3 = j - j2;
        otm.A01 = 0;
        return j3;
    }
}
