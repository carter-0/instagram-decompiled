package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.meta.foa.session.FoaUserSession;
import java.util.concurrent.atomic.AtomicInteger;

public final class WE9 implements AnonymousClass07Z, AnonymousClass07g, C21043XAw, X5O {
    public static final AtomicInteger A07 = new AtomicInteger();
    public final C587707f A00 = new C587707f();
    public final Context A01;
    public final FrameLayout A02;
    public final 0h9 A03;
    public final C49719F3f A04;
    public final Vk7 A05;
    public final C17721Vcq A06;

    public WE9(Context context, C49726F3q f3q, C51892G6h g6h, C49719F3f f3f, FoaUserSession foaUserSession, Object obj) {
        this.A01 = context;
        this.A04 = f3f;
        this.A02 = new FrameLayout(context);
        Vk7 vk7 = new Vk7(String.valueOf(A07.incrementAndGet()));
        this.A05 = vk7;
        0h9 r1 = new 0h9(this);
        r1.A0C(07U.A01);
        this.A03 = r1;
        this.A06 = new C17721Vcq(this, this, f3q, g6h, f3f, vk7, foaUserSession, obj);
    }

    public final void EB8() {
    }

    public final void AOx() {
        this.A03.A0C(07U.A01);
        C17721Vcq vcq = this.A06;
        vcq.A09.clear();
        vcq.A0A.clear();
        vcq.A0B.clear();
        vcq.A0C.clear();
    }

    public final String AbU() {
        return this.A04.A00;
    }

    public final String AgM() {
        return this.A05.A00;
    }

    public final View Aqo(Context context) {
        C17721Vcq vcq = this.A06;
        0sK r4 = vcq.A05.A02;
        C56039Hrm hrm = new C56039Hrm(context, vcq.A02, vcq.A06, vcq.A07);
        hrm.A00 = vcq;
        View view = (View) r4.invoke(hrm, vcq.A08, vcq.A04);
        hrm.A00 = null;
        return view;
    }

    public final View BCk() {
        return this.A02;
    }

    public final C16501Uvx Bcz() {
        return C16501Uvx.Native;
    }

    public final boolean CxY() {
        C62320sa r0 = this.A06.A00;
        if (r0 != null) {
            return C51971G9r.A1b(r0);
        }
        return false;
    }

    public final void Dyl() {
        this.A03.A0C(07U.A04);
    }

    public final void EIx() {
        this.A03.A0C(07U.A04);
    }

    public final void destroy() {
        this.A03.A0C(07U.A02);
        Activity A002 = C46604Dhk.A00(this.A01);
        if (A002 != null && !A002.isChangingConfigurations()) {
            this.A00.A00();
        }
    }

    public final Context getContext() {
        return this.A01;
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A03;
    }

    public final C587707f getViewModelStore() {
        return this.A00;
    }

    public final void pause() {
        this.A03.A0C(07U.A05);
    }

    public final void stop() {
        this.A03.A0C(07U.A01);
    }
}
