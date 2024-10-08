package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;

/* renamed from: X.9Pf  reason: invalid class name and case insensitive filesystem */
public final class C378289Pf implements C355038Oi {
    public final C355048Oj A00;
    public final boolean A01;

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

    public final void FJo(Spannable spannable, C3499582p r22, AnonymousClass80V r23, AnonymousClass80X r24, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        AnonymousClass80V r3 = r23;
        0qQ.A0B(r3, 0);
        C3499582p r2 = r22;
        AnonymousClass80X r4 = r24;
        Integer num2 = num;
        AnonymousClass7TG.A1U(r4, num2, r2);
        this.A00.A0O(r2, r3, r4, num2, z, z2, z3, z4, z5, z6, this.A01, false, false, false, false, false, false, false);
    }

    public C378289Pf(Activity activity, Context context, ViewStub viewStub, AnonymousClass4DH r26, C3503284f r27, UserSession userSession, C355028Oh r29, C351978Be r30, TargetViewSizeProvider targetViewSizeProvider, C3499582p r32, AnonymousClass846 r33, boolean z) {
        this.A01 = z;
        this.A00 = new C355048Oj(activity, context, (View) null, viewStub, r26, r27, userSession, (C357638Yz) null, r29, r30, targetViewSizeProvider, r32, r33, (AnonymousClass8B2) null, (AnonymousClass88B) null, R.layout.layout_post_capture_button_share_container_direct_reply, false, false, false);
    }

    public final /* synthetic */ C351988Bf AuL() {
        return null;
    }

    public final /* synthetic */ int Bt9() {
        return 0;
    }

    public final void D19(boolean z) {
        this.A00.A0P(z);
    }

    public final void DKK(boolean z) {
        this.A00.A0Q(z);
    }

    public final /* synthetic */ ArrayList CFd() {
        return AnonymousClass7TE.A1C();
    }

    public final void ESI(GradientDrawable.Orientation orientation, int[] iArr, int i) {
        AnonymousClass7TG.A1N(orientation, iArr);
        this.A00.A0r.A02(orientation, iArr, i);
    }

    public final /* synthetic */ boolean D79(View view, MotionEvent motionEvent) {
        return false;
    }

    public final /* synthetic */ boolean Esi(float f, float f2) {
        return false;
    }
}
