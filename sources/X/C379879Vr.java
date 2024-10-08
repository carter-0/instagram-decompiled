package X;

import java.util.Map;

/* renamed from: X.9Vr  reason: invalid class name and case insensitive filesystem */
public final class C379879Vr extends C345357tM implements C345417tS {
    public final C344037rD A00;
    public volatile C340547lR A01;
    public volatile Integer A02 = AnonymousClass05K.A0C;

    public final String Bz9() {
        return "";
    }

    public final void A09() {
        this.A01 = ((C344307re) ((C344327rg) this.A00.Ape(C344327rg.A00))).A02;
    }

    public final C345277tE BJs() {
        return C345417tS.A00;
    }

    public final boolean CaT() {
        C340547lR r0 = this.A01;
        if (r0 == null || !r0.A0N.CaT()) {
            return false;
        }
        return true;
    }

    public final void Exo(ADm aDm, LOF lof, A6Z a6z) {
        C393079vr.A00(this.A00, "BasicVideoCaptureCoordinator", AnonymousClass7TE.A0Q(this));
        C340547lR r2 = this.A01;
        if (r2 != null) {
            Boolean bool = aDm.A00;
            if (bool != null) {
                r2.A0N.ARW(bool.booleanValue());
            }
            r2.A0E(new AV9(this, a6z, new boolean[]{false}), lof);
        }
    }

    public final void EyS(Integer num) {
        Integer num2;
        C344037rD r2 = this.A00;
        long A0Q = AnonymousClass7TE.A0Q(this);
        0qQ.A0B(r2, 0);
        r2.Cjx("recording_stop_requested", "BasicVideoCaptureCoordinator", "", (Map) null, A0Q);
        r2.DD7(19, "recording_stop_requested");
        if (num.intValue() != 0) {
            num2 = AnonymousClass05K.A01;
        } else {
            num2 = AnonymousClass05K.A00;
        }
        this.A02 = num2;
        C340547lR r0 = this.A01;
        if (r0 != null) {
            r0.A06();
        }
    }

    public C379879Vr(C343837qt r2) {
        super(r2);
        this.A00 = (C344037rD) r2.Apf(C344037rD.A00);
    }
}
