package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.List;

/* renamed from: X.IcK  reason: case insensitive filesystem */
public final class C57532IcK implements C59560JOg {
    public final /* synthetic */ JR0 A00;
    public final /* synthetic */ C2614049l A01;

    public C57532IcK(JR0 jr0, C2614049l r2) {
        this.A00 = jr0;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void Dzd(Object obj, Object obj2, String str, List list) {
        float f;
        C2613149c r0;
        String BRt;
        String Apg;
        String str2;
        String str3;
        C254253sB r6 = (C254253sB) obj2;
        List<C61042Jvg> list2 = list;
        0qQ.A0B(list2, 3);
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        int i = 0;
        int i2 = 0;
        for (C61042Jvg jvg : list2) {
            if (jvg.A01) {
                i++;
            }
            if (jvg.A00) {
                i2++;
            }
        }
        int size = list2.size();
        float f2 = 0.0f;
        if (size != 0) {
            float f3 = (float) size;
            f = ((float) i) / f3;
            f2 = ((float) i2) / f3;
        } else {
            f = 0.0f;
        }
        JR0 jr0 = this.A00;
        Integer num = jr0.Apm().A03;
        Integer num2 = AnonymousClass05K.A01;
        if (num != num2) {
            num2 = AnonymousClass05K.A00;
            if (num == num2 && i == 0 && i2 != 0) {
                r0 = this.A01.A00;
                BRt = jr0.BRt();
                Apg = jr0.Apg();
                str2 = "Vista";
                str3 = null;
                f2 = 0.0f;
            } else {
                return;
            }
        } else if (f != f2) {
            if (f2 != 0.0f) {
                num2 = AnonymousClass05K.A00;
            }
            r0 = this.A01.A00;
            BRt = jr0.BRt();
            Apg = jr0.Apg();
            str2 = "Vista";
            str3 = null;
        } else {
            return;
        }
        r0.A01(new C53304Glq(r6, num2, BRt, Apg, str2, str3, f2, now));
    }
}
