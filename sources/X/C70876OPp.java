package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* renamed from: X.OPp  reason: case insensitive filesystem */
public abstract class C70876OPp {
    public static 2PM parseFromJson(16F r24) {
        String A00;
        16F r11 = r24;
        0qQ.A0B(r11, 0);
        try {
            Integer num = null;
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (true) {
                16L A1J = r11.A1J();
                16L r10 = 16L.A09;
                A00 = AnonymousClass000.A00(367);
                if (A1J == r10) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r11);
                if ("folder_id".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if ("folder_name".equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if (DatePickerDialogModule.ARG_MODE.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                } else if (A00.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if ("can_be_renamed".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r11);
                } else if ("can_be_reordered".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r11);
                } else if ("can_be_deleted".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r11);
                } else {
                    bool4 = C41847B3o.A0z(r11, bool4, A17, "can_move_thread_to");
                }
                r11.A0z();
            }
            if (str == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("folder_id", r11, "DirectFolderSummary");
            } else if (str2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("folder_name", r11, "DirectFolderSummary");
            } else if (str3 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DatePickerDialogModule.ARG_MODE, r11, "DirectFolderSummary");
            } else if (num == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r11, "DirectFolderSummary");
            } else if (bool == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_be_renamed", r11, "DirectFolderSummary");
            } else if (bool2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_be_reordered", r11, "DirectFolderSummary");
            } else if (bool3 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L("can_be_deleted", r11, "DirectFolderSummary");
            } else if (bool4 != null || !(r11 instanceof 0c9)) {
                return new 2PM(str, str2, str3, num.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
            } else {
                AnonymousClass7TF.A1L("can_move_thread_to", r11, "DirectFolderSummary");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, 2PM r3) {
        r2.A0c();
        String str = r3.A05;
        if (str != null) {
            r2.A0R("folder_id", str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0R("folder_name", str2);
        }
        String str3 = r3.A06;
        if (str3 != null) {
            r2.A0R(DatePickerDialogModule.ARG_MODE, str3);
        }
        r2.A0P(AnonymousClass000.A00(367), r3.A00);
        r2.A0S("can_be_renamed", r3.A08);
        r2.A0S("can_be_reordered", r3.A09);
        r2.A0S("can_be_deleted", r3.A07);
        r2.A0S("can_move_thread_to", r3.A0A);
        r2.A0Z();
    }
}
