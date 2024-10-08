package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class P37 implements AnonymousClass7IA {
    public final /* synthetic */ C67496Moq A00;

    public final void Dj8(MessageIdentifier messageIdentifier, List list) {
    }

    public final void DjA(C53401GnY gnY, Long l, List list) {
    }

    public final void Dxz(C53401GnY gnY, C381779cJ r23, ClipInfo clipInfo, Long l, String str, int i, boolean z) {
        C333547Zj r7;
        ClipInfo clipInfo2 = clipInfo;
        0qQ.A0B(clipInfo2, 0);
        C67496Moq moq = this.A00;
        C67498Mos.A00(moq.A0A, "bulk_reply_send", "message_clip");
        Iterator A0u = AnonymousClass7TF.A0u(moq.A04);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (A1J.getKey() instanceof MsysThreadId) {
                r7 = moq.A0C;
            } else {
                r7 = moq.A0B;
            }
            C71810OrC.A00(r7.EMz((AnonymousClass9JH) null, gnY, (C254933tI) null, (OCA) null, (C254743sy) A1J.getKey(), clipInfo2, str, "from_bulk_reply", (String) null, (String) null, (String) null, (List) null, ((C66754Mbz) A1J.getValue()).A09), new C73933PmD(moq, 0), C73445Pcn.A00, 3);
        }
    }

    public P37(C67496Moq moq) {
        this.A00 = moq;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CbZ(int r8) {
        /*
            r7 = this;
            X.Moq r6 = r7.A00
            java.util.Map r1 = r6.A04
            boolean r0 = r1.isEmpty()
            r5 = 1
            if (r0 != 0) goto L_0x003b
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r1)
        L_0x000f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003b
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            X.Mbz r2 = (X.C66754Mbz) r2
            com.instagram.common.session.UserSession r1 = r6.A06
            int r0 = r2.A01
            boolean r0 = X.AnonymousClass7LY.A01(r1, r0)
            if (r0 == 0) goto L_0x003a
            boolean r0 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 != 0) goto L_0x003a
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x003a
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x003a
            goto L_0x000f
        L_0x003a:
            r5 = 0
        L_0x003b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P37.CbZ(int):boolean");
    }

    public final void DX3(C53401GnY gnY, C381779cJ r22, AnonymousClass3Q2 r23, C352218Cl r24, Long l, int i, boolean z) {
        C333547Zj r6;
        C67496Moq moq = this.A00;
        C67498Mos.A00(moq.A0A, "bulk_reply_send", "message_photo");
        Iterator A0u = AnonymousClass7TF.A0u(moq.A04);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (A1J.getKey() instanceof MsysThreadId) {
                r6 = moq.A0C;
            } else {
                r6 = moq.A0B;
            }
            C71810OrC.A00(r6.EMH((AnonymousClass9JH) null, gnY, (C254933tI) null, (OCA) null, (C254743sy) A1J.getKey(), r23, r24, "from_bulk_reply", (String) null, (String) null, (String) null, (List) null, ((C66754Mbz) A1J.getValue()).A09), C74178PqK.A00(moq, 49), C73444Pcm.A00, 3);
        }
    }
}
