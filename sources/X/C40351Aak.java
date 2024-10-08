package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;

/* renamed from: X.Aak  reason: case insensitive filesystem */
public final class C40351Aak implements C355038Oi {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final ImageView A02;
    public final ImageView A03;
    public final UserSession A04;
    public final C355028Oh A05;

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

    public final /* synthetic */ C351988Bf AuL() {
        return null;
    }

    public final /* synthetic */ int Bt9() {
        return 0;
    }

    public final void D19(boolean z) {
        int i = 8;
        if (z) {
            i = 0;
        }
        this.A00.setVisibility(i);
        this.A01.setVisibility(i);
    }

    public C40351Aak(ViewStub viewStub, UserSession userSession, C355028Oh r6, C351978Be r7, TargetViewSizeProvider targetViewSizeProvider) {
        this.A04 = userSession;
        this.A05 = r6;
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_direct_epd);
        View inflate = viewStub.inflate();
        this.A00 = (ViewGroup) inflate.requireViewById(R.id.edit_buttons_toolbar);
        ImageView imageView = (ImageView) inflate.requireViewById(R.id.cancel_button);
        this.A02 = imageView;
        C386359kT.A01(AnonymousClass7TE.A0m(imageView), r7, 19);
        View findViewById = inflate.findViewById(R.id.save_button_view_stub);
        if (findViewById != null) {
            View inflate2 = ((ViewStub) findViewById).inflate();
            0qQ.A0C(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) inflate2;
            this.A03 = imageView2;
            2eS.A01(imageView2);
            C386359kT.A01(AnonymousClass7TE.A0m(imageView2), r7, 20);
            C355098Oo.A00(inflate, R.layout.layout_post_capture_button_share_container_direct_reply);
            ViewGroup viewGroup = (ViewGroup) inflate.requireViewById(R.id.post_capture_button_share_container);
            this.A01 = viewGroup;
            AnonymousClass81Y.A03(viewGroup, targetViewSizeProvider);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* synthetic */ ArrayList CFd() {
        return AnonymousClass7TE.A1C();
    }

    public final void FJo(Spannable spannable, C3499582p r5, AnonymousClass80V r6, AnonymousClass80X r7, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean A1Z = AnonymousClass7TG.A1Z(r6, r7);
        AnonymousClass7TG.A1Q(num, r5);
        if (!C355098Oo.A08(r6, r7)) {
            C355098Oo.A03(this.A02, !this.A05.A03());
            C355098Oo.A03(this.A03, C355098Oo.A07(r5.A02));
            C355098Oo.A06(new View[]{this.A00}, A1Z, A1Z);
        }
    }

    public final /* synthetic */ boolean D79(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean Esi(float f, float f2) {
        return false;
    }
}
