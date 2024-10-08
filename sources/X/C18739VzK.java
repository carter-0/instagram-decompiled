package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Scroller;
import com.instagram.android.R;

/* renamed from: X.VzK  reason: case insensitive filesystem */
public final class C18739VzK {
    public VOY A00;
    public Integer A01 = AnonymousClass05K.A00;
    public Runnable A02;
    public boolean A03;
    public int A04;
    public final View A05;
    public final Scroller A06;
    public final U17 A07;
    public final Runnable A08 = new C20049Wk9(this);
    public final C19498Wak A09;

    public static final void A00(C18739VzK vzK, int i) {
        U17 u17 = vzK.A07;
        u17.A04(i);
        int i2 = u17.A04;
        if (i2 != vzK.A04) {
            VOY voy = vzK.A00;
            if (voy != null) {
                boolean z = vzK.A03;
                C19500Wam wam = voy.A00;
                C19498Wak wak = wam.A01;
                if (wak == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (i2 < 0 || i2 >= wak.BcH()) {
                    throw DbT.A0m();
                } else if (z) {
                    C19498Wak wak2 = wam.A01;
                    if (wak2 != null) {
                        wam.A06.Dhb(wam, wak2.Byp(i2));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            vzK.A04 = i2;
        }
    }

    public static final void A01(C18739VzK vzK, int i, boolean z) {
        if (vzK.A03) {
            return;
        }
        if (i < 0 || i >= vzK.A09.BcH()) {
            throw DbT.A0m();
        }
        U17 u17 = vzK.A07;
        int A032 = u17.A03(i);
        if (z) {
            int i2 = A032 - u17.A0A;
            Scroller scroller = vzK.A06;
            scroller.forceFinished(true);
            scroller.startScroll(0, u17.A0A, 0, i2);
            vzK.A01 = AnonymousClass05K.A0C;
            View view = vzK.A05;
            Runnable runnable = vzK.A08;
            view.removeCallbacks(runnable);
            view.post(runnable);
            return;
        }
        u17.A04(A032);
    }

    public C18739VzK(View view, C19498Wak wak, VOY voy, boolean z) {
        this.A05 = view;
        this.A09 = wak;
        this.A00 = voy;
        Context context = view.getContext();
        Resources resources = context.getResources();
        U17 u17 = new U17(wak, (float) resources.getDimensionPixelSize(R.dimen.avatar_search_sticker_tray_text_size), AnonymousClass7TE.A0D(resources));
        this.A07 = u17;
        u17.A00 = 0mi.A00(0.3f, 0.0f, 1.0f);
        u17.invalidateSelf();
        if (z) {
            u17.A05(AnonymousClass7TF.A03(context, R.attr.igdsPrimaryText));
        }
        view.setBackground(u17);
        0nA.A0p(view, new C20048Wk8(this));
        this.A04 = u17.A04;
        this.A06 = new Scroller(context);
        view.setOnTouchListener(new C18899WBr(8, new GestureDetector(context, new C14979UHx(this, 2)), this));
    }
}
