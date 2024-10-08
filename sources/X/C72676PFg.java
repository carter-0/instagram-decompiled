package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.PFg  reason: case insensitive filesystem */
public final /* synthetic */ class C72676PFg implements C74347PtN {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C329217Ia A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C72676PFg(FragmentActivity fragmentActivity, C329217Ia r2, boolean z) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
        this.A02 = z;
    }

    public final void DG7(Integer num) {
        C329217Ia r5 = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        boolean z = this.A02;
        if (num == AnonymousClass05K.A00) {
            C329067Hl r2 = r5.A01;
            AnonymousClass37D A012 = AnonymousClass7ON.A01(r2.A1R, r2.A1Z);
            if (A012 != null) {
                AnonymousClass37F r1 = (AnonymousClass37F) A012;
                if (r1.A0g) {
                    r1.A0H = new C72962PQu(fragmentActivity, r5, z);
                    return;
                }
            }
            r2.A1K(fragmentActivity, (MessageIdentifier) null, z);
        }
    }
}
