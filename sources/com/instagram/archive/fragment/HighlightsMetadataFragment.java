package com.instagram.archive.fragment;

import X.0gy;
import X.0hq;
import X.0nA;
import X.0qQ;
import X.182;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass3E4;
import X.AnonymousClass3E6;
import X.AnonymousClass3JR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C252213ok;
import X.C273374mT;
import X.C60005JdE;
import X.C63052Kqh;
import X.C63590Kzd;
import X.C63830L8l;
import X.C64184LSr;
import X.DbS;
import X.DbV;
import X.DbX;
import X.JTP;
import X.KB0;
import X.Ki3;
import X.LYC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.Serializable;

public final class HighlightsMetadataFragment extends C273374mT implements AnonymousClass4DS, C252213ok {
    public KB0 A00;
    public C64184LSr A01;
    public C60005JdE A02;
    public AnonymousClass3E6 A03;
    public IgSimpleImageView cardCoverView;
    public IgTextView editCoverImageButton;
    public IgImageView pogCoverImageView;
    public View rootView;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.setTitle(DbV.A05(this).getString(2131967984));
        r4.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = DbV.A05(this).getString(2131960992);
        DbX.A19(new LYC((Object) this, 30), A0K, r4);
    }

    public final String getModuleName() {
        return "reel_highlights_cover_title";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0088, code lost:
        if (r0 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        X.AnonymousClass0fU.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e0, code lost:
        if (r0 != null) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r10 = 0
            r1 = r20
            X.0qQ.A0B(r1, r10)
            r2 = r19
            r0 = r21
            super.onViewCreated(r1, r0)
            X.3E6 r0 = r2.A03
            if (r0 == 0) goto L_0x0014
            r0.A9Y(r2)
        L_0x0014:
            r2.rootView = r1
            r0 = 2131433936(0x7f0b19d0, float:1.8489672E38)
            com.instagram.common.ui.base.IgSimpleImageView r0 = X.DbX.A0Y(r1, r0)
            X.0qQ.A0B(r0, r10)
            r2.cardCoverView = r0
            r0 = 2131433945(0x7f0b19d9, float:1.848969E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbX.A0b(r1, r0)
            X.0qQ.A0B(r0, r10)
            r2.pogCoverImageView = r0
            r0 = 2131432188(0x7f0b12fc, float:1.8486126E38)
            com.instagram.common.ui.base.IgTextView r3 = X.DbX.A0Z(r1, r0)
            X.0qQ.A0B(r3, r10)
            r2.editCoverImageButton = r3
            r0 = 31
            X.LYC r1 = new X.LYC
            r1.<init>((java.lang.Object) r2, (int) r0)
            X.AnonymousClass0fU.A00(r1, r3)
            com.instagram.common.ui.base.IgTextView r4 = r2.editCoverImageButton
            if (r4 == 0) goto L_0x00e6
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r4)
            int r0 = X.1QE.A01(r3)
            X.DbT.A17(r3, r4, r0)
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r2.getSession()
            com.instagram.user.model.User r0 = r3.A01(r0)
            boolean r0 = r0.A2S()
            r6 = 8
            if (r0 != 0) goto L_0x008e
            com.instagram.common.session.UserSession r5 = r2.getSession()
            X.0Tu r0 = X.DbS.A0J(r5, r10)
            r3 = 36329019528134373(0x81110d00033ee5, double:3.037956462587593E-306)
            boolean r0 = X.182.A06(r0, r5, r3)
            if (r0 != 0) goto L_0x008e
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.pogCoverImageView
            if (r0 == 0) goto L_0x00e3
            r0.setVisibility(r10)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.cardCoverView
            if (r0 == 0) goto L_0x00e9
            r0.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.pogCoverImageView
            if (r0 == 0) goto L_0x00e3
        L_0x008a:
            X.AnonymousClass0fU.A00(r1, r0)
            return
        L_0x008e:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.pogCoverImageView
            if (r0 == 0) goto L_0x00e3
            r0.setVisibility(r6)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.cardCoverView
            if (r0 == 0) goto L_0x00e9
            r0.setVisibility(r10)
            android.content.Context r4 = r2.requireContext()
            r0 = 6
            X.0nA.A04(r4, r0)
            android.content.Context r3 = r2.requireContext()
            r0 = 1102577664(0x41b80000, float:23.0)
            float r7 = X.0nA.A00(r3, r0)
            android.content.Context r3 = r2.requireContext()
            android.content.Context r0 = r2.requireContext()
            int r0 = X.2Yu.A04(r0)
            int r12 = r3.getColor(r0)
            r5 = 0
            r9 = 1058642330(0x3f19999a, float:0.6)
            r16 = 1
            r13 = 300(0x12c, double:1.48E-321)
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            X.JdE r3 = new X.JdE
            r6 = r5
            r11 = r10
            r15 = r10
            r17 = r10
            r18 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            r2.A02 = r3
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.cardCoverView
            if (r0 == 0) goto L_0x00e9
            r0.setImageDrawable(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.cardCoverView
            if (r0 == 0) goto L_0x00e9
            goto L_0x008a
        L_0x00e3:
            java.lang.String r0 = "pogCoverImageView"
            goto L_0x00eb
        L_0x00e6:
            java.lang.String r0 = "editCoverImageButton"
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r0 = "cardCoverView"
        L_0x00eb:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.HighlightsMetadataFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void DMr(int i, boolean z) {
        if (z) {
            View view = this.rootView;
            if (view != null) {
                0nA.A0X(view, i);
                return;
            }
        } else {
            View view2 = this.rootView;
            if (view2 != null) {
                0nA.A0X(view2, 0);
                return;
            }
        }
        0qQ.A0F("rootView");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4mT, java.lang.Object, com.instagram.archive.fragment.HighlightsMetadataFragment, X.4DH] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(225840519);
        HighlightsMetadataFragment.super.onCreate(bundle);
        C64184LSr A002 = C64184LSr.A00(getSession());
        0qQ.A07(A002);
        this.A01 = A002;
        UserSession session = getSession();
        FragmentActivity requireActivity = requireActivity();
        0hq r4 = this.mFragmentManager;
        0gy A003 = AnonymousClass07i.A00(this);
        C64184LSr lSr = this.A01;
        if (lSr == null) {
            str = "sessionController";
        } else {
            Serializable serializable = requireArguments().getSerializable("highlight_management_source");
            if (serializable != null) {
                this.A00 = new KB0(requireActivity, r4, A003, lSr, new C63590Kzd(this), (Ki3) serializable, session);
                UserSession session2 = getSession();
                if (182.A06(DbS.A0J(session2, 0), session2, 36330999507862383L)) {
                    this.A03 = AnonymousClass3E4.A01(this, false, true);
                }
                KB0 kb0 = this.A00;
                if (kb0 == null) {
                    str = "controller";
                } else {
                    registerLifecycleListener(kb0);
                    AnonymousClass0fD.A09(1006187721, A022);
                    return;
                }
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(-2051257162, A022);
                throw A0y;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-674533194);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_highlights_metadata_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1354970823, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-35457122);
        super.onDestroy();
        AnonymousClass3E6 r0 = this.A03;
        if (r0 != null) {
            r0.onDestroy();
        }
        AnonymousClass0fD.A09(2091662622, A022);
    }

    public final void onResume() {
        ImageUrl A0V;
        int i;
        String str;
        int A022 = AnonymousClass0fD.A02(16514081);
        super.onResume();
        AnonymousClass3E6 r0 = this.A03;
        if (r0 != null) {
            JTP.A17(this, r0);
        }
        C64184LSr lSr = this.A01;
        String str2 = "sessionController";
        if (lSr != null) {
            if (AnonymousClass7TE.A1D(lSr.A07.values()).isEmpty()) {
                i = -1999090712;
            } else {
                C64184LSr lSr2 = this.A01;
                if (lSr2 != null) {
                    C63830L8l l8l = lSr2.A00;
                    if (l8l == null || ((str = l8l.A03) != null && !lSr2.A05.containsKey(str))) {
                        C64184LSr lSr3 = this.A01;
                        if (lSr3 != null) {
                            lSr3.A05(requireActivity());
                        }
                    }
                    FragmentActivity requireActivity = requireActivity();
                    UserSession session = getSession();
                    IgImageView igImageView = this.pogCoverImageView;
                    if (igImageView != null) {
                        IgSimpleImageView igSimpleImageView = this.cardCoverView;
                        if (igSimpleImageView != null) {
                            C60005JdE jdE = this.A02;
                            C64184LSr lSr4 = this.A01;
                            if (lSr4 != null) {
                                C63830L8l l8l2 = lSr4.A00;
                                if (l8l2 != null) {
                                    A0V = l8l2.A02;
                                } else {
                                    A0V = DbS.A0V("");
                                }
                                C63052Kqh.A00(requireActivity, igSimpleImageView, this, session, A0V, jdE, igImageView);
                                i = 1982358324;
                            }
                        } else {
                            str2 = "cardCoverView";
                        }
                    } else {
                        str2 = "pogCoverImageView";
                    }
                }
            }
            AnonymousClass0fD.A09(i, A022);
            return;
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1897230335);
        HighlightsMetadataFragment.super.onStart();
        AnonymousClass3E6 r0 = this.A03;
        if (r0 != null) {
            JTP.A17(this, r0);
        }
        AnonymousClass0fD.A09(511076820, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1590871123);
        HighlightsMetadataFragment.super.onStop();
        AnonymousClass3E6 r0 = this.A03;
        if (r0 != null) {
            r0.onStop();
        }
        AnonymousClass0fD.A09(-1800755019, A022);
    }
}
