package com.instagram.settings.privacy.messages;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.JTR;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectMessagesInteropOptionsViewModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(31);
    public DirectMessageInteropReachabilityOptions A00;
    public DirectMessageInteropReachabilityOptions A01;
    public DirectMessageInteropReachabilityOptions A02;
    public DirectMessageInteropReachabilityOptions A03;
    public DirectMessageInteropReachabilityOptions A04;
    public DirectMessageInteropReachabilityOptions A05;
    public DirectMessageInteropReachabilityOptions A06;
    public DirectMessageInteropReachabilityOptions A07;
    public DirectMessageInteropReachabilityOptions A08;
    public DirectMessageInteropReachabilityOptions A09;

    public DirectMessagesInteropOptionsViewModel() {
        this((DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null, (DirectMessageInteropReachabilityOptions) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMessagesInteropOptionsViewModel) {
                DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = (DirectMessagesInteropOptionsViewModel) obj;
                if (!(this.A05 == directMessagesInteropOptionsViewModel.A05 && this.A00 == directMessagesInteropOptionsViewModel.A00 && this.A01 == directMessagesInteropOptionsViewModel.A01 && this.A09 == directMessagesInteropOptionsViewModel.A09 && this.A08 == directMessagesInteropOptionsViewModel.A08 && this.A07 == directMessagesInteropOptionsViewModel.A07 && this.A03 == directMessagesInteropOptionsViewModel.A03 && this.A02 == directMessagesInteropOptionsViewModel.A02 && this.A04 == directMessagesInteropOptionsViewModel.A04 && this.A06 == directMessagesInteropOptionsViewModel.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C66583MXo.A0u(parcel, this.A05, i);
        C66583MXo.A0u(parcel, this.A00, i);
        C66583MXo.A0u(parcel, this.A01, i);
        C66583MXo.A0u(parcel, this.A09, i);
        C66583MXo.A0u(parcel, this.A08, i);
        C66583MXo.A0u(parcel, this.A07, i);
        C66583MXo.A0u(parcel, this.A03, i);
        C66583MXo.A0u(parcel, this.A02, i);
        C66583MXo.A0u(parcel, this.A04, i);
        C66583MXo.A0u(parcel, this.A06, i);
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public final DirectMessageInteropReachabilityOptions A00(String str) {
        switch (JTR.A0F(str)) {
            case -2143256302:
                if (str.equals("fb_friends")) {
                    return this.A00;
                }
                break;
            case -1890055046:
                if (str.equals("fb_friends_of_friends")) {
                    return this.A01;
                }
                break;
            case -1839818691:
                if (str.equals("people_with_your_phone_number")) {
                    return this.A09;
                }
                break;
            case -1275916548:
                if (str.equals("fb_messaged_your_page")) {
                    return this.A03;
                }
                break;
            case -737267292:
                if (str.equals("eligible_for_bc_partnership")) {
                    return null;
                }
                break;
            case -456614348:
                if (str.equals("ig_followers")) {
                    return this.A05;
                }
                break;
            case -371252023:
                if (str.equals("ig_verified")) {
                    return this.A06;
                }
                break;
            case -8227469:
                if (str.equals("fb_liked_or_followed_your_page")) {
                    return this.A02;
                }
                break;
            case 949752640:
                if (str.equals("others_on_fb")) {
                    return this.A07;
                }
                break;
            case 949752738:
                if (str.equals("others_on_ig")) {
                    return this.A08;
                }
                break;
            case 1767124056:
                if (str.equals("group_message_setting")) {
                    return this.A04;
                }
                break;
        }
        throw AnonymousClass7TE.A0w(002.A0g("DirectConstants.MessageInteropOption ", str, " not implemented"));
    }

    public DirectMessagesInteropOptionsViewModel(DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions4, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions5, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions6, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions7, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions8, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions9, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions10) {
        this.A05 = directMessageInteropReachabilityOptions;
        this.A00 = directMessageInteropReachabilityOptions2;
        this.A01 = directMessageInteropReachabilityOptions3;
        this.A09 = directMessageInteropReachabilityOptions4;
        this.A08 = directMessageInteropReachabilityOptions5;
        this.A07 = directMessageInteropReachabilityOptions6;
        this.A03 = directMessageInteropReachabilityOptions7;
        this.A02 = directMessageInteropReachabilityOptions8;
        this.A04 = directMessageInteropReachabilityOptions9;
        this.A06 = directMessageInteropReachabilityOptions10;
    }
}
