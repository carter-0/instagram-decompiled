package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.NIu  reason: case insensitive filesystem */
public final class C68456NIu extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "NoteReactionsFragment";
    public RecyclerView A00;
    public PIF A01;
    public C238143As A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;
    public final C72373P3m A05 = new C72373P3m(this);

    public final String getModuleName() {
        return "notes_reaction_sheet";
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.NIu, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0xx A0E = DbW.A0E(this);
        C73565Pfm pfm = new C73565Pfm(this, (AnonymousClass4D7) null, 46);
        19B r3 = 19B.A00;
        1Eo.A05(r3, pfm, A0E);
        1Eo.A05(r3, new C73565Pfm(this, (AnonymousClass4D7) null, 48), DbW.A0E(this));
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            C238133Ar A002 = C238103Ao.A00(recyclerView);
            0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<@[FlexibleNullability] @[RawType] com.instagram.migration.scrollingviewproxy.ScrollingViewAdapterProxy<@[FlexibleNullability] kotlin.Any?>?>");
            C238143As r1 = (C238143As) A002;
            r1.ErF(new C73083PVq(this));
            PIF pif = this.A01;
            if (pif == null) {
                str = "reactionAdapter";
            } else {
                r1.ENw(pif);
                this.A02 = r1;
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C68456NIu() {
        C73924Pm4 A012 = C73924Pm4.A01(this, 13);
        AnonymousClass0eM A002 = C73924Pm4.A00(C73924Pm4.A01(this, 10), 0eO.A02, 11);
        this.A04 = DbS.A0I(C73924Pm4.A01(A002, 12), A012, new C73916Plr(19, (Object) null, A002), DbS.A0z(C60261JiI.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1.getString("CONTENT_NOTE_ID_ARGUMENT") == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            X.Dbb.A1I(r4)
            X.3JR r1 = X.DbS.A0K()
            r0 = 2131238082(0x7f081cc2, float:1.8092433E38)
            r1.A01 = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r4.ErG(r0)
            android.content.res.Resources r2 = X.DbV.A05(r3)
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = "CONTENT_NOTE_ID_ARGUMENT"
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131954063(0x7f13098f, float:1.9544615E38)
            if (r1 != 0) goto L_0x002a
        L_0x0027:
            r0 = 2131954066(0x7f130992, float:1.954462E38)
        L_0x002a:
            java.lang.String r0 = r2.getString(r0)
            r4.setTitle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68456NIu.configureActionBar(X.2da):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-24709088);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_note_reactions, viewGroup, false);
        this.A00 = DbZ.A0F(inflate, R.id.notes_user_rows_recycler_view);
        LayoutInflater layoutInflater2 = getLayoutInflater();
        0qQ.A07(layoutInflater2);
        this.A01 = new PIF(layoutInflater2, this, this.A05);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            DbV.A1B(inflate.getContext(), recyclerView);
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.A15(new C67837Mvh(this, 11));
                AnonymousClass0fD.A09(-1362813911, A022);
                return inflate;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-167222996);
        super.onResume();
        ((C60261JiI) this.A04.getValue()).A02(false);
        AnonymousClass0fD.A09(-1796162470, A022);
    }
}
