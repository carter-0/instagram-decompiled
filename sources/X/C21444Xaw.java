package X;

import android.content.Context;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Xaw  reason: case insensitive filesystem */
public final class C21444Xaw {
    public final Context A00;
    public final C22554YAd A01;
    public final 02m A02;
    public final UserSession A03;
    public final boolean A04;
    public final boolean A05;

    public C21444Xaw(Context context, UserSession userSession) {
        C22025XtK xhf;
        AQ9 aq9;
        XHH xhh;
        AnonymousClass84S A002;
        Context context2 = context;
        0qQ.A0B(context2, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        this.A00 = context2;
        this.A03 = userSession2;
        0Tu r2 = 0Tu.A05;
        this.A04 = 182.A06(r2, userSession2, 36329156966891354L);
        boolean A06 = 182.A06(r2, userSession2, 36329156967022428L);
        this.A05 = A06;
        if (this.A04 || A06) {
            UserSession userSession3 = this.A03;
            if (A06) {
                xhf = new XHI(new AnonymousClass8CO(userSession3, AnonymousClass7TE.A1I(new AnonymousClass8CI("UTwoNet", "PYTORCH_MODEL", 0sn.A00, 1020))));
                aq9 = new AQ9(this, 1);
            } else {
                xhf = new XHF(new AnonymousClass8CO(userSession3, AnonymousClass7TE.A1I(C352658Eh.A00(AnonymousClass8Eg.U_TWO_NET))));
                aq9 = new AQ9(this, 2);
            }
            xhf.A00 = aq9;
            xhh = (C22554YAd) xhf;
        } else if (182.A06(r2, userSession2, 36330681680282333L)) {
            XHH xhh2 = new XHH(new AnonymousClass8CO(this.A03, 0sr.A1P(new AnonymousClass8CI[]{C352658Eh.A00(AnonymousClass8Eg.PYTORCH_U_TWO_NET), C352658Eh.A00(AnonymousClass8Eg.ET_SEGMENT_ANYTHING_MODEL)})));
            xhh2.A00 = new AQ9(this, 0);
            xhh = xhh2;
        } else {
            UserSession userSession4 = this.A03;
            if (182.A06(r2, userSession4, 36322431048165561L)) {
                A002 = null;
            } else {
                A002 = AnonymousClass84S.A00(this.A00, userSession4);
            }
            List A1P = 0sr.A1P(new VersionedCapability[]{VersionedCapability.Saliency, VersionedCapability.SegmentAnything});
            List list = 0sn.A00;
            xhh = new XHG(new AnonymousClass8CM(A002, userSession4, A1P, 0sr.A1P(new AnonymousClass8CI[]{new AnonymousClass8CI("Saliency", "PYTORCH_MODEL", list, 2020), new AnonymousClass8CI("SegmentAnything", "PYTORCH_MODEL", list, 10020)})));
        }
        this.A01 = xhh;
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A02 = r0;
        xhh.CgM();
        xhh.EfZ(new XZH(this));
    }
}
