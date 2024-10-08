package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

public final class GIE {
    public final ImageView A00;
    public final GIF A01;
    public final C265804Wi A02;
    public final TranslatedCaptionsStickerViewBinder$Holder A03;
    public final AnonymousClass4WO A04;
    public final C317546nR A05;
    public final C265864Wp A06;
    public final C265844Wn A07;
    public final AnonymousClass4X0 A08;
    public final C265924Wv A09;
    public final C317536nQ A0A;
    public final Context A0B;
    public final ViewStub A0C;

    public GIE(View view) {
        ViewStub viewStub;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A0B = A0S;
        this.A02 = new C265804Wi(view);
        this.A07 = new C265844Wn(DbS.A0F(view, R.id.polls_sticker_stub));
        this.A06 = new C265864Wp(2b1.A00(view.findViewById(R.id.poll_v2_sticker_stub)));
        this.A09 = new C265924Wv(2b1.A00(view.requireViewById(R.id.quiz_sticker_stub)));
        this.A08 = new AnonymousClass4X0(A0S, 2b1.A00(view.requireViewById(R.id.prompt_sticker_stub)));
        this.A01 = new GIF(A0S, 2b1.A00(view.findViewById(R.id.visual_comment_reply_sticker_stub)));
        View findViewById = view.findViewById(R.id.question_sticker_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A0A = new C317536nQ(new C71662eb(viewStub));
        this.A05 = new C317546nR(2b1.A00(view.findViewById(R.id.chat_sticker_stub)));
        ViewStub viewStub2 = (ViewStub) AnonymousClass7TE.A0b(view, R.id.clips_item_confetti_stub);
        this.A0C = viewStub2;
        View inflate = viewStub2.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        this.A00 = (ImageView) inflate;
        this.A03 = new TranslatedCaptionsStickerViewBinder$Holder(2b1.A00(view.findViewById(R.id.translated_captions_sticker_stub)));
        this.A04 = new AnonymousClass4WO(2b1.A00(view.findViewById(R.id.translated_text_sticker_stub)));
    }
}
