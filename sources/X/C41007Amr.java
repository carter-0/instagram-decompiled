package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Amr  reason: case insensitive filesystem */
public final /* synthetic */ class C41007Amr implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ C3498582c A01;

    public /* synthetic */ C41007Amr(AnonymousClass8BA r1, C3498582c r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8BA r0 = this.A00;
        C3498582c r9 = this.A01;
        try {
            Context A0T = AnonymousClass7TE.A0T(r0);
            InteractiveDrawableContainer interactiveDrawableContainer = r0.A1s;
            TargetViewSizeProvider targetViewSizeProvider = r0.A0z;
            C3510387i r11 = r0.A0x;
            UserSession userSession = r0.A0v;
            0qQ.A0B(A0T, 0);
            AnonymousClass7TG.A0w(1, interactiveDrawableContainer, targetViewSizeProvider, r11);
            0qQ.A0B(userSession, 5);
            String str = r9.A01;
            if (str == null) {
                0kD.A07("VisualReplyShareUtil", "original media file path is null", (Throwable) null);
            } else if (r9.A02) {
                Medium A03 = C282665Eg.A03(AnonymousClass7TE.A0t(str), 3, 0);
                User user = r9.A00;
                String string = A0T.getResources().getString(2131974283, new Object[]{AnonymousClass7TF.A0Q(userSession).getUsername()});
                0qQ.A07(string);
                float A04 = 0nA.A04(A0T, 12);
                C391149sQ r35 = C391149sQ.STORY_MENTION_RESHARE;
                AnonymousClass81W r4 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
                UserSession userSession2 = userSession;
                C386059jz r12 = new C386059jz(A0T, new AnonymousClass9X8(new C376429Hy(1, A04, A04, A04, A04), A03, userSession2, r35, C391099sL.NOT_CLIPS, (String) null, 0.0f, r4.getWidth(), r4.getHeight(), -1, AnonymousClass972.MUTABLE_FLAG_MASK, false), (Drawable) null, userSession, (C3498482b) null, user, "", string);
                interactiveDrawableContainer.A0K(r12, new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.5f), (AnonymousClass8DA) null, (C3510487j) r11, AnonymousClass05K.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 0.7f, -1.0f, -1.0f, 0, false, false, true, false, false, false, false, true, true, true, true, true, false, false), false, false, false);
                Drawable drawable = r12.A00;
                0qQ.A0C(drawable, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.drawable.VideoStickerDrawable");
                r11.A0A(A0T, (AnonymousClass9X8) drawable, 0.7f, 0.0f, 60000);
            } else {
                C40254AXs aXs = new C40254AXs(0, A0T, userSession, targetViewSizeProvider, r9, interactiveDrawableContainer);
                1OO A0J = 1NK.A00().A0J(C253833rU.A01(AnonymousClass7TE.A0t(str)), "VisualReplyShareUtil");
                A0J.A0I = false;
                A0J.A02(aXs);
                A0J.A01();
            }
        } catch (IllegalArgumentException e) {
            0kD.A07("QuickCaptureEditController", "Error creating video sticker for vidsal reply share.", e);
            Activity activity = r0.A0n;
            C59689JTv.A0B(activity, "failed_to_create_video_sticker_for_vidsal_reply_share");
            if (activity != null) {
                activity.finish();
            }
        }
    }
}
