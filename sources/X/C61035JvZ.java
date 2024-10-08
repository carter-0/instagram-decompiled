package X;

import android.graphics.RectF;
import com.instagram.igtv.persistence.draft.IGTVBrandedContentTags;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;

/* renamed from: X.JvZ  reason: case insensitive filesystem */
public final class C61035JvZ extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final IGTVBrandedContentTags A0F;
    public final IGTVShoppingMetadata A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;

    public static void A01(1WE r3, C61035JvZ jvZ, long j) {
        r3.ADa(1, j);
        r3.ADa(2, jvZ.A0Y ? 1 : 0);
        r3.ADh(3, jvZ.A0M);
        r3.ADa(4, (long) jvZ.A08);
        r3.ADa(5, (long) jvZ.A09);
        r3.ADa(6, (long) jvZ.A07);
        r3.ADa(7, jvZ.A0B);
        r3.ADh(8, jvZ.A0L);
        r3.ADh(9, jvZ.A0I);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61035JvZ) {
                C61035JvZ jvZ = (C61035JvZ) obj;
                if (!(this.A06 == jvZ.A06 && this.A0Y == jvZ.A0Y && 0qQ.A0K(this.A0M, jvZ.A0M) && this.A08 == jvZ.A08 && this.A09 == jvZ.A09 && this.A07 == jvZ.A07 && this.A0B == jvZ.A0B && 0qQ.A0K(this.A0L, jvZ.A0L) && 0qQ.A0K(this.A0I, jvZ.A0I) && 0qQ.A0K(this.A0K, jvZ.A0K) && this.A0X == jvZ.A0X && this.A04 == jvZ.A04 && this.A05 == jvZ.A05 && Float.compare(this.A00, jvZ.A00) == 0 && this.A0T == jvZ.A0T && this.A0P == jvZ.A0P && 0qQ.A0K(this.A0H, jvZ.A0H) && this.A03 == jvZ.A03 && this.A02 == jvZ.A02 && this.A01 == jvZ.A01 && this.A0Q == jvZ.A0Q && this.A0W == jvZ.A0W && 0qQ.A0K(this.A0D, jvZ.A0D) && 0qQ.A0K(this.A0E, jvZ.A0E) && this.A0S == jvZ.A0S && 0qQ.A0K(this.A0J, jvZ.A0J) && this.A0a == jvZ.A0a && this.A0N == jvZ.A0N && this.A0O == jvZ.A0O && this.A0R == jvZ.A0R && this.A0U == jvZ.A0U && this.A0V == jvZ.A0V && 0qQ.A0K(this.A0F, jvZ.A0F) && this.A0Z == jvZ.A0Z && 0qQ.A0K(this.A0G, jvZ.A0G) && this.A0A == jvZ.A0A && this.A0C == jvZ.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(1WE r3, C61035JvZ jvZ) {
        r3.ADa(11, jvZ.A0X ? 1 : 0);
        r3.ADa(12, (long) jvZ.A04);
        r3.ADa(13, (long) jvZ.A05);
        r3.ADY(14, (double) jvZ.A00);
        r3.ADa(15, jvZ.A0T ? 1 : 0);
        r3.ADa(16, jvZ.A0P ? 1 : 0);
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0Y, this.A06 * 31);
        int A082 = AnonymousClass7TF.A08(this.A0L, AnonymousClass7TF.A01(this.A0B, (((((AnonymousClass7TF.A08(this.A0M, A092) + this.A08) * 31) + this.A09) * 31) + this.A07) * 31));
        int A093 = AnonymousClass7TF.A09(this.A0T, AnonymousClass7TF.A00((((AnonymousClass7TF.A09(this.A0X, (AnonymousClass7TF.A08(this.A0I, A082) + AnonymousClass7TG.A0E(this.A0K)) * 31) + this.A04) * 31) + this.A05) * 31, this.A00));
        int A094 = AnonymousClass7TF.A09(this.A0Q, (((((((AnonymousClass7TF.A09(this.A0P, A093) + AnonymousClass7TG.A0E(this.A0H)) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31);
        boolean z = this.A0S;
        int A095 = AnonymousClass7TF.A09(this.A0U, AnonymousClass7TF.A09(this.A0R, AnonymousClass7TF.A09(this.A0O, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A09(this.A0a, (AnonymousClass7TF.A09(z, (((AnonymousClass7TF.A09(this.A0W, A094) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0C(this.A0E)) * 31) + AnonymousClass7TG.A0E(this.A0J)) * 31)))));
        boolean z2 = this.A0Z;
        int A012 = AnonymousClass7TF.A01(this.A0A, (AnonymousClass7TF.A09(z2, (AnonymousClass7TF.A09(this.A0V, A095) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TE.A0L(this.A0G)) * 31);
        long j = this.A0C;
        return A012 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IGTVDraftEntity(id=");
        A1A.append(this.A06);
        A1A.append(", isUploading=");
        A1A.append(this.A0Y);
        A1A.append(", videoPath=");
        A1A.append(this.A0M);
        A1A.append(", origRotation=");
        A1A.append(this.A08);
        A1A.append(", origWidth=");
        A1A.append(this.A09);
        A1A.append(", origHeight=");
        A1A.append(this.A07);
        A1A.append(", duration=");
        A1A.append(this.A0B);
        A1A.append(", title=");
        A1A.append(this.A0L);
        A1A.append(Pxd.A00(45));
        A1A.append(this.A0I);
        A1A.append(", seriesId=");
        A1A.append(this.A0K);
        A1A.append(", isUnifiedVideo=");
        A1A.append(this.A0X);
        A1A.append(", filterId=");
        A1A.append(this.A04);
        A1A.append(AnonymousClass000.A00(2016));
        A1A.append(this.A05);
        A1A.append(", postCropAspectRatio=");
        A1A.append(this.A00);
        A1A.append(", isLandscapeSurface=");
        A1A.append(this.A0T);
        A1A.append(", isCoverImageCustom=");
        A1A.append(this.A0P);
        A1A.append(", coverImageFilePath=");
        A1A.append(this.A0H);
        A1A.append(", coverImageWidth=");
        A1A.append(this.A03);
        A1A.append(", coverImageHeight=");
        A1A.append(this.A02);
        A1A.append(", coverImageFromVideoTimeMs=");
        A1A.append(this.A01);
        A1A.append(", isCoverImageFromVideoEdited=");
        A1A.append(this.A0Q);
        A1A.append(", isPreviewEnabled=");
        A1A.append(this.A0W);
        A1A.append(", previewCropCoords=");
        A1A.append(this.A0D);
        A1A.append(", profileCropCoords=");
        A1A.append(this.A0E);
        A1A.append(", isInternal=");
        A1A.append(this.A0S);
        A1A.append(", groupDestinationUserId=");
        A1A.append(this.A0J);
        A1A.append(", shareToFacebook=");
        A1A.append(this.A0a);
        A1A.append(", areCaptionsEnabled=");
        A1A.append(this.A0N);
        A1A.append(", areCommentsDisabled=");
        A1A.append(this.A0O);
        A1A.append(", isFundedContentDeal=");
        A1A.append(this.A0R);
        A1A.append(", isLikeAndViewCountsDisabled=");
        A1A.append(this.A0U);
        A1A.append(", isPaidPartnership=");
        A1A.append(this.A0V);
        A1A.append(", brandedContentInfo=");
        A1A.append(this.A0F);
        A1A.append(", partnerBoostEnabled=");
        A1A.append(this.A0Z);
        A1A.append(", shoppingInfo=");
        A1A.append(this.A0G);
        A1A.append(", createdTimeMs=");
        A1A.append(this.A0A);
        A1A.append(", lastModifiedTimeMs=");
        A1A.append(this.A0C);
        return AnonymousClass7TG.A0p(A1A);
    }

    public C61035JvZ(RectF rectF, RectF rectF2, IGTVBrandedContentTags iGTVBrandedContentTags, IGTVShoppingMetadata iGTVShoppingMetadata, String str, String str2, String str3, String str4, String str5, String str6, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        C51973G9u.A0t(3, str, str2, str3);
        this.A06 = i;
        this.A0Y = z;
        this.A0M = str;
        this.A08 = i2;
        this.A09 = i3;
        this.A07 = i4;
        this.A0B = j;
        this.A0L = str2;
        this.A0I = str3;
        this.A0K = str4;
        this.A0X = z2;
        this.A04 = i5;
        this.A05 = i6;
        this.A00 = f;
        this.A0T = z3;
        this.A0P = z4;
        this.A0H = str5;
        this.A03 = i7;
        this.A02 = i8;
        this.A01 = i9;
        this.A0Q = z5;
        this.A0W = z6;
        this.A0D = rectF;
        this.A0E = rectF2;
        this.A0S = z7;
        this.A0J = str6;
        this.A0a = z8;
        this.A0N = z9;
        this.A0O = z10;
        this.A0R = z11;
        this.A0U = z12;
        this.A0V = z13;
        this.A0F = iGTVBrandedContentTags;
        this.A0Z = z14;
        this.A0G = iGTVShoppingMetadata;
        this.A0A = j2;
        this.A0C = j3;
    }
}
