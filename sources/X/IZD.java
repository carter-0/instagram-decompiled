package X;

import android.animation.Animator;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class IZD implements JRK {
    public AnonymousClass6LP A00;
    public AnonymousClass6LQ A01;
    public C307786Rm A02;
    public JQM A03;
    public String A04;
    public C62320sa A05;
    public C313306gE A06;
    public final Context A07;
    public final AnonymousClass62I A08 = new AnonymousClass62I();
    public final UserSession A09;
    public final HashMap A0A = AnonymousClass7TE.A1E();

    public IZD(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A07 = context;
        this.A09 = userSession;
    }

    public final int getCurrentPositionMs() {
        return 0;
    }

    private final Set A00() {
        C307786Rm r1 = this.A02;
        if (r1 != null) {
            return new HashSet(((AbstractMap) r1.A00(R.id.bk_context_key_animations)).values());
        }
        return 0sl.A00;
    }

    public final void A01() {
        this.A0A.clear();
        AnonymousClass6LP r0 = this.A00;
        if (r0 != null) {
            r0.A09();
        }
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        C313306gE r02 = this.A06;
        if (r02 != null) {
            r02.A03();
        }
        C313306gE r03 = this.A06;
        if (r03 != null) {
            r03.A02();
        }
        this.A06 = null;
        this.A05 = null;
        this.A03 = null;
    }

    public final void CN9(UserSession userSession, String str, boolean z) {
        if (this.A06 == null) {
            C313306gE r1 = new C313306gE(this.A07, userSession, new IZ9(), str, "clips_viewer_clips_tab");
            this.A06 = r1;
            r1.A00 = null;
        }
    }

    public final void Dy7() {
        AnonymousClass6LP r0 = this.A00;
        if (r0 != null) {
            r0.A0A();
        }
    }

    public final void Dy8() {
        AnonymousClass6LP r2 = this.A00;
        if (r2 != null) {
            r2.A0H("video_play_request_start", (String) null);
        }
    }

    public final void Dy9() {
        AnonymousClass6LP r2 = this.A00;
        if (r2 != null) {
            r2.A0H("video_play_request_success", (String) null);
        }
    }

    public final void EHs(UserSession userSession, boolean z, boolean z2, boolean z3) {
        C313306gE r0;
        C313306gE r02;
        if (z3 && (r02 = this.A06) != null) {
            r02.A03();
        }
        if (!z2 && (r0 = this.A06) != null) {
            r0.A02();
        }
    }

    public final void Eqr(float f, int i) {
        C313306gE r0 = this.A06;
        if (r0 != null) {
            r0.A05(f);
        }
    }

    public final AnonymousClass6K2 getVideoView() {
        C62320sa r0 = this.A05;
        if (r0 != null) {
            return (AnonymousClass6K2) r0.invoke();
        }
        return null;
    }

    public final void seekTo(int i) {
        C313306gE r0 = this.A06;
        if (r0 != null) {
            r0.A06(i);
        }
    }

    public final void ADT(XB5 xb5, String str) {
        boolean A1X = DbW.A1X(str);
        C313306gE r1 = this.A06;
        if (r1 != null) {
            r1.A07(xb5, (C315536k3) null, str, A1X);
        }
    }

    public final boolean EIz() {
        String str;
        for (Animator resume : A00()) {
            resume.resume();
        }
        C313306gE r1 = this.A06;
        if (!(r1 == null || (str = r1.A01) == null)) {
            C313306gE.A00(r1, str);
        }
        return isPlaying();
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
        C313306gE r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void stop() {
        for (Animator end : A00()) {
            end.end();
        }
    }

    public final void setTransformation(AnonymousClass3OA r1, UserSession userSession, C229382nI r3, JQM jqm) {
        this.A03 = jqm;
    }
}
