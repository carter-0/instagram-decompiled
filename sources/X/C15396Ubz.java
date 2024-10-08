package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.Ubz  reason: case insensitive filesystem */
public final class C15396Ubz extends AnonymousClass32G implements C229122ms, AnonymousClass4DR, C229132mt, C227252iu, AnonymousClass4DS, C21048XBp {
    public static final String __redex_internal_original_name = "ArchiveFeedFragment";
    public C15464UdF A00;
    public AnonymousClass36D A01;
    public C324356z9 A02;
    public 2el A03;
    public C14190TrU A04;
    public EmptyStateView A05;
    public final AnonymousClass32Q A06 = AnonymousClass32Q.A00;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void CgO() {
        A02(false);
    }

    public final void DVy() {
    }

    public final void DW7() {
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131963334);
    }

    public final String getModuleName() {
        return "archive_feed";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        ListView listView = this.A04;
        C14190TrU trU = this.A04;
        if (trU == null) {
            str = "autoLoadMoreHelper";
        } else {
            listView.setOnScrollListener(trU);
            this.A05 = C13991Tnr.A0V(this);
            A01(this);
            2el r3 = this.A03;
            if (r3 == null) {
                str = "viewpointManager";
            } else {
                AnonymousClass3DZ A002 = AnonymousClass3DZ.A00(this);
                0S7.A00(this);
                r3.A08(this.A04, A002, new AnonymousClass2eo[0]);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C15396Ubz ubz) {
        if (ubz.A05 != null) {
            if (ubz.isLoading()) {
                EmptyStateView emptyStateView = ubz.A05;
                if (emptyStateView != null) {
                    emptyStateView.A0L();
                    return;
                }
            } else {
                boolean CT5 = ubz.CT5();
                EmptyStateView emptyStateView2 = ubz.A05;
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

    private final void A02(boolean z) {
        C324356z9 r3 = this.A02;
        if (r3 != null) {
            1NY A0b = AnonymousClass7TG.A0b(DbT.A0X(this.A07));
            A0b.A0A("feed/only_me_feed/");
            A0b.A0Q(CGQ.class, D0M.class);
            C324356z9 r0 = this.A02;
            if (r0 != null) {
                C3724090s.A06(A0b, r0.A03.A07);
                r3.A03(A0b.A0M(), new C15961Uld(0, this, z));
                return;
            }
        }
        0qQ.A0F("feedNetworkSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A07);
    }

    public final void ACw() {
        C324356z9 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("feedNetworkSource");
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A06()) {
            A02(false);
        }
    }

    public final boolean CJz() {
        C15464UdF udF = this.A00;
        if (udF != null) {
            return AnonymousClass7TE.A1b(udF.A02.A01);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        C324356z9 r0 = this.A02;
        if (r0 != null) {
            return r0.A05();
        }
        0qQ.A0F("feedNetworkSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        C324356z9 r0 = this.A02;
        if (r0 != null) {
            return C51973G9u.A1Y(r0);
        }
        0qQ.A0F("feedNetworkSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EKl() {
        if (this.mView != null) {
            0S7.A00(this);
            ListView listView = this.A04;
            0qQ.A07(listView);
            C17118VIo.A00(listView, this);
        }
    }

    public final boolean isLoading() {
        C324356z9 r0 = this.A02;
        if (r0 != null) {
            return C51973G9u.A1X(r0);
        }
        0qQ.A0F("feedNetworkSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CWV() {
        if (!isLoading() || CJz()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, X.0S7, androidx.fragment.app.Fragment, X.Ubz, java.lang.Object, X.2mt] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1332471514);
        C15396Ubz.super.onCreate(bundle);
        this.A03 = C51969G9p.A0k();
        Context requireContext = requireContext();
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r2 = this.A07;
        C15965Ulh ulh = new C15965Ulh(AnonymousClass7TE.A0l(r2));
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        AnonymousClass32Q r12 = AnonymousClass32Q.A00;
        2el r10 = this.A03;
        if (r10 == null) {
            str = "viewpointManager";
        } else {
            this.A00 = new C15464UdF(requireContext, requireActivity, this, A0l, r10, ulh, r12, this);
            this.A01 = new AnonymousClass36D(AnonymousClass7TE.A0l(r2), new WWR(this, 0), false, false);
            AnonymousClass34R r5 = new AnonymousClass34R(AnonymousClass7TE.A0l(r2), (AnonymousClass34Q) null, "archive_feed");
            AnonymousClass34L r4 = new AnonymousClass34L(AnonymousClass7TE.A0l(r2), "archive_feed");
            1wY A002 = 1wY.A00(AnonymousClass7TE.A0l(r2));
            0qQ.A08(1wY.A0F);
            A002.A07(r4, r5, "archive_feed");
            C15464UdF udF = this.A00;
            if (udF == null) {
                str = "adapter";
            } else {
                A0V(udF);
                this.A02 = C51970G9q.A0g(requireContext(), this, AnonymousClass7TE.A0l(r2));
                int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                this.A04 = new C14190TrU(AnonymousClass7TE.A0l(r2), this, AnonymousClass05K.A01, 6);
                AnonymousClass36D r0 = this.A01;
                if (r0 == null) {
                    str = "mediaUpdateListener";
                } else {
                    r0.A01();
                    A02(true);
                    AnonymousClass0fD.A09(1557046070, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1889284747);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_feed, viewGroup, false);
        AnonymousClass0fD.A09(610366202, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-202688659);
        super.onDestroy();
        AnonymousClass36D r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("mediaUpdateListener");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A02();
        1wY.A00(AnonymousClass7TE.A0l(this.A07)).A08("archive_feed");
        AnonymousClass0fD.A09(-1689402815, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-452985606);
        C15396Ubz.super.onPause();
        1wY.A00(AnonymousClass7TE.A0l(this.A07));
        11Z.A00();
        11Z.A00();
        AnonymousClass0fD.A09(2136082701, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1961855711);
        super.onResume();
        1wY.A00(AnonymousClass7TE.A0l(this.A07));
        requireContext();
        11Z.A00();
        11Z.A00();
        AnonymousClass0fD.A09(590189377, A022);
    }
}
