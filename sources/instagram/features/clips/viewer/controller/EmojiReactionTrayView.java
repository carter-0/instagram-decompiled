package instagram.features.clips.viewer.controller;

import X.0qQ;
import X.AnonymousClass7TE;
import X.JTT;
import X.OD8;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.android.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EmojiReactionTrayView extends FrameLayout {
    public OD8 A00;
    public final float A01;
    public final List A02;
    public final List A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiReactionTrayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    private final int getReactionsCount() {
        return this.A03.size() + 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiReactionTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A02 = AnonymousClass7TE.A1C();
        this.A03 = AnonymousClass7TE.A1C();
        this.A01 = context.getResources().getDimension(R.dimen.abc_dropdownitem_icon_width);
        setLayoutDirection(0);
    }

    public /* synthetic */ EmojiReactionTrayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiReactionTrayView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
