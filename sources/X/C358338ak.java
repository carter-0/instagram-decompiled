package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8ak  reason: invalid class name and case insensitive filesystem */
public final class C358338ak implements B1P, C3493580b, AnonymousClass81E {
    public Integer A00 = AnonymousClass05K.A0C;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass8BA A03;
    public final Context A04;
    public final C357638Yz A05;
    public final InteractiveDrawableContainer A06;

    public C358338ak(Context context, AnonymousClass0iw r3, UserSession userSession, C357638Yz r5, AnonymousClass8BA r6, InteractiveDrawableContainer interactiveDrawableContainer) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r5, 4);
        0qQ.A0B(interactiveDrawableContainer, 5);
        0qQ.A0B(r6, 6);
        this.A04 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A05 = r5;
        this.A06 = interactiveDrawableContainer;
        this.A03 = r6;
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    private final void A00(Integer num) {
        Context context = this.A04;
        ViewStub viewStub = new ViewStub(context);
        ViewStub viewStub2 = new ViewStub(context);
        ViewStub viewStub3 = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        viewStub.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        viewStub2.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388693;
        viewStub3.setLayoutParams(layoutParams3);
        C71662eb r6 = new C71662eb(viewStub);
        C71662eb r5 = new C71662eb(viewStub2);
        C71662eb r4 = new C71662eb(viewStub3);
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            viewStub.setLayoutResource(R.layout.alignment_guide_header_clips_action_bar);
            viewStub2.setLayoutResource(R.layout.layout_clips_viewer_media_info);
            viewStub3.setLayoutResource(R.layout.layout_clips_viewer_ufi_stack);
            r6.A02 = C378539Qf.A00;
            r5.A02 = new AnonymousClass9QP(this);
            r4.A02 = C378549Qg.A00;
        } else {
            viewStub.setLayoutResource(R.layout.alignment_guide_header_profile_attribution);
            viewStub2.setLayoutResource(R.layout.alignment_guide_footer_message_composer);
            r6.A02 = new C359168c7(this);
            r5.A02 = new C359178c8(this);
        }
        InteractiveDrawableContainer interactiveDrawableContainer = this.A06;
        if (num == num2) {
            interactiveDrawableContainer.setAlignmentGuideAlignTopMarginToHeader(false);
            interactiveDrawableContainer.setAlignmentGuideAlignBottomMarginToFooter(false);
            interactiveDrawableContainer.setAlignmentGuideUfiTower(r4);
        } else {
            interactiveDrawableContainer.setAlignmentGuideAlignTopMarginToHeader(true);
            interactiveDrawableContainer.setAlignmentGuideAlignBottomMarginToFooter(true);
        }
        interactiveDrawableContainer.setAlignmentGuideHeader(r6);
        interactiveDrawableContainer.setAlignmentGuideFooter(r5);
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public final void D19(boolean z) {
        Integer num;
        if (this.A05.A08.A00 instanceof AnonymousClass80O) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        Integer num2 = this.A00;
        if (num2 == AnonymousClass05K.A00 || num != num2) {
            A00(num);
        }
        this.A00 = num;
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        if (obj == AnonymousClass80V.CAPTION_COMPOSE) {
            A00(this.A00);
        }
    }
}
