package com.instagram.creation.capture.quickcapture.sundial.edit.model;

import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.C51965G9l;
import X.JTP;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClipsTimelineEditorConfig extends AnonymousClass0T0 implements Serializable {
    public final boolean hasPinnedMusic;
    public final boolean isOpenLastClip;
    public final boolean isSlipEnabled;
    public final int reorderVersion;

    public ClipsTimelineEditorConfig(boolean z) {
        this(z, false, false, 2);
    }

    public final boolean component1() {
        return this.isSlipEnabled;
    }

    public final boolean component2() {
        return this.isOpenLastClip;
    }

    public final boolean component3() {
        return this.hasPinnedMusic;
    }

    public final int component4() {
        return this.reorderVersion;
    }

    public final ClipsTimelineEditorConfig copy(boolean z, boolean z2, boolean z3, int i) {
        return new ClipsTimelineEditorConfig(z, z2, z3, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsTimelineEditorConfig) {
                ClipsTimelineEditorConfig clipsTimelineEditorConfig = (ClipsTimelineEditorConfig) obj;
                if (!(this.isSlipEnabled == clipsTimelineEditorConfig.isSlipEnabled && this.isOpenLastClip == clipsTimelineEditorConfig.isOpenLastClip && this.hasPinnedMusic == clipsTimelineEditorConfig.hasPinnedMusic && this.reorderVersion == clipsTimelineEditorConfig.reorderVersion)) {
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

    public static /* synthetic */ ClipsTimelineEditorConfig copy$default(ClipsTimelineEditorConfig clipsTimelineEditorConfig, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = clipsTimelineEditorConfig.isSlipEnabled;
        }
        if ((i2 & 2) != 0) {
            z2 = clipsTimelineEditorConfig.isOpenLastClip;
        }
        if ((i2 & 4) != 0) {
            z3 = clipsTimelineEditorConfig.hasPinnedMusic;
        }
        if ((i2 & 8) != 0) {
            i = clipsTimelineEditorConfig.reorderVersion;
        }
        return new ClipsTimelineEditorConfig(z, z2, z3, i);
    }

    public final boolean getHasPinnedMusic() {
        return this.hasPinnedMusic;
    }

    public final int getReorderVersion() {
        return this.reorderVersion;
    }

    public int hashCode() {
        return AnonymousClass7TF.A09(this.hasPinnedMusic, AnonymousClass7TF.A09(this.isOpenLastClip, C51965G9l.A05(this.isSlipEnabled))) + this.reorderVersion;
    }

    public final boolean isOpenLastClip() {
        return this.isOpenLastClip;
    }

    public final boolean isSlipEnabled() {
        return this.isSlipEnabled;
    }

    public ClipsTimelineEditorConfig(boolean z, boolean z2, boolean z3) {
        this(z, z2, z3, 2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClipsTimelineEditorConfig(boolean z, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(JTP.A1X(i2, z), (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 2 : i);
    }

    public ClipsTimelineEditorConfig(boolean z, boolean z2) {
        this(z, z2, false, 2);
    }

    public ClipsTimelineEditorConfig(boolean z, boolean z2, boolean z3, int i) {
        this.isSlipEnabled = z;
        this.isOpenLastClip = z2;
        this.hasPinnedMusic = z3;
        this.reorderVersion = i;
    }

    public ClipsTimelineEditorConfig() {
        this(false, false, false, 2);
    }
}
