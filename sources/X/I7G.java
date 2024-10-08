package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class I7G {
    public static final Handler A00 = AnonymousClass7TF.A0D();
    public static final I7G A01 = new Object();

    public static final C57962IjH A01(C59608JQc jQc, UserSession userSession, 1Xj r7, String str, Set set, int i) {
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1R(userSession, str);
        C59608JQc jQc2 = jQc;
        1Xj r5 = r7;
        Set set2 = set;
        A06(jQc2, userSession, r5, set);
        String A0j = AnonymousClass7TG.A0j();
        C333787a8 r2 = (C333787a8) userSession2.A01(C333787a8.class, new C58710IwJ(userSession2, 41));
        String id = r5.getId();
        if (id != null) {
            1OC A03 = C56631I5k.A03(userSession2, id, str, A04(set));
            A03.A00 = new H4Q(r2, jQc2, userSession2, r5, A0j, set2);
            C57962IjH ijH = new C57962IjH(r2, A03, A0j);
            A00.postDelayed(ijH, (long) i);
            return ijH;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final C57815Igu A02(C59608JQc jQc, UserSession userSession, 1Xj r10, Set set) {
        1Xj r7 = r10;
        String id = r10.getId();
        if (id != null) {
            HashSet A04 = A04(set);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("upsells/async_get_comment_delete_upsell/");
            A0a.A0Q(C54049GyY.class, C56208Hub.class);
            A0a.AA0("comment_ids_to_delete", 00k.A0a(A04).toString());
            A0a.A9m("media_id", id);
            1OC A0K = DbW.A0K(A0a);
            A0K.A00 = new H4N(0, jQc, set, userSession, r7);
            C57815Igu igu = new C57815Igu(A0K);
            Handler handler = A00;
            ArrayList arrayList = A27.A00;
            handler.postDelayed(igu, (long) C48775Ejy.A00(userSession));
            return igu;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final String A03(Context context, UserSession userSession, 1Xj r10, boolean z) {
        int i;
        PromptStickerModel A0F;
        AnonymousClass7TF.A1B(userSession, 1, r10);
        if (context == null) {
            return null;
        }
        boolean z2 = true;
        boolean A1V = AnonymousClass7TF.A1V(r10.A0C.Av3());
        C67161s9 A1N = r10.A1N();
        if (A1N == null || !A1N.getHasBeenMashedUp()) {
            z2 = false;
        }
        boolean A1Y = AnonymousClass7TF.A1Y(r10.A0C.BZ8(), true);
        List A3o = r10.A3o(AnonymousClass3WT.CLIPS_PROMPT);
        boolean z3 = false;
        if (A3o != null && !A3o.isEmpty() && (A0F = ((C255783ui) A3o.get(0)).A0F()) != null && A0F.A0E) {
            z3 = true;
        }
        List A3o2 = r10.A3o(AnonymousClass3WT.CLIPS_QUESTION_RESPONSE);
        boolean z4 = false;
        if (!(A3o2 == null || A3o2.isEmpty() || ((C255783ui) A3o2.get(0)).A0O == null)) {
            z4 = true;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int i2 = 2131957551;
        if (z) {
            i2 = 2131957497;
        }
        A1A.append(context.getString(i2));
        if (A1V) {
            A1A.append("\n\n");
            A1A.append(context.getString(2131971785));
            A1A.append("\n\n");
            i = 2131971784;
        } else if (z3 || z4) {
            A1A.append("\n\n");
            A1A.append(context.getString(2131957549));
            if (z3) {
                A1A.append("\n\n");
                i = 2131957550;
            }
            return A1A.toString();
        } else if (z2) {
            if (A1Y) {
                A1A.append("\n\n");
                i = 2131957553;
            } else {
                A1A.append("\n\n");
                i = 2131972378;
            }
        } else if (A1Y) {
            A1A.append("\n\n");
            i = 2131957552;
        } else {
            if (!2R8.A01(userSession)) {
                A1A.append("\n\n");
                i = 2131957548;
            }
            return A1A.toString();
        }
        A1A.append(context.getString(i));
        return A1A.toString();
    }

    public static final HMF A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 103422:
                    if (str.equals("hmc")) {
                        return HMF.COMMENT_DELETE_UPSELL_TYPE_HMC;
                    }
                    break;
                case 93832333:
                    if (str.equals("block")) {
                        return HMF.COMMENT_DELETE_UPSELL_TYPE_BLOCK;
                    }
                    break;
                case 154679679:
                    if (str.equals(AnonymousClass000.A00(1861))) {
                        return HMF.COMMENT_DELETE_UPSELL_TYPE_HIDDEN_WORDS_V2;
                    }
                    break;
                case 435254300:
                    if (str.equals(AnonymousClass000.A00(1860))) {
                        return HMF.COMMENT_DELETE_UPSELL_TYPE_HIDDEN_WORDS;
                    }
                    break;
                case 602896713:
                    if (str.equals(AnonymousClass000.A00(1134))) {
                        return HMF.COMMENT_DELETE_UPSELL_TYPE_BLOCK_COMMENTS_FROM;
                    }
                    break;
                case 863339006:
                    if (str.equals(AnonymousClass000.A00(1416))) {
                        return HMF.COMMENT_DELETE_UPSELL_TYPE_HRT_BLOCK_COMMENTS_FROM;
                    }
                    break;
            }
        }
        return HMF.COMMENT_DELETE_UPSELL_TYPE_NONE;
    }

    public static final HashSet A04(Set set) {
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A1F.add(((C247733gp) it.next()).A0G);
        }
        return A1F;
    }

    public static final void A05(HMF hmf, C59608JQc jQc, 1Xj r6, String str, List list, List list2, Set set) {
        for (C247733gp r2 : 00k.A0j(set)) {
            C252883pr r1 = C252883pr.Deleted;
            r6.A43(r1, r2.A0G);
            r2.A06 = r1;
        }
        r6.A3t(00k.A0j(set).size());
        C59608JQc jQc2 = jQc;
        if (jQc != null) {
            jQc2.DdT(hmf, str, list, list2, 00k.A0j(set));
        }
    }

    public static final void A06(C59608JQc jQc, UserSession userSession, 1Xj r8, Set set) {
        C247733gp A002;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C247733gp r3 = (C247733gp) it.next();
            C252883pr r1 = C252883pr.DeletePending;
            r8.A43(r1, r3.A0G);
            r3.A06 = r1;
            C225942fB A003 = C225942fB.A00(userSession);
            String str = r3.A0G;
            if (A003.A0F(str)) {
                A003.A0B(str);
            }
            String str2 = r3.A0F;
            if (!(str2 == null || (A002 = r8.A0d.A05.A00(str2)) == null || A002.A0F != null)) {
                A002.A01 = (int) Math.max(0.0d, (double) (A002.A01 - 1));
            }
        }
        r8.A0d.A01();
        if (jQc != null) {
            jQc.DdS();
        }
    }

    public static final void A07(C59608JQc jQc, 1Xj r5, Set set, boolean z) {
        C247733gp A002;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C247733gp r2 = (C247733gp) it.next();
            C252883pr r1 = C252883pr.Success;
            r5.A43(r1, r2.A0G);
            r2.A06 = r1;
            String str = r2.A0F;
            if (!(str == null || (A002 = r5.A0d.A05.A00(str)) == null || A002.A0F != null)) {
                A002.A01++;
            }
        }
        r5.A0d.A01();
        if (z) {
            if (jQc != null) {
                jQc.DdQ();
            }
        } else if (jQc != null) {
            jQc.DdR();
        }
    }
}
