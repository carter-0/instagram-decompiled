package com.instagram.ui.widget.mediapicker;

import X.002;
import X.0Yh;
import X.0q1;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.C357268Xf;
import X.C357278Xg;
import X.C376399Hv;
import X.C65796Lzo;
import X.C66579MXk;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public final class Folder implements C357268Xf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(83);
    public int A00;
    public List A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final Set A05;
    public final Set A06;
    public final boolean A07;

    public final Folder ACT() {
        return this;
    }

    public final C65796Lzo ACa() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeTypedList(new ArrayList(this.A05));
    }

    public final String A00() {
        int i = this.A02;
        if (i == -10) {
            return "videos_over_60_sec";
        }
        if (i == -9) {
            return AnonymousClass000.A00(3107);
        }
        if (i == -6) {
            return "instagram";
        }
        if (i == -5) {
            return "external";
        }
        if (i == -3) {
            return "videos";
        }
        if (i == -2) {
            return "photos";
        }
        if (i != -1) {
            return "user_folder";
        }
        return "all";
    }

    public final List A01() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(this.A05);
        this.A01 = arrayList;
        return arrayList;
    }

    public final int BEU() {
        return this.A02;
    }

    public final Integer CAp() {
        return AnonymousClass05K.A00;
    }

    public final String getName() {
        String str = this.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final int getSize() {
        return this.A00;
    }

    public final String getSubtitle() {
        String str = this.A04;
        if (str == null) {
            return "";
        }
        return str;
    }

    public Folder(Parcel parcel) {
        Parcelable.Creator creator;
        TreeSet treeSet = new TreeSet(C357278Xg.A00);
        this.A05 = treeSet;
        this.A06 = new HashSet();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = parcel.readInt() != 0;
        Class<Medium> cls = Medium.class;
        Object obj = cls.getDeclaredField("CREATOR").get((Object) null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            String A002 = C66579MXk.A00(90);
            Map map = 0Yh.A03;
            throw new IllegalArgumentException(002.A0R(A002, 0q1.A01(cls)));
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        if (createTypedArrayList != null) {
            treeSet.addAll(createTypedArrayList);
        }
    }

    public Folder(String str, String str2, int i, boolean z) {
        this.A05 = new TreeSet(C357278Xg.A00);
        this.A06 = new HashSet();
        this.A02 = i;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = z;
    }
}
