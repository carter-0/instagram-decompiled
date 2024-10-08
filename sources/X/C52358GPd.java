package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.GPd  reason: case insensitive filesystem */
public final class C52358GPd implements C253183qL {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;
    public final /* synthetic */ C277014uI A02;

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public C52358GPd(C307786Rm r1, C276544tV r2, C277014uI r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        0qQ.A0B(view, 1);
        view.setOnClickListener((View.OnClickListener) null);
        view.setClickable(false);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass0fU.A00(new C299155uf(this.A00, this.A01, this.A02), C51969G9p.A0P(obj));
        return null;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
