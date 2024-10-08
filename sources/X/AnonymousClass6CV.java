package X;

import android.graphics.Color;
import com.instagram.common.session.UserSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6CV  reason: invalid class name */
public final class AnonymousClass6CV {
    public List A00;
    public List A01;
    public 11S A02;
    public Date A03;
    public Date A04;
    public final UserSession A05;

    public static final List A00(List list) {
        try {
            ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AnonymousClass5RW(((long) Color.parseColor((String) it.next())) << 32));
            }
            return arrayList;
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final boolean A01() {
        Date date;
        Date date2;
        UserSession userSession = this.A05;
        0Tu r4 = 0Tu.A05;
        if (!182.A06(r4, userSession, 36322581372086553L)) {
            return false;
        }
        if (this.A04 == null || (date = this.A03) == null) {
            String A042 = 182.A04(r4, userSession, 36885531325629041L);
            String A043 = 182.A04(r4, userSession, 36885531325694578L);
            try {
                date2 = C49271EsE.A00.parse(A042);
            } catch (ParseException unused) {
                date2 = null;
            }
            this.A04 = date2;
            try {
                date = C49271EsE.A00.parse(A043);
            } catch (ParseException unused2) {
                date = null;
            }
            this.A03 = date;
        }
        Date date3 = this.A04;
        if (date3 == null || date == null) {
            return false;
        }
        Date date4 = new Date();
        if (date3.compareTo(date4) > 0 || date4.compareTo(date) >= 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass6CV(UserSession userSession) {
        this.A05 = userSession;
    }
}
