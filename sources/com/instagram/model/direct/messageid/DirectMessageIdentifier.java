package com.instagram.model.direct.messageid;

import X.0qQ;
import X.2FW;
import java.util.Arrays;
import kotlin.Deprecated;

public final class DirectMessageIdentifier extends MessageIdentifier {
    public String A00;
    public final 2FW A01;
    public final String A02;

    public final DirectMessageIdentifier A01(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        if (A02(directMessageIdentifier)) {
            String str = this.A02;
            if (str == null) {
                str = directMessageIdentifier.A02;
            }
            String str2 = this.A00;
            if (str2 == null) {
                str2 = directMessageIdentifier.A00;
            }
            2FW r1 = this.A01;
            if (r1 == null) {
                r1 = directMessageIdentifier.A01;
            }
            return new DirectMessageIdentifier(r1, str, str2);
        }
        throw new IllegalStateException("Check failed.");
    }

    @Deprecated(message = "This method checks for strict equality. Use [DirectMessageIdentifier#identifySameMessage] to see if two identifiers refer to the same  message.")
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            DirectMessageIdentifier directMessageIdentifier = (DirectMessageIdentifier) obj;
            if (!0qQ.A0K(this.A02, directMessageIdentifier.A02) || !0qQ.A0K(this.A00, directMessageIdentifier.A00) || this.A01 != directMessageIdentifier.A01) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DirectMessageIdentifier(X.2FW r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x000f
            if (r5 == 0) goto L_0x0011
            r0 = r5
        L_0x0005:
            r2.<init>(r0, r5)
            r2.A02 = r4
            r2.A00 = r5
            r2.A01 = r3
            return
        L_0x000f:
            r0 = r4
            goto L_0x0005
        L_0x0011:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.messageid.DirectMessageIdentifier.<init>(X.2FW, java.lang.String, java.lang.String):void");
    }

    public final boolean A02(DirectMessageIdentifier directMessageIdentifier) {
        if (directMessageIdentifier == null) {
            return false;
        }
        String str = this.A02;
        String str2 = this.A00;
        String str3 = directMessageIdentifier.A02;
        String str4 = directMessageIdentifier.A00;
        if (str != null && str.equals(str3)) {
            return true;
        }
        if (str2 == null || !str2.equals(str4)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01});
    }
}
