package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9YM  reason: invalid class name */
public final class AnonymousClass9YM extends 2Rw {
    public List A00 = AnonymousClass7TE.A1C();
    public final UserSession A01;
    public final AnonymousClass8MJ A02;

    public final void onBindViewHolder(C249703kE r8, int i) {
        0qQ.A0B(r8, 0);
        AIM.A02(this.A01, (C357638Yz) null, this.A02, (C380519Ym) r8, (C317876nz) this.A00.get(i), (Long) null);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Object tag = AIM.A00(AnonymousClass7TE.A0S(viewGroup), 1.0f, true).getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetItemViewBinder.Holder");
        return (C249703kE) tag;
    }

    public AnonymousClass9YM(UserSession userSession, AnonymousClass8MJ r3) {
        AnonymousClass7TG.A1O(userSession, r3);
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-178252134);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(795157473, A03);
        return size;
    }
}
