package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9lo  reason: invalid class name and case insensitive filesystem */
public final class C387189lo extends AnonymousClass9UZ {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387189lo(Context context, UserSession userSession, C347017w8 r5, int i) {
        super(context, userSession, r5, context.getResources().getString(2131974218));
        this.A00 = i;
    }

    public final boolean A01() {
        switch (this.A00) {
            case 0:
            case 1:
                return false;
            default:
                return super.A01();
        }
    }
}
