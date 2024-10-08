package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2vV  reason: invalid class name and case insensitive filesystem */
public final class C233312vV {
    public int A00;
    public int A01 = -1;
    public int A02;
    public AnonymousClass3W1 A03;
    public C233812wV A04;
    public Integer A05;
    public Integer A06;
    public List A07;
    public List A08;
    public boolean A09;
    public final UserSession A0A;
    public final AnonymousClass2rI A0B;

    public final String A02(Integer num, List list, List list2) {
        int i;
        List subList;
        List subList2;
        1UQ r1;
        if (list2.isEmpty()) {
            return "EMPTY_EAGER_RESPONSE";
        }
        List list3 = this.A07;
        if (list3 == null || (i = this.A00) > list3.size() || (subList = list3.subList(0, i)) == null) {
            return "FEED_ITEMS_HAVE_CHANGED";
        }
        int i2 = this.A01;
        if (i2 != -1) {
            1Xg r0 = (1Xg) 00k.A0O(list, i2 + 1);
            if (r0 != null) {
                r1 = r0.A06;
            } else {
                r1 = null;
            }
            if (r1 == 1UQ.A0T) {
                if (182.A06(0Tu.A06, this.A0A, 36323281452149807L)) {
                    ArrayList arrayList = new ArrayList(list);
                    list = arrayList;
                    arrayList.remove(this.A01 + 1);
                    this.A09 = true;
                }
            }
        }
        int i3 = this.A00;
        if (i3 > list.size()) {
            subList2 = null;
        } else {
            subList2 = list.subList(0, i3);
        }
        if (!subList.equals(subList2)) {
            return "FEED_ITEMS_HAVE_CHANGED";
        }
        if (num == null) {
            return null;
        }
        if (num.intValue() > this.A01 + ((int) 182.A01(0Tu.A05, this.A0A, 36604756428461155L))) {
            return "MAX_UNSEEN_INDEX_CHANGED";
        }
        return null;
    }

    public static final boolean A00(1FS r2) {
        Map map = r2.A0D;
        if (!map.containsKey("is_feed_eager_refresh") || !0qQ.A0K(map.get("is_feed_eager_refresh"), "true")) {
            return false;
        }
        return true;
    }

    public final String A01() {
        String str;
        List<1Xj> list = this.A08;
        if (list != null) {
            ArrayList<String> arrayList = new ArrayList<>(0Yv.A1E(list, 10));
            for (1Xj r0 : list) {
                if (r0 != null) {
                    str = r0.getId();
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
            try {
                StringWriter stringWriter = new StringWriter();
                17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                A0A2.A0b();
                for (String str2 : arrayList) {
                    if (str2 != null) {
                        A0A2.A0t(str2);
                    }
                }
                A0A2.A0Y();
                A0A2.close();
                return stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public C233312vV(UserSession userSession, AnonymousClass2rI r4) {
        this.A0A = userSession;
        this.A0B = r4;
        Integer num = AnonymousClass05K.A00;
        this.A06 = num;
        this.A05 = num;
        this.A00 = -1;
    }
}
