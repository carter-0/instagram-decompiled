package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class Q9Q extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0YZ[] A03;
    public TextView A00;
    public final 0s0 A01 = new C13408TYs((Object) this, 51);
    public final 0s0 A02 = new C13408TYs((Object) this, 52);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q9Q(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_label, this, false));
        this.A00 = AnonymousClass7TE.A0d(this, R.id.list_cell_left_add_on_label);
        Context context2 = getContext();
        AnonymousClass2E0.A0A();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(R.style.FBPayUIListCell, C71382cm.A0e);
        TextView textView = this.A00;
        if (textView != null) {
            C11409SSh.A00(obtainStyledAttributes, textView, 19, R.style.FBPayUIListCellLeftAddOnLabel);
            obtainStyledAttributes.recycle();
            TextView textView2 = this.A00;
            if (textView2 != null) {
                SRn.A02(textView2, RH2.A19);
                return;
            }
        }
        0qQ.A0F("textView");
        throw AnonymousClass00P.createAndThrow();
    }

    static {
        Class<Q9Q> cls = Q9Q.class;
        A03 = new AnonymousClass0YZ[]{Pxh.A0y(cls, "text", "getText()Ljava/lang/String;"), Pxh.A0y(cls, "textStyle", "getTextStyle()Lcom/facebookpay/widget/style/TextStyle;")};
    }

    public final String getText() {
        return DbV.A13(this, this.A01, A03, 0);
    }

    public final RH2 getTextStyle() {
        return (RH2) Pxe.A0s(this, this.A02, A03, 1);
    }

    public final void setText(String str) {
        DbS.A1a(this, str, this.A01, A03, 0);
    }

    public final void setTextStyle(RH2 rh2) {
        DbS.A1a(this, rh2, this.A02, A03, 1);
    }
}
