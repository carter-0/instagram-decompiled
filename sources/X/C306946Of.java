package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Of  reason: invalid class name and case insensitive filesystem */
public final class C306946Of implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6LP A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public C306946Of(AnonymousClass6LP r1, String str, Map map, long j) {
        this.A02 = str;
        this.A01 = r1;
        this.A03 = map;
        this.A00 = j;
    }

    public final void run() {
        Map map = AnonymousClass6LP.A08;
        String str = this.A02;
        Number number = (Number) map.get(str);
        AnonymousClass6QC r5 = AnonymousClass6QC.A00;
        AnonymousClass6LP r2 = this.A01;
        int hashCode = r2.A05.hashCode();
        int A002 = AnonymousClass6QC.A00(str, 906037831, hashCode);
        if (number == null || A002 < number.intValue()) {
            Map map2 = this.A03;
            if (map2 == null) {
                AnonymousClass6QC.A02(r2.A04, str, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
            } else {
                C306966Oh r7 = new C306966Oh(str, map2);
                r5.A05(r2.A04, r7, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
            }
            AnonymousClass6LP.A02(r2, str);
            AnonymousClass6LP.A00(r2, hashCode);
        }
    }
}
