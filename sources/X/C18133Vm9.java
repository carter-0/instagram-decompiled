package X;

import com.instagram.wellbeing.livechat.LiveChatNonce;
import com.instagram.wellbeing.livechat.LiveChatNonceList;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Vm9  reason: case insensitive filesystem */
public abstract class C18133Vm9 {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        0wj r3;
        int i;
        StringBuilder sb;
        String str;
        C308206Td.A0B(r6);
        List list = r7.A00;
        String A0t = DbU.A0t(list, 0);
        String A0t2 = DbU.A0t(list, 1);
        Object A00 = r7.A00();
        DbS.A1Y(A00);
        String str2 = (String) A00;
        HashMap hashMap = new HashMap();
        C17124VIu.A00(hashMap);
        if (A0t == null || A0t.length() == 0 || A0t2 == null || A0t2.length() == 0) {
            0qQ.A0B(str2, 0);
            hashMap.remove(str2);
            try {
                A01(hashMap);
                return null;
            } catch (IOException e) {
                e = e;
                r3 = 0wj.A01;
                i = 817898180;
                sb = new StringBuilder();
                str = "error removing live chat nonce: ";
            }
        } else {
            0qQ.A0B(str2, 0);
            hashMap.put(str2, new LiveChatNonce(str2, A0t, A0t2));
            try {
                A01(hashMap);
                return null;
            } catch (IOException e2) {
                e = e2;
                r3 = 0wj.A01;
                i = 817898180;
                sb = new StringBuilder();
                str = "error saving live chat nonce: ";
            }
        }
        DbT.A1Q(r3, AnonymousClass7TG.A0m(e, str, sb), i);
        return null;
    }

    public static void A01(AbstractMap abstractMap) {
        ArrayList arrayList = new ArrayList(abstractMap.values());
        0xm A00 = AnonymousClass0xl.A00(C61170le.A00);
        String A02 = C250863mB.A03.A02(new LiveChatNonceList(arrayList), C20516Wsw.A00);
        0xY AR4 = A00.A00.AR4();
        AR4.E5g("live_chat_nonce", A02);
        AR4.apply();
    }
}
