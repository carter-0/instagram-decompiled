package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;

/* renamed from: X.Oaz  reason: case insensitive filesystem */
public final class C71080Oaz {
    public N4R A00;
    public RtcCallKey A01;
    public N3Z A02;
    public C68160N3a A03;
    public C68162N3c A04;
    public C262224Cq A05;
    public boolean A06;
    public boolean A07;
    public final UserSession A08;
    public final O9R A09;
    public final 05G A0A;
    public final AnonymousClass12V A0B = AnonymousClass12T.A00;
    public final C62320sa A0C;

    private final void A00() {
        this.A07 = false;
        this.A01 = null;
        C262224Cq r1 = this.A05;
        if (r1 != null) {
            19E.A04("Call has ended!", r1);
            for (C74475PvV Czx : this.A09.A00) {
                Czx.Czx();
            }
            return;
        }
        0qQ.A0F("callScope");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01() {
        this.A07 = true;
        AnonymousClass19S A022 = 19E.A02(AnonymousClass199.A02(((AnonymousClass12U) this.A0B).A04, new AnonymousClass19G((C262204Co) null)));
        this.A05 = A022;
        for (C74475PvV Czy : this.A09.A00) {
            Czy.Czy(A022);
        }
    }

    public final void A03() {
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        this.A06 = false;
        N9J n9j = (N9J) this.A00.A00;
        Integer num = n9j.A01;
        Integer num2 = AnonymousClass05K.A0N;
        if (num != num2) {
            RtcCallKey rtcCallKey = n9j.A00;
            A02(new N4R(new N9J(rtcCallKey, num2, AnonymousClass05K.A01), AnonymousClass05K.A00), this);
        }
        Integer num3 = AnonymousClass05K.A0Y;
        A02(new N4R(new N9J((RtcCallKey) null, num3, AnonymousClass05K.A01), AnonymousClass05K.A00), this);
    }

    public static final void A02(N4R n4r, C71080Oaz oaz) {
        N9J n9j = (N9J) n4r.A00;
        if (!0qQ.A0K(n9j, oaz.A00.A00)) {
            N4R n4r2 = oaz.A00;
            Object obj = n4r2.A02;
            Integer num = AnonymousClass05K.A00;
            if (obj == num && n4r.A02 == AnonymousClass05K.A01) {
                N9J n9j2 = (N9J) n4r.A00;
                Integer num2 = n9j2.A01;
                if (num2 == AnonymousClass05K.A0Y) {
                    return;
                }
                if (num2 == AnonymousClass05K.A0N && !0qQ.A0K(((N9J) n4r2.A00).A00, n9j2.A00)) {
                    return;
                }
            }
            N4R n4r3 = oaz.A00;
            oaz.A00 = n4r;
            05G r1 = oaz.A0A;
            Object obj2 = n4r.A00;
            0qQ.A0B(r1, 0);
            r1.FIA(obj2);
            oaz.A0C.invoke();
            int intValue = n9j.A01.intValue();
            if (intValue == 0 || intValue == 2) {
                RtcCallKey rtcCallKey = n9j.A00;
                if (oaz.A01 == null && !oaz.A07) {
                    oaz.A01();
                }
                if (rtcCallKey != null) {
                    RtcCallKey rtcCallKey2 = oaz.A01;
                    if (rtcCallKey2 == null || !0qQ.A0K(rtcCallKey.A00, rtcCallKey2.A00)) {
                        if (oaz.A01 != null) {
                            oaz.A00();
                            oaz.A01();
                        }
                        oaz.A01 = rtcCallKey;
                        for (C74475PvV Czw : oaz.A09.A00) {
                            Czw.Czw(rtcCallKey);
                        }
                    }
                }
            } else if (intValue == 3 || intValue == 4) {
                Integer num3 = ((N9J) n4r3.A00).A01;
                if (num3 == num || num3 == AnonymousClass05K.A0C) {
                    oaz.A00();
                }
            } else if (intValue != 1) {
                throw AnonymousClass7TE.A1K();
            }
        }
    }

    public C71080Oaz(UserSession userSession, O9R o9r, C62320sa r7) {
        this.A08 = userSession;
        this.A09 = o9r;
        this.A0C = r7;
        N4R n4r = new N4R(new N9J((RtcCallKey) null, AnonymousClass05K.A0Y, AnonymousClass05K.A01), AnonymousClass05K.A0C);
        this.A00 = n4r;
        this.A0A = 106.A01(n4r.A00);
    }
}
