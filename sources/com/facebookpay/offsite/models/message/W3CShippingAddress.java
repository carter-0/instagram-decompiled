package com.facebookpay.offsite.models.message;

import X.0qQ;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public final class W3CShippingAddress {
    @SerializedName("addressLine")
    public ArrayList<String> addressLine;
    @SerializedName("city")
    public String city;
    @SerializedName("country")
    public String country;
    @SerializedName("dependentLocality")
    public final String dependentLocality;
    @SerializedName("organization")
    public String organization;
    @SerializedName("phone")
    public String phone;
    @SerializedName("postalCode")
    public String postalCode;
    @SerializedName("recipient")
    public String recipient;
    @SerializedName("region")
    public String region;
    @SerializedName("sortingCode")
    public final String sortingCode;

    public W3CShippingAddress(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        0qQ.A0B(str5, 6);
        this.addressLine = arrayList;
        this.city = str;
        this.country = str2;
        this.dependentLocality = str3;
        this.organization = str4;
        this.phone = str5;
        this.postalCode = str6;
        this.recipient = str7;
        this.region = str8;
        this.sortingCode = str9;
    }

    public final void setPhone(String str) {
        0qQ.A0B(str, 0);
        this.phone = str;
    }

    public final ArrayList getAddressLine() {
        return this.addressLine;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDependentLocality() {
        return this.dependentLocality;
    }

    public final String getOrganization() {
        return this.organization;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getRecipient() {
        return this.recipient;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSortingCode() {
        return this.sortingCode;
    }

    public final void setAddressLine(ArrayList arrayList) {
        this.addressLine = arrayList;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setOrganization(String str) {
        this.organization = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final void setRecipient(String str) {
        this.recipient = str;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ W3CShippingAddress(java.util.ArrayList r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r1 = r23
            r10 = r21
            r9 = r20
            r8 = r19
            r7 = r18
            r6 = r17
            r5 = r16
            r4 = r15
            r3 = r14
            r2 = r13
            r0 = r23 & 1
            r11 = 0
            if (r0 == 0) goto L_0x0017
            r2 = r11
        L_0x0017:
            r0 = r23 & 2
            if (r0 == 0) goto L_0x001c
            r3 = r11
        L_0x001c:
            r0 = r23 & 4
            if (r0 == 0) goto L_0x0021
            r4 = r11
        L_0x0021:
            r0 = r23 & 8
            if (r0 == 0) goto L_0x0026
            r5 = r11
        L_0x0026:
            r0 = r23 & 16
            if (r0 == 0) goto L_0x002b
            r6 = r11
        L_0x002b:
            r0 = r23 & 32
            if (r0 == 0) goto L_0x0031
            java.lang.String r7 = ""
        L_0x0031:
            r0 = r23 & 64
            if (r0 == 0) goto L_0x0036
            r8 = r11
        L_0x0036:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003b
            r9 = r11
        L_0x003b:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0040
            r10 = r11
        L_0x0040:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0046
            r11 = r22
        L_0x0046:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.offsite.models.message.W3CShippingAddress.<init>(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public W3CShippingAddress() {
        this((ArrayList) null, (String) null, (String) null, (String) null, (String) null, "", (String) null, (String) null, (String) null, (String) null);
    }
}
