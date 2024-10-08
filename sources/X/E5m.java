package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;

public final class E5m extends AnonymousClass4DH implements C268594df, TextWatcher {
    public static final String __redex_internal_original_name = "ThreadNameChangeFragment";
    public IgEditText A00;
    public C47167Dri A01;
    public AnonymousClass7ZA A02;
    public String A03;
    public IgButton A04;
    public IgButton A05;
    public IgTextView A06;
    public IgTextView A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final int AqL() {
        return -2;
    }

    public final int C8P() {
        return 0;
    }

    public final float CMx() {
        return 0.8f;
    }

    public final boolean CPc() {
        return false;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C47167Dri dri;
        0qQ.A0B(charSequence, 0);
        IgButton igButton = this.A05;
        if (igButton == null) {
            0qQ.A0F("saveButton");
            throw AnonymousClass00P.createAndThrow();
        }
        int i4 = 0;
        if (charSequence.length() <= 0 && ((dri = this.A01) == null || dri.A01 != 47)) {
            i4 = 8;
        }
        igButton.setVisibility(i4);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A07 = view.findViewById(R.id.change_name_title);
        this.A00 = (IgEditText) view.findViewById(R.id.change_name_view);
        this.A05 = (IgButton) view.findViewById(R.id.change_name_save_button);
        this.A04 = (IgButton) view.findViewById(R.id.change_name_cancel_button);
        this.A06 = view.findViewById(R.id.group_name_title);
        C47167Dri dri = this.A01;
        if (dri != null) {
            boolean z = dri.A0N;
            String str = "hintText";
            String str2 = DialogModule.KEY_TITLE;
            if (z) {
                IgTextView igTextView = this.A07;
                if (igTextView != null) {
                    igTextView.setText(2131968694);
                    IgTextView igTextView2 = this.A06;
                    if (igTextView2 != null) {
                        igTextView2.setText(2131958744);
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass0eM r4 = this.A08;
            if (182.A05(0Tu.A05, DbT.A0X(r4))) {
                IgTextView igTextView3 = this.A07;
                if (igTextView3 != null) {
                    igTextView3.setText(2131968692);
                    IgTextView igTextView4 = this.A06;
                    if (igTextView4 != null) {
                        igTextView4.setText(2131958754);
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            Context requireContext = requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(r4);
            boolean z2 = dri.A0P;
            boolean z3 = true;
            String A082 = AnonymousClass48N.A08(requireContext, A0l, dri.A0B, dri.A0E, !z2);
            0qQ.A07(A082);
            str2 = "editText";
            IgEditText igEditText = this.A00;
            if (z2) {
                if (igEditText != null) {
                    igEditText.setText(A082);
                    IgEditText igEditText2 = this.A00;
                    if (igEditText2 != null) {
                        igEditText2.setSelection(igEditText2.length());
                        IgEditText igEditText3 = this.A00;
                        if (igEditText3 != null) {
                            igEditText3.requestFocus();
                            IgEditText igEditText4 = this.A00;
                            if (igEditText4 != null) {
                                igEditText4.addTextChangedListener(this);
                            }
                        }
                    }
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            if (igEditText != null) {
                igEditText.setHint(A082);
                IgEditText igEditText5 = this.A00;
                if (igEditText5 != null) {
                    igEditText5.requestFocus();
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
            if (dri.A01 != 29) {
                z3 = false;
            }
            IgButton igButton = this.A05;
            if (igButton == null) {
                str = "saveButton";
            } else {
                FP8.A01(igButton, 32, this);
                IgButton igButton2 = this.A04;
                if (igButton2 == null) {
                    str = "cancelButton";
                } else {
                    AnonymousClass0fU.A00(new C50070FNl(0, dri, this, z3), igButton2);
                    IgEditText igEditText6 = this.A00;
                    if (igEditText6 != null) {
                        0nA.A0Q(igEditText6);
                        return;
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0s1 r0 = new 0s1(getParentFragmentManager());
        r0.A03(this);
        r0.A00();
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.8f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-606028125);
        E5m.super.onCreate(bundle);
        requireArguments();
        AnonymousClass0fD.A09(-1127692638, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1396838123);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_name_change_view, viewGroup, false);
        AnonymousClass0fD.A09(1960687875, A022);
        return inflate;
    }
}
