package com.facebook.smartcapture.flow;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C11367SPk;
import X.C41848B3p;
import X.C51968G9o;
import X.C51971G9r;
import X.C8879RDw;
import X.DbY;
import X.Pxf;
import X.Pxi;
import X.Pxj;
import X.REX;
import X.RF2;
import X.SWZ;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.capture.SelfieEvidenceRecorderProvider;
import com.facebook.smartcapture.clientsignals.ClientSignalsAccumulator;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.experimentation.SelfieCaptureExperimentConfigProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.SelfieCaptureUi;
import com.facebook.smartcapture.ui.consent.ConsentTextsProvider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SelfieCaptureConfig implements Parcelable {
    public static volatile RF2 A0Z;
    public static volatile StringOverrideFactory A0a;
    public static volatile Integer A0b;
    public static final Parcelable.Creator CREATOR = SWZ.A01(57);
    public final int A00;
    public final int A01;
    public final long A02;
    public final Bundle A03;
    public final SelfieEvidenceRecorderProvider A04;
    public final ChallengeProvider A05;
    public final REX A06;
    public final C8879RDw A07;
    public final SelfieCaptureExperimentConfigProvider A08;
    public final FaceTrackerModelsProvider A09;
    public final FaceTrackerProvider A0A;
    public final SmartCaptureLoggerProvider A0B;
    public final ResourcesProvider A0C;
    public final SelfieCaptureUi A0D;
    public final ConsentTextsProvider A0E;
    public final Boolean A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Integer A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final ClientSignalsAccumulator A0T;
    public final RF2 A0U;
    public final FaceTrackerModelsProvider A0V;
    public final StringOverrideFactory A0W;
    public final Integer A0X;
    public final Set A0Y;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelfieCaptureConfig) {
                SelfieCaptureConfig selfieCaptureConfig = (SelfieCaptureConfig) obj;
                if (!0qQ.A0K(this.A0L, selfieCaptureConfig.A0L) || !0qQ.A0K(this.A05, selfieCaptureConfig.A05) || !0qQ.A0K(this.A0T, selfieCaptureConfig.A0T) || !0qQ.A0K(this.A0E, selfieCaptureConfig.A0E) || A02() != selfieCaptureConfig.A02() || !0qQ.A0K(this.A0F, selfieCaptureConfig.A0F) || !0qQ.A0K(this.A0M, selfieCaptureConfig.A0M) || !0qQ.A0K(this.A04, selfieCaptureConfig.A04) || !0qQ.A0K(this.A08, selfieCaptureConfig.A08) || !0qQ.A0K(this.A0G, selfieCaptureConfig.A0G) || !0qQ.A0K(this.A09, selfieCaptureConfig.A09) || !0qQ.A0K(this.A0A, selfieCaptureConfig.A0A) || A00() != selfieCaptureConfig.A00() || !0qQ.A0K(this.A0H, selfieCaptureConfig.A0H) || this.A0R != selfieCaptureConfig.A0R || !0qQ.A0K(this.A0N, selfieCaptureConfig.A0N) || !0qQ.A0K(this.A0V, selfieCaptureConfig.A0V) || this.A0K != selfieCaptureConfig.A0K || !0qQ.A0K(this.A0O, selfieCaptureConfig.A0O) || !0qQ.A0K(this.A0C, selfieCaptureConfig.A0C) || this.A06 != selfieCaptureConfig.A06 || !0qQ.A0K(this.A0D, selfieCaptureConfig.A0D) || !0qQ.A0K(this.A0P, selfieCaptureConfig.A0P) || !0qQ.A0K(this.A0I, selfieCaptureConfig.A0I) || this.A0S != selfieCaptureConfig.A0S || !0qQ.A0K(this.A0J, selfieCaptureConfig.A0J) || !0qQ.A0K(this.A0B, selfieCaptureConfig.A0B) || !0qQ.A0K(A01(), selfieCaptureConfig.A01()) || this.A02 != selfieCaptureConfig.A02 || !0qQ.A0K(this.A03, selfieCaptureConfig.A03) || this.A00 != selfieCaptureConfig.A00 || this.A01 != selfieCaptureConfig.A01 || this.A07 != selfieCaptureConfig.A07 || !0qQ.A0K(this.A0Q, selfieCaptureConfig.A0Q)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final RF2 A00() {
        if (this.A0Y.contains("featureLevel")) {
            return this.A0U;
        }
        if (A0Z == null) {
            synchronized (this) {
                if (A0Z == null) {
                    A0Z = RF2.LOW_END;
                }
            }
        }
        return A0Z;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory, java.lang.Object] */
    public final StringOverrideFactory A01() {
        if (this.A0Y.contains("stringOverrideFactory")) {
            return this.A0W;
        }
        if (A0a == null) {
            synchronized (this) {
                if (A0a == null) {
                    A0a = new Object();
                }
            }
        }
        return A0a;
    }

    public final Integer A02() {
        if (this.A0Y.contains("designSystem")) {
            return this.A0X;
        }
        if (A0b == null) {
            synchronized (this) {
                if (A0b == null) {
                    A0b = AnonymousClass05K.A00;
                }
            }
        }
        return A0b;
    }

    public final int hashCode() {
        int intValue;
        int ordinal;
        int intValue2;
        int ordinal2;
        int A012 = (((((C11367SPk.A01(this.A0L) * 31) + C51971G9r.A0E(this.A05)) * 31) + C51971G9r.A0E(this.A0T)) * 31) + C51971G9r.A0E(this.A0E);
        int i = -1;
        if (A02() == null) {
            intValue = -1;
        } else {
            intValue = A02().intValue();
        }
        int A0E2 = (((((((((((((((A012 * 31) + intValue) * 31) + C51971G9r.A0E(this.A0F)) * 31) + C51971G9r.A0E(this.A0M)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A08)) * 31) + C51971G9r.A0E(this.A0G)) * 31) + C51971G9r.A0E(this.A09)) * 31) + C51971G9r.A0E(this.A0A);
        if (A00() == null) {
            ordinal = -1;
        } else {
            ordinal = A00().ordinal();
        }
        int A002 = (((C11367SPk.A00((((A0E2 * 31) + ordinal) * 31) + C51971G9r.A0E(this.A0H), this.A0R) * 31) + C51971G9r.A0E(this.A0N)) * 31) + C51971G9r.A0E(this.A0V);
        Integer num = this.A0K;
        if (num == null) {
            intValue2 = -1;
        } else {
            intValue2 = num.intValue();
        }
        int A0E3 = (((((A002 * 31) + intValue2) * 31) + C51971G9r.A0E(this.A0O)) * 31) + C51971G9r.A0E(this.A0C);
        REX rex = this.A06;
        if (rex == null) {
            ordinal2 = -1;
        } else {
            ordinal2 = rex.ordinal();
        }
        int A003 = (((((((((((((C11367SPk.A00((((((((A0E3 * 31) + ordinal2) * 31) + C51971G9r.A0E(this.A0D)) * 31) + C51971G9r.A0E(this.A0P)) * 31) + C51971G9r.A0E(this.A0I), this.A0S) * 31) + C51971G9r.A0E(this.A0J)) * 31) + C51971G9r.A0E(this.A0B)) * 31) + C51971G9r.A0E(A01())) * 31) + C51968G9o.A03(this.A02)) * 31) + C51971G9r.A0E(this.A03)) * 31) + this.A00) * 31) + this.A01;
        C8879RDw rDw = this.A07;
        if (rDw != null) {
            i = rDw.ordinal();
        }
        return (((A003 * 31) + i) * 31) + C51971G9r.A0E(this.A0Q);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxj.A1B(parcel, this.A0L, 0, 1);
        ChallengeProvider challengeProvider = this.A05;
        if (challengeProvider == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            challengeProvider.writeToParcel(parcel, i);
        }
        Pxj.A18(parcel, this.A0T, i);
        Pxj.A18(parcel, this.A0E, i);
        AnonymousClass7TG.A16(parcel, this.A0X, 0, 1);
        C41848B3p.A1I(parcel, this.A0F);
        Pxj.A1B(parcel, this.A0M, 0, 1);
        parcel.writeParcelable(this.A04, i);
        Pxj.A18(parcel, this.A08, i);
        C41848B3p.A1I(parcel, this.A0G);
        Pxj.A18(parcel, this.A09, i);
        Pxj.A18(parcel, this.A0A, i);
        Pxj.A19(parcel, this.A0U);
        C41848B3p.A1I(parcel, this.A0H);
        parcel.writeInt(this.A0R ? 1 : 0);
        Pxj.A1B(parcel, this.A0N, 0, 1);
        Pxj.A18(parcel, this.A0V, i);
        AnonymousClass7TG.A16(parcel, this.A0K, 0, 1);
        parcel.writeString(this.A0O);
        Pxj.A18(parcel, this.A0C, i);
        Pxj.A19(parcel, this.A06);
        Pxj.A18(parcel, this.A0D, i);
        Pxj.A1B(parcel, this.A0P, 0, 1);
        C41848B3p.A1I(parcel, this.A0I);
        parcel.writeInt(this.A0S ? 1 : 0);
        C41848B3p.A1I(parcel, this.A0J);
        Pxj.A18(parcel, this.A0B, i);
        Pxj.A18(parcel, this.A0W, i);
        parcel.writeLong(this.A02);
        Bundle bundle = this.A03;
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Pxj.A19(parcel, this.A07);
        Pxj.A1B(parcel, this.A0Q, 0, 1);
        Iterator A0w = Pxj.A0w(parcel, this.A0Y);
        while (A0w.hasNext()) {
            Pxi.A15(parcel, A0w);
        }
    }

    public SelfieCaptureConfig(Parcel parcel) {
        ClassLoader A0W2 = Pxf.A0W(this);
        C8879RDw rDw = null;
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (ChallengeProvider) ChallengeProvider.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = (ClientSignalsAccumulator) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (ConsentTextsProvider) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = Pxi.A0S(parcel, 2);
        }
        boolean z = true;
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = Boolean.valueOf(DbY.A1X(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = parcel.readString();
        }
        this.A04 = (SelfieEvidenceRecorderProvider) parcel.readParcelable(A0W2);
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (SelfieCaptureExperimentConfigProvider) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = Boolean.valueOf(DbY.A1X(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (FaceTrackerModelsProvider) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (FaceTrackerProvider) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = RF2.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = Boolean.valueOf(DbY.A1X(parcel));
        }
        this.A0R = DbY.A1X(parcel);
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = (FaceTrackerModelsProvider) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = Pxi.A0S(parcel, 3);
        }
        this.A0O = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (ResourcesProvider) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = REX.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (SelfieCaptureUi) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = Boolean.valueOf(DbY.A1X(parcel));
        }
        this.A0S = DbY.A1X(parcel);
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = Boolean.valueOf(parcel.readInt() != 1 ? false : z);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = (SmartCaptureLoggerProvider) parcel.readParcelable(A0W2);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = (StringOverrideFactory) parcel.readParcelable(A0W2);
        }
        this.A02 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A07 = parcel.readInt() != 0 ? C8879RDw.values()[parcel.readInt()] : rDw;
        this.A0Q = Pxi.A0e(parcel);
        HashSet A1F = AnonymousClass7TE.A1F();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A1F.add(parcel.readString());
        }
        this.A0Y = Collections.unmodifiableSet(A1F);
    }

    public SelfieCaptureConfig(Bundle bundle, SelfieEvidenceRecorderProvider selfieEvidenceRecorderProvider, ChallengeProvider challengeProvider, REX rex, FaceTrackerModelsProvider faceTrackerModelsProvider, FaceTrackerProvider faceTrackerProvider, SmartCaptureLoggerProvider smartCaptureLoggerProvider, ResourcesProvider resourcesProvider, StringOverrideFactory stringOverrideFactory, SelfieCaptureUi selfieCaptureUi, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, Set set, int i, long j, boolean z) {
        this.A0L = str;
        this.A05 = challengeProvider;
        this.A0T = null;
        this.A0E = null;
        this.A0X = num;
        this.A0F = bool;
        this.A0M = str2;
        this.A04 = selfieEvidenceRecorderProvider;
        this.A08 = null;
        this.A0G = bool2;
        this.A09 = faceTrackerModelsProvider;
        this.A0A = faceTrackerProvider;
        this.A0U = null;
        this.A0H = bool3;
        this.A0R = false;
        this.A0N = str3;
        this.A0V = null;
        this.A0K = num2;
        String str7 = str4;
        C11367SPk.A03(str7, "product");
        this.A0O = str7;
        this.A0C = resourcesProvider;
        this.A06 = rex;
        this.A0D = selfieCaptureUi;
        this.A0P = str5;
        this.A0I = bool4;
        this.A0S = z;
        this.A0J = bool5;
        this.A0B = smartCaptureLoggerProvider;
        this.A0W = stringOverrideFactory;
        this.A02 = j;
        this.A03 = bundle;
        this.A00 = i;
        this.A01 = 2132018197;
        this.A07 = null;
        this.A0Q = str6;
        this.A0Y = Collections.unmodifiableSet(set);
    }
}
