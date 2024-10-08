package com.facebook.rsys.mosaicgrid.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

public abstract class MosaicGridFeatureFactory {

    public final class CProxy extends MosaicGridFeatureFactory {
        public static native FeatureHolder create(MosaicGridProxy mosaicGridProxy, MosaicGridParams mosaicGridParams);

        public static native MosaicGridFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
