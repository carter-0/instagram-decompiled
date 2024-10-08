package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Pi  reason: invalid class name and case insensitive filesystem */
public final class C307236Pi implements C316076l4, C309476Yk {
    public C309426Yf A00;
    public AnonymousClass6MY A01;
    public C307246Pj A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final UserSession A06;
    public final C252063oV A07;
    public final C252063oV A08;
    public final C307086Ot A09;
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9L1(this, 7));
    public final boolean A0B;

    public final void A00() {
        this.A07.setVisibility(8);
        if (182.A06(0Tu.A05, this.A06, 36324269294104500L)) {
            this.A08.setVisibility(8);
        }
        C252063oV r1 = this.A09.A07;
        if (r1.CVM()) {
            r1.setVisibility(8);
        }
    }

    public final void A01() {
        this.A07.setVisibility(0);
        if (182.A06(0Tu.A05, this.A06, 36324269294104500L)) {
            this.A08.setVisibility(0);
        }
    }

    public final C74500Pvu AjF() {
        return this.A01;
    }

    public final C305946Ke C3Z() {
        AnonymousClass0eM r2 = this.A0A;
        ((C305946Ke) r2.getValue()).A00 = this.A00;
        return (C305946Ke) r2.getValue();
    }

    public C307236Pi(Context context, View view, UserSession userSession, C252063oV r7) {
        this.A07 = r7;
        this.A06 = userSession;
        this.A02 = new C307246Pj(2b1.A01(view.requireViewById(R.id.reel_chip_metadata_view_label_stub), false, false));
        this.A09 = new C307086Ot(userSession, 2b1.A01(view.requireViewById(R.id.reel_sug_above_cta_stub), false, false));
        this.A08 = 2b1.A01(view.requireViewById(R.id.reel_cta_sticker_expanded_tap_area_stub), false, false);
        this.A04 = C316216lI.A02(context);
        this.A05 = C316216lI.A03(context);
        this.A0B = C316216lI.A0B(context);
        this.A03 = C316216lI.A00(context);
    }
}
