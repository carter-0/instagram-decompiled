package X;

import android.view.View;

/* renamed from: X.LZl  reason: case insensitive filesystem */
public final class C64311LZl implements AnonymousClass07Z, C252293os {
    public final 0h9 A00;
    public final int A01;
    public final C313056fm A02;

    public final boolean CsC() {
        return true;
    }

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final void DhK(AnonymousClass3TF r4, float f, float f2) {
        0qQ.A0B(r4, 2);
        if (r4 == AnonymousClass3TF.DRAGGING) {
            0h9 r2 = this.A00;
            if (r2.A07().compareTo(07U.A04) >= 0) {
                r2.A0B(07T.ON_PAUSE);
            }
        }
    }

    public final /* synthetic */ void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final /* synthetic */ void DzE(View view) {
    }

    public final void DVx(int i, int i2) {
        if (i2 == this.A01) {
            ((C313046fl) this.A02).A04.A0Q(this);
            this.A00.A0B(07T.ON_STOP);
        }
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A00;
    }

    public C64311LZl(AnonymousClass07Z r4, C313056fm r5, int i) {
        this.A02 = r5;
        this.A01 = i;
        0h9 r1 = new 0h9(r4);
        this.A00 = r1;
        r1.A0B(07T.ON_CREATE);
        r1.A0B(07T.ON_START);
        r1.A0B(07T.ON_RESUME);
        r5.A90(this);
        r4.getLifecycle().A09(new C64302LZc(this, 3));
    }

    public final void DhS(AnonymousClass3TF r3, AnonymousClass3TF r4) {
        0h9 r1;
        07T r0;
        AnonymousClass7TG.A1N(r3, r4);
        if (r3 == AnonymousClass3TF.DRAGGING && r4 == AnonymousClass3TF.IDLE) {
            r1 = this.A00;
            r0 = 07T.ON_PAUSE;
        } else if (r3 == AnonymousClass3TF.IDLE && r4 == AnonymousClass3TF.SETTLING) {
            r1 = this.A00;
            r0 = 07T.ON_RESUME;
        } else {
            return;
        }
        r1.A0B(r0);
    }
}
