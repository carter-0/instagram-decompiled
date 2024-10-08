package com.google.android.exoplayer2.metadata.id3;

import X.0qQ;
import X.0sr;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C256703wD;
import X.C66583MXo;
import X.DbU;
import X.JTR;
import X.Pxh;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = SWW.A00(60);
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (!Util.A0I(this.A00, textInformationFrame.A00) || !Util.A0I(this.A00, textInformationFrame.A00) || !this.A01.equals(textInformationFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((C66583MXo.A06(this.A00) + JTR.A0G(this.A00)) * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeStringArray(DbU.A1b(this.A01, 0));
    }

    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        C256703wD.A03(AnonymousClass7TE.A1b(list));
        this.A00 = str2;
        Object[] array = list.toArray(new String[0]);
        0qQ.A0B(array, 0);
        Object[] copyOf = Arrays.copyOf(array, array.length);
        ArrayList A1D = AnonymousClass7TE.A1D(0sr.A1P(Arrays.copyOf(copyOf, copyOf.length)));
        this.A01 = A1D;
        A1D.get(0);
    }

    public static ArrayList A00(String str) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        try {
            int length = str.length();
            if (length >= 10) {
                Pxh.A1O(str, A1C, 0, 4);
                Pxh.A1O(str, A1C, 5, 7);
                Pxh.A1O(str, A1C, 8, 10);
                return A1C;
            } else if (length >= 7) {
                Pxh.A1O(str, A1C, 0, 4);
                Pxh.A1O(str, A1C, 5, 7);
                return A1C;
            } else {
                if (length >= 4) {
                    Pxh.A1O(str, A1C, 0, 4);
                }
                return A1C;
            }
        } catch (NumberFormatException unused) {
            return AnonymousClass7TE.A1C();
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A00);
        A1A.append(": description=");
        A1A.append(this.A00);
        A1A.append(": values=");
        return AnonymousClass7TF.A0i(this.A01, A1A);
    }
}
