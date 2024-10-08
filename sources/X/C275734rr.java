package X;

import com.instagram.common.session.UserSession;
import com.instagram.trust.noncemanager.NonceTypeMap;
import com.instagram.trust.noncemanager.NonceUserMap;
import com.instagram.trust.noncemanager.VettedDeviceNonces;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4rr  reason: invalid class name and case insensitive filesystem */
public final class C275734rr implements AnonymousClass2Kv {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C275714ro A01;

    public C275734rr(UserSession userSession, C275714ro r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void invoke(AnonymousClass3JD r10) {
        String str;
        C250663lr r8 = (C250663lr) r10.Bny();
        String str2 = null;
        if (r8 != null) {
            Class<C284265Lv> cls = C284265Lv.class;
            C250663lr requiredTreeField = r8.getRequiredTreeField(0, "xdt_get_vetted_device_nonces(request:$request)", cls, 1467730010);
            if (requiredTreeField != null) {
                str = requiredTreeField.getOptionalStringField(0, "first_factor_nonce");
            } else {
                str = null;
            }
            C250663lr requiredTreeField2 = r8.getRequiredTreeField(0, "xdt_get_vetted_device_nonces(request:$request)", cls, 1467730010);
            if (requiredTreeField2 != null) {
                str2 = requiredTreeField2.getOptionalStringField(1, "second_factor_nonce");
            }
            if (str != null || str2 != null) {
                VettedDeviceNonces vettedDeviceNonces = new VettedDeviceNonces(str, str2);
                C275714ro r1 = this.A01;
                String str3 = this.A00.A06;
                C250873mC r5 = C250863mB.A03;
                String A02 = r5.A02(vettedDeviceNonces, C279704z8.A00);
                Map map = r1.A00;
                if (!map.containsKey("vetted_device_nonce_type")) {
                    C255463uA[] r0 = NonceUserMap.A01;
                    map.put("vetted_device_nonce_type", new NonceUserMap(new HashMap()));
                }
                NonceUserMap nonceUserMap = (NonceUserMap) map.get("vetted_device_nonce_type");
                if (nonceUserMap != null) {
                    nonceUserMap.A00.put(str3, A02);
                }
                try {
                    0xm A002 = AnonymousClass0xl.A00(C61170le.A00);
                    String A022 = r5.A02(new NonceTypeMap(map), C279694z6.A00);
                    0xY AR4 = A002.A00.AR4();
                    AR4.E5g("client_nonces", A022);
                    AR4.apply();
                } catch (IOException e) {
                    0wj r3 = 0wj.A01;
                    StringBuilder sb = new StringBuilder();
                    sb.append("error saving new nonce: ");
                    sb.append(e);
                    r3.AEf(sb.toString(), 817894799).report();
                }
            }
        }
    }
}
