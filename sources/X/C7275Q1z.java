package X;

import androidx.compose.ui.platform.AndroidComposeView;
import com.instagram.android.R;

/* renamed from: X.Q1z  reason: case insensitive filesystem */
public final class C7275Q1z implements C285035Pk, AnonymousClass0hF {
    public AnonymousClass07V A00;
    public 0sL A01 = C45172CrZ.A00;
    public boolean A02;
    public final C285035Pk A03;
    public final AndroidComposeView A04;

    public final void Dms(07T r2, AnonymousClass07Z r3) {
        0qQ.A0B(r2, 1);
        if (r2 == 07T.ON_DESTROY) {
            dispose();
        } else if (r2 == 07T.ON_CREATE && !this.A02) {
            ESi(this.A01);
        }
    }

    public final void ESi(0sL r4) {
        0qQ.A0B(r4, 0);
        0fg.A01("WrappedComposition.setContent", 933645375);
        try {
            this.A04.setOnViewTreeOwnersAvailable(new TYA(23, (Object) this, (Object) r4));
        } finally {
            0fg.A00(-1231902874);
        }
    }

    public final void dispose() {
        0fg.A01("dispose", -1468631073);
        try {
            if (!this.A02) {
                this.A02 = true;
                this.A04.setTag(R.id.wrapped_composition_tag, (Object) null);
                AnonymousClass07V r0 = this.A00;
                if (r0 != null) {
                    r0.A0A(this);
                }
            }
            this.A03.dispose();
        } finally {
            0fg.A00(-1537367126);
        }
    }

    public C7275Q1z(C285035Pk r2, AndroidComposeView androidComposeView) {
        this.A04 = androidComposeView;
        this.A03 = r2;
    }
}
