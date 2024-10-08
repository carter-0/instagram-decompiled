package X;

import com.facebook.location.platform.api.Location;
import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gz1  reason: case insensitive filesystem */
public final class C54077Gz1 extends 1XP implements AnonymousClass1Xn, AnonymousClass3Y7 {
    public int A00 = -1;
    public ContextualAdResponseExtrasImpl A01;
    public ContextualAdResponseOrganicInfoImpl A02;
    public C42049BFc A03;
    public 1Xj A04;
    public 1Xj A05;
    public C233492vo A06;
    public Integer A07;
    public String A08;
    public String A09 = "";
    public String A0A;
    public List A0B = 0sn.A00;
    public Map A0C = AnonymousClass7TE.A1H();
    public boolean A0D;

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AJb(X.1Xj r6) {
        /*
            r5 = this;
            r4 = 0
            java.util.List r0 = r5.A0B
            java.util.Iterator r3 = r0.iterator()
        L_0x0007:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r2 = r3.next()
            X.Hpk r2 = (X.C55923Hpk) r2
            boolean r0 = r6.A5E()
            r1 = 1
            if (r0 == 0) goto L_0x002b
            X.1Xj r0 = r2.A00()
            java.util.List r0 = X.C51966G9m.A1I(r0)
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.contains(r6)
            if (r0 != r1) goto L_0x002b
            return r1
        L_0x002b:
            X.1Xj r0 = r2.A00()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0007
            return r1
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54077Gz1.AJb(X.1Xj):boolean");
    }

    public final Integer B9V() {
        return null;
    }

    public final C67241sS BJP() {
        return null;
    }

    public final ContextualAdResponseExtrasImpl A00() {
        ContextualAdResponseExtrasImpl contextualAdResponseExtrasImpl = this.A01;
        if (contextualAdResponseExtrasImpl != null) {
            return contextualAdResponseExtrasImpl;
        }
        0qQ.A0F(Location.EXTRAS);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C233492vo A01() {
        C233492vo r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("gapRulesDict");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer A02() {
        String str;
        if (this.A01 == null || (str = A00().A01) == null) {
            return null;
        }
        return C55033Hb4.A00(str);
    }

    public final 1UQ B5J() {
        return 1UQ.A0T;
    }

    public final String C9L() {
        String C9L;
        C55923Hpk hpk = (C55923Hpk) 00k.A0J(this.A0B);
        if (hpk == null || (C9L = hpk.A00().C9L()) == null) {
            return "";
        }
        return C9L;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0C;
    }

    public final Integer CEl() {
        if (A02() == AnonymousClass05K.A01 || AnonymousClass59V.A00.A02(Integer.valueOf(this.A00))) {
            return 1;
        }
        return null;
    }

    public final String getId() {
        String str = A00().A00;
        if (str == null) {
            return "";
        }
        return str;
    }
}
