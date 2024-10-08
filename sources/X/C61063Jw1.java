package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jw1  reason: case insensitive filesystem */
public final class C61063Jw1 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C61063Jw1) || ((C61063Jw1) obj).A00 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        if (r1 == r0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
        if (r3.A01 == r4.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0046;
                case 2: goto L_0x006c;
                case 3: goto L_0x0086;
                case 4: goto L_0x00c5;
                case 5: goto L_0x00a5;
                case 6: goto L_0x00aa;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r3 == r4) goto L_0x00df
            r0 = 7
        L_0x0008:
            boolean r0 = A01(r0, r4)
            if (r0 == 0) goto L_0x0024
            X.Jw1 r4 = (X.C61063Jw1) r4
            java.lang.Object r1 = r3.A02
            java.lang.Object r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.A03
            java.lang.Object r0 = r4.A03
        L_0x001e:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x009e
        L_0x0024:
            r2 = 0
        L_0x0025:
            return r2
        L_0x0026:
            if (r3 == r4) goto L_0x00df
            r0 = 0
            boolean r0 = A01(r0, r4)
            if (r0 == 0) goto L_0x0024
            X.Jw1 r4 = (X.C61063Jw1) r4
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0024
            java.lang.Object r1 = r3.A03
            java.lang.Object r0 = r4.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.A02
            java.lang.Object r0 = r4.A02
            goto L_0x0065
        L_0x0046:
            if (r3 == r4) goto L_0x00df
            r0 = 1
            boolean r0 = A01(r0, r4)
            if (r0 == 0) goto L_0x0024
            X.Jw1 r4 = (X.C61063Jw1) r4
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0024
            java.lang.Object r1 = r3.A02
            java.lang.Object r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.A03
            java.lang.Object r0 = r4.A03
        L_0x0065:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00df
            goto L_0x0024
        L_0x006c:
            if (r3 == r4) goto L_0x00df
            r0 = 2
            boolean r0 = A01(r0, r4)
            if (r0 == 0) goto L_0x0024
            X.Jw1 r4 = (X.C61063Jw1) r4
            java.lang.Object r1 = r3.A03
            java.lang.Object r0 = r4.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.A02
            java.lang.Object r0 = r4.A02
            goto L_0x009b
        L_0x0086:
            if (r3 == r4) goto L_0x00df
            r0 = 3
            boolean r0 = A01(r0, r4)
            if (r0 == 0) goto L_0x0024
            X.Jw1 r4 = (X.C61063Jw1) r4
            java.lang.Object r1 = r3.A02
            java.lang.Object r0 = r4.A02
            if (r1 != r0) goto L_0x0024
            java.lang.Object r1 = r3.A03
            java.lang.Object r0 = r4.A03
        L_0x009b:
            if (r1 == r0) goto L_0x009e
            goto L_0x0024
        L_0x009e:
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 == r0) goto L_0x00df
            goto L_0x0024
        L_0x00a5:
            if (r3 == r4) goto L_0x00df
            r0 = 5
            goto L_0x0008
        L_0x00aa:
            if (r3 == r4) goto L_0x00df
            r0 = 6
            boolean r0 = A01(r0, r4)
            if (r0 == 0) goto L_0x0024
            X.Jw1 r4 = (X.C61063Jw1) r4
            java.lang.Object r1 = r3.A03
            java.lang.Object r0 = r4.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.A02
            java.lang.Object r0 = r4.A02
            goto L_0x001e
        L_0x00c5:
            r0 = 4
            boolean r0 = A01(r0, r4)
            r2 = 0
            if (r0 == 0) goto L_0x0025
            int r1 = r3.A01
            X.Jw1 r4 = (X.C61063Jw1) r4
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0025
            java.lang.Object r1 = r3.A02
            java.lang.Object r0 = r4.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0025
        L_0x00df:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61063Jw1.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r1 = (r2 + r0) * 31;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        return r1 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0038;
                case 2: goto L_0x0049;
                case 3: goto L_0x0052;
                case 4: goto L_0x001a;
                case 5: goto L_0x0005;
                case 6: goto L_0x0078;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A02
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A03
        L_0x000f:
            int r0 = r0.hashCode()
        L_0x0013:
            int r2 = r2 + r0
            int r1 = r2 * 31
            int r0 = r3.A01
        L_0x0018:
            int r1 = r1 + r0
            return r1
        L_0x001a:
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TE.A0K(r0)
            int r0 = r3.A01
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            goto L_0x0044
        L_0x0028:
            int r0 = r3.A01
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A02
            if (r0 != 0) goto L_0x0044
            r0 = 0
            goto L_0x0018
        L_0x0038:
            int r0 = r3.A01
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r3.A03
        L_0x0044:
            int r0 = r0.hashCode()
            goto L_0x0018
        L_0x0049:
            java.lang.Object r0 = r3.A03
            int r2 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A02
            goto L_0x000f
        L_0x0052:
            java.lang.Object r0 = r3.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = X.C48819Ekh.A00(r0)
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A03
            int r1 = X.AnonymousClass7TE.A0M(r0)
            switch(r1) {
                case 1: goto L_0x006c;
                case 2: goto L_0x006f;
                case 3: goto L_0x0072;
                case 4: goto L_0x0075;
                default: goto L_0x0065;
            }
        L_0x0065:
            java.lang.String r0 = "MULTI_RECIPIENT"
        L_0x0067:
            int r0 = X.C51966G9m.A04(r0, r1)
            goto L_0x0013
        L_0x006c:
            java.lang.String r0 = "SINGLE_RECIPIENT"
            goto L_0x0067
        L_0x006f:
            java.lang.String r0 = "CLIPS_PREVIEW_SHARE_MULTI_RECIPIENT"
            goto L_0x0067
        L_0x0072:
            java.lang.String r0 = "CLIPS_PREVIEW_SHARE_SINGLE_RECIPIENT"
            goto L_0x0067
        L_0x0075:
            java.lang.String r0 = "ADD_TO_CHANNEL_ENTRY"
            goto L_0x0067
        L_0x0078:
            java.lang.Object r0 = r3.A03
            int r2 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r3.A02
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61063Jw1.hashCode():int");
    }

    public static final C61063Jw1 A00(C61083JwL jwL, List list, int i) {
        AnonymousClass7TG.A1N(jwL, list);
        return new C61063Jw1(jwL, list, i);
    }

    public C61063Jw1(User user, AnonymousClass62P r3, int i) {
        this.A00 = 7;
        AnonymousClass7TG.A1O(user, r3);
        this.A02 = user;
        this.A03 = r3;
        this.A01 = i;
    }

    public C61063Jw1(Integer num, Integer num2, int i) {
        this.A00 = 3;
        AnonymousClass7TG.A1O(num, num2);
        this.A02 = num;
        this.A03 = num2;
        this.A01 = i;
    }

    public C61063Jw1(C61083JwL jwL, List list, int i) {
        this.A00 = 5;
        this.A02 = jwL;
        this.A03 = list;
        this.A01 = i;
    }

    public C61063Jw1(MessagingUser messagingUser, C74552Pwl pwl, int i) {
        this.A00 = 4;
        this.A03 = pwl;
        this.A01 = i;
        this.A02 = messagingUser;
    }

    public C61063Jw1(HN3 hn3, AnonymousClass62P r3, int i) {
        this.A00 = 2;
        0qQ.A0B(r3, 1);
        this.A03 = r3;
        this.A02 = hn3;
        this.A01 = i;
    }

    public C61063Jw1(List list, List list2, int i) {
        this.A00 = 6;
        0qQ.A0B(list, 1);
        this.A03 = list;
        this.A02 = list2;
        this.A01 = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61063Jw1(HN3 hn3, int i) {
        this(hn3, (AnonymousClass62P) AnonymousClass62Q.A04(HN3.A07, HN3.A06), i);
        this.A00 = 2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61063Jw1(int r4, java.lang.Integer r5) {
        /*
            r3 = this;
            r2 = 0
            r0 = 3
            r3.A00 = r0
            r1 = 0
            r0 = r4 & 1
            if (r0 == 0) goto L_0x000b
            java.lang.Integer r5 = X.AnonymousClass05K.A01
        L_0x000b:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x0011:
            r3.<init>((java.lang.Integer) r5, (java.lang.Integer) r2, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61063Jw1.<init>(int, java.lang.Integer):void");
    }

    public C61063Jw1(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61063Jw1() {
        this(new C61083JwL((C53314Gm0) null, (Integer) null, (DefaultConstructorMarker) null, 3, 1), (List) 0sn.A00, 0);
        this.A00 = 5;
    }
}
