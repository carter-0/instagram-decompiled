package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.Iterator;

/* renamed from: X.Ubn  reason: case insensitive filesystem */
public final class C15388Ubn extends AnonymousClass32G implements AnonymousClass4DR, C227252iu, AnonymousClass4DS, C21048XBp {
    public static final String __redex_internal_original_name = "FanClubContentPreviewPickerFragment";
    public 2dZ A00;
    public C15465UdG A01;
    public AnonymousClass36D A02;
    public C321656uX A03;
    public boolean A04;
    public 2el A05;
    public C14190TrU A06;
    public EmptyStateView A07;
    public final C57414IaK A08;
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new C58176Ing(this, 9));
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;
    public final WZQ A0C;
    public final C229132mt A0D;

    public final void DVy() {
    }

    public final void DW7() {
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        DbW.A1B(r5, 2131961990);
        r5.AA9(new LYE((Object) this, 39), 2131960992);
        r5.ARb(0, false);
    }

    public final String getModuleName() {
        return "fan_club_content_preview_picker_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        ListView listView = this.A04;
        C14190TrU trU = this.A06;
        if (trU == null) {
            str = "autoLoadMoreHelper";
        } else {
            listView.setOnScrollListener(trU);
            this.A07 = C13991Tnr.A0V(this);
            A01(this);
            2el r3 = this.A05;
            if (r3 == null) {
                str = "viewpointManager";
            } else {
                AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
                0S7.A00(this);
                r3.A08(this.A04, A002, new AnonymousClass2eo[0]);
                C60101Jfh jfh = (C60101Jfh) this.A0B.getValue();
                jfh.A01.A00();
                0Aj A0e = AnonymousClass7TE.A0e((0wc) jfh.A04.getValue(), "subscription_exclusive_content_public_preview_picker_impression");
                DbS.A1O(A0e, AnonymousClass000.A00(4350));
                A0e.A9F(AnonymousClass000.A00(4669), DbV.A0q(jfh.A00.A06));
                A0e.Cgf();
                07U r4 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 18), AnonymousClass07a.A00(viewLifecycleOwner));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C15388Ubn ubn) {
        if (ubn.A07 != null) {
            C57414IaK iaK = ubn.A08;
            if (iaK.isLoading()) {
                EmptyStateView emptyStateView = ubn.A07;
                if (emptyStateView != null) {
                    emptyStateView.A0L();
                    return;
                }
            } else {
                boolean CT5 = iaK.CT5();
                EmptyStateView emptyStateView2 = ubn.A07;
                if (CT5) {
                    if (emptyStateView2 != null) {
                        emptyStateView2.A0J();
                        return;
                    }
                } else if (emptyStateView2 != null) {
                    emptyStateView2.A0K();
                    return;
                }
            }
            0qQ.A0F("emptyStateView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A02(C15388Ubn ubn, boolean z, boolean z2) {
        C321656uX r1 = ubn.A03;
        if (r1 == null) {
            0qQ.A0F("feedNetworkSource");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A00((1FR) null, new C46323Dbr(DbU.A0u(ubn.A0A)), z, z2, true, false);
        if (z) {
            AnonymousClass7TF.A1O(((C60101Jfh) ubn.A0B.getValue()).A05, false);
        }
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A0A);
    }

    public final void EKl() {
        if (this.mView != null) {
            0S7.A00(this);
            ListView listView = this.A04;
            0qQ.A07(listView);
            C17118VIo.A00(listView, this);
        }
    }

    public final boolean onBackPressed() {
        if (!this.A04) {
            return false;
        }
        C358248ab A0U = DbW.A0U(this);
        A0U.A09(2131961976);
        A0U.A08(2131961974);
        A0U.A0I(new LV2(this, 17), 2131972513);
        W5U.A01(A0U, this, 20, 2131961975);
        DbT.A1V(A0U);
        return true;
    }

    public C15388Ubn() {
        C58176Ing ing = new C58176Ing(this, 13);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58176Ing(new C58176Ing(this, 10), 11));
        this.A0B = new C227862kA(new C58176Ing(A002, 12), ing, new C58187Inr(15, A002, (Object) null), new 0Yh(C60101Jfh.class));
        this.A08 = new C57414IaK(this, 1);
        this.A0D = new WWL(this, 0);
        this.A0C = new WZQ(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            str = intent.getStringExtra(C273654mx.A00(208));
        } else {
            str = null;
        }
        if (0qQ.A0K(str, C273654mx.A00(209))) {
            C60101Jfh jfh = (C60101Jfh) this.A0B.getValue();
            Iterator it = jfh.A02.A09(AnonymousClass05K.A04).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long j = ((AnonymousClass3Q2) next).A0g;
                    do {
                        Object next2 = it.next();
                        long j2 = ((AnonymousClass3Q2) next2).A0g;
                        if (j < j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
                if (next != null) {
                    AnonymousClass7TE.A1Z(new C66167MGe((Object) jfh, next, (AnonymousClass4D7) null, 49), C318116oQ.A00(jfh));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, X.0S7, X.Ubn, X.0iw, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = 12924087(0xc534b7, float:1.8110503E-38)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r14 = r20
            r0 = r21
            X.C15388Ubn.super.onCreate(r0)
            android.os.Bundle r2 = r14.requireArguments()
            r0 = 2090(0x82a, float:2.929E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.getBoolean(r0)
            r8 = 0
            X.2el r0 = X.C51969G9p.A0k()
            r14.A05 = r0
            android.content.Context r12 = r14.requireContext()
            androidx.fragment.app.FragmentActivity r13 = r14.requireActivity()
            X.0eM r0 = r14.A0A
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.6vO r4 = new X.6vO
            r4.<init>(r2)
            X.IaK r3 = r14.A08
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r0)
            X.32Q r18 = X.AnonymousClass32Q.A00
            X.0eM r2 = r14.A0B
            java.lang.Object r2 = r2.getValue()
            X.Jfh r2 = (X.C60101Jfh) r2
            X.UdG r11 = new X.UdG
            r19 = r3
            r16 = r2
            r17 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r14.A01 = r11
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            r2 = 1
            X.WWR r4 = new X.WWR
            r4.<init>(r14, r2)
            r13 = 0
            X.36D r3 = new X.36D
            r3.<init>(r5, r4, r13, r13)
            r14.A02 = r3
            X.UdG r3 = r14.A01
            if (r3 != 0) goto L_0x0072
            java.lang.String r0 = "adapter"
        L_0x006a:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0072:
            r14.A0V(r3)
            android.content.Context r5 = r14.requireContext()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r4 = r14.requireContext()
            X.0gy r3 = X.AnonymousClass07i.A00(r14)
            X.2lw r7 = new X.2lw
            r7.<init>(r4, r3, r8)
            X.WZQ r9 = r14.A0C
            X.5mA r10 = X.C294265mA.FAN_CLUB_MEDIA_GRID
            r3 = 2
            X.C51973G9u.A0r(r3, r6, r9, r10)
            X.6uX r4 = new X.6uX
            r11 = r8
            r12 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A03 = r4
            int r3 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r4 = 6
            X.2mt r3 = r14.A0D
            X.TrU r0 = new X.TrU
            r0.<init>(r6, r3, r5, r4)
            r14.A06 = r0
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r0 = X.DbU.A0L(r14, r0)
            r14.A00 = r0
            X.36D r0 = r14.A02
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = "mediaUpdateListener"
            goto L_0x006a
        L_0x00bc:
            r0.A01()
            A02(r14, r2, r13)
            r0 = 2082911572(0x7c26b554, float:3.4623962E36)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15388Ubn.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-241995636);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_feed, viewGroup, false);
        AnonymousClass0fD.A09(990482834, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-822859488);
        super.onDestroy();
        AnonymousClass36D r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("mediaUpdateListener");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A02();
        AnonymousClass0fD.A09(-1194804991, A022);
    }
}
