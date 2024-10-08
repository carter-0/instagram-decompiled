package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.LAp  reason: case insensitive filesystem */
public final class C63886LAp {
    public C262204Co A00;
    public final Context A01;
    public final View A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C270194gL A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C66305MMo(this, 49));
    public final AnonymousClass0eM A07;

    public /* synthetic */ C63886LAp(View view, AnonymousClass4DH r10, UserSession userSession, C270194gL r12) {
        Context requireContext = r10.requireContext();
        0qQ.A0B(userSession, 3);
        this.A02 = view;
        this.A03 = r10;
        this.A04 = userSession;
        this.A05 = r12;
        this.A01 = requireContext;
        MMF mmf = new MMF(this, 3);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMF(new MMF(r10, 0), 1));
        this.A07 = DbS.A0I(new MMF(A002, 2), mmf, new MJ6(17, (Object) null, A002), DbS.A0z(C60275JiW.class));
    }
}
