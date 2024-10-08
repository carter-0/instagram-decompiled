package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3mF  reason: invalid class name and case insensitive filesystem */
public final class C250903mF extends 1XP {
    public C238523Ce A00 = C238523Ce.A04;
    public Integer A01;
    public Integer A02 = AnonymousClass05K.A0Y;
    public Integer A03;
    public Integer A04;
    public String A05;
    public HashMap A06;
    public HashMap A07;
    public UUID A08;
    public boolean A09 = false;
    public final Integer A0A = AnonymousClass05K.A00;

    public final Integer A00() {
        int i;
        Integer num = this.A01;
        if (num != null) {
            i = num.intValue();
        } else {
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return Integer.valueOf(i);
    }

    public final Integer A01(int i) {
        int i2;
        Integer num = this.A03;
        if (num != null) {
            C238523Ce r0 = this.A00;
            i2 = num.intValue();
            if (r0 instanceof C238543Cg) {
                i2 += i;
            }
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return Integer.valueOf(i2);
    }

    public final Integer A02(int i) {
        int i2;
        Integer num = this.A04;
        if (num != null) {
            C238523Ce r0 = this.A00;
            i2 = num.intValue();
            if (r0 instanceof C238543Cg) {
                i2 += i;
            }
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return Integer.valueOf(i2);
    }

    public final HashMap A03(UserSession userSession) {
        if (this.A09) {
            return this.A07;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.A07.entrySet()) {
            Object key = entry.getKey();
            AnonymousClass3HX r1 = (AnonymousClass3HX) entry.getValue();
            if (!AnonymousClass3P9.A07(userSession, r1) || (r1 = AnonymousClass3P9.A00(userSession, r1)) != null) {
                hashMap.put(key, r1);
            }
        }
        this.A07 = hashMap;
        this.A09 = true;
        return hashMap;
    }

    public final void A04(String str, int i, int i2) {
        if (this.A02 == AnonymousClass05K.A0C) {
            this.A01 = 2;
            this.A03 = Integer.valueOf(i + 1 + i2);
            this.A05 = str;
            this.A00 = C238523Ce.A04;
        }
    }
}
