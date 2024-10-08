package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.NKn  reason: case insensitive filesystem */
public abstract class C68494NKn extends MYR implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ChannelDiscoveryFragment";
    public C290645fe A00;
    public String A01;
    public final C229122ms A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final 1wn A06;

    public final void A0E(View view, String str, String str2, int i) {
        String str3 = str;
        DirectThreadKey directThreadKey = new DirectThreadKey(str3, (List) null);
        List A0z = C66582MXn.A0z(40);
        C67484Moe.A00(AnonymousClass7TE.A0Y(), view, new C67058MhZ(i, str3, (String) null, (List) null), (C67484Moe) this.A03.getValue(), (C74396PuC) null, AnonymousClass43A.A00, (AnonymousClass2Ep) null, (DirectShareTarget) null, directThreadKey, str2, (String) null, A0z, false, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0Ud A09 = A0D().A09();
        DbZ.A1C(this, new C73566Pfn(this, (AnonymousClass4D7) null, 5), C48263Ebi.A00(07U.A05, getViewLifecycleOwner().getLifecycle(), A09));
        A0D().A0D();
        JTQ.A0y(getRecyclerView().A0D, getRecyclerView(), new C72693PFx(this, 1), C3251771i.A0A);
        UserSession A0l = AnonymousClass7TE.A0l(this.A05);
        NQT nqt = new NQT(this, 3);
        0qQ.A0B(A0l, 0);
        1ES.A05(C290635fd.A01(A0l, nqt), 1967622104, 2, false, false);
    }

    public final UserSession A0C() {
        return AnonymousClass7TE.A0l(this.A05);
    }

    public final ChannelDiscoveryViewModel A0D() {
        AnonymousClass0eM r0;
        if (this instanceof NVN) {
            r0 = ((NVN) this).A01;
        } else {
            r0 = ((NVM) this).A00;
        }
        return (ChannelDiscoveryViewModel) r0.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0068, code lost:
        A0D().A0B(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            java.lang.String r1 = "s"
            java.lang.String r0 = "inbox_channel_invitation"
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "st"
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r1)
            java.lang.String r1 = "scid"
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r8)
            android.util.Pair[] r0 = new android.util.Pair[]{r3, r2, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            X.0qQ.A07(r0)
            java.lang.String r3 = X.OXO.A01(r7, r0)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r4.getModuleName()
            X.FH7.A0B(r2, r1, r3, r0)
            X.5fe r1 = r4.A00
            java.lang.String r2 = "banyanClient"
            if (r1 == 0) goto L_0x0070
            java.lang.String r0 = "direct_ibc_inbox_invitations"
            X.5g5 r0 = r1.A01(r0)
            java.util.List r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0068
            com.instagram.model.direct.DirectShareTarget r0 = X.DbT.A0f(r1)
            java.lang.String r0 = r0.A08()
            boolean r0 = X.2Ob.A00(r0, r6)
            if (r0 == 0) goto L_0x004d
            X.5fe r0 = r4.A00
            if (r0 == 0) goto L_0x0070
            r0.A07(r6)
        L_0x0068:
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r0 = r4.A0D()
            r0.A0B(r6)
            return
        L_0x0070:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68494NKn.A0F(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void configureActionBar(2da r7) {
        if (this instanceof NVN) {
            NVN nvn = (NVN) this;
            0qQ.A0B(r7, 0);
            r7.Eom(2131959341);
            r7.Eu4(true);
            if (nvn.A00.getValue() == C69263NiP.ACTIVITY_FEED) {
                AnonymousClass0eM r1 = nvn.A05;
                if (AnonymousClass7K4.A00(AnonymousClass7TE.A0l(r1))) {
                    if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r1), 36319407393611066L)) {
                        AnonymousClass3JR A0K = DbS.A0K();
                        A0K.A0C = 2131959306;
                        A0K.A0P = true;
                        A0K.A02 = JTP.A02(nvn.getContext(), nvn.requireContext(), R.attr.igds_color_creation_tools_blue);
                        DbX.A19(new FPI((Object) nvn, 43), A0K, r7);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0B(r7, 0);
        DbW.A1B(r7, 2131959455);
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new C74184PqQ(this, 24));
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A05);
    }

    public C68494NKn() {
        0eO r1 = 0eO.A02;
        this.A04 = Dba.A0g(this, r1, 46);
        this.A03 = Dba.A0g(this, r1, 45);
        this.A06 = C71932OtG.A00(this, 11);
        this.A02 = new PRL(this, 3);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 107 && intent != null) {
            String stringExtra = intent.getStringExtra("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_RESULT_JOINED_OR_DECLINED_CHANNEL_THREAD_ID");
            if (stringExtra != null) {
                A0D().A0E(stringExtra);
                return;
            }
            String stringExtra2 = intent.getStringExtra("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_RESULT_READ_CHANNEL_THREAD_ID");
            if (stringExtra2 != null) {
                A0D().A0B(stringExtra2);
            }
        }
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-400354571);
        super.onDestroy();
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A05)).A02(this.A06, C71894Osc.class);
        AnonymousClass0fD.A09(230753753, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(632209363);
        super.onResume();
        AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A05)).A01(this.A06, C71894Osc.class);
        AnonymousClass0fD.A09(1466695201, A022);
    }
}
