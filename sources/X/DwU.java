package X;

import android.os.Bundle;
import java.util.ArrayList;

public final class DwU extends 1XP {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public ArrayList A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public final Bundle A00() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("is_two_factor_enabled", this.A08);
        A0a.putBoolean("is_totp_two_factor_enabled", this.A07);
        A0a.putBoolean("can_add_additional_totp_seed", this.A09);
        A0a.putString(Dbb.A0T(), this.A03);
        A0a.putString("country_code", this.A00);
        A0a.putString("national_number", this.A02);
        A0a.putBoolean("is_phone_confirmed", this.A0F);
        A0a.putStringArrayList("backup_codes", this.A04);
        A0a.putParcelableArrayList("trusted_devices", this.A06);
        A0a.putParcelableArrayList("totp_seeds", this.A05);
        A0a.putString("email", this.A01);
        A0a.putBoolean("is_eligible_for_multiple_totp", this.A0C);
        A0a.putBoolean("has_reachable_email", this.A0B);
        A0a.putBoolean("eligible_for_trusted_notifications", this.A0A);
        A0a.putBoolean("is_trusted_notifications_enabled", this.A0H);
        A0a.putBoolean("is_eligible_for_whatsapp_two_factor", this.A0E);
        A0a.putBoolean("is_whatsapp_two_factor_enabled", this.A0I);
        A0a.putBoolean("is_eligible_for_phone_number_confirmed_badge_toggle", this.A0D);
        A0a.putBoolean("is_phone_number_confirmed_badge_enabled", this.A0G);
        return A0a;
    }
}
