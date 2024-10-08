package com.instagram.pendingmedia.model.recipients;

import X.0Tu;
import X.0qQ;
import X.16V;
import X.182;
import X.AnonymousClass170;
import X.C317986oA;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class PendingRecipient implements Parcelable, AnonymousClass170 {
    public static final ImageUrl A0g = new SimpleImageUrl("");
    public static final Parcelable.Creator CREATOR = new C376399Hv(68);
    public int A00;
    public int A01;
    public int A02;
    public ImageUrl A03;
    public FollowStatus A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final String A0f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PendingRecipient(User user) {
        this(A0g, FollowStatus.A08, (Boolean) null, (Integer) null, (Integer) null, (Long) null, (String) null, "", "", (String) null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Integer num;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        User user2 = user;
        0qQ.A0B(user2, 1);
        this.A0B = user2.getId();
        this.A0C = user2.getUsername();
        this.A03 = user2.Bh3();
        String fullName = user2.getFullName();
        this.A0A = fullName == null ? "" : fullName;
        this.A0b = user2.isVerified();
        this.A0Z = user2.isRestricted();
        this.A0J = user2.CPV();
        this.A0P = user2.A2C();
        this.A0V = user2.CXO();
        this.A0W = user2.CXR();
        this.A07 = user2.Bjj();
        this.A0a = user2.Cdl();
        Boolean CeA = user2.A03.CeA();
        if (CeA != null) {
            z = CeA.booleanValue();
        } else {
            z = false;
        }
        this.A05 = Boolean.valueOf(z);
        this.A0K = user2.CPm();
        this.A0L = user2.isConnected();
        this.A01 = user2.BIW();
        Boolean CT2 = user2.A03.CT2();
        if (CT2 != null) {
            z2 = CT2.booleanValue();
        } else {
            z2 = false;
        }
        this.A0N = z2;
        Boolean CVq = user2.A03.CVq();
        boolean z13 = true;
        if (CVq != null) {
            z3 = CVq.booleanValue();
        } else {
            z3 = true;
        }
        this.A0U = z3;
        this.A04 = user2.B6o();
        this.A09 = user2.A03.Ar1();
        this.A08 = user2.BST();
        this.A02 = user2.A05();
        Boolean CUU = user2.A03.CUU();
        if (CUU != null) {
            z4 = CUU.booleanValue();
        } else {
            z4 = false;
        }
        this.A0S = z4;
        Boolean CUP = user2.A03.CUP();
        if (CUP != null) {
            z5 = CUP.booleanValue();
        } else {
            z5 = false;
        }
        this.A0R = z5;
        this.A0d = user2.A1c();
        this.A00 = user2.A00();
        this.A0O = user2.A2A();
        16V A0J2 = user2.A0J();
        if (A0J2 != null) {
            num = Integer.valueOf(A0J2.A00);
        } else {
            num = null;
        }
        this.A06 = num;
        this.A0Q = false;
        Boolean COs = user2.A03.COs();
        if (COs != null) {
            z6 = COs.booleanValue();
        } else {
            z6 = false;
        }
        this.A0I = z6;
        this.A0c = user2.A2R();
        Boolean C3B = user2.A03.C3B();
        if (C3B != null) {
            z7 = C3B.booleanValue();
        } else {
            z7 = false;
        }
        this.A0e = z7;
        Boolean BAq = user2.A03.BAq();
        if (BAq != null) {
            z8 = BAq.booleanValue();
        } else {
            z8 = false;
        }
        this.A0G = z8;
        Boolean Avp = user2.A03.Avp();
        if (Avp != null) {
            z9 = Avp.booleanValue();
        } else {
            z9 = false;
        }
        this.A0E = z9;
        Boolean Avo = user2.A03.Avo();
        if (Avo != null) {
            z10 = Avo.booleanValue();
        } else {
            z10 = false;
        }
        this.A0D = z10;
        this.A0H = user2.BIW() != 2 ? false : z13;
        this.A0Y = false;
        this.A0F = user2.A1l();
        this.A0X = user2.A1X();
        Boolean CQn = user2.A03.CQn();
        if (CQn != null) {
            z11 = CQn.booleanValue();
        } else {
            z11 = false;
        }
        this.A0M = z11;
        Boolean CUg = user2.A03.CUg();
        if (CUg != null) {
            z12 = CUg.booleanValue();
        } else {
            z12 = false;
        }
        this.A0T = z12;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            PendingRecipient pendingRecipient = (PendingRecipient) obj;
            if (!0qQ.A0K(this.A0B, pendingRecipient.A0B) || this.A0Y != pendingRecipient.A0Y) {
                return false;
            }
        }
        return true;
    }

    public final String getShortName() {
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        Integer num = this.A07;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.A0a ? 1 : 0);
        Boolean bool = this.A05;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A04, i);
        Long l = this.A08;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0O ? 1 : 0);
        Integer num2 = this.A06;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
    }

    public final FollowStatus B6o() {
        return this.A04;
    }

    public final String B8Q() {
        return this.A0f;
    }

    public final int BIW() {
        return this.A01;
    }

    public final Long BST() {
        return this.A08;
    }

    public final ImageUrl Bh3() {
        return this.A03;
    }

    public final Integer Bjj() {
        return this.A07;
    }

    public final boolean COa() {
        return this.A0H;
    }

    public final boolean CPV() {
        return this.A0J;
    }

    public final boolean CPm() {
        return this.A0K;
    }

    public final boolean CQp(C317986oA r5) {
        if (!this.A0M) {
            return false;
        }
        String str = this.A0B;
        if (str == null) {
            str = "";
        }
        UserSession userSession = r5.A00;
        if (str.equals(userSession.A06) || 182.A06(0Tu.A05, userSession, 36323736718421431L)) {
            return true;
        }
        return false;
    }

    public final boolean CXO() {
        return this.A0V;
    }

    public final boolean CXR() {
        return this.A0W;
    }

    public final boolean Cdl() {
        return this.A0a;
    }

    public final String getFullName() {
        return this.A0A;
    }

    public final String getId() {
        String str = this.A0B;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getUsername() {
        return this.A0C;
    }

    public final int hashCode() {
        String str = this.A0B;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final boolean isConnected() {
        return this.A0L;
    }

    public final boolean isRestricted() {
        return this.A0Z;
    }

    public final boolean isVerified() {
        return this.A0b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PendingRecipient(ImageUrl imageUrl, String str, String str2) {
        this(A0g, FollowStatus.A08, (Boolean) null, (Integer) null, (Integer) null, (Long) null, (String) null, "", "", (String) null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        String str3 = str;
        0qQ.A0B(str3, 1);
        String str4 = str2;
        0qQ.A0B(str4, 2);
        ImageUrl imageUrl2 = imageUrl;
        0qQ.A0B(imageUrl2, 3);
        this.A0B = str3;
        this.A0C = str4;
        this.A03 = imageUrl2;
    }

    public PendingRecipient(ImageUrl imageUrl, FollowStatus followStatus, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28) {
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(imageUrl, 4);
        0qQ.A0B(followStatus, 20);
        this.A0B = str;
        this.A0C = str2;
        this.A0A = str3;
        this.A03 = imageUrl;
        this.A0b = z;
        this.A0Z = z2;
        this.A0J = z3;
        this.A0P = z4;
        this.A0V = z5;
        this.A0W = z6;
        this.A07 = num;
        this.A0a = z7;
        this.A05 = bool;
        this.A0K = z8;
        this.A0L = z9;
        this.A01 = i;
        this.A0N = z10;
        this.A0U = z11;
        this.A09 = str4;
        this.A04 = followStatus;
        this.A08 = l;
        this.A02 = i2;
        this.A0S = z12;
        this.A0R = z13;
        this.A0d = z14;
        this.A00 = i3;
        this.A0O = z15;
        this.A06 = num2;
        this.A0Q = z16;
        this.A0I = z17;
        this.A0c = z18;
        this.A0e = z19;
        this.A0G = z20;
        this.A0D = z21;
        this.A0E = z22;
        this.A0H = z23;
        this.A0Y = z24;
        this.A0F = z25;
        this.A0X = z26;
        this.A0M = z27;
        this.A0T = z28;
        this.A0f = str3.length() == 0 ? str2 : str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PendingRecipient(String str) {
        this(A0g, FollowStatus.A08, (Boolean) null, (Integer) null, (Integer) null, (Long) null, (String) null, "", "", (String) null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        String str2 = str;
        0qQ.A0B(str2, 1);
        this.A0B = str2;
    }

    public PendingRecipient() {
        this(A0g, FollowStatus.A08, (Boolean) null, (Integer) null, (Integer) null, (Long) null, (String) null, "", "", (String) null, 0, 0, -1, false, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }
}
