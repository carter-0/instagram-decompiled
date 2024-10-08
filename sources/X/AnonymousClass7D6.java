package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.7D6  reason: invalid class name */
public final class AnonymousClass7D6 implements AnonymousClass7D2 {
    public final C332937Xa A00;
    public final AnonymousClass0iw A01;

    /* renamed from: A00 */
    public final void ADp(AnonymousClass79G r2, AnonymousClass7EA r3) {
        0qQ.A0B(r3, 0);
        if (r2 != null) {
            r3.A03(this.A01, r2);
        }
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        return new AnonymousClass7EA(new C71662eb((ViewStub) layoutInflater.inflate(R.layout.message_reactions_pill_stub, viewGroup, false)), this.A00);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r1) {
        AnonymousClass7EB r12 = (AnonymousClass7EB) r1;
        if (r12 != null) {
            r12.A02();
        }
    }

    public AnonymousClass7D6(AnonymousClass0iw r1, C332937Xa r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
