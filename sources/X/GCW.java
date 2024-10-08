package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

public final class GCW implements AnonymousClass324 {
    public final FragmentActivity A00;
    public final AnonymousClass4DH A01;
    public final 1Ng A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C249763kK A05;
    public final C55948HqC A06;
    public final SearchContext A07;
    public final String A08;
    public final String A09;

    public final C59612JQg CBn() {
        return new IXY(this, 2);
    }

    public final void DgX(1Xj r16, AnonymousClass3W1 r17, C59612JQg jQg, int i) {
        List B02;
        EffectPreviewIntf effectPreviewIntf;
        1Xj r13 = r16;
        0qQ.A0B(r13, 0);
        AnonymousClass3W1 r12 = r17;
        C59612JQg jQg2 = jQg;
        AnonymousClass7TG.A1P(r12, jQg2);
        UserSession userSession = this.A03;
        int i2 = i;
        if (I56.A03(userSession)) {
            A00(r13, r12, i2);
            return;
        }
        int i3 = r12.A03;
        r12.A08();
        if (!SaveApiUtil.A09(userSession, r13)) {
            A01(r13, this, i3, i2);
            IVY ivy = new IVY(i2, 2, r12, r13, this);
            FragmentActivity fragmentActivity = this.A00;
            ImageUrl A1Q = r13.A1Q();
            int A002 = Dc5.A00();
            C310336ap A0a = DbS.A0a();
            DbT.A1D(fragmentActivity.getResources(), A0a, 2131972581);
            A0a.A0L = true;
            A0a.A0A = ivy;
            A0a.A0G = AnonymousClass7TF.A0d(fragmentActivity.getResources(), 2131972535);
            A0a.A01 = A002;
            if (A1Q != null) {
                A0a.A09 = A1Q;
                A0a.A03();
            }
            Dbb.A1Q(A0a);
            JU5 A003 = C63289KuY.A00(userSession);
            C51971G9r.A1P(A003, A003.A0N, 8);
            GLN A004 = GLB.A00(MusicPageTabType.CLIPS, userSession);
            C67231sQ A0n = C51966G9m.A0n(r13);
            AnonymousClass4DH r5 = this.A01;
            A004.A01(A0n, userSession, "save_reels", r5.getModuleName());
            CreativeConfigIntf A0r = C51966G9m.A0r(r13);
            if (A0r != null && (B02 = A0r.B02()) != null && !B02.isEmpty() && (effectPreviewIntf = (EffectPreviewIntf) 00k.A0O(B02, 0)) != null) {
                GGQ.A00(userSession).A00(userSession, "save_reels", effectPreviewIntf.getId(), r5.getModuleName());
                return;
            }
            return;
        }
        int i4 = r12.A03;
        if (r13.A3i().isEmpty()) {
            A01(r13, this, i4, i2);
        } else {
            new C55969Hqa(this.A00, userSession, jQg2).A00((DialogInterface.OnDismissListener) null, r13, r12, i4, i2);
        }
    }

    public final void DgZ(1Xj r11, AnonymousClass3W1 r12, int i) {
        1Xj r2 = r11;
        AnonymousClass3W1 r4 = r12;
        AnonymousClass7TG.A1N(r11, r12);
        UserSession userSession = this.A03;
        int i2 = i;
        if (I56.A03(userSession)) {
            A00(r11, r12, i);
        } else if (r11.A0C.BAG() == null) {
            I56.A00(this.A00, userSession, r2, this.A04, r4, this.A05, (String) null, "long_press", i2, SaveApiUtil.A09(userSession, r11));
        }
    }

    private final void A00(1Xj r12, AnonymousClass3W1 r13, int i) {
        FragmentActivity fragmentActivity = this.A00;
        0nA.A0J(fragmentActivity);
        UserSession userSession = this.A03;
        1Xj r3 = r12;
        boolean A092 = SaveApiUtil.A09(userSession, r12);
        AnonymousClass3W1 r5 = r13;
        int i2 = i;
        if (!SaveApiUtil.A09(userSession, r12)) {
            A01(r12, this, r13.A03, i);
        }
        I56.A00(fragmentActivity, userSession, r3, this.A04, r5, this.A05, (String) null, "single_tap", i2, A092);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.Hj6, java.lang.Object] */
    public static final void A01(1Xj r16, GCW gcw, int i, int i2) {
        C243373Ym r9;
        GCW gcw2 = gcw;
        UserSession userSession = gcw2.A03;
        C340057kd A002 = C340057kd.A00(userSession);
        1Xj r6 = r16;
        AnonymousClass4DU r7 = gcw2.A04;
        A002.A01(C297085r9.A02(r7, r6, AnonymousClass05K.A01, AnonymousClass000.A00(3916), !SaveApiUtil.A09(userSession, r6)));
        if (SaveApiUtil.A09(userSession, r6)) {
            r9 = C243373Ym.NOT_SAVED;
        } else {
            r9 = C243373Ym.SAVED;
        }
        FragmentActivity fragmentActivity = gcw2.A00;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        SaveApiUtil.A04(fragmentActivity, fragmentActivity2, userSession, r6, r7, new IX9(1, gcw2, r9), r9, gcw2.A07, gcw2.A05, (String) null, gcw2.A08, gcw2.A09, i2, i, -1);
        1Ng r1 = gcw2.A02;
        ? obj = new Object();
        obj.A00 = r6;
        r1.A00(C55120HcT.A00(obj));
    }

    public GCW(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4, SearchContext searchContext, C249763kK r6, C55948HqC hqC, String str, String str2) {
        C51974G9v.A1M(hqC, r6, r4);
        0qQ.A0B(userSession, 5);
        this.A01 = r2;
        this.A06 = hqC;
        this.A05 = r6;
        this.A04 = r4;
        this.A03 = userSession;
        this.A07 = searchContext;
        this.A08 = str;
        this.A09 = str2;
        this.A00 = r2.requireActivity();
        this.A02 = AnonymousClass1Nd.A00(userSession);
    }
}
