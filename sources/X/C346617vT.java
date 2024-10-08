package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.7vT  reason: invalid class name and case insensitive filesystem */
public final class C346617vT extends 0Yg implements C62320sa {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewStub A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ C3503284f A03;
    public final /* synthetic */ C357638Yz A04;
    public final /* synthetic */ TargetViewSizeProvider A05;
    public final /* synthetic */ C3499582p A06;
    public final /* synthetic */ C346607vS A07;
    public final /* synthetic */ AnonymousClass88B A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C346617vT(View view, ViewStub viewStub, AnonymousClass4DH r4, C3503284f r5, C357638Yz r6, TargetViewSizeProvider targetViewSizeProvider, C3499582p r8, C346607vS r9, AnonymousClass88B r10, boolean z) {
        super(0);
        this.A07 = r9;
        this.A02 = r4;
        this.A01 = viewStub;
        this.A03 = r5;
        this.A05 = targetViewSizeProvider;
        this.A06 = r8;
        this.A00 = view;
        this.A04 = r6;
        this.A08 = r10;
        this.A09 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C346607vS r0 = this.A07;
        Context context = r0.A09;
        Activity activity = r0.A08;
        AnonymousClass4DH r15 = this.A02;
        UserSession userSession = r0.A0C;
        ViewStub viewStub = this.A01;
        C355028Oh r12 = r0.A0E;
        C351978Be r11 = r0.A0F;
        C3503284f r10 = this.A03;
        TargetViewSizeProvider targetViewSizeProvider = this.A05;
        C3499582p r8 = this.A06;
        AnonymousClass846 r7 = r0.A0N;
        View view = this.A00;
        C357638Yz r5 = this.A04;
        AnonymousClass88B r4 = this.A08;
        boolean z = this.A09;
        boolean z2 = r0.A0a;
        boolean z3 = r0.A0Z;
        return new C355048Oj(activity, context, view, viewStub, r15, r10, userSession, r5, r12, r11, targetViewSizeProvider, r8, r7, r0.A0O, r4, R.layout.layout_post_capture_button_share_container_default, z, z2, z3);
    }
}
