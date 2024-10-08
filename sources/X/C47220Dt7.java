package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.XFBYPRequestStatus;

/* renamed from: X.Dt7  reason: case insensitive filesystem */
public final class C47220Dt7 extends AnonymousClass0T0 implements C267504bf {
    public final XFBYPRequestStatus A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final C47220Dt7 FCt() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47220Dt7) {
                C47220Dt7 dt7 = (C47220Dt7) obj;
                if (!0qQ.A0K(this.A02, dt7.A02) || !0qQ.A0K(this.A01, dt7.A01) || !0qQ.A0K(this.A03, dt7.A03) || this.A00 != dt7.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String Ava() {
        return this.A02;
    }

    public final Integer B9k() {
        return this.A01;
    }

    public final XFBYPRequestStatus BzL() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTimeLimitExtensionRequestData", C48359EdG.A00(this));
    }

    public final String getId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C47220Dt7(XFBYPRequestStatus xFBYPRequestStatus, Integer num, String str, String str2) {
        this.A02 = str;
        this.A01 = num;
        this.A03 = str2;
        this.A00 = xFBYPRequestStatus;
    }
}
