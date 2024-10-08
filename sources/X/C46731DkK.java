package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.DkK  reason: case insensitive filesystem */
public final class C46731DkK extends C361478gI {
    public String A00;
    public final Locale A01;
    public final C249513ju A02;
    public final AnonymousClass0r6 A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;
    public final 0wc A06;
    public final List A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46731DkK(Application application, 0wc r9, String str, List list, Locale locale) {
        super(application);
        0qQ.A0B(r9, 3);
        AnonymousClass7TG.A1R(str, application);
        this.A07 = list;
        this.A01 = locale;
        this.A06 = r9;
        this.A00 = str;
        02z A012 = 106.A01((Object) null);
        this.A05 = A012;
        02x A013 = 10q.A01(new C66185MGw(this, (AnonymousClass4D7) null, 49), A012);
        this.A04 = 10b.A02(new C61078JwG(A00(this, (String) null), 43), C318116oQ.A00(this), A013, AnonymousClass10A.A01);
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A02 = r0;
        this.A03 = 0u9.A04(r0);
    }

    public final void A0E(C47271Dtz dtz) {
        0qQ.A0B(dtz, 0);
        String str = dtz.A02;
        Locale locale = this.A01;
        if (!Dbb.A1b(this.A00, DbT.A12(locale, str), locale)) {
            this.A00 = str;
            AnonymousClass7TE.A1Z(new C66168MGf((Object) dtz, (Object) this, (AnonymousClass4D7) null, 20), C318116oQ.A00(this));
        }
    }

    public static final List A00(C46731DkK dkK, String str) {
        List<C47271Dtz> list;
        if (str == null || str.length() == 0) {
            list = dkK.A07;
        } else {
            Locale locale = dkK.A01;
            String A12 = DbT.A12(locale, str);
            List list2 = dkK.A07;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list2) {
                C47271Dtz dtz = (C47271Dtz) next;
                Application A0D = dkK.A0D();
                String A122 = DbT.A12(locale, dtz.A02);
                String A123 = DbT.A12(locale, AnonymousClass7TE.A16(A0D, dtz.A01));
                String A124 = DbT.A12(locale, AnonymousClass7TE.A16(A0D, dtz.A00));
                if (00l.A0d(A122, A12, false) || 00l.A0d(A123, A12, false) || 00l.A0d(A124, A12, false)) {
                    A1C.add(next);
                }
            }
            list = A1C;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C47271Dtz dtz2 : list) {
            String str2 = dkK.A00;
            Locale locale2 = dkK.A01;
            A0r.add(new C61082JwK(dtz2, Dbb.A1b(dtz2.A02, DbT.A12(locale2, str2), locale2)));
        }
        return A0r;
    }
}
