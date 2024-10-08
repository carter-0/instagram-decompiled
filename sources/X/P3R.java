package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class P3R implements C74548Pwh {
    public String A00;
    public final 0xa A01;
    public final Set A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public final int BmD(String str) {
        if (str == null) {
            return 0;
        }
        ConcurrentHashMap concurrentHashMap = this.A03;
        if (concurrentHashMap.containsKey(str)) {
            return C51967G9n.A04(JTO.A0z(str, concurrentHashMap), 0);
        }
        0xa r2 = this.A01;
        if (!r2.contains(002.A0R("inbox_visual_message_reply_button_impression", str))) {
            return 0;
        }
        int i = r2.getInt(002.A0R("inbox_visual_message_reply_button_impression", str), 0);
        C66581MXm.A1S(str, concurrentHashMap, i);
        return i;
    }

    public final void AAR(String str) {
        if (str != null && !CdA(str)) {
            this.A03.put(str, 0);
            0xY AR4 = this.A01.AR4();
            AR4.E5Z(002.A0R("inbox_visual_message_reply_button_impression", str), 0);
            AR4.apply();
        }
    }

    public final String BGi() {
        return this.A00;
    }

    public final boolean CdA(String str) {
        if (str == null) {
            return false;
        }
        if (this.A03.containsKey(str) || this.A01.contains(002.A0R("inbox_visual_message_reply_button_impression", str))) {
            return true;
        }
        return false;
    }

    public final boolean Cnr(String str, String str2) {
        if (str == null) {
            return false;
        }
        Set set = this.A02;
        if (set.contains(str) || !CdA(str)) {
            return false;
        }
        int BmD = BmD(str) + 1;
        if (BmD > 3) {
            EDg(str);
            return true;
        }
        set.add(str);
        this.A03.put(str, Integer.valueOf(BmD));
        0xY AR4 = this.A01.AR4();
        AR4.E5Z(002.A0R("inbox_visual_message_reply_button_impression", str), BmD);
        AR4.apply();
        return true;
    }

    public final void EDg(String str) {
        if (str != null) {
            this.A03.remove(str);
            0xY AR4 = this.A01.AR4();
            AR4.ED3(002.A0R("inbox_visual_message_reply_button_impression", str));
            AR4.apply();
            this.A02.remove(str);
        }
    }

    public final void EZm(String str) {
        this.A02.clear();
        this.A00 = str;
    }

    public /* synthetic */ P3R(UserSession userSession) {
        0xa A04 = 1Al.A01(userSession).A04(1An.A3V, 1Av.class);
        0qQ.A0B(A04, 2);
        this.A01 = A04;
        Set synchronizedSet = Collections.synchronizedSet(AnonymousClass7TE.A1F());
        0qQ.A07(synchronizedSet);
        this.A02 = synchronizedSet;
    }
}
