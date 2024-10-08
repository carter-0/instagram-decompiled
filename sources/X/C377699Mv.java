package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Mv  reason: invalid class name and case insensitive filesystem */
public final class C377699Mv extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377699Mv(Object obj, Object obj2, String str, int i, long j) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = j;
        this.A02 = obj2;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            AnonymousClass6L8 r0 = (AnonymousClass6L8) this.A03;
            QuickPerformanceLogger quickPerformanceLogger = r0.A01;
            int hashCode = r0.A00.hashCode();
            long j = this.A01;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            HashMap hashMap = new HashMap();
            hashMap.put("error", "general_error");
            hashMap.put("error_msg", this.A04);
            AnonymousClass6QC.A04(quickPerformanceLogger, hashMap, timeUnit, 51511298, hashCode, j, 3);
        } else {
            Map map = AnonymousClass6L8.A04;
            String str = this.A04;
            Number number = (Number) map.get(str);
            AnonymousClass6QC r5 = AnonymousClass6QC.A00;
            AnonymousClass6L8 r3 = (AnonymousClass6L8) this.A03;
            int hashCode2 = r3.A00.hashCode();
            int A002 = AnonymousClass6QC.A00(str, 51511298, hashCode2);
            if (number == null || A002 < number.intValue()) {
                Map map2 = (Map) this.A02;
                if (map2 == null) {
                    AnonymousClass6QC.A02(r3.A01, str, TimeUnit.NANOSECONDS, 51511298, hashCode2, this.A01);
                } else {
                    C306966Oh r7 = new C306966Oh(str, map2);
                    r5.A05(r3.A01, r7, TimeUnit.NANOSECONDS, 51511298, hashCode2, this.A01);
                }
            }
        }
        return C60340gF.A00;
    }
}
