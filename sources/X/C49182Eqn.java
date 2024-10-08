package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.Eqn  reason: case insensitive filesystem */
public abstract class C49182Eqn {
    public static void A00(16F r1, C47326Dut dut, String str) {
        if ("profile_pic_url".equals(str)) {
            dut.A01 = 16h.A00(r1);
        } else if (Dbe.A01().equals(str)) {
            dut.A05 = AnonymousClass7TG.A0l(r1);
        } else if ("full_name".equals(str)) {
            dut.A03 = AnonymousClass7TG.A0l(r1);
        } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(str)) {
            dut.A04 = AnonymousClass7TG.A0l(r1);
        } else if (AnonymousClass000.A00(4901).equals(str)) {
            dut.A02 = AnonymousClass7TF.A0Z(r1);
        } else if ("is_auto_block_enabled".equals(str)) {
            dut.A06 = r1.A0d();
        } else if ("interop_user_type".equals(str)) {
            dut.A00 = r1.A1D();
        } else {
            1XY.A01(r1, dut, str);
        }
    }
}
