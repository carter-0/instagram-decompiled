package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

public final class OWP {
    public final DirectThreadKey A00;

    public final String A01(UserSession userSession) {
        List list;
        0qQ.A0B(userSession, 0);
        DirectThreadKey directThreadKey = this.A00;
        if (directThreadKey == null || (list = directThreadKey.A02) == null) {
            return null;
        }
        if (list.isEmpty()) {
            return userSession.A06;
        }
        return (String) 00k.A0O(list, 0);
    }

    public final void A02(Context context, AnonymousClass0iw r21, UserSession userSession, AnonymousClass2Ep r23, Integer num) {
        String str;
        String str2;
        C69462Nm6 nm6;
        C69487NmV nmV;
        String str3;
        int i;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        Context context2 = context;
        AnonymousClass0iw r6 = r21;
        AnonymousClass7TF.A1C(context2, 1, r6);
        String str4 = userSession2.A06;
        AnonymousClass2Ep r9 = r23;
        if (r9.BRZ().size() > 0) {
            str = DbS.A0q(r9.BRZ().get(0));
        } else {
            str = null;
        }
        String C6C = r9.C6C();
        List<C376659Iv> AxI = r9.AxI();
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (AxI != null) {
            for (C376659Iv r0 : AxI) {
                Object obj = r0.A01;
                if (obj == AnonymousClass05K.A0Y) {
                    i = 1468;
                } else {
                    Integer num2 = AnonymousClass05K.A0j;
                    String A002 = C273654mx.A00(3108);
                    if (obj != num2) {
                        if (obj == AnonymousClass05K.A0u) {
                            i = 3119;
                        } else if (obj == AnonymousClass05K.A15) {
                            i = 3109;
                        } else {
                            if (obj != AnonymousClass05K.A02) {
                                if (obj == AnonymousClass05K.A03) {
                                    str3 = "important";
                                } else if (obj == AnonymousClass05K.A04) {
                                    str3 = "follow_up";
                                } else if (obj != AnonymousClass05K.A05) {
                                    if (obj != AnonymousClass05K.A06) {
                                    }
                                }
                                A1C.add(str3);
                            }
                            A1C.add("lead");
                        }
                    }
                    A1C.add(A002);
                }
                str3 = C273654mx.A00(i);
                A1C.add(str3);
            }
        }
        if (new C66684Mar(userSession2, r9.BKw(), r9, C66653MaM.A00(context2, userSession2)).CTo() && C66700Mb7.A01(userSession2)) {
            A1C.add("flag");
        }
        if (str != null && C6C != null) {
            String join = TextUtils.join(",", A1C);
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("seller_id", str4);
            A1E.put("buyer_id", str);
            A1E.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C);
            A1E.put(C273654mx.A00(2964), join);
            Integer num3 = AnonymousClass05K.A00;
            Integer num4 = num;
            if (num4 == num3) {
                str2 = "inbox_action_sheet";
            } else {
                str2 = "tas_upsell";
            }
            A1E.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            1Av A003 = 1Au.A00(userSession2);
            if (!A003.A1s()) {
                C46649DiU A04 = C46649DiU.A04(C273654mx.A00(2173), A1E);
                IgBloksScreenConfig A0N = DbS.A0N(userSession2);
                A0N.A0i = true;
                Bundle A004 = C49891FBs.A00(A0N, A04);
                Dba.A0K(C61270mF.A00(context2), A004, userSession2, ModalActivity.class, "bloks").A0C(context2);
                A003.A0O();
            } else if (num4 == num3) {
                C69864NtS.A00(userSession2).A00(context2, str, "IG_TAS_SCREEN_IN_THREAD_LIST", A1E, new C58208IoC(37, context2, this, A1E, userSession2), true);
            } else {
                A00(context2, userSession2, A1E);
            }
            C327977Cy r7 = new C327977Cy(r6, userSession2);
            if (num4 == num3) {
                nm6 = C69462Nm6.CLICK;
                nmV = C69487NmV.INBOX_THREAD_ACTION_SHEET_ENTRYPOINT;
            } else if (num4 == AnonymousClass05K.A01) {
                nm6 = C69462Nm6.CLICK;
                nmV = C69487NmV.UPSELL_YES_ENTRYPOINT;
            } else {
                return;
            }
            C327977Cy.A00((C69489NmX) null, nm6, nmV, r7, str, str4);
        }
    }

    public final void A03(Context context, AnonymousClass0iw r15, UserSession userSession, Integer num) {
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass7TF.A1C(context, 1, r15);
        AnonymousClass7QC r1 = AnonymousClass7QC.A00;
        if (r1.A00(userSession2)) {
            String A01 = A01(userSession2);
            if (A01 != null && A01.length() != 0) {
                HashMap A1E = AnonymousClass7TE.A1E();
                if (r1.A00(userSession2) && 182.A06(0Tu.A05, userSession2, 36313312832784246L)) {
                    A1E.put("seller_deferred_onboarding", "true");
                }
                IgBloksScreenConfig A0N = DbS.A0N(userSession2);
                A0N.A0R = "com.bloks.www.bloks.commerce.invoicecomposer";
                HashMap A1E2 = AnonymousClass7TE.A1E();
                HashMap A1E3 = AnonymousClass7TE.A1E();
                HashMap A1E4 = AnonymousClass7TE.A1E();
                BitSet bitSet = new BitSet(1);
                A1E2.put("buyer_id", A01);
                bitSet.set(0);
                if (!A1E.isEmpty()) {
                    A1E2.put("experiments", A1E);
                }
                A1E2.put("entrypoint", "composer");
                if (bitSet.nextClearBit(0) >= 1) {
                    C46649DiU A06 = C46649DiU.A06("com.bloks.www.bloks.commerce.invoicecomposer", C359608dC.A01(A1E2), A1E3);
                    C46649DiU.A0B(A06, 719983200);
                    A06.A03 = null;
                    A06.A02 = null;
                    A06.A04 = null;
                    A06.A0H(A1E4);
                    A06.A0D(context, A0N);
                    return;
                }
                throw AnonymousClass7TE.A0z("Missing Required Props");
            }
            return;
        }
        if (182.A06(0Tu.A05, userSession2, 36315885517934229L)) {
            String A012 = A01(userSession2);
            if (!(A012 == null || A012.length() == 0)) {
                IgBloksScreenConfig A0N2 = DbS.A0N(userSession2);
                A0N2.A0R = "com.bloks.www.biig.mcomm.ordercreation";
                HashMap A1E5 = AnonymousClass7TE.A1E();
                HashMap A1E6 = AnonymousClass7TE.A1E();
                HashMap A1E7 = AnonymousClass7TE.A1E();
                BitSet bitSet2 = new BitSet(1);
                A1E5.put("buyer_id", A012);
                bitSet2.set(0);
                A1E5.put(AnonymousClass000.A00(1255), C18792W1y.A03(userSession2).getCurrencyCode());
                if (bitSet2.nextClearBit(0) >= 1) {
                    C46649DiU A062 = C46649DiU.A06("com.bloks.www.biig.mcomm.ordercreation", C359608dC.A01(A1E5), A1E6);
                    C46649DiU.A0B(A062, 719983200);
                    A062.A03 = null;
                    A062.A02 = null;
                    A062.A04 = null;
                    A062.A0H(A1E7);
                    A062.A0D(context, A0N2);
                } else {
                    throw AnonymousClass7TE.A0z("Missing Required Props");
                }
            }
        } else {
            C17578VaW vaW = new C17578VaW(userSession2, context, A01(userSession2));
            vaW.A04.A03(vaW.A01, vaW.A03);
            DirectThreadKey directThreadKey = this.A00;
            if (directThreadKey != null) {
                str = directThreadKey.A00;
            } else {
                str = null;
            }
            vaW.A00 = str;
        }
        if (num == AnonymousClass05K.A00) {
            0wc A013 = AnonymousClass0kN.A01(r15, userSession2);
            String A014 = A01(userSession2);
            if (A014 != null) {
                String str2 = userSession2.A06;
                0Aj A0e = AnonymousClass7TE.A0e(A013, "biig_order_management_composer_entrypoint_click");
                if (A0e.isSampled()) {
                    A0e.A9F(C273654mx.A00(586), 00y.A0n(10, str2));
                    A0e.A9F("consumer_igid", 00y.A0n(10, A014));
                    A0e.Cgf();
                }
            }
        }
    }

    public static final void A00(Context context, UserSession userSession, HashMap hashMap) {
        C46622Di2 A01 = C49891FBs.A01(DbS.A0N(userSession), C46649DiU.A04("com.bloks.www.biig.tas.label.selection", hashMap));
        C331127Pr A0W = DbS.A0W(userSession);
        DbS.A1S(A0W, true);
        A0W.A03 = 0.7f;
        A0W.A00().A03(context, A01);
    }

    public OWP(DirectThreadKey directThreadKey) {
        this.A00 = directThreadKey;
    }
}
