package com.instagram.bloks.hosting;

import X.0lg;
import X.17k;
import X.1Kn;
import X.AnonymousClass05K;
import X.AnonymousClass6Su;
import X.AnonymousClass7TE;
import X.C14615TzM;
import X.C20880X2h;
import X.C258053yO;
import X.C276544tV;
import X.C277014uI;
import X.C3034368u;
import X.C307786Rm;
import X.C359618dD;
import X.C46471DfZ;
import X.C46615Dhv;
import X.C46636DiG;
import X.C46644DiP;
import X.C48718Ej3;
import X.C51149FpL;
import X.DbY;
import X.F1F;
import X.F3o;
import X.FK6;
import X.XCK;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IgBloksScreenConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FK6.A00(92);
    public int A00 = 16;
    public C20880X2h A01;
    public C51149FpL A02;
    public F1F A03;
    public XCK A04;
    public F3o A05;
    public C3034368u A06;
    public C3034368u A07;
    public C276544tV A08;
    public C277014uI A09;
    public C277014uI A0A;
    public 0lg A0B;
    public C46471DfZ A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P = AnonymousClass05K.A00;
    public Integer A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public HashMap A0V;
    public HashMap A0W;
    public List A0X;
    public Map A0Y;
    public boolean A0Z = true;
    public boolean A0a = false;
    public boolean A0b = false;
    public boolean A0c;
    public boolean A0d = false;
    public boolean A0e = false;
    public boolean A0f = false;
    public boolean A0g = false;
    public boolean A0h = false;
    public boolean A0i = false;
    public boolean A0j = false;
    public boolean A0k = true;
    public boolean A0l = false;
    public boolean A0m = false;
    public boolean A0n = false;
    public boolean A0o = false;
    public boolean A0p = false;
    public Integer A0q;
    public Integer A0r;
    public final Set A0s = AnonymousClass7TE.A1F();

    public final int describeContents() {
        return 0;
    }

    private int A00(Object obj) {
        if (this.A0o) {
            return C14615TzM.A00(obj);
        }
        return C46636DiG.A00(this.A0B).A01(obj);
    }

    public static IgBloksScreenConfig A01(Bundle bundle, 0lg r4) {
        17k.A07(bundle, "Fragment must be passed args");
        17k.A07(r4, "A valid session must be provided");
        IgBloksScreenConfig igBloksScreenConfig = (IgBloksScreenConfig) bundle.getParcelable("screen_config");
        if (igBloksScreenConfig == null) {
            return null;
        }
        igBloksScreenConfig.A0B = r4;
        C46636DiG A002 = C46636DiG.A00(r4);
        Class<C3034368u> cls = C3034368u.class;
        igBloksScreenConfig.A07 = (C3034368u) igBloksScreenConfig.A03(A002, cls, igBloksScreenConfig.A0M);
        Class<C277014uI> cls2 = C277014uI.class;
        igBloksScreenConfig.A09 = (C277014uI) igBloksScreenConfig.A03(A002, cls2, igBloksScreenConfig.A0G);
        igBloksScreenConfig.A0A = (C277014uI) igBloksScreenConfig.A03(A002, cls2, igBloksScreenConfig.A0L);
        igBloksScreenConfig.A05 = (F3o) igBloksScreenConfig.A03(A002, F3o.class, igBloksScreenConfig.A0Q);
        igBloksScreenConfig.A03 = (F1F) igBloksScreenConfig.A03(A002, F1F.class, igBloksScreenConfig.A0H);
        igBloksScreenConfig.A06 = (C3034368u) igBloksScreenConfig.A03(A002, cls, igBloksScreenConfig.A0J);
        igBloksScreenConfig.A0K = (Integer) igBloksScreenConfig.A03(A002, Integer.class, igBloksScreenConfig.A0K);
        igBloksScreenConfig.A08 = (C276544tV) igBloksScreenConfig.A03(A002, C276544tV.class, igBloksScreenConfig.A0I);
        igBloksScreenConfig.A0X = (List) igBloksScreenConfig.A03(A002, List.class, igBloksScreenConfig.A0O);
        igBloksScreenConfig.A0Y = (Map) igBloksScreenConfig.A03(A002, Map.class, igBloksScreenConfig.A0F);
        return igBloksScreenConfig;
    }

    public static Integer A02(Parcel parcel) {
        return (Integer) parcel.readValue(IgBloksScreenConfig.class.getClassLoader());
    }

    private Object A03(C46636DiG diG, Class cls, Integer num) {
        Object obj;
        if (num == null) {
            return null;
        }
        this.A0s.add(num);
        if (this.A0o) {
            return C14615TzM.A01(cls, num);
        }
        int intValue = num.intValue();
        synchronized (diG.A02) {
            try {
                obj = cls.cast(diG.A01.get(intValue));
            } catch (ClassCastException e) {
                obj = null;
                1Kn.A00((C307786Rm) null, "IgBloksDataCache", "Found mismatched types when retrieving data.", e);
            }
        }
        return obj;
    }

    public static void A04(Bundle bundle, IgBloksScreenConfig igBloksScreenConfig, boolean z) {
        igBloksScreenConfig.A0o = z;
        C3034368u r1 = igBloksScreenConfig.A07;
        if (r1 != null && igBloksScreenConfig.A0M == null) {
            igBloksScreenConfig.A0M = Integer.valueOf(igBloksScreenConfig.A00(r1));
        }
        C277014uI r12 = igBloksScreenConfig.A0A;
        if (r12 != null && igBloksScreenConfig.A0L == null) {
            igBloksScreenConfig.A0L = Integer.valueOf(igBloksScreenConfig.A00(r12));
        }
        Map map = igBloksScreenConfig.A0Y;
        if (map != null && igBloksScreenConfig.A0F == null) {
            igBloksScreenConfig.A0F = Integer.valueOf(igBloksScreenConfig.A00(map));
        }
        F3o f3o = igBloksScreenConfig.A05;
        if (f3o != null && igBloksScreenConfig.A0Q == null) {
            igBloksScreenConfig.A0Q = Integer.valueOf(igBloksScreenConfig.A00(f3o));
        }
        F1F f1f = igBloksScreenConfig.A03;
        if (f1f != null && igBloksScreenConfig.A0H == null) {
            igBloksScreenConfig.A0H = Integer.valueOf(igBloksScreenConfig.A00(f1f));
        }
        bundle.putParcelable("screen_config", igBloksScreenConfig);
    }

    public final C359618dD A05() {
        return new C359618dD(this.A0B, this.A0d, this.A0n, this.A0e);
    }

    public final void A06() {
        17k.A07(this.A0B, "Can't destroy an uninitialized config!");
        Set<Integer> set = this.A0s;
        if (!set.isEmpty()) {
            C46636DiG A002 = C46636DiG.A00(this.A0B);
            for (Integer num : set) {
                if (this.A0o) {
                    C14615TzM.A03(num);
                } else {
                    A002.A03(num.intValue());
                }
            }
        }
    }

    public final void A07(C46615Dhv dhv) {
        this.A0U = dhv.A06;
        this.A0T = dhv.A05;
        this.A0k = !dhv.A0A;
        this.A0j = dhv.A08;
        this.A0m = !dhv.A09;
        C276544tV r2 = dhv.A03;
        if (r2 != null) {
            try {
                String A0F2 = r2.A0F();
                int i = 0;
                if (A0F2 != null) {
                    i = AnonymousClass6Su.A03(A0F2);
                }
                this.A0E = Integer.valueOf(i);
                String A0D2 = r2.A0D();
                int i2 = 0;
                if (A0D2 != null) {
                    i2 = AnonymousClass6Su.A03(A0D2);
                }
                this.A0D = Integer.valueOf(i2);
            } catch (C258053yO unused) {
                1Kn.A02("invalid_themed_color", "Error parsing themed color for NavBar");
            }
        }
        C46636DiG A002 = C46636DiG.A00(this.A0B);
        Integer num = this.A0G;
        if (num != null) {
            A002.A03(num.intValue());
            this.A09 = null;
            this.A0G = null;
        }
        Integer num2 = this.A0J;
        if (num2 != null) {
            A002.A03(num2.intValue());
            this.A06 = null;
            this.A0J = null;
        }
        Integer num3 = this.A0K;
        if (num3 != null) {
            A002.A03(num3.intValue());
            this.A01 = null;
            this.A0K = null;
        }
        Integer num4 = this.A0I;
        if (num4 != null) {
            A002.A03(num4.intValue());
            this.A08 = null;
            this.A0I = null;
        }
        Integer num5 = this.A0O;
        if (num5 != null) {
            A002.A03(num5.intValue());
            this.A0X = null;
            this.A0O = null;
        }
        C277014uI r0 = dhv.A04;
        if (r0 != null) {
            this.A09 = r0;
            this.A0G = Integer.valueOf(A00(r0));
        }
        C3034368u r02 = dhv.A01;
        if (r02 != null) {
            this.A06 = r02;
            this.A0J = Integer.valueOf(A00(r02));
        }
        C20880X2h x2h = dhv.A00;
        if (x2h != null) {
            this.A01 = x2h;
            this.A0K = Integer.valueOf(A00(x2h));
        }
        C276544tV r03 = dhv.A02;
        if (r03 != null) {
            this.A08 = r03;
            this.A0I = Integer.valueOf(A00(r03));
        }
        List list = dhv.A07;
        if (list != null) {
            this.A0X = list;
            this.A0O = Integer.valueOf(A00(list));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0T);
        parcel.writeSerializable(this.A04);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A0R);
        parcel.writeSerializable(this.A0W);
        parcel.writeSerializable(this.A0V);
        parcel.writeValue(this.A0N);
        parcel.writeInt(this.A0l ? 1 : 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0m ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        parcel.writeInt(this.A0h ? 1 : 0);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0n ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeValue(this.A0E);
        parcel.writeValue(this.A0D);
        parcel.writeValue(this.A0M);
        parcel.writeValue(this.A0G);
        parcel.writeValue(this.A0L);
        parcel.writeValue(this.A0Q);
        parcel.writeValue(this.A0H);
        parcel.writeInt(this.A0o ? 1 : 0);
        parcel.writeValue(this.A0J);
        parcel.writeValue(this.A0K);
        parcel.writeValue(this.A0I);
        parcel.writeValue(this.A0O);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeValue(this.A0F);
        parcel.writeString(C46644DiP.A04(this.A0P));
        parcel.writeString(this.A0S);
        parcel.writeValue(this.A0q);
        parcel.writeValue(this.A0r);
        if (this.A0C == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeBundle(this.A0C.A00());
        }
        parcel.writeInt(this.A0b ? 1 : 0);
        parcel.writeInt(this.A0a ? 1 : 0);
    }

    public IgBloksScreenConfig(Parcel parcel) {
        boolean z = false;
        this.A0U = parcel.readString();
        this.A0T = parcel.readString();
        this.A04 = (XCK) parcel.readSerializable();
        this.A02 = (C51149FpL) parcel.readSerializable();
        this.A0R = parcel.readString();
        this.A0W = (HashMap) parcel.readSerializable();
        this.A0V = (HashMap) parcel.readSerializable();
        this.A0N = A02(parcel);
        this.A0l = DbY.A1X(parcel);
        this.A0i = DbY.A1X(parcel);
        this.A0k = DbY.A1X(parcel);
        this.A0j = DbY.A1X(parcel);
        this.A0m = DbY.A1X(parcel);
        this.A0f = DbY.A1X(parcel);
        this.A0h = DbY.A1X(parcel);
        this.A0g = DbY.A1X(parcel);
        this.A0n = DbY.A1X(parcel);
        this.A0e = DbY.A1X(parcel);
        this.A0Z = DbY.A1X(parcel);
        this.A0E = A02(parcel);
        this.A0D = A02(parcel);
        this.A0M = A02(parcel);
        this.A0G = A02(parcel);
        this.A0L = A02(parcel);
        this.A0Q = A02(parcel);
        this.A0H = A02(parcel);
        this.A0o = DbY.A1X(parcel);
        this.A0J = A02(parcel);
        this.A0K = A02(parcel);
        this.A0I = A02(parcel);
        this.A0O = A02(parcel);
        this.A0c = DbY.A1X(parcel);
        this.A00 = parcel.readInt();
        this.A0d = DbY.A1X(parcel);
        this.A0F = A02(parcel);
        this.A0P = C48718Ej3.A00(parcel.readString());
        this.A0S = parcel.readString();
        this.A0q = A02(parcel);
        this.A0r = A02(parcel);
        if (parcel.readByte() == 1) {
            Bundle readBundle = parcel.readBundle(Bundle.class.getClassLoader());
            if (readBundle == null) {
                1Kn.A02("IgBloksScreenConfig", "Parcelized CdsOpenScreenConfig should not be null");
            } else {
                this.A0C = C46471DfZ.A0P.A00(readBundle);
            }
        }
        this.A0b = DbY.A1X(parcel);
        this.A0a = parcel.readInt() == 1 ? true : z;
    }

    public IgBloksScreenConfig(0lg r3) {
        this.A0B = r3;
    }
}
