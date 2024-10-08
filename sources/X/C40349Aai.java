package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Aai  reason: case insensitive filesystem */
public final class C40349Aai implements C355038Oi {
    public final ImageView A00;
    public final ImageView A01;
    public final C355028Oh A02;

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

    public final void FJo(Spannable spannable, C3499582p r4, AnonymousClass80V r5, AnonymousClass80X r6, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        0qQ.A0B(r5, 0);
        AnonymousClass7TG.A1U(r6, num, r4);
        if (!C355098Oo.A08(r5, r6)) {
            C355098Oo.A03(this.A00, !this.A02.A03());
            C355098Oo.A03(this.A01, C355098Oo.A07(r4.A02));
        }
    }

    public final /* synthetic */ C351988Bf AuL() {
        return null;
    }

    public final /* synthetic */ int Bt9() {
        return 0;
    }

    public final void D19(boolean z) {
        C355098Oo.A03(this.A00, z);
        C355098Oo.A03(this.A01, z);
    }

    public C40349Aai(ViewStub viewStub, C355028Oh r6, C351978Be r7) {
        this.A02 = r6;
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_open_carousel);
        View inflate = viewStub.inflate();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        if (imageView != null) {
            C386359kT.A01(AnonymousClass7TE.A0m(imageView), r7, 23);
        } else {
            imageView = null;
        }
        this.A00 = imageView;
        View findViewById = inflate.findViewById(R.id.save_button_view_stub);
        if (findViewById != null) {
            View inflate2 = ((ViewStub) findViewById).inflate();
            0qQ.A0C(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) inflate2;
            C355098Oo.A03(imageView2, false);
            C386359kT.A01(AnonymousClass7TE.A0m(imageView2), r7, 24);
            this.A01 = imageView2;
            return;
        }
        throw AnonymousClass7TE.A0y();
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
