package com.facebook.smartcapture.flow;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C11367SPk;
import X.C51971G9r;
import X.DbY;
import X.Pxf;
import X.Pxh;
import X.Pxi;
import X.Pxj;
import X.RE7;
import X.RF2;
import X.SG1;
import X.SWZ;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.clientsignals.ClientSignalsAccumulator;
import com.facebook.smartcapture.download.CreditCardModulesDownloader;
import com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.IdCaptureUi;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IdCaptureConfig implements Parcelable {
    public static volatile RE7 A0S;
    public static volatile RF2 A0T;
    public static volatile StringOverrideFactory A0U;
    public static volatile Integer A0V;
    public static final Parcelable.Creator CREATOR = SWZ.A01(56);
    public final int A00;
    public final long A01;
    public final long A02;
    public final Bundle A03;
    public final FixedSizes A04;
    public final ClientSignalsAccumulator A05;
    public final CreditCardModulesDownloader A06;
    public final IdCaptureExperimentConfigProvider A07;
    public final SmartCaptureLoggerProvider A08;
    public final ResourcesProvider A09;
    public final IdCaptureUi A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final RE7 A0M;
    public final RF2 A0N;
    public final StringOverrideFactory A0O;
    public final Integer A0P;
    public final Set A0Q;
    public final boolean A0R;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdCaptureConfig) {
                IdCaptureConfig idCaptureConfig = (IdCaptureConfig) obj;
                if (!0qQ.A0K(this.A0B, idCaptureConfig.A0B) || A00() != idCaptureConfig.A00() || !0qQ.A0K(this.A0A, idCaptureConfig.A0A) || !0qQ.A0K(this.A05, idCaptureConfig.A05) || A03() != idCaptureConfig.A03() || !0qQ.A0K(this.A07, idCaptureConfig.A07) || A01() != idCaptureConfig.A01() || !0qQ.A0K(this.A04, idCaptureConfig.A04) || !0qQ.A0K(this.A0C, idCaptureConfig.A0C) || this.A0H != idCaptureConfig.A0H || this.A0I != idCaptureConfig.A0I || this.A0R != idCaptureConfig.A0R || this.A0J != idCaptureConfig.A0J || this.A0K != idCaptureConfig.A0K || this.A0L != idCaptureConfig.A0L || !0qQ.A0K(this.A08, idCaptureConfig.A08) || !0qQ.A0K(this.A0D, idCaptureConfig.A0D) || this.A01 != idCaptureConfig.A01 || !0qQ.A0K(this.A06, idCaptureConfig.A06) || !0qQ.A0K(this.A0E, idCaptureConfig.A0E) || !0qQ.A0K(this.A0F, idCaptureConfig.A0F) || !0qQ.A0K(this.A09, idCaptureConfig.A09) || !0qQ.A0K(this.A0G, idCaptureConfig.A0G) || !0qQ.A0K(A02(), idCaptureConfig.A02()) || this.A02 != idCaptureConfig.A02 || !0qQ.A0K(this.A03, idCaptureConfig.A03) || this.A00 != idCaptureConfig.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final RE7 A00() {
        if (this.A0Q.contains("captureMode")) {
            return this.A0M;
        }
        if (A0S == null) {
            synchronized (this) {
                if (A0S == null) {
                    A0S = RE7.ONE_SIDE;
                }
            }
        }
        return A0S;
    }

    public final RF2 A01() {
        if (this.A0Q.contains("featureLevel")) {
            return this.A0N;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = RF2.LOW_END;
                }
            }
        }
        return A0T;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory, java.lang.Object] */
    public final StringOverrideFactory A02() {
        if (this.A0Q.contains("stringOverrideFactory")) {
            return this.A0O;
        }
        if (A0U == null) {
            synchronized (this) {
                if (A0U == null) {
                    A0U = new Object();
                }
            }
        }
        return A0U;
    }

    public final Integer A03() {
        if (this.A0Q.contains("designSystem")) {
            return this.A0P;
        }
        if (A0V == null) {
            synchronized (this) {
                if (A0V == null) {
                    A0V = AnonymousClass05K.A00;
                }
            }
        }
        return A0V;
    }

    public final int hashCode() {
        int ordinal;
        int intValue;
        int A012 = C11367SPk.A01(this.A0B);
        int i = -1;
        if (A00() == null) {
            ordinal = -1;
        } else {
            ordinal = A00().ordinal();
        }
        int A0E2 = (((((A012 * 31) + ordinal) * 31) + C51971G9r.A0E(this.A0A)) * 31) + C51971G9r.A0E(this.A05);
        if (A03() == null) {
            intValue = -1;
        } else {
            intValue = A03().intValue();
        }
        int A0E3 = (((A0E2 * 31) + intValue) * 31) + C51971G9r.A0E(this.A07);
        if (A01() != null) {
            i = A01().ordinal();
        }
        return (((Pxh.A06(this.A02, ((((((((((((Pxh.A06(this.A01, ((((C11367SPk.A00(C11367SPk.A00(C11367SPk.A00(C11367SPk.A00(C11367SPk.A00(C11367SPk.A00((((((A0E3 * 31) + i) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A0C), this.A0H), this.A0I), this.A0R), this.A0J), this.A0K), this.A0L) * 31) + C51971G9r.A0E(this.A08)) * 31) + C51971G9r.A0E(this.A0D)) * 31) * 31) + C51971G9r.A0E(this.A06)) * 31) + C51971G9r.A0E(this.A0E)) * 31) + C51971G9r.A0E(this.A0F)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A0G)) * 31) + C51971G9r.A0E(A02())) * 31) * 31) + C51971G9r.A0E(this.A03)) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A0B, 0, 1);
        Pxj.A19(parcel, this.A0M);
        Pxj.A18(parcel, this.A0A, i);
        Pxj.A18(parcel, this.A05, i);
        AnonymousClass7TG.A16(parcel, this.A0P, 0, 1);
        Pxj.A18(parcel, this.A07, i);
        Pxj.A19(parcel, this.A0N);
        FixedSizes fixedSizes = this.A04;
        if (fixedSizes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fixedSizes.writeToParcel(parcel, i);
        }
        Pxj.A1B(parcel, this.A0C, 0, 1);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        Pxj.A18(parcel, this.A08, i);
        Pxj.A1B(parcel, this.A0D, 0, 1);
        parcel.writeLong(this.A01);
        Pxj.A18(parcel, this.A06, i);
        parcel.writeString(this.A0E);
        Pxj.A1B(parcel, this.A0F, 0, 1);
        Pxj.A18(parcel, this.A09, i);
        Pxj.A1B(parcel, this.A0G, 0, 1);
        Pxj.A18(parcel, this.A0O, i);
        parcel.writeLong(this.A02);
        Bundle bundle = this.A03;
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        Iterator A0w = Pxj.A0w(parcel, this.A0Q);
        while (A0w.hasNext()) {
            Pxi.A15(parcel, A0w);
        }
    }

    public IdCaptureConfig(Parcel parcel) {
        ClassLoader A0W = Pxf.A0W(this);
        Bundle bundle = null;
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = RE7.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (IdCaptureUi) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ClientSignalsAccumulator) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = Pxi.A0S(parcel, 2);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (IdCaptureExperimentConfigProvider) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = RF2.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (FixedSizes) FixedSizes.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        boolean z = true;
        this.A0H = AnonymousClass7TF.A1S(parcel.readInt(), 1);
        this.A0I = DbY.A1X(parcel);
        this.A0R = DbY.A1X(parcel);
        this.A0J = DbY.A1X(parcel);
        this.A0K = DbY.A1X(parcel);
        this.A0L = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (SmartCaptureLoggerProvider) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A01 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (CreditCardModulesDownloader) parcel.readParcelable(A0W);
        }
        this.A0E = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (ResourcesProvider) parcel.readParcelable(A0W);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = (StringOverrideFactory) parcel.readParcelable(A0W);
        }
        this.A02 = parcel.readLong();
        this.A03 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : bundle;
        this.A00 = parcel.readInt();
        HashSet A1F = AnonymousClass7TE.A1F();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1F.add(parcel.readString());
        }
        this.A0Q = Collections.unmodifiableSet(A1F);
    }

    public IdCaptureConfig(SG1 sg1) {
        this.A0B = sg1.A0D;
        this.A0M = sg1.A04;
        this.A0A = sg1.A0B;
        this.A05 = null;
        this.A0P = sg1.A0C;
        this.A07 = sg1.A07;
        this.A0N = sg1.A05;
        this.A04 = sg1.A03;
        this.A0C = sg1.A0E;
        this.A0H = sg1.A0K;
        this.A0I = sg1.A0L;
        this.A0R = false;
        this.A0J = false;
        this.A0K = sg1.A0M;
        this.A0L = sg1.A0N;
        this.A08 = sg1.A08;
        this.A0D = sg1.A0F;
        this.A01 = 0;
        this.A06 = sg1.A06;
        String str = sg1.A0G;
        C11367SPk.A03(str, "product");
        this.A0E = str;
        this.A0F = sg1.A0H;
        this.A09 = sg1.A09;
        this.A0G = sg1.A0I;
        this.A0O = sg1.A0A;
        this.A02 = sg1.A01;
        this.A03 = sg1.A02;
        this.A00 = sg1.A00;
        this.A0Q = Collections.unmodifiableSet(sg1.A0J);
    }
}
