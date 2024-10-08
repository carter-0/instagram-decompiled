package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.GEi  reason: case insensitive filesystem */
public final class C52088GEi extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C52088GEi(Integer num, String str, long j) {
        this(num, (Long) null, str, j);
        this.A00 = 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (X.0qQ.A0K(r5.A02, r6.A02) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (X.0qQ.A0K(r5.A03, r6.A03) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        r1 = r5.A04;
        r0 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cf, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if ((r6 instanceof X.C52088GEi) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r6 = (X.C52088GEi) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r6.A00 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r5.A01 != r6.A01) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x006e;
                case 2: goto L_0x0030;
                case 3: goto L_0x009e;
                case 4: goto L_0x00d3;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r5 == r6) goto L_0x00d8
            r1 = 5
        L_0x0008:
            boolean r0 = r6 instanceof X.C52088GEi
            if (r0 == 0) goto L_0x002e
            X.GEi r6 = (X.C52088GEi) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x002e
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0069
        L_0x002e:
            r0 = 0
            return r0
        L_0x0030:
            if (r5 == r6) goto L_0x00d8
            r1 = 2
            boolean r0 = r6 instanceof X.C52088GEi
            if (r0 == 0) goto L_0x002e
            X.GEi r6 = (X.C52088GEi) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x002e
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            goto L_0x00cb
        L_0x0043:
            if (r5 == r6) goto L_0x00d8
            r1 = 0
            boolean r0 = r6 instanceof X.C52088GEi
            if (r0 == 0) goto L_0x002e
            X.GEi r6 = (X.C52088GEi) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x002e
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            if (r1 == r0) goto L_0x0069
            goto L_0x002e
        L_0x0069:
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r6.A04
            goto L_0x00cb
        L_0x006e:
            if (r5 == r6) goto L_0x00d8
            r1 = 1
            boolean r0 = r6 instanceof X.C52088GEi
            if (r0 == 0) goto L_0x002e
            X.GEi r6 = (X.C52088GEi) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x002e
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r6.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            if (r1 == r0) goto L_0x00d8
            goto L_0x002e
        L_0x009e:
            if (r5 == r6) goto L_0x00d8
            r1 = 3
            boolean r0 = r6 instanceof X.C52088GEi
            if (r0 == 0) goto L_0x002e
            X.GEi r6 = (X.C52088GEi) r6
            int r0 = r6.A00
            if (r0 != r1) goto L_0x002e
            java.lang.Object r1 = r5.A03
            java.lang.Object r0 = r6.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r6.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002e
            long r3 = r5.A01
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            java.lang.Object r1 = r5.A02
            java.lang.Object r0 = r6.A02
        L_0x00cb:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00d8
            goto L_0x002e
        L_0x00d3:
            if (r5 == r6) goto L_0x00d8
            r1 = 4
            goto L_0x0008
        L_0x00d8:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52088GEi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A07;
        int A072;
        int A0D;
        int hashCode;
        switch (this.A00) {
            case 0:
                A07 = C51972G9s.A07(this.A01, AnonymousClass7TE.A0K(this.A02));
                break;
            case 1:
                A072 = (C51972G9s.A07(this.A01, AnonymousClass7TE.A0O(this.A04)) + AnonymousClass7TG.A0C(this.A02)) * 31;
                Integer num = (Integer) this.A03;
                A0D = C51971G9r.A0D(num, C55083Hbs.A00(num));
                break;
            case 2:
                return this.A03.hashCode();
            case 3:
                A072 = C51972G9s.A07(this.A01, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0K(this.A03)));
                A0D = AnonymousClass7TG.A0C(this.A02);
                break;
            default:
                A07 = (C51975G9x.A03(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31;
                break;
        }
        Object obj = this.A03;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        A0D = (A07 + hashCode) * 31;
        A072 = C41845B3m.A00(this.A04);
        return A0D + A072;
    }

    public C52088GEi(C16539Uwk uwk, JV7 jv7, String str, long j) {
        this.A00 = 0;
        0qQ.A0B(jv7, 1);
        this.A02 = jv7;
        this.A01 = j;
        this.A03 = uwk;
        this.A04 = str;
    }

    public C52088GEi(Long l, Long l2, String str, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = l;
        this.A03 = l2;
        this.A04 = str;
    }

    public C52088GEi(C255773uh r3) {
        long j;
        String A2n;
        Long A0n;
        this.A00 = 2;
        0qQ.A0B(r3, 1);
        this.A03 = r3;
        String str = r3.A0j;
        0qQ.A07(str);
        this.A04 = str;
        1Xj r0 = r3.A0b;
        if (r0 == null || (A2n = r0.A2n()) == null || (A0n = 00y.A0n(10, A2n)) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        this.A01 = j;
        this.A02 = r3.A06();
    }

    public C52088GEi(Integer num, Long l, String str, long j) {
        this.A00 = 1;
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A01 = j;
        this.A02 = l;
        this.A03 = num;
    }

    public C52088GEi(ImageUrl imageUrl, User user, String str, long j) {
        this.A00 = 3;
        this.A03 = user;
        this.A04 = str;
        this.A01 = j;
        this.A02 = imageUrl;
    }
}
