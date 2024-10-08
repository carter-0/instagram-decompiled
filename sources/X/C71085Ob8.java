package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ob8  reason: case insensitive filesystem */
public final class C71085Ob8 {
    public float A00;
    public float A01;
    public int A02;
    public AnimatorSet A03;
    public View A04;
    public ViewGroup A05;
    public IgTextView A06;
    public C74482Pvc A07;
    public C71091OcD A08;
    public C331157Pu A09;
    public Float A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final Context A0I;
    public final PointF A0J;
    public final Vibrator A0K;
    public final View A0L;
    public final FrameLayout A0M;
    public final FrameLayout A0N;
    public final AnonymousClass0iw A0O;
    public final 0wc A0P;
    public final UserSession A0Q;
    public final C252063oV A0R;
    public final C70741OJm A0S;
    public final C254743sy A0T;
    public final AnonymousClass37D A0U;
    public final List A0V;
    public final AnonymousClass0eM A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final PointF A0e;
    public final List A0f;

    private final List A00(int i) {
        ArrayList arrayList;
        boolean z = this.A0Z;
        if (i == 29) {
            if (!z) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                C249803kO A0J2 = C66580MXl.A0J(C254853tA.A03);
                while (A0J2.hasNext()) {
                    A1C.add(((C254853tA) AnonymousClass7TF.A0a(A0J2)).A02);
                }
                arrayList = A1C;
            }
            ImmutableList immutableList = C254853tA.A03;
            arrayList = AnonymousClass7TE.A1I("❤");
        } else {
            if (!z) {
                arrayList = C71100Oca.A01();
            }
            ImmutableList immutableList2 = C254853tA.A03;
            arrayList = AnonymousClass7TE.A1I("❤");
        }
        if (arrayList.size() > 6) {
            return arrayList.subList(0, 6);
        }
        return arrayList;
    }

    public static final void A01(View view, C71085Ob8 ob8, int i) {
        view.setOutlineProvider(new C52861Gdu(ob8.A0I.getResources().getDimensionPixelSize(R.dimen.audio_dubbing_gen_ai_gif_size), 1));
        view.setElevation((float) i);
    }

    public static final void A02(C71085Ob8 ob8, String str) {
        IgTextView igTextView = ob8.A06;
        if (igTextView != null) {
            DbX.A13(ob8.A0I, igTextView, str, 2131959169);
        }
    }

    public final void A03() {
        float f;
        FrameLayout frameLayout = this.A0N;
        C294975nL A0A2 = JTP.A0b(frameLayout).A0A();
        Float f2 = this.A0A;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            PointF pointF = this.A0J;
            if (pointF != null) {
                f = pointF.x;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        A0A2.A0U(1.0f, 0.0f, f);
        A0A2.A0V(1.0f, 0.0f, (float) frameLayout.getHeight());
        A0A2.A0M(1.0f, 0.0f);
        A0A2.A0H();
    }

    public final void A04(Float f, float f2) {
        FrameLayout frameLayout = this.A0N;
        float f3 = 0.0f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        frameLayout.setTranslationY(f2);
        if (f != null) {
            f3 = f.floatValue();
        }
        frameLayout.setTranslationX(f3);
    }

    public C71085Ob8(Context context, PointF pointF, FrameLayout frameLayout, FrameLayout frameLayout2, AnonymousClass0iw r19, UserSession userSession, C70741OJm oJm, C254743sy r22, AnonymousClass37D r23, List list, List list2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        List A002;
        C70741OJm oJm2 = oJm;
        DbW.A1N(context, 2, oJm2);
        FrameLayout frameLayout3 = frameLayout2;
        0qQ.A0B(frameLayout3, 7);
        UserSession userSession2 = userSession;
        this.A0Q = userSession2;
        this.A0I = context;
        int i4 = i;
        this.A0H = i4;
        this.A0E = i2;
        this.A0S = oJm2;
        FrameLayout frameLayout4 = frameLayout;
        this.A0M = frameLayout4;
        this.A0N = frameLayout3;
        PointF pointF2 = pointF;
        this.A0e = pointF2;
        List list3 = list;
        this.A0f = list3;
        this.A0G = i3;
        AnonymousClass0iw r6 = r19;
        this.A0O = r6;
        this.A0a = z;
        this.A0b = z2;
        this.A0c = z3;
        this.A0d = z4;
        this.A0X = z5;
        this.A0T = r22;
        this.A0Z = z6;
        this.A0Y = z7;
        this.A0V = list2;
        this.A0U = r23;
        this.A0P = AnonymousClass0kN.A01(r6, userSession2);
        Object systemService = context.getSystemService("vibrator");
        if (systemService != null) {
            this.A0K = (Vibrator) systemService;
            this.A0W = AnonymousClass1YB.A00(C73921Pm1.A00(this, 32));
            this.A0L = AnonymousClass7TF.A0G(frameLayout4, R.id.reactions_background_dimmer);
            this.A0J = pointF2;
            this.A0D = true;
            this.A0F = IgNetworkConsentStorage.MAX_ENTRIES;
            this.A02 = -1;
            this.A0R = 2b1.A01(frameLayout4.requireViewById(R.id.customize_reactions_header), false, false);
            List A003 = A00(i4);
            boolean z8 = this.A0X;
            if (!z8 || this.A0Z) {
                A002 = A00(this.A0H);
            } else {
                A002 = C71100Oca.A02(this.A0Q);
            }
            A002 = A002.size() > 6 ? A002.subList(0, 6) : A002;
            if (i4 == 29) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (Object next : A002) {
                    ImmutableList immutableList = C254853tA.A03;
                    if (0qQ.A0K(next, "❤")) {
                        next = "❤";
                    }
                    builder.add(next);
                }
                A002 = builder.build();
            }
            C70729OHy oHy = new C70729OHy(A002, A003, list3, this.A0a, this.A0b, this.A0c, this.A0d, z8, this.A0Y);
            C72634PDn pDn = new C72634PDn(this);
            this.A07 = pDn;
            UserSession userSession3 = this.A0Q;
            this.A08 = new C71091OcD(this.A0I, this.A0N, this.A0O, userSession3, pDn, oHy, 182.A06(0Tu.A05, userSession3, 36326657296054173L));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
