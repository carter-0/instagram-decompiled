package com.instagram.business.promote.activity;

import X.002;
import X.0Aj;
import X.0Tu;
import X.0Yt;
import X.0bb;
import X.0eP;
import X.0gy;
import X.0mp;
import X.0qQ;
import X.0sP;
import X.0sn;
import X.15p;
import X.182;
import X.1ES;
import X.1Ln;
import X.1NY;
import X.1OC;
import X.1QP;
import X.2IS;
import X.2dZ;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass07a;
import X.AnonymousClass07i;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass1O9;
import X.AnonymousClass3JR;
import X.AnonymousClass3Jb;
import X.AnonymousClass4D7;
import X.AnonymousClass4DS;
import X.AnonymousClass4KJ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13717Tfi;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C15254UXo;
import X.C15275UZd;
import X.C15317UaP;
import X.C15408UcK;
import X.C15414UcQ;
import X.C15415UcR;
import X.C15422UcY;
import X.C16616UyC;
import X.C16678UzE;
import X.C16902VAf;
import X.C18137VmD;
import X.C18476VsS;
import X.C18676VwZ;
import X.C18779W1e;
import X.C18784W1k;
import X.C19026WHc;
import X.C19040WHs;
import X.C20606Wvn;
import X.C20703Wxa;
import X.C239113Fa;
import X.C268654dm;
import X.C268674do;
import X.C305796Jo;
import X.C305936Kd;
import X.C309516Yo;
import X.C359988do;
import X.C360678ey;
import X.C363088j4;
import X.C3724090s;
import X.C45534Cy8;
import X.C45535Cy9;
import X.C51967G9n;
import X.C51970G9q;
import X.C58728Iwb;
import X.C59703JUk;
import X.C62666KkS;
import X.CD1;
import X.CEY;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbY;
import X.Dba;
import X.JTO;
import X.Pxf;
import X.UJX;
import X.UKM;
import X.UKW;
import X.V1P;
import X.VA2;
import X.W2x;
import X.W3M;
import X.W3x;
import X.WGU;
import X.WOI;
import X.WOQ;
import X.WT6;
import X.WT9;
import X.X3Q;
import X.X3R;
import X.X3S;
import X.X6Q;
import X.X6R;
import X.X7g;
import X.XA9;
import X.XAI;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.model.mediatype.ProductType;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class PromoteActivity extends BaseFragmentActivity implements XAI, XA9, X7g, X6R, C13717Tfi, X6Q, X3Q, X3S {
    public PromoteData A00;
    public PromoteState A01;
    public SpinnerImageView A02;
    public boolean A03;
    public PermissionsModule A04;
    public final AnonymousClass0eM A05 = C20703Wxa.A00(this, 41);
    public final AnonymousClass0eM A06 = C20703Wxa.A00(this, 42);
    public final AnonymousClass0eM A07 = C20703Wxa.A00(this, 43);
    public final AnonymousClass0eM A08 = C20703Wxa.A00(this, 44);
    public final AnonymousClass0eM A09 = C20703Wxa.A00(this, 45);
    public final AnonymousClass0eM A0A = C20703Wxa.A00(this, 46);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, android.content.Context, com.instagram.business.promote.activity.PromoteActivity, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.0rk] */
    public static final void A06(PromoteActivity promoteActivity) {
        String str;
        List A1I;
        String str2;
        String str3;
        ? r2 = promoteActivity;
        if (!promoteActivity.A03) {
            AnonymousClass0eM r11 = promoteActivity.A0A;
            UserSession A0l = AnonymousClass7TE.A0l(r11);
            0qQ.A0B(A0l, 0);
            if (182.A06(0Tu.A05, A0l, 36322181939996656L)) {
                WT9 A002 = C18137VmD.A00(promoteActivity);
                C15414UcQ ucQ = C15414UcQ.A00;
                WT9.A01(ucQ, A002, "launch_posm_2_from_native_start");
                0gy A003 = AnonymousClass07i.A00(promoteActivity);
                UserSession A0l2 = AnonymousClass7TE.A0l(r11);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                AnonymousClass0eM r9 = promoteActivity.A07;
                jSONObject2.put("flow_id", C13990Tnq.A0M(r9).A03);
                jSONObject2.put("flow", "promote_no_cache_prevalidation");
                Integer A012 = promoteActivity.A01();
                if (A012 != null) {
                    str3 = VA2.A00(A012);
                } else {
                    str3 = null;
                }
                jSONObject2.put("referral_code", str3);
                PromoteData promoteData = promoteActivity.A00;
                str = "promoteData";
                if (promoteData != null) {
                    jSONObject2.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, promoteData.A1K);
                    long j = ucQ.A00;
                    if (j != 0) {
                        int i = (int) (j >>> 32);
                        if (Integer.valueOf(i) != null) {
                            jSONObject2.put("boost_in_app_qpl_instance_id", i);
                        }
                    }
                    UserSession A0l3 = AnonymousClass7TE.A0l(r11);
                    0qQ.A0B(A0l3, 0);
                    if (DbY.A1Z(0Tu.A06, A0l3, 36320975054185457L)) {
                        PromoteData promoteData2 = r2.A00;
                        if (promoteData2 != null) {
                            String str4 = promoteData2.A1b;
                            if (str4 != null) {
                                jSONObject2.put("selected_audio_spec", str4);
                                C13990Tnq.A0M(r9).A0R("NONNULL_AUDIO_SPEC_STEP", "no_cache_prevalidation_flow");
                            }
                            PromoteData promoteData3 = r2.A00;
                            if (promoteData3 != null) {
                                jSONObject2.put("media_id", promoteData3.A1S);
                                PromoteData promoteData4 = r2.A00;
                                if (promoteData4 != null) {
                                    jSONObject2.put("coupon_offer_id", promoteData4.A1H);
                                }
                            }
                        }
                    }
                    jSONObject.put("server_params", jSONObject2);
                    C360678ey A022 = C359988do.A02((AnonymousClass1O9) null, A0l2, "com.bloks.www.ig_boost.no_cache_prevalidation.async_controller", DbY.A0m("params", jSONObject.toString()));
                    A022.A00(new C15408UcK(r2, 1));
                    1ES.A00(r2, A003, A022);
                    return;
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        AnonymousClass0eM r4 = promoteActivity.A0A;
        UserSession A0l4 = AnonymousClass7TE.A0l(r4);
        0qQ.A0B(A0l4, 0);
        boolean A1Z = DbY.A1Z(0Tu.A05, A0l4, 36320975054185457L);
        WT9 A004 = C18137VmD.A00(promoteActivity);
        C15414UcQ ucQ2 = C15414UcQ.A00;
        if (A1Z) {
            WT9.A01(ucQ2, A004, "bfa_launcher_checked");
            WT9.A01(ucQ2, C18137VmD.A00(promoteActivity), "launch_bfa_from_native_start");
            0gy A005 = AnonymousClass07i.A00(promoteActivity);
            UserSession A0l5 = AnonymousClass7TE.A0l(r4);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            PromoteData promoteData5 = promoteActivity.A00;
            str = "promoteData";
            if (promoteData5 != null) {
                jSONObject4.put("media_igid", promoteData5.A1S);
                PromoteData promoteData6 = r2.A00;
                if (promoteData6 != null) {
                    jSONObject4.put("coupon_offer_id", promoteData6.A1H);
                    PromoteData promoteData7 = r2.A00;
                    if (promoteData7 != null) {
                        if (promoteData7.A0D()) {
                            PromoteData promoteData8 = r2.A00;
                            if (promoteData8 != null) {
                                jSONObject4.put("ab_test_media_igids", new JSONArray(promoteData8.A1v));
                            }
                        }
                        PromoteData promoteData9 = r2.A00;
                        if (promoteData9 != null) {
                            if (promoteData9.A1b == null) {
                                C13990Tnq.A0M(r2.A07).A0R("NULL_SELECTED_AUDIO_SPEC", "bfa_android_entrypoint");
                            }
                            jSONObject4.put("flow_id", C13990Tnq.A0M(r2.A07).A03);
                            jSONObject4.put("bfa_callsite_for_logging", "native_android");
                            Integer A013 = r2.A01();
                            if (A013 != null) {
                                str2 = VA2.A00(A013);
                            } else {
                                str2 = null;
                            }
                            jSONObject4.put("referral_code", str2);
                            JSONObject jSONObject5 = new JSONObject();
                            PromoteData promoteData10 = r2.A00;
                            if (promoteData10 != null) {
                                jSONObject5.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, promoteData10.A1K);
                                long j2 = ucQ2.A00;
                                if (j2 != 0) {
                                    int i2 = (int) (j2 >>> 32);
                                    if (Integer.valueOf(i2) != null) {
                                        jSONObject5.put("boost_in_app_qpl_instance_id", i2);
                                    }
                                }
                                PromoteData promoteData11 = r2.A00;
                                if (promoteData11 != null) {
                                    jSONObject5.put("selected_audio_spec", promoteData11.A1b);
                                    jSONObject4.put("extra_data", jSONObject5);
                                    jSONObject3.put("server_params", jSONObject4);
                                    C360678ey A023 = C359988do.A02((AnonymousClass1O9) null, A0l5, "com.bloks.www.ig.boost.initialization", DbY.A0m("params", jSONObject3.toString()));
                                    A023.A00(new C15408UcK(r2, 0));
                                    1ES.A00(r2, A005, A023);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            WT9.A01(ucQ2, A004, "bfa_launcher_checked");
            C18476VsS vsS = (C18476VsS) promoteActivity.A08.getValue();
            PromoteData promoteData12 = promoteActivity.A00;
            if (promoteData12 == null) {
                str = "promoteData";
            } else {
                String str5 = promoteData12.A1K;
                0qQ.A06(str5);
                AnonymousClass0eM r3 = promoteActivity.A07;
                String str6 = C13990Tnq.A0M(r3).A03;
                0qQ.A07(str6);
                C18476VsS.A00(vsS).markerEnd(409679146, 2);
                1Ln r1 = vsS.A00;
                r1.A0l("pro_identity_boost_onboarding_complete");
                r1.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5);
                r1.A0R("flow_id", str6);
                r1.Cgf();
                UserSession A0l6 = AnonymousClass7TE.A0l(r4);
                0qQ.A0B(A0l6, 0);
                WT6 wt6 = (WT6) A0l6.A01(WT6.class, new C20606Wvn(A0l6, 19));
                long j3 = wt6.A00;
                if (j3 != 0) {
                    wt6.A01.flowEndCancel(j3, CancelReason.USER_CANCELLED);
                    wt6.A00 = 0;
                }
                1QP r92 = wt6.A01;
                long flowStartForMarker = r92.flowStartForMarker(468331342, "boost_goal_rendered", true);
                wt6.A00 = flowStartForMarker;
                r92.flowMarkPoint(flowStartForMarker, "navigation_start");
                WT9.A01(ucQ2, C18137VmD.A00(promoteActivity), "fetch_init_promote_start");
                WGU A0M = C13990Tnq.A0M(r3);
                C16678UzE uzE = C16678UzE.OBJECTIVE;
                A0M.A0R(uzE.toString(), "initial_fetch");
                PromoteData promoteData13 = promoteActivity.A00;
                str = "promoteData";
                if (promoteData13 != null) {
                    int size = promoteData13.A1v.size();
                    PromoteData promoteData14 = r2.A00;
                    if (size > 0) {
                        if (promoteData14 != null) {
                            A1I = promoteData14.A1v;
                            0qQ.A06(A1I);
                        }
                    } else if (promoteData14 != null) {
                        A1I = AnonymousClass7TE.A1I(promoteData14.A1S);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ? obj = new Object();
                    obj.A00 = A1I.size();
                    AnonymousClass7TE.A1Z(new C59703JUk((AnonymousClass4D7) null, (Object) r2, (Object) A1I, (Object) linkedHashMap, (Object) obj, 19), AnonymousClass07a.A00(r2));
                    AnonymousClass0eM r32 = r2.A05;
                    ((C18784W1k) r32.getValue()).A07(uzE.toString());
                    if (AnonymousClass0t1.A01.A01(AnonymousClass7TE.A0l(r4)).A1d()) {
                        ((C18784W1k) r32.getValue()).A05(new WOQ(r2));
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0j(Bundle bundle) {
    }

    public final void Clv(String str, String str2) {
        0qQ.A0B(str2, 1);
        WT9 A002 = C18137VmD.A00(this);
        C15414UcQ ucQ = C15414UcQ.A00;
        WT9.A01(ucQ, A002, 002.A0R(str2, "_screen_rendering_success"));
        C15415UcR ucR = C15415UcR.A00;
        WT9.A01(ucR, A002, 002.A0R(str2, "_screen_rendering_success"));
        WT9 A003 = C18137VmD.A00(this);
        1QP r7 = A003.A00;
        r7.flowAnnotate(ucR.A00, "analytic_module", str);
        r7.flowAnnotate(ucR.A00, "destination_screen", str2);
        WT9.A01(ucR, A003, "navigation_success");
        long j = ucR.A00;
        if (j != 0) {
            r7.flowEndSuccess(j);
            ucR.A00 = 0;
        }
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            if (!promoteData.A2U) {
                AnonymousClass0eM r72 = this.A07;
                WGU A0M = C13990Tnq.A0M(r72);
                PromoteData promoteData2 = this.A00;
                if (promoteData2 != null) {
                    String str3 = promoteData2.A1S;
                    C16616UyC uyC = promoteData2.A12;
                    A0M.A02 = str3;
                    0bb r9 = new 0bb();
                    C13990Tnq.A17(r9, A0M);
                    LinkingAuthState linkingAuthState = A0M.A00;
                    if (linkingAuthState == null) {
                        linkingAuthState = LinkingAuthState.BUSINESS_TOKEN_OR_UNKNOWN;
                    }
                    r9.A06("token_auth_state", linkingAuthState.toString());
                    if (uyC != null) {
                        r9.A06("media_boosted_status", uyC.toString());
                    }
                    0Aj A0e = AnonymousClass7TE.A0e(A0M.A05, "promoted_posts_enter");
                    A0e.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0M.A01);
                    C13989Tnp.A1G(A0e, A0M, "waterfall_id", A0M.A03);
                    DbS.A1H(A0e, str2);
                    A0e.AAK(r9, "configurations");
                    A0e.A8M(V1P.IG_ANDROID, "creation_platform_id");
                    A0e.AAJ("bfa_platform", "native_android");
                    A0e.Cgf();
                    PromoteData promoteData3 = this.A00;
                    if (promoteData3 != null) {
                        if (promoteData3.A2C) {
                            WGU A0M2 = C13990Tnq.A0M(r72);
                            PromoteData promoteData4 = this.A00;
                            if (promoteData4 != null) {
                                ProductType productType = promoteData4.A17;
                                String str4 = promoteData4.A1S;
                                HashMap hashMap = new HashMap();
                                hashMap.put("media_igid", str4);
                                0Aj A0e2 = AnonymousClass7TE.A0e(A0M2.A05, AnonymousClass000.A00(302));
                                C62666KkS kkS = null;
                                if (productType != null) {
                                    int ordinal = productType.ordinal();
                                    if (ordinal == 1) {
                                        kkS = C62666KkS.BIO_IG_POST;
                                    } else if (ordinal == 9) {
                                        kkS = C62666KkS.BIO_IG_STORY;
                                    } else if (ordinal == 13) {
                                        kkS = C62666KkS.BIO_IG_REELS;
                                    }
                                }
                                A0e2.A8M(kkS, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                                A0e2.A9H("extra_data", hashMap);
                                A0e2.AAJ("event", "seller_boost_bio_started");
                                A0e2.Cgf();
                            }
                        }
                        1QP r73 = C18137VmD.A00(this).A00;
                        r73.flowAnnotate(ucQ.A00, "analytic_module", str);
                        r73.flowAnnotate(ucQ.A00, "initial_screen", str2);
                        long j2 = ucQ.A00;
                        if (j2 != 0) {
                            r73.flowEndSuccess(j2);
                            ucQ.A00 = 0;
                        }
                        PromoteData promoteData5 = this.A00;
                        if (promoteData5 != null) {
                            promoteData5.A2U = true;
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Clw(String str) {
        0qQ.A0B(str, 0);
        WT9 A002 = C18137VmD.A00(this);
        C15415UcR ucR = C15415UcR.A00;
        if (ucR.A00 != 0) {
            WT9.A00(ucR, A002);
        }
        1QP r3 = A002.A00;
        long flowStartForMarker = r3.flowStartForMarker(ucR.A01, str, true);
        ucR.A00 = flowStartForMarker;
        r3.flowAnnotate(flowStartForMarker, "source_screen", str);
        WT9.A01(ucR, A002, "navigation_start");
    }

    public final void Clx(String str) {
        0qQ.A0B(str, 0);
        WT9 A002 = C18137VmD.A00(this);
        WT9.A01(C15414UcQ.A00, A002, 002.A0R(str, "_screen_rendering_start"));
        WT9.A01(C15415UcR.A00, A002, 002.A0R(str, "_screen_rendering_start"));
    }

    public final void Dab(PromoteState promoteState, Integer num) {
        AnonymousClass7TF.A1H(promoteState, num);
        int intValue = num.intValue();
        boolean z = false;
        if (intValue == 0 || intValue == 3) {
            PromoteData promoteData = this.A00;
            if (promoteData == null) {
                0qQ.A0F("promoteData");
                throw AnonymousClass00P.createAndThrow();
            }
            String str = promoteData.A1Z;
            if (str != null) {
                z = W3x.A0S(promoteData, str);
            }
            promoteState.A0D(z);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.business.promote.activity.PromoteActivity, android.app.Activity] */
    public final void EHZ(PermissionsModule permissionsModule, String[] strArr, int i) {
        0qQ.A0B(strArr, 0);
        this.A04 = permissionsModule;
        requestPermissions(strArr, i);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        0qQ.A0B(bundle, 0);
        PromoteData promoteData = this.A00;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            bundle.putParcelable("PromoteActivity.saveInstanceState.PromoteData", promoteData);
            PromoteState promoteState = this.A01;
            if (promoteState == null) {
                str = "promoteState";
            } else {
                bundle.putParcelable("PromoteActivity.saveInstanceState.PromoteState", promoteState);
                bundle.putBoolean("PromoteActivity.saveInstanceState.hasGoneThroughNoCachePrevalidationBloksFlow", this.A03);
                super.onSaveInstanceState(bundle);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final WGU A00(PromoteActivity promoteActivity) {
        return C13990Tnq.A0M(promoteActivity.A07);
    }

    private final Integer A01() {
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            String str = promoteData.A1K;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2039677941:
                        if (str.equals("ad_tools_ctd_aymt")) {
                            return AnonymousClass05K.A0N;
                        }
                        break;
                    case -1541613254:
                        if (str.equals("messaging_hub")) {
                            return AnonymousClass05K.A0j;
                        }
                        break;
                    case 481190433:
                        if (str.equals("direct_ctd_aymt")) {
                            return AnonymousClass05K.A0C;
                        }
                        break;
                    case 1097160416:
                        if (str.equals("messaging_hub_ctwa")) {
                            return AnonymousClass05K.A0u;
                        }
                        break;
                }
            }
            if (promoteData.A2h) {
                return AnonymousClass05K.A0Y;
            }
            if (promoteData.A2g) {
                return AnonymousClass05K.A01;
            }
            if (!0qQ.A0K(str, "aymt_dropoff")) {
                return null;
            }
            PromoteData promoteData2 = this.A00;
            if (promoteData2 != null) {
                String str2 = promoteData2.A1Y;
                if (str2 == null) {
                    return null;
                }
                Integer num = AnonymousClass05K.A15;
                if (!str2.equals("aymt_ctwa_dropoff")) {
                    num = AnonymousClass05K.A1F;
                    if (!str2.equals("aymt_ctd_dropoff")) {
                        num = AnonymousClass05K.A02;
                        if (!str2.equals("aymt_pv_dropoff")) {
                            num = AnonymousClass05K.A1I;
                            if (str2.equals("aymt_wv_dropoff")) {
                                return num;
                            }
                            return null;
                        }
                    }
                }
                return num;
            }
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(PromoteActivity promoteActivity) {
        SpinnerImageView spinnerImageView = promoteActivity.A02;
        if (spinnerImageView == null) {
            0qQ.A0F("loadingSpinner");
            throw AnonymousClass00P.createAndThrow();
        } else {
            JTO.A1X(spinnerImageView);
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, android.content.Context, com.instagram.business.promote.activity.PromoteActivity, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(com.instagram.business.promote.activity.PromoteActivity r11) {
        /*
            X.0eM r0 = r11.A08
            java.lang.Object r5 = r0.getValue()
            X.VsS r5 = (X.C18476VsS) r5
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            java.lang.String r9 = "promoteData"
            if (r0 == 0) goto L_0x0113
            java.lang.String r4 = r0.A1K
            X.0qQ.A06(r4)
            X.0eM r3 = r11.A07
            X.WGU r0 = X.C13990Tnq.A0M(r3)
            java.lang.String r2 = r0.A03
            X.0qQ.A07(r2)
            r6 = 0
            X.1Ln r1 = r5.A00
            java.lang.String r0 = "pro_identity_open_pro2pro_bloks"
            r1.A0l(r0)
            java.lang.String r0 = "entry_point"
            r1.A0R(r0, r4)
            java.lang.String r0 = "flow_id"
            r1.A0R(r0, r2)
            r1.Cgf()
            X.02m r1 = X.C18476VsS.A00(r5)
            r2 = 409679146(0x186b352a, float:3.039988E-24)
            java.lang.String r0 = "pro_identity_launch_pro2pro_bloks"
            r1.markerPoint(r2, r0)
            X.02m r1 = X.C18476VsS.A00(r5)
            r0 = 1404(0x57c, float:1.967E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.markerAnnotate(r2, r0, r6)
            X.WT9 r2 = X.C18137VmD.A00(r11)
            X.UcQ r1 = X.C15414UcQ.A00
            java.lang.String r0 = "launch_posm_1_from_native_start"
            X.WT9.A01(r1, r2, r0)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = r0.A1b
            if (r0 == 0) goto L_0x006e
            X.WGU r2 = X.C13990Tnq.A0M(r3)
            r0 = 2375(0x947, float:3.328E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "posm1_bfa"
            r2.A0R(r1, r0)
        L_0x006e:
            X.0gy r5 = X.AnonymousClass07i.A00(r11)
            X.0eM r0 = r11.A0A
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0113
            java.lang.String r8 = r0.A1K
            X.0qQ.A06(r8)
            X.WGU r0 = X.C13990Tnq.A0M(r3)
            java.lang.String r7 = r0.A03
            X.0qQ.A07(r7)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0113
            java.lang.String r2 = r0.A1b
            r0 = 1
            X.0qQ.A0B(r4, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            java.lang.String r1 = "pro2pro_promote_ad_account_linking"
            java.util.LinkedHashMap r10 = X.C18678Vwb.A02(r2)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.Uxg r0 = X.C16586Uxg.ENTRY_POINT
            X.AnonymousClass7TF.A1I(r0, r8, r9)
            X.Uxg r0 = X.C16586Uxg.FLOW
            X.AnonymousClass7TF.A1I(r0, r1, r9)
            X.Uxg r0 = X.C16586Uxg.FLOW_ID
            X.AnonymousClass7TF.A1I(r0, r7, r9)
            X.Uxg r1 = X.C16586Uxg.STEPPER_COUNT
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.AnonymousClass7TF.A1I(r1, r0, r9)
            X.Uxg r8 = X.C16586Uxg.EXTRA_DATA
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.util.Iterator r2 = X.Pxf.A0u(r10)
        L_0x00c5:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.Object r0 = r10.get(r1)
            r7.put(r1, r0)
            goto L_0x00c5
        L_0x00d7:
            X.AnonymousClass7TF.A1I(r8, r7, r9)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.util.Iterator r1 = r9.iterator()
        L_0x00e3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ed
            X.C13991Tnr.A1U(r1, r2)
            goto L_0x00e3
        L_0x00ed:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "server_params"
            r1.put(r0, r2)
            java.lang.String r1 = X.DbT.A10(r1)
            java.lang.String r0 = "params"
            java.util.HashMap r1 = X.DbY.A0m(r0, r1)
            java.lang.String r0 = "com.bloks.www.ig_promote.linking.async_flow_controller"
            X.8ey r1 = X.C359988do.A05(r4, r0, r1)
            X.UcM r0 = new X.UcM
            r0.<init>(r6, r11, r3, r4)
            r1.A00(r0)
            X.1ES.A00(r11, r5, r1)
            return
        L_0x0113:
            X.0qQ.A0F(r9)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.activity.PromoteActivity.A05(com.instagram.business.promote.activity.PromoteActivity):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.instagram.business.promote.activity.PromoteActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(com.instagram.business.promote.activity.PromoteActivity r1, java.lang.String r2) {
        /*
            if (r2 != 0) goto L_0x0009
            r0 = 2131970713(0x7f134a99, float:1.9578385E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
        L_0x0009:
            X.C59689JTv.A09(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.activity.PromoteActivity.A08(com.instagram.business.promote.activity.PromoteActivity, java.lang.String):void");
    }

    public final UserSession A0n() {
        return AnonymousClass7TE.A0l(this.A0A);
    }

    public final void AMi(C16678UzE uzE, X3R x3r) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String obj;
        String str6;
        Date date;
        0sn arrayList;
        String str7;
        String str8;
        HashMap hashMap;
        0sn r32;
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            C16678UzE uzE2 = uzE;
            X3R x3r2 = x3r;
            if (promoteData.A0D()) {
                UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
                PromoteData promoteData2 = this.A00;
                if (promoteData2 != null) {
                    List A022 = A02();
                    C15422UcY ucY = new C15422UcY(uzE2, C13990Tnq.A0M(this.A07), this, x3r2, 1);
                    0qQ.A0B(A0l, 0);
                    XIGIGBoostDestination xIGIGBoostDestination = promoteData2.A0i;
                    XIGIGBoostDestination xIGIGBoostDestination2 = xIGIGBoostDestination;
                    if (xIGIGBoostDestination != null) {
                        List list = promoteData2.A1v;
                        0qQ.A06(list);
                        Currency currency = promoteData2.A1j;
                        0qQ.A06(currency);
                        String str9 = promoteData2.A1A;
                        0qQ.A06(str9);
                        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus = promoteData2.A0a;
                        XIGIGBoostCallToAction A012 = C18779W1e.A01(promoteData2);
                        int i2 = promoteData2.A0I;
                        int i3 = promoteData2.A0A;
                        boolean z = promoteData2.A2v;
                        boolean contains = promoteData2.A21.contains(SpecialRequirementCategory.A08);
                        boolean z2 = promoteData2.A2r;
                        boolean z3 = promoteData2.A2c;
                        boolean z4 = promoteData2.A2K;
                        ArrayList A0J = W3x.A0J(promoteData2.A0i, A0l, promoteData2.A2e);
                        AdCreativeAuthorizationCategory adCreativeAuthorizationCategory = promoteData2.A0k;
                        0qQ.A06(adCreativeAuthorizationCategory);
                        String str10 = promoteData2.A1b;
                        List A002 = C16902VAf.A00(promoteData2);
                        PromoteData.A02(promoteData2);
                        if (AnonymousClass4KJ.A00(promoteData2.A20)) {
                            arrayList = 0sn.A00;
                        } else {
                            arrayList = new ArrayList();
                            for (Object A1X : promoteData2.A20) {
                                DbU.A1X(A1X, arrayList);
                            }
                        }
                        ArrayList A0A2 = promoteData2.A0A();
                        if (W3x.A0P(promoteData2.A06())) {
                            str7 = null;
                        } else {
                            str7 = promoteData2.A1Z;
                        }
                        String str11 = promoteData2.A1I;
                        PromoteAudience A072 = promoteData2.A07();
                        if (A072 != null) {
                            str8 = A072.A06;
                        } else {
                            str8 = null;
                        }
                        String str12 = promoteData2.A1J;
                        0sn A032 = promoteData2.A03();
                        XIGIGBoostDestination xIGIGBoostDestination3 = promoteData2.A0j;
                        if (182.A06(0Tu.A05, A0l, 36318539807791330L)) {
                            PromoteAudience A073 = promoteData2.A07();
                            if (A073 == null || !A073.A0C) {
                                hashMap = null;
                            } else {
                                hashMap = new HashMap();
                                hashMap.put("beneficiary", promoteData2.A1C);
                                hashMap.put("payor", promoteData2.A1D);
                            }
                        } else {
                            hashMap = null;
                        }
                        WGU.A00(A0l).A0R(uzE2.toString(), "create_promotion_attempt");
                        ArrayList A0r = AnonymousClass7TG.A0r(list);
                        for (Object next : list) {
                            String str13 = WGU.A00(A0l).A03;
                            0qQ.A07(str13);
                            if (A032 == null) {
                                r32 = 0sn.A00;
                            } else {
                                r32 = A032;
                            }
                            LinkedHashMap A074 = 0Yt.A07(new 0eP[]{new 0eP("fb_auth_token", str9), new 0eP("flow_id", str13), new 0eP("media_id", next), new 0eP("destination", xIGIGBoostDestination2.toString()), new 0eP("authorization_category", adCreativeAuthorizationCategory.toString()), new 0eP("call_to_action", A012.toString()), new 0eP("total_budget_with_offset", String.valueOf(i2)), new 0eP("duration_in_days", String.valueOf(i3)), new 0eP("run_continuously", Boolean.valueOf(z)), new 0eP("is_political_ad", Boolean.valueOf(contains)), new 0eP("is_story_placement_eligible", Boolean.valueOf(z2)), new 0eP("is_explore_placement_eligible", Boolean.valueOf(z3)), new 0eP("has_product_tags", Boolean.valueOf(z4)), new 0eP("instagram_positions", A022), new 0eP("currency", currency.getCurrencyCode()), new 0eP("additional_publisher_platforms", A0J), new 0eP("regulated_categories", r32), new 0eP("messaging_destinations", arrayList)});
                            if (hashMap != null) {
                                A074.put("dsa_data", hashMap);
                            }
                            if (A002 != null) {
                                A074.put("profile_visit_enabled_secondary_cta", A002);
                            }
                            if (A0A2 != null) {
                                A074.put("ad_format_preferences", A0A2);
                            }
                            if (xFBCTXWelcomeMessageStatus != null) {
                                A074.put("ctx_welcome_message_status_v2", xFBCTXWelcomeMessageStatus.toString());
                            }
                            if (str10 != null) {
                                A074.put("selected_audio_spec", new JSONObject(str10));
                            }
                            if (str11 != null) {
                                A074.put("website_url", str11);
                            }
                            if (str7 != null) {
                                A074.put("audience_id", str7);
                            }
                            if (str8 != null) {
                                A074.put("regulated_target_spec_string", new JSONObject(str8));
                            }
                            if (str12 != null) {
                                A074.put("draft_id", str12);
                            }
                            if (xIGIGBoostDestination3 != null) {
                                A074.put("messaging_tool_selected", xIGIGBoostDestination3.toString());
                            }
                            A0r.add(new JSONObject(0Yt.A0B(A074)));
                        }
                        String A0k = C51970G9q.A0k(A0r);
                        0qQ.A07(A0k);
                        1NY A0a = AnonymousClass7TG.A0a(A0l);
                        C13990Tnq.A1C(A0a, "ads/promote/create_promotion_split_test/", str9);
                        A0a.A9m("promotion_requests", A0k);
                        1OC A0R = DbT.A0R((15p) null, A0a, CD1.class, C45535Cy9.class, false);
                        ucY.A02 = W2x.A01("/api/v1/ads/promote/create_promotion_split_test/");
                        A0R.A00 = ucY;
                        1ES.A03(A0R);
                        return;
                    }
                    return;
                }
            } else {
                C18784W1k w1k = (C18784W1k) this.A05.getValue();
                String A0k2 = C51970G9q.A0k(A02());
                C15422UcY ucY2 = new C15422UcY(uzE2, C13990Tnq.A0M(this.A07), this, x3r2, 0);
                UserSession userSession = w1k.A08;
                WGU.A00(userSession).A0R(uzE2.toString(), "create_promotion_attempt");
                PromoteData promoteData3 = w1k.A03;
                ArrayList A0J2 = W3x.A0J(promoteData3.A0i, userSession, promoteData3.A2e);
                String str14 = null;
                if (W3x.A0P(promoteData3.A06())) {
                    str = null;
                } else {
                    str = promoteData3.A1Z;
                }
                LeadForm leadForm = promoteData3.A16;
                if (leadForm == null) {
                    str2 = null;
                } else {
                    str2 = leadForm.A03;
                }
                0qQ.A0B(userSession, 0);
                if (182.A06(0Tu.A05, userSession, 36318539807791330L)) {
                    PromoteAudience A075 = promoteData3.A07();
                    if (A075 == null || !A075.A0C) {
                        str3 = null;
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("beneficiary", promoteData3.A1C);
                        hashMap2.put("payor", promoteData3.A1D);
                        str3 = Pxf.A0f(hashMap2);
                    }
                } else {
                    str3 = null;
                }
                PromoteAudience A076 = promoteData3.A07();
                if (A076 != null) {
                    str14 = A076.A06;
                }
                if (!w1k.A04.A09 || (date = promoteData3.A1k) == null) {
                    i = -1;
                } else {
                    i = (int) AnonymousClass7TE.A0P(date.getTime());
                }
                Currency currency2 = promoteData3.A1j;
                String str15 = promoteData3.A1A;
                String str16 = w1k.A02.A03;
                String str17 = promoteData3.A1S;
                XIGIGBoostDestination xIGIGBoostDestination4 = promoteData3.A0i;
                XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus2 = promoteData3.A0a;
                XIGIGBoostCallToAction A013 = C18779W1e.A01(promoteData3);
                int i4 = promoteData3.A0I;
                int i5 = promoteData3.A0A;
                boolean z5 = promoteData3.A2v;
                boolean contains2 = promoteData3.A21.contains(SpecialRequirementCategory.A08);
                boolean z6 = promoteData3.A2r;
                boolean z7 = promoteData3.A2c;
                boolean z8 = promoteData3.A2K;
                AdCreativeAuthorizationCategory adCreativeAuthorizationCategory2 = promoteData3.A0k;
                String str18 = promoteData3.A1b;
                List A003 = C16902VAf.A00(promoteData3);
                if (A003 != null) {
                    str4 = C51970G9q.A0k(A003);
                } else {
                    str4 = null;
                }
                String A092 = promoteData3.A09();
                ArrayList A0A3 = promoteData3.A0A();
                if (A0A3 != null) {
                    str5 = Pxf.A0f(A0A3);
                } else {
                    str5 = null;
                }
                String str19 = promoteData3.A1I;
                String str20 = null;
                String str21 = promoteData3.A1J;
                ImmutableList A033 = promoteData3.A03();
                XIGIGBoostDestination xIGIGBoostDestination5 = promoteData3.A0j;
                if (AnonymousClass4KJ.A00(promoteData3.A1x)) {
                    obj = null;
                } else {
                    JSONArray jSONArray = new JSONArray();
                    for (Object obj2 : promoteData3.A1x) {
                        jSONArray.put(obj2.toString());
                    }
                    obj = jSONArray.toString();
                }
                Set set = promoteData3.A25;
                if (set != null) {
                    str6 = Pxf.A0f(set);
                } else {
                    str6 = null;
                }
                String str22 = promoteData3.A1d;
                String str23 = promoteData3.A1g;
                1NY A0a2 = AnonymousClass7TG.A0a(userSession);
                C13990Tnq.A1C(A0a2, "ads/promote/create_promotion_v2/", str15);
                A0a2.A9m("flow_id", str16);
                JTO.A1W(A0a2, str17);
                A0a2.A9m("authorization_category", adCreativeAuthorizationCategory2.toString());
                String str24 = null;
                if (xFBCTXWelcomeMessageStatus2 != null) {
                    str20 = xFBCTXWelcomeMessageStatus2.toString();
                }
                A0a2.A0G("ctx_welcome_message_status_v2", str20);
                A0a2.A9m("call_to_action", A013.toString());
                A0a2.A9m("total_budget_with_offset", String.valueOf(i4));
                A0a2.A9m("duration_in_days", String.valueOf(i5));
                A0a2.A0H("run_continuously", z5);
                A0a2.A0H("is_political_ad", contains2);
                A0a2.A0H("is_story_placement_eligible", z6);
                A0a2.A0H("is_explore_placement_eligible", z7);
                A0a2.A0H("has_product_tags", z8);
                A0a2.A9m("instagram_positions", A0k2);
                A0a2.A9m("additional_publisher_platforms", C51970G9q.A0k(A0J2));
                if (xIGIGBoostDestination4 != null) {
                    str24 = xIGIGBoostDestination4.toString();
                }
                A0a2.A0G("destination", str24);
                A0a2.A0G("selected_audio_spec", str18);
                A0a2.A0G("website_url", str19);
                A0a2.A0G("audience_id", str);
                A0a2.A0G("currency", currency2.getCurrencyCode());
                A0a2.A0G("regulated_target_spec_string", str14);
                A0a2.A0G("draft_id", str21);
                A0a2.A0G("lead_gen_form_id", str2);
                A0a2.A0G("dsa_data", str3);
                A0a2.A0G("profile_visit_enabled_secondary_cta", str4);
                A0a2.A0G("message_extensions", obj);
                A0a2.A0G("regulated_categories", C51970G9q.A0k(A033));
                A0a2.A0G("regional_regulated_categories", str6);
                A0a2.A0G("taiwan_fin_serv_beneficiary_id", str22);
                A0a2.A0G("taiwan_fin_serv_funder_id", str23);
                A0a2.A0R(CEY.class, C45534Cy8.class);
                if (!0mp.A0B(str5)) {
                    A0a2.A9m("ad_format_preferences", str5);
                }
                if (xIGIGBoostDestination5 != null) {
                    A0a2.A9m("messaging_tool_selected", xIGIGBoostDestination5.toString());
                }
                if (!0mp.A0B(A092)) {
                    A0a2.A9m("messaging_destinations", A092);
                }
                if (i > 0) {
                    A0a2.A0C(TraceFieldType.StartTime, i);
                }
                1OC A0M = A0a2.A0M();
                ucY2.A02 = W2x.A01("/api/v1/ads/promote/create_promotion_v2/");
                C18784W1k.A02(w1k, ucY2, A0M);
                return;
            }
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AUk() {
        C18784W1k w1k = (C18784W1k) this.A05.getValue();
        ArrayList BHp = BHp();
        ArrayList A0r = AnonymousClass7TG.A0r(BHp);
        Iterator it = BHp.iterator();
        while (it.hasNext()) {
            DbU.A1X(it.next(), A0r);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0r);
        2IS r6 = new 2IS();
        UserSession userSession = w1k.A08;
        r6.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, userSession.A06);
        PromoteData promoteData = w1k.A03;
        r6.A04("access_token", promoteData.A1A);
        r6.A04("media_id", promoteData.A1S);
        r6.A04("flow_type", promoteData.A0l.toString());
        r6.A05("instagram_positions", copyOf);
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != null) {
            r6.A04("ig_boost_destination", xIGIGBoostDestination.toString());
        }
        if (!AnonymousClass4KJ.A00(promoteData.A03())) {
            ImmutableList A032 = promoteData.A03();
            A032.getClass();
            r6.A05("regulated_categories", ImmutableList.copyOf((Collection) A032));
        }
        C363088j4 A002 = C363088j4.A00(userSession);
        C239113Fa r3 = new C239113Fa(r6, UJX.class, "IGPromoteAdFormatPreferencesQuery", false);
        A002.ATL(new C19026WHc(3), new C19040WHs(w1k, 5), r3);
    }

    public final void AUr() {
        C18476VsS.A00((C18476VsS) this.A08.getValue()).markerPoint(409679146, "pro_identity_fetch_buat");
        A09(this, new C58728Iwb(this, 43));
    }

    public final ArrayList BHp() {
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            List<AdsAPIInstagramPosition> list = promoteData.A1r;
            0qQ.A06(list);
            UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
            PromoteData promoteData2 = this.A00;
            if (promoteData2 != null) {
                XIGIGBoostDestination xIGIGBoostDestination = promoteData2.A0i;
                ArrayList A0q = AnonymousClass7TF.A0q(A0l, 1);
                for (AdsAPIInstagramPosition adsAPIInstagramPosition : list) {
                    if (C305936Kd.A03(adsAPIInstagramPosition, xIGIGBoostDestination, A0l)) {
                        A0q.add(adsAPIInstagramPosition);
                    }
                }
                return A0q;
            }
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final PromoteData Bhh() {
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            return promoteData;
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final PromoteState Bhj() {
        PromoteState promoteState = this.A01;
        if (promoteState != null) {
            return promoteState;
        }
        0qQ.A0F("promoteState");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r36 != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0136, code lost:
        if (r36 != false) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CpG(com.instagram.common.typedurl.ImageUrl r33, java.lang.String r34, java.lang.String r35, boolean r36, boolean r37) {
        /*
            r32 = this;
            r11 = r32
            r10 = r34
            X.0eM r0 = r11.A0A
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            java.lang.String r3 = "promoteData"
            if (r0 == 0) goto L_0x0161
            com.instagram.api.schemas.XIGIGBoostDestination r12 = r0.A0i
            if (r12 == 0) goto L_0x015c
            java.util.ArrayList r15 = r11.BHp()
            if (r34 != 0) goto L_0x0020
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0161
            java.lang.String r10 = r0.A1S
        L_0x0020:
            X.0qQ.A0A(r10)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0161
            com.instagram.api.schemas.XIGIGBoostCallToAction r16 = X.C18779W1e.A01(r0)
            com.instagram.business.promote.model.PromoteData r2 = r11.A00
            if (r2 == 0) goto L_0x0161
            boolean r8 = r2.A2d
            boolean r1 = r2.A2e
            boolean r0 = r2.A2S
            r29 = r0
            boolean r7 = r2.A2z
            boolean r6 = r2.A31
            java.lang.String r5 = r2.A1U
            java.util.List r2 = r2.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r14 = r2.contains(r0)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0161
            com.google.common.collect.ImmutableList r4 = r0.A03()
            X.0qQ.A07(r4)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0161
            com.instagram.music.common.model.AudioOverlayTrack r3 = r0.A18
            r2 = 0
            X.0qQ.A0B(r9, r2)
            r13 = 1
            r0 = 4
            X.0qQ.A0B(r10, r0)
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x00a0
            int r0 = r15.size()
            if (r0 != r13) goto L_0x00a1
            com.instagram.api.schemas.AdsAPIInstagramPosition r0 = com.instagram.api.schemas.AdsAPIInstagramPosition.STREAM
            boolean r0 = r15.contains(r0)
            if (r0 == 0) goto L_0x00a1
            X.WGU r4 = X.WGU.A00(r9)
            X.UzE r0 = X.C16678UzE.AD_PREVIEW
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "jump_to_feed_ad_preview"
            r4.A0R(r1, r0)
            int r0 = X.C18677Vwa.A00(r16)
            java.lang.String r1 = r11.getString(r0)
            r0 = 2131970672(0x7f134a70, float:1.9578302E38)
            java.lang.String r0 = r11.getString(r0)
            X.H1t r0 = X.C55280Hf9.A00(r3, r10, r1, r5, r0)
            X.6Yo r0 = X.DbV.A0M(r0, r11, r9)
            if (r36 == 0) goto L_0x009d
        L_0x009b:
            r0.A0D = r2
        L_0x009d:
            r0.A04()
        L_0x00a0:
            return
        L_0x00a1:
            boolean r0 = X.W3E.A02(r12, r9, r8)
            if (r0 == 0) goto L_0x0101
            if (r1 == 0) goto L_0x0101
            X.C13990Tnq.A0h()
            android.os.Bundle r1 = X.DbY.A09(r9)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "destination"
            r1.putString(r0, r12)
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r15)
            java.util.Iterator r15 = r15.iterator()
        L_0x00c1:
            boolean r12 = r15.hasNext()
            if (r12 == 0) goto L_0x00d5
            java.lang.Object r12 = r15.next()
            com.instagram.api.schemas.AdsAPIInstagramPosition r12 = (com.instagram.api.schemas.AdsAPIInstagramPosition) r12
            java.lang.String r12 = r12.name()
            r0.add(r12)
            goto L_0x00c1
        L_0x00d5:
            r12 = r16
            X.C13992Tns.A0a(r1, r0, r12, r10, r8)
            java.lang.String r0 = "is_fb_placement_selected"
            r1.putBoolean(r0, r13)
            r0 = r29
            X.C13992Tns.A0Y(r1, r5, r0, r7, r6)
            java.lang.String r0 = "is_political_ads"
            r1.putBoolean(r0, r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            java.lang.String r0 = "special_requirement_categories"
            r1.putStringArrayList(r0, r5)
            java.lang.String r0 = "selected_audio_overlay_track"
            r1.putParcelable(r0, r3)
            X.UZO r0 = new X.UZO
            r0.<init>()
            r0.setArguments(r1)
            goto L_0x0132
        L_0x0101:
            X.0Tu r13 = X.0Tu.A05
            r0 = 36320893449806777(0x8109a9000023b9, double:3.0328174979321303E-306)
            boolean r0 = X.182.A06(r13, r9, r0)
            X.Vl8 r13 = X.C13990Tnq.A0N()
            if (r0 == 0) goto L_0x013a
            r17 = r13
            r18 = r16
            r19 = r12
            r20 = r9
            r21 = r3
            r22 = r10
            r23 = r5
            r24 = r15
            r25 = r4
            r26 = r2
            r27 = r8
            r28 = r2
            r30 = r7
            r31 = r6
            X.UZm r0 = r17.A07(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0132:
            X.6Yo r0 = X.DbV.A0M(r0, r11, r9)
            if (r36 == 0) goto L_0x009d
            goto L_0x009b
        L_0x013a:
            r17 = r33
            r21 = r35
            r24 = r8
            r25 = r2
            r26 = r29
            r27 = r7
            r28 = r6
            r18 = r3
            r19 = r10
            r20 = r5
            r22 = r15
            r23 = r2
            r14 = r16
            r15 = r12
            r16 = r9
            X.UZn r0 = r13.A06(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0132
        L_0x015c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0161:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.activity.PromoteActivity.CpG(com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private final List A02() {
        ArrayList BHp = BHp();
        AnonymousClass0eM r8 = this.A0A;
        UserSession A0l = AnonymousClass7TE.A0l(r8);
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
            if (xIGIGBoostDestination != null) {
                ArrayList A002 = C305936Kd.A00(xIGIGBoostDestination, A0l, BHp);
                ArrayList<Object> arrayList = new ArrayList<>();
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) next;
                    if (adsAPIInstagramPosition == AdsAPIInstagramPosition.PROFILE_FEED) {
                        PromoteData promoteData2 = this.A00;
                        if (promoteData2 != null) {
                            XIGIGBoostDestination xIGIGBoostDestination2 = promoteData2.A0i;
                            if (xIGIGBoostDestination2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            } else if (!C305936Kd.A03(adsAPIInstagramPosition, xIGIGBoostDestination2, AnonymousClass7TE.A0l(r8))) {
                            }
                        }
                    }
                    arrayList.add(next);
                }
                ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
                for (Object A1X : arrayList) {
                    DbU.A1X(A1X, A0r);
                }
                return A0r;
            }
            throw new IllegalStateException("Required value was null.");
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(PromoteActivity promoteActivity) {
        C13990Tnq.A0h();
        Bundle A052 = C13991Tnr.A05();
        C15275UZd A0N = C13991Tnr.A0N(A052, "unknown_error");
        A0N.setArguments(A052);
        C309516Yo A0B = Dba.A0B(promoteActivity, AnonymousClass7TE.A0l(promoteActivity.A0A));
        A0B.A0B((Bundle) null, A0N);
        A0B.A04();
    }

    public static final void A07(PromoteActivity promoteActivity, C268654dm r10) {
        Object obj;
        Throwable A012;
        C15254UXo uXo;
        UKM ukm;
        Fragment uZd;
        C309516Yo r1;
        C268674do r0;
        C15254UXo uXo2;
        C268674do r02;
        A03(promoteActivity);
        String str = null;
        WT9.A01(C15414UcQ.A00, C18137VmD.A00(promoteActivity), "fetch_init_promote_failed");
        boolean z = r10 instanceof C268674do;
        String str2 = null;
        if (!z || (r02 = (C268674do) r10) == null) {
            obj = null;
        } else {
            obj = r02.A00;
        }
        if (obj != null) {
            if (!(!z || (r0 = (C268674do) r10) == null || (uXo2 = (C15254UXo) r0.A00) == null)) {
                str = uXo2.mErrorType;
                str2 = uXo2.getErrorMessage();
                if (str2 == null) {
                    str2 = "response is present in onFail, but there's no error message";
                }
                UKM ukm2 = uXo2.A01;
                if (ukm2 != null) {
                    str = ukm2.A01.toString();
                    str2 = ukm2.A03;
                }
            }
        } else if (r10 == null || (A012 = r10.A01()) == null) {
            PromoteData promoteData = promoteActivity.A00;
            if (promoteData != null) {
                if (promoteData.A1A == null) {
                    str = ErrorIdentifier.ACCESS_TOKEN_NULL.toString();
                    str2 = "Access Token Null";
                } else {
                    str = ErrorIdentifier.UNKNOWN_ERROR.toString();
                    str2 = "onFail is called, but ApiError contains neither error nor response.";
                }
            }
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        } else {
            str = ErrorIdentifier.NETWORK_CONNECTION_ERROR.toString();
            str2 = A012.getMessage();
            if (str2 == null) {
                str2 = A012.toString();
            }
        }
        AnonymousClass0eM r4 = promoteActivity.A07;
        WGU A0M = C13990Tnq.A0M(r4);
        String obj2 = C16678UzE.ERROR.toString();
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        A0M.A0V(obj2, "initial_fetch", str3);
        WGU A0M2 = C13990Tnq.A0M(r4);
        PromoteData promoteData2 = promoteActivity.A00;
        if (promoteData2 != null) {
            A0M2.A00 = promoteData2.A0n;
            String str4 = promoteData2.A1S;
            C16616UyC uyC = promoteData2.A12;
            if (str == null) {
                str = ErrorIdentifier.UNKNOWN_ERROR.toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            A0M2.A0P(uyC, str4, obj2, str, str2);
            if (r10 == null || (uXo = (C15254UXo) r10.A00()) == null || (ukm = uXo.A01) == null) {
                A04(promoteActivity);
                return;
            }
            UKW ukw = ukm.A00;
            if (ukm.A01 == ErrorIdentifier.ACCOUNT_SPEND_LIMIT_REACHED) {
                AnonymousClass0eM r5 = promoteActivity.A0A;
                UserSession A0l = AnonymousClass7TE.A0l(r5);
                if (182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36321215572354214L)) {
                    C13990Tnq.A0h();
                    C16678UzE uzE = C16678UzE.PROMOTE_PREVALIDATION_LOADING;
                    Bundle bundle = new Bundle();
                    bundle.putString("step", uzE.toString());
                    uZd = new C15317UaP();
                    uZd.setArguments(bundle);
                    r1 = new C309516Yo(promoteActivity, AnonymousClass7TE.A0l(r5));
                    r1.A0D(uZd);
                    r1.A04();
                    return;
                }
            }
            C13990Tnq.A0h();
            ErrorIdentifier errorIdentifier = ukm.A01;
            String str5 = ukw.A03;
            String str6 = ukm.A02;
            String str7 = ukw.A02;
            String str8 = ukw.A05;
            Bundle A0B = DbV.A0B(errorIdentifier, 0);
            A0B.putString("error_title", str5);
            A0B.putString(TraceFieldType.Error, str6);
            A0B.putString("error_type", errorIdentifier.toString());
            A0B.putString("ad_account_id", str7);
            A0B.putString("paymentMethodID", str8);
            uZd = new C15275UZd();
            uZd.setArguments(A0B);
            r1 = new C309516Yo(promoteActivity, AnonymousClass7TE.A0l(promoteActivity.A0A));
            r1.A0D = false;
            r1.A0D(uZd);
            r1.A04();
            return;
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A09(PromoteActivity promoteActivity, 0sP r4) {
        WT9.A01(C15414UcQ.A00, C18137VmD.A00(promoteActivity), "fetch_buat_start");
        WOI woi = new WOI(promoteActivity, r4);
        UserSession A0l = AnonymousClass7TE.A0l(promoteActivity.A0A);
        PromoteData promoteData = promoteActivity.A00;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = promoteData.A1K;
        0qQ.A06(str);
        C18676VwZ.A01(promoteActivity, woi, A0l, str);
    }

    public final int A0X() {
        return R.layout.promote_activity;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.business.promote.activity.PromoteActivity, androidx.fragment.app.FragmentActivity] */
    public final void A0Z() {
        int A002;
        AnonymousClass4DS A0H = DbY.A0H(this);
        if (A0H instanceof AnonymousClass4DS) {
            2dZ AYJ = AYJ();
            if (AYJ != null) {
                AYJ.A0X(A0H);
                return;
            }
            return;
        }
        2dZ AYJ2 = AYJ();
        if (AYJ2 != null) {
            AYJ2.Etr(true);
            PromoteData promoteData = this.A00;
            if (promoteData != null) {
                PromoteLaunchOrigin promoteLaunchOrigin = promoteData.A0v;
                if (promoteLaunchOrigin == PromoteLaunchOrigin.AD_PREVIEW) {
                    A002 = 2131970642;
                } else if (promoteLaunchOrigin == PromoteLaunchOrigin.CAMPAIGN_CONTROLS_BUDGET_DURATION) {
                    A002 = 2131970242;
                } else {
                    A002 = C305796Jo.A00(promoteData.A17, false);
                }
                AYJ2.setTitle(C51967G9n.A0p(this, A002));
                AnonymousClass3JR r2 = new AnonymousClass3JR();
                PromoteData promoteData2 = this.A00;
                if (promoteData2 != null) {
                    boolean z = promoteData2.A2t;
                    int i = R.drawable.instagram_x_pano_outline_24;
                    if (z) {
                        i = R.drawable.instagram_arrow_back_24;
                    }
                    r2.A01(i);
                    r2.A0G = this.A0I;
                    AYJ2.ErG(new AnonymousClass3Jb(r2));
                    AYJ2.A0U(R.attr.glyphColorPrimary);
                    AYJ2.Eu4(true);
                    AYJ2.Ets(false);
                    return;
                }
            }
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.business.promote.activity.PromoteActivity, android.app.Activity] */
    public final void CIY(LinkingAuthState linkingAuthState, String str, boolean z) {
        if (str.length() == 0) {
            finish();
            return;
        }
        PromoteData promoteData = this.A00;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteData.A1A = str;
        promoteData.A0n = linkingAuthState;
        promoteData.A2J = z;
        C18476VsS.A00((C18476VsS) this.A08.getValue()).markerPoint(409679146, "pro_identity_continue_with_bloks_access_token");
        A06(this);
    }

    public final void onBackPressed() {
        if (!(DbY.A0H(this) instanceof AnonymousClass4DS)) {
            C13990Tnq.A0M(this.A07).A0F(C16678UzE.PROMOTE_PREVALIDATION_LOADING, "cancel_button");
        }
        super.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.business.promote.activity.PromoteActivity, java.lang.Object, android.app.Activity, androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: type inference failed for: r3v42, types: [java.lang.Object, com.instagram.business.promote.model.PromoteData] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02f8, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36317358692701269L) != false) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r3 == null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = 1868833031(0x6f642107, float:7.060251E28)
            int r1 = X.AnonymousClass0fD.A00(r0)
            r8 = 1
            r13 = 0
            r11 = r19
            r5 = r20
            if (r20 == 0) goto L_0x0023
            java.lang.String r0 = "PromoteActivity.saveInstanceState.hasGoneThroughNoCachePrevalidationBloksFlow"
            boolean r0 = r5.getBoolean(r0, r13)
            if (r0 != r8) goto L_0x0019
            r11.A03 = r8
        L_0x0019:
            java.lang.String r0 = "PromoteActivity.saveInstanceState.PromoteData"
            android.os.Parcelable r3 = r5.getParcelable(r0)
            com.instagram.business.promote.model.PromoteData r3 = (com.instagram.business.promote.model.PromoteData) r3
            if (r3 != 0) goto L_0x0048
        L_0x0023:
            X.0eM r0 = r11.A0A
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.business.promote.model.PromoteData r3 = new com.instagram.business.promote.model.PromoteData
            r3.<init>()
            X.C13992Tns.A0v(r3)
            X.C13992Tns.A0w(r3)
            r0 = 0
            r3.A1C = r0
            r3.A1D = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A25 = r0
            r3.A2C = r13
            r3.A2y = r13
            r3.A34 = r13
            r3.A0y = r2
        L_0x0048:
            r11.A00 = r3
            if (r20 == 0) goto L_0x0056
            java.lang.String r0 = "PromoteActivity.saveInstanceState.PromoteState"
            android.os.Parcelable r0 = r5.getParcelable(r0)
            com.instagram.business.promote.model.PromoteState r0 = (com.instagram.business.promote.model.PromoteState) r0
            if (r0 != 0) goto L_0x005b
        L_0x0056:
            com.instagram.business.promote.model.PromoteState r0 = new com.instagram.business.promote.model.PromoteState
            r0.<init>()
        L_0x005b:
            r11.A01 = r0
            if (r20 != 0) goto L_0x0310
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            java.lang.String r10 = "promoteData"
            if (r3 == 0) goto L_0x0327
            X.0eM r7 = r11.A06
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "media_id"
            java.lang.String r0 = X.C320236s2.A01(r2, r0)
            r3.A1S = r0
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "media_ids"
            java.util.ArrayList r2 = r2.getStringArrayList(r0)
            if (r2 == 0) goto L_0x008c
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0327
            java.util.List r0 = r0.A1v
            r0.addAll(r2)
        L_0x008c:
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0327
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x00a7
            X.0eM r0 = r11.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = X.1CI.A00(r0)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "selected 2 media for A/B testing"
            X.C59689JTv.A09(r11, r0)
        L_0x00a7:
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "boost_flow_type"
            java.io.Serializable r0 = r2.getSerializable(r0)
            com.instagram.business.boost.model.BoostFlowType r0 = (com.instagram.business.boost.model.BoostFlowType) r0
            r3.A0l = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "entry_point"
            java.lang.String r0 = r2.getString(r0)
            r3.A1K = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "fb_user_id"
            java.lang.String r0 = r2.getString(r0)
            r3.A1L = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "is_sub_flow"
            boolean r0 = r2.getBoolean(r0)
            r3.A2t = r0
            X.0eM r4 = r11.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.1E8 r9 = X.1E7.A00(r0)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0327
            java.lang.String r6 = r0.A1S
            r3 = 95
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            com.instagram.user.model.User r0 = r2.A01(r0)
            java.lang.String r0 = r0.getId()
            java.lang.String r0 = X.002.A0T(r6, r0, r3)
            X.1Xj r6 = r9.A02(r0)
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "has_product_tag"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L_0x0133
            if (r6 == 0) goto L_0x054a
            boolean r0 = r6.A4u()
            if (r0 == 0) goto L_0x054a
        L_0x0133:
            r0 = 1
        L_0x0134:
            r3.A2K = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "sponsor_ids"
            java.lang.String[] r0 = r2.getStringArray(r0)
            r3.A35 = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "coupon_offer_id"
            java.lang.String r0 = r2.getString(r0)
            r3.A1H = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "media_url"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r3.A11 = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "ad_account_id"
            java.lang.String r0 = r2.getString(r0)
            r3.A1B = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "draft_id"
            java.lang.String r0 = r2.getString(r0)
            r3.A1J = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            r0 = 751(0x2ef, float:1.052E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r0 = r2.getSerializable(r0)
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = (com.instagram.business.promote.model.PromoteLaunchOrigin) r0
            r3.A0v = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "media_product_type"
            java.io.Serializable r0 = r2.getSerializable(r0)
            com.instagram.model.mediatype.ProductType r0 = (com.instagram.model.mediatype.ProductType) r0
            r3.A17 = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "destination"
            java.io.Serializable r0 = r2.getSerializable(r0)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
            r3.A0i = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "personalized_destination"
            java.io.Serializable r0 = r2.getSerializable(r0)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
            r3.A0f = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            com.instagram.api.schemas.XIGIGBoostDestination r2 = r3.A0f
            java.lang.String r9 = "promoteState"
            if (r2 == 0) goto L_0x01f7
            com.instagram.business.promote.model.PromoteState r0 = r11.A01
            if (r0 == 0) goto L_0x0545
            r0.A04(r2, r3)
        L_0x01f7:
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0327
            java.util.Map r3 = r0.A22
            X.0qQ.A06(r3)
            com.instagram.api.schemas.BoostedPostAudienceOption r0 = com.instagram.api.schemas.BoostedPostAudienceOption.IG_PROMOTED_POST_AUTO
            java.lang.String r2 = r0.toString()
            com.instagram.business.promote.model.PromoteAudience r0 = com.instagram.business.promote.model.PromoteAudience.A0E
            r3.put(r2, r0)
            com.instagram.business.promote.model.PromoteData r2 = r11.A00
            if (r2 == 0) goto L_0x0327
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.VMZ r0 = X.C16905VAi.A00(r0)
            java.lang.String r0 = r0.A00
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r2.A2W = r0
            com.instagram.business.promote.model.PromoteState r6 = r11.A01
            if (r6 == 0) goto L_0x0545
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "audience_id"
            java.lang.String r0 = r2.getString(r0)
            r6.A09(r3, r0)
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "is_from_ctwa_upsell"
            boolean r0 = r2.getBoolean(r0, r13)
            r3.A2g = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "is_ctwa_coupon_aymt"
            boolean r0 = r2.getBoolean(r0, r13)
            r3.A2Y = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "is_from_lead_ads_upsell"
            boolean r0 = r2.getBoolean(r0, r13)
            r3.A2i = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "aymt_channel"
            java.lang.String r0 = r2.getString(r0)
            r3.A1E = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "reference_code_for_aymt_dropoff"
            java.lang.String r0 = r2.getString(r0)
            r3.A1Y = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            r0 = 81
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r13)
            r3.A2h = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "selected_audio_spec"
            java.lang.String r0 = r2.getString(r0)
            r3.A1b = r0
            com.instagram.business.promote.model.PromoteData r9 = r11.A00
            if (r9 == 0) goto L_0x0327
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r3 = "selected_audio_overlay_track"
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r6 < r0) goto L_0x053f
            java.lang.Class<com.instagram.music.common.model.AudioOverlayTrack> r0 = com.instagram.music.common.model.AudioOverlayTrack.class
            java.lang.Object r0 = X.2Yc.A01(r2, r0, r3)
        L_0x02d0:
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            r9.A18 = r0
            com.instagram.business.promote.model.PromoteData r6 = r11.A00
            if (r6 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r0 = "has_bio_product"
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L_0x053c
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r4)
            X.0qQ.A0B(r4, r13)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36317358692701269(0x810672000f1455, double:3.0305821033052827E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x053c
        L_0x02fa:
            r6.A2C = r8
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0327
            java.lang.Object r2 = r7.getValue()
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r0 = "media_boosted_status"
            java.io.Serializable r0 = r2.getSerializable(r0)
            X.UyC r0 = (X.C16616UyC) r0
            r3.A12 = r0
        L_0x0310:
            super.onCreate(r5)
            r5 = 1
            r3 = 2
            X.C2594141p.A00(r11, r5)
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r0 = r11.findViewById(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            r11.A02 = r0
            if (r0 != 0) goto L_0x032f
            java.lang.String r10 = "loadingSpinner"
        L_0x0327:
            X.0qQ.A0F(r10)
        L_0x032a:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x032f:
            X.DbS.A1T(r0)
            r0 = 2131438638(0x7f0b2c2e, float:1.8499209E38)
            android.view.View r2 = r11.findViewById(r0)
            r0 = 2131100052(0x7f060194, float:1.7812475E38)
            X.DbT.A16(r11, r2, r0)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 != 0) goto L_0x0346
            java.lang.String r10 = "promoteData"
            goto L_0x0327
        L_0x0346:
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = r0.A0v
            if (r0 == 0) goto L_0x0445
            int r2 = r0.ordinal()
            if (r2 == r3) goto L_0x0374
            if (r2 == r5) goto L_0x036c
            r0 = 4
            if (r2 != r0) goto L_0x0445
            X.0eM r0 = r11.A06
            java.lang.Object r2 = r0.getValue()
            r0 = 19
            X.J6j r3 = new X.J6j
            r3.<init>((int) r0, (java.lang.Object) r11, (java.lang.Object) r2)
        L_0x0362:
            A09(r11, r3)
        L_0x0365:
            r0 = 1292732980(0x4d0d8a34, float:1.48415296E8)
            X.AnonymousClass0fD.A07(r0, r1)
            return
        L_0x036c:
            r0 = 44
            X.Iwb r3 = new X.Iwb
            r3.<init>(r11, r0)
            goto L_0x0362
        L_0x0374:
            X.0eM r0 = r11.A06
            java.lang.Object r6 = r0.getValue()
            android.os.Bundle r6 = (android.os.Bundle) r6
            if (r6 == 0) goto L_0x0365
            A03(r11)
            java.lang.String r0 = "destination_cta"
            java.lang.String r0 = X.JTP.A0m(r6, r0)
            com.instagram.api.schemas.XIGIGBoostCallToAction r4 = com.instagram.api.schemas.XIGIGBoostCallToAction.valueOf(r0)
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            java.lang.String r7 = "promoteData"
            r12 = 0
            if (r3 == 0) goto L_0x0537
            int r2 = X.DbU.A02(r4, r5)
            r0 = 19
            if (r2 == r0) goto L_0x03c2
            switch(r2) {
                case 1: goto L_0x03c5;
                case 2: goto L_0x039d;
                case 3: goto L_0x039d;
                case 4: goto L_0x039d;
                case 5: goto L_0x03bf;
                case 6: goto L_0x03bf;
                case 7: goto L_0x039d;
                case 8: goto L_0x039d;
                case 9: goto L_0x039d;
                case 10: goto L_0x03c5;
                case 11: goto L_0x03bf;
                case 12: goto L_0x039d;
                case 13: goto L_0x039d;
                case 14: goto L_0x03c5;
                case 15: goto L_0x03b9;
                case 16: goto L_0x039d;
                case 17: goto L_0x03bf;
                case 18: goto L_0x039d;
                case 19: goto L_0x039d;
                case 20: goto L_0x03c5;
                case 21: goto L_0x03bf;
                case 22: goto L_0x03bf;
                case 23: goto L_0x03c5;
                case 24: goto L_0x03b6;
                case 25: goto L_0x039d;
                case 26: goto L_0x03bf;
                case 27: goto L_0x03bc;
                default: goto L_0x039d;
            }
        L_0x039d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unimplemented "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", would have crashed anyway."
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x03b6:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            goto L_0x03c7
        L_0x03b9:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            goto L_0x03c7
        L_0x03bc:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WHATSAPP_MESSAGE
            goto L_0x03c7
        L_0x03bf:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            goto L_0x03c7
        L_0x03c2:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.POST_ENGAGEMENT
            goto L_0x03c7
        L_0x03c5:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
        L_0x03c7:
            r3.A0i = r0
            com.instagram.business.promote.model.PromoteData r3 = r11.A00
            if (r3 == 0) goto L_0x0537
            r3.A0b = r4
            com.instagram.api.schemas.XIGIGBoostDestination r2 = r3.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            if (r2 != r0) goto L_0x03d7
            r3.A0d = r4
        L_0x03d7:
            java.lang.String r0 = "political_ad_byline_text"
            java.lang.String r0 = r6.getString(r0)
            r3.A1U = r0
            com.instagram.business.promote.model.PromoteData r4 = r11.A00
            if (r4 == 0) goto L_0x0537
            java.lang.String r0 = "instagram_positions"
            java.util.ArrayList r0 = r6.getStringArrayList(r0)
            if (r0 == 0) goto L_0x0408
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x03f3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0409
            java.lang.String r0 = X.AnonymousClass7TE.A18(r2)
            X.0qQ.A0A(r0)
            com.instagram.api.schemas.AdsAPIInstagramPosition r0 = com.instagram.api.schemas.AdsAPIInstagramPosition.valueOf(r0)
            r3.add(r0)
            goto L_0x03f3
        L_0x0408:
            r3 = r12
        L_0x0409:
            r4.A1r = r3
            com.instagram.business.promote.model.PromoteData r2 = r11.A00
            if (r2 == 0) goto L_0x0537
            java.lang.String r0 = r2.A1U
            if (r0 == 0) goto L_0x0420
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0420
            java.util.List r2 = r2.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            r2.add(r0)
        L_0x0420:
            com.instagram.business.promote.model.PromoteData r4 = r11.A00
            if (r4 == 0) goto L_0x0537
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r2 = "selected_audio_overlay_track"
            if (r3 < r0) goto L_0x0440
            java.lang.Class<com.instagram.music.common.model.AudioOverlayTrack> r0 = com.instagram.music.common.model.AudioOverlayTrack.class
            java.lang.Object r0 = X.2Yc.A01(r6, r0, r2)
        L_0x0432:
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            r4.A18 = r0
            r13 = r12
            r14 = r12
            r15 = r5
            r16 = r5
            r11.CpG(r12, r13, r14, r15, r16)
            goto L_0x0365
        L_0x0440:
            android.os.Parcelable r0 = r6.getParcelable(r2)
            goto L_0x0432
        L_0x0445:
            X.0eM r8 = r11.A08
            java.lang.Object r5 = r8.getValue()
            X.VsS r5 = (X.C18476VsS) r5
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            java.lang.String r9 = "promoteData"
            if (r0 == 0) goto L_0x0545
            java.lang.String r4 = r0.A1K
            X.0qQ.A06(r4)
            X.0eM r6 = r11.A07
            X.WGU r0 = X.C13990Tnq.A0M(r6)
            java.lang.String r3 = r0.A03
            X.0qQ.A07(r3)
            X.1Ln r2 = r5.A00
            java.lang.String r0 = "pro_identity_boost_onboarding_start"
            r2.A0l(r0)
            java.lang.String r0 = "entry_point"
            r2.A0R(r0, r4)
            java.lang.String r0 = "flow_id"
            r2.A0R(r0, r3)
            r2.Cgf()
            X.02m r0 = X.C18476VsS.A00(r5)
            r7 = 409679146(0x186b352a, float:3.039988E-24)
            r0.markerStart(r7)
            X.0eM r5 = r11.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.0qQ.A0B(r0, r13)
            X.0xY r2 = X.AnonymousClass7TF.A0N(r0)
            r0 = 846(0x34e, float:1.185E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.ED3(r0)
            r2.apply()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r5)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36319596369813004(0x81087b00021e0c, double:3.0319972193211464E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x0532
            java.lang.Object r0 = r8.getValue()
            X.VsS r0 = (X.C18476VsS) r0
            X.02m r2 = X.C18476VsS.A00(r0)
            java.lang.String r0 = "pro_identity_fetch_cached_info"
            r2.markerPoint(r7, r0)
            com.instagram.business.promote.model.PromoteData r0 = r11.A00
            if (r0 == 0) goto L_0x0545
            java.lang.String r3 = r0.A1K
            X.0qQ.A06(r3)
            X.WGU r0 = X.C13990Tnq.A0M(r6)
            java.lang.String r2 = r0.A03
            r0 = 18
            X.N49 r4 = new X.N49
            r4.<init>(r3, r2, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.0qQ.A0B(r0, r13)
            X.Vh6 r3 = X.C18418VrN.A00(r0)
            X.VRc r0 = new X.VRc
            r0.<init>(r4, r11)
            X.VMH r2 = r3.A00
            X.0xa r5 = r2.A00
            r2 = 133(0x85, float:1.86E-43)
            java.lang.String r2 = X.C66579MXk.A00(r2)
            r14 = 0
            java.lang.String r5 = r5.getString(r2, r14)
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r2 = "cache_id"
            r7.A04(r2, r5)
            java.lang.String r5 = r4.A00
            java.lang.String r2 = "entrypoint"
            X.1vR r8 = X.DbU.A0J(r7, r2, r5)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.UPk> r12 = X.UPk.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "IGProfessionalIdentityCachedInfoQuery"
            java.lang.String r17 = "ig_professional_cache"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5 = 3
            X.Ufr r2 = new X.Ufr
            r2.<init>(r5, r0, r4, r3)
            com.instagram.common.session.UserSession r0 = r3.A01
            X.1vn r0 = X.1vm.A01(r0)
            r0.A06(r7, r2)
            goto L_0x0365
        L_0x0532:
            A05(r11)
            goto L_0x0365
        L_0x0537:
            X.0qQ.A0F(r7)
            goto L_0x032a
        L_0x053c:
            r8 = 0
            goto L_0x02fa
        L_0x053f:
            android.os.Parcelable r0 = r2.getParcelable(r3)
            goto L_0x02d0
        L_0x0545:
            X.0qQ.A0F(r9)
            goto L_0x032a
        L_0x054a:
            r0 = 0
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.activity.PromoteActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.business.promote.activity.PromoteActivity] */
    public final void onDestroy() {
        int A002 = AnonymousClass0fD.A00(-197881867);
        super.onDestroy();
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            if (promoteData.A2w) {
                AnonymousClass0eM r2 = this.A0A;
                W3M.A06(AnonymousClass7TE.A0l(r2));
                C13991Tnr.A0r(this);
                PromoteData promoteData2 = this.A00;
                if (promoteData2 != null) {
                    1ES.A03(C3724090s.A04(AnonymousClass7TE.A0l(r2), promoteData2.A1S));
                }
            }
            AnonymousClass0fD.A07(623729464, A002);
            return;
        }
        0qQ.A0F("promoteData");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(-482133159);
        super.onPause();
        PromoteState promoteState = this.A01;
        if (promoteState == null) {
            0qQ.A0F("promoteState");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteState.A0B(this);
        AnonymousClass0fD.A07(1886758207, A002);
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AnonymousClass7TG.A1O(strArr, iArr);
        PromoteActivity.super.onRequestPermissionsResult(i, strArr, iArr);
        PermissionsModule permissionsModule = this.A04;
        if (permissionsModule != null && permissionsModule.onRequestPermissionsResult(i, strArr, iArr)) {
            this.A04 = null;
        }
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-1131770224);
        super.onResume();
        PromoteState promoteState = this.A01;
        if (promoteState == null) {
            0qQ.A0F("promoteState");
            throw AnonymousClass00P.createAndThrow();
        }
        promoteState.A0A(this);
        AnonymousClass0fD.A07(-1175231021, A002);
    }
}
