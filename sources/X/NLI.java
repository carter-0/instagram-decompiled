package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.banner.IgdsBanner;

public final class NLI extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLI(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-879105471);
        C70345O2x.A00((C61057Jvv) obj, (C67859Mw3) DbT.A0o(view));
        AnonymousClass0fD.A0A(1328689219, A03);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3kE, java.lang.Object, X.Mw3] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-925804334);
        Context context = this.A00;
        0qQ.A0B(context, 0);
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        ? r0 = new C249703kE(igdsBanner);
        r0.A00 = igdsBanner;
        igdsBanner.setTag(r0);
        View A0F = JTO.A0F(r0);
        AnonymousClass0fD.A0A(225717657, A03);
        return A0F;
    }
}
