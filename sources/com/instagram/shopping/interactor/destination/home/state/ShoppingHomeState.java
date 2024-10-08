package com.instagram.shopping.interactor.destination.home.state;

import X.0Yt;
import X.0qQ;
import X.0sl;
import X.1Xj;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C243363Yl;
import X.C243373Ym;
import X.C270194gL;
import X.C41847B3o;
import X.C61069Jw7;
import X.JTS;
import X.Pxi;
import X.Pxj;
import X.Uw7;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ShoppingHomeState extends AnonymousClass0T0 implements Parcelable {
    public static final W6F CREATOR = new W6F(35);
    public final C61069Jw7 A00;
    public final HiddenIds A01;
    public final LikeSaveStatus A02;

    public final class HiddenIds extends AnonymousClass0T0 implements Parcelable {
        public static final Parcelable.Creator CREATOR = new W6F(36);
        public final Set A00;
        public final Set A01;
        public final Set A02;
        public final Set A03;
        public final Set A04;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof HiddenIds) {
                    HiddenIds hiddenIds = (HiddenIds) obj;
                    if (!0qQ.A0K(this.A03, hiddenIds.A03) || !0qQ.A0K(this.A00, hiddenIds.A00) || !0qQ.A0K(this.A01, hiddenIds.A01) || !0qQ.A0K(this.A04, hiddenIds.A04) || !0qQ.A0K(this.A02, hiddenIds.A02)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            Iterator A0w = Pxj.A0w(parcel, this.A03);
            while (A0w.hasNext()) {
                Pxi.A15(parcel, A0w);
            }
            Iterator A0w2 = Pxj.A0w(parcel, this.A00);
            while (A0w2.hasNext()) {
                Pxi.A15(parcel, A0w2);
            }
            Iterator A0w3 = Pxj.A0w(parcel, this.A01);
            while (A0w3.hasNext()) {
                Pxi.A15(parcel, A0w3);
            }
            Iterator A0w4 = Pxj.A0w(parcel, this.A04);
            while (A0w4.hasNext()) {
                Pxi.A15(parcel, A0w4);
            }
            Iterator A0w5 = Pxj.A0w(parcel, this.A02);
            while (A0w5.hasNext()) {
                Pxi.A15(parcel, A0w5);
            }
        }

        public final int hashCode() {
            return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A03)))));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HiddenIds(hiddenProductIds=");
            sb.append(this.A03);
            sb.append(", hiddenAdIds=");
            sb.append(this.A00);
            sb.append(", hiddenMediaIds=");
            sb.append(this.A01);
            sb.append(", hiddenReelIds=");
            sb.append(this.A04);
            sb.append(", hiddenMerchantIds=");
            return AnonymousClass7TG.A0n(this.A02, sb);
        }

        public HiddenIds(Set set, Set set2, Set set3, Set set4, Set set5) {
            this.A03 = set;
            this.A00 = set2;
            this.A01 = set3;
            this.A04 = set4;
            this.A02 = set5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public HiddenIds() {
            /*
                r6 = this;
                X.0sl r1 = X.0sl.A00
                r0 = r6
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.interactor.destination.home.state.ShoppingHomeState.HiddenIds.<init>():void");
        }
    }

    public final class LikeSaveStatus extends AnonymousClass0T0 implements Parcelable {
        public static final Parcelable.Creator CREATOR = new W6F(37);
        public final Map A00;
        public final Map A01;
        public final Map A02;
        public final Map A03;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LikeSaveStatus) {
                    LikeSaveStatus likeSaveStatus = (LikeSaveStatus) obj;
                    if (!0qQ.A0K(this.A01, likeSaveStatus.A01) || !0qQ.A0K(this.A02, likeSaveStatus.A02) || !0qQ.A0K(this.A03, likeSaveStatus.A03) || !0qQ.A0K(this.A00, likeSaveStatus.A00)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            Map map = this.A01;
            C13990Tnq.A0r(parcel, map);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                AnonymousClass7TE.A1T(parcel, (C243363Yl) JTS.A0f(parcel, A0u));
            }
            Map map2 = this.A02;
            C13990Tnq.A0r(parcel, map2);
            Iterator A0u2 = AnonymousClass7TF.A0u(map2);
            while (A0u2.hasNext()) {
                AnonymousClass7TE.A1T(parcel, (C243373Ym) JTS.A0f(parcel, A0u2));
            }
            Map map3 = this.A03;
            C13990Tnq.A0r(parcel, map3);
            Iterator A0u3 = AnonymousClass7TF.A0u(map3);
            while (A0u3.hasNext()) {
                AnonymousClass7TE.A1T(parcel, (C243373Ym) JTS.A0f(parcel, A0u3));
            }
            Map map4 = this.A00;
            C13990Tnq.A0r(parcel, map4);
            Iterator A0u4 = AnonymousClass7TF.A0u(map4);
            while (A0u4.hasNext()) {
                AnonymousClass7TE.A1T(parcel, (C243373Ym) JTS.A0f(parcel, A0u4));
            }
        }

        public final int hashCode() {
            return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01))));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LikeSaveStatus(mediaLikeStatus=");
            sb.append(this.A01);
            sb.append(", mediaSaveStatus=");
            sb.append(this.A02);
            sb.append(", productSaveStatus=");
            sb.append(this.A03);
            sb.append(", collectionSaveStatus=");
            return AnonymousClass7TG.A0n(this.A00, sb);
        }

        public LikeSaveStatus(Map map, Map map2, Map map3, Map map4) {
            this.A01 = map;
            this.A02 = map2;
            this.A03 = map3;
            this.A00 = map4;
        }

        public LikeSaveStatus() {
            this(0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingHomeState) {
                ShoppingHomeState shoppingHomeState = (ShoppingHomeState) obj;
                if (!0qQ.A0K(this.A00, shoppingHomeState.A00) || !0qQ.A0K(this.A01, shoppingHomeState.A01) || !0qQ.A0K(this.A02, shoppingHomeState.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }

    public ShoppingHomeState(Parcel parcel) {
        Parcel parcel2 = parcel;
        HiddenIds hiddenIds = (HiddenIds) C41847B3o.A03(parcel2, HiddenIds.class);
        if (hiddenIds == null) {
            Set set = 0sl.A00;
            hiddenIds = new HiddenIds(set, set, set, set, set);
        }
        LikeSaveStatus likeSaveStatus = (LikeSaveStatus) C41847B3o.A03(parcel2, LikeSaveStatus.class);
        likeSaveStatus = likeSaveStatus == null ? new LikeSaveStatus(0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E()) : likeSaveStatus;
        this.A00 = new C61069Jw7((1Xj) null, (C270194gL) null, (Uw7) null, (DefaultConstructorMarker) null, 7, 5);
        this.A01 = hiddenIds;
        this.A02 = likeSaveStatus;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShoppingHomeState(autoplayItem=");
        sb.append(this.A00);
        sb.append(", hiddenIds=");
        sb.append(this.A01);
        sb.append(", checkerTileState=");
        sb.append((Object) null);
        sb.append(", likeSaveStatus=");
        sb.append(this.A02);
        sb.append(", cartUpdatedEvent=");
        return AnonymousClass7TG.A0n((Object) null, sb);
    }

    public ShoppingHomeState() {
        C61069Jw7 jw7 = new C61069Jw7((1Xj) null, (C270194gL) null, (Uw7) null, (DefaultConstructorMarker) null, 7, 5);
        Set set = 0sl.A00;
        HiddenIds hiddenIds = new HiddenIds(set, set, set, set, set);
        LikeSaveStatus likeSaveStatus = new LikeSaveStatus(0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E(), 0Yt.A0E());
        this.A00 = jw7;
        this.A01 = hiddenIds;
        this.A02 = likeSaveStatus;
    }
}
