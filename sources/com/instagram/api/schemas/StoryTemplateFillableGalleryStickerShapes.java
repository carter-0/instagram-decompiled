package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum StoryTemplateFillableGalleryStickerShapes implements Parcelable {
    UNRECOGNIZED("StoryTemplateFillableGalleryStickerShapes_unspecified"),
    BURST("burst"),
    CIRCLE("circle"),
    FOUR_SQUARE("four_square"),
    HEART("heart"),
    MULTI_STAR("multi_star"),
    NORMAL_CORNERS("normal_corners"),
    RECTANGLE("rectangle"),
    ROUNDED_CORNERS("rounded_corners"),
    SQUARE("square"),
    SQUIRCLE("squircle"),
    STAR("star");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        StoryTemplateFillableGalleryStickerShapes[] storyTemplateFillableGalleryStickerShapesArr;
        A02 = 0oU.A00(storyTemplateFillableGalleryStickerShapesArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes : values()) {
            A0x.put(storyTemplateFillableGalleryStickerShapes.A00, storyTemplateFillableGalleryStickerShapes);
        }
        A01 = A0x;
        CREATOR = FK6.A00(5);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    StoryTemplateFillableGalleryStickerShapes(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
