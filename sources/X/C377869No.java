package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.instagram.common.session.UserSession;

/* renamed from: X.9No  reason: invalid class name and case insensitive filesystem */
public final class C377869No extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377869No(Object obj, Object obj2, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 == 0) {
            return new C3493780d((Context) this.A01, (UserSession) this.A02, this.A03, this.A04);
        }
        AnonymousClass7L2 r4 = (AnonymousClass7L2) this.A02;
        boolean z = ((AnonymousClass7LQ) this.A01).A0e.A2P;
        boolean z2 = this.A03;
        boolean z3 = this.A04;
        0qQ.A0B(r4, 0);
        if (!z3) {
            if (z2 == z) {
                return null;
            }
        } else if (!z) {
            return null;
        }
        return new ColorDrawable(r4.A04.A0A);
    }
}
