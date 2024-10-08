package com.facebook.rsys.groupexpansion.msys.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mca.Mailbox;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;

public abstract class GroupExpansionMsysProxy {

    public final class CProxy extends GroupExpansionMsysProxy {
        public static native GroupExpansionProxy create(Mailbox mailbox);

        public static native GroupExpansionMsysProxy createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();
    }
}
