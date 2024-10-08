package com.instagram.ui.widget.search;

import X.0Tu;
import X.0mp;
import X.0nA;
import X.0wb;
import X.182;
import X.2Rw;
import X.2Yu;
import X.2cs;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass37Q;
import X.AnonymousClass3E4;
import X.AnonymousClass3E6;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass8Z4;
import X.C226462gr;
import X.C226472gs;
import X.C231402rc;
import X.C249383je;
import X.C249403jg;
import X.C252203oj;
import X.C252213ok;
import X.C252233om;
import X.C61340me;
import X.C66582MXn;
import X.C67302Mlc;
import X.C67627Mr0;
import X.C70598OCv;
import X.C71406Ok5;
import X.C71409Ok8;
import X.C72208OyY;
import X.C73272PZq;
import X.C74284PsC;
import X.C74502Pvw;
import X.DbS;
import X.DbU;
import X.DbW;
import X.O3Z;
import X.OIK;
import X.X5G;
import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public class SearchController extends C252233om implements View.OnClickListener, C252203oj, View.OnFocusChangeListener, C252213ok, AnonymousClass8Z4, X5G, C74284PsC {
    public float A00;
    public float A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public 2Rw A09;
    public C231402rc A0A;
    public final int A0B;
    public final int A0C;
    public final ArgbEvaluator A0D;
    public final Activity A0E;
    public final C72208OyY A0F;
    public final C74502Pvw A0G;
    public final boolean A0H;
    public final int A0I;
    public final 2cs A0J;
    public final AnonymousClass3E6 A0K;
    public OIK mViewHolder;

    public final void DMr(int i, boolean z) {
        OIK oik;
        C72208OyY oyY;
        int i2 = 0;
        boolean A1R = AnonymousClass7TF.A1R(i);
        this.A06 = A1R;
        if (A1R && (oyY = this.A0F) != null) {
            oyY.A05(5);
        }
        if (this.A08 && (oik = this.mViewHolder) != null) {
            ViewGroup.LayoutParams layoutParams = oik.A0E.getLayoutParams();
            ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = oik.A0E;
            imeBackButtonHandlerFrameLayout.getParent().getClass();
            int height = ((View) imeBackButtonHandlerFrameLayout.getParent()).getHeight() - i;
            layoutParams.height = height;
            if (this.A06) {
                i2 = this.A0I;
            }
            layoutParams.height = height + i2;
            imeBackButtonHandlerFrameLayout.post(new C73272PZq(layoutParams, oik));
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void A00() {
        OIK oik = this.mViewHolder;
        if (oik != null) {
            0nA.A0N(oik.A0F);
        }
    }

    public final void A01(Integer num, float f, float f2, boolean z) {
        2cs r3 = this.A0J;
        if (r3.A0C()) {
            this.A02 = num;
            r3.A08(0.0d, true);
            this.A00 = f;
            this.A01 = f2;
            if (z) {
                r3.A06(1.0d);
            } else {
                r3.A08(1.0d, true);
            }
        }
    }

    public final void A02(boolean z, float f) {
        A01(AnonymousClass05K.A01, f, 0.0f, z);
    }

    public final void DmE(2cs r12) {
        double d;
        double d2;
        float f = (float) r12.A09.A00;
        double d3 = (double) f;
        float A032 = (float) AnonymousClass37Q.A03(d3, (double) this.A00, (double) this.A01);
        Integer num = this.A02;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2) {
            d = 0.0d;
            d2 = 1.0d;
        } else {
            d = 1.0d;
            d2 = 0.0d;
        }
        float A033 = (float) AnonymousClass37Q.A03(d3, d, d2);
        int A0M = AnonymousClass7TE.A0M(this.A0D.evaluate(f, Integer.valueOf(this.A0B), Integer.valueOf(this.A0C)));
        OIK oik = this.mViewHolder;
        if (oik != null) {
            ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = oik.A0E;
            int i = 0;
            int i2 = 4;
            if (A033 > 0.0f) {
                i2 = 0;
            }
            imeBackButtonHandlerFrameLayout.setVisibility(i2);
            View view = oik.A05;
            if (A033 <= 0.0f) {
                i = 4;
            }
            view.setVisibility(i);
            oik.A07.setAlpha(A033);
            oik.A0D.setAlpha(A033);
            oik.A08.setAlpha(1.0f - A033);
            View view2 = oik.A03;
            view2.setBackgroundColor(A0M);
            view2.setAlpha(A033);
            view.setAlpha(A033);
            oik.A0E.setTranslationY(A032);
            C74502Pvw pvw = this.A0G;
            pvw.CvL(this, this.A02, f, A032);
            if (f == 1.0f) {
                if (this.A02 == num2) {
                    num2 = AnonymousClass05K.A0C;
                } else {
                    num2 = AnonymousClass05K.A00;
                }
            }
            Integer num3 = this.A03;
            if (num2 != num3) {
                this.A03 = num2;
                int intValue = num3.intValue();
                if (intValue == 0) {
                    SearchEditText searchEditText = oik.A0F;
                    searchEditText.A03();
                    0nA.A0Q(searchEditText);
                } else if (intValue == 2) {
                    SearchEditText searchEditText2 = oik.A0F;
                    DbS.A1C(searchEditText2);
                    searchEditText2.clearFocus();
                    0nA.A0N(searchEditText2);
                }
                pvw.Dmq(this, this.A03, num3);
            }
        }
    }

    public final boolean onBackPressed() {
        C74502Pvw pvw = this.A0G;
        pvw.DDU();
        Integer num = AnonymousClass05K.A00;
        A01(num, 0.0f, pvw.Abo(this, num), true);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        if (O3Z.A00(this.A0E.getResources().getConfiguration(), configuration)) {
            this.A0K.Dh2();
        }
    }

    public final void onDestroyView() {
        OIK oik = this.mViewHolder;
        if (oik != null) {
            oik.A0E.A00 = null;
            ListView listView = oik.A00;
            if (listView != null) {
                listView.setOnScrollListener((AbsListView.OnScrollListener) null);
            }
            RecyclerView recyclerView = oik.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter((2Rw) null);
                C249403jg r0 = oik.A0A;
                if (r0 != null) {
                    recyclerView.A16(r0);
                }
            }
        } else {
            0wb.A03("SearchController", "Expected onDestroyView to be called only once");
        }
        C231402rc r1 = this.A0A;
        2Rw r02 = this.A09;
        if (!(r02 == null || r1 == null)) {
            r02.unregisterAdapterDataObserver(r1);
        }
        this.mViewHolder = null;
    }

    public final void onFocusChange(View view, boolean z) {
        this.A0G.Dhf(this, z);
    }

    public final void onPause() {
        this.A0J.A0B(this);
        AnonymousClass3E6 r0 = this.A0K;
        r0.EEH(this);
        r0.onStop();
    }

    public final void onResume() {
        this.A0J.A0A(this);
        AnonymousClass3E6 r1 = this.A0K;
        r1.DmJ(this.A0E);
        r1.A9Y(this);
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        this.A0G.Dht(str, this.A05);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C231402rc r1 = this.A0A;
        2Rw r0 = this.A09;
        if (r0 != null && r1 != null) {
            r0.registerAdapterDataObserver(r1);
        }
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-2082710107);
        OIK oik = this.mViewHolder;
        if (oik != null && view == oik.A0D) {
            onBackPressed();
        }
        AnonymousClass0fD.A0C(-1365146296, A052);
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        OIK oik;
        String A012 = 0mp.A01(searchEditText.getSearchString());
        String A0f = AnonymousClass7TF.A0f(searchEditText);
        if (A012 != null) {
            this.A0G.Dhw(A012, A0f);
        }
        OIK oik2 = this.mViewHolder;
        if (this.A07 && oik2 != null) {
            ListView listView = oik2.A00;
            if (listView != null) {
                listView.setSelectionAfterHeaderView();
            } else {
                RecyclerView recyclerView = oik2.A01;
                if (recyclerView != null) {
                    recyclerView.A0p(0);
                }
            }
        }
        if (this.A0H && (oik = this.mViewHolder) != null) {
            oik.A09.setVisibility(DbW.A01(charSequence.length()));
        }
    }

    public SearchController(Activity activity, ViewGroup viewGroup, UserSession userSession, C72208OyY oyY, C249383je r22, C70598OCv oCv, C74502Pvw pvw, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C226472gs r2;
        IgSimpleImageView igSimpleImageView;
        this.A05 = false;
        this.A04 = false;
        Integer num = AnonymousClass05K.A00;
        this.A03 = num;
        this.A02 = num;
        this.A08 = true;
        Activity activity2 = activity;
        this.A0E = activity2;
        2cs A022 = C61340me.A00().A02();
        A022.A06 = true;
        this.A0J = A022;
        this.A0G = pvw;
        this.A0D = new ArgbEvaluator();
        this.A0H = z9;
        this.A0F = oyY;
        ViewGroup viewGroup2 = viewGroup;
        Context context = viewGroup2.getContext();
        this.A0B = context.getColor(2Yu.A0C(context));
        this.A0C = 2Yu.A0F(activity2, R.attr.actionBarBackgroundColor);
        this.A0K = AnonymousClass3E4.A01(this, false, false);
        this.A0I = i2;
        OIK oik = new OIK(r22, (ImeBackButtonHandlerFrameLayout) LayoutInflater.from(context).inflate(R.layout.search_overlay, viewGroup2, false), oCv, z2);
        this.mViewHolder = oik;
        ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout = oik.A0E;
        imeBackButtonHandlerFrameLayout.A00 = this;
        AnonymousClass0fU.A00(this, oik.A0D);
        SearchEditText searchEditText = oik.A0F;
        searchEditText.A0C = this;
        searchEditText.setOnFocusChangeListener(this);
        searchEditText.A0E = this;
        searchEditText.setEllipsize(TextUtils.TruncateAt.END);
        if (z9) {
            C71409Ok8.A01(oik.A09, 38, oik, this);
        }
        if (z3) {
            IgSimpleImageView igSimpleImageView2 = oik.A0B;
            igSimpleImageView2.setScaleX(0.84f);
            igSimpleImageView2.setScaleY(0.84f);
            igSimpleImageView2.setVisibility(0);
            C71406Ok5.A00(igSimpleImageView2, 4, this);
            if (z8) {
                DbU.A11(oik.A04.getContext(), oik.A06, R.drawable.elevated_rounded_meta_ai_searchbar_background);
            }
            if (z6 || z7) {
                igSimpleImageView2.setScaleX(2.0f);
                igSimpleImageView2.setScaleY(2.0f);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(AnonymousClass7TF.A02(context, z8 ? R.dimen.ad4ad_button_bottom_margin : R.dimen.accent_edge_thickness));
                layoutParams.setMarginEnd(AnonymousClass7TG.A05(context));
                igSimpleImageView2.setLayoutParams(layoutParams);
                0Tu r10 = 0Tu.A05;
                UserSession userSession2 = userSession;
                boolean A062 = 182.A06(r10, userSession2, 36330088975057348L);
                long j2 = j;
                if (z6) {
                    r2 = (C226472gs) context.getDrawable(A062 ? R.drawable.gen_ai_assets_meta_ai_fast_wink_fade_twist_fade_twist_thick_kf_28dp : R.drawable.meta_ai_animations_conversion_kf_mai_24dp_flip_28px);
                    igSimpleImageView2.setImageDrawable(r2);
                    if (z7) {
                        C67302Mlc.A00(context.getResources(), C66582MXn.A05(r10, userSession2, 36330088975057348L));
                        C226462gr r1 = (C226462gr) context.getDrawable(C66582MXn.A05(r10, userSession2, 36330088975057348L));
                        r1.setVisible(true, true);
                        r2.A8s(new C67627Mr0(r1, this, j2));
                    }
                } else {
                    r2 = (C226472gs) context.getDrawable(A062 ? R.drawable.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_28dp : R.drawable.meta_ai_animations_conversion_kf_mai_28dp_ambient_spin);
                    OIK oik2 = this.mViewHolder;
                    if (!(oik2 == null || (igSimpleImageView = oik2.A0B) == null)) {
                        igSimpleImageView.setImageDrawable(r2);
                        if (j > 0) {
                            r2.EFJ((int) j2);
                        } else {
                            r2.EFK();
                        }
                    }
                }
                r2.E2p();
            }
        }
        if (z4) {
            OIK oik3 = this.mViewHolder;
            if (!(this.A04 || oik3 == null)) {
                this.A04 = true;
                if (z5) {
                    Activity activity3 = this.A0E;
                    Drawable drawable = activity3.getDrawable(R.drawable.instagram_direct_gen_ai_pano_filled_24);
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(DbU.A01(activity3), PorterDuff.Mode.SRC_IN);
                    IgSimpleImageView igSimpleImageView3 = oik3.A0C;
                    igSimpleImageView3.setColorFilter(porterDuffColorFilter);
                    igSimpleImageView3.setImageDrawable(drawable);
                }
                IgSimpleImageView igSimpleImageView4 = oik3.A0C;
                igSimpleImageView4.setVisibility(0);
                C71406Ok5.A00(igSimpleImageView4, 3, this);
                C72208OyY oyY2 = this.A0F;
                if (oyY2 != null) {
                    oyY2.A05(1);
                }
            }
        }
        viewGroup2.addView(imeBackButtonHandlerFrameLayout);
        int i3 = i;
        if (i3 != -1) {
            0nA.A0e(imeBackButtonHandlerFrameLayout, i3);
        }
        if (z) {
            View view = oik.A03;
            0nA.A0b(view, view.getPaddingEnd() + activity2.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchController(android.app.Activity r27, android.view.ViewGroup r28, X.2Rw r29, X.C252553pI r30, com.instagram.common.session.UserSession r31, X.C72208OyY r32, X.C249383je r33, X.C70598OCv r34, X.C74502Pvw r35, int r36, long r37, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            r26 = this;
            r13 = -1
            r17 = 0
            r2 = 1
            r15 = r37
            r14 = r36
            r12 = r35
            r11 = r34
            r10 = r33
            r9 = r32
            r25 = r45
            r24 = r44
            r8 = r31
            r23 = r43
            r22 = r42
            r21 = r41
            r7 = r28
            r20 = r40
            r6 = r27
            r5 = r26
            r19 = r39
            r18 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = r29
            r5.A09 = r4
            X.OIK r1 = r5.mViewHolder
            r3 = r30
            if (r1 == 0) goto L_0x0047
            androidx.recyclerview.widget.RecyclerView r0 = r1.A01
            if (r0 == 0) goto L_0x0047
            r0.setLayoutManager(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r1.A01
            r1.setAdapter(r4)
            r0 = 0
            r1.setItemAnimator(r0)
            r1.A0S = r2
        L_0x0047:
            r1 = 2
            X.Jlg r0 = new X.Jlg
            r0.<init>(r1, r5, r3)
            r5.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.search.SearchController.<init>(android.app.Activity, android.view.ViewGroup, X.2Rw, X.3pI, com.instagram.common.session.UserSession, X.OyY, X.3je, X.OCv, X.Pvw, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public SearchController(Activity activity, ViewGroup viewGroup, ListAdapter listAdapter, UserSession userSession, C249383je r26, C74502Pvw pvw, int i, int i2, boolean z) {
        this(activity, viewGroup, userSession, (C72208OyY) null, r26, (C70598OCv) null, pvw, i, i2, 0, z, false, false, false, false, false, false, false, false);
        ListView listView;
        OIK oik = this.mViewHolder;
        if (oik != null && (listView = oik.A00) != null) {
            listView.setAdapter(listAdapter);
        }
    }
}
