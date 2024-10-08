package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.IIw  reason: case insensitive filesystem */
public final class C56952IIw implements C253183qL {
    public static final C56952IIw A00 = new Object();

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        TextView textView;
        View view = (View) obj;
        C247213fx r4 = (C247213fx) obj2;
        AnonymousClass7TG.A1O(view, r4);
        if (!(view instanceof TextView) || (textView = (TextView) view) == null) {
            throw AnonymousClass7TE.A0z("expected TextView");
        }
        r4.A00 = textView;
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C247213fx r4 = (C247213fx) obj2;
        0qQ.A0B(r4, 2);
        r4.A00 = null;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
