package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9dl  reason: invalid class name and case insensitive filesystem */
public final class C382479dl extends C340157kn {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.7km] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.7kr, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C382479dl(com.instagram.common.session.UserSession r11) {
        /*
            r10 = this;
            r0 = 1
            X.7kp r4 = X.C340177kp.HIGH
            X.AUr r6 = new X.AUr
            r6.<init>()
            X.7kr r3 = new X.7kr
            r3.<init>()
            r7 = 0
            r2 = r10
            r5 = r4
            r8 = r7
            r9 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A00 = r11
            X.7ks r1 = X.C340167ko.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C382479dl.<init>(com.instagram.common.session.UserSession):void");
    }

    public final Object AXG(C340207ks r7) {
        UserSession userSession;
        0qQ.A0B(r7, 0);
        int i = r7.A00;
        if (i == 10) {
            userSession = this.A00;
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A05, userSession, 36313153918732079L)) {
                return false;
            }
        } else if (i != 31) {
            return super.AXG(r7);
        } else {
            userSession = this.A00;
        }
        Boolean A0R = AnonymousClass7TF.A0R(0Tu.A05, userSession, 36327993030818652L);
        0qQ.A0C(A0R, "null cannot be cast to non-null type T of com.instagram.rtc.rsys.impl.IgCameraProxyProvider.CustomRuntimeParameters.get");
        return A0R;
    }
}
