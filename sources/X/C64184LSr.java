package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.LSr  reason: case insensitive filesystem */
public final class C64184LSr {
    public C63830L8l A00;
    public String A01 = "";
    public String A02;
    public C63830L8l A03;
    public String A04;
    public final Map A05;
    public final Set A06;
    public final SortedMap A07;
    public final UserSession A08;
    public final Map A09;

    public static C64184LSr A00(UserSession userSession) {
        return (C64184LSr) userSession.A01(C64184LSr.class, new MBI(userSession, 0));
    }

    public static C63830L8l A01(Reel reel) {
        RectF rectF;
        Rect A012;
        C239693Hq r6 = reel.A0L;
        r6.getClass();
        C294065ln r0 = r6.A01;
        if (r0 == null) {
            r0 = r6.A00;
        }
        SimpleImageUrl A002 = C320276s7.A00(r0);
        List list = r6.A04;
        if (list == null) {
            rectF = null;
        } else {
            rectF = new RectF(AnonymousClass7TG.A00(list, 0), AnonymousClass7TG.A00(list, 1), AnonymousClass7TG.A00(list, 2), AnonymousClass7TG.A00(list, 3));
        }
        int i = A002.A01;
        int i2 = A002.A00;
        if (rectF != null) {
            A012 = JW0.A06(rectF, i, i2, 1, 1);
        } else {
            A012 = JW0.A01(i, i2);
        }
        return new C63830L8l(A012, A002, r6.A02, (String) null);
    }

    public static List A02(C63830L8l l8l) {
        Rect rect = l8l.A00;
        ImageUrl imageUrl = l8l.A02;
        RectF A082 = JW0.A08(rect, imageUrl.getWidth(), imageUrl.getHeight());
        return Arrays.asList(JTU.A1b(A082, Float.valueOf(A082.left)));
    }

    public static synchronized void A03(UserSession userSession) {
        Class<C64184LSr> cls = C64184LSr.class;
        synchronized (cls) {
            userSession.A03(cls);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (X.2PP.A00(r2.A04, r3.A04) == false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C63829L8k A04() {
        /*
            r6 = this;
            X.L8k r4 = new X.L8k
            r4.<init>()
            java.util.Map r5 = r6.A05
            java.util.Iterator r3 = X.AnonymousClass7TF.A0v(r5)
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            X.1Xj r2 = X.C51966G9m.A0t(r3)
            java.util.Map r0 = r6.A09
            java.util.Set r1 = r0.keySet()
            java.lang.String r0 = r2.getId()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x000b
            java.util.Map r1 = r4.A03
            java.lang.String r0 = r2.getId()
            r1.put(r0, r2)
            goto L_0x000b
        L_0x002f:
            java.util.Map r0 = r6.A09
            java.util.Iterator r3 = X.AnonymousClass7TF.A0v(r0)
        L_0x0035:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0057
            X.1Xj r2 = X.C51966G9m.A0t(r3)
            java.util.Set r1 = r5.keySet()
            java.lang.String r0 = r2.getId()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0035
            java.util.Map r1 = r4.A04
            java.lang.String r0 = r2.getId()
            r1.put(r0, r2)
            goto L_0x0035
        L_0x0057:
            java.lang.String r1 = r6.A01
            java.lang.String r0 = r6.A04
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            r4.A02 = r0
            X.L8l r3 = r6.A03
            X.L8l r2 = r6.A00
            if (r2 == 0) goto L_0x008f
            if (r3 == 0) goto L_0x008f
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r3.A03
            boolean r0 = X.2PP.A00(r1, r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r3.A04
            boolean r1 = X.2PP.A00(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            r4.A01 = r0
            android.graphics.Rect r1 = r2.A00
            android.graphics.Rect r0 = r3.A00
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            r4.A00 = r0
        L_0x008f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64184LSr.A04():X.L8k");
    }

    public final void A05(Context context) {
        C63830L8l l8l;
        SortedMap sortedMap = this.A07;
        Object obj = sortedMap.get(sortedMap.firstKey());
        obj.getClass();
        1Xj r0 = (1Xj) obj;
        ExtendedImageUrl A1n = r0.A1n(context);
        A1n.getClass();
        String id = r0.getId();
        Rect A012 = JW0.A01(A1n.getWidth(), A1n.getHeight());
        if (id == null) {
            l8l = new C63830L8l(A012, A1n, (String) null, (String) null);
        }
        this.A00 = l8l;
    }

    public final void A06(1Xj r4) {
        Map map = this.A05;
        boolean containsKey = map.containsKey(r4.getId());
        String id = r4.getId();
        if (containsKey) {
            map.remove(id);
            this.A07.remove(Long.valueOf(r4.A1A()));
        } else {
            map.put(id, r4);
            this.A07.put(Long.valueOf(r4.A1A()), r4);
        }
        for (X3F DQl : this.A06) {
            DQl.DQl();
        }
    }

    public final void A07(Reel reel) {
        String str;
        Map map = this.A09;
        if (map.isEmpty() && reel != null) {
            List<C255773uh> A0O = reel.A0O(this.A08);
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C255773uh r2 : A0O) {
                if (r2.A0e == C250963mL.MEDIA) {
                    A1C.add(r2.A0b);
                }
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                1Xj A0t = C51966G9m.A0t(it);
                map.put(A0t.getId(), A0t);
            }
            String str2 = reel.A0r;
            this.A04 = str2;
            if (str2 != null) {
                this.A01 = str2;
            }
            if (reel.A0p()) {
                str = reel.getId();
            } else {
                str = null;
            }
            this.A02 = str;
            this.A00 = A01(reel);
            this.A03 = A01(reel);
            Iterator it2 = A1C.iterator();
            while (it2.hasNext()) {
                1Xj A0t2 = C51966G9m.A0t(it2);
                this.A05.put(A0t2.getId(), A0t2);
                this.A07.put(Long.valueOf(A0t2.A1A()), A0t2);
            }
        }
    }

    public final boolean A08() {
        String str;
        Set keySet = this.A05.keySet();
        C63830L8l l8l = this.A00;
        if (l8l == null || (str = l8l.A03) == null || keySet.isEmpty() || keySet.contains(str)) {
            return true;
        }
        return false;
    }

    public C64184LSr(UserSession userSession) {
        this.A08 = userSession;
        this.A09 = AnonymousClass7TE.A1E();
        this.A05 = AnonymousClass7TE.A1E();
        this.A07 = new TreeMap();
        this.A06 = AnonymousClass7TE.A1F();
    }
}
