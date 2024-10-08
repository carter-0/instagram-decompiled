package com.google.common.collect;

import X.AnonymousClass2hV;
import java.util.Map;

public enum Maps$EntryFunction implements AnonymousClass2hV {
    ;

    /* access modifiers changed from: public */
    static {
        A00 = new Maps$EntryFunction() {
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }
        };
        A01 = new Maps$EntryFunction() {
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        };
    }
}
