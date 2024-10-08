package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.LlV  reason: case insensitive filesystem */
public final class C64992LlV implements X9K {
    public final AnonymousClass0eM A00;

    public final IgTextView B0i(Context context, View view, UserSession userSession) {
        0qQ.A0B(view, 0);
        String A16 = AnonymousClass7TE.A16(context, 2131955070);
        IgTextView A0a = DbT.A0a(view, R.id.chat_sticker_eligible_requesters_text);
        A0a.setVisibility(0);
        DbT.A1H(A0a);
        SpannableStringBuilder A0D = DbY.A0D(context, A16, 2131955072);
        AnonymousClass7AV.A04(A0D, new C48053ESw(context, userSession, AnonymousClass7TF.A03(context, R.attr.igds_color_controls), 6), A16);
        A0a.setText(A0D);
        return A0a;
    }

    public final boolean Bul() {
        return true;
    }

    public final String C1J() {
        return C273654mx.A00(82);
    }

    public final ChatStickerChannelType An1() {
        return ChatStickerChannelType.DISCOVERABLE;
    }

    public final boolean BJ4(UserSession userSession, boolean z) {
        if (z || !182.A06(0Tu.A05, userSession, 36314936330161056L)) {
            return false;
        }
        return true;
    }

    public final C252063oV Bzc() {
        return (C252063oV) this.A00.getValue();
    }

    public C64992LlV(View view) {
        this.A00 = AnonymousClass0eN.A01(new C66300MMj(view, 26));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final CircularImageView AeF(Context context, View view) {
        View requireViewById = view.requireViewById(R.id.chat_sticker_avatar_badge);
        ? r1 = (CircularImageView) requireViewById;
        r1.setVisibility(8);
        0qQ.A07(requireViewById);
        return r1;
    }

    public final IgTextView C2g(Context context, View view, UserSession userSession) {
        IgTextView requireViewById = view.requireViewById(R.id.chat_sticker_subtitle);
        IgTextView igTextView = requireViewById;
        DbX.A13(context, igTextView, Integer.valueOf(C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), 2131964522);
        0qQ.A07(requireViewById);
        return igTextView;
    }
}
