package com.instagram.react.modules.base;

import X.0lg;
import X.1WM;
import X.C13967TmU;
import X.Pxj;
import X.QZK;
import X.T8A;
import com.facebook.fbreact.specs.NativeReactPerformanceLoggerSpec;
import com.facebook.location.platform.api.Location;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.concurrent.atomic.AtomicLong;

@ReactModule(name = "ReactPerformanceLogger", needsEagerInit = true)
public class IgReactPerformanceLoggerModule extends NativeReactPerformanceLoggerSpec {
    public static final String MODULE_NAME = "ReactPerformanceLogger";
    public final C13967TmU mPerformanceLogger;

    public String getName() {
        return "ReactPerformanceLogger";
    }

    public IgReactPerformanceLoggerModule(QZK qzk, 0lg r3) {
        super(qzk);
        this.mPerformanceLogger = 1WM.getInstance().getPerformanceLogger(r3);
    }

    public void logEvents(ReadableMap readableMap) {
        long j;
        AtomicLong atomicLong;
        C13967TmU tmU;
        long j2;
        C13967TmU tmU2;
        long j3;
        C13967TmU tmU3;
        long j4;
        ReadableMap map = readableMap.getMap("timespans");
        if (map != null) {
            double d = 0.0d;
            if (map.hasKey("JSAppRequireTime")) {
                ReadableMap map2 = map.getMap("JSAppRequireTime");
                C13967TmU tmU4 = this.mPerformanceLogger;
                ((T8A) tmU4).A0L.set((long) Pxj.A03(map2, "startTime"));
                C13967TmU tmU5 = this.mPerformanceLogger;
                j = (long) Pxj.A03(map2, "totalTime");
                atomicLong = ((T8A) tmU5).A0D;
            } else {
                j = 0;
                ((T8A) this.mPerformanceLogger).A0D.set(0);
                atomicLong = ((T8A) this.mPerformanceLogger).A0L;
            }
            atomicLong.set(j);
            if (map.hasKey("JSTime")) {
                ReadableMap map3 = map.getMap("JSTime");
                tmU = this.mPerformanceLogger;
                j2 = (long) Pxj.A03(map3, "totalTime");
            } else {
                tmU = this.mPerformanceLogger;
                j2 = 0;
            }
            ((T8A) tmU).A0E.set(j2);
            if (map.hasKey("IdleTime")) {
                ReadableMap map4 = map.getMap("IdleTime");
                tmU2 = this.mPerformanceLogger;
                j3 = (long) Pxj.A03(map4, "totalTime");
            } else {
                tmU2 = this.mPerformanceLogger;
                j3 = 0;
            }
            ((T8A) tmU2).A0C.set(j3);
            if (map.hasKey("fetchRelayQuery")) {
                ReadableMap map5 = map.getMap("fetchRelayQuery");
                tmU3 = this.mPerformanceLogger;
                if (map5.hasKey("totalTime")) {
                    d = map5.getDouble("totalTime");
                }
                j4 = (long) d;
            } else {
                tmU3 = this.mPerformanceLogger;
                j4 = 0;
            }
            ((T8A) tmU3).A0B.set(j4);
        }
        ReadableMap map6 = readableMap.getMap(Location.EXTRAS);
        if (map6 != null) {
            if (map6.hasKey("JscBlockSize")) {
                ((T8A) this.mPerformanceLogger).A0F.set((long) map6.getDouble("JscBlockSize"));
            }
            if (map6.hasKey("JscMallocSize")) {
                ((T8A) this.mPerformanceLogger).A0G.set((long) map6.getDouble("JscMallocSize"));
            }
            if (map6.hasKey("JscObjectSize")) {
                ((T8A) this.mPerformanceLogger).A0H.set((long) map6.getDouble("JscObjectSize"));
            }
            if (map6.hasKey("usedRelayModern")) {
                ((T8A) this.mPerformanceLogger).A05.set(map6.getBoolean("usedRelayModern") ? 1 : 0);
            }
            if (map6.hasKey("usedRelayPrefetcher")) {
                ((T8A) this.mPerformanceLogger).A06.set(map6.getBoolean("usedRelayPrefetcher") ? 1 : 0);
            }
        }
        if (readableMap.hasKey("tag")) {
            ((T8A) this.mPerformanceLogger).A0S = readableMap.getString("tag");
        }
        this.mPerformanceLogger.Cje();
    }
}
