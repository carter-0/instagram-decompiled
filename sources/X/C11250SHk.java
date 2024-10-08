package X;

import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.SHk  reason: case insensitive filesystem */
public final class C11250SHk {
    public final int A00;
    public final long A01;
    public final long A02;
    public final List A03;
    public final Map A04;
    public final boolean A05;
    public final String A06;

    public static String A00(ST5 st5, Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2.startsWith("&")) {
                obj2 = obj2.substring(1);
            }
            int length = obj2.length();
            if (length > 256) {
                obj2 = Pxe.A0x(obj2, 256);
                st5.A0D(Integer.valueOf(length), obj2, "Hit param name is too long and will be trimmed");
            }
            if (!TextUtils.isEmpty(obj2)) {
                return obj2;
            }
        }
        return null;
    }

    public C11250SHk(ST5 st5, List list, Map map, int i, long j, long j2, boolean z) {
        List emptyList;
        String str;
        String A002;
        String obj;
        String A003;
        String obj2;
        AnonymousClass3Qk.A02(st5);
        AnonymousClass3Qk.A02(map);
        this.A02 = j;
        this.A05 = z;
        this.A01 = j2;
        this.A00 = i;
        if (list != null) {
            emptyList = list;
        } else {
            emptyList = Collections.emptyList();
        }
        this.A03 = emptyList;
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzbk zzbk = (zzbk) it.next();
                if ("appendVersion".equals(zzbk.A01)) {
                    str = zzbk.A00;
                    break;
                }
            }
        }
        str = null;
        this.A06 = !TextUtils.isEmpty(str) ? str : str2;
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            if (!(key == null || !key.toString().startsWith("&") || (A003 = A00(st5, A1J.getKey())) == null)) {
                Object value = A1J.getValue();
                if (value == null) {
                    obj2 = "";
                } else {
                    obj2 = value.toString();
                }
                int length = obj2.length();
                if (length > 8192) {
                    obj2 = Pxe.A0x(obj2, 8192);
                    st5.A0D(Integer.valueOf(length), obj2, "Hit param value is too long and will be trimmed");
                }
                A1E.put(A003, obj2);
            }
        }
        Iterator A0u2 = AnonymousClass7TF.A0u(map);
        while (A0u2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
            Object key2 = A1J2.getKey();
            if ((key2 == null || !key2.toString().startsWith("&")) && (A002 = A00(st5, A1J2.getKey())) != null) {
                Object value2 = A1J2.getValue();
                if (value2 == null) {
                    obj = "";
                } else {
                    obj = value2.toString();
                }
                int length2 = obj.length();
                if (length2 > 8192) {
                    obj = Pxe.A0x(obj, 8192);
                    st5.A0D(Integer.valueOf(length2), obj, "Hit param value is too long and will be trimmed");
                }
                A1E.put(A002, obj);
            }
        }
        if (!TextUtils.isEmpty(this.A06)) {
            C11304SKp.A02(A1E, "_v", this.A06);
            String str3 = this.A06;
            if (str3.equals("ma4.0.0") || str3.equals("ma4.0.1")) {
                A1E.remove("adid");
            }
        }
        this.A04 = Collections.unmodifiableMap(A1E);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ht=");
        A1A.append(this.A02);
        long j = this.A01;
        if (j != 0) {
            A1A.append(", dbId=");
            A1A.append(j);
        }
        int i = this.A00;
        if (i != 0) {
            A1A.append(", appUID=");
            A1A.append(i);
        }
        Map map = this.A04;
        ArrayList A1D = AnonymousClass7TE.A1D(map.keySet());
        Collections.sort(A1D);
        int size = A1D.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = A1D.get(i2);
            i2++;
            String str = (String) obj;
            Pxe.A1Y(A1A);
            A1A.append(str);
            A1A.append("=");
            A1A.append(DbT.A11(str, map));
        }
        return A1A.toString();
    }
}
