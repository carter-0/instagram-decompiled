package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Cp  reason: invalid class name and case insensitive filesystem */
public final class C282315Cp implements 2Ag {
    public final UserSession A00;
    public final 2Dm A01;
    public final List A02;

    private void A01(DirectThreadKey directThreadKey, String str, boolean z, boolean z2) {
        AnonymousClass3U9 A03;
        DirectShareTarget directShareTarget = null;
        if (!(directThreadKey == null || (A03 = 2Dr.A03(this.A01, directThreadKey)) == null)) {
            ArrayList A012 = AnonymousClass48M.A01(A03.BRZ());
            directShareTarget = new DirectShareTarget(C66662MaV.A00(A03.C6C(), A012), A03.C6f(), A012, A03.CQ2());
        }
        for (1ar A002 : this.A02) {
            A002.A00(this.A00, directShareTarget, str, z, z2);
        }
    }

    public final void D0Y(1OS r1) {
    }

    public final void D9f(1OS r1, String str, boolean z) {
    }

    public final /* synthetic */ void D9g(1OS r1, boolean z) {
    }

    public final void DB7(1OS r1) {
    }

    public final void DTK(0xF r1, 1OS r2, boolean z) {
    }

    public final void DTL(0xF r1, 1OS r2, C270214gN r3, boolean z) {
    }

    public final /* synthetic */ void DYZ(String str, String str2, String str3) {
    }

    public final /* synthetic */ void DYd(1OS r1, String str, String str2) {
    }

    public final void Dfi(1OS r1, String str, boolean z) {
    }

    public C282315Cp(UserSession userSession, 2Dm r2, List list) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r6.A08 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.1OS r6) {
        /*
            r5 = this;
            java.lang.String r1 = r6.A02()
            int r0 = r1.hashCode()
            r3 = 0
            switch(r0) {
                case -1607135103: goto L_0x006b;
                case 296381094: goto L_0x0057;
                case 413267943: goto L_0x0039;
                case 1870272601: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return
        L_0x000d:
            java.lang.String r0 = "send_reel_share_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            X.1cr r6 = (X.C65481cr) r6
            java.util.List r0 = r6.C6L()
            java.lang.Object r4 = r0.get(r3)
            com.instagram.model.direct.DirectThreadKey r4 = (com.instagram.model.direct.DirectThreadKey) r4
            java.lang.String r3 = r6.A0C
            java.lang.String r0 = r6.A0H
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = r6.A08
            r2 = 0
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r6.A02
            boolean r0 = r1.equals(r0)
            r5.A01(r4, r3, r2, r0)
            return
        L_0x0039:
            r0 = 3956(0xf74, float:5.544E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            X.1dD r6 = (X.AnonymousClass1dD) r6
            java.util.List r0 = r6.C6L()
            java.lang.Object r1 = r0.get(r3)
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            java.lang.String r0 = r6.A02
            r5.A01(r1, r0, r3, r3)
            return
        L_0x0057:
            java.lang.String r0 = "send_story_share_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            X.1dI r6 = (X.1dI) r6
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x000c
            r1 = 0
            r0 = 1
            r5.A01(r1, r1, r3, r0)
            return
        L_0x006b:
            java.lang.String r0 = "configure_visual_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            boolean r0 = r6 instanceof X.AnonymousClass1fu
            if (r0 == 0) goto L_0x000c
            X.1fu r6 = (X.AnonymousClass1fu) r6
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "story_remix_reply"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "story_selfie_reply"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000c
        L_0x008b:
            java.util.List r0 = r6.C6L()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x000c
            java.util.List r0 = r6.C6L()
            java.lang.Object r2 = r0.get(r3)
            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2
            r1 = 1
            java.lang.String r0 = "reel"
            r5.A01(r2, r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282315Cp.A00(X.1OS):void");
    }

    public final void D5W(1OS r1) {
        A00(r1);
    }

    public final void DTP(0xF r1, 1OS r2) {
        A00(r2);
    }
}
