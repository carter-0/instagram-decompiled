package androidx.media3.extractor.metadata.id3;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11366SPh;
import X.C66583MXo;
import X.C7216Pzk;
import X.JTR;
import X.Pxf;
import X.Pxh;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(42);
    public final ImmutableList A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (!Util.A0E(this.A00, textInformationFrame.A00) || !Util.A0E(this.A01, textInformationFrame.A01) || !this.A00.equals(textInformationFrame.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, (C66583MXo.A06(this.A00) + JTR.A0G(this.A01)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringArray(Pxf.A1a(this.A00, 0));
    }

    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        C11366SPh.A01(AnonymousClass7TE.A1b(list));
        this.A01 = str2;
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        this.A00 = copyOf;
        copyOf.get(0);
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
        A1A.append(this.A01);
        A1A.append(": values=");
        return AnonymousClass7TF.A0i(this.A00, A1A);
    }
}
