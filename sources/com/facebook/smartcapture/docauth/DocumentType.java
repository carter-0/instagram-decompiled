package com.facebook.smartcapture.docauth;

import X.0oU;
import kotlin.enums.EnumEntries;

public enum DocumentType {
    ID1("ID1"),
    ID2("ID2"),
    ID3("ID3");
    
    public final String type;

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
        static {
            /*
                com.facebook.smartcapture.docauth.DocumentType[] r0 = com.facebook.smartcapture.docauth.DocumentType.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.facebook.smartcapture.docauth.DocumentType r0 = com.facebook.smartcapture.docauth.DocumentType.ID1     // Catch:{ NoSuchFieldError -> 0x000c }
                X.C66581MXm.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                com.facebook.smartcapture.docauth.DocumentType r0 = com.facebook.smartcapture.docauth.DocumentType.ID2     // Catch:{ NoSuchFieldError -> 0x0011 }
                X.C51970G9q.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                com.facebook.smartcapture.docauth.DocumentType r0 = com.facebook.smartcapture.docauth.DocumentType.ID3     // Catch:{ NoSuchFieldError -> 0x0016 }
                X.C66581MXm.A1O(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                $EnumSwitchMapping$0 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.docauth.DocumentType.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: public */
    static {
        DocumentType[] $values;
        $ENTRIES = 0oU.A00($values);
    }

    public final String getType() {
        return this.type;
    }

    /* access modifiers changed from: public */
    DocumentType(String str) {
        this.type = str;
    }

    public final float getWidthToHeightRatio() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 1.5857725f;
        }
        if (ordinal == 1) {
            return 1.418919f;
        }
        if (ordinal == 2) {
            return 1.4204545f;
        }
        return 1.5857725f;
    }
}
