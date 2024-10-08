package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.user.model.Product;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6xX  reason: invalid class name and case insensitive filesystem */
public final class C323466xX implements 1wn {
    public final /* synthetic */ C323426xT A00;

    public C323466xX(C323426xT r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(157610399);
        C323526xd r13 = (C323526xd) obj;
        int A032 = AnonymousClass0fD.A03(-1225735555);
        C323426xT r2 = this.A00;
        IgFundedIncentive igFundedIncentive = r2.A00;
        if (igFundedIncentive != null && r13.A01.contains(igFundedIncentive.A07)) {
            r2.A00 = null;
        }
        C323486xZ r7 = r2.A07;
        String str = r13.A00;
        C18071Vky A06 = r7.A06(str);
        if (A06 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (Object next : A06.A01.entrySet()) {
                0qQ.A07(next);
                Map.Entry entry = (Map.Entry) next;
                Object key = entry.getKey();
                W0O w0o = (W0O) entry.getValue();
                Product A033 = w0o.A03();
                if (A033 == null || !A033.A0P) {
                    linkedHashMap.put(key, w0o);
                } else {
                    A06.A00 -= w0o.A01;
                    z = true;
                }
            }
            A06.A01 = linkedHashMap;
            if (z) {
                r7.A0C.put(str, Integer.valueOf(A06.A00));
                C323486xZ.A02(r7);
                r7.A07.D1H(A06, str);
            }
        }
        AnonymousClass0fD.A0A(1517075457, A032);
        AnonymousClass0fD.A0A(-353314536, A03);
    }
}
