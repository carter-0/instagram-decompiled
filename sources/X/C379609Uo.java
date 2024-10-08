package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Uo  reason: invalid class name and case insensitive filesystem */
public final class C379609Uo extends 0Yg implements C62320sa {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6L8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C379609Uo(AnonymousClass6L8 r2, String str, String str2, long j) {
        super(0);
        this.A03 = str;
        this.A01 = r2;
        this.A02 = str2;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Map map = AnonymousClass6L8.A04;
        String str = this.A03;
        Number number = (Number) map.get(str);
        AnonymousClass6L8 r2 = this.A01;
        int hashCode = r2.A00.hashCode();
        int A002 = AnonymousClass6QC.A00(str, 51511298, hashCode);
        if (number == null || A002 < number.intValue()) {
            String str2 = this.A02;
            if (str2 == null) {
                String str3 = str;
                AnonymousClass6QC.A02(r2.A01, str3, TimeUnit.NANOSECONDS, 51511298, hashCode, this.A00);
            } else {
                AnonymousClass6QC.A01(r2.A01, str, str2, TimeUnit.NANOSECONDS, 51511298, hashCode, this.A00);
            }
        }
        return C60340gF.A00;
    }
}
