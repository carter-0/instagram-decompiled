package X;

import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7cI  reason: invalid class name and case insensitive filesystem */
public abstract class C335047cI {
    public static final C336617eu A00(AnonymousClass9IV r7, C335917dk r8, boolean z, boolean z2, boolean z3) {
        int i;
        String str;
        String str2;
        Integer num;
        Integer num2;
        if (z) {
            str2 = ((C335907dj) r7.A01).A0K;
            num2 = AnonymousClass05K.A00;
            str = r8.A05;
            ArrayList arrayList = new ArrayList();
            for (Object next : (List) ((C376459Ib) r7.A00).A01) {
                if (((C335907dj) next).A0H == AnonymousClass05K.A0u) {
                    arrayList.add(next);
                }
            }
            i = arrayList.size();
            num = AnonymousClass05K.A0C;
        } else if (z2) {
            str2 = ((C335907dj) r7.A01).A0K;
            num2 = AnonymousClass05K.A00;
            str = r8.A05;
            i = r8.A00;
            num = AnonymousClass05K.A01;
        } else if (!z3) {
            return null;
        } else {
            String str3 = ((C335907dj) r7.A01).A0K;
            Integer num3 = AnonymousClass05K.A00;
            return new C336617eu(true, num3, r8.A02, num3, str3, r8.A05, r8.A00);
        }
        return new C336617eu(true, num2, num2, num, str2, str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r5.A06 == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass9IV r14, X.C335857de r15, java.util.List r16) {
        /*
            r6 = r14
            java.lang.Object r10 = r14.A01
            X.7dj r10 = (X.C335907dj) r10
            java.lang.Integer r0 = r10.A0H
            boolean r0 = A04(r0)
            if (r0 == 0) goto L_0x00b1
            X.7de r0 = r10.A05
            if (r0 != r15) goto L_0x00b1
            java.lang.Object r7 = r14.A00
            X.9Ib r7 = (X.C376459Ib) r7
            java.lang.Object r5 = r7.A00
            X.7dk r5 = (X.C335917dk) r5
            boolean r9 = r5.A08
            r4 = 1
            if (r9 != 0) goto L_0x0027
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x0027
            boolean r0 = r5.A06
            r3 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            java.lang.Object r2 = r7.A01
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0087
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0087
        L_0x0040:
            r4 = 0
        L_0x0041:
            boolean r8 = r5.A07
            r1 = r16
            r1.add(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0065
            java.lang.Object r0 = r14.A01
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r14 = r0.A0K
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            java.lang.String r15 = r5.A04
            int r0 = r5.A01
            java.lang.Integer r12 = r5.A03
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            X.7eu r9 = new X.7eu
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.add(r9)
        L_0x0065:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r2.iterator()
        L_0x006e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r9.next()
            r0 = r2
            X.7dj r0 = (X.C335907dj) r0
            java.lang.Integer r0 = r0.A0H
            boolean r0 = A04(r0)
            if (r0 == 0) goto L_0x006e
            r10.add(r2)
            goto L_0x006e
        L_0x0087:
            java.util.Iterator r8 = r2.iterator()
        L_0x008b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r8.next()
            X.7dj r0 = (X.C335907dj) r0
            java.lang.Integer r1 = r0.A0H
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x008b
            goto L_0x0041
        L_0x009e:
            r1.addAll(r10)
            java.lang.Object r0 = r7.A02
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            X.7eu r0 = A00(r6, r5, r4, r3, r8)
            if (r0 == 0) goto L_0x00b1
            r1.add(r0)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335047cI.A01(X.9IV, X.7de, java.util.List):void");
    }

    public static final void A02(C333777a7 r5, List list) {
        String str;
        boolean z;
        User user = r5.A0A;
        IGCommentSheetMoreInfo iGCommentSheetMoreInfo = r5.A01;
        if (iGCommentSheetMoreInfo != null) {
            str = iGCommentSheetMoreInfo.getText();
        } else {
            str = null;
        }
        if (user != null && str != null) {
            String str2 = r5.A0I;
            int i = r5.A00;
            int length = str.length();
            if (i <= 0 ? i != 0 || length <= 400 : length <= 160) {
                z = false;
            } else {
                z = true;
            }
            list.add(new C385139iS(user, str2, str, z));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.C333867aH r4) {
        /*
            X.7aC r1 = r4.A03
            boolean r0 = r1.A03
            r3 = 1
            if (r0 != 0) goto L_0x0017
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0017
            java.util.List r1 = r4.A06
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0019
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0019
        L_0x0017:
            r3 = 0
        L_0x0018:
            return r3
        L_0x0019:
            java.util.Iterator r2 = r1.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r2.next()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A01
            X.7dj r0 = (X.C335907dj) r0
            X.7de r1 = r0.A05
            X.7de r0 = X.C335857de.COVERED_COMMENT
            if (r1 == r0) goto L_0x0018
            X.7de r0 = X.C335857de.HIDDEN_COMMENT
            if (r1 != r0) goto L_0x001d
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335047cI.A03(X.7aH):boolean");
    }

    public static final boolean A04(Integer num) {
        int intValue = num.intValue();
        if (intValue == 2 || intValue == 6 || intValue == 7) {
            return false;
        }
        return true;
    }
}
