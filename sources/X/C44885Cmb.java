package X;

import com.instagram.api.schemas.IGUserHighlightsTrayType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cmb  reason: case insensitive filesystem */
public abstract class C44885Cmb {
    public static C239753Ia parseFromJson(16F r27) {
        String str;
        16F r2 = r27;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str2 = null;
            C239773Ic r8 = null;
            String str3 = null;
            Boolean bool = null;
            IGUserHighlightsTrayType iGUserHighlightsTrayType = null;
            Boolean bool2 = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool3 = null;
            Integer num3 = null;
            AnonymousClass3IY r11 = null;
            Integer num4 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            AnonymousClass3HX r12 = null;
            AnonymousClass3If r10 = null;
            Boolean bool4 = null;
            String str4 = null;
            ArrayList arrayList4 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("broadcasts".equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            C239653Hl parseFromJson = C277424v9.parseFromJson(r2);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AnonymousClass000.A00(1144).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("client_hints".equals(A17)) {
                    r8 = AnonymousClass3OP.parseFromJson(r2);
                } else if ("cursor".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if (AnonymousClass000.A00(1400).equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if (AnonymousClass000.A00(1414).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    iGUserHighlightsTrayType = C253633r7.A00(str);
                } else if (AnonymousClass000.A00(1531).equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r2);
                } else if (AnonymousClass000.A00(1563).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if (AnonymousClass000.A00(1564).equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else if ("my_week_enabled".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r2);
                } else if (AnonymousClass000.A00(1618).equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r2);
                } else if (AnonymousClass000.A00(1677).equals(A17)) {
                    r11 = AnonymousClass3IX.parseFromJson(r2);
                } else if (AnonymousClass000.A00(1750).equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r2);
                } else if (AnonymousClass000.A00(762).equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r2, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AnonymousClass000.A00(3896).equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r2, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (AnonymousClass000.A00(3949).equals(A17)) {
                    r12 = AnonymousClass3HR.parseFromJson(r2);
                } else if (AnonymousClass000.A00(3973).equals(A17)) {
                    r10 = CbO.parseFromJson(r2);
                } else if (AnonymousClass000.A00(1849).equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r2);
                } else if (AnonymousClass000.A00(1853).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("tray".equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList4 = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            AnonymousClass3HX parseFromJson2 = AnonymousClass3HR.parseFromJson(r2);
                            if (parseFromJson2 != null) {
                                arrayList4.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                }
                r2.A0z();
            }
            return new C239753Ia(r8, iGUserHighlightsTrayType, r10, r11, r12, bool, bool2, bool3, bool4, num, num2, num3, num4, str2, str3, str4, arrayList, arrayList2, arrayList3, arrayList4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
