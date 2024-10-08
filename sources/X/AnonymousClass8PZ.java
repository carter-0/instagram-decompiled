package X;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8PZ  reason: invalid class name */
public final class AnonymousClass8PZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Surface A04;
    public TextureView A05;
    public FrameLayout A06;
    public AnonymousClass51M A07;
    public AnonymousClass4MM A08;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final ViewGroup A0C;
    public final Fragment A0D;
    public final 0bY A0E;
    public final UserSession A0F;
    public final TargetViewSizeProvider A0G;
    public final AnonymousClass8FA A0H;
    public final C3497481o A0I;
    public final C3497281m A0J;
    public final AnonymousClass8Q2 A0K;
    public final AnonymousClass8Q1 A0L;
    public final C3495780x A0M;
    public final Runnable A0N = new C355218Pc(this);
    public final ViewStub A0O;
    public final C355208Pb A0P;
    public final 2Nn A0Q;

    public AnonymousClass8PZ(Context context, View view, Fragment fragment, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8FA r14, C3497481o r15, C3497281m r16, C3495780x r17) {
        0qQ.A0B(context, 1);
        0qQ.A0B(fragment, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(targetViewSizeProvider, 6);
        C3495780x r1 = r17;
        0qQ.A0B(r1, 8);
        this.A0B = context;
        this.A0D = fragment;
        this.A0F = userSession;
        this.A0J = r16;
        this.A0H = r14;
        this.A0G = targetViewSizeProvider;
        this.A0I = r15;
        this.A0M = r1;
        C355198Pa r5 = new C355198Pa(this);
        this.A0P = r5;
        View findViewById = view.findViewById(R.id.video_review_container_stub);
        0qQ.A07(findViewById);
        ViewStub viewStub = (ViewStub) findViewById;
        this.A0O = viewStub;
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.A0C = viewGroup;
        this.A0A = context.getResources().getInteger(17694720);
        2Nn A002 = 2Nm.A00(context, userSession);
        this.A0Q = A002;
        this.A0L = new 2YN((AnonymousClass07g) context).A00(AnonymousClass8Q1.class);
        this.A0E = new 1Q7("IgSecureUriParser").A00;
        this.A00 = Integer.MAX_VALUE;
        View findViewById2 = viewGroup.findViewById(R.id.video_review_trim_mode);
        0qQ.A07(findViewById2);
        this.A0K = new AnonymousClass8Q2((ConstraintLayout) findViewById2, fragment, userSession, r5, (C353488Hv) null, A002);
    }

    public static final void A00(AnonymousClass8PZ r6, boolean z) {
        r6.A09 = false;
        AnonymousClass4MM r0 = r6.A08;
        if (r0 != null) {
            r0.ECQ(false);
        }
        r6.A08 = null;
        TextureView textureView = r6.A05;
        if (textureView != null) {
            r6.A0C.removeView(textureView);
            r6.A05 = null;
        }
        ViewGroup viewGroup = r6.A0C;
        viewGroup.setVisibility(8);
        C294975nL A0C2 = C294975nL.A01(viewGroup, 1).A0C((long) r6.A0A);
        A0C2.A0M(0.0f, 1.0f);
        A0C2.A05 = new C40637Afz(r6);
        A0C2.A0H();
        r6.A0J.A00().EuK();
        r6.A0H.A00.Epw(true);
        viewGroup.removeCallbacks(r6.A0N);
        r6.A0K.CL9(false);
        AnonymousClass8Q1 r2 = r6.A0L;
        r2.A04.Epw(false);
        r2.A03.Epw(Boolean.valueOf(!z));
    }
}
