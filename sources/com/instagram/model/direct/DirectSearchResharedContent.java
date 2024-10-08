package com.instagram.model.direct;

import X.0KC;
import X.1Xj;
import X.1Xv;
import X.1aC;
import X.AnonymousClass7TE;
import X.C71269Ogb;
import X.DbT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class DirectSearchResharedContent implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(39);
    public UserSession A00;
    public 1Xj A01;
    public Set A02;

    public final int describeContents() {
        return 0;
    }

    public final String AEB() {
        return StringFormatUtil.formatStrLocaleSafe("| %-30s |", "DirectSearchResharedContent");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.A05);
        1Xj r1 = this.A01;
        int i2 = 1;
        if (r1 == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (r1 != null) {
            AtomicBoolean atomicBoolean = 1Xj.A0i;
            byte[] A0A = 1Xv.A0A(r1);
            parcel.writeInt(A0A.length);
            parcel.writeByteArray(A0A);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            try {
                Parcelable.Creator creator = User.CREATOR;
                A1C.add(1aC.A07(A0k));
            } catch (IOException e) {
                0KC.A0F("DirectSearchResharedContent", "Couldn't serialize user to string", e);
            }
        }
        parcel.writeList(ImmutableList.copyOf((Collection) A1C));
    }

    public DirectSearchResharedContent(UserSession userSession, 1Xj r2, Set set) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = set;
    }
}
