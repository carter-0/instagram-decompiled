package X;

import android.graphics.Bitmap;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Iu  reason: invalid class name and case insensitive filesystem */
public final class C376649Iu extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public final int A02;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C376649Iu) || ((C376649Iu) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        r3 = (X.C376649Iu) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0058, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0066, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0075, code lost:
        r3 = (X.C376649Iu) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007f, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0081, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 1: goto L_0x000e;
                case 2: goto L_0x0012;
                case 3: goto L_0x0024;
                case 4: goto L_0x000a;
                case 5: goto L_0x0028;
                case 6: goto L_0x002c;
                case 7: goto L_0x005b;
                case 8: goto L_0x0030;
                case 9: goto L_0x0035;
                case 10: goto L_0x003a;
                case 11: goto L_0x003f;
                case 12: goto L_0x0044;
                case 13: goto L_0x006b;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x008d
            r0 = 4
            goto L_0x006f
        L_0x000e:
            if (r2 == r3) goto L_0x008d
            r0 = 1
            goto L_0x0048
        L_0x0012:
            if (r2 == r3) goto L_0x008d
            r0 = 2
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x008b
            X.9Iu r3 = (X.C376649Iu) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0066
            goto L_0x008b
        L_0x0024:
            if (r2 == r3) goto L_0x008d
            r0 = 3
            goto L_0x0048
        L_0x0028:
            if (r2 == r3) goto L_0x008d
            r0 = 5
            goto L_0x006f
        L_0x002c:
            if (r2 == r3) goto L_0x008d
            r0 = 6
            goto L_0x0048
        L_0x0030:
            if (r2 == r3) goto L_0x008d
            r0 = 8
            goto L_0x006f
        L_0x0035:
            if (r2 == r3) goto L_0x008d
            r0 = 9
            goto L_0x006f
        L_0x003a:
            if (r2 == r3) goto L_0x008d
            r0 = 10
            goto L_0x006f
        L_0x003f:
            if (r2 == r3) goto L_0x008d
            r0 = 11
            goto L_0x0048
        L_0x0044:
            if (r2 == r3) goto L_0x008d
            r0 = 12
        L_0x0048:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x008b
            X.9Iu r3 = (X.C376649Iu) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0066
            goto L_0x008b
        L_0x005b:
            if (r2 == r3) goto L_0x008d
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x008b
            X.9Iu r3 = (X.C376649Iu) r3
        L_0x0066:
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            goto L_0x0085
        L_0x006b:
            if (r2 == r3) goto L_0x008d
            r0 = 13
        L_0x006f:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x008b
            X.9Iu r3 = (X.C376649Iu) r3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008b
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x0085:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x008d
        L_0x008b:
            r0 = 0
            return r0
        L_0x008d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376649Iu.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        return r2 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r1 = r0.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r1 = r0.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A02
            switch(r0) {
                case 1: goto L_0x0017;
                case 2: goto L_0x000a;
                case 3: goto L_0x000a;
                case 4: goto L_0x0056;
                case 5: goto L_0x0056;
                case 6: goto L_0x000a;
                case 7: goto L_0x0026;
                case 8: goto L_0x0031;
                case 9: goto L_0x0031;
                case 10: goto L_0x0047;
                case 11: goto L_0x0017;
                case 12: goto L_0x0017;
                case 13: goto L_0x0047;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = super.hashCode()
            return r2
        L_0x000a:
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x0021
            goto L_0x0053
        L_0x0017:
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            java.lang.String r0 = r3.A01
        L_0x0021:
            int r1 = r0.hashCode()
            goto L_0x0054
        L_0x0026:
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x002c
            r2 = 0
            return r2
        L_0x002c:
            int r2 = r0.hashCode()
            return r2
        L_0x0031:
            java.lang.String r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto L_0x0042
            r0 = 0
        L_0x0037:
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto L_0x0054
            int r2 = r0.hashCode()
            goto L_0x0054
        L_0x0042:
            int r0 = r0.hashCode()
            goto L_0x0037
        L_0x0047:
            java.lang.String r0 = r3.A01
            int r0 = r0.hashCode()
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L_0x005f
        L_0x0053:
            r1 = 0
        L_0x0054:
            int r2 = r2 + r1
            return r2
        L_0x0056:
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x0064
            r0 = 0
        L_0x005b:
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A00
        L_0x005f:
            int r1 = r0.hashCode()
            goto L_0x0054
        L_0x0064:
            int r0 = r0.hashCode()
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376649Iu.hashCode():int");
    }

    public final String toString() {
        if (this.A02 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ShowreelNativeInteraction(name=");
        sb.append(this.A01);
        sb.append(", actions=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C376649Iu() {
        this((String) null);
        this.A02 = 7;
    }

    public C376649Iu(1Xj r2, String str) {
        this.A02 = 6;
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public C376649Iu(C317876nz r2, String str) {
        this.A02 = 4;
        this.A01 = str;
        this.A00 = r2;
    }

    public C376649Iu(C333897aK r2, String str) {
        this.A02 = 2;
        this.A00 = r2;
        this.A01 = str;
    }

    public C376649Iu(Bitmap bitmap, String str) {
        this.A02 = 12;
        this.A00 = bitmap;
        this.A01 = str;
    }

    public C376649Iu(ImmutableList immutableList, String str) {
        this.A02 = 0;
        this.A01 = str;
        this.A00 = immutableList;
    }

    public C376649Iu(ImageUrl imageUrl, String str, int i) {
        this.A02 = i;
        if (9 - i != 0) {
            0qQ.A0B(str, 1);
        }
        this.A01 = str;
        this.A00 = imageUrl;
    }

    public C376649Iu(String str) {
        this.A02 = 7;
        this.A01 = str;
    }

    public C376649Iu(String str, Object obj) {
        this.A02 = 13;
        this.A01 = str;
        this.A00 = obj;
    }

    public C376649Iu(String str, Object obj, int i) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = obj;
    }

    public C376649Iu(String str, Map map) {
        this.A02 = 3;
        this.A00 = map;
        this.A01 = str;
    }

    public C376649Iu(List list, int i, String str) {
        this.A02 = i;
        0qQ.A0B(list, 1);
        0qQ.A0B(str, 2);
        this.A00 = list;
        this.A01 = str;
    }
}
