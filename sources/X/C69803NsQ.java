package X;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;

/* renamed from: X.NsQ  reason: case insensitive filesystem */
public abstract class C69803NsQ {
    public static final Object A00(C307896Rx r10) {
        UserSession A0B = C308206Td.A0B(r10);
        FragmentActivity A04 = C308206Td.A04(r10);
        OWB owb = new OWB();
        owb.A08 = "636812293063672";
        owb.A09 = "306244556460128";
        owb.A0I = A0B.A06;
        BugReport A01 = owb.A01();
        String A16 = AnonymousClass7TE.A16(A04, 2131962385);
        OLY oly = new OLY(A04);
        oly.A02 = A16;
        oly.A00 = AnonymousClass7TE.A16(A04, 2131962386);
        oly.A01 = "";
        oly.A04 = true;
        new NMP(A04, (Bitmap) null, oly.A00(), (C74547Pwg) null, A01, A0B).A02(new Void[0]);
        return null;
    }
}
