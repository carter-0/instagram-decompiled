package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7Kk  reason: invalid class name and case insensitive filesystem */
public final class C329837Kk {
    public C71029OZg A00;
    public boolean A01;
    public final FrameLayout A02;
    public final C72292P0j A03 = new Object();
    public final C329127Hr A04;
    public final List A05;
    public final Context A06;
    public final ViewStub A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.P0j] */
    public C329837Kk(Context context, ViewStub viewStub, AnonymousClass0iw r5, UserSession userSession, C329127Hr r7, List list) {
        this.A09 = userSession;
        this.A06 = context;
        this.A07 = viewStub;
        this.A08 = r5;
        this.A04 = r7;
        this.A05 = list;
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.A02 = (FrameLayout) inflate;
    }
}
