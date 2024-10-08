package X;

import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.otc.models.OtcInput;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.Re3  reason: case insensitive filesystem */
public abstract class C9624Re3 {
    public static final LinkedHashMap A00(Set set) {
        ECPRepositoryImpl A01 = C11353SOm.A01();
        SJ1 sj1 = new SJ1((OtcInput) null, "1302814060304063");
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        C8892REj rEj = C8892REj.USER_INFO_PAYER_EMAIL;
        if (set.contains(rEj)) {
            JTP.A1R(rEj, A1H, Pxh.A0S(A01.A07).A0D(sj1));
        }
        C8892REj rEj2 = C8892REj.USER_INFO_PAYER_PHONE;
        if (set.contains(rEj2)) {
            JTP.A1R(rEj2, A1H, Pxh.A0S(A01.A07).A0F(sj1));
        }
        C8892REj rEj3 = C8892REj.USER_INFO_PAYER_ADDRESS;
        if (set.contains(rEj3)) {
            JTP.A1R(rEj3, A1H, ((Stb) A01.A09.getValue()).A06(sj1));
        }
        C8892REj rEj4 = C8892REj.USER_INFO_PAYER_NAME;
        if (set.contains(rEj4)) {
            JTP.A1R(rEj4, A1H, Pxh.A0S(A01.A07).A0E(sj1));
        }
        C8892REj rEj5 = C8892REj.USER_INFO_PAYMENT_METHODS;
        if (set.contains(rEj5)) {
            JTP.A1R(rEj5, A1H, ((Stc) A01.A08.getValue()).A0C(sj1, (RFC) null));
        }
        C8892REj rEj6 = C8892REj.USER_INFO_PAYMENT_METHODS_BASIC_CARDS;
        if (set.contains(rEj6)) {
            JTP.A1R(rEj6, A1H, ((Stc) A01.A08.getValue()).A0C(sj1, RFC.CREDIT_CARD));
        }
        C8892REj rEj7 = C8892REj.USER_INFO_PAYMENT_METHODS_TOKENIZED_CARDS;
        if (set.contains(rEj7)) {
            JTP.A1R(rEj7, A1H, ((Stc) A01.A08.getValue()).A0C(sj1, RFC.TOKENIZED_CARD));
        }
        return A1H;
    }
}
