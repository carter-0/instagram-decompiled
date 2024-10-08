package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;

/* renamed from: X.8Ff  reason: invalid class name and case insensitive filesystem */
public final class C352838Ff extends 2YL {
    public int A00;
    public Integer A01 = A02(this);
    public boolean A02;
    public boolean A03 = true;
    public boolean A04;
    public final UserSession A05;
    public final C252213ok A06;
    public final AnonymousClass3E6 A07;
    public final C357638Yz A08;
    public final 1Av A09;
    public final C359098c0 A0A;
    public final C359028br A0B;
    public final QuickSnapRepository A0C;
    public final AnonymousClass0r6 A0D;
    public final 0V2 A0E;
    public final 05G A0F;
    public final AnonymousClass0Ud A0G;
    public final TargetViewSizeProvider A0H;

    public C352838Ff(UserSession userSession, AnonymousClass3E6 r4, C357638Yz r5, TargetViewSizeProvider targetViewSizeProvider, C359098c0 r7, C359028br r8, QuickSnapRepository quickSnapRepository) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r5, 2);
        0qQ.A0B(targetViewSizeProvider, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r4, 5);
        0qQ.A0B(quickSnapRepository, 6);
        this.A05 = userSession;
        this.A08 = r5;
        this.A0H = targetViewSizeProvider;
        this.A0B = r8;
        this.A07 = r4;
        this.A0C = quickSnapRepository;
        this.A0A = r7;
        this.A09 = 1Au.A00(userSession);
        02z A012 = 106.A01((Object) null);
        this.A0F = A012;
        this.A0G = A012;
        05D A013 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A0E = A013;
        this.A0D = new C359118c2(this, A013);
        this.A06 = new C359128c3(this);
    }

    public static final C61025JvP A00(C352838Ff r3) {
        int intValue = r3.A01.intValue();
        if (intValue == 0 || intValue == 1) {
            return new C61025JvP(false, true, false);
        }
        if (intValue == 2) {
            return new C61025JvP(false, false, false);
        }
        if (intValue == 3) {
            return new C61025JvP(false, true, true);
        }
        if (intValue == 4) {
            return new C61025JvP(true, true, true);
        }
        throw new RuntimeException();
    }

    public static final C61026JvQ A01(C352838Ff r3) {
        int intValue = r3.A01.intValue();
        if (intValue == 0) {
            return new C61026JvQ(true, false, false);
        }
        if (intValue == 1) {
            return new C61026JvQ(false, true, false);
        }
        if (intValue != 2) {
            if (intValue == 3) {
                return new C61026JvQ(false, false, true);
            }
            if (intValue != 4) {
                throw new RuntimeException();
            }
        }
        return C61026JvQ.A03;
    }

    public static final Integer A02(C352838Ff r4) {
        if (!182.A06(0Tu.A05, r4.A05, 36325557784359969L)) {
            1Av r3 = r4.A09;
            0s0 r1 = r3.A6n;
            AnonymousClass0YZ[] r2 = 1Av.A8a;
            if (((Boolean) r1.CDM(r3, r2[517])).booleanValue()) {
                return AnonymousClass05K.A0Y;
            }
            if (((Boolean) r3.A6o.CDM(r3, r2[518])).booleanValue()) {
                return AnonymousClass05K.A0N;
            }
        }
        return AnonymousClass05K.A00;
    }

    public static final void A04(C352838Ff r12, 0sP r13) {
        05G r2 = r12.A0F;
        Object value = r2.getValue();
        if (value == null) {
            value = new C61031JvV(new C61025JvP(false, true, false), C61026JvQ.A03, "", false, false, false, false, true);
        }
        do {
        } while (!r2.AIY(r2.getValue(), r13.invoke(value)));
        r12.A04 = false;
    }

    public static final void A05(C352838Ff r12, boolean z, boolean z2, boolean z3) {
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) r12.A0H;
        int i = nineSixteenLayoutConfigImpl.A06;
        int i2 = nineSixteenLayoutConfigImpl.A04;
        C359028br r4 = r12.A0B;
        int A002 = r4.A00();
        float f = ((float) (i - A002)) / 2.0f;
        float A003 = ((((float) (i2 - A002)) - (((float) r12.A00) / 2.0f)) / 2.0f) - ((float) I7E.A00(r4.A00, R.dimen.account_group_management_title_text_horizontal_padding));
        int i3 = A002;
        float f2 = A003;
        boolean z4 = z;
        if (!z) {
            i3 = i;
            A002 = i2;
            f = 0.0f;
            f2 = 0.0f;
        }
        A03(new C65571Lvv(new C53362Gmm(f, f2, A003, i3, A002, z4, z2), z3), r12);
    }

    public final void A06() {
        A04(this, C66343MOa.A00);
        A03(new C65572Lvw(false), this);
        A03(C40588Aec.A00, this);
        A05(this, false, true, false);
        this.A07.EEH(this.A06);
        this.A03 = true;
    }

    public final void A07() {
        Integer num;
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            num = AnonymousClass05K.A01;
        } else if (intValue == 1) {
            1Av r3 = this.A09;
            r3.A6o.Epx(r3, true, 1Av.A8a[518]);
            num = AnonymousClass05K.A0C;
        } else if (intValue == 2) {
            num = AnonymousClass05K.A0N;
        } else if (intValue != 3) {
            num = AnonymousClass05K.A0Y;
        } else {
            1Av r32 = this.A09;
            r32.A6n.Epx(r32, true, 1Av.A8a[517]);
            A03(new C65572Lvw(true), this);
            num = AnonymousClass05K.A0Y;
        }
        this.A01 = num;
        A04(this, new G4S(this, 43));
        A05(this, true, false, true);
    }

    public static final void A03(C41778B0h b0h, C352838Ff r5) {
        C318136oS A002 = C318116oQ.A00(r5);
        1Eo.A05(19B.A00, new C66166MGd(r5, b0h, (AnonymousClass4D7) null, 29), A002);
    }
}
