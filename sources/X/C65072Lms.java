package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import java.util.List;

/* renamed from: X.Lms  reason: case insensitive filesystem */
public class C65072Lms implements MXK {
    public RecyclerView A00;
    public C66472MTa A01;
    public final UserSession A02;
    public final C62457Kg7 A03;
    public final AnonymousClass0eM A04;
    public final 0sP A05;
    public final List A06;
    public final C62320sa A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C65072Lms(UserSession userSession, C62457Kg7 kg7, 0sP r10, int i) {
        this(userSession, (i & 2) != 0 ? C62457Kg7.LIST : kg7, (i & 4) != 0 ? 0sr.A1P(new C62578KiB[]{C62578KiB.VIDEO_PREVIEW_LARGE, C62578KiB.VIDEO_PREVIEW_SMALL, C62578KiB.FULL}) : null, (C62320sa) null, r10);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void AJD() {
        this.A01 = null;
    }

    public final int B8T() {
        return 0;
    }

    public final void CN3(ViewGroup viewGroup) {
        C252553pI linearLayoutManager;
        ConstraintLayout constraintLayout;
        View view;
        RecyclerView A0F = DbZ.A0F(viewGroup, R.id.stacked_timeline_bottom_sheet_list_view);
        if (A0F == null) {
            viewGroup.removeAllViews();
            Context context = viewGroup.getContext();
            A0F = new C60714Jpz(context, this);
            A0F.setItemAnimator((AnonymousClass3AS) null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            if (this.A03 == C62457Kg7.GRID) {
                layoutParams.topMargin = JTR.A06(context);
            }
            A0F.setId(R.id.stacked_timeline_bottom_sheet_list_view);
            viewGroup.addView(A0F, layoutParams);
            0nA.A0V(viewGroup, -1);
            ViewParent parent = viewGroup.getParent().getParent();
            if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                ViewParent parent2 = viewGroup.getParent();
                if ((parent2 instanceof View) && (view = (View) parent2) != null) {
                    int id = view.getId();
                    C270354gb A0C = JTQ.A0C(constraintLayout);
                    A0C.A0A(id, -1);
                    A0C.A0C(id, 4, 0, 4);
                    A0C.A0G(constraintLayout);
                }
            }
        }
        this.A00 = A0F;
        Context context2 = A0F.getContext();
        if (context2 == null) {
            linearLayoutManager = null;
        } else {
            int ordinal = this.A03.ordinal();
            if (ordinal == 0) {
                linearLayoutManager = new LinearLayoutManager(context2, 0, false);
            } else if (ordinal == 1) {
                linearLayoutManager = new GridLayoutManager(context2, 3, 1, false);
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        A0F.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            Dba.A17(recyclerView, this.A04);
        }
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.MTa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.MTa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.MTa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.MTa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.MTa} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000b: MOVE  (r1v1 X.Jl7) = (r1v0 X.Jl7)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final X.C66472MTa A00(java.lang.String r8) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            r4 = 0
            if (r0 == 0) goto L_0x0063
            X.2Rw r1 = r0.A0A
            boolean r0 = r1 instanceof X.C60414Jl7
            if (r0 == 0) goto L_0x0063
            X.Jl7 r1 = (X.C60414Jl7) r1
            if (r1 == 0) goto L_0x0063
            java.util.List r0 = r1.A00
            java.util.Iterator r5 = r0.iterator()
            r6 = r4
            r3 = 0
        L_0x0017:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r2 = r5.next()
            r1 = r2
            X.MTa r1 = (X.C66472MTa) r1
            boolean r0 = r1 instanceof X.C61189Jyi
            if (r0 == 0) goto L_0x0037
            X.Jyi r1 = (X.C61189Jyi) r1
            java.lang.String r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r8)
        L_0x0030:
            if (r0 == 0) goto L_0x0017
            if (r3 != 0) goto L_0x0061
            r3 = 1
            r6 = r2
            goto L_0x0017
        L_0x0037:
            boolean r0 = r1 instanceof X.C61191Jyk
            if (r0 == 0) goto L_0x0044
            X.Jyk r1 = (X.C61191Jyk) r1
            java.lang.String r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r8)
            goto L_0x0030
        L_0x0044:
            boolean r0 = r1 instanceof X.C61190Jyj
            if (r0 == 0) goto L_0x0051
            X.Jyj r1 = (X.C61190Jyj) r1
            java.lang.String r0 = r1.A02
            boolean r0 = X.0qQ.A0K(r0, r8)
            goto L_0x0030
        L_0x0051:
            boolean r0 = r1 instanceof X.C61188Jyh
            if (r0 == 0) goto L_0x0017
            X.Jyh r1 = (X.C61188Jyh) r1
            java.lang.String r0 = r1.A02
            boolean r0 = X.0qQ.A0K(r0, r8)
            goto L_0x0030
        L_0x005e:
            if (r3 == 0) goto L_0x0061
            r4 = r6
        L_0x0061:
            X.MTa r4 = (X.C66472MTa) r4
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65072Lms.A00(java.lang.String):X.MTa");
    }

    public final void AQD(float f) {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.scrollBy(0, (int) f);
        }
    }

    public final List Bdz() {
        return this.A06;
    }

    public final boolean CQZ() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !recyclerView.canScrollVertically(1)) {
            return true;
        }
        return false;
    }

    public final boolean CQa() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final void Cyv() {
        String str;
        if (this instanceof C61784KLx) {
            ClipsStackedTimelineFragment clipsStackedTimelineFragment = ((C61784KLx) this).A00;
            AnonymousClass8RL r2 = clipsStackedTimelineFragment.A0b;
            if (r2 == null) {
                str = "clipsStackedTimelineVideoPreviewSizeProvider";
            } else {
                C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
                if (jfo == null) {
                    str = "stackedTimelineViewModel";
                } else {
                    r2.A0E((AnonymousClass8RM) null, JTR.A0K(jfo.A0Y));
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DG2(float f, float f2) {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A1F(0, (int) f2);
        }
    }

    public final void Dfp() {
        ViewParent parent;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (parent = recyclerView.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void cancel() {
        C66472MTa A002;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.suppressLayout(false);
            RecyclerView.A0J((2Rw) this.A04.getValue(), recyclerView, true);
            recyclerView.A19(true);
            recyclerView.requestLayout();
            C66472MTa mTa = this.A01;
            if (!(mTa == null || (A002 = A00(mTa.getName())) == null || A002.CbS())) {
                this.A05.invoke(mTa);
            }
            this.A01 = null;
            C62320sa r0 = this.A07;
            if (r0 != null) {
                r0.invoke();
            }
        }
    }

    public C65072Lms(UserSession userSession, C62457Kg7 kg7, List list, C62320sa r5, 0sP r6) {
        AnonymousClass7TG.A1U(userSession, kg7, list);
        this.A02 = userSession;
        this.A03 = kg7;
        this.A06 = list;
        this.A07 = r5;
        this.A05 = r6;
        this.A04 = AnonymousClass0eN.A01(MMB.A00(this, 45));
    }
}
