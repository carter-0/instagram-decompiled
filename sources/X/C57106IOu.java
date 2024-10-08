package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.IOu  reason: case insensitive filesystem */
public final class C57106IOu implements AnonymousClass3NL, C252213ok {
    public Animator A00;
    public C262204Co A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final EditText A07;
    public final AnonymousClass4DH A08;
    public final UserSession A09;
    public final AnonymousClass3E6 A0A;
    public final H80 A0B = new H80(this, 2);
    public final C313666go A0C;
    public final C18488Vsj A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final C635813i A0H;

    public C57106IOu(View view, View view2, AnonymousClass4DH r11, UserSession userSession, C313666go r13) {
        DbW.A1N(userSession, 2, view2);
        this.A08 = r11;
        this.A09 = userSession;
        this.A0C = r13;
        this.A02 = view2;
        MMN mmn = new MMN(this, 34);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMN(new MMN(r11, 31), 32));
        this.A0G = DbS.A0I(new MMN(A002, 33), mmn, new C66304MMn(6, A002, (Object) null), DbS.A0z(C60291Jio.class));
        this.A06 = DbX.A0I(view, R.id.iglive_reactions_layout);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.iglive_reactions_composer);
        this.A05 = A0G2;
        View A0G3 = AnonymousClass7TF.A0G(view, R.id.iglive_comment_composer_container);
        this.A04 = A0G3;
        this.A03 = AnonymousClass7TF.A0G(view, R.id.comment_composer);
        this.A07 = (EditText) AnonymousClass7TF.A0F(view, R.id.comment_composer_edit_text);
        this.A0E = AnonymousClass1YB.A00(new MMN(view, 29));
        this.A0F = AnonymousClass1YB.A00(new MMN(view, 30));
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A0A = A012;
        this.A0D = new C18488Vsj(view2, A0G3, A0G2, 0mk.A02(AnonymousClass7TE.A0S(view)));
        this.A0H = C57006IKy.A00;
        if (r13 != C313666go.VIEWER) {
            A02(r11);
        }
        View A0c = AnonymousClass7TE.A0c(this.A0E);
        if (A0c != null) {
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0c);
            A0m.A04 = this;
            A0m.A05 = AnonymousClass05K.A01;
            A0m.A00();
        }
        View A062 = AnonymousClass7TH.A06(this.A0F);
        if (A062 != null) {
            AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(A062);
            A0m2.A04 = this;
            A0m2.A05 = AnonymousClass05K.A01;
            A0m2.A00();
        }
        A012.A9Y(this);
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        String A0E2 = 002.A0E(str, '@', ' ');
        EditText editText = this.A07;
        editText.setText(A0E2);
        editText.requestFocus();
        0nA.A0Q(editText);
    }

    public final void DP5(View view) {
    }

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        if (view.equals(this.A0E.getValue())) {
            2YL A0H2 = DbS.A0H(this.A0G);
            AnonymousClass7TE.A1Z(new C66184MGv((Object) A0H2, (AnonymousClass4D7) null, 30), C318116oQ.A00(A0H2));
            return true;
        } else if (!view.equals(AnonymousClass7TE.A14(this.A0F))) {
            return true;
        } else {
            C60291Jio A002 = A00(this);
            H80 h80 = this.A0B;
            long A003 = h80.A00();
            int i = h80.A00;
            h80.A00 = 0;
            A002.A01("", i, A003, true);
            return true;
        }
    }

    public static C60291Jio A00(C57106IOu iOu) {
        return (C60291Jio) iOu.A0G.getValue();
    }

    public static final void A01(C57106IOu iOu) {
        EditText editText = iOu.A07;
        String A0f = AnonymousClass7TF.A0f(editText);
        int length = A0f.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(A0f, i2);
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
        String A0c = Dba.A0c(A0f, length, i);
        editText.clearFocus();
        editText.setText(A0c);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.H80, android.text.TextWatcher] */
    public final void A02(Fragment fragment) {
        this.A05.setEnabled(true);
        EditText editText = this.A07;
        editText.setFocusable(true);
        editText.setEnabled(true);
        editText.setFocusableInTouchMode(true);
        editText.setOnFocusChangeListener(new ID5(this, 4));
        ID1.A01(editText, 40, this);
        editText.setOnEditorActionListener(new IEI(this, 3));
        editText.addTextChangedListener(this.A0B);
        AnonymousClass0eM r4 = this.A0G;
        this.A01 = AnonymousClass11O.A03(DbV.A0J(fragment), new C61860pz(new C52070GDq(fragment, this, (AnonymousClass4D7) null, 8), ((C60291Jio) r4.getValue()).A0E));
        C51969G9p.A15(fragment.getViewLifecycleOwner(), ((C60291Jio) r4.getValue()).A01, new J6T(18, (Object) fragment, (Object) this), 18);
    }

    public final void DMr(int i, boolean z) {
        C60291Jio A002 = A00(this);
        if (i <= AnonymousClass7TE.A0M(this.A0H.get())) {
            C60291Jio.A00((M0V) null, A002, (String) null, 19, false, false, false);
        }
    }
}
