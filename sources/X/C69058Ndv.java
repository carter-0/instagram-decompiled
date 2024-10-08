package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

/* renamed from: X.Ndv  reason: case insensitive filesystem */
public final class C69058Ndv extends AnonymousClass3N8 {
    public final C252063oV A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final View A00() {
        return AnonymousClass7TE.A0c(this.A03);
    }

    public final View A01() {
        return AnonymousClass7TE.A0c(this.A07);
    }

    public final TextView A02() {
        return JTO.A0I(this.A05);
    }

    public final TextView A03() {
        return JTO.A0I(this.A04);
    }

    public final TextView A04() {
        return JTO.A0I(this.A06);
    }

    public final TextView A05() {
        return null;
    }

    public final C252063oV A07() {
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69058Ndv(Context context, Resources resources, ViewStub viewStub) {
        super(context, resources);
        AnonymousClass7TG.A1U(viewStub, context, resources);
        this.A00 = 2b1.A00(viewStub);
        0eO r1 = 0eO.A02;
        this.A01 = C73901Plc.A00(this, r1, 28);
        this.A02 = C73901Plc.A00(this, r1, 30);
        this.A03 = C73901Plc.A00(this, r1, 29);
        this.A07 = C73901Plc.A00(this, r1, 34);
        this.A06 = C73901Plc.A00(this, r1, 33);
        this.A04 = C73901Plc.A00(this, r1, 31);
        this.A05 = C73901Plc.A00(this, r1, 32);
    }
}
