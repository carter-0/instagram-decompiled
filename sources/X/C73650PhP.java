package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.PhP  reason: case insensitive filesystem */
public final /* synthetic */ class C73650PhP extends 03J implements 0sL {
    public static final C73650PhP A00 = new C73650PhP();

    public C73650PhP() {
        super(2, VI1.class, "renderReplyBarPlaceHolder", "renderReplyBarPlaceHolder(Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiState$ComposerInactive;Landroid/view/View;)V", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        UOL uol = (UOL) obj;
        View view = (View) obj2;
        AnonymousClass7TG.A1N(uol, view);
        View A0F = AnonymousClass7TF.A0F(view, R.id.message_composer_container);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.composer_text);
        DbU.A12(A0F.getContext(), A0F, 2131971558);
        VI1.A00(A0F, A0R, uol, C73888PlP.A00);
        return C60340gF.A00;
    }
}
