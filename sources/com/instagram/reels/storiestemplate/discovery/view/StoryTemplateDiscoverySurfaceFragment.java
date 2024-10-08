package com.instagram.reels.storiestemplate.discovery.view;

import X.015;
import X.0Tu;
import X.0eO;
import X.0qQ;
import X.0s0;
import X.182;
import X.2Rw;
import X.AnonymousClass05K;
import X.AnonymousClass0YZ;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass1YB;
import X.AnonymousClass3WR;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C14044Tol;
import X.C227642jf;
import X.C249703kE;
import X.C263754Nf;
import X.C273654mx;
import X.C51967G9n;
import X.C53368Gms;
import X.C59343JFv;
import X.C60168Jgn;
import X.C66583MXo;
import X.C67616Mqo;
import X.C67763MuN;
import X.C67817MvL;
import X.C67837Mvh;
import X.C68044MzB;
import X.C68046MzD;
import X.C68177N3s;
import X.C70309O1n;
import X.C71396Ojv;
import X.C72979PRm;
import X.C73901Plc;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.MJ8;
import X.NQx;
import X.O9D;
import X.O9E;
import X.Pr3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

public final class StoryTemplateDiscoverySurfaceFragment extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final /* synthetic */ AnonymousClass0YZ[] $$delegatedProperties = {new 015(StoryTemplateDiscoverySurfaceFragment.class, "currentMediaModel", "getCurrentMediaModel()Lcom/instagram/reels/storiestemplate/discovery/model/StoryTemplateDiscoverySurfaceSectionMediaModel;", 0)};
    public static final C70309O1n Companion = new Object();
    public static final float ITEM_PER_ROW = 1.6f;
    public final AnonymousClass0eM browserLayoutManager$delegate;
    public final AnonymousClass0eM childItemWidth$delegate = AnonymousClass1YB.A00(new C73901Plc(this, 12));
    public final 0s0 currentMediaModel$delegate;
    public final AnonymousClass0eM discoverySurfaceViewModel$delegate;
    public final AnonymousClass0eM horizontalSectionMediaAdapterCallback$delegate;
    public RecyclerView recyclerView;
    public final AnonymousClass0eM scrollListener$delegate;
    public final O9E sectionViewCallback;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public C67763MuN verticalSectionAdapter;
    public final String viewerSessionId = AnonymousClass7TG.A0j();

    public String getModuleName() {
        return "story_template_discovery_surface";
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51967G9n.A0x(view, R.id.story_template_discovery_surface_layout, 0);
        NQx.A01(C66583MXo.A0N(AnonymousClass7TE.A0b(view, R.id.story_template_browser_exit_button)), this, 21);
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.session$delegate), 36319939968638792L)) {
            C71396Ojv.A00(DbV.A0T(view, R.id.story_template_browser_add_button_stub, false).getView(), 20, this);
        }
        initializeRecyclerView(view);
    }

    /* access modifiers changed from: private */
    public final LinearLayoutManager getBrowserLayoutManager() {
        return (LinearLayoutManager) this.browserLayoutManager$delegate.getValue();
    }

    private final int getChildItemWidth() {
        return DbX.A07(this.childItemWidth$delegate);
    }

    private final C68177N3s getCurrentMediaModel() {
        return (C68177N3s) this.currentMediaModel$delegate.CDM(this, $$delegatedProperties[0]);
    }

    /* access modifiers changed from: private */
    public final C60168Jgn getDiscoverySurfaceViewModel() {
        return (C60168Jgn) this.discoverySurfaceViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final O9D getHorizontalSectionMediaAdapterCallback() {
        return (O9D) this.horizontalSectionMediaAdapterCallback$delegate.getValue();
    }

    private final C67837Mvh getScrollListener() {
        return (C67837Mvh) this.scrollListener$delegate.getValue();
    }

    private final void initializeRecyclerView(View view) {
        2Rw r1;
        this.verticalSectionAdapter = new C67763MuN(this.sectionViewCallback, new C59343JFv(this, 20));
        RecyclerView A0I = DbT.A0I(view, R.id.story_template_browser_vertical_recycler_view);
        A0I.setLayoutManager(getBrowserLayoutManager());
        A0I.setAdapter(this.verticalSectionAdapter);
        A0I.A15(getScrollListener());
        A0I.A13(new C67616Mqo());
        this.recyclerView = A0I;
        DbX.A1X(this, DbV.A0J(this), 28);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null && (r1 = recyclerView2.A0A) != null) {
            r1.registerAdapterDataObserver(new C67817MvL(this));
        }
    }

    /* access modifiers changed from: private */
    public final void launchCreation() {
        Bundle bundle = new Bundle(0);
        DbT.A1M(this, AnonymousClass6W8.A02(getActivity(), bundle, AnonymousClass7TE.A0l(this.session$delegate), TransparentModalActivity.class, C273654mx.A00(3378)));
    }

    private final void setCurrentMediaModel(C68177N3s n3s) {
        DbS.A1a(this, n3s, this.currentMediaModel$delegate, $$delegatedProperties, 0);
    }

    public static /* synthetic */ void updateActiveViewHolder$default(StoryTemplateDiscoverySurfaceFragment storyTemplateDiscoverySurfaceFragment, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        storyTemplateDiscoverySurfaceFragment.updateActiveViewHolder(i, i2);
    }

    private final void updateVideoPlayState(C68046MzD mzD, C68046MzD mzD2) {
        AnonymousClass3WR r5;
        C72979PRm pRm;
        C68046MzD mzD3 = mzD2;
        if (!(mzD2 == null || (pRm = mzD3.A02) == null)) {
            ((C14044Tol) pRm.A02.getValue()).A0A("Story Template Discovery Surface media item recycler view scroll");
        }
        if (mzD != null && (r5 = mzD.A03) != null) {
            if (mzD.A02 == null) {
                mzD.A00();
            }
            C72979PRm pRm2 = mzD.A02;
            if (pRm2 != null) {
                Integer num = pRm2.A00;
                Integer num2 = AnonymousClass05K.A01;
                if (num != num2) {
                    pRm2.A00 = num2;
                    ((C14044Tol) pRm2.A02.getValue()).A09(pRm2.A01, r5, new C263754Nf((Object) null, 0), (String) null, "StoryTemplateDiscoverySurfaceVideoPlayer", 0.0f, -1, 0, true, true);
                }
                if (pRm2.A00 == AnonymousClass05K.A0C) {
                    AnonymousClass0eM r2 = pRm2.A02;
                    ((C14044Tol) r2.getValue()).A03(1.0f, 0);
                    ((C14044Tol) r2.getValue()).A05(0, false);
                    ((C14044Tol) r2.getValue()).A0C("Story Template Discovery Surface media item recycler view scroll", false);
                }
            }
        }
    }

    public StoryTemplateDiscoverySurfaceFragment() {
        C73901Plc plc = new C73901Plc(this, 13);
        AnonymousClass0eM A00 = C73901Plc.A00(new C73901Plc(this, 16), 0eO.A02, 17);
        this.discoverySurfaceViewModel$delegate = DbS.A0I(new C73901Plc(A00, 18), plc, new MJ8(34, (Object) null, A00), DbS.A0z(C60168Jgn.class));
        this.browserLayoutManager$delegate = AnonymousClass1YB.A00(new C73901Plc(this, 11));
        this.horizontalSectionMediaAdapterCallback$delegate = AnonymousClass1YB.A00(new C73901Plc(this, 14));
        this.scrollListener$delegate = AnonymousClass1YB.A00(new C73901Plc(this, 15));
        this.sectionViewCallback = new O9E(this);
        this.currentMediaModel$delegate = new Pr3(this, 3);
    }

    /* access modifiers changed from: private */
    public final void logTemplateImpression() {
        C249703kE r2;
        C249703kE r22;
        C68046MzD mzD;
        C68044MzB mzB;
        RecyclerView recyclerView2;
        C53368Gms gms = (C53368Gms) getDiscoverySurfaceViewModel().A04.getValue();
        if (gms != null) {
            int i = gms.A01;
            C53368Gms gms2 = (C53368Gms) getDiscoverySurfaceViewModel().A04.getValue();
            if (gms2 != null) {
                int i2 = gms2.A00;
                RecyclerView recyclerView3 = this.recyclerView;
                C68177N3s n3s = null;
                if (recyclerView3 != null) {
                    r2 = recyclerView3.A0W(i);
                } else {
                    r2 = null;
                }
                if (!(r2 instanceof C68044MzB) || (mzB = (C68044MzB) r2) == null || (recyclerView2 = mzB.A01) == null) {
                    r22 = null;
                } else {
                    r22 = recyclerView2.A0W(i2);
                }
                if ((r22 instanceof C68046MzD) && (mzD = (C68046MzD) r22) != null) {
                    n3s = mzD.A00;
                }
                setCurrentMediaModel(n3s);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v22, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v27, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateActiveViewHolder(int r6, int r7) {
        /*
            r5 = this;
            X.Jgn r0 = r5.getDiscoverySurfaceViewModel()
            X.0Ud r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.Gms r0 = (X.C53368Gms) r0
            r4 = 0
            if (r0 == 0) goto L_0x00b1
            int r1 = r0.A01
            androidx.recyclerview.widget.RecyclerView r0 = r5.recyclerView
            if (r0 == 0) goto L_0x00b1
            X.3kE r2 = r0.A0W(r1)
        L_0x0019:
            boolean r0 = r2 instanceof X.C68044MzB
            if (r0 == 0) goto L_0x00ae
            X.MzB r2 = (X.C68044MzB) r2
        L_0x001f:
            X.Jgn r0 = r5.getDiscoverySurfaceViewModel()
            X.0Ud r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.Gms r0 = (X.C53368Gms) r0
            if (r0 == 0) goto L_0x00ac
            int r1 = r0.A00
            if (r2 == 0) goto L_0x00ac
            androidx.recyclerview.widget.RecyclerView r0 = r2.A01
            if (r0 == 0) goto L_0x00ac
            X.3kE r3 = r0.A0W(r1)
        L_0x0039:
            boolean r0 = r3 instanceof X.C68046MzD
            if (r0 == 0) goto L_0x00aa
            X.MzD r3 = (X.C68046MzD) r3
        L_0x003f:
            androidx.recyclerview.widget.RecyclerView r0 = r5.recyclerView
            if (r0 == 0) goto L_0x00a8
            X.3kE r1 = r0.A0W(r6)
        L_0x0047:
            boolean r0 = r1 instanceof X.C68044MzB
            if (r0 == 0) goto L_0x00a6
            X.MzB r1 = (X.C68044MzB) r1
            if (r1 == 0) goto L_0x00a6
            androidx.recyclerview.widget.RecyclerView r0 = r1.A01
            if (r0 == 0) goto L_0x00a6
            X.3kE r2 = r0.A0W(r7)
        L_0x0057:
            boolean r0 = r2 instanceof X.C68046MzD
            if (r0 == 0) goto L_0x00b4
            X.MzD r2 = (X.C68046MzD) r2
            if (r2 == 0) goto L_0x00b4
            boolean r0 = X.0qQ.A0K(r3, r2)
            if (r0 != 0) goto L_0x00a2
            X.C3R r0 = r2.A01
            if (r0 == 0) goto L_0x0070
            X.PRm r0 = r2.A02
            if (r0 != 0) goto L_0x0070
            r2.A00()
        L_0x0070:
            r5.updateVideoPlayState(r2, r3)
            if (r3 == 0) goto L_0x0080
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A08
            r1 = 4
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r3.A07
            r0.setVisibility(r1)
        L_0x0080:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r2.A08
            r1 = 0
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r2.A07
            r0.setVisibility(r1)
            X.Jgn r0 = r5.getDiscoverySurfaceViewModel()
            X.05G r3 = r0.A03
        L_0x0091:
            java.lang.Object r2 = r3.getValue()
            r1 = 19
            X.Gms r0 = new X.Gms
            r0.<init>(r6, r7, r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0091
        L_0x00a2:
            r5.logTemplateImpression()
            return
        L_0x00a6:
            r2 = r4
            goto L_0x0057
        L_0x00a8:
            r1 = r4
            goto L_0x0047
        L_0x00aa:
            r3 = r4
            goto L_0x003f
        L_0x00ac:
            r3 = r4
            goto L_0x0039
        L_0x00ae:
            r2 = r4
            goto L_0x001f
        L_0x00b1:
            r2 = r4
            goto L_0x0019
        L_0x00b4:
            X.Jgn r0 = r5.getDiscoverySurfaceViewModel()
            X.0Ud r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x00d8
            if (r3 == 0) goto L_0x00cd
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A08
            r1 = 4
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r3.A07
            r0.setVisibility(r1)
        L_0x00cd:
            X.Jgn r0 = r5.getDiscoverySurfaceViewModel()
            X.05G r1 = r0.A03
            r0 = 0
            r1.Epw(r0)
            return
        L_0x00d8:
            r5.updateVideoPlayState(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment.updateActiveViewHolder(int, int):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1941087840);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.story_template_discovery_surface_layout, viewGroup, false);
        AnonymousClass0fD.A09(528364222, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
