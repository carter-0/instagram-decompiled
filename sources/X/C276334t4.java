package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.4t4  reason: invalid class name and case insensitive filesystem */
public final class C276334t4 extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C276334t4(Context context, long j, long j2) {
        super(1);
        this.A02 = context;
        this.A00 = j;
        this.A01 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        long j;
        1Zp r12 = (1Zp) obj;
        0qQ.A0B(r12, 0);
        Context context = this.A02;
        long j2 = this.A00;
        long j3 = this.A01;
        int i = AnonymousClass1KE.A00;
        if (i > 0 && i < Integer.MAX_VALUE && AnonymousClass1KE.A01 > 0 && 2SP.A01.A06(0, i) == 0) {
            2UD r4 = new 2UW("cold_start", (String) null, 0, j2, true);
            List list = 0sn.A00;
            AnonymousClass9IA r6 = 2Tr.A01;
            ArrayList A0T = 00k.A0T(new 2UE(r6, r6, r4, list, list), 2Tr.A05.A04(context, AnonymousClass1KE.A01));
            r12.A03("aware_trace_readable", C271094ht.A01(A0T));
            r12.A01("aware_trace_count", A0T.size());
            r12.A03("aware_trace", C271094ht.A02(A0T).toString());
            ListIterator listIterator = A0T.listIterator(A0T.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                2UD r3 = ((2UE) obj2).A03;
                if (!(r3 instanceof C271154hz) && !(r3 instanceof AnonymousClass2UK)) {
                    break;
                }
            }
            2UE r42 = (2UE) obj2;
            if (r42 != null) {
                j = r42.A03.A00;
            } else {
                j = 0;
            }
            r12.A02("time_from_last_action_to_app_kill", j3 - j);
        }
        return C60340gF.A00;
    }
}
