package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* renamed from: X.Kxl  reason: case insensitive filesystem */
public abstract class C63482Kxl {
    public static LA3 parseFromJson(16F r8) {
        NoSuchElementException noSuchElementException;
        int i;
        String str;
        0qQ.A0B(r8, 0);
        try {
            LA3 la3 = new LA3();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                ArrayList arrayList = null;
                if (AnonymousClass000.A00(546).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                    }
                    r8.A1P();
                } else {
                    if (!"live_seconds_per_comment".equals(A17)) {
                        if (!AnonymousClass000.A00(1205).equals(A17)) {
                            if (!AnonymousClass000.A00(140).equals(A17)) {
                                if ("caption".equals(A17)) {
                                    if (r8.A11() == 16L.A0G) {
                                    }
                                    r8.A1P();
                                } else if (!AnonymousClass000.A00(4573).equals(A17) && !AnonymousClass000.A00(3220).equals(A17) && !AnonymousClass000.A00(624).equals(A17)) {
                                    if (AnonymousClass000.A00(3568).equals(A17)) {
                                        String A0l = AnonymousClass7TG.A0l(r8);
                                        0qQ.A0B(A0l, 0);
                                        Integer[] A00 = AnonymousClass05K.A00(2);
                                        int length = A00.length;
                                        int i2 = 0;
                                        while (i2 < length) {
                                            if (1 - JTO.A0A(A00, i2) != 0) {
                                                str = AnonymousClass000.A00(290);
                                            } else {
                                                str = NetInfoModule.CONNECTION_TYPE_NONE;
                                            }
                                            if (!A0l.equals(str)) {
                                                i2++;
                                            }
                                        }
                                        noSuchElementException = new NoSuchElementException(C273654mx.A00(5));
                                    } else if ("comment_muted".equals(A17)) {
                                        int A1D = r8.A1D();
                                        Integer[] A002 = AnonymousClass05K.A00(2);
                                        int length2 = A002.length;
                                        int i3 = 0;
                                        while (i3 < length2) {
                                            Integer num = A002[i3];
                                            if (1 - num.intValue() != 0) {
                                                i = 0;
                                            } else {
                                                i = 1;
                                            }
                                            if (A1D == i) {
                                                la3.A03 = num;
                                            } else {
                                                i3++;
                                            }
                                        }
                                        noSuchElementException = new NoSuchElementException(C273654mx.A00(5));
                                    } else if ("comments".equals(A17)) {
                                        if (r8.A11() == 16L.A0C) {
                                            arrayList = AnonymousClass7TE.A1C();
                                            while (r8.A1J() != 16L.A08) {
                                                M0V parseFromJson = C63476Kxf.parseFromJson(r8);
                                                if (parseFromJson != null) {
                                                    arrayList.add(parseFromJson);
                                                }
                                            }
                                        }
                                        la3.A04 = arrayList;
                                    } else if ("pinned_comment".equals(A17)) {
                                        la3.A01 = C63476Kxf.parseFromJson(r8);
                                    } else if ("unpinned_comment".equals(A17)) {
                                        la3.A02 = C63476Kxf.parseFromJson(r8);
                                    } else if ("system_comments".equals(A17)) {
                                        if (r8.A11() == 16L.A0C) {
                                            arrayList = AnonymousClass7TE.A1C();
                                            while (r8.A1J() != 16L.A08) {
                                                M0U parseFromJson2 = C63479Kxi.parseFromJson(r8);
                                                if (parseFromJson2 != null) {
                                                    arrayList.add(parseFromJson2);
                                                }
                                            }
                                        }
                                        la3.A05 = arrayList;
                                    } else if ("user_pay_supporters_info".equals(A17)) {
                                        la3.A00 = C63480Kxj.parseFromJson(16P.A00(r8.A1Q()));
                                    }
                                    throw noSuchElementException;
                                }
                            }
                        }
                        r8.A0d();
                    }
                    r8.A1D();
                }
                r8.A0z();
            }
            return la3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
