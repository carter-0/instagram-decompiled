package X;

import android.os.LocaleList;
import java.util.ArrayList;

/* renamed from: X.5hq  reason: invalid class name and case insensitive filesystem */
public final class C291765hq implements C291775hr {
    public LocaleList A00;
    public C286155Ud A01;
    public final C286335Ux A02 = new Object();

    public final C286155Ud Atj() {
        C286155Ud r1;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.A02) {
            r1 = this.A01;
            if (r1 == null || localeList != this.A00) {
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new C291785hs(localeList.get(i)));
                }
                r1 = new C286155Ud(arrayList);
                this.A00 = localeList;
                this.A01 = r1;
            }
        }
        return r1;
    }
}
