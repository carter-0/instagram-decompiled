package com.facebook.rtc.chatd.utils;

import X.C70915ORk;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class JavaCppHelper {
    public native ArrayList convertPackedParamsToArrayList(McfReference mcfReference);

    static {
        C70915ORk.A00();
    }
}
