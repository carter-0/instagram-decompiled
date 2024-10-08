package X;

import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* renamed from: X.7Qt  reason: invalid class name and case insensitive filesystem */
public final class C331377Qt {
    public float A00;
    public 1iA A01;
    @Deprecated
    public AnonymousClass3Q2 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7Qt, java.lang.Object] */
    public static C331377Qt A00(AnonymousClass3Q2 r8, String str) {
        String str2;
        String str3;
        float f;
        List list;
        boolean A10;
        String str4;
        1iA r6 = r8.A1G;
        if (r6 == 1iA.A0a) {
            str3 = r8.A3V;
            ClipInfo clipInfo = r8.A1N;
            if (clipInfo == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("null clipinfo. pendingMedia:");
                sb.append(r8);
                0wb.A03("direct_pending_visual_meida_create", sb.toString());
            }
            r6 = r8.A1G;
            str2 = null;
            if (str3 == null) {
                if (clipInfo != null) {
                    str3 = clipInfo.A0F;
                } else {
                    str3 = null;
                }
            }
            f = r8.A02;
            list = r8.A4b;
            str4 = r8.A35;
            str4.getClass();
            A10 = false;
        } else {
            str2 = r8.A33;
            str3 = null;
            f = r8.A02;
            list = r8.A4b;
            A10 = r8.A10();
            str4 = r8.A35;
            str4.getClass();
        }
        ? obj = new Object();
        obj.A01 = r6;
        obj.A04 = str2;
        obj.A05 = str3;
        obj.A00 = f;
        obj.A07 = list;
        obj.A08 = A10;
        obj.A06 = str;
        obj.A03 = str4;
        return obj;
    }

    public final boolean A01() {
        if (this.A01 == 1iA.A0a) {
            return true;
        }
        return false;
    }
}
