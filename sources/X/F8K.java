package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

public abstract class F8K {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.FFp, java.lang.Object] */
    public static C49936FFp parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("module_name".equals(A17)) {
                    obj.A09 = AnonymousClass7TG.A0l(r3);
                } else if ("click_point".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("interop_user_type".equals(A17)) {
                    obj.A00 = r3.A1D();
                } else if ("follow_status_name".equals(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r3);
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                    obj.A0B = AnonymousClass7TG.A0l(r3);
                } else if ("is_thread_pending".equals(A17)) {
                    obj.A04 = AnonymousClass7TF.A0S(r3);
                } else if ("is_thread_group".equals(A17)) {
                    obj.A03 = AnonymousClass7TF.A0S(r3);
                } else if ("block_flow_entry_point_name".equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("block_flow_surface_name".equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                } else if (TraceFieldType.RequestID.equals(A17)) {
                    obj.A0A = AnonymousClass7TG.A0l(r3);
                } else if ("direct_source".equals(A17)) {
                    obj.A01 = C3263576k.valueOf(r3.A1P());
                } else if ("direct_source_type".equals(A17)) {
                    obj.A02 = C69445Nlp.valueOf(r3.A1P());
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C49936FFp fFp) {
        r2.A0c();
        String str = fFp.A09;
        if (str != null) {
            r2.A0R("module_name", str);
        }
        String str2 = fFp.A07;
        if (str2 != null) {
            r2.A0R("click_point", str2);
        }
        r2.A0P("interop_user_type", fFp.A00);
        String str3 = fFp.A08;
        if (str3 != null) {
            r2.A0R("follow_status_name", str3);
        }
        String str4 = fFp.A0B;
        if (str4 != null) {
            r2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
        }
        Boolean bool = fFp.A04;
        if (bool != null) {
            r2.A0S("is_thread_pending", bool.booleanValue());
        }
        Boolean bool2 = fFp.A03;
        if (bool2 != null) {
            r2.A0S("is_thread_group", bool2.booleanValue());
        }
        String str5 = fFp.A05;
        if (str5 != null) {
            r2.A0R("block_flow_entry_point_name", str5);
        }
        String str6 = fFp.A06;
        if (str6 != null) {
            r2.A0R("block_flow_surface_name", str6);
        }
        String str7 = fFp.A0A;
        if (str7 != null) {
            r2.A0R(TraceFieldType.RequestID, str7);
        }
        C3263576k r0 = fFp.A01;
        if (r0 != null) {
            r2.A0R("direct_source", r0.toString());
        }
        C69445Nlp nlp = fFp.A02;
        if (nlp != null) {
            r2.A0R("direct_source_type", nlp.toString());
        }
        r2.A0Z();
    }
}
