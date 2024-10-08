package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.E8z  reason: case insensitive filesystem */
public final class C47587E8z extends C331047Ph implements AnonymousClass7Q7 {
    public AnonymousClass3UH A00;
    public DwA A01;
    public final C46450DfD A02;
    public final C46448DfA A03;
    public final C39695A5l A04 = new Object();
    public final C336947fR A05;
    public final C46454DfI A06;
    public final C46467DfV A07;
    public final EB2 A08;

    public final boolean AJe(String str) {
        String str2;
        AnonymousClass3UH r0;
        User user;
        0qQ.A0B(str, 0);
        DwA dwA = this.A01;
        if (dwA == null || (user = dwA.A03) == null) {
            str2 = null;
        } else {
            str2 = user.getId();
        }
        if (0qQ.A0K(str2, str) || ((r0 = this.A00) != null && r0.A09(str))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.A5l] */
    public C47587E8z(Context context, AnonymousClass0iw r16, UserSession userSession, AnonymousClass32K r18, G88 g88, E6a e6a, AnonymousClass32I r21) {
        UserSession userSession2 = userSession;
        boolean A1Y = DbW.A1Y(userSession2);
        AnonymousClass0iw r7 = r16;
        EB2 eb2 = new EB2(context, r7, userSession2, e6a);
        this.A08 = eb2;
        C46450DfD dfD = new C46450DfD(context, r7, userSession2, r18, g88, 182.A06(0Tu.A05, userSession2, 36316035842051958L), A1Y, false);
        this.A02 = dfD;
        C336947fR r4 = new C336947fR(context);
        this.A05 = r4;
        C46448DfA A002 = C46448DfA.A00(2131974681);
        A002.A02 = 0;
        A002.A0I = false;
        this.A03 = A002;
        C46454DfI dfI = new C46454DfI(context, r21);
        this.A06 = dfI;
        this.A07 = new C46467DfV(AnonymousClass05K.A0C);
        A0B(eb2, dfD, r4, dfI);
    }

    public static final void A00(C47587E8z e8z) {
        List<Object> A032;
        e8z.A06();
        DwA dwA = e8z.A01;
        if (dwA != null) {
            e8z.A08(e8z.A08, dwA);
        }
        AnonymousClass3UH r1 = e8z.A00;
        if (r1 != null) {
            if (!r1.A07()) {
                A032 = r1.A0M;
            } else {
                A032 = r1.A03();
            }
            int i = 0;
            if (A032 != null && !A032.isEmpty()) {
                e8z.A09(e8z.A05, e8z.A03, e8z.A04);
                for (Object A09 : A032) {
                    e8z.A09(e8z.A02, A09, Integer.valueOf(i));
                    i++;
                }
                e8z.A08(e8z.A06, e8z.A07);
            }
        }
        e8z.A07();
    }

    public final void notifyDataSetChanged() {
        A00(this);
    }
}
