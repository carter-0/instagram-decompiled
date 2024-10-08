package com.instagram.debug.devoptions.debughead.models;

import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AggregateScrollData {
    public static final String UTILIZATION_FIELD = "utilization";
    public float mAvg1Drop;
    public float mAvg4Drop;
    public float mAvgUtil;
    public String mContainer;
    public double mFDPM;
    public double mLFDPM;
    public float mMax1Drop;
    public float mMax4Drop;
    public float mMaxUtil;
    public float mMin1Drop;
    public float mMin4Drop;
    public float mMinUtil;
    public final List mScrollData = AnonymousClass7TE.A1C();
    public float mSum1Drop;
    public float mSum4Drop;
    public float mSumUtil;
    public float mTotalTimeSpent;

    private void calculateAverage() {
        if (!this.mScrollData.isEmpty()) {
            List list = this.mScrollData;
            ScrollPerfData scrollPerfData = (ScrollPerfData) list.get(list.size() - 1);
            this.mSumUtil += AnonymousClass7TE.A04(scrollPerfData.getFieldValue(UTILIZATION_FIELD));
            float f = this.mSum1Drop;
            List list2 = ScrollPerfData.SCROLL_PERF_FIELDS;
            this.mSum1Drop = f + ((float) AnonymousClass7TE.A0M(scrollPerfData.getFieldValue(AnonymousClass7TE.A19(list2, 2))));
            this.mSum4Drop += AnonymousClass7TE.A04(scrollPerfData.getFieldValue(AnonymousClass7TE.A19(list2, 3)));
            this.mAvgUtil = this.mSumUtil / ((float) this.mScrollData.size());
            this.mAvg1Drop = this.mSum1Drop / ((float) this.mScrollData.size());
            this.mAvg4Drop = this.mSum4Drop / ((float) this.mScrollData.size());
        }
    }

    private void calculateMax() {
        if (!this.mScrollData.isEmpty()) {
            List list = this.mScrollData;
            ScrollPerfData scrollPerfData = (ScrollPerfData) list.get(list.size() - 1);
            scrollPerfData.getFieldValue(UTILIZATION_FIELD);
            float A04 = AnonymousClass7TE.A04(scrollPerfData.getFieldValue(UTILIZATION_FIELD));
            if (A04 > this.mMaxUtil) {
                this.mMaxUtil = A04;
            }
            List list2 = ScrollPerfData.SCROLL_PERF_FIELDS;
            float intValue = (float) AnonymousClass7TH.A0E(scrollPerfData, list2, 2).intValue();
            if (intValue > this.mMax1Drop) {
                this.mMax1Drop = intValue;
            }
            float floatValue = AnonymousClass7TH.A0E(scrollPerfData, list2, 3).floatValue();
            if (floatValue > this.mMax4Drop) {
                this.mMax4Drop = floatValue;
            }
        }
    }

    private void calculateMin() {
        if (!this.mScrollData.isEmpty()) {
            List list = this.mScrollData;
            ScrollPerfData scrollPerfData = (ScrollPerfData) list.get(list.size() - 1);
            scrollPerfData.getFieldValue(UTILIZATION_FIELD);
            float A04 = AnonymousClass7TE.A04(scrollPerfData.getFieldValue(UTILIZATION_FIELD));
            if (this.mScrollData.size() == 1 || A04 < this.mMinUtil) {
                this.mMinUtil = A04;
            }
            List list2 = ScrollPerfData.SCROLL_PERF_FIELDS;
            int intValue = AnonymousClass7TH.A0E(scrollPerfData, list2, 2).intValue();
            if (this.mScrollData.size() == 1 || ((float) intValue) < this.mMin1Drop) {
                this.mMin1Drop = (float) intValue;
            }
            float floatValue = AnonymousClass7TH.A0E(scrollPerfData, list2, 3).floatValue();
            if (this.mScrollData.size() == 1 || floatValue < this.mMin4Drop) {
                this.mMin4Drop = floatValue;
            }
        }
    }

    private void calculatePerMin() {
        if (!this.mScrollData.isEmpty()) {
            List list = this.mScrollData;
            float A0R = this.mTotalTimeSpent + ((float) AnonymousClass7TE.A0R(((ScrollPerfData) list.get(list.size() - 1)).getFieldValue(AnonymousClass7TE.A19(ScrollPerfData.SCROLL_PERF_FIELDS, 5))));
            this.mTotalTimeSpent = A0R;
            TimeUnit timeUnit = TimeUnit.MINUTES;
            this.mFDPM = ((double) this.mSum1Drop) / ((double) (A0R / ((float) timeUnit.toMillis(1))));
            this.mLFDPM = ((double) this.mSum4Drop) / ((double) (this.mTotalTimeSpent / ((float) timeUnit.toMillis(1))));
        }
    }

    public void addItem(ScrollPerfData scrollPerfData) {
        List list = ScrollPerfData.SCROLL_PERF_FIELDS;
        if (!scrollPerfData.getFieldValue(AnonymousClass7TE.A19(list, 1)).equals(this.mContainer) && !this.mScrollData.isEmpty()) {
            clear();
        }
        this.mScrollData.add(scrollPerfData);
        calculateAverage();
        calculateMin();
        calculateMax();
        calculatePerMin();
        if (this.mScrollData.size() == 1) {
            this.mContainer = scrollPerfData.getFieldValue(AnonymousClass7TE.A19(list, 1)).toString();
        }
    }

    public void clear() {
        this.mScrollData.clear();
        AnonymousClass7TH.A0Z(this);
    }

    public float getAvg1Drop() {
        return this.mAvg1Drop;
    }

    public float getAvg4Drop() {
        return this.mAvg4Drop;
    }

    public float getAvgUtil() {
        return this.mAvgUtil;
    }

    public String getContainer() {
        return this.mContainer;
    }

    public int getCount() {
        return this.mScrollData.size();
    }

    public double getFDPM() {
        return this.mFDPM;
    }

    public double getLFDPM() {
        return this.mLFDPM;
    }

    public float getMax1Drop() {
        return this.mMax1Drop;
    }

    public float getMax4Drop() {
        return this.mMax4Drop;
    }

    public float getMaxUtil() {
        return this.mMaxUtil;
    }

    public float getMin1Drop() {
        return this.mMin1Drop;
    }

    public float getMin4Drop() {
        return this.mMin4Drop;
    }

    public float getMinUtil() {
        return this.mMinUtil;
    }

    public double getSum4Drop() {
        return (double) this.mSum4Drop;
    }

    public float getTotalTimeSpent() {
        return this.mTotalTimeSpent;
    }

    public AggregateScrollData() {
        AnonymousClass7TH.A0Z(this);
        this.mFDPM = 0.0d;
        this.mLFDPM = 0.0d;
    }
}
