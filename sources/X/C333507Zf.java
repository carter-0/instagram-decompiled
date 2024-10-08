package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.7Zf  reason: invalid class name and case insensitive filesystem */
public final class C333507Zf implements C333517Zg {
    public final C333427Yx A00;
    public final AnonymousClass7S6 A01;
    public final AnonymousClass7S6 A02;
    public final AnonymousClass7ZX A03;
    public final AnonymousClass7Z9 A04;
    public final C333547Zj A05;
    public final AnonymousClass7Z7 A06;

    public C333507Zf(C333427Yx r2, AnonymousClass7S6 r3, AnonymousClass7S6 r4, AnonymousClass7ZX r5, C333547Zj r6, AnonymousClass7Z7 r7, AnonymousClass7Z9 r8) {
        0qQ.A0B(r6, 2);
        this.A01 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = r4;
        this.A04 = r8;
        this.A03 = r5;
        this.A00 = r2;
    }

    public final boolean AH1(C376179Gx r2) {
        0qQ.A0B(r2, 0);
        return this.A02.A0H.A00(r2);
    }

    public final AnonymousClass7LQ Bjv(String str) {
        return null;
    }

    public final void CLb(String str) {
        AnonymousClass7ZX r2 = this.A03;
        AnonymousClass7LQ A012 = r2.A0n.A01(str);
        if (A012 != null && A012.A0P && A012.A0R) {
            A012.A0R = false;
            r2.A0V(A012);
        }
    }

    public final boolean CXK(String str) {
        return false;
    }

    public final boolean CYZ(String str) {
        return false;
    }

    public final void FKo(OG0 og0, String str) {
        0qQ.A0B(str, 0);
        AnonymousClass7S6 r0 = this.A01;
        C330437Mt r2 = r0.A0I;
        if (r2 != null) {
            r2.A06 = str;
            r2.A04 = og0;
            r2.A0D.add(new AnonymousClass7BL(r0));
            if (r2.A03()) {
                r2.A02();
            }
        }
        AnonymousClass7ZX r4 = this.A03;
        C330437Mt r02 = r4.A0i;
        if (r02 != null) {
            r02.A06 = str;
            r02.A04 = og0;
        }
        0mo A0R = r4.A0R();
        AnonymousClass7Z5 r1 = r4.A0B;
        if (r1 != null) {
            if (0mo.A00(A0R, r1, 4) != -1) {
                0mo A0R2 = r4.A0R();
                AnonymousClass7Z5 r03 = r4.A0B;
                if (r03 != null) {
                    A0R2.A08(r03);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("previousLoadMoreViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void A8Y(Map map) {
        map.put(C66579MXk.A00(798), "open");
    }

    public final C333457Za AkC() {
        return this.A03;
    }

    public final 2Er Api() {
        return this.A02.A07;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7S9 AvL() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C333437Yy BCh() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7ZY BSN() {
        return this.A03;
    }

    public final C333547Zj BsD() {
        return this.A05;
    }

    public final AnonymousClass7Z7 BsE() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7ZA C62() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass7S7 C6l() {
        return this.A02;
    }

    public final boolean CXH(String str) {
        AnonymousClass7LQ BSO = this.A01.BSO(str);
        if (BSO == null || !BSO.A0e.A1S()) {
            return false;
        }
        return true;
    }

    public final boolean CXI(String str) {
        N4L n4l;
        AnonymousClass7LQ BSO = this.A01.BSO(str);
        if (BSO == null || (n4l = BSO.A0e.A0D) == null || !n4l.A06) {
            return false;
        }
        return true;
    }

    public final void Clq(C254793t3 r19, int i) {
        boolean z;
        C254703su A0T;
        C254703su BLT;
        String str;
        C254703su r2;
        AnonymousClass2Ep r0;
        AnonymousClass9JD r02;
        C254703su r22;
        int i2 = i;
        AnonymousClass7Z9 r10 = this.A04;
        if (i == 0) {
            z = true;
            AnonymousClass2Ep r03 = this.A02.A07;
            if (r03 == null) {
                A0T = null;
            } else {
                A0T = r03.BLG();
            }
        } else {
            z = false;
            A0T = this.A03.A0T(i2);
        }
        C376509Ig r8 = null;
        AnonymousClass7S6 r7 = this.A02;
        AnonymousClass2Ep r04 = r7.A07;
        if (r04 == null) {
            BLT = null;
        } else {
            BLT = r04.BLT();
        }
        if (!z) {
            if (BLT == null || A0T == null) {
                BLT = null;
            } else {
                AnonymousClass7ZX r14 = this.A03;
                C41731AzM azM = C41731AzM.A00;
                C41732AzN azN = C41732AzN.A00;
                if (((Boolean) azM.invoke(A0T)).booleanValue()) {
                    BLT = A0T;
                } else {
                    BLT = null;
                    int i3 = r14.A0R().A01;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            break;
                        }
                        C331837So A09 = AnonymousClass7ZX.A09(r14, i4);
                        if (A09 instanceof AnonymousClass7LQ) {
                            r22 = ((AnonymousClass7LQ) A09).A0e;
                            0qQ.A07(r22);
                            String A0g = A0T.A0g();
                            if (((Boolean) azN.invoke(r22)).booleanValue()) {
                                if (A0g == null) {
                                    break;
                                }
                                Comparator comparator = AnonymousClass48V.A01;
                                String A0g2 = r22.A0g();
                                A0g2.getClass();
                                if (comparator.compare(A0g2, A0g) < 0) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i4++;
                    }
                    BLT = r22;
                }
            }
        }
        AnonymousClass7ZX r4 = this.A03;
        AnonymousClass3SZ BrG = r7.BrG(true);
        if (BrG == null || (r02 = BrG.A01) == null) {
            str = null;
        } else {
            str = r02.A02;
        }
        N49 n49 = null;
        if (182.A06(0Tu.A05, r4.A0g, 36325665159591032L)) {
            int i5 = r4.A0R().A01;
            while (true) {
                if (i2 >= i5) {
                    break;
                }
                Object A052 = r4.A0R().A05(i2);
                0qQ.A07(A052);
                C331837So r1 = (C331837So) A052;
                if (r1 instanceof AnonymousClass7LQ) {
                    r2 = ((AnonymousClass7LQ) r1).A0e;
                    0qQ.A07(r2);
                    String A0g3 = r2.A0g();
                    if (A0g3 != null) {
                        if (str != null && A0g3.compareTo(str) < 0) {
                            break;
                        } else if (r2.A0b() == AnonymousClass05K.A01) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            }
        }
        r2 = null;
        if (z && (r0 = r7.A07) != null) {
            n49 = r0.BKs();
        }
        if (A0T == null) {
            if (BLT == null) {
                if (r2 != null) {
                    A0T = r2;
                }
                r10.Cm2(r8, r19, false);
            }
            A0T = BLT;
        }
        if (A0T.A0g() == null) {
            0wb.A04("mark_message_seen_without_id", 002.A0R("The received message to be marked seen does not have an ID. authorId = ", A0T.A1u), 1);
        } else {
            r8 = new C376509Ig(n49, A0T, BLT, r2);
        }
        r10.Cm2(r8, r19, false);
    }

    public final 1aU E48(MessageIdentifier messageIdentifier) {
        1aU A002;
        C254703su r3;
        AnonymousClass7ZX r0 = this.A03;
        AnonymousClass7LQ A012 = r0.A0n.A01(messageIdentifier.A01);
        if (A012 == null || (r3 = A012.A0e) == null) {
            A002 = 1aU.A00();
        } else {
            2FW r2 = r3.A10;
            0qQ.A07(r2);
            A002 = 1aU.A09(new PAP(r3, r2, r3.A0W()));
        }
        0qQ.A0A(A002);
        return A002;
    }

    public final /* bridge */ /* synthetic */ C69668Npq E4G(String str) {
        C254703su r2;
        DirectThreadKey directThreadKey;
        AnonymousClass7LQ A012 = this.A03.A0n.A01(str);
        if (A012 == null || (r2 = A012.A0e) == null) {
            return null;
        }
        AnonymousClass7S6 r1 = this.A02;
        AnonymousClass2Ep r0 = r1.A07;
        if (r0 != null) {
            directThreadKey = r0.BJy();
        } else {
            String str2 = r1.A09;
            if (str2 == null) {
                return null;
            }
            directThreadKey = new DirectThreadKey(str2);
        }
        return new C68965Nbs(r2, directThreadKey);
    }

    public final String EJL(String str) {
        AnonymousClass7ZX r3 = this.A03;
        AnonymousClass7LQ A012 = r3.A0n.A01(str);
        if (A012 != null) {
            if (A012.A05()) {
                A012.A0Q = true;
                r3.A0V(A012);
            } else if (A012.A0P && !A012.A0R) {
                A012.A0R = true;
                r3.A0V(A012);
                Object obj = A012.A0e.A1T;
                if (obj instanceof String) {
                    return (String) obj;
                }
            }
        }
        return null;
    }
}
