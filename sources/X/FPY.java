package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class FPY implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FPY(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    public final boolean onLongClick(View view) {
        switch (this.A00) {
            case 0:
                C46843DmJ dmJ = (C46843DmJ) this.A03;
                View view2 = ((C46981DoZ) this.A01).A00;
                F2P f2p = (F2P) this.A02;
                Context context = dmJ.A01;
                C355148Ov r2 = new C355148Ov(context, dmJ.A03, (Integer) null, false);
                C367618rI r8 = new C367618rI(context.getDrawable(R.drawable.instagram_edit_pano_outline_24), (Drawable) null, (C15048ULb) null, new C50486FcY(dmJ, f2p, 0), (Integer) null, AnonymousClass7TF.A0d(context.getResources(), 2131961425), 0, 0, 0, false, false, false, true, false, false, false);
                String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131957531);
                Drawable drawable = context.getDrawable(R.drawable.instagram_delete_pano_outline_24);
                int A032 = 2Yu.A03(context);
                r2.A02(0sr.A1P(new C367618rI[]{r8, new C367618rI(drawable, (Drawable) null, (C15048ULb) null, new C50486FcY(dmJ, f2p, 1), Integer.valueOf(A032), A0d, 0, 0, 0, false, false, false, true, false, false, false)}));
                r2.showAsDropDown(view2);
                return true;
            case 1:
                NQ4 nq4 = (NQ4) this.A03;
                if (!182.A06(0Tu.A05, nq4.A02, 36317934218909355L)) {
                    return true;
                }
                C74446Pv1 pv1 = nq4.A03;
                N64 n64 = (N64) this.A02;
                String str = n64.A07;
                String str2 = n64.A08;
                int i = n64.A00;
                View view3 = ((C249703kE) this.A01).itemView;
                0qQ.A06(view3);
                pv1.DgI(view3, str, str2, i);
                return true;
            case 2:
                return ((C47638EAy) this.A01).A01.DgH((JV7) null, (C283155Gi) this.A02, ((Number) this.A03).intValue());
            case 3:
                DbS.A1U(this.A02);
                UserSession userSession = (UserSession) this.A03;
                String A002 = AnonymousClass000.A00(3532);
                AnonymousClass62O r0 = I7S.A00;
                C49049EoT.A00((AnonymousClass0iw) this.A01, userSession, A002, "edit_profile_picture", "opal_self_profile", userSession.A06, (String) null);
                return true;
            case 4:
                C230242pG r3 = ((OEK) this.A03).A02;
                String id = ((C19269WSc) this.A01).A01.getId();
                0qQ.A07(id);
                r3.Dcf(0sn.A00, ((C249703kE) this.A02).getPosition(), id);
                return true;
            default:
                return false;
        }
    }
}
