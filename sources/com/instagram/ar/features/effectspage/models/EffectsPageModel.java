package com.instagram.ar.features.effectspage.models;

import X.0lg;
import X.0qQ;
import X.1Ng;
import X.AnonymousClass05K;
import X.AnonymousClass0T0;
import X.AnonymousClass1Nd;
import X.AnonymousClass1Xo;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C243373Ym;
import X.DbS;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Collection;

public final class EffectsPageModel extends AnonymousClass0T0 implements AnonymousClass1Xo, Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(80);
    public String A00;
    public boolean A01;
    public boolean A02;
    public final EffectAttribution A03;
    public final ImageUrl A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final String A0K;
    public final boolean A0L;

    public final void EjB(C243373Ym r2) {
        0qQ.A0B(r2, 0);
        this.A02 = AnonymousClass7TF.A1W(r2, C243373Ym.SAVED);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EffectsPageModel) {
                EffectsPageModel effectsPageModel = (EffectsPageModel) obj;
                if (!0qQ.A0K(this.A09, effectsPageModel.A09) || !0qQ.A0K(this.A0A, effectsPageModel.A0A) || !0qQ.A0K(this.A04, effectsPageModel.A04) || !0qQ.A0K(this.A05, effectsPageModel.A05) || !0qQ.A0K(this.A0D, effectsPageModel.A0D) || !0qQ.A0K(this.A0B, effectsPageModel.A0B) || !0qQ.A0K(this.A0K, effectsPageModel.A0K) || !0qQ.A0K(this.A0E, effectsPageModel.A0E) || !0qQ.A0K(this.A00, effectsPageModel.A00) || this.A0G != effectsPageModel.A0G || this.A0J != effectsPageModel.A0J || !0qQ.A0K(this.A08, effectsPageModel.A08) || this.A02 != effectsPageModel.A02 || this.A01 != effectsPageModel.A01 || !0qQ.A0K(this.A03, effectsPageModel.A03) || !0qQ.A0K(this.A07, effectsPageModel.A07) || this.A0H != effectsPageModel.A0H || this.A0L != effectsPageModel.A0L || this.A0I != effectsPageModel.A0I || !0qQ.A0K(this.A0C, effectsPageModel.A0C) || !0qQ.A0K(this.A06, effectsPageModel.A06) || this.A0F != effectsPageModel.A0F) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A04, i);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        AnonymousClass7TG.A16(parcel, this.A08, 0, 1);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
        AnonymousClass7TG.A16(parcel, this.A07, 0, 1);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0C);
        AnonymousClass7TG.A16(parcel, this.A06, 0, 1);
        parcel.writeInt(this.A0F ? 1 : 0);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object, X.8Yi] */
    public final void AE7(0lg r5) {
        String str;
        C243373Ym r1;
        if (r5 != null && (str = this.A0D) != null) {
            1Ng A002 = AnonymousClass1Nd.A00(r5);
            if (this.A02) {
                r1 = C243373Ym.SAVED;
            } else {
                r1 = C243373Ym.NOT_SAVED;
            }
            ? obj = new Object();
            obj.A01 = str;
            obj.A00 = r1;
            A002.A00(obj);
        }
    }

    public final C243373Ym BpO() {
        if (this.A02) {
            return C243373Ym.SAVED;
        }
        return C243373Ym.NOT_SAVED;
    }

    public final String BpP() {
        String str = this.A0D;
        if (str == null) {
            str = this.A0B;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Integer BpT() {
        return AnonymousClass05K.A0N;
    }

    public final boolean CbC() {
        return this.A02;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A09);
        int A082 = AnonymousClass7TF.A08(this.A0K, (((((((AnonymousClass7TF.A08(this.A0A, A0O) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31);
        int A092 = AnonymousClass7TF.A09(this.A0G, (AnonymousClass7TF.A08(this.A0E, A082) + AnonymousClass7TG.A0E(this.A00)) * 31);
        int A093 = AnonymousClass7TF.A09(this.A02, (AnonymousClass7TF.A09(this.A0J, A092) + AnonymousClass7TG.A0C(this.A08)) * 31);
        int A094 = AnonymousClass7TF.A09(this.A0L, AnonymousClass7TF.A09(this.A0H, (((AnonymousClass7TF.A09(this.A01, A093) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31));
        return DbS.A06(this.A0F, (((AnonymousClass7TF.A09(this.A0I, A094) + AnonymousClass7TG.A0E(this.A0C)) * 31) + AnonymousClass7TE.A0L(this.A06)) * 31);
    }

    public EffectsPageModel(EffectAttribution effectAttribution, ImageUrl imageUrl, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AnonymousClass7TG.A1O(str, str2);
        AnonymousClass7TF.A1F(str5, 7, str6);
        this.A09 = str;
        this.A0A = str2;
        this.A04 = imageUrl;
        this.A05 = num;
        this.A0D = str3;
        this.A0B = str4;
        this.A0K = str5;
        this.A0E = str6;
        this.A00 = str7;
        this.A0G = z;
        this.A0J = z2;
        this.A08 = num2;
        this.A02 = z3;
        this.A01 = z4;
        this.A03 = effectAttribution;
        this.A07 = num3;
        this.A0H = z5;
        this.A0L = z6;
        this.A0I = z7;
        this.A0C = str8;
        this.A06 = num4;
        this.A0F = z8;
    }

    public final Collection BpQ() {
        return AnonymousClass7TE.A1C();
    }
}
