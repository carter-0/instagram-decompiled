package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.62G  reason: invalid class name */
public final class AnonymousClass62G {
    public final C52510GVn A00(AnonymousClass6LO r15, AnonymousClass6L7 r16, String str, String str2, String str3, boolean z) {
        String str4 = str;
        0qQ.A0B(str4, 1);
        C52507GVk gVk = (C52507GVk) r16;
        String str5 = gVk.A03;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = gVk.A04;
        if (str6 == null) {
            str6 = "";
        }
        Integer num = null;
        Integer num2 = null;
        String str7 = null;
        String str8 = null;
        Integer num3 = null;
        Integer num4 = null;
        ImmutableList Ack = r16.Ack();
        ImmutableList Acm = r16.Acm();
        String str9 = gVk.A02;
        if (str2 != null) {
            str8 = str2;
        }
        if (r15 != null) {
            C306796Nn r152 = (C306796Nn) r15;
            str7 = r152.A04.F01();
            num2 = Integer.valueOf(r152.A01);
            if (z) {
                num = Integer.valueOf(r152.A00);
                num3 = Integer.valueOf(r152.A02);
                num4 = Integer.valueOf(r152.A03);
            }
        }
        return C52509GVm.A00(num, num2, num3, num4, str9, str5, str6, str7, str8, str4, str3, Ack, Acm);
    }

    public final C52510GVn A01(AnonymousClass6LO r8, AnonymousClass6L7 r9, String str, String str2, boolean z) {
        String str3 = str;
        0qQ.A0B(str, 1);
        AnonymousClass6L7 r2 = r9;
        String str4 = ((C52507GVk) r2).A05;
        if (str4 == null) {
            str4 = "";
        }
        return A00(r8, r2, str3, str2, str4, z);
    }
}
