package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;

/* renamed from: X.I7c  reason: case insensitive filesystem */
public final class C56673I7c implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void onAnimationRepeat(Animator animator) {
    }

    public C56673I7c(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj2;
        this.A03 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        if (2 - this.A00 == 0) {
            DbS.A1U(this.A01);
            ((Animator) this.A03).removeAllListeners();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        int i;
        String str;
        switch (this.A00) {
            case 0:
                AnonymousClass6Tm r1 = (AnonymousClass6Tm) this.A01;
                C299275ur.A00((C307896Rx) this.A03, r1, (C277014uI) this.A02);
                return;
            case 1:
                Drawable drawable = (Drawable) this.A01;
                if (drawable != null) {
                    ((ReshareTogglePickerView) this.A03).A01.setImageDrawable(drawable);
                }
                ReshareTogglePickerView reshareTogglePickerView = (ReshareTogglePickerView) this.A03;
                TextView textView = reshareTogglePickerView.A02;
                Context A0S = AnonymousClass7TE.A0S(reshareTogglePickerView);
                if (C51967G9n.A03((Number) this.A02, 1) != 0) {
                    i = 2131971395;
                } else {
                    i = 2131971394;
                }
                textView.setText(AnonymousClass7TE.A16(A0S, i));
                return;
            case 2:
                DbS.A1U(this.A01);
                return;
            case 3:
                ((View) this.A02).setVisibility(8);
                View view = (View) this.A03;
                if (view != null) {
                    view.setVisibility(8);
                }
                C55726HmN hmN = (C55726HmN) this.A01;
                AnonymousClass3z4 r6 = hmN.A01;
                IgSimpleImageView igSimpleImageView = hmN.A00;
                C247453gM r4 = hmN.A02;
                AnonymousClass3z4.A01(igSimpleImageView, r4.A03, r6, r4, 182.A06(0Tu.A05, r6.A02, 36320652933866198L));
                return;
            case 4:
                ((Animator) this.A03).removeAllListeners();
                ((ImageView) this.A02).setImageResource(R.drawable.note_like_filled_drawable);
                return;
            default:
                C52839GdV gdV = (C52839GdV) this.A03;
                AnonymousClass4DU r10 = gdV.A0A;
                UserSession userSession = gdV.A09;
                AnonymousClass3OA r7 = gdV.A0B;
                C267324bN r5 = gdV.A07;
                C52058GDe gDe = gdV.A08;
                MotionEvent motionEvent = (MotionEvent) this.A02;
                MotionEvent motionEvent2 = (MotionEvent) this.A01;
                View view2 = gdV.A00;
                String str2 = gdV.A01;
                2Wa r2 = gdV.A06;
                boolean A1Z = AnonymousClass7TG.A1Z(r10, userSession);
                C51974G9v.A1M(r7, r5, gDe);
                0qQ.A0B(r2, 9);
                Boolean valueOf = Boolean.valueOf(A1Z);
                r2.A01(valueOf);
                C55239HeU.A00(r5, gDe, userSession, r7.A0K, r10, valueOf);
                if (view2 != null && str2 != null) {
                    if (motionEvent2.getRawX() < motionEvent.getRawX()) {
                        str = "swipe_left";
                    } else {
                        str = "swipe_right";
                    }
                    View findViewWithTag = view2.getRootView().findViewWithTag("clips_overlay_ad_cta_component");
                    if (findViewWithTag != null) {
                        Rect A0W = AnonymousClass7TE.A0W();
                        view2.getGlobalVisibleRect(A0W);
                        Rect A0W2 = AnonymousClass7TE.A0W();
                        findViewWithTag.getGlobalVisibleRect(A0W2);
                        float x = ((float) A0W.left) + motionEvent.getX();
                        float y = ((float) A0W.top) + motionEvent.getY();
                        float x2 = motionEvent2.getX() + ((float) A0W.left);
                        float y2 = motionEvent2.getY() + ((float) A0W.top);
                        float eventTime = ((float) (motionEvent2.getEventTime() - motionEvent.getEventTime())) / 1000.0f;
                        Rect rect = A0W;
                        Rect rect2 = A0W2;
                        C55238HeT.A00(AnonymousClass7TE.A0S(view2), rect, rect2, userSession, r10, r7, Float.valueOf(x2), Float.valueOf(y2), Float.valueOf((motionEvent2.getRawX() - motionEvent.getRawX()) / eventTime), Float.valueOf((motionEvent2.getRawY() - motionEvent.getRawY()) / eventTime), Float.valueOf(eventTime), str, str2, x, y);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        Drawable drawable;
        switch (this.A00) {
            case 2:
                DbS.A1U(this.A02);
                return;
            case 4:
                ImageView imageView = (ImageView) this.A02;
                Context context = (Context) this.A01;
                Drawable drawable2 = context.getDrawable(R.drawable.instagram_heart_pano_filled_24);
                if (drawable2 != null) {
                    drawable = drawable2.mutate();
                    C51969G9p.A12(PorterDuff.Mode.SRC_ATOP, drawable, context.getColor(R.color.igds_creation_tools_pink));
                } else {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                return;
            default:
                return;
        }
    }
}
