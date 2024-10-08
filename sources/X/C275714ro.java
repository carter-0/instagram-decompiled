package X;

import com.instagram.trust.noncemanager.NonceTypeMap;
import com.instagram.trust.noncemanager.NonceUserMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4ro  reason: invalid class name and case insensitive filesystem */
public final class C275714ro {
    public final Map A00 = new HashMap();

    public final String A00(String str) {
        0qQ.A0B(str, 0);
        NonceUserMap nonceUserMap = (NonceUserMap) this.A00.get(str);
        if (nonceUserMap == null) {
            return null;
        }
        C250873mC r3 = C250863mB.A03;
        Map map = nonceUserMap.A00;
        C255453u9 r1 = C255453u9.A01;
        return r3.A02(map, new C258613zM(r1, r1));
    }

    public C275714ro() {
        String string = AnonymousClass0xl.A00(C61170le.A00).A00.getString("client_nonces", (String) null);
        if (string != null && string.length() != 0) {
            C250873mC r1 = C250863mB.A03;
            C255463uA[] r0 = NonceTypeMap.A01;
            this.A00.putAll(((NonceTypeMap) r1.A00(string, C279694z6.A00)).A00);
        }
    }
}
