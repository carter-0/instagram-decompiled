package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Lm3  reason: case insensitive filesystem */
public final class C65025Lm3 implements C314446iH, AnonymousClass8BL, C252213ok {
    public C71662eb A00;
    public AnonymousClass8BQ A01;
    public AnonymousClass88K A02;
    public InteractiveDrawableContainer A03;
    public final View A04;
    public final AnonymousClass4DH A05;
    public final UserSession A06;
    public final AnonymousClass3E6 A07 = AnonymousClass3E4.A01(this, false, false);
    public final AnonymousClass0eM A08 = C66305MMo.A01(this, 2);
    public final AnonymousClass0eM A09 = C66305MMo.A01(this, 3);
    public final AnonymousClass0eM A0A = C66305MMo.A01(this, 4);
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new C66305MMo(this, 5));
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(C41653Ay5.A00);
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new C66305MMo(this, 12));
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(new C66305MMo(this, 13));
    public final AnonymousClass0eM A0F;

    public C65025Lm3(View view, AnonymousClass4DH r11, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A05 = r11;
        this.A06 = userSession;
        this.A04 = view;
        C66305MMo mMo = new C66305MMo(this, 14);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66305MMo(new C66305MMo(r11, 6), 7));
        this.A0F = DbS.A0I(new C66305MMo(A002, 8), mMo, new MJ6(13, (Object) null, A002), DbS.A0z(C60198JhH.class));
    }

    public final boolean COT() {
        return false;
    }

    public final void D4X(AnonymousClass8BU r1, int i, int i2) {
    }

    public final void D4Y(int i, float f, float f2) {
    }

    public final void DIC(boolean z, int i) {
    }

    public final void DMr(int i, boolean z) {
    }

    public final /* synthetic */ AnonymousClass89Y AYe() {
        return null;
    }

    public final /* synthetic */ boolean CJX() {
        return false;
    }

    public final void D48(AnonymousClass89Y r6) {
        C60198JhH jhH = (C60198JhH) this.A0F.getValue();
        C40377AbA abA = (C40377AbA) this.A0D.getValue();
        boolean z = false;
        if (abA != null) {
            z = AHO.A03(abA.A0R.getAllDrawables(), false, false);
        }
        LES les = jhH.A00;
        les.A0Q.Epw(false);
        AnonymousClass7TF.A1O(les.A08, z);
        jhH.A04.Epw(false);
    }

    public final void DV9(AnonymousClass89Y r3) {
        AnonymousClass7TF.A1O(((C60198JhH) this.A0F.getValue()).A00.A0Q, true);
    }
}
