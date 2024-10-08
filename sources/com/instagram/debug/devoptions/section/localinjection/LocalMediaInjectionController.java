package com.instagram.debug.devoptions.section.localinjection;

import X.0qQ;
import X.0s0;
import X.0tS;
import X.AnonymousClass0YZ;
import X.AnonymousClass7TG;
import X.DbS;
import X.Pxe;
import android.content.Context;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants;
import java.util.Set;

public final class LocalMediaInjectionController {
    public final 0tS devPreferences;

    public LocalMediaInjectionController(Context context) {
        0qQ.A0B(context, 1);
        this.devPreferences = 0tS.A4E.A01(context);
    }

    public final Set getSelectedInjectionItems(LocalMediaInjectionConstants.InjectionContentType injectionContentType) {
        0tS r3;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        0qQ.A0B(injectionContentType, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (injectionContentType.ordinal()) {
            case 0:
                r3 = this.devPreferences;
                r2 = r3.A1Q;
                r1 = 0tS.A4G;
                i = 197;
                break;
            case 1:
                r3 = this.devPreferences;
                r2 = r3.A1R;
                r1 = 0tS.A4G;
                i = 196;
                break;
            case 2:
                r3 = this.devPreferences;
                r2 = r3.A1U;
                r1 = 0tS.A4G;
                i = 194;
                break;
            case 3:
                r3 = this.devPreferences;
                r2 = r3.A1V;
                r1 = 0tS.A4G;
                i = 195;
                break;
            case 4:
                r3 = this.devPreferences;
                r2 = r3.A1S;
                r1 = 0tS.A4G;
                i = 199;
                break;
            case 5:
                r3 = this.devPreferences;
                r2 = r3.A1T;
                r1 = 0tS.A4G;
                i = 200;
                break;
            case 6:
                r3 = this.devPreferences;
                r2 = r3.A1W;
                r1 = 0tS.A4G;
                i = 201;
                break;
            default:
                throw new IllegalStateException();
        }
        return (Set) Pxe.A0s(r3, r2, r1, i);
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
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.STORIES_ADS     // Catch:{ NoSuchFieldError -> 0x000c }
                X.C66581MXm.A1N(r0, r1)     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.STORIES_NETEGO     // Catch:{ NoSuchFieldError -> 0x0011 }
                X.C51970G9q.A1M(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.FEED_NETEGO     // Catch:{ NoSuchFieldError -> 0x0016 }
                X.C66581MXm.A1O(r0, r1)     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants$InjectionContentType r0 = com.instagram.debug.devoptions.section.localinjection.datastore.LocalMediaInjectionConstants.InjectionContentType.FEED_ADS     // Catch:{ NoSuchFieldError -> 0x001b }
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
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.section.localinjection.LocalMediaInjectionController.WhenMappings.<clinit>():void");
        }
    }

    public final void selectInjectionItems(Set set, LocalMediaInjectionConstants.InjectionContentType injectionContentType) {
        0tS r3;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        AnonymousClass7TG.A1N(set, injectionContentType);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (injectionContentType.ordinal()) {
            case 0:
                r3 = this.devPreferences;
                r2 = r3.A1Q;
                r1 = 0tS.A4G;
                i = 197;
                break;
            case 1:
                r3 = this.devPreferences;
                r2 = r3.A1R;
                r1 = 0tS.A4G;
                i = 196;
                break;
            case 2:
                r3 = this.devPreferences;
                r2 = r3.A1U;
                r1 = 0tS.A4G;
                i = 194;
                break;
            case 3:
                r3 = this.devPreferences;
                r2 = r3.A1V;
                r1 = 0tS.A4G;
                i = 195;
                break;
            case 4:
                r3 = this.devPreferences;
                r2 = r3.A1S;
                r1 = 0tS.A4G;
                i = 199;
                break;
            case 5:
                r3 = this.devPreferences;
                r2 = r3.A1T;
                r1 = 0tS.A4G;
                i = 200;
                break;
            case 6:
                r3 = this.devPreferences;
                r2 = r3.A1W;
                r1 = 0tS.A4G;
                i = 201;
                break;
            default:
                throw new IllegalStateException();
        }
        DbS.A1a(r3, set, r2, r1, i);
    }
}
