package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;

/* renamed from: X.EFf  reason: case insensitive filesystem */
public final class C47745EFf extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        r3.itemView.getTag().getClass();
        throw AnonymousClass7TE.A11(DialogModule.KEY_TITLE);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0A = DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.direct_dismissable_nux_row, false);
        A0A.setTag(new C46960DoE(A0A));
        return new C249703kE(A0A);
    }

    public final Class modelClass() {
        return EGQ.class;
    }
}
