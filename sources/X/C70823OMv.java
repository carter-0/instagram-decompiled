package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.OMv  reason: case insensitive filesystem */
public final class C70823OMv {
    public Dc2 A00;
    public final AnonymousClass3M8 A01;
    public final C69634NpG A02;
    public final Context A03;
    public final 1xC A04 = 1xC.A01;
    public final 1Xj A05;
    public final C310336ap A06;
    public final UpcomingEvent A07;
    public final Integer A08;

    public C70823OMv(Context context, 1Xj r3, C310336ap r4, AnonymousClass3M8 r5, C69634NpG npG, UpcomingEvent upcomingEvent, Integer num) {
        0qQ.A0B(r4, 3);
        this.A03 = context;
        this.A01 = r5;
        this.A06 = r4;
        this.A07 = upcomingEvent;
        this.A05 = r3;
        this.A02 = npG;
        this.A08 = num;
    }

    public final void A00() {
        C310336ap r2 = this.A06;
        Integer num = this.A08;
        if (num != null) {
            r2.A02 = num.intValue();
            r2.A0R = true;
        }
        DbS.A19(this.A03, r2, 2131963032);
        DbY.A1K(this.A04, r2);
    }

    public final void A01(boolean z) {
        C310356ar r0;
        ImageInfo BGO;
        C310336ap r2 = this.A06;
        Integer num = this.A08;
        if (num != null) {
            r2.A02 = num.intValue();
            r2.A0R = true;
        }
        ImageUrl imageUrl = null;
        if (z) {
            1Xj r3 = this.A05;
            if (r3 != null) {
                if (!r3.CeS()) {
                    ImageUrl A1Q = r3.A1Q();
                    if (A1Q != null) {
                        imageUrl = A1Q;
                    }
                }
            }
            UpcomingEventMedia BPg = this.A07.BPg();
            if (!(BPg == null || (BGO = BPg.BGO()) == null)) {
                imageUrl = 1iI.A03(BGO);
            }
        }
        r2.A09 = imageUrl;
        if (imageUrl == null) {
            r0 = C310356ar.A05;
        } else {
            r0 = C310356ar.SQUARE;
        }
        r2.A0B = r0;
        C69634NpG npG = this.A02;
        if (npG instanceof C69205Nh5) {
            r2.A0L = true;
            C72737PHr.A00(r2, this, 9);
            r2.A0D(C66909Mes.A00(this.A03, ((C69205Nh5) npG).A00).toString());
        } else if (0qQ.A0K(npG, C69206Nh6.A00)) {
            r2.A0L = false;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        Context context = this.A03;
        int i = 2131971953;
        if (z) {
            i = 2131971954;
        }
        r2.A0D = AnonymousClass7TE.A16(context, i);
        Dc2 A002 = r2.A00();
        JTQ.A1F(this.A04, A002);
        this.A00 = A002;
    }
}
