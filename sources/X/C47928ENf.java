package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.ENf  reason: case insensitive filesystem */
public final class C47928ENf extends EDF {
    public final /* synthetic */ C47476E4a A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47928ENf(C47476E4a e4a) {
        super(e4a.requireContext());
        this.A00 = e4a;
    }

    public final void A00(DwE dwE) {
        int A03 = AnonymousClass0fD.A03(90913056);
        super.A00(dwE);
        if (dwE.A05) {
            Bundle A0a = AnonymousClass7TE.A0a();
            C47476E4a e4a = this.A00;
            A0a.putString("lookup_user_input", e4a.A08);
            A0a.putString("lookup_email", dwE.A01);
            C309516Yo A0J = DbY.A0J(e4a.requireActivity(), e4a.A05);
            DbU.A1C(A0a);
            DbX.A18(A0a, new AnonymousClass4DH(), A0J);
        } else {
            C47476E4a e4a2 = this.A00;
            if (e4a2.mView != null) {
                TextView textView = e4a2.A04;
                if (textView != null) {
                    textView.setText(e4a2.A00);
                }
                DbX.A1B(e4a2.mView, R.id.fragment_user_password_recovery_dont_have_access);
                String string = e4a2.getString(2131964368);
                Uri A07 = DbV.A07(e4a2.requireActivity(), "http://help.instagram.com/374546259294234/?ref=learn_more");
                String str = e4a2.A09;
                str.getClass();
                SpannableStringBuilder A002 = AnonymousClass7AV.A00(A07, string, str);
                TextView A0G = DbU.A0G(e4a2.mView, R.id.fragment_user_password_recovery_textview_request_sent);
                A0G.setMovementMethod(new LinkMovementMethod());
                A0G.setVisibility(0);
                A0G.setText(A002);
                C47476E4a.A02(e4a2, "email");
            }
        }
        AnonymousClass0fD.A0A(-411039545, A03);
    }

    public final void onFail(C268654dm r4) {
        View view;
        int A03 = AnonymousClass0fD.A03(1847689378);
        super.onFail(r4);
        C47476E4a e4a = this.A00;
        if (!(e4a.mView == null || (view = e4a.A01) == null)) {
            view.setEnabled(true);
        }
        AnonymousClass0fD.A0A(719702441, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(21258344);
        C47476E4a e4a = this.A00;
        if (e4a.mView != null) {
            AnonymousClass7TH.A0R(e4a.A03);
        }
        AnonymousClass0fD.A0A(2113192307, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1195258352);
        C47476E4a e4a = this.A00;
        e4a.A00 = 2131961582;
        e4a.A03 = e4a.requireView().findViewById(R.id.email_spinner);
        e4a.A09 = 0mp.A06(DbV.A05(e4a).getString(2131961581), new Object[]{e4a.getString(2131964368)});
        e4a.A04 = AnonymousClass7TE.A0d(e4a.requireView(), R.id.fragment_user_password_recovery_button_email_reset);
        View findViewById = e4a.requireView().findViewById(R.id.fragment_user_password_recovery_button_email_reset_container);
        e4a.A01 = findViewById;
        if (findViewById != null) {
            findViewById.setEnabled(false);
        }
        View view = e4a.A03;
        if (view != null) {
            view.setVisibility(0);
        }
        super.onStart();
        AnonymousClass0fD.A0A(-261932279, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1120319958);
        A00((DwE) obj);
        AnonymousClass0fD.A0A(1730331283, A03);
    }
}
