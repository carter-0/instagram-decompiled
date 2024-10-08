package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OaO  reason: case insensitive filesystem */
public abstract class C71046OaO {
    public static DirectCameraViewModel A03(UserSession userSession, DirectShareTarget directShareTarget) {
        return A02(userSession, (C254933tI) null, directShareTarget, (Long) null, false, false);
    }

    public static DirectCameraViewModel A01(Context context, UserSession userSession, C254933tI r12, AnonymousClass2Ep r13, String str, int i) {
        String A07;
        String str2;
        ImageUrl imageUrl;
        02V.A03(r13, "DirectShareTarget is null");
        if (r12 != null) {
            User A02 = 17h.A00(userSession).A02(r12.A0U);
            if (A02 != null) {
                A07 = AnonymousClass50n.A08(A02);
            } else {
                A07 = "";
            }
        } else {
            A07 = AnonymousClass48N.A07(context, userSession, r13);
        }
        ArrayList A01 = AnonymousClass48M.A01(r13.BRZ());
        Long A012 = C330007Lb.A01(r13);
        DirectShareTarget directShareTarget = new DirectShareTarget(C66662MaV.A00(str, A01), A07, A01, r13.CQ2());
        AnonymousClass34S A00 = A00(A01);
        User A04 = AnonymousClass48N.A04(userSession, r13.BKv(), r13);
        User A0j = DbT.A0j(userSession);
        List BRZ = r13.BRZ();
        String str3 = null;
        if (A04 != null) {
            str2 = A04.getId();
            imageUrl = A04.Bh3();
        } else {
            str2 = null;
            imageUrl = null;
        }
        r13.CUG();
        AnonymousClass34S A022 = AnonymousClass3UE.A02(imageUrl, A0j, str2, BRZ);
        if (r12 != null) {
            str3 = r12.A0T;
        }
        return new DirectCameraViewModel((ImageUrl) A022.A00, (ImageUrl) A022.A01, directShareTarget, A012, A07, (String) A00.A01, str3, i, r13.CUG(), r13.Ca9(), r13.CVE(), AnonymousClass7TE.A1a(A00.A00));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (r7.isEmpty() == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.model.direct.camera.DirectCameraViewModel A02(com.instagram.common.session.UserSession r14, X.C254933tI r15, com.instagram.model.direct.DirectShareTarget r16, java.lang.Long r17, boolean r18, boolean r19) {
        /*
            java.lang.String r0 = "DirectShareTarget is null"
            r5 = r16
            X.02V.A03(r5, r0)
            java.util.List r0 = X.DbT.A14(r5)
            X.34S r1 = A00(r0)
            com.instagram.user.model.User r3 = X.DbT.A0j(r14)
            java.util.List r2 = X.DbT.A14(r5)
            r5.A0S()
            r13 = 1
            r0 = 0
            X.34S r4 = X.AnonymousClass3UE.A02(r0, r3, r0, r2)
            r9 = 0
            java.lang.String r3 = X.DbT.A0y(r5)
            if (r15 == 0) goto L_0x0073
            java.lang.String r9 = r15.A0T
            X.17i r2 = X.17h.A00(r14)
            java.lang.String r0 = r15.A0U
            com.instagram.user.model.User r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0070
            java.lang.String r7 = X.AnonymousClass50n.A08(r0)
        L_0x0039:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0073
        L_0x003f:
            r10 = 7
            if (r9 != 0) goto L_0x0043
            r10 = 0
        L_0x0043:
            java.lang.Object r3 = r4.A00
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.Object r4 = r4.A01
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            boolean r0 = r5.A0S()
            r11 = r0 ^ 1
            if (r19 != 0) goto L_0x005c
            X.OZA r0 = X.OZA.A00
            boolean r0 = r0.A01(r14, r5)
            if (r0 != 0) goto L_0x005c
            r13 = 0
        L_0x005c:
            java.lang.Object r0 = r1.A00
            boolean r14 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r8 = r1.A01
            java.lang.String r8 = (java.lang.String) r8
            com.instagram.model.direct.camera.DirectCameraViewModel r2 = new com.instagram.model.direct.camera.DirectCameraViewModel
            r6 = r17
            r12 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r2
        L_0x0070:
            java.lang.String r7 = ""
            goto L_0x0039
        L_0x0073:
            r7 = r3
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71046OaO.A02(com.instagram.common.session.UserSession, X.3tI, com.instagram.model.direct.DirectShareTarget, java.lang.Long, boolean, boolean):com.instagram.model.direct.camera.DirectCameraViewModel");
    }

    public static AnonymousClass34S A00(List list) {
        String str;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                z = false;
                break;
            }
            PendingRecipient A0k = C66580MXl.A0k(it);
            if (A0k.A05 == Boolean.TRUE) {
                str = A0k.A0C;
                z = true;
                break;
            }
        }
        return new AnonymousClass34S(Boolean.valueOf(z), str);
    }
}
