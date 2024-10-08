package X;

import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.4gN  reason: invalid class name and case insensitive filesystem */
public final class C270214gN extends AnonymousClass0T0 {
    public static final C270214gN A0E;
    public static final C270214gN A0F;
    public static final C270214gN A0G;
    public static final C270214gN A0H;
    public static final C270214gN A0I;
    public static final C270214gN A0J;
    public static final C270214gN A0K;
    public static final C270214gN A0L;
    public static final C270214gN A0M;
    public static final C270214gN A0N;
    public static final C270214gN A0O;
    public static final C270214gN A0P;
    public static final C270214gN A0Q;
    public static final C270214gN A0R;
    public static final C270214gN A0S = new C270214gN(C69414Nku.A0F, "10", "http", "TTL exceeded for resolving thread metadata", false, false);
    public static final C270214gN A0T;
    public C254403sQ A00;
    public C69414Nku A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C270214gN(X.C69414Nku r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r0 = 2
            r3 = r17
            X.0qQ.A0B(r3, r0)
            r1 = 0
            r11 = 0
            r0 = r15
            r2 = r16
            r5 = r18
            r7 = r19
            r9 = r20
            r10 = r21
            r4 = r1
            r6 = r1
            r8 = r1
            r12 = r11
            r13 = r11
            r14 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270214gN.<init>(X.Nku, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C270214gN) {
                C270214gN r5 = (C270214gN) obj;
                if (!(this.A01 == r5.A01 && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A05, r5.A05) && this.A0B == r5.A0B && this.A0C == r5.A0C && 0qQ.A0K(this.A07, r5.A07) && 0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A02, r5.A02) && this.A0A == r5.A0A && this.A00 == r5.A00 && this.A09 == r5.A09 && this.A08 == r5.A08 && this.A0D == r5.A0D)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SendError(failureDomain=");
        sb.append(this.A01);
        sb.append(Pxd.A00(316));
        sb.append(this.A03);
        sb.append(", serverErrorCode=");
        sb.append(this.A06);
        sb.append(", sendAttemptChannel=");
        sb.append(this.A05);
        sb.append(", shouldAllowAutomaticRetry=");
        sb.append(this.A0B);
        sb.append(", shouldAllowManualRetry=");
        sb.append(this.A0C);
        sb.append(C66579MXk.A00(192));
        sb.append(this.A07);
        sb.append(Pxd.A00(47));
        sb.append(this.A04);
        sb.append(", clientFacingErrorMessage=");
        sb.append(this.A02);
        sb.append(", isEpdError=");
        sb.append(this.A0A);
        sb.append(", throttlingType=");
        sb.append(this.A00);
        sb.append(", canSeeNotes=");
        sb.append(this.A09);
        sb.append(", canSeeBroadcastChats=");
        sb.append(this.A08);
        sb.append(", shouldAutomaticRetryImmediately=");
        sb.append(this.A0D);
        sb.append(')');
        return sb.toString();
    }

    static {
        C69414Nku nku = C69414Nku.A0C;
        A0P = new C270214gN(nku, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "na", "not an error", true, true);
        C69414Nku nku2 = nku;
        A0L = new C270214gN(nku2, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "http", "client network", true, true);
        A0N = new C270214gN(nku, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "mqtt", "client network", false, true);
        new C270214gN(nku2, "2", "http", "no network detected", true, true);
        A0O = new C270214gN(nku, "3", "mqtt", "mqtt timeout", true, true);
        C69414Nku nku3 = nku;
        String str = "na";
        A0K = new C270214gN(nku3, "4", str, "file not found", false, false);
        A0T = new C270214gN(nku3, "0", str, "unknown retry failure", false, false);
        A0E = new C270214gN(C69414Nku.A09, "23", str, "Not able to translate igid to fbid for receiver during MEM send", false, false);
        new C270214gN(nku, "3", "ae", "armadillo express mailbox timeout", true, true);
        C69414Nku nku4 = nku;
        String str2 = "ae";
        A0G = new C270214gN(nku4, "9", str2, "Send disabled - outdated app version", false, false);
        A0F = new C270214gN(nku4, "9", str2, "Send disabled - malformed receiver fetch params", false, false);
        C69414Nku nku5 = C69414Nku.A05;
        String str3 = "ae";
        A0I = new C270214gN(nku5, "9", str3, "Send disabled - invalid ephemerality params", false, false);
        A0H = new C270214gN(nku5, "9", str3, "Send disabled - deprecated client version for DM", false, false);
        A0Q = new C270214gN(nku2, "11", "http", "Attempted to send an open message to a cutover thread", false, false);
        String str4 = "ae";
        A0R = new C270214gN(nku2, "13", str4, "Attempted to send a cutover message to an open thread", false, false);
        new C270214gN(nku2, "30", str4, "Unknown ACT Login State.", false, false);
        new C270214gN(nku2, "31", str4, "Invalid ACT Login State.", false, false);
        new C270214gN(nku, "32", "ae", "ACT Login has not started.", true, false);
        new C270214gN(nku2, "33", str4, "ACT Login never started.", false, false);
        new C270214gN(nku, "34", "ae", "Waiting on ACT Login.", true, false);
        new C270214gN(nku2, "35", str4, "ACT Login timeout.", false, false);
        A0M = new C270214gN(nku, "40", "ae", "Invalid UserSession for Instamadillo send.", true, true);
        A0J = new C270214gN(nku, "40", "ae", "Skip background UserSession for Instamadillo send.", true, true);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((this.A01.hashCode() * 31) + this.A03.hashCode()) * 31;
        String str = this.A06;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A05.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0B) {
            i2 = 1231;
        }
        int i3 = (hashCode6 + i2) * 31;
        int i4 = 1237;
        if (this.A0C) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        String str2 = this.A07;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str3 = this.A04;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        String str4 = this.A02;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        C254403sQ r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        int i11 = (i10 + i) * 31;
        int i12 = 1237;
        if (this.A09) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A08) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A0D) {
            i16 = 1231;
        }
        return i15 + i16;
    }

    public C270214gN(C254403sQ r2, C69414Nku nku, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(nku, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(str3, 4);
        this.A01 = nku;
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A0B = z;
        this.A0C = z2;
        this.A07 = str4;
        this.A04 = str5;
        this.A02 = str6;
        this.A0A = z3;
        this.A00 = r2;
        this.A09 = z4;
        this.A08 = z5;
        this.A0D = z6;
    }
}
