package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class NMB extends 1P0 {
    public final /* synthetic */ C330437Mt A00;
    public final /* synthetic */ String A01;

    public NMB(C330437Mt r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i;
        List list;
        int i2;
        List subList;
        List unmodifiableList;
        List unmodifiableList2;
        List unmodifiableList3;
        int A03 = AnonymousClass0fD.A03(-1526659386);
        NGx nGx = (NGx) obj;
        int A032 = AnonymousClass0fD.A03(778875146);
        0qQ.A0B(nGx, 0);
        C370538wd r8 = nGx.A00;
        if (r8 != null) {
            C330437Mt r3 = this.A00;
            if (r3.A06 != null && r3.A02 != null) {
                Iterator it = r8.A07.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C254703su r2 = (C254703su) AnonymousClass7TF.A0a(it);
                    if (0mp.A0G(r2.A0g(), r3.A06)) {
                        r2.A0H = r3.A02;
                        break;
                    }
                }
            }
            2Dr r22 = r3.A0B;
            2FW r1 = null;
            DirectThreadKey directThreadKey = new DirectThreadKey(this.A01, (List) null);
            2Dr r23 = r22;
            synchronized (r23) {
                AnonymousClass48S A0P = r23.A0P(directThreadKey);
                if (A0P == null) {
                    0wb.A03("DirectThreadStore", "Null thread entry, Entry should exist before function call");
                } else {
                    synchronized (A0P) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                        ArrayList A1D = AnonymousClass7TE.A1D(r8.A07);
                        Collections.sort(A1D, AnonymousClass48U.A04);
                        String str2 = r8.A06;
                        String A05 = AnonymousClass48U.A05(str2, A1D);
                        if (!A1D.isEmpty()) {
                            str2 = AnonymousClass48U.A04(str2, C66580MXl.A0y(A1D.get(A1D.size() - 1)));
                        }
                        List list2 = A0P.A0K;
                        0qQ.A0B(list2, 0);
                        if (A05 != null) {
                            i = AnonymousClass48U.A00(A05, list2);
                            if (i < 0) {
                                i ^= -1;
                            }
                        } else {
                            i = 0;
                        }
                        int A012 = AnonymousClass48U.A01(str2, list2);
                        if (i > A012) {
                            list = Collections.emptyList();
                            0qQ.A07(list);
                        } else {
                            list = list2.subList(i, A012);
                        }
                        if (A05 != null) {
                            i2 = AnonymousClass48U.A00(A05, A1D);
                            if (i2 < 0) {
                                i2 ^= -1;
                            }
                        } else {
                            i2 = 0;
                        }
                        int A013 = AnonymousClass48U.A01(str2, A1D);
                        if (i2 > A013) {
                            subList = Collections.emptyList();
                            0qQ.A07(subList);
                        } else {
                            subList = A1D.subList(i2, A013);
                        }
                        AnonymousClass48S.A0E(A0P, list, subList, A1C, A1C2, A1C3);
                        unmodifiableList = Collections.unmodifiableList(A1C);
                        unmodifiableList2 = Collections.unmodifiableList(A1C2);
                        unmodifiableList3 = Collections.unmodifiableList(A1C3);
                    }
                    2Kb r82 = new 2Kb(A0P.A0I.BJz(), AnonymousClass05K.A0D, unmodifiableList, AnonymousClass48S.A03(unmodifiableList2, false), unmodifiableList3, false);
                    r23.A09.accept(r82);
                    r23.A06.A00(r82);
                    2Dr.A0F(r23, A0P);
                }
            }
            OG0 og0 = r3.A04;
            if (og0 != null) {
                0rm r7 = og0.A04;
                FV3 fv3 = og0.A01;
                2Dm A0e = C66580MXl.A0e(fv3.A07);
                DirectThreadKey BJy = og0.A02.BJy();
                OHR ohr = fv3.A01;
                if (ohr != null) {
                    str = ohr.A02;
                } else {
                    str = null;
                }
                r7.A00 = A0e.BRz(BJy, String.valueOf(str));
                C71866Os8 A002 = C69841Nt5.A00(fv3.A04);
                String str3 = og0.A03;
                C254703su r0 = (C254703su) r7.A00;
                if (r0 != null) {
                    r1 = r0.A10;
                }
                String valueOf = String.valueOf(r1);
                0qQ.A0B(valueOf, 1);
                0Aj A0H = C66582MXn.A0H(A002.A00, "direct_pinned_message_impression", str3);
                A0H.AAJ("media_type", valueOf);
                A0H.A9F(C273654mx.A00(360), Long.valueOf((long) og0.A00));
                A0H.Cgf();
            }
        }
        AnonymousClass0fD.A0A(-568292473, A032);
        AnonymousClass0fD.A0A(-418849623, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1086464241);
        C330437Mt r1 = this.A00;
        r1.A08 = false;
        r1.A07 = r1.A06;
        AnonymousClass7BI r0 = r1.A03;
        if (r0 != null) {
            r0.A00.post(new PVL(r0.A01));
        }
        AnonymousClass0fD.A0A(1364507055, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-2084068101);
        C330437Mt r1 = this.A00;
        r1.A08 = true;
        AnonymousClass7BI r0 = r1.A03;
        if (r0 != null) {
            r0.A00.post(new PVM(r0.A01));
        }
        AnonymousClass0fD.A0A(-1915578518, A03);
    }
}
