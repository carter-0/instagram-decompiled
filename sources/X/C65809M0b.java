package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.view.comments.adapter.IgLiveCommentsLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.M0b  reason: case insensitive filesystem */
public abstract class C65809M0b implements MVX {
    public C262204Co A00;
    public final Context A01;
    public final View A02;
    public final RecyclerView A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final AnonymousClass3E6 A06;
    public final C60437JlV A07;
    public final IgLiveCommentsLinearLayoutManager A08;
    public final C60262JiJ A09;
    public final AnonymousClass0eM A0A = MMN.A00(this, 1);
    public final AnonymousClass0eM A0B = MMN.A00(this, 2);
    public final ValueAnimator A0C;
    public final ValueAnimator A0D;
    public final View A0E;
    public final AnonymousClass0iw A0F;

    public static final void A02(C65809M0b m0b, boolean z) {
        RecyclerView recyclerView = m0b.A03;
        if (z) {
            recyclerView.A0p(0);
        } else {
            recyclerView.A0o(0);
        }
        m0b.A09.A02(A00(m0b), m0b.A08.A1a(), true, false, false);
    }

    public /* synthetic */ void CuA() {
    }

    public /* synthetic */ void DGS(M0U m0u) {
    }

    public /* synthetic */ void DUj(M0U m0u) {
    }

    public /* synthetic */ void DXE(M0V m0v) {
    }

    public /* synthetic */ void Dyo(M0U m0u) {
    }

    public static final void A01(C59671JTb jTb, C65809M0b m0b) {
        ValueAnimator valueAnimator;
        int i;
        RecyclerView recyclerView = m0b.A03;
        if (recyclerView.getScrollState() != 1) {
            if (jTb.A00) {
                valueAnimator = m0b.A0C;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
                valueAnimator.setIntValues(new int[]{recyclerView.getHeight(), m0b.A01.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height)});
                i = 16;
            } else {
                valueAnimator = m0b.A0D;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
                valueAnimator.setIntValues(new int[]{recyclerView.getHeight(), m0b.A01.getResources().getDimensionPixelSize(R.dimen.iglive_expanded_comments_view_height)});
                i = 17;
            }
            C64205LTv.A01(valueAnimator, m0b, i);
            valueAnimator.setDuration(200);
            valueAnimator.start();
        }
    }

    public final boolean A03() {
        C60262JiJ jiJ = this.A09;
        05G r1 = jiJ.A0D;
        C61027JvR.A00(r1, ((C61027JvR) r1.getValue()).A03, false);
        C66184MGv.A02(jiJ, C318116oQ.A00(jiJ), 16);
        return true;
    }

    public final boolean A04() {
        C60262JiJ jiJ = this.A09;
        05G r1 = jiJ.A0D;
        C61027JvR.A00(r1, ((C61027JvR) r1.getValue()).A03, false);
        C66184MGv.A02(jiJ, C318116oQ.A00(jiJ), 17);
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.recyclerview.widget.LinearLayoutManager, X.3pI, com.instagram.video.live.mvvm.view.comments.adapter.IgLiveCommentsLinearLayoutManager] */
    public C65809M0b(View view, AnonymousClass4DH r19, UserSession userSession, C313666go r21, C60262JiJ jiJ) {
        AnonymousClass4DH r11 = r19;
        this.A04 = r11;
        UserSession userSession2 = userSession;
        this.A05 = userSession2;
        View view2 = view;
        this.A0E = view2;
        this.A09 = jiJ;
        Context requireContext = r11.requireContext();
        this.A01 = requireContext;
        this.A0F = r11;
        this.A02 = AnonymousClass7TF.A0G(view2, R.id.iglive_reactions_comments);
        RecyclerView A0c = JTR.A0c(view2, R.id.iglive_comment_list);
        this.A03 = A0c;
        C60437JlV jlV = new C60437JlV(requireContext, r11, userSession2, r21, this, new C63683L2t(userSession2), DbV.A0J(r11));
        this.A07 = jlV;
        ? linearLayoutManager = new LinearLayoutManager(view2.getContext(), 1, true);
        this.A08 = linearLayoutManager;
        this.A0D = JTQ.A05(requireContext.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height), requireContext.getResources().getDimensionPixelSize(R.dimen.iglive_expanded_comments_view_height));
        this.A0C = JTQ.A05(AnonymousClass7TF.A02(requireContext, R.dimen.iglive_expanded_comments_view_height), AnonymousClass7TF.A02(requireContext, R.dimen.avatar_sticker_max_height));
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A06 = A012;
        jlV.registerAdapterDataObserver(new UAY(this, 6));
        A0c.setAdapter(jlV);
        A0c.setLayoutManager(linearLayoutManager);
        A0c.setOverScrollMode(2);
        A0c.setItemAnimator((AnonymousClass3AS) null);
        A0c.setVisibility(0);
        A0c.A15(new C60474Jm6(this));
        A0c.setVerticalFadingEdgeEnabled(true);
        A0c.setFadingEdgeLength(DbU.A05(A0c).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
        A012.A9Y(new C64871LjX(this, 12));
    }

    public static final ArrayList A00(C65809M0b m0b) {
        String pk;
        ArrayList A1C = AnonymousClass7TE.A1C();
        IgLiveCommentsLinearLayoutManager igLiveCommentsLinearLayoutManager = m0b.A08;
        int A1a = igLiveCommentsLinearLayoutManager.A1a();
        int A1b = igLiveCommentsLinearLayoutManager.A1b();
        if (A1a <= A1b) {
            while (true) {
                C60437JlV jlV = m0b.A07;
                if (A1a > -1) {
                    List list = jlV.A07;
                    if (A1a < list.size()) {
                        MVW mvw = (MVW) list.get(C60437JlV.A00(jlV, A1a));
                        if (!(!(mvw instanceof M0V) || mvw == null || (pk = mvw.getPk()) == null)) {
                            A1C.add(pk);
                        }
                    }
                }
                if (A1a == A1b) {
                    break;
                }
                A1a++;
            }
        }
        return A1C;
    }
}
