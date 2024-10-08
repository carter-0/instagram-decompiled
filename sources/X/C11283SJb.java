package X;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SJb  reason: case insensitive filesystem */
public final class C11283SJb {
    public static final Map A06 = AnonymousClass7TF.A0w("ig4a_media_accuracy_dyn_sampling", "gk:ig4a_media_accuracy_dyn_sampling");
    public final S5Y A00;
    public final File A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05 = DbS.A0y();

    public C11283SJb(S5Y s5y, File file, String str, Map map) {
        0qQ.A0B(str, 2);
        this.A03 = str;
        this.A00 = s5y;
        this.A04 = map;
        this.A01 = JTO.A0s(file, "media_accuracy");
        this.A02 = 002.A0C(str, '_');
    }

    public final List A00(String str, boolean z) {
        String str2;
        ArrayList arrayList;
        QOy qOy;
        Integer num;
        ArrayList arrayList2 = null;
        if (z) {
            str2 = "_ready.png";
        } else {
            str2 = "_snapshot.png";
        }
        try {
            File file = this.A01;
            String[] list = file.list(new T96(this, str2));
            if (list != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (String str3 : list) {
                    List A0R = 00l.A0R(00l.A0G(str2, 00l.A0F(this.A02, str3)), new String[]{"_"}, 2);
                    if (A0R.size() != 2) {
                        qOy = null;
                    } else {
                        Long A10 = AnonymousClass7TE.A10(AnonymousClass7TE.A19(A0R, 0));
                        if (A10 != null) {
                            long longValue = A10.longValue();
                            String A0t = DbU.A0t(A0R, 1);
                            String str4 = this.A03;
                            String A0u = JTP.A0u(JTO.A0s(file, str3));
                            if (0qQ.A0K(A0t, "0")) {
                                num = AnonymousClass05K.A0C;
                            } else {
                                num = AnonymousClass05K.A01;
                            }
                            qOy = new QOy(Boolean.valueOf(z), num, str4, A0t, A0u, "image/x-png", str, longValue);
                        } else {
                            qOy = null;
                        }
                    }
                    if (qOy != null) {
                        arrayList.add(qOy);
                    }
                }
            } else {
                arrayList = null;
            }
        } catch (Throwable th) {
            arrayList = JTO.A1B(th);
        }
        Throwable A002 = 0eR.A00(arrayList);
        if (A002 == null) {
            arrayList2 = arrayList;
        } else {
            this.A00.A02(AnonymousClass05K.A00, (Integer) null, (Long) null, (String) null, A002, (Map) null);
        }
        List list2 = arrayList2;
        if (list2 == null) {
            return 0sn.A00;
        }
        return list2;
    }

    public final void A02(String str) {
        Boolean bool;
        0qQ.A0B(str, 0);
        try {
            bool = Boolean.valueOf(AnonymousClass7TE.A0t(str).delete());
        } catch (Throwable th) {
            bool = JTO.A1B(th);
        }
        Throwable A002 = 0eR.A00(bool);
        if (A002 != null) {
            this.A00.A01(AnonymousClass05K.A00, (Integer) null, (Long) null, (String) null, (String) null, (String) null, A002, AnonymousClass7TF.A0w("file_name", str), (Map) null);
        }
    }

    public final void A01() {
        try {
            File file = this.A01;
            String[] list = file.list();
            0qQ.A07(list);
            for (String A0s : list) {
                A02(JTP.A0u(JTO.A0s(file, A0s)));
            }
        } catch (Throwable th) {
            new 0eQ(th);
        }
    }

    public final void A03(String str) {
        Set set = this.A05;
        String A0R = 002.A0R("media_accuracy_tags__", str);
        File file = this.A01;
        if (!file.exists()) {
            file.mkdir();
        }
        File A0s = JTO.A0s(file, A0R);
        A0s.getCanonicalPath();
        FileOutputStream A0t = JTO.A0t(A0s);
        A0t.write(C66582MXn.A1a(C66581MXm.A0w("\n", set)));
        A0t.close();
        set.clear();
    }
}
