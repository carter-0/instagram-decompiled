package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.Lqk  reason: case insensitive filesystem */
public final class C65291Lqk implements MXS {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final DirectShareTarget A03;
    public final C381779cJ A04;
    public final IngestSessionShim A05;
    public final MSM A06;

    public final int BtD() {
        return 3;
    }

    public final boolean CKn(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 0);
        return 0qQ.A0K(this.A03, directShareTarget);
    }

    public final List AxF() {
        return AnonymousClass7TE.A1I(this.A03);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.Lqf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.Lqg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.Lqf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.Lqf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EM2() {
        /*
            r15 = this;
            com.instagram.model.direct.DirectShareTarget r11 = r15.A03
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = r15.A05
            java.util.List r0 = r0.A00
            java.util.Iterator r6 = r0.iterator()
        L_0x000a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00de
            java.lang.String r13 = X.AnonymousClass7TE.A18(r6)
            X.3t2 r0 = r11.A01()
            boolean r0 = r0 instanceof X.AnonymousClass9HR
            com.instagram.common.session.UserSession r10 = r15.A02
            if (r0 == 0) goto L_0x0039
            X.3Q2 r5 = X.JTQ.A0M(r10, r13)
            if (r5 != 0) goto L_0x0089
            r0 = 231(0xe7, float:3.24E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = X.002.A0R(r0, r13)
            r1 = 1
            r0 = 909(0x38d, float:1.274E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A04(r0, r3, r1)
            goto L_0x000a
        L_0x0039:
            X.3Q2 r0 = X.JTQ.A0M(r10, r13)
            if (r0 != 0) goto L_0x0076
            r0 = 231(0xe7, float:3.24E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = X.002.A0R(r0, r13)
            r1 = 1
            r0 = 909(0x38d, float:1.274E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A04(r0, r3, r1)
            X.3t2 r0 = r11.A01()
            boolean r0 = r0 instanceof X.C254763t0
            if (r0 == 0) goto L_0x000a
            X.3t2 r0 = r11.A01()
            X.3sy r0 = X.AnonymousClass6W3.A06(r0)
            com.instagram.model.direct.DirectThreadKey r4 = X.C66647MaG.A03(r0)
            java.lang.String r3 = "unknown_media"
            long r0 = X.AnonymousClass0HN.A00()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            X.C3265677h.A0i(r10, r4, r3, r1, r0)
            goto L_0x000a
        L_0x0076:
            X.JcS r4 = X.JTS.A0P(r10)
            android.content.Context r8 = r15.A00
            X.0qQ.A06(r8)
            X.9cJ r12 = r15.A04
            X.0iw r9 = r15.A01
            X.Lqg r7 = new X.Lqg
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x00a5
        L_0x0089:
            boolean r0 = r5.A0y()
            if (r0 == 0) goto L_0x00aa
            X.JcS r4 = X.JTS.A0P(r10)
            android.content.Context r3 = r15.A00
            X.0qQ.A06(r3)
            java.lang.String r1 = r5.A35
            X.9cJ r0 = r15.A04
            X.Lqf r7 = new X.Lqf
            r8 = r7
            r9 = r3
            r12 = r0
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00a5:
            r4.A01(r7)
            goto L_0x000a
        L_0x00aa:
            boolean r0 = r5.A12()
            if (r0 == 0) goto L_0x00c2
            X.AGu r8 = X.C39622A2m.A02
            android.content.Context r9 = r15.A00
            X.0qQ.A06(r9)
            X.9cJ r0 = r15.A04
            java.lang.String r14 = "DirectVisualMessageSendJob_sendMessageMsys"
            r12 = r0
            r13 = r5
            r8.A02(r9, r10, r11, r12, r13, r14)
            goto L_0x000a
        L_0x00c2:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported Media Type for PendingMediaKey "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " when sending Visual Message: "
            r1.append(r0)
            X.1iA r0 = r5.A1G
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00de:
            X.MSM r0 = r15.A06
            r0.DuY()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65291Lqk.EM2():void");
    }

    public C65291Lqk(Context context, AnonymousClass0iw r3, UserSession userSession, IngestSessionShim ingestSessionShim, MSM msm, DirectShareTarget directShareTarget, C381779cJ r8) {
        C51974G9v.A1L(context, userSession, directShareTarget);
        this.A02 = userSession;
        this.A05 = ingestSessionShim;
        this.A03 = directShareTarget;
        this.A06 = msm;
        this.A04 = r8;
        this.A01 = r3;
        this.A00 = context.getApplicationContext();
    }
}
