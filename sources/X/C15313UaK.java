package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderView;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderViewWithoutWelcomeMessage;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.UaK  reason: case insensitive filesystem */
public abstract class C15313UaK extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenFormBaseFragment";
    public NestedScrollView A00;
    public IgLinearLayout A01;
    public IgLinearLayout A02;
    public IgTextView A03;
    public IgdsBottomButtonLayout A04;
    public LeadGenFormHeaderView A05;
    public LeadGenFormHeaderViewWithoutWelcomeMessage A06;
    public SpinnerImageView A07;
    public boolean A08;
    public IgdsStepperHeader A09;
    public C262204Co A0A;
    public C262204Co A0B;
    public boolean A0C;
    public final Rect A0D = new Rect();
    public final ViewTreeObserver.OnPreDrawListener A0E = new WCE(this, 2);
    public final Map A0F = new LinkedHashMap();
    public final AnonymousClass0eM A0G = C227642jf.A02(this);

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        r6.setTitle("");
        boolean A052 = A04().A05();
        int i = R.drawable.instagram_x_pano_outline_24;
        if (A052) {
            i = R.drawable.instagram_arrow_back_24;
        }
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A01(i);
        r6.ErG(new AnonymousClass3Jb(r1));
        W0D A002 = W0D.A00(this, r6);
        if (A04().A05()) {
            String A0m = DbU.A0m(this, 2131956164);
            WBA wba = new WBA((Object) this, 4);
            2da r12 = A002.A01;
            r12.Eiy(A0m, wba);
            r12.ARb(0, false);
            r12.ARb(0, true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        UserSession userSession;
        LeadGenEntryPoint leadGenEntryPoint;
        String str3;
        String str4;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C14773U8j A042 = A04();
        if (A042 instanceof C16058Unl) {
            C16058Unl unl = (C16058Unl) A042;
            boolean z = unl.A06;
            WYZ wyz = unl.A02;
            Long l = unl.A03;
            String str5 = unl.A04;
            if (z) {
                0qQ.A0B(str5, 1);
                str3 = "lead_gen_review_form";
                str4 = "review_lead_gen_form_impression";
            } else {
                0qQ.A0B(str5, 1);
                str3 = "lead_gen_preview_form";
                str4 = "preview_lead_gen_form_impression";
            }
            WYZ.A03(wyz, l, str3, str4, str5);
        } else if (!(A042 instanceof C16057Unk)) {
            C16056Unj unj = (C16056Unj) A042;
            boolean z2 = unj.A05;
            WYX wyx = unj.A01;
            Long l2 = unj.A03;
            if (z2) {
                str = "lead_gen_review_form";
                str2 = "review_lead_gen_form_impression";
            } else {
                str = "lead_gen_preview_form";
                str2 = "preview_lead_gen_form_impression";
            }
            WYX.A02(wyx, l2, str, str2);
        }
        this.A07 = DbX.A0k(view);
        this.A00 = (NestedScrollView) view.requireViewById(R.id.form_scrolling_area);
        DbV.A1F(getViewLifecycleOwner(), A04().A08, new C20786Wyx(this, 14), 8);
        C20786Wyx.A00(getViewLifecycleOwner(), A04().A07, this, 15, 8);
        this.A04 = C13990Tnq.A0Q(view);
        C20786Wyx.A00(getViewLifecycleOwner(), A04().A05, this, 16, 8);
        C20786Wyx.A00(getViewLifecycleOwner(), A04().A04, this, 17, 8);
        C20786Wyx.A00(getViewLifecycleOwner(), A04().A03, this, 18, 8);
        LeadGenFormHeaderView leadGenFormHeaderView = (LeadGenFormHeaderView) view.findViewById(R.id.lead_form_header_view);
        this.A05 = leadGenFormHeaderView;
        int i = 0;
        if (leadGenFormHeaderView != null) {
            leadGenFormHeaderView.setVisibility(DbW.A01(A04().A05() ^ true ? 1 : 0));
        }
        this.A06 = (LeadGenFormHeaderViewWithoutWelcomeMessage) view.findViewById(R.id.lead_form_header_view_without_welcome_message);
        this.A01 = (IgLinearLayout) view.findViewById(R.id.custom_questions_container);
        this.A02 = (IgLinearLayout) view.findViewById(R.id.customer_info_questions_container);
        IgTextView A0X = JTO.A0X(view, R.id.inline_legal_text);
        this.A03 = A0X;
        if (A0X != null) {
            DbT.A1H(A0X);
        }
        if (A04().A04()) {
            C14773U8j A043 = A04();
            boolean z3 = A043 instanceof C16058Unl;
            if (z3) {
                userSession = ((C16058Unl) A043).A01;
            } else if (A043 instanceof C16057Unk) {
                userSession = ((C16057Unk) A043).A03;
            } else {
                userSession = ((C16056Unj) A043).A02;
            }
            C18059Vki vki = new C18059Vki(userSession);
            String A002 = A043.A00();
            if (A002 == null) {
                A002 = "";
            }
            if (z3) {
                leadGenEntryPoint = ((C16058Unl) A043).A00;
            } else if (A043 instanceof C16057Unk) {
                leadGenEntryPoint = ((C16057Unk) A043).A02;
            } else {
                leadGenEntryPoint = ((C16056Unj) A043).A00;
            }
            DbY.A19(A043, new MH0(A043, (AnonymousClass4D7) null, 48), vki.A02(A002, leadGenEntryPoint.A00));
        }
        C20786Wyx.A00(getViewLifecycleOwner(), A04().A09, this, 19, 8);
        C20786Wyx.A00(getViewLifecycleOwner(), A04().A06, this, 20, 8);
        07U r7 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r7, this, (AnonymousClass4D7) null, 9), AnonymousClass07a.A00(viewLifecycleOwner));
        IgdsStepperHeader igdsStepperHeader = (IgdsStepperHeader) view.requireViewById(R.id.stepper_header);
        this.A09 = igdsStepperHeader;
        if (igdsStepperHeader != null) {
            igdsStepperHeader.setVisibility(DbW.A01(A04().A05() ? 1 : 0));
        }
        if (A04().A05()) {
            IgdsStepperHeader igdsStepperHeader2 = this.A09;
            if (igdsStepperHeader2 != null) {
                igdsStepperHeader2.A03(1, 2, true, false);
            }
            IgdsStepperHeader igdsStepperHeader3 = this.A09;
            if (igdsStepperHeader3 != null) {
                igdsStepperHeader3.A01();
            }
        }
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.preview_warning_banner);
        if (!A04().A04()) {
            i = 8;
        }
        A0G2.setVisibility(i);
    }

    public final C14766U8c A03() {
        if ((this instanceof C16006Umn) || !(this instanceof C16007Umo)) {
            return null;
        }
        return (C14766U8c) ((C16007Umo) this).A02.getValue();
    }

    public final C14773U8j A04() {
        AnonymousClass0eM r0;
        if (this instanceof C16006Umn) {
            r0 = ((C16006Umn) this).A00;
        } else if (this instanceof C16007Umo) {
            r0 = ((C16007Umo) this).A04;
        } else {
            r0 = ((C16005Umm) this).A00;
        }
        return (C14773U8j) r0.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.Un0} */
    /* JADX WARNING: type inference failed for: r3v8, types: [X.Umt, X.Un0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.ui.base.IgLinearLayout r8, X.C15313UaK r9, java.util.List r10) {
        /*
            r8.removeAllViews()
            java.util.Iterator r7 = r10.iterator()
        L_0x0007:
            boolean r0 = r7.hasNext()
            r2 = 1
            r3 = 33
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r5 = r7.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r5 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r5
            X.Uxp r0 = r5.A03
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x00e9
            r6 = 0
            if (r1 == r6) goto L_0x00e3
            r0 = 10
            android.content.Context r4 = r9.requireContext()
            if (r1 == r0) goto L_0x00d2
            r0 = 0
            X.Un0 r3 = new X.Un0
            r3.<init>(r4, r0, r6)
        L_0x002f:
            X.U6n r3 = (X.C14746U6n) r3
        L_0x0031:
            X.W33 r0 = X.W33.A00
            java.lang.String r4 = r0.A07(r5)
            r0.A06(r5)
            if (r3 == 0) goto L_0x0071
            java.util.Map r0 = r9.A0F
            r0.put(r5, r3)
            X.U8j r0 = r9.A04()
            boolean r0 = r0.A04()
            r0 = r0 ^ 1
            r3.setEnabled(r0)
            X.U8j r1 = r9.A04()
            boolean r0 = r1 instanceof X.C16058Unl
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r1 instanceof X.C16057Unk
            if (r0 == 0) goto L_0x00d0
            r0 = 1
        L_0x005b:
            r1 = 0
            r3.A0G(r5, r0, r1, r1)
            X.Uwe r0 = X.C16534Uwe.MULTIPLE_CHOICE
            boolean r0 = X.Dba.A1X(r0, r4)
            if (r0 == 0) goto L_0x00c8
            X.WYd r0 = new X.WYd
            r0.<init>(r9, r1)
            r3.A01 = r0
        L_0x006e:
            r8.addView(r3)
        L_0x0071:
            X.U8j r0 = r9.A04()
            X.2Fk r0 = r0.A06
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            if (r0 != 0) goto L_0x0007
            X.U8j r1 = r9.A04()
            boolean r0 = r1 instanceof X.C16058Unl
            if (r0 != 0) goto L_0x009e
            boolean r0 = r1 instanceof X.C16057Unk
            if (r0 == 0) goto L_0x009e
            X.Unk r1 = (X.C16057Unk) r1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.WYY r3 = r1.A04
            java.lang.String r2 = r1.A00
            boolean r1 = r1.A00
            java.lang.String r0 = "question_impression"
            X.WYY.A02(r3, r0, r2, r4, r1)
        L_0x009e:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0007
            X.U8j r1 = r9.A04()
            boolean r0 = r1 instanceof X.C16058Unl
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r1 instanceof X.C16057Unk
            if (r0 == 0) goto L_0x00bf
            X.Unk r1 = (X.C16057Unk) r1
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.WYY r3 = r1.A04
            java.lang.String r2 = r1.A00
            boolean r1 = r1.A00
            java.lang.String r0 = "answer_prefilled"
            X.WYY.A02(r3, r0, r2, r4, r1)
        L_0x00bf:
            boolean r0 = r9.A0C
            if (r0 != 0) goto L_0x0007
            r9.A04()
            goto L_0x0007
        L_0x00c8:
            X.WYh r0 = new X.WYh
            r0.<init>(r9)
            r3.A02 = r0
            goto L_0x006e
        L_0x00d0:
            r0 = 0
            goto L_0x005b
        L_0x00d2:
            r0 = 13
            X.Wyx r1 = new X.Wyx
            r1.<init>(r9, r0)
            r0 = 0
            X.Umt r3 = new X.Umt
            r3.<init>(r4, r0, r6)
            r3.A00 = r1
            goto L_0x002f
        L_0x00e3:
            X.U6n r3 = X.C14746U6n.A00(r9, r5)
            goto L_0x002f
        L_0x00e9:
            r3 = 0
            goto L_0x0031
        L_0x00ec:
            r9.A0C = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15313UaK.A00(com.instagram.common.ui.base.IgLinearLayout, X.UaK, java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (r5.A04().A05() == false) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C15313UaK r5, boolean r6) {
        /*
            X.U8j r0 = r5.A04()
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0059
            if (r6 == 0) goto L_0x0059
        L_0x000c:
            android.content.Context r1 = r5.requireContext()
            X.0eM r0 = r5.A0G
            X.Dg1 r4 = X.C46498Dg1.A00(r1, r0)
            X.0rm r3 = new X.0rm
            r3.<init>()
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964722(0x7f133332, float:1.9566234E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A08(r0)
            r2 = 2131964724(0x7f133334, float:1.9566238E38)
            r1 = 3
            X.WB2 r0 = new X.WB2
            r0.<init>((int) r1, (java.lang.Object) r5, (boolean) r6)
            r4.A04(r0, r2)
            r1 = 2131964725(0x7f133335, float:1.956624E38)
            r0 = 44
            X.WBG.A02(r5, r4, r3, r0, r1)
            X.U8j r1 = r5.A04()
            boolean r0 = r1 instanceof X.C16058Unl
            if (r0 != 0) goto L_0x0058
            boolean r0 = r1 instanceof X.C16057Unk
            if (r0 == 0) goto L_0x0058
            X.Unk r1 = (X.C16057Unk) r1
            X.WYY r4 = r1.A04
            java.lang.String r3 = r1.A00
            boolean r2 = r1.A00
            java.lang.String r1 = "discard_confirmation_dialog_impression"
            java.lang.String r0 = "impression"
            X.WYY.A01(r4, r1, r0, r3, r2)
        L_0x0058:
            return
        L_0x0059:
            java.util.Map r0 = r5.A0F
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r0)
        L_0x005f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()
            X.U6n r0 = (X.C14746U6n) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x005f
            goto L_0x000c
        L_0x0070:
            if (r6 != 0) goto L_0x007d
            X.U8j r0 = r5.A04()
            boolean r0 = r0.A05()
            r1 = 1
            if (r0 != 0) goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            boolean r0 = r5 instanceof X.C16007Umo
            if (r0 == 0) goto L_0x0058
            X.Umo r5 = (X.C16007Umo) r5
            r0 = r1 ^ 1
            X.C16007Umo.A02(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15313UaK.A01(X.UaK, boolean):void");
    }

    public final boolean onBackPressed() {
        String str;
        String str2;
        C14773U8j A042 = A04();
        if (A042 instanceof C16058Unl) {
            C16058Unl unl = (C16058Unl) A042;
            boolean z = unl.A06;
            WYZ wyz = unl.A02;
            Long l = unl.A03;
            String str3 = unl.A04;
            if (z) {
                0qQ.A0B(str3, 1);
                str2 = "lead_gen_review_form";
            } else {
                0qQ.A0B(str3, 1);
                str2 = "lead_gen_preview_form";
            }
            WYZ.A02(wyz, l, str2, "cancel", str3);
        } else if (A042 instanceof C16057Unk) {
            C16057Unk unk = (C16057Unk) A042;
            WYY.A01(unk.A04, "cancel", "click", unk.A00, unk.A00);
        } else {
            C16056Unj unj = (C16056Unj) A042;
            boolean z2 = unj.A05;
            WYX wyx = unj.A01;
            Long l2 = unj.A03;
            if (z2) {
                str = "lead_gen_review_form";
            } else {
                str = "lead_gen_preview_form";
            }
            WYX.A01(wyx, l2, str, "cancel");
        }
        if (A04().A04()) {
            return false;
        }
        A01(this, false);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(489420730);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_form_preview, viewGroup, false);
        AnonymousClass0fD.A09(1684266023, A022);
        return inflate;
    }

    public void onDestroyView() {
        ViewTreeObserver viewTreeObserver;
        int A022 = AnonymousClass0fD.A02(-1747269433);
        super.onDestroyView();
        IgTextView igTextView = this.A03;
        if (!(igTextView == null || (viewTreeObserver = igTextView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnPreDrawListener(this.A0E);
        }
        this.A05 = null;
        this.A09 = null;
        this.A06 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-149264938, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UaK, androidx.fragment.app.Fragment] */
    public void onStart() {
        int A022 = AnonymousClass0fD.A02(752428104);
        C15313UaK.super.onStart();
        C14766U8c A032 = A03();
        C262204Co r0 = null;
        if (A032 != null) {
            r0 = C20592WvV.A00(this, A032.A01, 17);
        }
        this.A0A = r0;
        this.A0B = C20592WvV.A00(this, A04().A0B, 18);
        AnonymousClass0fD.A09(1913196398, A022);
    }

    public void onStop() {
        int A022 = AnonymousClass0fD.A02(2033316814);
        C15313UaK.super.onStop();
        C262204Co r0 = this.A0A;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A0A = null;
        C262204Co r02 = this.A0B;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A0B = null;
        AnonymousClass0fD.A09(1732944927, A022);
    }
}
