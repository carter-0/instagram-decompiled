package com.instagram.autoplay.models;

import X.0qQ;
import X.AnonymousClass7TF;

public final class AutoplayCustomization {
    public final String id;
    public final int maxConcurrentBuffering;
    public final int maxConcurrentPlaying;
    public final int previewDurationMs;
    public final AutoplayWhichVideos whichVideos;

    public AutoplayCustomization(String str, int i, int i2, int i3, AutoplayWhichVideos autoplayWhichVideos) {
        0qQ.A0B(str, 1);
        0qQ.A0B(autoplayWhichVideos, 5);
        this.id = str;
        this.maxConcurrentPlaying = i;
        this.maxConcurrentBuffering = i2;
        this.previewDurationMs = i3;
        this.whichVideos = autoplayWhichVideos;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.autoplay.models.AutoplayCustomization");
                if (!0qQ.A0K(this.id, ((AutoplayCustomization) obj).id)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMaxConcurrentBuffering() {
        return this.maxConcurrentBuffering;
    }

    public final int getMaxConcurrentPlaying() {
        return this.maxConcurrentPlaying;
    }

    public final int getPreviewDurationMs() {
        return this.previewDurationMs;
    }

    public final boolean getShouldBufferInfiniteVideos() {
        return AnonymousClass7TF.A1Q(this.maxConcurrentBuffering);
    }

    public final boolean getShouldPreviewEntireVideo() {
        return AnonymousClass7TF.A1Q(this.previewDurationMs);
    }

    public final AutoplayWhichVideos getWhichVideos() {
        return this.whichVideos;
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
