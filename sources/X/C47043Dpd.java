package X;

import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.recommended.FollowListData;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.util.List;

/* renamed from: X.Dpd  reason: case insensitive filesystem */
public final class C47043Dpd extends C14072TpM {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C47043Dpd(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void A00(int i) {
        if (this.A00 == 0) {
            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) this.A02;
            igSegmentedTabLayout.A01 = igSegmentedTabLayout.A02;
            igSegmentedTabLayout.A02 = i;
        }
    }

    public final void A01(int i) {
        String str;
        boolean z;
        FollowListData followListData;
        String str2;
        String str3;
        if (this.A00 != 0) {
            UnifiedFollowFragment unifiedFollowFragment = (UnifiedFollowFragment) this.A02;
            List list = unifiedFollowFragment.A0L;
            if (list != null) {
                C46443Df5 df5 = (C46443Df5) list.get(i);
                unifiedFollowFragment.A0A = df5;
                if (unifiedFollowFragment.A0B != df5) {
                    UserSession A0l = AnonymousClass7TE.A0l(unifiedFollowFragment.A0U);
                    AnonymousClass4DH r4 = (AnonymousClass4DH) this.A01;
                    List list2 = unifiedFollowFragment.A0L;
                    if (list2 != null) {
                        switch (((C46443Df5) list2.get(i)).ordinal()) {
                            case 0:
                                str2 = C273654mx.A00(3400);
                                break;
                            case 1:
                                str2 = C273654mx.A00(3401);
                                break;
                            case 3:
                                str2 = "tap_mutual";
                                break;
                            case 4:
                                str2 = "tap_suggested_users";
                                break;
                            case 10:
                                str2 = "tap_members";
                                break;
                            case 11:
                                str2 = "tap_admins";
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                                str2 = "tap_blocked";
                                break;
                            case 13:
                                str2 = "tap_subscriptions";
                                break;
                            case 16:
                                str2 = "tap_spam_followers";
                                break;
                            default:
                                str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                                break;
                        }
                        C319986rY r6 = unifiedFollowFragment.A09;
                        if (r6 == null) {
                            str = "loggingFollowStatus";
                        } else {
                            String str4 = unifiedFollowFragment.A0H;
                            if (str4 == null) {
                                str = "profileUserId";
                            } else {
                                if (unifiedFollowFragment.A0Q) {
                                    str3 = "tab_header";
                                } else {
                                    str3 = "swipe";
                                }
                                C319976rX.A08(r4, A0l, r6, str2, str4, (String) null, (String) null, str3);
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                C46443Df5 df52 = unifiedFollowFragment.A0A;
                unifiedFollowFragment.A0B = df52;
                unifiedFollowFragment.A0Q = false;
                Fragment fragment = null;
                if (df52 != null) {
                    C46431Des des = unifiedFollowFragment.A0D;
                    if (des == null) {
                        str = "fragmentStateAdapter";
                    } else {
                        List list3 = unifiedFollowFragment.A0L;
                        if (list3 != null) {
                            int indexOf = list3.indexOf(df52);
                            SparseArray sparseArray = des.A00.A04;
                            if (sparseArray == null) {
                                str = "fragmentSparseArray";
                            } else {
                                fragment = (Fragment) sparseArray.get(indexOf);
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                if (fragment instanceof C46430Der) {
                    C46430Der der = (C46430Der) fragment;
                    der.A0X = true;
                    boolean A06 = 182.A06(0Tu.A06, DbU.A0W(der), 36329341650485309L);
                    FollowListData followListData2 = der.A0D;
                    if (followListData2 == null || !A06) {
                        z = false;
                    } else {
                        z = ((F2V) der.A0t.getValue()).A02.containsKey(new C61076JwE(followListData2.A00, followListData2.A02));
                    }
                    if (der.A0a && !der.A0V) {
                        C46434Dew dew = der.A0J;
                        if (dew == null) {
                            str = "paginationHelper";
                            0qQ.A0F(str);
                            throw AnonymousClass00P.createAndThrow();
                        } else if (!dew.isLoading()) {
                            if (!A06 || !z) {
                                if (der.isResumed()) {
                                    C46430Der.A0C(der);
                                }
                            }
                            followListData = der.A0D;
                            if (followListData != null && z) {
                                C61076JwE jwE = new C61076JwE(followListData.A00, followListData.A02);
                                AnonymousClass0eM r1 = der.A0t;
                                ListenableFuture listenableFuture = (ListenableFuture) ((F2V) r1.getValue()).A02.get(jwE);
                                if (((F2V) r1.getValue()).A02.containsKey(jwE) && listenableFuture != null) {
                                    C46430Der.A0F(der);
                                    C255183ti.A04(new FTO(3, jwE, der), listenableFuture, der.requireContext().getMainExecutor());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (!A06) {
                        return;
                    }
                    followListData = der.A0D;
                    if (followListData != null) {
                        return;
                    }
                    return;
                }
                return;
            }
            str = "tabs";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A02(int i, float f, int i2) {
        if (this.A00 == 0) {
            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) this.A02;
            int i3 = igSegmentedTabLayout.A02;
            if (i3 == 1 || (i3 == 2 && igSegmentedTabLayout.A01 == 1)) {
                C60066Jeq jeq = (C60066Jeq) this.A01;
                View childAt = jeq.getChildAt((int) Math.ceil((double) (((float) i) + f)));
                View childAt2 = jeq.getChildAt(i);
                float width = (float) ((igSegmentedTabLayout.getWidth() - childAt2.getWidth()) / 2);
                igSegmentedTabLayout.scrollTo((int) (((((float) childAt.getLeft()) - ((float) ((igSegmentedTabLayout.getWidth() - childAt.getWidth()) / 2))) * f) + ((1.0f - f) * (((float) childAt2.getLeft()) - width))), 0);
                jeq.onPageScrolled(i, f, i2);
            }
        }
    }
}
