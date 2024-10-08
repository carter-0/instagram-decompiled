package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Dhi  reason: case insensitive filesystem */
public final class C46602Dhi implements C21043XAw {
    public C46583DhP A00;
    public final Context A01;
    public final C299025uS A02;
    public final String A03;

    public final void Dyl() {
    }

    public final void EIx() {
    }

    public final void pause() {
    }

    public final void AOx() {
        C46583DhP dhP = this.A00;
        if (dhP == null) {
            0qQ.A0F("bloksSurfaceController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            dhP.A07();
        }
    }

    public final String AbU() {
        C46583DhP dhP = this.A00;
        if (dhP == null) {
            0qQ.A0F("bloksSurfaceController");
            throw AnonymousClass00P.createAndThrow();
        }
        C46645DiQ diQ = dhP.A05;
        String str = diQ.A08;
        if (str == null) {
            str = diQ.A09;
        }
        if (str == null) {
            return diQ.A09;
        }
        return str;
    }

    public final String AgM() {
        return this.A03;
    }

    public final View Aqo(Context context) {
        C46583DhP dhP = this.A00;
        if (dhP == null) {
            0qQ.A0F("bloksSurfaceController");
            throw AnonymousClass00P.createAndThrow();
        }
        Object obj = dhP.A04(context).first;
        if (obj != null) {
            return (View) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final View BCk() {
        return this.A02;
    }

    public final C16501Uvx Bcz() {
        return C16501Uvx.Bloks;
    }

    public final void EB8() {
        C46583DhP dhP = this.A00;
        if (dhP == null) {
            0qQ.A0F("bloksSurfaceController");
            throw AnonymousClass00P.createAndThrow();
        }
        C359978dn r0 = dhP.A01;
        if (r0 != null) {
            r0.EB8();
        }
    }

    public final void destroy() {
        C46583DhP dhP = this.A00;
        if (dhP == null) {
            0qQ.A0F("bloksSurfaceController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            dhP.A06();
        }
    }

    public final Context getContext() {
        return this.A01;
    }

    public final void stop() {
        C46583DhP dhP = this.A00;
        if (dhP == null) {
            0qQ.A0F("bloksSurfaceController");
            throw AnonymousClass00P.createAndThrow();
        }
        G8K g8k = dhP.A00;
        if (g8k != null) {
            g8k.Cft("BloksSurfaceController_onPause");
        }
    }

    public C46602Dhi(C299025uS r2, String str) {
        this.A02 = r2;
        this.A03 = str;
        this.A01 = AnonymousClass7TE.A0S(r2);
    }
}
