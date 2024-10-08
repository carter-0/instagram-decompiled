package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.46g  reason: invalid class name and case insensitive filesystem */
public abstract class C2605846g {
    public static C257553xa parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("ad_id".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("position".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            arrayList.add(new Float(r8.A0U()));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new C257553xa(str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C257553xa r3) {
        r2.A0c();
        String str = r3.A00;
        if (str != null) {
            r2.A0R("ad_id", str);
        }
        List<Number> list = r3.A03;
        if (list != null) {
            16P.A03(r2, "position");
            for (Number number : list) {
                if (number != null) {
                    r2.A0f(number.floatValue());
                }
            }
            r2.A0Y();
        }
        String str2 = r3.A01;
        if (str2 != null) {
            r2.A0R("subtitle", str2);
        }
        String str3 = r3.A02;
        if (str3 != null) {
            r2.A0R(DialogModule.KEY_TITLE, str3);
        }
        r2.A0Z();
    }
}
