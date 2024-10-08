package com.instagram.music.common.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class LyricsPhrase extends AnonymousClass0T0 implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(47);
    public int A00;
    public String A01;
    public List A02;

    public LyricsPhrase(List list, int i, String str) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
        this.A02 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LyricsPhrase) {
                LyricsPhrase lyricsPhrase = (LyricsPhrase) obj;
                if (this.A00 != lyricsPhrase.A00 || !0qQ.A0K(this.A01, lyricsPhrase.A01) || !0qQ.A0K(this.A02, lyricsPhrase.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        List list = this.A02;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            ((WordOffset) A1G.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, this.A00 * 31) + AnonymousClass7TG.A0C(this.A02);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0qQ.A00(this.A00, AnonymousClass7TE.A0M(obj));
    }

    public LyricsPhrase() {
        this((List) null, 0, "");
    }
}
