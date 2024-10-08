package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.P8i  reason: case insensitive filesystem */
public final class C72499P8i implements C332837Wo {
    public final int A00;
    public final Object A01;

    public C72499P8i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D9w() {
    }

    public final void DJ4() {
    }

    public final void DJ5() {
    }

    public final void DRi(2FW r24, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        String str5;
        int i = this.A00;
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        String str6 = str;
        Object obj = this.A01;
        if (i != 0) {
            C68493NKm nKm = (C68493NKm) obj;
            C332837Wo r8 = nKm.A02;
            long j2 = j;
            if (r8 != null) {
                r8.DRi(r24, messageIdentifier2, str6, str2, str3, str4, j2, z, z2);
            }
            int i2 = 0;
            for (Object next : JTO.A15(nKm.A0F)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C254703su r7 = ((NVY) next).A00;
                String A0h = r7.A0h();
                if (messageIdentifier != null) {
                    str5 = messageIdentifier2.A01;
                } else {
                    str5 = null;
                }
                if (0qQ.A0K(A0h, str5)) {
                    AnonymousClass0eM r0 = nKm.A0I;
                    r7.A0y(AnonymousClass7TE.A0l(r0), new C2607246u((ExtendedImageUrl) null, Long.valueOf(1000 * j), DbU.A0u(r0), str6, (String) null), DbU.A0u(r0), (String) null);
                    2Rw r02 = nKm.getRecyclerView().A0A;
                    if (r02 != null) {
                        r02.notifyItemChanged(i2);
                    }
                }
                i2 = i3;
            }
            return;
        }
        OIT oit = (OIT) obj;
        if (0qQ.A0K(oit.A0K, "roll_call")) {
            oit.A0A.A02(C69497Nmf.REACT, oit.A0D.A0B, oit.A0J.A00);
        }
        C68495NKo nKo = oit.A0B;
        String str7 = oit.A0D.A0D;
        if (messageIdentifier != null) {
            nKo.AE6(str7, "CREATED", messageIdentifier2.A01, str6, messageIdentifier2.A00());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DbX(2FW r21, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        String str3;
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        if (this.A00 != 0) {
            C68493NKm nKm = (C68493NKm) this.A01;
            C332837Wo r7 = nKm.A02;
            String str4 = str;
            long j2 = j;
            if (r7 != null) {
                r7.DbX(r21, messageIdentifier2, str4, str2, j2);
            }
            int i = 0;
            for (Object next : JTO.A15(nKm.A0F)) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C254703su r6 = ((NVY) next).A00;
                String A0h = r6.A0h();
                if (messageIdentifier != null) {
                    str3 = messageIdentifier2.A01;
                } else {
                    str3 = null;
                }
                if (0qQ.A0K(A0h, str3)) {
                    AnonymousClass0eM r0 = nKm.A0I;
                    r6.A0z(AnonymousClass7TE.A0l(r0), new C2607246u((ExtendedImageUrl) null, Long.valueOf(1000 * j), DbU.A0u(r0), str4, (String) null), DbU.A0u(r0), (String) null);
                    2Rw r02 = nKm.getRecyclerView().A0A;
                    if (r02 != null) {
                        r02.notifyItemChanged(i);
                    }
                }
                i = i2;
            }
            return;
        }
        OIT oit = (OIT) this.A01;
        C68495NKo nKo = oit.A0B;
        String str5 = oit.A0D.A0D;
        if (messageIdentifier != null) {
            nKo.AE6(str5, "DELETED", messageIdentifier2.A01, (String) null, messageIdentifier2.A00());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
