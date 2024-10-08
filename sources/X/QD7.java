package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;

public abstract class QD7 extends 2YL {
    public Bundle A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final AnonymousClass2gB A03 = Pxh.A0M();
    public final AnonymousClass2Fj A04 = JTO.A0K();
    public final AnonymousClass2Fj A05 = JTO.A0K();
    public final AnonymousClass2Fj A06 = JTO.A0K();
    public final AnonymousClass2Fj A07 = JTO.A0K();
    public final AnonymousClass2Fj A08 = JTO.A0K();
    public final AnonymousClass2Fj A09 = JTO.A0K();
    public final AnonymousClass2Fj A0A = JTO.A0K();

    public final int A02() {
        if (this instanceof C8271QnD) {
            C8271QnD qnD = (C8271QnD) this;
            if (qnD.A04) {
                return 0;
            }
            if (qnD.A05) {
                return 2131962190;
            }
            return 2131962188;
        } else if (this instanceof C8269QnB) {
            return 2131969230;
        } else {
            if (this instanceof C8273QnF) {
                return 2131969221;
            }
            if (this instanceof C8268QnA) {
                return 2131969220;
            }
            if (this instanceof C8272QnE) {
                return 2131956591;
            }
            if (this instanceof C8266Qn8) {
                return 2131973724;
            }
            return 0;
        }
    }

    public final boolean A03(Bundle bundle, int i, boolean z) {
        LinkedHashMap linkedHashMap;
        2FO r1;
        String str;
        LinkedHashMap linkedHashMap2;
        2FO r12;
        String str2;
        S2S s2s;
        String queryParameter;
        if (this instanceof C8269QnB) {
            C8269QnB qnB = (C8269QnB) this;
            if (i != 1 || bundle == null || bundle.getString("web_fragment_intercepted_url") == null) {
                if ((i == 5 || i == 6) && (s2s = qnB.A07) != null) {
                    String A002 = qnB.A04.A00();
                    A002.getClass();
                    s2s.A00(A002);
                }
                if (!z) {
                    return false;
                }
                if (i == 5) {
                    if (bundle != null) {
                        if (RealtimeConstants.SEND_SUCCESS.equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                            String string = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                            String string2 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                            if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string)) {
                                linkedHashMap2 = C2818159r.A06(qnB.A04);
                                Pxh.A1R(linkedHashMap2);
                                r12 = qnB.A0E;
                                str2 = "client_add_credential_success";
                            } else {
                                S2S s2s2 = qnB.A07;
                                s2s2.getClass();
                                String A003 = qnB.A04.A00();
                                A003.getClass();
                                C7422QCn A012 = C8282QnO.A01(new C11548Sc9(s2s2, string2, string, A003, 1), s2s2.A02);
                                A012.A09(new C11648Sdq(23, (Object) A012, (Object) qnB));
                                return true;
                            }
                        } else if ("failure".equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                            linkedHashMap2 = C2818159r.A06(qnB.A04);
                            Pxh.A1R(linkedHashMap2);
                            r12 = qnB.A0E;
                            str2 = "client_add_credential_fail";
                        }
                        r12.Cgl(str2, linkedHashMap2);
                    }
                } else if (!(i == 2 || i == 3 || i == 6)) {
                    return false;
                }
                qnB.A06.A00(qnB.A0G);
                return true;
            }
            String string3 = bundle.getString("web_fragment_intercepted_url");
            if (TextUtils.isEmpty(string3) || (queryParameter = 0cp.A03(string3).getQueryParameter("ba_token")) == null) {
                return false;
            }
            2Fk r13 = qnB.A00;
            if (r13 != null) {
                r13.A08(qnB.A0C);
            }
            S2Q s2q = qnB.A06;
            C7422QCn A013 = C8282QnO.A01(new C11543Sc4(queryParameter, s2q, 1), s2q.A00);
            qnB.A00 = A013;
            A013.A09(qnB.A0C);
            return true;
        } else if (!(this instanceof C8273QnF)) {
            return false;
        } else {
            C8273QnF qnF = (C8273QnF) this;
            if (i != 6) {
                return false;
            }
            if (bundle == null) {
                return true;
            }
            if (RealtimeConstants.SEND_SUCCESS.equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                String string4 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                String string5 = bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                if (TextUtils.isEmpty(string5) || TextUtils.isEmpty(string4)) {
                    HashSet A1F = AnonymousClass7TE.A1F();
                    Collections.addAll(A1F, REG.values());
                    qnF.A07.A00(A1F);
                    linkedHashMap = C2818159r.A06(qnF.A01);
                    C8273QnF.A01(qnF, linkedHashMap);
                    r1 = qnF.A06;
                    str = "client_edit_credential_success";
                } else {
                    S2S s2s3 = qnF.A08;
                    String A004 = qnF.A01.A00();
                    A004.getClass();
                    C7422QCn A014 = C8282QnO.A01(new C11548Sc9(s2s3, string5, string4, A004, 1), s2s3.A02);
                    A014.A09(new C11648Sdq(22, (Object) A014, (Object) qnF));
                    return true;
                }
            } else if (!"failure".equals(bundle.getString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS))) {
                return true;
            } else {
                linkedHashMap = C2818159r.A06(qnF.A01);
                C8273QnF.A01(qnF, linkedHashMap);
                r1 = qnF.A06;
                str = "client_edit_credential_fail";
            }
            r1.Cgl(str, linkedHashMap);
            return true;
        }
    }

    public void A04(Bundle bundle) {
        this.A00 = bundle;
        this.A01 = true;
    }
}
