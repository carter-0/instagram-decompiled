package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Log  reason: case insensitive filesystem */
public final class C65177Log implements MVS {
    public final C66576MXh A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.TEMP_CAMERA_TOOL;
    public final AnonymousClass4DH A02;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        View A08 = DbU.A08(DbV.A0E(this.A02), R.layout.internal_post_toggle_row);
        View requireViewById = A08.requireViewById(R.id.internal_post_toggle_row_switch);
        0qQ.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.igds.components.switchbutton.IgdsSwitch");
        ((IgdsSwitch) requireViewById).A07 = new C65369LsA(this, 16);
        return A08;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65177Log(AnonymousClass4DH r2, C66576MXh mXh) {
        AnonymousClass7TG.A1O(r2, mXh);
        this.A02 = r2;
        this.A00 = mXh;
    }
}
