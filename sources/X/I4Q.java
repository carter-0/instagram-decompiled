package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class I4Q {
    public static final I4Q A00 = new Object();

    public final void A01(Context context, View view, C54694HOz hOz, String str, C62320sa r10) {
        int i;
        0qQ.A0B(view, 1);
        C51967G9n.A0x(view, R.id.inspiration_hub_empty_error_state, 0);
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        int ordinal = hOz.ordinal();
        if (ordinal != 0) {
            i = R.drawable.instagram_music_outline_96;
            if (ordinal != 1) {
                i = R.drawable.instagram_users_outline_96;
            }
        } else {
            i = R.drawable.instagram_reels_outline_96;
        }
        imageView.setImageResource(i);
        DbU.A1A(context.getResources(), AnonymousClass7TE.A0d(view, R.id.title), 2131961622);
        DbU.A1A(context.getResources(), AnonymousClass7TE.A0d(view, R.id.subtitle), 2131961621);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.action);
        A0d.setVisibility(0);
        if (str == null) {
            str = AnonymousClass7TF.A0d(context.getResources(), 2131961617);
        }
        A0d.setText(str);
        C56800ICx.A00(A0d, 40, r10);
    }

    public final void A02(Context context, View view, C54694HOz hOz, C62320sa r9, boolean z) {
        int i;
        0qQ.A0B(view, 1);
        if (C61970qY.A0F(context) || !z) {
            C51967G9n.A0x(view, R.id.inspiration_hub_empty_error_state, 0);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            int ordinal = hOz.ordinal();
            if (ordinal != 0) {
                i = R.drawable.instagram_music_outline_96;
                if (ordinal != 1) {
                    i = R.drawable.instagram_users_outline_96;
                }
            } else {
                i = R.drawable.instagram_reels_outline_96;
            }
            imageView.setImageResource(i);
            DbU.A1A(context.getResources(), AnonymousClass7TE.A0d(view, R.id.title), 2131961764);
            DbU.A1A(context.getResources(), AnonymousClass7TE.A0d(view, R.id.subtitle), 2131961763);
            TextView A0d = AnonymousClass7TE.A0d(view, R.id.action);
            A0d.setVisibility(0);
            DbU.A1A(context.getResources(), A0d, 2131961762);
            C56800ICx.A00(A0d, 41, r9);
            return;
        }
        C310336ap A0W = DbV.A0W();
        DbS.A19(context, A0W, 2131968255);
        A0W.A02();
        A0W.A07(R.drawable.instagram_info_pano_outline_24);
        A0W.A06();
        DbW.A0q(context, A0W, 2131968257);
        A0W.A0L = true;
        C57276IVl.A00(A0W, r9, 5);
        Dbb.A1Q(A0W);
    }

    public static final void A00(Activity activity, 28D r3, AnonymousClass4DH r4, UserSession userSession) {
        boolean A1Y = DbW.A1Y(userSession);
        C56044Hrt A0C = C250563lf.A0C(r3);
        A0C.A0n = A1Y;
        A0C.A01(C363138jC.A00);
        A0C.A01(AnonymousClass9QA.A00);
        A0C.A01(AnonymousClass80L.A00);
        I3M.A00(activity, A0C.A00(), r4, r3, userSession);
    }
}
