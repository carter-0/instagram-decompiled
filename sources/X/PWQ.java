package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import com.instagram.user.model.User;

public final class PWQ implements Runnable {
    public final /* synthetic */ DirectVisualMessageViewerController A00;

    public PWQ(DirectVisualMessageViewerController directVisualMessageViewerController) {
        this.A00 = directVisualMessageViewerController;
    }

    public final void run() {
        float f;
        float f2;
        float centerX;
        float centerY;
        C294975nL A04;
        C315616kD pqs;
        C68167N3h A002;
        User user;
        int i;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
        if (directVisualMessageViewerController.contentHolder != null) {
            OEL oel = directVisualMessageViewerController.reelViewerShadowAnimator;
            if (oel != null) {
                C309536Yq r1 = oel.A02;
                View view = oel.A01;
                r1.A00 = -16777216;
                r1.A01 = -16777216;
                view.setBackgroundColor(-16777216);
            }
            if (directVisualMessageViewerController.A1D) {
                View view2 = directVisualMessageViewerController.contentView;
                if (view2 != null) {
                    view2.setVisibility(0);
                    DirectVisualMessageViewerController.A0G(directVisualMessageViewerController);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            RectF rectF = directVisualMessageViewerController.A0d;
            if (rectF == null) {
                DirectVisualMessageViewerController.A0N(directVisualMessageViewerController, true);
                int i2 = directVisualMessageViewerController.A0c;
                View view3 = directVisualMessageViewerController.contentView;
                if (i2 == 1) {
                    if (view3 != null) {
                        i = view3.getHeight();
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else if (view3 != null) {
                    i = -view3.getHeight();
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                A04 = DirectVisualMessageViewerController.A04(directVisualMessageViewerController);
                A04.A0T((float) i, 0.0f);
            } else {
                OW6 ow6 = directVisualMessageViewerController.A0G;
                if (ow6 == null || (A002 = ow6.A00()) == null || (user = A002.A0C) == null) {
                    CircularImageView circularImageView = directVisualMessageViewerController.A0A;
                    if (circularImageView != null) {
                        circularImageView.A09();
                    }
                } else {
                    CircularImageView circularImageView2 = directVisualMessageViewerController.A0A;
                    if (circularImageView2 != null) {
                        circularImageView2.setUrl(user.Bh3(), directVisualMessageViewerController.A0v);
                    }
                }
                DirectVisualMessageViewerController.A0N(directVisualMessageViewerController, true);
                boolean z = directVisualMessageViewerController.A1F;
                if (z) {
                    float width = rectF.width();
                    OIU oiu = directVisualMessageViewerController.contentHolder;
                    if (oiu != null) {
                        f = width / AnonymousClass7TE.A02(oiu.A0J);
                        float height = rectF.height();
                        OIU oiu2 = directVisualMessageViewerController.contentHolder;
                        if (oiu2 != null) {
                            f2 = height / ((float) oiu2.A0J.getHeight());
                            centerX = 0.0f;
                            centerY = 0.0f;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    centerX = rectF.centerX();
                    centerY = rectF.centerY() - ((float) C61290mR.A00());
                }
                A04 = DirectVisualMessageViewerController.A04(directVisualMessageViewerController);
                A04.A0U(f, 1.0f, centerX);
                A04.A0V(f2, 1.0f, centerY);
                if (z) {
                    View view4 = directVisualMessageViewerController.itemView;
                    if (view4 != null) {
                        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) AnonymousClass7TF.A0F(view4, R.id.viewer_media_view_container);
                        DirectVisualMessageViewerController.A0J(directVisualMessageViewerController, 0.0f);
                        float f3 = rectF.left;
                        OIU oiu3 = directVisualMessageViewerController.contentHolder;
                        if (oiu3 != null) {
                            A04.A0S(f3 - (((float) oiu3.A0T.getPaddingLeft()) * f), 0.0f);
                            float A003 = rectF.top - ((float) C61290mR.A00());
                            OIU oiu4 = directVisualMessageViewerController.contentHolder;
                            if (oiu4 != null) {
                                A04.A0T(A003 - (((float) oiu4.A0T.getPaddingTop()) * f2), 0.0f);
                                pqs = new PQY(directVisualMessageViewerController, roundedCornerMediaFrameLayout, 1);
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    pqs = new PQS(directVisualMessageViewerController, 3);
                }
                A04.A06 = pqs;
            }
            A04.A0H();
        }
    }
}
