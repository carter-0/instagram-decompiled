package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

/* renamed from: X.MoD  reason: case insensitive filesystem */
public final class C67458MoD {
    public final 0xa A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public C67458MoD(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = 1Al.A01(userSession).A04(1An.A3V, C67458MoD.class);
        0eO r1 = 0eO.A02;
        this.A02 = MYO.A00(userSession, r1, 24);
        this.A01 = MYO.A00(this, r1, 23);
    }

    private final LinkedHashMap A01(String str) {
        String string = this.A00.getString(str, (String) null);
        if (string == null) {
            return AnonymousClass7TE.A1H();
        }
        List A0x = DbX.A0x(string);
        ArrayList A0r = AnonymousClass7TG.A0r(A0x);
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            List A18 = DbV.A18(AnonymousClass7TE.A18(it), ":");
            AnonymousClass7TF.A1I(Integer.valueOf(Integer.parseInt(AnonymousClass7TE.A19(A18, 0))), Integer.valueOf(Integer.parseInt(AnonymousClass7TE.A19(A18, 1))), A0r);
        }
        return 0Yt.A03(0Yt.A08(A0r));
    }

    public static boolean A04(C67458MoD moD) {
        return AnonymousClass65A.A02(((AnonymousClass65E) moD.A02.getValue()).A00, 36315949944999660L);
    }

    public final void A09(long j) {
        0xY AR4 = this.A00.AR4();
        AR4.E5c("EB_CUTOVER_TIMESTAMP_MS", j);
        AR4.apply();
    }

    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return "EB_INTRODUCE_BANNER_INTERVAL_IMPRESSIONS";
        }
        if (intValue == 3) {
            return "EB_SELL_BANNER_INTERVAL_IMPRESSIONS";
        }
        if (intValue == 4) {
            return "EB_WARN_BANNER_INTERVAL_IMPRESSIONS";
        }
        if (intValue == 7) {
            return "MEX_EB_LOW_DISK_SPACE_BANNER_INTERVAL_IMPRESSION";
        }
        if (intValue != 6) {
            return null;
        }
        return "MEX_EBUPSELL_BANNER_INTERVAL_IMPRESSIONS";
    }

    public static final Set A02(String str) {
        List A0x = DbX.A0x(str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            Integer A0l = 00y.A0l(AnonymousClass7TE.A18(it));
            if (A0l != null) {
                A1C.add(A0l);
            }
        }
        return 00k.A0k(A1C);
    }

    public static void A03(C67458MoD moD, Integer num, Number number) {
        moD.A08(number.intValue(), num);
    }

    public final long A05() {
        boolean z;
        Integer A06;
        if (!A04(this)) {
            z = false;
        } else {
            z = this.A00.getBoolean("EB_SHOULD_OVERRIDE_CUTOVER_TIMESTAMP", false);
        }
        if (!z || (A06 = A06()) == null) {
            return this.A00.getLong("EB_CUTOVER_TIMESTAMP_MS", 0);
        }
        return System.currentTimeMillis() - (((long) A06.intValue()) * 86400000);
    }

    @Deprecated(message = "INTERNAL DEBUG TOOLS, SHOULD NOT BE USED")
    public final Integer A06() {
        int i;
        if (!A04(this) || (i = this.A00.getInt("EB_CUTOVER_TIMESTAMP_OVERRIDE_MS", 99999)) == 99999) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public final void A07(int i, Integer num) {
        String A002 = A00(num);
        LinkedHashMap A012 = A01(A002);
        Integer valueOf = Integer.valueOf(i);
        Number number = (Number) A012.getOrDefault(valueOf, (Object) null);
        int i2 = 1;
        if (number != null) {
            i2 = number.intValue() + 1;
        }
        C66580MXl.A1T(valueOf, A012, i2);
        0xY AR4 = this.A00.AR4();
        AR4.E5g(A002, DbT.A0z(",", A012.entrySet(), C74036Po1.A00));
        AR4.apply();
    }

    public final void A08(int i, Integer num) {
        String A002 = A00(num);
        LinkedHashMap A012 = A01(A002);
        C66580MXl.A1T(Integer.valueOf(i), A012, 2);
        0xY AR4 = this.A00.AR4();
        AR4.E5g(A002, DbT.A0z(",", A012.entrySet(), C74036Po1.A00));
        AR4.apply();
    }

    public final boolean A0A(Integer num, int i) {
        Number number = (Number) A01(A00(num)).getOrDefault(Integer.valueOf(i), (Object) null);
        if (number == null || number.intValue() < DbX.A07(this.A01)) {
            return false;
        }
        return true;
    }
}
