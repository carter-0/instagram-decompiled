package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.JvL  reason: case insensitive filesystem */
public final class C61021JvL extends AnonymousClass0T0 {
    public final int A00;
    public final 28D A01;
    public final 1iA A02;
    public final ShareType A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61021JvL(X.AnonymousClass3Q2 r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r8 = this;
            r4 = r10
            X.AnonymousClass7TG.A1O(r10, r9)
            java.lang.String r5 = r9.A35
            X.1iA r2 = r9.A1G
            com.instagram.pendingmedia.model.constants.ShareType r3 = r9.A0E()
            X.28D r1 = r9.A0i
            r0 = r8
            r6 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61021JvL.<init>(X.3Q2, java.lang.String, java.lang.String, int):void");
    }

    public final C255323tw A00() {
        int i = 0;
        0eP[] r3 = {AnonymousClass7TE.A1L(AnonymousClass000.A00(1042), this.A06), AnonymousClass7TE.A1L("PENDING_MEDIA_KEY", this.A04), AnonymousClass7TE.A1L("PENDING_MEDIA_TYPE_KEY", this.A02.name()), AnonymousClass7TE.A1L("PENDING_SHARE_TYPE_KEY", this.A03.name()), AnonymousClass7TE.A1L("CAMERA_ENTRY_POINT_KEY", String.valueOf(this.A01)), AnonymousClass7TE.A1L("SOURCE_KEY", this.A05), AnonymousClass7TE.A1L("RUN_COUNT_KEY", Integer.valueOf(this.A00))};
        C255333tx r2 = new C255333tx();
        do {
            0eP r0 = r3[i];
            r2.A01(r0.A01, (String) r0.A00);
            i++;
        } while (i < 7);
        return r2.A00();
    }

    public final boolean equals(Object obj) {
        C61021JvL jvL;
        String str = this.A04;
        String str2 = null;
        if ((obj instanceof C61021JvL) && (jvL = (C61021JvL) obj) != null) {
            str2 = jvL.A04;
        }
        return 0qQ.A0K(str, str2);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Payload(mediaKey=");
        A1A.append(this.A04);
        A1A.append(", shareType=");
        A1A.append(this.A03);
        A1A.append(", source=");
        A1A.append(this.A05);
        A1A.append(Pxd.A00(332));
        return C51975G9x.A0j(A1A, this.A00);
    }

    public C61021JvL(28D r1, 1iA r2, ShareType shareType, String str, String str2, String str3, int i) {
        C51974G9v.A1P(str, str2, r2, shareType);
        this.A06 = str;
        this.A04 = str2;
        this.A02 = r2;
        this.A03 = shareType;
        this.A01 = r1;
        this.A05 = str3;
        this.A00 = i;
    }
}
