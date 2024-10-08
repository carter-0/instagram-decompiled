package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class WUC implements C250603lj {
    public long A00;
    public AnonymousClass4DU A01;
    public final Map A02 = new HashMap();
    public final C229842oQ A03;

    public WUC(C229842oQ r2) {
        0qQ.A0B(r2, 1);
        this.A03 = r2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [int, boolean] */
    public final void ATF(AnonymousClass30Y r36, C252093oY r37) {
        Integer num;
        String str;
        String str2;
        V1T v1t;
        double d;
        String str3;
        ArrayList arrayList;
        AnonymousClass30Y r6 = r36;
        C252093oY r34 = r37;
        ? A1U = AnonymousClass7TF.A1U(0, r6, r34);
        boolean z = false;
        if (this.A01 == null) {
            String str4 = ((C17723Vcs) r6.A04).A0E.A02;
            if (str4 == null) {
                str4 = "";
            }
            this.A01 = C227942kP.A01(str4, false, false);
        }
        this.A00 = r34.BlK();
        int A0A = C51968G9o.A0A(r6, r34);
        if (A0A == 0) {
            num = AnonymousClass05K.A00;
        } else if (A0A != A1U) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        float CFe = r34.CFe(r6);
        int i = 0;
        if (CFe <= 0.0f) {
            i = -2;
        } else if (CFe >= 0.1f) {
            if (CFe < 0.25f) {
                i = 10;
            } else if (CFe < 0.5f) {
                i = 25;
            } else if (CFe < 0.75f) {
                i = 50;
            } else if (CFe < 1.0f) {
                i = 75;
            } else if (CFe == 1.0f) {
                i = 100;
            }
        }
        String str5 = r6.A05;
        int intValue = num.intValue();
        C17723Vcs vcs = (C17723Vcs) r6.A04;
        AnonymousClass9JI r8 = vcs.A0E;
        if (intValue == 0) {
            str = r8.A03;
            if (str != null) {
                boolean z2 = AnonymousClass4NZ.A04;
                0qQ.A0A(str5);
                0qQ.A0B(str5, A1U);
                String str6 = str;
                if (AnonymousClass4NZ.A04) {
                    str6 = str5;
                }
                Map map = AnonymousClass4NZ.A07;
                AnonymousClass5M7 r13 = (AnonymousClass5M7) map.get(str6);
                if (r13 != null) {
                    C17723Vcs vcs2 = r13.A03;
                    vcs2.A09.clear();
                    vcs2.A08.clear();
                    vcs2.A07.clear();
                    vcs2.A04 = null;
                    vcs2.A06.clear();
                    vcs2.A00 = 0;
                    vcs2.A04 = null;
                    vcs2.A03 = null;
                    vcs2.A01 = null;
                    vcs2.A0B = false;
                    vcs2.A0A = false;
                    vcs2.A0C = A1U;
                    vcs2.A0D = false;
                    vcs2.A05 = null;
                    vcs2.A02 = null;
                    r13.A01 = false;
                }
                String str7 = str;
                if (AnonymousClass4NZ.A04) {
                    str7 = str5;
                }
                AnonymousClass5M7 r5 = (AnonymousClass5M7) map.get(str7);
                if (r5 != null) {
                    AnonymousClass5M7.A02(r5, "view_entered", i, AnonymousClass5M7.A01(r5, str), AnonymousClass5M7.A00());
                }
            }
        } else if (intValue != A1U) {
            str = r8.A03;
            if (str != null) {
                boolean z3 = AnonymousClass4NZ.A04;
                0qQ.A0A(str5);
                0qQ.A0B(str5, 3);
                String str8 = str;
                if (AnonymousClass4NZ.A04) {
                    str8 = str5;
                }
                AnonymousClass5M7 r9 = (AnonymousClass5M7) AnonymousClass4NZ.A07.get(str8);
                if (r9 != null) {
                    C17723Vcs vcs3 = r9.A03;
                    if (i != vcs3.A00) {
                        vcs3.A00 = i;
                        long A002 = AnonymousClass5M7.A00();
                        long A012 = AnonymousClass5M7.A01(r9, str);
                        AnonymousClass5M7.A02(r9, AnonymousClass000.A00(4206), vcs3.A00, A012, A002);
                        vcs3.A09.put(Long.valueOf(A002), Long.valueOf(A012));
                    }
                }
            }
        } else {
            str = r8.A03;
            if (str != null) {
                0qQ.A0A(str5);
                boolean z4 = AnonymousClass4NZ.A04;
                0qQ.A0B(str5, 3);
                String str9 = str;
                if (AnonymousClass4NZ.A04) {
                    str9 = str5;
                }
                AnonymousClass5M7 r52 = (AnonymousClass5M7) AnonymousClass4NZ.A07.get(str9);
                if (r52 != null) {
                    AnonymousClass5M7.A02(r52, "view_exited", i, AnonymousClass5M7.A01(r52, str), AnonymousClass5M7.A00());
                    C17723Vcs vcs4 = r52.A03;
                    AnonymousClass4OK r11 = vcs4.A01;
                    String str10 = null;
                    if (r11 != null) {
                        arrayList = new ArrayList();
                        r11.A00.drainTo(arrayList);
                    } else {
                        arrayList = null;
                    }
                    boolean z5 = false;
                    vcs4.A0C = DbW.A1a(vcs4.A01);
                    if (arrayList != null) {
                        vcs4.A0A = A1U;
                        if (AnonymousClass4NZ.A00.A01 && r52.A04) {
                            z5 = true;
                        }
                        str10 = AnonymousClass4OK.A02(arrayList, arrayList.size(), z5);
                    }
                    vcs4.A04 = str10;
                    vcs4.A0D = r52.A05;
                    vcs4.A01 = null;
                    r52.A01 = A1U;
                    if (r52.A02) {
                        AnonymousClass4NZ.A05.A05(str, "");
                    }
                }
            }
        }
        Integer num2 = AnonymousClass05K.A0C;
        if (num != num2) {
            if (num == AnonymousClass05K.A01) {
                z = true;
            }
            C229842oQ r31 = this.A03;
            AnonymousClass4DU r132 = this.A01;
            if (r132 != null) {
                0qQ.A06(str5);
                long j = this.A00;
                0qQ.A06(r6.A03);
                AnonymousClass4DU r53 = this.A01;
                if (r53 != null) {
                    C254523sc r92 = new C254523sc(r53, "VIDEO_VIEWABILITY_SECOND_CHANNEL");
                    r92.A4y = r8.A02;
                    r92.A5u = String.valueOf(AnonymousClass4OT.A00.A01(str));
                    Boolean bool = (Boolean) r8.A00;
                    if (bool == null || !bool.booleanValue()) {
                        str2 = "organic";
                    } else {
                        str2 = "ad";
                    }
                    r92.A7K = str2;
                    r92.A7J = r8.A04;
                    List<C17479VXg> A0a = 00k.A0a(vcs.A06);
                    r92.A7f = new ArrayList();
                    for (C17479VXg vXg : A0a) {
                        0jB r112 = new 0jB();
                        r112.A04(C271774jZ.A9p, vXg.A03);
                        r112.A04(C271774jZ.A9m, Long.valueOf(vXg.A01));
                        r112.A04(C271774jZ.A9o, Long.valueOf(vXg.A02));
                        r112.A04(C271774jZ.A9n, Integer.valueOf(vXg.A00));
                        ArrayList arrayList2 = r92.A7f;
                        if (arrayList2 != null) {
                            arrayList2.add(r112);
                        }
                    }
                    r92.A5B = vcs.A04;
                    if (AnonymousClass7TF.A1Z(0la.A04)) {
                        v1t = V1T.ALPHA_RELEASE;
                    } else if (AnonymousClass7TF.A1Z(0la.A05)) {
                        v1t = V1T.BETA_RELEASE;
                    } else if (AnonymousClass7TF.A1Z(0la.A06)) {
                        v1t = V1T.PROD;
                    } else {
                        v1t = V1T.PRE_PROD;
                    }
                    r92.A0f = v1t;
                    Number number = (Number) r8.A01;
                    if (number != null) {
                        d = number.doubleValue();
                    } else {
                        d = Double.NaN;
                    }
                    r92.A01 = d;
                    r92.A3Y = vcs.A03;
                    r92.A2F = Boolean.valueOf(vcs.A0D);
                    r92.A17 = Boolean.valueOf(vcs.A0A);
                    r92.A1U = Boolean.valueOf(vcs.A0C);
                    String[] A003 = AnonymousClass4OU.A00(str);
                    if (A003 == null || A003.length <= A1U) {
                        str3 = null;
                    } else {
                        str3 = A003[A1U];
                    }
                    r92.A4W = str3;
                    r92.A75 = vcs.A05;
                    r92.A21 = vcs.A02;
                    r31.EAj(r132, new C254263sC(new C254563sg(r92), num, num2, str5, 0sn.A00, CFe, j, false, false), "feed_video", z);
                    if (z && str != null) {
                        AnonymousClass4NZ r54 = AnonymousClass4NZ.A05;
                        String str11 = str;
                        if (AnonymousClass4NZ.A04) {
                            str11 = str5;
                        }
                        AnonymousClass5M7 r4 = (AnonymousClass5M7) AnonymousClass4NZ.A07.get(str11);
                        if (!(r4 == null || !r4.A01 || r4.A00.get() == null)) {
                            r54.A05(str, str5);
                        }
                    }
                }
            }
            0qQ.A0F("insightsHost");
            throw AnonymousClass00P.createAndThrow();
        }
        int A0A2 = C51968G9o.A0A(r6, r34);
        if (A0A2 == 0 || A0A2 == A1U) {
            this.A02.put(str5, Float.valueOf(r34.CFe(r6)));
        } else {
            this.A02.remove(str5);
        }
    }
}
