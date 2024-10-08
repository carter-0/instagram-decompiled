package X;

import android.animation.Animator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: X.IXl  reason: case insensitive filesystem */
public final class C57328IXl implements C59668JSn {
    public LithoView A00;
    public ListenableFuture A01;
    public C307786Rm A02;
    public int A03;
    public AnonymousClass6LP A04;
    public AnonymousClass6LQ A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final C3028265o A09;
    public final Context A0A;
    public final ViewGroup A0B;
    public final AnonymousClass62I A0C = new AnonymousClass62I();

    private final Set A00() {
        C307786Rm r1 = this.A02;
        if (r1 != null) {
            return new HashSet(((AbstractMap) r1.A00(R.id.bk_context_key_animations)).values());
        }
        return 0sl.A00;
    }

    public static final void A01(C57328IXl iXl, Throwable th) {
        if (th instanceof CancellationException) {
            AnonymousClass6LP r0 = iXl.A04;
            if (r0 != null) {
                r0.A07();
                return;
            }
            return;
        }
        iXl.A09.DOf(3);
        AnonymousClass6LP r1 = iXl.A04;
        if (r1 != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            r1.A0F(message);
        }
    }

    public final boolean CWX() {
        LithoView lithoView = this.A00;
        if (lithoView == null || lithoView.A00 == null) {
            return false;
        }
        return true;
    }

    public final void ClL(AnonymousClass6Q5 r3) {
        this.A0C.A00(r3.A00);
    }

    public final void Dy7() {
        AnonymousClass6LP r0 = this.A04;
        if (r0 != null) {
            r0.A0A();
        }
    }

    public final void Dy8() {
        AnonymousClass6LP r2 = this.A04;
        if (r2 != null) {
            r2.A0H("video_play_request_start", (String) null);
        }
    }

    public final void Dy9() {
        AnonymousClass6LP r2 = this.A04;
        if (r2 != null) {
            r2.A0H("video_play_request_success", (String) null);
        }
    }

    public final void Dyz() {
        LithoView lithoView;
        AnonymousClass6LQ r2;
        String str = this.A06;
        if (str != null) {
            AnonymousClass6LP r0 = this.A04;
            if (r0 != null) {
                r0.A08();
            }
            AnonymousClass6LP r1 = this.A04;
            if (r1 != null) {
                r1.A0H("fully_enter_viewport", str);
            }
            this.A0C.Cgh(C306046Ko.A01(AnonymousClass05K.A01, str));
        }
        if (this.A08 && (lithoView = this.A00) != null && (r2 = this.A05) != null) {
            int i = this.A03;
            C56657I6m.A01(this.A0A, lithoView, r2, 0Yt.A0E(), 0.0f, i);
        }
    }

    public final void Dz8() {
        AnonymousClass6LP r0 = this.A04;
        if (r0 != null) {
            r0.A09();
        }
        this.A0C.Cgh(C306046Ko.A00(AnonymousClass05K.A01));
    }

    public final void DzB() {
        String str = this.A06;
        if (str != null) {
            AnonymousClass6LP r0 = this.A04;
            if (r0 != null) {
                r0.A08();
            }
            AnonymousClass6LP r1 = this.A04;
            if (r1 != null) {
                r1.A0H("partially_enter_viewport", str);
            }
            this.A0C.Cgh(C306046Ko.A02(AnonymousClass05K.A01, str));
        }
    }

    public final void ElG(UserSession userSession, IgShowreelComposition igShowreelComposition, AnonymousClass6LO r23, C229392nJ r24, AnonymousClass6NN r25, C54705HPk hPk, C307786Rm r27) {
        1Ks A012;
        String str;
        AnonymousClass6LO r8 = r23;
        AnonymousClass6NN r9 = r25;
        if (!CWX() || (str = this.A07) == null || !str.equals(igShowreelComposition.AqT())) {
            AnonymousClass6LP r0 = this.A04;
            if (r0 != null) {
                r0.A07();
            }
            if (this.A00 == null) {
                LithoView lithoView = new LithoView(this.A0A);
                this.A00 = lithoView;
                this.A0B.addView(lithoView, new FrameLayout.LayoutParams(-1, -1, 17));
            }
            this.A02 = r27;
            this.A07 = igShowreelComposition.AqT();
            ListenableFuture listenableFuture = this.A01;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
            }
            C3028265o r6 = this.A09;
            r6.DOf(1);
            String F01 = ((C306796Nn) r8).A04.F01();
            String A0j = AnonymousClass7TG.A0j();
            String Anf = igShowreelComposition.Anf();
            String C4b = igShowreelComposition.C4b();
            if (F01 == null) {
                F01 = "";
            }
            AnonymousClass6Q8 r14 = new AnonymousClass6Q8(A0j, Anf, C4b, F01, igShowreelComposition.AqT().length());
            UserSession userSession2 = userSession;
            AnonymousClass6LP r82 = new AnonymousClass6LP(C51965G9l.A0l(), r14, new AnonymousClass6Q9(userSession2));
            r82.A08();
            0Tu r3 = 0Tu.A05;
            this.A08 = 182.A06(r3, userSession2, 36312733012657381L);
            this.A03 = DbS.A04(r3, userSession2, 36594207989434001L);
            if (this.A08) {
                this.A05 = new AnonymousClass6LQ(C51965G9l.A0l(), r14);
            }
            r82.A0H("prepare_render_start", (String) null);
            String AqT = igShowreelComposition.AqT();
            AnonymousClass6OI A002 = AnonymousClass6OH.A00(userSession2);
            AnonymousClass6Q9 r11 = new AnonymousClass6Q9(userSession2);
            boolean A062 = 182.A06(r3, r11.A00, 36312733012460772L);
            0qQ.A0B(AqT, 0);
            Object obj = A002.A01.get(AqT);
            boolean A1V = AnonymousClass7TF.A1V(obj);
            r82.A03();
            boolean A063 = 182.A06(r3, userSession2, 2342155742225695969L);
            if (obj != null) {
                A012 = new 1Ks(obj);
            } else {
                A012 = AnonymousClass6OL.A01(AqT, A063);
            }
            this.A01 = A012;
            if (A012 != null) {
                C255183ti.A04(new IL1(r82, r9, A002, r11, r24, this, AqT, A1V, A062), A012, AnonymousClass6OG.A01);
            }
            r6.CIc(r14);
            this.A04 = r82;
            this.A06 = r14.A02;
            return;
        }
        r9.onSuccess();
    }

    public final AnonymousClass6K2 getVideoView() {
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            return (AnonymousClass6K2) lithoView.findViewWithTag("showreel_composition_video_view_tag");
        }
        return null;
    }

    public final void reset() {
        this.A09.DOf(0);
        ListenableFuture listenableFuture = this.A01;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.A01 = null;
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            lithoView.A0k((ComponentTree) null, true);
        }
        this.A0B.removeView(this.A00);
        AnonymousClass6LP r0 = this.A04;
        if (r0 != null) {
            r0.A09();
        }
        this.A00 = null;
        this.A02 = null;
        this.A07 = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
    }

    public C57328IXl(Context context, ViewGroup viewGroup, C3028265o r4) {
        this.A0A = context;
        this.A0B = viewGroup;
        this.A09 = r4;
    }

    public final void E2p() {
        for (Animator start : A00()) {
            start.start();
        }
    }

    public final void EIx() {
        for (Animator resume : A00()) {
            resume.resume();
        }
    }

    public final boolean isPlaying() {
        Set<Animator> A002 = A00();
        if (!(A002 instanceof Collection) || !A002.isEmpty()) {
            for (Animator isRunning : A002) {
                if (isRunning.isRunning()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void pause() {
        for (Animator pause : A00()) {
            pause.pause();
        }
    }

    public final void stop() {
        for (Animator end : A00()) {
            end.end();
        }
    }
}
