package com.instagram.creation.capture.quickcapture.storydrafts;

import X.02z;
import X.05F;
import X.05G;
import X.05Y;
import X.0qQ;
import X.0sP;
import X.0u9;
import X.10b;
import X.19B;
import X.1Eo;
import X.1HR;
import X.27p;
import X.29E;
import X.2Fk;
import X.2YL;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0iw;
import X.AnonymousClass0r6;
import X.AnonymousClass4D7;
import X.AnonymousClass82Y;
import X.AnonymousClass9I4;
import X.AnonymousClass9K1;
import X.AnonymousClass9KF;
import X.AnonymousClass9KX;
import X.C226292g8;
import X.C249513ju;
import X.C262224Cq;
import X.C318116oQ;
import X.C318136oS;
import X.C349307zv;
import X.C3499482o;
import X.C3499582p;
import X.C351738Ad;
import X.C351778Aj;
import X.C351798Al;
import X.C352218Cl;
import X.C365758nd;
import X.C365918nt;
import X.C365928nu;
import X.C365948nw;
import X.C366678pU;
import X.C381589c0;
import X.C389489pi;
import X.C389499pj;
import X.MEW;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.Iterator;
import java.util.List;

public final class StoryDraftsCreationViewModel extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C351798Al A04;
    public final C249513ju A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final AnonymousClass0r6 A09;
    public final AnonymousClass0Ud A0A;

    public StoryDraftsCreationViewModel(AnonymousClass0iw r5, UserSession userSession, C351798Al r7) {
        0qQ.A0B(r5, 3);
        this.A03 = userSession;
        this.A04 = r7;
        this.A02 = r5;
        02z r1 = new 02z(new AnonymousClass9I4(false, 1));
        this.A08 = r1;
        1HR r0 = new 1HR(0);
        this.A06 = r0;
        05Y A042 = 0u9.A04(r0);
        this.A09 = A042;
        05F A032 = 10b.A03(r1);
        this.A0A = A032;
        19B r12 = 19B.A00;
        this.A01 = C226292g8.A00(r12, A032);
        this.A00 = C226292g8.A00(r12, A042);
        1HR r02 = new 1HR(0);
        this.A05 = r02;
        this.A07 = 0u9.A04(r02);
    }

    public final void A01(Context context, Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider, C3499582p r33, CameraSpec cameraSpec, C366678pU r35, 0sP r36, boolean z, boolean z2) {
        Integer num;
        C381589c0 r17;
        C3499582p r5 = r33;
        0qQ.A0B(r5, 0);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 3);
        Context context2 = context;
        0qQ.A0B(context2, 4);
        C365928nu A002 = C365918nt.A00(this.A03);
        29E r4 = A002.A04;
        long A042 = r4.A04((Integer) null, (String) null, 518927515, 12000);
        A002.A01 = A042;
        if (z2) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        r4.A0B(A042, "media_type", C365948nw.A00(num), false);
        C3499482o r3 = r5.A02;
        C365758nd A012 = r3.A01();
        C365758nd r0 = C365758nd.A07;
        AnonymousClass82Y r32 = r3.A01;
        Bitmap bitmap2 = bitmap;
        CameraSpec cameraSpec2 = cameraSpec;
        C366678pU r10 = r35;
        boolean z3 = z;
        if (A012 == r0) {
            C349307zv A043 = r32.A04();
            if (A043 != null) {
                if (A043.A1G) {
                    int i = A043.A0J;
                    A043.A0H = i;
                    int i2 = A043.A0I;
                    A043.A06 = i2;
                    A043.A07 = i2 - i;
                }
                r17 = new C381589c0(context2, bitmap2, targetViewSizeProvider2, cameraSpec2, r10, C389499pj.A00, (C352218Cl) null, A043, r32.A05(), r32.A0G, z3);
            } else {
                return;
            }
        } else {
            C352218Cl A032 = r32.A03();
            if (A032 != null) {
                r17 = new C381589c0(context2, bitmap2, targetViewSizeProvider2, cameraSpec2, r10, C389489pi.A00, A032, (C349307zv) null, r32.A05(), r32.A0G, z3);
            } else {
                return;
            }
        }
        C318136oS A003 = C318116oQ.A00(this);
        AnonymousClass9KF r52 = new AnonymousClass9KF(this, r36, r17, (AnonymousClass4D7) null, 30);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r52, A003);
    }

    public final void A03(String str) {
        C351738Ad r3 = this.A04.A03.A00;
        C262224Cq r1 = r3.A01;
        1Eo.A05(19B.A00, new MEW(r3, str, (AnonymousClass4D7) null, 15, true), r1);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075 A[Catch:{ RuntimeException -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b A[Catch:{ RuntimeException -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r11, X.B22 r12, X.C381589c0 r13, X.AnonymousClass4D7 r14) {
        /*
            r3 = 18
            boolean r0 = X.C376709Ja.A00(r3, r14)
            if (r0 == 0) goto L_0x0028
            r4 = r14
            X.9Ja r4 = (X.C376709Ja) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A03
            X.1Hj r5 = X.1Hj.A02
            int r3 = r4.A00
            java.lang.String r1 = "draftCreationUseCases.Save failed "
            r2 = 1
            if (r3 == 0) goto L_0x0036
            if (r3 != r2) goto L_0x002e
            java.lang.Object r12 = r4.A02
            X.B22 r12 = (X.B22) r12
            goto L_0x006e
        L_0x0028:
            X.9Ja r4 = new X.9Ja
            r4.<init>(r11, r14, r3)
            goto L_0x0016
        L_0x002e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0036:
            X.0eS.A00(r0)
            X.8Al r0 = r11.A04     // Catch:{ RuntimeException -> 0x0086 }
            X.8Ai r0 = r0.A02     // Catch:{ RuntimeException -> 0x0086 }
            r8 = r13
            r4.A01 = r13     // Catch:{ RuntimeException -> 0x0086 }
            r4.A02 = r12     // Catch:{ RuntimeException -> 0x0086 }
            r4.A00 = r2     // Catch:{ RuntimeException -> 0x0086 }
            X.8Ad r9 = r0.A00     // Catch:{ RuntimeException -> 0x0086 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C241503Pl.A01     // Catch:{ RuntimeException -> 0x0086 }
            X.4D7 r0 = X.1Ey.A02(r4)     // Catch:{ RuntimeException -> 0x0086 }
            X.3Pl r4 = new X.3Pl     // Catch:{ RuntimeException -> 0x0086 }
            r4.<init>(r0)     // Catch:{ RuntimeException -> 0x0086 }
            X.AbG r7 = new X.AbG     // Catch:{ RuntimeException -> 0x0086 }
            r7.<init>(r4)     // Catch:{ RuntimeException -> 0x0086 }
            X.4Cq r3 = r9.A01     // Catch:{ RuntimeException -> 0x0086 }
            r10 = 0
            r11 = 9
            X.9KE r6 = new X.9KE     // Catch:{ RuntimeException -> 0x0086 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x0086 }
            X.19B r2 = X.19B.A00     // Catch:{ RuntimeException -> 0x0086 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ RuntimeException -> 0x0086 }
            X.1Eo.A03(r0, r2, r6, r3)     // Catch:{ RuntimeException -> 0x0086 }
            java.lang.Object r0 = r4.A00()     // Catch:{ RuntimeException -> 0x0086 }
            if (r0 != r5) goto L_0x0071
            return r5
        L_0x006e:
            X.0eS.A00(r0)     // Catch:{ RuntimeException -> 0x0086 }
        L_0x0071:
            X.8ve r0 = (X.C369988ve) r0     // Catch:{ RuntimeException -> 0x0086 }
            if (r0 == 0) goto L_0x007b
            if (r12 == 0) goto L_0x0094
            r12.DoK(r0)     // Catch:{ RuntimeException -> 0x0086 }
            goto L_0x0094
        L_0x007b:
            if (r12 == 0) goto L_0x0094
            r0 = 0
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ RuntimeException -> 0x0086 }
            r12.onError(r0)     // Catch:{ RuntimeException -> 0x0086 }
            goto L_0x0094
        L_0x0086:
            r0 = move-exception
            if (r12 == 0) goto L_0x0094
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = X.002.A0R(r1, r0)
            r12.onError(r0)
        L_0x0094:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel.A00(com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel, X.B22, X.9c0, X.4D7):java.lang.Object");
    }

    public final void A02(String str) {
        if (str != null) {
            C318136oS A002 = C318116oQ.A00(this);
            AnonymousClass9KX r2 = new AnonymousClass9KX(this, str, (AnonymousClass4D7) null, 2);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
        }
    }

    public final void A04(List list) {
        C351778Aj r0 = this.A04.A00;
        UserSession userSession = this.A03;
        C351738Ad r4 = r0.A00;
        C262224Cq r3 = r4.A01;
        AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) list, (Object) r4, (AnonymousClass4D7) null, 27);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            27p.A01(userSession).A1o((String) it.next());
        }
    }
}
