package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.E4k  reason: case insensitive filesystem */
public final class C47484E4k extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, C51925G7t {
    public static final String __redex_internal_original_name = "WhatsAppLinkingFragment";
    public G8D A00;
    public TextView A01;
    public TextView A02;
    public EEJ A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final String getModuleName() {
        return "whats_app_linking_fragment";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C47484E4k.super.onAttach(context);
        this.A00 = FG1.A01(this);
    }

    public final void DZI() {
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r5 = this.A05;
        if (DbX.A0l(r0, r5).A1d()) {
            G8D g8d = this.A00;
            if (g8d != null) {
                Dba.A1P(g8d);
                return;
            }
            return;
        }
        r5.getValue();
        C46649DiU A042 = C46649DiU.A04(AnonymousClass000.A00(46), Dbb.A0d(__redex_internal_original_name, "whatsapp_linking_in_business_conversion_flow"));
        IgBloksScreenConfig A0J = Dbb.A0J(r5);
        DbZ.A19(this, A0J, 2131976862);
        AnonymousClass3M3 A022 = C49891FBs.A02(A0J, A042);
        C309516Yo A0P = DbZ.A0P(this, r5);
        A0P.A0A = __redex_internal_original_name;
        A0P.A0F = true;
        A0P.A0D(A022);
        A0P.A04();
        this.A04 = true;
    }

    public final void Di0() {
        G8D g8d = this.A00;
        if (g8d != null) {
            ((BusinessConversionActivity) g8d).A0p((Bundle) null, true);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        G8D g8d = this.A00;
        if (g8d == null) {
            return true;
        }
        Dba.A1R(g8d);
        return true;
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1J(r3);
        DbX.A1A(FP5.A00(this, 7), DbV.A0K(), r3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(920232911);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.whats_app_linking_fragment, viewGroup, false);
        this.A02 = AnonymousClass7TE.A0d(inflate, R.id.title);
        this.A01 = AnonymousClass7TE.A0d(inflate, R.id.subtitle);
        EEJ eej = new EEJ((BusinessNavBar) inflate.findViewById(R.id.navigation_bar), (C51925G7t) this, 2131968361, 2131968514);
        this.A03 = eej;
        registerLifecycleListener(eej);
        AnonymousClass0fD.A09(502942580, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(793008175);
        EEJ eej = this.A03;
        if (eej == null) {
            0qQ.A0F("navBarHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(eej);
        super.onDestroyView();
        AnonymousClass0fD.A09(-36214982, A022);
    }

    public final void onResume() {
        String str;
        TextView textView;
        int i;
        String str2;
        int A022 = AnonymousClass0fD.A02(-1898471514);
        super.onResume();
        if (!this.A04 || !DbX.A0l(AnonymousClass0t1.A01, this.A05).A1d()) {
            boolean A1d = DbX.A0l(AnonymousClass0t1.A01, this.A05).A1d();
            EEJ eej = this.A03;
            if (A1d) {
                if (eej != null) {
                    eej.A02(false);
                    EEJ eej2 = this.A03;
                    if (eej2 != null) {
                        BusinessNavBar businessNavBar = eej2.A00;
                        if (businessNavBar != null) {
                            businessNavBar.setPrimaryButtonText(2131968361);
                        } else {
                            IgdsBottomButtonLayout igdsBottomButtonLayout = eej2.A02;
                            if (igdsBottomButtonLayout != null) {
                                Resources resources = igdsBottomButtonLayout.getResources();
                                if (resources != null) {
                                    str2 = resources.getString(2131968361);
                                } else {
                                    str2 = null;
                                }
                                igdsBottomButtonLayout.setPrimaryActionText(str2);
                            }
                        }
                        TextView textView2 = this.A02;
                        if (textView2 != null) {
                            textView2.setText(2131976854);
                        }
                        textView = this.A01;
                        if (textView != null) {
                            i = 2131976853;
                        }
                    }
                }
                0qQ.A0F("navBarHelper");
                throw AnonymousClass00P.createAndThrow();
            }
            if (eej != null) {
                eej.A02(true);
                EEJ eej3 = this.A03;
                if (eej3 != null) {
                    BusinessNavBar businessNavBar2 = eej3.A00;
                    if (businessNavBar2 != null) {
                        businessNavBar2.setPrimaryButtonText(2131956545);
                    } else {
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = eej3.A02;
                        if (igdsBottomButtonLayout2 != null) {
                            Resources resources2 = igdsBottomButtonLayout2.getResources();
                            if (resources2 != null) {
                                str = resources2.getString(2131956545);
                            } else {
                                str = null;
                            }
                            igdsBottomButtonLayout2.setPrimaryActionText(str);
                        }
                    }
                    TextView textView3 = this.A02;
                    if (textView3 != null) {
                        textView3.setText(2131956547);
                    }
                    textView = this.A01;
                    if (textView != null) {
                        i = 2131956546;
                    }
                }
            }
            0qQ.A0F("navBarHelper");
            throw AnonymousClass00P.createAndThrow();
            textView.setText(i);
        } else {
            AnonymousClass7TF.A0D().post(new C51185Fpv(this));
            this.A04 = false;
        }
        AnonymousClass0fD.A09(-277709916, A022);
    }
}
