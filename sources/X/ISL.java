package X;

import androidx.fragment.app.Fragment;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class ISL implements AnonymousClass4GO {
    public final Fragment A00;
    public final AnonymousClass311 A01;
    public final C253843rV A02;
    public final C234342xi A03;

    public ISL(Fragment fragment, AnonymousClass311 r3, C253843rV r4, C234342xi r5) {
        0qQ.A0B(r4, 3);
        this.A01 = r3;
        this.A00 = fragment;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final void Dm1(C254173s3 r7, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        AnonymousClass7TG.A1N(r8, r10);
        this.A02.A01(r7.A01, r8, gq0, r10, i);
    }

    public final void Dm2(C254173s3 r9, 1Xj r10, AnonymousClass3W1 r11, C253913rc r12, int i) {
        1Xj r4 = r10;
        C51972G9s.A1B(r10, r9);
        C234342xi r1 = this.A03;
        if (!r1.A02()) {
            MediaFrameLayout mediaFrameLayout = r9.A09;
            if (mediaFrameLayout.getParent() instanceof C253723rH) {
                r1.A01(mediaFrameLayout, r9.A02, r4, r12, r11.A03, i);
            }
        }
    }

    public final void Dm3(C254173s3 r9, 1Xj r10, GQ0 gq0, AnonymousClass3W1 r12, int i) {
        1Xj r2 = r10;
        AnonymousClass3W1 r5 = r12;
        AnonymousClass7TG.A1N(r10, r12);
        if (this.A00.getActivity() == null) {
            return;
        }
        if (r9.A06.CWX() || r9.A05.CWX()) {
            this.A02.A00(r9.A09, r2, gq0, (AnonymousClass3V3) null, r5, r9.A07, i);
        }
    }

    public final AnonymousClass47O BR2() {
        return this.A01.BR2();
    }
}
