package com.instagram.reels.smb.model;

import X.0qQ;
import X.17W;
import X.A16;
import X.AnonymousClass05K;
import X.AnonymousClass0T0;
import X.AnonymousClass15o;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C317876nz;
import X.C369248u6;
import X.C61076JwE;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.StringWriter;

public final class ProfileStickerModel extends AnonymousClass0T0 implements Parcelable {
    public static final C317876nz A07 = C317876nz.A1Y;
    public static final Integer A08 = AnonymousClass05K.A01;
    public static final Parcelable.Creator CREATOR = new W6F(7);
    public C61076JwE[] A00;
    public final C317876nz A01;
    public final ProfileStickerAiAgentData A02;
    public final User A03;
    public final Integer A04;
    public final Integer A05;
    public final boolean A06;

    public ProfileStickerModel(C317876nz r2, ProfileStickerAiAgentData profileStickerAiAgentData, User user, Integer num, Integer num2) {
        0qQ.A0B(num, 3);
        this.A03 = user;
        this.A01 = r2;
        this.A05 = num;
        this.A04 = num2;
        this.A02 = profileStickerAiAgentData;
        this.A06 = AnonymousClass7TF.A1W(num2, AnonymousClass05K.A00);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileStickerModel) {
                ProfileStickerModel profileStickerModel = (ProfileStickerModel) obj;
                if (!0qQ.A0K(this.A03, profileStickerModel.A03) || !0qQ.A0K(this.A01, profileStickerModel.A01) || this.A05 != profileStickerModel.A05 || this.A04 != profileStickerModel.A04 || !0qQ.A0K(this.A02, profileStickerModel.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        C317876nz r3 = this.A01;
        0qQ.A0B(r3, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        C369248u6.A00(A0A, r3);
        A0A.close();
        parcel.writeString(stringWriter.toString());
        parcel.writeString(A16.A00(this.A05));
        switch (this.A04.intValue()) {
            case 1:
                str = "PERSONAL";
                break;
            case 2:
                str = "AI_AGENT";
                break;
            default:
                str = "BUSINESS";
                break;
        }
        parcel.writeString(str);
        ProfileStickerAiAgentData profileStickerAiAgentData = this.A02;
        if (profileStickerAiAgentData == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        profileStickerAiAgentData.writeToParcel(parcel, i);
    }

    public final String A00() {
        int length;
        C61076JwE[] jwEArr = this.A00;
        if (jwEArr == null || (length = jwEArr.length) < 3 || jwEArr[0] == null || jwEArr[1] == null || jwEArr[2] == null) {
            return null;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int i = 0;
        do {
            C61076JwE jwE = jwEArr[i];
            if (A1A.length() > 0) {
                A1A.append(",");
            }
            if (jwE != null) {
                A1A.append(jwE.A01);
            }
            i++;
        } while (i < length);
        return A1A.toString();
    }

    public final int hashCode() {
        String str;
        int A072 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0C(this.A03) * 31);
        Integer num = this.A05;
        int A0B = AnonymousClass7TG.A0B(num, A16.A00(num), A072);
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "PERSONAL";
                break;
            case 2:
                str = "AI_AGENT";
                break;
            default:
                str = "BUSINESS";
                break;
        }
        return ((A0B + str.hashCode() + intValue) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
