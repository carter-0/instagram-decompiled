package com.instagram.autoplay.models;

import X.0qQ;
import X.1Xj;
import X.C51974G9v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AutoplayPlaybackHistory {
    public AutoplayPlaybackState currentState;
    public long currentStateStartTime;
    public List historicalPlaybackSegments;
    public final 1Xj media;

    public final void setCurrentState(AutoplayPlaybackState autoplayPlaybackState) {
        0qQ.A0B(autoplayPlaybackState, 0);
        this.currentState = autoplayPlaybackState;
    }

    public final void setHistoricalPlaybackSegments(List list) {
        0qQ.A0B(list, 0);
        this.historicalPlaybackSegments = list;
    }

    public final AutoplayPlaybackState getCurrentState() {
        return this.currentState;
    }

    public final long getCurrentStateStartTime() {
        return this.currentStateStartTime;
    }

    public final List getHistoricalPlaybackSegments() {
        return this.historicalPlaybackSegments;
    }

    public final 1Xj getMedia() {
        return this.media;
    }

    public final void setCurrentStateStartTime(long j) {
        this.currentStateStartTime = j;
    }

    public AutoplayPlaybackHistory(1Xj r1, AutoplayPlaybackState autoplayPlaybackState, long j, List list) {
        C51974G9v.A1L(r1, autoplayPlaybackState, list);
        this.media = r1;
        this.currentState = autoplayPlaybackState;
        this.currentStateStartTime = j;
        this.historicalPlaybackSegments = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoplayPlaybackHistory(1Xj r2, AutoplayPlaybackState autoplayPlaybackState, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r2, autoplayPlaybackState, j, (i & 8) != 0 ? new ArrayList() : list);
    }
}
