package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class E91 extends C331047Ph implements AnonymousClass7Q7 {
    public int A00;
    public AnonymousClass3UH A01;
    public boolean A02;
    public final C46450DfD A03;
    public final EA0 A04;
    public final C46448DfA A05;
    public final C39695A5l A06;
    public final C336947fR A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final Resources A09;
    public final UserSession A0A;
    public final C46437Dez A0B;
    public final C46453DfH A0C;
    public final Set A0D = AnonymousClass7TE.A1F();

    public final boolean AJe(String str) {
        AnonymousClass3UH r0;
        0qQ.A0B(str, 0);
        if (this.A0D.contains(str) || ((r0 = this.A01) != null && r0.A09(str))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.A5l] */
    public E91(Context context, AnonymousClass0iw r18, UserSession userSession, AnonymousClass32K r20, G88 g88, C51909G7d g7d, C51960G9g g9g, C46432Det det) {
        UserSession userSession2 = userSession;
        boolean A1Y = DbW.A1Y(userSession2);
        Context context2 = context;
        AnonymousClass0iw r9 = r18;
        C46453DfH dfH = new C46453DfH((Activity) null, context2, r9, userSession2, (C46443Df5) null, g9g, det, (String) null, false);
        this.A0C = dfH;
        C46448DfA A002 = C46448DfA.A00(2131974681);
        this.A05 = A002;
        this.A09 = AnonymousClass7TF.A0A(context2);
        dfH.A01 = A1Y;
        dfH.A00 = false;
        EA0 ea0 = new EA0(context2, g7d);
        this.A04 = ea0;
        C336947fR r1 = new C336947fR(context2);
        this.A07 = r1;
        this.A06 = new Object();
        C46450DfD dfD = new C46450DfD(context2, r9, userSession2, r20, g88, false, A1Y, false);
        this.A03 = dfD;
        this.A0A = userSession2;
        A002.A02 = 0;
        A002.A0I = false;
        C46437Dez dez = new C46437Dez(context2);
        this.A0B = dez;
        A0B(dfH, ea0, r1, dfD, dez);
    }

    public static final void A00(AnonymousClass3UH r3, E91 e91, int i) {
        Set set = e91.A0D;
        set.clear();
        Iterator it = e91.A08.iterator();
        while (it.hasNext()) {
            set.add(DbT.A0k(it).getId());
        }
        e91.A00 = i;
        e91.A01 = r3;
        A01(e91);
    }

    public static final void A01(E91 e91) {
        List<Object> A032;
        e91.A06();
        List list = e91.A08;
        if (list.isEmpty() && e91.A02) {
            e91.A08(e91.A0B, e91.A09.getString(2131968486));
        }
        int i = 0;
        int size = list.size();
        while (true) {
            if (i >= size) {
                break;
            }
            e91.A09(e91.A0C, list.get(i), new FAU((ImmutableList) null, (String) null, false));
            if (e91.A00 == i) {
                e91.A08(e91.A04, new C49489EwU(AnonymousClass05K.A0C, Integer.valueOf(list.size())));
                break;
            }
            i++;
        }
        AnonymousClass3UH r0 = e91.A01;
        if (r0 != null) {
            int i2 = 0;
            boolean A1Q = AnonymousClass7TF.A1Q(r0.A07() ? 1 : 0);
            AnonymousClass3UH r02 = e91.A01;
            if (A1Q) {
                if (r02 != null) {
                    A032 = r02.A0M;
                }
            } else if (r02 != null) {
                A032 = r02.A03();
            }
            if (A032 != null && !A032.isEmpty()) {
                e91.A09(e91.A07, e91.A05, e91.A06);
                for (Object A092 : A032) {
                    e91.A09(e91.A03, A092, Integer.valueOf(i2));
                    i2++;
                }
                e91.A08(e91.A04, new C49489EwU(AnonymousClass05K.A00, (Integer) null));
            }
        }
        e91.A07();
    }
}
