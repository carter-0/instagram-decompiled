package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.Umf  reason: case insensitive filesystem */
public final class C15998Umf extends C15267UYh implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadAdsMultiStepFormFragment";
    public ViewPager2 A00;
    public IgdsPeopleCell A01;
    public IgdsStepperHeader A02;
    public C15263UYd A03;
    public C14792U9h A04;
    public LeadGenFormStaticHeaderView A05;
    public boolean A06;
    public C262204Co A07;
    public C262204Co A08;
    public final int A09 = 2131964678;
    public final int A0A = 2131970405;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        C13992Tns.A0s(r6, "");
        W0D A002 = W0D.A00(this, r6);
        String A0m = DbU.A0m(this, 2131956164);
        WBA wba = new WBA(this, 13);
        2da r1 = A002.A01;
        r1.Eiy(A0m, wba);
        r1.ARb(0, false);
        r1.ARb(0, true);
    }

    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r0 = 0
            r3 = r15
            X.0qQ.A0B(r15, r0)
            r6 = r14
            r1 = r16
            super.onViewCreated(r15, r1)
            X.VsB r1 = X.C16039UnS.A00(r14)
            X.XB6 r8 = r1.A00
            java.lang.String r10 = r1.A01
            r7 = 0
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "form_id"
            android.os.Bundle r9 = X.DbY.A0B(r1, r2)
            java.lang.String r11 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r12 = "consumer_question_screen_impression"
            java.lang.String r13 = "impression"
            r8.Cgq(r9, r10, r11, r12, r13)
            r1 = 2131441765(0x7f0b3865, float:1.850555E38)
            android.view.View r1 = r15.requireViewById(r1)
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r1 = (com.instagram.igds.components.stepperheader.IgdsStepperHeader) r1
            r14.A02 = r1
            r1 = 2131427826(0x7f0b01f2, float:1.847728E38)
            android.view.View r2 = r15.requireViewById(r1)
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r2 = (com.instagram.igds.components.peoplecell.IgdsPeopleCell) r2
            r14.A01 = r2
            if (r2 == 0) goto L_0x004a
            X.UnS r1 = X.C13990Tnq.A0R(r14)
            boolean r1 = r1.A09
            int r1 = X.DbW.A01(r1)
            r2.setVisibility(r1)
        L_0x004a:
            X.UnS r1 = X.C13990Tnq.A0R(r14)
            boolean r1 = r1.A09
            if (r1 == 0) goto L_0x00eb
            X.07U r5 = X.07U.A05
            X.07Z r4 = r14.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r8 = 2
            X.MHL r2 = new X.MHL
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x0062:
            X.AnonymousClass7TE.A1Z(r2, r1)
        L_0x0065:
            r1 = 2131436605(0x7f0b243d, float:1.8495085E38)
            android.view.View r1 = r15.requireViewById(r1)
            androidx.viewpager2.widget.ViewPager2 r1 = (androidx.viewpager2.widget.ViewPager2) r1
            r14.A00 = r1
            if (r1 == 0) goto L_0x0075
            r1.setUserInputEnabled(r0)
        L_0x0075:
            androidx.viewpager2.widget.ViewPager2 r1 = r14.A00
            r7 = 0
            if (r1 == 0) goto L_0x00e9
            android.view.View r1 = r1.getChildAt(r0)
        L_0x007e:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x0089
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x0089
            r1.setItemAnimator(r7)
        L_0x0089:
            X.UnS r0 = X.C13990Tnq.A0R(r14)
            com.instagram.common.session.UserSession r3 = r0.A0H
            X.Vl6 r2 = new X.Vl6
            r2.<init>(r14)
            android.os.Bundle r1 = r14.mArguments
            X.0hq r0 = r14.getParentFragmentManager()
            int r0 = r0.A0M()
            X.UKU r0 = X.VEM.A00(r1, r0)
            X.U9h r1 = new X.U9h
            r1.<init>(r3, r14, r0, r2)
            r14.A04 = r1
            androidx.viewpager2.widget.ViewPager2 r0 = r14.A00
            if (r0 == 0) goto L_0x00b0
            r0.setAdapter(r1)
        L_0x00b0:
            X.07U r5 = X.07U.A05
            X.07Z r4 = r14.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r4)
            r8 = 11
            X.MGh r3 = new X.MGh
            r3.<init>(r4, r5, r6, r7, r8)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r3, r0)
            X.07Z r4 = r14.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r4)
            r8 = 12
            X.MGh r3 = new X.MGh
            r3.<init>(r4, r5, r6, r7, r8)
            X.1Eo.A05(r1, r3, r0)
            androidx.viewpager2.widget.ViewPager2 r2 = r14.A00
            if (r2 == 0) goto L_0x00e5
            r1 = 2
            X.UFV r0 = new X.UFV
            r0.<init>(r14, r1)
            r2.A05(r0)
        L_0x00e5:
            X.W1T.A00(r14)
            return
        L_0x00e9:
            r1 = r7
            goto L_0x007e
        L_0x00eb:
            X.UnS r1 = X.C13990Tnq.A0R(r14)
            boolean r1 = r1.A0B
            if (r1 == 0) goto L_0x0065
            r1 = 2131433118(0x7f0b169e, float:1.8488013E38)
            android.view.View r1 = r15.requireViewById(r1)
            com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView r1 = (com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView) r1
            r14.A05 = r1
            X.07U r10 = X.07U.A05
            X.07Z r9 = r14.getViewLifecycleOwner()
            X.0xx r1 = X.AnonymousClass07a.A00(r9)
            r13 = 13
            X.MGh r2 = new X.MGh
            r8 = r2
            r11 = r14
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15998Umf.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final Bundle A00(C15998Umf umf) {
        int i;
        Bundle bundle = new Bundle();
        bundle.putAll(umf.mArguments);
        bundle.putString("thank_you_page_id", ((C16039UnS) umf.A0D.getValue()).A0J.A03);
        ViewPager2 viewPager2 = umf.A00;
        if (viewPager2 != null) {
            i = viewPager2.A00;
        } else {
            i = 0;
        }
        bundle.putInt("thank_you_page_index", i);
        return bundle;
    }

    public static final C61354K3w A01(C15998Umf umf, String str, String str2) {
        C61354K3w k3w = new C61354K3w();
        k3w.setArguments(DbY.A0C(AnonymousClass000.A00(2916), str2, new 0eP("IgSessionManager.SESSION_TOKEN_KEY", C13990Tnq.A0R(umf).A0H.A05), new 0eP(AnonymousClass000.A00(566), str)));
        return k3w;
    }

    public static final String A02(C15998Umf umf) {
        ViewPager2 viewPager2 = umf.A00;
        if (viewPager2 == null) {
            return "Unknown";
        }
        return C13990Tnq.A0R(umf).A01(viewPager2.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (X.C13990Tnq.A0R(r3).A05 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C15998Umf r3, int r4, boolean r5) {
        /*
            X.U9h r0 = r3.A04
            if (r0 == 0) goto L_0x003f
            int r1 = r0.getItemCount()
        L_0x0008:
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r2 = r3.A02
            if (r2 == 0) goto L_0x001d
            r0 = 1
            if (r1 <= r0) goto L_0x0018
            X.UnS r0 = X.C13990Tnq.A0R(r3)
            boolean r1 = r0.A05
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r0 = 8
        L_0x001a:
            r2.setVisibility(r0)
        L_0x001d:
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r2 = r3.A02
            if (r2 == 0) goto L_0x0035
            X.UnS r0 = X.C13990Tnq.A0R(r3)
            X.05G r0 = r0.A0a
            java.util.List r0 = X.JTO.A16(r0)
            if (r0 == 0) goto L_0x003d
            int r1 = r0.size()
        L_0x0031:
            r0 = 1
            r2.A03(r4, r1, r0, r5)
        L_0x0035:
            com.instagram.igds.components.stepperheader.IgdsStepperHeader r0 = r3.A02
            if (r0 == 0) goto L_0x003c
            r0.A01()
        L_0x003c:
            return
        L_0x003d:
            r1 = 0
            goto L_0x0031
        L_0x003f:
            r1 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15998Umf.A03(X.Umf, int, boolean):void");
    }

    public static final void A05(C15998Umf umf, List list) {
        Object obj;
        List list2;
        String str;
        C14766U8c u8c = (C14766U8c) umf.A0B.getValue();
        if (u8c != null) {
            u8c.A00(C13990Tnq.A0R(umf).A02(), list, C13990Tnq.A0R(umf).A0V);
        }
        List A022 = C13990Tnq.A0R(umf).A02();
        ArrayList<LeadGenFormBaseQuestion> arrayList = new ArrayList<>();
        for (Object next : A022) {
            C16595Uxp uxp = ((LeadGenFormBaseQuestion) next).A03;
            if (uxp == C16595Uxp.A0Z || uxp == C16595Uxp.A0P) {
                arrayList.add(next);
            }
        }
        for (LeadGenFormBaseQuestion leadGenFormBaseQuestion : arrayList) {
            C18532Vtk vtk = C18532Vtk.A00;
            Context context = umf.getContext();
            Iterator it = ((Iterable) C13990Tnq.A0R(umf).A0a.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C15045UKy) obj).A03 == C16527UwW.CUSTOMER_INFO) {
                    break;
                }
            }
            C15045UKy uKy = (C15045UKy) obj;
            if (uKy == null || (list2 = uKy.A07) == null) {
                list2 = 0sn.A00;
            }
            boolean A002 = vtk.A00(context, leadGenFormBaseQuestion, list2, false, true);
            String A062 = W33.A00.A06(leadGenFormBaseQuestion);
            if (A062 != null) {
                C18462VsB A003 = C16039UnS.A00(umf);
                String A023 = A02(umf);
                if (A002) {
                    str = RealtimeConstants.SEND_SUCCESS;
                } else {
                    str = RealtimeConstants.SEND_FAIL;
                }
                A003.A00.Cgq(C18462VsB.A00(A003, A023, A062), A003.A01, "lead_gen_multi_step_consumer_questions", "pii_validation_result", str);
            }
        }
    }

    public final void A0A(boolean z) {
        AnonymousClass0eM r3 = this.A0D;
        if (!((C16039UnS) r3.getValue()).A0f) {
            W1T w1t = W1T.A00;
            if (z) {
                W1T.A01(requireActivity(), ((C16039UnS) r3.getValue()).A0H, ((C16039UnS) r3.getValue()).A0e);
            } else {
                w1t.A03(this, ((C16039UnS) r3.getValue()).A0H, ((C16039UnS) r3.getValue()).A0e);
            }
        } else if (getParentFragmentManager().A0M() == 0 || z) {
            UserSession userSession = ((C16039UnS) r3.getValue()).A0H;
            Activity A032 = DbT.A03(this);
            AnonymousClass7TG.A1N(userSession, A032);
            C71342cb.A00(userSession).A06(A032);
            A032.finish();
        } else {
            DbT.A1I(this);
        }
    }

    public final boolean onBackPressed() {
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 == null) {
            return false;
        }
        if (viewPager2.A00 > C13990Tnq.A0R(this).A07) {
            U8P A072 = A07();
            int i = viewPager2.A00;
            AnonymousClass7TE.A1Z(new C66164MGb(A072, (AnonymousClass4D7) null, i, 25), C318116oQ.A00(A072));
            return true;
        }
        C18462VsB A002 = C16039UnS.A00(this);
        String A022 = A02(this);
        XB6.A00(C18462VsB.A00(A002, A022, (String) null), A002.A00, A002.A01, "lead_gen_multi_step_consumer_questions", "cancel");
        A06(this, false);
        return true;
    }

    public C15998Umf() {
        C20696WxS wxS = new C20696WxS(this, 16);
        C20696WxS wxS2 = new C20696WxS(this, 8);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C20696WxS.A00(wxS2, r7, 9);
        this.A0D = new C227862kA(new C20696WxS(A002, 10), wxS, new C73666Phf(40, (Object) null, A002), new 0Yh(C16039UnS.class));
        C20696WxS wxS3 = new C20696WxS(this, 14);
        AnonymousClass0eM A003 = C20696WxS.A00(new C20696WxS(this, 11), r7, 12);
        this.A0B = new C227862kA(new C20696WxS(A003, 13), wxS3, new C73666Phf(41, (Object) null, A003), new 0Yh(C16043UnW.class));
        C20696WxS wxS4 = new C20696WxS(this, 15);
        AnonymousClass0eM A004 = C20696WxS.A00(new C20696WxS(this, 5), r7, 6);
        this.A0C = new C227862kA(new C20696WxS(A004, 7), wxS4, new C73666Phf(39, (Object) null, A004), new 0Yh(C14771U8h.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r1 == X.AnonymousClass05K.A00) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C15998Umf r4, com.instagram.leadgen.core.model.LeadGenProfileContentInfo r5) {
        /*
            java.lang.String r1 = A02(r4)
            com.instagram.leadgen.core.ui.LeadGenFormStaticHeaderView r3 = r4.A05
            if (r3 == 0) goto L_0x002d
            r2 = 0
            if (r5 == 0) goto L_0x002e
            X.UwW r0 = X.C16527UwW.DISQUALIFIED_LEAD
            boolean r0 = X.Dba.A1X(r0, r1)
            if (r0 != 0) goto L_0x002e
            X.UwW r0 = X.C16527UwW.ERROR
            boolean r0 = X.Dba.A1X(r0, r1)
            if (r0 != 0) goto L_0x002e
            r4.A07()
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r0 = r5.A01
            if (r0 == 0) goto L_0x002e
            java.lang.Integer r1 = r0.A04
            if (r1 == 0) goto L_0x002e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x002e
        L_0x002a:
            r3.setVisibility(r2)
        L_0x002d:
            return
        L_0x002e:
            r2 = 8
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15998Umf.A04(X.Umf, com.instagram.leadgen.core.model.LeadGenProfileContentInfo):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0rm, java.lang.Object] */
    public static final void A06(C15998Umf umf, boolean z) {
        XB6 xb6;
        String str;
        Bundle A002;
        String str2;
        String str3;
        if (C13990Tnq.A0R(umf).A06) {
            0nA.A0N(C13991Tnr.A06(umf));
            String A022 = A02(umf);
            str2 = "lead_gen_gated_content_confirmation_bottom_sheet";
            int i = 2131964727;
            int i2 = 2131964725;
            if (C13990Tnq.A0R(umf).A07()) {
                i = 2131964728;
                i2 = 2131964726;
            }
            C331127Pr r3 = new C331127Pr(C13990Tnq.A0R(umf).A0H);
            r3.A0g = umf.getString(i2);
            r3.A1J = true;
            r3.A0K = new W9h(A022, umf, 6);
            r3.A0h = umf.getString(2131964724);
            r3.A1N = true;
            r3.A0L = new W9h(A022, umf, 7);
            r3.A0U = new C19687Wdp(umf, A022, 1);
            C331157Pu A003 = r3.A00();
            FragmentActivity requireActivity = umf.requireActivity();
            String string = umf.getString(2131964729);
            String str4 = C13990Tnq.A0R(umf).A03;
            if (str4 == null) {
                str4 = "";
            }
            A003.A02(requireActivity, A01(umf, string, DbV.A0z(umf, str4, i)));
            C18461VsA vsA = C13990Tnq.A0R(umf).A0L;
            xb6 = vsA.A00;
            str = vsA.A01;
            A002 = C18461VsA.A00(vsA, A022);
            str3 = C66579MXk.A00(264);
        } else {
            boolean z2 = C13990Tnq.A0R(umf).A09;
            boolean z3 = C13990Tnq.A0R(umf).A08;
            if (z2) {
                if (z3) {
                    0nA.A0N(C13991Tnr.A06(umf));
                    C358248ab A0H = Dba.A0H(umf);
                    A0H.A09(2131964722);
                    A0H.A0Q(new W5U(umf, 23), C358278ae.DEFAULT, 2131964724);
                    W5U.A01(A0H, umf, 24, 2131964725);
                    DbT.A1V(A0H);
                    C18462VsB A004 = C16039UnS.A00(umf);
                    String A023 = A02(umf);
                    xb6 = A004.A00;
                    str = A004.A01;
                    A002 = C18462VsB.A00(A004, A023, (String) null);
                    str2 = "lead_gen_multi_step_consumer_questions";
                    str3 = "discard_confirmation_pop_up_dialog_impression";
                } else {
                    C15263UYd uYd = umf.A03;
                    if (uYd != null) {
                        QAL qal = uYd.A00;
                        if (qal == null) {
                            0qQ.A0F("dialog");
                            throw AnonymousClass00P.createAndThrow();
                        } else {
                            qal.dismiss();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (z3) {
                0nA.A0N(C13991Tnr.A06(umf));
                C46498Dg1 dg1 = new C46498Dg1(umf.requireContext(), C13990Tnq.A0R(umf).A0H);
                ? obj = new Object();
                boolean A072 = C13990Tnq.A0R(umf).A07();
                int i3 = 2131964722;
                if (A072) {
                    i3 = 2131964723;
                }
                String A0m = DbU.A0m(umf, i3);
                int i4 = 2131964725;
                if (A072) {
                    i4 = 2131964726;
                }
                dg1.A08(A0m);
                dg1.A04(new WBG(45, umf, obj), 2131964724);
                WBG.A02(umf, dg1, obj, 46, i4);
                C18462VsB A005 = C16039UnS.A00(umf);
                String A024 = A02(umf);
                xb6 = A005.A00;
                str = A005.A01;
                A002 = C18462VsB.A00(A005, A024, (String) null);
                str2 = "lead_gen_multi_step_consumer_questions";
                str3 = "discard_confirmation_dialog_impression";
            } else {
                umf.A0A(z);
                return;
            }
        }
        xb6.Cgq(A002, str, str2, str3, "impression");
    }

    public final void A09(String str) {
        Activity A032 = DbT.A03(this);
        AnonymousClass0eM r1 = this.A0D;
        UserSession userSession = ((C16039UnS) r1.getValue()).A0H;
        String str2 = ((C16039UnS) r1.getValue()).A0W;
        Bundle requireArguments = requireArguments();
        C51973G9u.A1E(A032, userSession, str2);
        C18744Vze.A00(requireArguments, userSession, this, str2, str);
        if (str != null) {
            SUL sul = new SUL(A032, userSession, 2EG.A2C, 0cp.A03(str).toString(), false);
            sul.A0S = getModuleName();
            sul.A0A();
        }
    }

    public final AnonymousClass0wW getSession() {
        return C13990Tnq.A0R(this).A0H;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1330719214);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_multi_step_form, viewGroup, false);
        AnonymousClass0fD.A09(419109169, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(92514587);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A05 = null;
        ViewPager2 viewPager2 = this.A00;
        if (viewPager2 != null) {
            viewPager2.setAdapter((2Rw) null);
        }
        this.A04 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(1122628441, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.UYh, X.07Z, X.Umf] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1694801973);
        super.onStart();
        C14766U8c u8c = (C14766U8c) this.A0B.getValue();
        C262204Co r0 = null;
        if (u8c != null) {
            r0 = C20592WvV.A00(this, u8c.A01, 21);
        }
        this.A08 = r0;
        this.A07 = C20592WvV.A00(this, C13990Tnq.A0R(this).A0Y, 22);
        AnonymousClass0fD.A09(1206710616, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1196813727);
        super.onStop();
        C262204Co r0 = this.A08;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A08 = null;
        C262204Co r02 = this.A07;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A07 = null;
        AnonymousClass0fD.A09(1210327010, A022);
    }
}
