package com.facebook.quickpromotion.sdk.controllers;

import X.0qQ;
import X.AnonymousClass421;
import X.AnonymousClass422;
import X.AnonymousClass423;
import X.C249803kO;
import X.C2595141z;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

public final class QPSdkSurfaceControllerManager {
    public final ImmutableMap A00;

    public QPSdkSurfaceControllerManager(C2595141z r11, ImmutableSet immutableSet, AnonymousClass421 r13, String str) {
        C2595141z r4 = r11;
        0qQ.A0B(r11, 3);
        AnonymousClass421 r5 = r13;
        0qQ.A0B(r13, 4);
        AnonymousClass422 r8 = AnonymousClass422.A00;
        AnonymousClass423 r9 = AnonymousClass423.A00;
        0qQ.A0B(r8, 5);
        0qQ.A0B(r9, 6);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        C249803kO it = immutableSet.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            String str2 = (String) it.next();
            0qQ.A0A(str2);
            builder.put(str2, new QPSdkOnDemandSurfaceController(r4, r5, str, str2, r8, r9));
        }
        this.A00 = builder.build();
    }
}
