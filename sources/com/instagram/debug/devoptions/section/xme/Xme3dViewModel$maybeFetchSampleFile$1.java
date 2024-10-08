package com.instagram.debug.devoptions.section.xme;

import X.AnonymousClass2Kv;
import X.AnonymousClass3JD;
import com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoResponse;

public final class Xme3dViewModel$maybeFetchSampleFile$1 implements AnonymousClass2Kv {
    public final /* synthetic */ Xme3dViewModel this$0;

    public Xme3dViewModel$maybeFetchSampleFile$1(Xme3dViewModel xme3dViewModel) {
        this.this$0 = xme3dViewModel;
    }

    public final void invoke(AnonymousClass3JD r3) {
        String str;
        Sample3dPhotoResponse sample3dPhotoResponse;
        Sample3dPhotoResponse.Sample3dPhoto sample3dPhoto;
        if (r3 == null || (sample3dPhotoResponse = (Sample3dPhotoResponse) r3.Bny()) == null || (sample3dPhoto = sample3dPhotoResponse.getSample3dPhoto()) == null) {
            str = null;
        } else {
            str = sample3dPhoto.getGlbUrl();
        }
        this.this$0._sampleUrl.Epw(str);
    }
}
