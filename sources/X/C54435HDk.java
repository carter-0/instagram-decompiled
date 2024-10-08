package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.genai.magicmod.data.LauncherBasedSuggestedPrompt;
import com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.HDk  reason: case insensitive filesystem */
public final class C54435HDk extends C252733pa {
    public C362088hK A00;
    public final UserSession A01;
    public final MagicModImageGenerationDataSource A02;
    public final C262224Cq A03;
    public final 05G A04;
    public final 05G A05 = 106.A01((Object) null);
    public final 05G A06 = 106.A01(0sn.A00);
    public final AnonymousClass0Ud A07;

    public final void A01(C362088hK r8) {
        long j;
        List<LauncherBasedSuggestedPrompt> list;
        List list2;
        0qQ.A0B(r8, 0);
        UserSession userSession = this.A01;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36319918495899401L)) {
            AnonymousClass7TE.A1Z(new MHN((Object) r8, (Object) this, (AnonymousClass4D7) null, 25), this.A03);
        } else {
            if (r8.ordinal() != 0) {
                j = 36882868446953938L;
            } else {
                j = 36882868447019475L;
            }
            String A042 = 182.A04(r2, userSession, j);
            if (A042.length() == 0) {
                list2 = AnonymousClass62M.A01;
            } else {
                try {
                    list = (List) C250863mB.A03.A00(A042, new AnonymousClass409(C73533PeP.A00));
                } catch (C66601pa unused) {
                    list = 0sn.A00;
                }
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (LauncherBasedSuggestedPrompt launcherBasedSuggestedPrompt : list) {
                    A0r.add(new C61055Jvt((ImageUrl) null, launcherBasedSuggestedPrompt.A01, launcherBasedSuggestedPrompt.A00, false));
                }
                list2 = A0r;
            }
            AnonymousClass62O A032 = AnonymousClass62Q.A03(00k.A0d(0jo.A1G(list2), 7));
            HashSet A1F = AnonymousClass7TE.A1F();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : A032) {
                C61055Jvt jvt = (C61055Jvt) next;
                String str = jvt.A01;
                if (str == null) {
                    str = jvt.A02;
                }
                C51971G9r.A1O(str, next, A1F, A1C);
            }
            this.A06.Epw(A1C);
        }
        this.A04.Epw((Object) null);
        this.A00 = r8;
    }

    public static final void A00(C54435HDk hDk, C59497JLv jLv, String str, String str2) {
        Object value;
        C61081JwJ jwJ;
        05G r5 = hDk.A04;
        do {
            value = r5.getValue();
            jwJ = (C61081JwJ) value;
            if (jwJ != null && 0qQ.A0K(jwJ.A01, str)) {
                Map A0p = C51975G9x.A0p(str2, jLv, (Map) jwJ.A00);
                String str3 = jwJ.A01;
                0qQ.A0B(str3, 0);
                jwJ = new C61081JwJ(str3, A0p, 31);
            }
        } while (!r5.AIY(value, jwJ));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C54435HDk(android.app.Application r6, com.instagram.common.session.UserSession r7) {
        /*
            r5 = this;
            r0 = 1156139851(0x44e94b4b, float:1866.3529)
            X.19S r1 = X.AnonymousClass43D.A00(r0)
            X.8Ao r4 = new X.8Ao
            r4.<init>(r7, r6)
            X.AnonymousClass7TG.A1Q(r7, r1)
            java.lang.String r0 = "MagicMod"
            r5.<init>(r0, r1)
            r5.A01 = r7
            r5.A03 = r1
            X.8ZA r0 = new X.8ZA
            r0.<init>(r7)
            X.8Z1 r3 = X.C51966G9m.A0y(r0)
            java.lang.Class<com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource> r2 = com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource.class
            r1 = 33
            X.Ivn r0 = new X.Ivn
            r0.<init>(r4, r1)
            X.3pa r0 = r3.A00(r2, r0)
            com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource r0 = (com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource) r0
            r5.A02 = r0
            r1 = 0
            X.02z r0 = X.106.A01(r1)
            r5.A05 = r0
            X.0sn r0 = X.0sn.A00
            X.02z r0 = X.106.A01(r0)
            r5.A06 = r0
            X.02z r0 = X.106.A01(r1)
            r5.A04 = r0
            r5.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54435HDk.<init>(android.app.Application, com.instagram.common.session.UserSession):void");
    }
}
