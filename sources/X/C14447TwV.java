package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TwV  reason: case insensitive filesystem */
public final class C14447TwV {
    public C14449TwX A00;
    public final Context A01;
    public final UserSession A02;
    public final C14440TwO A03;
    public final AnonymousClass0eM A04 = C13998To0.A01(this, 5);
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public static final void A00(C14487Tx9 tx9, C14447TwV twV) {
        C16192UqH uqH;
        C21020X9y x9y;
        C14199Tre.A00(tx9, new C61069Jw7((C266444Yx) new GKO(new Object[0], 2131953204), (Integer) null, AnonymousClass05K.A1I));
        C59821JZv A002 = C14421Tvq.A00(twV.A02);
        if (!AnonymousClass9B2.A03 || !AnonymousClass9B2.A02 || (x9y = (C21020X9y) A002.A04.getValue()) == null) {
            UserSession userSession = A002.A03;
            0qQ.A0B(userSession, 0);
            int A012 = (int) 182.A01(0Tu.A05, userSession, 36609519547455348L);
            0sn r0 = 0sn.A00;
            boolean A1Z = C66581MXm.A1Z(r0);
            ArrayList A0r = AnonymousClass7TG.A0r(r0);
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                JTT.A1U(A0r, it);
            }
            uqH = new C16192UqH(new N5H(A0r, A1Z ? 1 : 0, A012, A1Z));
        } else {
            uqH = new C16192UqH(x9y);
        }
        tx9.A05(AnonymousClass05K.A00, uqH, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (X.C14442TwQ.A00.A00(r4) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14447TwV(com.instagram.common.session.UserSession r4, android.content.Context r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A02 = r4
            r3.A01 = r5
            X.TwM r0 = X.C14439TwN.A00(r4)
            int r1 = r0.A00()
            X.TwO r0 = new X.TwO
            r0.<init>(r4, r1)
            r3.A03 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36310619888484549(0x810051000700c5, double:3.0263204563836424E-306)
            X.182.A06(r2, r4, r0)
            r0 = 36592094865654039(0x820051000e0117, double:3.204326365354387E-306)
            X.182.A01(r2, r4, r0)
            r0 = 5
            X.0t0 r0 = X.C13998To0.A01(r3, r0)
            r3.A04 = r0
            boolean r0 = X.C13988Tno.A1Y(r4)
            if (r0 == 0) goto L_0x003e
            X.TwQ r0 = X.C14442TwQ.A00
            boolean r1 = r0.A00(r4)
            r0 = 1
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r3.A05 = r0
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 36328044570360710(0x81102a00003b86, double:3.037339895365689E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r3.A06 = r0
            r0 = 36328044570950541(0x81102a00093b8d, double:3.0373398957387E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r3.A07 = r0
            r0 = 36331033867731836(0x8112e20002437c, double:3.039230339060123E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0080
            r0 = 36310619888419012(0x810051000600c4, double:3.0263204563421965E-306)
            X.182.A06(r2, r4, r0)
            X.5l9 r1 = X.C293655l8.A00(r4)
            X.TwM r0 = X.C14439TwN.A00(r4)
            r0.A00()
            X.TwX r0 = new X.TwX
            r0.<init>(r1)
            r3.A00 = r0
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14447TwV.<init>(com.instagram.common.session.UserSession, android.content.Context):void");
    }

    public final int A01(C14207Trm trm, String str, String str2) {
        01N A1H = 0jo.A1H();
        A1H.addAll(this.A03.A00(str));
        01N A1I = 0jo.A1I(A1H);
        ArrayList arrayList = new ArrayList();
        Iterator it = A1I.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            DbV.A1U(next, arrayList, next instanceof C67387Mn4 ? 1 : 0);
        }
        trm.A06(arrayList, str2);
        return arrayList.size();
    }
}
