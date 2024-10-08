package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.JWv  reason: case insensitive filesystem */
public final class C59758JWv extends C232232tF {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        0qQ.A0B(r6, 1);
        View view = r6.itemView;
        0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.creation.capture.gallery.partialpermission.GalleryPartialPermissionView");
        C63134Ks2.A00(this.A00, this.A01, (KHN) view, false, false);
    }

    public final Class modelClass() {
        return C64759Lhb.class;
    }

    public C59758JWv(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C249703kE(new KHN(JTU.A06(viewGroup)));
    }
}
