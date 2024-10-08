package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.3rW  reason: invalid class name and case insensitive filesystem */
public final class C253853rW implements C253863rX {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final C253843rV A03;
    public final AnonymousClass4DU A04;

    public C253853rW(Fragment fragment, UserSession userSession, AnonymousClass311 r4, C253843rV r5, AnonymousClass4DU r6) {
        0qQ.A0B(r5, 5);
        this.A02 = r4;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A04 = r6;
        this.A03 = r5;
    }

    public final void Dl9(1Xj r9, GQ0 gq0, C246663ey r11, AnonymousClass3W1 r12, int i) {
        1Xj r2 = r9;
        0qQ.A0B(r9, 1);
        AnonymousClass3W1 r5 = r12;
        0qQ.A0B(r12, 2);
        if (this.A00.getActivity() != null) {
            C246663ey r4 = r11;
            if (r11.A00().getIgImageView().A0G()) {
                this.A03.A00(r11.A09, r2, gq0, r4, r5, r11.A0A, i);
            }
        }
    }

    public final JOE BQ4() {
        return this.A02.BQ4();
    }

    public final void DA3(1Xj r7, GQ0 gq0, C246663ey r9, AnonymousClass3W1 r10, int i) {
        if (this.A00.getActivity() != null && r9.A00().getIgImageView().A0G()) {
            this.A03.A01(r9.A01(), r7, gq0, r10, i);
        }
    }
}
