package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import java.util.ArrayList;

public final class Lm5 implements C355038Oi {
    public final IgFormField A00;
    public final ViewGroup A01;
    public final IgdsButton A02;

    public final void D19(boolean z) {
    }

    public final /* synthetic */ void DKK(boolean z) {
    }

    public final void EI2() {
    }

    public final /* synthetic */ void EIG() {
    }

    public final /* synthetic */ void EPT(boolean z) {
    }

    public final void ESI(GradientDrawable.Orientation orientation, int[] iArr, int i) {
    }

    public final void ESJ(String str) {
    }

    public final /* synthetic */ void Eck(boolean z) {
    }

    public final /* synthetic */ void Ef3(String str, Integer num) {
    }

    public final void En3(boolean z) {
    }

    public final void FJo(Spannable spannable, C3499582p r6, AnonymousClass80V r7, AnonymousClass80X r8, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        0qQ.A0B(r7, 0);
        DbZ.A0t(1, r8, num, r6);
        boolean A08 = C355098Oo.A08(r7, r8);
        View[] viewArr = {this.A02};
        if (A08) {
            C355098Oo.A05(viewArr, false);
            C355098Oo.A05(new View[]{this.A01}, false);
            return;
        }
        C355098Oo.A05(viewArr, true);
        C355098Oo.A05(new View[]{this.A01}, true);
    }

    public final /* synthetic */ C351988Bf AuL() {
        return null;
    }

    public final /* synthetic */ int Bt9() {
        return 0;
    }

    public Lm5(ViewStub viewStub, C351978Be r5) {
        ViewGroup A0C = DbU.A0C(JTP.A0H(viewStub, R.layout.layout_post_capture_button_potato), R.id.potato_button_share_container);
        this.A01 = A0C;
        IgFormField igFormField = (IgFormField) A0C.findViewById(R.id.prompt);
        this.A00 = igFormField;
        igFormField.setLabelText("Add a prompt...");
        IgdsButton igdsButton = (IgdsButton) A0C.findViewById(R.id.share_button);
        this.A02 = igdsButton;
        LY8.A00(igdsButton, 61, r5, this);
    }

    public final /* synthetic */ ArrayList CFd() {
        return AnonymousClass7TE.A1C();
    }

    public final /* synthetic */ boolean D79(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean Esi(float f, float f2) {
        return false;
    }
}
