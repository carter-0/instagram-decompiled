package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;
import com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl;
import com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl;
import com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl;

public final class H6K extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C53287GlZ glZ;
        C53295Glh glh;
        H2Q linkPreviewUseCaseImpl;
        String str = this.A02;
        UserSession userSession = this.A00;
        String str2 = this.A01;
        AnonymousClass7TG.A1T(str, userSession, str2);
        FactsRepository factsRepository = new FactsRepository(1vm.A01(userSession), str, str2, AnonymousClass43D.A00(245403032));
        int hashCode = str.hashCode();
        if (hashCode == -1249886828) {
            if (str.equals("SINGULAR_FACT")) {
                glZ = H2T.A07;
            }
            glZ = new C53287GlZ(C54617HLa.LOADING, (Integer) null, (Integer) null, AnonymousClass62M.A01, 0, 0);
        } else if (hashCode != 791971135) {
            if (hashCode == 2104228359 && str.equals("AFFILIATE_LINKS")) {
                glZ = H2T.A05;
            }
            glZ = new C53287GlZ(C54617HLa.LOADING, (Integer) null, (Integer) null, AnonymousClass62M.A01, 0, 0);
        } else {
            if (str.equals("QUESTION_AND_ANSWER")) {
                glZ = H2T.A06;
            }
            glZ = new C53287GlZ(C54617HLa.LOADING, (Integer) null, (Integer) null, AnonymousClass62M.A01, 0, 0);
        }
        H2T h2t = new H2T(factsRepository, glZ);
        if (hashCode == -1249886828) {
            if (str.equals("SINGULAR_FACT")) {
                glh = H2V.A09;
            }
            glh = new C53295Glh((C54617HLa) null, (Integer) null, (Integer) null, Integer.MAX_VALUE, 0, false, false);
        } else if (hashCode != 791971135) {
            if (hashCode == 2104228359 && str.equals("AFFILIATE_LINKS")) {
                glh = H2V.A07;
            }
            glh = new C53295Glh((C54617HLa) null, (Integer) null, (Integer) null, Integer.MAX_VALUE, 0, false, false);
        } else {
            if (str.equals("QUESTION_AND_ANSWER")) {
                glh = H2V.A08;
            }
            glh = new C53295Glh((C54617HLa) null, (Integer) null, (Integer) null, Integer.MAX_VALUE, 0, false, false);
        }
        H2V h2v = new H2V(factsRepository, glh);
        if (str.equals("SINGULAR_FACT")) {
            linkPreviewUseCaseImpl = new SingularFactPreviewUseCaseImpl(userSession, factsRepository);
        } else if (str.equals("QUESTION_AND_ANSWER")) {
            linkPreviewUseCaseImpl = new QuestionAnswerFactPreviewUseCaseImpl(factsRepository);
        } else {
            linkPreviewUseCaseImpl = new LinkPreviewUseCaseImpl(factsRepository);
        }
        return new C54183H2d(factsRepository, h2v, h2t, linkPreviewUseCaseImpl);
    }

    public H6K(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1U(userSession, str, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }
}
