package com.facebook.pushlite.model;

import X.0KC;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.AnonymousClass9FA;
import X.C250863mB;
import X.C255463uA;
import X.C41845B3m;
import X.C66580MXl;
import X.DbT;
import X.MZS;
import X.MZU;
import X.SWZ;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.RemoteMessage;
import kotlinx.serialization.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

@Serializable
public final class PushInfraMetaData extends AnonymousClass0T0 implements Parcelable {
    public static final C250863mB A09 = AnonymousClass9FA.A00(MZS.A00, C250863mB.A03);
    public static final Parcelable.Creator CREATOR = new SWZ(45);
    public static final Companion Companion = new Object();
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final class Companion {
        public static final PushInfraMetaData A00(String str) {
            if (str != null) {
                try {
                    return (PushInfraMetaData) PushInfraMetaData.A09.A00(str, MZU.A00);
                } catch (Exception e) {
                    0KC.A0F("PushInfraMetaData", "Error parsing PIM from json string", e);
                }
            }
            return new PushInfraMetaData((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
        }

        public final PushInfraMetaData A01(Intent intent) {
            String stringExtra;
            if (intent.hasExtra("pim")) {
                String stringExtra2 = intent.getStringExtra("pim");
                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                    return A00(stringExtra2);
                }
            } else if (intent.hasExtra("data") && (stringExtra = intent.getStringExtra("data")) != null) {
                try {
                    JSONObject A17 = C66580MXl.A17(stringExtra);
                    if (A17.has("pim")) {
                        C250863mB r0 = PushInfraMetaData.A09;
                        return A00(A17.getString("pim"));
                    }
                } catch (JSONException e) {
                    0KC.A0F("PushInfraMetaData", "Could not extract PIM, error parsing json \"data\" field on intent", e);
                }
            }
            return new PushInfraMetaData((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
        }

        public final C255463uA serializer() {
            return MZU.A00;
        }

        public final PushInfraMetaData A02(RemoteMessage remoteMessage) {
            if (remoteMessage.A02().containsKey("pim")) {
                return A00(DbT.A11("pim", remoteMessage.A02()));
            }
            return new PushInfraMetaData((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
        }
    }

    public PushInfraMetaData() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PushInfraMetaData) {
                PushInfraMetaData pushInfraMetaData = (PushInfraMetaData) obj;
                if (!0qQ.A0K(this.A05, pushInfraMetaData.A05) || !0qQ.A0K(this.A00, pushInfraMetaData.A00) || !0qQ.A0K(this.A07, pushInfraMetaData.A07) || !0qQ.A0K(this.A02, pushInfraMetaData.A02) || !0qQ.A0K(this.A03, pushInfraMetaData.A03) || !0qQ.A0K(this.A04, pushInfraMetaData.A04) || !0qQ.A0K(this.A08, pushInfraMetaData.A08) || !0qQ.A0K(this.A06, pushInfraMetaData.A06) || !0qQ.A0K(this.A01, pushInfraMetaData.A01)) {
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
        AnonymousClass7TG.A15(parcel, this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A01);
    }

    public PushInfraMetaData(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A05 = str;
        this.A00 = l;
        this.A07 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A08 = str6;
        this.A06 = str7;
        this.A01 = str8;
    }

    public /* synthetic */ PushInfraMetaData(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        if ((i & 1) == 0) {
            this.A05 = null;
        } else {
            this.A05 = str;
        }
        if ((i & 2) == 0) {
            this.A00 = null;
        } else {
            this.A00 = l;
        }
        if ((i & 4) == 0) {
            this.A07 = null;
        } else {
            this.A07 = str2;
        }
        if ((i & 8) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str3;
        }
        if ((i & 16) == 0) {
            this.A03 = null;
        } else {
            this.A03 = str4;
        }
        if ((i & 32) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str5;
        }
        if ((i & 64) == 0) {
            this.A08 = null;
        } else {
            this.A08 = str6;
        }
        if ((i & 128) == 0) {
            this.A06 = null;
        } else {
            this.A06 = str7;
        }
        if ((i & 256) == 0) {
            this.A01 = null;
        } else {
            this.A01 = str8;
        }
    }
}
