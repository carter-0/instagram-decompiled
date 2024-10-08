package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.Jkw  reason: case insensitive filesystem */
public final class C60403Jkw extends 2Rw {
    public List A00 = 0sn.A00;
    public final Context A01;
    public final C59725JVj A02;
    public final UserSession A03;
    public final C66493MTw A04;

    public C60403Jkw(Context context, C59725JVj jVj, UserSession userSession, C66493MTw mTw) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = jVj;
        this.A04 = mTw;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60619JoS(DbT.A0D(LayoutInflater.from(this.A01), viewGroup, R.layout.trending_prompt_item, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r12, int i) {
        C60619JoS joS = (C60619JoS) r12;
        0qQ.A0B(joS, 0);
        PromptStickerModel promptStickerModel = (PromptStickerModel) this.A00.get(i);
        IgSimpleImageView igSimpleImageView = joS.A00;
        Context context = this.A01;
        igSimpleImageView.setImageDrawable(new C59812JZg(context, this.A03, promptStickerModel, "trending_prompts_page"));
        joS.A01.setImageDrawable(new C339167jA(context, promptStickerModel.A00(), R.dimen.account_discovery_bottom_gap, true, false, true));
        joS.A02.setImageDrawable(new C339167jA(context, promptStickerModel.A00(), R.dimen.account_discovery_bottom_gap, true, false, true));
        LY7.A00(igSimpleImageView, 20, promptStickerModel, this);
        igSimpleImageView.setContentDescription(DbW.A0h(context, promptStickerModel.A00.getText(), 2131975531));
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-813504658);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(71692156, A032);
        return size;
    }
}
