package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hzz  reason: case insensitive filesystem */
public final class C56528Hzz {
    public Dialog A00;
    public DialogInterface.OnDismissListener A01;
    public final Activity A02;
    public final Fragment A03;
    public final UserSession A04;
    public final List A05;

    public C56528Hzz(Activity activity, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, List list) {
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = fragment;
        this.A05 = list;
        this.A01 = onDismissListener;
    }

    public static CharSequence[] A00(C56528Hzz hzz) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C308916We r1 : hzz.A05) {
            if (r1.A08()) {
                if (r1 instanceof AnonymousClass6X3) {
                    A1C.addAll(((AnonymousClass6X3) r1).A0A());
                } else {
                    A1C.add(r1.A03());
                }
            }
        }
        return (CharSequence[]) A1C.toArray(new CharSequence[A1C.size()]);
    }
}
