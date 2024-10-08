package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6rP  reason: invalid class name and case insensitive filesystem */
public final class C319896rP {
    public boolean A00;
    public final List A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3.A0x(r7) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.model.reels.Reel A01(com.instagram.common.session.UserSession r7) {
        /*
            r6 = this;
            r1 = 0
            r5 = 0
            boolean r0 = r6.A05(r7)
            if (r0 != 0) goto L_0x0015
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x001e
            boolean r0 = r6.A04()
            X.17k.A0F(r0)
        L_0x0015:
            java.util.List r0 = r6.A01
            java.lang.Object r2 = r0.get(r1)
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            return r2
        L_0x001e:
            java.util.ArrayList r0 = r6.A02(r7)
            java.util.Iterator r4 = r0.iterator()
        L_0x0026:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r3 = r4.next()
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            boolean r0 = r3.A15(r7)
            r0 = r0 ^ 1
            X.17k.A0F(r0)
            boolean r0 = r3.A0d()
            r0 = r0 ^ 1
            X.17k.A0F(r0)
            r3.A16(r7)
            r2 = 0
            if (r1 != 0) goto L_0x0051
            boolean r0 = r3.A0x(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0052
        L_0x0051:
            r1 = 1
        L_0x0052:
            if (r5 != 0) goto L_0x005a
            boolean r0 = r3.A11(r7)
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r2 = 1
        L_0x005b:
            r5 = r2
            goto L_0x0026
        L_0x005d:
            java.util.List r0 = r6.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0063:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r2 = r1.next()
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            boolean r0 = r2.A0d()
            if (r0 != 0) goto L_0x0063
        L_0x0075:
            r2.getClass()
            return r2
        L_0x0079:
            r2 = 0
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C319896rP.A01(com.instagram.common.session.UserSession):com.instagram.model.reels.Reel");
    }

    public final Reel A00() {
        List<Reel> list = this.A01;
        for (Reel reel : list) {
            if (!reel.A0d()) {
                return reel;
            }
        }
        Reel reel2 = (Reel) list.get(0);
        reel2.getClass();
        return reel2;
    }

    public final ArrayList A02(UserSession userSession) {
        ArrayList arrayList = new ArrayList();
        for (Reel reel : this.A01) {
            if (!reel.A15(userSession)) {
                arrayList.add(reel);
            }
        }
        return arrayList;
    }

    public final boolean A04() {
        List list = this.A01;
        if (list.size() != 1 || !((Reel) list.get(0)).A0d()) {
            return false;
        }
        return true;
    }

    public final boolean A05(UserSession userSession) {
        for (Reel A15 : this.A01) {
            if (!A15.A15(userSession)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + (this.A00 ? 1 : 0);
    }

    public C319896rP(List list) {
        boolean z = true;
        17k.A0E(!list.isEmpty());
        this.A01 = list;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Reel) it.next()).A0d()) {
                i++;
            }
        }
        if (list.size() > 1) {
            17k.A0F(i != 0 ? false : z);
        }
    }

    public final Set A03() {
        if (!A04()) {
            return new HashSet();
        }
        17k.A0F(A04());
        C270194gL r0 = ((Reel) this.A01.get(0)).A0H;
        r0.getClass();
        return r0.A06();
    }
}
