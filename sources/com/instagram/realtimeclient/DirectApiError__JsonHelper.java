package com.instagram.realtimeclient;

import X.16F;
import X.16L;
import X.16P;
import X.AnonymousClass000;
import X.AnonymousClass1FD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class DirectApiError__JsonHelper {
    public static DirectApiError parseFromJson(16F r1) {
        return (DirectApiError) 16P.A01(r1, new AnonymousClass1FD() {
            public DirectApiError invoke(16F r2) {
                return DirectApiError__JsonHelper.unsafeParseFromJson(r2);
            }
        });
    }

    public static boolean processSingleField(DirectApiError directApiError, String str, 16F r4) {
        if (AnonymousClass000.A00(3069).equals(str)) {
            directApiError.errorType = AnonymousClass7TG.A0l(r4);
            return true;
        } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(str)) {
            directApiError.errorDescription = AnonymousClass7TG.A0l(r4);
            return true;
        } else if (!C41845B3m.A1E(str)) {
            return false;
        } else {
            directApiError.errorTitle = AnonymousClass7TG.A0l(r4);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, com.instagram.realtimeclient.DirectApiError] */
    public static DirectApiError unsafeParseFromJson(16F r3) {
        ? obj = new Object();
        if (r3.A11() != 16L.A0D) {
            r3.A0z();
            return null;
        }
        while (r3.A1J() != 16L.A09) {
            processSingleField(obj, AnonymousClass7TE.A17(r3), r3);
            r3.A0z();
        }
        return obj;
    }

    public static DirectApiError parseFromJson(String str) {
        return parseFromJson(16P.A00(str));
    }
}
