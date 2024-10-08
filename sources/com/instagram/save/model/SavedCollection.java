package com.instagram.save.model;

import X.1E7;
import X.1XP;
import X.1Xj;
import X.2PP;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C54665HMw;
import X.DbV;
import X.HMU;
import X.W6F;
import android.os.Parcelable;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SavedCollection extends 1XP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(21);
    public CollectionPrivacyModeEnum A00;
    public ImageUrl A01;
    public ImageUrl A02 = null;
    public MediaMapPin A03;
    public 1Xj A04;
    public CollaborativeCollectionMetadata A05;
    public HMU A06 = null;
    public C54665HMw A07 = C54665HMw.MEDIA;
    public User A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B = false;
    public Boolean A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I = null;
    public List A0J;
    public List A0K = AnonymousClass7TE.A1C();
    public List A0L = AnonymousClass7TE.A1C();
    public List A0M = AnonymousClass7TE.A1C();
    public boolean A0N = false;

    public SavedCollection(C54665HMw hMw, String str, String str2) {
        this.A0F = str;
        this.A0G = str2;
        this.A07 = hMw;
        this.A06 = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final int A00() {
        return AnonymousClass7TG.A0A(this.A0E);
    }

    public final Integer A01(UserSession userSession) {
        if (userSession == null) {
            return AnonymousClass05K.A0N;
        }
        if (A07(userSession.A06)) {
            return AnonymousClass05K.A00;
        }
        if (this.A05 != null) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A01;
    }

    public final boolean A05() {
        Boolean bool = this.A09;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        CollectionPrivacyModeEnum collectionPrivacyModeEnum = this.A00;
        if (collectionPrivacyModeEnum == null || collectionPrivacyModeEnum != CollectionPrivacyModeEnum.PUBLIC) {
            return false;
        }
        return true;
    }

    public final boolean A07(String str) {
        User user = this.A08;
        if (user == null) {
            return true;
        }
        return user.getId().equals(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavedCollection)) {
            return false;
        }
        SavedCollection savedCollection = (SavedCollection) obj;
        if (!2PP.A00(this.A0F, savedCollection.A0F) || !2PP.A00(this.A0G, savedCollection.A0G) || !2PP.A00(this.A04, savedCollection.A04) || !2PP.A00(this.A07, savedCollection.A07) || !2PP.A00(this.A0L, Collections.unmodifiableList(savedCollection.A0L)) || !2PP.A00(this.A0C, savedCollection.A0C) || !2PP.A00(this.A0A, savedCollection.A0A) || !2PP.A00(Boolean.valueOf(A05()), Boolean.valueOf(savedCollection.A05())) || !2PP.A00(this.A00, savedCollection.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0F, this.A0G, this.A04, this.A07, this.A0L, this.A0C, this.A0A, this.A09, this.A00});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1 == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A0F
            r4.writeString(r0)
            java.lang.String r0 = r3.A0G
            r4.writeString(r0)
            java.lang.String r0 = r3.A0H
            r4.writeString(r0)
            X.HMw r0 = r3.A07
            java.lang.String r0 = r0.A01
            r4.writeString(r0)
            java.util.List r0 = r3.A0K
            r4.writeStringList(r0)
            java.lang.Boolean r0 = r3.A09
            r2 = 1
            if (r0 == 0) goto L_0x0027
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r4.writeInt(r0)
            java.lang.Boolean r0 = r3.A0C
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
        L_0x0035:
            r4.writeInt(r2)
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r3.A05
            r4.writeParcelable(r0, r5)
            com.instagram.api.schemas.CollectionPrivacyModeEnum r0 = r3.A00
            r4.writeParcelable(r0, r5)
            com.instagram.common.typedurl.ImageUrl r0 = r3.A02
            r4.writeParcelable(r0, r5)
            java.lang.String r0 = r3.A0I
            r4.writeString(r0)
            return
        L_0x004d:
            r2 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.save.model.SavedCollection.writeToParcel(android.os.Parcel, int):void");
    }

    public final String A02() {
        if (A06()) {
            return "public";
        }
        if (this.A05 != null) {
            return "collaborative";
        }
        return "private";
    }

    public final void A03(UserSession userSession) {
        this.A04 = 1E7.A00(userSession).A02(this.A0H);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = this.A0K.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            1Xj A0U = DbV.A0U(userSession, A18);
            if (A0U != null) {
                A1C.add(A18);
                A1C2.add(A0U);
            }
        }
        this.A0K = A1C;
        this.A0L = A1C2;
    }

    public final void A04(List list) {
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((ProductImageContainer) it.next()).FFc());
        }
        this.A0M = A0r;
    }

    public SavedCollection() {
    }
}
