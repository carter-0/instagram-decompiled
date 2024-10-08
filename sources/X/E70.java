package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.igds.components.form.IgFormField;

public final class E70 extends C273374mT implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditGenderFragment";
    public View A00;
    public IgFormField A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public ActionButton A07;
    public final TextWatcher A08 = new FKk(this, 17);

    public final String getModuleName() {
        return "profile_edit_gender";
    }

    public static void A00(E70 e70) {
        boolean z;
        IgFormField igFormField;
        ActionButton actionButton = e70.A07;
        if (actionButton != null) {
            if (e70.A03 != AnonymousClass05K.A0C || ((igFormField = e70.A01) != null && !TextUtils.isEmpty(igFormField.getText()))) {
                z = true;
            } else {
                z = false;
            }
            actionButton.setEnabled(z);
        }
    }

    public static void A01(E70 e70, String str) {
        AnonymousClass1Nd.A00(e70.getSession()).A00(new C50273FWe(e70.getSession().A06, F75.A00(e70.A03), str));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r5) {
        DbX.A1A(FPC.A00(this, 27), DbX.A0M(), r5);
        ? obj = new Object();
        C59922Jbl.A02(DbV.A05(this), obj, 2131963020);
        this.A07 = C59904JbT.A00(new FPG(27, (Object) this, (Object) r5), r5, obj);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1246892410);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_edit_gender);
        AnonymousClass0fD.A09(-175637710, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1782970621);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(772336156, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(571841834);
        E70.super.onPause();
        IgFormField igFormField = this.A01;
        if (igFormField != null) {
            DbU.A1E(this.A08, igFormField);
        }
        AnonymousClass0fD.A09(700947809, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(834737542);
        super.onResume();
        IgFormField igFormField = this.A01;
        if (igFormField != null) {
            igFormField.A0G(this.A08);
        }
        A00(this);
        AnonymousClass0fD.A09(1133103163, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        this.A04 = requireArguments().getString("custom_gender", "");
        int i = requireArguments().getInt("gender", 3);
        Integer[] A002 = AnonymousClass05K.A00(4);
        int length = A002.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                num = AnonymousClass05K.A0N;
                break;
            }
            num = A002[i2];
            if (F75.A00(num) == i) {
                break;
            }
            i2++;
        }
        this.A03 = num;
        this.A02 = num;
        this.A00 = view;
        boolean z = requireArguments().getBoolean("should_show_custom_gender", false);
        this.A06 = z;
        if (z) {
            IgFormField A0d = DbT.A0d(view, R.id.edit_gender_custom_field);
            this.A01 = A0d;
            A0d.setInputType(8192);
            int i3 = 0;
            boolean A1W = AnonymousClass7TF.A1W(this.A03, AnonymousClass05K.A0C);
            IgFormField igFormField = this.A01;
            if (!A1W) {
                i3 = 8;
            }
            igFormField.setVisibility(i3);
            this.A01.setText(this.A04);
            this.A01.setRuleChecker(new C50497Fcj(this, 4));
            if (A1W) {
                this.A01.getMEditText().requestFocus();
            }
        }
        ((CompoundButton) view.requireViewById(F75.A01(this.A03))).setChecked(true);
        if (this.A06) {
            DbT.A1F(view, R.id.edit_gender_custom, 0);
        }
        ((RadioGroup) view.requireViewById(R.id.edit_gender_radio_group)).setOnCheckedChangeListener(new FQU(this, 2));
    }
}
