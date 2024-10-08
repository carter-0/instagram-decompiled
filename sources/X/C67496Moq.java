package X;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.Map;

/* renamed from: X.Moq  reason: case insensitive filesystem */
public final class C67496Moq {
    public C67569Mq3 A00;
    public AnonymousClass7JI A01;
    public Integer A02 = AnonymousClass05K.A0C;
    public String A03 = "";
    public Map A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final C69670Nps A07;
    public final C67495Mop A08;
    public final AnonymousClass7L0 A09;
    public final C67498Mos A0A;
    public final C333537Zi A0B;
    public final C67499Mot A0C;
    public final Map A0D;
    public final AnonymousClass0iw A0E;

    public static final void A00(C67496Moq moq) {
        String str;
        Integer num;
        C331157Pu A002 = C72959PQr.A00(DbS.A0W(moq.A06), moq, 16);
        C68446NIj nIj = new C68446NIj();
        C67569Mq3 mq3 = moq.A00;
        if (mq3 == null || (str = mq3.A02) == null) {
            str = moq.A03;
        }
        if (mq3 != null) {
            num = mq3.A00;
        } else {
            num = null;
        }
        AnonymousClass7L0 r3 = moq.A09;
        OE5 oe5 = new OE5(moq, A002, num);
        Map map = moq.A04;
        0qQ.A0B(str, 1);
        nIj.A04 = r3;
        nIj.A07 = str;
        nIj.A05 = oe5;
        nIj.A00 = map.size();
        nIj.A08 = map;
        moq.A00 = null;
        moq.A02 = AnonymousClass05K.A0C;
        A002.A02(moq.A05, nIj);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.Nps, java.lang.Object] */
    public C67496Moq(FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession, C67495Mop mop) {
        this.A06 = userSession;
        this.A05 = fragmentActivity;
        this.A08 = mop;
        this.A0E = r6;
        AnonymousClass9HD r1 = AnonymousClass9HC.A1b;
        Parcelable.Creator creator = Capabilities.CREATOR;
        this.A09 = C250563lf.A06(fragmentActivity, C66581MXm.A0X(userSession, r1, AnonymousClass7TE.A1C())).A07;
        this.A04 = AnonymousClass7TE.A1E();
        this.A0D = AnonymousClass7TE.A1E();
        this.A0B = C333527Zh.A00(userSession);
        this.A0C = C67497Mor.A00(userSession);
        this.A0A = new C67498Mos(r6, userSession);
        String A0b = AnonymousClass7TF.A0b();
        ? obj = new Object();
        obj.A01 = "bulk_reply";
        obj.A02 = A0b;
        obj.A00 = null;
        this.A07 = obj;
    }
}
