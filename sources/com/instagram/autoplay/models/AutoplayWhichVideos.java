package com.instagram.autoplay.models;

import X.00k;
import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TF;
import X.Pxf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface AutoplayWhichVideos {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final float MINIMUM_VISIBILITY_DEFAULT = 0.2f;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Object();
        public static final AnonymousClass0eM Focused$delegate = AnonymousClass0eN.A01(AutoplayWhichVideos$Companion$Focused$2.INSTANCE);
        public static final AnonymousClass0eM LoopingTop$delegate = AnonymousClass0eN.A01(AutoplayWhichVideos$Companion$LoopingTop$2.INSTANCE);
        public static final float MINIMUM_VISIBILITY_DEFAULT = 0.2f;
        public static final AnonymousClass0eM SequentialToCenter$delegate = AnonymousClass0eN.A01(AutoplayWhichVideos$Companion$SequentialToCenter$2.INSTANCE);
        public static final AnonymousClass0eM SequentialToNext$delegate = AnonymousClass0eN.A01(AutoplayWhichVideos$Companion$SequentialToNext$2.INSTANCE);

        public final AutoplayWhichVideos getFocused() {
            return (AutoplayWhichVideos) Focused$delegate.getValue();
        }

        public final AutoplayWhichVideos getLoopingTop() {
            return (AutoplayWhichVideos) LoopingTop$delegate.getValue();
        }

        public final AutoplayWhichVideos getSequentialToCenter() {
            return (AutoplayWhichVideos) SequentialToCenter$delegate.getValue();
        }

        public final AutoplayWhichVideos getSequentialToNext() {
            return (AutoplayWhichVideos) SequentialToNext$delegate.getValue();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.instagram.autoplay.models.AutoplayWhichVideos valueOf(java.lang.String r2) {
            /*
                r1 = this;
                int r0 = X.JTR.A0F(r2)
                switch(r0) {
                    case -225062673: goto L_0x0010;
                    case 308473357: goto L_0x001b;
                    case 973611863: goto L_0x0026;
                    default: goto L_0x0007;
                }
            L_0x0007:
                X.0eM r0 = LoopingTop$delegate
            L_0x0009:
                java.lang.Object r0 = r0.getValue()
                com.instagram.autoplay.models.AutoplayWhichVideos r0 = (com.instagram.autoplay.models.AutoplayWhichVideos) r0
                return r0
            L_0x0010:
                java.lang.String r0 = "SequentialToCenter"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0007
                X.0eM r0 = SequentialToCenter$delegate
                goto L_0x0009
            L_0x001b:
                java.lang.String r0 = "SequentialToNext"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0007
                X.0eM r0 = SequentialToNext$delegate
                goto L_0x0009
            L_0x0026:
                java.lang.String r0 = "Focused"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L_0x0007
                X.0eM r0 = Focused$delegate
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.autoplay.models.AutoplayWhichVideos.Companion.valueOf(java.lang.String):com.instagram.autoplay.models.AutoplayWhichVideos");
        }
    }

    AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata);

    List chooseNextVideosToPause(List list);

    List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata);

    boolean hasMinimumVisibility(float f);

    /* renamed from: com.instagram.autoplay.models.AutoplayWhichVideos$-CC  reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static List $default$chooseNextVideosToPause(AutoplayWhichVideos autoplayWhichVideos, List list) {
            ArrayList A0q = AnonymousClass7TF.A0q(list, 1);
            for (Object next : list) {
                AutoplayOnScreenItemWithMetadata onScreenMetadata = ((AutoplayWhichVideoMetadata) next).getOnScreenMetadata();
                if (onScreenMetadata == null || onScreenMetadata.percentageVisible <= 0.2f) {
                    A0q.add(next);
                }
            }
            return A0q;
        }

        public static List $default$combine(AutoplayWhichVideos autoplayWhichVideos, List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
            0qQ.A0B(list, 1);
            ArrayList A0U = 00k.A0U(00k.A0X(list));
            if (autoplayWhichVideoMetadata != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (0qQ.A0K(((AutoplayWhichVideoMetadata) next).media.getId(), autoplayWhichVideoMetadata.media.getId())) {
                        if (next != null) {
                            A0U.remove(next);
                            A0U.add(autoplayWhichVideoMetadata);
                        }
                    }
                }
            }
            return 00k.A0g(A0U, TopLeftComparator.instance);
        }

        public static boolean $default$hasMinimumVisibility(AutoplayWhichVideos autoplayWhichVideos, float f) {
            return Pxf.A1R((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
        }
    }
}
