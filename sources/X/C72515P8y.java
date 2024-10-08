package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.P8y  reason: case insensitive filesystem */
public final class C72515P8y implements AnonymousClass7X4 {
    public final /* synthetic */ C68493NKm A00;

    public C72515P8y(C68493NKm nKm) {
        this.A00 = nKm;
    }

    public final void DRe(2FW r23, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
        String str4;
        C68493NKm nKm = this.A00;
        AnonymousClass7X4 r8 = nKm.A03;
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        long j2 = j;
        if (r8 != null) {
            r8.DRe(r23, messageIdentifier2, str, str2, str3, j2, z);
        }
        int i = 0;
        for (Object next : JTO.A15(nKm.A0F)) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C254703su r7 = ((NVY) next).A00;
            String A0h = r7.A0h();
            if (messageIdentifier != null) {
                str4 = messageIdentifier2.A01;
            } else {
                str4 = null;
            }
            if (0qQ.A0K(A0h, str4)) {
                AnonymousClass0eM r0 = nKm.A0I;
                r7.A0y(AnonymousClass7TE.A0l(r0), new C2607246u((ExtendedImageUrl) null, Long.valueOf(1000 * j), DbU.A0u(r0), "❤", (String) null), DbU.A0u(r0), (String) null);
            }
            2Rw r02 = nKm.getRecyclerView().A0A;
            if (r02 != null) {
                r02.notifyItemChanged(i);
            }
            i = i2;
        }
    }
}
