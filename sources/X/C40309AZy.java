package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.AZy  reason: case insensitive filesystem */
public final class C40309AZy implements X9K {
    public final AnonymousClass0eM A00;

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final CircularImageView AeF(Context context, View view) {
        View requireViewById = view.requireViewById(R.id.chat_sticker_avatar_badge);
        ? r1 = (CircularImageView) requireViewById;
        r1.setVisibility(0);
        r1.setImageDrawable(context.getDrawable(R.drawable.subscriptions_crown_badge_drawable));
        0qQ.A07(requireViewById);
        return r1;
    }

    public final IgTextView B0i(Context context, View view, UserSession userSession) {
        return null;
    }

    public final boolean BJ4(UserSession userSession, boolean z) {
        return true;
    }

    public final boolean Bul() {
        return false;
    }

    public final String C1J() {
        return C273654mx.A00(191);
    }

    public final ChatStickerChannelType An1() {
        return ChatStickerChannelType.SUBSCRIBER;
    }

    public final C252063oV Bzc() {
        return (C252063oV) this.A00.getValue();
    }

    public C40309AZy(View view) {
        this.A00 = AnonymousClass0eN.A01(new C66300MMj(view, 27));
    }

    public final IgTextView C2g(Context context, View view, UserSession userSession) {
        int A002 = C375479Ds.A00(userSession);
        IgTextView requireViewById = view.requireViewById(R.id.chat_sticker_subtitle);
        IgTextView igTextView = requireViewById;
        igTextView.setText(context.getString(2131974609, AnonymousClass7TF.A1b(A002)));
        0qQ.A07(requireViewById);
        return igTextView;
    }
}
