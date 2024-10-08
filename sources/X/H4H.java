package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class H4H extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public H4H(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A03 = obj2;
        this.A04 = z;
        this.A02 = obj;
        this.A01 = obj3;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        String str;
        if (this.A00 != 0) {
            i = AnonymousClass0fD.A03(-635064578);
            C334247ax r11 = (C334247ax) obj;
            int A032 = AnonymousClass0fD.A03(-965885811);
            0qQ.A0B(r11, 0);
            User user = (User) this.A02;
            user.A0w(r11.getItems());
            C52433GSl gSl = C52433GSl.A00;
            ContextualFeedFragment contextualFeedFragment = (ContextualFeedFragment) this.A03;
            ArrayList A012 = gSl.A01(ContextualFeedFragment.A00(contextualFeedFragment), user);
            C57092IOg A002 = C55171HdN.A00(ContextualFeedFragment.A00(contextualFeedFragment));
            A002.A00.put(user.getId(), A012);
            if (this.A04) {
                UserSession A003 = ContextualFeedFragment.A00(contextualFeedFragment);
                boolean A06 = 182.A06(DbS.A0J(A003, 0), A003, 36312488198931589L);
                AnonymousClass3W1 r1 = (AnonymousClass3W1) this.A01;
                if (A06) {
                    r1.A3G = true;
                } else {
                    r1.A3F = true;
                }
                C238133Ar scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
                int B6L = scrollingViewProxy.B6L();
                if (A06) {
                    HDB hdb = contextualFeedFragment.A0N;
                    str = "adapter";
                    if (hdb != null) {
                        Object item = hdb.getItem(B6L);
                        while (true) {
                            HDB hdb2 = contextualFeedFragment.A0N;
                            if (hdb2 != null) {
                                if (hdb2.getItem(B6L) != item) {
                                    break;
                                }
                                B6L++;
                            } else {
                                break;
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                scrollingViewProxy.Evr(B6L, 1);
            } else {
                ((AnonymousClass3W1) this.A01).A2v = true;
            }
            HDB hdb3 = contextualFeedFragment.A0N;
            if (hdb3 == null) {
                str = "adapter";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            hdb3.FK4();
            AnonymousClass0fD.A0A(-211059700, A032);
            i2 = 630294552;
        } else {
            i = AnonymousClass0fD.A03(751512330);
            C43822CEo cEo = (C43822CEo) obj;
            int A033 = AnonymousClass0fD.A03(299297518);
            0qQ.A0B(cEo, 0);
            C57093IOh iOh = (C57093IOh) this.A03;
            C53264GlC A004 = cEo.FH3();
            boolean z = this.A04;
            C324356z9 r7 = (C324356z9) this.A02;
            C53039GhV ghV = (C53039GhV) this.A01;
            iOh.A00 = A004.A00;
            List list = A004.A01;
            if (list == null || list.isEmpty()) {
                ghV.A05(new OCO(0sn.A00, z));
            } else {
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A0k = C51975G9x.A0k(it);
                    if (A0k != null) {
                        A0r.add(A0k);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                ArrayList A1D = AnonymousClass7TE.A1D(A0r);
                if (DbT.A1b(A1D)) {
                    C54381HAw.A00(C3724090s.A01(iOh.A02, A1D, false, false), r7, ghV, 1, z);
                }
            }
            AnonymousClass0fD.A0A(-101705272, A033);
            i2 = -1993924042;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
