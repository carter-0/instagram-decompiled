package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientControllerLifecycleUtil;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class K6L extends AnonymousClass4DH implements AnonymousClass4DR, C268594df, C273494mf, C227272iw, C13677Tem, B1R {
    public static final String __redex_internal_original_name = "DirectPrivateStoryRecipientFragment";
    public UserSession A00;
    public FZ0 A01;
    public String A02;
    public RecyclerView A03;
    public 2el A04;
    public MTT A05;
    public DirectPrivateStoryRecipientController A06;

    public final int AqL() {
        return -1;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean COC() {
        return false;
    }

    public final boolean CPc() {
        return true;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        if (r1 != 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        if (r1 != 1) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r8) {
        /*
            r7 = this;
            r0 = 0
            r8.Etr(r0)
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r3 = r7.A06
            if (r3 == 0) goto L_0x0071
            r6 = 2131237906(0x7f081c12, float:1.8092076E38)
            boolean r0 = r3.A0u
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0072
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
            r8.Eom(r0)
            X.3JR r2 = X.DbS.A0K()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A02(r0)
            r1 = 5
            X.LYE r0 = new X.LYE
            r0.<init>((com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r3, (int) r1)
            X.DbX.A19(r0, r2, r8)
        L_0x0029:
            boolean r0 = r3.A0n
            if (r0 == 0) goto L_0x00b4
            r0 = 2131629680(0x7f0e1670, float:1.8886688E38)
            android.view.View r2 = r8.ETg(r0, r5, r5, r4)
            android.widget.TextView r1 = X.Dba.A06(r2)
            r0 = 2131973527(0x7f135597, float:1.9584092E38)
            r1.setText(r0)
            r0 = 2131429534(0x7f0b089e, float:1.8480743E38)
            android.widget.TextView r6 = X.DbU.A0G(r2, r0)
            r0 = 2131430824(0x7f0b0da8, float:1.848336E38)
            android.widget.TextView r2 = X.DbU.A0G(r2, r0)
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            r6.setText(r0)
            r0 = 2131956744(0x7f131408, float:1.9550052E38)
            r2.setText(r0)
            r1 = 3
            X.LYE r0 = new X.LYE
            r0.<init>((com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r6)
            r1 = 67
            X.FPI r0 = new X.FPI
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            r8.Etr(r4)
            r8.Eu4(r5)
        L_0x0071:
            return
        L_0x0072:
            java.lang.String r1 = r3.A0S
            java.lang.String r0 = "830547164036012"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ac
            r6 = 2131239025(0x7f082071, float:1.8094345E38)
            java.util.ArrayList r0 = r3.A0W
            if (r0 == 0) goto L_0x00aa
            int r2 = r0.size()
        L_0x0087:
            java.util.ArrayList r0 = r3.A0X
            if (r0 == 0) goto L_0x00a8
            int r1 = r0.size()
        L_0x008f:
            if (r2 != r4) goto L_0x00a0
            r0 = 2131967953(0x7f133fd1, float:1.9572787E38)
            if (r1 == 0) goto L_0x0099
        L_0x0096:
            r0 = 2131967952(0x7f133fd0, float:1.9572785E38)
        L_0x0099:
            r8.Eom(r0)
            r8.Etr(r4)
            goto L_0x0029
        L_0x00a0:
            if (r2 != 0) goto L_0x0096
            r0 = 2131967954(0x7f133fd2, float:1.9572789E38)
            if (r1 == r4) goto L_0x0099
            goto L_0x0096
        L_0x00a8:
            r1 = 0
            goto L_0x008f
        L_0x00aa:
            r2 = 0
            goto L_0x0087
        L_0x00ac:
            r0 = 2131960304(0x7f1321f0, float:1.9557273E38)
            r8.Eom(r0)
            goto L_0x0029
        L_0x00b4:
            r8.Eu4(r4)
            X.3JR r2 = X.DbS.A0K()
            r2.A01(r6)
            r1 = 6
            X.LYE r0 = new X.LYE
            r0.<init>((com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r3, (int) r1)
            X.DbX.A1A(r0, r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6L.configureActionBar(X.2da):void");
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final int Abe() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null) {
            return 0;
        }
        return directPrivateStoryRecipientController.A01;
    }

    public final View C4U() {
        return this.mView;
    }

    /* renamed from: CMx */
    public final float CoU() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null || !directPrivateStoryRecipientController.A0i) {
            return 0.6f;
        }
        return 1.0f;
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        C252553pI r0 = this.A03.A0D;
        r0.getClass();
        return C2808154f.A03((LinearLayoutManager) r0);
    }

    public final boolean onBackPressed() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null) {
            return false;
        }
        if (!directPrivateStoryRecipientController.A0k) {
            int i = 0;
            if (directPrivateStoryRecipientController.A0F.A08()) {
                i = -1;
            }
            DirectPrivateStoryRecipientController.A08(directPrivateStoryRecipientController, i, false);
            return true;
        }
        AnonymousClass4DH r1 = directPrivateStoryRecipientController.A0w;
        if (r1.getChildFragmentManager().A0M() <= 0) {
            return false;
        }
        r1.getChildFragmentManager().A0c();
        return true;
    }

    public final void onBottomSheetClosed() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController;
        MTT mtt = this.A05;
        if (mtt != null && (directPrivateStoryRecipientController = this.A06) != null) {
            mtt.DkH(this.A06.A0E(), directPrivateStoryRecipientController.A0F.A08());
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        MTT mtt = this.A05;
        if (mtt != null) {
            mtt.onBottomSheetPositionChanged(i, i2);
        }
        View view = this.mView;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController != null && view != null) {
            float A032 = AnonymousClass7TE.A03(view);
            float min = Math.min(1.0f, Math.max((A032 - ((float) i)) / A032, 0.0f));
            View view2 = directPrivateStoryRecipientController.A04;
            if (view2 != null) {
                if (min >= 0.2f) {
                    DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
                } else if (view2.getVisibility() != 8) {
                    directPrivateStoryRecipientController.A04.setVisibility(8);
                }
            }
            if (directPrivateStoryRecipientController.A0R == AnonymousClass05K.A00 && min < 1.0f) {
                directPrivateStoryRecipientController.A0i = false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v53, types: [X.KH6, X.11X] */
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        1OC A002;
        int i;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        RecyclerView A0I = DbT.A0I(view2, R.id.recipients_rv);
        this.A03 = A0I;
        DbV.A1B(getContext(), A0I);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController != null) {
            FrameLayout frameLayout = (FrameLayout) view2.requireViewById(R.id.recipients_list);
            ViewStub A0F = DbS.A0F(view2, R.id.bottom_sheet_drag_handle);
            RecyclerView A0I2 = DbT.A0I(frameLayout, R.id.recipients_rv);
            directPrivateStoryRecipientController.A06 = A0I2;
            if (directPrivateStoryRecipientController.A0k) {
                view2.setBackground((Drawable) null);
                AnonymousClass4DH r5 = directPrivateStoryRecipientController.A0w;
                FragmentActivity activity = r5.getActivity();
                DbT.A16(activity, frameLayout, 2Yu.A02(activity));
                if (directPrivateStoryRecipientController.A0r) {
                    A0F.getClass();
                    A0F.inflate();
                }
                if (directPrivateStoryRecipientController.A00 > 0.0f) {
                    0nA.A0V(view2, (int) (((float) 0nA.A05(r5.getContext())) * directPrivateStoryRecipientController.A00));
                }
            } else if (directPrivateStoryRecipientController.A0l) {
                A0I2.setBackground((Drawable) null);
            }
            directPrivateStoryRecipientController.mListContainer = frameLayout;
            List list = directPrivateStoryRecipientController.A1J;
            if (!(list == null || list.isEmpty() || list.get(0) == null)) {
                list.get(0);
            }
            M1D m1d = new M1D(directPrivateStoryRecipientController, 2);
            1Z9 A003 = C48920EmK.A00();
            UserSession userSession = directPrivateStoryRecipientController.A0B;
            Fragment fragment = directPrivateStoryRecipientController.A0w;
            ELU A012 = A003.A01(fragment, userSession, m1d);
            Context context = fragment.getContext();
            UserSession userSession2 = directPrivateStoryRecipientController.A0B;
            C273634mu r42 = directPrivateStoryRecipientController.A1I;
            C66574MXf mXf = directPrivateStoryRecipientController.A1G;
            C66574MXf mXf2 = directPrivateStoryRecipientController.A1F;
            C65635LxC lxC = directPrivateStoryRecipientController.A15;
            L1M l1m = directPrivateStoryRecipientController.A16;
            C65305Lqy lqy = directPrivateStoryRecipientController.A1C;
            L1N l1n = directPrivateStoryRecipientController.A17;
            C65305Lqy lqy2 = directPrivateStoryRecipientController.A1D;
            C65306Lqz lqz = directPrivateStoryRecipientController.A18;
            Lr0 lr0 = directPrivateStoryRecipientController.A19;
            L1O l1o = directPrivateStoryRecipientController.A1A;
            L1J l1j = directPrivateStoryRecipientController.A14;
            L1P l1p = directPrivateStoryRecipientController.A1B;
            L1H l1h = directPrivateStoryRecipientController.A12;
            boolean z = directPrivateStoryRecipientController.A0u;
            boolean z2 = directPrivateStoryRecipientController.A0c;
            boolean z3 = directPrivateStoryRecipientController.A0d;
            boolean z4 = directPrivateStoryRecipientController.A0e;
            boolean z5 = directPrivateStoryRecipientController.A0b;
            boolean z6 = directPrivateStoryRecipientController.A1L;
            C2355930l r15 = directPrivateStoryRecipientController.A09;
            MTF mtf = directPrivateStoryRecipientController.A0Q;
            C363008it r13 = directPrivateStoryRecipientController.A0P;
            L4U l4u = directPrivateStoryRecipientController.A0J;
            IngestSessionShim ingestSessionShim = directPrivateStoryRecipientController.A0D;
            C2355930l r18 = r15;
            Fragment fragment2 = fragment;
            UserSession userSession3 = userSession2;
            IngestSessionShim ingestSessionShim2 = ingestSessionShim;
            L1H l1h2 = l1h;
            L1J l1j2 = l1j;
            C65635LxC lxC2 = lxC;
            L1M l1m2 = l1m;
            L1N l1n2 = l1n;
            K9I k9i = new K9I(context, r18, fragment2, userSession3, ingestSessionShim2, l1h2, l1j2, lxC2, l1m2, l1n2, lqz, lr0, l1o, l1p, directPrivateStoryRecipientController, directPrivateStoryRecipientController, mXf, mXf2, lqy, lqy2, l4u, A012, directPrivateStoryRecipientController.A0L, directPrivateStoryRecipientController.A0N, r13, r42, mtf, directPrivateStoryRecipientController.A0Z, z, z2, z3, z4, z5, z6, directPrivateStoryRecipientController.A0l);
            directPrivateStoryRecipientController.A0H = k9i;
            k9i.setHasStableIds(true);
            String moduleName = fragment.getModuleName();
            Context context2 = fragment.getContext();
            UserSession userSession4 = directPrivateStoryRecipientController.A0B;
            MVT mvt = directPrivateStoryRecipientController.A1H;
            MTF mtf2 = directPrivateStoryRecipientController.A0Q;
            L1L l1l = new L1L(directPrivateStoryRecipientController);
            0xG A0O = DbS.A0O(moduleName);
            boolean A1V = AnonymousClass7TF.A1V(directPrivateStoryRecipientController.A1E);
            UserSession userSession5 = directPrivateStoryRecipientController.A0B;
            0Tu r12 = 0Tu.A05;
            UserSession userSession6 = userSession4;
            directPrivateStoryRecipientController.A0I = new K9B(context2, A0O, userSession6, l1h, l1l, directPrivateStoryRecipientController, mvt, mtf2, moduleName, A1V, DbY.A1Y(r12, userSession5, 36314811776961332L));
            C249503jt activity2 = fragment.getActivity();
            if (activity2 instanceof C249503jt) {
                viewGroup = (ViewGroup) ((BaseFragmentActivity) activity2).A0L.getValue();
            } else {
                viewGroup = (ViewGroup) view2;
            }
            K9B k9b = directPrivateStoryRecipientController.A0I;
            SearchController searchController = new SearchController(fragment.getActivity(), viewGroup, k9b, directPrivateStoryRecipientController.A0B, (C249383je) null, directPrivateStoryRecipientController, -1, -1, true);
            directPrivateStoryRecipientController.mSearchController = searchController;
            fragment.registerLifecycleListener(searchController);
            directPrivateStoryRecipientController.mSearchController.A07 = true;
            String str = "story_share_sheet";
            C336267eL A07 = C67562Mpw.A07(fragment.getContext(), directPrivateStoryRecipientController.A0B, new C228602lw(fragment.getContext(), AnonymousClass07i.A00(fragment)), "story_share_sheet", str, (String) null, AnonymousClass7TF.A0Y(r12, directPrivateStoryRecipientController.A0B, 36602230987821669L).intValue(), 0, true, directPrivateStoryRecipientController.A0m);
            directPrivateStoryRecipientController.A0O = A07;
            A07.EcJ(directPrivateStoryRecipientController);
            String str2 = "";
            directPrivateStoryRecipientController.A0O.EhX(str2);
            directPrivateStoryRecipientController.A06.setAdapter(directPrivateStoryRecipientController.A0H);
            directPrivateStoryRecipientController.A0H.A06();
            directPrivateStoryRecipientController.A06.A15(directPrivateStoryRecipientController);
            View inflate = LayoutInflater.from(fragment.getContext()).inflate(R.layout.direct_private_story_recipient_send_button, (ViewGroup) fragment.requireActivity().findViewById(16908290), false);
            directPrivateStoryRecipientController.A04 = inflate;
            IgdsButton A0b = DbU.A0b(inflate, R.id.send_button);
            directPrivateStoryRecipientController.A0K = A0b;
            AnonymousClass0fU.A00(new LYE(directPrivateStoryRecipientController, 4), A0b);
            directPrivateStoryRecipientController.A04.setVisibility(8);
            ((ViewGroup) fragment.requireActivity().findViewById(16908290)).addView(directPrivateStoryRecipientController.A04);
            1Ng A004 = AnonymousClass1Nd.A00(directPrivateStoryRecipientController.A0B);
            A004.A01(directPrivateStoryRecipientController, C64636LfO.class);
            A004.A01(directPrivateStoryRecipientController.A0x, C64625LfD.class);
            fragment.schedule(new KH6(directPrivateStoryRecipientController, 1));
            DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
            directPrivateStoryRecipientController.A06.setVerticalScrollBarEnabled(false);
            Context requireContext = fragment.requireContext();
            Resources resources = requireContext.getResources();
            int A0B = AnonymousClass7TE.A0B(resources);
            if (directPrivateStoryRecipientController.A0t) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                View A0F2 = DbY.A0F(view2, R.id.direct_private_share_message_view);
                0nA.A0h(A0F2, A0B, A0B);
                0nA.A0i(A0F2, dimensionPixelSize, dimensionPixelSize);
                View requireViewById = view2.requireViewById(R.id.direct_private_share_message_view_divider);
                DbU.A11(requireContext, requireViewById, R.drawable.elevated_searchbar_background);
                requireViewById.setVisibility(0);
                A0F2.setBackgroundResource(2Yu.A02(requireContext));
                EditText editText = (EditText) A0F2.requireViewById(R.id.direct_private_share_message_box);
                directPrivateStoryRecipientController.A05 = editText;
                editText.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                directPrivateStoryRecipientController.A05.setHint(2131960523);
                IgImageView A0Y = JTO.A0Y(JTP.A0H(DbU.A0D(view2, R.id.direct_private_share_write_message_thumbnail_stub), R.layout.direct_private_share_write_message_thumbnail_user_avatar), R.id.avatar_image_view);
                if (A0Y != null) {
                    DbU.A1S(fragment, A0Y, DbT.A0j(directPrivateStoryRecipientController.A0B));
                }
            }
            String str3 = directPrivateStoryRecipientController.A0S;
            if (str3 != null && str3.equals("830547164036012")) {
                View findViewById = view2.findViewById(R.id.avatar_image_view);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                View findViewById2 = view2.findViewById(R.id.direct_private_share_message_view_divider);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                RecyclerView A0I3 = DbT.A0I(DbY.A0F(view2, R.id.direct_private_share_media_container_stub), R.id.direct_share_media_container_recycler_view);
                A0I3.setLayoutManager(new C60371JkN(fragment.requireContext(), directPrivateStoryRecipientController));
                A0I3.setAdapter(new C67801Mv5(fragment, directPrivateStoryRecipientController.A0B, directPrivateStoryRecipientController.A0V, directPrivateStoryRecipientController.A0W, directPrivateStoryRecipientController.A0X));
                A0I3.setVisibility(0);
            }
            if (directPrivateStoryRecipientController.A0s && !TextUtils.isEmpty(directPrivateStoryRecipientController.A0T)) {
                C329897Kq r132 = new C329897Kq(requireContext, DbU.A0D(view2, R.id.direct_private_share_link_preview_stub));
                OWT A005 = C70174NyS.A00(requireContext, directPrivateStoryRecipientController.A0B);
                N2L A006 = A005.A00(directPrivateStoryRecipientController.A0T);
                if (A006 != null) {
                    r132.A02(A006.A07, A006.A06, A006.A09);
                } else {
                    directPrivateStoryRecipientController.A0z.A02(A005.A01.A0T(C60340gF.A00).A0L(new C72027Ov1(3, directPrivateStoryRecipientController, A005)).A0N(new C67018Mgr(0)).A0H().A0P(C318146oT.A01), new M1T(r132, 5));
                }
            }
            if (directPrivateStoryRecipientController.A0q) {
                TextView textView = (TextView) DbY.A0F(view2, R.id.direct_share_sheet_logged_in_as_label_stub);
                Dbb.A0m(requireContext.getResources(), textView, DbU.A0n(directPrivateStoryRecipientController.A0B, AnonymousClass0t1.A01), 2131959669);
                0nA.A0p(textView, new M7P(textView, directPrivateStoryRecipientController));
            }
            C299935wF A007 = C363388je.A00(directPrivateStoryRecipientController.A0B).A00(CallerContext.A01("DirectPrivateStoryRecipientController"));
            if (C363388je.A03(A007)) {
                UserSession userSession7 = directPrivateStoryRecipientController.A0B;
                0qQ.A0B(userSession7, 0);
                if (AnonymousClass7TF.A0Q(userSession7).A0U().contains(C367098qB.STORY_PRODUCT_SWIPEUP) || AnonymousClass7TF.A0Q(userSession7).A0U().contains(C367098qB.STORY_MULTI_PRODUCT_SWIPEUP) || AnonymousClass7TF.A0Q(userSession7).A0U().contains(C367098qB.STORY_SHOP_SWIPEUP) || AnonymousClass7TF.A0Q(userSession7).A0U().contains(C367098qB.STORY_COLLECTION_SWIPEUP) || AnonymousClass7TF.A0Q(userSession7).A0U().contains(C367098qB.STORY_INCENTIVE_SWIPEUP)) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    boolean z7 = false;
                    if (!(list == null || list.isEmpty() || list.get(0) == null)) {
                        AnonymousClass3Q2 r8 = (AnonymousClass3Q2) list.get(0);
                        List list2 = r8.A4b;
                        AnonymousClass3WT r3 = AnonymousClass3WT.PRODUCT;
                        if (AnonymousClass497.A00(r3, list2) != null) {
                            A1C.add(AnonymousClass497.A00(r3, r8.A4b).A0I().A0H);
                        }
                        if (!AnonymousClass4KJ.A00(r8.A4Z) && JTO.A0j(r8.A4Z).A05 != null) {
                            ReelProductLink reelProductLink = JTO.A0j(r8.A4Z).A05;
                            0qQ.A0B(reelProductLink, 0);
                            ProductDetailsProductItemDict productDetailsProductItemDict = reelProductLink.A00;
                            Product product = null;
                            if (productDetailsProductItemDict != null) {
                                product = new Product((TaggingFeedSessionInformation) null, productDetailsProductItemDict);
                            }
                            String str4 = product.A0H;
                            if (str4 != null) {
                                A1C.add(str4);
                            }
                        }
                        if (!AnonymousClass4KJ.A00(r8.A4Z) && JTO.A0j(r8.A4Z).A03 != null) {
                            z7 = true;
                        }
                    }
                    if (!A1C.isEmpty() || z7) {
                        if (C363388je.A02(A007)) {
                            str2 = A007.A03;
                        }
                        LA1 la1 = new LA1(fragment.getContext(), AnonymousClass07i.A00(fragment), directPrivateStoryRecipientController.A0B, directPrivateStoryRecipientController.A13, str2);
                        if (!A1C.isEmpty() && z7) {
                            2IS A042 = C41845B3m.A04();
                            ImmutableList copyOf = ImmutableList.copyOf((Collection) A1C);
                            A042.A05("product_ids", copyOf);
                            boolean A1V2 = AnonymousClass7TF.A1V(copyOf);
                            boolean A1Z = C41848B3p.A1Z(A042, "page_id", la1.A05);
                            17k.A0E(A1V2);
                            17k.A0E(A1Z);
                            A002 = C46479Dfi.A00(new C239113Fa(A042, C60840Js9.class, "FBProductAndShopCrossTaggingEligibility", false), la1.A03);
                            i = 37;
                        } else if (!A1C.isEmpty()) {
                            la1.A00 = AnonymousClass05K.A00;
                            2IS A043 = C41845B3m.A04();
                            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A1C);
                            A043.A05("product_ids", copyOf2);
                            boolean A1V3 = AnonymousClass7TF.A1V(copyOf2);
                            boolean A1Z2 = C41848B3p.A1Z(A043, "page_id", la1.A05);
                            17k.A0E(A1V3);
                            17k.A0E(A1Z2);
                            A002 = C46479Dfi.A00(new C239113Fa(A043, C60842JsB.class, "FBProductCrossTaggingEligibility", false), la1.A03);
                            i = 35;
                        } else if (z7) {
                            2IS A044 = C41845B3m.A04();
                            17k.A0E(C41848B3p.A1Z(A044, "page_id", la1.A05));
                            A002 = C46479Dfi.A00(new C239113Fa(A044, C60844JsD.class, "FBShopCrossTaggingEligibility", false), la1.A03);
                            i = 36;
                        }
                        C61500KAf.A00(A002, la1, i);
                        1ES.A00(la1.A01, la1.A02, A002);
                    }
                }
            }
            OW3 ow3 = new OW3(directPrivateStoryRecipientController.A0B, requireContext);
            if (ow3.A01()) {
                FragmentActivity activity3 = fragment.getActivity();
                activity3.getClass();
                0hq supportFragmentManager = activity3.getSupportFragmentManager();
                Fragment A0R = supportFragmentManager.A0R(Pxd.A00(53));
                if (A0R instanceof BottomSheetFragment) {
                    0s1 r1 = new 0s1(supportFragmentManager);
                    r1.A0M(A0R);
                    r1.A00();
                }
                ow3.A00(new M47(directPrivateStoryRecipientController));
            }
        }
        2el r2 = this.A04;
        if (r2 != null) {
            r2.A06(this.A03, AnonymousClass3DZ.A00(this));
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final int AhP(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Object A002;
        super.onActivityResult(i, i2, intent);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null) {
            return;
        }
        if (i != 2001) {
            if (i == 2002) {
                directPrivateStoryRecipientController.A0H.A06();
            }
        } else if (i2 == -1) {
            intent.getClass();
            DirectShareTarget directShareTarget = (DirectShareTarget) intent.getParcelableExtra(AnonymousClass000.A00(530));
            if (directShareTarget != null) {
                directPrivateStoryRecipientController.A0v.put(directShareTarget, intent.getStringExtra(AnonymousClass000.A00(531)));
            }
            K9I k9i = directPrivateStoryRecipientController.A0H;
            Map map = k9i.A0b;
            int size = map.size();
            Map map2 = k9i.A0c;
            if (size + map2.size() < 50) {
                LinkedList linkedList = k9i.A0Z;
                Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next.equals(directShareTarget)) {
                        linkedList.remove(next);
                        break;
                    }
                }
                linkedList.add(0, directShareTarget);
                List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
                if (unmodifiableList.size() == 1) {
                    A002 = ((PendingRecipient) unmodifiableList.get(0)).getId();
                } else {
                    map2 = map;
                    A002 = directShareTarget.A00();
                }
                map2.put(A002, directShareTarget);
                directPrivateStoryRecipientController.A0H.A06();
            } else {
                UserSession userSession = directPrivateStoryRecipientController.A0B;
                AnonymousClass4DH r2 = directPrivateStoryRecipientController.A0w;
                Context context = r2.getContext();
                AnonymousClass7TG.A1N(userSession, context);
                C59689JTv.A07(context, 2131960409);
                C3265677h.A0M(r2, userSession);
            }
            DirectPrivateStoryRecipientController.A05(directPrivateStoryRecipientController);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0262, code lost:
        if (r10 != 1) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x02f8, code lost:
        if (X.C70174NyS.A00(r3.requireContext().getApplicationContext(), r10.A0B).A02(r10.A0T) == false) goto L_0x02fa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = -1951596126(0xffffffff8bad01a2, float:-6.663963E-32)
            int r6 = X.AnonymousClass0fD.A02(r0)
            r2 = r20
            r0 = r21
            X.K6L.super.onCreate(r0)
            android.os.Bundle r3 = r2.requireArguments()
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r2)
            r2.A00 = r0
            X.2el r0 = X.2el.A00()
            r2.A04 = r0
            r0 = 222(0xde, float:3.11E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            r0 = 3012(0xbc4, float:4.221E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r3.getString(r1, r0)
            r2.A02 = r0
            com.instagram.common.session.UserSession r1 = r2.A00
            X.0xG r0 = X.DbS.A0O(r0)
            X.FZ0 r0 = X.C49757F5i.A00(r0, r1)
            r2.A01 = r0
            r0.A03()
            X.FZ0 r0 = r2.A01
            X.OEC r0 = r0.A0F
            X.02m r1 = r0.A01
            r0 = 276892616(0x10810bc8, float:5.089968E-29)
            r1.markerStart(r0)
            java.lang.String r9 = "bundle_share_text"
            java.lang.String r5 = ""
            java.lang.String r8 = r3.getString(r9, r5)
            java.lang.String r1 = "DirectPrivateStoryRecipientFragment.DIRECT_STORY_RECIPIENT_FRAGMENT_EXTERNAL_SHARE_APP_ID"
            java.lang.String r10 = r3.getString(r1, r5)
            X.FZ0 r0 = r2.A01
            if (r0 == 0) goto L_0x007a
            java.lang.String r7 = r0.A07
            if (r7 == 0) goto L_0x007a
        L_0x0061:
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0wc r4 = X.AnonymousClass0kN.A01(r2, r0)
            r0 = 3971(0xf83, float:5.565E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r0)
            if (r8 == 0) goto L_0x00d0
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00d0
            goto L_0x007c
        L_0x007a:
            r7 = r5
            goto L_0x0061
        L_0x007c:
            android.net.Uri r8 = X.0cp.A03(r8)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            r0 = 4693(0x1255, float:6.576E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            java.lang.String r10 = r8.getQueryParameter(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            if (r10 == 0) goto L_0x0115
            r0 = 306(0x132, float:4.29E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            boolean r0 = r10.equals(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            if (r0 == 0) goto L_0x0115
            r0 = 4767(0x129f, float:6.68E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            r8.getQueryParameter(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            java.lang.String r11 = "mibextid"
            java.lang.String r10 = r8.getQueryParameter(r11)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            boolean r0 = r4.isSampled()     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = r2.A02     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            X.DbS.A1K(r4, r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            com.instagram.common.session.UserSession r0 = r2.A00     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            java.lang.String r0 = r0.A06     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            X.G9t.A1K(r4, r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            X.XSW r8 = X.XSW.A0C     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            java.lang.String r0 = "share_location"
            r4.A8M(r8, r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            r0 = 11
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            r4.AAJ(r0, r7)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            r4.AAJ(r11, r10)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            X.DbX.A1L(r4)     // Catch:{ NullPointerException | SecurityException | UnsupportedOperationException -> 0x0115 }
            goto L_0x0115
        L_0x00d0:
            java.lang.String r8 = "direct_recipient_picker"
            if (r10 == 0) goto L_0x0416
            java.lang.String r0 = "830547164036012"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0416
            com.instagram.common.session.UserSession r0 = r2.A00
            boolean r0 = X.C69903Nu5.A00(r0)
            if (r0 != 0) goto L_0x0416
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = r2.A02
            X.DbS.A1K(r4, r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            java.lang.String r0 = r0.A06
            X.G9t.A1K(r4, r0)
            X.XSW r10 = X.XSW.A0U
            java.lang.String r0 = "share_location"
            r4.A8M(r10, r0)
            r0 = 11
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4.AAJ(r0, r7)
            java.lang.String r0 = "share_origin"
            r4.AAJ(r0, r8)
            java.lang.String r7 = "MWA_SHARE_BAR"
            java.lang.String r0 = "referrer_origin"
            r4.AAJ(r0, r7)
        L_0x0112:
            X.DbX.A1L(r4)
        L_0x0115:
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_STORY_RECIPIENT_FRAGMENT_EXTERNAL_MEDIA_UPLOAD_METADATA"
            android.os.Parcelable r12 = r3.getParcelable(r0)
            com.instagram.common.gallery.metadata.MediaUploadMetadata r12 = (com.instagram.common.gallery.metadata.MediaUploadMetadata) r12
            X.2el r11 = r2.A04
            X.FZ0 r10 = r2.A01
            r0 = 912(0x390, float:1.278E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8 = 0
            boolean r15 = r3.getBoolean(r0, r8)
            r7 = 1
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r4 = new com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController
            r13 = r11
            r14 = r10
            r10 = r4
            r11 = r2
            r10.<init>(r11, r12, r13, r14, r15)
            r2.A06 = r4
            X.4DH r3 = r4.A0w
            android.os.Bundle r2 = r3.requireArguments()
            X.08y r0 = X.09i.A0A
            com.instagram.common.session.UserSession r0 = r0.A06(r2)
            r4.A0B = r0
            r0 = 222(0xde, float:3.11E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r8)
            r4.A0d = r0
            r0 = 436(0x1b4, float:6.11E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r8)
            r4.A0e = r0
            r0 = 915(0x393, float:1.282E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r7)
            r14 = 0
            if (r0 == 0) goto L_0x0412
            androidx.fragment.app.FragmentActivity r11 = r3.getActivity()
            com.instagram.common.session.UserSession r10 = r4.A0B
            X.30l r0 = new X.30l
            r0.<init>(r11, r10)
            r4.A09 = r0
        L_0x0178:
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_PINNED_ELEMENTS_AND_COUNT"
            java.lang.Object r0 = r2.get(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r4.A0Z = r0
            com.instagram.common.session.UserSession r10 = r4.A0B
            X.Lx9 r0 = new X.Lx9
            r0.<init>(r4, r7)
            X.8it r0 = X.LJr.A01(r10, r0)
            r4.A0P = r0
            boolean r10 = r0.A06()
            r0 = 25
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r10 = r2.getBoolean(r0, r10)
            X.8it r0 = r4.A0P
            r0.A04(r10)
            r0 = 917(0x395, float:1.285E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r8)
            r4.A0u = r0
            r0 = 435(0x1b3, float:6.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r8)
            r4.A0c = r0
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_FORCE_SHOW_DONE_BUTTON"
            boolean r0 = r2.getBoolean(r0, r8)
            r4.A0p = r0
            r0 = 913(0x391, float:1.28E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r8)
            r4.A0o = r0
            com.instagram.common.session.UserSession r0 = r4.A0B
            X.2HN r0 = X.2HM.A00(r0)
            X.2HR r0 = r0.A0y
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            r4.A0m = r0
            r0 = 59
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = (com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim) r0
            r4.A0D = r0
            r0 = 223(0xdf, float:3.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = (com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim) r0
            r4.A0E = r0
            r0 = 916(0x394, float:1.284E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r12 = r2.getString(r0)
            r0 = 911(0x38f, float:1.277E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r13 = r2.getString(r0)
            X.9cJ r11 = new X.9cJ
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r8
            r19 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A0N = r11
            r0 = 1147(0x47b, float:1.607E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r0 = r2.getParcelableArrayList(r0)
            r4.A0Y = r0
            r0 = 910(0x38e, float:1.275E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L_0x040c
            r0 = r14
        L_0x0239:
            r4.A0C = r0
            java.util.List r10 = r4.A0Y
            r11 = 0
            if (r10 == 0) goto L_0x0255
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0255
            java.lang.Object r0 = r10.get(r8)
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r0 = (com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo) r0
            int r10 = r0.A05
            if (r10 == r7) goto L_0x0408
            r0 = 2
            if (r10 != r0) goto L_0x0255
            X.1iA r11 = X.1iA.A0a
        L_0x0255:
            r4.A0M = r11
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = r4.A0D
            if (r0 == 0) goto L_0x0264
            java.util.List r0 = r0.A00
            int r10 = r0.size()
            r0 = 1
            if (r10 == r7) goto L_0x0265
        L_0x0264:
            r0 = 0
        L_0x0265:
            r4.A0b = r0
            java.lang.String r0 = "DirectPrivateStoryRecipientController.DIRECT_STORY_ORIGINAL_RECIPIENT"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            r4.A0L = r0
            r0 = 28
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r4.A0k = r0
            r0 = 2213(0x8a5, float:3.101E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r4.A0l = r0
            r10 = -1
            r0 = 2210(0x8a2, float:3.097E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r2.getInt(r0, r10)
            r4.A01 = r0
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_BOTTOM_SHEET_LAYOUT_HEIGHT_RATIO"
            float r0 = r2.getFloat(r0, r10)
            r4.A00 = r0
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHOW_BOTTOM_SHEET_DRAG_HANDLE"
            boolean r0 = r2.getBoolean(r0, r7)
            r4.A0r = r0
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHOW_MESSAGE_COMPOSER"
            boolean r0 = r2.getBoolean(r0, r8)
            r4.A0t = r0
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHOW_ACCOUNT_LABEL"
            boolean r0 = r2.getBoolean(r0, r8)
            r4.A0q = r0
            java.lang.String r0 = r2.getString(r1)
            r4.A0S = r0
            java.lang.String r0 = "DirectShareSheetFragment.DIRECT_SHARE_INCLUDE_CANCEL_COPY_TITLE_CTAS"
            boolean r0 = r2.getBoolean(r0)
            r4.A0n = r0
            java.lang.String r0 = r2.getString(r9)
            r4.A0T = r0
            com.instagram.common.session.UserSession r9 = r4.A0B
            X.0Tu r10 = X.0Tu.A05
            r0 = 36324595711684785(0x810d07000130b1, double:3.0351588232515946E-306)
            boolean r0 = X.DbY.A1Y(r10, r9, r0)
            if (r0 == 0) goto L_0x02fa
            java.lang.String r0 = r4.A0T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02fa
            android.content.Context r0 = r3.requireContext()
            android.content.Context r1 = r0.getApplicationContext()
            com.instagram.common.session.UserSession r0 = r4.A0B
            X.OWT r1 = X.C70174NyS.A00(r1, r0)
            java.lang.String r0 = r4.A0T
            boolean r1 = r1.A02(r0)
            r0 = 1
            if (r1 != 0) goto L_0x02fb
        L_0x02fa:
            r0 = 0
        L_0x02fb:
            r4.A0s = r0
            java.lang.String r0 = r4.A0T
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0334
            boolean r0 = r4.A0s
            if (r0 != 0) goto L_0x0321
            java.lang.String r0 = r4.A0T
            if (r0 == 0) goto L_0x0334
            int r1 = r0.length()
            r0 = 4
            if (r1 < r0) goto L_0x0334
            com.instagram.common.session.UserSession r9 = r4.A0B
            r0 = 2342165852579113488(0x20810b6f00072a10, double:4.067996812917228E-152)
            boolean r0 = X.DbY.A1Y(r10, r9, r0)
            if (r0 == 0) goto L_0x0334
        L_0x0321:
            android.content.Context r0 = r3.requireContext()
            android.content.Context r1 = r0.getApplicationContext()
            com.instagram.common.session.UserSession r0 = r4.A0B
            X.OWT r1 = X.C70174NyS.A00(r1, r0)
            java.lang.String r0 = r4.A0T
            r1.A01(r0)
        L_0x0334:
            java.lang.String r0 = "bundle_external_share_uris"
            java.util.ArrayList r0 = r2.getParcelableArrayList(r0)
            r4.A0V = r0
            if (r0 == 0) goto L_0x035a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x035a
            java.lang.String r0 = "bundle_external_share_mime_type"
            java.lang.String r5 = r2.getString(r0, r5)
            java.lang.String r12 = "image"
            boolean r0 = r5.startsWith(r12)
            if (r0 == 0) goto L_0x038f
            java.util.ArrayList r0 = r4.A0V
            java.util.ArrayList r0 = com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A01(r4, r0)
            r4.A0W = r0
        L_0x035a:
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.instagram.archive.intf.ArchivePendingUpload r0 = (com.instagram.archive.intf.ArchivePendingUpload) r0
            r4.A08 = r0
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = r4.A0D
            if (r0 == 0) goto L_0x0440
            java.util.List r5 = r4.A1J
            r5.clear()
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = r4.A0D
            java.util.List r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0379:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0440
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)
            com.instagram.common.session.UserSession r0 = r4.A0B
            X.3Q2 r0 = X.JTQ.A0M(r0, r1)
            if (r0 == 0) goto L_0x0379
            r5.add(r0)
            goto L_0x0379
        L_0x038f:
            java.lang.String r11 = "video"
            boolean r0 = r5.startsWith(r11)
            java.util.ArrayList r1 = r4.A0V
            if (r0 == 0) goto L_0x03ad
            X.Lc3 r0 = new X.Lc3
            r0.<init>(r5)
            java.util.List r0 = X.C256393vh.A02(r0, r1)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            java.util.ArrayList r0 = com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A02(r4, r0)
            r4.A0X = r0
            goto L_0x035a
        L_0x03ad:
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x035a
            java.lang.String r0 = "*/*"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x035a
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r1.iterator()
        L_0x03c7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03fa
            java.lang.Object r5 = r13.next()
            android.net.Uri r5 = (android.net.Uri) r5
            android.content.Context r0 = r3.requireContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = r0.getType(r5)
            if (r1 == 0) goto L_0x03c7
            boolean r0 = r1.startsWith(r12)
            if (r0 == 0) goto L_0x03eb
            r10.add(r5)
            goto L_0x03c7
        L_0x03eb:
            boolean r0 = r1.startsWith(r11)
            if (r0 == 0) goto L_0x03c7
            X.34S r0 = new X.34S
            r0.<init>(r5, r1)
            r9.add(r0)
            goto L_0x03c7
        L_0x03fa:
            java.util.ArrayList r0 = com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A01(r4, r10)
            r4.A0W = r0
            java.util.ArrayList r0 = com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A02(r4, r9)
            r4.A0X = r0
            goto L_0x035a
        L_0x0408:
            X.1iA r11 = X.1iA.A0Q
            goto L_0x0255
        L_0x040c:
            X.4yO r0 = X.C338817ia.A00(r0)
            goto L_0x0239
        L_0x0412:
            r4.A09 = r14
            goto L_0x0178
        L_0x0416:
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0115
            com.instagram.common.session.UserSession r0 = r2.A00
            boolean r0 = X.C69903Nu5.A00(r0)
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = r2.A02
            X.DbS.A1K(r4, r0)
            com.instagram.common.session.UserSession r0 = r2.A00
            java.lang.String r0 = r0.A06
            X.G9t.A1K(r4, r0)
            r0 = 11
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4.AAJ(r0, r7)
            java.lang.String r0 = "share_origin"
            r4.AAJ(r0, r8)
            goto L_0x0112
        L_0x0440:
            X.Lqh r1 = new X.Lqh
            r1.<init>(r4, r7)
            X.LRm r0 = new X.LRm
            r0.<init>(r1)
            r4.A0F = r0
            X.M1U r0 = new X.M1U
            r0.<init>(r4)
            r4.A0Q = r0
            r0 = 914(0x392, float:1.281E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L_0x04a5
            com.instagram.common.session.UserSession r1 = r4.A0B
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r0 = r4.A0D
            X.L4U r3 = new X.L4U
            r3.<init>(r1, r0)
            r4.A0J = r3
            X.L1K r1 = new X.L1K
            r1.<init>(r4)
            r0 = 6
            X.KAe r5 = new X.KAe
            r5.<init>(r0, r1, r3)
            com.instagram.common.session.UserSession r0 = r3.A01
            X.1NY r3 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "fb_dating/linked_fb_dating_account/"
            r3.A0A(r0)
            java.lang.Class<X.K1B> r1 = X.K1B.class
            java.lang.Class<X.LJ0> r0 = X.LJ0.class
            X.1OC r0 = X.DbT.A0R(r14, r3, r1, r0, r8)
            r0.A00 = r5
            X.1ES.A03(r0)
        L_0x048d:
            java.lang.String r0 = "bundle_extra_user_story_targets"
            java.util.ArrayList r1 = r2.getParcelableArrayList(r0)
            boolean r0 = X.AnonymousClass4KJ.A00(r1)
            if (r0 != 0) goto L_0x049e
            java.util.Set r0 = r4.A1K
            r0.addAll(r1)
        L_0x049e:
            r0 = -825577025(0xffffffffcecab1bf, float:-1.7003232E9)
            X.AnonymousClass0fD.A09(r0, r6)
            return
        L_0x04a5:
            r4.A0J = r14
            goto L_0x048d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6L.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-77714834);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_private_story_recipient_fragment_layout);
        AnonymousClass0fD.A09(1913991505, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(286998224);
        super.onDestroy();
        this.A06 = null;
        this.A05 = null;
        FZ0 fz0 = this.A01;
        if (fz0 != null) {
            fz0.A07();
        }
        AnonymousClass0fD.A09(1033734922, A022);
    }

    public final void onDestroyView() {
        int i;
        int A022 = AnonymousClass0fD.A02(1660712408);
        super.onDestroyView();
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null) {
            i = 731140063;
        } else {
            1Ng A002 = AnonymousClass1Nd.A00(directPrivateStoryRecipientController.A0B);
            A002.A02(directPrivateStoryRecipientController, C64636LfO.class);
            A002.A02(directPrivateStoryRecipientController.A0x, C64625LfD.class);
            A002.A02(directPrivateStoryRecipientController.A0y, C61149Jy0.class);
            directPrivateStoryRecipientController.A0O.DDU();
            AnonymousClass4DH r6 = directPrivateStoryRecipientController.A0w;
            r6.unregisterLifecycleListener(directPrivateStoryRecipientController.mSearchController);
            directPrivateStoryRecipientController.mSearchController.onDestroyView();
            View view = directPrivateStoryRecipientController.A04;
            C71392co r0 = C315596kB.A02;
            C294975nL.A00(view).A0G();
            DirectPrivateStoryRecipientControllerLifecycleUtil.cleanupReferences(directPrivateStoryRecipientController);
            ((ViewGroup) r6.requireActivity().findViewById(16908290)).removeView(directPrivateStoryRecipientController.A04);
            View view2 = directPrivateStoryRecipientController.A04;
            if (view2 != null) {
                view2.requireViewById(R.id.send_button).setOnClickListener((View.OnClickListener) null);
            }
            FZ0 fz0 = directPrivateStoryRecipientController.A1E;
            if (fz0 != null) {
                ArrayList A042 = directPrivateStoryRecipientController.A0F.A04(MXS.class);
                fz0.A0B(r6, directPrivateStoryRecipientController.A0M, r6.getModuleName(), directPrivateStoryRecipientController.A0U, A042);
            }
            directPrivateStoryRecipientController.A04 = null;
            directPrivateStoryRecipientController.A0v.clear();
            directPrivateStoryRecipientController.A0z.A01();
            i = 1776319665;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final void onPause() {
        int i;
        int A022 = AnonymousClass0fD.A02(516034368);
        K6L.super.onPause();
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A06;
        if (directPrivateStoryRecipientController == null) {
            i = -1432336406;
        } else {
            SearchController searchController = directPrivateStoryRecipientController.mSearchController;
            Integer num = searchController.A03;
            Integer num2 = AnonymousClass05K.A00;
            if (num != num2) {
                searchController.A01(num2, 0.0f, 0.0f, false);
            }
            directPrivateStoryRecipientController.A0F.A05();
            i = 833079740;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final void EcH(MTT mtt) {
        this.A05 = mtt;
    }
}
