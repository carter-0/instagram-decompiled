package X;

import com.instagram.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MCX implements 02o {
    public final /* synthetic */ LCg A00;
    public final /* synthetic */ K66 A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public MCX(LCg lCg, K66 k66, List list, boolean z, boolean z2, boolean z3) {
        this.A01 = k66;
        this.A02 = list;
        this.A00 = lCg;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = z3;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r13) {
        List list;
        C61039Jvd jvd = (C61039Jvd) obj;
        K66 k66 = this.A01;
        27r A0X = JTP.A0X(k66);
        AnonymousClass80P r0 = AnonymousClass80P.HASHTAG;
        C279294yP r5 = C279294yP.CLIPS;
        A0X.A15(r5, r0);
        List list2 = this.A02;
        boolean z = list2 instanceof Collection;
        if (!z || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C61079JwH) it.next()).A01 instanceof C61722KJn) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        list2.add(new C61079JwH((C62743Klh) C61722KJn.A00, JTO.A0w(R.drawable.instagram_hashtag_pano_outline_12), k66.requireContext().getString(2131955751)));
        C60386Jkf jkf = this.A00.A00;
        jkf.A00 = list2;
        jkf.notifyDataSetChanged();
        if (this.A05) {
            if (!jvd.A06) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C61079JwH jwH = (C61079JwH) it2.next();
                    if (jwH.A01 instanceof C61724KJp) {
                        list2.remove(jwH);
                        break;
                    }
                }
            } else {
                JTP.A0X(k66).A15(r5, AnonymousClass80P.AI_REWRITE_TEXT);
                if (!z || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((C61079JwH) it3.next()).A01 instanceof C61724KJp) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                list2.add(new C61079JwH((C62743Klh) C61724KJp.A00, JTO.A0w(R.drawable.instagram_edit_gen_ai_pano_outline_12)));
            }
        }
        if (this.A04) {
            if (!jvd.A02) {
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C61079JwH jwH2 = (C61079JwH) it4.next();
                    if (jwH2.A01 instanceof C61723KJo) {
                        list2.remove(jwH2);
                        break;
                    }
                }
            } else {
                JTP.A0X(k66).A15(r5, AnonymousClass80P.COMMENT_POLL);
                if (!z || !list2.isEmpty()) {
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (((C61079JwH) it5.next()).A01 instanceof C61723KJo) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                list2.add(new C61079JwH((C62743Klh) C61723KJo.A00, JTO.A0w(R.drawable.instagram_poll_pano_outline_12)));
            }
            boolean z2 = jvd.A03;
            LBG lbg = k66.A06;
            if (z2) {
                if (lbg != null) {
                    lbg.A04.setVisibility(0);
                    C272024jy r02 = (C272024jy) jvd.A01;
                    if (!(r02 == null || (list = r02.A0F) == null)) {
                        LBG lbg2 = k66.A06;
                        if (lbg2 != null) {
                            DbX.A13(k66.requireContext(), lbg2.A04, JTO.A0w(list.size()), 2131969547);
                        }
                    }
                    LBG lbg3 = k66.A06;
                    if (lbg3 != null) {
                        LYF.A01(lbg3.A04, 55, k66);
                    }
                }
                0qQ.A0F("viewHolder");
                throw AnonymousClass00P.createAndThrow();
            }
            if (lbg != null) {
                lbg.A04.setVisibility(8);
            }
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.A03) {
            if (!jvd.A05) {
                Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    C61079JwH jwH3 = (C61079JwH) it6.next();
                    if (jwH3.A01 instanceof C61721KJm) {
                        list2.remove(jwH3);
                        break;
                    }
                }
            } else {
                if (!z || !list2.isEmpty()) {
                    Iterator it7 = list2.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            if (((C61079JwH) it7.next()).A01 instanceof C61721KJm) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                list2.add(new C61079JwH((C62743Klh) C61721KJm.A00, JTO.A0w(R.drawable.instagram_comment_outline_12), k66.requireContext().getString(2131956388)));
            }
            boolean z3 = jvd.A04;
            LBG lbg4 = k66.A06;
            if (z3) {
                if (lbg4 != null) {
                    lbg4.A05.setVisibility(0);
                    LBG lbg5 = k66.A06;
                    if (lbg5 != null) {
                        LYF.A01(lbg5.A05, 56, k66);
                    }
                }
                0qQ.A0F("viewHolder");
                throw AnonymousClass00P.createAndThrow();
            }
            if (lbg4 != null) {
                lbg4.A05.setVisibility(8);
            }
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        if (list2.isEmpty()) {
            LBG lbg6 = k66.A06;
            if (lbg6 != null) {
                lbg6.A06.setVisibility(8);
            }
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        C60386Jkf jkf2 = this.A00.A00;
        jkf2.A00 = list2;
        jkf2.notifyDataSetChanged();
        LBG lbg7 = k66.A06;
        if (lbg7 != null) {
            lbg7.A06.setVisibility(0);
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
        return C60340gF.A00;
    }
}
