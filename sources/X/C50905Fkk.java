package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Fkk  reason: case insensitive filesystem */
public final class C50905Fkk implements G7K {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ 28D A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ C273434mZ A05;
    public final /* synthetic */ G6K A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    public final void Dje(List list) {
        C11211SFl A052;
        1OC A032;
        List list2 = list;
        0qQ.A0B(list2, 0);
        Context context = this.A00;
        UserSession userSession = this.A03;
        String str = this.A0A;
        1Xj r8 = this.A04;
        boolean z = this.A0B;
        String str2 = this.A08;
        C273434mZ r7 = this.A05;
        Fragment fragment = this.A01;
        String str3 = this.A07;
        String str4 = this.A09;
        G6K g6k = this.A06;
        boolean A1a = AnonymousClass7TE.A1a(list2.get(0));
        AnonymousClass8HT A002 = AnonymousClass8HS.A00(userSession, (C357638Yz) null);
        if (C49103EpS.A00(fragment)) {
            A002.A02("activity_destroyed-start_share_story");
            AnonymousClass9PJ.A00(userSession).A08("no fragment");
            return;
        }
        AnonymousClass6ST Aww = g6k.Aww(fragment.requireActivity());
        0sP g2p = new C51806G2p(context, fragment, userSession, r7, Aww, str3, str);
        if (str2 == null) {
            if (r8 == null) {
                if (str4 != null) {
                    A032 = 1OP.A00(userSession, str4);
                    A032.A00 = new ECH(context, fragment, userSession, A002, Aww, str, g2p, A1a);
                } else {
                    return;
                }
            }
            A052 = C59730JVo.A05(context, r8, str, false, A1a);
            A032 = C59730JVo.A03(context, userSession, A052);
            A032.A00 = new EHT(context, fragment, A002, Aww, g2p);
        } else {
            if (r8 == null) {
                String str5 = str2;
                A052 = new C11211SFl(str5, str, z, false, !A1a);
                A032 = C59730JVo.A03(context, userSession, A052);
                A032.A00 = new EHT(context, fragment, A002, Aww, g2p);
            }
            A052 = C59730JVo.A05(context, r8, str, false, A1a);
            A032 = C59730JVo.A03(context, userSession, A052);
            A032.A00 = new EHT(context, fragment, A002, Aww, g2p);
        }
        1ES.A03(A032);
    }

    public final void onCancel() {
        throw AnonymousClass00P.createAndThrow();
    }

    public C50905Fkk(Context context, Fragment fragment, 28D r3, UserSession userSession, 1Xj r5, C273434mZ r6, G6K g6k, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = context;
        this.A03 = userSession;
        this.A0A = str;
        this.A04 = r5;
        this.A0B = z;
        this.A08 = str2;
        this.A05 = r6;
        this.A01 = fragment;
        this.A07 = str3;
        this.A09 = str4;
        this.A06 = g6k;
        this.A02 = r3;
    }
}
