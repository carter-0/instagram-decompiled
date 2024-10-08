package com.google.android.gms.fido.u2f.api.common;

import X.C301145yd;
import X.Pxf;
import X.Pxg;
import X.SA1;
import X.SWR;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = SWR.A00(6);
    public Set A00;
    public final Uri A01;
    public final ChannelIdValue A02;
    public final Double A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RegisterRequestParams) {
                RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
                if (SA1.A01(this.A04, registerRequestParams.A04) && SA1.A01(this.A03, registerRequestParams.A03) && SA1.A01(this.A01, registerRequestParams.A01) && SA1.A01(this.A06, registerRequestParams.A06)) {
                    List list = this.A07;
                    List list2 = registerRequestParams.A07;
                    if (list != null ? !(list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) : list2 == null) {
                        if (!SA1.A01(this.A02, registerRequestParams.A02) || !SA1.A01(this.A05, registerRequestParams.A05)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A01, this.A03, this.A06, this.A07, this.A02, this.A05});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r2.A01 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r2.A02 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r12.isEmpty() != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RegisterRequestParams(android.net.Uri r7, com.google.android.gms.fido.u2f.api.common.ChannelIdValue r8, java.lang.Double r9, java.lang.Integer r10, java.lang.String r11, java.util.List r12, java.util.List r13) {
        /*
            r6 = this;
            r6.<init>()
            r6.A04 = r10
            r6.A03 = r9
            r6.A01 = r7
            r3 = 0
            if (r12 == 0) goto L_0x0013
            boolean r0 = r12.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.lang.String r0 = "empty list of register requests is provided"
            X.AnonymousClass3Qk.A08(r1, r0)
            r6.A06 = r12
            r6.A07 = r13
            r6.A02 = r8
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            if (r7 == 0) goto L_0x0028
            r5.add(r7)
        L_0x0028:
            java.util.Iterator r4 = r12.iterator()
        L_0x002c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r2 = r4.next()
            com.google.android.gms.fido.u2f.api.common.RegisterRequest r2 = (com.google.android.gms.fido.u2f.api.common.RegisterRequest) r2
            if (r7 != 0) goto L_0x003f
            java.lang.String r0 = r2.A01
            r1 = 0
            if (r0 == 0) goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            java.lang.String r0 = "register request has null appId and no request appId is provided"
            X.AnonymousClass3Qk.A08(r1, r0)
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x002c
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r5.add(r0)
            goto L_0x002c
        L_0x0052:
            java.util.Iterator r4 = r13.iterator()
        L_0x0056:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r2 = r4.next()
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r2 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r2
            if (r7 != 0) goto L_0x0069
            java.lang.String r0 = r2.A02
            r1 = 0
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r1 = 1
        L_0x006a:
            java.lang.String r0 = "registered key has null appId and no request appId is provided"
            X.AnonymousClass3Qk.A08(r1, r0)
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L_0x0056
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r5.add(r0)
            goto L_0x0056
        L_0x007c:
            r6.A00 = r5
            if (r11 == 0) goto L_0x0088
            int r1 = r11.length()
            r0 = 80
            if (r1 > r0) goto L_0x0089
        L_0x0088:
            r3 = 1
        L_0x0089:
            java.lang.String r0 = "Display Hint cannot be longer than 80 characters"
            X.AnonymousClass3Qk.A08(r3, r0)
            r6.A05 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.<init>(android.net.Uri, com.google.android.gms.fido.u2f.api.common.ChannelIdValue, java.lang.Double, java.lang.Integer, java.lang.String, java.util.List, java.util.List):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        Integer num = this.A04;
        if (num != null) {
            parcel.writeInt(262146);
            Pxf.A19(parcel, num);
        }
        Double d = this.A03;
        if (d != null) {
            Pxg.A1H(parcel, d, 524291);
        }
        C301145yd.A0A(parcel, this.A01, 4, i, false);
        C301145yd.A0E(parcel, this.A06, 5, false);
        C301145yd.A0E(parcel, this.A07, 6, false);
        C301145yd.A0A(parcel, this.A02, 7, i, false);
        C301145yd.A0C(parcel, this.A05, 8, false);
        C301145yd.A06(parcel, A032);
    }
}
