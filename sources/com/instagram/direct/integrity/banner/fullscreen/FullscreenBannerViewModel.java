package com.instagram.direct.integrity.banner.fullscreen;

import X.0qQ;
import X.0sn;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class FullscreenBannerViewModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(82);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final class SectionBulletPoint extends AnonymousClass0T0 implements Parcelable {
        public static final Parcelable.Creator CREATOR = new LVP(83);
        public final Integer A00;
        public final String A01;
        public final String A02;
        public final String A03;

        public SectionBulletPoint(Integer num, String str, String str2, String str3) {
            0qQ.A0B(str2, 2);
            this.A01 = str;
            this.A03 = str2;
            this.A02 = str3;
            this.A00 = num;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SectionBulletPoint) {
                    SectionBulletPoint sectionBulletPoint = (SectionBulletPoint) obj;
                    if (!0qQ.A0K(this.A01, sectionBulletPoint.A01) || !0qQ.A0K(this.A03, sectionBulletPoint.A03) || !0qQ.A0K(this.A02, sectionBulletPoint.A02) || !0qQ.A0K(this.A00, sectionBulletPoint.A00)) {
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
            parcel.writeString(this.A03);
            parcel.writeString(this.A02);
            parcel.writeInt(C41847B3o.A00(parcel, this.A00));
        }

        public final int hashCode() {
            return ((AnonymousClass7TF.A08(this.A03, AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("SectionBulletPoint(iconURL=");
            A1A.append(this.A01);
            A1A.append(", text=");
            A1A.append(this.A03);
            A1A.append(", subtext=");
            A1A.append(this.A02);
            A1A.append(", iconImageDrawable=");
            return AnonymousClass7TG.A0n(this.A00, A1A);
        }
    }

    public FullscreenBannerViewModel() {
        this((Integer) null, (String) null, (String) null, (String) null, 0sn.A00);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FullscreenBannerViewModel) {
                FullscreenBannerViewModel fullscreenBannerViewModel = (FullscreenBannerViewModel) obj;
                if (!0qQ.A0K(this.A01, fullscreenBannerViewModel.A01) || !0qQ.A0K(this.A03, fullscreenBannerViewModel.A03) || !0qQ.A0K(this.A02, fullscreenBannerViewModel.A02) || !0qQ.A0K(this.A04, fullscreenBannerViewModel.A04) || !0qQ.A0K(this.A00, fullscreenBannerViewModel.A00)) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        Iterator A1F = C41848B3p.A1F(parcel, this.A04);
        while (A1F.hasNext()) {
            ((SectionBulletPoint) A1F.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A04, ((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FullscreenBannerViewModel(headlineImageURL=");
        A1A.append(this.A01);
        A1A.append(", headlineTitle=");
        A1A.append(this.A03);
        A1A.append(", headlineSubtitle=");
        A1A.append(this.A02);
        A1A.append(", descriptionSection=");
        A1A.append(this.A04);
        A1A.append(", headlineImageDrawable=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public FullscreenBannerViewModel(Integer num, String str, String str2, String str3, List list) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = list;
        this.A00 = num;
    }
}
