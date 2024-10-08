package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.sharesheet.preview.ClipsViewerPreviewView;

/* renamed from: X.8co  reason: invalid class name and case insensitive filesystem */
public final class C359428co implements AnonymousClass88G {
    public final /* synthetic */ C359318cb A00;

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DdI(Drawable drawable, int i, boolean z) {
    }

    public final /* synthetic */ void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    public final /* synthetic */ void DlC(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void Dsb() {
    }

    public C359428co(C359318cb r1) {
        this.A00 = r1;
    }

    public final void CtY() {
        C359318cb r3 = this.A00;
        View view = r3.A01;
        if (view != null && view.getVisibility() == 0 && C359318cb.A0E(r3, r3.A0l.Atr())) {
            view.requireViewById(R.id.preview_group).setVisibility(8);
            C294975nL.A04((C295005nO) null, new View[]{r3.A0U}, false);
            r3.A0V.requireViewById(R.id.edit_buttons_toolbar).setVisibility(0);
            View view2 = r3.A0W;
            view2.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(150);
            AnonymousClass8LZ.A00(view2);
        }
    }

    public final void DPH() {
        C348917zG r0;
        C359318cb r2 = this.A00;
        C359318cb.A07(r2);
        View view = r2.A01;
        if (C359318cb.A0E(r2, r2.A0l.Atr())) {
            UserSession userSession = r2.A0b;
            if (182.A06(0Tu.A05, userSession, 36318531217791198L) && view != null && (r0 = (C348917zG) r2.A0v.A06.A02()) != null) {
                C359318cb.A06(r2);
                C293505kq r7 = r0.A01;
                view.requireViewById(R.id.preview_group).setVisibility(0);
                C294975nL.A05(new View[]{r2.A0U}, false);
                r2.A0V.requireViewById(R.id.edit_buttons_toolbar).setVisibility(8);
                View requireViewById = view.requireViewById(R.id.preview_metadata_info);
                0qQ.A07(requireViewById);
                ((ClipsViewerPreviewView) requireViewById).A00(r2.A0a, userSession, r7, r7.A0S, r7.A0g, 1.0f, false);
                C357318Xk r02 = r2.A0B;
                if (r02 != null) {
                    r02.A04(true);
                }
                int dimensionPixelSize = r2.A0S.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
                View view2 = r2.A0W;
                float height = ((float) (view2.getHeight() + dimensionPixelSize)) / ((float) view2.getHeight());
                view2.setPivotX(((float) view2.getWidth()) / 2.0f);
                view2.setPivotY(((float) view2.getHeight()) / 2.0f);
                view2.animate().scaleX(height).scaleY(height).translationY(((float) dimensionPixelSize) / 2.0f).setDuration(150);
                view2.setOutlineProvider((ViewOutlineProvider) null);
                view2.setClipToOutline(false);
            }
        }
    }

    public final void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        int i2;
        IgImageView igImageView;
        IgImageView igImageView2;
        Context context;
        int i3;
        View inflate;
        C359318cb r5 = this.A00;
        AnonymousClass80U r10 = r5.A0l;
        if (r10.CQ0(AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE)) {
            ViewStub viewStub = r5.A04;
            if (viewStub == null) {
                viewStub = (ViewStub) r5.A0c.requireViewById(R.id.clips_stacked_timeline_editing_single_tap_icon_stub);
                r5.A04 = viewStub;
            }
            if (!(r5.A08 != null || viewStub == null || (inflate = viewStub.inflate()) == null)) {
                View requireViewById = inflate.requireViewById(R.id.post_capture_preview_size_placeholder);
                0qQ.A07(requireViewById);
                0nA.A0V(requireViewById, ((NineSixteenLayoutConfigImpl) r5.A0f).A0K.getHeight());
                r5.A08 = inflate.requireViewById(R.id.clips_stacked_timeline_editing_single_tap_icon);
            }
            AnonymousClass8YU r3 = r5.A0D;
            if (r3 == AnonymousClass8YU.PLAYING) {
                r5.A0y.A01();
                C394749yd.A00(r5.A13, false);
                igImageView2 = r5.A08;
                if (igImageView2 != null) {
                    context = r5.A0S;
                    i3 = R.drawable.instagram_pause_pano_filled_24;
                }
                igImageView = r5.A08;
            } else {
                if (r3 == AnonymousClass8YU.PAUSED) {
                    r5.A0y.A03();
                    C394749yd.A00(r5.A13, true);
                    igImageView2 = r5.A08;
                    if (igImageView2 != null) {
                        context = r5.A0S;
                        i3 = R.drawable.instagram_play_pano_filled_24;
                    }
                }
                igImageView = r5.A08;
            }
            igImageView2.setImageDrawable(context.getDrawable(i3));
            igImageView = r5.A08;
        } else {
            if (!r5.A0K) {
                11Z.A04(new C40846AkG(r5), 1000);
                r5.A0K = true;
            }
            UserSession userSession = r5.A0b;
            0Tu r9 = 0Tu.A05;
            if (182.A06(r9, userSession, 36324213459529609L)) {
                r10.E3H(new Object());
                if (182.A06(r9, userSession, 36324213459595146L)) {
                    r5.A0y.A01();
                    return;
                }
                return;
            }
            AnonymousClass8YU r32 = r5.A0D;
            if (r32 == AnonymousClass8YU.PLAYING) {
                27p.A01(userSession).A1Q(C59725JVj.POST_CAPTURE, "POST_CAP_TAP_TO_PAUSE");
                r5.A0y.A01();
                C394749yd.A00(r5.A13, false);
                i2 = R.drawable.instagram_pause_pano_filled_24;
            } else {
                if (r32 == AnonymousClass8YU.PAUSED) {
                    27p.A01(userSession).A1Q(C59725JVj.POST_CAPTURE, "POST_CAP_TAP_TO_PLAY");
                    r5.A0y.A03();
                    C394749yd.A00(r5.A13, true);
                    i2 = R.drawable.instagram_play_pano_filled_24;
                }
                igImageView = r5.A07;
            }
            r5.A00 = i2;
            IgImageView igImageView3 = r5.A07;
            if (igImageView3 != null) {
                igImageView3.setImageDrawable(r5.A0S.getDrawable(i2));
            }
            igImageView = r5.A07;
        }
        if (igImageView != null) {
            C294975nL.A02(igImageView, 250);
        }
    }
}
