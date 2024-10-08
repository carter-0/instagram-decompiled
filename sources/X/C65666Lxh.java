package X;

import android.content.Context;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.Lxh  reason: case insensitive filesystem */
public final class C65666Lxh implements C66463MSr {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C61438K7n A01;
    public final /* synthetic */ UserStoryTarget A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0rm A05;
    public final /* synthetic */ boolean A06;

    public C65666Lxh(Context context, C61438K7n k7n, UserStoryTarget userStoryTarget, String str, String str2, 0rm r6, boolean z) {
        this.A01 = k7n;
        this.A00 = context;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = r6;
        this.A02 = userStoryTarget;
        this.A06 = z;
    }

    public final void DfE(Integer num) {
        0qQ.A0B(num, 0);
        if (num == AnonymousClass05K.A00) {
            C61438K7n k7n = this.A01;
            C61438K7n.A02(this.A00, k7n, (C61002Juy) this.A05.A00, this.A02, this.A04, this.A03, this.A06);
        }
    }
}
