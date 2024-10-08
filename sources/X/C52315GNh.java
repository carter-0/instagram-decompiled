package X;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GNh  reason: case insensitive filesystem */
public final class C52315GNh implements C229372nH {
    public final int A00;
    public final Object A01;

    public C52315GNh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D3p(C267324bN r6, Integer num, int i) {
        if (this.A00 == 0) {
            0qQ.A0B(r6, 0);
            GXC gxc = (GXC) this.A01;
            C295825oy r2 = gxc.A00;
            if (r2 != null && r6.A01 == C295365o2.ORGANIC && !C52076GDw.A04(r6)) {
                gxc.A01 = true;
                r2.A00 = Math.max(r2.A03(gxc.A04).indexOf(r6), 0);
                if (num != null) {
                    r2.A01 = num.intValue();
                }
            }
        }
    }

    public final void D3q(C276114sa r10, List list, boolean z, boolean z2) {
        C320416sL r0;
        Map map;
        switch (this.A00) {
            case 0:
                0qQ.A0B(list, 0);
                GXC gxc = (GXC) this.A01;
                C295825oy r1 = gxc.A00;
                if (r1 == null) {
                    return;
                }
                if (!z || !list.isEmpty()) {
                    gxc.A01 = true;
                    if (z) {
                        r1.A02().clear();
                    }
                    r1.A04(list);
                    if (r10 != null) {
                        r1.A03 = r10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A01;
                if (effectsPageFragment.A03 != null) {
                    ShimmerFrameLayout shimmerFrameLayout = effectsPageFragment.mClipsGridShimmerContainer;
                    if (shimmerFrameLayout != null) {
                        shimmerFrameLayout.A05();
                    }
                    boolean z3 = false;
                    if (z) {
                        effectsPageFragment.A0E.A03();
                        boolean isEmpty = list.isEmpty();
                        C321676uZ r12 = effectsPageFragment.A05;
                        if (isEmpty) {
                            r12.A00.A07("empty_page");
                            effectsPageFragment.mReelsEmptyMessageView.setText(2131961555);
                            effectsPageFragment.mReelsEmptyMessageView.setVisibility(0);
                        } else {
                            r12.A00 = C51968G9o.A0t(list);
                            effectsPageFragment.A05.A00.A05();
                        }
                    }
                    UserSession userSession = effectsPageFragment.A07;
                    if (effectsPageFragment.A03 == null) {
                        map = Collections.emptyMap();
                    } else {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C267324bN A0m = C51966G9m.A0m(it);
                            1Xj r13 = A0m.A02;
                            if (!(r13 == null || r13.A2A(effectsPageFragment.A07) == null || !A0m.A02.A2A(effectsPageFragment.A07).getId().equals(effectsPageFragment.A03.A09))) {
                                A1E.put(A0m.A0C(), new C56078HsR(new Object[0], 2131969096));
                            }
                        }
                        map = A1E;
                    }
                    ArrayList A002 = C52341GOk.A00(effectsPageFragment.A0E.A0D, userSession, (String) null, list, map);
                    C320516sV r02 = effectsPageFragment.A0E;
                    if (r10 != null) {
                        z3 = r10.BU8();
                    }
                    r02.A05(A002, z3);
                    if (z) {
                        effectsPageFragment.A0E.A0I.notifyDataSetChanged();
                    }
                    r0 = effectsPageFragment.A06;
                    break;
                } else {
                    return;
                }
            default:
                0qQ.A0B(list, 0);
                H1N h1n = (H1N) this.A01;
                ShimmerFrameLayout shimmerFrameLayout2 = h1n.A01;
                if (shimmerFrameLayout2 != null) {
                    shimmerFrameLayout2.A05();
                }
                String str = "clipsGridAdapter";
                if (z) {
                    C320516sV r03 = h1n.A04;
                    if (r03 != null) {
                        r03.A03();
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                UserSession A0l = AnonymousClass7TE.A0l(h1n.A0E);
                Map emptyMap = Collections.emptyMap();
                0qQ.A07(emptyMap);
                C320516sV r04 = h1n.A04;
                if (r04 != null) {
                    ArrayList A003 = C52341GOk.A00(r04.A0D, A0l, (String) null, list, emptyMap);
                    C320516sV r2 = h1n.A04;
                    if (r2 != null) {
                        boolean z4 = true;
                        if (r10 == null || !r10.BU8()) {
                            z4 = false;
                        }
                        r2.A05(A003, z4);
                        r0 = h1n.A05;
                        if (r0 == null) {
                            str = "clipsSavedTabFetcher";
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
        }
        r0.A02(r10);
    }

    public final void D3v(C276114sa r8, List list, boolean z, boolean z2) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(list, 0);
                GXC gxc = (GXC) this.A01;
                C295825oy r6 = gxc.A00;
                if (r6 != null) {
                    int i = 0;
                    List A03 = r6.A03(gxc.A04);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C267324bN r2 = (C267324bN) it.next();
                        C295365o2 r1 = r2.A01;
                        if ((r1 == C295365o2.AD || r1 == C295365o2.AD_PREVIEW || r1 == C295365o2.MULTI_ADS) && !A03.contains(r2)) {
                            i++;
                        }
                    }
                    if (i > 0 || z2) {
                        r6.A02().clear();
                        r6.A04(list);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                return;
            default:
                0qQ.A0B(list, 0);
                H1N h1n = (H1N) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(h1n.A0E);
                Map emptyMap = Collections.emptyMap();
                0qQ.A07(emptyMap);
                C320516sV r0 = h1n.A04;
                if (r0 != null) {
                    ArrayList A002 = C52341GOk.A00(r0.A0D, A0l, (String) null, list, emptyMap);
                    C320516sV r22 = h1n.A04;
                    if (r22 != null) {
                        boolean z3 = true;
                        if (r8 == null || !r8.BU8()) {
                            z3 = false;
                        }
                        r22.A06(A002, z3);
                        return;
                    }
                }
                0qQ.A0F("clipsGridAdapter");
                throw AnonymousClass00P.createAndThrow();
        }
    }
}
