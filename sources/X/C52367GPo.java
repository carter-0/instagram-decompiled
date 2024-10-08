package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GPo  reason: case insensitive filesystem */
public class C52367GPo implements C59668JSn {
    public float A00;
    public int A01;
    public AnonymousClass6LP A02;
    public AnonymousClass6LQ A03;
    public IgShowreelComposition A04;
    public String A05;
    public boolean A06;
    public final C52504GVh A07;
    public final C3028265o A08;
    public final Context A09;
    public final C273694n2 A0A;
    public final AnonymousClass62I A0B = new AnonymousClass62I();

    public final void ElG(UserSession userSession, IgShowreelComposition igShowreelComposition, AnonymousClass6LO r14, C229392nJ r15, AnonymousClass6NN r16, C54705HPk hPk, C307786Rm r18) {
        IgShowreelComposition igShowreelComposition2;
        IgShowreelComposition igShowreelComposition3 = igShowreelComposition;
        AnonymousClass6NN r6 = r16;
        if (!CWX() || (igShowreelComposition2 = this.A04) == null || !igShowreelComposition2.equals(igShowreelComposition)) {
            ListenableFuture listenableFuture = this.A07.A00;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
            }
            this.A04 = igShowreelComposition;
            C3028265o r1 = this.A08;
            r1.DOf(1);
            AnonymousClass6Q8 A002 = AnonymousClass6NO.A00(r14, igShowreelComposition);
            AnonymousClass6LP A003 = A00(A002, userSession, this);
            0sm A0E = 0Yt.A0E();
            A02(new SparseArray(), A003, r6, r15, userSession, igShowreelComposition3, A0E);
            r1.CIc(A002);
            this.A02 = A003;
            this.A05 = A002.A02;
            return;
        }
        r6.onSuccess();
    }

    public static AnonymousClass6LP A00(AnonymousClass6Q8 r4, UserSession userSession, C52367GPo gPo) {
        02m r1 = 02m.A0p;
        0qQ.A07(r1);
        AnonymousClass6LP r3 = new AnonymousClass6LP(r1, r4, new AnonymousClass6Q9(userSession));
        r3.A08();
        0Tu r2 = 0Tu.A05;
        gPo.A06 = 182.A06(r2, userSession, 36312733012657381L);
        gPo.A01 = (int) 182.A01(r2, userSession, 36594207989434001L);
        if (gPo.A06) {
            02m r12 = 02m.A0p;
            0qQ.A07(r12);
            gPo.A03 = new AnonymousClass6LQ(r12, r4);
        }
        return r3;
    }

    private final Set A01() {
        C307786Rm A022;
        AnonymousClass6NS r0 = this.A07.A01;
        if (r0 == null || (A022 = r0.A02()) == null) {
            return 0sl.A00;
        }
        HashSet hashSet = new HashSet(((AbstractMap) A022.A00(R.id.bk_context_key_animations)).values());
        0qQ.A0A(hashSet);
        return hashSet;
    }

    public final void A02(SparseArray sparseArray, AnonymousClass6LP r19, AnonymousClass6NN r20, C229392nJ r21, UserSession userSession, IgShowreelComposition igShowreelComposition, Map map) {
        1Ks A012;
        0Tu r4 = 0Tu.A05;
        UserSession userSession2 = userSession;
        boolean A062 = 182.A06(r4, userSession2, 2342155742225695969L);
        C52504GVh gVh = this.A07;
        Context context = this.A09;
        String AqT = igShowreelComposition.AqT();
        AnonymousClass6LP r7 = r19;
        AnonymousClass6NP r8 = new AnonymousClass6NP(r7, r20, this);
        0qQ.A0B(AqT, 5);
        r7.A0H("prepare_render_start", (String) null);
        AnonymousClass6OI A002 = AnonymousClass6OH.A00(userSession2);
        AnonymousClass6Q9 r11 = new AnonymousClass6Q9(userSession2);
        boolean A063 = 182.A06(r4, r11.A00, 36312733012460772L);
        Object obj = A002.A01.get(AqT);
        boolean A1V = AnonymousClass7TF.A1V(obj);
        r7.A03();
        if (obj != null) {
            A012 = new 1Ks(obj);
        } else {
            A012 = AnonymousClass6OL.A01(AqT, A062);
        }
        gVh.A00 = A012;
        C255183ti.A04(new AnonymousClass6NQ(context, sparseArray, r7, r8, A002, gVh, r11, r21, AqT, map, A1V, A063), A012, AnonymousClass6OG.A01);
    }

    public final boolean CWX() {
        C52504GVh gVh = this.A07;
        if (gVh.A02 == null || gVh.A01 == null) {
            return false;
        }
        return true;
    }

    public final void ClL(AnonymousClass6Q5 r3) {
        this.A0B.A00(r3.A00);
    }

    public final void Dy7() {
        AnonymousClass6LP r0 = this.A02;
        if (r0 != null) {
            r0.A0A();
        }
    }

    public final void Dy8() {
        AnonymousClass6LP r2 = this.A02;
        if (r2 != null) {
            r2.A0H("video_play_request_start", (String) null);
        }
    }

    public final void Dy9() {
        AnonymousClass6LP r2 = this.A02;
        if (r2 != null) {
            r2.A0H("video_play_request_success", (String) null);
        }
    }

    public final void Dyz() {
        AnonymousClass6LQ r2;
        AnonymousClass6LP r0 = this.A02;
        if (r0 != null) {
            r0.A08();
        }
        String str = this.A05;
        if (str != null) {
            AnonymousClass6LP r1 = this.A02;
            if (r1 != null) {
                r1.A0H("fully_enter_viewport", str);
            }
            this.A0B.Cgh(C306046Ko.A01(AnonymousClass05K.A01, str));
        }
        if (this.A06 && (r2 = this.A03) != null) {
            C273694n2 r12 = this.A0A;
            int i = this.A01;
            float f = this.A00;
            C56657I6m.A01(this.A09, r12, r2, AnonymousClass7TE.A1E(), f, i);
        }
    }

    public final void Dz8() {
        AnonymousClass6LP r0 = this.A02;
        if (r0 != null) {
            r0.A09();
        }
        this.A0B.Cgh(C306046Ko.A00(AnonymousClass05K.A01));
    }

    public final void DzB() {
        AnonymousClass6LP r0 = this.A02;
        if (r0 != null) {
            r0.A08();
        }
        String str = this.A05;
        if (str != null) {
            AnonymousClass6LP r1 = this.A02;
            if (r1 != null) {
                r1.A0H("partially_enter_viewport", str);
            }
            this.A0B.Cgh(C306046Ko.A02(AnonymousClass05K.A01, str));
        }
    }

    public final AnonymousClass6K2 getVideoView() {
        return (AnonymousClass6K2) this.A0A.findViewWithTag("showreel_composition_video_view_tag");
    }

    public void reset() {
        this.A08.DOf(0);
        this.A04 = null;
        C52504GVh gVh = this.A07;
        ListenableFuture listenableFuture = gVh.A00;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        AnonymousClass6NS r0 = gVh.A01;
        if (r0 != null) {
            r0.A04();
            gVh.A01 = null;
            gVh.A02 = null;
        }
        AnonymousClass6LP r02 = this.A02;
        if (r02 != null) {
            r02.A09();
        }
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
    }

    public C52367GPo(Context context, ViewGroup viewGroup, C3028265o r7) {
        this.A09 = context;
        this.A08 = r7;
        C273694n2 r3 = new C273694n2(context);
        this.A0A = r3;
        viewGroup.addView(r3, new FrameLayout.LayoutParams(-1, -1, 17));
        this.A07 = new C52504GVh(r3);
    }

    public final void E2p() {
        for (Animator start : A01()) {
            start.start();
        }
    }

    public final void EIx() {
        for (Animator resume : A01()) {
            resume.resume();
        }
    }

    public final boolean isPlaying() {
        Set<Animator> A012 = A01();
        if (!(A012 instanceof Collection) || !A012.isEmpty()) {
            for (Animator isRunning : A012) {
                if (isRunning.isRunning()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void pause() {
        for (Animator pause : A01()) {
            pause.pause();
        }
    }

    public final void stop() {
        for (Animator end : A01()) {
            end.end();
        }
    }
}
