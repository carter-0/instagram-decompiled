package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.instagram.common.session.UserSession;

/* renamed from: X.9pJ  reason: invalid class name and case insensitive filesystem */
public final class C389359pJ extends C249383je implements AnonymousClass4DV {
    public final Context A00;
    public final ViewGroup A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C238133Ar A04;
    public final AnonymousClass343 A05;

    public final C238133Ar getScrollingViewProxy() {
        return this.A04;
    }

    public C389359pJ(Context context, ViewGroup viewGroup, AnonymousClass0iw r5, UserSession userSession, AnonymousClass71P r7, C238133Ar r8) {
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = viewGroup;
        this.A02 = r5;
        this.A04 = r8;
        this.A05 = new AnonymousClass343((Adapter) r7, (AnonymousClass4DV) this, new C389049oo(this, r7));
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(-671901714);
        this.A05.A01();
        AnonymousClass0fD.A0A(-666209798, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(2083369194, AnonymousClass0fD.A03(-1239860671));
    }
}
