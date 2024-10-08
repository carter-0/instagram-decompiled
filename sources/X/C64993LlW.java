package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.LlW  reason: case insensitive filesystem */
public final class C64993LlW implements AnonymousClass8BL, AnonymousClass8LV {
    public Bitmap A00;
    public C71662eb A01;
    public InteractiveDrawableContainer A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;

    public C64993LlW(View view, AnonymousClass4DH r9, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A03 = r9;
        this.A04 = userSession;
        C66298MMh A012 = C66298MMh.A01(this, 47);
        AnonymousClass0eM A002 = C66298MMh.A00(C66298MMh.A01(r9, 44), 0eO.A02, 45);
        this.A0A = DbS.A0I(C66298MMh.A01(A002, 46), A012, new MJ6(11, (Object) null, A002), DbS.A0z(C60159Jge.class));
        this.A08 = AnonymousClass1YB.A00(C66298MMh.A01(view, 42));
        this.A09 = AnonymousClass1YB.A00(C66298MMh.A01(view, 43));
        this.A06 = AnonymousClass1YB.A00(C66298MMh.A01(view, 41));
        this.A07 = AnonymousClass0eN.A01(new MJ6(10, view, this));
        this.A05 = AnonymousClass0eN.A01(new MJ6(9, view, this));
    }

    public final void D4Y(int i, float f, float f2) {
    }

    public final /* synthetic */ void DDq() {
    }

    public final /* synthetic */ void DDt() {
    }

    public final /* synthetic */ void DDu() {
    }

    public final /* synthetic */ void DDv(int i) {
    }

    public final void DIC(boolean z, int i) {
    }

    public final void D4X(AnonymousClass8BU r4, int i, int i2) {
        2YL A0H = DbS.A0H(this.A0A);
        C66169MGg.A01(r4, A0H, C318116oQ.A00(A0H), 41);
    }

    public final void DDs(int i) {
        2YL A0H = DbS.A0H(this.A0A);
        MG2.A01(A0H, C318116oQ.A00(A0H), 8);
    }
}
