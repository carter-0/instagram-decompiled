package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.MzO  reason: case insensitive filesystem */
public final class C68057MzO extends C249703kE implements C328017Dc {
    public C328087Dj A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final OIQ A04;
    public final AnonymousClass9HC A05;
    public final OWC A06;
    public final AnonymousClass7L2 A07;
    public final AnonymousClass7EA A08;
    public final AnonymousClass7D6 A09;
    public final C71859Os0 A0A;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0iw, X.Os0, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68057MzO(Context context, View view, UserSession userSession, OIQ oiq, C72517P9a p9a, AnonymousClass9HC r9, AnonymousClass7L2 r10, int i) {
        super(view);
        C51974G9v.A0d(3, oiq, p9a, userSession, context);
        AnonymousClass7TF.A1F(r9, 7, r10);
        this.A01 = i;
        this.A04 = oiq;
        this.A03 = userSession;
        this.A02 = context;
        this.A05 = r9;
        this.A07 = r10;
        OWC owc = new OWC(view, userSession);
        this.A06 = owc;
        ? obj = new Object();
        this.A0A = obj;
        this.A09 = new AnonymousClass7D6(obj, p9a);
        this.A08 = new AnonymousClass7EA(owc.A02, p9a);
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
