package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.Kcr  reason: case insensitive filesystem */
public final class C62257Kcr extends LGN {
    public C262204Co A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = C66307MMq.A01(this, 32);
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = C66307MMq.A01(this, 34);
    public final AnonymousClass0eM A06 = C66307MMq.A01(this, 35);
    public final AnonymousClass0eM A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62257Kcr(View view, AnonymousClass4DH r8, UserSession userSession) {
        super(view, r8, userSession, C313666go.VIEWER);
        0qQ.A0B(userSession, 2);
        this.A01 = r8;
        this.A02 = userSession;
        C66307MMq mMq = new C66307MMq(this, 39);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66307MMq(new C66307MMq(r8, 36), 37));
        this.A07 = C66304MMn.A00(A002, new C66307MMq(A002, 38), mMq, DbS.A0z(C60244Ji1.class), 37);
        this.A04 = C66307MMq.A01(view, 33);
    }

    public static final void A00(C62257Kcr kcr, List list, 0sP r28) {
        C61177JyT jyT;
        String str;
        ViewModelListUpdate A0R = DbS.A0R();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            C62257Kcr kcr2 = kcr;
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C62876Knq knq = (C62876Knq) next;
                0sP r23 = r28;
                if (knq instanceof C62174KbW) {
                    C62174KbW kbW = (C62174KbW) knq;
                    String str2 = kbW.A02;
                    long j = (((long) i) + 1) * 20;
                    int i3 = kbW.A00;
                    if (i3 != 0) {
                        str = DbU.A05(kcr2.A01).getString(i3);
                    } else {
                        str = "";
                    }
                    0qQ.A0A(str);
                    jyT = new C61177JyT((ImageUrl) null, str2, (String) null, (String) null, (String) null, str, r23, j);
                } else if (knq instanceof C62175KbX) {
                    C62175KbX kbX = (C62175KbX) knq;
                    String str3 = kbX.A05;
                    ImageUrl imageUrl = kbX.A01;
                    String str4 = kbX.A06;
                    String str5 = str3;
                    String str6 = str4;
                    ImageUrl imageUrl2 = imageUrl;
                    jyT = new C61177JyT(imageUrl2, (String) null, str5, str6, kbX.A03, kbX.A04, r23, (((long) i) + 1) * 20);
                } else {
                    jyT = new C61177JyT((ImageUrl) null, (String) null, (String) null, (String) null, (String) null, "", r23, (((long) i) + 1) * 20);
                }
                A0r.add(jyT);
                i = i2;
            } else {
                A0R.A01(A0r);
                AnonymousClass0eM r6 = kcr2.A06;
                AnonymousClass4DH r3 = kcr2.A01;
                AnonymousClass2tC A0S = DbV.A0S(r3);
                0qQ.A0C(r3, Pxd.A00(3));
                ((RecyclerView) r6.getValue()).setAdapter(DbU.A0U(A0S, new C61668KGs(r3, kcr2.A02)));
                AnonymousClass2t9 r0 = ((RecyclerView) r6.getValue()).A0A;
                if (r0 != null) {
                    r0.A05(A0R);
                    return;
                }
                return;
            }
        }
    }

    public final void A03() {
        super.A03();
        C262204Co r0 = this.A00;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A00 = null;
        AnonymousClass7TE.A0c(this.A03).setOnClickListener((View.OnClickListener) null);
        AnonymousClass0eM r1 = this.A06;
        ((RecyclerView) r1.getValue()).A0b();
        ((RecyclerView) r1.getValue()).setAdapter((2Rw) null);
        ((RecyclerView) r1.getValue()).setLayoutManager((C252553pI) null);
    }

    public final void A04(Fragment fragment) {
        IgLiveViewerLikesViewModel igLiveViewerLikesViewModel;
        AnonymousClass0r6 r2;
        super.A04(fragment);
        AnonymousClass0eM r5 = this.A06;
        C60473Jm5.A00((RecyclerView) r5.getValue(), this, 19);
        03v.A0B(AnonymousClass7TE.A0c(r5), new C60078JfK(this, 7));
        AnonymousClass4DH r4 = this.A01;
        AnonymousClass2tC A0S = DbV.A0S(r4);
        0qQ.A0C(r4, Pxd.A00(3));
        ((RecyclerView) r5.getValue()).setAdapter(DbU.A0U(A0S, new C61668KGs(r4, this.A02)));
        DbV.A1A(r4.getContext(), (RecyclerView) r5.getValue());
        RecyclerView recyclerView = (RecyclerView) r5.getValue();
        if (recyclerView.A12.size() == 0) {
            recyclerView.A11(new C67831MvZ(AnonymousClass7TG.A03(r4.requireContext()), DbV.A05(r4).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), Dbb.A07(r4, R.dimen.abc_edit_text_inset_top_material)));
        }
        if (this.A00 == null) {
            C60244Ji1 A012 = A01();
            C262204Co r0 = null;
            if (!(!(A012 instanceof IgLiveViewerLikesViewModel) || (igLiveViewerLikesViewModel = (IgLiveViewerLikesViewModel) A012) == null || (r2 = igLiveViewerLikesViewModel.A09) == null)) {
                r0 = JTS.A0t(r4, MHB.A01(this, (AnonymousClass4D7) null, 3), r2);
            }
            this.A00 = r0;
        }
        LY5.A01(AnonymousClass7TE.A0c(this.A03), 52, this);
    }
}
