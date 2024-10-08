package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class K5E extends AnonymousClass4DH implements C41829B2k, AnonymousClass8Z4, AnonymousClass86E {
    public static final String __redex_internal_original_name = "EffectMiniGallerySearchFragment";
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C60438JlW A04;
    public C60298Jiw A05;
    public AnonymousClass86D A06;
    public IgTextView A07;
    public C63807L7n A08;
    public SearchEditText A09;
    public C60472Jm4 A0A;
    public int A0B = 4;
    public Integer A0C = AnonymousClass05K.A0N;
    public String A0D;
    public final Handler A0E = AnonymousClass7TF.A0D();
    public final AnonymousClass0eM A0F = C227642jf.A02(this);

    public final String getModuleName() {
        return "ig_camera_mini_gallery_search_page";
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        AnonymousClass9JA r0;
        0qQ.A0B(str, 1);
        boolean A1Q = AnonymousClass7TF.A1Q(str.length());
        String str2 = "clearButton";
        View view = this.A01;
        if (A1Q) {
            if (view != null) {
                view.setVisibility(8);
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        if (view != null) {
            view.setVisibility(0);
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
        C60438JlW jlW = this.A04;
        if (jlW != null) {
            jlW.A06.clear();
            C60438JlW.A00(jlW);
            jlW.notifyDataSetChanged();
        }
        C60298Jiw jiw = this.A05;
        if (jiw != null && this.A06 != null) {
            C60472Jm4 jm4 = this.A0A;
            if (jm4 == null) {
                str2 = "paginationScrollListener";
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            jm4.A00 = true;
            jiw.A00 = 0mp.A01(str);
            C262204Co r02 = jiw.A02;
            if (r02 != null) {
                r02.AG7((CancellationException) null);
            }
            String str3 = jiw.A00;
            if (str3 == null || str3.length() == 0) {
                AnonymousClass86D r6 = jiw.A07;
                AnonymousClass86U r2 = r6.A02;
                Integer num = r2.A02;
                if (num != null) {
                    int intValue = num.intValue();
                    List list = (List) r2.A00.A02();
                    if (!(list == null || (r0 = (AnonymousClass9JA) list.get(intValue)) == null)) {
                        r6.A0B(r0.A03);
                    }
                }
                C63758L5q l5q = new C63758L5q((String) null, AnonymousClass7TE.A1C(), false);
                C60298Jiw.A01(jiw, C41845B3m.A0d(l5q), jiw.A00, true);
                MHA.A03(jiw, C318116oQ.A00(jiw), 48);
            } else {
                jiw.A02 = C51966G9m.A1L(new MHG(jiw, (AnonymousClass4D7) null, 14), C318116oQ.A00(jiw));
            }
            AnonymousClass86D r03 = this.A06;
            if (r03 != null) {
                r03.A0A(str);
            }
        }
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(searchEditText, 0);
        onSearchSubmitted(searchEditText, searchEditText.getSearchString());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.search_bar_container);
        SearchEditText searchEditText = (SearchEditText) A0G.requireViewById(R.id.search_bar);
        searchEditText.A0C = this;
        C64286LYm.A00(searchEditText, 1, this);
        this.A09 = searchEditText;
        View requireViewById = A0G.requireViewById(R.id.back_button);
        this.A00 = requireViewById;
        if (requireViewById == null) {
            str = "backButton";
        } else {
            JTQ.A1H(new C61685KHt(this, 0), AnonymousClass7TE.A0m(requireViewById));
            View requireViewById2 = A0G.requireViewById(R.id.clear_button);
            this.A01 = requireViewById2;
            if (requireViewById2 == null) {
                str = "clearButton";
            } else {
                JTQ.A1H(new C61685KHt(this, 1), AnonymousClass7TE.A0m(requireViewById2));
                this.A03 = DbT.A0I(view, R.id.camera_effect_preview_video_recycler_view);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), this.A0B);
                RecyclerView recyclerView = this.A03;
                str = "gridRecyclerView";
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(gridLayoutManager);
                    C60472Jm4 jm4 = new C60472Jm4(gridLayoutManager, new M0F(this), 16);
                    this.A0A = jm4;
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null) {
                        recyclerView2.A15(jm4);
                        RecyclerView recyclerView3 = this.A03;
                        if (recyclerView3 != null) {
                            recyclerView3.setAdapter(this.A04);
                            RecyclerView recyclerView4 = this.A03;
                            if (recyclerView4 != null) {
                                int i = this.A0B;
                                int A012 = DbY.A01(requireContext());
                                Context context = view.getContext();
                                recyclerView4.A11(new C60461Jlt(i, A012, false, 0mk.A02(context)));
                                0qQ.A07(context);
                                C63807L7n l7n = new C63807L7n(context, view, AnonymousClass7TE.A0l(this.A0F), this);
                                this.A08 = l7n;
                                SearchEditText searchEditText2 = this.A09;
                                if (searchEditText2 != null) {
                                    l7n.A00 = searchEditText2;
                                }
                                this.A02 = view.requireViewById(R.id.effect_search_not_found_container);
                                this.A07 = DbT.A0a(view, R.id.effect_search_not_found_text);
                                AnonymousClass86D r0 = this.A06;
                                if (r0 != null) {
                                    A01(this, r0.A02.A03);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(K5E k5e) {
        SearchEditText searchEditText = k5e.A09;
        if (searchEditText != null && searchEditText.isFocused()) {
            searchEditText.clearFocus();
            0nA.A0N(searchEditText);
            AnonymousClass86D r0 = k5e.A06;
            if (r0 != null) {
                r0.A0P.Epw(AnonymousClass86S.CLOSED);
            }
            k5e.A0E.postDelayed(new C65840M1g(k5e), 100);
        }
    }

    public static final void A01(K5E k5e, String str) {
        SearchEditText searchEditText = k5e.A09;
        if (searchEditText != null) {
            int length = str.length();
            if (length == 0) {
                searchEditText.setHint(2131972806);
                SearchEditText searchEditText2 = k5e.A09;
                if (searchEditText2 != null) {
                    DbS.A1C(searchEditText2);
                }
            } else {
                searchEditText.setText(str);
                searchEditText.setSelection(length);
            }
        }
        AnonymousClass86D r0 = k5e.A06;
        if (r0 != null) {
            r0.A0A(str);
        }
    }

    public final void D9L(int i) {
        AnonymousClass86D r0 = this.A06;
        if (r0 != null) {
            r0.D9L(i);
        }
        C63807L7n l7n = this.A08;
        if (l7n == null) {
            0qQ.A0F("nullStateController");
            throw AnonymousClass00P.createAndThrow();
        }
        UA8 ua8 = l7n.A02;
        ua8.notifyItemRemoved(i);
        ua8.A00 = C59820JZt.A00(ua8.A01).A00();
        ua8.notifyDataSetChanged();
    }

    public final void DW7() {
        String searchString;
        SearchEditText searchEditText = this.A09;
        if (searchEditText == null || (searchString = searchEditText.getSearchString()) == null || searchString.length() == 0) {
            SearchEditText searchEditText2 = this.A09;
            if (searchEditText2 != null) {
                searchEditText2.requestFocus();
            }
            AnonymousClass37D A022 = AnonymousClass37D.A00.A02(requireContext());
            if (A022 != null) {
                A022.A0T(AnonymousClass05K.A04);
            }
            this.A0E.postDelayed(new C65842M1i(this), 100);
        }
    }

    public final void Dbh(int i) {
        SearchEditText searchEditText;
        AnonymousClass86D r0 = this.A06;
        if (r0 != null) {
            r0.Dbh(i);
            String str = r0.A02.A03;
            if (str.length() > 0 && (searchEditText = this.A09) != null) {
                searchEditText.setText(str);
                searchEditText.setSelection(str.length());
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public final boolean isScrolledToBottom() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            return !recyclerView.canScrollVertically(1);
        }
        0qQ.A0F("gridRecyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            return !JTP.A1Y(recyclerView);
        }
        0qQ.A0F("gridRecyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DVy() {
        A00(this);
        SearchEditText searchEditText = this.A09;
        if (searchEditText != null) {
            DbS.A1C(searchEditText);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1319139771);
        K5E.super.onCreate(bundle);
        requireArguments();
        this.A0D = AnonymousClass7TF.A0b();
        this.A0B = 3;
        this.A0C = AnonymousClass05K.A0Y;
        setModuleNameV2("ig_camera_mini_gallery_search_page");
        AnonymousClass0fD.A09(-355403322, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r24, android.view.ViewGroup r25, android.os.Bundle r26) {
        /*
            r23 = this;
            r0 = -1043537491(0xffffffffc1cce1ad, float:-25.610193)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r15 = 0
            r4 = r24
            X.0qQ.A0B(r4, r15)
            r10 = r23
            r3 = r25
            r0 = r26
            X.K5E.super.onCreateView(r4, r3, r0)
            androidx.fragment.app.FragmentActivity r7 = r10.requireActivity()
            X.2YN r0 = new X.2YN     // Catch:{ Exception -> 0x010d }
            r0.<init>(r7)     // Catch:{ Exception -> 0x010d }
            java.lang.Class<X.86D> r1 = X.AnonymousClass86D.class
            X.2YL r0 = r0.A00(r1)     // Catch:{ Exception -> 0x010d }
            X.86D r0 = (X.AnonymousClass86D) r0     // Catch:{ Exception -> 0x010d }
            r10.A06 = r0     // Catch:{ Exception -> 0x010d }
            X.2YN r0 = new X.2YN
            r0.<init>(r7)
            X.2YL r1 = r0.A00(r1)
            X.86D r1 = (X.AnonymousClass86D) r1
            X.Lcs r9 = new X.Lcs
            r9.<init>(r10, r1)
            android.content.Context r0 = r10.requireContext()
            int r13 = X.DbY.A01(r0)
            java.lang.Integer r12 = r10.A0C
            int r14 = r10.A0B
            r0 = 1
            r8 = 0
            X.0eM r5 = r10.A0F
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r5)
            X.JlW r6 = new X.JlW
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r10.A04 = r6
            java.lang.String r20 = r1.A05()
            java.lang.String r8 = r10.A0D
            if (r8 != 0) goto L_0x0066
            java.lang.String r0 = "searchSessionId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0066:
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r6 = r1.A0D
            X.AnonymousClass7TG.A1Q(r7, r6)
            X.KEO r5 = new X.KEO
            r21 = r8
            r22 = r0
            r17 = r6
            r18 = r1
            r19 = r7
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.2YN r6 = X.JTO.A0L(r5, r10)
            java.lang.Class<X.Jiw> r5 = X.C60298Jiw.class
            X.2YL r6 = r6.A00(r5)
            X.Jiw r6 = (X.C60298Jiw) r6
            r10.A05 = r6
            if (r6 == 0) goto L_0x009f
            com.instagram.common.session.UserSession r5 = r6.A08
            X.4Om r8 = X.C264044Oj.A00(r5)
            java.lang.String r7 = r6.A09
            java.lang.String r6 = r6.A0A
            X.0iw r5 = X.C17169VKy.A04
            r8.Chq(r5, r7, r6)
        L_0x009f:
            X.Jiw r5 = r10.A05
            if (r5 == 0) goto L_0x00ba
            X.2Fj r8 = r5.A04
            java.lang.String r5 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.ar.core.discovery.minigallery.viewmodels.PagedData<com.instagram.camera.effect.models.effectpreview.EffectPreviewItem>>"
            X.0qQ.A0C(r8, r5)
            X.07Z r7 = r10.getViewLifecycleOwner()
            r5 = 35
            X.MP6 r6 = new X.MP6
            r6.<init>(r10, r5)
            r5 = 39
            X.Dba.A16(r7, r8, r6, r5)
        L_0x00ba:
            X.848 r5 = r1.A04
            X.05G r5 = r5.A00
            androidx.lifecycle.CoroutineLiveData r9 = X.DbT.A0G(r5)
            X.07Z r7 = r10.getViewLifecycleOwner()
            r6 = 36
            X.MP6 r5 = new X.MP6
            r5.<init>(r10, r6)
            r8 = 39
            X.Dba.A16(r7, r9, r5, r8)
            X.86U r1 = r1.A02
            X.2Fj r7 = r1.A01
            java.lang.String r1 = "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.instagram.ar.core.discovery.minigallery.viewmodels.MiniGalleryViewModel.SearchState>"
            X.0qQ.A0C(r7, r1)
            X.07Z r6 = r10.getViewLifecycleOwner()
            r5 = 37
            X.MP6 r1 = new X.MP6
            r1.<init>(r10, r5)
            X.Dba.A16(r6, r7, r1, r8)
            X.86D r1 = r10.A06
            r5 = 1
            if (r1 == 0) goto L_0x010b
            boolean r1 = r1.A09
            if (r1 != r0) goto L_0x010b
        L_0x00f2:
            if (r5 == 0) goto L_0x0103
            android.view.LayoutInflater r1 = X.JTS.A0A(r4, r10)
            r0 = 2131625324(0x7f0e056c, float:1.8877853E38)
            android.view.View r1 = r1.inflate(r0, r3, r15)
        L_0x00ff:
            r0 = -1129216423(0xffffffffbcb18659, float:-0.021670507)
            goto L_0x0132
        L_0x0103:
            r0 = 2131625324(0x7f0e056c, float:1.8877853E38)
            android.view.View r1 = r4.inflate(r0, r3, r15)
            goto L_0x00ff
        L_0x010b:
            r5 = 0
            goto L_0x00f2
        L_0x010d:
            r5 = move-exception
            java.lang.String r1 = "EffectMiniGallerySearchFragment"
            r0 = 938(0x3aa, float:1.314E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A06(r1, r0, r5)
            X.86D r0 = r10.A06
            r1 = 1
            if (r0 == 0) goto L_0x013e
            boolean r0 = r0.A09
            if (r0 != r1) goto L_0x013e
        L_0x0122:
            if (r1 == 0) goto L_0x0136
            android.view.LayoutInflater r1 = X.JTS.A0A(r4, r10)
            r0 = 2131625324(0x7f0e056c, float:1.8877853E38)
            android.view.View r1 = r1.inflate(r0, r3, r15)
        L_0x012f:
            r0 = 1314344762(0x4e574f3a, float:9.0307341E8)
        L_0x0132:
            X.AnonymousClass0fD.A09(r0, r2)
            return r1
        L_0x0136:
            r0 = 2131625324(0x7f0e056c, float:1.8877853E38)
            android.view.View r1 = r4.inflate(r0, r3, r15)
            goto L_0x012f
        L_0x013e:
            r1 = 0
            goto L_0x0122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5E.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
