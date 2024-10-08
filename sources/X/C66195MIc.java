package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MIc  reason: case insensitive filesystem */
public final class C66195MIc extends 03J implements 0sP {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66195MIc(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001b;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.JU3> r3 = X.JU3.class
            r1 = 1
            java.lang.String r4 = "showMediaSharedWithCloseFriendsDialog"
            java.lang.String r5 = "showMediaSharedWithCloseFriendsDialog(Lcom/instagram/feed/media/Media;)V"
        L_0x000d:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.Jii> r3 = X.C60286Jii.class
            r1 = 1
            java.lang.String r4 = "onAvatarToggleReceived"
            java.lang.String r5 = "onAvatarToggleReceived(Ljava/util/List;)V"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<X.LDb> r3 = X.LDb.class
            r1 = 1
            java.lang.String r4 = "getItemPosition"
            java.lang.String r5 = "getItemPosition(Lcom/instagram/common/recyclerview/model/RecyclerViewModel;)I"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66195MIc.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                List list = (List) obj;
                C60286Jii jii = (C60286Jii) C51965G9l.A0s(list, this, 0);
                C317876nz r2 = (C317876nz) 00k.A0O(list, 0);
                if (r2 != null) {
                    jii.A03.Epw(new C62096Ka1(r2));
                    break;
                }
                break;
            case 1:
                return Integer.valueOf(((LDb) C51969G9p.A0t(obj, this)).A02.indexOf(obj));
            default:
                1Xj r12 = (1Xj) obj;
                JU3 ju3 = (JU3) C51969G9p.A0t(r12, this);
                FragmentActivity fragmentActivity = ju3.A00;
                UserSession userSession = ju3.A02;
                C2355930l r0 = new C2355930l(fragmentActivity, userSession);
                C63964LFp lFp = new C63964LFp(fragmentActivity, r0, userSession);
                C64556Ldx ldx = new C64556Ldx(userSession, r12);
                C64561Le2 le2 = new C64561Le2(r0, ju3);
                lFp.A02((DialogInterface.OnDismissListener) null, ju3.A01, C62574Ki7.CLIPS_VIEWER, ldx, le2, ju3.A03);
                break;
        }
        return C60340gF.A00;
    }
}
