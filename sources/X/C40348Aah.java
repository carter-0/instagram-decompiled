package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;

/* renamed from: X.Aah  reason: case insensitive filesystem */
public final class C40348Aah implements C355038Oi {
    public final ViewGroup A00;
    public final ImageView A01;
    public final IgdsMediaButton A02;

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
        boolean A1U = AnonymousClass7TF.A1U(0, r7, r8);
        AnonymousClass7TG.A1Q(num, r6);
        boolean A08 = C355098Oo.A08(r7, r8);
        View[] viewArr = {this.A01};
        if (A08) {
            C355098Oo.A05(viewArr, false);
            C355098Oo.A03(this.A02, false);
            return;
        }
        C355098Oo.A05(viewArr, A1U);
        C355098Oo.A03(this.A02, A1U);
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
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.5n1] */
    public C40348Aah(ViewStub viewStub, C351978Be r7, TargetViewSizeProvider targetViewSizeProvider) {
        viewStub.setLayoutResource(R.layout.layout_post_capture_button_birthday_selfie);
        View inflate = viewStub.inflate();
        0qQ.A0A(inflate);
        C355098Oo.A00(inflate, R.layout.layout_post_capture_button_share_container_birthday_selfie);
        ViewGroup viewGroup = (ViewGroup) inflate.requireViewById(R.id.birthday_selfie_post_capture_button_share_container);
        this.A00 = viewGroup;
        AnonymousClass81Y.A03(viewGroup, targetViewSizeProvider);
        CreationActionBar creationActionBar = (CreationActionBar) AnonymousClass7TF.A0F(viewGroup, R.id.birthday_selfie_story_share_controls_action_bar);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cancel_button);
        if (imageView != null) {
            C386359kT.A01(AnonymousClass7TE.A0m(imageView), r7, 17);
        } else {
            imageView = null;
        }
        this.A01 = imageView;
        IgdsMediaButton A0D = creationActionBar.A0D((Integer) null);
        A0D.setButtonStyle(C296235pj.PRIMARY);
        ? obj = new Object();
        obj.A00 = R.drawable.chevron_right;
        A0D.setStartAddOn(obj, A0D.getContext().getString(2131953815));
        this.A02 = A0D;
        2eS.A01(A0D);
        C386359kT.A01(AnonymousClass7TE.A0m(A0D), r7, 18);
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
