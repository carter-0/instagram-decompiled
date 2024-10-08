package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.ELb  reason: case insensitive filesystem */
public final class C47881ELb extends E55 {
    public static final String __redex_internal_original_name = "ConsentIntroFragment";
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TextView A03;
    public EEA A04;
    public ProgressButton A05;
    public final View.OnClickListener A06 = FP1.A00(this, 16);

    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A022 = AnonymousClass0fD.A02(-1116650716);
        super.onCreate(bundle);
        String string = requireArguments().getString("GDPR.Fragment.EntryPoint");
        if (string == null) {
            string = "unknown";
        }
        String string2 = requireArguments().getString("GDPR.Fragment.UserState");
        Integer[] A002 = AnonymousClass05K.A00(3);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass05K.A0C;
                break;
            }
            num = A002[i];
            if (0qQ.A0K(C49766F5z.A01(num), string2)) {
                break;
            }
            i++;
        }
        synchronized (C49917FEr.A00()) {
            C49917FEr fEr = C49917FEr.A0B;
            fEr.A06 = string;
            fEr.A04 = num;
        }
        C49943FFw.A00().A03(string, num);
        AnonymousClass0fD.A09(1687580611, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RegFlowExtras regFlowExtras;
        int A022 = AnonymousClass0fD.A02(229151491);
        View inflate = layoutInflater.inflate(R.layout.gdpr_intro_layout, viewGroup, false);
        this.A00 = inflate.requireViewById(R.id.container);
        this.A01 = inflate.requireViewById(R.id.loading_indicator);
        this.A03 = DbU.A0G(this.A00, R.id.content_title);
        FFM.A03(this.A03, requireContext());
        this.A02 = (LinearLayout) this.A00.requireViewById(R.id.paragraphs_container);
        AnonymousClass0fU.A00(this.A06, this.A00.requireViewById(R.id.data_policy_link));
        ProgressButton A0O = Dba.A0O(this.A00);
        this.A05 = A0O;
        EEA eea = new EEA(this, A0O, (String) null);
        this.A04 = eea;
        registerLifecycleListener(eea);
        this.A01.setVisibility(0);
        ELY ely = new ELY(this, this);
        Context context = getContext();
        Integer num = C49917FEr.A00().A04;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2 && context == null) {
            throw AnonymousClass7TE.A0z("Context cannot be null if UserState is NEW_USER");
        }
        Context context2 = getContext();
        Integer num3 = C49917FEr.A00().A04;
        String str = C49917FEr.A00().A07;
        AnonymousClass0wW r8 = this.A00;
        1NY r7 = new 1NY(r8);
        if (C49917FEr.A00().A04 == num2 && (regFlowExtras = this.A01) != null) {
            String str2 = regFlowExtras.A08;
            String str3 = regFlowExtras.A0Q;
            r7.A0G("email", str2);
            r7.A0G("phone", str3);
        }
        1OC A002 = C49764F5x.A00(context2, r7, r8, (Integer) null, num3, str);
        A002.A00 = ely;
        1ES.A03(A002);
        AnonymousClass0fD.A09(-891409667, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(498162851);
        super.onDestroy();
        EEA eea = this.A04;
        if (eea != null) {
            unregisterLifecycleListener(eea);
        }
        AnonymousClass0fD.A09(1238380305, A022);
    }
}
