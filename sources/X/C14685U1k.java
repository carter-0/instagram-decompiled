package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.U1k  reason: case insensitive filesystem */
public final class C14685U1k extends Handler {
    public WeakReference A00;

    public final void handleMessage(Message message) {
        int i;
        W85 w85 = (W85) this.A00.get();
        if (w85 != null && message.what == 0) {
            int i2 = W85.A05;
            VNE vne = w85.A02;
            w85.A00.getClass();
            C15695Uh1 uh1 = vne.A00;
            2cv r0 = uh1.A03;
            if (r0 != null) {
                r0.CNi(uh1);
                uh1.A03.setFocusable(true);
                uh1.A0B = true;
                VZU vzu = uh1.A0J;
                Context context = uh1.A0D;
                UserSession userSession = uh1.A0G;
                View view = uh1.A02;
                1Xj r2 = uh1.A04;
                AnonymousClass3TO r18 = AnonymousClass3TO.AUTOPLAY_USING_TIMER;
                AnonymousClass3W1 BQr = uh1.BQr(r2);
                AnonymousClass4JX r7 = uh1.A0L;
                C56008HrG hrG = (C56008HrG) DbT.A0o(view);
                LinearLayout linearLayout = hrG.A05;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = hrG.A07;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = touchInterceptorFrameLayout;
                JTQ.A0w(linearLayout, touchInterceptorFrameLayout.getWidth(), touchInterceptorFrameLayout.getHeight() * 2);
                AnonymousClass3YB r19 = new AnonymousClass3YB((ImageUrl) null, (C243683Zu) null, new SearchContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null), AnonymousClass05K.A01, "", false, false, false, false, false);
                C252643pR r11 = vzu.A04;
                C253993rl r12 = hrG.A08;
                C242923Ws r10 = vzu.A03;
                AnonymousClass3YB r23 = r19;
                AnonymousClass3W1 r24 = BQr;
                C243513Zb A04 = r10.A04(context, r2, uh1, r23, r24, (String) null);
                C243613Zn r13 = new C243613Zn(r10);
                if (BQr.A0p()) {
                    i = BQr.getPosition();
                } else {
                    i = -1;
                }
                r11.A06(uh1, r13, r12, A04, r24, i);
                AnonymousClass7TH.A0R(r12.A04);
                AnonymousClass7TE.A0c(r12.A0f).setVisibility(8);
                DbW.A1R(r12.A0g, 8);
                AnonymousClass4EA r132 = hrG.A09;
                MediaFrameLayout mediaFrameLayout = r132.A0T;
                mediaFrameLayout.setOnTouchListener(new C18902WBv(r2, hrG, vzu, r7, r24));
                float f = hrG.A02;
                if (f == 0.0f) {
                    int width = touchInterceptorFrameLayout2.getWidth();
                    int height = touchInterceptorFrameLayout2.getHeight();
                    int height2 = r12.A0E.getHeight();
                    f = ((float) (width - (context.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material) * 2))) / ((float) ((height - height2) - ((int) hrG.A00())));
                    hrG.A02 = f;
                }
                mediaFrameLayout.A00 = Math.max(f, A0A.A00(r2));
                IgProgressImageView igProgressImageView = r132.A0N;
                igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                C246923fS r112 = vzu.A00;
                if (r112 == null) {
                    r112 = new C246923fS(userSession);
                    vzu.A00 = r112;
                }
                C247843h0.A00(uh1, r112.A00(vzu.A01, r2), igProgressImageView);
                AnonymousClass4Je.A00(new AnonymousClass4Jd(userSession).A00(r2, uh1.getModuleName()), BQr, igProgressImageView, r132.A0S, r18);
                AnonymousClass3W1 r02 = r132.A04;
                if (!(r02 == null || r02 == BQr)) {
                    LikeActionView likeActionView = r132.A0R;
                    r02.A0V(likeActionView);
                    r132.A04.A0Y(likeActionView);
                    r132.A04.A0S(r132.A01.A01());
                }
                r132.A04 = BQr;
                LikeActionView likeActionView2 = r132.A0R;
                BQr.A0T(likeActionView2);
                r132.A04.A0X(likeActionView2);
                C250563lf.A0f(new AnonymousClass9IQ((Object) null, 2, false, r2.A6W(userSession)), r132.A01, BQr);
                igProgressImageView.setContentDescription(C246673ez.A01(igProgressImageView.getContext(), igProgressImageView.getResources(), uh1, userSession, r2, (0Pl) null, false));
                C15695Uh1.A03(uh1);
                C19719WeL weL = uh1.A07;
                weL.A09 = new WCB(5, new C20023Wjj(vne), weL);
                weL.A0H.getViewTreeObserver().addOnGlobalLayoutListener(weL.A09);
                uh1.A02.setBackgroundDrawable(C232972uk.A00(context, uh1.A03.ACi()));
                LinearLayout linearLayout2 = uh1.A06.A05;
                linearLayout2.setTranslationY(0.0f);
                linearLayout2.setScaleX(0.8f);
                linearLayout2.setScaleY(0.8f);
                uh1.A0I.A01(uh1.A04, uh1.A01, uh1.A00);
                if (C15695Uh1.A00(uh1.A04, uh1.A00).CeS()) {
                    C255593uO.A00(userSession).A01(new C256203vO(C15695Uh1.A00(uh1.A04, uh1.A00).CEL(), uh1.getModuleName()));
                }
                uh1.A0F.A03();
                uh1.A0A = AnonymousClass05K.A0C;
                w85.A01 = false;
            }
        }
    }
}
