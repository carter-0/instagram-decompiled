package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;

/* renamed from: X.4AK  reason: invalid class name */
public final class AnonymousClass4AK extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass4AF A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public AnonymousClass4AK(AnonymousClass0iw r7, UserSession userSession, AnonymousClass4AF r9, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r7;
        this.A04 = z;
        this.A02 = r9;
        this.A03 = z2;
        this.A05 = 182.A01(0Tu.A05, userSession, 36604949705528447L) > 0;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup, 0);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater, 1);
        boolean A07 = 0yU.A07(AnonymousClass0yP.A00(36323474730658994L));
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        if (A07) {
            Context context = layoutInflater.getContext();
            0qQ.A07(context);
            Resources resources = context.getResources();
            0qQ.A07(resources);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.featured_user_story_ring_size);
            Context context2 = layoutInflater.getContext();
            0qQ.A07(context2);
            Resources resources2 = context2.getResources();
            0qQ.A07(resources2);
            inflate = 2Su.A01(layoutInflater2, new ViewGroup.LayoutParams(dimensionPixelSize, resources2.getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge)), viewGroup2, R.layout.item_pog, false, this.A05);
        } else {
            inflate = layoutInflater.inflate(R.layout.item_pog, viewGroup, false);
            0qQ.A07(inflate);
        }
        return new AnonymousClass5AK(inflate, this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        AnonymousClass4AS r102 = (AnonymousClass4AS) r10;
        AnonymousClass5AK r112 = (AnonymousClass5AK) r11;
        0qQ.A0B(r102, 0);
        0qQ.A0B(r112, 1);
        boolean z = this.A04;
        r112.A00 = r102;
        if (z) {
            View view = r112.A02;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
        }
        NoteAvatarView noteAvatarView = r112.A04;
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = noteAvatarView.A0H;
        User user = r102.A00;
        ImageUrl Bh3 = user.Bh3();
        AnonymousClass4AK r6 = r112.A05;
        reelAvatarWithBadgeView.setSingleAvatarUrlAndVisibility(Bh3, r6.A00);
        noteAvatarView.A0G(user);
        IgTextView igTextView = r112.A03;
        View view2 = r112.A01;
        Resources resources = view2.getResources();
        int i = 2131976968;
        if (r6.A03) {
            i = 2131970848;
        }
        igTextView.setText(resources.getString(i));
        View view3 = r112.A02;
        view3.setContentDescription(resources.getString(2131952319));
        Context context = view2.getContext();
        igTextView.setTextColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_text)));
        noteAvatarView.setCreationContent(r102.A01);
        if (!r102.A02 || !AnonymousClass4AJ.A02(r6.A01)) {
            noteAvatarView.A0E((Drawable) null, 0, false);
            noteAvatarView.A0D();
        } else {
            Context context2 = noteAvatarView.getContext();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material);
            noteAvatarView.A0H.setBadgeOffset(context2.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap));
            Drawable drawable = context2.getDrawable(R.drawable.birthday_pog_indicator);
            if (drawable != null) {
                noteAvatarView.A0E(drawable, dimensionPixelOffset, false);
                noteAvatarView.setBadgeDrawableOnClickDelegate(new AnonymousClass9M3(13, r6, r102));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        noteAvatarView.setPadding(0, 0, 0, 0);
        2eQ.A01(view3);
    }

    public final Class modelClass() {
        return AnonymousClass4AS.class;
    }

    public AnonymousClass4AK() {
    }
}
