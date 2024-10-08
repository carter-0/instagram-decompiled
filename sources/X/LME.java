package X;

import com.instagram.api.schemas.AdsAPIInstagramPosition;
import java.util.List;

public final class LME {
    public final AdsAPIInstagramPosition A00;
    public final List A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LME(X.MXA r6) {
        /*
            r5 = this;
            X.UyU r0 = r6.BHo()
            java.lang.String r0 = X.DbX.A0t(r0)
            com.instagram.api.schemas.AdsAPIInstagramPosition r4 = X.V70.A00(r0)
            com.google.common.collect.ImmutableList r0 = r6.Bf1()
            X.0qQ.A07(r0)
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()
            X.MXC r1 = (X.MXC) r1
            X.0qQ.A0A(r1)
            X.JwB r0 = new X.JwB
            r0.<init>((X.MXC) r1)
            r3.add(r0)
            goto L_0x001b
        L_0x0033:
            r5.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LME.<init>(X.MXA):void");
    }

    public LME(AdsAPIInstagramPosition adsAPIInstagramPosition, List list) {
        this.A00 = adsAPIInstagramPosition;
        this.A01 = list;
    }
}
