package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;

/* renamed from: X.Aal  reason: case insensitive filesystem */
public final class C40352Aal implements C355038Oi {
    public final View A00;
    public final ImageView A01;
    public final RelativeLayout A02;
    public final IgLinearLayout A03;
    public final C355048Oj A04;
    public final IgdsMediaButton A05;

    public final /* synthetic */ void DKK(boolean z) {
    }

    public final void EI2() {
    }

    public final /* synthetic */ void EIG() {
    }

    public final /* synthetic */ void EPT(boolean z) {
    }

    public final void ESJ(String str) {
    }

    public final /* synthetic */ void Eck(boolean z) {
    }

    public final /* synthetic */ void Ef3(String str, Integer num) {
    }

    public final void En3(boolean z) {
    }

    public final void FJo(Spannable spannable, C3499582p r24, AnonymousClass80V r25, AnonymousClass80X r26, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        AnonymousClass80V r5 = r25;
        0qQ.A0B(r5, 0);
        C3499582p r4 = r24;
        AnonymousClass80X r6 = r26;
        Integer num2 = num;
        AnonymousClass7TG.A1U(r6, num2, r4);
        this.A04.A0O(r4, r5, r6, num2, z, z2, z3, z4, z5, z6, false, false, false, false, false, false, false, false);
        boolean z16 = !C355098Oo.A08(r5, r6);
        C355098Oo.A03(this.A05, z16);
        C355098Oo.A03(this.A01, z16);
        C355098Oo.A03(this.A03, z16);
        C355098Oo.A03(this.A02, false);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.5n1] */
    public C40352Aal(Activity activity, Context context, ViewStub viewStub, AnonymousClass4DH r31, C3503284f r32, UserSession userSession, C355028Oh r34, C351978Be r35, TargetViewSizeProvider targetViewSizeProvider, C3499582p r37, AnonymousClass846 r38) {
        Activity activity2 = activity;
        Context context2 = context;
        UserSession userSession2 = userSession;
        C351978Be r3 = r35;
        C355048Oj r7 = new C355048Oj(activity2, context2, (View) null, viewStub, r31, r32, userSession2, (C357638Yz) null, r34, r3, targetViewSizeProvider, r37, r38, (AnonymousClass8B2) null, (AnonymousClass88B) null, R.layout.layout_post_capture_button_share_container_subscription_welcome_story, false, false, false);
        this.A04 = r7;
        View A0N = r7.A0N();
        this.A00 = A0N;
        IgLinearLayout igLinearLayout = (IgLinearLayout) AnonymousClass7TF.A0F(A0N, R.id.post_capture_button_share_container);
        this.A03 = igLinearLayout;
        ImageView imageView = null;
        IgdsMediaButton A0D = ((CreationActionBar) AnonymousClass7TF.A0F(igLinearLayout, R.id.subscriptions_welcome_story_share_controls_action_bar)).A0D((Integer) null);
        A0D.setButtonStyle(C296235pj.PRIMARY);
        ? obj = new Object();
        obj.A00 = R.drawable.chevron_right;
        A0D.setStartAddOn(obj, context2.getString(2131955106));
        this.A05 = A0D;
        ImageView imageView2 = (ImageView) A0N.findViewById(R.id.cancel_button);
        if (imageView2 != null) {
            C386359kT.A01(AnonymousClass7TE.A0m(imageView2), activity2, 25);
            imageView = imageView2;
        }
        this.A01 = imageView;
        this.A02 = (RelativeLayout) A0N.findViewById(R.id.camera_resize_button);
        2eS.A01(A0D);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0D);
        A0m.A04 = new AZF(activity2, context2, userSession2, r3);
        A0m.A00();
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
        this.A03.setVisibility(i);
    }

    public final /* synthetic */ ArrayList CFd() {
        return AnonymousClass7TE.A1C();
    }

    public final void ESI(GradientDrawable.Orientation orientation, int[] iArr, int i) {
        AnonymousClass7TG.A1N(orientation, iArr);
        this.A04.A0r.A02(orientation, iArr, i);
    }

    public final /* synthetic */ boolean D79(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean Esi(float f, float f2) {
        return false;
    }
}
