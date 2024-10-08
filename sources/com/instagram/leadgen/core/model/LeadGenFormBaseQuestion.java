package com.instagram.leadgen.core.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C16595Uxp;
import X.C41847B3o;
import X.C51974G9v;
import X.DbS;
import X.JTS;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class LeadGenFormBaseQuestion extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(88);
    public String A00;
    public boolean A01;
    public final int A02;
    public final C16595Uxp A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final Map A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final String A0K;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenFormBaseQuestion) {
                LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) obj;
                if (!0qQ.A0K(this.A06, leadGenFormBaseQuestion.A06) || !0qQ.A0K(this.A0A, leadGenFormBaseQuestion.A0A) || this.A03 != leadGenFormBaseQuestion.A03 || !0qQ.A0K(this.A0D, leadGenFormBaseQuestion.A0D) || !0qQ.A0K(this.A04, leadGenFormBaseQuestion.A04) || !0qQ.A0K(this.A0C, leadGenFormBaseQuestion.A0C) || !0qQ.A0K(this.A09, leadGenFormBaseQuestion.A09) || !0qQ.A0K(this.A00, leadGenFormBaseQuestion.A00) || !0qQ.A0K(this.A05, leadGenFormBaseQuestion.A05) || !0qQ.A0K(this.A08, leadGenFormBaseQuestion.A08) || this.A0J != leadGenFormBaseQuestion.A0J || this.A0H != leadGenFormBaseQuestion.A0H || !0qQ.A0K(this.A0G, leadGenFormBaseQuestion.A0G) || this.A01 != leadGenFormBaseQuestion.A01 || !0qQ.A0K(this.A0F, leadGenFormBaseQuestion.A0F) || !0qQ.A0K(this.A07, leadGenFormBaseQuestion.A07) || !0qQ.A0K(this.A0K, leadGenFormBaseQuestion.A0K) || this.A02 != leadGenFormBaseQuestion.A02 || !0qQ.A0K(this.A0B, leadGenFormBaseQuestion.A0B) || !0qQ.A0K(this.A0E, leadGenFormBaseQuestion.A0E) || this.A0I != leadGenFormBaseQuestion.A0I) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        AnonymousClass7TE.A1T(parcel, this.A03);
        parcel.writeStringList(this.A0D);
        parcel.writeInt(C41847B3o.A00(parcel, this.A04));
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        Map map = this.A0G;
        C13990Tnq.A0r(parcel, map);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            ((LeadGenConditionalAnswerInfo) JTS.A0f(parcel, A0u)).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeStringList(this.A0F);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0B);
        parcel.writeStringList(this.A0E);
        parcel.writeInt(this.A0I ? 1 : 0);
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TG.A0E(this.A06) * 31));
        int A082 = AnonymousClass7TF.A08(this.A09, (((AnonymousClass7TF.A07(this.A0D, A072) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31);
        int A073 = AnonymousClass7TF.A07(this.A0G, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0J, (((AnonymousClass7TF.A08(this.A00, A082) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31)));
        return DbS.A06(this.A0I, (((((((((((AnonymousClass7TF.A09(this.A01, A073) + AnonymousClass7TG.A0C(this.A0F)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A0K)) * 31) + this.A02) * 31) + AnonymousClass7TG.A0E(this.A0B)) * 31) + AnonymousClass7TE.A0L(this.A0E)) * 31);
    }

    public LeadGenFormBaseQuestion(C16595Uxp uxp, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, List list3, List list4, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C51974G9v.A1M(str2, uxp, list);
        AnonymousClass7TF.A1F(str3, 7, str4);
        this.A06 = str;
        this.A0A = str2;
        this.A03 = uxp;
        this.A0D = list;
        this.A04 = num;
        this.A0C = list2;
        this.A09 = str3;
        this.A00 = str4;
        this.A05 = str5;
        this.A08 = str6;
        this.A0J = z;
        this.A0H = z2;
        this.A0G = map;
        this.A01 = z3;
        this.A0F = list3;
        this.A07 = str7;
        this.A0K = str8;
        this.A02 = i;
        this.A0B = str9;
        this.A0E = list4;
        this.A0I = z4;
    }
}
