package X;

import android.media.audiofx.AcousticEchoCanceler;
import com.instagram.feed.su.model.MiddleStateCardUser;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class N02 extends C14072TpM {
    public final int A00;
    public final Object A01;

    public N02(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A01(int i) {
        String str;
        String str2;
        PMK pmk;
        C68295N9i n9i;
        boolean z;
        C69109Neo neo;
        N93 n93;
        N36 n36;
        C67924MxA A002;
        PMK pmk2;
        C68295N9i n9i2;
        OK5 ok5;
        String str3;
        Integer num;
        N36 n362;
        N36 n363;
        int i2 = i;
        switch (this.A00) {
            case 0:
                NJE nje = (NJE) this.A01;
                List list = nje.A07;
                if (list != null) {
                    MiddleStateCardUser middleStateCardUser = (MiddleStateCardUser) list.get(i2);
                    if (middleStateCardUser.A0A) {
                        String str4 = middleStateCardUser.A08;
                        String str5 = nje.A05;
                        if (str5 == null) {
                            str = "containerModule";
                            break;
                        } else {
                            String str6 = "";
                            String str7 = middleStateCardUser.A00;
                            int i3 = nje.A02;
                            String str8 = middleStateCardUser.A07;
                            String str9 = middleStateCardUser.A04;
                            String str10 = middleStateCardUser.A05;
                            String str11 = middleStateCardUser.A06;
                            String str12 = nje.A06;
                            if (str12 == null) {
                                str = "displayFormat";
                                break;
                            } else {
                                String str13 = middleStateCardUser.A03;
                                if (str13 != null) {
                                    str6 = str13;
                                }
                                C230012om r9 = nje.A04;
                                if (r9 != null) {
                                    String str14 = str11;
                                    String str15 = str10;
                                    String str16 = str9;
                                    C230012om.A01(r9, (Integer) null, (Long) null, str7, str5, (String) null, str12, str6, str16, str15, str14, str8, str4, "middle_state_profile", i2, i3);
                                }
                            }
                        }
                    } else {
                        C293005js r2 = nje.A03;
                        if (r2 != null) {
                            String str17 = middleStateCardUser.A08;
                            String str18 = middleStateCardUser.A01;
                            if (str18 != null) {
                                r2.A04(str17, str18, "middle_state_profile", middleStateCardUser.A00, middleStateCardUser.A07, i2, 0);
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                    int i4 = nje.A01;
                    if (i2 > i4) {
                        str2 = "right";
                    } else {
                        if (i2 < i4) {
                            str2 = "left";
                        }
                        nje.A01 = i2;
                        return;
                    }
                    List list2 = nje.A07;
                    if (list2 != null) {
                        MiddleStateCardUser middleStateCardUser2 = (MiddleStateCardUser) list2.get(i2);
                        C230012om r22 = nje.A04;
                        if (r22 != null) {
                            String str19 = middleStateCardUser2.A08;
                            String str20 = nje.A0C;
                            0Aj A0e = AnonymousClass7TE.A0e(r22.A01, "multiple_profile_navigation");
                            A0e.AAJ("direction", str2);
                            A0e.AAJ("gesture", "swipe");
                            A0e.AAJ("target_id", str19);
                            A0e.AAJ("module", str20);
                            A0e.Cgf();
                        }
                        nje.A01 = i2;
                        return;
                    }
                }
                str = "listCardUsers";
                break;
            case 1:
                ((0sP) this.A01).invoke(Integer.valueOf(i2));
                return;
            case 2:
                PMR pmr = (PMR) this.A01;
                Integer num2 = pmr.A02;
                if (!(num2 == null || (A002 = PMR.A00(pmr, num2.intValue())) == null || (n9i2 = pmk2.A01) == null || !n9i2.A0N)) {
                    (pmk2 = A002.A00).A00();
                }
                OK5 ok52 = pmr.A00;
                if (!(ok52 == null || (n93 = neo.A00) == null || (n36 = n93.A00) == null)) {
                    C74438Put put = n36.A00;
                    String str21 = n36.A05;
                    Integer num3 = n36.A02;
                    if (!(put == null || str21 == null || (num3 != null && num3.intValue() == i2))) {
                        (neo = ok52.A00).A0Q.A03(new PP4(0, 0, Integer.valueOf(i2)));
                    }
                }
                C67924MxA A003 = PMR.A00(pmr, i2);
                if (!(A003 == null || (n9i = pmk.A01) == null || !n9i.A0N)) {
                    C68295N9i n9i3 = pmr.A01;
                    if (n9i3 == null) {
                        str = "boundViewModel";
                        break;
                    } else {
                        boolean z2 = n9i3.A0Q;
                        C74438Put put2 = n9i.A05;
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append((pmk = A003.A00).A04.A06);
                        A1A.append('_');
                        String A0i = AnonymousClass7TF.A0i(UUID.randomUUID(), A1A);
                        C72981PRo pRo = pmk.A05;
                        MediaFrameLayout mediaFrameLayout = pmk.A08;
                        String moduleName = pmk.A03.getModuleName();
                        C69221Nhb A004 = O2F.A00(A0i);
                        C70942OSp oSp = pmk.A07;
                        try {
                            z = AcousticEchoCanceler.isAvailable();
                        } catch (NullPointerException unused) {
                            z = false;
                        }
                        pRo.A01(put2, mediaFrameLayout, A004, (Boolean) null, (Integer) null, moduleName, 0, z, oSp.A00.isSpeakerphoneOn(), !z2);
                        C14044Tol tol = pRo.A01;
                        if (tol != null) {
                            tol.A0C("resume", false);
                        }
                    }
                }
                pmr.A02 = Integer.valueOf(i2);
                return;
            default:
                POV pov = (POV) this.A01;
                if (i2 < pov.A06.size()) {
                    C74438Put put3 = ((C68295N9i) pov.A06.get(i2)).A05;
                    if ((put3 instanceof N54) && pov.A06.size() > 1) {
                        if (i >= 0) {
                            if (!pov.A07 && (ok5 = pov.A00) != null) {
                                C69109Neo neo2 = ok5.A00;
                                N93 n932 = neo2.A00;
                                String str22 = null;
                                if (n932 == null || (n363 = n932.A00) == null) {
                                    str3 = null;
                                } else {
                                    str3 = n363.A05;
                                }
                                List list3 = neo2.A02;
                                if (list3 != null) {
                                    if (i2 < list3.size() && str3 != null) {
                                        C74438Put put4 = (C74438Put) list3.get(i2);
                                        C71111Ocu ocu = neo2.A0Q;
                                        N93 n933 = neo2.A00;
                                        if (n933 == null || (n362 = n933.A00) == null) {
                                            num = null;
                                        } else {
                                            num = n362.A02;
                                        }
                                        ocu.A04(new PP5(put4, num, str3), 500);
                                        OZx oZx = neo2.A0W;
                                        boolean z3 = neo2.A08;
                                        0qQ.A0B(put4, 0);
                                        OKY oky = oZx.A04;
                                        String Aqe = put4.Aqe();
                                        oky.A00(new PKE(OZx.A00(put4), OZx.A01(put4, (Integer) null), Aqe));
                                        if (!z3) {
                                            C71078Oax oax = oZx.A03;
                                            C69502Nmk nmk = C69502Nmk.A0F;
                                            C69496Nme nme = C69496Nme.REELS;
                                            String A0L = 00l.A0L(Aqe, "_", Aqe);
                                            C69449Nlt A005 = C71070Oap.A00(put4.Aqk());
                                            C69485NmT nmT = C69485NmT.REELS;
                                            1Ln A006 = C71078Oax.A00(oax);
                                            if (DbT.A1Y(A006)) {
                                                C66582MXn.A17(nmk, A006, (Map) null);
                                                A006.A0R("server_info", C71078Oax.A01(nme, A006, oax));
                                                C71078Oax.A02(A005, nmT, A006, oax, A0L);
                                            }
                                        }
                                    }
                                    N93 n934 = neo2.A00;
                                    if (n934 != null) {
                                        str22 = n934.A01;
                                    }
                                    if (i2 == list3.size() - 2 && str22 != null) {
                                        neo2.A0S.A00(((C74438Put) list3.get(i2)).Aqe());
                                    }
                                }
                            }
                            Integer num4 = pov.A05;
                            if (num4 == null || num4.intValue() != i2) {
                                C74578PxR A007 = POV.A00(pov, num4);
                                if (A007 != null) {
                                    A007.EyO("hide");
                                }
                                C74578PxR A008 = POV.A00(pov, pov.A05);
                                if (A008 != null) {
                                    A008.EqX((OK5) null);
                                }
                                C74578PxR A009 = POV.A00(pov, Integer.valueOf(i2));
                                if (A009 != null) {
                                    A009.EqX(pov.A00);
                                    A009.E2w(put3, pov.A04, (Integer) null);
                                }
                            }
                            pov.A07 = false;
                        }
                        pov.A05 = Integer.valueOf(i2);
                        return;
                    }
                    return;
                }
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
