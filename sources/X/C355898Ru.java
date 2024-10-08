package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.8Ru  reason: invalid class name and case insensitive filesystem */
public final class C355898Ru implements C3502283u {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public C362068hI A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Rect A0D = new Rect();
    public final GestureDetector A0E;
    public final GestureDetector A0F;
    public final ScaleGestureDetector A0G;
    public final TouchInterceptorFrameLayout A0H;
    public final C357638Yz A0I;
    public final AnonymousClass8BA A0J;
    public final C352888Fl A0K;
    public final C352538Dt A0L;
    public final C3509286x A0M;
    public final AnonymousClass8R7 A0N;
    public final C355918Rw A0O = new C355918Rw(this);
    public final C355908Rv A0P = new C355908Rv(this);
    public final C3497281m A0Q;
    public final AnonymousClass80U A0R;
    public final C3510287h A0S;
    public final Set A0T = new HashSet();
    public final boolean A0U;
    public final UserSession A0V;

    public C355898Ru(Context context, UserSession userSession, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C357638Yz r9, AnonymousClass8BA r10, C352888Fl r11, C352538Dt r12, C3509286x r13, AnonymousClass8R7 r14, C3497281m r15, AnonymousClass80U r16, C3510287h r17, boolean z) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(touchInterceptorFrameLayout, 4);
        0qQ.A0B(userSession, 13);
        this.A0C = context;
        this.A0I = r9;
        this.A0R = r16;
        this.A0H = touchInterceptorFrameLayout;
        this.A0K = r11;
        this.A0J = r10;
        this.A0N = r14;
        this.A0Q = r15;
        this.A0M = r13;
        this.A0S = r17;
        this.A0U = z;
        this.A0L = r12;
        this.A0V = userSession;
        Handler handler = new Handler(Looper.getMainLooper());
        GestureDetector gestureDetector = new GestureDetector(context, new C355928Rx(this), handler);
        gestureDetector.setIsLongpressEnabled(182.A06(0Tu.A06, userSession, 36318531217791198L));
        this.A0F = gestureDetector;
        C355938Ry r1 = new C355938Ry(this);
        this.A0E = new GestureDetector(context, r1, handler);
        this.A0G = new ScaleGestureDetector(context, r1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0B = viewConfiguration.getScaledTouchSlop();
        this.A0A = viewConfiguration.getScaledEdgeSlop();
    }

    public final void DHa(float f, float f2) {
        this.A02 = f;
    }
}
