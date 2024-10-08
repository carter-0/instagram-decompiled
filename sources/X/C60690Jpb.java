package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.android.R;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.gradient.IGGradientView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.io.IOException;
import java.util.List;

/* renamed from: X.Jpb  reason: case insensitive filesystem */
public final class C60690Jpb extends C249703kE {
    public int A00 = -1;
    public C60979Jub A01;
    public final Activity A02;
    public final TextureView A03;
    public final View A04;
    public final LinearLayout A05;
    public final LinearLayout A06;
    public final AnonymousClass07V A07;
    public final UserSession A08;
    public final IgProgressBar A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgImageView A0C;
    public final C64111LNs A0D;
    public final C60211JhU A0E;
    public final IGGradientView A0F;
    public final SimpleVideoLayout A0G;
    public final List A0H;
    public final AnonymousClass0iw A0I;
    public final IGGradientView A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60690Jpb(Activity activity, View view, AnonymousClass07V r8, AnonymousClass0iw r9, UserSession userSession, C64111LNs lNs, C60211JhU jhU) {
        super(view);
        0qQ.A0B(r9, 1);
        C51974G9v.A1S(userSession, view, jhU, lNs, r8);
        0qQ.A0B(activity, 7);
        this.A0I = r9;
        this.A08 = userSession;
        this.A04 = view;
        this.A0E = jhU;
        this.A0D = lNs;
        this.A07 = r8;
        this.A02 = activity;
        this.A0G = (SimpleVideoLayout) AnonymousClass7TF.A0F(view, R.id.acr_browser_video_player);
        this.A03 = (TextureView) AnonymousClass7TF.A0F(view, R.id.acr_browser_virtual_video_player_texture_view);
        this.A0C = DbX.A0b(view, R.id.acr_browser_video_image_placeholder);
        this.A05 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.acr_browser_video_attribution_layout);
        this.A0A = DbX.A0Z(view, R.id.acr_browser_video_attribution_text);
        this.A09 = (IgProgressBar) AnonymousClass7TF.A0F(view, R.id.acr_loading_indicator);
        this.A0B = DbX.A0Z(view, R.id.acr_browser_preview_title);
        this.A0F = (IGGradientView) AnonymousClass7TF.A0F(view, R.id.acr_browser_top_background_gradient_view);
        this.A0J = (IGGradientView) AnonymousClass7TF.A0F(view, R.id.acr_browser_bottom_background_gradient_view);
        this.A06 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.feedback_menu_entrypoint_layout);
        this.A0H = 0sr.A1P(new C62508Kgy[]{C62508Kgy.MODERN, C62508Kgy.NEON, C62508Kgy.TYPEWRITER, C62508Kgy.CLASSIC, C62508Kgy.LITERATURE});
        LY0.A00(view, 30, this);
    }

    private final void A00(int i, boolean z) {
        IGGradientView iGGradientView;
        this.A0B.setGravity(i);
        if (z) {
            this.A0F.setVisibility(0);
            iGGradientView = this.A0J;
        } else {
            this.A0J.setVisibility(0);
            iGGradientView = this.A0F;
        }
        iGGradientView.setVisibility(8);
    }

    public final void A01(C60979Jub jub, int i) {
        Bitmap createImageThumbnail;
        AnonymousClass0qq A002;
        0qm r0;
        C60979Jub jub2 = jub;
        this.A01 = jub2;
        int i2 = i;
        this.A00 = i2;
        if (!jub2.A00) {
            UserSession userSession = this.A08;
            if (182.A06(0Tu.A05, userSession, 36318333649688660L)) {
                String str = jub2.A09;
                if (str == null) {
                    str = AnonymousClass7TE.A16(this.A04.getContext(), 2131974734);
                }
                IgTextView igTextView = this.A0B;
                igTextView.setVisibility(0);
                igTextView.setText(str);
                int ordinal = ((C62508Kgy) JTT.A0m(this.A0H, i2)).ordinal();
                if (ordinal == 0) {
                    A00(49, true);
                    igTextView.setAllCaps(true);
                    igTextView.setTextSize(2, 46.0f);
                    A002 = AnonymousClass0qo.A00(AnonymousClass7TE.A0S(this.A04));
                    r0 = 0qm.A0V;
                } else if (ordinal == 1) {
                    A00(49, true);
                    igTextView.setAllCaps(false);
                    igTextView.setTextSize(2, 60.0f);
                    A002 = AnonymousClass0qo.A00(AnonymousClass7TE.A0S(this.A04));
                    r0 = 0qm.A0B;
                } else if (ordinal == 2) {
                    A00(8388659, true);
                    igTextView.setAllCaps(false);
                    igTextView.setTextSize(2, 35.0f);
                    A002 = AnonymousClass0qo.A00(AnonymousClass7TE.A0S(this.A04));
                    r0 = 0qm.A0C;
                } else if (ordinal == 3) {
                    A00(81, false);
                    igTextView.setAllCaps(false);
                    igTextView.setTextSize(2, 40.0f);
                    A002 = AnonymousClass0qo.A00(AnonymousClass7TE.A0S(this.A04));
                    r0 = 0qm.A0u;
                } else if (ordinal == 4) {
                    A00(81, false);
                    igTextView.setAllCaps(false);
                    igTextView.setTextSize(2, 40.0f);
                    A002 = AnonymousClass0qo.A00(AnonymousClass7TE.A0S(this.A04));
                    r0 = 0qm.A0g;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                igTextView.setTypeface(A002.A02(r0));
            }
            LinearLayout linearLayout = this.A06;
            linearLayout.setVisibility(0);
            linearLayout.bringToFront();
            this.A0F.setVisibility(0);
            AnonymousClass0fU.A00(new LY9(jub2, this, i2, 2), linearLayout);
            Context A0S = AnonymousClass7TE.A0S(this.A04);
            List list = jub2.A0C;
            if (list != null) {
                Medium medium = (Medium) list.get(0);
                this.A0G.setVisibility(8);
                this.A03.setVisibility(0);
                int A062 = AnonymousClass7TF.A0E(A0S).widthPixels - (JTR.A06(A0S) * 2);
                IgImageView igImageView = this.A0C;
                igImageView.measure(View.MeasureSpec.makeMeasureSpec(A062, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((int) (((float) A062) / 0.5625f), SN3.MAX_SIGNED_POWER_OF_TWO));
                int measuredWidth = igImageView.getMeasuredWidth();
                int measuredHeight = igImageView.getMeasuredHeight();
                if (measuredWidth > 0 && measuredHeight > 0 && Build.VERSION.SDK_INT >= 29) {
                    try {
                        if (medium.CeS()) {
                            createImageThumbnail = ThumbnailUtils.createVideoThumbnail(AnonymousClass7TE.A0t(medium.A0X), new Size(measuredWidth, measuredHeight), (CancellationSignal) null);
                        } else {
                            createImageThumbnail = ThumbnailUtils.createImageThumbnail(AnonymousClass7TE.A0t(medium.A0X), new Size(measuredWidth, measuredHeight), (CancellationSignal) null);
                        }
                        0qQ.A0A(createImageThumbnail);
                        igImageView.setImageBitmap(createImageThumbnail);
                    } catch (IOException e) {
                        JTP.A1U("ClipsACRBrowserItemViewHolder.loadThumbnailFromFilel#IOException", e);
                    }
                }
                ACRType aCRType = jub2.A02;
                IgTextView igTextView2 = this.A0A;
                int i3 = 2131955162;
                if (aCRType == ACRType.CAMERA_ROLL) {
                    i3 = 2131955163;
                }
                DbT.A18(A0S, igTextView2, i3);
                AnonymousClass0fU.A00(C64263LXp.A00, this.A05);
                MediaComposition mediaComposition = jub2.A01;
                if (mediaComposition != null) {
                    this.A0D.A01(A0S, mediaComposition, userSession, this);
                    return;
                }
                this.A09.setVisibility(0);
                C64111LNs lNs = this.A0D;
                AnonymousClass7TE.A1Z(new C59703JUk((Object) A0S, (Object) lNs, (Object) this, (Object) list, (Object) userSession, (AnonymousClass4D7) null, 29), C71772f0.A00(this.A07));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
