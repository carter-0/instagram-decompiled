package instagram.features.clips.viewer.recipesheet;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.C41845B3m;
import X.C51972G9s;
import X.C51975G9x;
import X.DbW;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public final class RecipeSheetParams extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(58);
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public RecipeSheetParams(String str, String str2, String str3, String str4, int i, int i2, long j, boolean z, boolean z2) {
        DbW.A1N(str, 1, str2);
        this.A04 = str;
        this.A02 = j;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A00 = i;
        this.A01 = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipeSheetParams) {
                RecipeSheetParams recipeSheetParams = (RecipeSheetParams) obj;
                if (!(0qQ.A0K(this.A04, recipeSheetParams.A04) && this.A02 == recipeSheetParams.A02 && this.A08 == recipeSheetParams.A08 && this.A07 == recipeSheetParams.A07 && 0qQ.A0K(this.A06, recipeSheetParams.A06) && 0qQ.A0K(this.A05, recipeSheetParams.A05) && 0qQ.A0K(this.A03, recipeSheetParams.A03) && this.A00 == recipeSheetParams.A00 && this.A01 == recipeSheetParams.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A08, C51972G9s.A07(this.A02, AnonymousClass7TE.A0O(this.A04))))) + AnonymousClass7TG.A0E(this.A05)) * 31) + C41845B3m.A00(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RecipeSheetParams(mediaId=");
        A1A.append(this.A04);
        A1A.append(", mediaIndex=");
        A1A.append(this.A02);
        A1A.append(", shouldMuteAudio=");
        A1A.append(this.A08);
        A1A.append(", isInspirationEnabled=");
        A1A.append(this.A07);
        A1A.append(AnonymousClass000.A00(2055));
        A1A.append(this.A06);
        A1A.append(C273654mx.A00(1149));
        A1A.append(this.A05);
        A1A.append(", effectSourceAssetId=");
        A1A.append(this.A03);
        A1A.append(", clipsViewerSourceOrdinal=");
        A1A.append(this.A00);
        A1A.append(", listTypeOrdinal=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
