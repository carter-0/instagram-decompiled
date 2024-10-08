package X;

import com.instagram.direct.inbox.fragment.DirectSearchInboxSeeAllFragment;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PPb  reason: case insensitive filesystem */
public final class C72917PPb implements C337237fw {
    public final int A00;
    public final Object A01;

    public C72917PPb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dam(C337257fy r8) {
        N44 n44;
        Object obj;
        String str;
        Integer A04;
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo;
        DiscoverableThreadInfo discoverableThreadInfo;
        switch (this.A00) {
            case 0:
                DirectSearchInboxSeeAllFragment directSearchInboxSeeAllFragment = (DirectSearchInboxSeeAllFragment) this.A01;
                List<DirectSearchResult> list = (List) r8.Bo1();
                int i = directSearchInboxSeeAllFragment.A01;
                if (i != 22) {
                    if (i != 24) {
                        if (i == 33) {
                            for (Object next : list) {
                                ArrayList arrayList = directSearchInboxSeeAllFragment.A0F;
                                if ((next instanceof DirectShareTarget) && arrayList != null) {
                                    arrayList.add(next);
                                }
                            }
                        } else if (i == 36) {
                            ArrayList arrayList2 = directSearchInboxSeeAllFragment.A0E;
                            if (arrayList2 == null) {
                                arrayList2 = AnonymousClass7TE.A1C();
                            }
                            for (DirectSearchResult directSearchResult : list) {
                                if (directSearchResult instanceof DirectShareTarget) {
                                    DirectShareTarget directShareTarget = (DirectShareTarget) directSearchResult;
                                    if (directShareTarget.A0F() && !directSearchInboxSeeAllFragment.A0L.contains(directShareTarget)) {
                                        arrayList2.add(directShareTarget);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                directSearchInboxSeeAllFragment.A0E = arrayList2;
                                directSearchInboxSeeAllFragment.A0L = C66580MXl.A12(arrayList2);
                            } else {
                                return;
                            }
                        } else if (i != 37) {
                            switch (i) {
                                case 15:
                                    ArrayList arrayList3 = directSearchInboxSeeAllFragment.A0G;
                                    if (arrayList3 == null) {
                                        arrayList3 = AnonymousClass7TE.A1C();
                                    }
                                    for (DirectSearchResult directSearchResult2 : list) {
                                        if (directSearchResult2 instanceof DirectShareTarget) {
                                            DirectShareTarget directShareTarget2 = (DirectShareTarget) directSearchResult2;
                                            if (!directShareTarget2.A0U() && directShareTarget2.A04(directSearchInboxSeeAllFragment.A06.A06, false) == AnonymousClass05K.A0Y && !directSearchInboxSeeAllFragment.A0M.contains(directShareTarget2)) {
                                                arrayList3.add(directShareTarget2);
                                            }
                                        }
                                    }
                                    if (!arrayList3.isEmpty()) {
                                        directSearchInboxSeeAllFragment.A0G = arrayList3;
                                        directSearchInboxSeeAllFragment.A0M = C66580MXl.A12(arrayList3);
                                        break;
                                    } else {
                                        return;
                                    }
                                case 16:
                                    break;
                                case 17:
                                    ArrayList arrayList4 = directSearchInboxSeeAllFragment.A0H;
                                    if (arrayList4 == null) {
                                        arrayList4 = AnonymousClass7TE.A1C();
                                    }
                                    for (DirectSearchResult directSearchResult3 : list) {
                                        if (directSearchResult3 instanceof DirectShareTarget) {
                                            DirectShareTarget directShareTarget3 = (DirectShareTarget) directSearchResult3;
                                            if (!directShareTarget3.A0U() && directShareTarget3.A04(directSearchInboxSeeAllFragment.A06.A06, false) == AnonymousClass05K.A0j && !directSearchInboxSeeAllFragment.A0N.contains(directShareTarget3)) {
                                                arrayList4.add(directShareTarget3);
                                            }
                                        }
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        directSearchInboxSeeAllFragment.A0H = arrayList4;
                                        directSearchInboxSeeAllFragment.A0N = C66580MXl.A12(arrayList4);
                                        break;
                                    } else {
                                        return;
                                    }
                                default:
                                    return;
                            }
                        } else {
                            Object B3J = r8.B3J();
                            ArrayList arrayList5 = directSearchInboxSeeAllFragment.A0I;
                            if (arrayList5 == null) {
                                arrayList5 = AnonymousClass7TE.A1C();
                            }
                            for (DirectSearchResult directSearchResult4 : list) {
                                if (directSearchResult4 instanceof DirectShareTarget) {
                                    DirectShareTarget directShareTarget4 = (DirectShareTarget) directSearchResult4;
                                    if (directShareTarget4.A0U() && (((A04 = directShareTarget4.A04(directSearchInboxSeeAllFragment.A06.A06, directSearchInboxSeeAllFragment.A0S)) == AnonymousClass05K.A04 || A04 == AnonymousClass05K.A03 || A04 == AnonymousClass05K.A02 || A04 == AnonymousClass05K.A1I || A04 == AnonymousClass05K.A08 || A04 == AnonymousClass05K.A07 || A04 == AnonymousClass05K.A06 || A04 == AnonymousClass05K.A05) && ((!directShareTarget4.A0H() || (((creatorBroadcastThreadInfo = directShareTarget4.A04) == null || !creatorBroadcastThreadInfo.A07) && ((discoverableThreadInfo = directShareTarget4.A06) == null || !discoverableThreadInfo.A03))) && !directSearchInboxSeeAllFragment.A0O.contains(directShareTarget4)))) {
                                        arrayList5.add(directShareTarget4);
                                    }
                                }
                            }
                            if (B3J instanceof HashMap) {
                                obj = ((AbstractMap) B3J).get("ibc_chats_context_lines");
                                if (obj != null) {
                                    HashMap A1E = AnonymousClass7TE.A1E();
                                    Iterator A1H = C51966G9m.A1H(obj);
                                    while (A1H.hasNext()) {
                                        BIM bim = (BIM) A1H.next();
                                        A1E.put(bim.A03, bim);
                                    }
                                    Iterator it = arrayList5.iterator();
                                    while (it.hasNext()) {
                                        DirectShareTarget A0f = DbT.A0f(it);
                                        if (A1E.get(A0f.A08()) != null) {
                                            str = ((BIM) A1E.get(A0f.A08())).A02;
                                        } else {
                                            str = "";
                                        }
                                        A0f.A0N = str;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            if (!arrayList5.isEmpty()) {
                                C337257fy r4 = directSearchInboxSeeAllFragment.A0B;
                                if (r4 != null && !r4.CYL() && obj == null) {
                                    ArrayList A1C = AnonymousClass7TE.A1C();
                                    Iterator it2 = arrayList5.iterator();
                                    while (it2.hasNext()) {
                                        A1C.add(DbT.A0f(it2).A08());
                                    }
                                    r4.ERO(A1C);
                                }
                                directSearchInboxSeeAllFragment.A0I = arrayList5;
                                directSearchInboxSeeAllFragment.A0O = C66580MXl.A12(arrayList5);
                            } else {
                                return;
                            }
                        }
                    }
                    ArrayList arrayList6 = directSearchInboxSeeAllFragment.A0K;
                    if (arrayList6 == null) {
                        arrayList6 = AnonymousClass7TE.A1C();
                    }
                    for (DirectSearchResult directSearchResult5 : list) {
                        if (directSearchResult5 instanceof DirectShareTarget) {
                            DirectShareTarget directShareTarget5 = (DirectShareTarget) directSearchResult5;
                            Integer A042 = directShareTarget5.A04(directSearchInboxSeeAllFragment.A06.A06, directSearchInboxSeeAllFragment.A0S);
                            if (!directSearchInboxSeeAllFragment.A0Q.contains(directShareTarget5) && (A042 == AnonymousClass05K.A01 || A042 == AnonymousClass05K.A0C)) {
                                arrayList6.add(directShareTarget5);
                            }
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        directSearchInboxSeeAllFragment.A0K = arrayList6;
                        directSearchInboxSeeAllFragment.A0Q = C66580MXl.A12(arrayList6);
                    } else {
                        return;
                    }
                } else {
                    ArrayList arrayList7 = directSearchInboxSeeAllFragment.A0J;
                    if (arrayList7 == null) {
                        arrayList7 = AnonymousClass7TE.A1C();
                    }
                    for (DirectSearchResult directSearchResult6 : list) {
                        if (directSearchResult6 instanceof DirectShareTarget) {
                            DirectShareTarget directShareTarget6 = (DirectShareTarget) directSearchResult6;
                            if (!directShareTarget6.A0U() && directShareTarget6.A04(directSearchInboxSeeAllFragment.A06.A06, directSearchInboxSeeAllFragment.A0S) == AnonymousClass05K.A0N && !directSearchInboxSeeAllFragment.A0P.contains(directShareTarget6)) {
                                arrayList7.add(directShareTarget6);
                            }
                        }
                    }
                    if (!arrayList7.isEmpty()) {
                        directSearchInboxSeeAllFragment.A0J = arrayList7;
                        directSearchInboxSeeAllFragment.A0P = C66580MXl.A12(arrayList7);
                    } else {
                        return;
                    }
                }
                11Z.A02(new C73420PcH(directSearchInboxSeeAllFragment));
                return;
            case 1:
                0qQ.A0B(r8, 0);
                C67761MuH muH = (C67761MuH) this.A01;
                05G r42 = muH.A0U;
                if (r8.BiY() == null) {
                    n44 = N44.A03;
                } else {
                    n44 = new N44((Integer) muH.A09.getValue(), (List) r8.Bo1(), true);
                }
                r42.Epw(n44);
                return;
            default:
                ((AnonymousClass67Z) this.A01).A02(r8.Bo1());
                return;
        }
    }
}
