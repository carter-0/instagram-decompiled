package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ngf  reason: case insensitive filesystem */
public final class C69185Ngf extends C47518E6c implements AnonymousClass4DS, CallerContextable {
    public static final CallerContext A06 = CallerContext.A00(C69185Ngf.class);
    public static final String __redex_internal_original_name = "DirectMessagesOptionChooserFragment";
    public PQ2 A00;
    public 1vn A01;
    public String A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final Ot0 A05 = new Ot0(this, 9);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, this.A02);
    }

    public final String getModuleName() {
        return "direct_messages_options_chooser";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        PQ2 pq2 = this.A00;
        if (pq2 != null) {
            C72197OyI oyI = pq2.A07;
            synchronized (oyI) {
                oyI.A08.add(pq2);
            }
            pq2.A02 = this;
            return;
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(com.instagram.common.session.UserSession r9, X.C69185Ngf r10) {
        /*
            X.1vn r7 = r10.A01
            if (r7 == 0) goto L_0x004f
            X.PQ2 r2 = r10.A00
            if (r2 == 0) goto L_0x005c
            r0 = 24
            X.Wxc r3 = new X.Wxc
            r3.<init>(r10, r0)
            r0 = 25
            X.Wxc r1 = new X.Wxc
            r1.<init>(r10, r0)
            r0 = 0
            r6 = r9
            X.0qQ.A0B(r9, r0)
            java.lang.String r5 = r2.A0A
            int r4 = r5.hashCode()
            r0 = -456614348(0xffffffffe4c89e34, float:-2.9605988E22)
            java.lang.String r8 = "IG_MESSAGE_REQUESTS_OTHERS_ON_IG"
            if (r4 == r0) goto L_0x0050
            r0 = 949752738(0x389c13a2, float:7.4423166E-5)
            if (r4 == r0) goto L_0x0053
            r0 = 1767124056(0x69542c58, float:1.6031355E25)
            if (r4 != r0) goto L_0x004f
            java.lang.String r0 = "group_message_setting"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r8 = "IG_MESSAGE_GROUPS"
        L_0x003c:
            r0 = 42
            X.PqS r9 = new X.PqS
            r9.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r3)
            r0 = 43
            X.PqS r10 = new X.PqS
            r10.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1)
            android.content.Context r5 = r2.A05
            X.C49794F7e.A00(r5, r6, r7, r8, r9, r10)
        L_0x004f:
            return
        L_0x0050:
            java.lang.String r0 = "ig_followers"
            goto L_0x0055
        L_0x0053:
            java.lang.String r0 = "others_on_ig"
        L_0x0055:
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x003c
            return
        L_0x005c:
            java.lang.String r0 = "controller"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69185Ngf.A06(com.instagram.common.session.UserSession, X.Ngf):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void A07() {
        2Rw AZK = getScrollingViewProxy().AZK();
        if (AZK != null) {
            AZK.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.O2l] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.OR9] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(565947376);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_TITLE", "");
        AnonymousClass0eM r1 = this.A04;
        C299935wF A002 = C363388je.A00(AnonymousClass7TE.A0l(r1)).A00(A06);
        boolean A032 = C363388je.A03(A002);
        boolean A023 = C363388je.A02(A002);
        Context requireContext = requireContext();
        C72197OyI A003 = C70332O2k.A00(AnonymousClass7TE.A0l(r1), DbX.A0h(r1), new Object());
        ? obj = new Object();
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        String string = requireArguments.getString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ENTRY_POINT");
        0qQ.A0B(A0l, 0);
        C71109Ocn ocn = new C71109Ocn(this, A0l, string);
        16V A0J = DbX.A0l(AnonymousClass0t1.A01, r1).A0J();
        if (A0J == null) {
            A0J = 16V.A08;
        }
        this.A00 = new PQ2(requireContext, requireArguments, ocn, obj, A003, A0J, A032, A023);
        this.A01 = Dba.A0G(r1);
        A06(AnonymousClass7TE.A0l(r1), this);
        DbX.A0R(r1).A01(this.A05, FWR.class);
        AnonymousClass0fD.A09(1899853182, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1368131159);
        super.onResume();
        PQ2 pq2 = this.A00;
        if (pq2 != null) {
            List list = this.A03;
            0qQ.A0B(list, 0);
            if (!pq2.A04) {
                pq2.A04 = true;
                boolean z = pq2.A0B;
                if (z) {
                    list.add(new C46448DfA(2131966271));
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr = pq2.A0E;
                String str2 = "";
                if (directMessageInteropReachabilityOptionsArr != null) {
                    for (DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions : directMessageInteropReachabilityOptionsArr) {
                        String str3 = directMessageInteropReachabilityOptions.A03;
                        Context context = pq2.A05;
                        String string = context.getString(directMessageInteropReachabilityOptions.A01);
                        Integer num = directMessageInteropReachabilityOptions.A02;
                        if (num != null) {
                            str = context.getString(num.intValue());
                        } else {
                            str = str2;
                        }
                        A1C.add(new C70953OTa(str3, string, str));
                    }
                }
                DirectMessageInteropReachabilityOptions A002 = pq2.A01.A00(pq2.A0A);
                pq2.A00 = A002;
                if (A002 != null) {
                    str2 = A002.A03;
                }
                C70962OTj oTj = new C70962OTj(new C71472OlG(pq2, 3), str2, A1C);
                pq2.A03 = oTj;
                list.add(oTj);
                if (z) {
                    list.add(new FGF((CharSequence) pq2.A09));
                }
            }
            setItems(list);
            AnonymousClass0fD.A09(-1057545012, A022);
            return;
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1827875785);
        C69185Ngf.super.onStop();
        PQ2 pq2 = this.A00;
        if (pq2 != null) {
            C72197OyI oyI = pq2.A07;
            synchronized (oyI) {
                oyI.A08.remove(pq2);
            }
            pq2.A02 = null;
            DbX.A0R(this.A04).A02(this.A05, FWR.class);
            AnonymousClass0fD.A09(328008283, A022);
            return;
        }
        0qQ.A0F("controller");
        throw AnonymousClass00P.createAndThrow();
    }
}
