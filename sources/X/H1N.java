package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class H1N extends AnonymousClass4DH implements AnonymousClass4DU, C59622JQq, AnonymousClass4DS, C320306sA, C320316sB {
    public static final String __redex_internal_original_name = "SavedClipsFragment";
    public int A00;
    public ShimmerFrameLayout A01;
    public C320556sZ A02;
    public C238143As A03;
    public C320516sV A04;
    public H38 A05;
    public C229352nF A06;
    public 2el A07;
    public AnonymousClass2uE A08;
    public HMH A09;
    public SavedCollection A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public final AnonymousClass0eM A0E = C227642jf.A02(this);

    public final List Any() {
        return AnonymousClass7TE.A1I(new C52315GNh(this, 2));
    }

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final /* synthetic */ void D3i(User user) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x006a: MOVE  (r2v4 X.H15) = (r2v3 X.H15)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void D46(X.C267324bN r16, int r17) {
        /*
            r15 = this;
            r11 = 0
            r2 = r16
            X.0qQ.A0B(r2, r11)
            r5 = r15
            X.6sZ r0 = r15.A02
            java.lang.String r1 = "selectStateProvider"
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.A01
            r10 = r17
            if (r0 == 0) goto L_0x0021
            X.6sV r0 = r15.A04
            if (r0 != 0) goto L_0x003f
            java.lang.String r1 = "clipsGridAdapter"
        L_0x0019:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0021:
            X.1Xj r4 = r2.A02
            if (r4 == 0) goto L_0x008b
            androidx.fragment.app.FragmentActivity r1 = r15.requireActivity()
            X.0eM r0 = r15.A0E
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_SAVED_TAB
            java.lang.String r7 = r15.A0B
            if (r7 != 0) goto L_0x0038
            java.lang.String r1 = "collectionId"
            goto L_0x0019
        L_0x0038:
            java.lang.String r8 = r15.A0C
            if (r8 != 0) goto L_0x008c
            java.lang.String r1 = "gridKey"
            goto L_0x0019
        L_0x003f:
            java.util.List r0 = X.C320516sV.A00(r0)
            java.util.List r0 = X.00k.A0a(r0)
            java.lang.Object r3 = X.00k.A0O(r0, r10)
            X.2tL r3 = (X.C232262tL) r3
            if (r3 == 0) goto L_0x008b
            X.6sZ r2 = r15.A02
            if (r2 == 0) goto L_0x0019
            boolean r0 = r3 instanceof X.C320716sp
            if (r0 == 0) goto L_0x008b
            X.6sp r3 = (X.C320716sp) r3
            if (r3 == 0) goto L_0x008b
            X.4bN r1 = r3.A03
            java.lang.String r0 = r1.getId()
            r2.A02(r3, r1, r0)
            androidx.fragment.app.Fragment r2 = r15.mParentFragment
            boolean r0 = r2 instanceof X.H15
            if (r0 == 0) goto L_0x007e
            X.H15 r2 = (X.H15) r2
            if (r2 == 0) goto L_0x007e
            X.HsT r1 = r2.A0F
            if (r1 == 0) goto L_0x007e
            X.IaN r0 = r2.A0B
            boolean r0 = r0.A04()
            r1.A02(r0)
            X.Dbb.A0u(r2)
        L_0x007e:
            androidx.fragment.app.FragmentActivity r1 = r15.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x008b
            if (r1 == 0) goto L_0x008b
            X.C51970G9q.A12(r1)
        L_0x008b:
            return
        L_0x008c:
            r6 = 0
            X.4h3 r2 = X.C51965G9l.A0i(r0, r3)
            r9 = r6
            r12 = r11
            r13 = r11
            r14 = r11
            X.I6Y.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1N.D46(X.4bN, int):void");
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r6, int i) {
        1Xj r1;
        String str;
        C51973G9u.A1E(r6, view, motionEvent);
        C320556sZ r0 = this.A02;
        if (r0 == null) {
            str = "selectStateProvider";
        } else if (r0.A01) {
            return false;
        } else {
            HMH hmh = this.A09;
            if (hmh == null) {
                str = "savedFeedMode";
            } else if (hmh == HMH.SELECT_COVER_PHOTO || (r1 = r6.A02) == null) {
                return false;
            } else {
                AnonymousClass2uE r02 = this.A08;
                if (r02 != null) {
                    return r02.Dsa(motionEvent, view, r1, i);
                }
                str = "peekMediaController";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DyE() {
    }

    public final void EE3(List list) {
        String str;
        C320516sV r0 = this.A04;
        if (r0 == null) {
            str = "clipsGridAdapter";
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C320716sp r02 : r0.A01()) {
                C267324bN r1 = r02.A03;
                if (!00k.A0u(list, r1.A02)) {
                    A1C.add(r1);
                }
            }
            C229352nF r2 = this.A06;
            if (r2 == null) {
                str = "gridItemStore";
            } else {
                String str2 = this.A0C;
                if (str2 == null) {
                    str = "gridKey";
                } else {
                    r2.A08(str2, A1C, true, false);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r6) {
        String str;
        0qQ.A0B(r6, 0);
        HMH hmh = this.A09;
        if (hmh == null) {
            str = "savedFeedMode";
        } else if (hmh == HMH.ADD_TO_NEW_COLLECTION) {
            r6.Eu4(true);
            Resources A052 = DbV.A05(this);
            C320556sZ r2 = this.A02;
            str = "selectStateProvider";
            if (r2 != null) {
                r6.setTitle(A052.getQuantityString(R.plurals.save_home_collection_feed_x_selected, r2.A02.size(), AnonymousClass7TF.A1b(r2.A02.size())));
                AnonymousClass3JR A0K = DbS.A0K();
                A0K.A0K = getString(2131968361);
                DbX.A19(C56801ICy.A00(this, 66), A0K, r6);
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "feed_saved_collections_clips";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C238143As r1;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext, 3);
        C320516sV r0 = this.A04;
        if (r0 != null) {
            C51971G9r.A14(fastScrollingGridLayoutManager, r0);
            AnonymousClass7TH.A0R(view.findViewById(R.id.empty_state));
            this.A01 = (ShimmerFrameLayout) view.requireViewById(R.id.clips_tab_grid_shimmer_container);
            View requireViewById = view.requireViewById(R.id.clips_tab_grid_recyclerview);
            RecyclerView recyclerView = (RecyclerView) requireViewById;
            C320516sV r02 = this.A04;
            if (r02 != null) {
                recyclerView.setAdapter(r02.A0I);
                recyclerView.setLayoutManager(fastScrollingGridLayoutManager);
                recyclerView.A11(C320826t1.A00(requireContext, 0, true));
                H38 h38 = this.A05;
                String str = "clipsSavedTabFetcher";
                if (h38 != null) {
                    recyclerView.A15(new C3251871j(recyclerView.A0D, h38, C3251771i.A06, true, false));
                    0qQ.A07(requireViewById);
                    C238133Ar A002 = C238103Ao.A00(recyclerView);
                    if (A002 instanceof C238143As) {
                        r1 = (C238143As) A002;
                    } else {
                        r1 = null;
                    }
                    this.A03 = r1;
                    if (r1 != null) {
                        r1.ErF(new C57792IgX(this));
                    }
                    H38 h382 = this.A05;
                    if (h382 != null) {
                        h382.A03(new H39(this, 3));
                        C320516sV r03 = this.A04;
                        if (r03 != null) {
                            if (C320516sV.A00(r03).size() == 0) {
                                C320516sV r12 = this.A04;
                                if (r12 != null) {
                                    r12.A04(9);
                                    ShimmerFrameLayout shimmerFrameLayout = this.A01;
                                    if (shimmerFrameLayout != null) {
                                        shimmerFrameLayout.A02();
                                    }
                                }
                            } else {
                                ShimmerFrameLayout shimmerFrameLayout2 = this.A01;
                                if (shimmerFrameLayout2 != null) {
                                    shimmerFrameLayout2.A05();
                                }
                            }
                            2el r04 = this.A07;
                            if (r04 == null) {
                                str = "viewpointManager";
                            } else {
                                Dba.A0z(recyclerView, r04, this);
                                if (!182.A06(0Tu.A05, DbT.A0X(this.A0E), 36326111835076106L)) {
                                    H38 h383 = this.A05;
                                    if (h383 != null) {
                                        h383.A04((Long) null, (String) null, 0sn.A00, false);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("clipsGridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ASi() {
        C320556sZ r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("selectStateProvider");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A03(true);
        }
    }

    public final void ATa() {
        C320556sZ r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("selectStateProvider");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A03(false);
        }
    }

    public final C320416sL Ao3() {
        H38 h38 = this.A05;
        if (h38 != null) {
            return h38;
        }
        0qQ.A0F("clipsSavedTabFetcher");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String B9m() {
        String str = this.A0C;
        if (str != null) {
            return str;
        }
        0qQ.A0F("gridKey");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List Bri() {
        C320556sZ r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("selectStateProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = r0.A02.values().iterator();
        while (it.hasNext()) {
            1Xj r02 = ((C320716sp) AnonymousClass7TF.A0a(it)).A03.A02;
            if (r02 != null) {
                A1C.add(r02);
            }
        }
        return A1C;
    }

    public final boolean CJz() {
        C320516sV r0 = this.A04;
        if (r0 != null) {
            return AnonymousClass7TE.A1b(C320516sV.A00(r0));
        }
        0qQ.A0F("clipsGridAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.4DU} */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.6sL, X.H38] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r0 = -979839251(0xffffffffc598d6ed, float:-4890.8657)
            int r0 = X.AnonymousClass0fD.A02(r0)
            r10 = r23
            r1 = r24
            X.H1N.super.onCreate(r1)
            android.os.Bundle r6 = r10.requireArguments()
            java.lang.String r1 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION"
            android.os.Parcelable r4 = r6.getParcelable(r1)
            com.instagram.save.model.SavedCollection r4 = (com.instagram.save.model.SavedCollection) r4
            r8 = 0
            if (r4 != 0) goto L_0x0028
            X.HMw r3 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            java.lang.String r2 = r3.A01
            java.lang.String r1 = ""
            com.instagram.save.model.SavedCollection r4 = new com.instagram.save.model.SavedCollection
            r4.<init>(r3, r2, r1)
        L_0x0028:
            r10.A0A = r4
            java.lang.String r5 = "collection"
            java.lang.String r1 = r4.A0F
            r10.A0B = r1
            java.lang.String r1 = "prior_module"
            r6.getString(r1)
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            r10.A0C = r1
            java.lang.String r1 = "SaveFragment.SAVE_HOME_TAB_MODE"
            java.io.Serializable r2 = r6.getSerializable(r1)
            boolean r1 = r2 instanceof X.HMH
            if (r1 == 0) goto L_0x0049
            X.HMH r2 = (X.HMH) r2
            if (r2 != 0) goto L_0x004b
        L_0x0049:
            X.HMH r2 = X.HMH.COLLECTION_FEED
        L_0x004b:
            r10.A09 = r2
            java.lang.String r1 = "ARGUMENT_NUM_MEDIA_COLLECTIONS"
            int r1 = r6.getInt(r1)
            r10.A00 = r1
            X.0gy r13 = X.AnonymousClass07i.A00(r10)
            android.content.Context r12 = r10.requireContext()
            X.0eM r1 = r10.A0E
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.save.model.SavedCollection r3 = r10.A0A
            if (r3 == 0) goto L_0x00b5
            r2 = 2
            X.0qQ.A0B(r4, r2)
            java.lang.String r2 = r3.A0F
            X.IME r14 = new X.IME
            r14.<init>(r2)
            X.H38 r11 = new X.H38
            r15 = r10
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r10.A05 = r11
            X.2el r3 = X.2el.A00()
            r10.A07 = r3
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.6sT r11 = new X.6sT
            r11.<init>(r2, r3, r10, r8)
            android.content.Context r7 = r10.requireContext()
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r1)
            r2 = 0
            r3 = 1058013184(0x3f100000, float:0.5625)
            X.6sS r9 = new X.6sS
            r9.<init>(r3, r2, r2)
            X.6sV r6 = new X.6sV
            r12 = r10
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r2
            r18 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r10.A04 = r6
            X.6sZ r3 = r6.A0F
            r10.A02 = r3
            X.HMH r4 = r10.A09
            if (r4 != 0) goto L_0x00bd
            java.lang.String r5 = "savedFeedMode"
        L_0x00b5:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00bd:
            X.HMH r3 = X.HMH.ADD_TO_NEW_COLLECTION
            if (r4 != r3) goto L_0x00c4
            r10.ASi()
        L_0x00c4:
            X.2jd r7 = new X.2jd
            r7.<init>()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r5 = "feed_saved_collections_clips"
            X.5nD r4 = X.C294895nD.DEFAULT
            X.6sr r3 = new X.6sr
            r3.<init>(r10, r4, r6, r5)
            r7.A0E(r3)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            r3 = 4
            X.ISl r4 = new X.ISl
            r4.<init>(r10, r3)
            X.36D r3 = new X.36D
            r3.<init>(r5, r4, r2, r2)
            r7.A0E(r3)
            r10.registerLifecycleListenerSet(r7)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.2nF r3 = X.C229342nE.A00(r3)
            r10.A06 = r3
            androidx.fragment.app.FragmentActivity r12 = r10.requireActivity()
            X.0hq r14 = r10.getParentFragmentManager()
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r1)
            X.6sV r1 = r10.A04
            if (r1 != 0) goto L_0x010b
            java.lang.String r5 = "clipsGridAdapter"
            goto L_0x00b5
        L_0x010b:
            r21 = 1
            X.2uE r11 = new X.2uE
            r13 = r10
            r17 = r10
            r18 = r1
            r19 = r8
            r20 = r2
            r22 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r10.A08 = r11
            r1 = 323705995(0x134b5c8b, float:2.566783E-27)
            X.AnonymousClass0fD.A09(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1N.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1386322488);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_save_collection_clips_tab, viewGroup, false);
        AnonymousClass0fD.A09(89558739, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1432703370);
        super.onDestroyView();
        this.A0D = false;
        C238143As r0 = this.A03;
        if (r0 != null) {
            r0.AHq();
        }
        C320516sV r1 = this.A04;
        if (r1 == null) {
            0qQ.A0F("clipsGridAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A02();
        this.A01 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(-689261411, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1815923985);
        super.onResume();
        if (182.A06(0Tu.A05, DbT.A0X(this.A0E), 36326111835076106L) && !this.A0D) {
            H38 h38 = this.A05;
            if (h38 == null) {
                0qQ.A0F("clipsSavedTabFetcher");
                throw AnonymousClass00P.createAndThrow();
            } else {
                C51972G9s.A19(h38);
                this.A0D = true;
            }
        }
        AnonymousClass0fD.A09(-1253298950, A022);
    }
}
