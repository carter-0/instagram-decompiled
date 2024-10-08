package X;

import android.content.Context;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8Mt  reason: invalid class name and case insensitive filesystem */
public final class C354628Mt implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8ME A00;

    public C354628Mt(AnonymousClass8ME r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        JZ7 jz7;
        AnonymousClass8ME r4 = this.A00;
        Object obj2 = obj;
        if (obj == null) {
            return;
        }
        if (obj2 instanceof C388199nR) {
            AnonymousClass0fN.A00(C63284KuT.A00(r4.A0l.requireActivity(), new LAQ(new C63772L6e(new C39931AJx(r4), C358278ae.RED_BOLD, 2131974552), new C63772L6e(new C39932AJy(r4), (C358278ae) null, 2131974551), (C63772L6e) null, (Boolean) null, (CharSequence) null, 2131974553, 2131974550)).A02());
        } else if (obj2 instanceof C388189nQ) {
            C352168Bz r0 = r4.A1F;
            if (r0 != null) {
                r0.A04();
            }
            C314676if r1 = r4.A1L;
            if (r1 != null && r1.A03 && (jz7 = ((JY9) r1.get()).A0B) != null) {
                0fE.A00(jz7, -883493503);
            }
        } else if (obj2 instanceof C388179nP) {
            C39890ADo A16 = r4.A16();
            Context context = r4.A0f;
            String moduleName = r4.A0o.getModuleName();
            UserSession userSession = r4.A0r;
            StoryPromptType storyPromptType = StoryPromptType.STORY_TEMPLATE;
            List singletonList = Collections.singletonList(AnonymousClass0t1.A01.A01(userSession));
            0qQ.A07(singletonList);
            PromptStickerModel promptStickerModel = new PromptStickerModel((GenAIToolInfoDict) null, storyPromptType, (User) null, AnonymousClass05K.A00, "", "", (String) null, (String) null, (String) null, singletonList, 0, 0, false, false, false);
            0qQ.A0B(context, 0);
            0qQ.A0B(moduleName, 1);
            C354798Nk r10 = new C354798Nk(context, userSession, promptStickerModel, moduleName, 112, false, false);
            ABC.A01(A16, (Float) null);
            AnonymousClass8ME.A00(r10, r4, new C310416b1(A16));
            C369458un r12 = r4.A0B;
            if (r12 != null) {
                r4.A1m.A0r(r10, r12);
            }
            r4.A1A.Dn6(r10);
            AnonymousClass8BA.A0G(r4.A0y, false, false);
        }
    }
}
