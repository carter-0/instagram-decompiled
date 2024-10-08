package X;

import android.graphics.PointF;
import com.instagram.api.schemas.FBTagType;
import java.util.ArrayList;

/* renamed from: X.3pq  reason: invalid class name and case insensitive filesystem */
public abstract class C252873pq {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.model.fbusertag.FBUserTag$FBUserInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.instagram.model.fbusertag.FBUserTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    public static final ArrayList A00(C65281bi r14) {
        PointF pointF;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList = new ArrayList();
        for (DU8 du8 : r14.CHj()) {
            if (du8.B4d() != null) {
                DUP B4d = du8.B4d();
                String str6 = null;
                if (B4d != null) {
                    String fullName = B4d.getFullName();
                    boolean z = false;
                    if (!(fullName == null || fullName.length() == 0)) {
                        if (du8.Bdo().size() == 2) {
                            pointF = new PointF(((Number) du8.Bdo().get(0)).floatValue(), ((Number) du8.Bdo().get(1)).floatValue());
                        } else {
                            pointF = null;
                        }
                        String C3u = du8.C3u();
                        DUP B4d2 = du8.B4d();
                        if (B4d2 != null) {
                            str = B4d2.B4L();
                        } else {
                            str = null;
                        }
                        DUP B4d3 = du8.B4d();
                        if (B4d3 != null) {
                            str2 = B4d3.getFullName();
                        } else {
                            str2 = null;
                        }
                        DUP B4d4 = du8.B4d();
                        if (B4d4 != null) {
                            str3 = B4d4.Bgr();
                        } else {
                            str3 = null;
                        }
                        DUP B4d5 = du8.B4d();
                        if (B4d5 != null) {
                            str4 = B4d5.Bh8();
                        } else {
                            str4 = null;
                        }
                        DUP B4d6 = du8.B4d();
                        if (B4d6 != null) {
                            str5 = B4d6.BhP();
                        } else {
                            str5 = null;
                        }
                        DUP B4d7 = du8.B4d();
                        if (B4d7 != null) {
                            str6 = B4d7.getUsername();
                        }
                        ? obj = new Object();
                        obj.A05 = C3u;
                        obj.A00 = str;
                        obj.A01 = str2;
                        obj.A02 = str3;
                        obj.A03 = str4;
                        obj.A04 = str5;
                        obj.A06 = str6;
                        String C3u2 = du8.C3u();
                        Boolean Ab9 = du8.Ab9();
                        if (Ab9 != null) {
                            z = Ab9.booleanValue();
                        }
                        FBTagType B4Z = du8.B4Z();
                        ? obj2 = new Object();
                        obj2.A02 = obj;
                        obj2.A03 = C3u2;
                        obj2.A04 = z;
                        obj2.A01 = B4Z;
                        obj2.A00 = pointF;
                        obj2.A00 = pointF;
                        arrayList.add(obj2);
                    }
                }
            }
        }
        return arrayList;
    }
}
