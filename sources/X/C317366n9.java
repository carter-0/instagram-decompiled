package X;

import com.facebook.common.dextricks.Constants;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.6n9  reason: invalid class name and case insensitive filesystem */
public final class C317366n9 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass9JK A03;
    public final AnonymousClass9JK A04;
    public final ImageUrl A05;
    public final C247733gp A06;
    public final C317376nA A07;
    public final CharSequence A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final int A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C317366n9) {
                C317366n9 r5 = (C317366n9) obj;
                if (!(this.A0K == r5.A0K && this.A0I == r5.A0I && this.A0L == r5.A0L && this.A0M == r5.A0M && this.A0P == r5.A0P && this.A0O == r5.A0O && this.A0N == r5.A0N && 0qQ.A0K(this.A04, r5.A04) && 0qQ.A0K(this.A05, r5.A05) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A0J == r5.A0J && 0qQ.A0K(this.A09, r5.A09) && 0qQ.A0K(this.A08, r5.A08) && this.A0C == r5.A0C && this.A0R == r5.A0R && 0qQ.A0K(this.A0B, r5.A0B) && 0qQ.A0K(this.A0A, r5.A0A) && this.A0S == r5.A0S && this.A0Q == r5.A0Q && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A06, r5.A06) && this.A0G == r5.A0G && 0qQ.A0K(this.A07, r5.A07) && this.A02 == r5.A02 && this.A0E == r5.A0E && this.A0F == r5.A0F && this.A0D == r5.A0D && this.A0H == r5.A0H)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ViewState(showCommentButton=");
        sb.append(this.A0K);
        sb.append(", showAddCommentText=");
        sb.append(this.A0I);
        sb.append(", showCommentComposer=");
        sb.append(this.A0L);
        sb.append(", showCommentRotation=");
        sb.append(this.A0M);
        sb.append(", showDialog=");
        sb.append(this.A0P);
        sb.append(", showComposer=");
        sb.append(this.A0O);
        sb.append(", showCommentSheet=");
        sb.append(this.A0N);
        sb.append(", focusedComment=");
        sb.append(this.A04);
        sb.append(", composerAvatarUrl=");
        sb.append(this.A05);
        sb.append(", characterCount=");
        sb.append(this.A00);
        sb.append(", characterLimit=");
        sb.append(this.A01);
        sb.append(", showCharacterLimitIndication=");
        sb.append(this.A0J);
        sb.append(", authorUserName=");
        sb.append(this.A09);
        sb.append(", composerText=");
        sb.append(this.A08);
        sb.append(", enablePostButton=");
        sb.append(this.A0C);
        sb.append(", commentPosting=");
        sb.append(this.A0R);
        sb.append(", comments=");
        sb.append(this.A0B);
        sb.append(", commentModels=");
        sb.append(this.A0A);
        sb.append(", hideViewerComment=");
        sb.append(this.A0S);
        sb.append(", currentViewerCommentIndex=");
        sb.append(this.A0Q);
        sb.append(", currentViewerComment=");
        sb.append(this.A03);
        sb.append(", currentViewerCommentModel=");
        sb.append(this.A06);
        sb.append(", shouldAnimateUpdate=");
        sb.append(this.A0G);
        sb.append(", currentCommentLogger=");
        sb.append(this.A07);
        sb.append(", currentRotation=");
        sb.append(this.A02);
        sb.append(", isCampfireMedia=");
        sb.append(this.A0E);
        sb.append(", isSelfStory=");
        sb.append(this.A0F);
        sb.append(", hasHiddenComments=");
        sb.append(this.A0D);
        sb.append(", shouldPerformHaptics=");
        sb.append(this.A0H);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 1237;
        if (this.A0K) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A0I) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0L) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0M) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0P) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0O) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0N) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        AnonymousClass9JK r0 = this.A04;
        int i15 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i16 = (i14 + hashCode) * 31;
        ImageUrl imageUrl = this.A05;
        if (imageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = imageUrl.hashCode();
        }
        int i17 = (((((i16 + hashCode2) * 31) + this.A00) * 31) + this.A01) * 31;
        int i18 = 1237;
        if (this.A0J) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        String str = this.A09;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode6 = (((i19 + hashCode3) * 31) + this.A08.hashCode()) * 31;
        int i20 = 1237;
        if (this.A0C) {
            i20 = 1231;
        }
        int i21 = (hashCode6 + i20) * 31;
        int i22 = 1237;
        if (this.A0R) {
            i22 = 1231;
        }
        int hashCode7 = (((((i21 + i22) * 31) + this.A0B.hashCode()) * 31) + this.A0A.hashCode()) * 31;
        int i23 = 1237;
        if (this.A0S) {
            i23 = 1231;
        }
        int i24 = (((hashCode7 + i23) * 31) + this.A0Q) * 31;
        AnonymousClass9JK r02 = this.A03;
        if (r02 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r02.hashCode();
        }
        int i25 = (i24 + hashCode4) * 31;
        C247733gp r03 = this.A06;
        if (r03 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r03.hashCode();
        }
        int i26 = (i25 + hashCode5) * 31;
        int i27 = 1237;
        if (this.A0G) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        C317376nA r04 = this.A07;
        if (r04 != null) {
            i15 = r04.hashCode();
        }
        int i29 = (((i28 + i15) * 31) + this.A02) * 31;
        int i30 = 1237;
        if (this.A0E) {
            i30 = 1231;
        }
        int i31 = (i29 + i30) * 31;
        int i32 = 1237;
        if (this.A0F) {
            i32 = 1231;
        }
        int i33 = (i31 + i32) * 31;
        int i34 = 1237;
        if (this.A0D) {
            i34 = 1231;
        }
        int i35 = (i33 + i34) * 31;
        int i36 = 1237;
        if (this.A0H) {
            i36 = 1231;
        }
        return i35 + i36;
    }

    public C317366n9(AnonymousClass9JK r2, AnonymousClass9JK r3, ImageUrl imageUrl, C247733gp r5, C317376nA r6, CharSequence charSequence, String str, List list, List list2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.A0K = z;
        this.A0I = z2;
        this.A0L = z3;
        this.A0M = z4;
        this.A0P = z5;
        this.A0O = z6;
        this.A0N = z7;
        this.A04 = r2;
        this.A05 = imageUrl;
        this.A00 = i;
        this.A01 = i2;
        this.A0J = z8;
        this.A09 = str;
        this.A08 = charSequence;
        this.A0C = z9;
        this.A0R = z10;
        this.A0B = list;
        this.A0A = list2;
        this.A0S = z11;
        this.A0Q = i3;
        this.A03 = r3;
        this.A06 = r5;
        this.A0G = z12;
        this.A07 = r6;
        this.A02 = i4;
        this.A0E = z13;
        this.A0F = z14;
        this.A0D = z15;
        this.A0H = z16;
    }

    public static /* synthetic */ C317366n9 A00(AnonymousClass9JK r34, AnonymousClass9JK r35, C247733gp r36, C317376nA r37, C317366n9 r38, CharSequence charSequence, List list, List list2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        int i5 = i4;
        boolean z13 = z11;
        boolean z14 = z10;
        int i6 = i3;
        C317376nA r26 = r37;
        boolean z15 = z9;
        C247733gp r28 = r36;
        AnonymousClass9JK r44 = r35;
        boolean z16 = z2;
        AnonymousClass9JK r45 = r34;
        boolean z17 = z12;
        CharSequence charSequence2 = charSequence;
        boolean z18 = z3;
        boolean z19 = z4;
        int i7 = i2;
        boolean z20 = z5;
        boolean z21 = z7;
        int i8 = i;
        boolean z22 = z6;
        List list3 = list;
        List list4 = list2;
        boolean z23 = z;
        boolean z24 = z8;
        String str = null;
        C317366n9 r15 = r38;
        boolean z25 = (i5 & 1) != 0 ? r15.A0K : false;
        if ((i5 & 2) != 0) {
            z23 = r15.A0I;
        }
        boolean z26 = (i5 & 4) != 0 ? r15.A0L : false;
        if ((i5 & 8) != 0) {
            z16 = r15.A0M;
        }
        if ((i5 & 16) != 0) {
            z18 = r15.A0P;
        }
        if ((i5 & 32) != 0) {
            z19 = r15.A0O;
        }
        if ((i5 & 64) != 0) {
            z20 = r15.A0N;
        }
        if ((i5 & 128) != 0) {
            r45 = r15.A04;
        }
        ImageUrl imageUrl = (i5 & 256) != 0 ? r15.A05 : null;
        if ((i5 & 512) != 0) {
            i8 = r15.A00;
        }
        int i9 = (i5 & 1024) != 0 ? r15.A01 : 0;
        if ((i5 & C249703kE.FLAG_MOVED) != 0) {
            z22 = r15.A0J;
        }
        if ((i5 & 4096) != 0) {
            str = r15.A09;
        }
        if ((i5 & 8192) != 0) {
            charSequence2 = r15.A08;
        }
        if ((i5 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z21 = r15.A0C;
        }
        boolean z27 = (32768 & i5) != 0 ? r15.A0R : false;
        if ((65536 & i5) != 0) {
            list3 = r15.A0B;
        }
        if ((131072 & i5) != 0) {
            list4 = r15.A0A;
        }
        if ((262144 & i5) != 0) {
            z24 = r15.A0S;
        }
        if ((524288 & i5) != 0) {
            i7 = r15.A0Q;
        }
        if ((1048576 & i5) != 0) {
            r44 = r15.A03;
        }
        if ((2097152 & i5) != 0) {
            r28 = r15.A06;
        }
        if ((4194304 & i5) != 0) {
            z15 = r15.A0G;
        }
        if ((8388608 & i5) != 0) {
            r26 = r15.A07;
        }
        if ((16777216 & i5) != 0) {
            i6 = r15.A02;
        }
        if ((33554432 & i5) != 0) {
            z14 = r15.A0E;
        }
        boolean z28 = (67108864 & i5) != 0 ? r15.A0F : false;
        if ((134217728 & i5) != 0) {
            z13 = r15.A0D;
        }
        if ((i5 & 268435456) != 0) {
            z17 = r15.A0H;
        }
        0qQ.A0B(charSequence2, 13);
        0qQ.A0B(list3, 16);
        0qQ.A0B(list4, 17);
        return new C317366n9(r45, r44, imageUrl, r28, r26, charSequence2, str, list3, list4, i8, i9, i7, i6, z25, z23, z26, z16, z18, z19, z20, z22, z21, z27, z24, z15, z14, z28, z13, z17);
    }
}
