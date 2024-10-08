package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.TzA  reason: case insensitive filesystem */
public final class C14604TzA implements C21043XAw, XBO, C20943X5m {
    public final 0h9 A00;
    public final C299025uS A01;
    public final Context A02;
    public final C14608TzE A03;
    public final C18972WEz A04;
    public final /* synthetic */ TzF A05 = TzF.A00;

    public C14604TzA(Context context, C18972WEz wEz, C229392nJ r5) {
        0qQ.A0B(wEz, 2);
        this.A02 = context;
        this.A04 = wEz;
        this.A00 = new 0h9(this);
        this.A01 = new C299025uS(context);
        this.A03 = C18522VtM.A00(context, wEz, this, r5, AnonymousClass05K.A00);
        this.A00.A0C(07U.A01);
    }

    public final AnonymousClass2Ta Cfj(C244943c0 r8, 2Th r9, C276544tV r10, C276544tV r11, int i, int i2) {
        0qQ.A0B(r11, 5);
        return this.A05.Cfj(r8, r9, r10, r11, i, i2);
    }

    public final void EB8() {
    }

    public final void EIx() {
    }

    public final boolean Etd(C276544tV r2, C276544tV r3, Object obj, Object obj2) {
        return this.A05.Etd(r2, r3, obj, obj2);
    }

    public final void pause() {
    }

    public final String AbU() {
        return this.A04.A04;
    }

    public final String AgM() {
        return this.A04.A06;
    }

    public final View Aqo(Context context) {
        C14608TzE tzE = this.A03;
        Context context2 = tzE.A02;
        AnonymousClass6NS r2 = tzE.A04;
        0qQ.A0B(r2, 1);
        C273694n2 r1 = new C273694n2(context2);
        C51968G9o.A1D(r1, -1);
        r2.A07(r1);
        return r1;
    }

    public final View BCk() {
        return this.A01;
    }

    public final C16501Uvx Bcz() {
        return C16501Uvx.Bloks;
    }

    public final /* bridge */ /* synthetic */ void D5Q(C13690Tf8 tf8) {
        C14605TzB tzB = (C14605TzB) tf8;
        0qQ.A0B(tzB, 0);
        C245663dH r1 = (C245663dH) tzB.A00;
        if (r1 != null) {
            this.A01.setRenderTree(r1);
        }
    }

    public final void Dyl() {
        this.A00.A0C(07U.A04);
    }

    public final void Ee0(C14644Tzq tzq) {
        C14608TzE tzE = this.A03;
        if (tzE != null) {
            tzE.A00 = tzq;
            if (tzq != null) {
                tzE.A00();
            }
        }
    }

    public final void destroy() {
        this.A00.A0C(07U.A02);
    }

    public final Context getContext() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass07V getLifecycle() {
        return this.A00;
    }

    public final void stop() {
        this.A00.A0C(07U.A01);
    }

    public final void AOx() {
        stop();
        this.A03.A04.A04();
    }
}
