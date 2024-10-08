package X;

import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Gab  reason: case insensitive filesystem */
public final class C52663Gab extends C251343mx {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final JTB A02;
    public final GFO A03;
    public final boolean A04;

    public C52663Gab(UserSession userSession, AnonymousClass4DU r3, JTB jtb, GFO gfo, boolean z) {
        0qQ.A0B(jtb, 2);
        this.A03 = gfo;
        this.A02 = jtb;
        this.A01 = r3;
        this.A00 = userSession;
        this.A04 = z;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r15) {
        0qQ.A0B(r15, 0);
        2V1 r2 = r15.A05;
        C52664Gac gac = new C52664Gac(r2, new C52665Gad());
        AnonymousClass3XV r0 = 2WX.A02;
        C244123ag.A00(gac, G9t.A11(AnonymousClass05K.A00, 100.0f, 0));
        C52665Gad gad = gac.A01;
        gad.A0E = true;
        gad.A01 = 2;
        C337487gQ r1 = new C337487gQ();
        r1.A00 = 0;
        r1.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        gad.A0B = r1.AEH();
        new C337557gX(r2);
        AnonymousClass9VY r10 = new AnonymousClass9VY();
        BitSet A0w = DbS.A0w(5);
        A0w.clear();
        r10.A01 = this.A01;
        A0w.set(2);
        GFO gfo = this.A03;
        r10.A03 = gfo;
        A0w.set(0);
        r10.A02 = this.A02;
        A0w.set(1);
        r10.A00 = this.A00;
        A0w.set(4);
        r10.A04 = this.A04;
        A0w.set(3);
        C337607gc.A00(A0w, new String[]{"carouselViewModel", "delegate", "insightsHost", "shouldThumbnailsOverflowToEdge", "userSession"}, 5);
        gad.A09 = r10;
        BitSet bitSet = gac.A02;
        bitSet.set(0);
        gad.A0A = (C54011Gxt) gfo.A0M.getValue();
        boolean A0D = gfo.A0D();
        gad.A0F = A0D;
        float f = 0.0f;
        if (A0D) {
            f = 20.0f;
        }
        gad.A00 = gac.A02.A00(f);
        C249403jg r22 = gfo.A07;
        if (r22 != null) {
            List list = gad.A0D;
            if (list == Collections.EMPTY_LIST) {
                list = AnonymousClass7TE.A1C();
                gad.A0D = list;
            }
            list.add(r22);
        }
        C244113af.A00(bitSet, gac.A03, 1);
        2Vh r02 = gad.A08;
        if (r02 == null) {
            r02 = C251263mp.A01(gad, gac.A00, -1505688212);
        }
        gad.A08 = r02;
        2Vh r03 = gad.A07;
        if (r03 == null) {
            r03 = C251263mp.A01(gad, gac.A00, -238194236);
        }
        gad.A07 = r03;
        2Vh r04 = gad.A06;
        if (r04 == null) {
            r04 = C251263mp.A01(gad, gac.A00, -1017305181);
        }
        gad.A06 = r04;
        gac.A02();
        return gad;
    }
}
