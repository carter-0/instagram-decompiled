package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts;

import X.00k;
import X.02z;
import X.05G;
import X.0Yv;
import X.0qQ;
import X.106;
import X.19B;
import X.19E;
import X.1Eo;
import X.1Hj;
import X.28D;
import X.2Fk;
import X.2YL;
import X.AXV;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass12T;
import X.AnonymousClass19S;
import X.AnonymousClass2Fj;
import X.AnonymousClass2gB;
import X.AnonymousClass2gO;
import X.AnonymousClass3QO;
import X.AnonymousClass4D7;
import X.AnonymousClass72O;
import X.AnonymousClass72Y;
import X.AnonymousClass88B;
import X.AnonymousClass88W;
import X.AnonymousClass8A1;
import X.AnonymousClass8RJ;
import X.AnonymousClass8Y4;
import X.AnonymousClass9IV;
import X.AnonymousClass9KF;
import X.AnonymousClass9LJ;
import X.AnonymousClass9P8;
import X.C262224Cq;
import X.C2801950r;
import X.C293505kq;
import X.C318116oQ;
import X.C318136oS;
import X.C3511387s;
import X.C351888Av;
import X.C351898Aw;
import X.C351908Ax;
import X.C351918Ay;
import X.C361278fx;
import X.C361308g1;
import X.C376909Ju;
import X.C40405Abc;
import X.C40411Abi;
import X.C60340gF;
import X.C62320sa;
import X.C63175Ksi;
import X.C63520KyV;
import X.JXu;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class ClipsCreationDraftViewModel extends 2YL implements AnonymousClass72O {
    public C293505kq A00;
    public AnonymousClass3QO A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final 2Fk A05;
    public final AnonymousClass2gB A06;
    public final AnonymousClass2Fj A07;
    public final AnonymousClass2Fj A08 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A09 = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2Fj A0B = new AnonymousClass2Fj();
    public final AnonymousClass2Fj A0C = new AnonymousClass2Fj();
    public final C361308g1 A0D;
    public final UserSession A0E;
    public final ClipsCreationViewModel A0F;
    public final C3511387s A0G;
    public final ClipsDraftRepository A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;
    public final C62320sa A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final 05G A0Q;
    public final C351888Av A0R;
    public final AnonymousClass88B A0S;
    public final C262224Cq A0T;

    public ClipsCreationDraftViewModel(Context context, C361308g1 r12, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C3511387s r15, ClipsDraftRepository clipsDraftRepository, AnonymousClass88B r17, C62320sa r18) {
        0qQ.A0B(context, 1);
        ClipsDraftRepository clipsDraftRepository2 = clipsDraftRepository;
        0qQ.A0B(clipsDraftRepository2, 2);
        0qQ.A0B(clipsCreationViewModel, 3);
        0qQ.A0B(r12, 4);
        0qQ.A0B(r15, 5);
        0qQ.A0B(userSession, 6);
        AnonymousClass88B r1 = r17;
        0qQ.A0B(r1, 8);
        this.A04 = context;
        this.A0H = clipsDraftRepository2;
        this.A0F = clipsCreationViewModel;
        this.A0D = r12;
        this.A0G = r15;
        this.A0E = userSession;
        this.A0N = r18;
        this.A0S = r1;
        AnonymousClass2gB r3 = new AnonymousClass2gB();
        this.A06 = r3;
        AnonymousClass2Fj r4 = new AnonymousClass2Fj();
        this.A07 = r4;
        this.A0O = 106.A01((Object) null);
        this.A0Q = new 02z(new AnonymousClass88W(false));
        this.A0P = new 02z(new AnonymousClass88W(false));
        this.A0M = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 47));
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.A04);
        this.A0T = A022;
        this.A0K = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 45));
        this.A0I = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 43));
        this.A0J = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 44));
        this.A0L = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 46));
        C351888Av r5 = new C351888Av(this);
        this.A0R = r5;
        this.A05 = AnonymousClass72Y.A01(r4, C351898Aw.A00);
        this.A0A = new AnonymousClass2Fj();
        clipsCreationViewModel.A06 = new AnonymousClass9LJ(this, 42);
        C376909Ju r0 = new C376909Ju(this, (AnonymousClass4D7) null, 1);
        19B r42 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        1Eo.A03(num, r42, r0, A022);
        1Eo.A03(num, r42, new C376909Ju(this, (AnonymousClass4D7) null, 2), A022);
        1Eo.A03(num, r42, new C376909Ju(this, (AnonymousClass4D7) null, 3), C318116oQ.A00(this));
        clipsCreationViewModel.A0I.A09((AnonymousClass2gO) this.A0L.getValue());
        ((2Fk) clipsCreationViewModel.A0T.getValue()).A09((AnonymousClass2gO) this.A0J.getValue());
        clipsCreationViewModel.A02 = r5;
        r3.A0E(this.A0H.A02, new C351918Ay(new C351908Ax(this)));
    }

    public final C293505kq A09(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        C293505kq A002 = A00(this);
        if (A002 != null) {
            str2 = A002.A0T;
        }
        if (0qQ.A0K(str2, str)) {
            return A00(this);
        }
        return this.A0D.A00(str);
    }

    public final void A0D(FragmentActivity fragmentActivity, 28D r6, C62320sa r7) {
        AnonymousClass9IV r0;
        C293505kq r02;
        AnonymousClass9P8 r3;
        0qQ.A0B(r6, 0);
        AnonymousClass88W r03 = (AnonymousClass88W) this.A0C.A02();
        if (r03 == null || (r0 = (AnonymousClass9IV) r03.A01) == null || (r02 = (C293505kq) r0.A00) == null || (r3 = r02.A0E) == null) {
            r7.invoke();
            A0B();
            return;
        }
        C63175Ksi.A00(this.A0E, new C40405Abc(fragmentActivity, r6, r3, this), r3.A09);
    }

    public final void A0E(C2801950r r4) {
        0qQ.A0B(r4, 0);
        this.A01 = null;
        this.A0H.A0L();
        if (!A0G()) {
            A0F(r4, (PendingRecipient) null, false);
        }
    }

    public final void A0F(C2801950r r10, PendingRecipient pendingRecipient, boolean z) {
        C361278fx r2;
        int i;
        C2801950r r6 = r10;
        0qQ.A0B(r10, 0);
        if (z || (r2 = (C361278fx) this.A0H.A02.A02()) == null || (i = r2.A00) == 0 || i == 1 || ((C293505kq) r2.A00()).A0H != r10) {
            C318136oS A002 = C318116oQ.A00(this);
            AnonymousClass9KF r3 = new AnonymousClass9KF(this, pendingRecipient, r6, (AnonymousClass4D7) null, 39);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A002);
        }
    }

    public static final C293505kq A00(ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        C361278fx r2 = (C361278fx) clipsCreationDraftViewModel.A0H.A02.A02();
        if (r2 == null || r2.A00 != 3) {
            return null;
        }
        return (C293505kq) r2.A00();
    }

    public static final C293505kq A01(ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        AnonymousClass2Fj r3 = clipsCreationDraftViewModel.A0H.A02;
        if (r3.A02() == null || r3.A02() == null) {
            return null;
        }
        Object A022 = r3.A02();
        0qQ.A0C(A022, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.model.Resource<com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.models.ClipsDraft>");
        if (((C361278fx) A022).A00 != 3) {
            return null;
        }
        Object A023 = r3.A02();
        0qQ.A0C(A023, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.model.Resource<com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.models.ClipsDraft>");
        return (C293505kq) ((C361278fx) A023).A00();
    }

    public static final Object A02(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C293505kq r3, AnonymousClass4D7 r4) {
        Object A072;
        if (r3.A0G == JXu.A02) {
            if (r3.A0v.isEmpty()) {
                A072 = clipsCreationDraftViewModel.A0H.A0C(r3, r4);
                if (A072 != 1Hj.A02) {
                    A072 = C60340gF.A00;
                }
            } else {
                AnonymousClass8A1.A01(clipsCreationDraftViewModel.A0E).A0P(false, false);
                A072 = clipsCreationDraftViewModel.A07(r3, r4, false);
            }
            if (A072 == 1Hj.A02) {
                return A072;
            }
        }
        return C60340gF.A00;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.ME2, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r15, X.C293505kq r16, X.AnonymousClass4D7 r17, X.0sP r18, boolean r19, boolean r20, boolean r21) {
        /*
            r12 = r18
            r8 = r21
            r7 = 2
            r3 = r17
            boolean r0 = X.ME2.A02(r7, r3)
            if (r0 == 0) goto L_0x0120
            r11 = r3
            X.ME2 r11 = (X.ME2) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0120
            int r2 = r2 - r1
            r11.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r11.A06
            X.1Hj r5 = X.1Hj.A02
            int r0 = r11.A00
            r3 = 1
            if (r0 == 0) goto L_0x0065
            if (r0 == r3) goto L_0x005d
            if (r0 != r7) goto L_0x0127
            boolean r8 = r11.A08
            java.lang.Object r2 = r11.A05
            X.5kq r2 = (X.C293505kq) r2
            java.lang.Object r6 = r11.A04
            X.5kq r6 = (X.C293505kq) r6
            java.lang.Object r4 = r11.A03
            X.9Ua r4 = (X.C379469Ua) r4
            java.lang.Object r12 = r11.A02
            X.0sP r12 = (X.0sP) r12
            java.lang.Object r15 = r11.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r15 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r15
            X.0eS.A00(r1)
        L_0x0041:
            if (r8 == 0) goto L_0x004e
            X.JXu r1 = r6.A0G
            X.JXu r0 = X.JXu.A02
            if (r1 != r0) goto L_0x004e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r15.A0H
            r0.A0N(r2)
        L_0x004e:
            r12.invoke(r2)
        L_0x0051:
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x005a
            java.util.Set r0 = r4.A01
            r0.clear()
        L_0x005a:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x005d:
            java.lang.Object r4 = r11.A01
            X.9Ua r4 = (X.C379469Ua) r4
            X.0eS.A00(r1)
            goto L_0x0051
        L_0x0065:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r15.A0E
            X.9Ua r4 = X.AnonymousClass9T6.A00(r0)
            X.0sa r0 = r15.A0N
            r2 = 0
            r13 = r19
            r14 = r20
            r1 = r16
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r0.invoke()
            if (r0 == 0) goto L_0x00a6
            java.util.Set r0 = r4.A01
            java.util.List r2 = X.00k.A0a(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r15.A0F
            X.2gB r0 = r0.A0G
            java.lang.Object r0 = r0.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            X.Abf r9 = new X.Abf
            r9.<init>(r0, r2, r13, r14)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r8 = r15.A0H
            X.Abj r10 = new X.Abj
            r10.<init>(r15, r1)
            r11.A01 = r4
            r11.A00 = r3
            java.lang.Object r0 = r8.A0F(r9, r10, r11, r12, r13, r14)
            if (r0 != r5) goto L_0x0051
            return r5
        L_0x00a6:
            r6 = r1
            java.util.List r0 = r1.A0v
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00cf
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r15.A0F
            X.2gB r0 = r0.A0G
            java.lang.Object r0 = r0.A02()
            X.831 r0 = (X.AnonymousClass831) r0
            if (r0 == 0) goto L_0x0117
            X.JXe r3 = new X.JXe
            r3.<init>()
            java.util.ArrayList r0 = r0.A05()
            java.util.List r0 = X.LIO.A01(r0)
            r3.A06(r0)
            X.5kq r6 = r3.A01(r1)
        L_0x00cf:
            if (r6 == 0) goto L_0x0117
            X.JXe r3 = new X.JXe
            r3.<init>()
            X.JXu r0 = X.JXu.A03
            r3.A05(r0)
            if (r19 != 0) goto L_0x0114
            if (r20 != 0) goto L_0x0114
            java.util.Set r0 = r4.A01
            java.util.List r1 = X.00k.A0a(r0)
        L_0x00e5:
            X.JXc r0 = new X.JXc
            r0.<init>(r1)
            r3.A0m = r0
            long r0 = r6.A01
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00f8
            long r0 = java.lang.System.currentTimeMillis()
        L_0x00f8:
            r3.A03(r0)
            X.5kq r2 = r3.A01(r6)
            r11.A01 = r15
            r11.A02 = r12
            r11.A03 = r4
            r11.A04 = r6
            r11.A05 = r2
            r11.A08 = r8
            r11.A00 = r7
            java.lang.Object r0 = r15.A07(r2, r11, r13)
            if (r0 != r5) goto L_0x0041
            return r5
        L_0x0114:
            java.util.List r1 = r1.A0r
            goto L_0x00e5
        L_0x0117:
            java.lang.String r1 = "ClipsCreationDraftViewModel"
            java.lang.String r0 = "handleUnsavedDraft: unsaved draft has no video segments"
            X.0kD.A06(r1, r0, r2)
            goto L_0x005a
        L_0x0120:
            X.ME2 r11 = new X.ME2
            r11.<init>(r15, r3, r7)
            goto L_0x001b
        L_0x0127:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A03(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.5kq, X.4D7, X.0sP, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r8, X.C2801950r r9, com.instagram.pendingmedia.model.recipients.PendingRecipient r10, X.AnonymousClass4D7 r11) {
        /*
            r4 = 15
            boolean r0 = X.C376739Jd.A00(r4, r11)
            if (r0 == 0) goto L_0x00cd
            r3 = r11
            X.9Jd r3 = (X.C376739Jd) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00cd
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A04
            X.1Hj r1 = X.1Hj.A02
            int r7 = r3.A00
            r4 = 3
            r6 = 2
            r5 = 1
            r2 = 0
            if (r7 == 0) goto L_0x002e
            if (r7 == r5) goto L_0x0046
            if (r7 == r6) goto L_0x0082
            if (r7 != r4) goto L_0x00d4
            X.0eS.A00(r0)
        L_0x002b:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x002e:
            X.0eS.A00(r0)
            X.88B r0 = r8.A0S
            X.82i r0 = r0.A00
            if (r0 == 0) goto L_0x0055
            r3.A01 = r8
            r3.A02 = r9
            r3.A03 = r10
            r3.A00 = r5
            java.lang.Object r0 = A06(r8, r9, r3)
            if (r0 != r1) goto L_0x0055
            return r1
        L_0x0046:
            java.lang.Object r10 = r3.A03
            com.instagram.pendingmedia.model.recipients.PendingRecipient r10 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r10
            java.lang.Object r9 = r3.A02
            X.50r r9 = (X.C2801950r) r9
            java.lang.Object r8 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r8 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r8
            X.0eS.A00(r0)
        L_0x0055:
            boolean r0 = r8.A0G()
            if (r0 == 0) goto L_0x006f
            X.2Fj r4 = r8.A07
            java.lang.Object r0 = r4.A02()
            java.lang.String r0 = (java.lang.String) r0
            X.5kq r1 = r8.A09(r0)
            if (r1 == 0) goto L_0x00a9
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r8.A0H
            r0.A0N(r1)
            goto L_0x002b
        L_0x006f:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r8.A0H
            r3.A01 = r8
            r3.A02 = r9
            r3.A03 = r10
            r3.A00 = r6
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r0.A03
            java.lang.Object r0 = r0.A04(r9, r3)
            if (r0 != r1) goto L_0x0091
            return r1
        L_0x0082:
            java.lang.Object r10 = r3.A03
            com.instagram.pendingmedia.model.recipients.PendingRecipient r10 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r10
            java.lang.Object r9 = r3.A02
            X.50r r9 = (X.C2801950r) r9
            java.lang.Object r8 = r3.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r8 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r8
            X.0eS.A00(r0)
        L_0x0091:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c8
            r0 = 0
            r3.A01 = r2
            r3.A02 = r2
            r3.A03 = r2
            r3.A00 = r4
            java.lang.Object r0 = A05(r8, r9, r10, r3, r0)
            if (r0 != r1) goto L_0x002b
            return r1
        L_0x00a9:
            com.instagram.common.session.UserSession r0 = r8.A0E
            X.8A2 r3 = X.AnonymousClass8A1.A01(r0)
            java.lang.String r1 = "ClipsCreationDraftViewModel"
            java.lang.String r0 = "Failed to load draft"
            r3.A0N(r1, r0)
            java.lang.String r0 = "Error in loading draft in initializeDraftForCreationSync"
            X.0kD.A06(r1, r0, r2)
            r4.A0B(r2)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r8.A0F
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            X.83A r0 = r0.A0A
            X.839 r0 = r0.A01
            r0.A00 = r2
        L_0x00c8:
            A08(r8, r9, r10)
            goto L_0x002b
        L_0x00cd:
            X.9Jd r3 = new X.9Jd
            r3.<init>(r8, r11, r4)
            goto L_0x0016
        L_0x00d4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A04(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.50r, com.instagram.pendingmedia.model.recipients.PendingRecipient, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.9Jf, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r12, X.C2801950r r13, com.instagram.pendingmedia.model.recipients.PendingRecipient r14, X.AnonymousClass4D7 r15, boolean r16) {
        /*
            r10 = r16
            r9 = 2
            r3 = r15
            boolean r0 = X.C376759Jf.A00(r9, r15)
            if (r0 == 0) goto L_0x00d4
            r8 = r3
            X.9Jf r8 = (X.C376759Jf) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d4
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0018:
            java.lang.Object r7 = r8.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 3
            r1 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 == r1) goto L_0x006b
            if (r0 == r9) goto L_0x0045
            if (r0 != r5) goto L_0x00db
            java.lang.Object r3 = r8.A02
            X.5kq r3 = (X.C293505kq) r3
            java.lang.Object r2 = r8.A01
            X.2Fk r2 = (X.2Fk) r2
            X.0eS.A00(r7)
        L_0x0033:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            X.9IV r1 = new X.9IV
            r1.<init>((android.graphics.Bitmap) r7, (X.C293505kq) r3)
            X.88W r0 = new X.88W
            r0.<init>(r1)
            r2.A0A(r0)
        L_0x0042:
            X.0gF r6 = X.C60340gF.A00
        L_0x0044:
            return r6
        L_0x0045:
            java.lang.Object r14 = r8.A03
            com.instagram.pendingmedia.model.recipients.PendingRecipient r14 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r14
            java.lang.Object r13 = r8.A02
            X.50r r13 = (X.C2801950r) r13
            java.lang.Object r12 = r8.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r12 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r12
            X.0eS.A00(r7)
            goto L_0x0097
        L_0x0055:
            X.0eS.A00(r7)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r12.A0H
            r8.A01 = r12
            r8.A02 = r13
            r8.A03 = r14
            r8.A05 = r10
            r8.A00 = r1
            java.lang.Object r7 = r0.A0E(r13, r8)
            if (r7 != r6) goto L_0x007c
            return r6
        L_0x006b:
            boolean r10 = r8.A05
            java.lang.Object r14 = r8.A03
            com.instagram.pendingmedia.model.recipients.PendingRecipient r14 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r14
            java.lang.Object r13 = r8.A02
            X.50r r13 = (X.C2801950r) r13
            java.lang.Object r12 = r8.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r12 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r12
            X.0eS.A00(r7)
        L_0x007c:
            X.5kq r7 = (X.C293505kq) r7
            r4 = 0
            if (r7 != 0) goto L_0x009b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "handleUnsavedDraft: unsaved draft is null, clips creation type "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ClipsCreationDraftViewModel"
            X.0kD.A06(r0, r1, r4)
        L_0x0097:
            A08(r12, r13, r14)
            goto L_0x0042
        L_0x009b:
            X.L6N r0 = r7.A0F
            long r2 = r0.A01
            if (r10 != 0) goto L_0x00c3
            long r10 = java.lang.System.currentTimeMillis()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r10 = r10 - r0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00c3
            X.2Fj r2 = r12.A0C
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r12.A0H
            r8.A01 = r2
            r8.A02 = r7
            r8.A03 = r4
            r8.A00 = r5
            java.lang.Object r0 = r0.A0D(r7, r8)
            if (r0 == r6) goto L_0x0044
            r3 = r7
            r7 = r0
            goto L_0x0033
        L_0x00c3:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r12.A0H
            r8.A01 = r12
            r8.A02 = r13
            r8.A03 = r14
            r8.A00 = r9
            java.lang.Object r0 = r0.A0C(r7, r8)
            if (r0 != r6) goto L_0x0097
            return r6
        L_0x00d4:
            X.9Jf r8 = new X.9Jf
            r8.<init>(r12, r15, r9)
            goto L_0x0018
        L_0x00db:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A05(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.50r, com.instagram.pendingmedia.model.recipients.PendingRecipient, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r7, X.C2801950r r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 42
            boolean r0 = X.C66146MDy.A02(r3, r9)
            if (r0 == 0) goto L_0x009d
            r6 = r9
            X.MDy r6 = (X.C66146MDy) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009d
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r2) goto L_0x0047
            if (r0 == r3) goto L_0x0069
            if (r0 != r4) goto L_0x00a4
            X.0eS.A00(r1)
        L_0x002a:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002d:
            X.0eS.A00(r1)
            boolean r0 = r7.A0G()
            if (r0 != 0) goto L_0x002a
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r7.A0H
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r2
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r0 = r0.A03
            java.lang.Object r1 = r0.A04(r8, r6)
            if (r1 != r5) goto L_0x0052
            return r5
        L_0x0047:
            java.lang.Object r8 = r6.A02
            X.50r r8 = (X.C2801950r) r8
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r7
            X.0eS.A00(r1)
        L_0x0052:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L_0x002a
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r7.A0H
            r6.A01 = r7
            r6.A02 = r8
            r6.A00 = r3
            java.lang.Object r1 = r0.A0E(r8, r6)
            if (r1 != r5) goto L_0x0072
            return r5
        L_0x0069:
            java.lang.Object r8 = r6.A02
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r7 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r7
            X.0eS.A00(r1)
        L_0x0072:
            X.5kq r1 = (X.C293505kq) r1
            r2 = 0
            if (r1 != 0) goto L_0x008e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "handleNewRemix: unsaved draft is null, clips creation type "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ClipsCreationDraftViewModel"
            X.0kD.A06(r0, r1, r2)
            goto L_0x002a
        L_0x008e:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r7.A0H
            r6.A01 = r2
            r6.A02 = r2
            r6.A00 = r4
            java.lang.Object r0 = r0.A0C(r1, r6)
            if (r0 != r5) goto L_0x002a
            return r5
        L_0x009d:
            X.MDy r6 = new X.MDy
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x00a4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A06(com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel, X.50r, X.4D7):java.lang.Object");
    }

    private final Object A07(C293505kq r3, AnonymousClass4D7 r4, boolean z) {
        Object A0A2;
        int i = C63520KyV.A00[r3.A0G.ordinal()];
        if (i == 1) {
            A0A2 = this.A0H.A0A(new AXV(this), r3, r4);
        } else if (i == 2) {
            A0A2 = this.A0H.A0B(r3, new C40411Abi(this, r3), r4, z);
        } else {
            throw new RuntimeException();
        }
        if (A0A2 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A0A2;
    }

    public static final String A08(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C2801950r r11, PendingRecipient pendingRecipient) {
        List list;
        C361278fx r0;
        ClipsDraftRepository clipsDraftRepository = clipsCreationDraftViewModel.A0H;
        AnonymousClass9P8 A002 = clipsCreationDraftViewModel.A0S.A00();
        ClipsAudioStore clipsAudioStore = clipsCreationDraftViewModel.A0F.A0K;
        2Fk r1 = clipsAudioStore.A06;
        AudioOverlayTrack audioOverlayTrack = null;
        if (((r1.A02() instanceof AnonymousClass8Y4) || (r1.A02() instanceof AnonymousClass8RJ)) && (r0 = (C361278fx) r1.A02()) != null) {
            audioOverlayTrack = (AudioOverlayTrack) r0.A00();
        }
        List<C361278fx> list2 = (List) clipsAudioStore.A0V.getValue();
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
            for (C361278fx r02 : list2) {
                arrayList.add(r02.A01);
            }
            list = 00k.A0X(arrayList);
        } else {
            list = null;
        }
        return clipsDraftRepository.A0I(A002, r11, clipsCreationDraftViewModel.A01, audioOverlayTrack, pendingRecipient, list);
    }

    public final void A0B() {
        AnonymousClass9IV r0;
        AnonymousClass88W r02 = (AnonymousClass88W) this.A0C.A02();
        if (r02 == null || (r0 = (AnonymousClass9IV) r02.A01) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.A0H.A0N((C293505kq) r0.A00);
    }

    public final boolean A0G() {
        return 0qQ.A0K(this.A05.A02(), true);
    }

    public final Object CBo(C2801950r r2, AnonymousClass4D7 r3) {
        return this.A0H.A0E(r2, r3);
    }

    public final void onCleared() {
        19E.A05((CancellationException) null, this.A0T);
        ClipsCreationViewModel clipsCreationViewModel = this.A0F;
        clipsCreationViewModel.A0I.A08((AnonymousClass2gO) this.A0L.getValue());
        ((2Fk) clipsCreationViewModel.A0T.getValue()).A08((AnonymousClass2gO) this.A0J.getValue());
    }

    public final void A0A() {
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass9KF r2 = new AnonymousClass9KF(this, (AnonymousClass4D7) null, 38);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }

    public final void A0C() {
        if (A00(this) != null) {
            this.A01 = null;
            this.A0H.A0L();
        }
        C2801950r r1 = C2801950r.CLIPS;
        if (A00(this) == null) {
            A08(this, r1, (PendingRecipient) null);
        }
    }
}
