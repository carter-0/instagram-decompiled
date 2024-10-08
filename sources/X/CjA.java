package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

public abstract class CjA {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.BIM] */
    public static BIM parseFromJson(16F r12) {
        String A00;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (true) {
                16L A1J = r12.A1J();
                16L r7 = 16L.A09;
                A00 = C273654mx.A00(3288);
                if (A1J == r7) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r12);
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("primary_context_line".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (!A00.equals(A17)) {
                    num = C41847B3o.A13(r12, num, A17, "thread_subtype");
                } else if (r12.A11() == 16L.A0G) {
                    str3 = null;
                } else {
                    str3 = r12.A1P();
                }
                r12.A0z();
            }
            if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r12, "DirectChannelsSecondaryContextLines");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("primary_context_line", r12, "DirectChannelsSecondaryContextLines");
            } else if (str3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r12, "DirectChannelsSecondaryContextLines");
            } else if (num != null || !(r12 instanceof 0c9)) {
                int intValue = num.intValue();
                AnonymousClass7TG.A1U(str, str2, str3);
                ? obj = new Object();
                obj.A03 = str;
                obj.A01 = str2;
                obj.A02 = str3;
                obj.A00 = intValue;
                return obj;
            } else {
                AnonymousClass7TF.A1L("thread_subtype", r12, "DirectChannelsSecondaryContextLines");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
