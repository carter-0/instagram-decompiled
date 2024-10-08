package X;

import android.os.Parcelable;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.List;

public final class PFS implements AnonymousClass7JG {
    public final /* synthetic */ C71126OdL A00;
    public final /* synthetic */ C68770NWf A01;

    public final void Dzm(Exception exc) {
    }

    public final /* synthetic */ void Dzp() {
    }

    public final /* synthetic */ void Dzq() {
    }

    public PFS(C71126OdL odL, C68770NWf nWf) {
        this.A00 = odL;
        this.A01 = nWf;
    }

    public final void Dzl(int i) {
        C3018660j.A01(this.A00.A0Q).A0B(C69506Nmo.A0R);
    }

    public final void Dzn(boolean z, int i) {
        C71126OdL odL = this.A00;
        if (odL.A0H && !AnonymousClass7TF.A1Z(odL.A0b)) {
            AnonymousClass7TF.A16(odL.A0D);
        }
    }

    public final void Dzo(boolean z) {
        C71126OdL odL = this.A00;
        C234502xy r1 = odL.A0X;
        if (r1 != null && r1.isPlaying()) {
            r1.pause();
        }
        if (odL.A0H) {
            AnonymousClass7TH.A0R(odL.A0D);
        }
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [X.N2G, java.lang.Object] */
    public final void EN6(C63822L8d l8d, String str) {
        Boolean bool;
        String str2;
        String str3;
        C71126OdL odL = this.A00;
        17i r1 = odL.A0Y;
        C68770NWf nWf = this.A01;
        User A02 = r1.A02(nWf.A08);
        2Dm r12 = odL.A0W;
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        0qQ.A0A(A02);
        List A0n = DbW.A0n(A02);
        0qQ.A07(A0n);
        ExtendedImageUrl extendedImageUrl = null;
        DirectThreadKey BJy = r12.BYg((CreatorBroadcastThreadInfo) null, (String) null, (String) null, A0n).BJz();
        C333537Zi r2 = odL.A0V;
        long j = odL.A00;
        String str4 = nWf.A09;
        String str5 = nWf.A0B;
        ImageUrl imageUrl = nWf.A04;
        if (imageUrl != null) {
            extendedImageUrl = new ExtendedImageUrl(imageUrl);
        }
        String str6 = nWf.A0E;
        C51972G9s.A1D(str4, str5);
        DirectThreadKey A03 = C66647MaG.A03(BJy);
        UserSession userSession = r2.A03;
        C70621ODs A002 = OQO.A00(userSession, A03);
        if (A002 != null) {
            bool = Boolean.valueOf(C70054NwW.A00(A002));
        } else {
            bool = null;
        }
        AnonymousClass797 A022 = AnonymousClass796.A02(userSession, BJy, bool, AnonymousClass05K.A1F, false, false, false);
        boolean A003 = A022.A00();
        String A032 = C333537Zi.A03(r2, A003);
        C66665MaY A023 = C66669Mac.A02(userSession, A002, C66151k7.class);
        String str7 = A023.A03;
        C333537Zi.A08(r2, A03, str7, A032, (String) null, 5, 1, false, A003);
        Long A012 = OQO.A01(userSession, BJy);
        long A0H = AnonymousClass7TG.A0H();
        C2609947v A004 = LTU.A00(r2.A02, userSession, A022, BJy, l8d, Integer.valueOf(str7.hashCode()), A032);
        0qQ.A0B(A03, 2);
        1bp r29 = new 1bp(A023, A03, A012, A0H);
        r29.A00 = new C2609947v();
        String valueOf = String.valueOf(j);
        List A033 = A004.A03();
        if (A033 != null) {
            str2 = A033.toString();
        } else {
            str2 = null;
        }
        Integer A013 = A004.A01();
        if (A013 != null) {
            str3 = A013.toString();
        } else {
            str3 = null;
        }
        0qQ.A0B(valueOf, 1);
        ? obj = new Object();
        obj.A03 = valueOf;
        obj.A06 = str4;
        obj.A05 = str5;
        obj.A00 = extendedImageUrl;
        obj.A01 = null;
        obj.A07 = str2;
        obj.A04 = str3;
        obj.A02 = "voice_media";
        r29.A01 = obj;
        r29.A00 = A004;
        r29.A02 = extendedImageUrl;
        r29.A03 = str6;
        C333537Zi.A0B(r2, A032, r29.A06(), A03.A00, 5, false, A003);
        C66580MXl.A1P(userSession, r29);
        C3018660j.A01(odL.A0Q).A0B(C69506Nmo.A0V);
        C71126OdL.A01((View) null, odL, nWf);
    }
}
