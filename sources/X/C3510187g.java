package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.87g  reason: invalid class name and case insensitive filesystem */
public final class C3510187g extends 0Yg implements C62320sa {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewStub A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass3E6 A04;
    public final /* synthetic */ CameraConfiguration A05;
    public final /* synthetic */ TargetViewSizeProvider A06;
    public final /* synthetic */ C3509286x A07;
    public final /* synthetic */ C3497281m A08;
    public final /* synthetic */ AnonymousClass80U A09;
    public final /* synthetic */ AnonymousClass80F A0A;
    public final /* synthetic */ DirectCameraViewModel A0B;
    public final /* synthetic */ AnonymousClass85s A0C;
    public final /* synthetic */ InteractiveDrawableContainer A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3510187g(View view, View view2, ViewStub viewStub, UserSession userSession, AnonymousClass3E6 r6, CameraConfiguration cameraConfiguration, TargetViewSizeProvider targetViewSizeProvider, C3509286x r9, C3497281m r10, AnonymousClass80U r11, AnonymousClass80F r12, DirectCameraViewModel directCameraViewModel, AnonymousClass85s r14, InteractiveDrawableContainer interactiveDrawableContainer) {
        super(0);
        this.A08 = r10;
        this.A00 = view;
        this.A0D = interactiveDrawableContainer;
        this.A01 = view2;
        this.A02 = viewStub;
        this.A04 = r6;
        this.A03 = userSession;
        this.A0A = r12;
        this.A0B = directCameraViewModel;
        this.A09 = r11;
        this.A0C = r14;
        this.A07 = r9;
        this.A06 = targetViewSizeProvider;
        this.A05 = cameraConfiguration;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C3497281m r9 = this.A08;
        View view = this.A00;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A0D;
        View view2 = this.A01;
        ViewStub viewStub = this.A02;
        AnonymousClass3E6 r5 = this.A04;
        UserSession userSession = this.A03;
        AnonymousClass80F r11 = this.A0A;
        DirectCameraViewModel directCameraViewModel = this.A0B;
        AnonymousClass80U r10 = this.A09;
        AnonymousClass85s r13 = this.A0C;
        C3509286x r8 = this.A07;
        return new C353798Jc(view, view2, viewStub, userSession, r5, this.A05, this.A06, r8, r9, r10, r11, directCameraViewModel, r13, interactiveDrawableContainer);
    }
}
