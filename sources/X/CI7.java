package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CI7 extends 17P implements C337317g7 {
    public List A00;

    public final C337317g7 E74(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(111578632, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1P(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }
}
