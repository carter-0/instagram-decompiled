package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.Ac1  reason: case insensitive filesystem */
public final class C40430Ac1 implements C351948Bb {
    public View A00;
    public View A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass80U A07;
    public final DirectThreadKey A08;
    public final Integer A09;
    public final AnonymousClass0eK A0A;

    public final void EQQ(boolean z) {
    }

    public final void Ejs(boolean z) {
        View[] viewArr = {this.A04};
        if (z) {
            C294975nL.A04((C295005nO) null, viewArr, true);
        } else {
            C294975nL.A05(viewArr, true);
        }
    }

    public C40430Ac1(Context context, View view, AnonymousClass0iw r14, UserSession userSession, AnonymousClass80U r16, DirectThreadKey directThreadKey, Integer num, AnonymousClass0eK r19) {
        String str;
        AnonymousClass3U9 A0N;
        ImageUrl imageUrl;
        AnonymousClass7TG.A1O(view, context);
        0qQ.A0B(userSession, 4);
        this.A04 = view;
        this.A03 = context;
        this.A07 = r16;
        this.A06 = userSession;
        this.A05 = r14;
        this.A08 = directThreadKey;
        this.A09 = num;
        this.A0A = r19;
        this.A02 = C61270mF.A00(context);
        view.setVisibility(0);
        View view2 = this.A04;
        this.A01 = view2.requireViewById(R.id.magic_media_remix_send_button_container);
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.magic_media_remix_send_button_text);
        Context context2 = this.A03;
        A0R.setText(context2.getString(2131960296));
        ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0F(view2, R.id.magic_media_remix_send_button_stub);
        viewStub.setLayoutResource(R.layout.direct_multi_media_tray_button_stacked_avatar);
        Context context3 = view2.getContext();
        viewStub.setBackground(context3.getDrawable(R.drawable.direct_large_avatar_button_background));
        DirectThreadKey directThreadKey2 = this.A08;
        AnonymousClass0iw r8 = this.A05;
        ImageUrl imageUrl2 = null;
        if (!(directThreadKey2 == null || (((str = directThreadKey2.A00) == null && (str = directThreadKey2.A01) == null) || (A0N = 1bJ.A00(this.A06).A0N(str)) == null))) {
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.stackedavatar.StackedAvatarView");
            StackedAvatarView stackedAvatarView = (StackedAvatarView) inflate;
            boolean z = A0N.BRZ().size() > 1;
            if (AnonymousClass7TE.A1b(A0N.BRZ())) {
                imageUrl = ((User) A0N.BRZ().get(0)).Bh3();
            } else {
                imageUrl = null;
            }
            stackedAvatarView.setUrls(imageUrl, z ? ((User) A0N.BRZ().get(1)).Bh3() : imageUrl2, r8);
            if (z) {
                stackedAvatarView.A04(context3, R.dimen.abc_dialog_padding_top_material);
                stackedAvatarView.setPadding((int) context3.getResources().getDimension(R.dimen.account_recs_header_image_margin), (int) context3.getResources().getDimension(R.dimen.abc_control_corner_material), 0, 0);
            } else {
                stackedAvatarView.A04(context3, R.dimen.abc_dialog_padding_material);
            }
            stackedAvatarView.setRingColor(context3.getColor(2Yu.A0H(context2, R.attr.igds_color_primary_button_on_media)));
        }
        View view3 = this.A01;
        String str2 = "sendButton";
        if (view3 != null) {
            view3.setVisibility(0);
            View view4 = this.A01;
            if (view4 != null) {
                AnonymousClass0fU.A00(new C71403Ok2(this, 24), view4);
                View requireViewById = this.A04.requireViewById(R.id.magic_media_remix_edit_button_container);
                this.A00 = requireViewById;
                if (requireViewById == null) {
                    str2 = "editButton";
                } else {
                    AOX.A00(requireViewById, 24, this);
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
