package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.4JW  reason: invalid class name */
public final class AnonymousClass4JW implements AnonymousClass4JX {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass311 A03;
    public final C253843rV A04;
    public final AnonymousClass4DU A05;
    public final String A06;

    public AnonymousClass4JW(Context context, Fragment fragment, UserSession userSession, AnonymousClass311 r5, C253843rV r6, AnonymousClass4DU r7, String str) {
        0qQ.A0B(r6, 5);
        this.A03 = r5;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = str;
        this.A00 = context;
    }

    public final void D9y(1Xj r11, GQ0 gq0, AnonymousClass4EA r13, AnonymousClass3W1 r14, int i) {
        Fragment fragment = this.A01;
        if (fragment.getActivity() != null && r13.A0N.getIgImageView().A0G()) {
            1Xj r4 = r11;
            AnonymousClass3W1 r6 = r14;
            this.A04.A01(r13.A0T, r4, gq0, r6, i);
            AnonymousClass3VF r7 = r13.A0Q;
            UserSession userSession = this.A02;
            AnonymousClass4DU r5 = this.A05;
            String str = this.A06;
            C55012Haj.A00(fragment.getContext(), userSession, (C55632Hkr) ((C2357230y) this.A03).A1c.getValue(), r4, r5, r6, r7, str, true);
        }
    }

    public final void Dl3(1Xj r9, GQ0 gq0, AnonymousClass4EA r11, AnonymousClass3W1 r12, int i) {
        1Xj r2 = r9;
        0qQ.A0B(r9, 0);
        AnonymousClass3W1 r5 = r12;
        0qQ.A0B(r12, 1);
        if (this.A01.getActivity() != null) {
            AnonymousClass4EA r4 = r11;
            if (r11.A0N.getIgImageView().A0G()) {
                this.A04.A00(r11.A0T, r2, gq0, r4, r5, r11.A0Q, i);
            }
        }
    }

    public final JOE BQ4() {
        return this.A03.BQ4();
    }
}
