package com.instagram.common.clips.model;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

public abstract class ClipSegment implements Parcelable {

    public final class PhotoSegment extends ClipSegment {
        public static final Parcelable.Creator CREATOR = new W6D(82);
        public final int A00;
        public final int A01;
        public final int A02;
        public final int A03;
        public final LayoutTransform A04;
        public final String A05;
        public final int A06;
        public final Integer A07;
        public final Integer A08;
        public final String A09;
        public final String A0A;
        public final boolean A0B;

        public PhotoSegment(LayoutTransform layoutTransform, Integer num, Integer num2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, boolean z) {
            0qQ.A0B(str, 1);
            this.A05 = str;
            this.A03 = i;
            this.A01 = i2;
            this.A02 = i3;
            this.A00 = i4;
            this.A04 = layoutTransform;
            this.A09 = str2;
            this.A0A = str3;
            this.A07 = num;
            this.A08 = num2;
            this.A0B = z;
            this.A06 = i5;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PhotoSegment) {
                    PhotoSegment photoSegment = (PhotoSegment) obj;
                    if (!0qQ.A0K(this.A05, photoSegment.A05) || this.A03 != photoSegment.A03 || this.A01 != photoSegment.A01 || this.A02 != photoSegment.A02 || this.A00 != photoSegment.A00 || !0qQ.A0K(this.A04, photoSegment.A04) || !0qQ.A0K(this.A09, photoSegment.A09) || !0qQ.A0K(this.A0A, photoSegment.A0A) || !0qQ.A0K(this.A07, photoSegment.A07) || !0qQ.A0K(this.A08, photoSegment.A08) || this.A0B != photoSegment.A0B || this.A06 != photoSegment.A06) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A05);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A02);
            parcel.writeInt(this.A00);
            LayoutTransform layoutTransform = this.A04;
            if (layoutTransform == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                layoutTransform.writeToParcel(parcel, i);
            }
            parcel.writeString(this.A09);
            parcel.writeString(this.A0A);
            AnonymousClass7TG.A16(parcel, this.A07, 0, 1);
            AnonymousClass7TG.A16(parcel, this.A08, 0, 1);
            parcel.writeInt(this.A0B ? 1 : 0);
            parcel.writeInt(this.A06);
        }

        public final int hashCode() {
            return AnonymousClass7TF.A09(this.A0B, (((((((((((((((((AnonymousClass7TE.A0O(this.A05) + this.A03) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A08)) * 31) + this.A06;
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("PhotoSegment(filePath=");
            A1A.append(this.A05);
            A1A.append(", width=");
            A1A.append(this.A03);
            A1A.append(", height=");
            A1A.append(this.A01);
            A1A.append(", rotation=");
            A1A.append(this.A02);
            A1A.append(", durationInMs=");
            A1A.append(this.A00);
            A1A.append(C273654mx.A00(199));
            A1A.append(this.A04);
            A1A.append(C273654mx.A00(454));
            A1A.append(this.A09);
            A1A.append(C273654mx.A00(455));
            A1A.append(this.A0A);
            A1A.append(", transitionInDurationInMs=");
            A1A.append(this.A07);
            A1A.append(", transitionOutDurationInMs=");
            A1A.append(this.A08);
            A1A.append(", isAutoEnhanceApplied=");
            A1A.append(this.A0B);
            A1A.append(", autoEnhanceStrength=");
            A1A.append(this.A06);
            return AnonymousClass7TG.A0p(A1A);
        }
    }

    public final class VideoSegment extends ClipSegment {
        public static final Parcelable.Creator CREATOR = new W6D(83);
        public final float A00;
        public final float A01;
        public final int A02;
        public final int A03;
        public final int A04;
        public final int A05;
        public final int A06;
        public final int A07;
        public final int A08;
        public final long A09;
        public final ImmutableList A0A;
        public final LayoutTransform A0B;
        public final Integer A0C;
        public final Integer A0D;
        public final String A0E;
        public final String A0F;
        public final String A0G;
        public final boolean A0H;
        public final boolean A0I;

        public VideoSegment(ImmutableList immutableList, LayoutTransform layoutTransform, Integer num, Integer num2, String str, String str2, String str3, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, boolean z, boolean z2) {
            0qQ.A0B(str, 1);
            0qQ.A0B(immutableList, 6);
            this.A0E = str;
            this.A08 = i;
            this.A03 = i2;
            this.A05 = i3;
            this.A0B = layoutTransform;
            this.A0A = immutableList;
            this.A09 = j;
            this.A04 = i4;
            this.A07 = i5;
            this.A06 = i6;
            this.A00 = f;
            this.A01 = f2;
            this.A0H = z;
            this.A0F = str2;
            this.A0G = str3;
            this.A0C = num;
            this.A0D = num2;
            this.A0I = z2;
            this.A02 = i7;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof VideoSegment) {
                    VideoSegment videoSegment = (VideoSegment) obj;
                    if (!(0qQ.A0K(this.A0E, videoSegment.A0E) && this.A08 == videoSegment.A08 && this.A03 == videoSegment.A03 && this.A05 == videoSegment.A05 && 0qQ.A0K(this.A0B, videoSegment.A0B) && 0qQ.A0K(this.A0A, videoSegment.A0A) && this.A09 == videoSegment.A09 && this.A04 == videoSegment.A04 && this.A07 == videoSegment.A07 && this.A06 == videoSegment.A06 && Float.compare(this.A00, videoSegment.A00) == 0 && Float.compare(this.A01, videoSegment.A01) == 0 && this.A0H == videoSegment.A0H && 0qQ.A0K(this.A0F, videoSegment.A0F) && 0qQ.A0K(this.A0G, videoSegment.A0G) && 0qQ.A0K(this.A0C, videoSegment.A0C) && 0qQ.A0K(this.A0D, videoSegment.A0D) && this.A0I == videoSegment.A0I && this.A02 == videoSegment.A02)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeString(this.A0E);
            parcel.writeInt(this.A08);
            parcel.writeInt(this.A03);
            parcel.writeInt(this.A05);
            LayoutTransform layoutTransform = this.A0B;
            if (layoutTransform == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                layoutTransform.writeToParcel(parcel, i);
            }
            parcel.writeSerializable(this.A0A);
            parcel.writeLong(this.A09);
            parcel.writeInt(this.A04);
            parcel.writeInt(this.A07);
            parcel.writeInt(this.A06);
            parcel.writeFloat(this.A00);
            parcel.writeFloat(this.A01);
            parcel.writeInt(this.A0H ? 1 : 0);
            parcel.writeString(this.A0F);
            parcel.writeString(this.A0G);
            AnonymousClass7TG.A16(parcel, this.A0C, 0, 1);
            AnonymousClass7TG.A16(parcel, this.A0D, 0, 1);
            parcel.writeInt(this.A0I ? 1 : 0);
            parcel.writeInt(this.A02);
        }

        public final int hashCode() {
            int A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A00((((((AnonymousClass7TF.A01(this.A09, AnonymousClass7TF.A07(this.A0A, (((((((AnonymousClass7TE.A0O(this.A0E) + this.A08) * 31) + this.A03) * 31) + this.A05) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31)) + this.A04) * 31) + this.A07) * 31) + this.A06) * 31, this.A00), this.A01);
            return AnonymousClass7TF.A09(this.A0I, (((((((AnonymousClass7TF.A09(this.A0H, A002) + AnonymousClass7TG.A0E(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A0G)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TE.A0L(this.A0D)) * 31) + this.A02;
        }

        public final String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("VideoSegment(filePath=");
            A1A.append(this.A0E);
            A1A.append(", width=");
            A1A.append(this.A08);
            A1A.append(", height=");
            A1A.append(this.A03);
            A1A.append(", rotation=");
            A1A.append(this.A05);
            A1A.append(C273654mx.A00(199));
            A1A.append(this.A0B);
            A1A.append(", videoCropParams=");
            A1A.append(this.A0A);
            A1A.append(C273654mx.A00(1061));
            A1A.append(this.A09);
            A1A.append(", originalDurationInMs=");
            A1A.append(this.A04);
            A1A.append(C273654mx.A00(1163));
            A1A.append(this.A07);
            A1A.append(C273654mx.A00(1162));
            A1A.append(this.A06);
            A1A.append(", recordingSpeed=");
            A1A.append(this.A00);
            A1A.append(", volume=");
            A1A.append(this.A01);
            A1A.append(", hasAudioTrack=");
            A1A.append(this.A0H);
            A1A.append(C273654mx.A00(454));
            A1A.append(this.A0F);
            A1A.append(C273654mx.A00(455));
            A1A.append(this.A0G);
            A1A.append(", transitionInDurationInMs=");
            A1A.append(this.A0C);
            A1A.append(", transitionOutDurationInMs=");
            A1A.append(this.A0D);
            A1A.append(", isAutoEnhanceApplied=");
            A1A.append(this.A0I);
            A1A.append(", autoEnhanceStrength=");
            A1A.append(this.A02);
            return AnonymousClass7TG.A0p(A1A);
        }
    }
}
