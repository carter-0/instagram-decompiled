package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Nbc  reason: case insensitive filesystem */
public final class C68953Nbc extends NKK {
    public static final String __redex_internal_original_name = "DirectTabbedEmojiViewPagerFragment";
    public int A00 = 1;
    public TabLayout A01;
    public List A02 = 0sn.A00;
    public ViewPager2 A03;
    public N01 A04;
    public List A05;
    public final AnonymousClass0eM A06;

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Long l;
        View view2 = view;
        0qQ.A0B(view2, 0);
        List list = this.A02;
        AnonymousClass0eM r4 = this.A0A;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        C254743sy r0 = this.A05;
        String str4 = null;
        if (r0 != null) {
            str = C66647MaG.A0B(r0);
        } else {
            str = null;
        }
        String str5 = this.A07;
        String str6 = this.A06;
        long j = this.A02;
        2FW r13 = this.A04;
        if (r13 != null) {
            this.A04 = new N01(this, A0l, this.A03, r13, str, str5, str6, list, this.A00, j);
            ViewPager2 viewPager2 = (ViewPager2) view2.requireViewById(R.id.view_pager);
            viewPager2.setOffscreenPageLimit(this.A00);
            N01 n01 = this.A04;
            if (n01 == null) {
                str2 = "viewPagerAdapter";
            } else {
                viewPager2.setAdapter(n01);
                this.A03 = viewPager2;
                TabLayout tabLayout = (TabLayout) view2.requireViewById(R.id.tab_layout);
                this.A01 = tabLayout;
                str2 = "tabLayout";
                if (tabLayout != null) {
                    tabLayout.A0C = view2.getContext().getColor(2Yu.A0B(getContext()));
                    TabLayout tabLayout2 = this.A01;
                    if (tabLayout2 != null) {
                        ViewPager2 viewPager22 = this.A03;
                        if (viewPager22 == null) {
                            str2 = "viewPager";
                        } else {
                            new C66992MgQ(viewPager22, tabLayout2, C71808Or9.A00).A00();
                            TabLayout tabLayout3 = this.A01;
                            if (tabLayout3 != null) {
                                C324806zv.A00(tabLayout3, new PRS(0, view2, this), 0, 0nA.A09(AnonymousClass7TE.A0S(tabLayout3)));
                                TabLayout tabLayout4 = this.A01;
                                if (tabLayout4 != null) {
                                    tabLayout4.A0D(new C71806Or7(this, 2));
                                    if (this.A01 == 29) {
                                        C313756gx A0P = C66583MXo.A0P(r4);
                                        int i = this.A00;
                                        C254743sy r02 = this.A05;
                                        if (r02 != null) {
                                            str3 = C66647MaG.A0B(r02);
                                        } else {
                                            str3 = null;
                                        }
                                        C254743sy r03 = this.A05;
                                        if (r03 != null) {
                                            str4 = C66647MaG.A0C(r03);
                                        }
                                        List list2 = this.A05;
                                        str2 = "countBasedReactions";
                                        if (list2 != null) {
                                            0sj A0p = 00k.A0p(list2.subList(0, Math.min(list2.size(), 5)));
                                            LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(0Yv.A1E(A0p, 10)));
                                            Iterator it = A0p.iterator();
                                            while (it.hasNext()) {
                                                0k0 r8 = (0k0) it.next();
                                                0eP A1L = AnonymousClass7TE.A1L(String.valueOf(r8.A00 + 1), ((DirectCountBasedReaction) r8.A01).A01);
                                                A0x.put(A1L.A00, A1L.A01);
                                            }
                                            1Ln A0J = DbT.A0J(A0P);
                                            if (DbT.A1Y(A0J)) {
                                                DbW.A17(A0J, A0P);
                                                DbV.A1M(A0J, "reaction_digest_sheet_rendered");
                                                A0J.A0p("message_reactions");
                                                DbZ.A1L(A0J, "thread_view", i);
                                                A0J.A0s(str3);
                                                if (str4 != null) {
                                                    l = 00y.A0n(10, str4);
                                                } else {
                                                    l = null;
                                                }
                                                JTQ.A1C(A0J, l, A0x);
                                                return;
                                            }
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            str2 = "messageContentType";
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0043: MOVE  (r1v2 X.NKD) = (r1v1 X.NKD)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final boolean isScrolledToTop() {
        /*
            r5 = this;
            X.N01 r4 = r5.A04
            if (r4 != 0) goto L_0x000e
            java.lang.String r0 = "viewPagerAdapter"
        L_0x0006:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            androidx.viewpager2.widget.ViewPager2 r0 = r5.A03
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "viewPager"
            goto L_0x0006
        L_0x0015:
            int r1 = r0.A00
            if (r1 < 0) goto L_0x004c
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x004c
            androidx.fragment.app.Fragment r0 = r4.A00
            X.0hq r3 = r0.getChildFragmentManager()
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            r0 = 102(0x66, float:1.43E-43)
            r2.append(r0)
            long r0 = r4.getItemId(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            androidx.fragment.app.Fragment r1 = r3.A0R(r0)
            boolean r0 = r1 instanceof X.NKD
            if (r0 == 0) goto L_0x004c
            X.NKD r1 = (X.NKD) r1
            if (r1 == 0) goto L_0x004c
            boolean r0 = r1.isScrolledToTop()
            return r0
        L_0x004c:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68953Nbc.isScrolledToTop():boolean");
    }

    public C68953Nbc() {
        C73921Pm1 A002 = C73921Pm1.A00(this, 42);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C73921Pm1.A00(C73921Pm1.A00(this, 43), 44));
        this.A06 = DbS.A0I(C73921Pm1.A00(A003, 45), A002, new C73667Phg(15, (Object) null, A003), DbS.A0z(C60232Jhp.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1793196782);
        super.onCreate(bundle);
        0sn parcelableArrayList = requireArguments().getParcelableArrayList("direct_count_based_reactions_list");
        if (parcelableArrayList == null) {
            parcelableArrayList = 0sn.A00;
        }
        this.A05 = parcelableArrayList;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : parcelableArrayList) {
            if (((DirectCountBasedReaction) next).A00 != 0) {
                A1C.add(next);
            }
        }
        List<DirectCountBasedReaction> A002 = C73429PcU.A00(A1C, 25);
        this.A05 = A002;
        if (A002 == null) {
            0qQ.A0F("countBasedReactions");
            throw AnonymousClass00P.createAndThrow();
        }
        ArrayList A1M = 0sr.A1M(new DirectCustomReactionTabModel[]{new DirectCustomReactionTabModel((DirectCountBasedReaction) null, DirectCustomReactionTabModel.TabType.ALL_TAB)});
        for (DirectCountBasedReaction directCustomReactionTabModel : A002) {
            A1M.add(new DirectCustomReactionTabModel(directCustomReactionTabModel, DirectCustomReactionTabModel.TabType.CUSTOM_EMOJI_TAB));
        }
        this.A02 = 00k.A0a(A1M);
        int A042 = DbS.A04(0Tu.A05, AnonymousClass7TF.A0L(this.A0A, 0), 36597343318379297L);
        if (A042 == 0) {
            A042 = -1;
        }
        this.A00 = A042;
        AnonymousClass0fD.A09(1718801687, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-324536581);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_tabbed_emoji_reactions_list, viewGroup, false);
        AnonymousClass0fD.A09(1004075004, A022);
        return inflate;
    }
}
