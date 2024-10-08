package com.instagram.direct.visual.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51975G9x;
import X.W6E;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

public final class DirectVisualMessageItemModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(15);
    public final int A00;
    public final long A01;
    public final MediaFields A02;
    public final PrivacyMediaOverlayViewModel A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public abstract class MediaFields implements Parcelable {

        public final class RemixMedia extends MediaFields {
            public static final Parcelable.Creator CREATOR = new W6E(16);
            public final Uri A00;
            public final Uri A01;
            public final String A02;
            public final String A03;

            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof RemixMedia) {
                        RemixMedia remixMedia = (RemixMedia) obj;
                        if (!0qQ.A0K(this.A00, remixMedia.A00) || !0qQ.A0K(this.A01, remixMedia.A01) || !0qQ.A0K(this.A03, remixMedia.A03) || !0qQ.A0K(this.A02, remixMedia.A02)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                0qQ.A0B(parcel, 0);
                parcel.writeParcelable(this.A00, i);
                parcel.writeParcelable(this.A01, i);
                parcel.writeString(this.A03);
                parcel.writeString(this.A02);
            }

            public final int hashCode() {
                return ((AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A02);
            }

            public RemixMedia(Uri uri, Uri uri2, String str, String str2) {
                AnonymousClass7TG.A1O(uri, uri2);
                this.A00 = uri;
                this.A01 = uri2;
                this.A03 = str;
                this.A02 = str2;
            }

            public final String toString() {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("RemixMedia(contentUri=");
                A1A.append(this.A00);
                A1A.append(", previewUri=");
                A1A.append(this.A01);
                A1A.append(", reshareMode=");
                A1A.append(this.A03);
                A1A.append(", originalMediaUrl=");
                return C51975G9x.A0i(this.A02, A1A);
            }
        }

        public final class TamMedia extends MediaFields {
            public static final Parcelable.Creator CREATOR = new W6E(17);
            public final Uri A00;
            public final Uri A01;

            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof TamMedia) {
                        TamMedia tamMedia = (TamMedia) obj;
                        if (!0qQ.A0K(this.A00, tamMedia.A00) || !0qQ.A0K(this.A01, tamMedia.A01)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                0qQ.A0B(parcel, 0);
                parcel.writeParcelable(this.A00, i);
                parcel.writeParcelable(this.A01, i);
            }

            public final int hashCode() {
                return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
            }

            public TamMedia(Uri uri, Uri uri2) {
                AnonymousClass7TG.A1O(uri, uri2);
                this.A00 = uri;
                this.A01 = uri2;
            }

            public final String toString() {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("TamMedia(contentUri=");
                A1A.append(this.A00);
                A1A.append(", previewUri=");
                return AnonymousClass7TG.A0n(this.A01, A1A);
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A04);
    }

    public DirectVisualMessageItemModel(MediaFields mediaFields, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, String str, String str2, String str3, int i, long j, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        0qQ.A0B(mediaFields, 6);
        this.A05 = str;
        this.A06 = str2;
        this.A01 = j;
        this.A07 = z;
        this.A00 = i;
        this.A02 = mediaFields;
        this.A03 = privacyMediaOverlayViewModel;
        this.A04 = str3;
    }
}
