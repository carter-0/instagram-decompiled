package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.avatars.pokes.PokeReceiverView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LWX implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ QP5 A00;
    public final /* synthetic */ PokeReceiverView A01;

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public LWX(QP5 qp5, PokeReceiverView pokeReceiverView) {
        this.A01 = pokeReceiverView;
        this.A00 = qp5;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i;
        PokeReceiverView pokeReceiverView = this.A01;
        AtomicBoolean atomicBoolean = pokeReceiverView.A09;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            IgImageView igImageView = pokeReceiverView.A03;
            if (igImageView != null) {
                pokeReceiverView.removeView(igImageView);
            }
            C51970G9q.A1S(pokeReceiverView.A06);
            AnonymousClass5Gv r0 = pokeReceiverView.A04;
            if (r0 != null) {
                r0.A08(true);
            }
            C46766Dkt dkt = pokeReceiverView.A01;
            if (dkt != null) {
                String str = this.A00.A01;
                MGE.A01(dkt, str, C51975G9x.A0R(dkt, str), 12);
            }
            QP5 qp5 = this.A00;
            UserSession userSession = pokeReceiverView.A02;
            if (userSession != null) {
                C63909LBs lBs = pokeReceiverView.A08;
                MMX mmx = new MMX(31, (Object) qp5, (Object) pokeReceiverView);
                Context context = lBs.A00;
                IgImageView igImageView2 = new IgImageView(context);
                C321016tR A002 = lBs.A00(userSession, R.drawable.nudges_nudgeback);
                A002.A0I = mmx;
                A002.A0A(1);
                igImageView2.setImageDrawable(A002);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(JTU.A01(context), JTU.A01(context));
                Resources resources = context.getResources();
                if (resources != null) {
                    i = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
                } else {
                    i = 0;
                }
                layoutParams.setMargins(0, 0, 0, -(i / 2));
                igImageView2.setAlpha(0.0f);
                igImageView2.setLayoutParams(layoutParams);
                igImageView2.setElevation(1.0f);
                pokeReceiverView.addView(igImageView2, 0);
                C294975nL A0P = JTQ.A0P(JTP.A0c(igImageView2, 0), 2.0d, 1.0d);
                A0P.A0I(1.0f);
                A0P.A0H();
            }
        }
        return true;
    }
}
