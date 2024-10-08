package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4A9  reason: invalid class name */
public final class AnonymousClass4A9 extends AnonymousClass4AA {
    public int A00 = 1;
    public long A01;
    public AnonymousClass30Y A02;
    public final int A03;
    public final User A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final AnonymousClass913 A09;
    public final List A0A;
    public final List A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        if ((!r7.A0B.isEmpty()) != false) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4A9(com.instagram.user.model.User r8, java.lang.String r9, java.util.List r10, java.util.List r11, int r12, boolean r13) {
        /*
            r7 = this;
            r2 = 1
            r7.<init>()
            r7.A04 = r8
            r7.A07 = r13
            r7.A03 = r12
            r7.A0A = r10
            r7.A0B = r11
            r7.A05 = r9
            r7.A00 = r2
            r0 = 10
            int r0 = X.0Yv.A1E(r10, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r10.iterator()
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r1.next()
            X.4AB r0 = (X.AnonymousClass4AB) r0
            com.instagram.user.model.User r0 = r0.A0A
            r3.add(r0)
            goto L_0x0021
        L_0x0033:
            java.util.List r0 = r7.A0B
            java.util.ArrayList r0 = X.00k.A0S(r0, r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x0042:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r3 = r4.next()
            r0 = r3
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = r0.getId()
            com.instagram.user.model.User r0 = r7.A04
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0042
            r6.add(r3)
            goto L_0x0042
        L_0x0065:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r6.iterator()
        L_0x0073:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = r5.add(r0)
            if (r0 == 0) goto L_0x0073
            r4.add(r1)
            goto L_0x0073
        L_0x008e:
            r0 = 3
            java.util.List r0 = X.00k.A0d(r4, r0)
            r7.A06 = r0
            java.util.List r0 = r7.A0A
            java.util.Iterator r4 = r0.iterator()
        L_0x009b:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L_0x010c
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.4AB r0 = (X.AnonymousClass4AB) r0
            java.util.List r0 = r0.A0J
            java.lang.Object r0 = X.00k.A0J(r0)
            X.913 r0 = (X.AnonymousClass913) r0
            if (r0 == 0) goto L_0x009b
            X.4zZ r0 = r0.BWY()
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r0.A0J
            if (r0 == 0) goto L_0x009b
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x009b
        L_0x00c3:
            X.4AB r1 = (X.AnonymousClass4AB) r1
            if (r1 == 0) goto L_0x010a
            java.util.List r0 = r1.A0J
            if (r0 == 0) goto L_0x010a
            java.lang.Object r4 = X.00k.A0J(r0)
            X.913 r4 = (X.AnonymousClass913) r4
        L_0x00d1:
            r7.A09 = r4
            if (r4 == 0) goto L_0x00dd
            X.4zZ r0 = r4.BWY()
            if (r0 == 0) goto L_0x00dd
            java.lang.String r3 = r0.A0J
        L_0x00dd:
            java.util.List r0 = r7.A0A
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00f2
            java.util.List r0 = r7.A0B
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L_0x00f3
        L_0x00f2:
            r0 = 1
        L_0x00f3:
            r7.A08 = r0
            java.util.List r0 = r7.A0A
            r0.size()
            if (r4 == 0) goto L_0x0109
            X.4zZ r0 = r4.BWY()
            if (r0 == 0) goto L_0x0109
            boolean r0 = r0.A0Q
            if (r0 != r2) goto L_0x0109
            X.0mp.A00(r3)
        L_0x0109:
            return
        L_0x010a:
            r4 = r3
            goto L_0x00d1
        L_0x010c:
            r1 = r3
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4A9.<init>(com.instagram.user.model.User, java.lang.String, java.util.List, java.util.List, int, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4A9) {
                AnonymousClass4A9 r5 = (AnonymousClass4A9) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || this.A07 != r5.A07 || this.A03 != r5.A03 || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A04.hashCode() * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int hashCode3 = (((((((hashCode2 + i) * 31) + this.A03) * 31) + this.A0A.hashCode()) * 31) + this.A0B.hashCode()) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode3 + hashCode;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
