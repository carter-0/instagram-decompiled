package com.instagram.profile.bindergroup;

import X.002;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.C41845B3m;
import X.DbS;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.android.R;

public abstract class AccountLinkModel implements Parcelable {
    public final int A00;

    public final class AddExternalLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(77);
        public final String A00;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AddExternalLinkData(String str) {
            super(R.drawable.instagram_add_pano_outline_24);
            0qQ.A0B(str, 1);
            this.A00 = str;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof AddExternalLinkData) && 0qQ.A0K(this.A00, ((AddExternalLinkData) obj).A00));
        }

        public final int hashCode() {
            return this.A00.hashCode();
        }

        public final String toString() {
            return 002.A0S("AddExternalLinkData(title=", this.A00, ')');
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A00);
        }
    }

    public final class AddExternalLinkDataEnhanced extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(78);
        public final String A00;
        public final boolean A01;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AddExternalLinkDataEnhanced(String str, boolean z) {
            super(R.drawable.instagram_add_pano_outline_24);
            0qQ.A0B(str, 1);
            this.A00 = str;
            this.A01 = z;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddExternalLinkDataEnhanced) {
                    AddExternalLinkDataEnhanced addExternalLinkDataEnhanced = (AddExternalLinkDataEnhanced) obj;
                    if (!0qQ.A0K(this.A00, addExternalLinkDataEnhanced.A00) || this.A01 != addExternalLinkDataEnhanced.A01) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public final int hashCode() {
            return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
        }
    }

    public final class AddExternalLinkDataV2 extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(79);
        public final String A00;
        public final boolean A01;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AddExternalLinkDataV2(String str, boolean z) {
            super(R.drawable.instagram_add_pano_outline_24);
            0qQ.A0B(str, 1);
            this.A00 = str;
            this.A01 = z;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddExternalLinkDataV2) {
                    AddExternalLinkDataV2 addExternalLinkDataV2 = (AddExternalLinkDataV2) obj;
                    if (!0qQ.A0K(this.A00, addExternalLinkDataV2.A00) || this.A01 != addExternalLinkDataV2.A01) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public final int hashCode() {
            return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
        }
    }

    public final class AddFacebookLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(80);
        public final String A00;
        public final boolean A01;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AddFacebookLinkData(String str, boolean z) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            0qQ.A0B(str, 1);
            this.A00 = str;
            this.A01 = z;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddFacebookLinkData) {
                    AddFacebookLinkData addFacebookLinkData = (AddFacebookLinkData) obj;
                    if (!0qQ.A0K(this.A00, addFacebookLinkData.A00) || this.A01 != addFacebookLinkData.A01) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return 002.A0m("AddFacebookLinkData(title=", this.A00, AnonymousClass000.A00(842), ')', this.A01);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public final int hashCode() {
            return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
        }
    }

    public final class AddFacebookPageLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(81);
        public final String A00;
        public final boolean A01;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AddFacebookPageLinkData(String str, boolean z) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            0qQ.A0B(str, 1);
            this.A00 = str;
            this.A01 = z;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddFacebookPageLinkData) {
                    AddFacebookPageLinkData addFacebookPageLinkData = (AddFacebookPageLinkData) obj;
                    if (!0qQ.A0K(this.A00, addFacebookPageLinkData.A00) || this.A01 != addFacebookPageLinkData.A01) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return 002.A0m("AddFacebookPageLinkData(title=", this.A00, AnonymousClass000.A00(842), ')', this.A01);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public final int hashCode() {
            return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
        }
    }

    public final class BottomMessageData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(82);
        public final CharSequence A00;
        public final String A01;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BottomMessageData) {
                    BottomMessageData bottomMessageData = (BottomMessageData) obj;
                    if (!0qQ.A0K(this.A00, bottomMessageData.A00) || !0qQ.A0K(this.A01, bottomMessageData.A01)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            TextUtils.writeToParcel(this.A00, parcel, i);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return C41845B3m.A01(this.A01, AnonymousClass7TE.A0K(this.A00));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BottomMessageData(String str, CharSequence charSequence) {
            super(R.drawable.instagram_link_pano_outline_24);
            AnonymousClass7TG.A1O(charSequence, str);
            this.A00 = charSequence;
            this.A01 = str;
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("BottomMessageData(text=");
            A1A.append(this.A00);
            A1A.append(", title=");
            A1A.append(this.A01);
            return AnonymousClass7TG.A0p(A1A);
        }
    }

    public final class ExternalLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(83);
        public final String A00;
        public final String A01;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExternalLinkData) {
                    ExternalLinkData externalLinkData = (ExternalLinkData) obj;
                    if (!0qQ.A0K(this.A00, externalLinkData.A00) || !0qQ.A0K(this.A01, externalLinkData.A01)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return 002.A0v("ExternalLinkData(title=", this.A00, C273654mx.A00(204), this.A01, ')');
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ExternalLinkData(String str, String str2) {
            super(R.drawable.instagram_link_pano_outline_24);
            AnonymousClass7TG.A1O(str, str2);
            this.A00 = str;
            this.A01 = str2;
        }
    }

    public final class ExternalLinkDataEnhanced extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(84);
        public final String A00;
        public final String A01;
        public final String A02;
        public final String A03;
        public final String A04;
        public final boolean A05;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExternalLinkDataEnhanced) {
                    ExternalLinkDataEnhanced externalLinkDataEnhanced = (ExternalLinkDataEnhanced) obj;
                    if (!0qQ.A0K(this.A04, externalLinkDataEnhanced.A04) || !0qQ.A0K(this.A03, externalLinkDataEnhanced.A03) || !0qQ.A0K(this.A01, externalLinkDataEnhanced.A01) || !0qQ.A0K(this.A02, externalLinkDataEnhanced.A02) || !0qQ.A0K(this.A00, externalLinkDataEnhanced.A00) || this.A05 != externalLinkDataEnhanced.A05) {
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
            parcel.writeString(this.A03);
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A05 ? 1 : 0);
        }

        public final int hashCode() {
            int A08 = AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0O(this.A04));
            return DbS.A06(this.A05, (((AnonymousClass7TF.A08(this.A01, A08) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A00)) * 31);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ExternalLinkDataEnhanced(String str, String str2, String str3, String str4, String str5, boolean z) {
            super(R.drawable.instagram_link_pano_outline_24);
            AnonymousClass7TG.A1U(str, str2, str3);
            this.A04 = str;
            this.A03 = str2;
            this.A01 = str3;
            this.A02 = str4;
            this.A00 = str5;
            this.A05 = z;
        }
    }

    public final class ExternalLinkDataV2 extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(85);
        public final String A00;
        public final String A01;
        public final String A02;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExternalLinkDataV2) {
                    ExternalLinkDataV2 externalLinkDataV2 = (ExternalLinkDataV2) obj;
                    if (!0qQ.A0K(this.A02, externalLinkDataV2.A02) || !0qQ.A0K(this.A01, externalLinkDataV2.A01) || !0qQ.A0K(this.A00, externalLinkDataV2.A00)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A02);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public final int hashCode() {
            return C41845B3m.A01(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02)));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ExternalLinkDataV2(String str, String str2, String str3) {
            super(R.drawable.instagram_link_pano_outline_24);
            AnonymousClass7TG.A1U(str, str2, str3);
            this.A02 = str;
            this.A01 = str2;
            this.A00 = str3;
        }
    }

    public final class FacebookLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(86);
        public final String A00;
        public final String A01;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FacebookLinkData(String str, String str2) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            0qQ.A0B(str, 1);
            this.A01 = str;
            this.A00 = str2;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FacebookLinkData) {
                    FacebookLinkData facebookLinkData = (FacebookLinkData) obj;
                    if (!0qQ.A0K(this.A01, facebookLinkData.A01) || !0qQ.A0K(this.A00, facebookLinkData.A00)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return 002.A0v("FacebookLinkData(title=", this.A01, AnonymousClass000.A00(853), this.A00, ')');
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public final int hashCode() {
            return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00);
        }
    }

    public final class FacebookLinkDataV2 extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(87);
        public final String A00;
        public final String A01;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FacebookLinkDataV2(String str, String str2) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            0qQ.A0B(str, 1);
            this.A01 = str;
            this.A00 = str2;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FacebookLinkDataV2) {
                    FacebookLinkDataV2 facebookLinkDataV2 = (FacebookLinkDataV2) obj;
                    if (!0qQ.A0K(this.A01, facebookLinkDataV2.A01) || !0qQ.A0K(this.A00, facebookLinkDataV2.A00)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public final int hashCode() {
            return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00);
        }
    }

    public final class FacebookPageLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new LVO(88);
        public final String A00;
        public final String A01;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FacebookPageLinkData(String str, String str2) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            0qQ.A0B(str, 1);
            this.A01 = str;
            this.A00 = str2;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FacebookPageLinkData) {
                    FacebookPageLinkData facebookPageLinkData = (FacebookPageLinkData) obj;
                    if (!0qQ.A0K(this.A01, facebookPageLinkData.A01) || !0qQ.A0K(this.A00, facebookPageLinkData.A00)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return 002.A0v("FacebookPageLinkData(title=", this.A01, AnonymousClass000.A00(853), this.A00, ')');
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public final int hashCode() {
            return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00);
        }
    }

    public final boolean A00() {
        if (this instanceof AddFacebookPageLinkData) {
            return ((AddFacebookPageLinkData) this).A01;
        }
        if (this instanceof AddFacebookLinkData) {
            return ((AddFacebookLinkData) this).A01;
        }
        if (this instanceof AddExternalLinkDataV2) {
            return ((AddExternalLinkDataV2) this).A01;
        }
        if (this instanceof AddExternalLinkDataEnhanced) {
            return ((AddExternalLinkDataEnhanced) this).A01;
        }
        return false;
    }

    public AccountLinkModel(int i) {
        this.A00 = i;
    }
}
