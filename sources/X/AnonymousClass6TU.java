package X;

import android.content.Context;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.6TU  reason: invalid class name */
public final class AnonymousClass6TU implements C253183qL {
    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        RCTextView rCTextView = (RCTextView) obj;
        if (obj3 != null) {
            rCTextView.A05((C308186Tb) obj3);
            return null;
        }
        throw new RuntimeException("Missing text layout context!");
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((RCTextView) obj).A04();
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
