package X;

import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikConstants;
import com.google.common.collect.ImmutableList;
import com.instagram.common.clips.model.ClipSegment;
import com.instagram.common.clips.model.LayoutTransform;
import java.io.IOException;
import java.io.StringWriter;
import java.util.UUID;

/* renamed from: X.51M  reason: invalid class name */
public final class AnonymousClass51M extends AnonymousClass51N implements AnonymousClass51P {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public C376429Hy A0A;
    public GTT A0B;
    public C53401GnY A0C;
    public 0v6 A0D;
    public AnonymousClass51S A0E;
    public AnonymousClass51R A0F;
    public Integer A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass51M) {
                AnonymousClass51M r5 = (AnonymousClass51M) obj;
                if (!(0qQ.A0K(this.A0F, r5.A0F) && 0qQ.A0K(this.A0E, r5.A0E) && Float.compare(this.A00, r5.A00) == 0 && this.A09 == r5.A09 && this.A08 == r5.A08 && this.A0Q == r5.A0Q && this.A0S == r5.A0S && 0qQ.A0K(this.A0D, r5.A0D) && this.A0N == r5.A0N && this.A0R == r5.A0R && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A0T == r5.A0T && 0qQ.A0K(this.A0H, r5.A0H) && 0qQ.A0K(this.A0C, r5.A0C) && 0qQ.A0K(this.A0L, r5.A0L) && 0qQ.A0K(this.A0M, r5.A0M) && this.A07 == r5.A07 && 0qQ.A0K(this.A0K, r5.A0K) && this.A06 == r5.A06 && this.A04 == r5.A04 && 0qQ.A0K(this.A0I, r5.A0I) && 0qQ.A0K(this.A0B, r5.A0B) && this.A0P == r5.A0P && this.A0O == r5.A0O && 0qQ.A0K(this.A0G, r5.A0G) && 0qQ.A0K(this.A0A, r5.A0A) && 0qQ.A0K(this.A0J, r5.A0J) && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IgVideoSegment(sourceVideo=");
        sb.append(this.A0F);
        sb.append(", recordingSettings=");
        sb.append(this.A0E);
        sb.append(", _recordingSpeed=");
        sb.append(this.A00);
        sb.append(", trimmedStartTimeInMs=");
        sb.append(this.A09);
        sb.append(", trimmedEndTimeInMs=");
        sb.append(this.A08);
        sb.append(", isFromDraft=");
        sb.append(this.A0Q);
        sb.append(", isReplaced=");
        sb.append(this.A0S);
        sb.append(", textModeGradientColors=");
        sb.append(this.A0D);
        sb.append(", fillScreen=");
        sb.append(this.A0N);
        sb.append(", isNonTranscodedPrefillVideo=");
        sb.append(this.A0R);
        sb.append(", _minTrimTimeInMs=");
        sb.append(this.A03);
        sb.append(", _maxTrimTimeInMs=");
        sb.append(this.A02);
        sb.append(", minTrimStartTimeInMs=");
        sb.append(this.A05);
        sb.append(", isTranscoded=");
        sb.append(this.A0T);
        sb.append(", complianceError=");
        sb.append(this.A0H);
        sb.append(", autoCreatedReelsInfo=");
        sb.append(this.A0C);
        sb.append(", transitionInEffect=");
        sb.append(this.A0L);
        sb.append(", transitionOutEffect=");
        sb.append(this.A0M);
        sb.append(", takeIndex=");
        sb.append(this.A07);
        sb.append(", retakeListId=");
        sb.append(this.A0K);
        sb.append(", startTimeInMs=");
        sb.append(this.A06);
        sb.append(", endTimeInMs=");
        sb.append(this.A04);
        sb.append(", importId=");
        sb.append(this.A0I);
        sb.append(", videoSplitMetadata=");
        sb.append(this.A0B);
        sb.append(", hasVideoSlip=");
        sb.append(this.A0P);
        sb.append(", hasTemplateReusableAsset=");
        sb.append(this.A0O);
        sb.append(", prefilledIndex=");
        sb.append(this.A0G);
        sb.append(", layoutTransform=");
        sb.append(this.A0A);
        sb.append(", originalMediumId=");
        sb.append(this.A0J);
        sb.append(", volume=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass51M(C53401GnY gnY, 0v6 r30, AnonymousClass51S r31, AnonymousClass51R r32, String str, String str2, String str3, String str4, String str5, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4) {
        super(AnonymousClass05K.A01);
        String str6;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        C53401GnY gnY2 = gnY;
        String str10 = str;
        0v6 r26 = r30;
        int i8 = i7;
        String str11 = str5;
        int i9 = i5;
        int i10 = i4;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        int i11 = i6;
        int i12 = i2;
        int i13 = i;
        int i14 = i3;
        float f2 = f;
        AnonymousClass51S A002 = (i7 & 2) != 0 ? AnonymousClass9NO.A00() : r31;
        f2 = (i7 & 4) != 0 ? A002.A00 : f2;
        i13 = (i7 & 8) != 0 ? 0 : i13;
        AnonymousClass51R r11 = r32;
        if ((i7 & 16) != 0) {
            float abs = Math.abs(f2);
            AnonymousClass51R r0 = AnonymousClass51Q.A00;
            i12 = (int) Math.ceil((double) (((float) (r11.A02 - r11.A03)) / abs));
        }
        z8 = (i7 & 32) != 0 ? false : z8;
        r26 = (i8 & 128) != 0 ? null : r26;
        z7 = (i8 & 256) != 0 ? false : z7;
        z6 = (i8 & 512) != 0 ? false : z6;
        int i15 = (i8 & 1024) != 0 ? -1 : 0;
        int i16 = (i8 & C249703kE.FLAG_MOVED) != 0 ? -1 : 0;
        i14 = (i8 & 4096) != 0 ? -1 : i14;
        z5 = (i8 & 8192) != 0 ? true : z5;
        str10 = (i8 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? null : str10;
        gnY2 = (i7 & Constants.LOAD_RESULT_PGO) != 0 ? null : gnY2;
        str9 = (i7 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0 ? null : str9;
        str8 = (i7 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? null : str8;
        i10 = (i7 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 ? 0 : i10;
        str7 = (i7 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0 ? null : str7;
        i9 = (i7 & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0 ? -1 : i9;
        i11 = (i7 & 2097152) != 0 ? -1 : i11;
        if ((i7 & 4194304) != 0) {
            str6 = UUID.randomUUID().toString();
        } else {
            str6 = null;
        }
        str11 = (i7 & 268435456) != 0 ? null : str11;
        float f3 = (i7 & 536870912) != 0 ? 1.0f : 0.0f;
        0qQ.A0B(r11, 1);
        0qQ.A0B(A002, 2);
        this.A0F = r11;
        this.A0E = A002;
        this.A00 = f2;
        this.A09 = i13;
        this.A08 = i12;
        this.A0Q = z8;
        this.A0S = false;
        this.A0D = r26;
        this.A0N = z7;
        this.A0R = z6;
        this.A03 = i15;
        this.A02 = i16;
        this.A05 = i14;
        this.A0T = z5;
        this.A0H = str10;
        this.A0C = gnY2;
        this.A0L = str9;
        this.A0M = str8;
        this.A07 = i10;
        this.A0K = str7;
        this.A06 = i9;
        this.A04 = i11;
        this.A0I = str6;
        this.A0B = null;
        this.A0P = false;
        this.A0O = false;
        this.A0G = null;
        this.A0A = null;
        this.A0J = str11;
        this.A01 = f3;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.51N, X.51M] */
    public static /* synthetic */ AnonymousClass51M A00(GTT gtt, AnonymousClass51M r32, AnonymousClass51R r33, float f, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass51S r15;
        boolean z;
        boolean z2;
        0v6 r24;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        C53401GnY gnY;
        String str;
        String str2;
        int i9;
        String str3;
        String str4;
        boolean z6;
        boolean z7;
        Integer num;
        C376429Hy r17;
        float f2;
        int i10 = i5;
        int i11 = i4;
        int i12 = i3;
        int i13 = i2;
        int i14 = i;
        float f3 = f;
        AnonymousClass51R r30 = r33;
        String str5 = null;
        String str6 = null;
        AnonymousClass51M r2 = r32;
        if ((i5 & 1) != 0) {
            r30 = r2.A0F;
        }
        if ((i5 & 2) != 0) {
            r15 = r2.A0E;
        } else {
            r15 = null;
        }
        if ((i5 & 4) != 0) {
            f3 = r2.A00;
        }
        if ((i5 & 8) != 0) {
            i14 = r2.A09;
        }
        if ((i5 & 16) != 0) {
            i13 = r2.A08;
        }
        if ((i5 & 32) != 0) {
            z = r2.A0Q;
        } else {
            z = false;
        }
        if ((i5 & 64) != 0) {
            z2 = r2.A0S;
        } else {
            z2 = false;
        }
        if ((i10 & 128) != 0) {
            r24 = r2.A0D;
        } else {
            r24 = null;
        }
        if ((i10 & 256) != 0) {
            z3 = r2.A0N;
        } else {
            z3 = false;
        }
        if ((i10 & 512) != 0) {
            z4 = r2.A0R;
        } else {
            z4 = false;
        }
        if ((i10 & 1024) != 0) {
            i6 = r2.A03;
        } else {
            i6 = 0;
        }
        if ((i10 & C249703kE.FLAG_MOVED) != 0) {
            i7 = r2.A02;
        } else {
            i7 = 0;
        }
        if ((i10 & 4096) != 0) {
            i8 = r2.A05;
        } else {
            i8 = 0;
        }
        if ((i10 & 8192) != 0) {
            z5 = r2.A0T;
        } else {
            z5 = false;
        }
        if ((i10 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            str6 = r2.A0H;
        }
        if ((i5 & Constants.LOAD_RESULT_PGO) != 0) {
            gnY = r2.A0C;
        } else {
            gnY = null;
        }
        if ((i5 & Constants.LOAD_RESULT_PGO_ATTEMPTED) != 0) {
            str = r2.A0L;
        } else {
            str = null;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0) {
            str2 = r2.A0M;
        } else {
            str2 = null;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            i9 = r2.A07;
        } else {
            i9 = 0;
        }
        if ((i5 & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            str3 = r2.A0K;
        } else {
            str3 = null;
        }
        if ((i5 & Constants.LOAD_RESULT_NEED_REOPTIMIZATION) != 0) {
            i12 = r2.A06;
        }
        if ((i5 & 2097152) != 0) {
            i11 = r2.A04;
        }
        if ((i5 & 4194304) != 0) {
            str4 = r2.A0I;
        } else {
            str4 = null;
        }
        if ((i5 & DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE) != 0) {
            gtt = r2.A0B;
        }
        if ((i5 & 16777216) != 0) {
            z6 = r2.A0P;
        } else {
            z6 = false;
        }
        if ((i5 & 33554432) != 0) {
            z7 = r2.A0O;
        } else {
            z7 = false;
        }
        if ((i5 & 67108864) != 0) {
            num = r2.A0G;
        } else {
            num = null;
        }
        if ((i5 & 134217728) != 0) {
            r17 = r2.A0A;
        } else {
            r17 = null;
        }
        if ((i5 & 268435456) != 0) {
            str5 = r2.A0J;
        }
        if ((i5 & 536870912) != 0) {
            f2 = r2.A01;
        } else {
            f2 = 0.0f;
        }
        0qQ.A0B(r30, 0);
        0qQ.A0B(r15, 1);
        ? r1 = new AnonymousClass51N(AnonymousClass05K.A01);
        r1.A0F = r30;
        r1.A0E = r15;
        r1.A00 = f3;
        r1.A09 = i14;
        r1.A08 = i13;
        r1.A0Q = z;
        r1.A0S = z2;
        r1.A0D = r24;
        r1.A0N = z3;
        r1.A0R = z4;
        r1.A03 = i6;
        r1.A02 = i7;
        r1.A05 = i8;
        r1.A0T = z5;
        r1.A0H = str6;
        r1.A0C = gnY;
        r1.A0L = str;
        r1.A0M = str2;
        r1.A07 = i9;
        r1.A0K = str3;
        r1.A06 = i12;
        r1.A04 = i11;
        r1.A0I = str4;
        r1.A0B = gtt;
        r1.A0P = z6;
        r1.A0O = z7;
        r1.A0G = num;
        r1.A0A = r17;
        r1.A0J = str5;
        r1.A01 = f2;
        return r1;
    }

    public final int A0B() {
        AnonymousClass51R r3 = this.A0F;
        float abs = Math.abs(this.A00);
        AnonymousClass51R r0 = AnonymousClass51Q.A00;
        return (int) Math.ceil((double) (((float) (r3.A02 - r3.A03)) / abs));
    }

    public final ClipSegment.VideoSegment A0C() {
        int i;
        int i2;
        AnonymousClass51R r0 = this.A0F;
        String str = r0.A0F;
        int i3 = r0.A09;
        int i4 = r0.A05;
        int i5 = r0.A07;
        LayoutTransform A042 = AnonymousClass51Q.A04(this);
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        AnonymousClass51R r2 = this.A0F;
        long j = r2.A0A;
        int i6 = r2.A04;
        float f = this.A00;
        boolean z = false;
        if (f < 0.0f) {
            z = true;
            i = i6 - this.A08;
        } else {
            i = this.A09;
        }
        if (z) {
            i2 = i6 - this.A09;
        } else {
            i2 = this.A08;
        }
        int i7 = i5;
        int i8 = i6;
        int i9 = i;
        return new ClipSegment.VideoSegment(of, A042, (Integer) null, (Integer) null, str, (String) null, (String) null, f, this.A01, i3, i4, i7, i8, i9, i2, -1, j, true, false);
    }

    public final ClipSegment A0D() {
        AnonymousClass51R r0 = this.A0F;
        String str = r0.A0I;
        if (str == null) {
            return A0C();
        }
        return new ClipSegment.PhotoSegment(AnonymousClass51Q.A04(this), (Integer) null, (Integer) null, str, (String) null, (String) null, r0.A09, r0.A05, r0.A07, this.A08 - this.A09, -1, false);
    }

    public final String A0E() {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
            AnonymousClass51L.A00(A0A2, this);
            A0A2.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    public final void A0F() {
        if (!0qQ.A0K(this.A0F, AnonymousClass51Q.A00)) {
            if (this.A08 == 0) {
                this.A08 = A0B();
            }
            if (this.A06 == -1) {
                this.A06 = this.A0F.A03;
            }
            if (this.A04 == -1) {
                this.A04 = this.A0F.A02;
                return;
            }
            return;
        }
        throw new IllegalStateException("Source video must be set in video segment");
    }

    public final void A0G(float f) {
        float abs;
        if (this.A00 >= 0.0f) {
            abs = Math.abs(f);
        } else {
            abs = Math.abs(f) * -1.0f;
        }
        this.A00 = abs;
    }

    public final int BrP() {
        return this.A08 - this.A09;
    }

    public final String CE4() {
        AnonymousClass51R r3 = this.A0F;
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A0G);
        sb.append('_');
        sb.append(r3.A03);
        sb.append('_');
        sb.append(r3.A02);
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11 = ((((((((this.A0F.hashCode() * 31) + this.A0E.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A09) * 31) + this.A08) * 31;
        int i = 1237;
        if (this.A0Q) {
            i = 1231;
        }
        int i2 = (hashCode11 + i) * 31;
        int i3 = 1237;
        if (this.A0S) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        0v6 r0 = this.A0D;
        int i5 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i6 = (i4 + hashCode) * 31;
        int i7 = 1237;
        if (this.A0N) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0R) {
            i9 = 1231;
        }
        int i10 = (((((((i8 + i9) * 31) + this.A03) * 31) + this.A02) * 31) + this.A05) * 31;
        int i11 = 1237;
        if (this.A0T) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        String str = this.A0H;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        C53401GnY gnY = this.A0C;
        if (gnY == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = gnY.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.A0L;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str3 = this.A0M;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i16 = (((i15 + hashCode5) * 31) + this.A07) * 31;
        String str4 = this.A0K;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i17 = (((((i16 + hashCode6) * 31) + this.A06) * 31) + this.A04) * 31;
        String str5 = this.A0I;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        GTT gtt = this.A0B;
        if (gtt == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = gtt.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        int i20 = 1237;
        if (this.A0P) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0O) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        Integer num = this.A0G;
        if (num == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num.hashCode();
        }
        int i24 = (i23 + hashCode9) * 31;
        C376429Hy r02 = this.A0A;
        if (r02 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = r02.hashCode();
        }
        int i25 = (i24 + hashCode10) * 31;
        String str6 = this.A0J;
        if (str6 != null) {
            i5 = str6.hashCode();
        }
        return ((i25 + i5) * 31) + Float.floatToIntBits(this.A01);
    }

    public AnonymousClass51M() {
        this((C53401GnY) null, (0v6) null, (AnonymousClass51S) null, AnonymousClass51Q.A00, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0, 0, 0, 0, 1073741822, false, false, false, false);
    }
}
