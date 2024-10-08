package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Aaf  reason: case insensitive filesystem */
public final class C40346Aaf implements C355038Oi {
    public final ImageView A00;
    public final ImageView A01;

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

    public final void FJo(Spannable spannable, C3499582p r5, AnonymousClass80V r6, AnonymousClass80X r7, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        0qQ.A0B(r6, 0);
        AnonymousClass7TG.A1U(r7, num, r5);
        AnonymousClass80V r2 = AnonymousClass80V.MEDIA_EDIT;
        C355098Oo.A03(this.A01, AnonymousClass7TF.A1W(r6, r2));
        ImageView imageView = this.A00;
        if (imageView != null) {
            C355098Oo.A03(imageView, AnonymousClass7TF.A1W(r6, r2));
            C355098Oo.A04(imageView, num);
        }
    }

    public final /* synthetic */ C351988Bf AuL() {
        return null;
    }

    public final /* synthetic */ int Bt9() {
        return 0;
    }

    public C40346Aaf(ViewStub viewStub, C351978Be r7) {
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_selfie_sticker);
        View inflate = viewStub.inflate();
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        ImageView imageView2 = null;
        if (imageView != null) {
            C386359kT.A01(AnonymousClass7TE.A0m(imageView), r7, 21);
        } else {
            imageView = null;
        }
        this.A01 = imageView;
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.video_mute_button);
        if (imageView3 != null) {
            C355098Oo.A03(imageView3, false);
            C386359kT.A01(AnonymousClass7TE.A0m(imageView3), r7, 22);
            imageView2 = imageView3;
        }
        this.A00 = imageView2;
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
