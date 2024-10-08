package com.instagram.model.sharelater;

import X.1iA;
import X.AnonymousClass3QO;
import X.AnonymousClass3YP;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.model.mediatype.IgShareLaterMedia;
import com.instagram.model.venue.Venue;
import java.util.List;

public class ShareLaterMedia implements IgShareLaterMedia {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(78);
    public MediaUploadMetadata A00;
    public AnonymousClass3YP A01;
    public 1iA A02;
    public Venue A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public final boolean CJe() {
        return false;
    }

    public final boolean CJs() {
        return false;
    }

    public final boolean Com() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final AnonymousClass3QO AdG() {
        return AnonymousClass3QO.DEFAULT;
    }

    public final MediaUploadMetadata BRG() {
        return this.A00;
    }

    public final boolean BtF() {
        return this.A0A;
    }

    public final boolean CJg() {
        return this.A08;
    }

    public final boolean CT1() {
        return this.A07;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A02.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeBooleanArray(new boolean[]{this.A07});
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if (r3.A2G() == null) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShareLaterMedia(X.1Xj r3) {
        /*
            r2 = this;
            r2.<init>()
            X.3gp r0 = r3.A1T()
            if (r0 == 0) goto L_0x006a
            X.3gp r0 = r3.A1T()
            java.lang.String r0 = r0.A0d
        L_0x000f:
            r2.A04 = r0
            java.lang.String r0 = r3.A30()
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r3.A30()
        L_0x001b:
            r2.A05 = r0
            r3.BR7()
            X.1iA r0 = r3.BR7()
            r2.A02 = r0
            com.instagram.model.venue.Venue r0 = r3.A23()
            r2.A03 = r0
            boolean r0 = r3.A4a()
            r2.A08 = r0
            X.1Xy r0 = r3.A0C
            java.util.List r0 = r0.At1()
            r2.A06 = r0
            boolean r0 = r3.A5u()
            r2.A0A = r0
            java.lang.Double r0 = r3.A2F()
            if (r0 == 0) goto L_0x004d
            java.lang.Double r1 = r3.A2G()
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r2.A09 = r0
            X.3YP r0 = r3.A1k()
            r2.A01 = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r1.<init>()
            r2.A00 = r1
            java.lang.String r0 = r3.A2y()
            r1.A03 = r0
            r3.A5O()
            return
        L_0x0067:
            java.lang.String r0 = ""
            goto L_0x001b
        L_0x006a:
            r0 = 0
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.sharelater.ShareLaterMedia.<init>(X.1Xj):void");
    }

    public final void EVs(boolean z) {
        this.A07 = z;
    }
}
