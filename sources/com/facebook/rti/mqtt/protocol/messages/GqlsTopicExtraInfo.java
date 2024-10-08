package com.facebook.rti.mqtt.protocol.messages;

import X.AnonymousClass7TE;
import X.JTR;
import X.Pxf;
import X.Pxg;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

public class GqlsTopicExtraInfo implements TopicExtraInfo {
    public static final Parcelable.Creator CREATOR = SWZ.A01(47);
    public final Boolean A00;
    public final String A01;
    public final Map A02;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r0) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0040
            r2 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001e
            com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo r5 = (com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo) r5
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            return r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0022:
            java.util.Map r1 = r4.A02
            java.util.Map r0 = r5.A02
            if (r1 == 0) goto L_0x002f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0032
            return r2
        L_0x002f:
            if (r0 == 0) goto L_0x0032
            return r2
        L_0x0032:
            java.lang.Boolean r1 = r4.A00
            java.lang.Boolean r0 = r5.A00
            if (r1 == 0) goto L_0x003d
            boolean r3 = r1.equals(r0)
            return r3
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            r3 = 0
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int A0G = JTR.A0G(this.A01) * 31;
        Map map = this.A02;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        int i3 = (A0G + i) * 31;
        Boolean bool = this.A00;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeMap(this.A02);
        parcel.writeValue(this.A00);
    }

    public GqlsTopicExtraInfo(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readHashMap(HashMap.class.getClassLoader());
        this.A00 = (Boolean) parcel.readValue((ClassLoader) null);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GqlsTopicExtraInfo{DESCRIPTION='GraphQL Subscription Infomation', subscription='");
        Pxf.A1P(A1A, this.A01);
        A1A.append(", queryParams=");
        A1A.append(this.A02);
        A1A.append(", forceLogEnabled=");
        return Pxg.A0p(this.A00, A1A);
    }
}
