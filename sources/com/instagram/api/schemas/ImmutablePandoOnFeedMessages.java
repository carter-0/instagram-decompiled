package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C16844V7z;
import X.C17665Vbw;
import X.C3035269k;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoOnFeedMessages extends 17P implements OnFeedMessagesIntf {
    public static final C3035269k CREATOR = new CTB(27);

    public final /* synthetic */ C17665Vbw AKI() {
        return new C17665Vbw(this);
    }

    public final List BE6() {
        return A08(1513094509, ImmutablePandoIceBreakerMessage.class);
    }

    public final GreetingAttachmentIntf BFz() {
        return (GreetingAttachmentIntf) A05(1049635038, ImmutablePandoGreetingAttachment.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOnFeedMessages, com.instagram.api.schemas.OnFeedMessagesIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C16844V7z.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOnFeedMessages] */
    public final Integer Awj() {
        return getOptionalIntValueByHashCode(-1762553752);
    }

    public final String B96() {
        return A0i(312565784);
    }

    public final String B9l() {
        return A0i(-867601146);
    }

    public final String BCi() {
        return A0i(1977519450);
    }

    public final String BE4() {
        return A0i(1592690889);
    }

    public final String BE5() {
        return A0i(1311887831);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOnFeedMessages] */
    public final Boolean BuX() {
        return getOptionalBooleanValueByHashCode(-988043426);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoOnFeedMessages] */
    public final OnFeedMessages F70() {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1762553752);
        String A0i = A0i(312565784);
        String A0i2 = A0i(-867601146);
        String A0i3 = A0i(1977519450);
        String A0i4 = A0i(1592690889);
        String A0i5 = A0i(1311887831);
        List<IceBreakerMessageIntf> BE6 = BE6();
        GreetingAttachment greetingAttachment = null;
        if (BE6 != null) {
            arrayList = AnonymousClass7TG.A0r(BE6);
            for (IceBreakerMessageIntf F58 : BE6) {
                arrayList.add(F58.F58());
            }
        } else {
            arrayList = null;
        }
        GreetingAttachmentIntf BFz = BFz();
        if (BFz != null) {
            greetingAttachment = BFz.F3T();
        }
        return new OnFeedMessages(greetingAttachment, getOptionalBooleanValueByHashCode(-988043426), optionalIntValueByHashCode, A0i, A0i2, A0i3, A0i4, A0i5, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOnFeedMessages] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
