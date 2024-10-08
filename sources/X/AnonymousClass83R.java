package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsVirtualVideoStore$audioOverlayVolumeFlow$1;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.83R  reason: invalid class name */
public final class AnonymousClass83R {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass83I A02;
    public final AnonymousClass836 A03;
    public final 2Nn A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final ClipsAudioStore A08;
    public final AnonymousClass83H A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;

    public static final void A00(AnonymousClass83R r12, C349307zv r13, List list) {
        AudioOverlayTrack audioOverlayTrack;
        ArrayList arrayList;
        C361278fx r0;
        Object obj;
        ClipsAudioStore clipsAudioStore = r12.A08;
        C361278fx r1 = (C361278fx) clipsAudioStore.A0Y.getValue();
        String str = null;
        if (!(r1 instanceof AnonymousClass8Y4) || (audioOverlayTrack = (AudioOverlayTrack) r1.A00()) == null) {
            audioOverlayTrack = clipsAudioStore.A00;
        }
        int A022 = clipsAudioStore.A02(false);
        List<C361278fx> list2 = (List) clipsAudioStore.A0V.getValue();
        if (A022 > 1) {
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (C361278fx r02 : list2) {
                    Object obj2 = r02.A01;
                    if (obj2 != null) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = arrayList2;
            }
            arrayList = null;
        } else {
            if (!(list2 == null || (r0 = (C361278fx) 00k.A0J(list2)) == null || (obj = r0.A01) == null)) {
                List singletonList = Collections.singletonList(obj);
                0qQ.A07(singletonList);
                arrayList = singletonList;
            }
            arrayList = null;
        }
        UserSession userSession = r12.A01;
        AnonymousClass83H r14 = r12.A09;
        C3499982t r03 = r14.A01;
        if (r03 != null) {
            str = r03.BUn();
        }
        AEK.A02((MusicProduct) r14.A03.A02(), r14.A00, userSession, audioOverlayTrack, r13, str, r14.A02, (String) null, arrayList, list, !r14.A04.isEmpty());
    }

    public static final void A01(Exception exc, String str) {
        0f9 AEf = 0wj.A01.AEf("ClipsVirtualVideoStore", 817898016);
        AEf.ABQ(DialogModule.KEY_MESSAGE, str);
        if (exc != null) {
            AEf.ERJ(exc);
        }
        AEf.report();
    }

    public AnonymousClass83R(Context context, UserSession userSession, ClipsAudioStore clipsAudioStore, AnonymousClass83H r19, AnonymousClass83I r20, AnonymousClass836 r21, 2Nn r22, C262224Cq r23) {
        this.A00 = context;
        this.A01 = userSession;
        AnonymousClass83I r2 = r20;
        this.A02 = r2;
        ClipsAudioStore clipsAudioStore2 = clipsAudioStore;
        this.A08 = clipsAudioStore2;
        AnonymousClass836 r9 = r21;
        this.A03 = r9;
        this.A09 = r19;
        this.A04 = r22;
        AnonymousClass0Ud r3 = r2.A06;
        AnonymousClass0r6 r13 = r2.A04;
        AnonymousClass0Ud r14 = clipsAudioStore2.A0k;
        AnonymousClass0Ud r7 = clipsAudioStore2.A0Z;
        AnonymousClass0Ud r12 = clipsAudioStore2.A0c;
        AnonymousClass0Ud r11 = clipsAudioStore2.A0b;
        AnonymousClass0Ud r10 = clipsAudioStore2.A0X;
        AnonymousClass83S r8 = AnonymousClass83S.A00;
        02x A022 = 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 13), AnonymousClass10H.A00(new C59729JVn((AnonymousClass4D7) null, r8, 0), AnonymousClass10H.A00(AnonymousClass83U.A00, r3, r13, r14), AnonymousClass10H.A00(AnonymousClass83V.A00, r7, r12, r11), r10));
        AnonymousClass109 r4 = AnonymousClass10A.A01;
        C361268fw r32 = C361268fw.A00;
        C262224Cq r5 = r23;
        this.A05 = 10b.A02(r32, r5, A022, r4);
        this.A06 = 10b.A02(r32, r5, 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 14), AnonymousClass10H.A03(AnonymousClass83W.A00, r13, clipsAudioStore2.A0d)), r4);
        05F A023 = 10b.A02(new HashMap(), r5, AnonymousClass10H.A01(new ClipsVirtualVideoStore$audioOverlayVolumeFlow$1((AnonymousClass4D7) null), r14, clipsAudioStore2.A0W, clipsAudioStore2.A0n, clipsAudioStore2.A0g), r4);
        this.A0A = A023;
        AnonymousClass0Ud r24 = r2.A07;
        AnonymousClass0Ud r1 = r9.A03;
        AnonymousClass83Y r92 = AnonymousClass83Y.A00;
        05F A024 = 10b.A02(r32, r5, 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 12), AnonymousClass10H.A03(new C66194MHk((AnonymousClass4D7) null, (Object) r92, 12), AnonymousClass10H.A00(C3500583a.A00, r24, r1, r7), AnonymousClass10H.A00(C3500683b.A00, r12, r11, r10))), r4);
        this.A0B = A024;
        this.A07 = 10b.A02(r32, r5, 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 15), AnonymousClass10H.A03(AnonymousClass83c.A00, A023, A024)), r4);
    }
}
