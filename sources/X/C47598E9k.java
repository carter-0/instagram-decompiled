package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E9k  reason: case insensitive filesystem */
public final class C47598E9k extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47598E9k(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1716059973);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.menu.threadrowitem.ThreadRowItemViewBinder.Holder");
        C46928Dni dni = (C46928Dni) tag;
        F01 f01 = (F01) obj;
        AnonymousClass7TF.A1H(dni, f01);
        IgdsPeopleCell igdsPeopleCell = dni.A00;
        igdsPeopleCell.A01();
        ImageUrl imageUrl = f01.A01;
        if (imageUrl != null) {
            igdsPeopleCell.A04(imageUrl, (View.OnClickListener) null);
        }
        Context context = igdsPeopleCell.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = igdsPeopleCell.A08;
        gradientSpinnerAvatarView.A0B(dimensionPixelSize, 0);
        gradientSpinnerAvatarView.A05();
        View.OnClickListener onClickListener = f01.A00;
        if (onClickListener != null) {
            AnonymousClass0fU.A00(onClickListener, igdsPeopleCell);
        }
        if (f01.A04) {
            igdsPeopleCell.A05(new C47790EHb(context, onClickListener, AnonymousClass05K.A0C, AnonymousClass05K.A01, 2Yu.A09(context)), (AnonymousClass3Z5) null);
        }
        igdsPeopleCell.A08(f01.A03, false);
        String str = f01.A02;
        if (str != null) {
            igdsPeopleCell.A07(str);
        }
        TextView textView = igdsPeopleCell.A06;
        DbX.A1C(textView, textView.getPaddingLeft(), context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
        AnonymousClass0fD.A0A(1227916678, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 854768542);
        Context context = this.A00;
        0qQ.A0B(context, 0);
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(context, (AttributeSet) null, 0, false);
        C46928Dni dni = new C46928Dni(igdsPeopleCell);
        Drawable drawable = context.getDrawable(R.drawable.facebook_user_badge_15);
        if (drawable != null) {
            dni.A00.A08.setBottomBadgeDrawable(drawable);
        }
        IgdsPeopleCell igdsPeopleCell2 = dni.A00;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = igdsPeopleCell2.A08;
        gradientSpinnerAvatarView.A00 = context.getResources().getDimension(R.dimen.abc_control_corner_material);
        gradientSpinnerAvatarView.A01 = DbU.A00(context, R.dimen.abc_control_corner_material);
        igdsPeopleCell.setTag(dni);
        AnonymousClass0fD.A0A(-1608824966, A04);
        return igdsPeopleCell2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
