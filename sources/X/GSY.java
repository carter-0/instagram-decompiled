package X;

import com.instagram.api.schemas.BillingWizardName;
import com.instagram.api.schemas.TemplatesBrowserSectionSize;
import com.instagram.api.schemas.UndoStyle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GSY extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public final Reel A03(UserSession userSession) {
        Object obj;
        0qQ.A0B(userSession, 0);
        Iterator it = A04(userSession).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((Reel) obj).A16(userSession)) {
                break;
            }
        }
        Reel reel = (Reel) obj;
        if (reel == null) {
            return (Reel) A04(userSession).get(0);
        }
        return reel;
    }

    public final ArrayList A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        List<AnonymousClass3HX> list = (List) this.A01;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (AnonymousClass3HX A0I : list) {
            1OP r0 = 1OP.$redex_init_class;
            ReelStore A032 = ReelStore.A03(userSession);
            0qQ.A07(A032);
            A0r.add(A032.A0I(A0I, false));
        }
        return A0r;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof GSY) || ((GSY) obj).A04 != i) {
            return false;
        }
        return true;
    }

    public static boolean A01(GSY gsy, GSY gsy2) {
        return 0qQ.A0K(gsy.A03, gsy2.A03);
    }

    public static boolean A02(GSY gsy, GSY gsy2) {
        return 0qQ.A0K(gsy.A02, gsy2.A02);
    }

    public final Map A05() {
        LinkedHashMap linkedHashMap;
        Map map = (Map) this.A00;
        if (map != null) {
            return map;
        }
        String str = this.A03;
        0qQ.A0B(str, 0);
        if (!00l.A0d(str, "root", false)) {
            linkedHashMap = DbS.A0x(AnonymousClass7TG.A01(r3));
            for (Object obj : 00l.A0R(str, new String[]{","}, 0).toArray(new String[0])) {
                List A18 = DbV.A18((String) obj, ":");
                linkedHashMap.put(DbV.A12(AnonymousClass7TE.A19(A18, 0)), DbV.A12(AnonymousClass7TE.A19(A18, 1)));
            }
        } else {
            linkedHashMap = DbS.A0x(AnonymousClass7TG.A01(r4));
            for (Object obj2 : 00l.A0R(str, new String[]{","}, 0).toArray(new String[0])) {
                String str2 = (String) obj2;
                int A08 = 00l.A08(str2, ":", 0, false);
                linkedHashMap.put(DbV.A12(C51967G9n.A0q(str2, 0, A08)), DbV.A12(C51967G9n.A0q(str2, A08 + 1, str2.length())));
            }
        }
        TreeMap treeMap = new TreeMap(linkedHashMap);
        this.A00 = treeMap;
        return treeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0233, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0237, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x025c, code lost:
        r0 = X.0qQ.A0K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0260, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0262, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x026a, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x028a, code lost:
        r0 = X.0qQ.A0K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x028e, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0294, code lost:
        if (r2.A01 == r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00aa, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d1, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011b, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011d, code lost:
        r3 = (X.GSY) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0123, code lost:
        if (A02(r2, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0129, code lost:
        if (A01(r2, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x012b, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0150, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0152, code lost:
        r3 = (X.GSY) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0158, code lost:
        if (A02(r2, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x015a, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0162, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016c, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x003e;
                case 2: goto L_0x008a;
                case 3: goto L_0x00ae;
                case 4: goto L_0x00d7;
                case 5: goto L_0x00db;
                case 6: goto L_0x00df;
                case 7: goto L_0x00f6;
                case 8: goto L_0x0113;
                case 9: goto L_0x0131;
                case 10: goto L_0x0148;
                case 11: goto L_0x0170;
                case 12: goto L_0x018e;
                case 13: goto L_0x0065;
                case 14: goto L_0x01b0;
                case 15: goto L_0x01d2;
                case 16: goto L_0x023c;
                case 17: goto L_0x01ef;
                case 18: goto L_0x020f;
                case 19: goto L_0x026e;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0298
            r0 = 20
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x001f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00a2
        L_0x0025:
            r0 = 0
            return r0
        L_0x0027:
            if (r2 == r3) goto L_0x0298
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            goto L_0x0260
        L_0x003e:
            if (r2 == r3) goto L_0x0298
            r0 = 1
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x0266
        L_0x0065:
            if (r2 == r3) goto L_0x0298
            r0 = 13
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00a6
        L_0x008a:
            if (r2 == r3) goto L_0x0298
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x00a2
            goto L_0x0025
        L_0x00a2:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x00a6:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00d1
            goto L_0x0025
        L_0x00ae:
            if (r2 == r3) goto L_0x0298
            r0 = 3
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x00d1
            goto L_0x0025
        L_0x00d1:
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            goto L_0x0266
        L_0x00d7:
            if (r2 == r3) goto L_0x0298
            r0 = 4
            goto L_0x0117
        L_0x00db:
            if (r2 == r3) goto L_0x0298
            r0 = 5
            goto L_0x014c
        L_0x00df:
            if (r2 == r3) goto L_0x0298
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x001f
        L_0x00f6:
            if (r2 == r3) goto L_0x0298
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x028a
        L_0x0113:
            if (r2 == r3) goto L_0x0298
            r0 = 8
        L_0x0117:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x025c
        L_0x0131:
            if (r2 == r3) goto L_0x0298
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x015e
        L_0x0148:
            if (r2 == r3) goto L_0x0298
            r0 = 10
        L_0x014c:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x015e:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0237
            goto L_0x0025
        L_0x0170:
            if (r2 == r3) goto L_0x0298
            r0 = 11
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            goto L_0x028e
        L_0x018e:
            if (r2 == r3) goto L_0x0298
            r0 = 12
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x022f
        L_0x01b0:
            if (r2 == r3) goto L_0x0298
            r0 = 14
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            goto L_0x028e
        L_0x01d2:
            if (r2 == r3) goto L_0x0298
            r0 = 15
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x022f
        L_0x01ef:
            if (r2 == r3) goto L_0x0298
            r0 = 17
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0237
            goto L_0x0025
        L_0x020f:
            if (r2 == r3) goto L_0x0298
            r0 = 18
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
        L_0x022f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0237
            goto L_0x0025
        L_0x0237:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0266
        L_0x023c:
            if (r2 == r3) goto L_0x0298
            r0 = 16
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x025c:
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x0260:
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0266:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0298
            goto L_0x0025
        L_0x026e:
            if (r2 == r3) goto L_0x0298
            r0 = 19
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0025
            X.GSY r3 = (X.GSY) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x0025
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x028a:
            boolean r0 = X.0qQ.A0K(r1, r0)
        L_0x028e:
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0298
            goto L_0x0025
        L_0x0298:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSY.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d2, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0109, code lost:
        r3 = (r1 + r0) * 31;
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r1 = (r1 + r0) * 31;
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        if (r0 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x025d, code lost:
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x025f, code lost:
        if (r0 != null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0261, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x027b, code lost:
        r3 = (r1 + r0) * 31;
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0280, code lost:
        r2 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r2 = (r1 + r0) * 31;
        r0 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r3 = X.C41845B3m.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        return r3 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = r4.A04
            switch(r0) {
                case 0: goto L_0x0251;
                case 1: goto L_0x0233;
                case 2: goto L_0x0225;
                case 3: goto L_0x0209;
                case 4: goto L_0x01e9;
                case 5: goto L_0x0264;
                case 6: goto L_0x01ca;
                case 7: goto L_0x016f;
                case 8: goto L_0x015b;
                case 9: goto L_0x0139;
                case 10: goto L_0x0119;
                case 11: goto L_0x00ec;
                case 12: goto L_0x00d5;
                case 13: goto L_0x00ba;
                case 14: goto L_0x0064;
                case 15: goto L_0x00a6;
                case 16: goto L_0x0090;
                case 17: goto L_0x007a;
                case 18: goto L_0x0048;
                case 19: goto L_0x0029;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r4.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
        L_0x0013:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A01
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.hashCode()
        L_0x001e:
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r4.A03
        L_0x0023:
            int r3 = X.C41845B3m.A00(r0)
        L_0x0027:
            int r3 = r3 + r2
            return r3
        L_0x0029:
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r4.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r4.A00
            int r3 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r1 = r4.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r0 = X.C55109HcI.A00(r1)
            int r2 = X.C51971G9r.A0D(r1, r0)
            goto L_0x0027
        L_0x0048:
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r4.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r4.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0027
        L_0x0064:
            java.lang.String r0 = r4.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r4.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r4.A00
            int r0 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0109
        L_0x007a:
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r4.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r4.A00
            goto L_0x025f
        L_0x0090:
            java.lang.Object r0 = r4.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r4.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A02
            int r0 = X.C41845B3m.A00(r0)
            goto L_0x0109
        L_0x00a6:
            java.lang.String r0 = r4.A03
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r4.A01
            int r0 = r0.hashCode()
            goto L_0x027b
        L_0x00ba:
            java.lang.Object r0 = r4.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r4.A01
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.hashCode()
            goto L_0x001e
        L_0x00d2:
            r0 = 0
            goto L_0x001e
        L_0x00d5:
            java.lang.String r0 = r4.A03
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r4.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A02
            int r0 = r0.hashCode()
            goto L_0x027b
        L_0x00ec:
            java.lang.String r0 = r4.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r2 = r0 * 31
            java.lang.Object r0 = r4.A00
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x0110;
                case 2: goto L_0x0113;
                case 3: goto L_0x0116;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            java.lang.String r0 = "CIRCLE_CHECKMARK_OUTLINE"
        L_0x00ff:
            int r1 = X.C51971G9r.A0F(r0, r1, r2)
            java.lang.String r0 = r4.A03
            int r0 = X.C41845B3m.A00(r0)
        L_0x0109:
            int r1 = r1 + r0
            int r3 = r1 * 31
            java.lang.Object r0 = r4.A01
            goto L_0x0280
        L_0x0110:
            java.lang.String r0 = "CHECKMARK"
            goto L_0x00ff
        L_0x0113:
            java.lang.String r0 = "HIDDEN"
            goto L_0x00ff
        L_0x0116:
            java.lang.String r0 = "NONE"
            goto L_0x00ff
        L_0x0119:
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r4.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0027
        L_0x0139:
            java.lang.String r0 = r4.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r4.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0027
        L_0x015b:
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r4.A03
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r4.A00
            int r3 = X.AnonymousClass7TF.A07(r0, r1)
            goto L_0x025d
        L_0x016f:
            java.lang.Object r0 = r4.A00
            java.lang.Number r0 = (java.lang.Number) r0
            r3 = 0
            if (r0 != 0) goto L_0x01b0
            r0 = 0
        L_0x0177:
            int r1 = r0 * 31
            java.lang.String r0 = r4.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r4.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0027
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L_0x01a0;
                case 2: goto L_0x01a7;
                case 3: goto L_0x01aa;
                case 4: goto L_0x01ad;
                default: goto L_0x0198;
            }
        L_0x0198:
            java.lang.String r0 = "RECENT"
        L_0x019a:
            int r3 = X.C51966G9m.A04(r0, r1)
            goto L_0x0027
        L_0x01a0:
            r0 = 2264(0x8d8, float:3.173E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x019a
        L_0x01a7:
            java.lang.String r0 = "YOUR_STICKER"
            goto L_0x019a
        L_0x01aa:
            java.lang.String r0 = "CREATE_STICKER"
            goto L_0x019a
        L_0x01ad:
            java.lang.String r0 = "GIPHY"
            goto L_0x019a
        L_0x01b0:
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L_0x01be;
                case 2: goto L_0x01c1;
                case 3: goto L_0x01c4;
                case 4: goto L_0x01c7;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            java.lang.String r0 = "TAB_SWITCH"
        L_0x01b9:
            int r0 = X.C51966G9m.A04(r0, r1)
            goto L_0x0177
        L_0x01be:
            java.lang.String r0 = "TAP_HSCROLL"
            goto L_0x01b9
        L_0x01c1:
            java.lang.String r0 = "SEE_MORE"
            goto L_0x01b9
        L_0x01c4:
            java.lang.String r0 = "EDIT_AVATAR"
            goto L_0x01b9
        L_0x01c7:
            java.lang.String r0 = "CREATE_STICKER"
            goto L_0x01b9
        L_0x01ca:
            java.lang.String r0 = r4.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r4.A00
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r4.A03
            int r2 = r0.hashCode()
            goto L_0x0027
        L_0x01e9:
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r4.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r4.A01
            int r3 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0027
        L_0x0209:
            java.lang.Object r0 = r4.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r4.A03
            int r2 = r0.hashCode()
            goto L_0x0027
        L_0x0225:
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r4.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            goto L_0x0013
        L_0x0233:
            java.lang.Object r0 = r4.A01
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r4.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.String r0 = r4.A02
            goto L_0x0023
        L_0x0251:
            java.lang.String r0 = r4.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r4.A03
            int r3 = X.AnonymousClass7TF.A08(r0, r1)
        L_0x025d:
            java.lang.Object r0 = r4.A01
        L_0x025f:
            if (r0 != 0) goto L_0x0280
            r2 = 0
            goto L_0x0027
        L_0x0264:
            java.lang.String r0 = r4.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r4.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r4.A01
            int r0 = X.AnonymousClass7TE.A0L(r0)
        L_0x027b:
            int r1 = r1 + r0
            int r3 = r1 * 31
            java.lang.Object r0 = r4.A00
        L_0x0280:
            int r2 = r0.hashCode()
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSY.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        switch (this.A04) {
            case 5:
                sb = AnonymousClass7TE.A1A();
                sb.append("UiState(firstFrameImagePath=");
                sb.append(this.A02);
                sb.append(", previewImagePath=");
                sb.append(this.A03);
                sb.append(", selectedItem=");
                sb.append(this.A01);
                sb.append(AnonymousClass000.A00(2028));
                sb.append(this.A00);
                break;
            case 19:
                sb = AnonymousClass7TE.A1A();
                sb.append("RtcCallParticipantState(displayName=");
                sb.append(this.A02);
                sb.append(", userId=");
                sb.append(this.A03);
                sb.append(C66579MXk.A00(422));
                sb.append(this.A00);
                sb.append(", state=");
                Integer num = (Integer) this.A01;
                if (num != null) {
                    str = C55109HcI.A00(num);
                } else {
                    str = "null";
                }
                sb.append(str);
                break;
            default:
                return super.toString();
        }
        return AnonymousClass7TG.A0p(sb);
    }

    public GSY(C17653Vbj vbj, String str, String str2) {
        this.A04 = 0;
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = vbj;
        if (00l.A0W(str2)) {
            throw AnonymousClass7TE.A0w("invalid config");
        }
    }

    public GSY(JRV jrv, BillingWizardName billingWizardName, String str, String str2) {
        this.A04 = 2;
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A00 = billingWizardName;
        this.A01 = jrv;
        this.A03 = str2;
    }

    public GSY(N49 n49, Integer num, String str, String str2) {
        this.A04 = 6;
        C51972G9s.A1D(n49, str2);
        this.A02 = str;
        this.A00 = num;
        this.A01 = n49;
        this.A03 = str2;
    }

    public GSY(ImageUrl imageUrl, Integer num, String str, String str2, int i) {
        this.A04 = i;
        if (10 - i != 0) {
            C51974G9v.A1P(str, str2, imageUrl, num);
            this.A02 = str;
            this.A03 = str2;
            this.A00 = imageUrl;
            this.A01 = num;
            return;
        }
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = imageUrl;
        this.A00 = num;
    }

    public GSY(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str, String str2, List list) {
        this.A04 = 12;
        AnonymousClass7TG.A0w(1, str, str2, list);
        this.A03 = str;
        this.A01 = leadGenFormBaseQuestion;
        this.A02 = str2;
        this.A00 = list;
    }

    public GSY(Float f, Float f2, String str, String str2) {
        this.A04 = 4;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = f;
        this.A01 = f2;
    }

    public GSY(C381879cj r2, String str, String str2, AnonymousClass62O r5) {
        this.A04 = 5;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r2;
        this.A00 = r5;
    }

    public GSY(UndoStyle undoStyle, Integer num, String str, String str2) {
        this.A04 = 11;
        this.A02 = str;
        this.A00 = num;
        this.A03 = str2;
        this.A01 = undoStyle;
    }

    public GSY(ImageUrl imageUrl, String str, String str2, List list) {
        this.A04 = 15;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = imageUrl;
        this.A00 = list;
    }

    public GSY(String str, String str2, List list, List list2) {
        this.A04 = 18;
        AnonymousClass7TG.A1O(str, list);
        this.A02 = str;
        this.A01 = list;
        this.A03 = str2;
        this.A00 = list2;
    }

    public GSY(C53401GnY gnY, String str, String str2, List list) {
        this.A04 = 13;
        0qQ.A0B(list, 2);
        this.A00 = gnY;
        this.A01 = list;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GSY(C381879cj r3, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, AnonymousClass62O r7, int i, int i2) {
        this((C381879cj) null, (String) null, (String) null, (AnonymousClass62O) AnonymousClass62M.A01);
        this.A04 = 5;
    }

    public GSY(C276114sa r3, TemplatesBrowserSectionSize templatesBrowserSectionSize, String str, String str2) {
        this.A04 = 3;
        0qQ.A0B(str, 2);
        AnonymousClass7TF.A1D(templatesBrowserSectionSize, 3, str2);
        this.A00 = r3;
        this.A02 = str;
        this.A01 = templatesBrowserSectionSize;
        this.A03 = str2;
    }

    public GSY(2EG r3, String str, C62320sa r5) {
        String A002 = AnonymousClass000.A00(630);
        this.A04 = 17;
        this.A02 = str;
        this.A03 = A002;
        this.A01 = r3;
        this.A00 = r5;
    }

    public GSY(LeadGenInfoFieldTypes leadGenInfoFieldTypes, String str, List list) {
        this.A04 = 14;
        C51972G9s.A1C(str, leadGenInfoFieldTypes);
        this.A02 = null;
        this.A03 = str;
        this.A00 = list;
        this.A01 = leadGenInfoFieldTypes;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GSY() {
        this((Object) null, (Object) null, (String) null, (String) null, 9);
        this.A04 = 9;
        this.A04 = 9;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GSY(Boolean bool, Integer num, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, (Object) null, (String) null, (String) null, 20);
        this.A04 = 20;
    }

    public GSY(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A03 = str;
        this.A02 = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GSY(java.lang.Integer r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r3 = r10
            r6 = r12
            r7 = 7
            r2 = r8
            r8.A04 = r7
            r0 = r13 & 4
            r1 = 0
            if (r0 == 0) goto L_0x000c
            r6 = r1
        L_0x000c:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x0011
            r3 = r1
        L_0x0011:
            r4 = r9
            r5 = r11
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSY.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }
}
