package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.9IZ  reason: invalid class name */
public final class AnonymousClass9IZ extends AnonymousClass0T0 {
    public Object A00;
    public boolean A01;
    public final int A02 = 2;
    public final Object A03;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9IZ) || ((AnonymousClass9IZ) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r3 = (X.AnonymousClass9IZ) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (X.0qQ.A0K(r2.A03, r3.A03) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d9, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ed, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ef, code lost:
        r3 = (X.AnonymousClass9IZ) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f9, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fb, code lost:
        r1 = r2.A03;
        r0 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0103, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010b, code lost:
        if (r2.A01 == r3.A01) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == r0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x003e;
                case 2: goto L_0x0042;
                case 3: goto L_0x0047;
                case 4: goto L_0x0061;
                case 5: goto L_0x0083;
                case 6: goto L_0x009f;
                case 7: goto L_0x00bc;
                case 8: goto L_0x00e5;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x010f
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            X.9IZ r3 = (X.AnonymousClass9IZ) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
        L_0x001f:
            if (r1 == r0) goto L_0x0107
        L_0x0021:
            r0 = 0
            return r0
        L_0x0023:
            if (r2 == r3) goto L_0x010f
            r0 = 0
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            X.9IZ r3 = (X.AnonymousClass9IZ) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x00ff
        L_0x003e:
            if (r2 == r3) goto L_0x010f
            r0 = 1
            goto L_0x004a
        L_0x0042:
            if (r2 == r3) goto L_0x010f
            r0 = 2
            goto L_0x00e9
        L_0x0047:
            if (r2 == r3) goto L_0x010f
            r0 = 3
        L_0x004a:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            X.9IZ r3 = (X.AnonymousClass9IZ) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x001f
        L_0x0061:
            if (r2 == r3) goto L_0x010f
            r0 = 4
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            X.9IZ r3 = (X.AnonymousClass9IZ) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0021
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x0021
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x010f
            goto L_0x0021
        L_0x0083:
            if (r2 == r3) goto L_0x010f
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            X.9IZ r3 = (X.AnonymousClass9IZ) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x0021
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x0021
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x00dd
        L_0x009f:
            if (r2 == r3) goto L_0x010f
            r0 = 6
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            X.9IZ r3 = (X.AnonymousClass9IZ) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0021
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L_0x00d9
            goto L_0x0021
        L_0x00bc:
            if (r2 == r3) goto L_0x010f
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            X.9IZ r3 = (X.AnonymousClass9IZ) r3
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x0021
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00d9
            goto L_0x0021
        L_0x00d9:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x00dd:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x010f
            goto L_0x0021
        L_0x00e5:
            if (r2 == r3) goto L_0x010f
            r0 = 8
        L_0x00e9:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0021
            X.9IZ r3 = (X.AnonymousClass9IZ) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
        L_0x00ff:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0107
            goto L_0x0021
        L_0x0107:
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L_0x010f
            goto L_0x0021
        L_0x010f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IZ.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00eb, code lost:
        r3 = (r3 + r1) * 31;
        r1 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r3 = (r4 + r2) * 31;
        r1 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r5.A01 == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r1 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return r3 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r5 = this;
            int r1 = r5.A02
            switch(r1) {
                case 0: goto L_0x001f;
                case 1: goto L_0x002a;
                case 2: goto L_0x0044;
                case 3: goto L_0x0053;
                case 4: goto L_0x0064;
                case 5: goto L_0x00a6;
                case 6: goto L_0x00db;
                case 7: goto L_0x0091;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r5.A00
            int r1 = r1.hashCode()
            int r4 = r1 * 31
            java.lang.Object r1 = r5.A03
        L_0x000f:
            if (r1 != 0) goto L_0x004e
            r2 = 0
        L_0x0012:
            int r4 = r4 + r2
            int r3 = r4 * 31
            boolean r2 = r5.A01
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x001d
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x001d:
            int r3 = r3 + r1
            return r3
        L_0x001f:
            java.lang.Object r1 = r5.A03
            int r1 = r1.hashCode()
            int r4 = r1 * 31
            java.lang.Object r1 = r5.A00
            goto L_0x000f
        L_0x002a:
            java.lang.Object r1 = r5.A03
            int r1 = r1.hashCode()
            int r4 = r1 * 31
            java.lang.Object r3 = r5.A00
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r1 = X.AnonymousClass9UV.A00(r3)
            int r2 = r1.hashCode()
            int r1 = r3.intValue()
            int r2 = r2 + r1
            goto L_0x0012
        L_0x0044:
            java.lang.Object r1 = r5.A00
            int r1 = r1.hashCode()
            int r4 = r1 * 31
            java.lang.Object r1 = r5.A03
        L_0x004e:
            int r2 = r1.hashCode()
            goto L_0x0012
        L_0x0053:
            java.lang.Object r1 = r5.A03
            int r1 = r1.hashCode()
            int r4 = r1 * 31
            java.lang.Object r1 = r5.A00
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = X.C63169Ksc.A00(r1)
            goto L_0x0012
        L_0x0064:
            java.lang.Object r1 = r5.A03
            int r1 = r1.hashCode()
            int r3 = r1 * 31
            boolean r2 = r5.A01
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x0074
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x0074:
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r5.A00
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            r0 = 1
            if (r0 == r2) goto L_0x008a
            java.lang.String r1 = "OUTLINED_16"
        L_0x0084:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            goto L_0x001d
        L_0x008a:
            r1 = 2267(0x8db, float:3.177E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x0084
        L_0x0091:
            boolean r2 = r5.A01
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x0099
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x0099:
            int r3 = r1 * 31
            java.lang.Object r1 = r5.A03
            if (r1 != 0) goto L_0x00a1
            r1 = 0
            goto L_0x00eb
        L_0x00a1:
            int r1 = r1.hashCode()
            goto L_0x00eb
        L_0x00a6:
            java.lang.Object r1 = r5.A00
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            switch(r2) {
                case 1: goto L_0x00cc;
                case 2: goto L_0x00cf;
                case 3: goto L_0x00d2;
                case 4: goto L_0x00d5;
                case 5: goto L_0x00d8;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            java.lang.String r1 = "HIDDEN"
        L_0x00b3:
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r3 = r1 * 31
            boolean r2 = r5.A01
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x00c2
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x00c2:
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r5.A03
            if (r1 != 0) goto L_0x00f0
            r1 = 0
            goto L_0x001d
        L_0x00cc:
            java.lang.String r1 = "EXCLUSIVE_CONTENT_BADGE"
            goto L_0x00b3
        L_0x00cf:
            java.lang.String r1 = "CONTENT_PREVIEW_BADGE"
            goto L_0x00b3
        L_0x00d2:
            java.lang.String r1 = "CLOSE_FRIENDS"
            goto L_0x00b3
        L_0x00d5:
            java.lang.String r1 = "NO_OP_BADGE"
            goto L_0x00b3
        L_0x00d8:
            java.lang.String r1 = "OPAL"
            goto L_0x00b3
        L_0x00db:
            java.lang.Object r1 = r5.A03
            int r1 = r1.hashCode()
            int r3 = r1 * 31
            boolean r2 = r5.A01
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x00eb
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x00eb:
            int r3 = r3 + r1
            int r3 = r3 * 31
            java.lang.Object r1 = r5.A00
        L_0x00f0:
            int r1 = r1.hashCode()
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IZ.hashCode():int");
    }

    public final String toString() {
        if (2 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ClipsTimelineEditorUiState(currTimelineState=");
        sb.append(this.A00);
        sb.append(", prevTimelineState=");
        sb.append(this.A03);
        sb.append(C66579MXk.A00(27));
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass9IZ() {
        this((AnonymousClass8RH) new AnonymousClass8RG(false), (AnonymousClass8RH) new AnonymousClass8RG(false), false);
    }

    public AnonymousClass9IZ(1Xj r2, Integer num, boolean z) {
        this.A03 = r2;
        this.A01 = z;
        this.A00 = num;
    }

    public AnonymousClass9IZ(AnonymousClass3HX r2, List list, boolean z) {
        0qQ.A0B(list, 1);
        this.A00 = list;
        this.A03 = r2;
        this.A01 = z;
    }

    public AnonymousClass9IZ(AnonymousClass8RH r2, AnonymousClass8RH r3, boolean z) {
        this.A00 = r2;
        this.A03 = r3;
        this.A01 = z;
    }

    public AnonymousClass9IZ(AnonymousClass9IV r2, C262744Fv r3, boolean z) {
        this.A01 = z;
        this.A03 = r3;
        this.A00 = r2;
    }

    public AnonymousClass9IZ(AnonymousClass9IV r2, CharSequence charSequence, boolean z) {
        0qQ.A0B(charSequence, 1);
        this.A03 = charSequence;
        this.A01 = z;
        this.A00 = r2;
    }

    public AnonymousClass9IZ(Drawable drawable) {
        Integer num = AnonymousClass05K.A01;
        this.A02 = 1;
        this.A03 = drawable;
        this.A00 = num;
        this.A01 = true;
    }

    public AnonymousClass9IZ(View view, C244063aa r3, boolean z) {
        this.A00 = view;
        this.A03 = r3;
        this.A01 = z;
    }

    public AnonymousClass9IZ(Medium medium, Integer num, boolean z) {
        0qQ.A0B(medium, 1);
        0qQ.A0B(num, 2);
        this.A03 = medium;
        this.A00 = num;
        this.A01 = z;
    }

    public AnonymousClass9IZ(ImageUrl imageUrl, WeakReference weakReference, boolean z) {
        this.A03 = imageUrl;
        this.A00 = weakReference;
        this.A01 = z;
    }

    public AnonymousClass9IZ(User user, Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
        this.A03 = user;
    }
}
