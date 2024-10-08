package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.1aC;
import X.1cB;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TF;
import X.AnonymousClass9PN;
import X.C250663lr;
import X.C41845B3m;
import X.C41847B3o;
import android.os.Parcelable;
import com.facebook.pando.TreeJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundTestUserImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundTestUser {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 1421285739;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public User asApiTypeModel(1E6 r5) {
        0qQ.A0B(r5, 0);
        Parcelable.Creator creator = User.CREATOR;
        TreeJNI reinterpret = reinterpret(ImmutablePandoUserDict.class);
        0qQ.A07(reinterpret);
        return 1aC.A01(new 1E9(r5, 6, false), (ImmutablePandoUserDict) reinterpret);
    }

    public User asRestModel__DO_NOT_USE(1E6 r5) {
        0qQ.A0B(r5, 0);
        Parcelable.Creator creator = User.CREATOR;
        TreeJNI reinterpret = reinterpret(ImmutablePandoUserDict.class);
        0qQ.A07(reinterpret);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) reinterpret;
        1E9 r2 = new 1E9(r5, 6, false);
        0qQ.A0B(immutablePandoUserDict, 0);
        return r2.A00(new User(new 1cB(immutablePandoUserDict).FH2(r2.A00)));
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public String getFullName() {
        return A09("full_name");
    }

    public String getProfilePicUrl() {
        return A0A("profile_pic_url");
    }

    public AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
        return C41847B3o.A0j(r4, AnonymousClass7TF.A0I(r4), C41847B3o.A0T(r4), C41845B3m.A0N(r4), "profile_pic_url");
    }

    public CreatorInspirationSignalsPlaygroundTestUserImpl(int i) {
        super(i);
    }

    public String getId() {
        return C41845B3m.A0k(this);
    }

    public String getUsername() {
        return A08(AnonymousClass9PN.A00());
    }

    public CreatorInspirationSignalsPlaygroundTestUserImpl() {
        super(TYPE_TAG);
    }
}
