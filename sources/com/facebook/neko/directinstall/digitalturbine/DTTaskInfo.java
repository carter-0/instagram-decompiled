package com.facebook.neko.directinstall.digitalturbine;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16705V2i;
import X.C20499Wsf;
import X.C255463uA;
import X.C41845B3m;
import X.C51975G9x;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class DTTaskInfo extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final DTApplication A01;
    public final Double A02;
    public final String A03;
    public final String A04;

    public final class Companion {
        public final C255463uA serializer() {
            return C20499Wsf.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DTTaskInfo) {
                DTTaskInfo dTTaskInfo = (DTTaskInfo) obj;
                if (!0qQ.A0K(this.A04, dTTaskInfo.A04) || this.A00 != dTTaskInfo.A00 || !0qQ.A0K(this.A01, dTTaskInfo.A01) || !0qQ.A0K(this.A02, dTTaskInfo.A02) || !0qQ.A0K(this.A03, dTTaskInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DTTaskInfo(DTApplication dTApplication, Double d, String str, String str2, int i, int i2) {
        if (3 != (i & 3)) {
            VJ6.A00(C20499Wsf.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A04 = str;
        this.A00 = i2;
        if ((i & 4) != 0) {
            this.A01 = dTApplication;
        }
        if ((i & 8) != 0) {
            this.A02 = d;
        }
        if ((i & 16) != 0) {
            this.A03 = str2;
        }
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0O(this.A04) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DTTaskInfo(taskId=");
        sb.append(this.A04);
        sb.append(", status=");
        sb.append(this.A00);
        sb.append(", application=");
        sb.append(this.A01);
        sb.append(", progressValue=");
        sb.append(this.A02);
        sb.append(", partnerMetadata=");
        return C51975G9x.A0i(this.A03, sb);
    }
}
