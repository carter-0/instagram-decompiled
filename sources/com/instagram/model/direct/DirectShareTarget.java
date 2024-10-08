package com.instagram.model.direct;

import X.002;
import X.0mp;
import X.0qQ;
import X.2EN;
import X.2Ob;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass48O;
import X.AnonymousClass6W3;
import X.AnonymousClass6W4;
import X.AnonymousClass972;
import X.AnonymousClass9HR;
import X.C254743sy;
import X.C254763t0;
import X.C254773t1;
import X.C254783t2;
import X.C254793t3;
import X.C291175gg;
import X.C300965yF;
import X.C376399Hv;
import X.PIO;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DirectShareTarget implements Parcelable, DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new C376399Hv(16);
    public int A00;
    public int A01;
    public ImageUrl A02;
    public ChannelsContextLine A03;
    public CreatorBroadcastThreadInfo A04;
    public CreatorSubscriberThreadInfo A05;
    public DiscoverableThreadInfo A06;
    public 2EN A07;
    public DirectShareTargetLoggingInfo A08;
    public C254783t2 A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public List A0P;
    public List A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;

    public final boolean A0Y(String str) {
        int intValue = A04(str, false).intValue();
        return intValue == 4 || intValue == 5 || intValue == 7;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectShareTarget directShareTarget = (DirectShareTarget) obj;
        C254783t2 r2 = this.A09;
        if (r2 instanceof C254793t3) {
            C254783t2 r1 = directShareTarget.A09;
            if (r1 instanceof C254793t3) {
                return r2.equals(r1);
            }
        }
        return this.A0R == directShareTarget.A0R && (r2 instanceof C254773t1) == (directShareTarget.A09 instanceof C254773t1) && this.A0Q.containsAll(directShareTarget.A0Q) && directShareTarget.A0Q.containsAll(this.A0Q) && 0mp.A0G(this.A0I, directShareTarget.A0I) && 0mp.A0G(this.A0J, directShareTarget.A0J);
    }

    @Deprecated
    public final DirectThreadKey A00() {
        C254783t2 r1 = this.A09;
        if (r1 == null || !(r1 instanceof C254773t1)) {
            return new DirectThreadKey((Collection) this.A0Q);
        }
        return AnonymousClass6W4.A01(AnonymousClass6W3.A01(r1));
    }

    public final C254783t2 A01() {
        C254783t2 r0 = this.A09;
        r0.getClass();
        return r0;
    }

    @Deprecated
    public final C254743sy A02() {
        C254783t2 r0 = this.A09;
        if (r0 == null) {
            return null;
        }
        return AnonymousClass6W3.A06(r0);
    }

    public final Integer A03() {
        if (this.A0Q.size() == 1) {
            return ((PendingRecipient) this.A0Q.get(0)).A07;
        }
        return null;
    }

    public final Integer A04(String str, boolean z) {
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo;
        DiscoverableThreadInfo discoverableThreadInfo;
        Boolean bool = this.A0B;
        if (bool == null) {
            if (!A0T()) {
                if (!A0S()) {
                    if (A0M()) {
                        for (PendingRecipient pendingRecipient : this.A0Q) {
                            if (pendingRecipient.A01 == 1) {
                                return AnonymousClass05K.A15;
                            }
                        }
                    }
                    int i = this.A01;
                    if (!AnonymousClass48O.A01(i) || (discoverableThreadInfo = this.A06) == null) {
                        if (AnonymousClass48O.A02(i) && this.A05 != null) {
                            return AnonymousClass05K.A06;
                        }
                        if (i != 29 || (creatorBroadcastThreadInfo = this.A04) == null) {
                            return AnonymousClass05K.A0u;
                        }
                        int i2 = creatorBroadcastThreadInfo.A00;
                        boolean z2 = creatorBroadcastThreadInfo.A07;
                        if (i2 == 2) {
                            if (z2) {
                                return AnonymousClass05K.A08;
                            }
                            return AnonymousClass05K.A07;
                        } else if (z2) {
                            return AnonymousClass05K.A04;
                        } else {
                            return AnonymousClass05K.A03;
                        }
                    } else if (discoverableThreadInfo.A03) {
                        return AnonymousClass05K.A02;
                    } else {
                        return AnonymousClass05K.A1I;
                    }
                } else if (this.A0Q.size() == 1) {
                    PendingRecipient pendingRecipient2 = (PendingRecipient) this.A0Q.get(0);
                    int i3 = pendingRecipient2.A01;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    return AnonymousClass05K.A0D;
                                }
                                throw new IllegalStateException(002.A0O("Unknown Interop User Type: ", i3));
                            }
                        } else if (pendingRecipient2.A0N) {
                            return AnonymousClass05K.A0Y;
                        } else {
                            return AnonymousClass05K.A0j;
                        }
                    } else if (!pendingRecipient2.A0H) {
                        if (!A0U() && pendingRecipient2.A04 != FollowStatus.A05 && !pendingRecipient2.getId().equals(str)) {
                            if (!z) {
                                return AnonymousClass05K.A01;
                            }
                            if (pendingRecipient2.A0K) {
                                return AnonymousClass05K.A0N;
                            }
                            return AnonymousClass05K.A0C;
                        }
                    }
                    return AnonymousClass05K.A0B;
                } else {
                    throw new IllegalStateException("Unknown Thread Interop Type");
                }
            }
            return AnonymousClass05K.A00;
        } else if (bool.booleanValue()) {
            return AnonymousClass05K.A0A;
        } else {
            return AnonymousClass05K.A09;
        }
    }

    public final String A07() {
        String str;
        String str2;
        DiscoverableThreadInfo discoverableThreadInfo = this.A06;
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = this.A04;
        if (discoverableThreadInfo != null && (str2 = discoverableThreadInfo.A02) != null) {
            return str2;
        }
        if (creatorBroadcastThreadInfo == null || (str = creatorBroadcastThreadInfo.A05) == null) {
            return null;
        }
        return str;
    }

    public final String A08() {
        C254783t2 r1 = this.A09;
        if (!(r1 instanceof C254793t3)) {
            return null;
        }
        C254793t3 r12 = (C254793t3) r1;
        0qQ.A0B(r12, 0);
        if (r12 instanceof C254763t0) {
            return C300965yF.A01(r12).A00;
        }
        if (!(r12 instanceof MsysThreadId)) {
            return null;
        }
        Long l = C300965yF.A03(r12).A02;
        if (l != null) {
            return l.toString();
        }
        return "null";
    }

    public final ArrayList A0B() {
        ArrayList arrayList = new ArrayList();
        for (PendingRecipient id : this.A0Q) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    public final ArrayList A0C() {
        ArrayList arrayList = new ArrayList();
        for (PendingRecipient id : this.A0Q) {
            arrayList.add(Long.valueOf(Long.parseLong(id.getId())));
        }
        return arrayList;
    }

    public final void A0D() {
        if (this.A09 == null) {
            this.A09 = new C291175gg(this.A0Q);
        }
    }

    public final boolean A0E() {
        Integer num = this.A0D;
        if (num == null) {
            for (PendingRecipient pendingRecipient : this.A0Q) {
                if (pendingRecipient.A02 == 1) {
                    return true;
                }
            }
            return false;
        } else if (num.intValue() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0F() {
        if (this.A0Q.size() != 1) {
            return false;
        }
        if (((PendingRecipient) this.A0Q.get(0)).A0H || ((PendingRecipient) this.A0Q.get(0)).A01 == 3) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0K) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        if (this.A04 == null && this.A05 == null && this.A06 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0I() {
        Boolean bool = this.A0B;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0K() {
        int i;
        C254783t2 r0 = this.A09;
        if ((r0 != null && (r0 instanceof AnonymousClass9HR)) || (i = this.A01) == 24 || i == 26) {
            return true;
        }
        return false;
    }

    public final boolean A0L() {
        if (this.A0Q.size() == 1 && ((PendingRecipient) this.A0Q.get(0)).A01 == 1) {
            return true;
        }
        return false;
    }

    public final boolean A0M() {
        if (this.A0Q.size() > 1 || A0I() || (this.A0Q.size() == 1 && this.A01 == 47)) {
            return true;
        }
        return false;
    }

    public final boolean A0N() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0T) {
            return false;
        }
        return true;
    }

    public final boolean A0P() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0V) {
            return false;
        }
        return true;
    }

    public final boolean A0Q() {
        if (this.A0Q.size() != 1) {
            return false;
        }
        if (((PendingRecipient) this.A0Q.get(0)).A0X || 2Ob.A00(((PendingRecipient) this.A0Q.get(0)).A0B, AnonymousClass000.A00(857))) {
            return true;
        }
        return false;
    }

    public final boolean A0R() {
        int i = this.A01;
        if ((i == 24 || i == 26) && this.A0O != null) {
            return true;
        }
        return false;
    }

    public final boolean A0T() {
        if (!this.A0R || !this.A0Q.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A0U() {
        C254783t2 r3 = this.A09;
        if (r3 != null) {
            if (r3 instanceof MsysThreadId) {
                return true;
            }
            if (r3 instanceof C254763t0) {
                return !TextUtils.isEmpty(((C254763t0) r3).A00);
            }
            if (!(r3 instanceof PIO) && !(r3 instanceof C291175gg)) {
                throw new IllegalStateException(002.A0R("Unknow ThreadTarget implementation: ", r3.toString()));
            }
        }
        return false;
    }

    public final boolean A0V() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0b) {
            return false;
        }
        return true;
    }

    public final boolean A0W() {
        if (this.A0Q.size() != 1 || !((PendingRecipient) this.A0Q.get(0)).A0c) {
            return false;
        }
        return true;
    }

    public final String AEB() {
        double d;
        Double d2;
        Boolean bool;
        boolean z = false;
        String str = this.A0J;
        String A092 = A09();
        Boolean valueOf = Boolean.valueOf(A0M());
        DirectShareTargetLoggingInfo directShareTargetLoggingInfo = this.A08;
        if (!(directShareTargetLoggingInfo == null || (bool = directShareTargetLoggingInfo.A00) == null || !bool.booleanValue())) {
            z = true;
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        if (directShareTargetLoggingInfo == null || (d2 = directShareTargetLoggingInfo.A01) == null) {
            d = 0.0d;
        } else {
            d = d2.doubleValue();
        }
        return StringFormatUtil.formatStrLocaleSafe("| %-30s | name: %-50s | unique key %-30s| is group: %-10s| is server result: %-10s| rank score: %.2f  |", new Object[]{"DirectShareTarget", str, A092, valueOf, valueOf2, Double.valueOf(d)});
    }

    public final int hashCode() {
        boolean z = this.A0R;
        int i = 0;
        for (Object hashCode : this.A0Q) {
            i ^= hashCode.hashCode();
        }
        return ((z ? 1 : 0) * true) + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004c, code lost:
        if (r1 == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            java.util.List r0 = r2.A0Q
            r3.writeTypedList(r0)
            java.lang.String r0 = r2.A0I
            r3.writeString(r0)
            java.lang.String r0 = r2.A0J
            r3.writeString(r0)
            boolean r0 = r2.A0R
            byte r0 = (byte) r0
            r3.writeByte(r0)
            X.3t2 r0 = r2.A09
            X.AnonymousClass9H0.A03(r3, r0, r4)
            X.2EN r0 = r2.A07
            if (r0 != 0) goto L_0x0020
            X.2EN r0 = X.2EN.A05
        L_0x0020:
            int r0 = r0.A00
            r3.writeInt(r0)
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r2.A05
            r3.writeParcelable(r0, r4)
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = r2.A04
            r3.writeParcelable(r0, r4)
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = r2.A06
            r3.writeParcelable(r0, r4)
            java.lang.String r0 = r2.A0G
            r3.writeString(r0)
            int r0 = r2.A00
            r3.writeInt(r0)
            java.lang.String r0 = r2.A0H
            r3.writeString(r0)
            java.lang.Boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x004e
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r3.writeByte(r0)
            int r0 = r2.A01
            r3.writeInt(r0)
            java.lang.Integer r0 = r2.A0E
            int r0 = r0.intValue()
            r3.writeInt(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r2.A02
            r3.writeParcelable(r0, r4)
            java.lang.String r0 = r2.A0O
            r3.writeString(r0)
            boolean r0 = r2.A0U
            byte r0 = (byte) r0
            r3.writeByte(r0)
            java.lang.String r0 = r2.A0N
            r3.writeString(r0)
            java.lang.String r0 = r2.A0F
            r3.writeString(r0)
            com.instagram.direct.model.thread.ChannelsContextLine r0 = r2.A03
            r3.writeParcelable(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.DirectShareTarget.writeToParcel(android.os.Parcel, int):void");
    }

    public final String A05() {
        if (!A0I() && !this.A0S) {
            if (this.A0Q.size() == 1 && !A0U()) {
                return ((PendingRecipient) this.A0Q.get(0)).A09;
            }
            if (!A0U()) {
                return null;
            }
        }
        return this.A0H;
    }

    public final String A06() {
        if (A0S() && !A0T()) {
            PendingRecipient pendingRecipient = (PendingRecipient) this.A0Q.get(0);
            if (pendingRecipient.A01 == 1) {
                return String.valueOf(pendingRecipient.A08);
            }
        }
        return A09();
    }

    public final String A09() {
        if (A0S() && !A0T()) {
            return ((PendingRecipient) this.A0Q.get(0)).getId();
        }
        String A082 = A08();
        if (TextUtils.isEmpty(A082)) {
            return String.valueOf(hashCode());
        }
        return A082;
    }

    public final String A0A() {
        if (!A0S() || this.A0Q.size() != 1) {
            return null;
        }
        return ((PendingRecipient) this.A0Q.get(0)).A0C;
    }

    public final boolean A0J() {
        if (!A0O()) {
            return false;
        }
        int i = ((PendingRecipient) this.A0Q.get(0)).A00;
        if (i == 1 || i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    public final boolean A0O() {
        if (A0T() || (this.A0Q.size() == 1 && ((PendingRecipient) this.A0Q.get(0)).A01 == 0)) {
            return true;
        }
        return false;
    }

    public final boolean A0S() {
        if (A0M() || !this.A0R) {
            return false;
        }
        return true;
    }

    public final boolean A0X() {
        if (!A0O() || this.A0Q.size() != 1) {
            return false;
        }
        if (((PendingRecipient) this.A0Q.get(0)).A0E || ((PendingRecipient) this.A0Q.get(0)).A0G) {
            return true;
        }
        return false;
    }

    public final boolean A0Z(String str) {
        if (A0T() || (this.A0Q.size() == 1 && ((PendingRecipient) this.A0Q.get(0)).getId().equals(str))) {
            return true;
        }
        return false;
    }

    public final boolean A0a(boolean z) {
        if (!A0O() || this.A0Q.size() != 1) {
            return false;
        }
        PendingRecipient pendingRecipient = (PendingRecipient) this.A0Q.get(0);
        if (!A0J()) {
            return false;
        }
        if (pendingRecipient.A0O || z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r2.A0I != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0b(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.A0O()
            r3 = 0
            if (r0 == 0) goto L_0x0028
            java.util.List r0 = r4.A0Q
            java.lang.Object r2 = r0.get(r3)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r2
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L_0x0028
            if (r5 == 0) goto L_0x001c
            boolean r0 = r2.A0I
            r1 = 0
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            boolean r0 = r2.A0d
            if (r0 == 0) goto L_0x0028
            boolean r0 = r2.A0O
            if (r0 != 0) goto L_0x0027
            if (r1 == 0) goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.DirectShareTarget.A0b(boolean):boolean");
    }

    public DirectShareTarget() {
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public DirectShareTarget(2EN r2, C254783t2 r3, Boolean bool, Double d, String str, String str2, List list, boolean z, boolean z2) {
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = list;
        this.A09 = r3;
        this.A0I = str;
        this.A0J = str;
        this.A0R = z;
        ? obj = new Object();
        obj.A01 = d;
        obj.A00 = bool;
        this.A08 = obj;
        this.A07 = r2;
        this.A0T = z2;
        this.A0F = str2;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public DirectShareTarget(C254783t2 r4, PendingRecipient pendingRecipient) {
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = Collections.singletonList(pendingRecipient);
        this.A0I = pendingRecipient.A0C;
        this.A0J = pendingRecipient.A0A;
        this.A0R = true;
        ? obj = new Object();
        obj.A01 = null;
        obj.A00 = true;
        this.A08 = obj;
        r4.getClass();
        this.A09 = r4;
    }

    public DirectShareTarget(C254783t2 r22, Boolean bool, Double d, String str, List list, boolean z) {
        this((ChannelsContextLine) null, (CreatorBroadcastThreadInfo) null, (CreatorSubscriberThreadInfo) null, (DiscoverableThreadInfo) null, (2EN) null, r22, bool, (Boolean) null, d, (Integer) null, (Integer) null, (Integer) null, str, (String) null, (String) null, (String) null, (String) null, list, z, false);
    }

    public DirectShareTarget(C254783t2 r3, Integer num, String str, String str2, List list) {
        int i = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = list;
        this.A09 = r3;
        this.A0I = str;
        this.A0J = str;
        this.A0G = str2;
        this.A00 = num != null ? num.intValue() : i;
    }

    public DirectShareTarget(C254783t2 r8, String str, List list, boolean z) {
        this(r8, (Boolean) null, (Double) null, str, list, z);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public DirectShareTarget(ChannelsContextLine channelsContextLine, CreatorBroadcastThreadInfo creatorBroadcastThreadInfo, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo, DiscoverableThreadInfo discoverableThreadInfo, 2EN r8, C254783t2 r9, Boolean bool, Boolean bool2, Double d, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2) {
        int i;
        int i2 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        int i3 = 0;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = list;
        r9.getClass();
        this.A09 = r9;
        String str6 = str;
        this.A0I = str6;
        this.A0J = str6;
        this.A0R = z;
        ? obj = new Object();
        obj.A01 = d;
        obj.A00 = bool;
        this.A08 = obj;
        this.A07 = r8;
        this.A05 = creatorSubscriberThreadInfo;
        this.A04 = creatorBroadcastThreadInfo;
        this.A06 = discoverableThreadInfo;
        this.A0G = str2;
        this.A00 = num != null ? num.intValue() : i2;
        this.A0H = str3;
        this.A0C = bool2;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        this.A01 = i;
        this.A0E = Integer.valueOf(num3 != null ? num3.intValue() : i3);
        this.A0O = str4;
        this.A0U = z2;
        this.A0F = str5;
        this.A03 = channelsContextLine;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public DirectShareTarget(MsysThreadId msysThreadId, Boolean bool, String str, List list, int i) {
        Integer valueOf = Integer.valueOf(i);
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        this.A0Q = list;
        this.A0I = str;
        this.A0J = str;
        this.A0R = true;
        this.A0D = valueOf;
        ? obj = new Object();
        obj.A01 = null;
        obj.A00 = null;
        this.A08 = obj;
        this.A09 = msysThreadId;
        this.A0A = bool;
        A0D();
    }

    @Deprecated
    public DirectShareTarget(PendingRecipient pendingRecipient) {
        this((C254783t2) new C291175gg(Arrays.asList(new PendingRecipient[]{pendingRecipient})), pendingRecipient);
    }

    public DirectShareTarget(User user) {
        this(new PendingRecipient(user));
    }

    public DirectShareTarget(User user, boolean z) {
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = 0;
        this.A0E = 0;
        this.A0K = "";
        PendingRecipient pendingRecipient = new PendingRecipient(user);
        this.A0Q = Collections.singletonList(pendingRecipient);
        this.A0I = pendingRecipient.A0C;
        this.A0J = pendingRecipient.A0A;
        this.A0R = true;
        this.A0B = false;
        A0D();
    }

    public DirectShareTarget(String str, String str2) {
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A01 = 0;
        this.A0E = 0;
        this.A0S = true;
        this.A0I = str;
        this.A0K = str2;
        this.A0Q = Collections.singletonList(new PendingRecipient(str));
    }
}
