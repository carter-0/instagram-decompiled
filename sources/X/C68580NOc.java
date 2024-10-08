package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NOc  reason: case insensitive filesystem */
public final class C68580NOc extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C317296n2 A03;
    public final boolean A04;

    public C68580NOc(Context context, AnonymousClass0iw r3, UserSession userSession, C317296n2 r5, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C68028Myu(DbU.A09(layoutInflater, viewGroup, R.layout.trending_prompt_single_card_item, false), this.A04);
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, X.0rh] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r23, C249703kE r24) {
        C60340gF r0;
        1Xj r12;
        C68206N5v n5v = (C68206N5v) r23;
        C68028Myu myu = (C68028Myu) r24;
        boolean A1U = AnonymousClass7TF.A1U(0, n5v, myu);
        StoryPromptTappableData storyPromptTappableData = n5v.A01;
        PromptStickerModel promptStickerModel = new PromptStickerModel(storyPromptTappableData);
        myu.A03.setText(storyPromptTappableData.A0Q);
        ImageView imageView = myu.A02;
        Context context = this.A00;
        AnonymousClass0iw r1 = this.A01;
        imageView.setImageDrawable(new C339177jB(context, promptStickerModel, AnonymousClass05K.A0C, r1.getModuleName(), 0, 0, 240));
        View view = myu.A01;
        C71399Ojy.A00(view, promptStickerModel, this, n5v, 28);
        C71399Ojy.A00(myu.A04, promptStickerModel, this, n5v, 29);
        List list = n5v.A03;
        int i = 0;
        if (list == null || list.isEmpty()) {
            myu.A05.setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((C71492dQ) layoutParams).A0G = R.id.prompts_featured_prompt_preview_image;
            ViewGroup.LayoutParams layoutParams2 = myu.A00.getLayoutParams();
            0qQ.A0C(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((C71492dQ) layoutParams2).A0t = R.id.prompts_featured_prompt_preview_image;
            View view2 = myu.A05.getView();
            0qQ.A0B(view2, 0);
            List A1P = 0sr.A1P(new PJS[]{new PJS(DbX.A0b(view2, R.id.image_start)), new PJS(DbX.A0b(view2, R.id.image_center)), new PJS(DbX.A0b(view2, R.id.image_end))});
            ? obj = new Object();
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                List list2 = n5v.A04;
                if (list2 == null || (r12 = (1Xj) list2.get(i)) == null) {
                    r0 = null;
                } else {
                    PJS pjs = (PJS) A1P.get(i);
                    float A0l = r12.A0l();
                    float f = obj.A00;
                    if (A0l > f) {
                        f = r12.A0l();
                    }
                    obj.A00 = f;
                    IgImageView igImageView = pjs.A00;
                    ImageUrl A1Q = r12.A1Q();
                    if (A1Q != null) {
                        igImageView.setUrl(A1Q, r1);
                        AnonymousClass0fU.A00(new C71400Ojz(14, (Object) n5v, (Object) this, next, (Object) pjs), pjs.A00);
                        r0 = C60340gF.A00;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                A0r.add(r0);
                i = i2;
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            0qQ.A0C(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            ((C339907kM) layoutParams3).A01 = A1U;
            0nA.A0p(view, new C73325Pak(myu, A1P, obj));
        }
        C317296n2 r5 = this.A03;
        r5.Dcu(view, DbU.A0a(new H8U(this.A02, r5), AnonymousClass30Y.A00(n5v, C60340gF.A00, promptStickerModel.A03)));
    }

    public final Class modelClass() {
        return C68206N5v.class;
    }
}
