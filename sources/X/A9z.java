package X;

import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.iabeventlogging.model.IABEmptyEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABIPAMatchKeyEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;
import java.util.List;

public final class A9z {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 9;
    public int A03 = 9;
    public int A04 = 1;
    public int A05 = 1;
    public int A06 = -1;
    public int A07 = -1;
    public long A08 = 0;
    public long A09 = -1;
    public long A0A = -1;
    public long A0B = -1;
    public long A0C = -1;
    public long A0D = -1;
    public long A0E = -1;
    public long A0F = -1;
    public long A0G = -1;
    public long A0H = -1;
    public long A0I = -1;
    public long A0J = -1;
    public long A0K = -1;
    public long A0L = -1;
    public long A0M = -1;
    public long A0N = -1;
    public IabCommonTrait A0O;
    public IABViewModeLaunchConfig A0P;
    public ZonedValue A0Q = new ZonedValue(ZonePolicy.A05, "");
    public Boolean A0R = false;
    public Boolean A0S;
    public Boolean A0T = false;
    public Long A0U;
    public Long A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public ArrayList A0b;
    public List A0c;
    public List A0d = null;
    public boolean A0e = false;
    public boolean A0f = false;
    public boolean A0g = false;
    public boolean A0h = false;
    public boolean A0i = false;
    public boolean A0j;
    public boolean A0k = false;
    public boolean A0l;
    public final AnonymousClass0JP A0m;
    public final ZonePolicy A0n;
    public final ArrayList A0o;
    public final boolean A0p;

    public final IABEvent A00() {
        if (!this.A0p) {
            return IABEvent.A04;
        }
        long now = this.A0m.now();
        return new IABEvent(C8945RGn.IAB_OPEN_MENU, this.A0Z, now, now);
    }

    public final IABEvent A01(long j) {
        if (!this.A0p) {
            return IABEvent.A04;
        }
        IABEmptyEvent iABEmptyEvent = IABEvent.A04;
        String str = this.A0Z;
        long now = this.A0m.now();
        ZonedValue zonedValue = this.A0Q;
        long j2 = this.A0L;
        String str2 = this.A0W;
        long j3 = this.A08;
        List list = this.A0c;
        return new IABLaunchEvent(this.A0O, this.A0P, zonedValue, str, str2, this.A0X, list, j, now, j2, j3);
    }

    public final IABEvent A02(Long l, String str, AnonymousClass59G r15, long j, long j2) {
        String str2;
        long longValue;
        if (!this.A0p || (str2 = this.A0Z) == null) {
            return IABEvent.A04;
        }
        if (l == null) {
            longValue = this.A0m.now();
        } else {
            longValue = l.longValue();
        }
        return new IABIPAMatchKeyEvent(str2, str, r15, longValue, longValue, j, j2);
    }

    public final void A03(String str) {
        if (this.A0p) {
            try {
                RIX valueOf = RIX.valueOf(str);
                List list = this.A0d;
                if (list == null) {
                    list = AnonymousClass7TE.A1C();
                    this.A0d = list;
                }
                0bb r2 = new 0bb();
                r2.A01(valueOf, "view_mode");
                r2.A04("timestamp", Double.valueOf(Long.valueOf(this.A0m.now()).doubleValue()));
                list.add(r2);
            } catch (IllegalArgumentException e) {
                0KC.A0J("IABEventLogger", "Server and client implementations of IABViewMode are out of sync", e);
            }
        }
    }

    public A9z(AnonymousClass0JP r7, ZonePolicy zonePolicy, boolean z) {
        this.A0p = z;
        this.A0m = r7;
        this.A0o = AnonymousClass7TE.A1C();
        this.A0c = AnonymousClass7TE.A1C();
        this.A0n = zonePolicy;
    }
}
