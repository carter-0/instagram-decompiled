package com.instagram.wellbeing.limitedprofile.fragment;

import X.0MB;
import X.1E7;
import X.1OC;
import X.1Xj;
import X.2dZ;
import X.2da;
import X.2el;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass1GX;
import X.AnonymousClass1pc;
import X.AnonymousClass36D;
import X.AnonymousClass3DZ;
import X.AnonymousClass3JR;
import X.AnonymousClass3Jb;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass4DV;
import X.AnonymousClass57Z;
import X.C13990Tnq;
import X.C14293TtR;
import X.C15490Udf;
import X.C15622Ufo;
import X.C18480VsW;
import X.C18756Vzr;
import X.C19738Wef;
import X.C19846WgR;
import X.C20989X8f;
import X.C228172ku;
import X.C234072ww;
import X.C238103Ao;
import X.C238133Ar;
import X.C247733gp;
import X.C249763kK;
import X.C334167am;
import X.C3724090s;
import X.C47914EMi;
import X.C51568FwI;
import X.C51969G9p;
import X.C55802Hni;
import X.C56029Hrb;
import X.C57962IjH;
import X.C59608JQc;
import X.C59689JTv;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.HMF;
import X.MBB;
import X.VQ0;
import X.VQ1;
import X.WB0;
import X.WWR;
import X.WYK;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LimitedCommentsFragment extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DV, C59608JQc, C20989X8f, AnonymousClass4DS {
    public UserSession A00;
    public 1Xj A01;
    public AnonymousClass1GX A02;
    public C15490Udf A03;
    public C334167am A04;
    public C18756Vzr A05;
    public WYK A06;
    public boolean A07;
    public C234072ww A08;
    public 2el A09;
    public C19846WgR A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final C228172ku A0F = new C228172ku();
    public final VQ0 A0G = new VQ0(this);
    public final VQ1 A0H = new VQ1(this);
    public View mRootView;
    public C238133Ar mScrollingViewProxy;

    public final void Cvp(C247733gp r2) {
        this.A0A.Cvp(r2);
    }

    public final void D4l(C247733gp r3) {
        this.A0A.D4l(r3);
        FragmentActivity activity = getActivity();
        2dZ A0K = DbT.A0K(activity);
        if (activity instanceof BaseFragmentActivity) {
            A0K.A0T();
        }
    }

    public final void D8C(C247733gp r2) {
        this.A0A.D8C(r2);
    }

    public final void DdQ() {
        this.A03.A01(this.A01);
    }

    public final void DdS() {
        this.A03.A01(this.A01);
    }

    public final void DdT(HMF hmf, String str, List list, List list2, Set set) {
        Context context;
        if (hmf == HMF.COMMENT_DELETE_UPSELL_TYPE_BLOCK && (context = getContext()) != null) {
            AnonymousClass1pc.A00().CnP(context, this, this.A00, list, (Set) set.stream().map(new C51568FwI(3)).filter(new MBB(2)).collect(Collectors.toSet()), 0);
        }
        if (isAdded()) {
            this.A06.A00 = null;
            this.A03.A06.A03.clear();
            this.A03.A01(this.A01);
        }
    }

    public final void Dw7(User user, String str) {
        this.A0A.Dw7(user, str);
    }

    public final void configureActionBar(2da r21) {
        String A0d;
        if (isAdded()) {
            int size = C13990Tnq.A0L(this.A03.A06.A00).size();
            if (size == 0) {
                boolean z = this.A07;
                Context requireContext = requireContext();
                int i = 2131964973;
                if (z) {
                    i = 2131964986;
                }
                A0d = requireContext.getString(i);
            } else {
                A0d = DbY.A0d(DbV.A05(this), size, R.plurals.x_selected);
            }
            2da r2 = r21;
            DbW.A1C(r2, A0d);
            int size2 = C13990Tnq.A0L(this.A03.A06.A00).size();
            if (size2 > 0) {
                Context context = getContext();
                context.getClass();
                int color = context.getColor(R.color.design_dark_default_color_on_background);
                if (size2 <= 25) {
                    AnonymousClass3JR r3 = new AnonymousClass3JR();
                    r3.A06 = R.drawable.instagram_circle_x_pano_outline_24;
                    r3.A05 = 2131964972;
                    DbX.A19(new WB0(this, 44), r3, r2);
                    C57962IjH ijH = this.A06.A00;
                    if (ijH == null || ijH.A00) {
                        AnonymousClass3JR r32 = new AnonymousClass3JR();
                        r32.A02(AnonymousClass05K.A0u);
                        r32.A0G = new WB0(this, 45);
                        r32.A02 = color;
                        r2.AA3(new AnonymousClass3Jb(r32));
                    }
                    AnonymousClass3JR r33 = new AnonymousClass3JR();
                    r33.A06 = R.drawable.instagram_circle_check_pano_outline_24;
                    int i2 = 2131964971;
                    if (this.A07) {
                        i2 = 2131964985;
                    }
                    r33.A05 = i2;
                    r33.A0G = new WB0(this, 46);
                    r33.A02 = color;
                    r2.AA3(new AnonymousClass3Jb(r33));
                    WB0 wb0 = new WB0(this, 47);
                    Integer num = AnonymousClass05K.A0C;
                    ColorDrawable colorDrawable = new ColorDrawable(DbU.A01(getContext()));
                    int color2 = getContext().getColor(R.color.blue_6);
                    float[] fArr = new float[3];
                    Color.colorToHSV(DbU.A01(getContext()), fArr);
                    fArr[2] = fArr[2] * 0.9f;
                    r2.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, colorDrawable, (Drawable) null, wb0, num, color, Color.HSVToColor(fArr), color2, -2, R.drawable.instagram_x_pano_outline_24, -2, -2, false));
                }
            }
        }
    }

    public final String getModuleName() {
        if (this.A07) {
            return "igbc_limited_comments_view";
        }
        return "limited_comments_view";
    }

    public final C238133Ar getScrollingViewProxy() {
        View view = this.mView;
        if (view != null) {
            C238133Ar r0 = this.mScrollingViewProxy;
            if (r0 != null) {
                return r0;
            }
            C238133Ar A002 = C238103Ao.A00(DbU.A0C(view, 16908298));
            this.mScrollingViewProxy = A002;
            return A002;
        }
        throw new IllegalStateException("Cannot call getScrollingViewProxy before view is initialized");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final boolean isOrganicEligible() {
        return this.A0D;
    }

    public final boolean isSponsoredEligible() {
        return this.A0E;
    }

    public final void DdR() {
        if (isAdded()) {
            C59689JTv.A03(getContext(), "Failed deleting message", "Failed deleting", 0);
            this.A06.A00 = null;
            C18480VsW vsW = this.A03.A06;
            Set set = vsW.A03;
            vsW.A00.addAll(C13990Tnq.A0L(set));
            set.clear();
            this.A03.A01(this.A01);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-952328769);
        LimitedCommentsFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0B = DbU.A0l(requireArguments, "LimitedCommentsFragment.MEDIA_ID");
        this.A0C = requireArguments.getString("LimitedComments.SESSION_ID");
        this.A0E = requireArguments.getBoolean("LimitedCommentsFragment.IS_SPONSORED");
        this.A0D = requireArguments.getBoolean("LimitedCommentsFragment.IS_ORGANIC");
        this.A07 = requireArguments.getBoolean("LimitedCommentsFragment.IS_LIMITED_REPLY");
        UserSession A0U = DbX.A0U(this);
        this.A00 = A0U;
        this.A01 = 1E7.A00(A0U).A02(this.A0B);
        1OC A042 = C3724090s.A04(this.A00, DbU.A0l(requireArguments(), "LimitedCommentsFragment.MEDIA_ID"));
        C15622Ufo.A00(A042, this, 17);
        schedule(A042);
        this.A04 = new C334167am(this.A00, this.A01);
        C19738Wef wef = new C19738Wef(this);
        this.A08 = new C234072ww(this.A00, this, (C249763kK) null);
        this.A09 = C51969G9p.A0k();
        Context requireContext = requireContext();
        0MB A052 = 0MB.A05(this.A00);
        VQ1 vq1 = this.A0H;
        Context requireContext2 = requireContext();
        UserSession userSession = this.A00;
        this.A03 = new C15490Udf(requireContext, new C55802Hni(requireContext2, this.A08, AnonymousClass0kN.A01(this, userSession), userSession, this.A09, this), this, A052, wef, this, vq1);
        this.A06 = new WYK(requireContext(), this, this, this.A00, this.A01, this.A03, this.A0C, this.A07);
        this.A05 = new C18756Vzr(requireContext(), this, this.A00, this.A01, this.A03, this, this.A0C, this.A07);
        UserSession userSession2 = this.A00;
        this.A0A = new C19846WgR(requireContext(), this, this, userSession2, this.A03, this.A05, this.A06);
        UserSession userSession3 = this.A00;
        UserSession userSession4 = userSession3;
        C19738Wef wef2 = wef;
        this.A02 = C14293TtR.A00(userSession4, wef2, this.A03, (Boolean) null, AnonymousClass05K.A01, 3, true);
        registerLifecycleListener(new AnonymousClass36D(this.A00, new WWR(this, 10)));
        AnonymousClass0fD.A09(-65444505, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2778579);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.limited_comment_thread);
        AnonymousClass0fD.A09(-1455406982, A022);
        return A0C2;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.layout_comment_thread_parent);
        this.mRootView = requireViewById;
        DbT.A0I(requireViewById, 16908298).setLayoutManager(new LinearLayoutManagerCompat(requireContext()));
        getScrollingViewProxy().ENw(this.A03);
        getScrollingViewProxy().AAD(new C47914EMi(this, 2));
        this.A09.A06(getScrollingViewProxy().CEd(), AnonymousClass3DZ.A00(this));
        C56029Hrb hrb = new C56029Hrb(this, this.A00, this.A0C);
        if (this.A07) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A00;
        }
        hrb.A00(num);
    }
}
