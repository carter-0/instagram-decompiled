package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JlI  reason: case insensitive filesystem */
public final class C60425JlI extends 2Rw {
    public final C231422re A00;
    public final C67769MuT A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final MU7 A04;

    public final void onBindViewHolder(C249703kE r7, int i) {
        UserSession userSession;
        C60644Jor jor;
        MU7 mu7;
        Reel reel;
        AnonymousClass0iw r0;
        C249703kE r4 = r7;
        boolean z = false;
        0qQ.A0B(r7, 0);
        C66415MQv mQv = (C66415MQv) this.A00.A02.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            userSession = this.A03;
            jor = (C60644Jor) r4;
            mu7 = this.A04;
            0qQ.A0C(mQv, "null cannot be cast to non-null type com.instagram.reels.prompt.mvvm.data.PromptStickerViewerItem.ParticipantReel");
            reel = (Reel) ((C61228JzM) mQv).A01;
            r0 = this.A02;
        } else if (itemViewType == 2) {
            userSession = this.A03;
            jor = (C60644Jor) r4;
            mu7 = this.A04;
            0qQ.A0C(mQv, "null cannot be cast to non-null type com.instagram.reels.prompt.mvvm.data.PromptStickerViewerItem.TemplateAuthorReel");
            reel = (Reel) ((C61228JzM) mQv).A01;
            r0 = this.A02;
            z = true;
        } else {
            return;
        }
        KwQ.A00(r0, userSession, reel, mu7, jor, z);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0 || i == 2) {
            return new C60644Jor(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.prompt_participant_grid_item, false));
        }
        return new C249703kE(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.prompt_sticker_viewer_pagination_spinner, false));
    }

    public final List A00() {
        Object obj;
        C61228JzM jzM;
        C61228JzM jzM2;
        List<C66415MQv> list = this.A00.A02;
        ArrayList A15 = DbV.A15(list);
        for (C66415MQv mQv : list) {
            if (!((!C61228JzM.A00(1, mQv) || (jzM2 = (C61228JzM) mQv) == null || (obj = jzM2.A01) == null) && (!C61228JzM.A00(0, mQv) || (jzM = (C61228JzM) mQv) == null || (obj = jzM.A01) == null))) {
                A15.add(obj);
            }
        }
        return A15;
    }

    public C60425JlI(AnonymousClass0iw r3, UserSession userSession, MU7 mu7) {
        AnonymousClass7TG.A1P(userSession, mu7);
        this.A03 = userSession;
        this.A02 = r3;
        this.A04 = mu7;
        C67769MuT muT = new C67769MuT(2);
        this.A01 = muT;
        this.A00 = new C231422re((C252303ot) muT, (2Rw) this);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1409010273);
        int size = this.A00.A02.size();
        AnonymousClass0fD.A0A(-1132726087, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A032 = AnonymousClass0fD.A03(1167454811);
        Object obj = this.A00.A02.get(i);
        if (obj instanceof C65599LwZ) {
            i2 = 1;
        } else if (C61228JzM.A00(0, obj)) {
            i2 = 0;
        } else if (C61228JzM.A00(1, obj)) {
            i2 = 2;
        } else {
            C20561Wub A1K = AnonymousClass7TE.A1K();
            AnonymousClass0fD.A0A(379160536, A032);
            throw A1K;
        }
        AnonymousClass0fD.A0A(1454456073, A032);
        return i2;
    }
}
