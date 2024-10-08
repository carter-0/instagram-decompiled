package com.facebook.odin.model;

import X.002;
import X.0Yt;
import X.0qQ;
import X.0sm;
import X.0sn;
import X.AnonymousClass0T0;
import X.AnonymousClass409;
import X.AnonymousClass40E;
import X.C249703kE;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C258643zP;
import X.C258653zQ;
import X.C258663zR;
import X.C258703zV;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class FeatureData extends AnonymousClass0T0 {
    public static final C255463uA[] A0E;
    public static final Companion Companion = new Object();
    public final double A00;
    public final long A01;
    public final Type A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Map A0C;
    public final boolean A0D;

    public final class Companion {
        public final C255463uA serializer() {
            return FeatureData$$serializer.INSTANCE;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.odin.model.FeatureData$Companion, java.lang.Object] */
    static {
        C258653zQ A002 = C258643zP.A00("com.facebook.odin.model.Type", Type.values());
        C258663zR r1 = C258663zR.A00;
        AnonymousClass409 r10 = new AnonymousClass409(r1);
        C258703zV r0 = C258703zV.A00;
        AnonymousClass409 r11 = new AnonymousClass409(r0);
        C255453u9 r3 = C255453u9.A01;
        AnonymousClass409 r12 = new AnonymousClass409(r3);
        AnonymousClass40E r2 = AnonymousClass40E.A00;
        A0E = new C255463uA[]{null, A002, null, null, null, null, r10, r11, r12, new AnonymousClass409(r2), new C258613zM(r3, r1), new C258613zM(r3, r0), new C258613zM(r3, r3), new C258613zM(r3, r2)};
    }

    public FeatureData() {
        this((Type) null, (String) null, (String) null, (List) null, 0.0d, 16383, 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls, getClass())) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.odin.model.FeatureData");
        FeatureData featureData = (FeatureData) obj;
        return 0qQ.A0K(this.A03, featureData.A03) && this.A02 == featureData.A02 && 0qQ.A0K(A00(), featureData.A00());
    }

    public /* synthetic */ FeatureData(Type type, String str, String str2, List list, double d, int i, long j) {
        0sn r4;
        0sm r3;
        0sm r2;
        0sm r1;
        String str3 = str2;
        Type type2 = type;
        List list2 = list;
        double d2 = d;
        long j2 = j;
        0sn r13 = null;
        0sn r12 = null;
        0sm r11 = null;
        int i2 = i;
        String str4 = (i & 1) != 0 ? "" : str;
        type2 = (i & 2) != 0 ? Type.DOUBLE : type2;
        j2 = (i & 4) != 0 ? -1 : j2;
        d2 = (i & 8) != 0 ? -1.0d : d2;
        str3 = (i & 16) != 0 ? null : str3;
        list2 = (i & 64) != 0 ? 0sn.A00 : list2;
        if ((i2 & 128) != 0) {
            r4 = 0sn.A00;
        } else {
            r4 = null;
        }
        r13 = (i2 & 256) != 0 ? 0sn.A00 : r13;
        r12 = (i2 & 512) != 0 ? 0sn.A00 : r12;
        if ((i2 & 1024) != 0) {
            r3 = 0Yt.A0E();
        } else {
            r3 = null;
        }
        if ((i2 & C249703kE.FLAG_MOVED) != 0) {
            r2 = 0Yt.A0E();
        } else {
            r2 = null;
        }
        if ((i2 & 4096) != 0) {
            r1 = 0Yt.A0E();
        } else {
            r1 = null;
        }
        r11 = (i2 & 8192) != 0 ? 0Yt.A0E() : r11;
        0qQ.A0B(str4, 1);
        0qQ.A0B(type2, 2);
        0qQ.A0B(list2, 7);
        0qQ.A0B(r4, 8);
        0qQ.A0B(r13, 9);
        0qQ.A0B(r12, 10);
        0qQ.A0B(r3, 11);
        0qQ.A0B(r2, 12);
        0qQ.A0B(r1, 13);
        0qQ.A0B(r11, 14);
        this.A03 = str4;
        this.A02 = type2;
        this.A01 = j2;
        this.A00 = d2;
        this.A04 = str3;
        this.A0D = false;
        this.A07 = list2;
        this.A06 = r4;
        this.A08 = r13;
        this.A05 = r12;
        this.A0B = r3;
        this.A0A = r2;
        this.A0C = r1;
        this.A09 = r11;
    }

    public final String A00() {
        String valueOf;
        Object obj;
        switch (this.A02.ordinal()) {
            case 0:
                valueOf = String.valueOf(this.A01);
                break;
            case 1:
                valueOf = new BigDecimal(String.valueOf(this.A00)).toPlainString();
                break;
            case 2:
                valueOf = this.A04;
                break;
            case 3:
                valueOf = String.valueOf(this.A0D);
                break;
            case 4:
                obj = this.A08;
                break;
            case 5:
                obj = this.A07;
                break;
            case 6:
                obj = this.A06;
                break;
            case 7:
                obj = this.A05;
                break;
            case 8:
                obj = this.A0C;
                break;
            case 9:
                obj = this.A0B;
                break;
            case 10:
                obj = this.A0A;
                break;
            case 11:
                obj = this.A09;
                break;
            default:
                valueOf = "Value type unsupported";
                break;
        }
        valueOf = obj.toString();
        return String.valueOf(valueOf);
    }

    public final int hashCode() {
        return 002.A0T(this.A03, A00(), '=').hashCode();
    }

    public final String toString() {
        return 002.A0v("(id:", this.A03, ", value:", A00(), ')');
    }

    public /* synthetic */ FeatureData(Type type, String str, String str2, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, double d, int i, long j, boolean z) {
        Type type2 = type;
        List list5 = list;
        String str3 = str2;
        List list6 = list4;
        List list7 = list3;
        List list8 = list2;
        Map map5 = map3;
        Map map6 = map2;
        Map map7 = map;
        Map map8 = map4;
        double d2 = d;
        long j2 = j;
        int i2 = i;
        this.A03 = (i & 1) == 0 ? "" : str;
        this.A02 = (i & 2) == 0 ? Type.DOUBLE : type2;
        this.A01 = (i & 4) == 0 ? -1 : j2;
        this.A00 = (i & 8) == 0 ? -1.0d : d2;
        this.A04 = (i & 16) == 0 ? null : str3;
        if ((i & 32) == 0) {
            this.A0D = false;
        } else {
            this.A0D = z;
        }
        this.A07 = (i & 64) == 0 ? 0sn.A00 : list5;
        this.A06 = (i2 & 128) == 0 ? 0sn.A00 : list8;
        this.A08 = (i2 & 256) == 0 ? 0sn.A00 : list7;
        this.A05 = (i2 & 512) == 0 ? 0sn.A00 : list6;
        this.A0B = (i2 & 1024) == 0 ? 0Yt.A0E() : map7;
        this.A0A = (i2 & C249703kE.FLAG_MOVED) == 0 ? 0Yt.A0E() : map6;
        this.A0C = (i2 & 4096) == 0 ? 0Yt.A0E() : map5;
        this.A09 = (i2 & 8192) == 0 ? 0Yt.A0E() : map8;
    }
}
