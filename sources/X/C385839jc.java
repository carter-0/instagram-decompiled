package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.9jc  reason: invalid class name and case insensitive filesystem */
public final class C385839jc extends 2Cn {
    public final /* synthetic */ C3499482o A00;
    public final /* synthetic */ C359318cb A01;
    public final /* synthetic */ C2801950r A02;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        0kD.A07("ClipsPostCaptureController", "Failed to import prefill medium videos", exc);
        C359318cb r4 = this.A01;
        UserSession userSession = r4.A0b;
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
        C2801950r r3 = this.A02;
        if (r3 == C2801950r.CLIPS) {
            AtomicLong atomicLong = A012.A0F;
            atomicLong.set(A012.A0K.A07("prefill medium failed", "", 838607486, atomicLong.get()));
        }
        AnonymousClass7TE.A0n(userSession).A07(r3, "prefill medium failed", (String) null, (String) null);
        r4.A0G();
        C64169LRs.A02(r4.A0S, AnonymousClass05K.A0u, "Failure while importing video for Reels", 2131955552);
    }

    public C385839jc(C3499482o r1, C359318cb r2, C2801950r r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        long j;
        int i;
        C279294yP r3;
        AnonymousClass51M r32;
        List<C349307zv> list = (List) obj;
        0qQ.A0B(list, 0);
        C359318cb r0 = this.A01;
        UserSession userSession = r0.A0b;
        AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
        C2801950r r8 = this.A02;
        C3494680m r9 = r0.A0d.A08;
        String str = ((C279284yO) r9.A00).A02;
        28D r2 = r0.A0Y;
        28D r322 = r2;
        AnonymousClass8A2.A00(r2, A012, r8, str, "prefill_import_end", "6");
        if (list.isEmpty()) {
            onFail(AnonymousClass7TE.A15("zero videos imported"));
            return;
        }
        AnonymousClass81W r5 = ((NineSixteenLayoutConfigImpl) r0.A0f).A0K;
        List A1I = AnonymousClass7TE.A1I(0sr.A1P(new Long[]{Long.valueOf((long) r5.getHeight()), Long.valueOf((long) r5.getWidth())}));
        C349307zv r22 = (C349307zv) 00k.A0O(list, 0);
        long j2 = 0;
        if (r22 != null) {
            j = (long) r22.A08;
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        C349307zv r23 = (C349307zv) 00k.A0O(list, 0);
        if (r23 != null) {
            j2 = (long) r23.A0K;
        }
        List A1I2 = AnonymousClass7TE.A1I(0sr.A1P(new Long[]{valueOf, Long.valueOf(j2)}));
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        for (C349307zv r52 : list) {
            A0p.add(0sr.A1P(new Long[]{Long.valueOf((long) r52.A08), Long.valueOf((long) r52.A0K)}));
        }
        ArrayList A0p2 = AnonymousClass7TF.A0p(list);
        for (C349307zv A002 : list) {
            AnonymousClass7TE.A1Y(A0p2, A002.A00());
        }
        ArrayList A0p3 = AnonymousClass7TF.A0p(list);
        for (C349307zv r24 : list) {
            A0p3.add(r24.A0k);
        }
        29f r13 = 27p.A01(userSession).A0A;
        C349307zv r25 = (C349307zv) 00k.A0O(list, 0);
        if (r25 != null) {
            i = r25.A0F;
        } else {
            i = -1;
        }
        AnonymousClass82Y r33 = this.A00.A01;
        String A05 = r33.A05();
        C279294yP r11 = C279294yP.CLIPS;
        C2801950r r26 = C2801950r.FEED_POST;
        C279294yP r17 = r11;
        29f r15 = r13;
        r15.A0Z((C360948fP) null, r17, 28t.A06, r33.A09, A05, A1I, A1I2, A0p, A0p2, A0p3, i, AnonymousClass7TF.A1W(r8, r26));
        AnonymousClass8A2.A00(r322, AnonymousClass8A1.A01(userSession), r8, ((C279284yO) r9.A00).A02, "prefill_process_start", "7");
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C349307zv r34 : list) {
            int i2 = r34.A07;
            if (i2 == 0) {
                onFail(AnonymousClass7TE.A15("video duration is zero"));
                return;
            }
            AnonymousClass7TF.A1M(A1C, i2);
        }
        List A1C2 = AnonymousClass7TE.A1C();
        if (r8 != r26) {
            A1C2 = C18185Vmz.A01(A1C, r0.A0s.A0E());
            if (list.size() != A1C2.size()) {
                onFail(AnonymousClass7TE.A15("videos size differs from finalVideoDurations size"));
                return;
            }
        }
        29f r53 = 27p.A01(userSession).A0A;
        C360948fP r4 = C360948fP.CLIPS;
        if (r8 == r26) {
            r3 = C279294yP.FEED;
        } else {
            r3 = null;
        }
        r53.A0Y(r4, r11, r3, false);
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C349307zv r14 = (C349307zv) 00k.A0O(list, i3);
            if (r14 != null) {
                int i4 = r14.A07;
                if (r8 == r26) {
                    r32 = C359318cb.A00(r0, r14, 0, r14.A07);
                } else {
                    C56077HsQ hsQ = (C56077HsQ) 00k.A0O(A1C2, i3);
                    if (hsQ != null) {
                        int i5 = hsQ.A00;
                        int i6 = hsQ.A01;
                        i4 = i5 - i6;
                        r32 = C359318cb.A00(r0, r14, i6, i5);
                    } else {
                        r32 = null;
                    }
                }
                27p.A01(userSession).A0A.A0d((List) null, (List) null, 0sn.A00, (double) i4, 1, (long) r0.A0s.A0E(), AnonymousClass7TF.A1W(r8, r26));
                if (r32 != null) {
                    A1C3.add(r32);
                    A1C4.add(AEK.A00(r32, (AudioOverlayTrack) null, i3));
                }
            }
        }
        28D r10 = r322;
        AnonymousClass8A2.A00(r10, AnonymousClass8A1.A01(userSession), r8, ((C279284yO) r9.A00).A02, "prefill_process_end", "8");
        r0.A0s.A0i(A1C3);
        AnonymousClass8A1.A01(userSession).A05(r10, r8, ((C279284yO) r9.A00).A02, A1C4);
        r0.A0G();
        C359318cb.A08(r0);
    }
}
