package X;

import android.content.Context;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jw2  reason: case insensitive filesystem */
public final class C61064Jw2 extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public final int A04;

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C61064Jw2) || ((C61064Jw2) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ad, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        if (r2.A03 == r3.A03) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0107, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 1: goto L_0x0025;
                case 2: goto L_0x000a;
                case 3: goto L_0x0046;
                case 4: goto L_0x006d;
                case 5: goto L_0x008e;
                case 6: goto L_0x00be;
                case 7: goto L_0x00e4;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x0112
            r0 = 2
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0105
            X.Jw2 r3 = (X.C61064Jw2) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00a7
        L_0x0025:
            if (r2 == r3) goto L_0x0112
            r0 = 1
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0105
            X.Jw2 r3 = (X.C61064Jw2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0089
            goto L_0x0105
        L_0x0046:
            if (r2 == r3) goto L_0x0112
            r0 = 3
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0105
            X.Jw2 r3 = (X.C61064Jw2) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x0105
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x0105
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x010b
        L_0x006d:
            if (r2 == r3) goto L_0x0112
            r0 = 4
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0105
            X.Jw2 r3 = (X.C61064Jw2) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0089
            goto L_0x0105
        L_0x0089:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x00b1
        L_0x008e:
            if (r2 == r3) goto L_0x0112
            r0 = 5
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0105
            X.Jw2 r3 = (X.C61064Jw2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x00a7:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x00b1:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 == r0) goto L_0x0112
            goto L_0x0105
        L_0x00be:
            if (r2 == r3) goto L_0x0112
            r0 = 6
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0105
            X.Jw2 r3 = (X.C61064Jw2) r3
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x0105
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0107
            goto L_0x0105
        L_0x00e4:
            if (r2 == r3) goto L_0x0112
            r0 = 7
            boolean r0 = A01(r0, r3)
            if (r0 == 0) goto L_0x0105
            X.Jw2 r3 = (X.C61064Jw2) r3
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0105
            boolean r1 = r2.A03
            boolean r0 = r3.A03
            if (r1 != r0) goto L_0x0105
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0107
        L_0x0105:
            r0 = 0
            return r0
        L_0x0107:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x010b:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0112
            goto L_0x0105
        L_0x0112:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61064Jw2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0072, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        return r1 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ce, code lost:
        return X.DbS.A06(r3.A03, (r1 + r2) * 31);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A04
            switch(r0) {
                case 1: goto L_0x0064;
                case 2: goto L_0x00b0;
                case 3: goto L_0x0077;
                case 4: goto L_0x0052;
                case 5: goto L_0x003f;
                case 6: goto L_0x0023;
                case 7: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r1 = super.hashCode()
            return r1
        L_0x000a:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            boolean r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TG.A0C(r0)
            goto L_0x009b
        L_0x0023:
            boolean r0 = r3.A03
            int r1 = X.C51965G9l.A05(r0)
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x009b
        L_0x003f:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A00
            int r1 = r0.hashCode()
            goto L_0x00c5
        L_0x0052:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A02
            if (r0 != 0) goto L_0x0072
            r1 = 0
            goto L_0x00c5
        L_0x0064:
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.String r0 = r3.A02
        L_0x0072:
            int r1 = r0.hashCode()
            goto L_0x00c5
        L_0x0077:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x009d;
                case 2: goto L_0x00a4;
                case 3: goto L_0x00a7;
                case 4: goto L_0x00aa;
                case 5: goto L_0x00ad;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.String r0 = "RECENT"
        L_0x0082:
            int r1 = X.C51968G9o.A0F(r0, r1)
            boolean r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
        L_0x009b:
            int r1 = r1 + r2
            return r1
        L_0x009d:
            r0 = 2264(0x8d8, float:3.173E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0082
        L_0x00a4:
            java.lang.String r0 = "SEARCH"
            goto L_0x0082
        L_0x00a7:
            java.lang.String r0 = "YOUR_STICKERS"
            goto L_0x0082
        L_0x00aa:
            java.lang.String r0 = "GIPHY"
            goto L_0x0082
        L_0x00ad:
            java.lang.String r0 = "FIRST_PARTY"
            goto L_0x0082
        L_0x00b0:
            java.lang.Object r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r2 = X.AnonymousClass7TE.A0L(r0)
        L_0x00c5:
            int r1 = r1 + r2
            int r1 = r1 * 31
            boolean r0 = r3.A03
            int r1 = X.DbS.A06(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61064Jw2.hashCode():int");
    }

    public final String toString() {
        if (5 - this.A04 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserCopresenceState(userId=");
        A1A.append(this.A02);
        A1A.append(", inThreadStates=");
        A1A.append(this.A01);
        A1A.append(", inClipsTogetherStates=");
        A1A.append(this.A00);
        A1A.append(", copresenceEnabled=");
        return G9t.A1C(A1A, this.A03);
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        Object obj = ((C61064Jw2) it.next()).A01;
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public C61064Jw2(Context context, C10806RyS ryS, String str, boolean z) {
        this.A04 = 0;
        this.A00 = context;
        this.A02 = str;
        this.A01 = ryS;
        this.A03 = z;
    }

    public C61064Jw2(0yf r2, 0yf r3, String str, boolean z) {
        this.A04 = 5;
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = z;
    }

    public C61064Jw2(C62520KhB khB, String str, List list, boolean z) {
        this.A04 = 4;
        this.A00 = list;
        this.A01 = khB;
        this.A02 = str;
        this.A03 = z;
    }

    public C61064Jw2(Venue venue, String str, List list, boolean z) {
        this.A04 = 2;
        this.A01 = list;
        this.A02 = str;
        this.A00 = venue;
        this.A03 = z;
    }

    public C61064Jw2(User user, C62530KhM khM, String str, boolean z) {
        this.A04 = 7;
        this.A02 = str;
        this.A03 = z;
        this.A00 = khM;
        this.A01 = user;
    }

    public C61064Jw2(C61080JwI jwI, C276114sa r3, String str, boolean z) {
        this.A04 = 1;
        DbZ.A0t(1, jwI, r3, str);
        this.A00 = jwI;
        this.A01 = r3;
        this.A02 = str;
        this.A03 = z;
    }

    public C61064Jw2() {
        this.A04 = 6;
        this.A04 = 6;
        this.A04 = 6;
        this.A03 = false;
        this.A02 = "";
        this.A00 = null;
        this.A01 = null;
    }

    public C61064Jw2(Boolean bool, Integer num, int i, boolean z) {
        this.A04 = 3;
        bool = (i & 8) != 0 ? null : bool;
        this.A04 = 3;
        this.A01 = num;
        this.A03 = z;
        this.A02 = null;
        this.A00 = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61064Jw2(Venue venue, String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this((Venue) null, (String) null, (List) 0sn.A00, false);
        this.A04 = 2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61064Jw2(C62520KhB khB, String str, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z) {
        this(C62520KhB.Uninitialized, (String) null, (List) 0sn.A00, true);
        this.A04 = 4;
    }
}
