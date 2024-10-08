package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.C51972G9s;
import X.DE7;
import X.V7F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class GroupMetadataImpl extends AnonymousClass0T0 implements GroupMetadata, Parcelable {
    public static final Parcelable.Creator CREATOR = new DE7(89);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final RingSpec A08;
    public final Boolean A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public final GroupMetadataImpl F3U() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GroupMetadataImpl) {
                GroupMetadataImpl groupMetadataImpl = (GroupMetadataImpl) obj;
                if (!(0qQ.A0K(this.A0F, groupMetadataImpl.A0F) && 0qQ.A0K(this.A0G, groupMetadataImpl.A0G) && this.A0I == groupMetadataImpl.A0I && 0qQ.A0K(this.A0B, groupMetadataImpl.A0B) && 0qQ.A0K(this.A0C, groupMetadataImpl.A0C) && 0qQ.A0K(this.A0D, groupMetadataImpl.A0D) && 0qQ.A0K(this.A0E, groupMetadataImpl.A0E) && this.A0J == groupMetadataImpl.A0J && this.A0K == groupMetadataImpl.A0K && 0qQ.A0K(this.A09, groupMetadataImpl.A09) && this.A0L == groupMetadataImpl.A0L && this.A0M == groupMetadataImpl.A0M && this.A0N == groupMetadataImpl.A0N && this.A0O == groupMetadataImpl.A0O && this.A0P == groupMetadataImpl.A0P && this.A0Q == groupMetadataImpl.A0Q && this.A0R == groupMetadataImpl.A0R && 0qQ.A0K(this.A0A, groupMetadataImpl.A0A) && this.A00 == groupMetadataImpl.A00 && this.A01 == groupMetadataImpl.A01 && this.A02 == groupMetadataImpl.A02 && this.A03 == groupMetadataImpl.A03 && this.A04 == groupMetadataImpl.A04 && this.A05 == groupMetadataImpl.A05 && this.A06 == groupMetadataImpl.A06 && this.A07 == groupMetadataImpl.A07 && 0qQ.A0K(this.A0H, groupMetadataImpl.A0H) && 0qQ.A0K(this.A08, groupMetadataImpl.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A0F);
        parcel.writeStringList(this.A0G);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        C41848B3p.A1I(parcel, this.A09);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        Long l = this.A0A;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeStringList(this.A0H);
        parcel.writeParcelable(this.A08, i);
    }

    public final List AZs() {
        return this.A0F;
    }

    public final List Ag7() {
        return this.A0G;
    }

    public final boolean AkJ() {
        return this.A0I;
    }

    public final String Amh() {
        return this.A0B;
    }

    public final String An2() {
        return this.A0C;
    }

    public final String B9w() {
        return this.A0D;
    }

    public final String BA7() {
        return this.A0E;
    }

    public final boolean BA9() {
        return this.A0J;
    }

    public final boolean BBo() {
        return this.A0K;
    }

    public final Boolean BD4() {
        return this.A09;
    }

    public final Long BOs() {
        return this.A0A;
    }

    public final int BWo() {
        return this.A00;
    }

    public final int BWr() {
        return this.A01;
    }

    public final int BX4() {
        return this.A02;
    }

    public final int BX5() {
        return this.A03;
    }

    public final int BX6() {
        return this.A04;
    }

    public final int BX7() {
        return this.A05;
    }

    public final int BX8() {
        return this.A06;
    }

    public final int BX9() {
        return this.A07;
    }

    public final List BbO() {
        return this.A0H;
    }

    public final RingSpec BoX() {
        return this.A08;
    }

    public final boolean CUG() {
        return this.A0L;
    }

    public final boolean CUI() {
        return this.A0M;
    }

    public final boolean CUM() {
        return this.A0N;
    }

    public final boolean CaS() {
        return this.A0O;
    }

    public final boolean Cec() {
        return this.A0P;
    }

    public final boolean Ceg() {
        return this.A0Q;
    }

    public final boolean Ceh() {
        return this.A0R;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGroupMetadata", V7F.A00(this));
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0G, AnonymousClass7TE.A0K(this.A0F));
        int A092 = AnonymousClass7TF.A09(this.A0J, AnonymousClass7TF.A08(this.A0E, AnonymousClass7TF.A08(this.A0D, (((AnonymousClass7TF.A09(this.A0I, A072) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TG.A0E(this.A0C)) * 31)));
        int A093 = AnonymousClass7TF.A09(this.A0Q, AnonymousClass7TF.A09(this.A0P, AnonymousClass7TF.A09(this.A0O, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A09(this.A0L, (AnonymousClass7TF.A09(this.A0K, A092) + AnonymousClass7TG.A0C(this.A09)) * 31))))));
        return AnonymousClass7TF.A07(this.A0H, (((((((((((((((((AnonymousClass7TF.A09(this.A0R, A093) + AnonymousClass7TG.A0C(this.A0A)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05) * 31) + this.A06) * 31) + this.A07) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public GroupMetadataImpl(RingSpec ringSpec, Boolean bool, Long l, String str, String str2, String str3, String str4, List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        AnonymousClass7TG.A1O(list, list2);
        C51972G9s.A1E(str3, str4);
        0qQ.A0B(list3, 27);
        this.A0F = list;
        this.A0G = list2;
        this.A0I = z;
        this.A0B = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A0E = str4;
        this.A0J = z2;
        this.A0K = z3;
        this.A09 = bool;
        this.A0L = z4;
        this.A0M = z5;
        this.A0N = z6;
        this.A0O = z7;
        this.A0P = z8;
        this.A0Q = z9;
        this.A0R = z10;
        this.A0A = l;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A07 = i8;
        this.A0H = list3;
        this.A08 = ringSpec;
    }
}
