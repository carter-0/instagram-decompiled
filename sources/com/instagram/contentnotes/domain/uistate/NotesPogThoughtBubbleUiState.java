package com.instagram.contentnotes.domain.uistate;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass4Ji;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C51969G9p;
import X.C51975G9x;
import X.C59701JUi;
import X.C66579MXk;
import X.DbW;
import X.G9w;
import X.GOQ;
import X.GOR;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class NotesPogThoughtBubbleUiState extends AnonymousClass0T0 implements Parcelable, AnonymousClass4Ji {
    public static final Parcelable.Creator CREATOR = new LVP(3);
    public final int A00;
    public final int A01;
    public final NoteCustomTheme A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final NoteTextContent A05;
    public final User A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final List A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotesPogThoughtBubbleUiState) {
                NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = (NotesPogThoughtBubbleUiState) obj;
                if (!(0qQ.A0K(this.A0F, notesPogThoughtBubbleUiState.A0F) && 0qQ.A0K(this.A05, notesPogThoughtBubbleUiState.A05) && 0qQ.A0K(this.A03, notesPogThoughtBubbleUiState.A03) && this.A0N == notesPogThoughtBubbleUiState.A0N && 0qQ.A0K(this.A0J, notesPogThoughtBubbleUiState.A0J) && 0qQ.A0K(this.A0H, notesPogThoughtBubbleUiState.A0H) && 0qQ.A0K(this.A07, notesPogThoughtBubbleUiState.A07) && 0qQ.A0K(this.A06, notesPogThoughtBubbleUiState.A06) && this.A0P == notesPogThoughtBubbleUiState.A0P && 0qQ.A0K(this.A0B, notesPogThoughtBubbleUiState.A0B) && this.A00 == notesPogThoughtBubbleUiState.A00 && 0qQ.A0K(this.A0C, notesPogThoughtBubbleUiState.A0C) && this.A0A == notesPogThoughtBubbleUiState.A0A && 0qQ.A0K(this.A0D, notesPogThoughtBubbleUiState.A0D) && 0qQ.A0K(this.A0I, notesPogThoughtBubbleUiState.A0I) && 0qQ.A0K(this.A0L, notesPogThoughtBubbleUiState.A0L) && 0qQ.A0K(this.A0K, notesPogThoughtBubbleUiState.A0K) && this.A0M == notesPogThoughtBubbleUiState.A0M && this.A0S == notesPogThoughtBubbleUiState.A0S && this.A08 == notesPogThoughtBubbleUiState.A08 && this.A0Q == notesPogThoughtBubbleUiState.A0Q && 0qQ.A0K(this.A0E, notesPogThoughtBubbleUiState.A0E) && 0qQ.A0K(this.A04, notesPogThoughtBubbleUiState.A04) && this.A01 == notesPogThoughtBubbleUiState.A01 && this.A0R == notesPogThoughtBubbleUiState.A0R && this.A09 == notesPogThoughtBubbleUiState.A09 && this.A0T == notesPogThoughtBubbleUiState.A0T && this.A0Z == notesPogThoughtBubbleUiState.A0Z && this.A0X == notesPogThoughtBubbleUiState.A0X && this.A0U == notesPogThoughtBubbleUiState.A0U && this.A0V == notesPogThoughtBubbleUiState.A0V && this.A0O == notesPogThoughtBubbleUiState.A0O && this.A0Y == notesPogThoughtBubbleUiState.A0Y && this.A0W == notesPogThoughtBubbleUiState.A0W && 0qQ.A0K(this.A02, notesPogThoughtBubbleUiState.A02) && 0qQ.A0K(this.A0G, notesPogThoughtBubbleUiState.A0G))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0H);
        AnonymousClass7TG.A16(parcel, this.A07, 0, 1);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0P ? 1 : 0);
        Long l = this.A0B;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0C);
        parcel.writeString(GOQ.A00(this.A0A));
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0I);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0L);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        Iterator A1F2 = C41848B3p.A1F(parcel, this.A0K);
        while (A1F2.hasNext()) {
            C41847B3o.A1I(parcel, A1F2, i);
        }
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeString(C59701JUi.A00(this.A08));
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeString(GOR.A00(this.A09));
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0G);
    }

    public final ImageUrl Adz() {
        return this.A03;
    }

    public final List BZf() {
        return this.A0L;
    }

    public final int getIndex() {
        return this.A00;
    }

    public final String getUserId() {
        return this.A0J;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A0J, AnonymousClass7TF.A09(this.A0N, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0O(this.A0F)))));
        int A072 = AnonymousClass7TF.A07(this.A06, (AnonymousClass7TF.A08(this.A0H, A082) + AnonymousClass7TG.A0C(this.A07)) * 31);
        int A083 = AnonymousClass7TF.A08(this.A0C, (((AnonymousClass7TF.A09(this.A0P, A072) + AnonymousClass7TG.A0C(this.A0B)) * 31) + this.A00) * 31);
        Integer num = this.A0A;
        int A092 = AnonymousClass7TF.A09(this.A0S, AnonymousClass7TF.A09(this.A0M, AnonymousClass7TF.A07(this.A0K, AnonymousClass7TF.A07(this.A0L, (((AnonymousClass7TG.A0B(num, GOQ.A00(num), A083) + AnonymousClass7TG.A0E(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0I)) * 31))));
        Integer num2 = this.A08;
        int A0B2 = AnonymousClass7TG.A0B(num2, C59701JUi.A00(num2), A092);
        int A093 = AnonymousClass7TF.A09(this.A0R, (((((AnonymousClass7TF.A09(this.A0Q, A0B2) + AnonymousClass7TG.A0E(this.A0E)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A01) * 31);
        Integer num3 = this.A09;
        return ((AnonymousClass7TF.A09(this.A0W, AnonymousClass7TF.A09(this.A0Y, AnonymousClass7TF.A09(this.A0O, AnonymousClass7TF.A09(this.A0V, AnonymousClass7TF.A09(this.A0U, AnonymousClass7TF.A09(this.A0X, AnonymousClass7TF.A09(this.A0Z, AnonymousClass7TF.A09(this.A0T, AnonymousClass7TG.A0B(num3, GOR.A00(num3), A093))))))))) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A0G);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NotesPogThoughtBubbleUiState(mediaId=");
        A1A.append(this.A0F);
        A1A.append(", textContent=");
        A1A.append(this.A05);
        A1A.append(AnonymousClass000.A00(2001));
        A1A.append(this.A03);
        A1A.append(", canReply=");
        A1A.append(this.A0N);
        A1A.append(", userId=");
        A1A.append(this.A0J);
        A1A.append(", noteId=");
        A1A.append(this.A0H);
        A1A.append(C66579MXk.A00(185));
        A1A.append(this.A07);
        A1A.append(", user=");
        A1A.append(this.A06);
        A1A.append(", hasTranslation=");
        A1A.append(this.A0P);
        A1A.append(C66579MXk.A00(426));
        A1A.append(this.A0B);
        A1A.append(", index=");
        A1A.append(this.A00);
        A1A.append(AnonymousClass000.A00(1997));
        A1A.append(this.A0C);
        A1A.append(", renderLocation=");
        Integer num = this.A0A;
        if (num != null) {
            str = GOQ.A00(num);
        } else {
            str = "null";
        }
        G9w.A1W(A1A, str);
        A1A.append(this.A0D);
        A1A.append(AnonymousClass000.A00(403));
        A1A.append(this.A0I);
        A1A.append(AnonymousClass000.A00(2036));
        A1A.append(this.A0L);
        A1A.append(", likersList=");
        A1A.append(this.A0K);
        A1A.append(", canLikeNote=");
        A1A.append(this.A0M);
        A1A.append(", likeAffordanceEnabled=");
        A1A.append(this.A0S);
        A1A.append(", mimicryNoteType=");
        Integer num2 = this.A08;
        if (num2 != null) {
            str2 = C59701JUi.A00(num2);
        } else {
            str2 = "null";
        }
        A1A.append(str2);
        A1A.append(", isReelsViewer=");
        A1A.append(this.A0Q);
        A1A.append(", mediaCode=");
        A1A.append(this.A0E);
        A1A.append(AnonymousClass000.A00(2039));
        A1A.append(this.A04);
        A1A.append(", mediaPosition=");
        A1A.append(this.A01);
        A1A.append(", isVideoMedia=");
        A1A.append(this.A0R);
        A1A.append(", nuxType=");
        Integer num3 = this.A09;
        if (num3 != null) {
            str3 = GOR.A00(num3);
        } else {
            str3 = "null";
        }
        A1A.append(str3);
        A1A.append(", useEnlargedStyling=");
        A1A.append(this.A0T);
        A1A.append(", useSmallerProfilePics=");
        A1A.append(this.A0Z);
        A1A.append(", useIconicSmoothedStyling=");
        A1A.append(this.A0X);
        A1A.append(", useIconicAnimation=");
        A1A.append(this.A0U);
        A1A.append(", useIconicNeumorphism=");
        A1A.append(this.A0V);
        A1A.append(", hasIconicShadow=");
        A1A.append(this.A0O);
        A1A.append(", useIconicSwRendering=");
        A1A.append(this.A0Y);
        A1A.append(", useIconicPseudoShadow=");
        A1A.append(this.A0W);
        A1A.append(", customTheme=");
        A1A.append(this.A02);
        A1A.append(", mimicryOriginalAuthorId=");
        return C51975G9x.A0i(this.A0G, A1A);
    }

    public NotesPogThoughtBubbleUiState(NoteCustomTheme noteCustomTheme, ImageUrl imageUrl, ImageUrl imageUrl2, NoteTextContent noteTextContent, User user, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        String str9 = str;
        AnonymousClass7TG.A1U(str9, noteTextContent, imageUrl);
        String str10 = str3;
        String str11 = str2;
        AnonymousClass7TG.A1S(str11, str10);
        String str12 = str4;
        DbW.A1P(user, 8, str12);
        Integer num5 = num2;
        0qQ.A0B(num5, 13);
        List list3 = list2;
        List list4 = list;
        C51969G9p.A1S(list4, 16, list3);
        Integer num6 = num3;
        0qQ.A0B(num6, 20);
        Integer num7 = num4;
        0qQ.A0B(num7, 26);
        this.A0F = str9;
        this.A05 = noteTextContent;
        this.A03 = imageUrl;
        this.A0N = z;
        this.A0J = str11;
        this.A0H = str10;
        this.A07 = num;
        this.A06 = user;
        this.A0P = z2;
        this.A0B = l;
        this.A00 = i;
        this.A0C = str12;
        this.A0A = num5;
        this.A0D = str5;
        this.A0I = str6;
        this.A0L = list4;
        this.A0K = list3;
        this.A0M = z3;
        this.A0S = z4;
        this.A08 = num6;
        this.A0Q = z5;
        this.A0E = str7;
        this.A04 = imageUrl2;
        this.A01 = i2;
        this.A0R = z6;
        this.A09 = num7;
        this.A0T = z7;
        this.A0Z = z8;
        this.A0X = z9;
        this.A0U = z10;
        this.A0V = z11;
        this.A0O = z12;
        this.A0Y = z13;
        this.A0W = z14;
        this.A02 = noteCustomTheme;
        this.A0G = str8;
    }
}
