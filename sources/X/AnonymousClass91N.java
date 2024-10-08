package X;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import com.instagram.common.session.UserSession;

/* renamed from: X.91N  reason: invalid class name */
public final class AnonymousClass91N implements AnonymousClass3NL {
    public boolean A00;
    public final View A01;
    public final EditText A02;
    public final UserSession A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final C358398aq A05;

    public AnonymousClass91N(View view, EditText editText, UserSession userSession, C358398aq r7) {
        0qQ.A0B(view, 2);
        0qQ.A0B(editText, 3);
        this.A03 = userSession;
        this.A01 = view;
        this.A02 = editText;
        this.A05 = r7;
        AnonymousClass3NG r0 = new AnonymousClass3NG(view);
        r0.A04 = this;
        r0.A07 = true;
        r0.A0C = true;
        r0.A00();
    }

    public static final void A00(View view, AnonymousClass91N r8, boolean z, boolean z2, boolean z3) {
        AnonymousClass91N r6 = r8;
        Handler handler = r8.A04;
        View view2 = view;
        boolean z4 = z;
        C41237AqZ aqZ = new C41237AqZ(view2, r6, z4, z3, z2);
        long j = 2000;
        if (z4 && r6.A00) {
            j = 7000;
        }
        handler.postDelayed(aqZ, j);
    }

    public final void DP5(View view) {
    }

    public final void A01(Integer num) {
        0nA.A0p(this.A02, new C379499Ud(this, num));
    }

    public final void A02(boolean z) {
        View view = this.A01;
        view.setActivated(z);
        Resources resources = view.getResources();
        int i = 2131975126;
        if (z) {
            i = 2131975125;
        }
        03v.A0G(view, resources.getString(i));
    }

    public final boolean Dqe(View view) {
        0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
        AR4.E5T("has_used_text_emphasis_button", true);
        AR4.apply();
        this.A05.Dr1();
        return true;
    }
}
