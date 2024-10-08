package X;

/* renamed from: X.5xa  reason: invalid class name and case insensitive filesystem */
public final class C300665xa extends C263934Nx {
    public final void A00(C58840Ae r6) {
        boolean z;
        String str;
        long j;
        Double d;
        Double d2;
        Long l;
        Long l2;
        Long l3;
        0qQ.A0B(r6, 0);
        0wc r62 = (0wc) r6;
        0Aj A00 = r62.A00(r62.A00, "instagram_video_viewability_changed");
        if (A00.isSampled()) {
            AnonymousClass4O3 r2 = this.A06;
            Long l4 = null;
            if (r2 != null) {
                C263944Ny r0 = r2.A00;
                if (r0 == null || (l3 = r0.A00) == null) {
                    j = 0;
                } else {
                    j = l3.longValue();
                }
                A00.A9F("a_pk", Long.valueOf(j));
                Integer num = r2.A0d;
                if (num != null) {
                    A00.A9F("current_viewability_percentage", Long.valueOf((long) num.intValue()));
                    String str2 = r2.A10;
                    if (str2 != null) {
                        A00.AAJ("m_pk", str2);
                        A00.AAJ("a_i", r2.A1I);
                        A00.AAJ("nav_chain", r2.A13);
                        Float f = r2.A0H;
                        if (f != null) {
                            d = Double.valueOf((double) f.floatValue());
                        } else {
                            d = null;
                        }
                        A00.A8D("time", d);
                        Float f2 = r2.A0H;
                        if (f2 != null) {
                            d2 = Double.valueOf((double) f2.floatValue());
                        } else {
                            d2 = null;
                        }
                        A00.A8D("video_time_position", d2);
                        A00.AAJ("tracking_token", r2.A1H);
                        A00.AAJ("application_state", (String) null);
                        A00.A9F("dr_ad_type", (Long) null);
                        A00.AAJ("feed_request_id", (String) null);
                        A00.AAJ("follow_status", r2.A0v);
                        A00.AAJ("gating_type", (String) null);
                        A00.AAJ("inventory_source", r2.A0y);
                        Integer num2 = r2.A0T;
                        if (num2 != null) {
                            l = Long.valueOf((long) num2.intValue());
                        } else {
                            l = null;
                        }
                        A00.A9F("is_dash_eligible", l);
                        Integer num3 = r2.A0S;
                        if (num3 != null) {
                            l2 = Long.valueOf((long) num3.intValue());
                        } else {
                            l2 = null;
                        }
                        A00.A9F("m_ix", l2);
                        A00.A9F("m_t", (Long) null);
                        A00.A9F("m_ts", r2.A0f);
                        A00.AAJ("playback_format", r2.A16);
                        A00.AAJ(MYP.A01(209, 10, 101), (String) null);
                        z = true;
                    } else {
                        throw new IllegalStateException("mediaId should not be null.");
                    }
                } else {
                    throw new IllegalStateException("viewability should not be null.");
                }
            } else {
                z = false;
            }
            AnonymousClass4OC r02 = this.A07;
            if (r02 != null && z) {
                Integer num4 = r02.A0J;
                if (num4 != null) {
                    l4 = Long.valueOf((long) num4.intValue());
                }
                A00.A9F("number_of_qualities", l4);
            }
            AnonymousClass4O3 r03 = this.A06;
            if (r03 == null || (str = r03.A0x) == null) {
                if (!z) {
                    return;
                }
            } else if (z) {
                A00.A9F("host_profile_id", 00y.A0n(10, str));
            } else {
                return;
            }
            A00.Cgf();
        }
    }
}
