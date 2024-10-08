package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ljp  reason: case insensitive filesystem */
public final class C64889Ljp implements 0mK {
    public final int A00;
    public final Object A01;

    public C64889Ljp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        String str;
        AnonymousClass51M A0f;
        FragmentActivity activity;
        AtomicBoolean atomicBoolean;
        Context requireContext;
        int i;
        Object[] objArr;
        Object valueOf;
        String string;
        switch (this.A00) {
            case 0:
                K61.A03((K61) this.A01, C41847B3o.A1E(obj));
                return;
            case 1:
                String str2 = (String) obj;
                0qQ.A0B(str2, 0);
                KUX kux = ((JY9) this.A01).A0M;
                if (kux != null) {
                    kux.A01(str2, false);
                    return;
                }
                return;
            case 2:
                String A1E = C41847B3o.A1E(obj);
                if (A1E.length() > 0) {
                    KUX kux2 = (KUX) this.A01;
                    int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                    kux2.A09.A04(A1E, kux2.A00);
                    kux2.A00 = -1;
                    return;
                }
                return;
            case 3:
                C71002OVz oVz = (C71002OVz) obj;
                0qQ.A0B(oVz, 0);
                ((C63925LDh) this.A01).A00(oVz);
                return;
            case 4:
                boolean A1a = AnonymousClass7TE.A1a(obj);
                str = "stackedTimelineViewModel";
                ClipsStackedTimelineFragment clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) this.A01;
                if (A1a) {
                    C60108Jfo jfo = clipsStackedTimelineFragment.A0h;
                    if (jfo != null) {
                        AnonymousClass2Fj r2 = jfo.A0B;
                        if (0qQ.A0K(r2.A02(), C361268fw.A00)) {
                            r2.A0B(C361338g4.A00);
                            Integer A0G = jfo.A0G();
                            if (A0G != null) {
                                ClipsCreationViewModel clipsCreationViewModel = jfo.A0E;
                                int intValue = A0G.intValue();
                                AnonymousClass831 A0K = JTQ.A0K(clipsCreationViewModel);
                                if (A0K != null && (A0f = JTO.A0f(A0K, intValue)) != null) {
                                    C266724aF r4 = new C266724aF(TimeUnit.MILLISECONDS, 0, (long) A0f.A0B());
                                    AnonymousClass861 r3 = jfo.A0K;
                                    String A0m = AnonymousClass7TG.A0m(A0G, AnonymousClass000.A00(4197), AnonymousClass7TE.A1A());
                                    0qQ.A0B(A0m, 0);
                                    JTP.A1A(r3.A0F, AnonymousClass7TE.A1L(A0m, r4));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    C60108Jfo jfo2 = clipsStackedTimelineFragment.A0h;
                    if (jfo2 != null) {
                        jfo2.A0U((Integer) null);
                        Context context = clipsStackedTimelineFragment.getContext();
                        if (context != null) {
                            C60108Jfo jfo3 = clipsStackedTimelineFragment.A0h;
                            if (jfo3 != null) {
                                ClipsStackedTimelineViewController clipsStackedTimelineViewController = clipsStackedTimelineFragment.A0F;
                                if (clipsStackedTimelineViewController == null) {
                                    str = "viewController";
                                    break;
                                } else {
                                    jfo3.A0N((int) (((float) clipsStackedTimelineViewController.A00) / JTS.A01(context, LQO.A00)));
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 5:
                String str3 = (String) obj;
                0qQ.A0B(str3, 0);
                GiphyClipsBrowserFragment giphyClipsBrowserFragment = (GiphyClipsBrowserFragment) this.A01;
                C60306Jj5 jj5 = giphyClipsBrowserFragment.A03;
                if (jj5 == null) {
                    str = "giphyBrowserViewModel";
                    break;
                } else {
                    jj5.A04(str3);
                    RecyclerView recyclerView = giphyClipsBrowserFragment.giphyClipsRecyclerView;
                    if (recyclerView != null) {
                        recyclerView.A0o(0);
                        return;
                    }
                    return;
                }
            case 6:
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                if (shareLaterFragment.mView != null && (activity = shareLaterFragment.getActivity()) != null && shareLaterFragment.isAdded() && !shareLaterFragment.mRemoving && !shareLaterFragment.mDetached) {
                    0qQ.A0A(activity);
                    if (!activity.isFinishing() && (atomicBoolean = shareLaterFragment.A09) != null && !atomicBoolean.getAndSet(true)) {
                        0mM r0 = shareLaterFragment.A01;
                        if (r0 != null) {
                            r0.A00();
                            DbU.A0L(shareLaterFragment, 2dZ.A0t).setIsLoading(false);
                            0qQ.A0A(shareLaterFragment.A04);
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            0wb.A03("configure_share_media", "XPosting Configure Targets are not set up correctly");
                            if (A1C.size() < 1) {
                                string = shareLaterFragment.requireContext().getString(2131972232);
                            } else {
                                ArrayList A1C2 = AnonymousClass7TE.A1C();
                                Iterator it = A1C.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    UserSession userSession = shareLaterFragment.A00;
                                    if (userSession == null) {
                                        str = "userSession";
                                        break;
                                    } else {
                                        HashSet A02 = AnonymousClass3EO.A00(userSession).A02();
                                        0tB A002 = AnonymousClass0BO.A00(userSession);
                                        List A05 = A002.A02.A05(userSession.A06);
                                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                                        for (Object next2 : A05) {
                                            if (next2 != null) {
                                                A1C3.add(next2);
                                            }
                                        }
                                        ArrayList A1C4 = AnonymousClass7TE.A1C();
                                        Iterator it2 = A1C3.iterator();
                                        while (it2.hasNext()) {
                                            User A0k = DbT.A0k(it2);
                                            if (!A02.contains(A0k.getId())) {
                                                A1C4.add(A0k);
                                            }
                                        }
                                        Iterator it3 = A1C4.iterator();
                                        while (it3.hasNext()) {
                                            User A0k2 = DbT.A0k(it3);
                                            if (DbV.A1Z(A0k2, next)) {
                                                A1C2.add(A0k2.getUsername());
                                            }
                                        }
                                    }
                                }
                                if (A1C2.size() == 1) {
                                    requireContext = shareLaterFragment.requireContext();
                                    i = 2131973676;
                                    objArr = new Object[]{A1C2.get(0)};
                                } else if (A1C2.size() == 2) {
                                    requireContext = shareLaterFragment.requireContext();
                                    i = 2131973679;
                                    objArr = new Object[]{A1C2.get(0), A1C2.get(1)};
                                } else {
                                    if (A1C2.size() == 3) {
                                        requireContext = shareLaterFragment.requireContext();
                                        i = 2131973677;
                                        objArr = new Object[3];
                                        objArr[0] = A1C2.get(0);
                                        objArr[1] = A1C2.get(1);
                                        valueOf = A1C2.get(2);
                                    } else {
                                        requireContext = shareLaterFragment.requireContext();
                                        i = 2131973675;
                                        objArr = new Object[3];
                                        objArr[0] = A1C2.get(0);
                                        objArr[1] = A1C2.get(1);
                                        valueOf = Integer.valueOf(A1C2.size() - 2);
                                    }
                                    objArr[2] = valueOf;
                                }
                                string = requireContext.getString(i, objArr);
                                0qQ.A0A(string);
                            }
                            0qQ.A0A(string);
                            C358248ab A0U = DbW.A0U(shareLaterFragment);
                            A0U.A09(2131973678);
                            A0U.A0q(string);
                            A0U.A0E(C64220LUk.A00);
                            DbT.A1V(A0U);
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                    return;
                }
                return;
            case 7:
                String A1E2 = C41847B3o.A1E(obj);
                C61841KOf A003 = C60102Jfi.A00((FollowersShareFragment) this.A01);
                A003.A05 = A1E2;
                MH9.A04(A003, A003.A0F, 34);
                return;
            case 8:
                String A1E3 = C41847B3o.A1E(obj);
                C64972LlB llB = (C64972LlB) this.A01;
                if (!A1E3.equals(llB.A00)) {
                    String A12 = DbV.A12(A1E3);
                    llB.A00 = A12;
                    llB.A02.filter(A12);
                    return;
                }
                return;
            default:
                AGt aGt = (AGt) this.A01;
                aGt.A02 = (List) obj;
                aGt.A04 = true;
                aGt.A01 = null;
                if (aGt.A00 == null) {
                    AGt.A01(aGt);
                    return;
                }
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
