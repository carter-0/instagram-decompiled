package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.E2r  reason: case insensitive filesystem */
public final class C47445E2r extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "TwoFacConfirmCodeFragment";
    public C49483EwO A00;
    public ConfirmationCodeEditText A01;
    public ProgressButton A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public final AnonymousClass0eM A06 = Dba.A0i(this, 36);
    public final AnonymousClass0eM A07 = Dba.A0i(this, 37);
    public final AnonymousClass0eM A08 = Dba.A0i(this, 38);
    public final AnonymousClass0eM A09 = Dba.A0i(this, 39);
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B = Dba.A0i(this, 40);
    public final AnonymousClass0eM A0C = Dba.A0i(this, 41);
    public final AnonymousClass0eM A0D = Dba.A0i(this, 42);
    public final AnonymousClass0eM A0E = Dba.A0i(this, 43);
    public final AnonymousClass0eM A0F = Dba.A0i(this, 44);
    public final AnonymousClass0eM A0G = Dba.A0i(this, 45);
    public final AnonymousClass0eM A0H = Dba.A0i(this, 46);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131975658);
    }

    public final String getModuleName() {
        return Dbq.A02();
    }

    public static final void A00(C47445E2r e2r) {
        String str;
        1OC r1;
        AnonymousClass0eM r0;
        1P0 r3;
        1NY A0a;
        ConfirmationCodeEditText confirmationCodeEditText = e2r.A01;
        if (confirmationCodeEditText == null) {
            str = "confirmationCodeEditText";
        } else {
            String A0f = AnonymousClass7TF.A0f(confirmationCodeEditText);
            AnonymousClass0eM r4 = e2r.A0A;
            0lg A0X = DbT.A0X(r4);
            int A022 = DbW.A02(0, A0X, A0f);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49852F9r.A01, A0X), "instagram_two_fac_setup_action");
            DbS.A1J(A0e, "next");
            A0e.AAJ("view", "");
            Dbc.A0W(A0e);
            String A052 = Dbq.A05(808, 17, 43);
            A0e.AAJ(A052, A0f);
            A0e.Cgf();
            Integer num = e2r.A03;
            if (num == null) {
                str = "twoFacConfirmCodeSource";
            } else {
                int intValue = num.intValue();
                str = "phoneNumberOrEmail";
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 3) {
                            0lg A0X2 = DbT.A0X(r4);
                            String str2 = e2r.A05;
                            if (str2 != null) {
                                r1 = C318486p2.A01(e2r.requireContext(), A0X2, str2, A0f);
                                r0 = e2r.A0D;
                            }
                        } else if (intValue == 4) {
                            0lg A0X3 = DbT.A0X(r4);
                            String A0a2 = Dbb.A0a(e2r);
                            0qQ.A0B(A0X3, 0);
                            1NY A0a3 = AnonymousClass7TG.A0a(A0X3);
                            Dba.A1H(A0a3, Dbq.A05(661, 38, 6));
                            A0a3.A9m(Dbq.A04(), A0a2);
                            r1 = DbT.A0T(A0a3, A052, A0f);
                            r0 = e2r.A0G;
                        } else if (intValue == A022) {
                            0lg A0X4 = DbT.A0X(r4);
                            Context requireContext = e2r.requireContext();
                            r3 = (1P0) e2r.A06.getValue();
                            Bundle requireArguments = e2r.requireArguments();
                            String A0W = Dbb.A0W();
                            String A0w = DbT.A0w(requireArguments, A0W, "");
                            Dba.A0j(A022, A0X4, r3);
                            A0a = AnonymousClass7TG.A0a(A0X4);
                            A0a.A0A(Dbq.A05(549, 35, 113));
                            Dbb.A0j(requireContext, A0a);
                            A0a.A9m(A052, A0f);
                            A0a.A9m(A0W, A0w);
                            A0a.A0Q(C47315Dui.class, F4I.class);
                        } else {
                            return;
                        }
                        r3 = (1P0) r0.getValue();
                    } else {
                        0lg A0X5 = DbT.A0X(r4);
                        Context requireContext2 = e2r.requireContext();
                        r3 = (1P0) e2r.A0F.getValue();
                        AnonymousClass7TF.A1C(A0X5, 0, r3);
                        A0a = AnonymousClass7TG.A0a(A0X5);
                        A0a.A0A(Dbq.A05(33, 32, 52));
                        A0a.A0Q(C47299DuS.class, F4D.class);
                        A0a.A9m(A052, A0f);
                        Dbb.A0j(requireContext2, A0a);
                        A0a.A0R = true;
                    }
                    r1 = A0a.A0M();
                } else {
                    Context requireContext3 = e2r.requireContext();
                    UserSession A0l = AnonymousClass7TE.A0l(r4);
                    String str3 = e2r.A05;
                    if (str3 != null) {
                        r1 = FFP.A03(requireContext3, A0l, str3, A0f);
                        r0 = e2r.A0E;
                        r3 = (1P0) r0.getValue();
                    }
                }
                r1.A00 = r3;
                1ES.A03(r1);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        int A022 = AnonymousClass0fD.A02(-293139339);
        C47445E2r.super.onCreate(bundle);
        this.A00 = new C49483EwO();
        Bundle requireArguments = requireArguments();
        this.A05 = requireArguments.getString("phone_number_or_email", "");
        String A0w = DbT.A0w(requireArguments, "two_fac_method", "");
        Integer[] A002 = AnonymousClass05K.A00(4);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass05K.A0N;
                break;
            }
            num = A002[i];
            if (0qQ.A0K(C48977EnF.A00(num), A0w)) {
                break;
            }
            i++;
        }
        this.A04 = num;
        String A0w2 = DbT.A0w(requireArguments, "two_fac_confirm_code_source", "");
        Integer[] A003 = AnonymousClass05K.A00(6);
        int length2 = A003.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                num2 = AnonymousClass05K.A0j;
                break;
            }
            num2 = A003[i2];
            if (0qQ.A0K(C48976EnE.A00(num2), A0w2)) {
                break;
            }
            i2++;
        }
        this.A03 = num2;
        if (requireArguments.getBoolean("two_fac_should_fetch_code")) {
            Context requireContext = requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
            String str = this.A05;
            if (str == null) {
                0qQ.A0F("phoneNumberOrEmail");
                throw AnonymousClass00P.createAndThrow();
            }
            C47699EDi.A00(this, FFP.A02(requireContext, A0l, str), 25);
        }
        FCE.A02(AnonymousClass7TE.A0l(this.A0A), "enter_code");
        AnonymousClass0fD.A09(1679319068, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(256696166);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_confirm_phone_number_fragment, viewGroup, false);
        ProgressButton A0O = Dba.A0O(inflate);
        AnonymousClass0fU.A00((View.OnClickListener) this.A09.getValue(), A0O);
        A0O.setEnabled(false);
        this.A02 = A0O;
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) inflate.requireViewById(R.id.edit_text);
        confirmationCodeEditText.addTextChangedListener((W7f) this.A0C.getValue());
        confirmationCodeEditText.setOnEditorActionListener((FQe) this.A07.getValue());
        confirmationCodeEditText.setOnLongClickListener(new FPV(3, confirmationCodeEditText, confirmationCodeEditText));
        this.A01 = confirmationCodeEditText;
        TextView A0R = AnonymousClass7TG.A0R(inflate, R.id.two_fac_confirm_phone_number_body);
        TextView A0R2 = AnonymousClass7TG.A0R(inflate, R.id.footer);
        ESx eSx = new ESx(this, Dbb.A06(this), 29);
        Integer num = this.A03;
        if (num == null) {
            str = "twoFacConfirmCodeSource";
        } else {
            int intValue = num.intValue();
            str = "phoneNumberOrEmail";
            if (intValue == 0) {
                String str2 = this.A05;
                if (str2 != null) {
                    DbX.A1F(A0R, this, FGN.A00(str2), 2131975659);
                    FGN.A02(eSx, new ESx(this, Dbb.A06(this), 28), A0R2, DbU.A0m(this, 2131975665), DbU.A0m(this, 2131975664));
                }
            } else if (intValue == 1) {
                A0R.setText(2131975660);
                A0R2.setVisibility(8);
                DbT.A1F(inflate, R.id.space, 0);
            } else if (intValue == 3) {
                A0R2.setText(2131975665);
                String A0m = DbU.A0m(this, 2131975665);
                SpannableStringBuilder A0C2 = DbS.A0C(A0m);
                A0C2.setSpan(eSx, 0, A0m.length(), 33);
                DbT.A1H(A0R2);
                A0R2.setHighlightColor(0);
                A0R2.setText(DbS.A0C(A0C2));
                String str3 = this.A05;
                if (str3 != null) {
                    DbX.A1F(A0R, this, str3, 2131975623);
                }
            } else if (intValue == 4) {
                TextView A0R3 = AnonymousClass7TG.A0R(inflate, R.id.two_fac_confirm_phone_number_title);
                TextView A0R4 = AnonymousClass7TG.A0R(inflate, R.id.two_fac_confirm_phone_number_description);
                A0R3.setText(2131975794);
                A0R.setText(2131975792);
                A0R4.setText(2131975793);
                String A0m2 = DbU.A0m(this, 2131975665);
                0qQ.A0B(A0R2, 0);
                SpannableStringBuilder A0C3 = DbS.A0C(A0m2);
                A0C3.setSpan(eSx, 0, A0m2.length(), 33);
                DbT.A1H(A0R2);
                A0R2.setHighlightColor(0);
                A0R2.setText(DbS.A0C(A0C3));
            }
            Dbb.A1N(this);
            AnonymousClass0fD.A09(-1864916589, A022);
            return inflate;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        Window window;
        int A022 = AnonymousClass0fD.A02(-1772228201);
        C47445E2r.super.onPause();
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(0);
            ConfirmationCodeEditText confirmationCodeEditText = this.A01;
            if (confirmationCodeEditText == null) {
                0qQ.A0F("confirmationCodeEditText");
                throw AnonymousClass00P.createAndThrow();
            }
            0nA.A0N(confirmationCodeEditText);
        }
        AnonymousClass0fD.A09(-1700705866, A022);
    }

    public final void onResume() {
        Window window;
        int A022 = AnonymousClass0fD.A02(1515815582);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (!(rootActivity == null || (window = rootActivity.getWindow()) == null)) {
            window.setSoftInputMode(16);
            ConfirmationCodeEditText confirmationCodeEditText = this.A01;
            if (confirmationCodeEditText != null) {
                confirmationCodeEditText.requestFocus();
                ConfirmationCodeEditText confirmationCodeEditText2 = this.A01;
                if (confirmationCodeEditText2 != null) {
                    0nA.A0Q(confirmationCodeEditText2);
                }
            }
            0qQ.A0F("confirmationCodeEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-1402823773, A022);
    }
}
