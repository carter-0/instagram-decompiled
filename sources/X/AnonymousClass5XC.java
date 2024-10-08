package X;

import androidx.compose.ui.platform.AndroidComposeView;
import com.instagram.android.R;

/* renamed from: X.5XC  reason: invalid class name */
public final class AnonymousClass5XC implements C285035Pk, AnonymousClass0hF {
    public AnonymousClass07V A00;
    public 0sL A01 = AnonymousClass5XD.A00;
    public boolean A02;
    public final C285035Pk A03;
    public final AndroidComposeView A04;

    public final void Dms(07T r2, AnonymousClass07Z r3) {
        if (r2 == 07T.ON_DESTROY) {
            dispose();
        } else if (r2 == 07T.ON_CREATE && !this.A02) {
            ESi(this.A01);
        }
    }

    public final void ESi(0sL r4) {
        this.A04.setOnViewTreeOwnersAvailable(new C377469Ly(17, (Object) this, (Object) r4));
    }

    public final void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A04.setTag(R.id.wrapped_composition_tag, (Object) null);
            AnonymousClass07V r0 = this.A00;
            if (r0 != null) {
                r0.A0A(this);
            }
        }
        this.A03.dispose();
    }

    public AnonymousClass5XC(C285035Pk r2, AndroidComposeView androidComposeView) {
        this.A04 = androidComposeView;
        this.A03 = r2;
    }
}
