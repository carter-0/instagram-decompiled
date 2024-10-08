package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.3Md  reason: invalid class name and case insensitive filesystem */
public final class C240743Md extends FrameLayout {
    public final AnonymousClass3N0 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C240743Md(Context context) {
        super(context, (AttributeSet) null, 0);
        if (((Boolean) C62000qj.A02.A0G.invoke()).booleanValue()) {
            LayoutInflater from = LayoutInflater.from(context);
            0qQ.A07(from);
            2Su.A01(from, new ViewGroup.MarginLayoutParams(-2, -2), this, R.layout.reel_item_avatar_content, true, true);
        } else {
            View.inflate(getContext(), R.layout.reel_item_avatar_content, this);
        }
        this.A00 = new AnonymousClass3N0(this);
    }

    public final AnonymousClass3N0 getHolder() {
        return this.A00;
    }
}
