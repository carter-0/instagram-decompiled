package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6cM  reason: invalid class name and case insensitive filesystem */
public final class C311236cM implements C250603lj {
    public int A00 = 1;
    public String A01;
    public String A02;
    public final UserSession A03;
    public final Map A04 = new HashMap();

    public C311236cM(UserSession userSession) {
        this.A03 = userSession;
    }

    public final int A00(C255773uh r7) {
        0qQ.A0B(r7, 0);
        String str = r7.A0k;
        0qQ.A07(str);
        Map map = this.A04;
        if (!map.containsKey(str)) {
            0f9 AEf = 0wj.A01.AEf("DISPLAYED_REEL_INDEX_MISMATCH", 817903741);
            StringBuilder sb = new StringBuilder();
            sb.append("displayed_reel_index_mismatch. Could not find displayed index of (");
            sb.append(str);
            sb.append(") does not match known reels (");
            sb.append(map.keySet());
            sb.append(") which has values of ( ");
            sb.append(map.values());
            sb.append(')');
            AEf.ABQ(DialogModule.KEY_MESSAGE, sb.toString());
            AEf.report();
        } else {
            Number number = (Number) map.get(str);
            if (number != null) {
                return number.intValue();
            }
        }
        return -1;
    }

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        String str;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        String str2 = ((C255773uh) r5.A03).A0k;
        0qQ.A07(str2);
        Integer CEk = r6.CEk(r5);
        0qQ.A07(CEk);
        if (CEk == AnonymousClass05K.A00 && (!0mp.A0G(this.A01, str2) || 0mp.A0G(r5.A05, this.A02))) {
            Map map = this.A04;
            int i = this.A00;
            this.A00 = i + 1;
            map.put(str2, Integer.valueOf(i));
            this.A01 = str2;
            str = "";
        } else if (CEk == AnonymousClass05K.A0C) {
            str = r5.A05;
        } else {
            return;
        }
        this.A02 = str;
    }
}
