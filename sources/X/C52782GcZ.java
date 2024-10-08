package X;

import android.app.Dialog;
import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.GcZ  reason: case insensitive filesystem */
public final class C52782GcZ extends Dialog {
    public final /* synthetic */ C3034368u A00;
    public final /* synthetic */ C277014uI A01;
    public final /* synthetic */ C62320sa A02;
    public final /* synthetic */ 0sP A03;

    public final void onBackPressed() {
        C277014uI r4 = this.A01;
        if (r4 != null) {
            C3034368u r1 = this.A00;
            C62320sa r0 = this.A02;
            0sP r3 = this.A03;
            try {
                C307886Rw.A03((C307786Rm) r0.invoke(), r1.A02, AnonymousClass6Tm.A01, r4);
            } catch (Exception e) {
                r3.invoke(e);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52782GcZ(Context context, C3034368u r3, C277014uI r4, C62320sa r5, 0sP r6) {
        super(context, R.style.alaska_full_screen_dialog);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = r6;
    }
}
