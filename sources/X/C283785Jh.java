package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.quickpromotion.intf.Trigger;
import java.io.IOException;

/* renamed from: X.5Jh  reason: invalid class name and case insensitive filesystem */
public abstract class C283785Jh {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.5Ji, java.lang.Object] */
    public static C283795Ji parseFromJson(16F r3) {
        Long l;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("node".equals(A0q)) {
                    obj.A02 = C283825Jl.parseFromJson(r3);
                } else if ("time_range".equals(A0q)) {
                    obj.A01 = C283805Jj.parseFromJson(r3);
                } else if ("is_holdout".equals(A0q)) {
                    obj.A04 = r3.A0d();
                } else if ("priority".equals(A0q)) {
                    obj.A00 = r3.A1D();
                } else if ("client_ttl_seconds".equals(A0q)) {
                    if (r3.A11() == 16L.A0I) {
                        l = Long.valueOf(r3.A0y());
                    } else {
                        l = null;
                    }
                    obj.A03 = l;
                } else if ("log_eligibility_waterfall".equals(A0q)) {
                    obj.A05 = r3.A0d();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, C283795Ji r5) {
        r4.A0c();
        if (r5.A02 != null) {
            r4.A0q("node");
            AnonymousClass5Jm r2 = r5.A02;
            r4.A0c();
            String str = r2.A05;
            if (str != null) {
                r4.A0R("promotion_id", str);
            }
            String str2 = r2.A03;
            if (str2 != null) {
                r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
            }
            String str3 = r2.A04;
            if (str3 != null) {
                r4.A0R("logging_data", str3);
            }
            Integer num = r2.A02;
            if (num != null) {
                r4.A0P("max_impressions", num.intValue());
            }
            if (r2.A07 != null) {
                16P.A03(r4, "triggers");
                for (Trigger trigger : r2.A07) {
                    if (trigger != null) {
                        r4.A0t(trigger.A01);
                    }
                }
                r4.A0Y();
            }
            r4.A0S("is_uncancelable", r2.A0B);
            if (r2.A06 != null) {
                16P.A03(r4, "creatives");
                for (AnonymousClass4V7 r0 : r2.A06) {
                    if (r0 != null) {
                        AnonymousClass4VC.A00(r4, r0);
                    }
                }
                r4.A0Y();
            }
            if (r2.A00 != null) {
                r4.A0q("contextual_filters");
                AnonymousClass4VJ.A00(r4, r2.A00);
            }
            r4.A0q("template");
            AnonymousClass4VH.A00(r4, r2.A01);
            r4.A0S("is_server_force_pass", r2.A0A);
            r4.A0S("client_side_dry_run", r2.A08);
            r4.A0S("disable_logging_to_qp_tables", r2.A09);
            r4.A0S("bypass_surface_delay", r2.A0C);
            r4.A0Z();
        }
        if (r5.A01 != null) {
            r4.A0q("time_range");
            C283815Jk r3 = r5.A01;
            r4.A0c();
            Long l = r3.A01;
            if (l != null) {
                r4.A0Q("start", l.longValue());
            }
            Long l2 = r3.A00;
            if (l2 != null) {
                r4.A0Q("end", l2.longValue());
            }
            r4.A0Z();
        }
        r4.A0S("is_holdout", r5.A04);
        r4.A0P("priority", r5.A00);
        Long l3 = r5.A03;
        if (l3 != null) {
            r4.A0Q("client_ttl_seconds", l3.longValue());
        }
        r4.A0S("log_eligibility_waterfall", r5.A05);
        r4.A0Z();
    }
}
