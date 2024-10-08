package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.List;

public final class LBQ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public C362058hH A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final GestureDetector A0C;
    public final C64274LYa A0D = new C64274LYa(this);
    public final C64275LYb A0E = new C64275LYb(this);
    public final TouchInterceptorFrameLayout A0F;
    public final List A0G = AnonymousClass7TE.A1C();

    public LBQ(Context context, TouchInterceptorFrameLayout touchInterceptorFrameLayout) {
        this.A0F = touchInterceptorFrameLayout;
        GestureDetector gestureDetector = new GestureDetector(context, new C60027Jdd(this));
        this.A0C = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0B = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A0A = ViewConfiguration.get(context).getScaledEdgeSlop();
    }
}
