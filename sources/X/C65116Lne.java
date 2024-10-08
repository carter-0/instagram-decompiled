package X;

import android.app.Activity;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Lne  reason: case insensitive filesystem */
public final class C65116Lne implements C66476MTe {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ K66 A01;
    public final /* synthetic */ AnonymousClass3Q2 A02;

    public C65116Lne(Activity activity, K66 k66, AnonymousClass3Q2 r3) {
        this.A01 = k66;
        this.A02 = r3;
        this.A00 = activity;
    }

    public final void DWa() {
        C59689JTv.A0B(this.A00, "pending_media_prepare_failed_quick_publish");
    }

    public final void DWb() {
        LFG A04 = K66.A04(this.A01);
        if (A04 != null) {
            AnonymousClass3Q2 r4 = this.A02;
            0qQ.A0B(r4, 0);
            A04.A00 = r4;
            Boolean bool = true;
            if (bool.equals(bool)) {
                String A0Z = JTQ.A0Z();
                0qQ.A0B(A0Z, 0);
                r4.A3t = A0Z;
            }
            r4.A5S = false;
            r4.A0e(ShareType.CLIPS);
            r4.A5g = true;
            String str = r4.A33;
            A04.A01 = str;
            A04.A03.A0I(r4, AnonymousClass7TF.A1V(str), bool.equals(bool));
        }
    }
}
