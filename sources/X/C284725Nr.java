package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.5Nr  reason: invalid class name and case insensitive filesystem */
public final class C284725Nr extends C263934Nx {
    public final void A00(C58840Ae r7) {
        0qQ.A0B(r7, 0);
        0wc r72 = (0wc) r7;
        0Aj A00 = r72.A00(r72.A00, "video_fetched");
        if (A00.isSampled()) {
            AnonymousClass4O3 r2 = this.A06;
            boolean z = false;
            Long l = null;
            if (r2 != null) {
                Integer num = r2.A0Y;
                if (num != null) {
                    A00.A9F("seq_num", Long.valueOf((long) num.intValue()));
                    String str = r2.A10;
                    if (str == null) {
                        str = "0";
                    }
                    A00.AAJ("m_pk", str);
                    C263944Ny r1 = r2.A00;
                    if (r1 == null) {
                        r1 = new C263944Ny(0L);
                    }
                    A00.AAE(r1, "a_pk");
                    A00.AAJ("a_i", r2.A1I);
                    Boolean bool = r2.A06;
                    if (bool != null) {
                        A00.A7p("cached", bool);
                        String str2 = r2.A0v;
                        if (str2 != null) {
                            A00.AAJ("follow_status", str2);
                            Integer num2 = r2.A0T;
                            if (num2 != null) {
                                l = Long.valueOf((long) num2.intValue());
                            }
                            A00.A9F("is_dash_eligible", l);
                            A00.A7p("is_video_to_carousel", r2.A09);
                            A00.A9F("m_ts", r2.A0f);
                            A00.AAJ("playback_format", r2.A16);
                            A00.AAJ("tracking_token", r2.A1H);
                            A00.AAJ("video_codec", r2.A1K);
                            A00.AAJ("video_type", r2.A1L);
                            A00.AAJ("mezql_token", r2.A11);
                            A00.AAJ("ranking_info_token", r2.A1A);
                            A00.AAJ("parent_m_pk", r2.A15);
                            z = true;
                        } else {
                            throw new IllegalStateException("followStatus should not be null.");
                        }
                    } else {
                        throw new IllegalStateException("cached should not be null.");
                    }
                } else {
                    throw new IllegalStateException("seqNum should not be null.");
                }
            }
            AnonymousClass4OC r4 = this.A07;
            if (r4 != null) {
                if (z) {
                    A00.AAJ("subtype", r4.A0Z);
                    A00.AAJ("position", r4.A0V);
                    A00.AAJ("size", r4.A0W);
                    A00.A9F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r4.A0P);
                }
                0bb r22 = new 0bb();
                r22.A03("captions_available", r4.A04);
                r22.A03("captions_displayed", r4.A05);
                if (z) {
                    A00.AAK(r22, "adhoc_data");
                } else {
                    return;
                }
            } else if (!z) {
                return;
            }
            A00.Cgf();
        }
    }
}
