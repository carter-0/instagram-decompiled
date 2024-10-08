package com.instagram.contentnotes.domain.uistate;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass4Ji;
import X.AnonymousClass9OQ;
import X.C376419Hx;
import X.C61080JwI;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;

public final class SocialContextBubbleUiState extends AnonymousClass0T0 implements Parcelable, AnonymousClass4Ji {
    public static final Parcelable.Creator CREATOR = new C376419Hx(79);
    public final int A00;
    public final C61080JwI A01;
    public final SocialContextType A02;
    public final ImageUrl A03;
    public final User A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final String A0E;
    public final List A0F;

    public SocialContextBubbleUiState(C61080JwI jwI, SocialContextType socialContextType, ImageUrl imageUrl, User user, Integer num, String str, String str2, String str3, String str4, String str5, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(imageUrl, 2);
        0qQ.A0B(str2, 3);
        0qQ.A0B(user, 4);
        0qQ.A0B(str3, 6);
        0qQ.A0B(socialContextType, 9);
        0qQ.A0B(num, 12);
        0qQ.A0B(list2, 15);
        0qQ.A0B(jwI, 16);
        this.A06 = str;
        this.A03 = imageUrl;
        this.A09 = str2;
        this.A04 = user;
        this.A00 = i;
        this.A0E = str3;
        this.A0F = list;
        this.A0B = z;
        this.A02 = socialContextType;
        this.A07 = str4;
        this.A08 = str5;
        this.A05 = num;
        this.A0D = z2;
        this.A0C = z3;
        this.A0A = list2;
        this.A01 = jwI;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SocialContextBubbleUiState) {
                SocialContextBubbleUiState socialContextBubbleUiState = (SocialContextBubbleUiState) obj;
                if (!0qQ.A0K(this.A06, socialContextBubbleUiState.A06) || !0qQ.A0K(this.A03, socialContextBubbleUiState.A03) || !0qQ.A0K(this.A09, socialContextBubbleUiState.A09) || !0qQ.A0K(this.A04, socialContextBubbleUiState.A04) || this.A00 != socialContextBubbleUiState.A00 || !0qQ.A0K(this.A0E, socialContextBubbleUiState.A0E) || !0qQ.A0K(this.A0F, socialContextBubbleUiState.A0F) || this.A0B != socialContextBubbleUiState.A0B || this.A02 != socialContextBubbleUiState.A02 || !0qQ.A0K(this.A07, socialContextBubbleUiState.A07) || !0qQ.A0K(this.A08, socialContextBubbleUiState.A08) || this.A05 != socialContextBubbleUiState.A05 || this.A0D != socialContextBubbleUiState.A0D || this.A0C != socialContextBubbleUiState.A0C || !0qQ.A0K(this.A0A, socialContextBubbleUiState.A0A) || !0qQ.A0K(this.A01, socialContextBubbleUiState.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0E);
        List<Parcelable> list = this.A0F;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(AnonymousClass9OQ.A00(this.A05));
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        List<Object> list2 = this.A0A;
        parcel.writeInt(list2.size());
        for (Object writeValue : list2) {
            parcel.writeValue(writeValue);
        }
        parcel.writeValue(this.A01);
    }

    public final ImageUrl Adz() {
        return this.A03;
    }

    public final List BZf() {
        return this.A0F;
    }

    public final int getIndex() {
        return this.A00;
    }

    public final String getUserId() {
        return this.A09;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((this.A06.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A0E.hashCode()) * 31) + this.A0F.hashCode()) * 31;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int hashCode3 = (((hashCode2 + i) * 31) + this.A02.hashCode()) * 31;
        String str = this.A07;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (hashCode3 + hashCode) * 31;
        String str2 = this.A08;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        Integer num = this.A05;
        int hashCode4 = (((i3 + i2) * 31) + AnonymousClass9OQ.A00(num).hashCode() + num.intValue()) * 31;
        int i4 = 1237;
        if (this.A0D) {
            i4 = 1231;
        }
        int i5 = (hashCode4 + i4) * 31;
        int i6 = 1237;
        if (this.A0C) {
            i6 = 1231;
        }
        return ((((i5 + i6) * 31) + this.A0A.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("SocialContextBubbleUiState(mediaId=");
        sb.append(this.A06);
        sb.append(AnonymousClass000.A00(2001));
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(855));
        sb.append(this.A09);
        sb.append(", user=");
        sb.append(this.A04);
        sb.append(", index=");
        sb.append(this.A00);
        sb.append(AnonymousClass000.A00(1997));
        sb.append(this.A0E);
        sb.append(AnonymousClass000.A00(2036));
        sb.append(this.A0F);
        sb.append(", disableDragging=");
        sb.append(this.A0B);
        sb.append(", socialContextType=");
        sb.append(this.A02);
        sb.append(", socialContextActionData=");
        sb.append(this.A07);
        sb.append(", socialContextActionId=");
        sb.append(this.A08);
        sb.append(", placement=");
        Integer num = this.A05;
        if (num != null) {
            str = AnonymousClass9OQ.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", isTranslated=");
        sb.append(this.A0D);
        sb.append(", isCommentLiked=");
        sb.append(this.A0C);
        sb.append(", carouselChildCommentMention=");
        sb.append(this.A0A);
        sb.append(", socialContextActions=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
