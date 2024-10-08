package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P2h  reason: case insensitive filesystem */
public final class C72342P2h implements C74394PuA {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final N4P A04;
    public final Integer A05;

    public C72342P2h(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, N4P n4p, Integer num) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = n4p;
        this.A05 = num;
        this.A02 = r4;
    }

    public final boolean isEnabled() {
        return C69948Nuo.A00(this.A03, this.A04);
    }

    public final List getItems() {
        Integer num;
        Context context;
        String string;
        int i;
        int i2;
        Object[] objArr;
        ArrayList A1C = AnonymousClass7TE.A1C();
        N4P n4p = this.A04;
        C254743sy A08 = n4p.A08();
        String str = n4p.A0N;
        if (str != null) {
            int ordinal = C67256Mkq.valueOf(DbY.A0k(str)).ordinal();
            if (ordinal != 6) {
                if (ordinal == 5) {
                    num = 2131964258;
                    context = this.A00;
                    string = context.getString(2131964268);
                    i = 1;
                }
                return A1C;
            }
            num = 2131964259;
            context = this.A00;
            string = context.getString(2131964247);
            i = 0;
            if (string != null) {
                UserSession userSession = this.A03;
                boolean A1W = AnonymousClass7TF.A1W(C66582MXn.A0L(userSession), BizUserInboxState.GENERAL_FOLDER_THROTTLED);
                A1C.add(new C70658OFf(new C71344Oit(i, 1, A08, this), 2131964251, num.intValue(), A1W));
                boolean A052 = N4P.A05(n4p);
                if (!A052 || !182.A05(0Tu.A05, userSession)) {
                    i2 = 2131964255;
                    if (!A052) {
                        i2 = 2131964256;
                        objArr = new Object[]{AnonymousClass48N.A08(context, userSession, n4p.A0P, JTO.A15(n4p.A0c), false), string};
                        A1C.add(new FGF((CharSequence) context.getString(i2, objArr)));
                    }
                } else {
                    i2 = 2131964254;
                }
                objArr = new Object[]{string};
                A1C.add(new FGF((CharSequence) context.getString(i2, objArr)));
            }
            return A1C;
        }
        throw AnonymousClass7TE.A0y();
    }
}
