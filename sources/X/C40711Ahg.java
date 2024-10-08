package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ahg  reason: case insensitive filesystem */
public final class C40711Ahg implements B38 {
    public Boolean A00;
    public String A01;
    public String A02;
    public final C312446eR A03;
    public final List A04 = AnonymousClass7TE.A1C();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CMw(X.C371698yt r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x0032
            X.6eR r1 = r3.A03
            X.6eR r0 = X.C312446eR.HairSegmentationDataProvider
            if (r1 != r0) goto L_0x0032
            X.8yi r1 = X.C380939al.A03
            boolean r0 = X.C371698yt.A01(r4, r1)
            if (r0 == 0) goto L_0x0032
            X.8yh r1 = r4.A02(r1)
        L_0x0015:
            X.9al r1 = (X.C380939al) r1
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = r1.A00
        L_0x001b:
            r3.A01 = r0
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = r1.A01
        L_0x0021:
            r3.A02 = r0
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.A02
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x002b:
            r3.A00 = r2
            return
        L_0x002e:
            r0 = r2
            goto L_0x0021
        L_0x0030:
            r0 = r2
            goto L_0x001b
        L_0x0032:
            r1 = r2
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40711Ahg.CMw(X.8yt):void");
    }

    public final void FKT(Bundle bundle) {
    }

    public final Bundle BH4() {
        return Q21.A00(AnonymousClass7TH.A0h("isFullyAsync", this.A00, AnonymousClass7TF.A0x("serviceType", 34), AnonymousClass7TE.A1L("initNetPath", this.A01), AnonymousClass7TE.A1L("predictNetPath", this.A02)));
    }

    public final List EzR() {
        List list = this.A04;
        ArrayList A0U = 00k.A0U(list);
        list.clear();
        return A0U;
    }

    public C40711Ahg(C312446eR r2) {
        this.A03 = r2;
    }
}
