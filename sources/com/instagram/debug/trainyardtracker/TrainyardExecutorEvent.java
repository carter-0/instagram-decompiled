package com.instagram.debug.trainyardtracker;

import X.0qQ;
import X.C13992Tns;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class TrainyardExecutorEvent {
    public static final Companion Companion = new Object();
    public int queueId;
    public int queueSize;
    public int runnable;
    public int runnableId;
    public final List tags;
    public final long time;
    public final TrainyardEventType type;

    public final class Companion {
        public final TrainyardExecutorEvent onExecute() {
            return C13992Tns.A0B(TrainyardEventType.EXECUTE);
        }

        public final TrainyardExecutorEvent onFail() {
            return C13992Tns.A0B(TrainyardEventType.FAIL);
        }

        public final TrainyardExecutorEvent onFinish() {
            return C13992Tns.A0B(TrainyardEventType.FINISH);
        }

        public final TrainyardExecutorEvent onQueue() {
            return C13992Tns.A0B(TrainyardEventType.QUEUE);
        }

        public final TrainyardExecutorEvent onStuck() {
            return C13992Tns.A0B(TrainyardEventType.STUCK);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final TrainyardExecutorEvent runnable(Runnable runnable2) {
        0qQ.A0B(runnable2, 0);
        this.runnable = runnable2.hashCode();
        return this;
    }

    public final TrainyardExecutorEvent tag(TrainyardEventTag trainyardEventTag) {
        0qQ.A0B(trainyardEventTag, 0);
        this.tags.add(trainyardEventTag);
        return this;
    }

    public final TrainyardExecutorEvent tags(List list) {
        0qQ.A0B(list, 0);
        this.tags.addAll(list);
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrainyardExecutorEvent(int i, int i2, int i3, int i4, List list, TrainyardEventType trainyardEventType, long j, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? -1 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? -1 : i4, (i5 & 16) != 0 ? new ArrayList() : list, trainyardEventType, (i5 & 64) != 0 ? SystemClock.elapsedRealtime() : j);
    }

    private final TrainyardExecutorEvent cloneMetadata(TrainyardExecutorEvent trainyardExecutorEvent) {
        this.runnable = trainyardExecutorEvent.runnable;
        this.runnableId = trainyardExecutorEvent.runnableId;
        this.queueId = trainyardExecutorEvent.queueId;
        this.queueSize = trainyardExecutorEvent.queueSize;
        this.tags.addAll(trainyardExecutorEvent.tags);
        return this;
    }

    public static final TrainyardExecutorEvent onExecute() {
        return C13992Tns.A0B(TrainyardEventType.EXECUTE);
    }

    public static final TrainyardExecutorEvent onFail() {
        return C13992Tns.A0B(TrainyardEventType.FAIL);
    }

    public static final TrainyardExecutorEvent onFinish() {
        return C13992Tns.A0B(TrainyardEventType.FINISH);
    }

    public static final TrainyardExecutorEvent onQueue() {
        return C13992Tns.A0B(TrainyardEventType.QUEUE);
    }

    public static final TrainyardExecutorEvent onStuck() {
        return C13992Tns.A0B(TrainyardEventType.STUCK);
    }

    public final int getQueueId() {
        return this.queueId;
    }

    public final int getQueueSize() {
        return this.queueSize;
    }

    public final int getRunnable() {
        return this.runnable;
    }

    public final int getRunnableId() {
        return this.runnableId;
    }

    public final List getTags() {
        return this.tags;
    }

    public final long getTime() {
        return this.time;
    }

    public final TrainyardEventType getType() {
        return this.type;
    }

    public final TrainyardExecutorEvent queueId(int i) {
        this.queueId = i;
        return this;
    }

    public final TrainyardExecutorEvent queueSize(int i) {
        this.queueSize = i;
        return this;
    }

    public final TrainyardExecutorEvent runnableId(int i) {
        this.runnableId = i;
        return this;
    }

    public final void setQueueId(int i) {
        this.queueId = i;
    }

    public final void setQueueSize(int i) {
        this.queueSize = i;
    }

    public final void setRunnable(int i) {
        this.runnable = i;
    }

    public final void setRunnableId(int i) {
        this.runnableId = i;
    }

    public final TrainyardExecutorEvent toExecute() {
        TrainyardExecutorEvent A0B = C13992Tns.A0B(TrainyardEventType.EXECUTE);
        A0B.cloneMetadata(this);
        return A0B;
    }

    public final TrainyardExecutorEvent toFail() {
        TrainyardExecutorEvent A0B = C13992Tns.A0B(TrainyardEventType.FAIL);
        A0B.cloneMetadata(this);
        return A0B;
    }

    public final TrainyardExecutorEvent toFinish() {
        TrainyardExecutorEvent A0B = C13992Tns.A0B(TrainyardEventType.FINISH);
        A0B.cloneMetadata(this);
        return A0B;
    }

    public TrainyardExecutorEvent(int i, int i2, int i3, int i4, List list, TrainyardEventType trainyardEventType, long j) {
        this.runnable = i;
        this.runnableId = i2;
        this.queueId = i3;
        this.queueSize = i4;
        this.tags = list;
        this.type = trainyardEventType;
        this.time = j;
    }
}
