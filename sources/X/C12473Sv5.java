package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sv5  reason: case insensitive filesystem */
public final class C12473Sv5 implements C13736Tg8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C13736Tg8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ Map A06;

    public final void Das(String str) {
        try {
            Context context = this.A00;
            List list = this.A04;
            String str2 = this.A02;
            Map map = this.A06;
            List list2 = this.A05;
            C11395SRo.A02(context, this.A01, false, "SMS_OTP", "VERIFY_FACTOR", str2, (String) null, (String) null, this.A03, list, list2, map);
        } catch (C8966RJg e) {
            this.A01.Dap(false, C51967G9n.A0j(), e);
        }
    }

    public C12473Sv5(Context context, C13736Tg8 tg8, String str, String str2, List list, List list2, Map map) {
        this.A00 = context;
        this.A04 = list;
        this.A02 = str;
        this.A06 = map;
        this.A05 = list2;
        this.A03 = str2;
        this.A01 = tg8;
    }

    public final void Dap(Boolean bool, Integer num, Throwable th) {
        this.A01.Dap(bool, num, th);
    }
}
