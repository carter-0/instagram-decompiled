package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C44400CeK;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoStoryGroupMentionTappableData extends 17P implements StoryGroupMentionTappableDataIntf {
    public static final C3035269k CREATOR = CTB.A00(80);
    public List A00;

    public final List BRk() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'mentionedUsers' field.");
    }

    public final StoryGroupMentionTappableDataIntf E8a(1E9 r4) {
        List A0o = A0o(1498308178, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r4, A0r, it);
        }
        this.A00 = A0r;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoStoryGroupMentionTappableData, com.instagram.api.schemas.StoryGroupMentionTappableDataIntf, com.facebook.pando.TreeJNI] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44400CeK.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Auy() {
        return A0b();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.api.schemas.ImmutablePandoStoryGroupMentionTappableData, com.facebook.pando.TreeJNI] */
    public final Integer Bzj() {
        return C41845B3m.A0i(this);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.api.schemas.ImmutablePandoStoryGroupMentionTappableData, com.facebook.pando.TreeJNI, X.17P] */
    public final StoryGroupMentionTappableData FAA(1E9 r8) {
        String A0b = A0b();
        String A0g = A0g();
        List A0o = A0o(1498308178, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r8, A0r, it);
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A0r);
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            C41847B3o.A1Q(r8, A0r2, it2);
        }
        return new StoryGroupMentionTappableData(C41845B3m.A0i(this), A0b, A0g, A0X(), A0r2);
    }

    public final StoryGroupMentionTappableData FAB(1E6 r2) {
        return FAA(C41846B3n.A0S(r2));
    }

    public final String getId() {
        return A0g();
    }

    public final String getText() {
        return A0X();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.api.schemas.ImmutablePandoStoryGroupMentionTappableData, com.facebook.pando.TreeJNI] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
