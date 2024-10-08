package com.instagram.genericsurvey.fragment;

import X.002;
import X.0hq;
import X.0lg;
import X.0qQ;
import X.1NY;
import X.1OC;
import X.1OP;
import X.1Xj;
import X.2dZ;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass3BQ;
import X.AnonymousClass3K2;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13989Tnp;
import X.C13991Tnr;
import X.C14615TzM;
import X.C15621Ufn;
import X.C15686Ugr;
import X.C16084UoB;
import X.C17920ViB;
import X.C17926ViH;
import X.C17989VjR;
import X.C18223Vnn;
import X.C19485WaX;
import X.C19730WeX;
import X.C20978X7r;
import X.C227642jf;
import X.C254523sc;
import X.C271764jY;
import X.C273654mx;
import X.C308206Td;
import X.C309516Yo;
import X.C50901Fkg;
import X.C51875G5m;
import X.C51972G9s;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.Dbc;
import X.JTP;
import X.JTR;
import X.JTU;
import X.VCA;
import X.VVJ;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import android.widget.Toast;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class AdBakeOffFragment extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS, C20978X7r, C51875G5m {
    public int A00;
    public Toast A01;
    public C15686Ugr A02;
    public C16084UoB A03;
    public String A04;
    public VVJ A05;
    public String A06;
    public final String A07 = AnonymousClass7TG.A0j();
    public final List A08 = new ArrayList();
    public final List A09 = new ArrayList();
    public final Set A0A = new HashSet();
    public final AnonymousClass0eM A0B = C227642jf.A02(this);
    public final String A0C = "hot_or_not";
    public C17920ViB answerButtonController;
    public BakeoffFeedPairSectionController bakeoffFeedPairSectionController;
    public C19730WeX bakeoffStoryPairSectionController;
    public ViewGroup contentContainer;
    public SpinnerImageView loadingSpinner;
    public C17989VjR navbarController;
    public ViewGroup retryViewGroup;
    public ViewStub retryViewStub;

    public final void D3A() {
    }

    public final void configureActionBar(2da r7) {
        0qQ.A0B(r7, 0);
        C17989VjR vjR = this.navbarController;
        if (vjR != null) {
            vjR.A01(requireContext(), r7);
        }
        List list = this.A09;
        if (AnonymousClass7TE.A1b(list)) {
            C17989VjR vjR2 = this.navbarController;
            if (vjR2 != null) {
                C16084UoB uoB = this.A03;
                if (uoB != null) {
                    String str = uoB.A03;
                    if (str != null) {
                        TextView textView = vjR2.A01;
                        String str2 = "pageTitle";
                        if (textView != null) {
                            textView.setText(str);
                            TextView textView2 = vjR2.A00;
                            if (textView2 == null) {
                                str2 = "pageIndicator";
                            } else {
                                textView2.setVisibility(0);
                            }
                        }
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            C17989VjR vjR3 = this.navbarController;
            if (vjR3 != null) {
                vjR3.A00(this.A00, 0, list.size());
            }
        }
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AnonymousClass7TE.A1b(this.A09)) {
            A02(this);
        }
    }

    public static final 1Xj A00(AdBakeOffFragment adBakeOffFragment, int i, int i2) {
        String A0n = 002.A0n("Media is null for mPairs[", "][", "]. Media id: %s, Ad id: %s", i, i2);
        1Xj A002 = ((C17926ViH) C13991Tnr.A0Z(adBakeOffFragment.A09, i, i2)).A00();
        if (A002 != null) {
            return A002;
        }
        throw new IllegalStateException(A0n);
    }

    public static final void A01(AdBakeOffFragment adBakeOffFragment) {
        0lg A0X = DbT.A0X(adBakeOffFragment.A0B);
        String str = adBakeOffFragment.A06;
        1NY A0M = DbZ.A0M(A0X);
        A0M.A0A("survey/get/");
        C13989Tnp.A1N(A0M, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "bakeoff");
        A0M.A0G("extra_data_token", str);
        1OC A0S = DbU.A0S(A0M, C16084UoB.class, C18223Vnn.class);
        C15621Ufn.A00(A0S, adBakeOffFragment, 32);
        adBakeOffFragment.schedule(A0S);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.V3B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v70, types: [android.view.View, com.instagram.ui.viewpager.BakeOffViewPager] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.genericsurvey.fragment.AdBakeOffFragment r10) {
        /*
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r10.loadingSpinner
            X.AnonymousClass7TH.A0R(r0)
            android.view.ViewGroup r0 = r10.contentContainer
            r4 = 0
            if (r0 == 0) goto L_0x000d
            r0.setVisibility(r4)
        L_0x000d:
            X.UoB r6 = r10.A03
            java.lang.String r3 = "Required value was null."
            if (r6 == 0) goto L_0x0239
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "bakeoff_feed_item"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0156
            com.instagram.genericsurvey.fragment.BakeoffFeedPairSectionController r8 = r10.bakeoffFeedPairSectionController
            if (r8 == 0) goto L_0x0225
            android.view.ViewGroup r7 = r10.contentContainer
            if (r7 == 0) goto L_0x021f
            android.content.Context r0 = r8.A01
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624216(0x7f0e0118, float:1.8875605E38)
            android.view.View r5 = r1.inflate(r0, r7, r4)
            r0 = 2131433992(0x7f0b1a08, float:1.8489785E38)
            android.view.View r2 = r5.requireViewById(r0)
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r2 = (com.instagram.ui.widget.fixedtabbar.FixedTabBar) r2
            r8.fixedTabBar = r2
            if (r2 == 0) goto L_0x004a
            r2.A06 = r8
            r1 = 1
            X.Wuo r0 = new X.Wuo
            r0.<init>(r1)
            r2.setTabs(r0)
        L_0x004a:
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.ui.viewpager.BakeOffViewPager r0 = (com.instagram.ui.viewpager.BakeOffViewPager) r0
            r8.fragmentPager = r0
            r7.addView(r5)
            r7.invalidate()
            com.instagram.genericsurvey.fragment.BakeoffFeedPairSectionController r2 = r10.bakeoffFeedPairSectionController
            if (r2 == 0) goto L_0x008a
            com.instagram.ui.viewpager.BakeOffViewPager r1 = r2.fragmentPager
            if (r1 == 0) goto L_0x006c
            X.X49 r0 = r2.pagerAdapter
            X.U84 r0 = (X.U84) r0
            X.0ho r0 = r0.A00
            r1.setAdapter(r0)
        L_0x006c:
            com.instagram.ui.viewpager.BakeOffViewPager r1 = r2.fragmentPager
            if (r1 == 0) goto L_0x0078
            X.WEi r0 = new X.WEi
            r0.<init>(r2)
            r1.A0J(r0)
        L_0x0078:
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r1 = r2.fixedTabBar
            if (r1 == 0) goto L_0x0083
            com.instagram.ui.viewpager.BakeOffViewPager r0 = r2.fragmentPager
            if (r0 == 0) goto L_0x0219
            r0.A0J(r1)
        L_0x0083:
            com.instagram.ui.viewpager.BakeOffViewPager r0 = r2.fragmentPager
            if (r0 == 0) goto L_0x0213
            r0.setVisibility(r4)
        L_0x008a:
            com.instagram.genericsurvey.fragment.BakeoffFeedPairSectionController r2 = r10.bakeoffFeedPairSectionController
            if (r2 == 0) goto L_0x00a7
            java.util.List r1 = r10.A09
            int r0 = r10.A00
            java.lang.Object r1 = r1.get(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            X.0qQ.A0B(r1, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.A00 = r0
            X.X49 r0 = r2.pagerAdapter
            r0.notifyDataSetChanged()
        L_0x00a7:
            X.ViB r7 = r10.answerButtonController
            if (r7 == 0) goto L_0x00ec
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.content.Context r0 = r7.A03
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624217(0x7f0e0119, float:1.8875607E38)
            android.view.View r2 = r1.inflate(r0, r5, r4)
            r0 = 2131433990(0x7f0b1a06, float:1.8489781E38)
            android.widget.TextView r0 = X.DbU.A0G(r2, r0)
            r7.A00 = r0
            java.util.List r1 = r7.A07
            r1.clear()
            r0 = 2131432906(0x7f0b15ca, float:1.8487583E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r2, r0)
            r1.add(r0)
            r0 = 2131440830(0x7f0b34be, float:1.8503654E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r2, r0)
            r1.add(r0)
            r0 = 2131441422(0x7f0b370e, float:1.8504855E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r2, r0)
            r1.add(r0)
            r5.addView(r2)
            r5.invalidate()
        L_0x00ec:
            X.ViB r7 = r10.answerButtonController
            if (r7 == 0) goto L_0x0207
            X.VY2 r8 = r6.A00
            if (r8 == 0) goto L_0x0201
            android.widget.TextView r0 = r7.A00
            java.lang.String r2 = "question"
            if (r0 == 0) goto L_0x0152
            android.text.TextPaint r0 = r0.getPaint()
            r9 = 1
            r0.setFakeBoldText(r9)
            android.widget.TextView r1 = r7.A00
            if (r1 == 0) goto L_0x0152
            java.lang.String r0 = r8.A02
            r1.setText(r0)
            java.util.List r0 = r7.A07
            r6 = 0
            java.util.Iterator r5 = r0.iterator()
        L_0x0112:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0207
            java.lang.Object r3 = r5.next()
            int r2 = r6 + 1
            if (r6 >= 0) goto L_0x0128
            X.0sr.A1T()
        L_0x0123:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0128:
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r6 == 0) goto L_0x014f
            if (r6 == r9) goto L_0x014c
            r0 = 2
            if (r6 != r0) goto L_0x0136
            java.lang.String r0 = r8.A03
        L_0x0133:
            r3.setText(r0)
        L_0x0136:
            X.C13988Tno.A16(r3, r9)
            X.OkZ r0 = new X.OkZ
            r0.<init>(r6, r9, r3, r7)
            r3.setOnTouchListener(r0)
            r1 = 4
            X.WB3 r0 = new X.WB3
            r0.<init>(r6, r1, r3, r7)
            X.AnonymousClass0fU.A00(r0, r3)
            r6 = r2
            goto L_0x0112
        L_0x014c:
            java.lang.String r0 = r8.A01
            goto L_0x0133
        L_0x014f:
            java.lang.String r0 = r8.A00
            goto L_0x0133
        L_0x0152:
            X.0qQ.A0F(r2)
            goto L_0x0123
        L_0x0156:
            java.lang.String r0 = "bakeoff_reel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ec
            android.view.ViewGroup r5 = r10.contentContainer
            if (r5 == 0) goto L_0x0233
            X.WeX r7 = r10.bakeoffStoryPairSectionController
            if (r7 == 0) goto L_0x01e7
            android.content.Context r0 = r7.A05
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624218(0x7f0e011a, float:1.887561E38)
            android.view.View r2 = r1.inflate(r0, r5, r4)
            r0 = 2131439553(0x7f0b2fc1, float:1.8501064E38)
            android.view.View r8 = r2.requireViewById(r0)
            r7.A00 = r8
            java.lang.String r0 = "hintView"
            if (r8 == 0) goto L_0x022b
            X.V3B r1 = new X.V3B
            r1.<init>()
            r0 = 2131433976(0x7f0b19f8, float:1.8489753E38)
            android.widget.TextView r0 = X.AnonymousClass7TG.A0R(r8, r0)
            r1.A00 = r0
            r8.setTag(r1)
            r0 = 2131433992(0x7f0b1a08, float:1.8489785E38)
            android.view.View r1 = r2.requireViewById(r0)
            com.instagram.ui.widget.fixedtabbar.FixedTabBar r1 = (com.instagram.ui.widget.fixedtabbar.FixedTabBar) r1
            r7.A04 = r1
            java.lang.String r0 = "fixedTabBar"
            if (r1 == 0) goto L_0x022b
            r1.A06 = r7
            X.Wuo r0 = new X.Wuo
            r0.<init>(r4)
            r1.setTabs(r0)
            r0 = 2131439555(0x7f0b2fc3, float:1.8501068E38)
            android.view.View r0 = r2.requireViewById(r0)
            r7.A01 = r0
            r0 = 2131439557(0x7f0b2fc5, float:1.8501073E38)
            android.view.View r0 = r2.requireViewById(r0)
            r7.A02 = r0
            android.view.View r1 = r7.A01
            java.lang.String r0 = "reelPreviewLeft"
            if (r1 == 0) goto L_0x022b
            X.Fkg r0 = new X.Fkg
            r0.<init>(r1)
            r1.setTag(r0)
            android.view.View r1 = r7.A02
            java.lang.String r0 = "reelPreviewRight"
            if (r1 == 0) goto L_0x022b
            X.Fkg r0 = new X.Fkg
            r0.<init>(r1)
            r1.setTag(r0)
            r0 = 2131439560(0x7f0b2fc8, float:1.8501079E38)
            android.view.View r0 = r2.requireViewById(r0)
            r7.A03 = r0
            r5.addView(r2)
            r5.invalidate()
        L_0x01e7:
            X.WeX r2 = r10.bakeoffStoryPairSectionController
            if (r2 == 0) goto L_0x01f8
            java.util.List r1 = r10.A09
            int r0 = r10.A00
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            r2.A01(r0)
        L_0x01f8:
            X.WeX r0 = r10.bakeoffStoryPairSectionController
            if (r0 == 0) goto L_0x00a7
            r0.A00()
            goto L_0x00a7
        L_0x0201:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0207:
            X.ViB r0 = r10.answerButtonController
            if (r0 == 0) goto L_0x020e
            r0.A00(r4)
        L_0x020e:
            r0 = 1
            A04(r10, r4, r0, r0)
            return
        L_0x0213:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0219:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x021f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0225:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x022b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0233:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0239:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genericsurvey.fragment.AdBakeOffFragment.A02(com.instagram.genericsurvey.fragment.AdBakeOffFragment):void");
    }

    public static final void A03(AdBakeOffFragment adBakeOffFragment) {
        C15686Ugr ugr = adBakeOffFragment.A02;
        if (ugr == null) {
            0qQ.A0F("analyticsHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        ugr.A00 = System.currentTimeMillis();
        ugr.A01 = 0;
        2dZ AYJ = C13989Tnp.A0R(adBakeOffFragment).AYJ();
        if (AYJ != null) {
            AYJ.A0T();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r0v37, types: [android.view.View, com.instagram.ui.viewpager.BakeOffViewPager] */
    public static final void A04(AdBakeOffFragment adBakeOffFragment, int i, boolean z, boolean z2) {
        BakeoffFeedPairSectionController bakeoffFeedPairSectionController2;
        C16084UoB uoB = adBakeOffFragment.A03;
        if (uoB == null || !"bakeoff_feed_item".equals(uoB.A05)) {
            C19730WeX weX = adBakeOffFragment.bakeoffStoryPairSectionController;
            if (weX != null) {
                Set set = adBakeOffFragment.A0A;
                0qQ.A0B(set, 0);
                List list = weX.A06;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (set.contains(((Reel) list.get(i2)).getId())) {
                        FixedTabBar fixedTabBar = weX.A04;
                        if (fixedTabBar == null) {
                            0qQ.A0F("fixedTabBar");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        int i3 = i2;
                        if (fixedTabBar.A09) {
                            i3 = DbT.A02(fixedTabBar.A07, 1) - i2;
                        }
                        ((View) fixedTabBar.A07.get(i3)).setSelected(true);
                    }
                }
            }
        } else {
            if (z2 && (bakeoffFeedPairSectionController2 = adBakeOffFragment.bakeoffFeedPairSectionController) != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(400);
                alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                ? r0 = bakeoffFeedPairSectionController2.fragmentPager;
                if (r0 != 0) {
                    r0.startAnimation(alphaAnimation);
                }
            }
            adBakeOffFragment.A0A.add(String.valueOf(i));
            BakeoffFeedPairSectionController bakeoffFeedPairSectionController3 = adBakeOffFragment.bakeoffFeedPairSectionController;
            if (bakeoffFeedPairSectionController3 != null) {
                bakeoffFeedPairSectionController3.setMode(i);
            }
            if (z && AnonymousClass7TE.A1b(adBakeOffFragment.A09)) {
                1Xj A002 = A00(adBakeOffFragment, adBakeOffFragment.A00, i);
                String str = adBakeOffFragment.A07;
                String A003 = VCA.A00(adBakeOffFragment.A03, adBakeOffFragment.A00);
                String id = A002.getId();
                AnonymousClass0eM r2 = adBakeOffFragment.A0B;
                UserSession A0l = AnonymousClass7TE.A0l(r2);
                AnonymousClass7TF.A1D(str, 0, A0l);
                C254523sc A0O = C13991Tnr.A0O(adBakeOffFragment, "media_impression");
                A0O.A6t = str;
                A0O.A6G = A003;
                A0O.A5u = id;
                C51972G9s.A1A(A0O);
                C13991Tnr.A1F(A0l, A0O);
                String A0t = DbU.A0t(adBakeOffFragment.A08, adBakeOffFragment.A00);
                String str2 = adBakeOffFragment.A04;
                UserSession A0l2 = AnonymousClass7TE.A0l(r2);
                DbW.A1N(A0t, 3, A0l2);
                C254523sc A0O2 = C13991Tnr.A0O(adBakeOffFragment, "bakeoff_action");
                A0O2.A0G(A0l2, A002);
                A0O2.A4J = "switch";
                A0O2.A6I = A0t;
                A0O2.A4I = str2;
                C13991Tnr.A1F(A0l2, A0O2);
            }
        }
        C17920ViB viB = adBakeOffFragment.answerButtonController;
        if (viB != null) {
            viB.A00(AnonymousClass7TF.A1S(adBakeOffFragment.A0A.size(), ((List) adBakeOffFragment.A09.get(adBakeOffFragment.A00)).size()));
        }
    }

    public final void A05(String str) {
        String str2 = this.A07;
        String A002 = VCA.A00(this.A03, this.A00);
        UserSession A0l = AnonymousClass7TE.A0l(this.A0B);
        AnonymousClass7TF.A1D(str2, 0, A0l);
        C254523sc A0O = C13991Tnr.A0O(this, "exit_event");
        A0O.A6t = str2;
        A0O.A6G = A002;
        A0O.A5E = str;
        if (!C271764jY.A00(A0l, A0O, this, AnonymousClass05K.A01)) {
            C13991Tnr.A1F(A0l, A0O);
        }
        if (!str.equals("back_button")) {
            if (getParentFragmentManager().A0M() != 0 || !(requireActivity() instanceof ModalActivity)) {
                DbT.A1I(this);
            } else {
                DbT.A1K(this);
            }
        }
        VVJ vvj = this.A05;
        if (vvj != null) {
            C308206Td.A0E(vvj.A01, vvj.A02, vvj.A00);
        }
    }

    public final void D2M() {
        A05("close_button");
    }

    public final void D2Q() {
        A05("done_button");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.6Ye, java.lang.Object] */
    public final void DcR(C50901Fkg fkg, Reel reel, List list) {
        String str;
        String str2 = this.A07;
        String A002 = VCA.A00(this.A03, this.A00);
        AnonymousClass0eM r3 = this.A0B;
        UserSession A0J = JTU.A0J(r3);
        if (!reel.A15(A0J)) {
            1Xj r0 = reel.A0A(A0J, 0).A0b;
            if (r0 != null) {
                str = r0.getId();
                if (str == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            str = "";
        }
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        AnonymousClass7TF.A1D(str2, 0, A0l);
        C254523sc A0O = C13991Tnr.A0O(this, "media_impression");
        A0O.A6t = str2;
        A0O.A6G = A002;
        A0O.A5u = str;
        C51972G9s.A1A(A0O);
        C13991Tnr.A1F(A0l, A0O);
        this.A0A.add(JTP.A0r(reel));
        1OP r02 = 1OP.$redex_init_class;
        ? obj = new Object();
        obj.A02(AnonymousClass7TE.A0l(r3), reel.getId(), list);
        obj.A03(AnonymousClass3BQ.BAKEOFF);
        obj.A08(str2);
        Bundle A003 = obj.A00();
        ReelViewerFragment reelViewerFragment = new ReelViewerFragment();
        reelViewerFragment.setArguments(A003);
        C309516Yo A0P = DbZ.A0P(this, r3);
        A0P.A0D(reelViewerFragment);
        A0P.A0A = C273654mx.A00(36);
        A0P.A04();
    }

    public final String getModuleName() {
        return this.A0C;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final boolean onBackPressed() {
        A05("back_button");
        AnonymousClass3K2 A0a = C13989Tnp.A0a(this);
        if (A0a == null || !A0a.A0a()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.3on, X.Ugr, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(340336413);
        AdBakeOffFragment.super.onCreate(bundle);
        Context requireContext = requireContext();
        Bundle requireArguments = requireArguments();
        this.A06 = requireArguments.getString(C273654mx.A00(104));
        this.navbarController = new C17989VjR(JTR.A0R(this), this);
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        AnonymousClass0eM r3 = this.A0B;
        this.bakeoffFeedPairSectionController = new BakeoffFeedPairSectionController(requireContext, childFragmentManager, AnonymousClass7TE.A0l(r3), this);
        this.bakeoffStoryPairSectionController = new C19730WeX(requireContext, this, AnonymousClass7TE.A0l(r3), this);
        this.answerButtonController = new C17920ViB(requireContext, this);
        ? obj = new Object();
        this.A02 = obj;
        registerLifecycleListener(obj);
        A01(this);
        int i = requireArguments.getInt("GenericSurveyFragment.ARGUMENTS_BLOKS_GENERIC_SURVEY_DELEGATE_KEY", -1);
        if (i != -1) {
            this.A05 = (VVJ) C14615TzM.A01(VVJ.class, Integer.valueOf(i));
        }
        AnonymousClass0fD.A09(-411579094, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1646194751);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_bakeoff, viewGroup, false);
        this.contentContainer = DbU.A0C(inflate, R.id.content_container);
        this.retryViewStub = DbU.A0D(inflate, R.id.hon_retry);
        this.loadingSpinner = DbX.A0k(inflate);
        AnonymousClass0fD.A09(-165966369, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-747023049);
        super.onDestroy();
        AdBakeOffFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(1619897403, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-862421504);
        super.onDestroyView();
        AnonymousClass0fD.A09(-714016331, A022);
    }

    public final void onResume() {
        AnonymousClass3K2 A042;
        int A022 = AnonymousClass0fD.A02(1915298365);
        super.onResume();
        FragmentActivity requireActivity = requireActivity();
        1OP r0 = 1OP.$redex_init_class;
        AnonymousClass3K2 A043 = AnonymousClass3K2.A04(requireActivity);
        if (!(A043 == null || !A043.A0Z() || (A042 = AnonymousClass3K2.A04(requireActivity())) == null)) {
            A042.A0W((RectF) null, (RectF) null, this, new C19485WaX(this));
        }
        Dbc.A0q(this, 8);
        AnonymousClass0fD.A09(-110589235, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-117066865);
        AdBakeOffFragment.super.onStop();
        Dbc.A0q(this, 0);
        AnonymousClass0fD.A09(-1732084279, A022);
    }
}
