package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Collection;

/* renamed from: X.Kcx  reason: case insensitive filesystem */
public final class C62263Kcx extends K8J implements C252213ok {
    public static final String __redex_internal_original_name = "IgLiveQuestionViewerFragment";
    public View A00;
    public IgEditText A01;
    public IgdsButton A02;
    public IgdsButton A03;
    public String A04;
    public final LZR A05 = new LZR(this, 2);
    public final KIM A06 = new KIM(this, 1);
    public final AnonymousClass3E6 A07 = AnonymousClass3E4.A01(this, false, false);

    public final void A0F(View view, View view2, IgEditText igEditText, IgdsButton igdsButton) {
        C313726gu r0;
        0qQ.A0B(view, 0);
        if (igdsButton != null) {
            igdsButton.setVisibility(0);
        }
        view.setVisibility(8);
        if (view2 != null) {
            view2.setVisibility(0);
        }
        if (igEditText != null) {
            igEditText.requestFocus();
            0nA.A0Q(igEditText);
            C313886hJ r02 = this.A03;
            if (r02 != null && (r0 = r02.A06) != null) {
                r0.ChB();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0G(TextView textView) {
        String str;
        0qQ.A0B(textView, 0);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            updateUi(JXP.LOADING, 0sn.A00);
            String A012 = A01(textView);
            C313886hJ r2 = this.A03;
            if (r2 != null) {
                String str2 = this.A04;
                if (str2 != null) {
                    AnonymousClass7TE.A1Z(new MFe((Object) r2, str2, A012, (AnonymousClass4D7) null, 20), JTP.A0J(r2, A012, 1));
                } else {
                    str = "broadcastId";
                }
            }
            0nA.A0N(textView);
            DbS.A1C(textView);
            textView.clearFocus();
            return;
        }
        str = "emptyStateContainer";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "live_question_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        AnonymousClass2Fj r3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        JTP.A18(this, this.A07);
        C313886hJ r0 = this.A03;
        if (r0 != null && (r3 = r0.A01) != null) {
            DbV.A1F(getViewLifecycleOwner(), r3, new MPC(this, 21), 70);
        }
    }

    public final void DMr(int i, boolean z) {
        Editable editable;
        View view = this.A00;
        IgEditText igEditText = this.A01;
        IgdsButton igdsButton = this.A03;
        if (i == 0) {
            if (igEditText != null) {
                editable = igEditText.getText();
            } else {
                editable = null;
            }
            if (String.valueOf(editable).length() == 0) {
                AnonymousClass7TH.A0R(view);
                if (igdsButton != null) {
                    igdsButton.setVisibility(0);
                }
            }
        }
    }

    public static final String A01(TextView textView) {
        String obj = textView.getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(obj, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        return Dba.A0c(obj, length, i);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.KIM, android.text.TextWatcher] */
    public final void A0D() {
        String str;
        super.A0D();
        View view = this.mView;
        if (view != null) {
            View requireViewById = view.requireViewById(R.id.question_empty_input);
            0qQ.A0A(requireViewById);
            IgdsButton A0n = JTR.A0n(view, R.id.question_sheet_empty_action_button);
            IgEditText igEditText = (IgEditText) requireViewById.requireViewById(R.id.question_input_edit_text);
            igEditText.setOnEditorActionListener(this.A05);
            igEditText.addTextChangedListener(this.A06);
            this.A01 = igEditText;
            this.A03 = A0n;
            A0n.setVisibility(0);
            AnonymousClass0fU.A00(LYA.A00(igEditText, A0n, this, 51), A0n);
            IgdsButton A0b = DbU.A0b(requireViewById, R.id.question_input_submit_button);
            LY2.A00(A0b, 10, igEditText, this);
            this.A02 = A0b;
            DbT.A1F(requireViewById, R.id.question_input_bottom_divider, 0);
            this.A00 = requireViewById;
        }
        TextView textView = this.A02;
        if (textView != null) {
            Context requireContext = requireContext();
            String str2 = this.A04;
            str = "broadcaster";
            if (str2 != null) {
                DbX.A13(requireContext, textView, str2, 2131965311);
                TextView textView2 = this.A01;
                if (textView2 != null) {
                    Context requireContext2 = requireContext();
                    String str3 = this.A04;
                    if (str3 != null) {
                        DbX.A13(requireContext2, textView2, str3, 2131965309);
                        this.A07.A9Y(this);
                        return;
                    }
                } else {
                    str = "emptyDescription";
                }
            }
        } else {
            str = "emptyTitle";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Collection getDefinitions() {
        return 00k.A0T(new C15786UiV(this.A05, this.A07, this), super.getDefinitions());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1638213457);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        setModuleNameV2("live_question_sheet");
        this.A04 = requireArguments.getString("IgLiveQuestionListFragment.ARGUMENTS_KEY_EXTRA_BROADCASTER_USERNAME", "broadcaster");
        AnonymousClass0fD.A09(2144344933, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1499051106);
        super.onDestroy();
        this.A07.onStop();
        AnonymousClass0fD.A09(2103437559, A022);
    }
}
