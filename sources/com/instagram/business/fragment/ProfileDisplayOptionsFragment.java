package com.instagram.business.fragment;

import X.0Tu;
import X.0qQ;
import X.0wb;
import X.1aC;
import X.2Ek;
import X.2Ru;
import X.2da;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass703;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22030Xtl;
import X.C227812jx;
import X.C238133Ar;
import X.C319586qr;
import X.C319596qs;
import X.C322526vy;
import X.C358248ab;
import X.C47697EDg;
import X.C48756Ejf;
import X.C50023FJi;
import X.C50025FJk;
import X.C50674FgZ;
import X.C59904JbT;
import X.C59922Jbl;
import X.C65371LsC;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.Dbc;
import X.E9G;
import X.FEa;
import X.FPB;
import X.FPH;
import X.FU0;
import X.W11;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.business.BusinessInfo;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class ProfileDisplayOptionsFragment extends C227812jx implements AnonymousClass4DR, AnonymousClass4DS {
    public View A00;
    public View A01;
    public BusinessFlowAnalyticsLogger A02;
    public UserSession A03;
    public BusinessInfo A04;
    public BusinessInfo A05;
    public User A06;
    public String A07;
    public boolean A08;
    public IgdsSwitch categoryToggle;
    public IgdsSwitch contactsToggle;
    public IgdsSwitch discountToggle;
    public View rootView;
    public ActionButton saveButton;

    private final void A00(View view, IgdsSwitch igdsSwitch, Integer num) {
        igdsSwitch.A07 = new C65371LsC(1, num, this, igdsSwitch);
        FPH.A00(view, num, this, igdsSwitch, 14);
    }

    private final boolean A04(User user) {
        if (user == null) {
            return false;
        }
        boolean A1S = AnonymousClass7TF.A1S(user.A2M() ? 1 : 0, 1);
        Context requireContext = requireContext();
        UserSession userSession = this.A03;
        if (userSession != null) {
            return AnonymousClass703.A00(requireContext, userSession, user, true, false) - (A1S ? 1 : 0) > 0;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.6vx] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A03;
        if (userSession != null) {
            if (!DbY.A1Y(0Tu.A05, userSession, 36330664500413145L)) {
                requireContext();
                UserSession userSession2 = this.A03;
                if (userSession2 != null) {
                    User user = this.A06;
                    0qQ.A0A(user);
                    boolean A012 = 2Ek.A01(this.A06);
                    boolean booleanValue = getUseRecyclerViewFromQE().booleanValue();
                    2Ru r4 = new 2Ru(false);
                    FU0 fu0 = new FU0(this, this, userSession2, new C50674FgZ(r4), A012);
                    r4.A00 = fu0;
                    ? obj = new Object();
                    r4.A01 = obj;
                    obj.A0E = user;
                    obj.A0K = false;
                    obj.A00 = 0;
                    obj.A08 = null;
                    obj.A0D = null;
                    obj.A0C = null;
                    obj.A04 = null;
                    obj.A01 = null;
                    obj.A0B = null;
                    obj.A0J = false;
                    obj.A0H = null;
                    obj.A0G = null;
                    obj.A0F = null;
                    obj.A07 = null;
                    obj.A06 = null;
                    obj.A09 = null;
                    obj.A02 = null;
                    obj.A0M = false;
                    obj.A0I = false;
                    obj.A0L = false;
                    obj.A03 = null;
                    r4.A02 = new C322526vy();
                    DbU.A1Q(r4, fu0);
                    r4.addModel(r4.A01, r4.A02, r4.A00);
                    r4.A03 = booleanValue;
                    setAdapter(r4);
                }
            }
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            0qQ.A0A(scrollingViewProxy);
            if (scrollingViewProxy.CWN()) {
                ViewGroup CEd = scrollingViewProxy.CEd();
                0qQ.A0C(CEd, AnonymousClass000.A00(176));
                W11.A00((ListView) CEd);
            }
            View view2 = this.A01;
            if (!(view2 == null || this.A00 == null)) {
                view2.setVisibility(0);
                View view3 = this.A00;
                0qQ.A0A(view3);
                view3.setVisibility(8);
            }
            UserSession userSession3 = this.A03;
            if (userSession3 != null) {
                C48756Ejf.A00(C47697EDg.A00(this, 22), userSession3, this, false);
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2.A04(r2.A06) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.business.fragment.ProfileDisplayOptionsFragment r2) {
        /*
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0016
            com.instagram.model.business.BusinessInfo r0 = r2.A04
            X.0qQ.A0A(r0)
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x0016
            com.instagram.user.model.User r0 = r2.A06
            boolean r0 = r2.A04(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            com.instagram.model.business.BusinessInfo r0 = r2.A04
            com.instagram.model.business.BusinessInfo r0 = X.FEa.A00(r0, r1)
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.ProfileDisplayOptionsFragment.A01(com.instagram.business.fragment.ProfileDisplayOptionsFragment):void");
    }

    public static final void A02(ProfileDisplayOptionsFragment profileDisplayOptionsFragment, IgdsSwitch igdsSwitch, Integer num, boolean z) {
        User user;
        boolean z2;
        String str;
        String str2;
        FEa fEa = new FEa(profileDisplayOptionsFragment.A04);
        User user2 = profileDisplayOptionsFragment.A06;
        try {
            Parcelable.Creator creator = User.CREATOR;
            if (user2 != null) {
                user = 1aC.A04(1aC.A07(user2));
                profileDisplayOptionsFragment.A06 = user;
                if (user != null && profileDisplayOptionsFragment.A05 != null) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        fEa.A0Q = z;
                        0qQ.A0A(user);
                        user.A03.Ekg(Boolean.valueOf(z));
                        BusinessInfo businessInfo = profileDisplayOptionsFragment.A05;
                        0qQ.A0A(businessInfo);
                        z2 = businessInfo.A0Q;
                        str = "switch_display_category";
                    } else if (intValue != 1) {
                        fEa.A0R = z;
                        0qQ.A0A(user);
                        user.A03.EhI(Boolean.valueOf(z));
                        BusinessInfo businessInfo2 = profileDisplayOptionsFragment.A05;
                        0qQ.A0A(businessInfo2);
                        z2 = businessInfo2.A0R;
                        str = "switch_display_discount";
                    } else {
                        if (!profileDisplayOptionsFragment.A04(user)) {
                            C358248ab A0U = DbW.A0U(profileDisplayOptionsFragment);
                            A0U.A09(2131968387);
                            A0U.A08(2131952288);
                            C50023FJi.A02(A0U, profileDisplayOptionsFragment, 18, 2131952287);
                            DbX.A16(C50025FJk.A00(igdsSwitch, profileDisplayOptionsFragment, 7), A0U);
                            z2 = false;
                        } else {
                            User user3 = profileDisplayOptionsFragment.A06;
                            0qQ.A0A(user3);
                            user3.A03.Eko(Boolean.valueOf(z));
                            BusinessInfo businessInfo3 = profileDisplayOptionsFragment.A05;
                            0qQ.A0A(businessInfo3);
                            z2 = businessInfo3.A0S;
                        }
                        fEa.A0S = z;
                        str = "switch_display_contact";
                    }
                    profileDisplayOptionsFragment.A04 = new BusinessInfo(fEa);
                    E9G e9g = (E9G) profileDisplayOptionsFragment.getAdapter();
                    if (e9g != null) {
                        e9g.A00(profileDisplayOptionsFragment.A06);
                    }
                    C238133Ar scrollingViewProxy = profileDisplayOptionsFragment.getScrollingViewProxy();
                    0qQ.A0A(scrollingViewProxy);
                    if (scrollingViewProxy.CWN()) {
                        ViewGroup CEd = scrollingViewProxy.CEd();
                        0qQ.A0C(CEd, AnonymousClass000.A00(176));
                        W11.A00((ListView) CEd);
                    }
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("is_profile_info_shown", String.valueOf(z2));
                    HashMap A1E2 = AnonymousClass7TE.A1E();
                    A1E2.put("is_profile_info_shown", String.valueOf(z));
                    BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = profileDisplayOptionsFragment.A02;
                    if (businessFlowAnalyticsLogger == null) {
                        str2 = "logger";
                    } else {
                        String str3 = profileDisplayOptionsFragment.A07;
                        if (str3 == null) {
                            str2 = "entryPoint";
                        } else {
                            businessFlowAnalyticsLogger.ChY(new C22030Xtl("profile_display_options", str3, str, (String) null, (String) null, A1E, A1E2, (Map) null));
                            return;
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        } catch (IOException unused) {
            0wb.A03("profile_display_options", "Exception on serialize and deserialize User");
            user = null;
        }
    }

    public static final boolean A03(ProfileDisplayOptionsFragment profileDisplayOptionsFragment) {
        UserSession userSession = profileDisplayOptionsFragment.A03;
        if (userSession != null) {
            return DbY.A1Y(0Tu.A05, userSession, 36315705129307632L);
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "profile_display_options";
    }

    public final AnonymousClass0wW getSession() {
        return null;
    }

    public final Boolean getUseRecyclerViewFromQE() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return AnonymousClass7TF.A0R(0Tu.A05, userSession, 36314021502126451L);
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        String str;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A02;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            String str2 = this.A07;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                businessFlowAnalyticsLogger.ChP(new C22030Xtl("profile_display_options", str2, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
                return false;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        C59922Jbl.A02(DbV.A05(this), A002, 2131961474);
        this.saveButton = C59904JbT.A00(FPB.A00(this, 62), r4, A002);
        FPB.A02(DbV.A0K(), r4, this, 63);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1678781454);
        this.A03 = DbX.A0U(this);
        super.onCreate(bundle);
        String A0o = DbX.A0o(this);
        0qQ.A0A(A0o);
        this.A07 = A0o;
        C319586qr r2 = C319586qr.EDIT_PROFILE;
        UserSession userSession = this.A03;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        BusinessFlowAnalyticsLogger A002 = C319596qs.A00(r2, this, userSession, (String) null);
        if (A002 != null) {
            this.A02 = A002;
            Dbc.A0p(this);
            AnonymousClass0fD.A09(-1157918645, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1339703207, A022);
        throw A0y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r4, 36321722378495647L) != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = -707383834(0xffffffffd5d62de6, float:-2.94365776E13)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r6 = 0
            X.0qQ.A0B(r13, r6)
            r0 = 2131628322(0x7f0e1122, float:1.8883933E38)
            android.view.View r1 = r13.inflate(r0, r14, r6)
            r12.rootView = r1
            X.0qQ.A0A(r1)
            r0 = 2131440747(0x7f0b346b, float:1.8503486E38)
            android.view.View r0 = r1.requireViewById(r0)
            r12.A00 = r0
            android.view.View r1 = r12.rootView
            X.0qQ.A0A(r1)
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r0 = r1.requireViewById(r0)
            r12.A01 = r0
            boolean r0 = r12.isUsingRecyclerView()
            r1 = 2131435749(0x7f0b20e5, float:1.8493349E38)
            if (r0 == 0) goto L_0x003a
            r1 = 2131440599(0x7f0b33d7, float:1.8503186E38)
        L_0x003a:
            android.view.View r0 = r12.rootView
            X.0qQ.A0A(r0)
            android.view.ViewStub r0 = X.DbU.A0D(r0, r1)
            r0.inflate()
            com.instagram.common.session.UserSession r0 = r12.A03
            java.lang.String r5 = "userSession"
            if (r0 == 0) goto L_0x01c8
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x005b }
            java.lang.String r0 = X.1aC.A07(r1)     // Catch:{ IOException -> 0x005b }
            com.instagram.user.model.User r0 = X.1aC.A04(r0)     // Catch:{ IOException -> 0x005b }
            goto L_0x0063
        L_0x005b:
            java.lang.String r1 = "profile_display_options"
            java.lang.String r0 = "Exception on serialize and deserialize User"
            X.0wb.A03(r1, r0)
            r0 = 0
        L_0x0063:
            r12.A06 = r0
            boolean r0 = r12.A04(r0)
            if (r0 == 0) goto L_0x007d
            com.instagram.common.session.UserSession r4 = r12.A03
            if (r4 == 0) goto L_0x01c8
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321722378495647(0x810a6a0000269f, double:3.0333417157727996E-306)
            boolean r1 = X.DbY.A1Y(r3, r4, r0)
            r0 = 1
            if (r1 == 0) goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            r12.A08 = r0
            com.instagram.model.business.BusinessInfo r3 = r12.A05
            if (r3 != 0) goto L_0x00c4
            X.FEa r1 = new X.FEa
            r1.<init>()
            com.instagram.common.session.UserSession r0 = r12.A03
            if (r0 == 0) goto L_0x01c8
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            boolean r0 = r0.A1f()
            r1.A0Q = r0
            com.instagram.common.session.UserSession r0 = r12.A03
            if (r0 == 0) goto L_0x01c8
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            boolean r0 = r0.A1g()
            r1.A0S = r0
            boolean r0 = A03(r12)
            if (r0 != 0) goto L_0x00bd
            com.instagram.common.session.UserSession r0 = r12.A03
            if (r0 == 0) goto L_0x01c8
            X.4Cl r0 = X.DbX.A0m(r0)
            java.lang.Boolean r0 = r0.Ca6()
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r1.A0R = r0
        L_0x00bd:
            com.instagram.model.business.BusinessInfo r3 = new com.instagram.model.business.BusinessInfo
            r3.<init>(r1)
            r12.A05 = r3
        L_0x00c4:
            com.instagram.model.business.BusinessInfo r0 = r12.A04
            if (r0 != 0) goto L_0x00d4
            X.FEa r1 = new X.FEa
            r1.<init>(r3)
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>(r1)
            r12.A04 = r0
        L_0x00d4:
            A01(r12)
            android.view.View r0 = r12.rootView
            X.0qQ.A0A(r0)
            android.widget.TextView r1 = X.Dba.A06(r0)
            r0 = 2131969954(0x7f1347a2, float:1.9576845E38)
            r1.setText(r0)
            android.view.View r0 = r12.rootView
            X.0qQ.A0A(r0)
            r7 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r0, r7)
            r0 = 2131969953(0x7f1347a1, float:1.9576843E38)
            r1.setText(r0)
            android.view.View r1 = r12.rootView
            X.0qQ.A0A(r1)
            r0 = 2131440117(0x7f0b31f5, float:1.8502208E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 2131440130(0x7f0b3202, float:1.8502235E38)
            android.view.View r10 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 2131440135(0x7f0b3207, float:1.8502245E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 2131440136(0x7f0b3208, float:1.8502247E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            X.2eS.A04(r4, r9)
            r1 = 2131442920(0x7f0b3ce8, float:1.8507893E38)
            android.view.View r0 = r3.requireViewById(r1)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r0
            r12.categoryToggle = r0
            android.view.View r0 = r10.requireViewById(r1)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r0
            r12.contactsToggle = r0
            android.view.View r0 = r5.requireViewById(r1)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r0
            r12.discountToggle = r0
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r12.categoryToggle
            X.0qQ.A0A(r1)
            com.instagram.model.business.BusinessInfo r0 = r12.A04
            X.0qQ.A0A(r0)
            boolean r0 = r0.A0Q
            r1.setChecked(r0)
            r8 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r1 = X.DbU.A0G(r3, r8)
            r0 = 2131969948(0x7f13479c, float:1.9576833E38)
            r1.setText(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r12.categoryToggle
            X.0qQ.A0A(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r12.A00(r3, r1, r0)
            boolean r0 = r12.A08
            r3 = 8
            if (r0 == 0) goto L_0x0212
            com.instagram.user.model.User r1 = r12.A06
            X.0qQ.A0A(r1)
            com.instagram.model.business.BusinessInfo r0 = r12.A04
            X.0qQ.A0A(r0)
            boolean r0 = r0.A0S
            X.4Cl r1 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Eko(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r12.contactsToggle
            X.0qQ.A0A(r1)
            com.instagram.model.business.BusinessInfo r0 = r12.A04
            X.0qQ.A0A(r0)
            boolean r0 = r0.A0S
            r1.setChecked(r0)
            android.widget.TextView r1 = X.DbU.A0G(r10, r8)
            r0 = 2131969949(0x7f13479d, float:1.9576835E38)
            r1.setText(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r12.contactsToggle
            X.0qQ.A0A(r0)
            r12.A00(r10, r0, r9)
        L_0x019b:
            com.instagram.user.model.User r0 = r12.A06
            if (r0 == 0) goto L_0x020b
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.Ca6()
            if (r0 == 0) goto L_0x020b
            boolean r0 = A03(r12)
            if (r0 == 0) goto L_0x01da
            r0 = 2131430665(0x7f0b0d09, float:1.8483037E38)
            android.widget.TextView r1 = X.DbU.A0G(r4, r0)
            r0 = 2131969950(0x7f13479e, float:1.9576837E38)
            r1.setText(r0)
            r0 = 64
            X.FPB.A01(r4, r0, r12)
            r5.setVisibility(r3)
        L_0x01c2:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r12.A02
            if (r0 != 0) goto L_0x01d0
            java.lang.String r5 = "logger"
        L_0x01c8:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01d0:
            java.lang.String r4 = "profile_display_options"
            r6 = 0
            java.lang.String r5 = r12.A07
            if (r5 != 0) goto L_0x0216
            java.lang.String r5 = "entryPoint"
            goto L_0x01c8
        L_0x01da:
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r12.discountToggle
            X.0qQ.A0A(r1)
            com.instagram.model.business.BusinessInfo r0 = r12.A04
            X.0qQ.A0A(r0)
            boolean r0 = r0.A0R
            r1.setChecked(r0)
            android.widget.TextView r1 = X.DbU.A0G(r5, r8)
            r0 = 2131969950(0x7f13479e, float:1.9576837E38)
            r1.setText(r0)
            android.widget.TextView r1 = X.DbU.A0G(r5, r7)
            r0 = 2131969951(0x7f13479f, float:1.957684E38)
            r1.setText(r0)
            X.DbT.A1F(r5, r7, r6)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r12.discountToggle
            X.0qQ.A0A(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r12.A00(r5, r1, r0)
            goto L_0x020e
        L_0x020b:
            r5.setVisibility(r3)
        L_0x020e:
            r4.setVisibility(r3)
            goto L_0x01c2
        L_0x0212:
            r10.setVisibility(r3)
            goto L_0x019b
        L_0x0216:
            X.Xtl r3 = new X.Xtl
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.Cka(r3)
            android.view.View r1 = r12.rootView
            r0 = -1540886589(0xffffffffa427efc3, float:-3.641544E-17)
            X.AnonymousClass0fD.A09(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.ProfileDisplayOptionsFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1948731935);
        super.onResume();
        IgdsSwitch igdsSwitch = this.categoryToggle;
        0qQ.A0A(igdsSwitch);
        BusinessInfo businessInfo = this.A04;
        0qQ.A0A(businessInfo);
        igdsSwitch.setChecked(businessInfo.A0Q);
        A01(this);
        IgdsSwitch igdsSwitch2 = this.contactsToggle;
        0qQ.A0A(igdsSwitch2);
        BusinessInfo businessInfo2 = this.A04;
        0qQ.A0A(businessInfo2);
        igdsSwitch2.setChecked(businessInfo2.A0S);
        User user = this.A06;
        if (user != null) {
            BusinessInfo businessInfo3 = this.A04;
            0qQ.A0A(businessInfo3);
            user.A03.Eko(Boolean.valueOf(businessInfo3.A0S));
        }
        E9G e9g = (E9G) getAdapter();
        if (e9g != null) {
            e9g.A00(this.A06);
        }
        if (!A03(this)) {
            IgdsSwitch igdsSwitch3 = this.discountToggle;
            0qQ.A0A(igdsSwitch3);
            BusinessInfo businessInfo4 = this.A04;
            0qQ.A0A(businessInfo4);
            igdsSwitch3.setChecked(businessInfo4.A0R);
        }
        AnonymousClass0fD.A09(391554211, A022);
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        DbZ.A1D(recyclerView);
    }
}
