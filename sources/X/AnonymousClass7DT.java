package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.7DT  reason: invalid class name */
public class AnonymousClass7DT implements AnonymousClass7DU {
    public final AnonymousClass7XR A00;

    public static void A00(AnonymousClass7X4 r11, C327627Bo r12, 2FW r13, 1Av r14, String str, String str2, String str3, long j, boolean z) {
        String A0g;
        2FW r8 = r13;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r14, 1);
        0xa r4 = r14.A01;
        int i = r4.getInt("should_show_like_direct_message_count", 0);
        if (i < 2) {
            if (r13 == 2FW.A1g) {
                A0g = "should_show_like_direct_message_nux";
            } else if (r13 == 2FW.A0q) {
                A0g = "should_show_like_direct_vm_message_nux";
            } else {
                A0g = 002.A0g("should_show_like_direct_", r13.name(), "_message_nux");
                0qQ.A07(A0g);
            }
            0xY AR4 = r4.AR4();
            AR4.E5T(A0g, false);
            AR4.apply();
            0xY AR42 = r4.AR4();
            AR42.E5Z("should_show_like_direct_message_count", i + 1);
            AR42.apply();
        }
        if (r12 == C327627Bo.NUX_TYPE_DOUBLE_TAP_TO_REACT_WITH_AVATAR) {
            0xY AR43 = r4.AR4();
            AR43.E5Z("double_tap_to_react_with_avatar_nux_count", r4.getInt("double_tap_to_react_with_avatar_nux_count", 0) + 1);
            AR43.apply();
        }
        r11.DRe(r8, new MessageIdentifier(str, str2), "double_tap", str3, (String) null, j, z);
        String str4 = r8.A00;
        0qQ.A0B(str4, 0);
        if (!r4.getBoolean(002.A0R("response_to_direct_liking_nux:", str4), false)) {
            String A0R = 002.A0R("response_to_direct_liking_nux:", str4);
            0xY AR44 = r4.AR4();
            AR44.E5T(A0R, true);
            AR44.apply();
        }
    }

    public /* bridge */ /* synthetic */ boolean DA8(Object obj, Object obj2) {
        if (this instanceof C3265977k) {
            return ((C3265977k) this).A01((AnonymousClass7FU) obj, (C328007Db) obj2);
        }
        return A01((AnonymousClass7FU) obj, obj2);
    }

    public AnonymousClass7DT(AnonymousClass7XR r1) {
        this.A00 = r1;
    }

    public boolean A01(AnonymousClass7FU r14, Object obj) {
        String str;
        if (!r14.CXM()) {
            return false;
        }
        List Atz = r14.Atz();
        String str2 = r14.BSG().A01;
        String A002 = r14.BSG().A00();
        long BSP = r14.BSP();
        2FW Aqm = r14.Aqm();
        boolean CWG = r14.CWG();
        AnonymousClass7XR r0 = this.A00;
        AnonymousClass7X4 r3 = (AnonymousClass7X4) r0;
        1Av CCu = r0.CCu();
        if (Atz == null || Atz.isEmpty()) {
            str = null;
        } else {
            str = (String) Atz.get(0);
        }
        A00(r3, r14.Ax9(), Aqm, CCu, str2, A002, str, BSP, CWG);
        return true;
    }
}
