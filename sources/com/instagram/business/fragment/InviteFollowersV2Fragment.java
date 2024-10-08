package com.instagram.business.fragment;

import X.002;
import X.0oI;
import X.0qQ;
import X.1NY;
import X.1wn;
import X.1xC;
import X.2dZ;
import X.2da;
import X.AnonymousClass0KZ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4D6;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22030Xtl;
import X.C267044ar;
import X.C46383De2;
import X.C47332Duz;
import X.C47518E6c;
import X.C47697EDg;
import X.C59904JbT;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.Dbb;
import X.EW9;
import X.F53;
import X.FG1;
import X.FPB;
import X.FXZ;
import X.G8D;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class InviteFollowersV2Fragment extends C47518E6c implements AnonymousClass4DR, AnonymousClass4DS {
    public 2dZ A00;
    public ActionButton A01;
    public BusinessFlowAnalyticsLogger A02;
    public C46383De2 A03;
    public UserSession A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public G8D A09;
    public String A0A;
    public String A0B;
    public final 1wn A0C = FXZ.A00(this, 6);
    public View mLoadingIndicator;

    public final String getModuleName() {
        return "invite_followers_v2_fragment";
    }

    public static void A06(InviteFollowersV2Fragment inviteFollowersV2Fragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = inviteFollowersV2Fragment.A02;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckp(new C22030Xtl("invite_followers", inviteFollowersV2Fragment.A05, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r3) {
        ? obj = new Object();
        obj.A02 = "";
        ActionButton A002 = C59904JbT.A00(FPB.A00(this, 46), r3, obj);
        this.A01 = A002;
        A002.setEnabled(this.A06);
        Dbb.A0s(FPB.A00(this, 47), DbX.A0M(), r3);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A08 || (businessFlowAnalyticsLogger = this.A02) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("invite_followers", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        C46383De2 de2 = this.A03;
        Context context = getContext();
        C47697EDg A002 = C47697EDg.A00(this, 17);
        0qQ.A0B(context, 0);
        AnonymousClass4D6 r5 = de2.A01;
        UserSession userSession = de2.A00;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("business/account/get_invite_friends_subitems/");
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (EW9 ew9 : EW9.values()) {
            switch (ew9.ordinal()) {
                case 0:
                    z = C267044ar.A00(context, userSession);
                    break;
                case 1:
                case 8:
                    z = DbU.A1Z(userSession);
                    break;
                case 7:
                    String str = 0oI.A02;
                    try {
                        context.getPackageManager().getPackageInfo("com.whatsapp", 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                        break;
                    }
                case 2:
                case 4:
                case 5:
                case 6:
                    A1C.add(ew9);
                    continue;
            }
            if (!z) {
            }
            A1C.add(ew9);
            continue;
        }
        Iterator it = A1C.iterator();
        String str2 = "";
        while (it.hasNext()) {
            EW9 ew92 = (EW9) it.next();
            if (str2.length() > 0) {
                str2 = 002.A0C(str2, ',');
            }
            str2 = 002.A0R(str2, ew92.A00);
        }
        A0b.A9m("client_eligible_sub_items", str2);
        A0b.A9m("logged_in_user_ids", C46383De2.A00(de2));
        A0b.A0Q(C47332Duz.class, F53.class);
        DbW.A1E(A0b, A002, r5);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A09 = FG1.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1770995647);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = DbX.A0U(this);
        this.A05 = DbS.A0l(requireArguments);
        this.A0B = requireArguments.getString("ARG_TITLE", requireContext().getString(2131964491));
        this.A0A = requireArguments.getString("ARG_SUB_TITLE", requireContext().getString(2131964490));
        this.A03 = new C46383De2(this.A04, this);
        this.A07 = DbT.A1X(requireArguments, "ARG_CHECKLIST_ITEM_COMPLETED");
        BusinessFlowAnalyticsLogger A002 = FG1.A00(this.A09, this, this.A04);
        this.A02 = A002;
        if (A002 != null) {
            A002.Cka(new C22030Xtl("invite_followers", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        AnonymousClass0fD.A09(544863326, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1191420795);
        View inflate = layoutInflater.inflate(R.layout.invite_followers_v2_fragment, viewGroup, false);
        IgdsHeadline A0U = DbZ.A0U(inflate, R.id.onboarding_checklist_headline);
        A0U.setHeadline((CharSequence) this.A0B);
        A0U.setBody((CharSequence) this.A0A);
        A0U.setVisibility(0);
        this.mLoadingIndicator = inflate.requireViewById(R.id.loading_spinner);
        this.A00 = Dba.A0A(this);
        1xC.A01.A02(this.A0C, AnonymousClass0KZ.class);
        AnonymousClass0fD.A09(-1182420845, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(409086049);
        super.onDestroyView();
        1xC.A01.A03(this.A0C, AnonymousClass0KZ.class);
        AnonymousClass0fD.A09(148489313, A022);
    }
}
