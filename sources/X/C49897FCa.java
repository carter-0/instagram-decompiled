package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.phonenumber.model.CountryCodeData;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* renamed from: X.FCa  reason: case insensitive filesystem */
public abstract class C49897FCa {
    public static final boolean A02(String str, String str2) {
        String str3;
        if (str == null) {
            return str2 == null;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1a = Dbb.A1a(str, i2);
            if (z) {
                if (!A1a) {
                    break;
                }
                length--;
            } else if (!A1a) {
                z = true;
            } else {
                i++;
            }
        }
        String A0c = Dba.A0c(str, length, i);
        if (str2 != null) {
            int length2 = str2.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length2) {
                int i4 = length2;
                if (!z2) {
                    i4 = i3;
                }
                boolean A1a2 = Dbb.A1a(str2, i4);
                if (z2) {
                    if (!A1a2) {
                        break;
                    }
                    length2--;
                } else if (!A1a2) {
                    z2 = true;
                } else {
                    i3++;
                }
            }
            str3 = Dba.A0c(str2, length2, i3);
        } else {
            str3 = null;
        }
        return 0qQ.A0K(A0c, str3);
    }

    public static final long A00(String str) {
        if (str == null) {
            return 0;
        }
        CRC32 crc32 = new CRC32();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(str, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        String A0c = Dba.A0c(str, length, i);
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        0qQ.A07(forName);
        byte[] bytes = A0c.getBytes(forName);
        0qQ.A07(bytes);
        crc32.update(bytes);
        return crc32.getValue();
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.EzU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.EzU, java.lang.Object] */
    public static final String A01(Context context, CountryCodeData countryCodeData, String str, String str2, List list, List list2) {
        AnonymousClass7TG.A1N(context, countryCodeData);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C48254EbZ ebZ = (C48254EbZ) list.get(i);
                String str3 = ebZ.A02;
                String str4 = null;
                if (str3 != null) {
                    try {
                        str4 = String.valueOf(PhoneNumberUtil.A01(context).A0F(str3, countryCodeData.A00).A02);
                    } catch (C231962sh unused) {
                    }
                }
                String str5 = ebZ.A01;
                long A00 = A00(str4);
                boolean A1Q = AnonymousClass7TF.A1Q(i);
                boolean A02 = A02(str, str4);
                ? obj = new Object();
                obj.A01 = str5;
                obj.A00 = A00;
                obj.A03 = A1Q;
                obj.A02 = A02;
                A1C.add(obj);
            }
        }
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C48254EbZ ebZ2 = (C48254EbZ) list2.get(i2);
                String str6 = ebZ2.A01;
                long A002 = A00(ebZ2.A02);
                boolean A1Q2 = AnonymousClass7TF.A1Q(i2);
                boolean A022 = A02(str2, ebZ2.A02);
                ? obj2 = new Object();
                obj2.A01 = str6;
                obj2.A00 = A002;
                obj2.A03 = A1Q2;
                obj2.A02 = A022;
                A1C2.add(obj2);
            }
        }
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            16P.A03(A0K, "p");
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                C49611EzU ezU = (C49611EzU) it.next();
                if (ezU != null) {
                    C49197Er2.A00(A0K, ezU);
                }
            }
            A0K.A0Y();
            16P.A03(A0K, "e");
            Iterator it2 = A1C2.iterator();
            while (it2.hasNext()) {
                C49611EzU ezU2 = (C49611EzU) it2.next();
                if (ezU2 != null) {
                    C49197Er2.A00(A0K, ezU2);
                }
            }
            A0K.A0Y();
            return AnonymousClass7TG.A0k(A0K, stringWriter);
        } catch (IOException unused2) {
            return "";
        }
    }
}
