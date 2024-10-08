package X;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.UZu  reason: case insensitive filesystem */
public final class C15289UZu extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ProfileInputFragment";
    public EditText A00;
    public int A01;
    public AnonymousClass0wW A02;
    public final C17950Vih A03 = new Object();

    public final String getModuleName() {
        return "profile_input_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        Bundle bundle = this.mArguments;
        if (bundle == null) {
            return false;
        }
        C17950Vih vih = this.A03;
        if (bundle.getString("DynamicFlowPlugin.extraFlowId") == null) {
            return false;
        }
        vih.A00(bundle, AnonymousClass7TF.A0f(this.A00));
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1727545602);
        C15289UZu.super.onCreate(bundle);
        this.A02 = DbS.A0T(C227642jf.A01(this));
        Window window = getRootActivity().getWindow();
        window.getClass();
        this.A01 = window.getAttributes().softInputMode | 240;
        AnonymousClass0fD.A09(1169973525, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-489795676);
        Bundle requireArguments = requireArguments();
        View inflate = layoutInflater.inflate(R.layout.layout_configurable_input_wizard_step, viewGroup, false);
        DbU.A0G(inflate, R.id.step_title).setText(requireArguments.getInt("EXTRA_TITLE_STRING_RES_ID"));
        DbU.A0G(inflate, R.id.step_subtitle).setText(requireArguments.getInt("EXTRA_SUBTITLE_STRING_RES_ID"));
        EditText A0E = DbU.A0E(inflate, R.id.input_field);
        this.A00 = A0E;
        A0E.setText(requireArguments.getString("EXTRA_CONTENT"));
        this.A00.setHint(requireArguments.getInt("EXTRA_HINT_STRING_RES_ID"));
        this.A00.getViewTreeObserver().addOnGlobalLayoutListener(new WC9(this, 8));
        int i = requireArguments.getInt("EXTRA_INPUT_IME_ACTION", -1);
        if (i != -1) {
            this.A00.setImeOptions(i);
        }
        int i2 = requireArguments.getInt("EXTRA_INPUT_MAX_LINES", 1);
        if (i2 > 1) {
            this.A00.setSingleLine(false);
            this.A00.setImeOptions(SN3.MAX_SIGNED_POWER_OF_TWO);
            this.A00.setInputType(655361);
            this.A00.setMaxLines(i2);
            this.A00.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        int i3 = requireArguments.getInt("EXTRA_INPUT_MAX_CHARACTERS", -1);
        if (i3 > 0) {
            this.A00.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i3)});
        }
        this.A00.setOnEditorActionListener(new WDE(4, requireArguments, this));
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.progress_button);
        progressButton.setText(requireArguments.getInt("EXTRA_PROGRESS_BUTTON_LABEL_STRING_RES_ID"));
        WBD.A00(progressButton, 2, requireArguments, this);
        AnonymousClass0fD.A09(249663314, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(426063504);
        C15289UZu.super.onPause();
        Window window = getRootActivity().getWindow();
        window.getClass();
        window.setSoftInputMode(this.A01);
        InputMethodManager inputMethodManager = (InputMethodManager) getRootActivity().getSystemService("input_method");
        if (inputMethodManager != null) {
            C13989Tnp.A1A(this.A00, inputMethodManager);
        }
        AnonymousClass0fD.A09(43996054, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(474407593);
        super.onResume();
        Window window = getRootActivity().getWindow();
        window.getClass();
        window.setSoftInputMode(16);
        AnonymousClass0fD.A09(-908014243, A022);
    }
}
