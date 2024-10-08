package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.List;

/* renamed from: X.Eeu  reason: case insensitive filesystem */
public abstract class C48461Eeu {
    public static final Object A00(C307896Rx r16) {
        FragmentActivity A04 = C308206Td.A04(r16);
        0lg A0R = DbW.A0R(r16);
        if (182.A06(0Tu.A05, A0R, 2342161703640373630L)) {
            C309516Yo A0Q = DbU.A0Q(A04, A0R);
            A0Q.A0B((Bundle) null, Eq6.A00(C21251XQw.ARCHIVING_AND_DOWNLOADING, (String) null));
            A0Q.A04();
            return null;
        }
        C46649DiU A042 = C46649DiU.A04(AnonymousClass000.A00(2882), AnonymousClass7TE.A1E());
        IgBloksScreenConfig A0N = DbS.A0N(A0R);
        A0N.A07(new C46615Dhv((C20880X2h) null, (C3034368u) null, (C276544tV) null, (C276544tV) null, (C277014uI) null, A04.getString(2131953166), (String) null, (List) null, false, false, false));
        A042.A0D(A04, A0N);
        return null;
    }
}
