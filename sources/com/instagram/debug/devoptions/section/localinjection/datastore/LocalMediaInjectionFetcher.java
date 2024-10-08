package com.instagram.debug.devoptions.section.localinjection.datastore;

import X.0qQ;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;

public final class LocalMediaInjectionFetcher {
    public static final LocalMediaInjectionFetcher INSTANCE = new Object();

    public static final LocalMediaInjectionDataStoreManager fetchInjectionData(LocalMediaInjectionConstants.InjectionContentType injectionContentType) {
        Object obj;
        0qQ.A0B(injectionContentType, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (injectionContentType.ordinal()) {
            case 0:
                obj = new Object();
                break;
            case 1:
                obj = new Object();
                break;
            case 2:
                obj = new Object();
                break;
            case 3:
                obj = new Object();
                break;
            case 4:
                obj = new Object();
                break;
            case 5:
                obj = new Object();
                break;
            case 6:
                obj = new Object();
                break;
            default:
                throw new IllegalArgumentException("Unsupported injection content type!");
        }
        return (LocalMediaInjectionDataStoreManager) obj;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0020 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0025 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001b */
        static {
            /*
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType[] r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.FEED_ADS     // Catch:{ NoSuchFieldError -> 0x000c }
                X.C66581MXm.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.FEED_NETEGO     // Catch:{ NoSuchFieldError -> 0x0011 }
                X.C51970G9q.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.STORIES_ADS     // Catch:{ NoSuchFieldError -> 0x0016 }
                X.C66581MXm.A1O(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.STORIES_NETEGO     // Catch:{ NoSuchFieldError -> 0x001b }
                X.Pxf.A1J(r0, r1)     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.REELS_ADS     // Catch:{ NoSuchFieldError -> 0x0020 }
                X.C13988Tno.A1L(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0020 }
            L_0x0020:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.REELS_ORGANIC     // Catch:{ NoSuchFieldError -> 0x0025 }
                X.C13988Tno.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.THREADS_ADS     // Catch:{ NoSuchFieldError -> 0x002a }
                X.C13988Tno.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                $EnumSwitchMapping$0 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionFetcher.WhenMappings.<clinit>():void");
        }
    }
}
