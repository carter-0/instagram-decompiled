package X;

import android.app.Application;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GgJ  reason: case insensitive filesystem */
public final class C52966GgJ extends C361478gI {
    public I12 A00;
    public I12 A01;
    public C55616Hkb A02;
    public final UserSession A03;
    public final C56605I4e A04;
    public final C55615Hka A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final 05G A0A;
    public final AnonymousClass0Ud A0B;

    public static final void A01(C52966GgJ ggJ) {
        C61076JwE jwE;
        I12 i12;
        C61076JwE jwE2;
        Object value;
        C53361Gml gml;
        Integer num;
        I12 i122;
        List list;
        C52966GgJ ggJ2 = ggJ;
        I12 i123 = ggJ2.A00;
        if (i123 == null || (jwE = i123.A01) == null || (i12 = ggJ2.A01) == null || (jwE2 = i12.A01) == null) {
            A00(ggJ2);
            return;
        }
        05G r1 = ggJ2.A0A;
        do {
            value = r1.getValue();
            gml = (C53361Gml) value;
            num = AnonymousClass05K.A00;
            i122 = gml.A01;
            list = gml.A05;
        } while (!r1.AIY(value, C53361Gml.A00(i122, gml.A00, num, gml.A04, gml.A02, list, gml.A06)));
        C318136oS A002 = C318116oQ.A00(ggJ2);
        ggJ2.A02 = new C55616Hkb(1Eo.A03(num, 19B.A00, new C58101ImN(jwE, jwE2, ggJ2, (AnonymousClass4D7) null, 1, false), A002), false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52966GgJ(Application application, Rect rect, UserSession userSession, C56605I4e i4e, C55615Hka hka) {
        super(application);
        C351828Ao r4 = new C351828Ao(userSession, application);
        C351838Ap r3 = new C351838Ap(userSession);
        AnonymousClass7TG.A1O(application, userSession);
        0qQ.A0B(i4e, 3);
        this.A03 = userSession;
        this.A04 = i4e;
        this.A05 = hka;
        this.A07 = C58717IwQ.A00(r3, new AnonymousClass8ZA(r3.A00), 25);
        this.A06 = C58717IwQ.A00(r4, new AnonymousClass8ZA(r4.A00), 26);
        Integer num = AnonymousClass05K.A00;
        Integer num2 = num;
        02z A10 = DbS.A10(new C53361Gml((I12) null, (I12) null, num, num2, AnonymousClass05K.A01, 0sn.A00, false));
        this.A0A = A10;
        this.A0B = A10;
        1HR r0 = new 1HR(0);
        this.A08 = r0;
        this.A09 = 0u9.A04(r0);
        1Eo.A03(num, AnonymousClass12T.A00.AOJ(308548615, 3), new MGX(rect, this, (AnonymousClass4D7) null, 12), C318116oQ.A00(this));
        C318136oS A002 = C318116oQ.A00(this);
        MG6 mg6 = new MG6(this, (AnonymousClass4D7) null, 36);
        19B r32 = 19B.A00;
        1Eo.A03(num, r32, mg6, A002);
        1Eo.A03(num, r32, new MG6(this, (AnonymousClass4D7) null, 37), C318116oQ.A00(this));
    }

    public static final void A00(C52966GgJ ggJ) {
        Object value;
        C53361Gml gml;
        Integer num;
        I12 i12;
        List list;
        05G r2 = ggJ.A0A;
        do {
            value = r2.getValue();
            gml = (C53361Gml) value;
            num = AnonymousClass05K.A0C;
            i12 = gml.A01;
            list = gml.A05;
        } while (!r2.AIY(value, C53361Gml.A00(i12, gml.A00, num, gml.A04, gml.A02, list, gml.A06)));
    }
}
