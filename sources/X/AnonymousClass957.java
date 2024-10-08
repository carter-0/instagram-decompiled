package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Arrays;

/* renamed from: X.957  reason: invalid class name */
public final class AnonymousClass957 implements 2IR {
    public final SettableFuture A00;
    public final C62320sa A01;
    public final 0sP A02;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        String message = th.getMessage();
        if (message == null) {
            message = AnonymousClass000.A00(953);
        }
        this.A00.set(message);
        0sP r0 = this.A02;
        if (r0 != null) {
            r0.invoke(message);
        }
    }

    /* renamed from: A00 */
    public final void onSuccess(AnonymousClass3JD r6) {
        C250663lr r4;
        String str;
        C250663lr r42;
        if (r6 == null || (r42 = (C250663lr) r6.Bny()) == null) {
            r4 = null;
        } else {
            r4 = r42.getOptionalTreeField(0, "xfb_post_dcp_features_upload(data:{\"data\":{\"examples\":$examples,\"flow\":$flow,\"use_case\":$use_case,\"use_case_version\":$use_case_version}})", C293745lH.class, -1243246760);
        }
        if (r4 == null || !r4.hasFieldValue("is_success") || !r4.getCoercedBooleanField(1, "is_success")) {
            String A002 = AnonymousClass000.A00(2492);
            if (r4 == null || (str = r4.getOptionalStringField(0, "error_message")) == null) {
                str = AnonymousClass000.A00(1049);
            }
            String format = String.format("%s%s", Arrays.copyOf(new Object[]{A002, str}, 2));
            0qQ.A07(format);
            this.A00.set(format);
            0sP r0 = this.A02;
            if (r0 != null) {
                r0.invoke(format);
                return;
            }
            return;
        }
        this.A00.set("SUCCESS");
        C62320sa r02 = this.A01;
        if (r02 != null) {
            r02.invoke();
        }
    }

    public AnonymousClass957(SettableFuture settableFuture, C62320sa r2, 0sP r3) {
        this.A00 = settableFuture;
        this.A01 = r2;
        this.A02 = r3;
    }
}
