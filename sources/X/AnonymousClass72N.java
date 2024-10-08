package X;

import android.app.Application;
import androidx.lifecycle.CoroutineLiveData;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.clips.drafts.model.ClipsNetworkImportDraftRepository;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72N  reason: invalid class name */
public final class AnonymousClass72N extends C361478gI implements AnonymousClass72O {
    public long A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final ClipsDraftPreviewItemRepository A05;
    public final ClipsNetworkImportDraftRepository A06;
    public final UserSession A07;
    public final ClipsDraftRepository A08;
    public final 2Nn A09;
    public final 1Av A0A;
    public final C249513ju A0B;
    public final AnonymousClass0r6 A0C;
    public final AnonymousClass0r6 A0D;
    public final AnonymousClass0r6 A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass72N(Application application, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, ClipsNetworkImportDraftRepository clipsNetworkImportDraftRepository, UserSession userSession, ClipsDraftRepository clipsDraftRepository, 2Nn r13, 1Av r14) {
        super(application);
        0qQ.A0B(r14, 3);
        0qQ.A0B(r13, 4);
        0qQ.A0B(clipsDraftPreviewItemRepository, 5);
        0qQ.A0B(clipsDraftRepository, 7);
        this.A07 = userSession;
        this.A0A = r14;
        this.A09 = r13;
        this.A05 = clipsDraftPreviewItemRepository;
        this.A06 = clipsNetworkImportDraftRepository;
        this.A08 = clipsDraftRepository;
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A0B = r0;
        this.A0D = 0u9.A04(r0);
        AnonymousClass72V r4 = new AnonymousClass72V(clipsDraftPreviewItemRepository.A03);
        this.A0C = r4;
        AnonymousClass72W r02 = new AnonymousClass72W(clipsNetworkImportDraftRepository.A0A);
        this.A0E = r02;
        AnonymousClass0r6 r6 = new AnonymousClass72X(new AnonymousClass0r6[]{r02, r4});
        r6 = 182.A06(0Tu.A06, userSession, 36328237844544622L) ? new JVL(r6) : r6;
        19B r3 = 19B.A00;
        CoroutineLiveData A002 = C226292g8.A00(r3, r6);
        this.A01 = A002;
        AnonymousClass2gB A012 = AnonymousClass72Y.A01(A002, new C377189Kw(this, 45));
        this.A02 = A012;
        this.A03 = C226292g8.A00(r3, new AnonymousClass05E(new AnonymousClass9KF((Object) C226292g8.A01(A012), (AnonymousClass4D7) null, (Object) this, 15)));
        this.A04 = C226292g8.A00(r3, r4);
    }

    public final void A0H(C369968vc r11, String str) {
        0qQ.A0B(r11, 0);
        0qQ.A0B(str, 1);
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(AnonymousClass12T.A00.CO6(603422383, 3), new C66174MGl((Object) this, (Object) r11, str, (AnonymousClass4D7) null, 18), A002);
    }

    public final void A0F() {
        List list = (List) this.A01.A02();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((C369968vc) next).A00()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C369968vc) it.next()).A09);
            }
            27r A012 = 27p.A01(this.A07);
            0wc r2 = A012.A01;
            0Aj A002 = r2.A00(r2.A00, "ig_camera_see_all_drafts");
            if (A002.isSampled()) {
                A002.A8k("event_type", 1);
                A002.AAJ("module", 27x.A08.getModuleName());
                A002.A8M(A012.A0J(), "camera_destination");
                AnonymousClass283 r22 = A012.A04;
                A002.AAJ("camera_session_id", r22.A0L);
                A002.AAe("composition_str_id_list", arrayList2);
                A002.A8M(r22.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.A8M(r22.A0C, "surface");
                A002.Cgf();
            }
            ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A05;
            AnonymousClass9LZ r4 = new AnonymousClass9LZ(this, 13);
            AnonymousClass19S A022 = 19E.A02(clipsDraftPreviewItemRepository.A02);
            AnonymousClass9KF r23 = new AnonymousClass9KF((Object) r4, (AnonymousClass4D7) null, (Object) clipsDraftPreviewItemRepository, 14);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r23, A022);
        }
    }

    public final Object CBo(C2801950r r2, AnonymousClass4D7 r3) {
        return this.A08.A0E(r2, r3);
    }

    public final void A0E() {
        C318136oS A002 = C318116oQ.A00(this);
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 8);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }

    public final void A0G(C369968vc r6) {
        ArrayList A1L = 0sr.A1L(new C369968vc[]{r6});
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new C66188MGz((Object) A1L, (Object) this, (AnonymousClass4D7) null, 9), A002);
    }
}
