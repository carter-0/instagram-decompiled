package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class I8C implements DialogInterface.OnClickListener {
    public final /* synthetic */ C56528Hzz A00;

    public I8C(C56528Hzz hzz) {
        this.A00 = hzz;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        User user;
        dialogInterface.dismiss();
        C56528Hzz hzz = this.A00;
        CharSequence charSequence = C56528Hzz.A00(hzz)[i];
        for (C308916We r5 : hzz.A05) {
            boolean z = r5 instanceof AnonymousClass6X3;
            boolean A08 = r5.A08();
            if (z) {
                if (A08) {
                    AnonymousClass6X3 r52 = (AnonymousClass6X3) r5;
                    if (r52.A0A().contains(charSequence)) {
                        String charSequence2 = charSequence.toString();
                        0qQ.A0B(charSequence2, 0);
                        1Xj r0 = r52.A00.A0b;
                        if (r0 != null) {
                            r52.A07(r0);
                            AnonymousClass6X2 r53 = (AnonymousClass6X2) r52;
                            List A0Q = 00l.A0Q(charSequence2, new char[]{' '}, 0);
                            if (!(A0Q instanceof Collection) || !A0Q.isEmpty()) {
                                Iterator it = A0Q.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    user = r53.A06;
                                    if (0qQ.A0K(next, C51971G9r.A0t(user))) {
                                        break;
                                    }
                                }
                            }
                            user = r53.A05;
                            if (user != null) {
                                r53.A04.DH8(user);
                            }
                        }
                    }
                }
            } else if (A08 && r5.A03().equals(charSequence)) {
                r5.A06();
                return;
            }
        }
    }
}
