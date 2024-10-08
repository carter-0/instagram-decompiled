package X;

/* renamed from: X.8ve  reason: invalid class name and case insensitive filesystem */
public final class C369988ve extends AnonymousClass0T0 {
    public long A00;
    public long A01;
    public C363928ka A02;
    public C363928ka A03;
    public C370018vh A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;

    public C369988ve(C363928ka r2, C363928ka r3, C370018vh r4, String str, String str2, String str3, String str4, long j, long j2, boolean z) {
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = str4;
        this.A09 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C369988ve) {
                C369988ve r8 = (C369988ve) obj;
                if (!0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A05, r8.A05) || this.A00 != r8.A00 || this.A01 != r8.A01 || !0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A06, r8.A06) || this.A09 != r8.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C363928ka A00() {
        C363928ka r0;
        0tS A002 = 0tS.A4E.A00();
        C363928ka[] r1 = new C363928ka[2];
        if (((Boolean) A002.A31.CDM(A002, 0tS.A4G[220])).booleanValue()) {
            r1[0] = this.A03;
            r0 = this.A02;
        } else {
            r1[0] = this.A02;
            r0 = this.A03;
        }
        r1[1] = r0;
        0qQ.A0B(r1, 0);
        for (C363928ka r12 : 03t.A0I(r1)) {
            if (r12.A03()) {
                return r12;
            }
        }
        0kD.A06("StoryDraftModel", "Couldn't resolve any mediaInfo", (Throwable) null);
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.A00;
        long j2 = this.A01;
        int hashCode5 = ((((((((hashCode * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C363928ka r0 = this.A02;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i2 = (hashCode5 + hashCode2) * 31;
        C363928ka r02 = this.A03;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        C370018vh r03 = this.A04;
        if (r03 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r03.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str2 = this.A06;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i5 = (i4 + i) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        return i5 + i6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369988ve() {
        /*
            r13 = this;
            r1 = 0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r5 = r0.toString()
            X.0qQ.A07(r5)
            java.lang.String r6 = ""
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 1
            r0 = r13
            r2 = r1
            r3 = r1
            r4 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369988ve.<init>():void");
    }
}
