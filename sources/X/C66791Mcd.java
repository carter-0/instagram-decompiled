package X;

import java.util.Map;

/* renamed from: X.Mcd  reason: case insensitive filesystem */
public final class C66791Mcd implements C250603lj {
    public final AnonymousClass7LH A00;

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        long j;
        String str;
        String str2;
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        AnonymousClass7LH r4 = this.A00;
        Object obj = r14.A03;
        AnonymousClass7LQ r3 = (AnonymousClass7LQ) obj;
        C254703su r7 = r3.A0e;
        String A0g = r7.A0g();
        01r r5 = r4.A00;
        String str3 = A0g;
        if (A0g == null) {
            str3 = "";
        }
        C66853Mdm mdm = (C66853Mdm) r5.get(str3);
        if (mdm == null) {
            mdm = new C66853Mdm();
            if (A0g == null) {
                A0g = "";
            }
            r5.put(A0g, mdm);
        }
        int intValue = r15.CEk(r14).intValue();
        if (intValue == 0 || intValue == 1) {
            float CFe = r15.CFe(r14);
            long j2 = mdm.A00;
            if (j2 < 0 && CFe >= 0.5f) {
                j = r15.BlK();
            } else if (j2 >= 0 && CFe < 0.5f) {
                long BlK = r15.BlK() - j2;
                mdm.A02 += BlK;
                long j3 = mdm.A01;
                if (j3 < BlK) {
                    j3 = BlK;
                }
                mdm.A01 = j3;
                j = -1;
            } else {
                return;
            }
            mdm.A00 = j;
            return;
        }
        long BlK2 = r15.BlK();
        long j4 = mdm.A00;
        if (j4 >= 0) {
            long j5 = BlK2 - j4;
            mdm.A02 += j5;
            long j6 = mdm.A01;
            if (j6 < j5) {
                j6 = j5;
            }
            mdm.A01 = j6;
            mdm.A00 = -1;
        }
        0qQ.A06(obj);
        int i = r3.A0G.A08;
        if (mdm.A02 >= 250) {
            Map map = r4.A01;
            AnonymousClass7LK r0 = (AnonymousClass7LK) map.get(Integer.valueOf(i));
            if (r0 != null && ((Boolean) r0.A01.getValue()).booleanValue()) {
                AnonymousClass7LK r02 = (AnonymousClass7LK) map.get(Integer.valueOf(r3.A0G.A08));
                if (r02 != null) {
                    0wc r42 = r02.A00.A00;
                    0Aj A002 = r42.A00(r42.A00, "igd_channels_message_impressions");
                    if (A002.isSampled()) {
                        AnonymousClass7SD r03 = r3.A0G;
                        int i2 = r03.A08;
                        int i3 = r03.A01;
                        if (i2 == 28) {
                            str = "subscriber_social";
                        } else if (i2 != 29) {
                            if (i2 == 32 || i2 == 62) {
                                str = "social";
                            } else {
                                throw new Exception("Unsupported thread subtype");
                            }
                        } else if (i3 == 2) {
                            str = "subscriber_broadcast";
                        } else {
                            str = "broadcast";
                        }
                        A002.AAJ("channel_type", str);
                        A002.AAJ("action", "vpvd_impression");
                        A002.AAJ("event", "message_viewed");
                        C254793t3 r04 = r3.A0G.A0P;
                        if (r04 != null) {
                            str2 = C300965yF.A07(r04);
                        } else {
                            str2 = null;
                        }
                        A002.AAJ("ig_thread_id", str2);
                        A002.AAJ("item_id", r7.A0g());
                        A002.AAJ("client_context_id", r7.A0f());
                        A002.Cgf();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        mdm.A01 = 0;
        mdm.A02 = 0;
    }

    public C66791Mcd(AnonymousClass7LH r1) {
        this.A00 = r1;
    }
}
