package X;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;

public final class P14 implements AnonymousClass7H7 {
    public final /* synthetic */ OI1 A00;

    public P14(OI1 oi1) {
        this.A00 = oi1;
    }

    public final void DBr(String str, String str2, String str3) {
        OI1 oi1 = this.A00;
        AnonymousClass4DH r4 = oi1.A05;
        FragmentActivity requireActivity = r4.requireActivity();
        UserSession userSession = oi1.A06;
        DirectThreadKey directThreadKey = oi1.A09;
        int i = oi1.A04;
        AnonymousClass9HD r2 = AnonymousClass9HC.A1b;
        Parcelable.Creator creator = Capabilities.CREATOR;
        0sn r1 = 0sn.A00;
        AnonymousClass7L2 A06 = C250563lf.A06(requireActivity, C66581MXm.A0X(userSession, r2, r1));
        String str4 = directThreadKey.A00;
        if (str4 != null) {
            Capabilities A002 = C376189Gz.A00(r1);
            P9Q p9q = new P9Q(requireActivity, r4, userSession);
            int i2 = A06.A01;
            new P15(requireActivity, userSession, A002, new P13(userSession, directThreadKey), p9q, str4, AnonymousClass7TE.A1C(), i, i2).DBr(str, str3, str2);
        }
    }
}
