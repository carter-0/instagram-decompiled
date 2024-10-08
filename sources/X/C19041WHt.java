package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.WHt  reason: case insensitive filesystem */
public final class C19041WHt implements AnonymousClass2Kv {
    public final /* synthetic */ C323426xT A00;
    public final /* synthetic */ C17378VTf A01;

    public C19041WHt(C323426xT r1, C17378VTf vTf) {
        this.A00 = r1;
        this.A01 = vTf;
    }

    public final void invoke(AnonymousClass3JD r14) {
        long A012;
        Context requireContext;
        Map map;
        C359618dD r2;
        String str;
        String str2;
        Object Bny;
        ImmutableList requiredCompactedTreeListField;
        Integer num;
        String str3;
        C323426xT r5 = this.A00;
        if (!(r14 == null || (Bny = r14.Bny()) == null)) {
            C15141URe uRe = (C15141URe) Bny;
            if (uRe.A0E() != null) {
                Class<UQ0> cls = UQ0.class;
                if (uRe.A0E().A03(cls, "cart", -441817504) != null) {
                    C250663lr A03 = uRe.A0E().A03(cls, "cart", -441817504);
                    Class<C15110UPz> cls2 = C15110UPz.class;
                    String A002 = AnonymousClass000.A00(705);
                    if (A03.getOptionalTreeField(0, A002, cls2, -1896123978) != null) {
                        Class<C15109UPy> cls3 = C15109UPy.class;
                        if (!(uRe.A0E().A03(cls, "cart", -441817504).getOptionalTreeField(0, A002, cls2, -1896123978).getRequiredCompactedTreeListField(0, "edges", cls3, 197665599) == null || (requiredCompactedTreeListField = uRe.A0E().A03(cls, "cart", -441817504).getOptionalTreeField(0, A002, cls2, -1896123978).getRequiredCompactedTreeListField(0, "edges", cls3, 197665599)) == null)) {
                            if (requiredCompactedTreeListField.size() == 1) {
                                num = AnonymousClass05K.A01;
                            } else {
                                num = AnonymousClass05K.A0C;
                            }
                            r5.A02 = num;
                            if (requiredCompactedTreeListField.size() > 0) {
                                Class<C15108UPx> cls4 = C15108UPx.class;
                                if (!(((C250663lr) requiredCompactedTreeListField.get(0)).getOptionalTreeField(0, "node", cls4, -629534115) == null || ((C250663lr) requiredCompactedTreeListField.get(0)).getOptionalTreeField(0, "node", cls4, -629534115).getOptionalStringField(0, "strong_id__") == null)) {
                                    str3 = ((C250663lr) requiredCompactedTreeListField.get(0)).getOptionalTreeField(0, "node", cls4, -629534115).getOptionalStringField(0, "strong_id__");
                                    r5.A03 = str3;
                                }
                            }
                            r5.A02 = AnonymousClass05K.A00;
                            str3 = null;
                            r5.A03 = str3;
                        }
                    }
                }
            }
        }
        C17378VTf vTf = this.A01;
        UserSession userSession = vTf.A01;
        AnonymousClass4DH r1 = vTf.A00;
        String str4 = C323426xT.A00(userSession).A03;
        C49146EqD.A00(r1, userSession, str4);
        int intValue = C323426xT.A00(userSession).A02.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 0) {
                    return;
                }
                if (182.A06(0Tu.A06, userSession, 36310899061096809L)) {
                    String A003 = AnonymousClass000.A00(1030);
                    HashMap A0m = DbY.A0m("_PRELOAD_ID_KEY_", A003);
                    if (str4 != null) {
                        A0m = DbY.A0m("params", 002.A0g("{\"client_input_params\":{\"merchant-id\":", str4, "},\"server_params\":{\"prefetch_view_only\":1}}"));
                    }
                    C359638dF.A03(r1.requireContext(), new C359618dD(userSession), AnonymousClass000.A00(551), A003, A0m, C17076VGy.A00(userSession).longValue());
                    0Tu r4 = 0Tu.A05;
                    if (182.A06(r4, userSession, 36310899061817714L)) {
                        C359638dF.A03(r1.requireContext(), new C359618dD(userSession), "async.components.singlemerchantcart.template", "TDSeparationSingleMerchantCart", (Map) null, 182.A01(r4, userSession, 36592374038593988L));
                    }
                }
            }
            if (182.A06(0Tu.A06, userSession, 36310899061096809L)) {
                long longValue = C17076VGy.A00(userSession).longValue();
                C359638dF.A03(r1.requireContext(), new C359618dD(userSession), "com.bloks.www.bloks.commerce.cart.multimerchantcart", "MultiMerchantCart", DbY.A0m("_PRELOAD_ID_KEY_", "MultiMerchantCart"), longValue);
                0Tu r42 = 0Tu.A05;
                if (182.A06(r42, userSession, 36310899061817714L)) {
                    A012 = 182.A01(r42, userSession, 36592374038593988L);
                    requireContext = r1.requireContext();
                    map = null;
                    r2 = new C359618dD(userSession);
                    str = "async.components.multimerchantcart.template";
                    str2 = "TDSeparationMultiMerchantCart";
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (182.A06(0Tu.A06, userSession, 36310899061096809L)) {
            String A004 = AnonymousClass000.A00(1030);
            HashMap A0m2 = DbY.A0m("_PRELOAD_ID_KEY_", A004);
            if (str4 != null) {
                A0m2 = DbY.A0m("params", 002.A0g("{\"client_input_params\":{\"merchant-id\":", str4, "},\"server_params\":{\"prefetch_view_only\":1}}"));
            }
            C359638dF.A03(r1.requireContext(), new C359618dD(userSession), AnonymousClass000.A00(551), A004, A0m2, C17076VGy.A00(userSession).longValue());
            0Tu r43 = 0Tu.A05;
            if (182.A06(r43, userSession, 36310899061817714L)) {
                A012 = 182.A01(r43, userSession, 36592374038593988L);
                requireContext = r1.requireContext();
                map = null;
                r2 = new C359618dD(userSession);
                str = "async.components.singlemerchantcart.template";
                str2 = "TDSeparationSingleMerchantCart";
            } else {
                return;
            }
        } else {
            return;
        }
        C359638dF.A03(requireContext, r2, str, str2, map, A012);
    }
}
