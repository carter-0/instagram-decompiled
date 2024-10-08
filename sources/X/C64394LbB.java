package X;

import com.instagram.aistudio.editor.AiSettingsRepository;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.LbB  reason: case insensitive filesystem */
public final class C64394LbB implements 2Kw {
    public final int A00;
    public final Object A01;

    public C64394LbB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass2Kv r1, 1Ef r2, 1vn r3, Object obj, int i) {
        r3.ATL(new C64394LbB(obj, i), r1, r2);
    }

    public final /* synthetic */ void invoke(Throwable th) {
        Throwable th2 = th;
        switch (this.A00) {
            case 0:
                C51965G9l.A1W(this.A01, th);
                return;
            case 1:
                KX0 kx0 = (KX0) this.A01;
                kx0.A05();
                JTR.A1W(kx0.A0U);
                return;
            case 2:
                AnonymousClass1EO r0 = ((AiSettingsRepository) this.A01).A00;
                if (r0 != null) {
                    r0.cancel();
                    return;
                }
                return;
            case 3:
                C249523jv r1 = (C249523jv) this.A01;
                r1.FIG(C59678JTj.A00(th.toString()));
                r1.AI3((Throwable) null);
                return;
            case 4:
                return;
            case 5:
                ((C63799L7f) this.A01).A01.invoke();
                return;
            case 6:
                BrandedContentProjectRepository brandedContentProjectRepository = (BrandedContentProjectRepository) this.A01;
                JVF.A03(brandedContentProjectRepository, brandedContentProjectRepository.A00, AnonymousClass05K.A0c, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, th2, (Map) null);
                brandedContentProjectRepository.A01.Epw(new C61082JwK((List) null, 1, 9, true));
                return;
            case 7:
                C64582LeO leO = (C64582LeO) this.A01;
                JVF.A03(leO, leO.A00, AnonymousClass05K.A0f, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, th2, (Map) null);
                leO.A04.Epw(new C61082JwK((List) null, 1, 10, true));
                return;
            case 8:
                C45891D9u.A02((C46215DQt) this.A01, th);
                return;
            case 9:
            case 10:
                ((C60132JgD) this.A01).A01.Epw(C64535Ldc.A00);
                return;
            case 11:
                L68 l68 = (L68) this.A01;
                L04 l04 = l68.A01;
                C64964Ll3.A03(l04.A00, AnonymousClass7TE.A16(l68.A00, 2131952652), false);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass1Nd.A00((0lg) this.A01).A00(new C64647LfZ(AnonymousClass05K.A0C));
                return;
            case 13:
                CreatorAIAgentCreationRepository creatorAIAgentCreationRepository = (CreatorAIAgentCreationRepository) this.A01;
                creatorAIAgentCreationRepository.A05.Epw(Double.valueOf(0.0d));
                C65363Ls4 ls4 = creatorAIAgentCreationRepository.A01;
                if (ls4 != null) {
                    ls4.A00(0);
                }
                AnonymousClass1EO r02 = creatorAIAgentCreationRepository.A00;
                if (r02 != null) {
                    r02.cancel();
                }
                creatorAIAgentCreationRepository.A00 = null;
                return;
            case 14:
                DbS.A1U(this.A01);
                return;
            case 16:
                C59816JZn jZn = (C59816JZn) this.A01;
                05G r2 = jZn.A04;
                do {
                } while (!r2.AIY(r2.getValue(), C59678JTj.A00(th)));
                jZn.A00 = true;
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                ((MUB) this.A01).DED();
                return;
            case 19:
                ((MUD) this.A01).DED();
                return;
            case 20:
                ((MUC) this.A01).DED();
                return;
            default:
                ((2IR) this.A01).onFailure(th);
                return;
        }
    }
}
