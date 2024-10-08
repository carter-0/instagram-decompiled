package X;

/* renamed from: X.Eo3  reason: case insensitive filesystem */
public abstract class C49027Eo3 {
    public static void A00(16F r1, C47325Dus dus, String str) {
        if ("vetted_phone_reg_login_uid".equals(str)) {
            dus.A02 = AnonymousClass7TG.A0l(r1);
        } else if ("vetted_phone_reg_login_nonce".equals(str)) {
            dus.A01 = AnonymousClass7TG.A0l(r1);
        } else if ("vetted_phone_reg_login_username".equals(str)) {
            dus.A03 = AnonymousClass7TG.A0l(r1);
        } else if ("vetted_phone_reg_login_profile_pic_url".equals(str)) {
            dus.A00 = 16h.A00(r1);
        } else {
            1XY.A01(r1, dus, str);
        }
    }
}
