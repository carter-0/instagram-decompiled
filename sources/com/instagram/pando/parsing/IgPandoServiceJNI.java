package com.instagram.pando.parsing;

import X.0dV;
import X.0lm;
import X.C278804xY;
import com.facebook.jni.HybridClassBase;
import com.facebook.pando.PandoConsistencyServiceJNI;

public class IgPandoServiceJNI extends HybridClassBase implements C278804xY, 0lm {
    public static native IgPandoServiceJNI create(PandoConsistencyServiceJNI pandoConsistencyServiceJNI);

    public native IgPandoApiFrameworkParserJNI createApiFrameworkParser(boolean z);

    public void onUserSessionWillEnd(@Deprecated boolean z) {
    }

    static {
        0dV.A0C("pando-parsing-instagram-jni");
    }
}
