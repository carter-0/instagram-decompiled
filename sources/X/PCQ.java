package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.DirectThreadThemeInfo;

public final class PCQ implements AnonymousClass7S9 {
    public C61084JwM A00;
    public AnonymousClass9HC A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass1aS A04;
    public final AnonymousClass1aS A05;
    public final 1a8 A06 = new 1a8((C269794fh) null);
    public final 1a8 A07 = new 1a8((C269794fh) null);
    public final UserSession A08;
    public final C330437Mt A09;
    public final C330287Me A0A;
    public final P28 A0B;
    public final C70727OHw A0C;
    public final ON0 A0D;
    public final C331717Sc A0E;
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A00(0eO.A02, new C73920Pm0(this, 45));
    public final boolean A0G;
    public final 1aU A0H;
    public final 1aU A0I;
    public final C331787Sj A0J;
    public final AnonymousClass7ZY A0K;

    public final void A04(String str) {
        String str2 = str;
        if (!C51966G9m.A1a(str, this.A0K.BOv())) {
            str2 = null;
        }
        ON0 on0 = this.A0D;
        AnonymousClass7L2 r0 = (AnonymousClass7L2) this.A05.A0X();
        if (r0 == null) {
            r0 = A00(AnonymousClass6BI.A0D, this);
        }
        on0.A01(new C46539Dgg(str2, (String) null, 2, 3, this.A0G), r0);
        this.A07.A02(this.A0C.A02.A0H(), new PUA(str2, (Object) this, 1));
    }

    public final AnonymousClass7LQ BSO(String str) {
        0qQ.A0B(str, 0);
        return this.A0B.A05.A01(str);
    }

    public final C328317Ei CC6() {
        return new C328317Ei((C328307Eh) null, (String) null, false);
    }

    public final boolean CVO() {
        return false;
    }

    public final C70465O7q CgJ(C70607ODe oDe, String str) {
        0qQ.A0B(str, 0);
        1aU A022 = C66581MXm.A0b(this.A0F).A02(str);
        C269794fh A002 = AnonymousClass6F9.A00("load_media_from_msys_media_cache");
        1a8 A0P = C66581MXm.A0P();
        A0P.A02(A022.A0Q(A002), new PU9(12, oDe, A0P));
        return new C70465O7q(A0P);
    }

    public final void D6W(C254783t2 r15) {
        Long l;
        0fh.A01("MsysThreadViewDataLoader.onCreate", -133446104);
        try {
            C70727OHw oHw = this.A0C;
            oHw.A01.accept(AnonymousClass6W3.A03(r15));
            ON0 on0 = this.A0D;
            AnonymousClass1aS r4 = this.A05;
            AnonymousClass7L2 r0 = (AnonymousClass7L2) r4.A0X();
            if (r0 == null) {
                r0 = A00(AnonymousClass6BI.A0D, this);
            }
            on0.A01(new C46539Dgg((String) null, (String) null, 3, 3, this.A0G), r0);
            A01();
            C330437Mt r1 = this.A09;
            if (r1 != null) {
                String str = r1.A06;
                if (str != null) {
                    l = AnonymousClass7TE.A10(str);
                } else {
                    l = null;
                }
                this.A00 = new C61084JwM(31, (Object) l, (Object) r1.A0C, (Object) r1.A02);
            }
            EIQ(false);
            this.A0E.EwO((String) null);
            1a8 r3 = this.A06;
            PU8.A00(C66789Mca.A00(C72120Owf.A03(oHw.A02, C74071Poa.A00, 40), C74072Pob.A00, 11).A0H(), r3, this, 53);
            PU8.A00(r4.A0G(), r3, this, 54);
        } finally {
            0fh.A00(-1640103345);
        }
    }

    public final void EI1() {
    }

    public final void EIF() {
    }

    public final boolean EsR() {
        return true;
    }

    public final void FKh(boolean z) {
    }

    public static final AnonymousClass7L2 A00(DirectThreadThemeInfo directThreadThemeInfo, PCQ pcq) {
        return C329927Kt.A00.A01(pcq.A03, pcq.A01, directThreadThemeInfo, AnonymousClass05K.A00);
    }

    private final void A01() {
        PU8.A00(C66789Mca.A00(MYb.A00(C66581MXm.A0b(this.A0F)), C74077Pog.A00, 11), this.A07, this, 65);
        this.A02 = true;
    }

    public static final void A02(PCQ pcq) {
        PU8.A00(pcq.A0C.A02.A0H(), pcq.A07, pcq, 64);
    }

    public final 1aU A03() {
        return C72120Owf.A03(this.A0C.A02, C74073Poc.A00, 40);
    }

    public final void CgQ() {
        PU8.A00(this.A0C.A02.A0H(), this.A07, this, 55);
    }

    public final void D6x() {
        this.A0J.A02(this.A0B);
    }

    public final void D8R(C67536MpV mpV, C254743sy r3) {
        this.A06.A01();
    }

    public final void E2N() {
        PU8.A00(this.A0C.A02.A0H(), this.A07, this, 60);
    }

    public final void EIQ(boolean z) {
        PU8.A00(this.A0C.A02.A0H(), this.A07, this, 61);
    }

    public final void onDestroyView() {
        this.A0A.A03 = true;
        C331787Sj r1 = this.A0J;
        r1.A01 = null;
        r1.A02 = null;
        r1.A03 = null;
    }

    public final void onPause() {
        this.A07.A01();
        this.A02 = false;
    }

    public final void onResume() {
        if (!this.A02) {
            A01();
            PU8.A00(this.A0C.A02.A0H(), this.A07, this, 63);
        }
        1a8 r3 = this.A07;
        PU8.A00(1aU.A01(C71992OuQ.A00, this.A0C.A02, this.A0B.A02), r3, this, 56);
        PU8.A00(this.A0I, r3, this, 57);
        1aU r2 = this.A0H;
        2Dr A002 = 1bJ.A00(this.A08);
        PU8.A00(C66789Mca.A00(1aU.A01(C71993OuR.A00, r2, A002.A09.A0P((C269794fh) A002.A0L.getValue())), C74075Poe.A00, 11).A0P(C318146oT.A01), r3, this, 58);
        PU8.A00(C66581MXm.A0L(OwG.A00, C66789Mca.A00(A03(), C74076Pof.A00, 11)), r3, this, 59);
    }

    public PCQ(Context context, UserSession userSession, Capabilities capabilities, C330437Mt r18, AnonymousClass7YX r19, C331787Sj r20, C330287Me r21, AnonymousClass7TO r22, AnonymousClass9HO r23, AnonymousClass7X9 r24, AnonymousClass9HC r25, AnonymousClass9HC r26, AnonymousClass7ZY r27, P28 p28, C331717Sc r29, C331717Sc r30, C331717Sc r31, String str, C62320sa r33, C62320sa r34, 0sP r35, boolean z) {
        this.A03 = context;
        UserSession userSession2 = userSession;
        this.A08 = userSession2;
        this.A01 = r25;
        this.A0B = p28;
        this.A0A = r21;
        this.A0G = z;
        this.A0E = r30;
        this.A09 = r18;
        this.A0J = r20;
        this.A0K = r27;
        C331717Sc r10 = r31;
        C331717Sc r9 = r29;
        UserSession userSession3 = userSession2;
        this.A0C = new C70727OHw(userSession3, r19, r9, r10, str, r35);
        this.A0H = C66581MXm.A0L(C72101OwF.A00, C66789Mca.A00(A03(), C74074Pod.A00, 11));
        this.A0I = C66581MXm.A0L(OwH.A00, C66789Mca.A00(A03(), C74078Poh.A00, 11));
        this.A05 = 1aF.A01(A00(AnonymousClass6BI.A0D, this));
        this.A04 = 1aF.A00();
        AnonymousClass9HO r8 = r23;
        AnonymousClass7TO r7 = r22;
        Capabilities capabilities2 = capabilities;
        this.A0D = new ON0(context, userSession2, capabilities2, r7, r8, r24, this.A01, r26, r33, r34);
    }
}
