package com.instagram.genericsurvey.fragment;

import X.00k;
import X.0Pl;
import X.0S7;
import X.0hq;
import X.0j9;
import X.0jB;
import X.0kD;
import X.0lg;
import X.0qQ;
import X.0sr;
import X.14i;
import X.1L2;
import X.1OC;
import X.1OP;
import X.1Xj;
import X.1sy;
import X.1wn;
import X.2dZ;
import X.2da;
import X.2el;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass2ZP;
import X.AnonymousClass2eo;
import X.AnonymousClass2kR;
import X.AnonymousClass2lU;
import X.AnonymousClass2xI;
import X.AnonymousClass2xS;
import X.AnonymousClass30S;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass32G;
import X.AnonymousClass332;
import X.AnonymousClass36D;
import X.AnonymousClass3BQ;
import X.AnonymousClass3DZ;
import X.AnonymousClass3IJ;
import X.AnonymousClass3K2;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass4K8;
import X.AnonymousClass6UQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C10038Rlb;
import X.C13989Tnp;
import X.C13991Tnr;
import X.C14044Tol;
import X.C14615TzM;
import X.C14897UDz;
import X.C15257UXr;
import X.C15462UdD;
import X.C15621Ufn;
import X.C15980Ulw;
import X.C16165Upq;
import X.C17371VSy;
import X.C17926ViH;
import X.C17927ViI;
import X.C17983VjL;
import X.C17989VjR;
import X.C17997VjZ;
import X.C18200VnN;
import X.C19221WQb;
import X.C19489Wab;
import X.C20032Wjs;
import X.C20298Won;
import X.C20978X7r;
import X.C227642jf;
import X.C227752jr;
import X.C227762js;
import X.C228172ku;
import X.C228182kv;
import X.C228402lc;
import X.C230182p7;
import X.C230202p9;
import X.C230222pE;
import X.C230572pq;
import X.C234042wt;
import X.C234172xD;
import X.C234342xi;
import X.C234422xq;
import X.C2355030c;
import X.C2355230e;
import X.C2355930l;
import X.C2356130n;
import X.C2362232x;
import X.C249383je;
import X.C249763kK;
import X.C254523sc;
import X.C270054g7;
import X.C271774jZ;
import X.C273654mx;
import X.C294975nL;
import X.C309516Yo;
import X.C315596kB;
import X.C45286Ctp;
import X.C51966G9m;
import X.C51969G9p;
import X.C54365HAg;
import X.C57066INg;
import X.C57250IUl;
import X.C60510iO;
import X.C61110lV;
import X.C66579MXk;
import X.C66580MXl;
import X.C71392co;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.GU3;
import X.JTR;
import X.VC8;
import X.VC9;
import X.VCA;
import X.VI4;
import X.VVJ;
import X.W11;
import X.WB9;
import X.WWR;
import X.XC0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class GenericSurveyFragment extends AnonymousClass32G implements AnonymousClass4DU, C61110lV, AnonymousClass4DR, C230202p9, AbsListView.OnScrollListener, AnonymousClass4DS, C230182p7, C20978X7r {
    public int A00 = -1;
    public long A01;
    public long A02;
    public long A03;
    public ViewGroup A04;
    public C15462UdD A05;
    public C17983VjL A06;
    public C17997VjZ A07;
    public C15257UXr A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public VVJ A0E;
    public 2el A0F;
    public AnonymousClass36D A0G;
    public AnonymousClass2xS A0H;
    public AnonymousClass32A A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public final String A0M = "GenericSurveyFragment";
    public final List A0N = new ArrayList();
    public final AnonymousClass0eM A0O = C227642jf.A02(this);
    public final 1wn A0P = new C19221WQb(this, 24);
    public final 1wn A0Q = new C19221WQb(this, 25);
    public final C2356130n A0R = new Object();
    public final C228172ku A0S = new C228172ku();
    public final C249763kK A0T = 1L2.A00();
    public ViewGroup contentContainer;
    public ViewGroup endScreen;
    public ViewStub endScreenViewStub;
    public SpinnerImageView loadingSpinner;
    public C17989VjR navbarController;
    public ViewGroup retryView;
    public ViewStub retryViewStub;

    public final void A0c(Reel reel, XC0 xc0, List list) {
        C15462UdD udD = this.A05;
        if (udD == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        udD.A03.A06 = true;
        AnonymousClass32A r6 = this.A0I;
        if (r6 == null) {
            r6 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(this.A0O), new AnonymousClass328(this));
        }
        this.A0I = r6;
        r6.A0C = this.A0T.getSessionId();
        r6.A05 = new C16165Upq(getRootActivity(), xc0.Beu(), (C230222pE) new C19489Wab(this, 1), AnonymousClass05K.A01);
        Reel reel2 = reel;
        List list2 = list;
        r6.A06(reel2, AnonymousClass3BQ.RATE_ADS, xc0, list2, list2, 0);
    }

    public final void Db7(C17983VjL vjL, C17997VjZ vjZ) {
        0qQ.A0B(vjZ, 0);
        this.A07 = vjZ;
        this.A06 = vjL;
    }

    public final void Dkm() {
    }

    public final void Dko() {
    }

    public final void configureActionBar(2da r10) {
        int i;
        int i2;
        0qQ.A0B(r10, 0);
        C17989VjR vjR = this.navbarController;
        if (vjR != null) {
            vjR.A01(requireContext(), r10);
        }
        if (this.A0C) {
            C15257UXr uXr = this.A08;
            if (uXr != null) {
                C17989VjR vjR2 = this.navbarController;
                if (vjR2 != null) {
                    String str = uXr.A03;
                    if (str != null) {
                        boolean z = this.A0B;
                        boolean z2 = uXr.A07;
                        boolean z3 = uXr.A08;
                        TextView textView = vjR2.A01;
                        String str2 = "pageTitle";
                        if (textView != null) {
                            textView.setText(str);
                            TextView textView2 = vjR2.A00;
                            if (textView2 == null) {
                                str2 = "pageIndicator";
                            } else {
                                textView2.setVisibility(DbW.A01(z2 ? 1 : 0));
                                if (!z2) {
                                    TextView textView3 = vjR2.A01;
                                    if (textView3 != null) {
                                        textView3.setTextSize(0, vjR2.A02.getDimension(R.dimen.font_large));
                                    }
                                }
                                if (z) {
                                    i = 2131960992;
                                    i2 = 26;
                                } else if (z3) {
                                    i = 2131973923;
                                    i2 = 27;
                                }
                                r10.AA9(new WB9((Object) vjR2, i2), i);
                            }
                        }
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                C17989VjR vjR3 = this.navbarController;
                if (vjR3 != null) {
                    vjR3.A00(this.A00, uXr.A00, this.A0N.size());
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
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
        2el r4 = this.A0F;
        if (r4 == null) {
            0qQ.A0F("viewpointManager");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
        0S7.A00(this);
        int i = 0;
        r4.A08(this.A04, A002, new AnonymousClass2eo[0]);
        SpinnerImageView spinnerImageView = this.loadingSpinner;
        if (spinnerImageView != null) {
            if (this.A0C) {
                i = 8;
            }
            spinnerImageView.setVisibility(i);
        }
        if (this.A0B) {
            A02(this);
            return;
        }
        14i.A05(this);
        0S7.A00(this);
        this.A04.setOnScrollListener(this);
    }

    public static final void A01(GenericSurveyFragment genericSurveyFragment) {
        String str;
        UserSession A0l = AnonymousClass7TE.A0l(genericSurveyFragment.A0O);
        String str2 = genericSurveyFragment.A09;
        if (str2 == null) {
            str = "surveyType";
        } else {
            String str3 = genericSurveyFragment.A0J;
            if (str3 == null) {
                str = "extraDataToken";
            } else {
                1OC A002 = VC9.A00(A0l, str2, str3);
                C15621Ufn.A00(A002, genericSurveyFragment, 33);
                genericSurveyFragment.schedule(A002);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(GenericSurveyFragment genericSurveyFragment) {
        C45286Ctp ctp;
        KeyEvent.Callback callback;
        AnonymousClass7TH.A0R(genericSurveyFragment.contentContainer);
        C15257UXr uXr = genericSurveyFragment.A08;
        if (uXr != null && (ctp = uXr.A01) != null) {
            int intValue = ctp.A01.intValue();
            if (intValue == 0) {
                Context requireContext = genericSurveyFragment.requireContext();
                ViewGroup viewGroup = genericSurveyFragment.A04;
                if (viewGroup != null) {
                    View A002 = C18200VnN.A00(requireContext, viewGroup);
                    Object tag = A002.getTag();
                    if (tag != null) {
                        C14897UDz uDz = (C14897UDz) tag;
                        AnonymousClass3IJ r0 = ctp.A00;
                        if (r0 != null) {
                            C18200VnN.A01(genericSurveyFragment, genericSurveyFragment, uDz, new C57250IUl(), new C270054g7(r0));
                            ViewGroup viewGroup2 = genericSurveyFragment.A04;
                            if (viewGroup2 != null) {
                                viewGroup2.addView(A002);
                            }
                            ViewGroup viewGroup3 = genericSurveyFragment.A04;
                            if (viewGroup3 != null) {
                                viewGroup3.invalidate();
                                return;
                            }
                            return;
                        }
                        0qQ.A0F("simpleActionDict");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            } else if (intValue == 1) {
                ViewGroup viewGroup4 = genericSurveyFragment.endScreen;
                if (viewGroup4 == null) {
                    ViewStub viewStub = genericSurveyFragment.endScreenViewStub;
                    viewGroup4 = null;
                    if (viewStub != null) {
                        callback = viewStub.inflate();
                    } else {
                        callback = null;
                    }
                    if (callback instanceof ViewGroup) {
                        viewGroup4 = (ViewGroup) callback;
                    }
                    genericSurveyFragment.endScreen = viewGroup4;
                }
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r8.equals("done_button") != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(java.lang.String r28) {
        /*
            r27 = this;
            java.lang.String r0 = "auto_exit_after_completion"
            r8 = r28
            boolean r0 = r8.equals(r0)
            java.lang.String r7 = "done_button"
            if (r0 != 0) goto L_0x0014
            boolean r0 = r8.equals(r7)
            r18 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r18 = 1
        L_0x0016:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            r9 = r27
            java.lang.String r1 = r9.A0J
            if (r1 != 0) goto L_0x002b
            java.lang.String r17 = "extraDataToken"
        L_0x0023:
            X.0qQ.A0F(r17)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002b:
            java.lang.String r0 = "extra_data_token"
            r6.putExtra(r0, r1)
            java.lang.String r1 = r9.A09
            if (r1 != 0) goto L_0x0037
            java.lang.String r17 = "surveyType"
            goto L_0x0023
        L_0x0037:
            java.lang.String r0 = "action_type"
            r6.putExtra(r0, r1)
            java.lang.String r1 = r9.A0L
            if (r1 != 0) goto L_0x0043
            java.lang.String r17 = "trackingToken"
            goto L_0x0023
        L_0x0043:
            java.lang.String r0 = "tracking_token"
            r6.putExtra(r0, r1)
            java.lang.String r1 = r9.A0K
            if (r1 != 0) goto L_0x004f
            java.lang.String r17 = "parentMediaId"
            goto L_0x0023
        L_0x004f:
            java.lang.String r0 = "parent_media_id"
            r6.putExtra(r0, r1)
            X.3kK r0 = r9.A0T
            java.lang.String r5 = r0.getSessionId()
            X.UXr r1 = r9.A08
            int r0 = r9.A00
            java.lang.String r4 = X.VCA.A00(r1, r0)
            X.0eM r3 = r9.A0O
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            r12 = 0
            X.AnonymousClass7TF.A1D(r5, r12, r2)
            java.lang.String r0 = "exit_event"
            X.3sc r1 = X.C13991Tnr.A0O(r9, r0)
            r1.A6t = r5
            r1.A6G = r4
            r1.A5E = r8
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = X.C271764jY.A00(r2, r1, r9, r0)
            if (r0 != 0) goto L_0x0083
            X.C13991Tnr.A1F(r2, r1)
        L_0x0083:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.VvW r10 = X.VI4.A00(r0)
            long r4 = r9.A02
            long r2 = r9.A01
            int r0 = r9.A00
            long r0 = (long) r0
            r11 = 1
            if (r18 == 0) goto L_0x01db
            java.lang.Long[] r3 = X.C18635VvW.A00(r4, r2, r11)
            r2 = r3[r12]
            long r15 = r2.longValue()
            r2 = r3[r11]
            long r13 = r2.longValue()
            X.Vt6 r2 = r10.A00
            r3 = 0
            if (r2 != 0) goto L_0x00ef
            java.lang.String r1 = "RapidFeedbackLogger"
            java.lang.String r0 = "Unable to log survey completion event ig_survey_completion due to Base event fields not initialized from initial impression"
            X.0kD.A07(r1, r0, r3)
        L_0x00b1:
            androidx.fragment.app.Fragment r2 = r9.getTargetFragment()
            if (r2 == 0) goto L_0x00c3
            X.07M.A02(r9)
            int r1 = r9.mTargetRequestCode
            r0 = 0
            if (r18 == 0) goto L_0x00c0
            r0 = -1
        L_0x00c0:
            r2.onActivityResult(r1, r0, r6)
        L_0x00c3:
            X.VVJ r3 = r9.A0E
            if (r3 == 0) goto L_0x00ee
            boolean r0 = r8.equals(r7)
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "close_button"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "back_button"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x00ee
        L_0x00e1:
            X.6Rx r2 = r3.A01
            X.4uI r1 = r3.A02
            X.6Rm r0 = r3.A00
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            X.C308206Td.A0E(r2, r1, r0)
        L_0x00ee:
            return
        L_0x00ef:
            com.instagram.common.session.UserSession r12 = r10.A01
            X.0kJ r2 = X.0kJ.A05
            X.0wc r4 = X.AnonymousClass0kN.A00(r3, r2, r12)
            java.lang.String r2 = "ig_survey_completion"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r4, r2)
            boolean r4 = r2.isSampled()
            if (r4 == 0) goto L_0x00b1
            X.Vt6 r4 = r10.A00
            java.lang.String r17 = "baseEventFields"
            if (r4 == 0) goto L_0x0023
            java.lang.String r11 = r4.A08
            java.lang.String r5 = "Required value was null."
            if (r11 == 0) goto L_0x01fc
            java.lang.String r4 = "survey_id"
            r2.AAJ(r4, r11)
            X.Vt6 r4 = r10.A00
            if (r4 == 0) goto L_0x0023
            java.lang.Long r11 = r4.A02
            if (r11 == 0) goto L_0x01f6
            java.lang.String r4 = "tessa_config_id"
            r2.A9F(r4, r11)
            X.Vt6 r4 = r10.A00
            if (r4 == 0) goto L_0x0023
            java.lang.Long r4 = r4.A03
            if (r4 == 0) goto L_0x01f0
            X.C13992Tns.A0h(r2, r12, r4)
            X.Vt6 r4 = r10.A00
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = r4.A04
            if (r4 == 0) goto L_0x01ea
            X.DbS.A1O(r2, r4)
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            java.lang.String r4 = "page_dwell_time"
            r2.A9F(r4, r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r15)
            X.C13991Tnr.A15(r2, r4, r0)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "detailed_survey_type"
            r2.AAJ(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.Long r1 = r0.A00
            java.lang.String r0 = "ig_media_id"
            r2.A9F(r0, r1)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "notification_id"
            r2.AAJ(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "notification_type"
            r2.AAJ(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "notification_channel"
            r2.AAJ(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "ad_campaign_id"
            r2.A9F(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "ad_tracking_token"
            r2.AAJ(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            X.C51965G9l.A1D(r2, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "ranking_info_token"
            r2.AAJ(r0, r1)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "canonical_inventory_source"
            r2.AAJ(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "client_position"
            r2.A9F(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "feed_recs_post_position"
            r2.A9F(r0, r3)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.Long r1 = r0.A01
            java.lang.String r0 = "position_in_tray"
            r2.A9F(r0, r1)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "containing_tray_session_id"
            r2.AAJ(r0, r1)
            X.Vt6 r0 = r10.A00
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "containing_viewer_session_id"
            r2.AAJ(r0, r1)
            X.DbX.A1L(r2)
            goto L_0x00b1
        L_0x01db:
            r20 = r4
            r22 = r2
            r24 = r0
            r26 = r11
            r19 = r10
            r19.A01(r20, r22, r24, r26)
            goto L_0x00b1
        L_0x01ea:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x01f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x01f6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x01fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genericsurvey.fragment.GenericSurveyFragment.A05(java.lang.String):void");
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0O);
    }

    public final void D2M() {
        A05("close_button");
        0hq r0 = this.mFragmentManager;
        if (r0 != null) {
            r0.A0c();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D2Q() {
        A05("done_button");
        0hq r0 = this.mFragmentManager;
        if (r0 != null) {
            r0.A0c();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void D3A() {
        String str;
        C17997VjZ vjZ = this.A07;
        if (vjZ == null || this.A06 == null || (str = vjZ.A03.A04) == null || str.length() == 0) {
            C15257UXr uXr = this.A08;
            if (uXr != null) {
                String str2 = uXr.A04;
                if (str2 != null) {
                    String str3 = this.A09;
                    if (str3 != null) {
                        String A002 = VCA.A00(uXr, this.A00);
                        long currentTimeMillis = (this.A03 + System.currentTimeMillis()) - this.A02;
                        0lg A0X = DbT.A0X(this.A0O);
                        0qQ.A0B(A0X, 5);
                        C254523sc A0O2 = C13991Tnr.A0O(this, "skip_button");
                        A0O2.A78 = str2;
                        A0O2.A79 = str3;
                        A0O2.A6G = A002;
                        A0O2.A0B(currentTimeMillis);
                        A0O2.A0m = new 0jB();
                        C13991Tnr.A1F(A0X, A0O2);
                        A04(this);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C15257UXr uXr2 = this.A08;
            if (uXr2 != null) {
                String str4 = uXr2.A04;
                if (str4 != null) {
                    String str5 = this.A09;
                    if (str5 != null) {
                        String A003 = VCA.A00(uXr2, this.A00);
                        String str6 = vjZ.A03.A03;
                        if (str6 != null) {
                            0lg A0X2 = DbT.A0X(this.A0O);
                            0qQ.A0B(A0X2, 5);
                            C254523sc A0O3 = C13991Tnr.A0O(this, "skip_question");
                            A0O3.A78 = str4;
                            A0O3.A79 = str5;
                            A0O3.A6G = A003;
                            A0O3.A6X = str6;
                            A0O3.A0m = new 0jB();
                            C60510iO.A00(A0X2).EFq(A0O3.A00());
                            DbS.A1D(this);
                            A03(this);
                            C15462UdD udD = this.A05;
                            if (udD == null) {
                                DbS.A13();
                                throw AnonymousClass00P.createAndThrow();
                            }
                            C17983VjL vjL = this.A06;
                            if (vjL != null) {
                                C17997VjZ vjZ2 = this.A07;
                                if (vjZ2 != null) {
                                    String str7 = vjZ2.A03.A04;
                                    C17927ViI viI = udD.A03;
                                    int A004 = vjL.A00();
                                    int i = 0;
                                    while (true) {
                                        if (i >= A004) {
                                            i = 0;
                                            break;
                                        }
                                        String str8 = vjL.A01(i).A03.A03;
                                        if (str8 != null) {
                                            if (str8.equals(str7)) {
                                                break;
                                            }
                                            i++;
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                    viI.A00(i);
                                    C15462UdD.A00(udD);
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        0qQ.A0F("surveyType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void DFm(Object obj, Object obj2) {
        C17983VjL vjL = (C17983VjL) obj;
        C17927ViI viI = (C17927ViI) obj2;
        boolean A1U = AnonymousClass7TF.A1U(0, vjL, viI);
        C15257UXr uXr = this.A08;
        if (uXr != null) {
            List list = uXr.A06;
            if (list != null) {
                String str = uXr.A04;
                if (str != null) {
                    String str2 = this.A09;
                    if (str2 == null) {
                        0qQ.A0F("surveyType");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    String str3 = ((C17371VSy) list.get(this.A00)).A00;
                    if (str3 != null) {
                        int i = viI.A01;
                        AnonymousClass0eM r7 = this.A0O;
                        0lg A0X = DbT.A0X(r7);
                        String A002 = C66579MXk.A00(151);
                        0qQ.A0B(A0X, 7);
                        C254523sc A0O2 = C13991Tnr.A0O(this, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                        A0O2.A6H = A002;
                        A0O2.A78 = str;
                        A0O2.A79 = str2;
                        A0O2.A6G = str3;
                        A0O2.A0Z = i;
                        ArrayList arrayList = new ArrayList();
                        C17997VjZ A012 = vjL.A01(i);
                        0jB r6 = new 0jB();
                        r6.A0A("question_id", A012.A03.A03);
                        r6.A0C("answers", A012.A00());
                        arrayList.add(r6);
                        A0O2.A82 = arrayList;
                        A0O2.A0m = new 0jB();
                        C13991Tnr.A1F(A0X, A0O2);
                        C17983VjL vjL2 = this.A06;
                        if (vjL2 != null) {
                            int i2 = viI.A01;
                            Type type = C10038Rlb.A00;
                            ArrayList arrayList2 = new ArrayList();
                            C17997VjZ A013 = vjL2.A01(i2);
                            String str4 = A013.A03.A03;
                            List A0X2 = 00k.A0X(A013.A00());
                            if (str4 != null && AnonymousClass7TE.A1b(A0X2)) {
                                AnonymousClass7TF.A1I(str4, A0X2, arrayList2);
                            }
                            if (arrayList2.isEmpty()) {
                                0kD.A07(this.A0M, "Unable to log survey response event ig_survey_response due to empty rapid feedback logger responses, using old survey response format", (Throwable) null);
                                String str5 = vjL.A01(viI.A01).A03.A03;
                                List A0X3 = 00k.A0X(vjL.A01(viI.A01).A00());
                                if (str5 != null && AnonymousClass7TE.A1b(A0X3)) {
                                    arrayList2 = 0sr.A1L(DbW.A1b(str5, A0X3));
                                }
                            }
                            VI4.A00(AnonymousClass7TE.A0l(r7)).A03(arrayList2, this.A02, this.A01, (long) viI.A01, A1U);
                        }
                        if (this.A06 == null) {
                            0kD.A07(this.A0M, "Unable to log survey response event ig_survey_response due to currentSurveyQuestionModule being null", (Throwable) null);
                        }
                        View requireView = requireView();
                        C71392co r0 = C315596kB.A02;
                        C294975nL A014 = C294975nL.A01(requireView, 0);
                        A014.A0G();
                        A014.A0K(0.0f);
                        A014.A0H();
                        DbS.A1D(this);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ void DFo(Object obj, Object obj2) {
        C17983VjL vjL = (C17983VjL) obj;
        C17927ViI viI = (C17927ViI) obj2;
        boolean A1U = AnonymousClass7TF.A1U(0, vjL, viI);
        C15257UXr uXr = this.A08;
        if (uXr != null) {
            String str = uXr.A04;
            if (str != null) {
                List list = this.A0N;
                C17371VSy vSy = (C17371VSy) list.get(this.A00);
                0jB r10 = new 0jB();
                Integer num = viI.A03;
                if (num != null && num == AnonymousClass05K.A0C) {
                    r10.A05(C271774jZ.A8a, Boolean.valueOf(viI.A06));
                    r10.A05(C271774jZ.A8b, Boolean.valueOf(viI.A07));
                    0j9 r3 = C271774jZ.A8Z;
                    C15462UdD udD = this.A05;
                    if (udD != null) {
                        r10.A05(r3, Boolean.valueOf(udD.A02.A01.A0E()));
                        0j9 r32 = C271774jZ.A8c;
                        C15462UdD udD2 = this.A05;
                        if (udD2 != null) {
                            r10.A05(r32, Integer.valueOf(udD2.A02.A01.A06.getCurrentPositionMs()));
                            0j9 r33 = C271774jZ.A8d;
                            C15462UdD udD3 = this.A05;
                            if (udD3 != null) {
                                r10.A05(r33, Integer.valueOf(udD3.A02.A01.A06.AzN()));
                                0j9 r34 = C271774jZ.A8e;
                                C15462UdD udD4 = this.A05;
                                if (udD4 != null) {
                                    r10.A05(r34, Integer.valueOf(C14044Tol.A00(udD4.A02.A01)));
                                }
                            }
                        }
                    }
                    0qQ.A0F("adapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                String str2 = this.A09;
                if (str2 == null) {
                    0qQ.A0F("surveyType");
                    throw AnonymousClass00P.createAndThrow();
                }
                String str3 = vSy.A00;
                if (str3 != null) {
                    C15257UXr uXr2 = this.A08;
                    if (uXr2 != null) {
                        List list2 = uXr2.A06;
                        if (list2 != null) {
                            List<C17926ViH> list3 = ((C17371VSy) list2.get(this.A00)).A01;
                            if (list3 != null) {
                                String str4 = null;
                                for (C17926ViH viH : list3) {
                                    Integer num2 = viH.A08;
                                    if (num2 == AnonymousClass05K.A00 || num2 == AnonymousClass05K.A0C) {
                                        1Xj A002 = viH.A00();
                                        if (A002 != null) {
                                            str4 = A002.getId();
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                }
                                long currentTimeMillis = (this.A03 + System.currentTimeMillis()) - this.A02;
                                int i = viI.A02;
                                0lg A0X = DbT.A0X(this.A0O);
                                AnonymousClass7TF.A1G(str, 0, A0X);
                                C254523sc A0O2 = C13991Tnr.A0O(this, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                                A0O2.A78 = str;
                                A0O2.A6H = "finished";
                                A0O2.A79 = str2;
                                A0O2.A6G = str3;
                                A0O2.A5u = str4;
                                A0O2.A0B(currentTimeMillis);
                                A0O2.A0Z = i;
                                ArrayList arrayList = new ArrayList();
                                int A003 = vjL.A00();
                                for (int i2 = 0; i2 < A003; i2++) {
                                    C17997VjZ A012 = vjL.A01(i2);
                                    0jB r4 = new 0jB();
                                    r4.A0A("question_id", A012.A03.A03);
                                    r4.A0C("answers", A012.A00());
                                    arrayList.add(r4);
                                }
                                A0O2.A82 = arrayList;
                                A0O2.A0m = new 0jB();
                                A0O2.A0t = r10;
                                C13991Tnr.A1F(A0X, A0O2);
                                C15257UXr uXr3 = this.A08;
                                C45286Ctp ctp = null;
                                if (uXr3 != null) {
                                    ctp = uXr3.A01;
                                }
                                Integer num3 = AnonymousClass05K.A01;
                                if ((ctp == null || num3 != ctp.A01) && this.A00 >= DbT.A02(list, A1U ? 1 : 0)) {
                                    A05("auto_exit_after_completion");
                                    0hq r0 = this.mFragmentManager;
                                    if (r0 != null) {
                                        r0.A0c();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                                A04(this);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String getModuleName() {
        String str = this.A09;
        if (str != null) {
            return str;
        }
        0qQ.A0F("surveyType");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        A05("back_button");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return false;
        }
        1OP r0 = 1OP.$redex_init_class;
        AnonymousClass3K2 A042 = AnonymousClass3K2.A04(activity);
        if (A042 == null || !A042.A0a()) {
            return false;
        }
        return true;
    }

    public static final void A03(GenericSurveyFragment genericSurveyFragment) {
        2dZ AYJ = C13989Tnp.A0R(genericSurveyFragment).AYJ();
        if (AYJ != null) {
            AYJ.A0T();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A04(GenericSurveyFragment genericSurveyFragment) {
        DbS.A1D(genericSurveyFragment);
        genericSurveyFragment.A02 = System.currentTimeMillis();
        genericSurveyFragment.A03 = 0;
        C15462UdD udD = genericSurveyFragment.A05;
        if (udD != null) {
            C17927ViI viI = udD.A03;
            if (viI.A07) {
                udD.A02.A01.A0D("context_switch", true);
            }
            udD.A04.clear();
            viI.A08.clear();
            viI.A00(0);
            viI.A05 = false;
            viI.A04 = false;
            viI.A00 = 0;
            viI.A02 = 0;
            viI.A06 = false;
            viI.A07 = false;
            udD.A01.A04();
            C15462UdD.A00(udD);
            int i = genericSurveyFragment.A00;
            List list = genericSurveyFragment.A0N;
            if (i >= C51966G9m.A06(list)) {
                genericSurveyFragment.A0B = true;
                A03(genericSurveyFragment);
                A02(genericSurveyFragment);
                return;
            }
            AnonymousClass2xS r0 = genericSurveyFragment.A0H;
            if (r0 != null) {
                if (AnonymousClass4K8.A00(r0.A0G.A0J())) {
                    AnonymousClass2xS r1 = genericSurveyFragment.A0H;
                    if (r1 != null) {
                        r1.A0C("context_switch");
                    }
                }
                genericSurveyFragment.A00++;
                A03(genericSurveyFragment);
                C15462UdD udD2 = genericSurveyFragment.A05;
                if (udD2 != null) {
                    List list2 = ((C17371VSy) list.get(genericSurveyFragment.A00)).A01;
                    if (list2 != null) {
                        udD2.A0C(list2);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
            0qQ.A0F("feedVideoModule");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Db8(String str, int i) {
        this.A01 = System.currentTimeMillis();
        String sessionId = this.A0T.getSessionId();
        String A002 = VCA.A00(this.A08, this.A00);
        VC8.A00(AnonymousClass7TE.A0l(this.A0O), this, sessionId, A002, str, i);
    }

    public final void Dkn(C57250IUl iUl, C270054g7 r7) {
        if (0qQ.A0K(r7.A00(), "bake_off")) {
            0hq r0 = this.mFragmentManager;
            if (r0 != null) {
                r0.A0c();
                C309516Yo A0N2 = DbX.A0N(requireActivity(), this.A0O);
                IgFragmentFactoryImpl.A00();
                AdBakeOffFragment adBakeOffFragment = new AdBakeOffFragment();
                Bundle bundle = new Bundle();
                bundle.putString(C273654mx.A00(104), (String) null);
                DbW.A0y(bundle, adBakeOffFragment, A0N2);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(719571197);
        this.A03 += System.currentTimeMillis() - this.A02;
        AnonymousClass0fD.A0A(-808301759, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(1451412524);
        this.A02 = System.currentTimeMillis();
        AnonymousClass0fD.A0A(543659890, A032);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, X.30i] */
    /* JADX WARNING: type inference failed for: r0v30, types: [X.32y, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1795258400);
        GenericSurveyFragment.super.onCreate(bundle);
        AnonymousClass0eM r38 = this.A0O;
        AnonymousClass2kR r7 = new AnonymousClass2kR(requireContext(), AnonymousClass7TE.A0l(r38), this);
        this.A05 = new C15462UdD(requireActivity(), r7, this);
        this.A09 = requireArguments().getString("GenericSurveyFragment.SURVEY_TYPE", "");
        this.A0J = requireArguments().getString("GenericSurveyFragment.EXTRA_DATA_TOKEN", "");
        this.A0L = requireArguments().getString("GenericSurveyFragment.ARGUMENTS_TRACKING_TOKEN", "");
        this.A0K = requireArguments().getString("GenericSurveyFragment.ARGUMENTS_PARENT_MEDIA_ID", "");
        DbX.A0R(r38).A01(this.A0P, AnonymousClass6UQ.class);
        DbX.A0R(r38).A01(this.A0Q, C57066INg.class);
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C227762js A002 = C227752jr.A00(requireContext(), (Float) null, false);
        C15462UdD udD = this.A05;
        String str = "adapter";
        if (udD != null) {
            C228172ku r5 = this.A0S;
            C234172xD r4 = new C234172xD(this, A002, r5, udD);
            Context requireContext = requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(r38);
            C15462UdD udD2 = this.A05;
            if (udD2 != null) {
                this.A0H = new AnonymousClass2xS(requireContext, A0l, this, udD2);
                UserSession A0l2 = AnonymousClass7TE.A0l(r38);
                C15462UdD udD3 = this.A05;
                if (udD3 != null) {
                    C230572pq r1 = new C230572pq(A0l2, (AnonymousClass4DU) this, (C228402lc) udD3, (C249763kK) null);
                    C15462UdD udD4 = this.A05;
                    if (udD4 != null) {
                        C2355030c r20 = new C2355030c(this, r1, this, udD4, false);
                        UserSession A0l3 = AnonymousClass7TE.A0l(r38);
                        FragmentActivity requireActivity = requireActivity();
                        C15462UdD udD5 = this.A05;
                        if (udD5 != null) {
                            C234342xi r3 = new C234342xi(requireActivity, udD5, A0l3, this);
                            ? obj = new Object();
                            AnonymousClass2xI r2 = new AnonymousClass2xI(AnonymousClass7TE.A0l(r38), new C2355230e(AnonymousClass7TE.A0l(r38)));
                            this.A0F = C51969G9p.A0k();
                            Context requireContext2 = requireContext();
                            FragmentActivity requireActivity2 = requireActivity();
                            UserSession A0l4 = AnonymousClass7TE.A0l(r38);
                            C249763kK r12 = this.A0T;
                            2el r11 = this.A0F;
                            if (r11 != null) {
                                1sy r27 = 1sy.A0K;
                                C15980Ulw ulw = new C15980Ulw();
                                DbW.A1N(A0l4, 3, r12);
                                ArrayList arrayList = new ArrayList(1);
                                arrayList.add(ulw);
                                AnonymousClass30S A003 = GU3.A00(requireContext2, requireActivity2, this, A0l4, r11, this, (AnonymousClass2lU) null, r27, (AnonymousClass2xS) null, (C228182kv) null, (C234422xq) null, r12, (String) null, arrayList);
                                0hq parentFragmentManager = getParentFragmentManager();
                                C15462UdD udD6 = this.A05;
                                if (udD6 != null) {
                                    AnonymousClass2xS r112 = this.A0H;
                                    if (r112 != null) {
                                        UserSession A0l5 = AnonymousClass7TE.A0l(r38);
                                        C2355930l r10 = new C2355930l(requireActivity(), AnonymousClass7TE.A0l(r38));
                                        0Pl A004 = 0Pl.A0n.A00(requireContext(), AnonymousClass7TE.A0l(r38));
                                        2el r9 = this.A0F;
                                        if (r9 != null) {
                                            C54365HAg hAg = new C54365HAg(parentFragmentManager, this, r10, A0l5, r9, this.A0R, r20, this, r4, r2, A004, r112, A003, udD6, obj, r3, r12);
                                            0hq r113 = this.mFragmentManager;
                                            C15462UdD udD7 = this.A05;
                                            if (udD7 != null) {
                                                C2362232x r92 = new C2362232x(this, r113, udD7, r7);
                                                AnonymousClass2xS r72 = this.A0H;
                                                if (r72 != null) {
                                                    r92.A0G = r72;
                                                    r92.A08 = r20;
                                                    r92.A0R = r12;
                                                    r92.A0C = r4;
                                                    r92.A0Q = r3;
                                                    r92.A0A = hAg;
                                                    r92.A0E = r2;
                                                    r92.A0N = obj;
                                                    r92.A0B = new Object();
                                                    AnonymousClass332 A005 = r92.A00();
                                                    this.A0G = new AnonymousClass36D(AnonymousClass7TE.A0l(r38), new WWR(this, 2), false, false);
                                                    C234042wt r13 = new C234042wt(this, AnonymousClass7TE.A0l(r38), this);
                                                    AnonymousClass36D r0 = this.A0G;
                                                    if (r0 == null) {
                                                        str = "mediaUpdateListener";
                                                    } else {
                                                        registerLifecycleListener(r0);
                                                        registerLifecycleListener(r13);
                                                        0qQ.A0A(A005);
                                                        registerLifecycleListener(A005);
                                                        C15462UdD udD8 = this.A05;
                                                        if (udD8 != null) {
                                                            registerLifecycleListener(udD8);
                                                            r5.A01(A005);
                                                            int i2 = requireArguments().getInt("GenericSurveyFragment.ARGUMENTS_BLOKS_GENERIC_SURVEY_DELEGATE_KEY", -1);
                                                            if (i2 != -1) {
                                                                this.A0E = (VVJ) C14615TzM.A01(VVJ.class, Integer.valueOf(i2));
                                                            }
                                                            A01(this);
                                                            C15462UdD udD9 = this.A05;
                                                            if (udD9 != null) {
                                                                A0V(udD9);
                                                                AnonymousClass0fD.A09(1582036265, A022);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    0qQ.A0F("feedVideoModule");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                            0qQ.A0F("viewpointManager");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-707673643);
        0qQ.A0B(layoutInflater, 0);
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            Activity rootActivity = getRootActivity();
            0qQ.A0C(rootActivity, C66579MXk.A00(16));
            ((AnonymousClass2ZP) rootActivity).Enj(8);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_ad_survey, viewGroup, false);
        this.A04 = DbU.A0C(inflate, R.id.layout_container);
        this.endScreenViewStub = DbU.A0D(inflate, R.id.survey_end_screen);
        this.retryViewStub = DbU.A0D(inflate, R.id.survey_retry);
        this.contentContainer = DbU.A0C(inflate, R.id.content_container);
        this.loadingSpinner = DbX.A0k(inflate);
        this.navbarController = new C17989VjR(JTR.A0R(this), this);
        ViewGroup viewGroup2 = this.A04;
        C66580MXl.A1R(viewGroup2);
        AnonymousClass0fD.A09(-1305064042, A022);
        return viewGroup2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(100112190);
        super.onDestroy();
        14i.A06(this);
        AnonymousClass0eM r3 = this.A0O;
        DbX.A0R(r3).A02(this.A0P, AnonymousClass6UQ.class);
        DbX.A0R(r3).A02(this.A0Q, C57066INg.class);
        AnonymousClass0fD.A09(-1121700583, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1898914274);
        super.onDestroyView();
        this.A04 = null;
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            Activity rootActivity = getRootActivity();
            0qQ.A0C(rootActivity, C66579MXk.A00(16));
            ((AnonymousClass2ZP) rootActivity).Enj(0);
        }
        AnonymousClass0fD.A09(44631198, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(578613551);
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            A0G2.setSoftInputMode(this.A0D);
            DbS.A1D(this);
            GenericSurveyFragment.super.onPause();
            AnonymousClass0fD.A09(1754405616, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1882648723, A022);
        throw A0y;
    }

    public final void onResume() {
        IllegalStateException illegalStateException;
        int i;
        AnonymousClass3K2 A042;
        FragmentActivity activity;
        ViewGroup viewGroup;
        int A022 = AnonymousClass0fD.A02(-72329843);
        super.onResume();
        Window A0G2 = DbV.A0G(this);
        if (A0G2 != null) {
            this.A0D = A0G2.getAttributes().softInputMode;
            Window A0G3 = DbV.A0G(this);
            if (A0G3 != null) {
                A0G3.setSoftInputMode(16);
                FragmentActivity activity2 = getActivity();
                if (activity2 == null) {
                    A042 = null;
                } else {
                    1OP r0 = 1OP.$redex_init_class;
                    A042 = AnonymousClass3K2.A04(activity2);
                }
                if (!(A042 == null || !A042.A0Z() || (activity = getActivity()) == null)) {
                    1OP r02 = 1OP.$redex_init_class;
                    AnonymousClass3K2 A043 = AnonymousClass3K2.A04(activity);
                    if (!(A043 == null || (viewGroup = this.A04) == null)) {
                        viewGroup.post(new C20298Won(viewGroup, this, A043));
                    }
                }
                if (this.A0A) {
                    A04(this);
                    this.A0A = false;
                }
                AnonymousClass0fD.A09(-483256035, A022);
                return;
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -629640195;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -1881938449;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0fD.A03(-762507138);
        0qQ.A0B(absListView, 0);
        C15462UdD udD = this.A05;
        if (udD != null) {
            if (udD.A00) {
                if (W11.A01()) {
                    AnonymousClass7TF.A0D().postDelayed(new C20032Wjs(this), 0);
                } else if (W11.A02(absListView)) {
                    C15462UdD udD2 = this.A05;
                    if (udD2 != null) {
                        udD2.A00 = false;
                    }
                }
                AnonymousClass0fD.A0A(1192902625, A032);
                return;
            }
            this.A0S.onScroll(absListView, i, i2, i3);
            AnonymousClass0fD.A0A(1192902625, A032);
            return;
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D2 = AnonymousClass7TG.A0D(absListView, -2067981848);
        C15462UdD udD = this.A05;
        if (udD == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        if (!udD.A00) {
            this.A0S.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0fD.A0A(-971736117, A0D2);
    }
}
