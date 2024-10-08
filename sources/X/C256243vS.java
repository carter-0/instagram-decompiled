package X;

/* renamed from: X.3vS  reason: invalid class name and case insensitive filesystem */
public final class C256243vS {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public C250813m6 A0A;
    public 28e A0B;
    public AnonymousClass3uV A0C;
    public C255653uU A0D;
    public Integer A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final AnonymousClass4SX A0P;
    public final C251073mW A0Q;
    public final Integer A0R;
    public final String A0S;
    public final String A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("VideoPrefetchRequest");
        sb.append("\nmCacheKey: ");
        sb.append(this.A0G);
        sb.append("\nmPrefetchOffset: ");
        sb.append(this.A07);
        sb.append("\nmPrefetchBytes: ");
        sb.append(this.A02);
        sb.append("\nmPrefetchSegment: ");
        sb.append(this.A03);
        sb.append("\nmStreamType: ");
        sb.append(this.A04);
        sb.append("\nmQueueBehavior: ");
        Integer num = this.A0F;
        if (num != null) {
            str = C256253vT.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("\nmAtomSize: ");
        sb.append(this.A00);
        sb.append("\nmBitRate: ");
        sb.append(this.A01);
        sb.append("\nmQualityLabel: ");
        sb.append(this.A0I);
        sb.append("\nmVideoTotalDurationMs: ");
        sb.append(this.A05);
        sb.append("\nmPrefetchSource: ");
        sb.append(this.A0H);
        sb.append("\nmVideoStatus: ");
        sb.append(this.A0B.name());
        sb.append("\nVideoPrefetchRequest.VideoSource");
        sb.append("\n");
        sb.append(this.A0D.toString());
        sb.append("\nmTargetContentReadyTimeMs: ");
        sb.append(this.A09);
        sb.append("\nmIsAudioOn: ");
        sb.append(this.A0K);
        sb.append("\nmShouldForceHighPriority: ");
        sb.append(this.A0M);
        sb.append("\nmUserOptedInLowLatency: ");
        sb.append(this.A0O);
        sb.append("\nmStartTimeMs: ");
        sb.append(this.A08);
        sb.append("\nmPrefetchDurationMs: ");
        sb.append(this.A06);
        sb.append("\nmUseHeroBgThread: ");
        sb.append(this.A0N);
        sb.append("\nmTag: ");
        sb.append("");
        sb.append("\nmPrefetchingModule: ");
        sb.append("");
        sb.append("\nmIsThumbnail: ");
        sb.append(this.A0W);
        sb.append("\nmIsBackgroundPrefetch: ");
        sb.append(this.A0V);
        sb.append("\nmIsFollowUpPrefetch: ");
        sb.append(this.A0L);
        sb.append("\nmDisableFollowUpPrefetch: ");
        sb.append(this.A0J);
        sb.append("\nmEnableForegroundPrefetchQualityExperimentation: ");
        sb.append(this.A0U);
        sb.append("\nmFromNewsFeedStartup: ");
        sb.append(false);
        sb.append("\nmCustomDataSoruceFactory: ");
        AnonymousClass4SX r0 = this.A0P;
        String str3 = "null";
        String str4 = str3;
        if (r0 != null) {
            str2 = String.valueOf(r0.hashCode());
        } else {
            str2 = str3;
        }
        sb.append(str2);
        sb.append("\nmCustomCache: ");
        C251073mW r02 = this.A0Q;
        if (r02 != null) {
            str3 = String.valueOf(r02.hashCode());
        }
        sb.append(str3);
        sb.append("\nmBytesCalculationOrigin: ");
        Integer num2 = this.A0E;
        if (num2 != null) {
            str4 = XVY.A00(num2);
        }
        sb.append(str4);
        sb.append("\nmVideoPos: ");
        sb.append(this.A0R);
        return sb.toString();
    }

    public C256243vS(C256243vS r3) {
        this.A0E = AnonymousClass05K.A00;
        this.A0D = r3.A0D;
        this.A0G = r3.A0G;
        this.A07 = r3.A07;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A0I = r3.A0I;
        this.A05 = r3.A05;
        this.A0H = r3.A0H;
        this.A0B = r3.A0B;
        this.A0F = r3.A0F;
        this.A0C = r3.A0C;
        this.A09 = r3.A09;
        this.A0K = r3.A0K;
        this.A0M = r3.A0M;
        this.A0O = r3.A0O;
        this.A08 = r3.A08;
        this.A06 = r3.A06;
        this.A0N = r3.A0N;
        this.A0T = "";
        this.A0S = "";
        this.A0W = r3.A0W;
        this.A0V = r3.A0V;
        this.A0L = r3.A0L;
        this.A0J = r3.A0J;
        this.A0U = r3.A0U;
        this.A0A = r3.A0A;
        this.A0P = r3.A0P;
        this.A0Q = r3.A0Q;
        this.A0E = r3.A0E;
        this.A0R = r3.A0R;
    }

    public C256243vS(28e r7, AnonymousClass3uV r8, C255653uU r9, AnonymousClass4SX r10, C251073mW r11, Integer num, Integer num2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0D = r9;
        this.A0G = str;
        this.A07 = j;
        this.A02 = i;
        this.A03 = -1;
        this.A04 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A0I = str2;
        this.A05 = i5;
        this.A0H = str3;
        this.A0B = r7;
        this.A0F = num;
        this.A0C = r8;
        this.A09 = j2;
        this.A0K = z;
        this.A0M = z2;
        this.A0O = false;
        this.A08 = j3;
        this.A06 = j4;
        this.A0N = false;
        this.A0T = "";
        this.A0S = "";
        this.A0W = z3;
        this.A0V = true;
        this.A0L = false;
        this.A0J = z4;
        this.A0U = z5;
        this.A0A = null;
        this.A0P = r10;
        this.A0Q = r11;
        this.A0E = num2;
        this.A0R = null;
    }
}
