package com.instagram.clips.model.metadata;

import X.C21869Xkg;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualHighlightType;

public interface ClipsContextualHighlightInfoIntf extends Parcelable {
    public static final C21869Xkg A00 = C21869Xkg.A00;

    ContextualHighlightType Ar9();

    ClipsContextualHighlightInfo FDg();

    TreeUpdaterJNI FHC();

    String getChainingMediaId();

    String getContextualHighlightId();

    String getContextualHighlightTitle();
}
