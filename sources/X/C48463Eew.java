package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.List;

/* renamed from: X.Eew  reason: case insensitive filesystem */
public abstract class C48463Eew {
    public static final Object A00(C307896Rx r15) {
        FragmentActivity A04 = C308206Td.A04(r15);
        0lg A0R = DbW.A0R(r15);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, A0R, 2342161703640439167L)) {
            Dbc.A0R(Eq6.A00(C21251XQw.TAGS_AND_MENTIONS, (String) null), A04, A0R);
            return null;
        }
        boolean A06 = 182.A06(r2, A0R, 36318694426810752L);
        int i = 2131974989;
        if (A06) {
            i = 2131966146;
        }
        C46649DiU A042 = C46649DiU.A04(AnonymousClass000.A00(1201), AnonymousClass7TE.A1E());
        IgBloksScreenConfig A0N = DbS.A0N(A0R);
        A0N.A07(new C46615Dhv((C20880X2h) null, (C3034368u) null, (C276544tV) null, (C276544tV) null, (C277014uI) null, A04.getString(i), (String) null, (List) null, false, false, false));
        A042.A0D(A04, A0N);
        return null;
    }
}
