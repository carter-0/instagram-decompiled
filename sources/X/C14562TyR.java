package X;

import android.content.Context;
import android.view.TouchDelegate;
import android.view.View;
import java.util.List;

/* renamed from: X.TyR  reason: case insensitive filesystem */
public final class C14562TyR implements C253183qL {
    public final /* synthetic */ List A00;

    public C14562TyR(List list) {
        this.A00 = list;
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        C70682Ty r4 = (C70682Ty) obj;
        r4.setTouchDelegate(new C14563TyS(r4, this.A00));
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setTouchDelegate((TouchDelegate) null);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
