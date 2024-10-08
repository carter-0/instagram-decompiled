package X;

import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Re0  reason: case insensitive filesystem */
public abstract class C9622Re0 {
    public static final void A00(TextView textView, SST sst) {
        QXV qxv;
        ImmutableList A0E;
        String A07;
        if (sst != null) {
            C13883Tj6 tj6 = sst.A01;
            textView.setText(tj6.C1h(AnonymousClass7TE.A0S(textView)));
            SRn.A02(textView, sst.A02);
            C13889TjC tjC = sst.A00;
            if (tjC != null) {
                tjC.EOw(textView);
            }
            if ((tj6 instanceof C12399StP) && (qxv = ((C12399StP) tj6).A00) != null && (A0E = qxv.A0E()) != null) {
                if (!(A0E instanceof Collection) || !A0E.isEmpty()) {
                    Iterator it = A0E.iterator();
                    while (it.hasNext()) {
                        QUR A0E2 = ((QXU) it.next()).A0E();
                        if (A0E2 != null && (A07 = A0E2.A07("url")) != null && A07.length() > 0) {
                            textView.setClickable(true);
                            DbT.A1H(textView);
                            return;
                        }
                    }
                }
            }
        }
    }
}
