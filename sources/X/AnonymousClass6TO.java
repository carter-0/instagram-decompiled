package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.6TO  reason: invalid class name */
public final class AnonymousClass6TO implements C253183qL {
    public final C307786Rm A00;
    public final C276544tV A01;
    public final List A02;

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C64361Kj.A00().A09.A01(this.A00, (C276544tV) list.get(i), this.A01, obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C64361Kj.A00().A09.A02(this.A00, (C276544tV) list.get(i), this.A01, obj);
        }
    }

    public AnonymousClass6TO(C307786Rm r1, C276544tV r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
