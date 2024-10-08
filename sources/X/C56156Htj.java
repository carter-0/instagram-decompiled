package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Htj  reason: case insensitive filesystem */
public final class C56156Htj {
    public C13867Tio A00;
    public C13867Tio A01;
    public C56388Hxh A02 = C56388Hxh.A00;
    public final C55859Hog A03;
    public final C59530JNc A04;
    public final C59530JNc A05;
    public final C59531JNd A06;
    public final C59531JNd A07;
    public final Object A08;
    public final List A09;
    public final JLQ A0A;
    public final C59531JNd A0B;
    public final C59531JNd A0C;

    public C56156Htj(Object obj) {
        this.A08 = obj;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A09 = A1C;
        Integer num = SOO.A0A;
        0qQ.A08(num);
        this.A03 = new C55859Hog(num);
        this.A07 = new IHC(obj, A1C, -2);
        this.A0B = new IHC(obj, A1C, 0);
        this.A05 = new IHB(obj, A1C, 0);
        this.A06 = new IHC(obj, A1C, -1);
        this.A0C = new IHC(obj, A1C, 1);
        this.A04 = new IHB(obj, A1C, 1);
        this.A0A = new IH9(obj, A1C);
        C58923Izm izm = C58923Izm.A00;
        this.A01 = new IHA(izm);
        this.A00 = new IHA(izm);
    }

    public final void A00(C55859Hog hog) {
        0qQ.A0B(hog, 0);
        A01(hog.A03, hog.A02);
    }

    public final void A01(C56074HsN hsN, C56074HsN hsN2) {
        boolean A1Z = AnonymousClass7TG.A1Z(hsN, hsN2);
        this.A07.Cfy(hsN, 0.0f, 0.0f);
        this.A06.Cfy(hsN2, 0.0f, 0.0f);
        this.A09.add(new C58733Iwg(this, 0.5f, A1Z ? 1 : 0));
    }

    public final void A02(C13867Tio tio) {
        this.A00 = tio;
        this.A09.add(new TYA(8, (Object) this, (Object) tio));
    }

    public final void A03(C13867Tio tio) {
        this.A01 = tio;
        this.A09.add(new TYA(9, (Object) this, (Object) tio));
    }
}
