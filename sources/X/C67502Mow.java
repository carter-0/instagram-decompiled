package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.copresence.repository.persistence.RankedUserDatabase;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mow  reason: case insensitive filesystem */
public final class C67502Mow {
    public 0ng A00;
    public boolean A01;
    public final AnonymousClass2FF A02;
    public final UserSession A03;
    public final C61480nO A04;
    public final RankedUserDatabase A05;
    public final 1Av A06;
    public final HashMap A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public static final void A01(C67502Mow mow) {
        String str;
        List<C69567NoB> A1P = 0sr.A1P(new C68684NSq[]{C67508Mp3.A00, C67509Mp4.A00});
        ArrayList A0r = AnonymousClass7TG.A0r(A1P);
        for (C69567NoB noB : A1P) {
            if (noB instanceof C67508Mp3) {
                str = "CALL_RECIPIENTS";
            } else {
                str = "BFF";
            }
            A0r.add(str);
        }
        UserSession userSession = mow.A03;
        2IS A042 = C41845B3m.A04();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0r);
        A042.A05("views", copyOf);
        17k.A0E(AnonymousClass7TF.A1V(copyOf));
        C239123Fb A0S = JTS.A0S(A042, userSession, C68135N1z.class, "IGCoPresenceRankingModel", false);
        A0S.A08 = "ads_viewer_context_policy";
        1OC A052 = A0S.A05();
        NMI.A00(A052, mow, 1);
        1ES.A03(A052);
    }

    public /* synthetic */ C67502Mow(UserSession userSession) {
        C61480nO A002 = 0nY.A00();
        0qQ.A0B(A002, 3);
        this.A03 = userSession;
        this.A04 = A002;
        C67503Mox mox = RankedUserDatabase.A00;
        Class<RankedUserDatabase> cls = RankedUserDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (mox) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    1VA A0F = JTS.A0F(userSession, mox, cls);
                    1VC.A00(A0F, 1953514958, 848202412, true);
                    A0F.A01();
                    igRoomDatabase = (IgRoomDatabase) A0F.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        this.A05 = (RankedUserDatabase) igRoomDatabase;
        this.A07 = AnonymousClass7TE.A1E();
        this.A02 = AnonymousClass2FF.A0A();
        this.A06 = 1Au.A00(userSession);
        this.A08 = AnonymousClass0eN.A01(C67505Mp0.A00);
        this.A09 = AnonymousClass0eN.A01(C67506Mp1.A00);
        this.A04.ATE(new C67504Moy(this));
    }

    public static final ArrayList A00(C67502Mow mow, List list) {
        String str;
        String str2;
        ImageUrl simpleImageUrl;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C74440Puv puv = (C74440Puv) it.next();
            17i A002 = 17h.A00(mow.A03);
            String BFk = puv.BFk();
            User A022 = A002.A02(BFk);
            if (A022 != null) {
                str = A022.getFullName();
            } else {
                str = null;
            }
            if (A022 != null) {
                str2 = A022.getUsername();
                simpleImageUrl = A022.Bh3();
            } else {
                N49 CCm = puv.CCm();
                str2 = CCm.A01;
                String str3 = CCm.A00;
                if (str3 == null) {
                    str3 = "";
                }
                simpleImageUrl = new SimpleImageUrl(str3);
            }
            if (str2 != null) {
                A1C.add(new C59832Ja7(simpleImageUrl, BFk, str, str2));
            }
        }
        return A1C;
    }
}
