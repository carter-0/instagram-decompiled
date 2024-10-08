package X;

import com.instagram.clips.intf.ClipsViewerSource;

/* renamed from: X.5M0  reason: invalid class name */
public abstract class AnonymousClass5M0 {
    public static final ClipsViewerSource A01(AnonymousClass0iw r8) {
        0qQ.A0B(r8, 0);
        for (ClipsViewerSource clipsViewerSource : ClipsViewerSource.values()) {
            if (0qQ.A0K(00p.A0g(r8.getModuleName(), "clips_viewer_", "", true), clipsViewerSource.A00)) {
                return clipsViewerSource;
            }
        }
        return ClipsViewerSource.UNKNOWN;
    }

    public static final ClipsViewerSource A00(AnonymousClass0iw r6) {
        for (ClipsViewerSource clipsViewerSource : ClipsViewerSource.values()) {
            if (0qQ.A0K(r6.getModuleName(), clipsViewerSource.A00)) {
                return clipsViewerSource;
            }
        }
        return ClipsViewerSource.UNKNOWN;
    }

    public static final ClipsViewerSource A02(String str) {
        for (ClipsViewerSource clipsViewerSource : ClipsViewerSource.values()) {
            if (0qQ.A0K(00p.A0g(str, "clips_viewer_", "", true), clipsViewerSource.A00)) {
                return clipsViewerSource;
            }
        }
        return ClipsViewerSource.UNKNOWN;
    }
}
