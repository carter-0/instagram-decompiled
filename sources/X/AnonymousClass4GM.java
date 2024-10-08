package X;

import androidx.fragment.app.Fragment;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.4GM  reason: invalid class name */
public final class AnonymousClass4GM implements AnonymousClass4GN {
    public final Fragment A00;
    public final AnonymousClass311 A01;
    public final C246733f9 A02;
    public final C253843rV A03;
    public final C234342xi A04;

    public AnonymousClass4GM(Fragment fragment, AnonymousClass311 r3, C246733f9 r4, C253843rV r5, C234342xi r6) {
        0qQ.A0B(r5, 3);
        0qQ.A0B(r4, 5);
        this.A01 = r3;
        this.A00 = fragment;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
    }

    public final void DKG(C240983Nk r2, C254173s3 r3, 1Xj r4, AnonymousClass3W1 r5) {
        0qQ.A0B(r4, 1);
        r5.A0I(r2);
    }

    public final void Dm1(C254173s3 r7, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r10, 1);
        this.A03.A01(r7.A01, r8, gq0, r10, i);
    }

    public final void Dm2(C254173s3 r9, 1Xj r10, AnonymousClass3W1 r11, C253913rc r12, int i) {
        1Xj r4 = r10;
        0qQ.A0B(r10, 1);
        0qQ.A0B(r9, 4);
        C234342xi r1 = this.A04;
        if (!r1.A02()) {
            MediaFrameLayout mediaFrameLayout = r9.A09;
            if (mediaFrameLayout.getParent() instanceof C253723rH) {
                r1.A01(mediaFrameLayout, r9.A02, r4, r12, r11.A03, i);
            }
        }
    }

    public final void Dm3(C254173s3 r9, 1Xj r10, GQ0 gq0, AnonymousClass3W1 r12, int i) {
        1Xj r2 = r10;
        0qQ.A0B(r10, 0);
        AnonymousClass3W1 r5 = r12;
        0qQ.A0B(r12, 1);
        if (this.A00.getActivity() == null) {
            return;
        }
        if (r9.A06.CWX() || r9.A05.CWX()) {
            this.A03.A00(r9.A09, r2, gq0, (AnonymousClass3V3) null, r5, r9.A07, i);
        }
    }

    public final JSu Am7() {
        return this.A01.Am7();
    }

    public final AnonymousClass47O BR2() {
        return this.A01.BR2();
    }
}
