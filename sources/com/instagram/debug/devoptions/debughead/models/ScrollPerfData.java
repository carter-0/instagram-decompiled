package com.instagram.debug.devoptions.debughead.models;

import X.0xF;
import X.0xI;
import X.AnonymousClass7TE;
import X.C361488gJ;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

public class ScrollPerfData {
    public static final List SCROLL_PERF_FIELDS = Arrays.asList(new String[]{"timestamp", "container_module", "1_frame_drop_bucket", "4_frame_drop_bucket", "8_frame_drop_bucket", "total_time_spent", "total_busy_time_spent", AggregateScrollData.UTILIZATION_FIELD, "heap_free_ratio", "display_refresh_rate", "active_threads", "post_lfd_threads"});
    public final Map mData;

    public Object getFieldValue(String str) {
        Object obj = this.mData.get(str);
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException(str);
    }

    public ScrollPerfData(0xI r10) {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.mData = A1E;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
        List list = SCROLL_PERF_FIELDS;
        A1E.put(AnonymousClass7TE.A13(list), simpleDateFormat.format(new Date(r10.A00)));
        A1E.put(list.get(1), r10.A03);
        Object obj = list.get(2);
        0xF r3 = r10.A06;
        A1E.put(obj, r3.A03("1_frame_drop_bucket"));
        A1E.put(list.get(3), r10.A02("4_frame_drop_bucket"));
        A1E.put(list.get(4), r10.A02("8_frame_drop_bucket"));
        A1E.put(list.get(5), r3.A04("total_time_spent"));
        A1E.put(list.get(6), r3.A04("total_busy_time_spent"));
        Object obj2 = list.get(7);
        Long A04 = r3.A04("total_busy_time_spent");
        A04.getClass();
        Long A042 = r3.A04("total_time_spent");
        A042.getClass();
        A1E.put(obj2, Float.valueOf((((float) A04.longValue()) * 100.0f) / ((float) A042.longValue())));
        Object obj3 = list.get(8);
        Double A02 = r3.A02("heap_free_ratio");
        A02.getClass();
        A1E.put(obj3, Double.valueOf(A02.doubleValue() * 100.0d));
        A1E.put(list.get(9), r10.A02("display_refresh_rate"));
    }

    public ScrollPerfData(C361488gJ r8) {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.mData = A1E;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.US);
        List list = SCROLL_PERF_FIELDS;
        A1E.put(AnonymousClass7TE.A13(list), simpleDateFormat.format(new Date(r8.A04)));
        A1E.put(list.get(1), r8.A07);
        A1E.put(list.get(2), Integer.valueOf(r8.A03));
        A1E.put(list.get(3), Float.valueOf(r8.A02));
        A1E.put(list.get(4), Float.valueOf(0.0f));
        A1E.put(list.get(5), Long.valueOf(r8.A06));
        A1E.put(list.get(6), Long.valueOf(r8.A05));
        A1E.put(list.get(7), Float.valueOf((((float) r8.A05) * 100.0f) / ((float) r8.A06)));
        A1E.put(list.get(8), Double.valueOf(r8.A00 * 100.0d));
        A1E.put(list.get(9), Float.valueOf(r8.A01));
        A1E.put(list.get(10), r8.A08);
        A1E.put(list.get(11), r8.A09);
    }
}
