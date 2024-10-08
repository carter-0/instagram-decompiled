package com.instagram.direct.fragment.thread.threaddetail.customization;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41845B3m;
import X.C41848B3p;
import X.HPZ;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem extends HPZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(74);
    public final String A00;
    public final List A01;

    public ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem(List list, String str) {
        0qQ.A0B(str, 2);
        this.A01 = list;
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) {
                ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem = (ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) obj;
                if (!0qQ.A0K(this.A01, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem.A01) || !0qQ.A0K(this.A00, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A01);
        while (A1F.hasNext()) {
            parcel.writeValue(A1F.next());
        }
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TE.A0K(this.A01));
    }
}
