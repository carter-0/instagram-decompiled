package com.facebook.location.signalpackage.parcelable;

import X.0sP;
import X.C11379SQr;
import X.C12608Szs;
import X.C13364TWy;
import X.C21455XbI;
import X.C276164sm;
import X.C51971G9r;
import X.JTR;
import X.Pxf;
import X.PzX;
import X.SG0;
import X.SKP;
import X.SWZ;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo;
import com.facebook.wifiscan.parcelable.ParcelableWifiScanResult;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class ParcelableLocationSignalPackage extends SG0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(25);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r1.equals(r0) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x015a
            r2 = 0
            if (r5 == 0) goto L_0x0018
            boolean r0 = r5 instanceof X.SG0
            if (r0 == 0) goto L_0x0018
            X.SG0 r5 = (X.SG0) r5
            X.4sm r1 = r4.A02
            X.4sm r0 = r5.A02
            if (r1 == 0) goto L_0x0019
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001c
        L_0x0018:
            return r2
        L_0x0019:
            if (r0 == 0) goto L_0x001c
            return r2
        L_0x001c:
            java.lang.String r1 = r4.A0E
            java.lang.String r0 = r5.A0E
            if (r1 == 0) goto L_0x0029
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002c
            return r2
        L_0x0029:
            if (r0 == 0) goto L_0x002c
            return r2
        L_0x002c:
            java.lang.Boolean r1 = r4.A05
            java.lang.Boolean r0 = r5.A05
            if (r1 == 0) goto L_0x0039
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003c
            return r2
        L_0x0039:
            if (r0 == 0) goto L_0x003c
            return r2
        L_0x003c:
            X.SQr r1 = r4.A03
            X.SQr r0 = r5.A03
            if (r1 == 0) goto L_0x0049
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004c
            return r2
        L_0x0049:
            if (r0 == 0) goto L_0x004c
            return r2
        L_0x004c:
            java.util.List r1 = r4.A0N
            java.util.List r0 = r5.A0N
            if (r1 == 0) goto L_0x0059
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005c
            return r2
        L_0x0059:
            if (r0 == 0) goto L_0x005c
            return r2
        L_0x005c:
            java.lang.Boolean r1 = r4.A07
            java.lang.Boolean r0 = r5.A07
            if (r1 == 0) goto L_0x0069
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006c
            return r2
        L_0x0069:
            if (r0 == 0) goto L_0x006c
            return r2
        L_0x006c:
            X.XbI r1 = r4.A00
            X.XbI r0 = r5.A00
            if (r1 == 0) goto L_0x0079
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007c
            return r2
        L_0x0079:
            if (r0 == 0) goto L_0x007c
            return r2
        L_0x007c:
            java.util.List r1 = r4.A0J
            java.util.List r0 = r5.A0J
            if (r1 == 0) goto L_0x0089
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008c
            return r2
        L_0x0089:
            if (r0 == 0) goto L_0x008c
            return r2
        L_0x008c:
            java.util.List r1 = r4.A0I
            java.util.List r0 = r5.A0I
            if (r1 == 0) goto L_0x0099
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009c
            return r2
        L_0x0099:
            if (r0 == 0) goto L_0x009c
            return r2
        L_0x009c:
            java.lang.Boolean r1 = r4.A04
            java.lang.Boolean r0 = r5.A04
            if (r1 == 0) goto L_0x00a9
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ac
            return r2
        L_0x00a9:
            if (r0 == 0) goto L_0x00ac
            return r2
        L_0x00ac:
            java.util.List r1 = r4.A0H
            java.util.List r0 = r5.A0H
            if (r1 == 0) goto L_0x00b9
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00bc
            return r2
        L_0x00b9:
            if (r0 == 0) goto L_0x00bc
            return r2
        L_0x00bc:
            java.lang.Integer r1 = r4.A0B
            java.lang.Integer r0 = r5.A0B
            if (r1 == 0) goto L_0x00c9
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00cc
            return r2
        L_0x00c9:
            if (r0 == 0) goto L_0x00cc
            return r2
        L_0x00cc:
            java.util.List r1 = r4.A0L
            java.util.List r0 = r5.A0L
            if (r1 == 0) goto L_0x00d9
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00dc
            return r2
        L_0x00d9:
            if (r0 == 0) goto L_0x00dc
            return r2
        L_0x00dc:
            java.lang.String r1 = r4.A0C
            java.lang.String r0 = r5.A0C
            if (r1 == 0) goto L_0x00e9
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ec
            return r2
        L_0x00e9:
            if (r0 == 0) goto L_0x00ec
            return r2
        L_0x00ec:
            java.lang.String r1 = r4.A0D
            java.lang.String r0 = r5.A0D
            if (r1 == 0) goto L_0x00f9
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00fc
            return r2
        L_0x00f9:
            if (r0 == 0) goto L_0x00fc
            return r2
        L_0x00fc:
            java.lang.String r1 = r4.A0G
            java.lang.String r0 = r5.A0G
            if (r1 == 0) goto L_0x0109
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x010c
            return r2
        L_0x0109:
            if (r0 == 0) goto L_0x010c
            return r2
        L_0x010c:
            java.lang.Boolean r1 = r4.A06
            java.lang.Boolean r0 = r5.A06
            if (r1 == 0) goto L_0x0119
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x011c
            return r2
        L_0x0119:
            if (r0 == 0) goto L_0x011c
            return r2
        L_0x011c:
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = r5.A0F
            if (r1 == 0) goto L_0x0129
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x012c
            return r2
        L_0x0129:
            if (r0 == 0) goto L_0x012c
            return r2
        L_0x012c:
            java.lang.Integer r1 = r4.A09
            java.lang.Integer r0 = r5.A09
            if (r1 == 0) goto L_0x0139
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x013c
            return r2
        L_0x0139:
            if (r0 == 0) goto L_0x013c
            return r2
        L_0x013c:
            java.lang.Float r1 = r4.A08
            java.lang.Float r0 = r5.A08
            if (r1 == 0) goto L_0x0149
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x014c
            return r2
        L_0x0149:
            if (r0 == 0) goto L_0x014c
            return r2
        L_0x014c:
            java.lang.Integer r1 = r4.A0A
            java.lang.Integer r0 = r5.A0A
            if (r1 == 0) goto L_0x0157
            boolean r3 = r1.equals(r0)
            return r3
        L_0x0157:
            if (r0 == 0) goto L_0x015a
            r3 = 0
        L_0x015a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [X.SG0, com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage] */
    public static ParcelableLocationSignalPackage A00(SG0 sg0) {
        boolean isFromMockProvider;
        C276164sm r2;
        ImmutableList A01;
        ImmutableList A012;
        ImmutableList A013;
        ImmutableList copyOf;
        SG0 sg02 = sg0;
        if (sg0 == null) {
            return null;
        }
        C276164sm r22 = sg02.A02;
        String str = sg02.A0E;
        Boolean bool = sg02.A05;
        C11379SQr sQr = sg02.A03;
        C276164sm r39 = sg02.A01;
        List list = sg02.A0N;
        Boolean bool2 = sg02.A07;
        C21455XbI xbI = sg02.A00;
        List list2 = sg02.A0J;
        List list3 = sg02.A0I;
        Boolean bool3 = sg02.A04;
        List list4 = sg02.A0H;
        Integer num = sg02.A0B;
        List list5 = sg02.A0L;
        String str2 = sg02.A0C;
        String str3 = sg02.A0D;
        String str4 = sg02.A0G;
        Boolean bool4 = sg02.A06;
        String str5 = sg02.A0F;
        Integer num2 = sg02.A09;
        Float f = sg02.A08;
        Integer num3 = sg02.A0A;
        List list6 = sg02.A0M;
        List list7 = sg02.A0K;
        if (r22 == null) {
            r2 = null;
        } else {
            Location location = r22.A00;
            Location location2 = new Location(location);
            Boolean bool5 = r22.A01;
            if (bool5 != null) {
                isFromMockProvider = bool5.booleanValue();
            } else {
                isFromMockProvider = location.isFromMockProvider();
            }
            r2 = new C276164sm(location2, Boolean.valueOf(isFromMockProvider));
        }
        ParcelableWifiScanResult A00 = ParcelableWifiScanResult.A00(sQr);
        if (list == null) {
            A01 = null;
        } else {
            A01 = PzX.A01(PzX.A00(list), 8);
        }
        ParcelableGeneralCellInfo A002 = ParcelableGeneralCellInfo.A00(xbI);
        if (list3 == null) {
            A012 = null;
        } else {
            A012 = PzX.A01(PzX.A00(list3), 1);
        }
        if (list4 == null) {
            A013 = null;
        } else {
            A013 = PzX.A01(PzX.A00(list4), 5);
        }
        if (list5 == null) {
            copyOf = null;
        } else {
            PzX A02 = PzX.A00(list5).A02(new C12608Szs(4, (0sP) C13364TWy.A00));
            copyOf = ImmutableList.copyOf((Iterable) A02.A00.A05(A02));
        }
        return new SG0(A002, r39, r2, A00, bool3, bool, bool4, bool2, f, num2, num3, num, str2, str3, str, str5, str4, A013, A012, list2, list7, copyOf, list6, A01);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int A0E = ((((((C51971G9r.A0E(this.A02) * 31) + JTR.A0G(this.A0E)) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A03)) * 31;
        List list = this.A0N;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int A0E2 = (((((A0E + i) * 31) + C51971G9r.A0E(this.A07)) * 31) + C51971G9r.A0E(this.A00)) * 31;
        List list2 = this.A0J;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (A0E2 + i2) * 31;
        List list3 = this.A0I;
        if (list3 != null) {
            i3 = list3.hashCode();
        } else {
            i3 = 0;
        }
        int A0E3 = (((i7 + i3) * 31) + C51971G9r.A0E(this.A04)) * 31;
        List list4 = this.A0H;
        if (list4 != null) {
            i4 = list4.hashCode();
        } else {
            i4 = 0;
        }
        int A0E4 = (((A0E3 + i4) * 31) + C51971G9r.A0E(this.A0B)) * 31;
        List list5 = this.A0L;
        if (list5 != null) {
            i5 = list5.hashCode();
        } else {
            i5 = 0;
        }
        int A0G = (((((((((((((((A0E4 + i5) * 31) + JTR.A0G(this.A0C)) * 31) + JTR.A0G(this.A0D)) * 31) + JTR.A0G(this.A0G)) * 31) + C51971G9r.A0E(this.A06)) * 31) + JTR.A0G(this.A0F)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A08)) * 31;
        Integer num = this.A0A;
        if (num != null) {
            i6 = num.hashCode();
        }
        return A0G + i6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Float f;
        boolean isFromMockProvider;
        ImmutableList A01;
        ImmutableList A012;
        ImmutableList A013;
        ImmutableList copyOf;
        ImmutableList A014;
        C276164sm r4 = this.A02;
        if (r4 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Location location = r4.A00;
            parcel.writeDouble(location.getLatitude());
            parcel.writeDouble(location.getLongitude());
            String provider = location.getProvider();
            if (provider == null) {
                provider = null;
            }
            parcel.writeString(provider);
            Long A03 = r4.A03();
            if (A03 == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                Pxf.A18(parcel, A03);
            }
            long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
            if (elapsedRealtimeNanos == 0 || Long.valueOf(elapsedRealtimeNanos) == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeLong(elapsedRealtimeNanos);
            }
            SKP.A02(parcel, r4.A01());
            Double A00 = r4.A00();
            if (A00 == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeDouble(A00.doubleValue());
            }
            SKP.A02(parcel, r4.A02());
            if (location.hasSpeed()) {
                f = Float.valueOf(location.getSpeed());
            } else {
                f = null;
            }
            SKP.A02(parcel, f);
            parcel.writeBundle(location.getExtras());
            Boolean bool = r4.A01;
            if (bool != null) {
                isFromMockProvider = bool.booleanValue();
            } else {
                isFromMockProvider = location.isFromMockProvider();
            }
            SKP.A01(parcel, Boolean.valueOf(isFromMockProvider));
        }
        parcel.writeString(this.A0E);
        SKP.A01(parcel, this.A05);
        parcel.writeParcelable(ParcelableWifiScanResult.A00(this.A03), 0);
        List list = this.A0N;
        if (list == null) {
            A01 = null;
        } else {
            A01 = PzX.A01(PzX.A00(list), 8);
        }
        parcel.writeTypedList(A01);
        SKP.A01(parcel, this.A07);
        parcel.writeParcelable(ParcelableGeneralCellInfo.A00(this.A00), 0);
        parcel.writeTypedList(this.A0J);
        List list2 = this.A0I;
        if (list2 == null) {
            A012 = null;
        } else {
            A012 = PzX.A01(PzX.A00(list2), 1);
        }
        parcel.writeTypedList(A012);
        SKP.A01(parcel, this.A04);
        List list3 = this.A0H;
        if (list3 == null) {
            A013 = null;
        } else {
            A013 = PzX.A01(PzX.A00(list3), 5);
        }
        parcel.writeTypedList(A013);
        Integer num = this.A0B;
        if (num == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Pxf.A19(parcel, num);
        }
        List list4 = this.A0L;
        if (list4 == null) {
            copyOf = null;
        } else {
            PzX A02 = PzX.A00(list4).A02(new C12608Szs(4, (0sP) C13364TWy.A00));
            copyOf = ImmutableList.copyOf((Iterable) A02.A00.A05(A02));
        }
        parcel.writeTypedList(copyOf);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0G);
        SKP.A01(parcel, this.A06);
        parcel.writeString(this.A0F);
        Integer num2 = this.A09;
        if (num2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Pxf.A19(parcel, num2);
        }
        SKP.A02(parcel, this.A08);
        Integer num3 = this.A0A;
        if (num3 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            Pxf.A19(parcel, num3);
        }
        List list5 = this.A0M;
        if (list5 == null) {
            A014 = null;
        } else {
            A014 = PzX.A01(PzX.A00(list5), 3);
        }
        parcel.writeTypedList(A014);
    }
}
