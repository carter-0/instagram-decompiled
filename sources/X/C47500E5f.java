package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.android.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.E5f  reason: case insensitive filesystem */
public abstract class C47500E5f extends AnonymousClass4DH implements G8C {
    public static final String __redex_internal_original_name = "BaseEmailVerifyFragment";
    public long A00;
    public TextView A01;
    public AnonymousClass0wW A02;
    public EEK A03;
    public ProgressButton A04;
    public SearchEditText A05;
    public String A06;

    public final void DaH(boolean z) {
    }

    public final String getModuleName() {
        return "email_verify";
    }

    public final String A00() {
        SearchEditText searchEditText = this.A05;
        if (searchEditText == null) {
            return null;
        }
        RectF rectF = 0nA.A01;
        return DbV.A0y(searchEditText);
    }

    public final void A01() {
        1OC A062;
        1P0 emj;
        if (this instanceof EMR) {
            if (!requireActivity().isFinishing() && A00() != null && getContext() != null) {
                C47691EDa.A00(this, C318486p2.A01(getContext(), this.A02, this.A06, A00()), 28);
            }
        } else if (this instanceof EMQ) {
            C49881FBf.A00.A02(this.A02, "sign_up_email_code_confirmation");
            if (!requireActivity().isFinishing() && A00() != null) {
                Context context = getContext();
                AnonymousClass0wW r0 = this.A02;
                String str = this.A06;
                String A002 = A00();
                1NY A0N = DbU.A0N(r0);
                A0N.A9m(DcV.A00(), DbT.A0t(context, A0N, "accounts/check_confirmation_code/"));
                A0N.A9m("email", str);
                DbY.A1J(A0N, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A002);
                C47699EDi.A00(this, DbY.A0N(A0N, Dv9.class, C49767F6a.class), 15);
            }
        } else {
            EMP emp = (EMP) this;
            if (emp.A01) {
                02m.A0p.markerStart(725095506);
                02m.A0p.markerAnnotate(725095506, "flow", "prod");
                02m.A0p.markerAnnotate(725095506, DatePickerDialogModule.ARG_MODE, "email");
                FragmentActivity activity = emp.getActivity();
                if (!(activity == null || activity.isFinishing() || emp.A00() == null || emp.getContext() == null)) {
                    A062 = FHA.A05(emp.getContext(), (AnonymousClass0aP) emp.A02, emp.A00(), emp.A06, "email", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                    emj = new C47930ENh(emp.getActivity(), (AnonymousClass0aP) emp.A02, emp);
                }
                C49881FBf.A00.A02(emp.A02, "recovery_email_code_confirmation");
            }
            FragmentActivity activity2 = emp.getActivity();
            if (!(activity2 == null || activity2.isFinishing() || emp.A00() == null || emp.getContext() == null)) {
                A062 = FHA.A06(emp.getContext(), (AnonymousClass0aP) emp.A02, emp.A00, emp.A00(), (String) null, (String) null, (String) null, (String) null);
                FragmentActivity activity3 = emp.getActivity();
                emj = new EMJ((Activity) activity3, (AnonymousClass0iw) emp, (AnonymousClass0aP) emp.A02, (G8H) new C50515Fdb(activity3), emp, C46634DiE.A1I, AnonymousClass05K.A01, emp.A06);
            }
            C49881FBf.A00.A02(emp.A02, "recovery_email_code_confirmation");
            A062.A00 = emj;
            emp.schedule(A062);
            C49881FBf.A00.A02(emp.A02, "recovery_email_code_confirmation");
        }
    }

    public final void APF() {
        this.A05.setEnabled(false);
        this.A05.setClearButtonEnabled(false);
    }

    public final void ARL() {
        this.A05.setEnabled(true);
        this.A05.setClearButtonEnabled(true);
    }

    public final boolean Ca3() {
        SearchEditText searchEditText = this.A05;
        RectF rectF = 0nA.A01;
        0qQ.A0B(searchEditText, 0);
        if (searchEditText.getText().length() >= 6) {
            SearchEditText searchEditText2 = this.A05;
            0qQ.A0B(searchEditText2, 0);
            if (searchEditText2.getText().length() > 8) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void DUM() {
        ProgressButton progressButton = this.A04;
        if (progressButton != null && progressButton.isEnabled()) {
            A01();
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final void A02(int i) {
        C358248ab A0I = Dba.A0I(this);
        A0I.A09(i);
        Dba.A1L(A0I);
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1939319964);
        C47500E5f.super.onCreate(bundle);
        this.A00 = SystemClock.elapsedRealtime();
        AnonymousClass0fD.A09(830269372, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String obj;
        int A022 = AnonymousClass0fD.A02(-2117284847);
        C47500E5f.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_verify_new, viewGroup, false);
        SearchEditText searchEditText = (SearchEditText) inflate.requireViewById(R.id.confirmation_code);
        this.A05 = searchEditText;
        searchEditText.setAllowTextSelection(true);
        FQe.A00(this.A05, this, 2);
        C49948FGd.A04(this.A05);
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(R.id.next_button);
        this.A04 = progressButton;
        EEK eek = new EEK(this.A05, this.A02, this, progressButton);
        this.A03 = eek;
        registerLifecycleListener(eek);
        this.A01 = DbU.A0G(inflate, R.id.code_verification_instruction);
        String string = getString(2131976377);
        if (this instanceof EMR) {
            obj = DbU.A07(DbV.A05(this), this.A06, 2131972256).toString();
        } else if (this instanceof EMQ) {
            obj = DbU.A07(DbV.A05(this), this.A06, 2131972256).toString();
        } else {
            EMP emp = (EMP) this;
            Resources A052 = DbV.A05(emp);
            int i = 2131972258;
            if (emp.A01) {
                i = 2131973913;
            }
            obj = DbU.A07(A052, emp.A06, i).toString();
        }
        SpannableStringBuilder A0C = DbS.A0C(obj);
        AnonymousClass7AV.A05(A0C, new ESx(DbV.A0n(getContext(), 2Yu.A0D(getContext())), (Object) this, 20), string);
        DbT.A1H(this.A01);
        this.A01.setHighlightColor(0);
        this.A01.setText(A0C);
        AnonymousClass0fD.A09(-1500013617, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-164657260);
        super.onDestroyView();
        unregisterLifecycleListener(this.A03);
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(1261105545, A022);
    }
}
