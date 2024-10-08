package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9UZ  reason: invalid class name */
public class AnonymousClass9UZ extends A9P {
    public boolean A00;
    public final String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (X.00l.A0d(r1, "earth_day", false) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r5 = this;
            boolean r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0033
            X.7w8 r3 = r5.A02
            java.util.List r0 = r3.A08
            int r0 = r0.size()
            if (r0 > r4) goto L_0x002e
            r2 = 0
            android.graphics.drawable.Drawable r1 = r3.A04()
            X.0qQ.A07(r1)
            boolean r0 = r1 instanceof X.C369768vI
            if (r0 == 0) goto L_0x002a
            X.8vI r1 = (X.C369768vI) r1
            java.lang.String r1 = r1.A0O
            X.0qQ.A07(r1)
            java.lang.String r0 = "earth_day"
            boolean r0 = X.00l.A0d(r1, r0, r2)
            if (r0 != 0) goto L_0x002e
        L_0x002a:
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0033
        L_0x002e:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0033
            return r4
        L_0x0033:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UZ.A01():boolean");
    }

    public AnonymousClass9UZ(Context context, UserSession userSession, C347017w8 r5, String str) {
        super(context, userSession, r5);
        this.A01 = str == null ? context.getResources().getString(2131974218) : str;
    }
}
