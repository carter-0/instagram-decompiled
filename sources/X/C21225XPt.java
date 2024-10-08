package X;

import com.instagram.reels.common.ui.StoryTypeSelectorView;

/* renamed from: X.XPt  reason: case insensitive filesystem */
public final class C21225XPt extends StoryTypeSelectorView {
    public C314256hu A00;
    public Boolean A01;

    public final void setSelectedQuickReactionsType(XR4 xr4) {
        AnonymousClass8ZM r0;
        0qQ.A0B(xr4, 0);
        if (xr4 == XR4.Emoji) {
            r0 = AnonymousClass8ZM.FIRST_OPTION;
        } else {
            r0 = AnonymousClass8ZM.SECOND_OPTION;
        }
        setSelectedType(r0);
    }

    public final XR4 getSelectedQuickReactionsType() {
        if (this.A02 == AnonymousClass8ZM.FIRST_OPTION) {
            return XR4.Emoji;
        }
        return XR4.Avatar;
    }

    public final C314256hu getListener() {
        return this.A00;
    }

    public final void setAvatarQRAvailable(Boolean bool) {
        this.A01 = bool;
    }

    public final void setListener(C314256hu r1) {
        this.A00 = r1;
    }
}
