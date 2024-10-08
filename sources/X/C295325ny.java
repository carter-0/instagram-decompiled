package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.5ny  reason: invalid class name and case insensitive filesystem */
public abstract class C295325ny {
    public static final BE8 A01(C61074JwC jwC) {
        XET xet;
        0qQ.A0B(jwC, 0);
        BGB bgb = null;
        new 1E9(new 1hu((UserSession) null), 6, false);
        DS4 ds4 = new BE8((YCC) null, (C42053BFg) null, (DS4) null, (1Xj) null, (Integer) null).A01;
        1Xj r9 = (1Xj) jwC.A01;
        YCC ycc = (YCC) jwC.A00;
        C42053BFg bFg = (C42053BFg) jwC.A02;
        Integer num = (Integer) jwC.A03;
        C42053BFg bFg2 = null;
        1E9 r0 = new 1E9(new 1hu((UserSession) null), 6, false);
        if (ycc != null) {
            xet = ycc.F0D(r0);
        } else {
            xet = null;
        }
        if (ds4 != null) {
            bgb = ds4.F8d(r0);
        }
        if (bFg != null) {
            bFg2 = bFg;
        }
        return new BE8(xet, bFg2, bgb, r9, num);
    }

    public static final C267324bN A02(C276024sM r3) {
        Integer CAf;
        0qQ.A0B(r3, 0);
        C67231sQ clipsMetadata = r3.BPf().A0C.getClipsMetadata();
        if (clipsMetadata != null) {
            1Xj BPf = r3.BPf();
            C295345o0 AKX = clipsMetadata.AKX();
            String A30 = r3.BPf().A30();
            if (A30 != null) {
                AKX.A0Y = A30;
                BPf.A3v(AKX.A00());
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if ((r3.CAf() == null || ((CAf = r3.CAf()) != null && CAf.intValue() == 7)) && r3.BPf().A0C.getClipsMetadata() == null && r3.BPf().A1v() == null) {
            return new C267324bN(new GEC(C295365o2.PREVIEW, r3.BPf()));
        }
        return new C267324bN((C267334bO) new C295355o1(r3.BPf(), (AnonymousClass3OA) null));
    }

    public static final C267324bN A03(DU5 du5) {
        AnonymousClass3OA r0;
        Integer CAf;
        DU5 du52 = du5;
        0qQ.A0B(du52, 0);
        1Xj BPf = du52.BPf();
        if (BPf != null) {
            C67231sQ clipsMetadata = BPf.A0C.getClipsMetadata();
            if (clipsMetadata != null) {
                C295345o0 AKX = clipsMetadata.AKX();
                String A30 = BPf.A30();
                if (A30 != null) {
                    AKX.A0Y = A30;
                    BPf.A3v(AKX.A00());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if ((du52.CAf() == null || ((CAf = du52.CAf()) != null && CAf.intValue() == 7)) && BPf.A0C.getClipsMetadata() == null && BPf.A1v() == null && du52.Ag5() == null) {
                return new C267324bN(new GEC(C295365o2.PREVIEW, BPf));
            }
            Integer CAf2 = du52.CAf();
            if (CAf2 == null || CAf2.intValue() != 2) {
                return new C267324bN((C267334bO) new C295355o1(BPf, (AnonymousClass3OA) null));
            }
            r0 = C250913mG.A00(BPf);
        } else {
            YCC AZ7 = du52.AZ7();
            if (AZ7 != null) {
                DSV BUQ = AZ7.BUQ();
                if (BUQ != null) {
                    String BUa = BUQ.BIC().BUa();
                    if (BUa == null || BUa.equals("0")) {
                        BUa = UUID.randomUUID().toString();
                    }
                    0qQ.A0A(BUa);
                    List<YCC> BUU = BUQ.BUU();
                    ArrayList arrayList = new ArrayList(0Yv.A1E(BUU, 10));
                    for (YCC A04 : BUU) {
                        arrayList.add(A04(A04));
                    }
                    return C295375o3.A01(new C376699Iz(BUQ.BIC(), BUa, (List) arrayList), (AnonymousClass3OA) 00k.A0I(arrayList));
                }
                r0 = A04(AZ7);
            } else {
                DV1 BVn = du52.BVn();
                if (BVn == null) {
                    return null;
                }
                String mediaId = BVn.getMediaId();
                String BVt = BVn.BVt();
                Integer valueOf = Integer.valueOf((int) BVn.BJY());
                String C9L = BVn.C9L();
                1Xj Aep = BVn.Aep();
                String title = BVn.getTitle();
                String message = BVn.getMessage();
                String Air = BVn.Air();
                String Aij = BVn.Aij();
                String Aik = BVn.Aik();
                boolean BAv = BVn.BAv();
                return new C267324bN((C267334bO) new GYO(new C53328GmE(BVn.BVo(), Aep, valueOf, 0, BVn.AiI(), mediaId, BVt, C9L, title, message, Air, Aij, Aik, (String) null, (String) null, (List) null, (List) null, BAv)));
            }
        }
        return C295375o3.A03(r0);
    }

    public static final GV8 A04(YCC ycc) {
        1Xj r0;
        C233492vo r5;
        YCC ycc2 = ycc;
        0qQ.A0B(ycc2, 0);
        1Xj r02 = (1Xj) ycc2.getItems().get(0);
        Long AiI = ycc2.AiI();
        if (AiI != null) {
            r02.A0C.EQ7(AiI);
        }
        1iA A00 = 1i9.A00(ycc2.BR8());
        if (1iA.A09 != A00 || (r0 = 1Xj.A0h.A0D(ycc2.getMediaId(), ycc2.getItems())) == null) {
            r0 = (1Xj) ycc2.getItems().get(0);
        }
        GV9 gv9 = new GV9();
        gv9.A0L = r0;
        gv9.A0M = A00;
        gv9.A01 = ycc2.B7V();
        gv9.A0n = ycc2.getItems();
        gv9.A05 = ycc2.Am3();
        gv9.A0J = ycc2.BPl();
        gv9.A08 = ycc2.AsR();
        gv9.A0e = ycc2.getDominantColor();
        gv9.A0a = ycc2.BZp();
        gv9.A0g = ycc2.BKL();
        gv9.A0q = ImmutableList.copyOf((Collection) ycc2.BDE());
        gv9.A0l = ycc2.C9L();
        gv9.A0b = ycc2.AZH();
        gv9.A00 = ImmutableList.copyOf((Collection) ycc2.getCookies());
        ycc2.BIH();
        gv9.A0Z = ycc2.AZ4();
        gv9.A0m = ImmutableList.copyOf((Collection) ycc2.Abc());
        gv9.A0h = ycc2.BMq();
        C233502vp Ana = ycc2.Ana();
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = null;
        if (Ana != null) {
            r5 = Ana.FGd();
        } else {
            r5 = null;
        }
        gv9.A00 = new C233462vl((C67241sS) null, r5, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false);
        gv9.A0P = ycc2.Bl6();
        gv9.A0Q = ycc2.Bl7();
        gv9.A0U = ycc2.Cbd();
        ycc2.Ay5();
        gv9.A0p = ycc2.AzY();
        gv9.A09 = ycc2.Azd();
        gv9.A04 = ycc2.AtI();
        gv9.A02 = ycc2.Aa5();
        gv9.A0S = ycc2.B1H();
        gv9.A0o = ycc2.ArM();
        gv9.A0X = ycc2.CEl();
        gv9.A0K = ycc2.BUs();
        gv9.A03 = ycc2.AaH();
        gv9.A0F = ycc2.BY1();
        DSV BUQ = ycc2.BUQ();
        if (BUQ != null) {
            intentAwareAdsInfoIntf = BUQ.BIC();
        }
        gv9.A0E = intentAwareAdsInfoIntf;
        gv9.A0i = ycc2.BUV();
        gv9.A0V = ycc2.Bu6();
        gv9.A0R = ycc2.B10();
        gv9.A0T = ycc2.CRH();
        gv9.A0D = ycc2.BMD();
        return gv9.A01();
    }

    public static final List A05(UserSession userSession, List list) {
        C267324bN r3;
        Integer num;
        int i;
        String str;
        0qQ.A0B(userSession, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C276014sL r2 = (C276014sL) it.next();
            0qQ.A0B(r2, 0);
            1Xj r5 = r2.A00;
            C67231sQ clipsMetadata = r5.A0C.getClipsMetadata();
            if (clipsMetadata != null) {
                C295345o0 AKX = clipsMetadata.AKX();
                String A30 = r5.A30();
                if (A30 != null) {
                    AKX.A0Y = A30;
                    r5.A3v(AKX.A00());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            Integer num2 = r2.A01;
            if ((num2 == null || num2.intValue() == 7) && r5.A0C.getClipsMetadata() == null && r5.A1v() == null) {
                r3 = new C267324bN(new GEC(C295365o2.PREVIEW, r5));
            } else {
                r3 = null;
                if (num2 == null || num2.intValue() != 2) {
                    r3 = new C267324bN((C267334bO) new C295355o1(r5, (AnonymousClass3OA) null));
                } else if (182.A06(0Tu.A05, userSession, 2342161566202403063L)) {
                    try {
                        r3 = C295375o3.A03(C250913mG.A00(r5));
                    } catch (NullPointerException unused) {
                        0f9 AEf = 0wj.A01.AEf("ClipsItemDictIntf.toClipsItemWithAd", 817902528);
                        if (r5.A66()) {
                            num = AnonymousClass05K.A0N;
                        } else if (r5.A65()) {
                            num = AnonymousClass05K.A0C;
                        } else if (r5.CcK()) {
                            num = AnonymousClass05K.A01;
                        } else {
                            num = AnonymousClass05K.A00;
                        }
                        AEf.ABQ("AdType", AnonymousClass5MO.A00(num));
                        Integer BR8 = r5.A0C.BR8();
                        if (BR8 != null) {
                            i = BR8.intValue();
                        } else {
                            i = -1;
                        }
                        AEf.ABO("MediaType", i);
                        boolean z = false;
                        if (r5.A0C.getInjected() != null) {
                            z = true;
                        }
                        AEf.ABR("Injected", z);
                        C250513lZ injected = r5.A0C.getInjected();
                        if (injected == null || (str = injected.AZ4()) == null) {
                            str = "N/A";
                        }
                        AEf.ABQ("AdId", str);
                        AEf.ABQ("MediaId", r5.BpP());
                        AEf.report();
                    }
                } else {
                    r3 = C295375o3.A03(C250913mG.A00(r5));
                }
            }
            if (r3 != null) {
                arrayList.add(r3);
            }
        }
        return arrayList;
    }

    public static final List A06(UserSession userSession, List list, List list2, int i) {
        UserSession userSession2;
        DV1 BVn;
        int i2;
        C233502vp Ana;
        Integer C4M;
        C233502vp Ana2;
        C233492vo r13;
        C233462vl r11;
        C233502vp r0;
        C233492vo r132;
        List<DU5> list3 = list;
        0qQ.A0B(list3, 1);
        ArrayList arrayList = new ArrayList();
        if (list3.isEmpty()) {
            return arrayList;
        }
        List list4 = list2;
        if (list4.isEmpty()) {
            return arrayList;
        }
        int i3 = 0;
        int size = list4.size();
        while (true) {
            userSession2 = userSession;
            if (i3 >= size) {
                break;
            }
            DU5 du5 = (DU5) list3.get(i3);
            C267324bN r4 = (C267324bN) list4.get(i3);
            0qQ.A0B(du5, 0);
            0qQ.A0B(r4, 2);
            YCC AZ7 = du5.AZ7();
            if (AZ7 != null) {
                DSV BUQ = AZ7.BUQ();
                if (BUQ != null) {
                    C233502vp Ana3 = ((YCC) 00k.A0I(BUQ.BUU())).Ana();
                    if (Ana3 != null) {
                        r132 = Ana3.FGd();
                    } else {
                        r132 = null;
                    }
                    C233462vl r112 = new C233462vl((C67241sS) null, r132, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false);
                    if (1KU.A09(userSession2) && i > 0) {
                        r112.A0B(r112.A09() + i);
                    }
                    r11 = new C233462vl((C67241sS) null, r132, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false);
                } else {
                    r0 = AZ7.Ana();
                    if (r0 == null) {
                        r13 = null;
                        r11 = new C233462vl((C67241sS) null, r13, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false);
                        if (1KU.A09(userSession2) && i > 0) {
                            r11.A0B(r11.A09() + i);
                        }
                    }
                    r13 = r0.FGd();
                    r11 = new C233462vl((C67241sS) null, r13, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false);
                    r11.A0B(r11.A09() + i);
                }
            } else {
                DV1 BVn2 = du5.BVn();
                if (BVn2 != null) {
                    0Tu r7 = 0Tu.A06;
                    if (182.A06(r7, userSession2, 36313725150431444L) || 182.A06(r7, userSession2, 36319480405564857L) || 182.A06(r7, userSession2, 36320618571899562L) || 182.A06(r7, userSession2, 36325205596975836L)) {
                        r0 = BVn2.Ana();
                        r13 = r0.FGd();
                        r11 = new C233462vl((C67241sS) null, r13, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false);
                        r11.A0B(r11.A09() + i);
                    }
                }
                i3++;
            }
            arrayList.add(new C376489Ie(r4, r11));
            i3++;
        }
        if (!182.A06(0Tu.A05, userSession2, 36318509747280082L)) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i4 = -1;
            if (!it.hasNext()) {
                break;
            }
            C233472vm r02 = (C233472vm) ((C376489Ie) it.next()).A04;
            if (r02 != null) {
                i4 = r02.A09();
            }
            arrayList2.add(Integer.valueOf(i4));
        }
        if (!0qQ.A0K(00k.A0Z(arrayList2), arrayList2)) {
            ArrayList arrayList3 = new ArrayList(0Yv.A1E(list3, 10));
            for (DU5 du52 : list3) {
                YCC AZ72 = du52.AZ7();
                if ((AZ72 == null || (Ana2 = AZ72.Ana()) == null || (C4M = Ana2.C4M()) == null) && ((BVn = du52.BVn()) == null || (Ana = BVn.Ana()) == null || (C4M = Ana.C4M()) == null)) {
                    i2 = -1;
                } else {
                    i2 = C4M.intValue();
                }
                arrayList3.add(Integer.valueOf(i2));
            }
            0wj r42 = 0wj.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Sponsored Item Sync Delivery Discrepancy, indexList: ");
            sb.append(arrayList2);
            sb.append("response: ");
            sb.append(arrayList3);
            r42.AEf(sb.toString(), 976028688).report();
        }
        return 00k.A0g(arrayList, new C57995Ijo());
    }

    public static final C276014sL A00(C267324bN r3) {
        1Xj r2;
        if (r3 == null || (r2 = r3.A02) == null) {
            return null;
        }
        return new C276014sL(r2, Integer.valueOf(r3.A01.ordinal()));
    }

    public static final List A07(List list) {
        if (list == null) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A02((C276014sL) it.next()));
        }
        return arrayList;
    }
}
