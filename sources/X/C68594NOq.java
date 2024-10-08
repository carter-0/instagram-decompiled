package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import java.util.List;

/* renamed from: X.NOq  reason: case insensitive filesystem */
public final class C68594NOq extends C232222tE {
    public final Fragment A00;
    public final UserSession A01;
    public final C68490NKj A02;
    public final boolean A03;

    public C68594NOq(Fragment fragment, UserSession userSession, C68490NKj nKj, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = nKj;
        this.A00 = fragment;
        this.A03 = z;
    }

    public static LayerDrawable A00(Context context, Fragment fragment, int i, int i2) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C69978NvI.A00(fragment), context.getDrawable(i)});
        int A012 = AnonymousClass1GB.A01(0nA.A04(fragment.requireContext(), i2));
        int A013 = AnonymousClass1GB.A01(0nA.A04(fragment.requireContext(), 8));
        layerDrawable.setLayerInset(0, A012, A012, A012, A012);
        layerDrawable.setLayerInset(i2, A013, A013, A013, A013);
        return layerDrawable;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C68033Myz(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.notes_audience_item, false), this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        OF8 of8;
        String string;
        NWR nwr = (NWR) r11;
        C68033Myz myz = (C68033Myz) r12;
        boolean A1U = AnonymousClass7TF.A1U(0, nwr, myz);
        C68594NOq nOq = myz.A06;
        Fragment fragment = nOq.A00;
        NoteAudience noteAudience = nwr.A00;
        switch (noteAudience.ordinal()) {
            case 0:
            case 1:
            case 5:
                0qQ.A0B(fragment, 0);
                of8 = new OF8(A00(fragment.requireContext(), fragment, R.drawable.instagram_user_following_pano_outline_24, A1U ? 1 : 0), new NoteAudienceItem(NoteAudience.MUTUAL_FOLLOWERS, (String) null, (List) null, 0), AnonymousClass7TF.A0d(DbV.A05(fragment), 2131968564), (String) null);
                break;
            case 2:
                UserSession userSession = nOq.A01;
                0qQ.A0B(userSession, 0);
                0qQ.A0B(fragment, A1U);
                NoteAudienceItem noteAudienceItem = new NoteAudienceItem(NoteAudience.CLOSE_FRIENDS, (String) null, (List) null, 0);
                String A0d = AnonymousClass7TF.A0d(DbV.A05(fragment), 2131956191);
                int A002 = C63112Krf.A00(userSession);
                Resources A05 = DbV.A05(fragment);
                if (A002 > 0) {
                    string = DbY.A0d(A05, A002, R.plurals.recipient_picker_close_friends_count);
                } else {
                    string = A05.getString(2131968561);
                }
                0qQ.A0A(string);
                of8 = new OF8(C346697vb.A00(fragment.requireContext()), noteAudienceItem, A0d, string);
                break;
            case 3:
                boolean z = nOq.A03;
                0qQ.A0B(fragment, 0);
                LayerDrawable A003 = A00(fragment.requireContext(), fragment, R.drawable.instagram_lock_pano_outline_24, A1U);
                NoteAudienceItem noteAudienceItem2 = new NoteAudienceItem(NoteAudience.INTERNAL_ONLY, (String) null, (List) null, 0);
                Resources A052 = DbV.A05(fragment);
                int i = 2131968563;
                if (z) {
                    i = 2131954054;
                }
                String string2 = A052.getString(i);
                0qQ.A0A(string2);
                of8 = new OF8(A003, noteAudienceItem2, string2, (String) null);
                break;
            case 4:
                UserSession userSession2 = nOq.A01;
                0qQ.A0B(userSession2, 0);
                0qQ.A0B(fragment, A1U);
                Drawable drawable = fragment.requireContext().getDrawable(R.drawable.instagram_user_following_outline_96);
                AnonymousClass7TF.A0Q(userSession2).A03.B6v();
                of8 = new OF8(drawable, new NoteAudienceItem(NoteAudience.ALL_FOLLOWERS, (String) null, (List) null, 0), AnonymousClass7TF.A0d(DbV.A05(fragment), 2131968562), (String) null);
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        C71405Ok4.A01(myz.A01, 70, of8, nOq);
        IgSimpleImageView igSimpleImageView = myz.A02;
        igSimpleImageView.setImageDrawable(of8.A01);
        NoteAudience noteAudience2 = NoteAudience.CLOSE_FRIENDS;
        if (noteAudience != noteAudience2) {
            Context context = myz.A00.getContext();
            DbU.A14(context, igSimpleImageView, 2Yu.A0H(context, R.attr.igds_color_primary_icon));
        }
        IgTextView igTextView = myz.A04;
        2eS.A01(igTextView);
        igTextView.setText(of8.A03);
        IgTextView igTextView2 = myz.A03;
        String str = of8.A00;
        igTextView2.setText(str);
        int i2 = 0;
        if (str == null || str.length() == 0) {
            i2 = 8;
        }
        igTextView2.setVisibility(i2);
        if (of8.A02.A00 == noteAudience2) {
            C71395Oju.A00(igTextView2, 69, nOq);
        } else {
            igTextView2.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        myz.A05.setChecked(nwr.A01);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        Context context2 = myz.A00.getContext();
        layoutParams.width = context2.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        layoutParams.height = AnonymousClass7TF.A02(context2, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        igSimpleImageView.setLayoutParams(layoutParams);
    }

    public final Class modelClass() {
        return NWR.class;
    }

    public C68594NOq() {
    }
}
