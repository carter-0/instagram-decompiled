package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Map;

/* renamed from: X.E4z  reason: case insensitive filesystem */
public final class C47494E4z extends AnonymousClass4DH implements AnonymousClass4DR, C252293os, AnonymousClass4DS, C51925G7t {
    public static final String __redex_internal_original_name = "OptInEmailFragment";
    public BusinessFlowAnalyticsLogger A00;
    public String A01;
    public boolean A02;
    public boolean A03 = true;
    public G8D A04;
    public EEJ A05;
    public IgdsListCell A06;
    public String A07;
    public boolean A08 = true;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final /* synthetic */ void DVx(int i, int i2) {
    }

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final /* synthetic */ void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final /* synthetic */ void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final void Di0() {
    }

    public final /* synthetic */ void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final /* synthetic */ void DzE(View view) {
    }

    public final String getModuleName() {
        return "opt_in_email_fragment";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C47494E4z.super.onAttach(context);
        G8D A012 = FG1.A01(this);
        if (A012 != null) {
            this.A04 = A012;
            return;
        }
        throw AnonymousClass7TE.A0z("controller must not be null");
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.E4z] */
    public final void DZI() {
        String str;
        String str2;
        String str3;
        boolean z = this.A03;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        if (z != this.A02) {
            Context requireContext = requireContext();
            0gy A002 = AnonymousClass07i.A00(this);
            1OC A012 = F7X.A01(AnonymousClass7TE.A0l(this.A0A), "marketing_email", str);
            A012.A00 = C47697EDg.A00(this, 21);
            1ES.A00(requireContext, A002, A012);
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str3 = "logger";
        } else {
            String str4 = this.A01;
            if (this.A03) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            businessFlowAnalyticsLogger.Ci7(new C22030Xtl("opt_in_promotional_email", str4, (String) null, (String) null, (String) null, (Map) null, DbY.A0m("opt_in_promotional_email_setting", str2), (Map) null));
            G8D g8d = this.A04;
            if (g8d == null) {
                str3 = "controller";
            } else {
                ((BusinessConversionActivity) g8d).Clz((Bundle) null);
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean onBackPressed() {
        G8D g8d = this.A04;
        if (g8d == null) {
            0qQ.A0F("controller");
            throw AnonymousClass00P.createAndThrow();
        }
        Dba.A1R(g8d);
        return true;
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1J(r3);
        FPB.A02(DbV.A0K(), r3, this, 59);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2051079325);
        C47494E4z.super.onCreate(bundle);
        String string = requireArguments().getString("user_email");
        if (string == null) {
            string = "";
        }
        this.A07 = string;
        this.A09 = requireArguments().getBoolean("is_creator");
        this.A01 = DbX.A0o(this);
        0lg A0X = DbT.A0X(this.A0A);
        G8D g8d = this.A04;
        if (g8d != null) {
            C319586qr B6a = g8d.B6a();
            G8D g8d2 = this.A04;
            if (g8d2 != null) {
                BusinessFlowAnalyticsLogger A002 = C319596qs.A00(B6a, this, A0X, (String) AnonymousClass7TE.A14(((BusinessConversionActivity) g8d2).A0C));
                if (A002 != null) {
                    this.A00 = A002;
                    AnonymousClass0fD.A09(-649256929, A022);
                    return;
                }
                IllegalStateException A0z = AnonymousClass7TE.A0z("received null flowType or unexpected value for flowType");
                AnonymousClass0fD.A09(1283562733, A022);
                throw A0z;
            }
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(853071034);
        0qQ.A0B(layoutInflater, 0);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            businessFlowAnalyticsLogger.Cka(new C22030Xtl("opt_in_promotional_email", this.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            View inflate = layoutInflater.inflate(R.layout.opt_in_email_fragment, viewGroup, false);
            boolean z = this.A09;
            IgdsHeadline A0U = DbZ.A0U(inflate, R.id.opt_in_email_headline);
            int i = 2131969049;
            if (z) {
                i = 2131969050;
            }
            A0U.setHeadline(i);
            IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.opt_in_email_footer);
            Resources A052 = DbV.A05(this);
            String str2 = this.A07;
            if (str2 == null) {
                str = "userEmail";
            } else {
                Spanned A072 = DbU.A07(A052, str2, 2131969046);
                0qQ.A07(A072);
                igdsListCell.A0I(A072);
                igdsListCell.A08(R.style.PrivacyTextStyle, 2Yu.A07(getContext()));
                IgdsListCell igdsListCell2 = (IgdsListCell) inflate.requireViewById(R.id.promotional_emails_cell);
                this.A06 = igdsListCell2;
                str = "promotionalEmailsCell";
                if (igdsListCell2 != null) {
                    igdsListCell2.setTextCellType(C69349Njo.TYPE_SWITCH);
                    IgdsListCell igdsListCell3 = this.A06;
                    if (igdsListCell3 != null) {
                        Dba.A14(this, igdsListCell3, 2131969048);
                        IgdsListCell igdsListCell4 = this.A06;
                        if (igdsListCell4 != null) {
                            igdsListCell4.A0H(DbU.A0m(this, 2131969047));
                            IgdsListCell igdsListCell5 = this.A06;
                            if (igdsListCell5 != null) {
                                igdsListCell5.setChecked(this.A03);
                                IgdsListCell igdsListCell6 = this.A06;
                                if (igdsListCell6 != null) {
                                    FdS.A00(igdsListCell6, this, 4);
                                    IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass7TF.A0F(inflate, R.id.navigation_bar);
                                    0qQ.A0B(igdsBottomButtonLayout, 3);
                                    EEJ eej = new EEJ((C51925G7t) this, igdsBottomButtonLayout, 2131968361, -1);
                                    this.A05 = eej;
                                    registerLifecycleListener(eej);
                                    AnonymousClass0fD.A09(1001939426, A022);
                                    return inflate;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1726428495);
        super.onDestroyView();
        EEJ eej = this.A05;
        if (eej == null) {
            0qQ.A0F("businessNavBarHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(eej);
        AnonymousClass0fD.A09(-1671237825, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1056664046);
        C47494E4z.super.onStart();
        boolean z = this.A08;
        this.A03 = z;
        IgdsListCell igdsListCell = this.A06;
        if (igdsListCell == null) {
            0qQ.A0F("promotionalEmailsCell");
            throw AnonymousClass00P.createAndThrow();
        }
        igdsListCell.setChecked(z);
        AnonymousClass0fD.A09(1529797724, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-259517626);
        this.A08 = this.A03;
        C47494E4z.super.onStop();
        AnonymousClass0fD.A09(-1310423571, A022);
    }
}
