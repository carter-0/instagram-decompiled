package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;

/* renamed from: X.8wI  reason: invalid class name and case insensitive filesystem */
public final class C370358wI extends AnonymousClass0T0 implements C370368wJ {
    public final MediaGiftCountVisibilityState A00;
    public final MediaGiftingState A01;

    public C370358wI(MediaGiftCountVisibilityState mediaGiftCountVisibilityState, MediaGiftingState mediaGiftingState) {
        0qQ.A0B(mediaGiftCountVisibilityState, 1);
        0qQ.A0B(mediaGiftingState, 2);
        this.A00 = mediaGiftCountVisibilityState;
        this.A01 = mediaGiftingState;
    }

    public final C370358wI F5j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C370358wI) {
                C370358wI r5 = (C370358wI) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final MediaGiftCountVisibilityState B9J() {
        return this.A00;
    }

    public final MediaGiftingState BQ5() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaAppreciationSettings", C393399wN.A00(this));
    }
}
