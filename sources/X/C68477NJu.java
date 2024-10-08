package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.NJu  reason: case insensitive filesystem */
public final class C68477NJu extends AnonymousClass4DH implements AnonymousClass4DU, C294875nB, AnonymousClass4DS, C320316sB {
    public static final String __redex_internal_original_name = "DirectSearchInboxSeeAllResharedContentFragment";
    public C68963Nbq A00;
    public C70787OLh A01;
    public String A02 = "";
    public ArrayList A03;
    public int A04;
    public int A05;
    public int A06;
    public RecyclerView A07;
    public ShimmerFrameLayout A08;
    public C229352nF A09;
    public 2el A0A;
    public C72208OyY A0B;
    public FZN A0C;
    public C320516sV A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final int A0J = 9;
    public final C249403jg A0K = new C67837Mvh(this, 9);

    public final /* synthetic */ void Cj6(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    public final /* synthetic */ void Cj7(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final /* synthetic */ void D3i(User user) {
    }

    public final void D46(C267324bN r20, int i) {
        String str;
        String str2;
        C267324bN r0 = r20;
        0qQ.A0B(r0, 0);
        AnonymousClass0eM r3 = this.A0I;
        C270634h3 r1 = new C270634h3(ClipsViewerSource.DIRECT_SEARCH, AnonymousClass7TE.A0l(r3));
        C229352nF r10 = this.A09;
        if (r10 == null) {
            str = "clipsGridItemsStore";
        } else {
            String str3 = this.A0E;
            str = "gridKey";
            if (str3 != null) {
                ArrayList A012 = A01();
                C298855u9 A002 = C276114sa.A00.A00(true);
                A002.A00 = null;
                r10.A03(A002.A00(), C294895nD.DEFAULT, str3, A012, true, true);
                1Xj r6 = r0.A02;
                List list = r0.A08;
                if (!(r6 == null || list == null)) {
                    int i2 = i;
                    Dk6((C67058MhZ) null, new DirectSearchResharedContent(AnonymousClass7TE.A0l(r3), r6, 00k.A0k(list)), "inbox_search", i2, i2, this.A06, this.A05, this.A04);
                }
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                FragmentActivity requireActivity = requireActivity();
                1Xj r02 = r0.A02;
                if (r02 != null) {
                    str2 = r02.getId();
                } else {
                    str2 = null;
                }
                r1.A1C = str2;
                String str4 = this.A0E;
                if (str4 != null) {
                    r1.A1F = str4;
                    r1.A1B = DbU.A0u(r3);
                    r1.A1c = false;
                    String str5 = this.A0G;
                    if (str5 == null) {
                        str = "query";
                    } else {
                        r1.A03(new SearchContext((String) null, (String) null, str5, (String) null, (String) null, (String) null, (String) null, (String) null));
                        r1.A0w = this.A02;
                        C250563lf.A0X(requireActivity, r1.A00(), A0l);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r4, int i) {
        return false;
    }

    public final void D8N(DirectShareTarget directShareTarget) {
    }

    public final /* synthetic */ void D9P(DirectShareTarget directShareTarget) {
    }

    public final void Dk7(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    public final void DpB(View view, C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        1Xj r0;
        String id;
        String str2;
        DbW.A1O(directSearchResult, 0, view);
        if ((directSearchResult instanceof DirectSearchResharedContent) && (r0 = ((DirectSearchResharedContent) directSearchResult).A01) != null && (id = r0.getId()) != null) {
            C68963Nbq nbq = this.A00;
            if (nbq == null) {
                str2 = "impressionHelper";
            } else {
                PE1 A002 = A00(nbq, id, i, i2, i3, i4);
                FZN fzn = this.A0C;
                if (fzn == null) {
                    fzn = new FZN(new PE2(this, 4));
                    this.A0C = fzn;
                }
                AnonymousClass30Y A0a = DbU.A0a(fzn, AnonymousClass30Y.A00(A002, (Object) null, A002.A0A));
                2el r02 = this.A0A;
                if (r02 == null) {
                    str2 = "viewpointManager";
                } else {
                    r02.A05(view, A0a);
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DpC(RectF rectF, 28D r2, DirectShareTarget directShareTarget) {
    }

    public final void DpD(View view) {
    }

    public final /* synthetic */ void DyE() {
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Etr(true);
        String str = this.A0H;
        if (str == null) {
            0qQ.A0F(DialogModule.KEY_TITLE);
            throw AnonymousClass00P.createAndThrow();
        }
        r3.setTitle(str);
        r3.Eu4(true);
    }

    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_SEE_ALL_RESHARED_CONTENT_FRAGMENT";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext(), 3);
        C320516sV r0 = this.A0D;
        if (r0 != null) {
            fastScrollingGridLayoutManager.A01 = (C320806sz) r0.A0N.getValue();
            this.A08 = (ShimmerFrameLayout) view.requireViewById(R.id.clips_grid_shimmer_container);
            RecyclerView A0I2 = DbT.A0I(view, R.id.clips_grid_recyclerview);
            this.A07 = A0I2;
            String str = "clipsRecyclerView";
            if (A0I2 != null) {
                A0I2.setLayoutManager(fastScrollingGridLayoutManager);
                RecyclerView recyclerView = this.A07;
                if (recyclerView != null) {
                    C320516sV r02 = this.A0D;
                    if (r02 != null) {
                        recyclerView.setAdapter(r02.A0I);
                        RecyclerView recyclerView2 = this.A07;
                        if (recyclerView2 != null) {
                            recyclerView2.A15(this.A0K);
                            C320516sV r03 = this.A0D;
                            if (r03 != null) {
                                if (C320516sV.A00(r03).size() == 0) {
                                    C320516sV r1 = this.A0D;
                                    if (r1 != null) {
                                        r1.A04(this.A0J);
                                        ShimmerFrameLayout shimmerFrameLayout = this.A08;
                                        if (shimmerFrameLayout != null) {
                                            shimmerFrameLayout.A02();
                                        }
                                        0qQ.A0F("clipsGridShimmerContainer");
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                } else {
                                    ShimmerFrameLayout shimmerFrameLayout2 = this.A08;
                                    if (shimmerFrameLayout2 != null) {
                                        shimmerFrameLayout2.A05();
                                    }
                                    0qQ.A0F("clipsGridShimmerContainer");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                2el r3 = this.A0A;
                                if (r3 == null) {
                                    str = "viewpointManager";
                                } else {
                                    AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
                                    RecyclerView recyclerView3 = this.A07;
                                    if (recyclerView3 != null) {
                                        r3.A08(recyclerView3, A002, new AnonymousClass2eo[0]);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("clipsGridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    private final PE1 A00(C68963Nbq nbq, String str, int i, int i2, int i3, int i4) {
        String str2 = str;
        C254763t0 A0g = C66580MXl.A0g(str2);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Integer num = AnonymousClass05K.A1F;
        String str3 = this.A0G;
        if (str3 == null) {
            0qQ.A0F("query");
            throw AnonymousClass00P.createAndThrow();
        }
        return new PE1((AnonymousClass9VB) null, (DirectShareTargetLoggingInfo) null, A0g, num, str2, str3, nbq.A01, this.A0F, (String) null, A1C, i2, i3, i4, i, false, false);
    }

    public static final void A02(C68477NJu nJu) {
        C320516sV r0 = nJu.A0D;
        String str = "clipsGridAdapter";
        if (r0 != null) {
            r0.A02();
            ShimmerFrameLayout shimmerFrameLayout = nJu.A08;
            if (shimmerFrameLayout == null) {
                str = "clipsGridShimmerContainer";
            } else {
                shimmerFrameLayout.A05();
                UserSession A0l = AnonymousClass7TE.A0l(nJu.A0I);
                ArrayList A012 = nJu.A01();
                Map emptyMap = Collections.emptyMap();
                C320516sV r02 = nJu.A0D;
                if (r02 != null) {
                    ArrayList A002 = C52341GOk.A00(r02.A0D, A0l, (String) null, A012, emptyMap);
                    C320516sV r2 = nJu.A0D;
                    if (r2 != null) {
                        C70787OLh oLh = nJu.A01;
                        if (oLh == null) {
                            str = "resharedContentProvider";
                        } else {
                            Integer num = oLh.A00;
                            if (num != null) {
                                r2.A05(A002, AnonymousClass7TF.A1W(num, AnonymousClass05K.A0Y));
                                return;
                            }
                            str = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dk6(C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        1Xj r0;
        String id;
        DirectSearchResult directSearchResult2 = directSearchResult;
        AnonymousClass7TG.A1R(directSearchResult2, str);
        if ((directSearchResult2 instanceof DirectSearchResharedContent) && (r0 = ((DirectSearchResharedContent) directSearchResult2).A01) != null && (id = r0.getId()) != null) {
            C68963Nbq nbq = this.A00;
            if (nbq != null) {
                int i6 = i;
                int i7 = i2;
                int i8 = i5;
                PE1 A002 = A00(nbq, id, i8, i6, i7, i4);
                C72208OyY oyY = this.A0B;
                if (oyY != null) {
                    long j = (long) i7;
                    DirectSearchResult directSearchResult3 = directSearchResult2;
                    oyY.A08(A002, directSearchResult3, i8, (long) i6, j, (long) i3);
                    C72208OyY oyY2 = this.A0B;
                    if (oyY2 != null) {
                        oyY2.A09(directSearchResult2);
                        C68963Nbq nbq2 = this.A00;
                        if (nbq2 != null) {
                            nbq2.A02(A002);
                            C68963Nbq nbq3 = this.A00;
                            if (nbq3 != null) {
                                nbq3.A01();
                                return;
                            }
                        }
                    }
                }
                0qQ.A0F("directInboxSearchLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("impressionHelper");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dnr(C67058MhZ mhZ, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        0wb.A01.Ew0(__redex_internal_original_name, "Story ring should not be accessible here.");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r2 = (com.instagram.model.direct.DirectSearchResharedContent) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A01() {
        /*
            r5 = this;
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = r5.A03
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "resharedContentResults"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r0)
        L_0x0016:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r3)
            com.instagram.model.direct.DirectSearchResult r2 = (com.instagram.model.direct.DirectSearchResult) r2
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectSearchResharedContent
            if (r0 == 0) goto L_0x0016
            com.instagram.model.direct.DirectSearchResharedContent r2 = (com.instagram.model.direct.DirectSearchResharedContent) r2
            X.1Xj r0 = r2.A01
            if (r0 == 0) goto L_0x0016
            X.4bN r1 = X.C295375o3.A02(r0)
            java.util.Set r0 = r2.A02
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r0)
            X.0qQ.A07(r0)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            r1.A08 = r0
            int r0 = r5.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            int r0 = r5.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            r4.add(r1)
            goto L_0x0016
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68477NJu.A01():java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.5nB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = 1508965237(0x59f0fb75, float:8.4788093E15)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r10 = r19
            r0 = r20
            X.C68477NJu.super.onCreate(r0)
            android.os.Bundle r4 = r10.requireArguments()
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = ""
            java.lang.String r0 = r4.getString(r0, r2)
            r10.A0H = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY"
            java.lang.String r0 = r4.getString(r0, r2)
            r10.A0G = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID"
            java.lang.String r0 = r4.getString(r0)
            r10.A0F = r0
            r0 = 430(0x1ae, float:6.03E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3 = 0
            int r0 = r4.getInt(r0, r3)
            r10.A04 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX"
            int r0 = r4.getInt(r0, r3)
            r10.A06 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SECTION_POSITION"
            int r0 = r4.getInt(r0, r3)
            r10.A05 = r0
            java.lang.String r2 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_NEXT_OFFSET"
            java.lang.String r0 = "0"
            java.lang.String r0 = r4.getString(r2, r0)
            r10.A02 = r0
            java.lang.String r0 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_RESHARED_CONTENT"
            java.util.ArrayList r0 = r4.getParcelableArrayList(r0)
            if (r0 != 0) goto L_0x0063
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
        L_0x0063:
            r10.A03 = r0
            X.0eM r2 = r10.A0I
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            android.content.Context r4 = r10.requireContext()
            X.0gy r0 = X.AnonymousClass07i.A00(r10)
            r8 = 0
            X.2lw r6 = new X.2lw
            r6.<init>(r4, r0, r8)
            X.O7U r5 = new X.O7U
            r5.<init>(r10)
            java.lang.String r0 = r10.A0G
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "query"
        L_0x0084:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x008c:
            X.OLh r4 = new X.OLh
            r4.<init>(r7, r6, r5, r0)
            r10.A01 = r4
            java.lang.String r0 = r10.A02
            r4.A00(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.OyY r0 = X.C72208OyY.A00(r0)
            r10.A0B = r0
            X.0lg r4 = X.DbT.A0X(r2)
            X.OyY r0 = r10.A0B
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = "directInboxSearchLogger"
            goto L_0x0084
        L_0x00ad:
            java.lang.Object r0 = X.C73467Pd9.A00(r4, r0)
            X.Nbq r0 = (X.C68963Nbq) r0
            r10.A00 = r0
            X.2el r14 = X.2el.A00()
            r10.A0A = r14
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r2)
            X.6sT r11 = new X.6sT
            r12 = r8
            r15 = r10
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 1058013184(0x3f100000, float:0.5625)
            X.6sS r9 = new X.6sS
            r9.<init>(r0, r3, r3)
            r0 = 1
            r9.A01 = r0
            android.content.Context r7 = r10.requireContext()
            com.instagram.common.session.UserSession r13 = X.DbW.A0S(r2, r0)
            X.6sV r6 = new X.6sV
            r12 = r10
            r14 = r10
            r15 = r8
            r17 = r3
            r18 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r10.A0D = r6
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r10.A0E = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.2nF r0 = X.C229342nE.A00(r0)
            r10.A09 = r0
            r0 = -3854932(0xffffffffffc52dac, float:NaN)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68477NJu.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-724967786);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.inbox_search_see_all_reshared_content_fragment, viewGroup, false);
        UserSession A0l = AnonymousClass7TE.A0l(this.A0I);
        ArrayList A012 = A01();
        Map emptyMap = Collections.emptyMap();
        C320516sV r0 = this.A0D;
        if (r0 != null) {
            ArrayList A002 = C52341GOk.A00(r0.A0D, A0l, (String) null, A012, emptyMap);
            C320516sV r02 = this.A0D;
            if (r02 != null) {
                r02.A05(A002, false);
                AnonymousClass0fD.A09(-2139743414, A022);
                return inflate;
            }
        }
        0qQ.A0F("clipsGridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }
}
