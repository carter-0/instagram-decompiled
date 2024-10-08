package com.instagram.debug.devoptions.vtd.core;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.C51968G9o;

public final class VtdBreadCrumb extends AnonymousClass0T0 {
    public final VtdLifecycleEvent lifecycleEvent;
    public final long timestamp;

    public VtdBreadCrumb(long j, VtdLifecycleEvent vtdLifecycleEvent) {
        0qQ.A0B(vtdLifecycleEvent, 2);
        this.timestamp = j;
        this.lifecycleEvent = vtdLifecycleEvent;
    }

    public final long component1() {
        return this.timestamp;
    }

    public final VtdLifecycleEvent component2() {
        return this.lifecycleEvent;
    }

    public final VtdBreadCrumb copy(long j, VtdLifecycleEvent vtdLifecycleEvent) {
        0qQ.A0B(vtdLifecycleEvent, 1);
        return new VtdBreadCrumb(j, vtdLifecycleEvent);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VtdBreadCrumb) {
                VtdBreadCrumb vtdBreadCrumb = (VtdBreadCrumb) obj;
                if (!(this.timestamp == vtdBreadCrumb.timestamp && this.lifecycleEvent == vtdBreadCrumb.lifecycleEvent)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ VtdBreadCrumb copy$default(VtdBreadCrumb vtdBreadCrumb, long j, VtdLifecycleEvent vtdLifecycleEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            j = vtdBreadCrumb.timestamp;
        }
        if ((i & 2) != 0) {
            vtdLifecycleEvent = vtdBreadCrumb.lifecycleEvent;
        }
        0qQ.A0B(vtdLifecycleEvent, 1);
        return new VtdBreadCrumb(j, vtdLifecycleEvent);
    }

    public final VtdLifecycleEvent getLifecycleEvent() {
        return this.lifecycleEvent;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.lifecycleEvent, C51968G9o.A03(this.timestamp) * 31);
    }
}
