package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* renamed from: X.89g  reason: invalid class name and case insensitive filesystem */
public final class C3515389g implements C3515489h {
    public final /* synthetic */ ClipsAudioMixingDrawerController A00;

    public final /* synthetic */ void Djx() {
    }

    public C3515389g(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController) {
        this.A00 = clipsAudioMixingDrawerController;
    }

    public final void Cxu() {
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A00;
        if (ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController)) {
            C61349K3r k3r = new C61349K3r();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", clipsAudioMixingDrawerController.A0F.A05);
            k3r.setArguments(bundle);
            C19140WMw A002 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
            if (A002 != null) {
                A002.A04(k3r, false, true);
            }
            clipsAudioMixingDrawerController.A08 = false;
            clipsAudioMixingDrawerController.A07 = true;
            C19140WMw A003 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
            if (A003 != null) {
                C19702We4 we4 = A003.A0F;
                if (we4 != null) {
                    we4.A03(true, 0.0f);
                }
                06N r1 = A003.A0D;
                if (r1 != null) {
                    A003.A0E.A0q(r1);
                }
            }
        }
    }

    public final void DT4() {
        Context context;
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A00;
        if (!clipsAudioMixingDrawerController.A08) {
            clipsAudioMixingDrawerController.A08 = true;
            if (!ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController) && (context = clipsAudioMixingDrawerController.A0D) != null) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.clips_audio_mixing_screen_height);
                View view = clipsAudioMixingDrawerController.postCaptureVideoContainer;
                if (view != null) {
                    clipsAudioMixingDrawerController.A00 = ((float) dimensionPixelSize) / ((float) view.getHeight());
                    C71662eb r0 = clipsAudioMixingDrawerController.audioMixingDrawerContainerViewStubHolder;
                    if (r0 != null) {
                        View A01 = r0.A01();
                        0qQ.A07(A01);
                        ViewGroup viewGroup = (ViewGroup) A01;
                        FrameLayout frameLayout = (FrameLayout) viewGroup.requireViewById(R.id.fragment_container);
                        clipsAudioMixingDrawerController.A01 = frameLayout;
                        if (frameLayout != null) {
                            frameLayout.setBackgroundResource(2Yu.A0H(context, R.attr.igds_color_elevated_background));
                        }
                        0hq A002 = C229102mq.A00(clipsAudioMixingDrawerController.A0E.requireActivity());
                        C19140WMw wMw = new C19140WMw(view, viewGroup, clipsAudioMixingDrawerController.A01, (06N) null, A002, clipsAudioMixingDrawerController.A0F, (AnonymousClass8R7) null, clipsAudioMixingDrawerController, clipsAudioMixingDrawerController.A00, 0.0f, false);
                        wMw.A05 = (float) context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
                        wMw.A04 = (float) context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
                        wMw.A03 = (float) context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                        clipsAudioMixingDrawerController.A03 = wMw;
                    }
                }
                Resources resources = context.getResources();
                if (resources != null) {
                    float dimensionPixelSize2 = (float) resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                    FrameLayout frameLayout2 = clipsAudioMixingDrawerController.A01;
                    if (frameLayout2 != null) {
                        frameLayout2.setOutlineProvider(new AnonymousClass9Xu(dimensionPixelSize2));
                    }
                }
                FrameLayout frameLayout3 = clipsAudioMixingDrawerController.A01;
                if (frameLayout3 != null) {
                    frameLayout3.setClipToOutline(true);
                }
            }
            C61349K3r k3r = new C61349K3r();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", clipsAudioMixingDrawerController.A0F.A05);
            k3r.setArguments(bundle);
            C19140WMw A003 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
            if (A003 != null) {
                A003.A04(k3r, true, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r4.A05 != null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DT5() {
        /*
            r5 = this;
            com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r4 = r5.A00
            X.85x r0 = r4.A0J
            r3 = 0
            X.2Fj r2 = r0.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.88W r0 = new X.88W
            r0.<init>(r1)
            r2.A0B(r0)
            com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A01(r4)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0048
            r4.A08 = r3
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A02(r4)
            if (r0 != 0) goto L_0x0058
            X.WMw r2 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A00(r4)
            if (r2 == 0) goto L_0x0039
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0035
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0035
            java.lang.String r1 = r4.A05
            r0 = 1
            if (r1 == 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r2.A05(r0)
        L_0x0039:
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A02(r4)
            if (r0 == 0) goto L_0x0048
            X.WMw r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A00(r4)
            if (r0 == 0) goto L_0x0048
            r0.A02()
        L_0x0048:
            boolean r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A02(r4)
            if (r0 == 0) goto L_0x0057
            X.WMw r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A00(r4)
            if (r0 == 0) goto L_0x0057
            r0.A03()
        L_0x0057:
            return
        L_0x0058:
            r4.DAt()
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3515389g.DT5():void");
    }

    public final void DT6() {
        AnonymousClass80U r2;
        Object obj;
        Fragment fragment;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment;
        Fragment fragment2;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment2;
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A00;
        if (clipsAudioMixingDrawerController.A09) {
            if (ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController)) {
                C19140WMw A002 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
                if (A002 != null) {
                    fragment2 = A002.A0E.A0P(R.id.fragment_container);
                } else {
                    fragment2 = null;
                }
                if ((fragment2 instanceof ClipsStackedTimelineFragment) && (clipsStackedTimelineFragment2 = (ClipsStackedTimelineFragment) fragment2) != null) {
                    clipsStackedTimelineFragment2.A0U();
                }
            } else {
                r2 = clipsAudioMixingDrawerController.quickCaptureState;
                if (r2 != null) {
                    obj = new Object();
                    r2.E3H(obj);
                }
            }
        } else if (clipsAudioMixingDrawerController.A05 != null) {
            if (!ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController) && (r2 = clipsAudioMixingDrawerController.quickCaptureState) != null) {
                obj = new C356078Sm(clipsAudioMixingDrawerController.A05);
                r2.E3H(obj);
            }
        } else if (clipsAudioMixingDrawerController.A0A) {
            if (ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController)) {
                C19140WMw A003 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
                if (A003 != null) {
                    fragment = A003.A0E.A0P(R.id.fragment_container);
                } else {
                    fragment = null;
                }
                if ((fragment instanceof ClipsStackedTimelineFragment) && (clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) fragment) != null) {
                    clipsStackedTimelineFragment.A0V();
                }
            } else {
                r2 = clipsAudioMixingDrawerController.quickCaptureState;
                if (r2 != null) {
                    obj = new Object();
                    r2.E3H(obj);
                }
            }
        }
        clipsAudioMixingDrawerController.A09 = false;
        clipsAudioMixingDrawerController.A05 = null;
        clipsAudioMixingDrawerController.A0A = false;
    }

    public final void DT7(C66569MWx mWx) {
        AnonymousClass80U r2;
        ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = this.A00;
        if (!(mWx == null || (r2 = clipsAudioMixingDrawerController.quickCaptureState) == null)) {
            r2.E3H(new AnonymousClass8UN(mWx, true, true));
        }
        if (ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController) != null && clipsAudioMixingDrawerController.A08) {
            clipsAudioMixingDrawerController.A08 = false;
            clipsAudioMixingDrawerController.A07 = true;
            C19140WMw A002 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
            if (A002 != null) {
                C19702We4 we4 = A002.A0F;
                if (we4 != null) {
                    we4.A03(true, 0.0f);
                }
                06N r1 = A002.A0D;
                if (r1 != null) {
                    A002.A0E.A0q(r1);
                }
            }
        }
    }
}
