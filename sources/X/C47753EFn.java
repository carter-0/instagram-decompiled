package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EFn  reason: case insensitive filesystem */
public final class C47753EFn extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        r3.itemView.getTag().getClass();
        throw AnonymousClass7TE.A11("privacyText");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Eb7] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.privacy_footer);
        ? obj = new Object();
        obj.A00 = (TextView) A0C;
        A0C.setTag(obj);
        return new C249703kE(A0C);
    }

    public final Class modelClass() {
        return EGR.class;
    }
}
