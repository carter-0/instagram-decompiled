package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.HUA;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class WhatsAppAttributionInfoImpl extends AnonymousClass0T0 implements Parcelable, WhatsAppAttributionInfo {
    public static final Parcelable.Creator CREATOR = new C376419Hx(55);
    public final String A00;
    public final String A01;

    public final WhatsAppAttributionInfoImpl FDR() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppAttributionInfoImpl) {
                WhatsAppAttributionInfoImpl whatsAppAttributionInfoImpl = (WhatsAppAttributionInfoImpl) obj;
                if (!0qQ.A0K(this.A00, whatsAppAttributionInfoImpl.A00) || !0qQ.A0K(this.A01, whatsAppAttributionInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final String AYR() {
        return this.A00;
    }

    public final String AZI() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCTTMessagingWhatsAppAttributionLinkInfo", HUA.A00(this));
    }

    public WhatsAppAttributionInfoImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
