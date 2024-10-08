package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.business.BusinessInfo;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.E4x  reason: case insensitive filesystem */
public final class C47493E4x extends AnonymousClass4DH implements AnonymousClass4DR, C51926G7u, AnonymousClass4DS, C51925G7t {
    public static final String __redex_internal_original_name = "RenewProfessionalAccountFragment";
    public BusinessFlowAnalyticsLogger A00;
    public G8D A01;
    public SpinnerImageView A02;
    public String A03;
    public View A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public EEJ A0B;
    public IgdsBottomButtonLayout A0C;
    public final Handler A0D = AnonymousClass7TF.A0D();
    public final AnonymousClass0eM A0E = C227642jf.A02(this);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final void DeS() {
    }

    public final String getModuleName() {
        return "renew_fragment";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C47493E4x.super.onAttach(context);
        G8D A012 = FG1.A01(this);
        if (A012 != null) {
            this.A01 = A012;
            return;
        }
        throw AnonymousClass7TE.A0z("controller must not be null");
    }

    public static final void A00(C47493E4x e4x) {
        G8D g8d = e4x.A01;
        if (g8d != null) {
            g8d.EWu(C319586qr.INTEREST_ACCOUNT_CONVERSION);
            G8D g8d2 = e4x.A01;
            if (g8d2 != null) {
                ((BusinessConversionActivity) g8d2).A0p((Bundle) null, false);
                return;
            }
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        businessFlowAnalyticsLogger.Ckp(new C22030Xtl("renew", this.A03, str, (String) null, (String) null, A02(), (Map) null, (Map) null));
    }

    public final void DZI() {
        A01("continue");
        G8D g8d = this.A01;
        if (g8d == null) {
            0qQ.A0F("controller");
            throw AnonymousClass00P.createAndThrow();
        }
        ((BusinessConversionActivity) g8d).A0o(requireContext(), this, this, 16V.A05, "renew", false);
    }

    public final void DeL(String str, String str2, String str3) {
        String str4;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str4 = "logger";
        } else {
            businessFlowAnalyticsLogger.Ckh(new C22030Xtl("renew", this.A03, "switch_to_professional", str2, str3, (Map) null, (Map) null, (Map) null));
            EEJ eej = this.A0B;
            if (eej == null) {
                str4 = "navBarHelper";
            } else {
                eej.A00();
                C59689JTv.A09(requireContext(), str);
                return;
            }
        }
        0qQ.A0F(str4);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dei() {
        EEJ eej = this.A0B;
        if (eej == null) {
            0qQ.A0F("navBarHelper");
            throw AnonymousClass00P.createAndThrow();
        } else {
            eej.A01();
        }
    }

    public final void Det(16V r11) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            DbS.A12();
            throw AnonymousClass00P.createAndThrow();
        }
        businessFlowAnalyticsLogger.Ckg(new C22030Xtl("renew", this.A03, "switch_to_professional", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        C48756Ejf.A00(C47697EDg.A00(this, 23), DbT.A0X(this.A0E), this, false);
    }

    public final void Di0() {
        A01("skip");
        G8D g8d = this.A01;
        if (g8d != null) {
            g8d.EWu(C319586qr.INTEREST_ACCOUNT_CONVERSION);
            G8D g8d2 = this.A01;
            if (g8d2 != null) {
                ((BusinessConversionActivity) g8d2).A0p((Bundle) null, true);
                return;
            }
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public final boolean onBackPressed() {
        String str;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            businessFlowAnalyticsLogger.ChP(new C22030Xtl("renew", this.A03, (String) null, (String) null, (String) null, A02(), (Map) null, (Map) null));
            G8D g8d = this.A01;
            if (g8d == null) {
                str = "controller";
            } else {
                ((BusinessConversionActivity) g8d).EJN((Bundle) null);
                return true;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final HashMap A02() {
        String str;
        String str2;
        16V r0;
        16V r02;
        HashMap A1E = AnonymousClass7TE.A1E();
        G8D g8d = this.A01;
        String str3 = null;
        if (g8d != null) {
            BusinessInfo businessInfo = Dba.A0C(g8d).A02;
            if (businessInfo != null) {
                str = businessInfo.A09;
            } else {
                str = null;
            }
            A1E.put("category_id", str);
            G8D g8d2 = this.A01;
            if (g8d2 != null) {
                BusinessInfo businessInfo2 = Dba.A0C(g8d2).A02;
                if (businessInfo2 == null || (r02 = businessInfo2.A02) == null) {
                    str2 = null;
                } else {
                    str2 = r02.A01;
                }
                A1E.put("category_account_type", str2);
                G8D g8d3 = this.A01;
                if (g8d3 != null) {
                    BusinessInfo businessInfo3 = Dba.A0C(g8d3).A02;
                    if (!(businessInfo3 == null || (r0 = businessInfo3.A03) == null)) {
                        str3 = r0.A01;
                    }
                    A1E.put("previous_account_type", str3);
                    return A1E;
                }
            }
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1J(r3);
        FPB.A02(DbX.A0M(), r3, this, 65);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1214956724);
        C47493E4x.super.onCreate(bundle);
        this.A03 = DbX.A0o(this);
        0lg A0X = DbT.A0X(this.A0E);
        G8D g8d = this.A01;
        if (g8d != null) {
            C319586qr B6a = g8d.B6a();
            G8D g8d2 = this.A01;
            if (g8d2 != null) {
                BusinessFlowAnalyticsLogger A002 = C319596qs.A00(B6a, this, A0X, (String) AnonymousClass7TE.A14(((BusinessConversionActivity) g8d2).A0C));
                if (A002 != null) {
                    this.A00 = A002;
                    AnonymousClass0fD.A09(-1554861809, A022);
                    return;
                }
                IllegalStateException A0z = AnonymousClass7TE.A0z("received null flowType or unexpected value for flowType");
                AnonymousClass0fD.A09(-1802025524, A022);
                throw A0z;
            }
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, X.G7t, androidx.fragment.app.Fragment, X.E4x, X.4DH] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1818122296);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.renew_professional_account_fragment, viewGroup, false);
        this.A02 = (SpinnerImageView) inflate.requireViewById(R.id.loading_indicator);
        this.A04 = inflate.requireViewById(R.id.renew_layout_container);
        this.A0A = Dba.A06(inflate);
        this.A09 = Dba.A05(inflate);
        this.A06 = DbU.A0C(inflate, R.id.category_row);
        this.A05 = DbU.A0C(inflate, R.id.account_type_row);
        this.A08 = DbU.A0G(inflate, R.id.category_subtitle);
        this.A07 = DbU.A0G(inflate, R.id.account_type_subtitle);
        IgdsBottomButtonLayout A0c = DbT.A0c(inflate, R.id.navigation_bar);
        this.A0C = A0c;
        String str = "navBar";
        if (A0c != null) {
            this.A0B = new EEJ((C51925G7t) this, A0c, 2131972150, 2131972151);
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A0C;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setVisibility(8);
                EEJ eej = this.A0B;
                if (eej == null) {
                    str = "navBarHelper";
                } else {
                    registerLifecycleListener(eej);
                    SpinnerImageView spinnerImageView = this.A02;
                    if (spinnerImageView == null) {
                        str = "loadingSpinner";
                    } else {
                        spinnerImageView.setVisibility(0);
                        C49893FBw.A02(requireContext(), AnonymousClass07i.A00(this), new C50209FTp(this), DbT.A0X(this.A0E));
                        AnonymousClass0fD.A09(1210128910, A022);
                        return inflate;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1227860402);
        EEJ eej = this.A0B;
        if (eej == null) {
            0qQ.A0F("navBarHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(eej);
        super.onDestroyView();
        AnonymousClass0fD.A09(-1352171080, A022);
    }
}
