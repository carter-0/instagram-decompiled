package X;

import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class KA9 extends 1P0 {
    public final /* synthetic */ P9R A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public KA9(P9R p9r, String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = p9r;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1643192710);
        XPI xpi = (XPI) obj;
        int A033 = AnonymousClass0fD.A03(823415222);
        0qQ.A0B(xpi, 0);
        C61124Jxa jxa = xpi.A05;
        if (jxa == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        String str = this.A02;
        String str2 = this.A01;
        String str3 = this.A03;
        List<MWT> list = jxa.A07;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (MWT mwt : list) {
            A0r.add(((C61122JxY) mwt).A00);
        }
        int size = list.size();
        PromptStickerModel promptStickerModel = new PromptStickerModel((GenAIToolInfoDict) null, StoryPromptType.DEFAULT, (User) null, AnonymousClass05K.A00, str, str2, str3, (String) null, (String) null, A0r, size, 0, false, false, false);
        P9R p9r = this.A00;
        C64135LPk.A00(p9r.A03, 28D.A0D, p9r.A05, promptStickerModel);
        AnonymousClass0fD.A0A(1812140650, A033);
        AnonymousClass0fD.A0A(306182171, A032);
    }
}
