package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.GcN  reason: case insensitive filesystem */
public final class C52770GcN extends AnonymousClass4DH implements C249763kK, C229122ms, AnonymousClass4DV, C232682uF, AnonymousClass4DR, C229132mt, C227252iu, AnonymousClass0j6, XBv, C59622JQq, AnonymousClass4DS, C21048XBp {
    public static final String __redex_internal_original_name = "SavedMediaGridFragment";
    public int A00;
    public C46329Dbx A01;
    public 1Ng A02;
    public UserSession A03;
    public C14227TsA A04;
    public HG5 A05;
    public C14074TpO A06;
    public HAH A07;
    public C324356z9 A08;
    public HMH A09;
    public H5L A0A;
    public C55653HlC A0B;
    public SavedCollection A0C;
    public C55968HqZ A0D;
    public EmptyStateView A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public AnonymousClass2uE A0I;
    public C55808Hno A0J;
    public AnonymousClass32Q A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final Handler A0P = new Handler();
    public final H50 A0Q = new H50(this, 18);
    public final C14005To7 A0R = new C14005To7();
    public final JR5 A0S = new IXU(this);
    public final C322776wO A0T = new C57404IaA(this, 1);
    public final AnonymousClass0eM A0U = AnonymousClass1YB.A00(new C58685Ivu(this, 25));
    public final IO4 A0V = new IO4((Object) this, 9);
    public final IO4 A0W = new IO4((Object) this, 10);
    public final 1wn A0X = new IO4((Object) this, 8);
    public final 1wn A0Y = new IO4((Object) this, 11);
    public final C20907X3y A0Z = new C19355WVw(this, 3);
    public final X41 A0a = new IRP(this, 0);
    public final HashMap A0b = AnonymousClass7TE.A1E();
    public final HashMap A0c = AnonymousClass7TE.A1E();

    /* JADX WARNING: type inference failed for: r0v28, types: [X.Hj6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r8.A03 == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.HE8 r8, X.C52770GcN r9, boolean r10, boolean r11, boolean r12) {
        /*
            r2 = 1
            java.lang.String r7 = "dataSource"
            if (r10 == 0) goto L_0x00bc
            X.HMH r1 = r9.A09
            if (r1 != 0) goto L_0x0013
            java.lang.String r7 = "savedFeedMode"
        L_0x000b:
            X.0qQ.A0F(r7)
        L_0x000e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0013:
            X.HMH r0 = X.HMH.COLLECTION_FEED
            if (r1 != r0) goto L_0x001c
            boolean r1 = r8.A03
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r9.A0O = r0
            r9.A03()
            if (r11 == 0) goto L_0x0039
            boolean r0 = r8.CPt()
            if (r0 == 0) goto L_0x0039
            boolean r0 = r9.isResumed()
            if (r0 == 0) goto L_0x0039
            android.content.Context r3 = r9.requireContext()
            long r0 = r8.A00
            X.FEJ.A01(r3, r0)
        L_0x0039:
            X.HG5 r0 = r9.A05
            if (r0 != 0) goto L_0x0040
            java.lang.String r7 = "selectStateProvider"
            goto L_0x000b
        L_0x0040:
            r0.A01()
            X.HAH r0 = r9.A07
            if (r0 == 0) goto L_0x000b
            java.util.List r0 = r0.A02
            r0.clear()
            com.instagram.common.session.UserSession r0 = r9.A03
            java.lang.String r1 = "userSession"
            if (r0 == 0) goto L_0x00a5
            X.2f5 r0 = X.C225892f5.A00(r0)
            int r0 = r0.A02()
            if (r0 <= 0) goto L_0x00bc
            com.instagram.common.session.UserSession r0 = r9.A03
            if (r0 == 0) goto L_0x00a5
            X.2f5 r5 = X.C225892f5.A00(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = r5.A05()
            java.util.Iterator r6 = r0.iterator()
        L_0x0070:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r3 = r6.next()
            X.Cvu r3 = (X.C45414Cvu) r3
            java.lang.Integer r1 = r3.A01
            if (r1 != 0) goto L_0x0082
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0082:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0070
            com.instagram.common.session.UserSession r0 = r5.A02
            X.1E8 r1 = X.1E7.A00(r0)
            java.lang.String r0 = r3.A04
            X.1Xj r1 = r1.A02(r0)
            if (r1 == 0) goto L_0x0070
            boolean r0 = r5.A0O(r1)
            if (r0 == 0) goto L_0x0070
            X.Hj6 r0 = new X.Hj6
            r0.<init>()
            r0.A00 = r1
            r4.add(r0)
            goto L_0x0070
        L_0x00a5:
            X.0qQ.A0F(r1)
            goto L_0x000e
        L_0x00aa:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r4)
            X.00v.A10(r0)
            X.HAH r1 = r9.A07
            if (r1 == 0) goto L_0x000b
            java.util.ArrayList r0 = r9.A02(r0)
            r1.A05(r0)
        L_0x00bc:
            java.util.HashMap r1 = r8.A00
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00c9
            java.util.HashMap r0 = r9.A0b
            r0.putAll(r1)
        L_0x00c9:
            java.util.List r0 = r8.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e1
            X.HAH r1 = r9.A07
            if (r1 == 0) goto L_0x000b
            java.util.List r0 = r8.A01
            X.0qQ.A07(r0)
            java.util.ArrayList r0 = r9.A02(r0)
            r1.A05(r0)
        L_0x00e1:
            com.instagram.save.model.SavedCollection r0 = r9.A0C
            java.lang.String r7 = "collection"
            if (r0 == 0) goto L_0x000b
            boolean r0 = r9.A0M
            if (r0 != 0) goto L_0x00ef
            if (r12 != 0) goto L_0x00ef
            r9.A0M = r2
        L_0x00ef:
            A06(r9)
            androidx.fragment.app.FragmentActivity r2 = r9.getActivity()
            if (r2 == 0) goto L_0x0105
            com.instagram.save.model.SavedCollection r0 = r9.A0C
            if (r0 == 0) goto L_0x000b
            X.HMw r1 = r0.A07
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 != r0) goto L_0x0105
            X.C51970G9q.A12(r2)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52770GcN.A05(X.HE8, X.GcN, boolean, boolean, boolean):void");
    }

    private final void A07(boolean z, boolean z2) {
        UserSession userSession;
        String str;
        Object[] objArr;
        String str2;
        C54380HAv hAv = new C54380HAv(this, 1, z2, z);
        C324356z9 r5 = this.A08;
        String str3 = "feedNetworkSource";
        String str4 = null;
        if (r5 != null) {
            if (!z) {
                str4 = r5.A03.A07;
            }
            HMH hmh = this.A09;
            str3 = "savedFeedMode";
            if (hmh != null) {
                if (!(hmh == HMH.ADD_TO_NEW_COLLECTION || hmh == HMH.ADD_TO_EXISTING_COLLECTION || hmh == HMH.ADD_TO_FAVORITES_COLLECTION || hmh == HMH.ADD_AND_CREATE_COLLECTION)) {
                    SavedCollection savedCollection = this.A0C;
                    str3 = "collection";
                    if (savedCollection != null) {
                        if (savedCollection.A07 != C54665HMw.ALL_MEDIA_AUTO_COLLECTION) {
                            boolean z3 = this.A0H;
                            String str5 = savedCollection.A0F;
                            userSession = this.A03;
                            if (z3) {
                                if (userSession != null) {
                                    objArr = new Object[]{str5};
                                    str2 = "feed/collection/%s/posts/";
                                }
                                0qQ.A0F("userSession");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            if (userSession != null) {
                                objArr = new Object[]{str5};
                                str2 = "feed/collection/%s/";
                            }
                            0qQ.A0F("userSession");
                            throw AnonymousClass00P.createAndThrow();
                            str = 0mp.A06(str2, objArr);
                            1NY A0b2 = AnonymousClass7TG.A0b(userSession);
                            A0b2.A0E = str;
                            C51972G9s.A18(A0b2, userSession, C56342Hwt.class);
                            A0b2.A0A = 002.A0R(str, str4);
                            A0b2.A03();
                            C3724090s.A06(A0b2, str4);
                            r5.A03(A0b2.A0M(), hAv);
                            return;
                        }
                    }
                }
                boolean z4 = this.A0H;
                userSession = this.A03;
                if (z4) {
                    if (userSession != null) {
                        str = "feed/saved/posts/";
                        1NY A0b22 = AnonymousClass7TG.A0b(userSession);
                        A0b22.A0E = str;
                        C51972G9s.A18(A0b22, userSession, C56342Hwt.class);
                        A0b22.A0A = 002.A0R(str, str4);
                        A0b22.A03();
                        C3724090s.A06(A0b22, str4);
                        r5.A03(A0b22.A0M(), hAv);
                        return;
                    }
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (userSession != null) {
                    str = "feed/saved/";
                    1NY A0b222 = AnonymousClass7TG.A0b(userSession);
                    A0b222.A0E = str;
                    C51972G9s.A18(A0b222, userSession, C56342Hwt.class);
                    A0b222.A0A = 002.A0R(str, str4);
                    A0b222.A03();
                    C3724090s.A06(A0b222, str4);
                    r5.A03(A0b222.A0M(), hAv);
                    return;
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0B() {
        if (!isLoading()) {
            if (CT5()) {
                0xI A002 = 0xI.A00(this, "action_bar_feed_retry");
                AnonymousClass6WL.A03(requireContext(), A002);
                UserSession userSession = this.A03;
                if (userSession == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                }
                DbU.A1R(A002, userSession);
            }
            this.A0F = AnonymousClass7TF.A0b();
            A07(true, true);
        }
    }

    public final void CgO() {
        A07(false, false);
    }

    public final void DJ3(1Xj r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        if (java.lang.Boolean.TRUE.equals(X.C51966G9m.A11(r9).A0K()) == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DJt(android.view.View r27, X.C296995qz r28, X.C296935qt r29, X.1Xj r30) {
        /*
            r26 = this;
            r2 = 2
            r0 = r28
            X.0qQ.A0B(r0, r2)
            r9 = r30
            if (r30 == 0) goto L_0x0057
            X.H5L r1 = r26.A0A()
            int r12 = r0.A01
            int r13 = r0.A00
            X.HG5 r3 = r1.A06
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0058
            java.lang.String r2 = r9.getId()
            if (r2 == 0) goto L_0x0147
            r0 = 0
            r3.A02(r0, r9, r2)
            X.4DH r0 = r1.A03
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            if (r2 == 0) goto L_0x0032
            X.Ihc r0 = new X.Ihc
            r0.<init>(r2, r1)
            r2.runOnUiThread(r0)
        L_0x0032:
            X.HsT r2 = r1.A01
            if (r2 == 0) goto L_0x0043
            java.util.LinkedHashMap r0 = r3.A02
            int r0 = r0.size()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            r2.A02(r0)
        L_0x0043:
            X.H15 r2 = r1.A0D
            if (r2 == 0) goto L_0x0057
            X.HsT r1 = r2.A0F
            if (r1 == 0) goto L_0x0057
            X.IaN r0 = r2.A0B
            boolean r0 = r0.A04()
            r1.A02(r0)
            X.Dbb.A0u(r2)
        L_0x0057:
            return
        L_0x0058:
            X.0iw r7 = r1.A04
            com.instagram.common.session.UserSession r8 = r1.A05
            com.instagram.save.model.SavedCollection r10 = r1.A0E
            r15 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r15, r7, r8)
            X.0qQ.A0B(r10, r2)
            r0 = 1480(0x5c8, float:2.074E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            X.I6U.A02(r7, r8, r9, r10, r11, r12, r13)
            X.HMH r2 = r1.A0B
            X.HMH r0 = X.HMH.SELECT_COVER_PHOTO
            if (r2 != r0) goto L_0x00bc
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = r9.getId()
            java.lang.String r0 = "cover_media_id"
            r3.putString(r0, r2)
            com.instagram.common.typedurl.ImageUrl r2 = r9.A1Q()
            java.lang.String r0 = "cover_media_url"
            r3.putParcelable(r0, r2)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r9)
            if (r0 == 0) goto L_0x00a2
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r9)
            java.lang.Boolean r0 = r0.A0K()
            boolean r0 = r2.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            java.lang.String r0 = "cover_media_is_private"
            r3.putBoolean(r0, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r2.putExtras(r3)
            X.4DH r0 = r1.A03
            X.DbX.A17(r2, r0)
            X.DbT.A1J(r0)
            r1.A02()
            return
        L_0x00bc:
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x00e6
            com.instagram.model.mediatype.ProductType r2 = r9.A1v()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IGTV
            if (r2 != r0) goto L_0x00e6
            java.lang.String r12 = r10.A0F
            X.HMw r3 = r10.A07
            int r2 = r3.ordinal()
            r0 = 3
            if (r2 == r0) goto L_0x0155
            if (r2 == r4) goto L_0x014c
            if (r2 == r15) goto L_0x014c
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "bad collection type"
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x00e6:
            X.GcN r7 = r1.A0C
            X.0hq r0 = r7.mFragmentManager
            boolean r0 = X.AnonymousClass06S.A01(r0)
            if (r0 == 0) goto L_0x0057
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            com.instagram.save.model.SavedCollection r2 = r7.A0C
            r4 = 0
            if (r2 != 0) goto L_0x0103
            java.lang.String r0 = "collection"
        L_0x00fb:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0103:
            X.6z9 r0 = r7.A08
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "feedNetworkSource"
            goto L_0x00fb
        L_0x010a:
            X.6zA r0 = r0.A03
            java.lang.String r0 = r0.A07
            com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig r1 = new com.instagram.save.contextualfeed.intf.SavedContextualFeedNetworkConfig
            r1.<init>(r2, r0)
            r0 = 4655(0x122f, float:6.523E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putParcelable(r0, r1)
            X.0jB r0 = r7.E4k()
            X.To7 r6 = r7.A0R
            r6.A02(r0)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            com.instagram.common.session.UserSession r0 = r7.A03
            if (r0 != 0) goto L_0x0130
            java.lang.String r0 = "userSession"
            goto L_0x00fb
        L_0x0130:
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            r0 = 285(0x11d, float:4.0E-43)
            java.lang.String r22 = X.C273654mx.A00(r0)
            java.lang.String r19 = "Saved"
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.HAH r0 = r7.A07
            if (r0 != 0) goto L_0x01ca
            java.lang.String r0 = "dataSource"
            goto L_0x00fb
        L_0x0147:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x014c:
            X.4DH r3 = r1.A03
            android.content.res.Resources r4 = X.DbV.A05(r3)
            java.lang.String r5 = "saved"
            goto L_0x0165
        L_0x0155:
            X.4DH r3 = r1.A03
            android.content.res.Resources r4 = X.DbV.A05(r3)
            r0 = 2819(0xb03, float:3.95E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = X.002.A0R(r0, r12)
        L_0x0165:
            X.Ki6 r2 = X.C62573Ki6.SAVED
            r0 = 2131964066(0x7f1330a2, float:1.9564903E38)
            java.lang.String r0 = r4.getString(r0)
            X.K1d r4 = new X.K1d
            r4.<init>(r2, r5, r0)
            java.lang.String r0 = r9.A30()
            r4.A07 = r0
            boolean r0 = X.C61292K1d.A00(r9)
            if (r0 == 0) goto L_0x01a3
            java.util.Map r2 = r4.A0F
            java.lang.String r0 = r9.getId()
            boolean r0 = r2.containsKey(r0)
            if (r0 != 0) goto L_0x01a3
            java.util.List r0 = r4.A0A
            r0.add(r15, r9)
            java.lang.String r0 = r9.getId()
            r2.put(r0, r9)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r8)
            X.Lfj r0 = new X.Lfj
            r0.<init>(r4)
            r2.A05(r0)
        L_0x01a3:
            java.lang.String r13 = X.AnonymousClass7TF.A0b()
            java.util.List r0 = r4.A0A
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            X.I6Y.A03(r3, r8, r13, r0)
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            X.4DU r10 = r1.A08
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_SAVED_TAB
            r11 = 0
            X.4h3 r7 = X.C51965G9l.A0i(r0, r8)
            r14 = r11
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            X.I6Y.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x01ca:
            java.util.Iterator r8 = r0.A03()
        L_0x01ce:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r1 = r8.next()
            X.5qt r1 = (X.C296935qt) r1
            boolean r0 = r1 instanceof X.C296965qw
            if (r0 == 0) goto L_0x01ce
            X.5qw r1 = (X.C296965qw) r1
            X.1Xj r0 = r1.BPf()
            java.lang.String r0 = X.C51970G9q.A0j(r0)
            r2.add(r0)
            goto L_0x01ce
        L_0x01ec:
            java.lang.String r21 = r9.getId()
            android.os.Bundle r14 = X.AnonymousClass7TE.A0a()
            r6.A01(r14)
            java.lang.String r23 = r7.getSessionId()
            instagram.features.feed.fragment.ContextualFeedFragment r1 = new instagram.features.feed.fragment.ContextualFeedFragment
            r1.<init>()
            r16 = r4
            r17 = r4
            r18 = r4
            r20 = r4
            r24 = r2
            r25 = r15
            r15 = r5
            android.os.Bundle r0 = X.C46424Del.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.setArguments(r0)
            X.Dba.A0w(r4, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52770GcN.DJt(android.view.View, X.5qz, X.5qt, X.1Xj):void");
    }

    public final /* synthetic */ void DK3(1Xj r1) {
    }

    public final /* synthetic */ void DK6(1Xj r1) {
    }

    public final /* synthetic */ void DQR(1Xj r1, Integer num, int i, int i2) {
    }

    public final /* synthetic */ void DQT(1Xj r1, Integer num, int i, int i2) {
    }

    public final void DVy() {
    }

    public final void DW7() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.Jbl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.Jbl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.Jbl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r10) {
        /*
            r9 = this;
            r3 = 0
            X.0qQ.A0B(r10, r3)
            boolean r0 = r9.isAdded()
            if (r0 == 0) goto L_0x012a
            r10.ErT(r9)
            r0 = 1
            r4 = 6
            r10.Eu4(r0)
            X.HG5 r0 = r9.A05
            java.lang.String r8 = "selectStateProvider"
            if (r0 == 0) goto L_0x0092
            boolean r0 = r0.A01
            java.lang.String r2 = "collection"
            if (r0 == 0) goto L_0x0037
            com.instagram.save.model.SavedCollection r0 = r9.A0C
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r0.A0F
            if (r0 == 0) goto L_0x002c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0034
        L_0x002c:
            X.0eM r0 = r9.A0U
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0037
        L_0x0034:
            X.Dbc.A0k(r10)
        L_0x0037:
            X.HG5 r1 = r9.A05
            if (r1 == 0) goto L_0x0092
            boolean r0 = r1.A01
            java.lang.String r7 = "savedFeedMode"
            if (r0 == 0) goto L_0x009a
            java.util.LinkedHashMap r0 = r1.A02
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x009a
            android.content.res.Resources r6 = X.DbV.A05(r9)
            r5 = 2131820945(0x7f110191, float:1.927462E38)
            X.HG5 r2 = r9.A05
            if (r2 == 0) goto L_0x0092
            java.util.LinkedHashMap r0 = r2.A02
            int r1 = r0.size()
            java.util.LinkedHashMap r0 = r2.A02
            int r0 = r0.size()
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = r6.getQuantityString(r5, r1, r0)
        L_0x0068:
            r10.setTitle(r0)
        L_0x006b:
            X.HMH r2 = r9.A09
            if (r2 == 0) goto L_0x00ce
            int r1 = r2.ordinal()
            if (r1 == r4) goto L_0x010d
            r0 = 4
            if (r1 == r0) goto L_0x0115
            r0 = 3
            if (r1 == r0) goto L_0x00f6
            r0 = 5
            if (r1 == r0) goto L_0x0115
            if (r1 != r3) goto L_0x012a
            X.HMH r0 = X.HMH.COLLECTION_FEED
            if (r2 != r0) goto L_0x012a
            X.HG5 r0 = r9.A05
            if (r0 == 0) goto L_0x0092
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x012a
            X.HqZ r0 = r9.A0D
            if (r0 != 0) goto L_0x00d6
            java.lang.String r8 = "optionsActionSheet"
        L_0x0092:
            X.0qQ.A0F(r8)
        L_0x0095:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009a:
            X.HMH r0 = r9.A09
            if (r0 == 0) goto L_0x00ce
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x00a6;
                case 2: goto L_0x00ad;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00b4;
                case 5: goto L_0x00b4;
                case 6: goto L_0x00b4;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            goto L_0x006b
        L_0x00a6:
            com.instagram.save.model.SavedCollection r0 = r9.A0C
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r0.A0G
            goto L_0x0068
        L_0x00ad:
            r0 = 2131972536(0x7f1351b8, float:1.9582082E38)
            r10.Eom(r0)
            goto L_0x006b
        L_0x00b4:
            android.content.Context r1 = r9.requireContext()
            r0 = 2131972534(0x7f1351b6, float:1.9582078E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131972603(0x7f1351fb, float:1.9582218E38)
            java.lang.String r0 = r1.getString(r0)
            r10.EfN(r2, r0)
            goto L_0x006b
        L_0x00ce:
            X.0qQ.A0F(r7)
            goto L_0x0095
        L_0x00d2:
            X.0qQ.A0F(r2)
            goto L_0x0095
        L_0x00d6:
            X.JR5 r2 = r0.A02
            com.instagram.save.model.SavedCollection r0 = r2.Aog()
            if (r0 == 0) goto L_0x012a
            X.HMw r1 = r0.A07
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 != r0) goto L_0x00ea
            boolean r0 = r2.CJz()
            if (r0 == 0) goto L_0x012a
        L_0x00ea:
            X.3JR r1 = X.DbS.A0K()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A02(r0)
            r0 = 56
            goto L_0x0105
        L_0x00f6:
            X.3JR r1 = X.DbS.A0K()
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            java.lang.String r0 = r9.getString(r0)
            r1.A0K = r0
            r0 = 55
        L_0x0105:
            X.ICz r0 = X.C56802ICz.A00(r9, r0)
            X.DbX.A19(r0, r1, r10)
            return
        L_0x010d:
            X.Jbl r1 = new X.Jbl
            r1.<init>()
            r0 = 53
            goto L_0x011c
        L_0x0115:
            X.Jbl r1 = new X.Jbl
            r1.<init>()
            r0 = 54
        L_0x011c:
            X.ICz r0 = X.C56802ICz.A00(r9, r0)
            r1.A01 = r0
            X.JbT r0 = new X.JbT
            r0.<init>(r1)
            r10.ErM(r0)
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52770GcN.configureActionBar(X.2da):void");
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        DiscoveryRecyclerView discoveryRecyclerView;
        HE8 he8;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A09().A05(view, isLoading());
        A09().A06(this);
        C55808Hno hno = this.A0J;
        ViewParent viewParent = null;
        if (hno == null) {
            str = "feedPillHelper";
        } else {
            C56802ICz A002 = C56802ICz.A00(this, 58);
            ViewStub viewStub = (ViewStub) AnonymousClass7TE.A0b(view, R.id.feed_pill_stub);
            hno.A00 = A002;
            ViewGroup.MarginLayoutParams A0G2 = DbX.A0G(viewStub);
            Context context = hno.A02;
            A0G2.setMargins(0, 0, 0, C51972G9s.A08(context));
            viewStub.setLayoutResource(R.layout.feed_pill);
            IgTextView A0a2 = DbT.A0a(viewStub.inflate(), R.id.feed_pill);
            hno.A01 = A0a2;
            if (A0a2 != null) {
                AnonymousClass0fU.A00(hno.A00, A0a2);
            }
            IgTextView igTextView = hno.A01;
            if (igTextView != null) {
                C59971Jcg jcg = new C59971Jcg(context.getColor(R.color.badge_color));
                RectF rectF = 0nA.A01;
                igTextView.setBackground(jcg);
            }
            AnonymousClass7TH.A0R(hno.A01);
            EmptyStateView A012 = A01();
            this.A0E = A012;
            C56802ICz.A01(A012, 59, this);
            EmptyStateView emptyStateView = this.A0E;
            if (emptyStateView != null) {
                emptyStateView.A0H();
            }
            A06(this);
            HMH hmh = this.A09;
            str = "savedFeedMode";
            if (hmh != null) {
                if (hmh == HMH.COLLECTION_FEED) {
                    A09().A04.getClass();
                    H5L A0A2 = A0A();
                    DiscoveryRecyclerView discoveryRecyclerView2 = A09().A04;
                    if (discoveryRecyclerView2 != null) {
                        viewParent = discoveryRecyclerView2.getParent();
                    }
                    viewParent.getClass();
                    ViewGroup viewGroup = (ViewGroup) viewParent;
                    LinearLayout linearLayout = (LinearLayout) DbV.A0D(viewGroup).inflate(R.layout.save_collection_bulk_edit_actions, viewGroup, true).requireViewById(R.id.bulk_actions_container);
                    0qQ.A0B(linearLayout, 1);
                    C56080HsT hsT = new C56080HsT(linearLayout, false);
                    A0A2.A01 = hsT;
                    hsT.A01(A0A2.A03.requireContext(), A0A2.A0E.A07, A0A2);
                } else if (hmh == HMH.ADD_TO_NEW_COLLECTION || hmh == HMH.ADD_TO_EXISTING_COLLECTION || hmh == HMH.ADD_TO_FAVORITES_COLLECTION || hmh == HMH.ADD_AND_CREATE_COLLECTION) {
                    A0A().A01();
                }
                if (this.A0N) {
                    this.A0N = false;
                    UserSession userSession = this.A03;
                    if (userSession == null) {
                        str = "userSession";
                    } else {
                        LinkedList linkedList = ((C57095IOj) userSession.A01(C57095IOj.class, C58486Ish.A00)).A01;
                        if (linkedList.isEmpty() || (he8 = (HE8) linkedList.remove(0)) == null) {
                            throw AnonymousClass7TE.A0y();
                        }
                        A05(he8, this, true, false, true);
                        C324356z9 r1 = this.A08;
                        if (r1 == null) {
                            str = "feedNetworkSource";
                        } else {
                            String str2 = he8.A01;
                            C324366zA r12 = r1.A03;
                            r12.A07 = str2;
                            r12.A0A = true;
                            r12.A03 = AnonymousClass05K.A0C;
                            C14074TpO.A00(A09(), false, true);
                            C46329Dbx dbx = this.A01;
                            if (dbx == null) {
                                str = "navigationPerfLogger";
                            } else {
                                dbx.A00.A02();
                            }
                        }
                    }
                }
                1Ng r2 = this.A02;
                if (r2 == null) {
                    str = "igEventBus";
                } else {
                    r2.A01(this.A0V, AnonymousClass3DT.class);
                    if (this.A0L && (discoveryRecyclerView = A09().A04) != null) {
                        discoveryRecyclerView.setPadding(0, 0, 0, DbS.A02(requireContext(), 64));
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final C296935qt A00(1Xj r5) {
        HashMap hashMap = this.A0c;
        C296935qt r2 = (C296935qt) hashMap.get(r5);
        if (r2 != null) {
            return r2;
        }
        HAY hay = new HAY(C296895qp.A02(1, 1), r5, (User) this.A0b.get(r5.A30()));
        hashMap.put(r5, hay);
        return hay;
    }

    private final EmptyStateView A01() {
        C320156rr r4;
        ViewParent viewParent;
        if (this.A0E == null) {
            float f = NestedScrollView.A0T;
            EmptyStateView emptyStateView = new EmptyStateView(requireContext());
            emptyStateView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (A08(this)) {
                r4 = C320156rr.EMPTY;
                emptyStateView.A0T(r4, 2131972551);
                Resources A052 = DbV.A05(this);
                SavedCollection savedCollection = this.A0C;
                if (savedCollection != null) {
                    emptyStateView.A0V(r4, AnonymousClass7TF.A0e(A052, savedCollection.A0G, 2131972548));
                    SavedCollection savedCollection2 = this.A0C;
                    if (savedCollection2 != null) {
                        if (savedCollection2.A07 == C54665HMw.MEDIA) {
                            emptyStateView.A0Q(r4, 2131972535);
                            emptyStateView.A0O(this.A0T, r4);
                        }
                    }
                }
                0qQ.A0F("collection");
                throw AnonymousClass00P.createAndThrow();
            }
            r4 = C320156rr.EMPTY;
            emptyStateView.A0T(r4, 2131972529);
            emptyStateView.A0S(r4, 2131972528);
            C56802ICz A002 = C56802ICz.A00(this, 57);
            emptyStateView.A0R(r4, R.drawable.empty_state_save);
            C320156rr r0 = C320156rr.ERROR;
            emptyStateView.A0R(r0, R.drawable.loadmore_icon_refresh_compound);
            emptyStateView.A0N(A002, r0);
            this.A0E = emptyStateView;
            A09().A04.getClass();
            DiscoveryRecyclerView discoveryRecyclerView = A09().A04;
            if (discoveryRecyclerView != null) {
                viewParent = discoveryRecyclerView.getParent();
            } else {
                viewParent = null;
            }
            viewParent.getClass();
            ((ViewGroup) viewParent).addView(this.A0E);
        }
        EmptyStateView emptyStateView2 = this.A0E;
        if (emptyStateView2 != null) {
            return emptyStateView2;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A03() {
        if (this.A0O) {
            C55808Hno hno = this.A0J;
            if (hno == null) {
                0qQ.A0F("feedPillHelper");
                throw AnonymousClass00P.createAndThrow();
            }
            IgTextView igTextView = hno.A01;
            if (igTextView != null && igTextView.getVisibility() == 8) {
                IgTextView igTextView2 = hno.A01;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                }
                IgTextView igTextView3 = hno.A01;
                if (igTextView3 != null) {
                    igTextView3.clearAnimation();
                }
                IgTextView igTextView4 = hno.A01;
                if (igTextView4 != null) {
                    C55535HjH hjH = hno.A03;
                    AnimationSet animationSet = new AnimationSet(true);
                    hjH.A00 = animationSet;
                    animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
                    hjH.A00.addAnimation(new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f));
                    hjH.A00.setInterpolator(new OvershootInterpolator());
                    hjH.A00.setStartOffset(250);
                    hjH.A00.setDuration(350);
                    igTextView4.startAnimation(hjH.A00);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.1Xj r6, X.C52770GcN r7, java.lang.String r8) {
        /*
            com.instagram.save.model.SavedCollection r4 = r7.A0C
            java.lang.String r2 = "collection"
            if (r4 == 0) goto L_0x006c
            X.HMw r1 = r4.A07
            X.HMw r0 = X.C54665HMw.MEDIA
            java.lang.String r3 = "dataSource"
            if (r1 != r0) goto L_0x004b
            java.lang.String r0 = r4.A0F
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x004b
            java.util.List r1 = r6.A3i()
            com.instagram.save.model.SavedCollection r0 = r7.A0C
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r0.A0F
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x005b
            X.HAH r5 = r7.A07
            if (r5 == 0) goto L_0x0070
            X.5qt r4 = r7.A00(r6)
            r3 = 0
            X.5qq r2 = r4.A02
            int r0 = r2.A02
            r1 = 1
            if (r0 != r1) goto L_0x0049
            int r0 = r2.A04
            if (r0 != r1) goto L_0x0049
        L_0x003a:
            X.17k.A0F(r1)
            java.util.List r0 = r5.A02
            r0.add(r3, r4)
            r5.A04()
        L_0x0045:
            A06(r7)
        L_0x0048:
            return
        L_0x0049:
            r1 = 0
            goto L_0x003a
        L_0x004b:
            com.instagram.save.model.SavedCollection r0 = r7.A0C
            if (r0 == 0) goto L_0x006c
            X.HMw r1 = r0.A07
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            if (r1 != r0) goto L_0x0048
            boolean r0 = r6.CbC()
            if (r0 != 0) goto L_0x0048
        L_0x005b:
            X.HAH r2 = r7.A07
            if (r2 == 0) goto L_0x0070
            X.5qt r1 = r7.A00(r6)
            java.util.List r0 = r2.A02
            r0.remove(r1)
            r2.A04()
            goto L_0x0045
        L_0x006c:
            X.0qQ.A0F(r2)
            goto L_0x0073
        L_0x0070:
            X.0qQ.A0F(r3)
        L_0x0073:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52770GcN.A04(X.1Xj, X.GcN, java.lang.String):void");
    }

    public static final boolean A08(C52770GcN gcN) {
        HMH hmh = gcN.A09;
        if (hmh == null) {
            0qQ.A0F("savedFeedMode");
            throw AnonymousClass00P.createAndThrow();
        } else if (hmh == HMH.COLLECTION_FEED || hmh == HMH.COLLECTION_FEED_PREVIEW) {
            return true;
        } else {
            return false;
        }
    }

    public final C14074TpO A09() {
        C14074TpO tpO = this.A06;
        if (tpO != null) {
            return tpO;
        }
        0qQ.A0F("saveGrid");
        throw AnonymousClass00P.createAndThrow();
    }

    public final H5L A0A() {
        H5L h5l = this.A0A;
        if (h5l != null) {
            return h5l;
        }
        0qQ.A0F("gridViewController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ACw() {
        C324356z9 r0 = this.A08;
        if (r0 == null) {
            C51965G9l.A16();
            throw AnonymousClass00P.createAndThrow();
        } else if (r0.A06()) {
            this.A0G = true;
            A07(false, false);
        }
    }

    public final /* synthetic */ boolean BVc() {
        return false;
    }

    public final List Bri() {
        HG5 hg5 = this.A05;
        if (hg5 != null) {
            return hg5.A04();
        }
        0qQ.A0F("selectStateProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKB() {
        C324356z9 r0 = this.A08;
        if (r0 != null) {
            return r0.A05();
        }
        C51965G9l.A16();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CT5() {
        C324356z9 r0 = this.A08;
        if (r0 != null) {
            return C51973G9u.A1Y(r0);
        }
        C51965G9l.A16();
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        String str;
        HMH hmh = this.A09;
        if (hmh == null) {
            str = "savedFeedMode";
        } else {
            str = "userSession";
            switch (hmh.ordinal()) {
                case 2:
                    return "collection_cover_editor";
                case 3:
                case 4:
                case 5:
                case 6:
                    return "feed_saved_add_to_collection";
                default:
                    SavedCollection savedCollection = this.A0C;
                    if (savedCollection != null && savedCollection.A06()) {
                        UserSession userSession = this.A03;
                        if (userSession != null) {
                            if (!savedCollection.A07(userSession.A06)) {
                                return "feed_saved_collections_nonself";
                            }
                        }
                    }
                    return "feed_saved_collections";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0wW getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getSessionId() {
        String str = this.A0F;
        if (str != null) {
            return str;
        }
        0qQ.A0F("_sessionId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isLoading() {
        C324356z9 r0 = this.A08;
        if (r0 != null) {
            return C51973G9u.A1X(r0);
        }
        C51965G9l.A16();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        AnonymousClass2uE r0 = this.A0I;
        if (r0 != null && r0.onBackPressed()) {
            return true;
        }
        if (!A0A().onBackPressed()) {
            return false;
        }
        A03();
        return true;
    }

    private final ArrayList A02(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xj r0 = ((C55524Hj6) it.next()).A00;
            0qQ.A07(r0);
            A1C.add(A00(r0));
        }
        return A1C;
    }

    public static final void A06(C52770GcN gcN) {
        if (gcN.isAdded() && gcN.mView != null) {
            boolean isLoading = gcN.isLoading();
            if (gcN.CT5()) {
                gcN.A01().setVisibility(0);
                gcN.A01().A0J();
                return;
            }
            if (!isLoading) {
                HAH hah = gcN.A07;
                if (hah == null) {
                    0qQ.A0F("dataSource");
                    throw AnonymousClass00P.createAndThrow();
                } else if (!hah.A03().hasNext()) {
                    gcN.A01().setVisibility(0);
                    EmptyStateView A012 = gcN.A01();
                    A012.A0I();
                    A012.A0H();
                    return;
                }
            }
            gcN.A01().setVisibility(8);
        }
    }

    public final void ASi() {
        A0A().A01();
    }

    public final void ATa() {
        A0A().A03();
    }

    public final boolean CJz() {
        return A09().A0A();
    }

    public final boolean CWV() {
        if (isLoading()) {
            return this.A0G;
        }
        return true;
    }

    public final boolean DQs(MotionEvent motionEvent, View view, C296995qz r9, 1Xj r10) {
        AnonymousClass2uE r1;
        C51974G9v.A1O(r10, r9, view, motionEvent);
        H5L A0A2 = A0A();
        int i = r9.A01;
        int i2 = r9.A00;
        if (!(A0A2.A06.A01 || A0A2.A0B == HMH.SELECT_COVER_PHOTO || (r1 = A0A2.A07) == null)) {
            r1.Dsa(motionEvent, view, r10, (i * 3) + i2);
        }
        return false;
    }

    public final 0jB E4k() {
        0jB A0k = C51965G9l.A0k();
        0j9 r1 = C52240GKh.A00;
        SavedCollection savedCollection = this.A0C;
        if (savedCollection != null) {
            A0k.A04(r1, savedCollection.A0F);
            0j9 r12 = C52240GKh.A01;
            SavedCollection savedCollection2 = this.A0C;
            if (savedCollection2 != null) {
                A0k.A04(r12, savedCollection2.A0G);
                if (this.A0H) {
                    A0k.A04(C52240GKh.A02, HMV.POSTS.A00);
                }
                return A0k;
            }
        }
        0qQ.A0F("collection");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4l(1Xj r2) {
        return E4k();
    }

    public final 0jB E4x() {
        0jB A0k = C51965G9l.A0k();
        UserSession userSession = this.A03;
        if (userSession == null) {
            DbS.A17();
            throw AnonymousClass00P.createAndThrow();
        }
        A0k.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06);
        return A0k;
    }

    public final void EE3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            A09();
        }
        A06(this);
    }

    public final void EKl() {
        A09().A03();
    }

    public final C238133Ar getScrollingViewProxy() {
        C238133Ar r0 = A09().A06;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: X.2ms} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: X.3kK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: X.4DV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: X.GcN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r0v72, types: [X.Hj6, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r39) {
        /*
            r38 = this;
            r0 = -1043183704(0xffffffffc1d247a8, float:-26.284988)
            int r22 = X.AnonymousClass0fD.A02(r0)
            r6 = r38
            android.os.Bundle r2 = r6.requireArguments()
            java.lang.String r0 = "SaveFragment.SAVE_HOME_TAB_MODE"
            java.io.Serializable r0 = r2.getSerializable(r0)
            r0.getClass()
            X.HMH r0 = (X.HMH) r0
            r6.A09 = r0
            r0 = r39
            X.C52770GcN.super.onCreate(r0)
            X.32Q r0 = X.AnonymousClass32Q.A00
            r6.A0K = r0
            com.instagram.common.session.UserSession r4 = X.DbX.A0U(r6)
            r6.A03 = r4
            java.lang.String r21 = "userSession"
            r29 = 0
            if (r4 == 0) goto L_0x0351
            r1 = 31785002(0x1e5002a, float:8.412155E-38)
            java.lang.String r0 = "saved_media_grid"
            X.Dbx r3 = new X.Dbx
            r3.<init>(r4, r0, r1)
            r6.A01 = r3
            android.content.Context r1 = r6.requireContext()
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0351
            X.2cc r0 = X.C71342cb.A00(r0)
            r3.A0O(r1, r0, r6, r6)
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0351
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)
            r6.A02 = r0
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION"
            android.os.Parcelable r1 = r2.getParcelable(r0)
            r1.getClass()
            com.instagram.save.model.SavedCollection r1 = (com.instagram.save.model.SavedCollection) r1
            r6.A0C = r1
            java.lang.String r20 = "collection"
            if (r1 == 0) goto L_0x034c
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0351
            r1.A03(r0)
            java.lang.String r0 = "prior_module"
            r2.getString(r0)
            java.lang.String r0 = "ARGUMENT_NUM_MEDIA_COLLECTIONS"
            int r0 = r2.getInt(r0)
            r6.A00 = r0
            java.lang.String r0 = "SaveFragment.ARGUMENT_IS_IN_TAB"
            boolean r0 = r2.getBoolean(r0)
            r6.A0H = r0
            java.lang.String r0 = "SaveFragment.ARGUMENT_HAS_ADDITIONAL_PADDING"
            r5 = 0
            boolean r0 = r2.getBoolean(r0, r5)
            r6.A0L = r0
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r6.A0F = r0
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0351
            X.HB2 r1 = new X.HB2
            r1.<init>(r0, r6)
            android.content.Context r3 = r6.requireContext()
            X.Hno r0 = new X.Hno
            r0.<init>(r3)
            r6.A0J = r0
            X.2el r3 = X.C51969G9p.A0k()
            com.instagram.common.session.UserSession r7 = r6.A03
            if (r7 == 0) goto L_0x0351
            com.instagram.save.model.SavedCollection r4 = r6.A0C
            if (r4 == 0) goto L_0x034c
            X.HlC r0 = new X.HlC
            r0.<init>(r7, r3, r6, r4)
            r6.A0B = r0
            X.2jd r7 = new X.2jd
            r7.<init>()
            androidx.fragment.app.FragmentActivity r10 = r6.requireActivity()
            com.instagram.common.session.UserSession r8 = r6.A03
            if (r8 == 0) goto L_0x0351
            java.lang.String r0 = r6.A0F
            if (r0 != 0) goto L_0x00d2
            java.lang.String r19 = "_sessionId"
        L_0x00ca:
            X.0qQ.A0F(r19)
        L_0x00cd:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d2:
            r4 = 1
            r14 = -1
            X.WWE r9 = new X.WWE
            r11 = r8
            r12 = r6
            r13 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            X.32Q r8 = r6.A0K
            java.lang.String r19 = "gridConfiguration"
            if (r8 == 0) goto L_0x00ca
            X.HAJ r0 = new X.HAJ
            r0.<init>(r1)
            X.HAH r1 = new X.HAH
            r1.<init>(r0, r8)
            r6.A07 = r1
            java.lang.String r18 = "dataSource"
            X.HG5 r0 = new X.HG5
            r0.<init>(r1)
            r6.A05 = r0
            X.2tC r11 = X.DbV.A0S(r6)
            X.X41 r10 = r6.A0a
            com.instagram.common.session.UserSession r1 = r6.A03
            if (r1 == 0) goto L_0x0351
            X.HAH r0 = r6.A07
            if (r0 == 0) goto L_0x0347
            X.Tu5 r8 = new X.Tu5
            r33 = r0
            r34 = r10
            r35 = r5
            r36 = r5
            r30 = r8
            r31 = r6
            r32 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36)
            X.HG5 r1 = r6.A05
            java.lang.String r17 = "selectStateProvider"
            if (r1 == 0) goto L_0x0342
            X.H7J r0 = new X.H7J
            r0.<init>(r6, r6, r8, r1)
            r11.A01(r0)
            android.content.Context r12 = r6.requireContext()
            com.instagram.common.session.UserSession r10 = r6.A03
            if (r10 == 0) goto L_0x0351
            X.HAH r8 = r6.A07
            if (r8 == 0) goto L_0x0347
            java.lang.String r0 = r6.getModuleName()
            X.5r2 r1 = new X.5r2
            r1.<init>(r10, r12, r0)
            X.Uh0 r0 = new X.Uh0
            r26 = r1
            r27 = r8
            r28 = r8
            r23 = r0
            r24 = r6
            r25 = r10
            r23.<init>(r24, r25, r26, r27, r28)
            r7.A0E(r0)
            androidx.fragment.app.FragmentActivity r24 = r6.requireActivity()
            X.HAH r10 = r6.A07
            if (r10 == 0) goto L_0x0347
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0351
            r1 = 0
            X.TsA r8 = new X.TsA
            r25 = r6
            r26 = r11
            r27 = r0
            r28 = r10
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r6
            r34 = r4
            r23 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r6.A04 = r8
            X.HG5 r0 = r6.A05
            if (r0 == 0) goto L_0x0342
            java.lang.String r10 = "adapter"
            r0.A00 = r8
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0351
            X.TvE r8 = new X.TvE
            r8.<init>(r0)
            X.X3y r0 = r6.A0Z
            r8.A01(r0)
            X.TsA r0 = r6.A04
            if (r0 != 0) goto L_0x0197
            X.0qQ.A0F(r10)
            goto L_0x00cd
        L_0x0197:
            r8.A06 = r0
            X.HAH r0 = r6.A07
            if (r0 == 0) goto L_0x0347
            r8.A08 = r0
            r8.A0A = r9
            r8.A04 = r6
            X.32Q r0 = r6.A0K
            if (r0 == 0) goto L_0x00ca
            r8.A0G = r0
            r8.A00(r3)
            X.Tvf r3 = X.C14411Tvf.ONE_BY_ONE
            X.TvF r0 = new X.TvF
            r0.<init>(r3)
            X.Uiv[] r0 = new X.C15812Uiv[]{r0}
            r8.A0P = r0
            r8.A0I = r4
            X.HMH r0 = r6.A09
            java.lang.String r16 = "savedFeedMode"
            if (r0 == 0) goto L_0x033d
            X.HMH r3 = X.HMH.SELECT_COVER_PHOTO
            boolean r0 = X.C51969G9p.A1a(r0, r3)
            r8.A0N = r0
            X.TpO r0 = new X.TpO
            r0.<init>(r8)
            r6.A06 = r0
            androidx.fragment.app.FragmentActivity r25 = r6.requireActivity()
            androidx.fragment.app.Fragment r0 = r6.mParentFragment
            if (r0 == 0) goto L_0x021a
            X.0hq r9 = r0.mFragmentManager
        L_0x01da:
            r9.getClass()
            com.instagram.common.session.UserSession r8 = r6.A03
            if (r8 == 0) goto L_0x0351
            X.TpO r0 = r6.A09()
            X.TsA r0 = r0.A0E
            X.2uE r13 = new X.2uE
            r24 = r13
            r26 = r6
            r27 = r9
            r28 = r8
            r30 = r6
            r31 = r0
            r32 = r6
            r33 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r6.A0I = r13
            com.instagram.common.session.UserSession r15 = r6.A03
            if (r15 == 0) goto L_0x0351
            com.instagram.save.model.SavedCollection r14 = r6.A0C
            if (r14 == 0) goto L_0x034c
            X.HMH r12 = r6.A09
            if (r12 == 0) goto L_0x033d
            X.HG5 r11 = r6.A05
            if (r11 == 0) goto L_0x0342
            X.32Q r10 = r6.A0K
            if (r10 == 0) goto L_0x00ca
            X.Hno r9 = r6.A0J
            if (r9 != 0) goto L_0x021d
            java.lang.String r19 = "feedPillHelper"
            goto L_0x00ca
        L_0x021a:
            X.0hq r9 = r6.mFragmentManager
            goto L_0x01da
        L_0x021d:
            boolean r8 = r6.A0H
            if (r8 == 0) goto L_0x0229
            androidx.fragment.app.Fragment r1 = r6.mParentFragment
            boolean r0 = r1 instanceof X.H15
            if (r0 == 0) goto L_0x02a3
            X.H15 r1 = (X.H15) r1
        L_0x0229:
            X.H5L r0 = new X.H5L
            r25 = r6
            r26 = r15
            r27 = r11
            r28 = r13
            r29 = r6
            r30 = r9
            r31 = r6
            r32 = r12
            r33 = r6
            r34 = r1
            r35 = r14
            r36 = r10
            r37 = r8
            r23 = r0
            r24 = r6
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r6.A0A = r0
            com.instagram.common.session.UserSession r1 = r6.A03
            if (r1 == 0) goto L_0x0351
            X.ISl r0 = new X.ISl
            r0.<init>(r6, r4)
            X.36D r10 = new X.36D
            r10.<init>(r1, r0, r5, r5)
            android.content.Context r9 = r6.requireContext()
            X.JR5 r8 = r6.A0S
            com.instagram.common.session.UserSession r1 = r6.A03
            if (r1 == 0) goto L_0x0351
            X.HqZ r0 = new X.HqZ
            r0.<init>(r9, r6, r1, r8)
            r6.A0D = r0
            X.H5L r0 = r6.A0A()
            r7.A0E(r0)
            r7.A0E(r10)
            X.2uE r0 = r6.A0I
            if (r0 == 0) goto L_0x027e
            r7.A0E(r0)
        L_0x027e:
            com.instagram.common.session.UserSession r1 = r6.A03
            if (r1 == 0) goto L_0x0351
            X.2wt r0 = new X.2wt
            r0.<init>(r6, r1, r6)
            r7.A0E(r0)
            r6.registerLifecycleListenerSet(r7)
            android.content.Context r1 = r6.requireContext()
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0351
            X.6z9 r0 = X.C51970G9q.A0g(r1, r6, r0)
            r6.A08 = r0
            X.1Ng r7 = r6.A02
            if (r7 != 0) goto L_0x02a5
            java.lang.String r19 = "igEventBus"
            goto L_0x00ca
        L_0x02a3:
            r1 = 0
            goto L_0x0229
        L_0x02a5:
            java.lang.Class<X.INo> r1 = X.C57074INo.class
            X.1wn r0 = r6.A0Y
            r7.A01(r0, r1)
            java.lang.Class<X.INr> r1 = X.C57077INr.class
            X.1wn r0 = r6.A0X
            r7.A01(r0, r1)
            java.lang.Class<X.INs> r1 = X.C57078INs.class
            X.IO4 r0 = r6.A0W
            r7.A01(r0, r1)
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_ITEM_IDS"
            java.util.ArrayList r1 = r2.getStringArrayList(r0)
            X.HMH r0 = r6.A09
            if (r0 == 0) goto L_0x033d
            if (r0 != r3) goto L_0x030e
            if (r1 == 0) goto L_0x030e
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r1.iterator()
        L_0x02d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0302
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0351
            X.1Xj r1 = X.DbV.A0U(r0, r1)
            if (r1 != 0) goto L_0x02f7
            java.lang.String r1 = "SavedMediaFeedFragment#onCreate()"
            java.lang.String r0 = "Cache miss while attempting to display cover photo selection grid"
            X.0wb.A03(r1, r0)
            r6.onBackPressed()
            r1 = -1566863437(0xffffffffa29b8fb3, float:-4.216498E-18)
        L_0x02f1:
            r0 = r22
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x02f7:
            X.Hj6 r0 = new X.Hj6
            r0.<init>()
            r0.A00 = r1
            r3.add(r0)
            goto L_0x02d0
        L_0x0302:
            X.HAH r1 = r6.A07
            if (r1 == 0) goto L_0x0347
            java.util.ArrayList r0 = r6.A02(r3)
            r1.A05(r0)
            goto L_0x0339
        L_0x030e:
            boolean r0 = A08(r6)
            if (r0 == 0) goto L_0x032f
            X.HcM r3 = X.C57095IOj.A02
            com.instagram.common.session.UserSession r2 = r6.A03
            if (r2 == 0) goto L_0x0351
            monitor-enter(r3)
            r1 = 0
            java.lang.Class<X.IOj> r0 = X.C57095IOj.class
            java.lang.Object r0 = r2.A00(r0)     // Catch:{ all -> 0x0356 }
            X.IOj r0 = (X.C57095IOj) r0     // Catch:{ all -> 0x0356 }
            if (r0 == 0) goto L_0x0334
            java.util.LinkedList r0 = r0.A01     // Catch:{ all -> 0x0356 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0356 }
            if (r0 != 0) goto L_0x0334
            goto L_0x0333
        L_0x032f:
            r6.A07(r4, r5)
            goto L_0x0339
        L_0x0333:
            r1 = 1
        L_0x0334:
            monitor-exit(r3)
            if (r1 == 0) goto L_0x032f
            r6.A0N = r4
        L_0x0339:
            r1 = -2078737943(0xffffffff8418f9e9, float:-1.7982267E-36)
            goto L_0x02f1
        L_0x033d:
            X.0qQ.A0F(r16)
            goto L_0x00cd
        L_0x0342:
            X.0qQ.A0F(r17)
            goto L_0x00cd
        L_0x0347:
            X.0qQ.A0F(r18)
            goto L_0x00cd
        L_0x034c:
            X.0qQ.A0F(r20)
            goto L_0x00cd
        L_0x0351:
            X.0qQ.A0F(r21)
            goto L_0x00cd
        L_0x0356:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52770GcN.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1952759205);
        0qQ.A0B(layoutInflater, 0);
        A09();
        View inflate = layoutInflater.inflate(R.layout.layout_grid_recyclerview_wrapper, viewGroup, false);
        AnonymousClass0fD.A09(1548803562, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-603226056);
        super.onDestroy();
        1Ng r2 = this.A02;
        if (r2 == null) {
            0qQ.A0F("igEventBus");
            throw AnonymousClass00P.createAndThrow();
        }
        r2.A02(this.A0Y, C57074INo.class);
        r2.A02(this.A0X, C57077INr.class);
        r2.A02(this.A0W, C57078INs.class);
        AnonymousClass0fD.A09(1925069459, A022);
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-627261371);
        super.onDestroyView();
        A09().A01();
        this.A0E = null;
        1Ng r2 = this.A02;
        if (r2 == null) {
            str = "igEventBus";
        } else {
            r2.A02(this.A0V, AnonymousClass3DT.class);
            C55808Hno hno = this.A0J;
            if (hno == null) {
                str = "feedPillHelper";
            } else {
                IgTextView igTextView = hno.A01;
                if (igTextView != null) {
                    igTextView.setOnClickListener((View.OnClickListener) null);
                }
                hno.A01 = null;
                hno.A00 = null;
                AnonymousClass0fD.A09(1977694902, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(503979905);
        super.onResume();
        A03();
        if (this.A0H) {
            UserSession userSession = this.A03;
            String str = "userSession";
            if (userSession != null) {
                Class<C57095IOj> cls = C57095IOj.class;
                C58486Ish ish = C58486Ish.A00;
                boolean z = ((C57095IOj) userSession.A01(cls, ish)).A00;
                UserSession userSession2 = this.A03;
                if (userSession2 != null) {
                    C57095IOj iOj = (C57095IOj) userSession2.A01(cls, ish);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    LinkedList linkedList = iOj.A01;
                    A1C.addAll(linkedList);
                    linkedList.clear();
                    iOj.A00 = false;
                    if (!A1C.isEmpty()) {
                        str = "dataSource";
                        if (z) {
                            HAH hah = this.A07;
                            if (hah != null) {
                                hah.A02.clear();
                                hah.A04();
                            }
                        }
                        Iterator it = A1C.iterator();
                        while (it.hasNext()) {
                            HE8 he8 = (HE8) it.next();
                            HAH hah2 = this.A07;
                            if (hah2 != null) {
                                List list = he8.A01;
                                0qQ.A07(list);
                                hah2.A05(A02(list));
                                C324356z9 r1 = this.A08;
                                if (r1 == null) {
                                    str = "feedNetworkSource";
                                } else {
                                    String str2 = he8.A01;
                                    C324366zA r12 = r1.A03;
                                    r12.A07 = str2;
                                    r12.A0A = true;
                                    r12.A03 = AnonymousClass05K.A0C;
                                }
                            }
                        }
                        C14074TpO.A00(A09(), false, true);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (this.A0H || !isLoading()) {
            A06(this);
        }
        AnonymousClass0fD.A09(1680593865, A022);
    }
}
