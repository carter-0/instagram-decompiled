package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

public final class TJZ implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ A9z A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ boolean A03;

    public TJZ(Context context, A9z a9z, Map map, boolean z) {
        this.A02 = map;
        this.A00 = context;
        this.A03 = z;
        this.A01 = a9z;
    }

    public final void run() {
        try {
            SlD A002 = RUF.A00();
            Iterator A0u = AnonymousClass7TF.A0u(this.A02);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String str = (String) A1J.getKey();
                AbstractCollection abstractCollection = (AbstractCollection) A1J.getValue();
                if (!TextUtils.isEmpty(str) && abstractCollection != null) {
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        A002.ESs(new C10773Rxr(this.A00, A002, this.A01, str, str2, this.A03), str, str2);
                    }
                }
            }
            if (this.A03) {
                A002.flush();
            }
        } catch (Exception unused) {
        }
    }
}
