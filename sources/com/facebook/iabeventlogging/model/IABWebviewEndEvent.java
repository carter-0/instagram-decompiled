package com.facebook.iabeventlogging.model;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9ZI;
import X.C41847B3o;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.Pxi;
import X.Pxj;
import android.os.Build;
import android.os.Parcel;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.ArrayList;
import java.util.List;

public class IABWebviewEndEvent extends IABEvent {
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final ZonedValue A0P;
    public final Boolean A0Q;
    public final Long A0R;
    public final Long A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final ArrayList A0a;
    public final ArrayList A0b;
    public final List A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;

    public static IABWebviewEndEvent A00(Parcel parcel, String str, long j, long j2) {
        boolean z;
        ArrayList A1C;
        ArrayList readArrayList;
        Parcel parcel2 = parcel;
        String readString = parcel2.readString();
        long readLong = parcel2.readLong();
        long readLong2 = parcel2.readLong();
        long readLong3 = parcel2.readLong();
        long readLong4 = parcel2.readLong();
        long readLong5 = parcel2.readLong();
        long readLong6 = parcel2.readLong();
        long readLong7 = parcel2.readLong();
        ArrayList readArrayList2 = parcel2.readArrayList(ArrayList.class.getClassLoader());
        ZonedValue zonedValue = (ZonedValue) C41847B3o.A03(parcel2, ZonedValue.class);
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        int readInt = parcel2.readInt();
        int readInt2 = parcel2.readInt();
        int readInt3 = parcel2.readInt();
        int readInt4 = parcel2.readInt();
        boolean A1S = AnonymousClass7TF.A1S(parcel2.readByte(), 1);
        String readString4 = parcel2.readString();
        boolean A1W = Pxj.A1W(parcel2);
        long readLong8 = parcel2.readLong();
        boolean A1W2 = Pxj.A1W(parcel2);
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        long readLong9 = parcel2.readLong();
        long readLong10 = parcel2.readLong();
        boolean A1W3 = Pxj.A1W(parcel2);
        boolean A1W4 = Pxj.A1W(parcel2);
        boolean A1W5 = Pxj.A1W(parcel2);
        boolean A1W6 = Pxj.A1W(parcel2);
        long readLong11 = parcel2.readLong();
        String readString7 = parcel2.readString();
        boolean A1W7 = Pxj.A1W(parcel2);
        if (parcel2.readByte() == 1) {
            z = true;
            Class<AnonymousClass9ZI> cls = AnonymousClass9ZI.class;
            if (Build.VERSION.SDK_INT >= 33) {
                A1C = parcel2.readArrayList(cls.getClassLoader(), cls);
            } else {
                A1C = parcel2.readArrayList(cls.getClassLoader());
            }
        } else {
            z = false;
            A1C = AnonymousClass7TE.A1C();
        }
        long readLong12 = parcel2.readLong();
        long readLong13 = parcel2.readLong();
        long readLong14 = parcel2.readLong();
        Class<Long> cls2 = Long.class;
        Long l = (Long) Pxi.A0U(parcel2, cls2);
        Long l2 = (Long) Pxi.A0U(parcel2, cls2);
        Boolean bool = (Boolean) Pxi.A0U(parcel2, Boolean.class);
        int i = Build.VERSION.SDK_INT;
        ClassLoader classLoader = cls2.getClassLoader();
        if (i >= 33) {
            readArrayList = parcel2.readArrayList(classLoader, cls2);
        } else {
            readArrayList = parcel2.readArrayList(classLoader);
        }
        return new IABWebviewEndEvent(zonedValue, bool, l, l2, str, readString, readString2, readString3, readString4, readString5, readString6, readString7, parcel2.readString(), readArrayList2, readArrayList, A1C, readInt, readInt2, readInt3, readInt4, parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), j, j2, readLong, readLong2, readLong3, readLong4, readLong5, readLong6, readLong7, readLong8, readLong9, readLong10, readLong11, readLong12, readLong13, readLong14, parcel2.readLong(), A1S, A1W, A1W2, A1W3, A1W4, A1W5, A1W6, A1W7, z, Pxj.A1W(parcel2), Pxj.A1W(parcel2));
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABWebviewEndEvent{");
        A16.append("browserUserAgent=");
        A16.append(this.A0T);
        A16.append("userClickTs=");
        A16.append(this.A0M);
        A16.append(", webRequestStartedTs=");
        A16.append(this.A0N);
        A16.append(", browserOpenTs=");
        A16.append(this.A0A);
        A16.append(", scrollReadyTs=");
        A16.append(this.A0L);
        A16.append(", landingPageDomContentLoadedTs=");
        A16.append(this.A0D);
        A16.append(", landingPageLoadedTs=");
        A16.append(this.A0H);
        A16.append(", landingPageViewEndedTs=");
        A16.append(this.A0J);
        A16.append(", browserCloseTs=");
        A16.append(this.A09);
        A16.append(", backgroundTimePairs=");
        A16.append(this.A0a);
        A16.append(", initialLandUrl='");
        char A002 = Pxf.A00(this.A0Z, A16);
        A16.append(", clickSource='");
        A16.append(this.A0U);
        A16.append(A002);
        A16.append(", dismissMethod=");
        A16.append(this.A02);
        A16.append(", landingPageStatusCode=");
        A16.append(this.A05);
        A16.append(", sslErrorCode=");
        A16.append(this.A06);
        A16.append(", interactionCount=");
        A16.append(this.A03);
        Pxh.A1D(this, A16, A002);
        A16.append(this.A00);
        A16.append(", isInitialUrlIsOpenApp=");
        A16.append(this.A0j);
        A16.append(", deepLinkUrl=");
        A16.append(this.A0V);
        A16.append(", shouldUseLEDesign=");
        A16.append(this.A0k);
        A16.append(", webviewEndFlags=");
        A16.append(this.A0O);
        A16.append(", isCrashed=");
        A16.append(this.A0h);
        A16.append(", errorMessage=");
        A16.append(this.A0W);
        A16.append(", errorStackTrace=");
        A16.append(this.A0X);
        A16.append(", landingPageEstimatedProgressFinishedTs=");
        A16.append(this.A0E);
        A16.append(", landingPageContentSizeChangedTs=");
        A16.append(this.A0C);
        A16.append(", googleOAuth2Encountered=");
        A16.append(this.A0f);
        A16.append(", googleOAuth2ErrorEncountered=");
        A16.append(this.A0g);
        A16.append(", isGoogleOAuth2RedirectUrlSchemaStoragerelay=");
        A16.append(this.A0i);
        A16.append(", e2eeBlackHoleEnforcementUnsafeBrowsingEncountered=");
        A16.append(this.A0d);
        A16.append(", initialCookieInjectCompleteTs=");
        A16.append(this.A0B);
        A16.append(", trackingNode=");
        A16.append(this.A00);
        A16.append(", usingHelium=");
        A16.append(this.A0l);
        A16.append(", landingPageFirstContentfulPaintTs=");
        A16.append(this.A0F);
        A16.append(", landingPageLargestContentfulPaintTs=");
        A16.append(this.A0G);
        A16.append(", landingPageResponseStartTs=");
        A16.append(this.A0I);
        A16.append(", screenshotStartTime=");
        A16.append(this.A0S);
        A16.append(", screenshotEndTime=");
        A16.append(this.A0R);
        A16.append(", screenshotIsVisible=");
        A16.append(this.A0Q);
        A16.append(", screenshotInteractionTimes=");
        A16.append(this.A0b);
        A16.append(", heliumStartupClass=");
        A16.append(this.A0Y);
        A16.append(", usingMultiWindow=");
        A16.append(this.A0m);
        A16.append(", fbLoginEncountered=");
        A16.append(this.A0e);
        A16.append(", stackSize=");
        A16.append(this.A07);
        A16.append(", stackSizeMax=");
        A16.append(this.A08);
        A16.append(", jsErrorCount=");
        A16.append(this.A04);
        A16.append(", cspErrorCount=");
        A16.append(this.A01);
        A16.append(", maxInteractionDelayMs=");
        return Pxg.A0y(A16, this.A0K);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0T);
        parcel.writeLong(this.A0M);
        parcel.writeLong(this.A0N);
        parcel.writeLong(this.A0A);
        parcel.writeLong(this.A0L);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0H);
        parcel.writeLong(this.A0J);
        parcel.writeList(this.A0a);
        parcel.writeParcelable(this.A0P, i);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0U);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A03);
        parcel.writeByte(this.A0j ? (byte) 1 : 0);
        parcel.writeString(this.A0V);
        parcel.writeByte(this.A0k ? (byte) 1 : 0);
        parcel.writeLong(this.A0O);
        parcel.writeByte(this.A0h ? (byte) 1 : 0);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0X);
        parcel.writeLong(this.A0E);
        parcel.writeLong(this.A0C);
        parcel.writeByte(this.A0f ? (byte) 1 : 0);
        parcel.writeByte(this.A0g ? (byte) 1 : 0);
        parcel.writeByte(this.A0i ? (byte) 1 : 0);
        parcel.writeByte(this.A0d ? (byte) 1 : 0);
        parcel.writeLong(this.A0B);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A0l ? (byte) 1 : 0);
        boolean z = this.A0n;
        parcel.writeByte(z ? (byte) 1 : 0);
        if (z) {
            parcel.writeList(this.A0c);
        }
        parcel.writeLong(this.A0F);
        parcel.writeLong(this.A0G);
        parcel.writeLong(this.A0I);
        parcel.writeValue(this.A0S);
        parcel.writeValue(this.A0R);
        parcel.writeValue(this.A0Q);
        parcel.writeList(this.A0b);
        parcel.writeString(this.A0Y);
        parcel.writeByte(this.A0m ? (byte) 1 : 0);
        parcel.writeByte(this.A0e ? (byte) 1 : 0);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A0K);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IABWebviewEndEvent(com.facebook.privacy.zone.api.ZonedValue r11, java.lang.Boolean r12, java.lang.Long r13, java.lang.Long r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.ArrayList r24, java.util.ArrayList r25, java.util.List r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, long r35, long r37, long r39, long r41, long r43, long r45, long r47, long r49, long r51, long r53, long r55, long r57, long r59, long r61, long r63, long r65, long r67, boolean r69, boolean r70, boolean r71, boolean r72, boolean r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78, boolean r79) {
        /*
            r10 = this;
            r2 = r26
            X.RGn r4 = X.C8945RGn.IAB_WEBVIEW_END
            r8 = r37
            r6 = r35
            r3 = r10
            r5 = r15
            r3.<init>(r4, r5, r6, r8)
            r0 = r61
            r10.A0F = r0
            r0 = r63
            r10.A0G = r0
            r0 = r65
            r10.A0I = r0
            r0 = r16
            r10.A0T = r0
            r0 = r39
            r10.A0M = r0
            r0 = r41
            r10.A0N = r0
            r0 = r43
            r10.A0A = r0
            r0 = r45
            r10.A0L = r0
            r0 = r47
            r10.A0D = r0
            r0 = r49
            r10.A0H = r0
            r0 = r51
            r10.A0J = r0
            r10.A09 = r6
            r0 = r24
            r10.A0a = r0
            if (r11 != 0) goto L_0x004a
            com.facebook.privacy.zone.policy.ZonePolicy r1 = com.facebook.privacy.zone.policy.ZonePolicy.A05
            java.lang.String r0 = ""
            com.facebook.privacy.zone.api.ZonedValue r11 = new com.facebook.privacy.zone.api.ZonedValue
            r11.<init>(r1, r0)
        L_0x004a:
            r10.A0P = r11
            r0 = r17
            r10.A0Z = r0
            r0 = r18
            r10.A0U = r0
            r0 = r27
            r10.A02 = r0
            r0 = r28
            r10.A05 = r0
            r0 = r29
            r10.A06 = r0
            r0 = r30
            r10.A03 = r0
            r0 = r69
            r10.A0j = r0
            r0 = r19
            r10.A0V = r0
            r0 = r70
            r10.A0k = r0
            r0 = r53
            r10.A0O = r0
            r0 = r71
            r10.A0h = r0
            r0 = r20
            r10.A0W = r0
            r0 = r21
            r10.A0X = r0
            r0 = r55
            r10.A0E = r0
            r0 = r57
            r10.A0C = r0
            r0 = r72
            r10.A0f = r0
            r0 = r73
            r10.A0g = r0
            r0 = r74
            r10.A0i = r0
            r0 = r75
            r10.A0d = r0
            r0 = r59
            r10.A0B = r0
            r0 = r22
            r10.A00 = r0
            r0 = r76
            r10.A0l = r0
            r0 = r77
            r10.A0n = r0
            if (r77 != 0) goto L_0x00ae
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x00ae:
            r10.A0c = r2
            r10.A0S = r13
            r10.A0R = r14
            r10.A0Q = r12
            r0 = r25
            r10.A0b = r0
            r0 = r23
            r10.A0Y = r0
            r0 = r78
            r10.A0m = r0
            r0 = r79
            r10.A0e = r0
            r0 = r31
            r10.A07 = r0
            r0 = r32
            r10.A08 = r0
            r0 = r33
            r10.A04 = r0
            r0 = r34
            r10.A01 = r0
            r0 = r67
            r10.A0K = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABWebviewEndEvent.<init>(com.facebook.privacy.zone.api.ZonedValue, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.List, int, int, int, int, int, int, int, int, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
