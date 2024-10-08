package X;

import org.json.JSONObject;

public final class OZ6 {
    public static final OZ6 A00 = new Object();

    public final 2FW A01(C74554Pwu pwu, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        AnonymousClass3FZ A002;
        int intValue;
        if (num != null) {
            int intValue2 = num.intValue();
            if (intValue2 == 2 || intValue2 == 4) {
                if (num3 == null || num3.intValue() != 8) {
                    return 2FW.A1A;
                }
                return 2FW.A1j;
            } else if (intValue2 == 5) {
                return 2FW.A1k;
            } else {
                if (intValue2 == 7) {
                    if (num2 == null || ((intValue = num2.intValue()) != 4000 && intValue != 4001 && intValue != 4002 && intValue != 4003 && intValue != 4004 && intValue != 4005 && intValue != 4006 && intValue != 4007)) {
                        return 2FW.A0s;
                    }
                    return 2FW.A1i;
                } else if (intValue2 == 1) {
                    if (!(pwu == null || (A002 = ((AnonymousClass3FZ) pwu).A00(C68114N1c.class, "ig_avatar_sticker")) == null)) {
                        JSONObject jSONObject = A002.A00;
                        boolean z = true;
                        if (jSONObject.optInt("is_avatar_sticker") != 1) {
                            z = false;
                        }
                        if (jSONObject.optBoolean("is_avatar_sticker", z)) {
                            return 2FW.A0O;
                        }
                    }
                    return 2FW.A1b;
                } else if (intValue2 == 3) {
                    return 2FW.A0K;
                }
            }
        } else if (num4 != null && num4.intValue() == 2) {
            return 2FW.A0l;
        } else {
            if (num3 != null) {
                int intValue3 = num3.intValue();
                if (intValue3 == 1) {
                    return 2FW.A0G;
                }
                if (!(intValue3 == -2 || intValue3 == -1 || intValue3 == 5)) {
                    if (intValue3 == 4) {
                        return 2FW.A1G;
                    }
                    if (intValue3 == 11) {
                        return 2FW.A0k;
                    }
                }
            }
            if (str == null) {
                str = "";
            }
            if (C253053q8.A07(str).isEmpty()) {
                return 2FW.A1g;
            }
            return 2FW.A17;
        }
        return 2FW.A1M;
    }

    public static final 2FW A00(C74541Pwa pwa, C74552Pwl pwl, int i) {
        pwl.Acq(i);
        String C4n = pwl.C4n(i);
        if (!(C4n == null || pwa == null)) {
            C4n = pwa.ANc(C4n);
        }
        return A00.A01(pwl.Bjx(i), pwl.Acu(i), pwl.CH5(i), Integer.valueOf(pwl.BS3(i)), Integer.valueOf(pwl.BS2(i)), C4n);
    }
}
