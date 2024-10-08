package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.0dV;
import X.AnonymousClass7TF;
import com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture;

public final class IgluExternalRenderDelegateWrapper {
    public String key;

    public final boolean doRender(IglTexture iglTexture, IglTexture iglTexture2) {
        AnonymousClass7TF.A1H(iglTexture, iglTexture2);
        return false;
    }

    public IgluExternalRenderDelegateWrapper() {
        0dV.A0C("mediapipeline-iglufilter-holder");
    }
}
