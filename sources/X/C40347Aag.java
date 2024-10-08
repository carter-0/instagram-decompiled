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

/* renamed from: X.Aag  reason: case insensitive filesystem */
public final class C40347Aag implements C355038Oi {
    public final C355048Oj A00;
    public final AnonymousClass0eM A01;

    public final void EI2() {
    }

    public final /* synthetic */ void EIG() {
    }

    public final /* synthetic */ void EPT(boolean z) {
    }

    public final void ESJ(String str) {
    }

    public final /* synthetic */ void Ef3(String str, Integer num) {
    }

    public final void En3(boolean z) {
    }

    public final void FJo(Spannable spannable, C3499582p r21, AnonymousClass80V r22, AnonymousClass80X r23, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        AnonymousClass80V r2 = r22;
        0qQ.A0B(r2, 0);
        C3499582p r1 = r21;
        AnonymousClass80X r3 = r23;
        Integer num2 = num;
        AnonymousClass7TG.A1U(r3, num2, r1);
        this.A00.A0O(r1, r2, r3, num2, z, z2, z3, z4, z5, z6, false, false, false, false, false, false, false, false);
    }

    public C40347Aag(Activity activity, Context context, ViewStub viewStub, AnonymousClass4DH r27, C3503284f r28, UserSession userSession, C355028Oh r30, C351978Be r31, TargetViewSizeProvider targetViewSizeProvider, C3499582p r33, AnonymousClass846 r34) {
        C351978Be r13 = r31;
        this.A00 = new C355048Oj(activity, context, (View) null, viewStub, r27, r28, userSession, (C357638Yz) null, r30, r13, targetViewSizeProvider, r33, r34, (AnonymousClass8B2) null, (AnonymousClass88B) null, R.layout.layout_post_capture_button_share_container_direct_reply, false, false, false);
        this.A01 = AnonymousClass1YB.A00(new MJ9(31, r13, this));
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

    public final void Eck(boolean z) {
        View A06 = AnonymousClass7TH.A06(this.A01);
        int i = 8;
        if (z) {
            i = 0;
        }
        A06.setVisibility(i);
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
