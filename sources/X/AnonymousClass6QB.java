package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6QB  reason: invalid class name */
public final class AnonymousClass6QB implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6LP A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass6QB(AnonymousClass6LP r1, String str, String str2, long j) {
        this.A03 = str;
        this.A01 = r1;
        this.A02 = str2;
        this.A00 = j;
    }

    public final void run() {
        Map map = AnonymousClass6LP.A08;
        String str = this.A03;
        Number number = (Number) map.get(str);
        AnonymousClass6LP r2 = this.A01;
        int hashCode = r2.A05.hashCode();
        int A002 = AnonymousClass6QC.A00(str, 906037831, hashCode);
        if (number == null || A002 < number.intValue()) {
            String str2 = this.A02;
            if (str2 == null) {
                String str3 = str;
                AnonymousClass6QC.A02(r2.A04, str3, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
            } else {
                AnonymousClass6QC.A01(r2.A04, str, str2, TimeUnit.NANOSECONDS, 906037831, hashCode, this.A00);
            }
            AnonymousClass6LP.A02(r2, str);
            AnonymousClass6LP.A00(r2, hashCode);
        }
    }
}
