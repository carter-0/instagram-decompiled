package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.LQy  reason: case insensitive filesystem */
public final class C64157LQy {
    public static final C64157LQy A00 = new Object();

    public static final void A00(C66569MWx mWx, C66526MVe mVe, LBD lbd, C66458MSm mSm) {
        LBD lbd2 = lbd;
        View view = lbd.A00;
        ImageView imageView = lbd.A08;
        boolean z = lbd.A05;
        C66526MVe mVe2 = mVe;
        if (view != null) {
            view.setVisibility(0);
            AnonymousClass0fU.A00(new C64249LXb(4, mVe2, lbd2, mSm, mWx), view);
        }
        if (z) {
            imageView.setVisibility(0);
            LY7.A00(imageView, 43, mVe, mWx);
        }
    }

    public final View A01(ViewGroup viewGroup, boolean z, boolean z2) {
        ImageView A0F;
        AnonymousClass8ZI A002;
        ViewGroup viewGroup2 = viewGroup;
        Context context = viewGroup2.getContext();
        View A0D = DbT.A0D(LayoutInflater.from(context), viewGroup2, R.layout.row_search_audio_track, false);
        Resources resources = context.getResources();
        LBD lbd = new LBD(A0D);
        lbd.A05 = z2;
        ImageView imageView = null;
        lbd.A07.setImageDrawable(new GIH(context, (GJO) null, JTP.A05(resources), AnonymousClass7TE.A0C(resources), 0, AnonymousClass7TF.A03(A0D.getContext(), R.attr.avatarInnerStroke), JTP.A03(resources), -1, false));
        lbd.A02 = new C63785L6r(AnonymousClass7TG.A0R(A0D, R.id.artist_name));
        if (z) {
            boolean z3 = lbd.A05;
            AnonymousClass8ZG r1 = new AnonymousClass8ZG(context);
            r1.A0A = 0;
            r1.A00 = context.getDrawable(R.drawable.instagram_play_pano_filled_24);
            r1.A01 = context.getDrawable(R.drawable.instagram_stop_filled_16);
            if (z3) {
                imageView = A0D.requireViewById(R.id.album_art_preview_button);
                A0F = DbU.A0F(imageView, R.id.album_art_preview_button_icon);
                r1.A06 = 0;
                r1.A02(AnonymousClass7TG.A02(context));
                A002 = r1.A00();
            } else {
                A0F = DbU.A0F(A0D, R.id.side_preview_button);
                Integer A0n = DbV.A0n(context, 2Yu.A04(context));
                r1.A06 = A0n;
                r1.A0C = A0n;
                r1.A0B = Integer.valueOf(AnonymousClass7TG.A04(context));
                r1.A02(C51972G9s.A08(context));
                r1.A01(context.getColor(2Yu.A0B(context)));
                A002 = r1.A00();
                A002.setBounds(0, 0, context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width), AnonymousClass7TF.A02(context, R.dimen.account_group_management_clickable_width));
            }
            if (A0F != null) {
                A0F.setImageDrawable(A002);
            }
            lbd.A01 = A0F;
            lbd.A03 = A002;
            if (imageView == null) {
                imageView = A0F;
            }
            lbd.A00 = imageView;
        } else {
            lbd.A08.setVisibility(JTQ.A02(lbd.A01));
        }
        A0D.setTag(lbd);
        return A0D;
    }
}
