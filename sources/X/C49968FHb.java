package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.user.model.User;

/* renamed from: X.FHb  reason: case insensitive filesystem */
public final class C49968FHb implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public C49968FHb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C358248ab r1, Object obj, int i) {
        r1.A0B(new C49968FHb(obj, i));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        0Aj r6;
        switch (this.A00) {
            case 0:
                C50277FWi.A00(((FGL) this.A01).A02);
                return;
            case 1:
                ((C51902G6w) this.A01).onCancel();
                return;
            case 2:
                Runnable runnable = (Runnable) this.A01;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((C51928G7w) this.A01).onCancel();
                return;
            case 4:
                if (dialogInterface != null) {
                    ((DialogInterface.OnClickListener) this.A01).onClick(dialogInterface, 0);
                    return;
                }
                return;
            case 5:
                ED2 ed2 = (ED2) this.A01;
                User A0j = DbT.A0j(ed2.A02);
                Integer num = AnonymousClass05K.A01;
                A0j.A0q(num);
                C48251EbW ebW = ed2.A00;
                if (ebW != null && (ebW instanceof C47934ENl)) {
                    0qQ.A0B(num, 0);
                    ESI.A0A(((C47934ENl) ebW).A00, false);
                    return;
                }
                return;
            case 6:
                C47490E4u e4u = ((C49715F3a) this.A01).A00;
                0wc A02 = AnonymousClass0kN.A02(e4u.A02);
                long currentTimeMillis = System.currentTimeMillis();
                double A002 = DbS.A00();
                r6 = AnonymousClass7TE.A0e(A02, "set_profile_photo_dialog_canceled");
                DbW.A14(r6, currentTimeMillis);
                DbY.A1D(r6, (double) currentTimeMillis, A002);
                DbW.A12(r6, A002);
                DbZ.A1J(r6, "profile_photo");
                FH8.A0E(r6, "module", "register_flow_add_profile_photo");
                r6.A7p("is_standalone", Boolean.valueOf(e4u.A09));
                FH8.A0B(r6, e4u.A02);
                FH8.A0A(r6, e4u.A02);
                break;
            case 7:
                r6 = AnonymousClass7TE.A0e(((ESI) this.A01).A03, "remove_self_followers_dialog_dismissed");
                break;
            case 8:
                ((C49673F1f) this.A01).A00(AnonymousClass05K.A0N);
                return;
            case 9:
                Fragment fragment = (Fragment) ((C47696EDf) this.A01).A01;
                0hq r1 = fragment.mFragmentManager;
                if (r1 == null || r1.A0M() <= 0 || r1.A0G) {
                    DbX.A1J(fragment);
                    return;
                } else {
                    r1.A0c();
                    return;
                }
            case 10:
                ((C51019FnB) this.A01).A00.onBackPressed();
                return;
            default:
                ((G7R) this.A01).onCancel();
                return;
        }
        r6.Cgf();
    }
}
