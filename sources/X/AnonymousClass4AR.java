package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4AR  reason: invalid class name */
public final class AnonymousClass4AR extends C232232tF {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        0qQ.A0B((Object) null, 0);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.layout_spotlight_tray_item, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new UE6(inflate, this.A00, this.A01, this.A02);
    }

    public final Class modelClass() {
        return AnonymousClass4AV.class;
    }

    public AnonymousClass4AR(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }
}
