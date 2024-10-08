package com.meta.flytrap.attachment.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C255463uA;
import X.C51974G9v;
import X.C73536PeS;
import X.DbS;
import X.G9t;
import X.SWU;
import X.VJ6;
import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.Serializable;

@Serializable
public final class BugReportAttachment implements Parcelable {
    public static final C255463uA[] A05 = {null, null, (C255463uA) BugReportAttachmentMediaType.A00.getValue(), (C255463uA) BugReportAttachmentMediaSource.A00.getValue(), null};
    public static final Parcelable.Creator CREATOR = new SWU(19);
    public static final Companion Companion = new Object();
    public final BugReportAttachmentMediaSource A00;
    public final BugReportAttachmentMediaType A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final class Companion {
        public final C255463uA serializer() {
            return C73536PeS.A00;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BugReportAttachment) {
                BugReportAttachment bugReportAttachment = (BugReportAttachment) obj;
                if (!(0qQ.A0K(this.A03, bugReportAttachment.A03) && 0qQ.A0K(this.A02, bugReportAttachment.A02) && this.A01 == bugReportAttachment.A01 && this.A00 == bugReportAttachment.A00 && this.A04 == bugReportAttachment.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        AnonymousClass7TE.A1T(parcel, this.A01);
        this.A00.writeToParcel(parcel, i);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public /* synthetic */ BugReportAttachment(BugReportAttachmentMediaSource bugReportAttachmentMediaSource, BugReportAttachmentMediaType bugReportAttachmentMediaType, String str, String str2, int i, boolean z) {
        if (15 != (i & 15)) {
            VJ6.A00(C73536PeS.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A02 = str2;
        this.A01 = bugReportAttachmentMediaType;
        this.A00 = bugReportAttachmentMediaSource;
        if ((i & 16) == 0) {
            this.A04 = true;
        } else {
            this.A04 = z;
        }
    }

    public final int hashCode() {
        return DbS.A06(this.A04, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0O(this.A03)))));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BugReportAttachment(path=");
        A1A.append(this.A03);
        A1A.append(", generatorName=");
        A1A.append(this.A02);
        A1A.append(", mediaType=");
        A1A.append(this.A01);
        A1A.append(", mediaSource=");
        A1A.append(this.A00);
        A1A.append(", async=");
        return G9t.A1C(A1A, this.A04);
    }

    public BugReportAttachment(BugReportAttachmentMediaSource bugReportAttachmentMediaSource, BugReportAttachmentMediaType bugReportAttachmentMediaType, String str, String str2, boolean z) {
        C51974G9v.A1P(str, str2, bugReportAttachmentMediaType, bugReportAttachmentMediaSource);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = bugReportAttachmentMediaType;
        this.A00 = bugReportAttachmentMediaSource;
        this.A04 = z;
    }
}
