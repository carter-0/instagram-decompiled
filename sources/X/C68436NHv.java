package X;

import android.content.Context;
import android.view.ViewStub;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.Set;

/* renamed from: X.NHv  reason: case insensitive filesystem */
public final class C68436NHv extends C272124k8 {
    public final Set A00 = AnonymousClass7TE.A1F();
    public final /* synthetic */ C71153OeR A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68436NHv(UserSession userSession, C71153OeR oeR) {
        super(userSession);
        this.A01 = oeR;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r1 >= 10) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A04(com.instagram.common.session.UserSession r15, java.lang.Object r16) {
        /*
            r14 = this;
            r1 = r16
            r0 = -1286985521(0xffffffffb34a28cf, float:-4.7068905E-8)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.B72 r1 = (X.B72) r1
            r0 = -238863592(0xfffffffff1c33b18, float:-1.9334725E30)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.8wb r0 = r1.A05
            java.util.List r8 = r0.A05
            java.util.Iterator r13 = r8.iterator()
        L_0x001a:
            boolean r0 = r13.hasNext()
            r9 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0073
            java.lang.Object r10 = r13.next()
            X.8wd r10 = (X.C370538wd) r10
            X.OeR r0 = r14.A01
            java.util.List r3 = r0.A12
            monitor-enter(r3)
            java.util.Iterator r11 = r3.iterator()     // Catch:{ all -> 0x006a }
        L_0x0031:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0065
            X.2Ep r2 = X.C66580MXl.A0c(r11)     // Catch:{ all -> 0x006a }
            java.lang.String r1 = r10.A1D     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r2.C6C()     // Catch:{ all -> 0x006a }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0031
            X.3su r0 = r10.A00     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0031
            X.3su r0 = r2.BKv()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0031
            X.3su r0 = r10.A00     // Catch:{ all -> 0x006a }
            long r6 = r0.C7c()     // Catch:{ all -> 0x006a }
            X.3su r0 = r2.BKv()     // Catch:{ all -> 0x006a }
            long r1 = r0.C7c()     // Catch:{ all -> 0x006a }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0031
        L_0x0063:
            monitor-exit(r3)     // Catch:{ all -> 0x006a }
            goto L_0x0067
        L_0x0065:
            r12 = 0
            goto L_0x0063
        L_0x0067:
            if (r12 != 0) goto L_0x001a
            goto L_0x0074
        L_0x006a:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006a }
            r0 = 1580390901(0x5e32d9f5, float:3.2219003E18)
            X.AnonymousClass0fD.A0A(r0, r5)
            throw r1
        L_0x0073:
            r9 = 1
        L_0x0074:
            X.OeR r7 = r14.A01
            X.Nbb r6 = r7.A04
            java.lang.String r3 = "is_cache_recent"
            r6.A0K(r3, r9)
            X.Mpz r2 = r7.A0n
            r1 = 4
            X.Phl r0 = new X.Phl
            r0.<init>(r2, r3, r1, r9)
            X.C67573Mq7.A00(r2, r0)
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x009d
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x009d
            int r0 = r8.size()
            int r1 = r7.A00
            int r1 = r1 + r0
            r7.A00 = r1
            r0 = 10
            if (r1 < r0) goto L_0x00a2
        L_0x009d:
            X.34p r0 = r6.A01
            r0.A05()
        L_0x00a2:
            java.lang.String r1 = "fetch_threads_server_end"
            r0 = 0
            r2.A04(r1, r0)
            r0 = -1674296843(0xffffffff9c3441f5, float:-5.964225E-22)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1018848024(0xffffffffc3459ce8, float:-197.61292)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68436NHv.A04(com.instagram.common.session.UserSession, java.lang.Object):void");
    }

    public final void A01(UserSession userSession) {
        C70497O8w o8w;
        int A03 = AnonymousClass0fD.A03(469595625);
        C71153OeR oeR = this.A01;
        if (oeR.A0L) {
            oeR.A04.A01.A05();
            oeR.A0K = false;
            oeR.A0L = false;
        }
        oeR.A0Q = true;
        if (!oeR.A0O || (o8w = oeR.A07) == null) {
            oeR.A0r.A00();
        } else {
            C68441NIe nIe = o8w.A00;
            if (!(nIe.A06 == null || nIe.A00 == null || nIe.A02 == null)) {
                C238143As r0 = nIe.A05;
                if (r0 != null) {
                    r0.EaP(false);
                }
                EmptyStateView emptyStateView = nIe.A06;
                if (emptyStateView != null) {
                    emptyStateView.setVisibility(8);
                    ViewStub viewStub = nIe.A00;
                    if (viewStub != null) {
                        viewStub.setVisibility(0);
                        IgFrameLayout igFrameLayout = nIe.A02;
                        if (igFrameLayout != null) {
                            igFrameLayout.sendAccessibilityEvent(8);
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        if (oeR.A02 == C69375NkF.A08) {
            oeR.A0A = C51968G9o.A0u();
        }
        C71153OeR.A0J(oeR);
        AnonymousClass0fD.A0A(302617621, A03);
    }

    public final void A02(UserSession userSession) {
        C238143As r0;
        int A03 = AnonymousClass0fD.A03(-524988375);
        C71153OeR oeR = this.A01;
        if (oeR.A0O) {
            C70497O8w o8w = oeR.A07;
            if (o8w != null) {
                C68441NIe nIe = o8w.A00;
                if (!(nIe.A06 == null || nIe.A00 == null || (r0 = nIe.A05) == null)) {
                    r0.Ev6();
                }
            }
        } else if (oeR.A0J) {
            oeR.A0F = false;
            oeR.A0G = false;
        } else {
            Set set = this.A00;
            set.clear();
            set.addAll(oeR.A12);
        }
        AnonymousClass0fD.A0A(746944677, A03);
    }

    public final void A05(C268654dm r10, UserSession userSession) {
        String str;
        int i;
        int A03 = AnonymousClass0fD.A03(-2100455179);
        String A0b = Dbb.A0b(r10);
        C71153OeR oeR = this.A01;
        oeR.A01 = 0;
        C68952Nbb nbb = oeR.A04;
        nbb.A01.A01();
        if (A0b != null) {
            nbb.A0J("error_message", A0b);
            oeR.A03.A05(A0b);
        } else {
            oeR.A03.A05("FETCH_THREADS_FAILED");
        }
        C67565Mpz mpz = oeR.A0n;
        if (A0b != null) {
            mpz.A03("error_message", A0b);
        }
        C67573Mq7.A00(mpz, new C51804G2n((C67573Mq7) mpz, "fetch_threads_fail", (String) null, 28));
        boolean z = oeR.A0O;
        C69004Ncg ncg = oeR.A0o;
        boolean z2 = oeR.A0J;
        ncg.A02 = false;
        if (!z) {
            if (z2) {
                str = "thread_fetch_failed_pending";
            } else {
                str = "thread_fetch_more_failed_pending";
            }
        } else if (z2) {
            str = "thread_fetch_failed_other";
        } else {
            str = "thread_fetch_more_failed_other";
        }
        if (A0b != null) {
            ncg.A03("error_message", A0b);
        }
        C67573Mq7.A00(ncg, new C51804G2n((C67573Mq7) ncg, str, "server", 28));
        C71153OeR.A0J(oeR);
        boolean z3 = r10 instanceof C268674do;
        if (oeR.A0b.isResumed()) {
            boolean A0T = C71153OeR.A0T(oeR);
            Context context = oeR.A0Y;
            if (A0T) {
                0qQ.A0B(context, 0);
                C310336ap A0a = DbS.A0a();
                A0a.A06();
                if (z3) {
                    i = 2131959782;
                } else if (C61970qY.A0E(DbT.A05(context))) {
                    OYF.A00("DirectWeakConnectionError");
                    i = 2131960738;
                } else {
                    i = 2131959847;
                }
                DbS.A19(context, A0a, i);
                DbY.A1N(A0a);
            } else {
                C69904Nu6.A00(context, z3);
            }
        }
        AnonymousClass0fD.A0A(190330850, A03);
    }

    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        String str;
        C43851CFr cFr;
        String str2;
        int A03 = AnonymousClass0fD.A03(-609366658);
        B72 b72 = (B72) obj;
        int A032 = AnonymousClass0fD.A03(-1274426530);
        C71153OeR oeR = this.A01;
        oeR.A0E = true;
        boolean z = oeR.A0O;
        C69004Ncg ncg = oeR.A0o;
        boolean z2 = oeR.A0J;
        if (!z) {
            C69004Ncg.A01(C67256Mkq.PENDING, ncg, z2, true);
            Set set = this.A00;
            C71153OeR.A0L(oeR);
            oeR.A0G = !set.containsAll(oeR.A12);
            set.clear();
        } else {
            C69004Ncg.A01(C67256Mkq.SPAM, ncg, z2, true);
        }
        C67197Mjt mjt = oeR.A03;
        mjt.A01.markerPoint(20125924, 002.A0c("inbox_fetch_", "_end", mjt.A00));
        C71153OeR.A0J(oeR);
        OMH omh = oeR.A0r;
        boolean z3 = oeR.A0J;
        NJW njw = omh.A00;
        if (njw.isAdded()) {
            C238143As r0 = njw.A03;
            if (r0 != null && z3) {
                r0.EKm(njw);
            }
            C238143As r9 = njw.A03;
            if (r9 != null) {
                if (!njw.isResumed() || njw.A06 || r9.BLQ() != r9.getCount() - 1) {
                    njw.A06().A03.A01.markerEnd(20125924, 2);
                } else {
                    njw.A06().A0c();
                }
            }
            NJW.A03(njw);
        }
        oeR.A0J = false;
        if (oeR.A0L) {
            oeR.A0K = false;
        }
        if (C71153OeR.A0U(oeR)) {
            oeR.A0I = true;
        }
        C67565Mpz mpz = oeR.A0n;
        mpz.A04("threads_rendered_server", (String) null);
        C67573Mq7.A00(mpz, new C73914Plp(mpz, 26));
        C67256Mkq A0W = oeR.A0W();
        0qQ.A0B(A0W, 0);
        if (C67256Mkq.PENDING == A0W) {
            str = "threads_rendered_pending";
        } else {
            str = "threads_rendered_other";
        }
        ncg.A04(str, "server");
        UserSession userSession2 = oeR.A0h;
        0qQ.A0B(userSession2, 0);
        if (182.A06(0Tu.A06, userSession2, 36316280654991558L)) {
            AnonymousClass4DH r1 = oeR.A0b;
            if (!(!r1.isResumed() || b72 == null || r1.getActivity() == null)) {
                AnonymousClass4kA r10 = oeR.A0s;
                0s0 r92 = r10.A0K;
                AnonymousClass0YZ[] r8 = AnonymousClass4kA.A0c;
                if (!AnonymousClass7TG.A1a(r10, r92, r8, 11) && (cFr = b72.A07) != null) {
                    String str3 = cFr.A01;
                    if (str3 == null) {
                        str2 = DialogModule.KEY_TITLE;
                    } else if (str3.length() > 0) {
                        C310336ap A0a = DbS.A0a();
                        A0a.A0D = str3;
                        String str4 = cFr.A00;
                        if (str4 != null) {
                            A0a.A0I = str4;
                            A0a.A02();
                            A0a.A07(R.drawable.instagram_eye_off_pano_outline_24);
                            A0a.A06();
                            Dbb.A1Q(A0a);
                            AnonymousClass7TF.A1J(r10, r92, r8, 11, true);
                        } else {
                            str2 = DevServerEntity.COLUMN_DESCRIPTION;
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        AnonymousClass0fD.A0A(-482288682, A032);
        AnonymousClass0fD.A0A(1469333546, A03);
    }
}
