package com.instagram.autoplay.models;

import X.0qQ;
import X.0sn;
import X.JTT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AutoplayConfiguration {
    public final List autoplayCustomizations;
    public final AutoplayLayout layout;
    public final int normativeMaximumBufferingMs;
    public final int normativeMinimumBufferingMs;

    public AutoplayConfiguration(AutoplayLayout autoplayLayout, List list, int i, int i2) {
        0qQ.A0B(autoplayLayout, 1);
        0qQ.A0B(list, 2);
        this.layout = autoplayLayout;
        this.autoplayCustomizations = list;
        this.normativeMinimumBufferingMs = i;
        this.normativeMaximumBufferingMs = i2;
    }

    public final List getAutoplayCustomizations() {
        return this.autoplayCustomizations;
    }

    public final AutoplayLayout getLayout() {
        return this.layout;
    }

    public final int getNormativeMaximumBufferingMs() {
        return this.normativeMaximumBufferingMs;
    }

    public final int getNormativeMinimumBufferingMs() {
        return this.normativeMinimumBufferingMs;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoplayConfiguration(AutoplayLayout autoplayLayout, 0sn r4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(autoplayLayout, (i3 & 2) != 0 ? 0sn.A00 : r4, JTT.A01(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }
}
