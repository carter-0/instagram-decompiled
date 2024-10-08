package X;

import android.content.Context;
import com.instagram.business.fragment.CategorySearchFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.E8p  reason: case insensitive filesystem */
public final class C47577E8p extends C331047Ph {
    public final Context A00;
    public final C47607E9t A01;
    public final CategorySearchFragment A02;
    public final C46437Dez A03;

    public static final void A00(C47577E8p e8p, FYO fyo, List list) {
        String str;
        if (fyo != null) {
            str = fyo.A01;
        } else {
            str = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FYO fyo2 = (FYO) it.next();
            String str2 = fyo2.A01;
            if (str2.length() != 0) {
                String str3 = fyo2.A02;
                if (str3.length() != 0) {
                    boolean equals = str2.equals(str);
                    EyQ eyQ = new EyQ(str3, new FPE(19, (Object) fyo2, (Object) e8p));
                    eyQ.A00 = equals;
                    e8p.A08(e8p.A01, eyQ);
                }
            }
        }
    }

    public C47577E8p(Context context, CategorySearchFragment categorySearchFragment) {
        this.A00 = context;
        this.A02 = categorySearchFragment;
        C46437Dez dez = new C46437Dez(context);
        this.A03 = dez;
        C47607E9t e9t = new C47607E9t(context, categorySearchFragment);
        this.A01 = e9t;
        A0B(dez, e9t);
    }
}
