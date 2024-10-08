package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class H4F extends 1P0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public H4F(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(2002370459);
        C54057Gyg gyg = (C54057Gyg) obj;
        int A032 = AnonymousClass0fD.A03(1413389628);
        H4F.super.onSuccess(gyg);
        if (gyg != null) {
            1Xj r3 = gyg.A00;
            if (r3 != null) {
                UserSession userSession = this.A01;
                FragmentActivity fragmentActivity = this.A00;
                String str = this.A02;
                C51967G9n.A1K(userSession, r3);
                C55255Hek.A00(fragmentActivity, userSession, str);
            } else {
                0qQ.A0F("clipsMedia");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        AnonymousClass0fD.A0A(-895704647, A032);
        AnonymousClass0fD.A0A(-1903167790, A03);
    }
}
