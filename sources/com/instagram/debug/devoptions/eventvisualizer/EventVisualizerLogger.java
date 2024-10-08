package com.instagram.debug.devoptions.eventvisualizer;

import X.0Df;
import X.0j8;
import X.0xI;
import X.11Z;
import X.1Mx;
import X.1UV;
import X.AnonymousClass1qG;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.C68051z2;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventVisualizerLogger extends AnonymousClass1qG {
    public static EventVisualizerLogger sInstance;
    public final 1Mx mBuffer = new 1Mx(200);
    public final 1Mx mData = new 1Mx(200);
    public final 1UV mFilterPredicate = new 1UV() {
        public boolean apply(EventData eventData) {
            if (eventData == null) {
                return false;
            }
            ArrayList arrayList = EventVisualizerLogger.this.mFilters;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    if (!eventData.mName.contains(A18)) {
                        if (eventData.mDebugString.contains(A18)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }
    };
    public final ArrayList mFilters = new ArrayList();
    public EventDataListener mListener;
    public final Handler mUiThreadHandler = AnonymousClass7TF.A0D();

    public class EventData {
        public final String mDebugString;
        public final String mName;

        public String getDebugString() {
            return this.mDebugString;
        }

        public String getName() {
            return this.mName;
        }

        public EventData(String str, String str2) {
            this.mName = str;
            this.mDebugString = str2;
        }
    }

    public interface EventDataListener {
        void onNewEventsAdded(EventData eventData);
    }

    public void onEventReceivedWithParamsCollectionMap(0Df r4, C68051z2 r5) {
        String str;
        int i = 0;
        while (true) {
            if (i < r4.A00) {
                if (C41845B3m.A19(r4.A0D(i)) && (r4.A0C(i) instanceof String)) {
                    str = (String) r4.A0C(i);
                    break;
                }
                i++;
            } else {
                str = "";
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        0j8.A04(r4, "| ", sb);
        onEventReceived(new EventData(str, sb.toString()));
    }

    public static EventVisualizerLogger getInstance() {
        EventVisualizerLogger eventVisualizerLogger = sInstance;
        if (eventVisualizerLogger != null) {
            return eventVisualizerLogger;
        }
        EventVisualizerLogger eventVisualizerLogger2 = new EventVisualizerLogger();
        sInstance = eventVisualizerLogger2;
        return eventVisualizerLogger2;
    }

    public void onDebugEventReceived(0xI r4) {
        onEventReceived(new EventData(r4.A04, r4.toString()));
    }

    public void onEventReceived(final EventData eventData) {
        this.mUiThreadHandler.post(new Runnable() {
            public void run() {
                boolean A1Q;
                EventVisualizerLogger.this.mData.A03(eventData);
                EventVisualizerLogger.this.mBuffer.A03(eventData);
                EventDataListener eventDataListener = EventVisualizerLogger.this.mListener;
                if (eventDataListener != null) {
                    while (true) {
                        1Mx r1 = EventVisualizerLogger.this.mBuffer;
                        synchronized (r1) {
                            A1Q = AnonymousClass7TF.A1Q(r1.A00);
                        }
                        if (!A1Q) {
                            EventData eventData = (EventData) EventVisualizerLogger.this.mBuffer.A00();
                            if (EventVisualizerLogger.this.mFilterPredicate.apply(eventData)) {
                                eventDataListener.onNewEventsAdded(eventData);
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        });
    }

    public void setBufferListener(EventDataListener eventDataListener) {
        this.mListener = eventDataListener;
    }

    public void requestFilteredData() {
        11Z.A00();
        Iterator it = this.mData.A01().iterator();
        while (it.hasNext()) {
            EventData eventData = (EventData) it.next();
            if (this.mFilterPredicate.apply(eventData)) {
                EventDataListener eventDataListener = this.mListener;
                if (eventDataListener != null) {
                    eventDataListener.onNewEventsAdded(eventData);
                } else {
                    throw new RuntimeException("EventDataListener is null");
                }
            }
        }
    }

    public void updateFilters(List list) {
        11Z.A00();
        ArrayList arrayList = this.mFilters;
        arrayList.clear();
        arrayList.addAll(list);
    }
}
