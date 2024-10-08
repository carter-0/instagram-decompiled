package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.PAl  reason: case insensitive filesystem */
public final class C72554PAl implements AnonymousClass7D2 {
    public final UserSession A00;
    public final AnonymousClass7XR A01;
    public final AnonymousClass7DZ A02;
    public final AnonymousClass0iw A03;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r14, AnonymousClass7FW r15) {
        PBW pbw = (PBW) r14;
        NYR nyr = (NYR) r15;
        AnonymousClass7TF.A1H(pbw, nyr);
        String A002 = nyr.BSG().A00();
        if (A002 != null) {
            ((AnonymousClass7TJ) this.A01).CjC(A002, nyr.CU2());
        }
        IgImageView igImageView = pbw.A03;
        Object tag = igImageView.getTag();
        String A003 = nyr.BSG().A00();
        if (A003 == null || !A003.equals(tag)) {
            igImageView.setTag(nyr.BSG().A00());
            Context context = igImageView.getContext();
            GifUrlImpl gifUrlImpl = nyr.A00;
            String str = nyr.BSG().A01;
            0qQ.A0A(context);
            int floatValue = (int) gifUrlImpl.A03.floatValue();
            0qQ.A0B(context, 0);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
            int A004 = AnonymousClass7PV.A00(context, false);
            if (floatValue > A004) {
                floatValue = A004;
            }
            if (floatValue < dimensionPixelSize) {
                floatValue = dimensionPixelSize;
            }
            int i = (int) (((double) floatValue) * 1.0d);
            String str2 = null;
            if (00p.A0k(gifUrlImpl.A09, "msys://ae-media", false)) {
                AnonymousClass0eM r0 = C71105Ocj.A05;
                C69851NtF.A00(this.A00).A03(new C71882OsQ(context, this, pbw, gifUrlImpl, str, i), gifUrlImpl.A09);
            } else {
                igImageView.setImageDrawable(C70049NwR.A00(context, this.A00, gifUrlImpl, Integer.valueOf(i), str));
            }
            String str3 = nyr.A01;
            if (!(str3 == null || str3.length() == 0)) {
                str2 = DbW.A0h(context, str3, 2131959126);
            }
            igImageView.setContentDescription(str2);
        }
        this.A02.A02(pbw, nyr);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        PBW pbw = new PBW(DbU.A0A(layoutInflater, viewGroup, R.layout.direct_animated_sticker_message_with_big_heart, false));
        this.A02.A00(pbw);
        return pbw;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        PBW pbw = (PBW) r3;
        0qQ.A0B(pbw, 0);
        pbw.A03.setTag((Object) null);
        this.A02.A01(pbw);
    }

    public C72554PAl(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7XR r3, AnonymousClass7DZ r4) {
        this.A00 = userSession;
        this.A02 = r4;
        this.A03 = r1;
        this.A01 = r3;
    }
}
