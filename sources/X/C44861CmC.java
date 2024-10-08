package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CmC  reason: case insensitive filesystem */
public abstract class C44861CmC {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.VSy, java.lang.Object] */
    public static C17371VSy parseFromJson(16F r10) {
        Throwable e;
        Integer num;
        1Xj r1;
        1Xg r12;
        0qQ.A0B(r10, 0);
        try {
            ? obj = new Object();
            16L A11 = r10.A11();
            16L r6 = 16L.A0D;
            if (A11 != r6) {
                r10.A0z();
                return null;
            }
            while (true) {
                16L A1J = r10.A1J();
                16L r5 = 16L.A09;
                if (A1J == r5) {
                    return obj;
                }
                String A0q = r10.A0q();
                ArrayList arrayList = null;
                if (C41846B3n.A1Y(r10, A0q)) {
                    obj.A00 = AnonymousClass7TG.A0l(r10);
                } else if ("modules".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            try {
                                C17926ViH viH = new C17926ViH();
                                if (r10.A11() != r6) {
                                    r10.A0z();
                                    viH = null;
                                } else {
                                    while (r10.A1J() != r5) {
                                        String A17 = AnonymousClass7TE.A17(r10);
                                        if ("feed_item".equals(A17)) {
                                            viH.A06 = C44860CmB.parseFromJson(r10);
                                        } else if ("question_list".equals(A17)) {
                                            viH.A01 = D08.parseFromJson(r10);
                                        } else if ("reel".equals(A17)) {
                                            viH.A07 = AnonymousClass3HR.parseFromJson(r10);
                                        } else if ("clips_item".equals(A17)) {
                                            viH.A00 = C275974sH.parseFromJson(r10);
                                        } else if ("business_card".equals(A17)) {
                                            viH.A04 = C44754CkQ.parseFromJson(r10);
                                        }
                                        r10.A0z();
                                    }
                                    C45354Cuw cuw = viH.A06;
                                    if (cuw != null) {
                                        viH.A08 = AnonymousClass05K.A00;
                                        1Xj r8 = cuw.A01;
                                        if (r8 != null) {
                                            viH.A03 = r8;
                                        } else {
                                            C45353Cuv cuv = cuw.A02;
                                            if (cuv != null) {
                                                r8 = cuv.A00;
                                                viH.A03 = r8;
                                                if (r8 != null) {
                                                    r8.A0C.EX0(cuv.A01);
                                                }
                                            } else {
                                                AnonymousClass3f1 r13 = cuw.A00;
                                                if (r13 != null) {
                                                    C246683f2 r9 = new C246683f2(r13);
                                                    r12 = new 1Xg(r9, 1UQ.A0H, r9.getId());
                                                    viH.A02 = r12;
                                                } else {
                                                    0wb.A03("SurveyModule", "Error parsing feed_item in SurveyModule");
                                                }
                                            }
                                        }
                                        r12 = 1Xi.A01(r8);
                                        viH.A02 = r12;
                                    } else {
                                        if (viH.A01 != null) {
                                            num = AnonymousClass05K.A01;
                                        } else {
                                            AnonymousClass3HX r2 = viH.A07;
                                            if (r2 != null) {
                                                viH.A08 = AnonymousClass05K.A0C;
                                                r1 = (1Xj) AnonymousClass3P9.A05(r2).get(0);
                                            } else {
                                                C276014sL r22 = viH.A00;
                                                if (r22 != null) {
                                                    viH.A08 = AnonymousClass05K.A0N;
                                                    r1 = r22.A00;
                                                } else if (viH.A04 != null) {
                                                    num = AnonymousClass05K.A0Y;
                                                } else {
                                                    num = AnonymousClass05K.A0j;
                                                }
                                            }
                                            viH.A03 = r1;
                                        }
                                        viH.A08 = num;
                                    }
                                }
                                0qQ.A0A(viH);
                                if (viH != null) {
                                    arrayList.add(viH);
                                }
                            } catch (IOException e2) {
                                e = e2;
                                throw e;
                            } catch (Exception e3) {
                                e = AnonymousClass7TE.A0j(e3);
                                throw e;
                            }
                        }
                    }
                    obj.A01 = arrayList;
                }
                r10.A0z();
            }
        } catch (IOException e4) {
            throw e4;
        } catch (Exception e5) {
            throw AnonymousClass7TE.A0j(e5);
        }
    }
}
