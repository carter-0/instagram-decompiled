package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.msys.mci.AuthData;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Ma2  reason: case insensitive filesystem */
public final class C66633Ma2 implements C242843Wf, C240423Kv {
    public static boolean A2z;
    public static final Mi8 A30 = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public Pair A07;
    public Pair A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public LinearLayoutManager A0E;
    public RecyclerView A0F;
    public AnonymousClass66d A0G;
    public TabLayout A0H;
    public OLL A0I;
    public AnonymousClass9B2 A0J;
    public C290645fe A0K;
    public 1wn A0L;
    public 1wn A0M;
    public 1wn A0N;
    public 1wn A0O;
    public 1wn A0P;
    public 1wn A0Q;
    public 1wn A0R;
    public 1wn A0S;
    public 1wn A0T;
    public 1wn A0U;
    public 1wn A0V;
    public 0ng A0W;
    public 0ng A0X;
    public 0ng A0Y;
    public C67147Mj5 A0Z;
    public C70615ODm A0a;
    public C67488Moi A0b;
    public C67479MoZ A0c;
    public C67263Mkx A0d;
    public OF6 A0e;
    public C67237MkX A0f;
    public NIF A0g;
    public C74339PtF A0h;
    public OCG A0i;
    public OCH A0j;
    public C67541Mpb A0k;
    public C67028Mh1 A0l;
    public Dc2 A0m;
    public C238143As A0n;
    public AnonymousClass1GX A0o;
    public C46487Dfq A0p;
    public C320256s4 A0q;
    public AnonymousClass36N A0r;
    public C337257fy A0s;
    public Long A0t;
    public Long A0u;
    public Long A0v;
    public String A0w;
    public List A0x;
    public List A0y;
    public AnonymousClass0eM A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public NotesRepository A1G;
    public boolean A1H;
    public final Handler A1I;
    public final AnonymousClass4DH A1J;
    public final 1a8 A1K;
    public final C67090MiA A1L;
    public final C67088Mi6 A1M;
    public final C273624mt A1N;
    public final C67089Mi7 A1O;
    public final C273434mZ A1P;
    public final C2356430q A1Q;
    public final C228312lJ A1R;
    public final C273634mu A1S;
    public final Integer A1T;
    public final HashMap A1U;
    public final HashMap A1V;
    public final HashMap A1W;
    public final HashSet A1X;
    public final HashSet A1Y;
    public final HashSet A1Z;
    public final Set A1a;
    public final Set A1b;
    public final AnonymousClass0eM A1c;
    public final AnonymousClass0eM A1d;
    public final AnonymousClass0eM A1e;
    public final AnonymousClass0eM A1f;
    public final AnonymousClass0eM A1g;
    public final AnonymousClass0eM A1h;
    public final AnonymousClass0eM A1i;
    public final AnonymousClass0eM A1j;
    public final AnonymousClass0eM A1k;
    public final AnonymousClass0eM A1l;
    public final AnonymousClass0eM A1m;
    public final AnonymousClass0eM A1n;
    public final AnonymousClass0eM A1o;
    public final AnonymousClass0eM A1p;
    public final AnonymousClass0eM A1q;
    public final AnonymousClass0eM A1r;
    public final AnonymousClass0eM A1s;
    public final AnonymousClass0eM A1t;
    public final AnonymousClass0eM A1u;
    public final AnonymousClass0eM A1v;
    public final AnonymousClass0eM A1w;
    public final AnonymousClass0eM A1x;
    public final AnonymousClass0eM A1y;
    public final AnonymousClass0eM A1z;
    public final AnonymousClass0eM A20;
    public final AnonymousClass0eM A21;
    public final AnonymousClass0eM A22;
    public final AnonymousClass0eM A23;
    public final AnonymousClass0eM A24;
    public final AnonymousClass0eM A25;
    public final AnonymousClass0eM A26;
    public final AnonymousClass0eM A27;
    public final AnonymousClass0eM A28;
    public final AnonymousClass0eM A29;
    public final AnonymousClass0eM A2A;
    public final AnonymousClass0eM A2B;
    public final AnonymousClass0eM A2C;
    public final AnonymousClass0eM A2D;
    public final AnonymousClass0eM A2E;
    public final AnonymousClass0eM A2F;
    public final AnonymousClass0eM A2G;
    public final AnonymousClass0eM A2H;
    public final AnonymousClass0eM A2I;
    public final AnonymousClass0eM A2J;
    public final AnonymousClass0eM A2K;
    public final AnonymousClass0eM A2L;
    public final AnonymousClass0eM A2M;
    public final AnonymousClass0eM A2N;
    public final AnonymousClass0eM A2O;
    public final AnonymousClass0eM A2P;
    public final AnonymousClass0eM A2Q;
    public final AnonymousClass0eM A2R;
    public final AnonymousClass0eM A2S;
    public final AnonymousClass0eM A2T;
    public final AnonymousClass0eM A2U;
    public final AnonymousClass0eM A2V;
    public final AnonymousClass0eM A2W;
    public final AnonymousClass0eM A2X;
    public final AnonymousClass0eM A2Y;
    public final AnonymousClass0eM A2Z;
    public final AnonymousClass0eM A2a;
    public final AnonymousClass0eM A2b;
    public final AnonymousClass0eM A2c;
    public final AnonymousClass0eM A2d;
    public final AnonymousClass0eM A2e;
    public final AnonymousClass0eM A2f;
    public final AnonymousClass0eM A2g;
    public final AnonymousClass0eM A2h;
    public final AnonymousClass0eM A2i;
    public final AnonymousClass0eM A2j;
    public final AnonymousClass0eM A2k;
    public final AnonymousClass0eM A2l;
    public final AnonymousClass0eM A2m;
    public final AnonymousClass0eM A2n;
    public final AnonymousClass0eM A2o;
    public final AnonymousClass0eM A2p;
    public final AnonymousClass0eM A2q;
    public final AnonymousClass0eM A2r;
    public final AnonymousClass0eM A2s;
    public final AnonymousClass0eM A2t;
    public final AnonymousClass0eM A2u;
    public final AnonymousClass0eM A2v;
    public final boolean A2w;
    public final boolean A2x;
    public final boolean A2y;

    public static final void A09(RectF rectF, 28D r12, C66633Ma2 ma2, DirectShareTarget directShareTarget, C254743sy r15) {
        C254743sy r9 = r15;
        RectF rectF2 = rectF;
        28D r6 = r12;
        C66633Ma2 ma22 = ma2;
        if (r15 instanceof DirectThreadKey) {
            AnonymousClass3U9 A022 = C66647MaG.A02(ma2.A0v(), r15);
            if (A022 != null && A022.C6C() != null && !A0d(rectF, ma22, A022)) {
                UserSession A0p2 = ma22.A0p();
                Context context = ma22.A1J.getContext();
                if (context != null) {
                    A0A(rectF2, r6, ma22, C71046OaO.A01(context, A0p2, (C254933tI) null, A022, A022.C6C(), 0), r9);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        } else if (r15 instanceof MsysThreadId) {
            ma2.A1K.A02(C72120Owf.A00(MYc.A00(ma2).A01((MsysThreadId) r9), ma2, 23).A0P(C318146oT.A01), new C72993PSc(2, rectF2, r6, ma22, directShareTarget, r9));
        }
    }

    public static final void A0B(RectF rectF, C74455PvA pvA, C66633Ma2 ma2, AnonymousClass2Ep r14) {
        AnonymousClass2Ep r10 = r14;
        if (r14 != null) {
            String C6C = r14.C6C();
            Pair pair = ma2.A08;
            if (pair != null && 0qQ.A0K(pair.first, C6C)) {
                ((2cs) pair.second).A08(0.0d, true);
            }
            ma2.A07 = new Pair(C6C, pvA);
            C254703su BXx = r14.BXx();
            if (BXx == null) {
                AnonymousClass3U9 r102 = (AnonymousClass3U9) r10;
                if (AnonymousClass7TF.A1Z(r102.A05)) {
                    ReentrantReadWriteLock.ReadLock readLock = r102.A03.readLock();
                    readLock.lock();
                    readLock.unlock();
                }
                0wb.A01.Ew0("DirectInboxPresenter", "attempting to open visual message that is null");
                return;
            }
            P3J p3j = new P3J(rectF, pvA, ma2, r14);
            C70615ODm oDm = new C70615ODm(ma2.A1I, pvA);
            ma2.A0a = oDm;
            oDm.A00.postDelayed(oDm.A02, 200);
            C67095MiF miF = (C67095MiF) ma2.A1t.getValue();
            DirectThreadKey BJy = r14.BJy();
            if (!BJy.equals(miF.A00)) {
                miF.A01 = AnonymousClass7TF.A0b();
                miF.A00 = BJy;
            }
            String C6C2 = r14.C6C();
            if (C6C2 != null) {
                int C6a = r14.C6a();
                UserSession userSession = miF.A04;
                0qQ.A0B(userSession, 0);
                new C300915yA(userSession).A02(BXx, C66580MXl.A0g(C6C2), C6a);
            }
            UserSession userSession2 = miF.A04;
            Activity activity = miF.A02;
            User A042 = AnonymousClass48N.A04(userSession2, BXx, r14);
            A042.getClass();
            C68167N3h A022 = C271384il.A02(activity, userSession2, BXx, A042, AnonymousClass48N.A06(r14));
            C67087Mi3 mi3 = miF.A06;
            String str = A022.A0K;
            str.getClass();
            mi3.A01(activity, miF.A03, p3j, A022, r10, str, A022.A0G);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0F(C67058MhZ mhZ, C66633Ma2 ma2, DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, String str) {
        String str2;
        String str3;
        int i;
        DirectShareTarget directShareTarget2 = directShareTarget;
        String A072 = directShareTarget.A07();
        int i2 = directShareTarget.A01;
        String str4 = "inbox";
        C67058MhZ mhZ2 = mhZ;
        String str5 = str;
        if (i2 == 29) {
            C71140Odl A012 = OPT.A01(ma2);
            if (mhZ != null) {
                int i3 = mhZ.A00;
                C290645fe r2 = ma2.A0K;
                if (r2 != null) {
                    A012.A09(directShareTarget2, r2.A03("direct_ibc_inbox_discovery"), str, i3);
                    CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget2.A04;
                    if (creatorBroadcastThreadInfo != null) {
                        i = creatorBroadcastThreadInfo.A00;
                    } else {
                        i = 1;
                    }
                    1as r22 = 1as.A04;
                    UserSession A0p2 = ma2.A0p();
                    AnonymousClass4DH r4 = ma2.A1J;
                    FragmentActivity requireActivity = r4.requireActivity();
                    String A082 = directShareTarget2.A08();
                    if (0qQ.A0K(str, "inbox_channel_invitation")) {
                        str4 = str;
                    }
                    r22.A03(requireActivity, r4, A0p2, A082, A072, (String) null, str4, i);
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (A072 != null) {
            C71140Odl A013 = OPT.A01(ma2);
            if (mhZ != null) {
                int i4 = mhZ.A00;
                C290645fe r23 = ma2.A0K;
                if (r23 != null) {
                    A013.A09(directShareTarget2, r23.A03("direct_ibc_inbox_discovery"), str, i4);
                    String A014 = OXO.A01(A072, 0sr.A1P(new Pair[]{new Pair("s", str4), new Pair("st", String.valueOf(directShareTarget2.A01))}));
                    DiscoverableThreadInfo discoverableThreadInfo = directShareTarget2.A06;
                    if (!(discoverableThreadInfo == null || (str3 = discoverableThreadInfo.A00) == null)) {
                        A014 = DbT.A10(DbV.A08(Uri.parse(A014).buildUpon(), "scid", str3));
                    }
                    AnonymousClass4DH r0 = ma2.A1J;
                    FH7.A0B(r0.requireActivity(), ma2.A0p(), A014, r0.getModuleName());
                    C290645fe r24 = ma2.A0K;
                    str2 = "banyanClient";
                    if (r24 != null) {
                        Iterator it = r24.A01("direct_ibc_inbox_invitations").A02.iterator();
                        while (it.hasNext()) {
                            DirectShareTarget A0f2 = DbT.A0f(it);
                            if (directShareTarget2.A08() != null && 0qQ.A0K(A0f2.A08(), directShareTarget2.A08())) {
                                C290645fe r25 = ma2.A0K;
                                if (r25 != null) {
                                    r25.A07(directShareTarget2.A08());
                                }
                            }
                        }
                        return;
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            DirectThreadKey directThreadKey2 = directThreadKey;
            if (C66732Mbd.A03(ma2.A1J.requireContext(), ma2.A0p())) {
                C66581MXm.A0V(ma2).C6W().Ejj(directThreadKey);
            }
            C74395PuB BVW = C66581MXm.A0V(ma2).BVW();
            List A0m2 = DbW.A0m(directShareTarget2);
            if (mhZ != null) {
                BVW.Cqe(mhZ2, directThreadKey2, (Integer) null, (Integer) null, str5, A0m2);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        str2 = "banyanClient";
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0J(C66633Ma2 ma2) {
        C67468MoN[] moNArr = {C67468MoN.A06};
        ((C376359Hr) ma2.A2g.getValue()).A02(new C67051MhO(ma2), AnonymousClass05K.A00, (C67468MoN[]) Arrays.copyOf(moNArr, 1));
    }

    public static final void A0Z(C66633Ma2 ma2, Integer num) {
        AnonymousClass4AE r0;
        if (AnonymousClass4AJ.A03(ma2.A0p())) {
            if (ma2.A1G == null) {
                ma2.A1G = AnonymousClass43C.A00(ma2.A0p());
            }
            C66976MgA mgA = (C66976MgA) ma2.A2N.getValue();
            if (!(mgA == null || (r0 = mgA.A03) == null)) {
                r0.A00();
            }
            NotesRepository notesRepository = ma2.A1G;
            if (notesRepository != null) {
                notesRepository.A0K(num, new C67313Mln(ma2), true, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (X.DbS.A0g(r12.BRZ(), 0).CXO() == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0d(android.graphics.RectF r21, X.C66633Ma2 r22, X.AnonymousClass2Ep r23) {
        /*
            r1 = 0
            r12 = r23
            boolean r4 = r12.isPending()
            int r2 = r12.BSK()
            r3 = 1
            r6 = r21
            r0 = r22
            if (r4 != 0) goto L_0x00ac
            if (r2 != r3) goto L_0x00ac
            X.0eM r2 = r0.A26
            java.lang.Object r9 = r2.getValue()
            X.Moe r9 = (X.C67484Moe) r9
            X.2EM r11 = r0.A0t()
            X.P3Q r10 = new X.P3Q
            r10.<init>(r6, r0, r12)
            boolean r2 = r12.isPending()
            int r0 = r12.BSK()
            if (r2 != 0) goto L_0x00fe
            if (r0 != r3) goto L_0x00fe
            boolean r5 = r12.CUG()
            boolean r0 = r12.CUG()
            if (r0 != 0) goto L_0x0054
            java.util.List r0 = r12.BRZ()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0054
            java.util.List r0 = r12.BRZ()
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r1)
            boolean r0 = r0.CXO()
            r4 = 1
            if (r0 != 0) goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            X.Mi5 r0 = r9.A04
            com.instagram.common.session.UserSession r3 = r9.A02
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r5 == 0) goto L_0x009f
            X.C66699Mb6.A06(r0, r2)
        L_0x0062:
            boolean r0 = X.2El.A0E(r3)
            if (r0 == 0) goto L_0x006d
            r0 = 17
            X.AnonymousClass7TF.A1M(r2, r0)
        L_0x006d:
            android.content.Context r3 = r9.A00
            java.util.List r0 = r12.BRZ()
            com.instagram.user.model.User r0 = X.DbS.A0g(r0, r1)
            java.lang.String r1 = r0.getFullName()
            r0 = 2131959922(0x7f132072, float:1.9556498E38)
            java.lang.String r15 = X.DbY.A0c(r3, r1, r0)
            r0 = 2131959976(0x7f1320a8, float:1.9556608E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r3, r0)
            com.instagram.model.direct.DirectThreadKey r14 = r12.BJy()
            r7 = 0
            boolean r18 = r12.CVr()
            boolean r19 = r12.CUG()
            r8 = r7
            r13 = r7
            r17 = r2
            X.C67484Moe.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x009d:
            r1 = 1
        L_0x009e:
            return r1
        L_0x009f:
            X.C66699Mb6.A06(r0, r2)
            r0 = 18
            if (r4 == 0) goto L_0x00a8
            r0 = 19
        L_0x00a8:
            X.AnonymousClass7TF.A1M(r2, r0)
            goto L_0x0062
        L_0x00ac:
            X.0eM r2 = r0.A1k
            java.lang.Object r13 = r2.getValue()
            X.Mbo r13 = (X.C66743Mbo) r13
            X.4DH r3 = r0.A1J
            android.content.Context r14 = r3.requireContext()
            com.instagram.model.direct.DirectThreadKey r16 = r12.BJy()
            java.util.List r18 = r12.BRZ()
            java.lang.String r17 = r12.AsX()
            int r19 = r12.BHS()
            int r20 = r12.C6a()
            boolean r22 = r12.CVr()
            r12.BJy()
            X.PFd r15 = new X.PFd
            r15.<init>(r6, r0, r12)
            r21 = r1
            r23 = r1
            boolean r2 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r2 != 0) goto L_0x009d
            X.0eM r2 = r0.A2S
            java.lang.Object r5 = r2.getValue()
            X.Dfm r5 = (X.C46483Dfm) r5
            com.instagram.model.direct.DirectThreadKey r4 = r12.BJy()
            X.PFX r2 = new X.PFX
            r2.<init>(r1, r6, r0, r12)
            java.lang.String r0 = "inbox"
            boolean r0 = r5.A00(r3, r2, r4, r0)
            if (r0 == 0) goto L_0x009e
            goto L_0x009d
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A0d(android.graphics.RectF, X.Ma2, X.2Ep):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A15(android.os.Bundle r7, java.lang.Integer r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            r5 = 1
            java.lang.String r0 = "DirectInboxController.navigateToFragment"
            X.0lp r2 = X.0lq.A00(r0)
            X.4DH r3 = r6.A1J     // Catch:{ all -> 0x004b }
            androidx.fragment.app.FragmentActivity r4 = r3.getActivity()     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x0047
            java.lang.String r1 = "DirectFragment.ENTRY_POINT"
            java.lang.String r0 = "inbox"
            r7.putString(r1, r0)     // Catch:{ all -> 0x004b }
            r0 = 139(0x8b, float:1.95E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x004b }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x002b
            boolean r0 = r6.A1D     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "DirectInboxFragment.DIRECT_MESSAGE_REQUEST_INBOX_INITIAL_LOAD_COMPLETE_KEY"
            r7.putBoolean(r0, r5)     // Catch:{ all -> 0x004b }
        L_0x002b:
            com.instagram.common.session.UserSession r1 = r6.A0p()     // Catch:{ all -> 0x004b }
            java.lang.Class<com.instagram.modal.ModalActivity> r0 = com.instagram.modal.ModalActivity.class
            X.6W8 r1 = X.DbW.A0W(r4, r7, r1, r0, r9)     // Catch:{ all -> 0x004b }
            if (r10 == 0) goto L_0x003a
            r1.A08()     // Catch:{ all -> 0x004b }
        L_0x003a:
            if (r8 == 0) goto L_0x0044
            int r0 = r8.intValue()     // Catch:{ all -> 0x004b }
            r1.A0D(r3, r0)     // Catch:{ all -> 0x004b }
            goto L_0x0047
        L_0x0044:
            r1.A0C(r4)     // Catch:{ all -> 0x004b }
        L_0x0047:
            r2.close()
            return
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A15(android.os.Bundle, java.lang.Integer, java.lang.String, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r34v0, types: [X.MpC, java.lang.Object] */
    public static final C66975Mg9 A02(C66633Ma2 ma2) {
        0eP r14;
        C66633Ma2 ma22 = ma2;
        UserSession A0p2 = ma22.A0p();
        AnonymousClass4DH r37 = ma22.A1J;
        2Dm A0v2 = ma22.A0v();
        2EM A0r2 = ma22.A0r();
        C2611948q A052 = A05(ma22);
        C251033mS r10 = (C251033mS) ma22.A23.getValue();
        boolean A0A2 = 2El.A0A(ma22.A0p());
        boolean z = true;
        boolean A1V2 = AnonymousClass7TF.A1V(ma22.A0b);
        if (ma22.A0c == null) {
            z = false;
        }
        Mi5 mi5 = (Mi5) ma22.A1r.getValue();
        0wc r5 = (0wc) ma22.A2r.getValue();
        C46483Dfm dfm = (C46483Dfm) ma22.A2S.getValue();
        C67095MiF miF = (C67095MiF) ma22.A1t.getValue();
        C74321Psx psx = (C74321Psx) ma22.A2p.getValue();
        C2356430q r36 = ma22.A1Q;
        Mi9 A0u2 = ma22.A0u();
        C67097MiH miH = new C67097MiH(ma22);
        0qQ.A0B(A0p2, 0);
        C51973G9u.A0r(2, A0v2, A052, r10);
        0qQ.A0B(mi5, 9);
        C51972G9s.A1F(r5, dfm);
        C51969G9p.A1O(miF, 12, psx);
        0qQ.A0B(A0u2, 15);
        C67207Mk3 mk3 = (C67207Mk3) A0p2.A01(C67207Mk3.class, new C73910Pll(A0p2, 37));
        P3Z p3z = null;
        if (!182.A06(0Tu.A05, mk3.A02, 36329131197087558L)) {
            r14 = AnonymousClass7TE.A1L((Object) null, C67208Mk4.NOT_ENABLED);
        } else {
            synchronized (mk3) {
                C70616ODn oDn = mk3.A01;
                if (oDn != null) {
                    if (!A0r2.equals(oDn.A01) || A052 != C2611948q.ALL || A0A2 != oDn.A02 || A1V2 || z) {
                        mk3.A01 = null;
                    } else {
                        mk3.A01 = null;
                        r14 = AnonymousClass7TE.A1L(oDn.A00, C67208Mk4.SUCCESS);
                    }
                }
                r14 = AnonymousClass7TE.A1L((Object) null, mk3.A00);
            }
        }
        C67014Mgn mgn = (C67014Mgn) r14.A00;
        String name = ((C67208Mk4) r14.A01).name();
        0qQ.A0B(name, 1);
        A0u2.A0J("inbox_state_store_preload_status", name);
        1bO A002 = 1bO.A00(A0p2);
        0qQ.A07(A002);
        C66741Mbm mbm = new C66741Mbm(psx, A002, A0v2);
        C74542Pwb A003 = C67055MhS.A00(A0p2);
        ? obj = new Object();
        C67098MiI miI = new C67098MiI(r37.requireActivity(), r37.requireContext(), r37, A0p2);
        if (mgn == null) {
            Context requireContext = r37.requireContext();
            C66687Mau mau = new C66687Mau(r37.requireContext(), A0p2, mi5, r10);
            UserSession userSession = A0p2;
            C66687Mau mau2 = mau;
            2EM r27 = A0r2;
            C2611948q r29 = A052;
            mgn = new C67014Mgn(requireContext, C66582MXn.A0O(A0p2, AnonymousClass436.A00), userSession, mau2, r27, 1bJ.A00(A0p2), r29, C251033mS.A00(A0p2), A0A2, A1V2, z);
        }
        C67106MiQ miQ = new C67106MiQ(r37, r5, A0p2, miH, miF, A0v2, dfm, r36);
        if (2El.A0E(A0p2)) {
            p3z = new P3Z(A0p2, psx, A0v2);
        }
        C66975Mg9 mg9 = new C66975Mg9(miQ, miI, mbm, p3z, mgn, obj, A003);
        C66687Mau mau3 = mg9.A04.A07;
        C67107MiR miR = new C67107MiR(ma22.A0u().A0A);
        mau3.A01 = (C74564PxD) ma22.A24.getValue();
        mau3.A03 = miR;
        mau3.A00 = (C74548Pwh) ma22.A2v.getValue();
        return mg9;
    }

    public static final C67245Mkf A03(C66633Ma2 ma2) {
        int i;
        C66633Ma2 ma22 = ma2;
        AnonymousClass4DH r2 = ma22.A1J;
        UserSession A0p2 = ma22.A0p();
        2EM A0r2 = ma22.A0r();
        C2611948q A052 = A05(ma22);
        C251033mS r4 = (C251033mS) ma22.A23.getValue();
        boolean A0A2 = 2El.A0A(ma22.A0p());
        boolean A1V2 = AnonymousClass7TF.A1V(ma22.A0b);
        boolean A1V3 = AnonymousClass7TF.A1V(ma22.A0c);
        Mi5 A012 = Mi4.A01(ma22.A0p(), AnonymousClass9NQ.A00(ma22.A0p(), false));
        C74397PuD puD = (C74397PuD) ma22.A24.getValue();
        boolean A1W2 = AnonymousClass7TF.A1W(ma22.A1T, AnonymousClass05K.A0C);
        C67023Mgw mgw = new C67023Mgw(ma22);
        C46483Dfm dfm = (C46483Dfm) ma22.A2S.getValue();
        int A002 = C67238MkY.A00(C67256Mkq.INBOX);
        C67107MiR miR = new C67107MiR(ma22.A0u().A05);
        AnonymousClass7TG.A0w(1, A0p2, A052, r4);
        DbW.A1P(puD, 9, dfm);
        try {
            0fh.A01("InboxClientInfra.createMsys", -1558327602);
            if (AnonymousClass6FC.A00(A0p2)) {
                i = A0r2.A00;
            } else {
                i = -1;
            }
            boolean z = false;
            if (!A1W2) {
                z = true;
            }
            C66752Mbx mbx = new C66752Mbx(A0p2, mgw, A002, i, z);
            1aU r10 = mbx.A05.A01;
            C66919MfD mfD = C66919MfD.A00;
            1aU A0L2 = r10.A0L(mfD);
            C74542Pwb A003 = C67055MhS.A00(A0p2);
            C67054MhR mhR = new C67054MhR(A0L2, A0p2);
            return new C67245Mkf(new C67247Mkh(r2.requireActivity(), r2, A0p2, dfm), new C67249Mkj(r2.requireContext(), r2, A0p2), mbx, new C66918MfC(r10.A0L(mfD), C251033mS.A00(A0p2).A01(), C66582MXn.A0O(A0p2, AnonymousClass436.A00), C318146oT.A00, A0p2, new C67250Mkk(r2.requireContext(), A0p2, puD, A012, miR, r4), A0r2, A052, A0A2, A1V2, A1V3), mhR, A003);
        } finally {
            0fh.A00(85243977);
        }
    }

    public static final C67017Mgq A04(C66633Ma2 ma2) {
        return (C67017Mgq) ma2.A2K.getValue();
    }

    public static final C2611948q A05(C66633Ma2 ma2) {
        C2611948q r0;
        C67488Moi moi = ma2.A0b;
        if (moi == null || (r0 = moi.A00.A01) == null) {
            return C2611948q.ALL;
        }
        return r0;
    }

    public static AnonymousClass0eM A07(Mi8 mi8, Object obj, int i) {
        return mi8.A00(new C73659PhY(obj, i));
    }

    public static AnonymousClass0eM A08(Mi8 mi8, Object obj, int i) {
        return mi8.A00(new C73910Pll(obj, i));
    }

    public static final void A0A(RectF rectF, 28D r19, C66633Ma2 ma2, DirectCameraViewModel directCameraViewModel, C254743sy r22) {
        AnonymousClass3U9 A0d2;
        AnonymousClass4DH r1;
        C66633Ma2 ma22 = ma2;
        28D r10 = r19;
        AnonymousClass9PJ.A00(ma22.A0p()).A07(r10, true);
        String A002 = directCameraViewModel.A00();
        C254703su r4 = null;
        if (A002 == null) {
            A0d2 = null;
        } else {
            A0d2 = C66580MXl.A0d(ma22.A0v(), A002);
        }
        if (A0d2 != null && ((C74564PxD) ma22.A24.getValue()).CK0(A0d2)) {
            2Dm A0v2 = ma22.A0v();
            DirectThreadKey BJy = A0d2.BJz();
            String str = ((C67095MiF) ma22.A1t.getValue()).A01;
            if (str != null) {
                List CFn = A0v2.CFn(BJy, str);
                if (CFn != null && !CFn.isEmpty()) {
                    r4 = (C254703su) CFn.get(DbT.A02(CFn, 1));
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        RectF rectF2 = rectF;
        if (r4 == null) {
            Bundle A0B2 = C66582MXn.A0B(directCameraViewModel);
            C67002Mga.A01(A0B2, r22, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
            C360908fL.A00(r10);
            A0B2.putSerializable("DirectReplyCameraFragments.ARG_REPLY_ENTRY_POINT", r10);
            if (rectF != null) {
                A0B2.putParcelable(AnonymousClass000.A00(24), rectF2);
            }
            r1 = ma22.A1J;
            AnonymousClass6W8 A022 = AnonymousClass6W8.A02(r1.requireActivity(), A0B2, ma22.A0p(), TransparentModalActivity.class, "direct_quick_reply_camera_fragment");
            A022.A0E(ma22.A1P);
            DbU.A1K(r1, A022);
        } else if (A0d2 != null) {
            UserSession A0p2 = ma22.A0p();
            r1 = ma22.A1J;
            DirectCameraViewModel A012 = C71046OaO.A01(r1.requireContext(), A0p2, (C254933tI) null, A0d2, A0d2.C6C(), 0);
            1aq r7 = 1as.A04.A01;
            DirectThreadKey BJy2 = A0d2.BJz();
            String A0g2 = r4.A0g();
            String A0f2 = r4.A0f();
            boolean z = r4.A2P;
            AnonymousClass6W8 A023 = AnonymousClass6W8.A02(r1.requireActivity(), r7.A00(rectF2, rectF2, r10, (ImageUrl) null, (C254933tI) null, A012, BJy2, A0g2, A0f2, (String) null, C66582MXn.A0e(r4).CFp(), (ArrayList) null, z, false, false), ma22.A0p(), TransparentModalActivity.class, "direct_visual_reply_fragment");
            A023.A0E(ma22.A1P);
            A023.A0D(r1, 13366);
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        r1.requireActivity().overridePendingTransition(0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r4 = (X.C254703su) r1.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0C(android.graphics.RectF r20, X.C66633Ma2 r21, X.AnonymousClass7SD r22, X.AnonymousClass2Ep r23, com.instagram.model.direct.DirectShareTarget r24, X.C254743sy r25) {
        /*
            r5 = r21
            X.2Dm r1 = r5.A0v()
            r18 = r24
            com.instagram.model.direct.DirectThreadKey r0 = r18.A00()
            java.util.ArrayList r1 = r1.CBx(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0072
            r3 = 0
            java.lang.Object r4 = r1.get(r3)
            X.3su r4 = (X.C254703su) r4
            com.google.common.collect.ImmutableList r2 = r4.A0H()
            if (r2 == 0) goto L_0x0072
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0072
            java.lang.Object r0 = r2.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            java.lang.String r0 = r0.A0u
            if (r0 == 0) goto L_0x0072
            r7 = 0
            android.net.Uri r1 = X.0cp.A03(r0)
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = "id"
            java.lang.String r12 = r1.getQueryParameter(r0)
            if (r12 == 0) goto L_0x0072
            com.instagram.model.direct.messageid.DirectMessageIdentifier r8 = r4.A0V()
            java.lang.Object r0 = r2.get(r3)
            X.3tC r0 = (X.C254873tC) r0
            com.instagram.model.mediasize.ExtendedImageUrl r6 = r0.A0X
            X.4DH r14 = r5.A1J
            com.instagram.common.session.UserSession r15 = r5.A0p()
            X.P9H r4 = new X.P9H
            r16 = r22
            r17 = r23
            r19 = r25
            r13 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            r5 = r20
            r9 = r7
            r11 = r10
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r3
            r4.CpS(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A0C(android.graphics.RectF, X.Ma2, X.7SD, X.2Ep, com.instagram.model.direct.DirectShareTarget, X.3sy):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0D(android.view.View r3, X.C66633Ma2 r4) {
        /*
            java.lang.String r0 = "DirectInboxController.onThreadOrSuggestedRowBind"
            X.0lp r2 = X.0lq.A00(r0)
            X.0eM r0 = r4.A2u     // Catch:{ all -> 0x0017 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0017 }
            X.2el r0 = (X.2el) r0     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0013
            r0.A04(r3)     // Catch:{ all -> 0x0017 }
        L_0x0013:
            r2.close()
            return
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A0D(android.view.View, X.Ma2):void");
    }

    public static final void A0E(C69293Nit nit, C66633Ma2 ma2, int i) {
        Integer num;
        String str;
        C238143As r0;
        AnonymousClass4DH r2 = ma2.A1J;
        if (r2.getActivity() != null) {
            C66736Mbh A0U2 = C66581MXm.A0U(ma2);
            C71973Oty oty = new C71973Oty(new C68700NTm(ma2), nit, Integer.valueOf(i));
            NUR A002 = C69899Nu1.A00(A0U2.A0B);
            C69293Nit nit2 = oty.A01;
            Integer num2 = oty.A02;
            A002.A09();
            int ordinal = nit2.ordinal();
            if (ordinal == 0) {
                num = AnonymousClass05K.A01;
            } else if (ordinal == 1) {
                num = AnonymousClass05K.A0N;
            } else if (ordinal == 2) {
                num = AnonymousClass05K.A0Y;
            } else if (ordinal == 3) {
                num = AnonymousClass05K.A0u;
            } else if (ordinal == 4) {
                num = AnonymousClass05K.A15;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            C66913Mex.A02(A002, num2, "PERIOD", C69893Ntv.A00(num));
            if (ordinal == 0) {
                str = "INTRODUCE_BANNER_IMPRESSION";
            } else if (ordinal == 1) {
                str = "SELL_BANNER_IMPRESSION";
            } else if (ordinal == 2) {
                str = "WARN_BANNER_IMPRESSION";
            } else if (ordinal != 3) {
                str = "MEX_EB_LOW_DISK_SPACE_BANNER_IMPRESSION";
            } else {
                str = "MEX_EB_UPSELL_BANNER_IMPRESSION";
            }
            A002.A0B(str);
            C67141Miz miz = A0U2.A0E;
            C71973Oty oty2 = miz.A05;
            if (oty2 == null || !oty.isContentSame(oty2)) {
                miz.A05 = oty;
                C66736Mbh.A04(A0U2);
            }
            C238143As r02 = ma2.A0n;
            if (r02 == null) {
                0qQ.A0F("inboxViewProxy");
                throw AnonymousClass00P.createAndThrow();
            } else if (r02.B6L() <= 1 && (r0 = ma2.A0n) != null) {
                r0.EKm(r2);
            }
        }
    }

    public static final void A0K(C66633Ma2 ma2) {
        if (AnonymousClass7TF.A1Z(ma2.A2D) && !AnonymousClass65A.A02(AnonymousClass65D.A00(ma2.A0p()).A00, 36326627231152009L)) {
            C67039MhC.A00(ma2.A0p()).A00 = true;
            C67039MhC.A00(ma2.A0p()).A00(ma2.A1J, ma2.A0p(), new C72307P0y(ma2), AnonymousClass05K.A01);
        }
    }

    public static final void A0L(C66633Ma2 ma2) {
        1Wj r4 = 1Wj.A00;
        UserSession A0p2 = ma2.A0p();
        if (r4 != null && A0p2 != null) {
            r4.A00(ma2.A1J.getActivity(), A0p2, "1683363615491576", C66582MXn.A0y("logged_in_accounts", String.valueOf(AnonymousClass0BO.A00(A0p2).BNv())));
        }
    }

    public static final void A0N(C66633Ma2 ma2) {
        Drawable drawable;
        C358248ab A0Y2;
        int i;
        DialogInterface.OnClickListener lv2;
        OCH och = ma2.A0j;
        View view = ma2.A0A;
        if (!(och == null || view == null)) {
            C238143As r0 = ma2.A0n;
            if (r0 != null) {
                if (r0.AnH() > 0) {
                    C238143As r02 = ma2.A0n;
                    if (r02 != null) {
                        if (r02.AnC(0).getTop() == 0 && 2El.A0D(ma2.A0p())) {
                            UserSession A0p2 = ma2.A0p();
                            AnonymousClass4DH r4 = ma2.A1J;
                            FragmentActivity requireActivity = r4.requireActivity();
                            1Av A002 = 1Au.A00(A0p2);
                            if (!AnonymousClass7TG.A1a(A002, A002.A3Q, 1Av.A8a, 106)) {
                                och.A00 = view;
                                C73392Pbp pbp = new C73392Pbp(requireActivity, view, A0p2, och, A002);
                                och.A01 = pbp;
                                view.postDelayed(pbp, 500);
                                C327977Cy.A00((C69489NmX) null, C69462Nm6.IMPRESSION, C69487NmV.FILTER_TOOLTIP, new C327977Cy(r4, A0p2), (String) null, A0p2.A06);
                                return;
                            }
                        }
                    }
                }
            }
            0qQ.A0F("inboxViewProxy");
            throw AnonymousClass00P.createAndThrow();
        }
        View view2 = ma2.A0A;
        OCG ocg = ma2.A0i;
        if (!(ocg == null || view2 == null)) {
            C238143As r03 = ma2.A0n;
            if (r03 != null) {
                if (r03.AnH() > 0) {
                    C238143As r04 = ma2.A0n;
                    if (r04 != null) {
                        if (r04.AnC(0).getTop() == 0) {
                            UserSession A0p3 = ma2.A0p();
                            FragmentActivity requireActivity2 = ma2.A1J.requireActivity();
                            1Av A003 = 1Au.A00(A0p3);
                            if (!AnonymousClass7TG.A1a(A003, A003.A3P, 1Av.A8a, 105)) {
                                ocg.A00 = view2;
                                C73391Pbo pbo = new C73391Pbo(requireActivity2, view2, A0p3, ocg, A003);
                                ocg.A01 = pbo;
                                view2.postDelayed(pbo, 500);
                            }
                        }
                    }
                }
            }
            0qQ.A0F("inboxViewProxy");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass4DH r5 = ma2.A1J;
        FragmentActivity activity = r5.getActivity();
        if (activity != null) {
            JYH jyh = new JYH(ma2.A0p());
            UserSession userSession = jyh.A00;
            if (1xy.A00(userSession).A00()) {
                1Av A004 = 1Au.A00(userSession);
                if (C66797Mcj.A01(userSession, false) && new AnonymousClass630(userSession).A02.A01(115)) {
                    boolean z = !AnonymousClass7TG.A1a(A004, A004.A4K, 1Av.A8a, 439);
                    if (z) {
                        boolean A012 = new AnonymousClass630(userSession).A02.A01(1);
                        String A162 = AnonymousClass7TE.A16(activity, 2131964884);
                        String A0c2 = DbY.A0c(activity, A162, 2131968746);
                        C358248ab A0Y3 = DbS.A0Y(activity);
                        if (A012) {
                            A0Y3.A09(2131968749);
                            A0Y3.A0Z(new LV0(39, activity, jyh), A0c2, A162);
                            A0Y3.A0R(new LV2(jyh, 14), C358278ae.BLUE_BOLD, 2131968747);
                            i = 2131968748;
                            lv2 = new LV0(40, activity, jyh);
                        } else {
                            A0Y3.A09(2131968750);
                            A0Y3.A0Z(new LV0(41, activity, jyh), A0c2, A162);
                            A0Y3.A0R(new LV0(42, activity, jyh), C358278ae.BLUE_BOLD, 2131969739);
                            i = 2131972885;
                            lv2 = new LV2(jyh, 15);
                        }
                        A0Y3.A0G(lv2, i);
                        DbT.A1V(A0Y3);
                        1Au.A00(userSession).A1X(true);
                    }
                    if (z) {
                        return;
                    }
                } else if (AnonymousClass7TG.A1a(A004, A004.A4K, 1Av.A8a, 439)) {
                    A004.A1X(false);
                }
            }
        }
        FragmentActivity activity2 = r5.getActivity();
        if (activity2 != null) {
            C46480Dfj dfj = new C46480Dfj(1Au.A00(ma2.A0p()), ma2.A0p());
            UserSession userSession2 = dfj.A00;
            if (!182.A06(0Tu.A05, userSession2, 36327537764219383L) && 1xy.A00(userSession2).A00()) {
                boolean A022 = C67046MhJ.A02(userSession2);
                boolean A005 = C67046MhJ.A00(userSession2);
                boolean A013 = C67046MhJ.A01(userSession2);
                if (A022) {
                    1Av r7 = dfj.A01;
                    AnonymousClass7TF.A1J(r7, r7.A3e, 1Av.A8a, 434, true);
                }
                if (A005) {
                    1Av r72 = dfj.A01;
                    AnonymousClass7TF.A1J(r72, r72.A3c, 1Av.A8a, 435, true);
                }
                if (A013) {
                    dfj.A01.A1U(true);
                } else if (!A005) {
                    if (A022) {
                        A0Y2 = DbS.A0Y(activity2);
                        A0Y2.A09(2131963347);
                        A0Y2.A08(2131963346);
                        A0Y2.A0J(new C50026FJl(activity2, (AnonymousClass0iw) r5, dfj, 14), 2131963348);
                        A0Y2.A0G(new C50025FJk(17, (Object) r5, (Object) dfj), 2131963350);
                        DbT.A1V(A0Y2);
                        return;
                    }
                }
                A0Y2 = DbS.A0Y(activity2);
                A0Y2.A09(2131963345);
                A0Y2.A08(2131963343);
                A0Y2.A0J(new C50026FJl(activity2, (AnonymousClass0iw) r5, dfj, 13), 2131963344);
                DbT.A1V(A0Y2);
                return;
            }
        }
        UserSession A0p4 = ma2.A0p();
        Context requireContext = r5.requireContext();
        0qQ.A0B(A0p4, 0);
        1Av A006 = 1Au.A00(A0p4);
        if (A006.A01.getInt("blend_direct_inbox_nux_seen_count", 0) < 1 && 1Av.A07(A006, "blend_direct_inbox_nux_last_shown_time_ms", 1) && 182.A06(0Tu.A05, A0p4, 36324123265281861L) && GAW.A00(A0p4).booleanValue() && (drawable = requireContext.getDrawable(R.drawable.instagram_icons_exceptions_illo_blend_refresh_outline_96)) != null) {
            F3t f3t = new F3t(requireContext);
            f3t.A03(drawable);
            f3t.A05 = AnonymousClass05K.A01;
            String A0a2 = JTQ.A0a(requireContext, 2131955299);
            0qQ.A07(A0a2);
            f3t.A06 = A0a2;
            String A0a3 = JTQ.A0a(requireContext, 2131955297);
            0qQ.A07(A0a3);
            f3t.A04 = A0a3;
            String A0a4 = JTQ.A0a(requireContext, 2131955298);
            0qQ.A07(A0a4);
            f3t.A03 = A0a4;
            String A0a5 = JTQ.A0a(requireContext, 2131968772);
            0qQ.A07(A0a5);
            f3t.A02((DialogInterface.OnClickListener) null, A0a5);
            AnonymousClass0fN.A00(f3t.A00());
            0xY A0g2 = AnonymousClass7TG.A0g(AnonymousClass7TE.A0q(A0p4), "blend_direct_inbox_nux_seen_count");
            A0g2.E5c("blend_direct_inbox_nux_last_shown_time_ms", System.currentTimeMillis());
            A0g2.apply();
        }
    }

    public static final void A0O(C66633Ma2 ma2) {
        if (AnonymousClass9B2.A03) {
            0nY.A00().ATE(new C378819Ri(ma2, A00(ma2)));
        }
    }

    public static final void A0P(C66633Ma2 ma2) {
        if (C290645fe.A02) {
            0nY.A00().ATE(new MhV(ma2, A00(ma2)));
        }
    }

    public static final void A0S(C66633Ma2 ma2) {
        AnonymousClass0eM r3 = ma2.A2e;
        AnonymousClass4DH r2 = ma2.A1J;
        ((MYU) r3.getValue()).A0R(r2.requireContext(), C71342cb.A00(ma2.A0p()), r2);
        ((AnonymousClass9HT) r3.getValue()).A05.A04();
        ((AnonymousClass9HT) r3.getValue()).A05.A05();
        ((C252423p5) r3.getValue()).A0K("is_inbox_ia_m2_requests_tab", true);
        ((AnonymousClass9HT) r3.getValue()).A08.A00 = false;
        ((MYU) r3.getValue()).A0M();
    }

    public static final void A0U(C66633Ma2 ma2, int i, boolean z) {
        0Tu r4;
        String str;
        if (ma2.A0K != null) {
            if (z) {
                UserSession A0p2 = ma2.A0p();
                r4 = 0Tu.A05;
                if (182.A06(r4, A0p2, 36317934217467542L)) {
                    str = "direct_ibc_inbox_discovery";
                }
            } else if (A0m(ma2, i) && !2El.A0N(ma2.A0p(), ma2.A1A(AnonymousClass2EX.A00))) {
                UserSession A0p3 = ma2.A0p();
                r4 = 0Tu.A05;
                if (182.A06(r4, A0p3, 36317934219499186L)) {
                    str = "direct_ibc_inbox_discovery_nullstate";
                }
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            C290645fe r0 = ma2.A0K;
            if (r0 != null) {
                long j = 0;
                if (DbY.A04(r0.A01(str).A00) < System.currentTimeMillis()) {
                    A1C2.add(str);
                }
                if (z && 182.A06(r4, ma2.A0p(), 36317934218385060L)) {
                    C290645fe r02 = ma2.A0K;
                    if (r02 != null) {
                        Long l = r02.A01("direct_ibc_inbox_invitations").A00;
                        if (l != null) {
                            j = l.longValue();
                        }
                        if (j < System.currentTimeMillis()) {
                            A1C2.add("direct_ibc_inbox_invitations");
                        }
                    }
                }
                if (DbT.A1b(A1C2)) {
                    C290645fe r03 = ma2.A0K;
                    if (r03 != null) {
                        r03.A08(A1C2);
                    }
                }
                C290965gI.A00(ma2.A0p()).A00.markerStart(77014026);
                0nY.A00().ATE(new NSI(ma2, str, z));
                return;
            }
            0qQ.A0F("banyanClient");
            throw AnonymousClass00P.createAndThrow();
        }
        C67141Miz miz = C66581MXm.A0U(ma2).A0E;
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 0);
        miz.A0L = r1;
    }

    public static final void A0V(C66633Ma2 ma2, C67237MkX mkX) {
        C238143As r1;
        ma2.A0f = mkX;
        C238143As r0 = ma2.A0n;
        if (r0 == null) {
            0qQ.A0F("inboxViewProxy");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r0.B6L() > 1 && (r1 = ma2.A0n) != null) {
            r1.EKm(ma2.A1J);
        }
        if (mkX == C67237MkX.A06) {
            C66736Mbh A0U2 = C66581MXm.A0U(ma2);
            A0U2.A0E.A0B = null;
            C66736Mbh.A03(A0U2);
            C66976MgA mgA = (C66976MgA) ma2.A2N.getValue();
            if (mgA != null) {
                C67231MkR.A00(mgA.A04, new C73565Pfm(mgA, (AnonymousClass4D7) null, 44));
            }
            C67488Moi moi = ma2.A0b;
            if (moi != null) {
                moi.A02(C67304Mle.A05);
                return;
            }
            return;
        }
        C67237MkX mkX2 = C67237MkX.A05;
        AnonymousClass0eM r4 = ma2.A2t;
        C66736Mbh mbh = (C66736Mbh) r4.getValue();
        if (mkX == mkX2) {
            mbh.A0E.A0B = null;
            C66736Mbh.A03(mbh);
            ((C66736Mbh) r4.getValue()).A06((C232262tL) null);
            return;
        }
        mbh.A0E.A0B = C69974NvE.A00(ma2.A0p(), C67486Mog.A00(A05(ma2)), mkX, ma2.A0s());
        C66736Mbh.A03(mbh);
        ((C66736Mbh) r4.getValue()).A06((C232262tL) null);
        ((C66736Mbh) r4.getValue()).A07((C67303Mld) ma2.A2I.getValue(), false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0W(X.C66633Ma2 r3, com.instagram.model.direct.DirectThreadKey r4) {
        /*
            java.lang.String r0 = "DirectInboxController.updateThreadRowViewModel"
            X.0lp r2 = X.0lq.A00(r0)
            X.2Dm r0 = r3.A0v()     // Catch:{ all -> 0x001f }
            X.3U9 r1 = r0.B33(r4)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001b
            X.Pvy r0 = X.C66581MXm.A0V(r3)     // Catch:{ all -> 0x001f }
            X.PxF r0 = r0.C6W()     // Catch:{ all -> 0x001f }
            r0.FMN(r1)     // Catch:{ all -> 0x001f }
        L_0x001b:
            r2.close()
            return
        L_0x001f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A0W(X.Ma2, com.instagram.model.direct.DirectThreadKey):void");
    }

    public static final void A0X(C66633Ma2 ma2, Integer num) {
        int A002;
        if (ma2.A0J == null && !ma2.A18) {
            ma2.A18 = true;
            ma2.A0u().A0E("init_ai_agent_start");
            AnonymousClass9B3 r4 = AnonymousClass9B2.A04;
            UserSession A0p2 = ma2.A0p();
            NQT nqt = new NQT(ma2, 7);
            if (num != null) {
                A002 = num.intValue();
            } else {
                A002 = A00(ma2);
            }
            r4.A00(A0p2, nqt, ma2.A01(), A002);
        }
    }

    public static final void A0Y(C66633Ma2 ma2, Integer num) {
        int A002;
        if (ma2.A0K == null && !ma2.A19) {
            ma2.A19 = true;
            ma2.A0u().A0E("init_banyan_start");
            UserSession A0p2 = ma2.A0p();
            NQT nqt = new NQT(ma2, 8);
            if (num != null) {
                A002 = num.intValue();
            } else {
                A002 = A00(ma2);
            }
            C228602lw A012 = ma2.A01();
            0qQ.A0B(A0p2, 0);
            C290815g0 A013 = C290635fd.A01(A0p2, nqt);
            if (A012 != null) {
                A012.schedule(A013, 1967622104, A002, false, false);
            } else {
                1ES.A05(A013, 1967622104, A002, false, false);
            }
        }
    }

    public static final void A0b(C66633Ma2 ma2, boolean z) {
        C67304Mle mle;
        C67488Moi moi = ma2.A0b;
        if (moi != null) {
            mle = moi.A00;
        } else {
            mle = null;
        }
        if (mle == C67304Mle.A08 && z) {
            0xa A0q2 = AnonymousClass7TE.A0q(ma2.A0p());
            if (A0q2.getBoolean("should_show_refresh_close_friends_filter_toast", false)) {
                AnonymousClass4DH r1 = ma2.A1J;
                if (r1.getContext() != null) {
                    C310336ap A0X2 = DbV.A0X();
                    A0X2.A0H = "filter_close_friends_list_changed_education";
                    A0X2.A06();
                    DbS.A19(r1.requireContext(), A0X2, 2131962419);
                    DbY.A1N(A0X2);
                    DbX.A1V(A0q2, "should_show_refresh_close_friends_filter_toast", false);
                    ma2.A1C = false;
                }
            }
        }
    }

    public static final boolean A0e(AuthData authData, C66633Ma2 ma2, C74513Pw8 pw8, C51871G5i g5i) {
        User user;
        if (authData != null && pw8 != null && pw8.getCount() == 2) {
            int i = 0;
            int count = pw8.getCount();
            while (true) {
                if (i >= count) {
                    break;
                }
                if (!C66580MXl.A1X(ma2.A0p(), pw8.BF8(i))) {
                    user = C70882OPz.A00(authData, pw8, 17h.A00(ma2.A0p()), i);
                    break;
                }
                i++;
            }
            if (user == null && pw8 != null && pw8.getCount() == 2) {
                return ((C46483Dfm) ma2.A2S.getValue()).A01(ma2.A1J, g5i, user, "inbox", "-1", 0, true, false, false, false, false);
            }
            return false;
        }
        user = null;
        return user == null ? false : false;
    }

    public static final boolean A0i(C66633Ma2 ma2) {
        C67488Moi moi = ma2.A0b;
        if (moi == null || moi.A00 == C67304Mle.A05) {
            return false;
        }
        return true;
    }

    public static final boolean A0k(C66633Ma2 ma2) {
        if (ma2.A06 != 0) {
            if (!182.A06(0Tu.A05, ma2.A0p(), 36328156240165911L) || !A0n(ma2, ma2.A06)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int A0o() {
        Integer num = this.A1T;
        if ((num == AnonymousClass05K.A0C || num == AnonymousClass05K.A01) && C272094k5.A09(A0p())) {
            return this.A00;
        }
        return A0v().A0C.A07();
    }

    public final UserSession A0p() {
        return (UserSession) this.A2s.getValue();
    }

    public final C74510Pw5 A0q() {
        AnonymousClass0eM r3 = this.A1h;
        P3Z BbV = ((C74503Pvy) r3.getValue()).BbV();
        if (BbV == null || !0qQ.A0K(A0s(), C300895y8.A00)) {
            return ((C74503Pvy) r3.getValue()).BNZ();
        }
        return BbV;
    }

    public final 2EM A0r() {
        String string = this.A1J.requireArguments().getString("DirectFragment.INITIAL_MODE");
        if (string != null) {
            2EM A002 = C67084Mhz.A00(string);
            if (A002 != null) {
                return A002;
            }
            throw AnonymousClass7TE.A0y();
        }
        boolean A0C2 = 2El.A0C(A0p());
        UserSession A0p2 = A0p();
        if (A0C2) {
            if (2El.A03(A0p2)) {
                UserSession A0p3 = A0p();
                if (!182.A06(AnonymousClass7TF.A0H(A0p3), A0p3, 36315387301858464L)) {
                    return AnonymousClass2EY.A00;
                }
            }
        } else if (!2El.A0H(A0p2)) {
            return AnonymousClass43A.A00;
        }
        return AnonymousClass2EU.A00;
    }

    public final 2EM A0s() {
        C67479MoZ moZ = this.A0c;
        if (moZ != null) {
            return moZ.A00;
        }
        return null;
    }

    public final 2EM A0t() {
        C67479MoZ moZ = this.A0c;
        if (moZ != null) {
            return moZ.A00;
        }
        return AnonymousClass43A.A00;
    }

    public final Mi9 A0u() {
        return (Mi9) this.A2L.getValue();
    }

    public final 2Dm A0v() {
        return (2Dm) this.A2q.getValue();
    }

    public final AnonymousClass59G A0w(int i) {
        C67028Mh1 mh1 = this.A0l;
        if (mh1 == null || !mh1.A08.get()) {
            return C66827MdJ.A00(this.A1J.requireContext(), A0p(), i);
        }
        return C66862Mdv.A00(JTR.A0R(this.A1J), i, mh1.A09.get(), mh1.A0A.get());
    }

    public final void A0y() {
        Pair pair = this.A07;
        if (pair != null) {
            ((C74455PvA) pair.second).DOd();
            HashMap hashMap = this.A1U;
            Pair pair2 = this.A07;
            0qQ.A0A(pair2);
            hashMap.remove(pair2.first);
            HashMap hashMap2 = this.A1W;
            Pair pair3 = this.A07;
            0qQ.A0A(pair3);
            hashMap2.remove(pair3.first);
            this.A07 = null;
        }
        C70615ODm oDm = this.A0a;
        if (oDm != null) {
            oDm.A01.DOd();
            oDm.A00.removeCallbacks(oDm.A02);
        }
        this.A0a = null;
        C67087Mi3 mi3 = ((C67095MiF) this.A1t.getValue()).A06;
        mi3.A01 = null;
        mi3.A00 = null;
        mi3.A02 = null;
    }

    public final void A10() {
        if (this.A0K != null) {
            UserSession A0p2 = A0p();
            if (182.A06(AnonymousClass7TF.A0H(A0p2), A0p2, 36317934218385060L)) {
                0nY.A00().ATE(new C67576MqA(this));
            }
        }
    }

    public final void A12() {
        if (this.A1H) {
            ((AnonymousClass439) this.A1o.getValue()).A03();
        }
        A04(this).A00 = AnonymousClass0t1.A01.A01(A0p()).A2L();
        A04(this).A00 = A0s();
        C67017Mgq A042 = A04(this);
        Context requireContext = this.A1J.requireContext();
        2cc A002 = C71342cb.A00(A0p());
        if (!A042.A01) {
            A042.A04();
            A042.A01 = false;
            A042.A0Q(requireContext, A002, (AnonymousClass0iw) null, false);
        }
        A04(this).A08.A00 = false;
        C67013Mgm.A00(A0p(), A04(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r2.equals(r0) != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (null == r1.A07) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A16(java.lang.Integer r9) {
        /*
            r8 = this;
            X.4DH r7 = r8.A1J
            boolean r0 = r7.isAdded()
            if (r0 == 0) goto L_0x005c
            android.content.Context r0 = r7.getContext()
            if (r0 == 0) goto L_0x005c
            int r5 = r8.A0o()
            int r1 = r8.A01
            if (r1 == 0) goto L_0x00b7
            r0 = 1
            if (r1 == r0) goto L_0x0069
            int r5 = X.C51967G9n.A04(r9, r5)
            boolean r6 = A0i(r8)
            if (r6 == 0) goto L_0x005d
            X.Moi r0 = r8.A0b
            if (r0 == 0) goto L_0x0059
            X.Mbh r4 = X.C66581MXm.A0U(r8)
            android.content.Context r1 = r7.requireContext()
            X.Mle r0 = r0.A00
            int r0 = r0.A00
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131964246(0x7f133156, float:1.9565268E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = -1
            X.MfX r2 = new X.MfX
            r2.<init>(r3, r1, r0, r6)
            X.Miz r1 = r4.A0E
            X.MfX r0 = r1.A07
            if (r0 == 0) goto L_0x0054
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0059
        L_0x0054:
            r1.A07 = r2
            X.C66736Mbh.A04(r4)
        L_0x0059:
            r8.A14(r5)
        L_0x005c:
            return
        L_0x005d:
            X.Mbh r4 = X.C66581MXm.A0U(r8)
            r2 = 0
            X.Miz r1 = r4.A0E
            X.MfX r0 = r1.A07
            if (r2 != r0) goto L_0x0054
            goto L_0x0059
        L_0x0069:
            boolean r6 = A0i(r8)
            android.content.Context r1 = r7.requireContext()
            X.Moi r0 = r8.A0b
            if (r0 == 0) goto L_0x00b3
            X.Mle r0 = r0.A00
            if (r0 == 0) goto L_0x00b3
            int r0 = r0.A00
        L_0x007b:
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
            X.0eM r2 = r8.A2t
            java.lang.Object r1 = r2.getValue()
            X.Mbh r1 = (X.C66736Mbh) r1
            r0 = 0
            r1.A08(r0)
            java.lang.Object r3 = r2.getValue()
            X.Mbh r3 = (X.C66736Mbh) r3
            android.content.Context r1 = r7.requireContext()
            r0 = 2131962429(0x7f132a3d, float:1.9561583E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            X.MfX r2 = new X.MfX
            r2.<init>(r4, r0, r5, r6)
            X.Miz r1 = r3.A0E
            X.MfX r0 = r1.A07
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005c
        L_0x00ad:
            r1.A07 = r2
            X.C66736Mbh.A04(r3)
            return
        L_0x00b3:
            r0 = 2131959520(0x7f131ee0, float:1.9555683E38)
            goto L_0x007b
        L_0x00b7:
            X.0eM r4 = r8.A2t
            java.lang.Object r3 = r4.getValue()
            X.Mbh r3 = (X.C66736Mbh) r3
            r2 = 0
            X.Miz r1 = r3.A0E
            X.MfX r0 = r1.A07
            if (r2 == r0) goto L_0x00cb
            r1.A07 = r2
            X.C66736Mbh.A04(r3)
        L_0x00cb:
            java.lang.Object r0 = r4.getValue()
            X.Mbh r0 = (X.C66736Mbh) r0
            r0.A08(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A16(java.lang.Integer):void");
    }

    public final boolean A19() {
        if (!2Ek.A01(AnonymousClass0t1.A01.A01(A0p()))) {
            return false;
        }
        if (A1A(AnonymousClass2EX.A00)) {
            return true;
        }
        UserSession A0p2 = A0p();
        0Tu A0H2 = AnonymousClass7TF.A0H(A0p2);
        if (182.A06(A0H2, A0p2, 36315855453163110L) || 182.A06(A0H2, A0p(), 36317934217467542L)) {
            return true;
        }
        return false;
    }

    public static int A00(C66633Ma2 ma2) {
        return (int) 182.A01(0Tu.A05, ma2.A0p(), 36604047760167932L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        r1 = r4.A1J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C228602lw A01() {
        /*
            r4 = this;
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002c
            com.instagram.common.session.UserSession r3 = r4.A0p()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327576419777051(0x810fbd000d3a1b, double:3.037043835051492E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002c
            X.4DH r1 = r4.A1J
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x002c
            X.2lw r0 = X.JTU.A0I(r0, r1)
            return r0
        L_0x002c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A01():X.2lw");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A06(X.C66633Ma2 r5) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.MoZ r0 = r5.A0c
            if (r0 == 0) goto L_0x00c9
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.2El.A0G(r0)
            if (r0 != 0) goto L_0x00c9
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.2El.A0C(r0)
            com.instagram.common.session.UserSession r2 = r5.A0p()
            if (r0 == 0) goto L_0x00fc
            boolean r0 = X.2El.A03(r2)
            if (r0 == 0) goto L_0x00dd
            X.2EY r0 = X.AnonymousClass2EY.A00
        L_0x0028:
            r4.add(r0)
        L_0x002b:
            X.2EU r0 = X.AnonymousClass2EU.A00
            r4.add(r0)
            X.2Ea r2 = X.C69932Ea.A00
            boolean r0 = r5.A1A(r2)
            if (r0 == 0) goto L_0x005d
            com.instagram.common.session.UserSession r1 = r5.A0p()
            r0 = 0
            boolean r0 = X.2El.A0M(r1, r0)
            if (r0 == 0) goto L_0x005d
            r4.add(r2)
            com.instagram.common.session.UserSession r0 = r5.A0p()
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            r2 = 1
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "has_seen_ad_responses_threads"
            r1.E5T(r0, r2)
            r1.apply()
        L_0x005d:
            com.instagram.common.session.UserSession r1 = r5.A0p()
            r2 = 0
            X.0qQ.A0B(r1, r2)
            boolean r0 = X.2El.A0M(r1, r2)
            if (r0 == 0) goto L_0x00cd
            X.4kA r0 = X.AnonymousClass4k9.A00(r1)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "has_seen_ad_responses_threads"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x00cd
        L_0x0079:
            boolean r0 = r5.A19()
            if (r0 == 0) goto L_0x0084
            X.2EX r0 = X.AnonymousClass2EX.A00
            r4.add(r0)
        L_0x0084:
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.2El.A0E(r0)
            if (r0 == 0) goto L_0x00ca
            X.5y8 r0 = X.C300895y8.A00
        L_0x0090:
            r4.add(r0)
            com.instagram.common.session.UserSession r1 = X.C66580MXl.A0P(r5, r2)
            boolean r0 = X.2El.A0M(r1, r2)
            if (r0 == 0) goto L_0x00ba
            X.4kA r0 = X.AnonymousClass4k9.A00(r1)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "has_seen_ad_responses_threads"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x00ba
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.2El.A0J(r0)
            if (r0 != 0) goto L_0x00ba
            X.2EL r0 = X.AnonymousClass2EL.A00
            r4.add(r0)
        L_0x00ba:
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.2El.A0K(r0)
            if (r0 == 0) goto L_0x00c9
            X.MkU r0 = X.C67234MkU.A00
        L_0x00c6:
            r4.add(r0)
        L_0x00c9:
            return r4
        L_0x00ca:
            X.43I r0 = X.AnonymousClass43I.A00
            goto L_0x0090
        L_0x00cd:
            com.instagram.common.session.UserSession r0 = r5.A0p()
            boolean r0 = X.2El.A0J(r0)
            if (r0 != 0) goto L_0x0079
            X.2EL r0 = X.AnonymousClass2EL.A00
            r4.add(r0)
            goto L_0x0079
        L_0x00dd:
            com.instagram.common.session.UserSession r3 = X.C66582MXn.A0P(r5)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r3)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x002b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317934217598616(0x8106f800041698, double:3.0309460675678176E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x002b
            X.43A r0 = X.AnonymousClass43A.A00
            goto L_0x0028
        L_0x00fc:
            X.2EX r1 = X.AnonymousClass2EX.A00
            boolean r0 = r5.A1A(r1)
            boolean r0 = X.2El.A0N(r2, r0)
            if (r0 == 0) goto L_0x00c9
            X.43A r0 = X.AnonymousClass43A.A00
            r4.add(r0)
            r4.add(r1)
            X.43I r0 = X.AnonymousClass43I.A00
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A06(X.Ma2):java.util.ArrayList");
    }

    public static final void A0G(C66633Ma2 ma2) {
        boolean z;
        boolean z2;
        List A0F2 = ma2.A0v().A0C.A0F(ma2.A0t());
        C67017Mgq A042 = A04(ma2);
        A042.A02 = A0F2;
        boolean z3 = A0F2 instanceof Collection;
        boolean z4 = true;
        if (!z3 || !A0F2.isEmpty()) {
            Iterator it = A0F2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((2Er) it.next()).CVb()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        A042.A03 = z;
        if (!z3 || !A0F2.isEmpty()) {
            Iterator it2 = A0F2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((2Er) it2.next()).CVZ(A042.A07)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z2 = false;
        A042.A04 = z2;
        if (!A042.A03 && !z2) {
            z4 = false;
        }
        A042.A0K("is_instamadillo", z4);
        Mi9 A0u2 = ma2.A0u();
        boolean z5 = false;
        if (!z3 || !A0F2.isEmpty()) {
            Iterator it3 = A0F2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((2Er) it3.next()).CVa(A0u2.A07)) {
                        z5 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        A0u2.A0K("is_instamadillo", z5);
        C46487Dfq dfq = ma2.A0p;
        if (dfq != null) {
            HashSet A1F2 = AnonymousClass7TE.A1F();
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next : A0F2) {
                if (A1F2.add(Integer.valueOf(((2Eq) next).C6a()))) {
                    A1C2.add(next);
                }
            }
            ArrayList<Number> A0p2 = AnonymousClass7TF.A0p(A1C2);
            Iterator it4 = A1C2.iterator();
            while (it4.hasNext()) {
                A0p2.add(Integer.valueOf(((2Eq) it4.next()).C6a()));
            }
            ArrayList A0p3 = AnonymousClass7TF.A0p(A0p2);
            for (Number intValue : A0p2) {
                A0p3.add(AnonymousClass48O.A00(intValue.intValue()));
            }
            List A0a2 = 00k.A0a(A0p3);
            ArrayList<2Eq> A1C3 = AnonymousClass7TE.A1C();
            for (Object next2 : A0F2) {
                if (((2Eq) next2).C6a() == 29) {
                    A1C3.add(next2);
                }
            }
            ArrayList A0p4 = AnonymousClass7TF.A0p(A1C3);
            for (2Eq C6k : A1C3) {
                A0p4.add(C6k.C6k());
            }
            List A0a3 = 00k.A0a(A0p4);
            boolean z6 = false;
            if (!z3 || !A0F2.isEmpty()) {
                Iterator it5 = A0F2.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (((2Er) it5.next()).CVb()) {
                            z6 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C229402nK r0 = dfq.A00;
            r0.A08 = A0p2;
            r0.A09 = A0a2;
            r0.A07 = A0a3;
            r0.A0A = z6;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0H(C66633Ma2 ma2) {
        UserSession A0p2 = ma2.A0p();
        0Tu r3 = 0Tu.A06;
        boolean A062 = 182.A06(r3, A0p2, 36322224889997326L);
        boolean A063 = 182.A06(r3, ma2.A0p(), 36322224890521620L);
        ma2.A0u().A0E("recommended_users_fetch_start");
        AnonymousClass4DH r32 = ma2.A1J;
        UserSession A0p3 = ma2.A0p();
        1NY A0M2 = DbZ.A0M(A0p3);
        A0M2.A0A("dynamic_onboarding/get_direct_empty_state/");
        A0M2.A9m(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A0p3.A06);
        A0M2.A0H("should_contain_combined_unit", A062);
        A0M2.A0H("should_contain_message_unit", A063);
        1OC A0S2 = DbU.A0S(A0M2, CE9.class, C45539CyD.class);
        NMI.A00(A0S2, ma2, 17);
        r32.schedule(A0S2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r0 = r11.A1J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0I(X.C66633Ma2 r11) {
        /*
            com.instagram.common.session.UserSession r3 = r11.A0p()
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36323358761626734(0x810be700092c6e, double:3.034376571054085E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0030
            X.Mi6 r0 = r11.A1M
            if (r0 == 0) goto L_0x002b
            X.4mt r0 = r0.A00
            X.0eM r0 = r0.A0O
            java.lang.Object r0 = r0.getValue()
            X.MtP r0 = (X.C67710MtP) r0
            r0.A00 = r2
            X.MXR r0 = r0.A01
            r0.FLH(r2)
            return
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0030:
            X.7fy r0 = r11.A0s
            if (r0 != 0) goto L_0x0062
            X.4DH r0 = r11.A1J
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto L_0x0062
            com.instagram.common.session.UserSession r4 = r11.A0p()
            X.2lw r5 = X.JTU.A0I(r3, r0)
            r8 = 1
            X.Mi7 r0 = r11.A1O
            X.Mk6 r0 = r0.A03
            if (r0 == 0) goto L_0x0073
            java.lang.String r7 = r0.A02
        L_0x004d:
            java.lang.String r6 = "raven"
            r9 = r8
            r10 = r8
            X.7eO r1 = X.C67562Mpw.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A0s = r1
            X.0eM r0 = r11.A2h
            java.lang.Object r0 = r0.getValue()
            X.Mjn r0 = (X.C67191Mjn) r0
            r1.EcJ(r0)
        L_0x0062:
            X.7fy r0 = r11.A0s
            if (r0 == 0) goto L_0x0069
            r0.EhX(r2)
        L_0x0069:
            X.Mi9 r1 = r11.A0u()
            java.lang.String r0 = "suggested_threads_fetch_start"
            r1.A0E(r0)
            return
        L_0x0073:
            r7 = 0
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A0I(X.Ma2):void");
    }

    public static final void A0M(C66633Ma2 ma2) {
        if (182.A06(0Tu.A05, ma2.A0p(), 36325300086256473L) && C66959Mfs.A00 == null) {
            Looper.myQueue().addIdleHandler(new C66985MgJ(ma2));
        }
    }

    public static final void A0Q(C66633Ma2 ma2) {
        Integer num;
        int i;
        UserSession A0p2 = ma2.A0p();
        0qQ.A0B(A0p2, 0);
        DbV.A1G(C66583MXo.A0H(A0p2), "clicked_requests_button");
        if (2El.A03(ma2.A0p())) {
            i = 13368;
        } else if (2El.A02(ma2.A0p())) {
            i = 13378;
        } else {
            num = null;
            ma2.A17(num, C273654mx.A00(139), false);
        }
        num = Integer.valueOf(i);
        ma2.A17(num, C273654mx.A00(139), false);
    }

    public static final void A0R(C66633Ma2 ma2) {
        if (!A0k(ma2)) {
            0nY.A00().ATE(new C67311Mll((C66609MYv) ma2.A2c.getValue(), new C73910Pll(ma2, 20)));
        }
    }

    public static final void A0T(C66633Ma2 ma2) {
        if (182.A06(0Tu.A05, ma2.A0p(), 36325033798611516L)) {
            11Z.A02(new C73071PVe(ma2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cc, code lost:
        if (r0 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (X.2El.A0N(r2, r1) != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0a(X.C66633Ma2 r13, java.util.List r14, int r15, boolean r16) {
        /*
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x000f
            X.Mbh r1 = X.C66581MXm.A0U(r13)
            r0 = 0
            r1.A08(r0)
        L_0x000e:
            return
        L_0x000f:
            X.59G r8 = r13.A0w(r15)
            com.instagram.common.session.UserSession r0 = r13.A0p()
            X.3H4 r0 = X.2J7.A00(r0)
            java.util.Map r7 = r0.A02
            X.4DH r3 = r13.A1J
            android.content.Context r6 = r3.requireContext()
            com.instagram.common.session.UserSession r5 = r13.A0p()
            com.instagram.common.session.UserSession r2 = r13.A0p()
            X.2EX r0 = X.AnonymousClass2EX.A00
            boolean r1 = r13.A1A(r0)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            boolean r0 = X.2El.A0C(r2)
            if (r0 != 0) goto L_0x0042
            boolean r0 = X.2El.A0N(r2, r1)
            r12 = 0
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            r12 = 1
        L_0x0043:
            java.util.ArrayList r2 = X.JTQ.A0f(r7)
            java.util.Iterator r11 = r14.iterator()
        L_0x004b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r4 = r11.next()
            X.2EM r4 = (X.2EM) r4
            boolean r0 = r7.containsKey(r4)
            r9 = 0
            r1 = 20
            if (r0 == 0) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
            java.lang.Object r0 = r7.get(r4)
            X.0qQ.A0A(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            X.2EY r0 = X.AnonymousClass2EY.A00
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x007f
            X.5y7 r0 = X.C300885y7.A00
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x0088
        L_0x007f:
            java.lang.Object r0 = r8.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r9 = r9 + r0
        L_0x0088:
            if (r9 <= r1) goto L_0x00ba
            r10 = 1
            r9 = 20
        L_0x008d:
            X.43I r0 = X.AnonymousClass43I.A00
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 != 0) goto L_0x009d
            X.5y8 r0 = X.C300895y8.A00
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x00ad
        L_0x009d:
            java.lang.Object r0 = r8.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.lang.Object r0 = r8.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
        L_0x00ad:
            java.lang.String r1 = X.C66786McX.A00(r6, r5, r4)
            X.McY r0 = new X.McY
            r0.<init>((X.2EM) r4, (java.lang.String) r1, (int) r9, (boolean) r10)
            r2.add(r0)
            goto L_0x004b
        L_0x00ba:
            r10 = 0
            goto L_0x008d
        L_0x00bc:
            com.instagram.common.session.UserSession r0 = r13.A0p()
            boolean r0 = X.2El.A0J(r0)
            if (r0 == 0) goto L_0x00e7
            X.MkX r0 = r13.A0f
            if (r0 == 0) goto L_0x00ce
            X.2EM r0 = r0.A00
        L_0x00cc:
            if (r0 != 0) goto L_0x00d2
        L_0x00ce:
            X.2EM r0 = r13.A0r()
        L_0x00d2:
            X.McZ r1 = new X.McZ
            r4 = r16
            r1.<init>(r0, r2, r4)
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x000e
            X.Mbh r0 = X.C66581MXm.A0U(r13)
            r0.A08(r1)
            return
        L_0x00e7:
            X.MoZ r0 = r13.A0c
            if (r0 == 0) goto L_0x00ce
            X.2EM r0 = r0.A00
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A0a(X.Ma2, java.util.List, int, boolean):void");
    }

    public static final void A0c(C66633Ma2 ma2, boolean z) {
        AnonymousClass36N r2;
        if (AnonymousClass39U.A00(ma2.A0p()) && (r2 = ma2.A0r) != null) {
            Dba.A1S(r2, C318116oQ.A00(r2), 42, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.OCH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.OCH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.OCH} */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.OCG, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0f(X.C66736Mbh r10, X.C66633Ma2 r11, X.C74566PxF r12) {
        /*
            com.instagram.common.session.UserSession r0 = r11.A0p()
            boolean r2 = X.2El.A0B(r0)
            r12.EaI(r2)
            if (r2 != 0) goto L_0x0015
            r0 = 0
            r11.A0b = r0
            r11.A0i = r0
        L_0x0012:
            r11.A0j = r0
        L_0x0014:
            return r2
        L_0x0015:
            X.Moi r0 = r11.A0b
            if (r0 != 0) goto L_0x0041
            X.4DH r5 = r11.A1J
            android.content.Context r4 = r5.requireContext()
            com.instagram.common.session.UserSession r6 = r11.A0p()
            java.lang.String r8 = r11.A0w
            X.MoZ r0 = r11.A0c
            boolean r9 = X.AnonymousClass7TF.A1V(r0)
            X.Moh r7 = new X.Moh
            r7.<init>(r10, r11)
            X.Moi r3 = new X.Moi
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.A0b = r3
            X.2Dm r1 = r11.A0v()
            X.Moi r0 = r11.A0b
            X.2Dr r1 = (X.2Dr) r1
            r1.A00 = r0
        L_0x0041:
            X.OCG r0 = r11.A0i
            if (r0 != 0) goto L_0x004c
            X.OCG r0 = new X.OCG
            r0.<init>()
            r11.A0i = r0
        L_0x004c:
            X.OCH r0 = r11.A0j
            if (r0 != 0) goto L_0x0014
            X.OCH r0 = new X.OCH
            r0.<init>()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A0f(X.Mbh, X.Ma2, X.PxF):boolean");
    }

    public static final boolean A0g(C66736Mbh mbh, C66633Ma2 ma2, C74566PxF pxF) {
        boolean A0C2 = 2El.A0C(ma2.A0p());
        pxF.EaJ(A0C2);
        if (!A0C2 && !2El.A0N(ma2.A0p(), ma2.A1A(AnonymousClass2EX.A00)) && !0qQ.A0K(ma2.A0r(), C67224MkK.A00) && !2El.A0G(ma2.A0p())) {
            ma2.A0c = null;
            return false;
        } else if (ma2.A0c != null) {
            return true;
        } else {
            2EM A0r2 = ma2.A0r();
            if (2El.A07(ma2.A0p())) {
                C66581MXm.A0V(ma2).B6g().Eji(A0r2);
            }
            pxF.Eji(A0r2);
            C67141Miz miz = mbh.A0E;
            if (A0r2 != miz.A0E) {
                miz.A0E = A0r2;
                mbh.A0C.A02(mbh.A03, A0r2, C2611948q.ALL);
                C66736Mbh.A04(mbh);
            }
            C66581MXm.A0V(ma2).BzE().EWx(new N4R(A0r2, (Boolean) false));
            ma2.A0c = new C67479MoZ(new C67478MoY(mbh, ma2, pxF), A0r2);
            C3265677h.A0o(ma2.A0p(), ma2.A0t().A00);
            return true;
        }
    }

    public static final boolean A0h(C66633Ma2 ma2) {
        UserSession A0p2 = ma2.A0p();
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, A0p2, 36322572783593740L) || 182.A06(r3, ma2.A0p(), 36322572783528203L)) {
            return false;
        }
        return true;
    }

    public static final boolean A0j(C66633Ma2 ma2) {
        return 182.A06(0Tu.A05, ma2.A0p(), 36324033071754952L);
    }

    public static final boolean A0l(C66633Ma2 ma2) {
        return 182.A06(0Tu.A05, ma2.A0p(), 36317182598320969L);
    }

    public static final boolean A0m(C66633Ma2 ma2, int i) {
        if (ma2.A18() || ((i != 0 && (C66583MXo.A1Z(ma2) || i >= 10)) || A0i(ma2) || 0qQ.A0K(ma2.A0s(), AnonymousClass2EL.A00))) {
            return false;
        }
        return true;
    }

    public static final boolean A0n(C66633Ma2 ma2, long j) {
        long A012 = 182.A01(0Tu.A05, ma2.A0p(), 36609631216342918L);
        if (A012 == 0 || C51966G9m.A07(j) >= A012) {
            return false;
        }
        return true;
    }

    public final void A0x() {
        Long l;
        if ((!A0i(this) || 2El.A05(A0p()) || (l = this.A0v) == null || System.currentTimeMillis() - l.longValue() <= AnonymousClass48N.A00) && A0q().AFZ(A0t(), A05(this))) {
            AnonymousClass2mA r0 = (AnonymousClass2mA) this.A2m.getValue();
            if (r0 != null) {
                r0.A01();
            }
            A0z();
        }
    }

    public final void A0z() {
        if (AnonymousClass7TE.A1b(C66581MXm.A0U(this).A0E.A0O) && !A0q().CKO()) {
            ((C67197Mjt) this.A1s.getValue()).A01();
            A0q().CgP(A0t(), A05(this));
            C66582MXn.A1I(this);
            A16((Integer) null);
        }
    }

    public final void A11() {
        UserSession A0p2 = A0p();
        AnonymousClass4DH r5 = this.A1J;
        OW4 ow4 = new OW4(A0p2, r5.requireContext());
        if (ow4.A01()) {
            ow4.A00();
            return;
        }
        C67089Mi7 mi7 = this.A1O;
        mi7.A04(1);
        UserSession A0p3 = A0p();
        if (mi7.A07 != null) {
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, A0p3), "direct_new_message_button_tapped");
            if (A0e2.isSampled()) {
                C66580MXl.A1H(A0e2, mi7.A07);
                A0e2.Cgf();
            }
        }
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putBoolean("direct_is_creating_secret_conversation", false);
        AnonymousClass6W8 A032 = AnonymousClass6W8.A03(r5.requireActivity(), A0a2, A0p(), ModalActivity.class, C273654mx.A00(660));
        A032.A08();
        DbU.A1K(r5, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (r3 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        if (r4 != null) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x002a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A13(int r13) {
        /*
            r12 = this;
            com.instagram.common.session.UserSession r0 = r12.A0p()
            boolean r0 = X.2El.A04(r0)
            if (r0 == 0) goto L_0x00d6
            com.google.android.material.tabs.TabLayout r8 = r12.A0H
            if (r8 == 0) goto L_0x00d6
            com.instagram.common.session.UserSession r0 = r12.A0p()
            X.3H4 r0 = X.2J7.A00(r0)
            java.util.Map r7 = r0.A02
            X.OF6 r1 = r12.A0e
            if (r1 == 0) goto L_0x00d6
            r0 = 1
            X.0qQ.A0B(r7, r0)
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.util.List r5 = r1.A03
            java.util.Iterator r11 = r5.iterator()
        L_0x002a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r2 = r11.next()
            X.MkX r2 = (X.C67237MkX) r2
            X.MkX r0 = X.C67237MkX.A03
            r10 = 0
            if (r2 == r0) goto L_0x0097
            X.MkX r0 = X.C67237MkX.A04
            if (r2 == r0) goto L_0x0097
            X.MkX r0 = X.C67237MkX.A07
            if (r2 != r0) goto L_0x00ba
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
        L_0x0047:
            r6.put(r2, r0)
        L_0x004a:
            java.lang.Object r0 = r6.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0056
            int r10 = r0.intValue()
        L_0x0056:
            r9 = 0
            int r0 = r5.indexOf(r2)
            X.6zp r4 = r8.A07(r0)
            r1 = 0
            if (r4 == 0) goto L_0x0093
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x0093
            r0 = 2131442397(0x7f0b3add, float:1.8506833E38)
            android.view.View r3 = r2.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
        L_0x006f:
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x007a
            r0 = 2131442427(0x7f0b3afb, float:1.8506894E38)
            android.view.View r1 = r2.findViewById(r0)
        L_0x007a:
            if (r10 <= 0) goto L_0x008e
            if (r3 == 0) goto L_0x0088
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r3.setText(r0)
        L_0x0085:
            r3.setVisibility(r9)
        L_0x0088:
            if (r1 == 0) goto L_0x002a
            r1.setVisibility(r9)
            goto L_0x002a
        L_0x008e:
            r9 = 8
            if (r3 == 0) goto L_0x0088
            goto L_0x0085
        L_0x0093:
            r3 = r1
            if (r4 == 0) goto L_0x007a
            goto L_0x006f
        L_0x0097:
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r3 = r0.iterator()
            r1 = r13
        L_0x00a0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r7.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.intValue()
        L_0x00b6:
            int r1 = r1 + r0
            goto L_0x00a0
        L_0x00b8:
            r0 = 0
            goto L_0x00b6
        L_0x00ba:
            X.2EM r1 = r2.A00
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r7.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00d4
            int r1 = r0.intValue()
        L_0x00ce:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0047
        L_0x00d4:
            r1 = 0
            goto L_0x00ce
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A13(int):void");
    }

    public final void A14(int i) {
        if (!2El.A07(A0p())) {
            A0a(this, A06(this), i, true);
        }
    }

    public final void A17(Integer num, String str, boolean z) {
        A15(AnonymousClass7TE.A0a(), num, str, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (A0q().CT5() == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A18() {
        /*
            r3 = this;
            boolean r0 = X.C66583MXo.A1Z(r3)
            r2 = 1
            if (r0 == 0) goto L_0x0012
            X.Pw5 r0 = r3.A0q()
            boolean r0 = r0.CT5()
            r1 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            X.2Dm r0 = r3.A0v()
            X.2Dr r0 = (X.2Dr) r0
            X.1bC r0 = r0.A0H
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x003c
            X.Pw5 r0 = r3.A0q()
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L_0x003c
            if (r1 != 0) goto L_0x003c
            X.0eM r0 = r3.A2h
            java.lang.Object r0 = r0.getValue()
            X.Mjn r0 = (X.C67191Mjn) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x003c
            boolean r0 = r3.A16
            if (r0 == 0) goto L_0x003c
            r2 = 0
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.A18():boolean");
    }

    public final boolean A1A(2EM r3) {
        Boolean bool = (Boolean) A0v().A0C.A0E.get(r3);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final Map B3T() {
        String str;
        HashMap A1E2 = AnonymousClass7TE.A1E();
        if (this.A1T != AnonymousClass05K.A00) {
            str = "ig_advanced_crypto_transport";
        } else {
            str = "ig_django";
        }
        A1E2.put("transport_type_inbox", str);
        C74503Pvy A0V2 = C66581MXm.A0V(this);
        if (A0V2 != null) {
            A0V2.A8Y(A1E2);
        }
        return A1E2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0338, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x033a, code lost:
        X.0fS.A01("controller: banyan setup", -901659874);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0346, code lost:
        if (A0h(r3) == false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0348, code lost:
        A0Y(r3, (java.lang.Integer) null);
        A0X(r3, (java.lang.Integer) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0354, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0356, code lost:
        X.0fS.A00(-37384961);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0360, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0362, code lost:
        X.0fS.A01("controller: account switch logging", -1111588579);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x036c, code lost:
        if (r3.A2x == false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        ((X.C67537MpW) r3.A1l.getValue()).A08 = X.C51969G9p.A1a(r3.A1T, X.AnonymousClass05K.A00);
        r1 = (X.C67537MpW) r3.A1l.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x038e, code lost:
        switch(r3.A1T.intValue()) {
            case 1: goto L_0x039e;
            case 2: goto L_0x03a1;
            default: goto L_0x0391;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0391, code lost:
        r5 = "DJANGO";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0393, code lost:
        r1.A01.markerAnnotate(31797299, "data_source_type", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x039e, code lost:
        r5 = "MSYS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x03a1, code lost:
        r5 = "BLENDED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x03a8, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x03aa, code lost:
        X.0fS.A00(-1158204523);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x03b4, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x03b6, code lost:
        X.0fS.A01("controller: perf logger setup", -298615685);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r1.equals("direct_inbox_account_switch") == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r5 = A04(r3);
        r2 = r3.A1J.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x03ca, code lost:
        if (r2 == null) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.A0R(r2, X.C71342cb.A00(A0p()), r3.A1J);
        r5 = A0u();
        r2 = r3.A1J.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x03e3, code lost:
        if (r2 == null) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x03e5, code lost:
        r5.A0R(r2, X.C71342cb.A00(A0p()), r3.A1J);
        r5 = A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x03fc, code lost:
        if (r3.A1T == X.AnonymousClass05K.A0C) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x03fe, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x03ff, code lost:
        r5.A0K("is_e2ee_ui_enabled", r4);
        r4 = A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0408, code lost:
        if (r4.A0F == false) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x040c, code lost:
        if (r4.A0G == false) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x040e, code lost:
        r1 = r4.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x041a, code lost:
        if (((com.instagram.direct.perf.navigation.ttrc.MPLTracker) r1.getValue()).isReady() == false) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x041c, code lost:
        ((com.instagram.direct.perf.navigation.ttrc.MPLTracker) r1.getValue()).trackSyncGroup(r4.A03, r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0429, code lost:
        X.C67013Mgm.A00(A0p(), A04(r3));
        X.C67013Mgm.A00(A0p(), A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0443, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r32 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0445, code lost:
        X.0fS.A00(-419977292);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x044f, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0451, code lost:
        X.0fS.A01("controller: init tray controllers", 1703269046);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x045d, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x045f, code lost:
        X.0fS.A00(2044660384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0469, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_0x0473;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x046b, code lost:
        X.0fS.A01("controller: config setup", 153239926);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r2 = A0p();
        r4 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0482, code lost:
        if (X.182.A06(r4, r2, 36320051636215706L) == false) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0484, code lost:
        r3.A10 = X.182.A06(r4, A0p(), 36320051636281243L);
        r3.A1H = X.182.A06(r4, A0p(), 36320051636346780L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x04a6, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x04a8, code lost:
        X.0fS.A00(-1463981594);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x04af, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x04b4, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r1.equals("direct_push_notification") != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x04b6, code lost:
        r0 = 288655095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r0 = X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x04bf, code lost:
        r0 = X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x04c3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x04c4, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x04c9, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x04cb, code lost:
        r0 = 1161668615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x04cf, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x04d4, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x04d6, code lost:
        r0 = 1572783779;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x04da, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x04df, code lost:
        if (com.facebook.systrace.Systrace.A0E(1) != false) goto L_0x04e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x04e1, code lost:
        r0 = 1488161949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x04e4, code lost:
        X.0fS.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x04e7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        r4 = true;
        r3 = r20;
        r3.A2s = r6;
        r3.A1K = r22;
        r3.A1J = r10;
        r3.A1P = r26;
        r3.A01 = r33;
        r3.A0w = r8;
        r3.A1S = r29;
        r3.A1T = r9;
        r3.A1N = r24;
        r3.A1R = r28;
        r3.A1Q = r27;
        r3.A1O = r25;
        r3.A1M = r23;
        r3.A2x = r2;
        r3.A2y = r0;
        r0 = X.C67093MiD.A00;
        r2 = A30;
        r3.A2i = r2.A00(r0);
        r3.A1t = A07(r2, r3, 22);
        r3.A23 = X.AnonymousClass0eN.A01(new X.C73659PhY(r3, 30));
        r3.A22 = A07(r2, r3, 29);
        r3.A2w = true;
        r3.A1r = A07(r2, r3, 20);
        r3.A2u = A08(r2, r3, 35);
        r3.A1h = X.AnonymousClass0eN.A01(new X.C73659PhY(r3, 11));
        r3.A1c = X.AnonymousClass0eN.A01(new X.C73659PhY(r3, 5));
        r3.A04 = -1;
        r3.A02 = -1;
        r3.A1v = r2.A00(X.C67153MjB.A00);
        r3.A2C = A07(r2, r3, 39);
        r3.A1U = X.AnonymousClass7TE.A1E();
        r3.A1W = X.AnonymousClass7TE.A1E();
        r3.A1Y = X.AnonymousClass7TE.A1F();
        r3.A1Z = X.AnonymousClass7TE.A1F();
        r3.A1X = X.AnonymousClass7TE.A1F();
        r3.A1V = X.AnonymousClass7TE.A1E();
        r3.A0x = X.AnonymousClass7TE.A1C();
        r3.A2B = A07(r2, r3, 38);
        r3.A2D = A07(r2, r3, 40);
        r3.A1b = X.AnonymousClass7TE.A1F();
        r3.A1a = X.AnonymousClass7TE.A1F();
        r3.A1I = X.AnonymousClass7TF.A0D();
        r3.A2V = A08(r2, r3, 12);
        r3.A2U = A08(r2, r3, 11);
        r3.A2T = r2.A00(X.C67200Mjw.A00);
        r3.A0b = null;
        r3.A2G = X.AnonymousClass0eN.A01(new X.C73659PhY(r3, 43));
        r3.A2t = X.C73910Pll.A00(r3, 34);
        r3.A0z = X.C73910Pll.A00(r3, 10);
        r3.A2q = X.C73910Pll.A00(r3, 32);
        r3.A2n = X.C73910Pll.A00(r3, 29);
        r3.A26 = X.AnonymousClass0eN.A01(new X.C73659PhY(r3, 33));
        r3.A2R = X.C73910Pll.A00(r3, 8);
        r3.A2d = r2.A00(X.C67201Mjx.A00);
        r3.A2b = X.C73910Pll.A00(r3, 18);
        r3.A2c = X.C73910Pll.A00(r3, 19);
        r3.A2K = A08(r2, r3, 0);
        r3.A2L = A08(r2, r3, 1);
        r3.A1s = A07(r2, r3, 21);
        r3.A2X = X.C73910Pll.A00(r3, 14);
        r3.A2e = X.C73910Pll.A00(r3, 21);
        r3.A1l = X.AnonymousClass0eN.A01(X.C67274Ml9.A00);
        r3.A1d = A07(r2, r3, 6);
        r3.A2r = X.C73910Pll.A00(r3, 33);
        r3.A2S = A08(r2, r3, 9);
        r3.A1k = A07(r2, r3, 14);
        r3.A1o = A07(r2, r3, 17);
        r3.A2N = A08(r2, r3, 3);
        r3.A2l = A08(r2, r3, 27);
        r3.A2m = A08(r2, r3, 28);
        r3.A0y = X.0sn.A00;
        r3.A2M = A08(r2, r3, 2);
        r3.A1i = A07(r2, r3, 12);
        r3.A2v = A08(r2, r3, 36);
        r3.A1f = A07(r2, r3, 9);
        r3.A1u = r2.A00(X.C67203Mjz.A00);
        r3.A2g = A08(r2, r3, 23);
        r3.A2H = X.AnonymousClass0eN.A01(new X.C73659PhY(r3, 44));
        r3.A1w = A07(r2, r3, 23);
        r3.A2f = A08(r2, r3, 22);
        r3.A2O = A08(r2, r3, 4);
        r3.A27 = A07(r2, r3, 34);
        r3.A2P = A08(r2, r3, 6);
        r3.A1L = new X.C67090MiA(r3);
        r3.A25 = A07(r2, r3, 32);
        r3.A2o = A08(r2, r3, 30);
        r3.A1g = A07(r2, r3, 10);
        r3.A21 = A07(r2, r3, 28);
        r3.A24 = A07(r2, r3, 31);
        r3.A1n = A07(r2, r3, 16);
        r3.A29 = A07(r2, r3, 36);
        r3.A1q = A07(r2, r3, 19);
        r3.A1p = A07(r2, r3, 18);
        r3.A1y = A07(r2, r3, 25);
        r3.A1z = A07(r2, r3, 26);
        r3.A2j = A08(r2, r3, 25);
        r3.A20 = A07(r2, r3, 27);
        r3.A1m = A07(r2, r3, 15);
        r3.A1e = A07(r2, r3, 7);
        r3.A2E = A07(r2, r3, 41);
        r3.A2F = A07(r2, r3, 42);
        r3.A2p = A08(r2, r3, 31);
        r3.A2h = A08(r2, r3, 24);
        r3.A28 = A07(r2, r3, 35);
        r3.A2A = A07(r2, r3, 37);
        r3.A2a = A08(r2, r3, 17);
        r3.A2Q = A08(r2, r3, 7);
        r3.A2I = A07(r2, r3, 45);
        r3.A2k = A08(r2, r3, 26);
        r3.A1x = A07(r2, r3, 24);
        r3.A2Y = A08(r2, r3, 15);
        r3.A2Z = A08(r2, r3, 16);
        r3.A1j = A07(r2, r3, 13);
        r3.A2W = A08(r2, r3, 13);
        r3.A2J = X.AnonymousClass0eN.A01(new X.C73659PhY(r3, 49));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C66633Ma2(X.AnonymousClass4DH r21, X.1a8 r22, X.C67088Mi6 r23, X.C273624mt r24, X.C67089Mi7 r25, X.C273434mZ r26, X.C2356430q r27, X.C228312lJ r28, X.C273634mu r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, int r33) {
        /*
            r20 = this;
            r7 = 5
            r8 = r31
            X.0qQ.A0B(r8, r7)
            r5 = 8
            r9 = r30
            X.0qQ.A0B(r9, r5)
            r10 = r21
            X.0eM r6 = X.C227642jf.A02(r10)
            r1 = r32
            if (r32 == 0) goto L_0x0020
            java.lang.String r0 = "direct_inbox_account_switch"
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0023
        L_0x0020:
            r2 = 0
            if (r32 == 0) goto L_0x002c
        L_0x0023:
            java.lang.String r0 = "direct_push_notification"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r19 = 0
            r4 = 1
            r3 = r20
            r3.<init>()
            r3.A2s = r6
            r1 = r22
            r3.A1K = r1
            r3.A1J = r10
            r1 = r26
            r3.A1P = r1
            r1 = r33
            r3.A01 = r1
            r3.A0w = r8
            r1 = r29
            r3.A1S = r1
            r3.A1T = r9
            r1 = r24
            r3.A1N = r1
            r1 = r28
            r3.A1R = r1
            r1 = r27
            r3.A1Q = r1
            r1 = r25
            r3.A1O = r1
            r1 = r23
            r3.A1M = r1
            r3.A2x = r2
            r3.A2y = r0
            X.MiD r0 = X.C67093MiD.A00
            X.Mi8 r2 = A30
            X.0eM r0 = r2.A00(r0)
            r3.A2i = r0
            r18 = 22
            r0 = r18
            X.0eM r0 = A07(r2, r3, r0)
            r3.A1t = r0
            r17 = 30
            X.PhY r1 = new X.PhY
            r0 = r17
            r1.<init>(r3, r0)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r1)
            r3.A23 = r0
            r1 = 29
            X.0eM r0 = A07(r2, r3, r1)
            r3.A22 = r0
            r3.A2w = r4
            r0 = 20
            X.0eM r0 = A07(r2, r3, r0)
            r3.A1r = r0
            r16 = 35
            r0 = r16
            X.0eM r0 = A08(r2, r3, r0)
            r3.A2u = r0
            r6 = 11
            X.PhY r0 = new X.PhY
            r0.<init>(r3, r6)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A1h = r0
            X.PhY r0 = new X.PhY
            r0.<init>(r3, r7)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A1c = r0
            r0 = -1
            r3.A04 = r0
            r3.A02 = r0
            X.MjB r0 = X.C67153MjB.A00
            X.0eM r0 = r2.A00(r0)
            r3.A1v = r0
            r0 = 39
            X.0eM r0 = A07(r2, r3, r0)
            r3.A2C = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r3.A1U = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r3.A1W = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r3.A1Y = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r3.A1Z = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r3.A1X = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r3.A1V = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r3.A0x = r0
            r0 = 38
            X.0eM r0 = A07(r2, r3, r0)
            r3.A2B = r0
            r0 = 40
            X.0eM r0 = A07(r2, r3, r0)
            r3.A2D = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r3.A1b = r0
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r3.A1a = r0
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r3.A1I = r0
            r10 = 12
            X.0eM r0 = A08(r2, r3, r10)
            r3.A2V = r0
            X.0eM r0 = A08(r2, r3, r6)
            r3.A2U = r0
            X.Mjw r0 = X.C67200Mjw.A00
            X.0eM r0 = r2.A00(r0)
            r3.A2T = r0
            r0 = r19
            r3.A0b = r0
            r6 = 43
            X.PhY r0 = new X.PhY
            r0.<init>(r3, r6)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A2G = r0
            r14 = 34
            X.0t0 r0 = X.C73910Pll.A00(r3, r14)
            r3.A2t = r0
            r11 = 10
            X.0t0 r0 = X.C73910Pll.A00(r3, r11)
            r3.A0z = r0
            r12 = 32
            X.0t0 r0 = X.C73910Pll.A00(r3, r12)
            r3.A2q = r0
            X.0t0 r0 = X.C73910Pll.A00(r3, r1)
            r3.A2n = r0
            r1 = 33
            X.PhY r0 = new X.PhY
            r0.<init>(r3, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A26 = r0
            X.0t0 r0 = X.C73910Pll.A00(r3, r5)
            r3.A2R = r0
            X.Mjx r0 = X.C67201Mjx.A00
            X.0eM r0 = r2.A00(r0)
            r3.A2d = r0
            r6 = 18
            X.0t0 r0 = X.C73910Pll.A00(r3, r6)
            r3.A2b = r0
            r7 = 19
            X.0t0 r0 = X.C73910Pll.A00(r3, r7)
            r3.A2c = r0
            r0 = 0
            X.0eM r0 = A08(r2, r3, r0)
            r3.A2K = r0
            X.0eM r0 = A08(r2, r3, r4)
            r3.A2L = r0
            r8 = 21
            X.0eM r0 = A07(r2, r3, r8)
            r3.A1s = r0
            r5 = 14
            X.0t0 r0 = X.C73910Pll.A00(r3, r5)
            r3.A2X = r0
            X.0t0 r0 = X.C73910Pll.A00(r3, r8)
            r3.A2e = r0
            X.Ml9 r0 = X.C67274Ml9.A00
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A1l = r0
            r13 = 6
            X.0eM r0 = A07(r2, r3, r13)
            r3.A1d = r0
            X.0t0 r0 = X.C73910Pll.A00(r3, r1)
            r3.A2r = r0
            r1 = 9
            X.0eM r0 = A08(r2, r3, r1)
            r3.A2S = r0
            X.0eM r0 = A07(r2, r3, r5)
            r3.A1k = r0
            r8 = 17
            X.0eM r0 = A07(r2, r3, r8)
            r3.A1o = r0
            r0 = 3
            X.0eM r0 = A08(r2, r3, r0)
            r3.A2N = r0
            r9 = 27
            X.0eM r0 = A08(r2, r3, r9)
            r3.A2l = r0
            r5 = 28
            X.0eM r0 = A08(r2, r3, r5)
            r3.A2m = r0
            X.0sn r0 = X.0sn.A00
            r3.A0y = r0
            r0 = 2
            X.0eM r0 = A08(r2, r3, r0)
            r3.A2M = r0
            X.0eM r0 = A07(r2, r3, r10)
            r3.A1i = r0
            r10 = 36
            X.0eM r0 = A08(r2, r3, r10)
            r3.A2v = r0
            X.0eM r0 = A07(r2, r3, r1)
            r3.A1f = r0
            X.Mjz r0 = X.C67203Mjz.A00
            X.0eM r0 = r2.A00(r0)
            r3.A1u = r0
            r15 = 23
            X.0eM r0 = A08(r2, r3, r15)
            r3.A2g = r0
            r1 = 44
            X.PhY r0 = new X.PhY
            r0.<init>(r3, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A2H = r0
            X.0eM r0 = A07(r2, r3, r15)
            r3.A1w = r0
            r0 = r18
            X.0eM r0 = A08(r2, r3, r0)
            r3.A2f = r0
            r0 = 4
            X.0eM r0 = A08(r2, r3, r0)
            r3.A2O = r0
            X.0eM r0 = A07(r2, r3, r14)
            r3.A27 = r0
            X.0eM r0 = A08(r2, r3, r13)
            r3.A2P = r0
            X.MiA r0 = new X.MiA
            r0.<init>(r3)
            r3.A1L = r0
            X.0eM r0 = A07(r2, r3, r12)
            r3.A25 = r0
            r0 = r17
            X.0eM r0 = A08(r2, r3, r0)
            r3.A2o = r0
            X.0eM r0 = A07(r2, r3, r11)
            r3.A1g = r0
            X.0eM r0 = A07(r2, r3, r5)
            r3.A21 = r0
            r1 = 31
            X.0eM r0 = A07(r2, r3, r1)
            r3.A24 = r0
            r5 = 16
            X.0eM r0 = A07(r2, r3, r5)
            r3.A1n = r0
            X.0eM r0 = A07(r2, r3, r10)
            r3.A29 = r0
            X.0eM r0 = A07(r2, r3, r7)
            r3.A1q = r0
            X.0eM r0 = A07(r2, r3, r6)
            r3.A1p = r0
            r6 = 25
            X.0eM r0 = A07(r2, r3, r6)
            r3.A1y = r0
            r7 = 26
            X.0eM r0 = A07(r2, r3, r7)
            r3.A1z = r0
            X.0eM r0 = A08(r2, r3, r6)
            r3.A2j = r0
            X.0eM r0 = A07(r2, r3, r9)
            r3.A20 = r0
            r6 = 15
            X.0eM r0 = A07(r2, r3, r6)
            r3.A1m = r0
            r9 = 7
            X.0eM r0 = A07(r2, r3, r9)
            r3.A1e = r0
            r0 = 41
            X.0eM r0 = A07(r2, r3, r0)
            r3.A2E = r0
            r0 = 42
            X.0eM r0 = A07(r2, r3, r0)
            r3.A2F = r0
            X.0eM r0 = A08(r2, r3, r1)
            r3.A2p = r0
            r1 = 24
            X.0eM r0 = A08(r2, r3, r1)
            r3.A2h = r0
            r0 = r16
            X.0eM r0 = A07(r2, r3, r0)
            r3.A28 = r0
            r0 = 37
            X.0eM r0 = A07(r2, r3, r0)
            r3.A2A = r0
            X.0eM r0 = A08(r2, r3, r8)
            r3.A2a = r0
            X.0eM r0 = A08(r2, r3, r9)
            r3.A2Q = r0
            r0 = 45
            X.0eM r0 = A07(r2, r3, r0)
            r3.A2I = r0
            X.0eM r0 = A08(r2, r3, r7)
            r3.A2k = r0
            X.0eM r0 = A07(r2, r3, r1)
            r3.A1x = r0
            X.0eM r0 = A08(r2, r3, r6)
            r3.A2Y = r0
            X.0eM r0 = A08(r2, r3, r5)
            r3.A2Z = r0
            r1 = 13
            X.0eM r0 = A07(r2, r3, r1)
            r3.A1j = r0
            X.0eM r0 = A08(r2, r3, r1)
            r3.A2W = r0
            r1 = 49
            X.PhY r0 = new X.PhY
            r0.<init>(r3, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r3.A2J = r0
            r7 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x0342
            r1 = -901659874(0xffffffffca41c31e, float:-3174599.5)
            java.lang.String r0 = "controller: banyan setup"
            X.0fS.A01(r0, r1)
        L_0x0342:
            boolean r0 = A0h(r3)     // Catch:{ all -> 0x04cf }
            if (r0 == 0) goto L_0x0350
            r0 = r19
            A0Y(r3, r0)     // Catch:{ all -> 0x04cf }
            A0X(r3, r0)     // Catch:{ all -> 0x04cf }
        L_0x0350:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x035c
            r0 = -37384961(0xfffffffffdc58cff, float:-3.282375E37)
            X.0fS.A00(r0)
        L_0x035c:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x036a
            r1 = -1111588579(0xffffffffbdbe811d, float:-0.0930197)
            java.lang.String r0 = "controller: account switch logging"
            X.0fS.A01(r0, r1)
        L_0x036a:
            boolean r0 = r3.A2x     // Catch:{ all -> 0x04c4 }
            if (r0 == 0) goto L_0x03a4
            X.0eM r0 = r3.A1l     // Catch:{ all -> 0x04c4 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x04c4 }
            X.MpW r2 = (X.C67537MpW) r2     // Catch:{ all -> 0x04c4 }
            java.lang.Integer r1 = r3.A1T     // Catch:{ all -> 0x04c4 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x04c4 }
            boolean r0 = X.C51969G9p.A1a(r1, r0)
            r2.A08 = r0     // Catch:{ all -> 0x04c4 }
            X.0eM r0 = r3.A1l     // Catch:{ all -> 0x04c4 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x04c4 }
            X.MpW r1 = (X.C67537MpW) r1     // Catch:{ all -> 0x04c4 }
            java.lang.Integer r0 = r3.A1T     // Catch:{ all -> 0x04c4 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x04c4 }
            switch(r0) {
                case 1: goto L_0x039e;
                case 2: goto L_0x03a1;
                default: goto L_0x0391;
            }     // Catch:{ all -> 0x04c4 }
        L_0x0391:
            java.lang.String r5 = "DJANGO"
        L_0x0393:
            X.02m r2 = r1.A01     // Catch:{ all -> 0x04c4 }
            r1 = 31797299(0x1e53033, float:8.4190477E-38)
            java.lang.String r0 = "data_source_type"
            r2.markerAnnotate(r1, r0, r5)     // Catch:{ all -> 0x04c4 }
            goto L_0x03a4
        L_0x039e:
            java.lang.String r5 = "MSYS"
            goto L_0x0393
        L_0x03a1:
            java.lang.String r5 = "BLENDED"
            goto L_0x0393
        L_0x03a4:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x03b0
            r0 = -1158204523(0xffffffffbaf73395, float:-0.0018859977)
            X.0fS.A00(r0)
        L_0x03b0:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x03be
            r1 = -298615685(0xffffffffee337c7b, float:-1.3887076E28)
            java.lang.String r0 = "controller: perf logger setup"
            X.0fS.A01(r0, r1)
        L_0x03be:
            X.Mgq r5 = A04(r3)     // Catch:{ all -> 0x04da }
            X.4DH r0 = r3.A1J     // Catch:{ all -> 0x04da }
            android.content.Context r2 = r0.getContext()     // Catch:{ all -> 0x04da }
            java.lang.String r6 = "Required value was null."
            if (r2 == 0) goto L_0x04bf
            X.4DH r1 = r3.A1J     // Catch:{ all -> 0x04da }
            com.instagram.common.session.UserSession r0 = r3.A0p()     // Catch:{ all -> 0x04da }
            X.2cc r0 = X.C71342cb.A00(r0)     // Catch:{ all -> 0x04da }
            r5.A0R(r2, r0, r1)     // Catch:{ all -> 0x04da }
            X.Mi9 r5 = r3.A0u()     // Catch:{ all -> 0x04da }
            X.4DH r0 = r3.A1J     // Catch:{ all -> 0x04da }
            android.content.Context r2 = r0.getContext()     // Catch:{ all -> 0x04da }
            if (r2 == 0) goto L_0x04ba
            X.4DH r1 = r3.A1J     // Catch:{ all -> 0x04da }
            com.instagram.common.session.UserSession r0 = r3.A0p()     // Catch:{ all -> 0x04da }
            X.2cc r0 = X.C71342cb.A00(r0)     // Catch:{ all -> 0x04da }
            r5.A0R(r2, r0, r1)     // Catch:{ all -> 0x04da }
            X.Mi9 r5 = r3.A0u()     // Catch:{ all -> 0x04da }
            java.lang.String r2 = "is_e2ee_ui_enabled"
            java.lang.Integer r1 = r3.A1T     // Catch:{ all -> 0x04da }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x04da }
            if (r1 == r0) goto L_0x03ff
            r4 = 0
        L_0x03ff:
            r5.A0K(r2, r4)     // Catch:{ all -> 0x04da }
            X.Mi9 r4 = r3.A0u()     // Catch:{ all -> 0x04da }
            boolean r0 = r4.A0F     // Catch:{ all -> 0x04da }
            if (r0 == 0) goto L_0x0429
            boolean r0 = r4.A0G     // Catch:{ all -> 0x04da }
            if (r0 == 0) goto L_0x0429
            X.0eM r1 = r4.A0E     // Catch:{ all -> 0x04da }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x04da }
            com.instagram.direct.perf.navigation.ttrc.MPLTracker r0 = (com.instagram.direct.perf.navigation.ttrc.MPLTracker) r0     // Catch:{ all -> 0x04da }
            boolean r0 = r0.isReady()     // Catch:{ all -> 0x04da }
            if (r0 == 0) goto L_0x0429
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x04da }
            com.instagram.direct.perf.navigation.ttrc.MPLTracker r2 = (com.instagram.direct.perf.navigation.ttrc.MPLTracker) r2     // Catch:{ all -> 0x04da }
            int r1 = r4.A03     // Catch:{ all -> 0x04da }
            int r0 = r4.A00     // Catch:{ all -> 0x04da }
            r2.trackSyncGroup(r1, r0)     // Catch:{ all -> 0x04da }
        L_0x0429:
            com.instagram.common.session.UserSession r1 = r3.A0p()     // Catch:{ all -> 0x04da }
            X.Mgq r0 = A04(r3)     // Catch:{ all -> 0x04da }
            X.C67013Mgm.A00(r1, r0)     // Catch:{ all -> 0x04da }
            com.instagram.common.session.UserSession r1 = r3.A0p()     // Catch:{ all -> 0x04da }
            X.Mi9 r0 = r3.A0u()     // Catch:{ all -> 0x04da }
            X.C67013Mgm.A00(r1, r0)     // Catch:{ all -> 0x04da }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x044b
            r0 = -419977292(0xffffffffe6f7a7b4, float:-5.8475905E23)
            X.0fS.A00(r0)
        L_0x044b:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x0459
            r1 = 1703269046(0x6585d2b6, float:7.899521E22)
            java.lang.String r0 = "controller: init tray controllers"
            X.0fS.A01(r0, r1)
        L_0x0459:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x0465
            r0 = 2044660384(0x79df0aa0, float:1.4476221E35)
            X.0fS.A00(r0)
        L_0x0465:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x0473
            r1 = 153239926(0x9224176, float:1.953082E-33)
            java.lang.String r0 = "controller: config setup"
            X.0fS.A01(r0, r1)
        L_0x0473:
            com.instagram.common.session.UserSession r2 = r3.A0p()     // Catch:{ all -> 0x04af }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x04af }
            r0 = 36320051636215706(0x8108e500001f9a, double:3.032285131627426E-306)
            boolean r0 = X.182.A06(r4, r2, r0)     // Catch:{ all -> 0x04af }
            if (r0 == 0) goto L_0x04a2
            com.instagram.common.session.UserSession r2 = r3.A0p()     // Catch:{ all -> 0x04af }
            r0 = 36320051636281243(0x8108e500011f9b, double:3.0322851316688716E-306)
            boolean r0 = X.182.A06(r4, r2, r0)     // Catch:{ all -> 0x04af }
            r3.A10 = r0     // Catch:{ all -> 0x04af }
            com.instagram.common.session.UserSession r2 = r3.A0p()     // Catch:{ all -> 0x04af }
            r0 = 36320051636346780(0x8108e500021f9c, double:3.0322851317103175E-306)
            boolean r0 = X.182.A06(r4, r2, r0)     // Catch:{ all -> 0x04af }
            r3.A1H = r0     // Catch:{ all -> 0x04af }
        L_0x04a2:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x04ae
            r0 = -1463981594(0xffffffffa8bd69e6, float:-2.1029141E-14)
            X.0fS.A00(r0)
        L_0x04ae:
            return
        L_0x04af:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x04e7
            r0 = 288655095(0x113486f7, float:1.4241086E-28)
            goto L_0x04e4
        L_0x04ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ all -> 0x04da }
            goto L_0x04c3
        L_0x04bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r6)     // Catch:{ all -> 0x04da }
        L_0x04c3:
            throw r0     // Catch:{ all -> 0x04da }
        L_0x04c4:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x04e7
            r0 = 1161668615(0x453da807, float:3034.5017)
            goto L_0x04e4
        L_0x04cf:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x04e7
            r0 = 1572783779(0x5dbec6a3, float:1.71835677E18)
            goto L_0x04e4
        L_0x04da:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x04e7
            r0 = 1488161949(0x58b38c9d, float:1.57933209E15)
        L_0x04e4:
            X.0fS.A00(r0)
        L_0x04e7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66633Ma2.<init>(X.4DH, X.1a8, X.Mi6, X.4mt, X.Mi7, X.4mZ, X.30q, X.2lJ, X.4mu, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }
}
