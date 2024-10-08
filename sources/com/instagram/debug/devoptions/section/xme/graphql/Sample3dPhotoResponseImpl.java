package com.instagram.debug.devoptions.section.xme.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TG;
import X.C250663lr;
import com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Sample3dPhotoResponseImpl extends C250663lr implements Sample3dPhotoResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 1151711264;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return Sample3dPhotoResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class Sample3dPhoto extends C250663lr implements Sample3dPhotoResponse.Sample3dPhoto {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 840945856;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Sample3dPhoto.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getGlbUrl() {
            return A07("glb_url");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "glb_url");
        }

        public Sample3dPhoto(int i) {
            super(i);
        }

        public Sample3dPhoto() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public Sample3dPhotoResponse.Sample3dPhoto getSample3dPhoto() {
        return (Sample3dPhotoResponse.Sample3dPhoto) A03(Sample3dPhoto.class, AnonymousClass000.A00(1776), Sample3dPhoto.TYPE_TAG);
    }

    public AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(Sample3dPhoto.class, AnonymousClass000.A00(1776), Sample3dPhoto.TYPE_TAG);
    }

    public Sample3dPhotoResponseImpl(int i) {
        super(i);
    }

    public Sample3dPhotoResponseImpl() {
        super(TYPE_TAG);
    }
}
