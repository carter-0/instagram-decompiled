package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.5qK  reason: invalid class name and case insensitive filesystem */
public abstract class C296595qK {
    public static final C296605qL A00(AnonymousClass0iw r6) {
        String moduleName;
        String mediaId;
        String url;
        0qQ.A0B(r6, 0);
        boolean z = r6 instanceof ReelViewerFragment;
        if (z) {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r6;
            C255773uh Au5 = reelViewerFragment.Au5();
            if (!reelViewerFragment.isResumed() || !ReelViewerFragment.A0Q(reelViewerFragment) || !reelViewerFragment.A2X || Au5 == null || !Au5.CcK()) {
                moduleName = reelViewerFragment.getModuleName();
            } else {
                moduleName = AnonymousClass000.A00(3366);
            }
        } else {
            moduleName = r6.getModuleName();
        }
        if (moduleName == null) {
            moduleName = "";
        }
        0qQ.A0A(moduleName);
        if (!z) {
            mediaId = null;
        } else {
            mediaId = ((ReelViewerFragment) r6).getMediaId();
        }
        String A00 = 0Jf.A00(r6.getClass());
        0qQ.A07(A00);
        if (!(r6 instanceof AnonymousClass0j7)) {
            url = null;
        } else {
            url = ((AnonymousClass0j7) r6).getUrl();
        }
        0qQ.A0B(moduleName, 0);
        return new C296605qL(moduleName, A00, url, mediaId);
    }
}
