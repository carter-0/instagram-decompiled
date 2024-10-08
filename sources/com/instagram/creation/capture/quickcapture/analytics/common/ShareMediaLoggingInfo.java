package com.instagram.creation.capture.quickcapture.analytics.common;

import X.00k;
import X.0Yt;
import X.0qQ;
import X.0sm;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C358088aL;
import X.C378199Ow;
import X.C41847B3o;
import X.C51967G9n;
import X.C63998LHy;
import X.DbX;
import X.DbY;
import X.JTS;
import X.LVP;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.music.common.model.MusicBrowseCategory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ShareMediaLoggingInfo implements Parcelable {
    public static boolean A14;
    public static final Parcelable.Creator CREATOR = LVP.A00(16);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public ACRType A0A;
    public MediaUploadMetadata A0B;
    public MediaTransformation A0C;
    public GallerySuggestionsInfo A0D;
    public MusicBrowseCategory A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Long A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public HashMap A0a;
    public HashMap A0b;
    public HashMap A0c;
    public List A0d;
    public List A0e;
    public List A0f;
    public List A0g;
    public List A0h;
    public List A0i;
    public List A0j;
    public List A0k;
    public List A0l;
    public List A0m;
    public List A0n;
    public List A0o;
    public List A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeStringList(this.A0e);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeStringList(this.A0g);
        parcel.writeStringList(this.A0h);
        parcel.writeStringList(this.A0f);
        0sm r0 = this.A0a;
        if (r0 == null) {
            r0 = 0Yt.A0E();
        }
        parcel.writeBundle(C63998LHy.A00(r0));
        parcel.writeStringList(this.A0j);
        parcel.writeString(this.A0V);
        0sm r02 = this.A0b;
        if (r02 == null) {
            r02 = 0Yt.A0E();
        }
        parcel.writeBundle(C63998LHy.A00(r02));
        parcel.writeInt(this.A0v ? 1 : 0);
        parcel.writeInt(this.A06);
        parcel.writeStringList(this.A0l);
        parcel.writeStringList(this.A0m);
        parcel.writeStringList(this.A0n);
        if (!A14) {
            parcel.writeStringList(this.A0o);
        }
        parcel.writeBundle(C63998LHy.A00(this.A0c));
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0R);
        parcel.writeSerializable(this.A0G);
        parcel.writeString(this.A0Z);
        parcel.writeInt(DbX.A02(this.A0H));
        parcel.writeInt(C51967G9n.A04(this.A0I, -1));
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A0w ? 1 : 0);
        parcel.writeParcelable(this.A0E, i);
        parcel.writeInt(this.A0x ? 1 : 0);
        parcel.writeLong(this.A09);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeInt(this.A0z ? 1 : 0);
        parcel.writeInt(AnonymousClass7TG.A0A(this.A0F));
        parcel.writeInt(this.A0y ? 1 : 0);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeStringList(this.A0d);
        parcel.writeInt(this.A13 ? 1 : 0);
        parcel.writeList(this.A0k);
        parcel.writeList(this.A0p);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A00);
        ACRType aCRType = this.A0A;
        if (aCRType == null || (str = aCRType.A00) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0Y);
        parcel.writeInt(this.A0r ? 1 : 0);
        parcel.writeInt(this.A0s ? 1 : 0);
        parcel.writeInt(this.A0t ? 1 : 0);
        parcel.writeInt(this.A0u ? 1 : 0);
        parcel.writeInt(this.A12 ? 1 : 0);
        parcel.writeString(this.A0X);
        parcel.writeString(this.A0W);
        parcel.writeLong(JTS.A06(this.A0J));
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A10 ? 1 : 0);
        parcel.writeString(this.A0K);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeList(this.A0i);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0P);
        parcel.writeInt(this.A11 ? 1 : 0);
        parcel.writeInt(this.A0q ? 1 : 0);
    }

    public ShareMediaLoggingInfo(Parcel parcel) {
        Integer num;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        ACRType aCRType;
        this.A0e = AnonymousClass7TE.A1C();
        this.A0c = AnonymousClass7TE.A1E();
        String str = "";
        this.A0O = str;
        Long l = null;
        this.A0B = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
        Parcel parcel2 = parcel;
        this.A05 = parcel2.readInt();
        this.A01 = parcel2.readInt();
        this.A02 = parcel2.readInt();
        parcel2.readStringList(this.A0e);
        this.A04 = parcel2.readInt();
        this.A03 = parcel2.readInt();
        ArrayList A1C = AnonymousClass7TE.A1C();
        parcel2.readStringList(A1C);
        this.A0g = A1C;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        parcel2.readStringList(A1C2);
        this.A0h = A1C2;
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        parcel2.readStringList(A1C3);
        this.A0f = A1C3;
        Class<?> cls = getClass();
        this.A0a = C63998LHy.A01(parcel2.readBundle(cls.getClassLoader()));
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        parcel2.readStringList(A1C4);
        this.A0j = A1C4;
        this.A0V = parcel2.readString();
        this.A0b = C63998LHy.A01(parcel2.readBundle(cls.getClassLoader()));
        boolean z = false;
        this.A0v = AnonymousClass7TF.A1S(parcel2.readInt(), 1);
        this.A06 = parcel2.readInt();
        ArrayList A1C5 = AnonymousClass7TE.A1C();
        parcel2.readStringList(A1C5);
        this.A0l = A1C5;
        ArrayList A1C6 = AnonymousClass7TE.A1C();
        parcel2.readStringList(A1C6);
        this.A0m = A1C6;
        ArrayList A1C7 = AnonymousClass7TE.A1C();
        parcel2.readStringList(A1C7);
        this.A0n = A1C7;
        ArrayList A1C8 = AnonymousClass7TE.A1C();
        if (!A14) {
            parcel2.readStringList(A1C8);
        }
        this.A0o = A1C8;
        this.A0c = C63998LHy.A01(parcel2.readBundle(cls.getClassLoader()));
        this.A0L = parcel2.readString();
        this.A0M = parcel2.readString();
        this.A0S = parcel2.readString();
        this.A0R = parcel2.readString();
        Serializable readSerializable = parcel2.readSerializable();
        if (readSerializable instanceof Integer) {
            num = (Integer) readSerializable;
        } else {
            num = null;
        }
        this.A0G = num;
        this.A0Z = parcel2.readString();
        int readInt = parcel2.readInt();
        if (readInt == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(readInt);
        }
        this.A0H = valueOf;
        int readInt2 = parcel2.readInt();
        if (readInt2 == -1) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(readInt2);
        }
        this.A0I = valueOf2;
        this.A0N = parcel2.readString();
        this.A0w = DbY.A1X(parcel2);
        this.A0E = (MusicBrowseCategory) C41847B3o.A03(parcel2, MusicBrowseCategory.class);
        this.A0x = DbY.A1X(parcel2);
        this.A09 = parcel2.readLong();
        this.A0C = (MediaTransformation) C41847B3o.A03(parcel2, MediaTransformation.class);
        this.A0z = DbY.A1X(parcel2);
        int readInt3 = parcel2.readInt();
        if (readInt3 == 0) {
            valueOf3 = null;
        } else {
            valueOf3 = Integer.valueOf(readInt3);
        }
        this.A0F = valueOf3;
        this.A0y = DbY.A1X(parcel2);
        this.A0D = (GallerySuggestionsInfo) C41847B3o.A03(parcel2, GallerySuggestionsInfo.class);
        ArrayList A1C9 = AnonymousClass7TE.A1C();
        parcel2.readStringList(A1C9);
        this.A0d = A1C9;
        this.A13 = DbY.A1X(parcel2);
        ArrayList A1C10 = AnonymousClass7TE.A1C();
        int i = Build.VERSION.SDK_INT;
        Class<List> cls2 = List.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (i >= 33) {
            parcel2.readList(A1C10, classLoader, Long.TYPE);
        } else {
            parcel2.readList(A1C10, classLoader);
        }
        this.A0k = A1C10;
        ArrayList A1C11 = AnonymousClass7TE.A1C();
        ClassLoader classLoader2 = cls2.getClassLoader();
        if (i >= 33) {
            parcel2.readList(A1C11, classLoader2, Long.TYPE);
        } else {
            parcel2.readList(A1C11, classLoader2);
        }
        this.A0p = A1C11;
        this.A08 = parcel2.readInt();
        this.A00 = parcel2.readInt();
        String readString = parcel2.readString();
        if (readString == null || readString.length() == 0) {
            aCRType = null;
        } else {
            aCRType = C378199Ow.A00(readString);
        }
        this.A0A = aCRType;
        String readString2 = parcel2.readString();
        this.A0O = readString2 != null ? readString2 : str;
        this.A0Y = parcel2.readString();
        this.A0r = DbY.A1X(parcel2);
        this.A0s = DbY.A1X(parcel2);
        this.A0t = DbY.A1X(parcel2);
        this.A0u = DbY.A1X(parcel2);
        this.A12 = DbY.A1X(parcel2);
        this.A0X = parcel2.readString();
        this.A0W = parcel2.readString();
        long readLong = parcel2.readLong();
        this.A0J = readLong >= 0 ? Long.valueOf(readLong) : l;
        this.A07 = parcel2.readInt();
        this.A10 = DbY.A1X(parcel2);
        this.A0K = parcel2.readString();
        MediaUploadMetadata mediaUploadMetadata = (MediaUploadMetadata) C41847B3o.A03(parcel2, MediaUploadMetadata.class);
        this.A0B = mediaUploadMetadata == null ? new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false) : mediaUploadMetadata;
        ArrayList A1C12 = AnonymousClass7TE.A1C();
        ClassLoader classLoader3 = cls2.getClassLoader();
        if (i >= 33) {
            parcel2.readList(A1C12, classLoader3, Long.TYPE);
        } else {
            parcel2.readList(A1C12, classLoader3);
        }
        this.A0i = A1C12;
        this.A0U = parcel2.readString();
        this.A0T = parcel2.readString();
        this.A0P = parcel2.readString();
        this.A11 = DbY.A1X(parcel2);
        this.A0q = parcel2.readInt() == 1 ? true : z;
    }

    public final Pair A00() {
        List list;
        List list2;
        List list3 = this.A0o;
        List list4 = this.A0n;
        HashMap hashMap = this.A0c;
        if (hashMap == null || hashMap.size() <= 0) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (list4 != null) {
                A1C.addAll(list4);
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            list = A1C;
            list2 = A1C2;
            if (list3 != null) {
                A1C2.addAll(list3);
                list = A1C;
                list2 = A1C2;
            }
        } else {
            Set keySet = hashMap.keySet();
            0qQ.A07(keySet);
            List A0a2 = 00k.A0a(keySet);
            Collection values = hashMap.values();
            0qQ.A07(values);
            ArrayList A0r2 = AnonymousClass7TG.A0r(values);
            for (Object next : values) {
                if (next == null) {
                    next = "";
                }
                A0r2.add(next);
            }
            list = A0a2;
            list2 = 00k.A0a(A0r2);
        }
        return new Pair(list, list2);
    }

    public final ArrayList A01() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = this.A0e.iterator();
        while (it.hasNext()) {
            A1C.add(C358088aL.valueOf(AnonymousClass7TE.A18(it)));
        }
        return A1C;
    }

    public ShareMediaLoggingInfo() {
        this.A0e = AnonymousClass7TE.A1C();
        this.A0c = AnonymousClass7TE.A1E();
        this.A0O = "";
        this.A0B = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
