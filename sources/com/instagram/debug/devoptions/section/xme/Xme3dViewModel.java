package com.instagram.debug.devoptions.section.xme;

import X.05G;
import X.0qQ;
import X.106;
import X.1vm;
import X.1vn;
import X.2YL;
import X.AnonymousClass0Ud;
import X.C228042kh;
import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoQueryImpl;

public final class Xme3dViewModel extends 2YL {
    public final 05G _sampleUrl = 106.A01((Object) null);
    public final UserSession userSession;

    public Xme3dViewModel(UserSession userSession2) {
        0qQ.A0B(userSession2, 1);
        this.userSession = userSession2;
    }

    public final void maybeFetchSampleFile(Context context) {
        0qQ.A0B(context, 0);
        if (this._sampleUrl.getValue() == null) {
            PandoGraphQLRequest build = new Sample3dPhotoQueryImpl.Builder().build();
            1vn A01 = 1vm.A01(this.userSession);
            0qQ.A0A(build);
            A01.ATL(new Xme3dViewModel$maybeFetchSampleFile$2(context), new Xme3dViewModel$maybeFetchSampleFile$1(this), build);
        }
    }

    public final AnonymousClass0Ud getSampleUrl() {
        return this._sampleUrl;
    }

    public final class Factory extends C228042kh {
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            0qQ.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        public Xme3dViewModel create() {
            return new Xme3dViewModel(this.userSession);
        }
    }
}
