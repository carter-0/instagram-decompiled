package com.instagram.direct.msys.subtype;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.JTS;
import X.LVP;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class MsysThreadSubtype implements Parcelable {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final class Unknown extends MsysThreadSubtype {
        public static final Parcelable.Creator CREATOR = new W6E(3);
        public final Integer A00;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unknown) && 0qQ.A0K(this.A00, ((Unknown) obj).A00));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            parcel.writeInt(C41847B3o.A00(parcel, this.A00));
        }

        public final int hashCode() {
            return AnonymousClass7TG.A0C(this.A00);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Unknown(java.lang.Integer r4) {
            /*
                r3 = this;
                int r2 = X.DbX.A01(r4)
                java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
                java.lang.String r0 = "UNKNOWN_"
                r1.append(r0)
                r1.append(r4)
                r1.toString()
                r0 = 0
                r3.<init>(r2, r0, r0, r0)
                r3.A00 = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.msys.subtype.MsysThreadSubtype.Unknown.<init>(java.lang.Integer):void");
        }
    }

    public MsysThreadSubtype(int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
    }

    public final class BlendDualSend extends MsysThreadSubtype {
        public static final BlendDualSend A00 = new BlendDualSend();
        public static final Parcelable.Creator CREATOR = new LVP(98);

        public BlendDualSend() {
            super(4, true, false, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class BlendDualSendNoNetwork extends MsysThreadSubtype {
        public static final BlendDualSendNoNetwork A00 = new BlendDualSendNoNetwork();
        public static final Parcelable.Creator CREATOR = new LVP(99);

        public BlendDualSendNoNetwork() {
            super(5, true, false, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class BtvCompanion extends MsysThreadSubtype {
        public static final BtvCompanion A00 = new BtvCompanion();
        public static final Parcelable.Creator CREATOR = new W6E(0);

        public BtvCompanion() {
            super(3, true, true, true);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class DualSendShadow extends MsysThreadSubtype {
        public static final DualSendShadow A00 = new DualSendShadow();
        public static final Parcelable.Creator CREATOR = new W6E(1);

        public DualSendShadow() {
            super(2, true, false, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }

    public final class Standard extends MsysThreadSubtype {
        public static final Standard A00 = new Standard();
        public static final Parcelable.Creator CREATOR = new W6E(2);

        public Standard() {
            super(0, false, false, false);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            JTS.A0v(parcel);
        }
    }
}
