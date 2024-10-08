package com.instagram.business.activity;

import X.02m;
import X.09i;
import X.0Gl;
import X.0Tu;
import X.0eE;
import X.0hq;
import X.0lg;
import X.0qQ;
import X.0sc;
import X.0wb;
import X.16V;
import X.17k;
import X.182;
import X.1ES;
import X.1NY;
import X.1OC;
import X.1QK;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass08W;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass11X;
import X.AnonymousClass4D6;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9BE;
import X.C229382nI;
import X.C273374mT;
import X.C319586qr;
import X.C358248ab;
import X.C359988do;
import X.C360678ey;
import X.C46634DiE;
import X.C47484E4k;
import X.C47492E4w;
import X.C47493E4x;
import X.C47494E4z;
import X.C48092EVk;
import X.C48758Ejh;
import X.C48990EnS;
import X.C48992EnU;
import X.C49883FBi;
import X.C50005FIq;
import X.C50023FJi;
import X.C50204FTk;
import X.C51169Fpf;
import X.C51926G7u;
import X.C61073JwB;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.Dbb;
import X.De9;
import X.E1T;
import X.E3Y;
import X.E50;
import X.E76;
import X.E85;
import X.EDC;
import X.EtN;
import X.F1I;
import X.FBS;
import X.FBv;
import X.FG1;
import X.FG6;
import X.FQk;
import X.FRL;
import X.FRU;
import X.FRZ;
import X.FU1;
import X.FV8;
import X.Fl5;
import X.G1Y;
import X.G7B;
import X.G8D;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.business.fragment.ConnectFBPageFragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class BusinessConversionActivity extends BaseFragmentActivity implements AnonymousClass0iw, AnonymousClass4D6, G8D, G7B, CallerContextable, AnonymousClass08W {
    public Bundle A00;
    public C49883FBi A01;
    public C319586qr A02;
    public PageSelectionOverrideData A03;
    public String A04 = "";
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public final HashSet A08 = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A09 = Dba.A0h(this, 4);
    public final AnonymousClass0eM A0A = Dba.A0h(this, 5);
    public final AnonymousClass0eM A0B = Dba.A0h(this, 6);
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(G1Y.A00);
    public final AnonymousClass0eM A0D = Dba.A0h(this, 7);
    public final AnonymousClass0eM A0E = Dba.A0h(this, 8);
    public final AnonymousClass0eM A0F = Dba.A0h(this, 10);
    public final AnonymousClass0eM A0G = Dba.A0h(this, 11);
    public final AnonymousClass0eM A0H = Dba.A0h(this, 12);
    public final AnonymousClass0eM A0I = Dba.A0h(this, 9);

    public final void A0o(Context context, C51926G7u g7u, AnonymousClass4D6 r13, 16V r14, String str, boolean z) {
        int i;
        int i2;
        16V r7 = r14;
        0qQ.A0B(r14, 4);
        0eE r1 = AnonymousClass0t1.A01;
        UserSession session = getSession();
        DbS.A1Z(session);
        User A012 = r1.A01(session);
        Context context2 = context;
        C51926G7u g7u2 = g7u;
        AnonymousClass4D6 r6 = r13;
        boolean z2 = z;
        if (A012.A2L() || A012.A0N() != AnonymousClass05K.A0C) {
            A00(context2, this, g7u2, r6, r7, false, z2);
            return;
        }
        if (B6a() == C319586qr.INTEREST_ACCOUNT_CONVERSION || B6a() == C319586qr.RENEW_PROFESSIONAL_ACCOUNT) {
            i = 2131974885;
            i2 = 2131974884;
        } else {
            i = 2131955000;
            i2 = 2131954998;
            if (FG1.A03(this)) {
                i = 2131955001;
                i2 = 2131954999;
            }
        }
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(i);
        A0Y.A08(i2);
        A0Y.A0E(new C50005FIq(context2, this, g7u2, r6, r7, str, z2));
        A0Y.A05();
        DbT.A1V(A0Y);
    }

    public final void EWu(C319586qr r8) {
        0qQ.A0B(r8, 0);
        C319586qr r0 = this.A02;
        if (r0 != null) {
            if (r0 != r8) {
                this.A02 = r8;
                ConversionStep A0n = A0n();
                ImmutableList of = ImmutableList.of();
                String str = "_flowType";
                if (A0n == ConversionStep.ACCOUNT_TYPE_SELECTION_V2) {
                    C319586qr r02 = this.A02;
                    if (r02 != null) {
                        int ordinal = r02.ordinal();
                        if (!(ordinal == 0 || ordinal == 6)) {
                            if (ordinal == 1 || ordinal == 7) {
                                UserSession session = getSession();
                                DbS.A1Z(session);
                                of = FBv.A02(session, this.A04, false, this.A07);
                            }
                        }
                        AnonymousClass0wW session2 = getSession();
                        of = FBv.A01(((FRU) this.A09.getValue()).A01, session2, this.A04, false, this.A07);
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                } else if (A0n == ConversionStep.RENEW) {
                    C319586qr r03 = this.A02;
                    if (r03 != null) {
                        int ordinal2 = r03.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 2) {
                                of = FBv.A00();
                            }
                        }
                        AnonymousClass0wW session22 = getSession();
                        of = FBv.A01(((FRU) this.A09.getValue()).A01, session22, this.A04, false, this.A07);
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                if (!of.isEmpty()) {
                    C49883FBi fBi = this.A01;
                    str = "conversionLogic";
                    if (fBi != null) {
                        BusinessConversionFlowStatus businessConversionFlowStatus = fBi.A00;
                        0qQ.A07(businessConversionFlowStatus);
                        int i = businessConversionFlowStatus.A00;
                        BusinessConversionFlowStatus A022 = FG6.A02(businessConversionFlowStatus, of, i + 1, i);
                        C49883FBi fBi2 = this.A01;
                        if (fBi2 != null) {
                            fBi2.A00 = A022;
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                BaseBundle baseBundle = (BaseBundle) this.A0D.getValue();
                C319586qr r04 = this.A02;
                if (r04 != null) {
                    baseBundle.putInt("business_account_flow", r04.A00);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("_flowType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "business_conversion_activity";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C49883FBi fBi = this.A01;
        if (fBi == null) {
            0qQ.A0F("conversionLogic");
            throw AnonymousClass00P.createAndThrow();
        }
        bundle.putParcelable("conversion_flow_status", fBi.A00);
        bundle.putParcelable("business_info", ((FRU) this.A09.getValue()).A02);
        PageSelectionOverrideData pageSelectionOverrideData = this.A03;
        if (pageSelectionOverrideData != null) {
            bundle.putParcelable("EXTRA_FB_OVERRIDE_DATA", pageSelectionOverrideData);
        }
    }

    public static final void A00(Context context, BusinessConversionActivity businessConversionActivity, C51926G7u g7u, AnonymousClass4D6 r19, 16V r20, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        BusinessConversionActivity businessConversionActivity2 = businessConversionActivity;
        AnonymousClass0eM r1 = businessConversionActivity2.A09;
        BusinessInfo businessInfo = ((FRU) r1.getValue()).A02;
        if (businessInfo != null) {
            UserSession session = businessConversionActivity2.getSession();
            DbS.A1Z(session);
            UserSession userSession = session;
            String str4 = ((FRU) r1.getValue()).A09;
            FRU fru = (FRU) r1.getValue();
            r1.getValue();
            r1.getValue();
            16V r4 = (16V) businessConversionActivity2.A0B.getValue();
            if (businessConversionActivity2.A0n() != null) {
                businessConversionActivity2.A0n();
            }
            AnonymousClass7TG.A1Q(userSession, str4);
            PublicPhoneContact publicPhoneContact = businessInfo.A01;
            String str5 = businessInfo.A09;
            16V r13 = r20;
            1NY A002 = FRL.A00(userSession, r13, str4);
            A002.A0R = true;
            A002.A9m("category_id", str5);
            A002.A0H("set_public", z);
            String str6 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            String str7 = "0";
            if (z2) {
                str7 = str6;
            }
            A002.A9m("ignore_conversion_log", str7);
            A002.A9m("should_bypass_contact_check", "true");
            String str8 = businessInfo.A0B;
            if (!(str8 == null || str8.length() == 0)) {
                A002.A9m("public_email", str8);
            }
            Address address = businessInfo.A00;
            if (address != null) {
                try {
                    str3 = C48990EnS.A00(address);
                } catch (IOException unused) {
                    0wb.A03("business_conversion_activity", "Couldn't serialize create business address");
                    str3 = null;
                }
                A002.A9m("business_address", str3);
            }
            if (!(publicPhoneContact == null || (str = publicPhoneContact.A02) == null || str.length() == 0)) {
                try {
                    str2 = C48992EnU.A00(publicPhoneContact);
                } catch (IOException unused2) {
                    0wb.A03("business_conversion_activity", "Couldn't serialize create business public phone contact");
                    str2 = null;
                }
                A002.A9m("public_phone_contact", str2);
            }
            16V r5 = 16V.A08;
            if (r13 != r5) {
                String str9 = "0";
                if (businessInfo.A0S) {
                    str9 = str6;
                }
                A002.A9m("should_show_public_contacts", str9);
                if (!businessInfo.A0Q) {
                    str6 = "0";
                }
                A002.A9m("should_show_category", str6);
            }
            if (!(r4 == null || r4 == r5)) {
                A002.A9m("previous_account_type", String.valueOf(r4.A00));
            }
            1OC A0M = A002.A0M();
            AnonymousClass4D6 r11 = r19;
            A0M.A00 = new EDC(context, fru, g7u, userSession, r11, businessInfo, r13, str4, AnonymousClass7TF.A1W(AnonymousClass7TF.A0Q(userSession).A0J(), 16V.A07));
            r11.schedule(A0M);
        }
    }

    public static final void A01(Bundle bundle, BusinessConversionActivity businessConversionActivity) {
        String valueOf;
        if (bundle == null) {
            AnonymousClass0eM r2 = businessConversionActivity.A09;
            ((FRU) r2.getValue()).A04 = null;
            ((FRU) r2.getValue()).A05 = null;
            return;
        }
        RegFlowExtras regFlowExtras = (RegFlowExtras) bundle.getParcelable("RegFlowExtras.EXTRA_KEY");
        AnonymousClass0eM r4 = businessConversionActivity.A09;
        ((FRU) r4.getValue()).A04 = regFlowExtras;
        if (regFlowExtras != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            String str = null;
            if (regFlowExtras.A01() == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(regFlowExtras.A01());
            }
            A1E.put("registration_flow", valueOf);
            A1E.put("email", regFlowExtras.A08);
            CountryCodeData countryCodeData = regFlowExtras.A01;
            if (countryCodeData != null) {
                str = countryCodeData.A01;
            }
            A1E.put("area_code", str);
            A1E.put("phone", regFlowExtras.A0R);
            A1E.put("device_nonce", regFlowExtras.A06);
            A1E.put("business_name", regFlowExtras.A0O);
            Bundle A0a = AnonymousClass7TE.A0a();
            Iterator A0u = AnonymousClass7TF.A0u(A1E);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A0a.putString(DbT.A13(A1J), DbS.A0s(A1J));
            }
            bundle.putBundle("conversion_funnel_log_payload", A0a);
        }
        ((FRU) r4.getValue()).A05 = bundle.getString("error_message");
        if (bundle.containsKey("fb_user_id")) {
            r4.getValue();
            bundle.getString("fb_user_id");
        }
    }

    public static final void A02(BusinessConversionActivity businessConversionActivity) {
        ConversionStep conversionStep;
        C49883FBi fBi = businessConversionActivity.A01;
        if (fBi != null) {
            BusinessConversionStep A002 = fBi.A00.A00();
            if (A002 == null) {
                conversionStep = null;
            } else {
                conversionStep = A002.A01;
            }
            if (conversionStep == ConversionStep.CREATE_PAGE) {
                C49883FBi fBi2 = businessConversionActivity.A01;
                if (fBi2 != null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus = fBi2.A00;
                    0qQ.A07(businessConversionFlowStatus);
                    if (businessConversionFlowStatus.A00() != null) {
                        int i = businessConversionFlowStatus.A00;
                        fBi2.A00 = FG6.A00(businessConversionFlowStatus, i, i - 1);
                        businessConversionActivity.A08.remove(conversionStep);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            } else if (conversionStep == ConversionStep.RENEW) {
                C49883FBi fBi3 = businessConversionActivity.A01;
                if (fBi3 != null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus2 = fBi3.A00;
                    0qQ.A07(businessConversionFlowStatus2);
                    if (businessConversionFlowStatus2.A00() != null) {
                        int i2 = businessConversionFlowStatus2.A00;
                        BusinessConversionFlowStatus A003 = FG6.A00(businessConversionFlowStatus2, i2, i2 - 1);
                        C49883FBi fBi4 = businessConversionActivity.A01;
                        if (fBi4 != null) {
                            fBi4.A00 = A003;
                            return;
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F("conversionLogic");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ConversionStep A0n() {
        C49883FBi fBi = this.A01;
        if (fBi == null) {
            0qQ.A0F("conversionLogic");
            throw AnonymousClass00P.createAndThrow();
        }
        BusinessConversionStep A002 = fBi.A00.A00();
        if (A002 == null) {
            return null;
        }
        return A002.A01;
    }

    public final void AGV() {
        C49883FBi fBi = this.A01;
        if (fBi == null) {
            0qQ.A0F("conversionLogic");
            throw AnonymousClass00P.createAndThrow();
        }
        fBi.A01();
        finish();
    }

    public final C319586qr B6a() {
        C319586qr r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("_flowType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CHx() {
        C319586qr r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("_flowType");
            throw AnonymousClass00P.createAndThrow();
        } else if (r1 != C319586qr.PROFESSIONAL_SIGNUP_FLOW || E2J() == null) {
            return false;
        } else {
            while (E2J() != null) {
                EJN((Bundle) null);
            }
            return true;
        }
    }

    public final boolean COM() {
        return true;
    }

    public final ConversionStep E2I() {
        BusinessConversionStep businessConversionStep;
        C49883FBi fBi = this.A01;
        if (fBi == null) {
            0qQ.A0F("conversionLogic");
            throw AnonymousClass00P.createAndThrow();
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = fBi.A00;
        int i = businessConversionFlowStatus.A00;
        ImmutableList immutableList = businessConversionFlowStatus.A01;
        if (i >= immutableList.size() - 1 || (businessConversionStep = (BusinessConversionStep) immutableList.get(i + 1)) == null) {
            return null;
        }
        return businessConversionStep.A01;
    }

    public final ConversionStep E2J() {
        BusinessConversionStep businessConversionStep;
        C49883FBi fBi = this.A01;
        if (fBi == null) {
            0qQ.A0F("conversionLogic");
            throw AnonymousClass00P.createAndThrow();
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = fBi.A00;
        int i = businessConversionFlowStatus.A00;
        if (i <= 0 || (businessConversionStep = (BusinessConversionStep) businessConversionFlowStatus.A01.get(i - 1)) == null) {
            return null;
        }
        return businessConversionStep.A01;
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public static final void A03(BusinessConversionActivity businessConversionActivity, boolean z) {
        Bundle bundle;
        FragmentActivity fragmentActivity;
        De9 de9;
        List list;
        ConversionStep A0n = businessConversionActivity.A0n();
        if (A0n == null) {
            businessConversionActivity.finish();
            return;
        }
        int ordinal = A0n.ordinal();
        boolean z2 = z;
        if (ordinal == 16 && ((de9 = ((FRU) businessConversionActivity.A09.getValue()).A00) == null || (list = de9.A03) == null || list.isEmpty())) {
            C49883FBi fBi = businessConversionActivity.A01;
            if (fBi == null) {
                0qQ.A0F("conversionLogic");
                throw AnonymousClass00P.createAndThrow();
            }
            fBi.A02();
            A03(businessConversionActivity, z);
            return;
        }
        if (A0n == ConversionStep.FACEBOOK_CONNECT) {
            bundle = DbV.A0C("fb_account_linked", (String) null);
        } else {
            bundle = null;
        }
        businessConversionActivity.A00 = bundle;
        if (A0n == ConversionStep.PAGE_SELECTION || A0n == ConversionStep.CREATE_PAGE) {
            AnonymousClass0eM r0 = businessConversionActivity.A09;
            r0.getValue();
            r0.getValue();
        }
        FBS fbs = (FBS) businessConversionActivity.A0E.getValue();
        switch (ordinal) {
            case 0:
                String name = A0n.name();
                C47493E4x e4x = fbs.A09;
                if (e4x == null) {
                    Bundle A002 = FBS.A00(fbs);
                    DbU.A0v();
                    e4x = new C47493E4x();
                    e4x.setArguments(A002);
                    fbs.A09 = e4x;
                }
                fbs.A01(e4x, name);
                return;
            case 1:
                String name2 = A0n.name();
                int i = fbs.A0I.A08;
                boolean z3 = false;
                if (i != -1) {
                    z3 = true;
                }
                17k.A0F(z3);
                E50 e50 = fbs.A05;
                if (e50 == null) {
                    DbU.A0v();
                    String str = fbs.A0F;
                    Bundle A0A2 = DbY.A0A(str);
                    DbS.A1B(A0A2, str);
                    A0A2.putString("edit_profile_entry", (String) null);
                    A0A2.putInt(AnonymousClass000.A00(1310), i);
                    e50 = new E50();
                    e50.setArguments(A0A2);
                    fbs.A05 = e50;
                }
                FragmentActivity fragmentActivity2 = fbs.A0G;
                if (!fragmentActivity2.isDestroyed()) {
                    fbs.A0D.A00(e50, fragmentActivity2, fbs.A0J, name2, z2);
                    return;
                }
                return;
            case 2:
                String name3 = A0n.name();
                AccountTypeSelectionV2Fragment accountTypeSelectionV2Fragment = fbs.A00;
                if (accountTypeSelectionV2Fragment == null) {
                    Bundle A003 = FBS.A00(fbs);
                    DbU.A0v();
                    accountTypeSelectionV2Fragment = new AccountTypeSelectionV2Fragment();
                    accountTypeSelectionV2Fragment.setArguments(A003);
                    fbs.A00 = accountTypeSelectionV2Fragment;
                }
                fbs.A01(accountTypeSelectionV2Fragment, name3);
                return;
            case 3:
                String name4 = A0n.name();
                AnonymousClass4DH r02 = fbs.A03;
                if (r02 == null) {
                    DbU.A0v();
                    String str2 = fbs.A0F;
                    0qQ.A0B(str2, 1);
                    Bundle A0B2 = DbX.A0B(str2);
                    A0B2.putInt("selected_account_type", 3);
                    r02 = new AnonymousClass4DH();
                    r02.setArguments(A0B2);
                    fbs.A03 = r02;
                }
                fbs.A01(r02, name4);
                return;
            case 5:
                String name5 = A0n.name();
                0Gl.A00(fbs.A0J.A00);
                ConnectFBPageFragment connectFBPageFragment = fbs.A02;
                if (connectFBPageFragment == null) {
                    DbU.A0v();
                    String str3 = fbs.A0F;
                    Bundle A0A3 = DbY.A0A(str3);
                    A0A3.putString("edit_profile_entry", (String) null);
                    DbS.A1B(A0A3, str3);
                    connectFBPageFragment = new ConnectFBPageFragment();
                    connectFBPageFragment.setArguments(A0A3);
                    fbs.A02 = connectFBPageFragment;
                }
                fbs.A01(connectFBPageFragment, name5);
                return;
            case 6:
                UserSession A004 = 0Gl.A00(fbs.A0J.A00);
                FragmentActivity fragmentActivity3 = fbs.A0G;
                C61073JwB jwB = new C61073JwB(AnonymousClass05K.A01, (String) null, (String) null, (String) null, 7);
                Integer num = AnonymousClass05K.A00;
                0qQ.A0B(A004, 0);
                E1T e1t = new E1T();
                e1t.setArguments(C48758Ejh.A00(jwB, num, "personal_to_business_conversion"));
                Dbb.A0o((Bundle) null, e1t, fragmentActivity3, A004);
                return;
            case 7:
                String name6 = A0n.name();
                CategorySearchFragment categorySearchFragment = fbs.A01;
                if (categorySearchFragment == null) {
                    DbU.A0v();
                    String str4 = fbs.A0F;
                    Bundle A0A4 = DbY.A0A(str4);
                    DbS.A1B(A0A4, str4);
                    categorySearchFragment = new CategorySearchFragment();
                    categorySearchFragment.setArguments(A0A4);
                    fbs.A01 = categorySearchFragment;
                }
                fbs.A01(categorySearchFragment, name6);
                return;
            case 8:
                String name7 = A0n.name();
                C47492E4w e4w = fbs.A04;
                if (e4w == null) {
                    DbU.A0v();
                    FRU fru = fbs.A0I;
                    BusinessInfo businessInfo = fru.A02;
                    String str5 = fbs.A0F;
                    String str6 = fru.A05;
                    Bundle A0B3 = DbV.A0B(str5, 1);
                    A0B3.putParcelable("business_info", businessInfo);
                    DbS.A1B(A0B3, str5);
                    A0B3.putString("edit_profile_entry", (String) null);
                    A0B3.putString("page_access_token", (String) null);
                    A0B3.putString("error_message", str6);
                    e4w = new C47492E4w();
                    e4w.setArguments(A0B3);
                    fbs.A04 = e4w;
                }
                fbs.A01(e4w, name7);
                return;
            case 9:
                String name8 = A0n.name();
                C273374mT r03 = fbs.A08;
                if (r03 == null) {
                    Bundle A005 = FBS.A00(fbs);
                    DbU.A0v();
                    r03 = new C273374mT();
                    r03.setArguments(A005);
                    fbs.A08 = r03;
                }
                fbs.A01(r03, name8);
                return;
            case 10:
                String name9 = A0n.name();
                AnonymousClass9BE.A00(09i.A0A.A03(new Fl5(fbs))).A02();
                Bundle A006 = FBS.A00(fbs);
                DbW.A0X();
                DbS.A1A(A006, "IgSessionManager.LOGGED_OUT_TOKEN");
                E3Y e3y = new E3Y();
                e3y.setArguments(A006);
                fbs.A01(e3y, name9);
                return;
            case 11:
                String name10 = A0n.name();
                E76 e76 = fbs.A0B;
                if (e76 == null) {
                    Bundle A007 = FBS.A00(fbs);
                    DbT.A15();
                    e76 = new E76();
                    e76.setArguments(A007);
                    fbs.A0B = e76;
                }
                fbs.A01(e76, name10);
                return;
            case 13:
                String name11 = A0n.name();
                C47484E4k e4k = fbs.A0C;
                if (e4k == null) {
                    Bundle A008 = FBS.A00(fbs);
                    DbU.A0v();
                    e4k = new C47484E4k();
                    e4k.setArguments(A008);
                    fbs.A0C = e4k;
                }
                fbs.A01(e4k, name11);
                return;
            case 14:
                String name12 = A0n.name();
                Bundle A009 = FBS.A00(fbs);
                DbU.A0v();
                G8D g8d = fbs.A0H;
                String str7 = ((BusinessConversionActivity) g8d).A04;
                boolean contains = 0sc.A07(new C319586qr[]{C319586qr.CREATOR_CONVERSION_FLOW, C319586qr.CREATOR_SIGNUP_FLOW}).contains(g8d.B6a());
                A009.putString("user_email", str7);
                A009.putBoolean("is_creator", contains);
                C47494E4z e4z = new C47494E4z();
                e4z.setArguments(A009);
                fbs.A07 = e4z;
                fbs.A01(e4z, name12);
                return;
            case 15:
                String name13 = A0n.name();
                0lg r6 = fbs.A0J.A00;
                boolean A012 = FRZ.A01(0Gl.A00(r6), false);
                Fragment fragment = fbs.A0A;
                if (fragment == null || A012) {
                    Bundle A0010 = FBS.A00(fbs);
                    SparseArray sparseArray = new SparseArray();
                    sparseArray.put(R.id.safety_step_handler, new C50204FTk(fbs));
                    fragment = DbU.A0R().A00(A0010, sparseArray, fbs.A0H.B6a(), 0Gl.A00(r6));
                    fbs.A0A = fragment;
                }
                fbs.A01(fragment, name13);
                return;
            case 16:
                String name14 = A0n.name();
                OnboardingCheckListFragment onboardingCheckListFragment = fbs.A06;
                if (onboardingCheckListFragment == null) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "conversion");
                    DbU.A0v();
                    onboardingCheckListFragment = new OnboardingCheckListFragment();
                    onboardingCheckListFragment.setArguments(A0a);
                    fbs.A06 = onboardingCheckListFragment;
                }
                fbs.A01(onboardingCheckListFragment, name14);
                return;
            case 17:
                FragmentActivity A0011 = C71172bH.A00();
                if (A0011 != null) {
                    A0011.E32();
                    A0011.Eng(1QK.A0E);
                }
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "conversion");
                F1I f1i = fbs.A0D;
                if (A0011 != null) {
                    fragmentActivity = A0011;
                } else {
                    fragmentActivity = fbs.A0G;
                }
                UserSession A0012 = 0Gl.A00(fbs.A0J.A00);
                G8D g8d2 = fbs.A0H;
                FU1 fu1 = new FU1();
                0qQ.A0B(A0012, 0);
                02m.A0p.markerStart(962537714);
                AnonymousClass7TF.A0D().postDelayed(new C51169Fpf(A0012), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                C229382nI A0N = DbT.A0N(fragmentActivity, fu1, A0012);
                C360678ey A042 = C359988do.A04(A0012, "com.instagram.pro_home.action", A1E);
                E85.A00(A042, f1i, g8d2, A0N, 0);
                1ES.A03(A042);
                FragmentActivity fragmentActivity4 = fbs.A0G;
                if (A0011 != null) {
                    fragmentActivity4.finish();
                    return;
                }
                0hq supportFragmentManager = fragmentActivity4.getSupportFragmentManager();
                supportFragmentManager.A0s(new FQk(0, fbs, supportFragmentManager));
                return;
            default:
                Dba.A1P(fbs.A0H);
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.instagram.business.activity.BusinessConversionActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void A0j(Bundle bundle) {
        if (A0n() == null) {
            Clz((Bundle) null);
            UserSession session = getSession();
            if ((session instanceof UserSession) && AnonymousClass0t1.A01.A01(session).CPm()) {
                C319586qr r1 = this.A02;
                if (r1 == null) {
                    0qQ.A0F("_flowType");
                    throw AnonymousClass00P.createAndThrow();
                } else if (r1 == C319586qr.CONVERSION_FLOW) {
                    C358248ab A0X = DbS.A0X(this);
                    A0X.A0r(false);
                    A0X.A0s(false);
                    A0X.A09(2131952920);
                    A0X.A08(2131952919);
                    C50023FJi.A01(A0X, this, 13);
                    DbT.A1V(A0X);
                }
            }
        }
    }

    public final void A0p(Bundle bundle, boolean z) {
        ConversionStep conversionStep;
        A01(bundle, this);
        A02(this);
        C319586qr r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("_flowType");
        } else {
            if ((r1 == C319586qr.CONVERSION_FLOW || r1 == C319586qr.BUSINESS_SIGNUP_FLOW) && A0n() == ConversionStep.FACEBOOK_CONNECT) {
                C49883FBi fBi = this.A01;
                if (fBi != null) {
                    AnonymousClass0wW session = getSession();
                    0qQ.A0B(session, 0);
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    if (182.A06(0Tu.A05, session, 36316701561721446L)) {
                        conversionStep = ConversionStep.PROFESSIONAL_DASHBOARD;
                    } else {
                        conversionStep = ConversionStep.ONBOARDING_CHECKLIST;
                    }
                    Dba.A1F(builder, conversionStep);
                    fBi.A03(DbZ.A0K(builder));
                }
                0qQ.A0F("conversionLogic");
            } else {
                C49883FBi fBi2 = this.A01;
                if (fBi2 != null) {
                    fBi2.A02();
                }
                0qQ.A0F("conversionLogic");
            }
            A03(this, z);
            return;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final String BKa() {
        String A022 = 0Gl.A02(getSession());
        if (A022 == null) {
            return "";
        }
        return A022;
    }

    public final void Clz(Bundle bundle) {
        A01(bundle, this);
        A02(this);
        C49883FBi fBi = this.A01;
        if (fBi == null) {
            0qQ.A0F("conversionLogic");
            throw AnonymousClass00P.createAndThrow();
        }
        fBi.A02();
        A03(this, true);
    }

    /* JADX WARNING: type inference failed for: r0v38, types: [com.instagram.business.activity.BusinessConversionActivity, android.app.Activity] */
    public final void EJN(Bundle bundle) {
        String str;
        BusinessConversionStep businessConversionStep;
        BusinessConversionFlowStatus businessConversionFlowStatus;
        ConversionStep A0n = A0n();
        C49883FBi fBi = this.A01;
        if (fBi == null) {
            str = "conversionLogic";
        } else {
            BusinessConversionFlowStatus businessConversionFlowStatus2 = fBi.A00;
            if (businessConversionFlowStatus2.A00 > -1) {
                BusinessConversionStep A002 = businessConversionFlowStatus2.A00();
                if (A002 != null) {
                    fBi.A03.remove(A002);
                }
                BusinessConversionFlowStatus businessConversionFlowStatus3 = fBi.A00;
                int i = businessConversionFlowStatus3.A00;
                if (i <= 0 || (businessConversionStep = (BusinessConversionStep) businessConversionFlowStatus3.A01.get(i - 1)) == null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus4 = fBi.A00;
                    0qQ.A0B(businessConversionFlowStatus4, 0);
                    fBi.A00 = new BusinessConversionFlowStatus(businessConversionFlowStatus4.A01, businessConversionFlowStatus4.A00 - 1);
                    for (EtN etN : fBi.A01) {
                        etN.A00.setResult(0);
                    }
                    fBi.A02 = AnonymousClass7TE.A1F();
                    fBi.A01 = AnonymousClass7TE.A1F();
                } else {
                    if (businessConversionStep.A00 == C48092EVk.SKIP) {
                        Map map = fBi.A03;
                        if (map.containsKey(businessConversionStep)) {
                            businessConversionFlowStatus = (BusinessConversionFlowStatus) map.get(businessConversionStep);
                            fBi.A00 = businessConversionFlowStatus;
                        }
                    }
                    BusinessConversionFlowStatus businessConversionFlowStatus5 = fBi.A00;
                    0qQ.A0B(businessConversionFlowStatus5, 0);
                    businessConversionFlowStatus = new BusinessConversionFlowStatus(businessConversionFlowStatus5.A01, businessConversionFlowStatus5.A00 - 1);
                    fBi.A00 = businessConversionFlowStatus;
                }
            }
            boolean z = false;
            if (bundle != null && bundle.getBoolean("EXTRA_FORCE_FETCH_FB_PAGES", false)) {
                z = true;
            }
            ConversionStep conversionStep = ConversionStep.CREATE_PAGE;
            if (A0n == conversionStep) {
                C49883FBi fBi2 = this.A01;
                str = "conversionLogic";
                if (fBi2 != null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus6 = fBi2.A00;
                    0qQ.A07(businessConversionFlowStatus6);
                    int i2 = businessConversionFlowStatus6.A00;
                    if (i2 < businessConversionFlowStatus6.A01.size() - 1) {
                        fBi2.A00 = FG6.A00(businessConversionFlowStatus6, i2 + 1, i2);
                        if (!z) {
                            this.A09.getValue();
                        }
                    } else {
                        throw DbT.A0m();
                    }
                }
            } else if (this.A08.contains(A0n)) {
                C49883FBi fBi3 = this.A01;
                str = "conversionLogic";
                if (fBi3 != null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus7 = fBi3.A00;
                    0qQ.A07(businessConversionFlowStatus7);
                    int i3 = businessConversionFlowStatus7.A00;
                    if (i3 < businessConversionFlowStatus7.A01.size() - 1) {
                        fBi3.A00 = FG6.A00(businessConversionFlowStatus7, i3 + 1, i3);
                    } else {
                        throw DbT.A0m();
                    }
                }
            }
            this.A08.remove(A0n);
            ConversionStep A0n2 = A0n();
            if (A0n2 == null) {
                finish();
                return;
            }
            if (A0n2 == ConversionStep.PAGE_SELECTION || A0n2 == conversionStep) {
                AnonymousClass0eM r0 = this.A09;
                r0.getValue();
                r0.getValue();
            }
            FragmentActivity fragmentActivity = ((FBS) this.A0E.getValue()).A0G;
            fragmentActivity.getSupportFragmentManager().A19(A0n2.name(), 0);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.business.activity.BusinessConversionActivity, android.app.Activity] */
    public final void finish() {
        BusinessConversionActivity.super.finish();
        if (AnonymousClass7TF.A1Z(this.A0G)) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.business.activity.BusinessConversionActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, X.4D6, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0185, code lost:
        X.Dba.A1F(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0188, code lost:
        r3 = com.instagram.business.controller.datamodel.ConversionStep.CHOOSE_CATEGORY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x018a, code lost:
        r1 = new com.instagram.business.controller.datamodel.BusinessConversionStep(X.C48092EVk.A03, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ac, code lost:
        r5.add(r1);
        r0 = X.DbZ.A0K(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b3, code lost:
        r1 = new com.instagram.business.controller.datamodel.BusinessConversionFlowStatus((java.util.List) r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = -2126359644(0xffffffff814253a4, float:-3.5692182E-38)
            int r4 = X.AnonymousClass0fD.A00(r0)
            X.0eM r6 = r9.A0D
            java.lang.Object r1 = r6.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "business_account_flow"
            int r7 = r1.getInt(r0)
            X.6qr[] r5 = X.C319586qr.values()
            int r3 = r5.length
            r2 = 0
        L_0x001b:
            if (r2 >= r3) goto L_0x01e1
            r1 = r5[r2]
            int r0 = r1.A00
            if (r0 != r7) goto L_0x01dd
            r9.A02 = r1
            r2 = 0
            java.lang.Object r1 = r6.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "only_show_nux_screens"
            boolean r8 = r1.getBoolean(r0, r2)
            java.lang.Object r1 = r6.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            r0 = 1821(0x71d, float:2.552E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r7 = r1.getBoolean(r0, r2)
            if (r10 == 0) goto L_0x012b
            java.lang.Class<com.instagram.business.controller.datamodel.BusinessConversionFlowStatus> r1 = com.instagram.business.controller.datamodel.BusinessConversionFlowStatus.class
            java.lang.String r0 = "conversion_flow_status"
            android.os.Parcelable r1 = X.C320236s2.A00(r10, r1, r0)
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = (com.instagram.business.controller.datamodel.BusinessConversionFlowStatus) r1
        L_0x004e:
            X.0eM r5 = r9.A0F
            r5.getValue()
            X.FBi r0 = new X.FBi
            r0.<init>(r1)
            r9.A01 = r0
            java.lang.String r3 = "conversionLogic"
            X.EtN r1 = new X.EtN
            r1.<init>(r9)
            java.util.Set r0 = r0.A01
            r0.add(r1)
            X.FBi r0 = r9.A01
            if (r0 == 0) goto L_0x0131
            X.EtO r1 = new X.EtO
            r1.<init>(r9)
            java.util.Set r0 = r0.A02
            r0.add(r1)
            if (r8 == 0) goto L_0x0096
            X.6qr r1 = r9.B6a()
            X.6qr r0 = X.C319586qr.PROFESSIONAL_SIGNUP_FLOW
            if (r1 != r0) goto L_0x0096
            X.0wW r0 = r9.getSession()
            com.instagram.common.session.UserSession r0 = X.0Gl.A00(r0)
            X.De2 r3 = new X.De2
            r3.<init>(r0, r9)
            r0 = 8
            X.EDg r1 = X.C47697EDg.A00(r9, r0)
            java.lang.String r0 = "conversion"
            r3.A02(r1, r0)
        L_0x0096:
            java.lang.Object r1 = r6.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            if (r10 == 0) goto L_0x0125
            java.lang.String r0 = "business_info"
            android.os.Parcelable r0 = r10.getParcelable(r0)
            com.instagram.model.business.BusinessInfo r0 = (com.instagram.model.business.BusinessInfo) r0
            if (r0 == 0) goto L_0x0125
            X.FEa r8 = new X.FEa
            r8.<init>(r0)
        L_0x00ad:
            java.lang.String r0 = "account_id"
            java.lang.String r7 = r1.getString(r0)
            java.lang.String r0 = "user_type"
            java.lang.String r6 = r1.getString(r0)
            java.lang.String r0 = "upsell_page_id"
            java.lang.String r3 = r1.getString(r0)
            X.0eM r0 = r9.A09
            java.lang.Object r1 = r0.getValue()
            X.FRU r1 = (X.FRU) r1
            r8.A0G = r7
            r8.A0I = r6
            r8.A0H = r3
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>(r8)
            r1.A02 = r0
            java.lang.String r1 = "EXTRA_FB_OVERRIDE_DATA"
            if (r10 == 0) goto L_0x00e0
            android.os.Parcelable r0 = r10.getParcelable(r1)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = (com.instagram.business.controller.datamodel.PageSelectionOverrideData) r0
            if (r0 != 0) goto L_0x00ea
        L_0x00e0:
            android.content.Intent r0 = r9.getIntent()
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = (com.instagram.business.controller.datamodel.PageSelectionOverrideData) r0
        L_0x00ea:
            r9.A03 = r0
            X.0eM r0 = r9.A0E
            java.lang.Object r1 = r0.getValue()
            X.FBS r1 = (X.FBS) r1
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r9.A03
            r1.A0E = r0
            super.onCreate(r10)
            java.lang.Object r0 = r5.getValue()
            X.EtT r0 = (X.EtT) r0
            X.0lg r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.0Gl.A00(r0)
            X.0qQ.A0B(r0, r2)
            X.FTv r3 = new X.FTv
            r3.<init>(r9, r2)
            X.0hq r2 = r9.getSupportFragmentManager()
            r0 = 3
            X.FQm r1 = new X.FQm
            r1.<init>(r3, r0)
            java.lang.String r0 = "page_linking_request"
            r2.A0v(r1, r9, r0)
            r0 = -1954870128(0xffffffff8b7b0c90, float:-4.8350293E-32)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x0125:
            X.FEa r8 = new X.FEa
            r8.<init>()
            goto L_0x00ad
        L_0x012b:
            X.6qr r5 = r9.A02
            if (r5 != 0) goto L_0x0139
            java.lang.String r3 = "_flowType"
        L_0x0131:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0139:
            X.0eM r0 = r9.A09
            java.lang.Object r0 = r0.getValue()
            X.FRU r0 = (X.FRU) r0
            int r1 = r0.A08
            r0 = -1
            boolean r3 = X.AnonymousClass7TF.A1S(r1, r0)
            X.0wW r1 = r9.getSession()
            r0 = 5
            X.0qQ.A0B(r1, r0)
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x0172;
                case 1: goto L_0x017c;
                case 2: goto L_0x0165;
                case 3: goto L_0x015d;
                case 4: goto L_0x0157;
                case 5: goto L_0x0192;
                case 6: goto L_0x0157;
                case 7: goto L_0x0157;
                case 8: goto L_0x015d;
                case 9: goto L_0x016a;
                default: goto L_0x0157;
            }
        L_0x0157:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x015d:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            com.instagram.business.controller.datamodel.ConversionStep r3 = com.instagram.business.controller.datamodel.ConversionStep.PAGE_SELECTION
            goto L_0x018a
        L_0x0165:
            com.google.common.collect.ImmutableList r0 = X.FBv.A00()
            goto L_0x01b3
        L_0x016a:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            com.instagram.business.controller.datamodel.ConversionStep r3 = com.instagram.business.controller.datamodel.ConversionStep.RENEW
            goto L_0x018a
        L_0x0172:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            if (r3 != 0) goto L_0x0188
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.INTRO
            goto L_0x0185
        L_0x017c:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            if (r3 != 0) goto L_0x0188
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.CREATOR_ACCOUNT_DESCRIPTION
        L_0x0185:
            X.Dba.A1F(r5, r0)
        L_0x0188:
            com.instagram.business.controller.datamodel.ConversionStep r3 = com.instagram.business.controller.datamodel.ConversionStep.CHOOSE_CATEGORY
        L_0x018a:
            X.EVk r0 = X.C48092EVk.NEXT
            com.instagram.business.controller.datamodel.BusinessConversionStep r1 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r1.<init>(r0, r3)
            goto L_0x01ac
        L_0x0192:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            if (r8 == 0) goto L_0x01ba
            r5.<init>()
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.SAVE_LOGIN_INFO
            X.EVk r3 = X.C48092EVk.NEXT
            com.instagram.business.controller.datamodel.BusinessConversionStep r0 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r0.<init>(r3, r1)
            r5.add(r0)
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.ACCOUNT_TYPE_SELECTION_V2
        L_0x01a7:
            com.instagram.business.controller.datamodel.BusinessConversionStep r1 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r1.<init>(r3, r0)
        L_0x01ac:
            r5.add(r1)
            com.google.common.collect.ImmutableList r0 = X.DbZ.A0K(r5)
        L_0x01b3:
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = new com.instagram.business.controller.datamodel.BusinessConversionFlowStatus
            r1.<init>((java.util.List) r0)
            goto L_0x004e
        L_0x01ba:
            r5.<init>()
            if (r7 == 0) goto L_0x01c4
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.PROFESSIONAL_ACCOUNT_SELECTION
            X.Dba.A1F(r5, r0)
        L_0x01c4:
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.INTRO
            X.EVk r3 = X.C48092EVk.NEXT
            com.instagram.business.controller.datamodel.BusinessConversionStep r0 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r0.<init>(r3, r1)
            r5.add(r0)
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.CHOOSE_CATEGORY
            com.instagram.business.controller.datamodel.BusinessConversionStep r0 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r0.<init>(r3, r1)
            r5.add(r0)
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.REGULAR_SIGNUP_FLOW
            goto L_0x01a7
        L_0x01dd:
            int r2 = r2 + 1
            goto L_0x001b
        L_0x01e1:
            java.lang.String r0 = "Unsupported BusinessAccountFlowType"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.activity.BusinessConversionActivity.onCreate(android.os.Bundle):void");
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(780452469);
        super.onResume();
        FV8.A00().A03(getSession(), (C46634DiE) null);
        if (this.A06) {
            Clz((Bundle) null);
            this.A06 = false;
        } else if (this.A05) {
            A0p((Bundle) null, true);
            this.A05 = false;
        }
        AnonymousClass0fD.A07(-51052771, A002);
    }

    public final void schedule(AnonymousClass11X r1, int i, int i2, boolean z, boolean z2) {
        schedule(r1);
    }
}
